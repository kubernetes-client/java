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

import static org.assertj.core.api.Assertions.assertThat;

import com.google.auth.oauth2.AccessToken;
import com.google.auth.oauth2.GoogleCredentials;
import io.kubernetes.client.util.authenticators.Authenticator;
import io.kubernetes.client.util.authenticators.GCPAuthenticator;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Date;
import java.time.Instant;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.mockito.Mockito;

/** Tests for the KubeConfigConfig helper class */
class KubeConfigTest {

  public static String KUBECONFIG_TOKEN =
      "apiVersion: v1\n"
          + "clusters:\n"
          + "- cluster:\n"
          + "    server: http://kubeconfig.dir.com\n"
          + "  name: foo\n"
          + "users:\n"
          + "- user:\n"
          + "   token: foobaz\n"
          + "  name: foo\n"
          + "contexts:\n"
          + "- context:\n"
          + "    cluster: foo\n"
          + "    namespace: some_namespace\n"
          + "    user: foo\n"
          + "  name: foo-context\n"
          + "current-context: foo-context\n";

  @Test
  void token() {
    KubeConfig config = KubeConfig.loadKubeConfig(new StringReader(KUBECONFIG_TOKEN));
    assertThat("foobaz").isEqualTo(config.getCredentials().get(KubeConfig.CRED_TOKEN_KEY));
  }

  @Test
  void tokenFile(@TempDir Path tempDir) throws IOException {
    String token = "flubble";
    Path tokenFile = Files.createTempFile(tempDir, "token-file", ".txt");
    Files.write(tokenFile, token.getBytes(StandardCharsets.UTF_8));

    String replace = KUBECONFIG_TOKEN.replace("foobaz", tokenFile.toString());
    replace = replace.replace("token:", "tokenFile:");
    KubeConfig config = KubeConfig.loadKubeConfig(new StringReader(replace));
    assertThat(token).isEqualTo(config.getCredentials().get(KubeConfig.CRED_TOKEN_KEY));
  }

  public static String GCP_CONFIG =
      "apiVersion: v1\n"
          + "contexts:\n"
          + "- context:\n"
          + "    user: gke-cluster\n"
          + "  name: foo-context\n"
          + "current-context: foo-context\n"
          + "users:\n"
          + "- name: gke-cluster\n"
          + "  user:\n"
          + "    auth-provider:\n"
          + "      config:\n"
          + "        access-token: fake-token\n"
          + "        cmd-args: config config-helper --format=json\n"
          + "        cmd-path: /usr/lib/google-cloud-sdk/bin/gcloud\n"
          + "        expiry: 2117-06-22T18:27:02Z\n"
          + "        expiry-key: '{.credential.token_expiry}'\n"
          + "        token-key: '{.credential.access_token}'\n"
          + "      name: gcp\n";

  @Test
  void gcpAuthProvider(@TempDir Path tempDir) throws Exception {
    KubeConfig.registerAuthenticator(new GCPAuthenticator());

    Path config = Files.createTempFile(tempDir, "config", null);
    Files.writeString(config, GCP_CONFIG);

    try (Reader reader = new FileReader(config.toFile())) {
      KubeConfig kc = KubeConfig.loadKubeConfig(reader);
      assertThat(kc.getCredentials()).containsEntry(KubeConfig.CRED_TOKEN_KEY, "fake-token");
    }
  }

  private static String GCP_TEST_DATE_STRING =
      "apiVersion: v1\n"
          + "contexts:\n"
          + "- context:\n"
          + "    user: gke-cluster\n"
          + "  name: foo-context\n"
          + "current-context: foo-context\n"
          + "users:\n"
          + "- name: gke-cluster\n"
          + "  user:\n"
          + "    auth-provider:\n"
          + "      config:\n"
          + "        access-token: fake-token\n"
          + "        cmd-args: config config-helper --format=json\n"
          + "        cmd-path: /usr/lib/google-cloud-sdk/bin/gcloud\n"
          + "        expiry: \"2117-06-22T18:27:02Z\"\n"
          + "        expiry-key: '{.credential.token_expiry}'\n"
          + "        token-key: '{.credential.access_token}'\n"
          + "      name: gcp\n";

