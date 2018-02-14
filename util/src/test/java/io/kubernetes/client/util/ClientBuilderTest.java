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

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.google.common.io.Resources;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.util.credentials.Authentication;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.EnvironmentVariables;

/** Tests for the ConfigBuilder helper class */
public class ClientBuilderTest {
  private static final String HOME_PATH = Resources.getResource("").getPath();
  private static final String KUBECONFIG_FILE_PATH = Resources.getResource("kubeconfig").getPath();
  private static final String KUBECONFIG_HTTP_FILE_PATH =
      Resources.getResource("kubeconfig-http").getPath();
  private static final String KUBECONFIG_HTTPS_FILE_PATH =
      Resources.getResource("kubeconfig-https").getPath();
  private static final String SSL_CA_CERT_PATH = Resources.getResource("ca-cert.pem").getPath();
  private static final String INVALID_SSL_CA_CERT_PATH =
      Resources.getResource("ca-cert-invalid.pem").getPath();

  private String basePath = "http://localhost";
  private String apiKey = "ABCD";
  private String userName = "userName";
  private String password = "password";
  private String apiKeyPrefix = "Bearer";

  @Rule public final EnvironmentVariables environmentVariables = new EnvironmentVariables();

  @Before
  public void setup() {
    environmentVariables.set("HOME", "/non-existent");
  }

  @Test
  public void testDefaultClientWithNoFiles() throws IOException {
    environmentVariables.set("HOME", "/non-existent");
    final ApiClient client = ClientBuilder.defaultClient();
    assertEquals("http://localhost:8080", client.getBasePath());
  }

  @Test
  public void testDefaultClientReadsHomeDir() throws Exception {
    environmentVariables.set("HOME", HOME_PATH);
    ApiClient client = ClientBuilder.defaultClient();
    assertEquals("http://home.dir.com", client.getBasePath());
  }

  @Test
  public void testDefaultClientReadsKubeConfig() throws Exception {
    environmentVariables.set("KUBECONFIG", KUBECONFIG_FILE_PATH);
    final ApiClient client = ClientBuilder.defaultClient();
    assertEquals("http://kubeconfig.dir.com", client.getBasePath());
  }

  @Test
  public void testKubeconfigPreferredOverHomeDir() throws Exception {
    environmentVariables.set("HOME", HOME_PATH);
    environmentVariables.set("KUBECONFIG", KUBECONFIG_FILE_PATH);
    final ApiClient client = ClientBuilder.standard().build();
    // $KUBECONFIG should take precedence over $HOME/.kube/config
    assertEquals("http://kubeconfig.dir.com", client.getBasePath());
  }

  @Test
  public void testInvalidKubeconfig() throws Exception {
    environmentVariables.set("KUBECONFIG", "/non-existent");
    final ApiClient client = ClientBuilder.standard().build();
    assertThat(client.getBasePath(), is(Config.DEFAULT_FALLBACK_HOST));
  }

  @Test
  public void testKubeconfigAddsSchemeHttps() throws Exception {
    environmentVariables.set("KUBECONFIG", KUBECONFIG_HTTPS_FILE_PATH);
    final ApiClient client = ClientBuilder.standard().build();
    assertThat(client.getBasePath(), is("https://localhost:443"));
  }

  @Test
  public void testKubeconfigAddsSchemeHttp() throws Exception {
    environmentVariables.set("KUBECONFIG", KUBECONFIG_HTTP_FILE_PATH);
    final ApiClient client = ClientBuilder.standard().build();
    assertThat(client.getBasePath(), is("http://localhost"));
  }

  @Test
  public void testKubeconfigDisablesVerifySsl() throws Exception {
    environmentVariables.set("KUBECONFIG", KUBECONFIG_HTTP_FILE_PATH);
    final ApiClient client = ClientBuilder.standard().build();
    assertThat(client.isVerifyingSsl(), is(false));
  }

  @Test
  public void testBasePathTrailingSlash() throws Exception {
    final ApiClient client = ClientBuilder.standard().setBasePath("http://localhost/").build();
    assertThat(client.getBasePath(), is("http://localhost"));
  }

  @Test
  public void testStandardVerifiesSsl() throws IOException {
    environmentVariables.set("HOME", "/non-existent");
    final ApiClient client = ClientBuilder.standard().build();
    assertThat(client.isVerifyingSsl(), is(true));
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
}
