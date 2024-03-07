/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.util;

import static io.kubernetes.client.util.Config.ENV_KUBECONFIG;
import static io.kubernetes.client.util.Config.ENV_SERVICE_HOST;
import static io.kubernetes.client.util.Config.ENV_SERVICE_PORT;
import static io.kubernetes.client.util.Config.SERVICEACCOUNT_CA_PATH;
import static io.kubernetes.client.util.Config.SERVICEACCOUNT_TOKEN_PATH;
import static io.kubernetes.client.util.KubeConfig.ENV_HOME;
import static io.kubernetes.client.util.KubeConfig.KUBECONFIG;
import static io.kubernetes.client.util.KubeConfig.KUBEDIR;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1CertificateSigningRequest;
import io.kubernetes.client.persister.FilePersister;
import io.kubernetes.client.util.credentials.AccessTokenAuthentication;
import io.kubernetes.client.util.credentials.Authentication;
import io.kubernetes.client.util.credentials.ClientCertificateAuthentication;
import io.kubernetes.client.util.credentials.KubeconfigAuthentication;
import io.kubernetes.client.util.credentials.TokenFileAuthentication;
import io.kubernetes.client.util.exception.CSRNotApprovedException;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.PrivateKey;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import okhttp3.Protocol;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** A Builder which allows the construction of {@link ApiClient}s in a fluent fashion. */
public class ClientBuilder {
  private static final Logger log = LoggerFactory.getLogger(ClientBuilder.class);

  private String basePath = Config.DEFAULT_FALLBACK_HOST;
  private byte[] caCertBytes = null;
  private boolean verifyingSsl = true;
  private Authentication authentication;
  private String keyStorePassphrase;
  // defaulting client protocols to HTTP1.1 and HTTP 2
  private List<Protocol> protocols = Arrays.asList(Protocol.HTTP_2, Protocol.HTTP_1_1);
  // default to unlimited read timeout
  private Duration readTimeout = Duration.ZERO;
  // default health check is once a minute
  private Duration pingInterval = Duration.ofMinutes(1);

  /**
   * Creates an {@link ApiClient} by calling {@link #standard()} and {@link #build()}.
   *
   * @return An <tt>ApiClient</tt> configured using the precedence specified for {@link
   *     #standard()}.
   * @throws IOException if the configuration file or a file specified in a configuration file
   *     cannot be read.
   */
  public static ApiClient defaultClient() throws IOException {
    return ClientBuilder.standard().build();
  }

  /**
   * Creates a builder which is pre-configured in the following way
   *
   * <ul>
   *   <li>If $KUBECONFIG is defined, use that config file.
   *   <li>If $HOME/.kube/config can be found, use that.
   *   <li>If the in-cluster service account can be found, assume in cluster config.
   *   <li>Default to localhost:8080 as a last resort.
   * </ul>
   *
   * @return <tt>ClientBuilder</tt> pre-configured using the above precedence
   * @throws IOException if the configuration file or a file specified in a configuration file
   *     cannot be read.
   */
  public static ClientBuilder standard() throws IOException {
    return standard(true);
  }

  public static ClientBuilder standard(boolean persistConfig) throws IOException {
    final File kubeConfig = findConfigFromEnv();
    ClientBuilder clientBuilderEnv = getClientBuilder(persistConfig, kubeConfig);
    if (clientBuilderEnv != null) return clientBuilderEnv;
    final File config = findConfigInHomeDir();
    ClientBuilder clientBuilderHomeDir = getClientBuilder(persistConfig, config);
    if (clientBuilderHomeDir != null) return clientBuilderHomeDir;
    final File clusterCa = new File(SERVICEACCOUNT_CA_PATH);
    if (clusterCa.exists()) {
      return cluster();
    }
    return new ClientBuilder();
  }

