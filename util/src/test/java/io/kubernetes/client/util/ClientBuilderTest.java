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

import static io.kubernetes.client.util.Config.ENV_SERVICE_HOST;
import static io.kubernetes.client.util.Config.ENV_SERVICE_PORT;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.kubernetes.client.Resources;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.util.credentials.Authentication;
import io.kubernetes.client.util.credentials.ClientCertificateAuthentication;
import io.kubernetes.client.util.credentials.KubeconfigAuthentication;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import uk.org.webcompere.systemstubs.environment.EnvironmentVariables;
import uk.org.webcompere.systemstubs.jupiter.SystemStub;
import uk.org.webcompere.systemstubs.jupiter.SystemStubsExtension;

/** Tests for the ConfigBuilder helper class */
@ExtendWith(SystemStubsExtension.class)
class ClientBuilderTest {
  private static final String HOME_PATH = Resources.getResource("").getPath();
  private static final String KUBECONFIG_FILE_PATH = Resources.getResource("kubeconfig").getPath();
  private static final String KUBECONFIG_UTF8_FILE_PATH =
      Resources.getResource("kubeconfig-utf8").getPath();
  private static final String KUBECONFIG_HTTP_FILE_PATH =
      Resources.getResource("kubeconfig-http").getPath();
  private static final String KUBECONFIG_HTTPS_FILE_PATH =
      Resources.getResource("kubeconfig-https").getPath();
  private static final String KUBECONFIG_HTTPS_X509_FILE_PATH =
      Resources.getResource("kubeconfig-https-x509").getPath();
  private static final String SSL_CA_CERT_PATH =
      new File(Resources.getResource("ca-cert.pem").getPath()).toString();
  private static final String INVALID_SSL_CA_CERT_PATH =
      new File(Resources.getResource("ca-cert-invalid.pem").getPath()).toString();

  private String basePath = "http://localhost";
  private String apiKey = "ABCD";
  private String userName = "userName";
  private String password = "password";
  private String apiKeyPrefix = "Bearer";
  public static final String KUBEDIR = ".kube";
  public static final String KUBECONFIG = "config";

  @SystemStub
  private final EnvironmentVariables variables = new EnvironmentVariables();