  @Test
  void gcpAuthProviderStringDate(@TempDir Path tempDir) throws IOException {
    KubeConfig.registerAuthenticator(new GCPAuthenticator());

    Path config = Files.createTempFile(tempDir, "config", null);
    Files.writeString(config, GCP_TEST_DATE_STRING);

    try (Reader reader = new FileReader(config.toFile())) {
      KubeConfig kc = KubeConfig.loadKubeConfig(reader);
      assertThat(kc.getCredentials()).containsEntry(KubeConfig.CRED_TOKEN_KEY, "fake-token");
    }
  }

  @Test
  void gcpAuthProviderExpiredTokenWithinGCloud() throws Exception {
    String gcpConfigExpiredToken =
        "apiVersion: v1\n"
            + "contexts:\n"
            + "- context:\n"
            + "    user: gke-cluster\n"
            + "  name: foo-context\n"
            + "current-context: foo-context\n"
            + "users:\n"
            + "- name: gke-cluster\n"
            + "  user:\n"
            + "    auth-provider:\n"
            + "      config:\n"
            + "        access-token: fake-token\n"
            + "        cmd-args: config config-helper --format=json\n"
            + "        cmd-path: /usr/lib/google-cloud-sdk/bin/gcloud\n"
            + "        expiry: 1970-01-01T00:00:00Z\n"
            + "        expiry-key: '{.credential.token_expiry}'\n"
            + "        token-key: '{.credential.access_token}'\n"
            + "      name: gcp";
    String fakeExecResult =
        "{\n"
            + "  \"credential\": {\n"
            + "    \"access_token\": \"new-fake-token\",\n"
            + "    \"id_token\": \"id-fake-token\",\n"
            + "    \"token_expiry\": \"2121-08-05T02:30:24Z\"\n"
            + "  }\n"
            + "}";
    ProcessBuilder mockPB = Mockito.mock(ProcessBuilder.class, Mockito.RETURNS_DEEP_STUBS);
    Process mockProcess = Mockito.mock(Process.class);
    Mockito.when(mockProcess.exitValue()).thenReturn(0);
    Mockito.when(mockProcess.getInputStream())
        .thenReturn(new ByteArrayInputStream(fakeExecResult.getBytes(StandardCharsets.UTF_8)));
    Mockito.when(mockPB.command(Mockito.anyList()).start()).thenReturn(mockProcess);

    KubeConfig.registerAuthenticator(new GCPAuthenticator(mockPB, null));
    KubeConfig kc = KubeConfig.loadKubeConfig(new StringReader(gcpConfigExpiredToken));
    assertThat(kc.getCredentials()).containsEntry(KubeConfig.CRED_TOKEN_KEY, "new-fake-token");
  }

  @Test
  void gcpAuthProviderExpiredTokenWithoutGCloud() {
    String gcpConfigExpiredToken =
        "apiVersion: v1\n"
            + "contexts:\n"
            + "- context:\n"
            + "    user: gke-cluster\n"
            + "  name: foo-context\n"
            + "current-context: foo-context\n"
            + "users:\n"
            + "- name: gke-cluster\n"
            + "  user:\n"
            + "    auth-provider:\n"
            + "      config:\n"
            + "        access-token: fake-token\n"
            + "        expiry: 1970-01-01T00:00:00Z\n"
            + "      name: gcp";

    String fakeToken = "new-fake-token";
    String fakeTokenExpiry = "2121-08-05T02:30:24Z";

    GoogleCredentials mockGC = Mockito.mock(GoogleCredentials.class);
    Mockito.when(mockGC.getAccessToken())
        .thenReturn(new AccessToken(fakeToken, Date.from(Instant.parse(fakeTokenExpiry))));

    KubeConfig.registerAuthenticator(new GCPAuthenticator(null, mockGC));
    KubeConfig kc = KubeConfig.loadKubeConfig(new StringReader(gcpConfigExpiredToken));
    assertThat(kc.getCredentials()).containsEntry(KubeConfig.CRED_TOKEN_KEY, fakeToken);
  }