  private static ClientBuilder getClientBuilder(boolean persistConfig, File kubeConfig)
      throws IOException {
    if (kubeConfig != null) {
      try (BufferedReader kubeConfigReader =
          new BufferedReader(
              new InputStreamReader(
                  new FileInputStream(kubeConfig), StandardCharsets.UTF_8.name()))) {
        KubeConfig kc = KubeConfig.loadKubeConfig(kubeConfigReader);
        if (persistConfig) {
          kc.setPersistConfig(new FilePersister(kubeConfig));
        }
        kc.setFile(kubeConfig);
        return kubeconfig(kc);
      }
    }
    return null;
  }

  private static File findConfigFromEnv() {
    final KubeConfigEnvParser kubeConfigEnvParser = new KubeConfigEnvParser();

    final String kubeConfigPath =
        kubeConfigEnvParser.parseKubeConfigPath(System.getenv(ENV_KUBECONFIG));
    if (kubeConfigPath == null) {
      return null;
    }
    final File kubeConfig = new File(kubeConfigPath);
    if (kubeConfig.exists()) {
      return kubeConfig;
    } else {
      log.debug("Could not find file specified in $KUBECONFIG");
      return null;
    }
  }

  private static class KubeConfigEnvParser {
    private String parseKubeConfigPath(String kubeConfigEnv) {
      if (kubeConfigEnv == null) {
        return null;
      }

      final String[] filePaths = kubeConfigEnv.split(File.pathSeparator);
      final String kubeConfigPath = filePaths[0];
      if (filePaths.length > 1) {
        log.warn("Found multiple kubeconfigs files, $KUBECONFIG: {} using first: {}", kubeConfigEnv, kubeConfigPath);
      }

      return kubeConfigPath;
    }
  }