  @Test
  void defaultClientWithNoFiles() throws Exception {
    String path =
        variables.set("HOME", "/non-existent")
            .set("HOMEDRIVE", null)
            .set("USERPROFILE", null)
            .set("KUBECONFIG", null)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.defaultClient();
                  return client.getBasePath();
                });
    assertThat(path).isEqualTo("http://localhost:8080");
  }

  @Test
  void defaultClientReadsHomeDir() throws Exception {
    String path =
        variables.set("HOME", HOME_PATH)
            .execute(
                () -> {
                  ApiClient client = ClientBuilder.defaultClient();
                  return client.getBasePath();
                });
    assertThat(path).isEqualTo("http://home.dir.com");
  }

  @Test
  void defaultClientReadsKubeConfig() throws Exception {
    String path =
        variables.set("KUBECONFIG", KUBECONFIG_FILE_PATH)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.defaultClient();
                  return client.getBasePath();
                });
    assertThat(path).isEqualTo("http://kubeconfig.dir.com");
  }

  @Test
  void defaultClientUTF8EncodedConfig() throws Exception {
    String path =
        variables.set("KUBECONFIG", KUBECONFIG_UTF8_FILE_PATH)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.defaultClient();
                  return client.getBasePath();
                });
    assertThat(path).isEqualTo("http://kubeconfig.dir.com");
  }

  @Test
  void defaultClientReadsKubeConfigMultiple() throws Exception {
    final String kubeConfigEnv = KUBECONFIG_FILE_PATH + File.pathSeparator + "/non-existent";
    String path =
        variables.set("KUBECONFIG", kubeConfigEnv)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.defaultClient();
                  return client.getBasePath();
                });
    assertThat(path).isEqualTo("http://kubeconfig.dir.com");
  }

  @Test
  void kubeconfigPreferredOverHomeDir() throws Exception {
    String path =
        variables.set("HOME", HOME_PATH)
            .set("KUBECONFIG", KUBECONFIG_FILE_PATH)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.standard().build();
                  return client.getBasePath();
                });
    // $KUBECONFIG should take precedence over $HOME/.kube/config
    assertThat(path).isEqualTo("http://kubeconfig.dir.com");
  }

  @Test
  void invalidKubeconfig() throws Exception {
    String path =
        variables.set("KUBECONFIG", "/non-existent")
            .set("HOME", "/none-existent")
            .set("HOMEDRIVE", null)
            .set("USERPROFILE", null)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.standard().build();
                  return client.getBasePath();
                });
    assertThat(path).isEqualTo(Config.DEFAULT_FALLBACK_HOST);
  }

  @Test
  void kubeconfigAddsSchemeHttps() throws Exception {
    String path =
        variables.set("KUBECONFIG", KUBECONFIG_HTTPS_FILE_PATH)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.standard().build();
                  return client.getBasePath();
                });
    assertThat(path).isEqualTo("https://localhost:443");
  }

  @Test
  void kubeconfigAddsSchemeHttp() throws Exception {
    String path =
        variables.set("KUBECONFIG", KUBECONFIG_HTTP_FILE_PATH)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.standard().build();
                  return client.getBasePath();
                });
    assertThat(path).isEqualTo("http://localhost");
  }

  @Test
  void kubeconfigDisablesVerifySsl() throws Exception {
    boolean isVerifyingSsl =
        variables.set("KUBECONFIG", KUBECONFIG_HTTP_FILE_PATH)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.standard().build();
                  return client.isVerifyingSsl();
                });
    assertThat(isVerifyingSsl).isFalse();
  }

  @Test
  void basePathTrailingSlash() throws Exception {
    final ApiClient client = ClientBuilder.standard().setBasePath("http://localhost/").build();
    assertThat(client.getBasePath()).isEqualTo("http://localhost");
  }

  @Test
  void standardVerifiesSsl() throws Exception {
    boolean isVerifyingSsl =
        variables.set("HOME", "/non-existent")
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.standard().build();
                  return client.isVerifyingSsl();
                });
    assertThat(isVerifyingSsl).isTrue();
  }

  @Test
  void credentialProviderInvoked() throws IOException {
    final Authentication provider = mock(Authentication.class);
    final ApiClient client = ClientBuilder.standard().setAuthentication(provider).build();
    verify(provider).provide(client);
  }

  /**
   * We can't verify anything here because of how things are configured in swagger-codegen and
   * okhttp but combined with {@link #sslCertCaBad()} we have some certainty that it is being
   * invoked.
   */
  @Test
  void sslCertCaGood() throws Exception {
    new ClientBuilder()
            .setCertificateAuthority(Files.readAllBytes(Paths.get(SSL_CA_CERT_PATH)))
            .build();
  }

  @Test
  void sslCertCaBad()  {
    assertThatThrownBy(
            () ->
                new ClientBuilder()
                    .setCertificateAuthority(
                        Files.readAllBytes(Paths.get(INVALID_SSL_CA_CERT_PATH)))
                    .build())
        .isInstanceOf(RuntimeException.class);
  }

  @Test
  void homeDirPreferredOverKubeConfig() throws Exception {
    String path =
        variables.set("HOME", HOME_PATH)
            .set("KUBEDIR", KUBEDIR)
            .set("KUBECONFIG", KUBECONFIG)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.standard().build();
                  return client.getBasePath();
                });
    assertThat("http://home.dir.com").isEqualTo(path);
  }

  @Test
  void iPv4AddressParsingShouldWork() throws Exception {
    String path =
        variables.set(ENV_SERVICE_HOST, "127.0.0.1")
            .set(ENV_SERVICE_PORT, "6443")
            .execute(
                () -> {
                  String ipv4Host = "127.0.0.1";
                  String port = "6443";
                  ClientBuilder builder =
                      new ClientBuilder() {
                        @Override
                        public ClientBuilder setBasePath(String host, String port) {
                          return super.setBasePath(host, port);
                        }
                      }.setBasePath(ipv4Host, port);
                  return builder.getBasePath();
                });
    assertThat("https://127.0.0.1:6443").isEqualTo(path);
  }

  @Test
  void iPv6AddressParsingShouldWork() throws Exception {
    String path =
        variables.set(ENV_SERVICE_HOST, "127.0.0.1")
            .set(ENV_SERVICE_PORT, "6443")
            .execute(
                () -> {
                  String ipv4Host = "::1";
                  String port = "6443";
                  ClientBuilder builder =
                      new ClientBuilder() {
                        @Override
                        public ClientBuilder setBasePath(String host, String port) {
                          return super.setBasePath(host, port);
                        }
                      }.setBasePath(ipv4Host, port);
                  return builder.getBasePath();
                });
    assertThat("https://[::1]:6443").isEqualTo(path);
  }

  @Test
  void settingPassphraseForKubeConfigShouldWork() throws IOException {
    String expectedPassphrase = "test";
    ClientBuilder builder =
        ClientBuilder.kubeconfig(
                KubeConfig.loadKubeConfig(new FileReader(KUBECONFIG_HTTPS_X509_FILE_PATH)))
            .setKeyStorePassphrase(expectedPassphrase);
    KubeconfigAuthentication receivingAuthn =
        (KubeconfigAuthentication) builder.getAuthentication();
    builder.build();
    assertThat(
        ((ClientCertificateAuthentication) receivingAuthn.getDelegateAuthentication())
            .getPassphrase()).isEqualTo(expectedPassphrase);
  }

  @Test
  void detectsServerNotSet() {
    assertThatThrownBy(
        () -> {
          KubeConfig kubeConfigWithoutServer = mock(KubeConfig.class);

          ClientBuilder.kubeconfig(kubeConfigWithoutServer);
        }).hasMessage("No server in kubeconfig").isInstanceOf(IllegalArgumentException.class);
  }
}