  @Test
  void namespace() {
    KubeConfig config = KubeConfig.loadKubeConfig(new StringReader(KUBECONFIG_TOKEN));
    assertThat("some_namespace").isEqualTo(config.getNamespace());
  }

  @Test
  void nullNamespace() {
    KubeConfig config = KubeConfig.loadKubeConfig(new StringReader(GCP_CONFIG));
    assertThat(config.getNamespace()).isNull();
  }

  static class FakeAuthenticator implements Authenticator {
    public String token;
    public String refresh;
    public boolean expired;

    public String getName() {
      return "fake";
    }

    public String getToken(Map<String, Object> config) {
      return (String) config.get("access-token");
    }

    public boolean isExpired(Map<String, Object> config) {
      return expired;
    }

    public Map<String, Object> refresh(Map<String, Object> config) {
      config.put("access-token", token);
      config.put("refresh-token", refresh);
      return config;
    }
  }

  public static String KUBECONFIG_FAKE =
      "apiVersion: v1\n"
          + "contexts:\n"
          + "- context:\n"
          + "    user: fake-cluster\n"
          + "  name: foo-context\n"
          + "current-context: foo-context\n"
          + "users:\n"
          + "- name: fake-cluster\n"
          + "  user:\n"
          + "    auth-provider:\n"
          + "      config:\n"
          + "        access-token: fake-token\n"
          + "      name: fake\n";

  @Test
  void refreshToken() {
    FakeAuthenticator fake = new FakeAuthenticator();
    KubeConfig.registerAuthenticator(fake);

    KubeConfig config = KubeConfig.loadKubeConfig(new StringReader(KUBECONFIG_FAKE));

    fake.expired = true;
    fake.token = "someNewToken";
    fake.refresh = "refreshToken";

    Map<String, String> credentials = config.getCredentials();
    assertThat(fake.token).isEqualTo(credentials.get(KubeConfig.CRED_TOKEN_KEY));
  }

  private static final String KUBECONFIG_EXEC =
      "apiVersion: v1\n"
          + "current-context: c\n"
          + "contexts:\n"
          + "- name: c\n"
          + "  context:\n"
          + "    user: u\n"
          + "users:\n"
          + "- name: u\n"
          + "  user:\n"
          + "    exec:\n"
          + "      apiVersion: client.authentication.k8s.io/v1beta1\n"
          + "      command: echo\n"
          + "      args:\n"
          + "        - >-\n"
          + "          {\"apiVersion\": \"client.authentication.k8s.io/v1beta1\", \"kind\": \"ExecCredential\", \"status\": {\"token\": \"abc123\"}}\n";

  @Test
  void execCredentials(@TempDir Path tempDir) throws Exception{
    // TODO: test exec on Windows
    if (System.getProperty("os.name").contains("Windows")) {
      return;
    }
    KubeConfig kc = KubeConfig.loadKubeConfig(new StringReader(KUBECONFIG_EXEC));
    kc.setFile(Files.createTempFile(tempDir, "junit", ".txt").toFile()); // just making sure it is ignored
    assertThat(kc.getCredentials()).containsEntry(KubeConfig.CRED_TOKEN_KEY, "abc123");
  }

  @Test
  void execCredentialsAlpha1() {
    // TODO: test exec on Windows
    if (System.getProperty("os.name").contains("Windows")) {
      return;
    }
    KubeConfig kc =
        KubeConfig.loadKubeConfig(new StringReader(KUBECONFIG_EXEC.replace("v1beta1", "v1alpha1")));
    assertThat(kc.getCredentials()).containsEntry(KubeConfig.CRED_TOKEN_KEY, "abc123");
  }

  @Test
  void execCredentialsV1() {
    // TODO: test exec on Windows
    if (System.getProperty("os.name").contains("Windows")) {
      return;
    }
    KubeConfig kc =
        KubeConfig.loadKubeConfig(new StringReader(KUBECONFIG_EXEC.replace("v1beta1", "v1")));
    assertThat(kc.getCredentials()).containsEntry(KubeConfig.CRED_TOKEN_KEY, "abc123");
  }