  private static File findHomeDir() {
    final String envHome = System.getenv(ENV_HOME);
    if (envHome != null && envHome.length() > 0) {
      final File config = new File(envHome);
      if (config.exists()) {
        return config;
      }
    }
    if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
      String homeDrive = System.getenv("HOMEDRIVE");
      String homePath = System.getenv("HOMEPATH");
      if (homeDrive != null
          && homeDrive.length() > 0
          && homePath != null
          && homePath.length() > 0) {
        File homeDir = new File(new File(homeDrive), homePath);
        if (homeDir.exists()) {
          return homeDir;
        }
      }
      String userProfile = System.getenv("USERPROFILE");
      if (userProfile != null && userProfile.length() > 0) {
        File profileDir = new File(userProfile);
        if (profileDir.exists()) {
          return profileDir;
        }
      }
    }
    return null;
  }

  private static File findConfigInHomeDir() {
    final File homeDir = findHomeDir();
    if (homeDir != null) {
      final File config = new File(new File(homeDir, KUBEDIR), KUBECONFIG);
      if (config.exists()) {
        return config;
      }
    }
    log.debug("Could not find ~/.kube/config");
    return null;
  }

  /**
   * [DEPRECATED] Creates a builder which is pre-configured from the cluster configuration.
   *
   * @return <tt>ClientBuilder</tt> configured from the cluster configuration.
   * @throws IOException if the Service Account Token Path or CA Path is not readable.
   */
  public static ClientBuilder oldCluster() throws IOException {
    final ClientBuilder builder = new ClientBuilder();

    final String host = System.getenv(ENV_SERVICE_HOST);
    final String port = System.getenv(ENV_SERVICE_PORT);
    builder.setBasePath(host, port);

    final String token =
        new String(
            Files.readAllBytes(Paths.get(SERVICEACCOUNT_TOKEN_PATH)), Charset.defaultCharset());
    builder.setCertificateAuthority(Files.readAllBytes(Paths.get(SERVICEACCOUNT_CA_PATH)));
    builder.setAuthentication(new AccessTokenAuthentication(token));

    return builder;
  }

  /**
   * Creates a builder which is pre-configured from the cluster configuration.
   *
   * @return <tt>ClientBuilder</tt> configured from the cluster configuration where service account
   *     token will be reloaded.
   * @throws IOException if the Service Account Token Path or CA Path is not readable.
   */
  public static ClientBuilder cluster() throws IOException {
    final ClientBuilder builder = new ClientBuilder();

    final String host = System.getenv(ENV_SERVICE_HOST);
    final String port = System.getenv(ENV_SERVICE_PORT);
    builder.setBasePath(host, port);

    builder.setCertificateAuthority(Files.readAllBytes(Paths.get(SERVICEACCOUNT_CA_PATH)));
    builder.setAuthentication(new TokenFileAuthentication(SERVICEACCOUNT_TOKEN_PATH));

    return builder;
  }

  protected ClientBuilder setBasePath(String host, String port) {
    try {
      Integer iPort = Integer.valueOf(port);
      URI uri = new URI("https", null, host, iPort, null, null, null);
      this.setBasePath(uri.toString());
    } catch (NumberFormatException | URISyntaxException e) {
      throw new IllegalStateException(e);
    }
    return this;
  }

  /**
   * Creates a builder which is pre-configured from a {@link KubeConfig}.
   *
   * <p>To load a <tt>KubeConfig</tt>, see {@link KubeConfig#loadKubeConfig(Reader)}.
   *
   * @param config The {@link KubeConfig} to configure the builder from.
   * @return <tt>ClientBuilder</tt> configured from the provided <tt>KubeConfig</tt>
   * @throws IOException if the files specified in the provided <tt>KubeConfig</tt> are not readable
   */
  public static ClientBuilder kubeconfig(KubeConfig config) throws IOException {
    final ClientBuilder builder = new ClientBuilder();

    String server = config.getServer();
    if (server == null) {
      throw new IllegalArgumentException("No server in kubeconfig");
    }
    if (!server.contains("://")) {
      if (server.contains(":443")) {
        server = "https://" + server;
      } else {
        server = "http://" + server;
      }
    }

    final byte[] caBytes =
        config.getDataOrFileRelative(
            config.getCertificateAuthorityData(), config.getCertificateAuthorityFile());
    if (caBytes != null) {
      builder.setCertificateAuthority(caBytes);
    }
    builder.setVerifyingSsl(config.verifySSL());

    builder.setBasePath(server);
    builder.setAuthentication(new KubeconfigAuthentication(config));
    return builder;
  }

  /**
   * Returns a new ApiClient instance reading from CertificateSigningRequest.
   *
   * <p>It will create a CertificateSigningRequest object to the cluster if it doesn't exist, and
   * waits until the request is approved.
   *
   * @param bootstrapKubeConfig the bootstrap kube config
   * @param privateKey the private key
   * @param csr the csr
   * @return the api client
   * @throws IOException the io exception
   * @throws CSRNotApprovedException the csr not approved exception
   * @throws ApiException the api exception
   */
  public static ApiClient fromCertificateSigningRequest(
      KubeConfig bootstrapKubeConfig, PrivateKey privateKey, V1CertificateSigningRequest csr)
      throws IOException, CSRNotApprovedException, ApiException {
    // creates CSR or checks whether the existing one conflicts.
    ApiClient bootstrapApiClient = ClientBuilder.kubeconfig(bootstrapKubeConfig).build();
    return fromCertificateSigningRequest(bootstrapApiClient, privateKey, csr);
  }

  /**
   * Returns a new ApiClient instance reading from CertificateSigningRequest.
   *
   * <p>It will create a CertificateSigningRequest object to the cluster if it doesn't exist, and
   * waits until the request is approved.
   *
   * @param bootstrapApiClient the bootstrap api client
   * @param privateKey the private key
   * @param csr the csr
   * @return the api client
   * @throws IOException the io exception
   * @throws CSRNotApprovedException the csr not approved exception
   * @throws ApiException the api exception
   */
  public static ApiClient fromCertificateSigningRequest(
      ApiClient bootstrapApiClient, PrivateKey privateKey, V1CertificateSigningRequest csr)
      throws IOException, CSRNotApprovedException, ApiException {
    byte[] certificateData = CSRUtils.createAndWaitUntilCertificateSigned(bootstrapApiClient, csr);
    InputStream is = bootstrapApiClient.getSslCaCert();
    is.reset();
    ClientBuilder newBuilder = new ClientBuilder();
    newBuilder.setAuthentication(
        new ClientCertificateAuthentication(certificateData, SSLUtils.dumpKey(privateKey)));
    newBuilder.setBasePath(bootstrapApiClient.getBasePath());
    newBuilder.setVerifyingSsl(bootstrapApiClient.isVerifyingSsl());
    newBuilder.setCertificateAuthority(IOUtils.toByteArray(is));
    return newBuilder.build();
  }

  public String getBasePath() {
    return basePath;
  }

  public ClientBuilder setBasePath(String basePath) {
    this.basePath = basePath;
    return this;
  }

  public Authentication getAuthentication() {
    return authentication;
  }

  public ClientBuilder setAuthentication(final Authentication authentication) {
    this.authentication = authentication;
    return this;
  }

  public ClientBuilder setCertificateAuthority(final byte[] caCertBytes) {
    this.caCertBytes = caCertBytes;
    return this;
  }

  public boolean isVerifyingSsl() {
    return verifyingSsl;
  }

  public ClientBuilder setVerifyingSsl(boolean verifyingSsl) {
    this.verifyingSsl = verifyingSsl;
    return this;
  }

  public ClientBuilder setProtocols(List<Protocol> protocols) {
    this.protocols = protocols;
    return this;
  }

  public List<Protocol> getProtocols() {
    return protocols;
  }

  public ClientBuilder setReadTimeout(Duration readTimeout) {
    this.readTimeout = readTimeout;
    return this;
  }

  public Duration getReadTimeout() {
    return this.readTimeout;
  }

  public ClientBuilder setPingInterval(Duration pingInterval) {
    this.pingInterval = pingInterval;
    return this;
  }

  public Duration getPingInterval() {
    return this.pingInterval;
  }

  public String getKeyStorePassphrase() {
    return keyStorePassphrase;
  }

  public ClientBuilder setKeyStorePassphrase(String keyStorePassphrase) {
    this.keyStorePassphrase = keyStorePassphrase;
    return this;
  }

  public ApiClient build() {
    final ApiClient client = new ApiClient();

    client.setHttpClient(
        client
            .getHttpClient()
            .newBuilder()
            .protocols(protocols)
            .readTimeout(this.readTimeout)
            .pingInterval(pingInterval)
            .build());

    if (basePath != null) {
      if (basePath.endsWith("/")) {
        basePath = basePath.substring(0, basePath.length() - 1);
      }
      client.setBasePath(basePath);
    }

    client.setVerifyingSsl(verifyingSsl);

    if (authentication != null) {
      if (StringUtils.isNotEmpty(keyStorePassphrase)) {
        if (authentication instanceof KubeconfigAuthentication) {
          if (((KubeconfigAuthentication) authentication).getDelegateAuthentication()
              instanceof ClientCertificateAuthentication) {
            ((ClientCertificateAuthentication)
                    (((KubeconfigAuthentication) authentication).getDelegateAuthentication()))
                .setPassphrase(keyStorePassphrase);
          }
        }
      }
      authentication.provide(client);
    }

    // NOTE: this ordering is important.  The API Client re-evaluates the CA certificate every
    // time the SSL info changes, which means that if this comes after the following call
    // you will try to load a certificate with an exhausted InputStream. So setting the CA
    // certificate _has_ to be the last thing that you do related to SSL.
    //
    // TODO: this (imho) is broken in the generate Java Swagger Client code. We should fix it
    // upstream and remove this dependency.
    //
    // TODO: Add a test to ensure that this works correctly...
    if (caCertBytes != null) {
      client.setSslCaCert(new ByteArrayInputStream(caCertBytes));
    }

    return client;
  }
}
