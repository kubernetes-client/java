/*
Copyright 2017 The Kubernetes Authors.
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

import io.kubernetes.client.util.credentials.AccessTokenCredentialProvider;
import io.kubernetes.client.util.credentials.CredentialProvider;
import io.kubernetes.client.util.credentials.KubeconfigCredentialProvider;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

import io.kubernetes.client.ApiClient;

import static io.kubernetes.client.util.Config.ENV_KUBECONFIG;
import static io.kubernetes.client.util.Config.ENV_SERVICE_HOST;
import static io.kubernetes.client.util.Config.ENV_SERVICE_PORT;
import static io.kubernetes.client.util.Config.SERVICEACCOUNT_CA_PATH;
import static io.kubernetes.client.util.Config.SERVICEACCOUNT_TOKEN_PATH;
import static io.kubernetes.client.util.KubeConfig.*;

public class ClientBuilder {

  private String basePath = Config.DEFAULT_FALLBACK_HOST;
  private byte[] caCertBytes = null;
  private boolean verifyingSsl = true;
  private CredentialProvider credentialProvider;

  private static final Logger log = Logger.getLogger(Config.class);

  public static ClientBuilder defaults() throws IOException {
    final FileReader kubeConfigReader = findConfigFromEnv();
    if(kubeConfigReader != null) {
      return fromKubeConfig(loadKubeConfig(kubeConfigReader));
    }
    final FileReader configReader = findConfigInHomeDir();
    if(configReader != null) {
      return fromKubeConfig(loadKubeConfig(configReader));
    }
    final File clusterCa = new File(SERVICEACCOUNT_CA_PATH);
    if (clusterCa.exists()) {
      return fromCluster();
    }
    return new ClientBuilder();
  }

  private static FileReader findConfigFromEnv() throws FileNotFoundException {
    try {
      String kubeConfig = System.getenv(ENV_KUBECONFIG);
      if(kubeConfig == null) {
        return null;
      }
      return new FileReader(kubeConfig);
    } catch (FileNotFoundException e) {
      log.info("Could not find KUBECONFIG in environment");
      return null;
    }
  }

  private static FileReader findConfigInHomeDir() throws FileNotFoundException {
    try {
      File config = new File(new File(System.getenv(ENV_HOME), KUBEDIR), KUBECONFIG);
      return new FileReader(config);
    } catch (FileNotFoundException e) {
      log.info("Could not find ~/.kube/config");
      return null;
    }
  }

  public static ClientBuilder fromCluster() throws IOException {
    final ClientBuilder builder = new ClientBuilder();

    final String host = System.getenv(ENV_SERVICE_HOST);
    final String port = System.getenv(ENV_SERVICE_PORT);
    builder.setBasePath("https://" + host + ":" + port);

    final String token = new String(Files.readAllBytes(Paths.get(SERVICEACCOUNT_TOKEN_PATH)),
        Charset.defaultCharset());
    builder.setCertificateAuthority(Files.readAllBytes(Paths.get(SERVICEACCOUNT_CA_PATH)));
    builder.setCredentialProvider(new AccessTokenCredentialProvider(token));

    return builder;
  }

  public static ClientBuilder fromKubeConfig(KubeConfig config) throws IOException {
    final ClientBuilder builder = new ClientBuilder();

    String server = config.getServer();
    if (!server.startsWith("http://") && !server.startsWith("https://")) {
      if (server.contains(":443")) {
        server = "https://" + server;
      } else {
        server = "http://" + server;
      }
    }

    if(config.verifySSL()) {
      final byte[] caBytes = KubeConfig.getDataOrFile(config.getCertificateAuthorityData(),
          config.getCertificateAuthorityFile());
      builder.setCertificateAuthority(caBytes);
    } else {
      builder.setVerifyingSsl(false);
    }

    builder.setBasePath(server);
    builder.setCredentialProvider(new KubeconfigCredentialProvider(config));
    return builder;
  }

  public String getBasePath() {
    return basePath;
  }

  public ClientBuilder setBasePath(String basePath) {
    this.basePath = basePath;
    return this;
  }

  public CredentialProvider getCredentialProvider() {
    return credentialProvider;
  }

  public ClientBuilder setCredentialProvider(final CredentialProvider credentialProvider) {
    this.credentialProvider = credentialProvider;
    return this;
  }

  public ClientBuilder setCertificateAuthority(final byte[] caCertBytes) {
    this.caCertBytes = caCertBytes;
    this.verifyingSsl = true;
    return this;
  }

  public boolean isVerifyingSsl() {
    return verifyingSsl;
  }

  public ClientBuilder setVerifyingSsl(boolean verifyingSsl) {
    this.verifyingSsl = verifyingSsl;
    return this;
  }

  public ApiClient build() {
    final ApiClient client = new ApiClient();

    if (basePath != null) {
      if (basePath.endsWith("/")) {
        basePath = basePath.substring(0, basePath.length() - 1);
      }
      client.setBasePath(basePath);
    }

    client.setVerifyingSsl(verifyingSsl);

    if (caCertBytes != null) {
      client.setSslCaCert(new ByteArrayInputStream(caCertBytes));
    }

    if (credentialProvider != null) {
      credentialProvider.provide(client);
    }

    return client;
  }
}