  private static final String KUBECONFIG_EXEC_ENV =
      "apiVersion: v1\n"
          + "current-context: c\n"
          + "contexts:\n"
          + "- name: c\n"
          + "  context:\n"
          + "    user: u\n"
          + "users:\n"
          + "- name: u\n"
          + "  user:\n"
          + "    exec:\n"
          + "      apiVersion: client.authentication.k8s.io/v1beta1\n"
          + "      command: sh\n"
          + "      env:\n"
          + "        - name: TOK\n"
          + "          value: abc\n"
          + "      args:\n"
          + "        - -c\n"
          + "        - >-\n"
          + "          echo '{\"apiVersion\": \"client.authentication.k8s.io/v1beta1\", \"kind\": \"ExecCredential\", \"status\": {\"token\": \"'$TOK'123\"}}'\n";

  @Test
  void execCredentialsEnv() {
    // TODO: test exec on Windows
    if (System.getProperty("os.name").contains("Windows")) {
      return;
    }

    KubeConfig kc = KubeConfig.loadKubeConfig(new StringReader(KUBECONFIG_EXEC_ENV));
    assertThat(kc.getCredentials()).containsEntry(KubeConfig.CRED_TOKEN_KEY, "abc123");
  }

  private static final String KUBECONFIG_EXEC_BASEDIR =
      "apiVersion: v1\n"
          + "current-context: c\n"
          + "contexts:\n"
          + "- name: c\n"
          + "  context:\n"
          + "    user: u\n"
          + "users:\n"
          + "- name: u\n"
          + "  user:\n"
          + "    exec:\n"
          + "      apiVersion: client.authentication.k8s.io/v1beta1\n"
          + "      command: ./bin/authenticate\n";

  private static final String AUTH_SCRIPT =
      "#!/bin/sh\n"
          + "echo '{\"apiVersion\": \"client.authentication.k8s.io/v1beta1\", \"kind\": \"ExecCredential\", \"status\": {\"token\": \"abc123\"}}'\n";

  @Test
  void execCredentialsBasedir(@TempDir Path tempDir) throws Exception {
    // TODO: test exec on Windows
    if (System.getProperty("os.name").contains("Windows")) {
      return;
    }

    Path config = tempDir.resolve(".kubeconfig");
    Files.writeString(config, KUBECONFIG_EXEC_BASEDIR);

    Path bindir = Files.createDirectory(tempDir.resolve("bin"));
    Path script = bindir.resolve("authenticate");
    Files.writeString(script, AUTH_SCRIPT);
    script.toFile().setExecutable(true);

    try (FileReader reader = new FileReader(config.toFile())) {
      KubeConfig kc = KubeConfig.loadKubeConfig(reader);
      kc.setFile(config.toFile());
      assertThat(kc.getCredentials()).containsEntry(KubeConfig.CRED_TOKEN_KEY, "abc123");
    }
  }

  private static final String KUBECONFIG_EXEC_CERTIFICATE =
      "apiVersion: v1\n"
          + "current-context: c\n"
          + "contexts:\n"
          + "- name: c\n"
          + "  context:\n"
          + "    user: u\n"
          + "users:\n"
          + "- name: u\n"
          + "  user:\n"
          + "    exec:\n"
          + "      apiVersion: client.authentication.k8s.io/v1beta1\n"
          + "      command: echo\n"
          + "      args:\n"
          + "        - >-\n"
          + "          {\"kind\":\"ExecCredential\",\"apiVersion\":\"client.authentication.k8s.io/v1beta1\", \"status\":{\"clientCertificateData\":\"cert\",\"clientKeyData\":\"key\"}}";

  @Test
  void execCredentialsCertificate() {
    // TODO: test exec on Windows
    if (System.getProperty("os.name").contains("Windows")) {
      return;
    }
    KubeConfig kc = KubeConfig.loadKubeConfig(new StringReader(KUBECONFIG_EXEC_CERTIFICATE));
    assertThat(kc.getCredentials()).containsEntry(KubeConfig.CRED_CLIENT_CERTIFICATE_DATA_KEY, "cert");
    assertThat(kc.getCredentials()).containsEntry(KubeConfig.CRED_CLIENT_KEY_DATA_KEY, "key");
    assertThat(kc.getCredentials().get(KubeConfig.CRED_TOKEN_KEY)).isNull();
  }
}
