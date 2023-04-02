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
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static uk.org.webcompere.systemstubs.SystemStubs.withEnvironmentVariable;

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
import org.junit.Test;

/** Tests for the ConfigBuilder helper class */
public class ClientBuilderTest {
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

  @Test
  public void testDefaultClientWithNoFiles() throws Exception {
    String path =
        withEnvironmentVariable("HOME", "/non-existent")
            .and("HOMEDRIVE", null)
            .and("USERPROFILE", null)
            .and("KUBECONFIG", null)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.defaultClient();
                  return client.getBasePath();
                });
    assertEquals("http://localhost:8080", path);
  }

  @Test
  public void testDefaultClientReadsHomeDir() throws Exception {
    String path =
        withEnvironmentVariable("HOME", HOME_PATH)
            .execute(
                () -> {
                  ApiClient client = ClientBuilder.defaultClient();
                  return client.getBasePath();
                });
    assertEquals("http://home.dir.com", path);
  }

  @Test
  public void testDefaultClientReadsKubeConfig() throws Exception {
    String path =
        withEnvironmentVariable("KUBECONFIG", KUBECONFIG_FILE_PATH)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.defaultClient();
                  return client.getBasePath();
                });
    assertEquals("http://kubeconfig.dir.com", path);
  }

  @Test
  public void testDefaultClientUTF8EncodedConfig() throws Exception {
    String path =
        withEnvironmentVariable("KUBECONFIG", KUBECONFIG_UTF8_FILE_PATH)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.defaultClient();
                  return client.getBasePath();
                });
    assertEquals("http://kubeconfig.dir.com", path);
  }

  @Test
  public void testDefaultClientReadsKubeConfigMultiple() throws Exception {
    final String kubeConfigEnv = KUBECONFIG_FILE_PATH + File.pathSeparator + "/non-existent";
    String path =
        withEnvironmentVariable("KUBECONFIG", kubeConfigEnv)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.defaultClient();
                  return client.getBasePath();
                });
    assertEquals("http://kubeconfig.dir.com", path);
  }

  @Test
  public void testKubeconfigPreferredOverHomeDir() throws Exception {
    String path =
        withEnvironmentVariable("HOME", HOME_PATH)
            .and("KUBECONFIG", KUBECONFIG_FILE_PATH)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.standard().build();
                  return client.getBasePath();
                });
    // $KUBECONFIG should take precedence over $HOME/.kube/config
    assertEquals("http://kubeconfig.dir.com", path);
  }

  @Test
  public void testInvalidKubeconfig() throws Exception {
    String path =
        withEnvironmentVariable("KUBECONFIG", "/non-existent")
            .and("HOME", "/none-existent")
            .and("HOMEDRIVE", null)
            .and("USERPROFILE", null)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.standard().build();
                  return client.getBasePath();
                });
    assertThat(path, is(Config.DEFAULT_FALLBACK_HOST));
  }

  @Test
  public void testKubeconfigAddsSchemeHttps() throws Exception {
    String path =
        withEnvironmentVariable("KUBECONFIG", KUBECONFIG_HTTPS_FILE_PATH)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.standard().build();
                  return client.getBasePath();
                });
    assertThat(path, is("https://localhost:443"));
  }

  @Test
  public void testKubeconfigAddsSchemeHttp() throws Exception {
    String path =
        withEnvironmentVariable("KUBECONFIG", KUBECONFIG_HTTP_FILE_PATH)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.standard().build();
                  return client.getBasePath();
                });
    assertThat(path, is("http://localhost"));
  }

  @Test
  public void testKubeconfigDisablesVerifySsl() throws Exception {
    boolean isVerifyingSsl =
        withEnvironmentVariable("KUBECONFIG", KUBECONFIG_HTTP_FILE_PATH)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.standard().build();
                  return client.isVerifyingSsl();
                });
    assertThat(isVerifyingSsl, is(false));
  }

  @Test
  public void testBasePathTrailingSlash() throws Exception {
    final ApiClient client = ClientBuilder.standard().setBasePath("http://localhost/").build();
    assertThat(client.getBasePath(), is("http://localhost"));
  }

  @Test
  public void testStandardVerifiesSsl() throws Exception {
    boolean isVerifyingSsl =
        withEnvironmentVariable("HOME", "/non-existent")
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.standard().build();
                  return client.isVerifyingSsl();
                });
    assertThat(isVerifyingSsl, is(true));
  }

  @Test
  public void testCredentialProviderInvoked() throws IOException {
    final Authentication provider = mock(Authentication.class);
    final ApiClient client = ClientBuilder.standard().setAuthentication(provider).build();
    verify(provider).provide(client);
  }

  /**
   * We can't verify anything here because of how things are configured in swagger-codegen and
   * okhttp but combined with {@link #testSslCertCaBad()} we have some certainty that it is being
   * invoked.
   */
  @Test
  public void testSslCertCaGood() throws Exception {
    final ApiClient client =
        new ClientBuilder()
            .setCertificateAuthority(Files.readAllBytes(Paths.get(SSL_CA_CERT_PATH)))
            .build();
  }

  @Test(expected = RuntimeException.class)
  public void testSslCertCaBad() throws Exception {
    final ApiClient client =
        new ClientBuilder()
            .setCertificateAuthority(Files.readAllBytes(Paths.get(INVALID_SSL_CA_CERT_PATH)))
            .build();
  }

  @Test
  public void testHomeDirPreferredOverKubeConfig() throws Exception {
    String path =
        withEnvironmentVariable("HOME", HOME_PATH)
            .and("KUBEDIR", KUBEDIR)
            .and("KUBECONFIG", KUBECONFIG)
            .execute(
                () -> {
                  final ApiClient client = ClientBuilder.standard().build();
                  return client.getBasePath();
                });
    assertEquals(path, "http://home.dir.com");
  }

  @Test
  public void testIPv4AddressParsingShouldWork() throws Exception {
    String path =
        withEnvironmentVariable(ENV_SERVICE_HOST, "127.0.0.1")
            .and(ENV_SERVICE_PORT, "6443")
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
    assertEquals(path, "https://127.0.0.1:6443");
  }

  @Test
  public void testIPv6AddressParsingShouldWork() throws Exception {
    String path =
        withEnvironmentVariable(ENV_SERVICE_HOST, "127.0.0.1")
            .and(ENV_SERVICE_PORT, "6443")
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
    assertEquals(path, "https://[::1]:6443");
  }

  @Test
  public void testSettingPassphraseForKubeConfigShouldWork() throws IOException {
    String expectedPassphrase = "test";
    ClientBuilder builder =
        ClientBuilder.kubeconfig(
                KubeConfig.loadKubeConfig(new FileReader(KUBECONFIG_HTTPS_X509_FILE_PATH)))
            .setKeyStorePassphrase(expectedPassphrase);
    KubeconfigAuthentication receivingAuthn =
        (KubeconfigAuthentication) builder.getAuthentication();
    builder.build();
    assertEquals(
        expectedPassphrase,
        ((ClientCertificateAuthentication) receivingAuthn.getDelegateAuthentication())
            .getPassphrase());
  }

  @Test
  public void testDetectsServerNotSet() {
    assertThrows(
        "No server in kubeconfig",
        IllegalArgumentException.class,
        () -> {
          KubeConfig kubeConfigWithoutServer = mock(KubeConfig.class);

          ClientBuilder.kubeconfig(kubeConfigWithoutServer);
        });
  }
}
