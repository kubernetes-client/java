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

import static org.junit.Assert.*;

import com.google.auth.oauth2.AccessToken;
import com.google.auth.oauth2.GoogleCredentials;
import io.kubernetes.client.util.authenticators.Authenticator;
import io.kubernetes.client.util.authenticators.AzureActiveDirectoryAuthenticator;
import io.kubernetes.client.util.authenticators.GCPAuthenticator;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.sql.Date;
import java.time.Instant;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.mockito.Mockito;

/** Tests for the KubeConfigConfig helper class */
public class KubeConfigTest {

  @Rule public TemporaryFolder folder = new TemporaryFolder();

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
  public void testToken() {
    KubeConfig config = KubeConfig.loadKubeConfig(new StringReader(KUBECONFIG_TOKEN));
    assertEquals(config.getCredentials().get(KubeConfig.CRED_TOKEN_KEY), "foobaz");
  }

  @Test
  public void testTokenFile() throws IOException {
    String token = "flubble";
    File tokenFile = folder.newFile("token-file.txt");
    Files.write(tokenFile.toPath(), token.getBytes(StandardCharsets.UTF_8));

    String replace = KUBECONFIG_TOKEN.replace("foobaz", tokenFile.getCanonicalPath());
    replace = replace.replace("token:", "tokenFile:");
    KubeConfig config = KubeConfig.loadKubeConfig(new StringReader(replace));
    assertEquals(config.getCredentials().get(KubeConfig.CRED_TOKEN_KEY), token);
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
  public void testGCPAuthProvider() {
    KubeConfig.registerAuthenticator(new GCPAuthenticator());

    try {
      File config = folder.newFile("config");
      FileWriter writer = new FileWriter(config);
      writer.write(GCP_CONFIG);
      writer.flush();
      writer.close();

      KubeConfig kc = KubeConfig.loadKubeConfig(new FileReader(config));
      assertEquals("fake-token", kc.getCredentials().get(KubeConfig.CRED_TOKEN_KEY));
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Unexpected exception: " + ex);
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
  public void testGCPAuthProviderStringDate() {
    KubeConfig.registerAuthenticator(new GCPAuthenticator());

    try {
      File config = folder.newFile("config");
      FileWriter writer = new FileWriter(config);
      writer.write(GCP_TEST_DATE_STRING);
      writer.flush();
      writer.close();

      KubeConfig kc = KubeConfig.loadKubeConfig(new FileReader(config));
      assertEquals("fake-token", kc.getCredentials().get(KubeConfig.CRED_TOKEN_KEY));
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Unexpected exception: " + ex);
    }
  }

  @Test
  public void testGCPAuthProviderExpiredTokenWithinGCloud() {
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
    try {
      Mockito.when(mockPB.command(Mockito.anyList()).start()).thenReturn(mockProcess);
    } catch (IOException ex) {
      ex.printStackTrace();
      fail("Unexpected exception: " + ex);
    }

    KubeConfig.registerAuthenticator(new GCPAuthenticator(mockPB, null));
    try {
      KubeConfig kc = KubeConfig.loadKubeConfig(new StringReader(gcpConfigExpiredToken));
      assertEquals("new-fake-token", kc.getCredentials().get(KubeConfig.CRED_TOKEN_KEY));
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Unexpected exception: " + ex);
    }
  }

  @Test
  public void testGCPAuthProviderExpiredTokenWithoutGCloud() {
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
    try {
      KubeConfig kc = KubeConfig.loadKubeConfig(new StringReader(gcpConfigExpiredToken));
      assertEquals(fakeToken, kc.getCredentials().get(KubeConfig.CRED_TOKEN_KEY));
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Unexpected exception: " + ex);
    }
  }

  @Test
  public void testAzureAuthProvider() {
    KubeConfig.registerAuthenticator(new AzureActiveDirectoryAuthenticator());
    String azureConfig =
        "apiVersion: v1\n"
            + "contexts:\n"
            + "- context:\n"
            + "    user: aks-cluster\n"
            + "  name: foo-context\n"
            + "current-context: foo-context\n"
            + "users:\n"
            + "- name: aks-cluster\n"
            + "  user:\n"
            + "    auth-provider:\n"
            + "      config:\n"
            + "        access-token: fake-azure-token\n"
            + "        expires-on: \"1841569394\"\n"
            + "        expiry-key: '{.credential.token_expiry}'\n"
            + "        token-key: '{.credential.access_token}'\n"
            + "      name: azure\n";
    try {
      KubeConfig kc = KubeConfig.loadKubeConfig(new StringReader(azureConfig));
      assertEquals("fake-azure-token", kc.getCredentials().get(KubeConfig.CRED_TOKEN_KEY));
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Unexpected exception: " + ex);
    }
  }

  @Test
  public void testNamespace() {
    KubeConfig config = KubeConfig.loadKubeConfig(new StringReader(KUBECONFIG_TOKEN));
    assertEquals(config.getNamespace(), "some_namespace");
  }

  @Test
  public void testNullNamespace() {
    KubeConfig config = KubeConfig.loadKubeConfig(new StringReader(GCP_CONFIG));
    assertNull(config.getNamespace());
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
  public void testRefreshToken() {
    FakeAuthenticator fake = new FakeAuthenticator();
    KubeConfig.registerAuthenticator(fake);

    KubeConfig config = KubeConfig.loadKubeConfig(new StringReader(KUBECONFIG_FAKE));

    fake.expired = true;
    fake.token = "someNewToken";
    fake.refresh = "refreshToken";

    Map<String, String> credentials = config.getCredentials();
    assertEquals(credentials.get(KubeConfig.CRED_TOKEN_KEY), fake.token);
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
  public void testExecCredentials() throws Exception {
    // TODO: test exec on Windows
    if (System.getProperty("os.name").contains("Windows")) {
      return;
    }
    KubeConfig kc = KubeConfig.loadKubeConfig(new StringReader(KUBECONFIG_EXEC));
    kc.setFile(folder.newFile()); // just making sure it is ignored
    assertEquals("abc123", kc.getCredentials().get(KubeConfig.CRED_TOKEN_KEY));
  }

  @Test
  public void testExecCredentialsAlpha1() throws Exception {
    // TODO: test exec on Windows
    if (System.getProperty("os.name").contains("Windows")) {
      return;
    }
    KubeConfig kc =
        KubeConfig.loadKubeConfig(new StringReader(KUBECONFIG_EXEC.replace("v1beta1", "v1alpha1")));
    assertEquals("abc123", kc.getCredentials().get(KubeConfig.CRED_TOKEN_KEY));
  }

  @Test
  public void testExecCredentialsV1() throws Exception {
    // TODO: test exec on Windows
    if (System.getProperty("os.name").contains("Windows")) {
      return;
    }
    KubeConfig kc =
        KubeConfig.loadKubeConfig(new StringReader(KUBECONFIG_EXEC.replace("v1beta1", "v1")));
    assertEquals("abc123", kc.getCredentials().get(KubeConfig.CRED_TOKEN_KEY));
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
  public void testExecCredentialsEnv() throws Exception {
    // TODO: test exec on Windows
    if (System.getProperty("os.name").contains("Windows")) {
      return;
    }

    KubeConfig kc = KubeConfig.loadKubeConfig(new StringReader(KUBECONFIG_EXEC_ENV));
    assertEquals("abc123", kc.getCredentials().get(KubeConfig.CRED_TOKEN_KEY));
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
  public void testExecCredentialsBasedir() throws Exception {
    // TODO: test exec on Windows
    if (System.getProperty("os.name").contains("Windows")) {
      return;
    }

    File basedir = folder.newFolder();
    File config = new File(basedir, ".kubeconfig");
    try (FileWriter writer = new FileWriter(config)) {
      writer.write(KUBECONFIG_EXEC_BASEDIR);
      writer.flush();
    }
    File bindir = new File(basedir, "bin");
    bindir.mkdir();
    File script = new File(bindir, "authenticate");
    try (FileWriter writer = new FileWriter(script)) {
      writer.write(AUTH_SCRIPT);
      writer.flush();
    }
    script.setExecutable(true);
    try (FileReader reader = new FileReader(config)) {
      KubeConfig kc = KubeConfig.loadKubeConfig(reader);
      kc.setFile(config);
      assertEquals("abc123", kc.getCredentials().get(KubeConfig.CRED_TOKEN_KEY));
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
  public void testExecCredentialsCertificate() throws Exception {
    // TODO: test exec on Windows
    if (System.getProperty("os.name").contains("Windows")) {
      return;
    }
    KubeConfig kc = KubeConfig.loadKubeConfig(new StringReader(KUBECONFIG_EXEC_CERTIFICATE));
    assertEquals("cert", kc.getCredentials().get(KubeConfig.CRED_CLIENT_CERTIFICATE_DATA_KEY));
    assertEquals("key", kc.getCredentials().get(KubeConfig.CRED_CLIENT_KEY_DATA_KEY));
    assertNull(kc.getCredentials().get(KubeConfig.CRED_TOKEN_KEY));
  }
}
