/*
Copyright 2026 The Kubernetes Authors.
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
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.kubernetes.client.util.exception.ExecCredentialPluginDeniedException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class ExecCredentialPluginPolicyTest {

  private static boolean isWindows() {
    return System.getProperty("os.name").contains("Windows");
  }

  private static Path executable(Path dir, String name) throws IOException {
    Files.createDirectories(dir);
    Path file = dir.resolve(name);
    Files.writeString(file, "#!/bin/sh\n");
    file.toFile().setExecutable(true);
    return file;
  }

  @Test
  void allowAllAllowsAnything() {
    assertThat(ExecCredentialPluginPolicy.ALLOW_ALL.checkAllowed("anything")).isEqualTo("anything");
  }

  @Test
  void denyAllDeniesEverything() {
    assertThatThrownBy(() -> ExecCredentialPluginPolicy.DENY_ALL.checkAllowed("echo"))
        .isInstanceOf(ExecCredentialPluginDeniedException.class)
        .hasMessageContaining("DenyAll")
        .extracting(e -> ((ExecCredentialPluginDeniedException) e).getCommand())
        .isEqualTo("echo");
  }

  @Test
  void invalidAllowlistsAreRejected() {
    assertThatThrownBy(() -> ExecCredentialPluginPolicy.allowlist())
        .isInstanceOf(IllegalArgumentException.class);
    assertThatThrownBy(() -> ExecCredentialPluginPolicy.allowlist((String[]) null))
        .isInstanceOf(IllegalArgumentException.class);
    assertThatThrownBy(() -> ExecCredentialPluginPolicy.allowlist("ok", ""))
        .isInstanceOf(IllegalArgumentException.class);
    assertThatThrownBy(() -> ExecCredentialPluginPolicy.allowlist("ok", null))
        .isInstanceOf(IllegalArgumentException.class);
    assertThatThrownBy(() -> ExecCredentialPluginPolicy.allowlist("./foo"))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("non-normalized");
  }

  @Test
  void allowlistCopiesInput() {
    String[] entries = {"trusted"};
    ExecCredentialPluginPolicy policy = ExecCredentialPluginPolicy.allowlist(entries);
    entries[0] = "untrusted";
    assertThat(policy.getAllowlist()).containsExactly("trusted");
  }

  @Test
  void allowlistMatching(@TempDir Path tempDir) throws IOException {
    if (isWindows()) {
      return;
    }
    Path bin = tempDir.resolve("bin");
    Path other = tempDir.resolve("other");
    Path plugin = executable(bin, "trusted-plugin");
    Path otherPlugin = executable(other, "trusted-plugin");
    String path = bin.toString();

    // basename entry
    ExecCredentialPluginPolicy basename = ExecCredentialPluginPolicy.allowlist("trusted-plugin");
    assertThat(basename.checkAllowed("trusted-plugin", path, null, false))
        .isEqualTo(plugin.toString());
    assertThat(basename.checkAllowed(plugin.toString(), path, null, false))
        .isEqualTo(plugin.toString());
    assertThatThrownBy(() -> basename.checkAllowed(otherPlugin.toString(), path, null, false))
        .isInstanceOf(ExecCredentialPluginDeniedException.class);
    assertThatThrownBy(() -> basename.checkAllowed("untrusted-plugin", path, null, false))
        .isInstanceOf(ExecCredentialPluginDeniedException.class);

    // full path entry
    ExecCredentialPluginPolicy full = ExecCredentialPluginPolicy.allowlist(plugin.toString());
    assertThat(full.checkAllowed(plugin.toString(), path, null, false))
        .isEqualTo(plugin.toString());
    assertThat(full.checkAllowed("trusted-plugin", path, null, false))
        .isEqualTo(plugin.toString());
    assertThat(full.checkAllowed(bin + "/./trusted-plugin", path, null, false))
        .isEqualTo(plugin.toString());
    assertThatThrownBy(() -> full.checkAllowed(otherPlugin.toString(), path, null, false))
        .isInstanceOf(ExecCredentialPluginDeniedException.class);
    // basename resolved through a different PATH is denied
    assertThatThrownBy(() -> full.checkAllowed("trusted-plugin", other.toString(), null, false))
        .isInstanceOf(ExecCredentialPluginDeniedException.class);
  }

  @Test
  void allowlistDoesNotFollowSymlinks(@TempDir Path tempDir) throws IOException {
    if (isWindows()) {
      return;
    }
    Path target = executable(tempDir.resolve("target"), "plugin");
    Path link = Files.createDirectories(tempDir.resolve("links")).resolve("plugin");
    Files.createSymbolicLink(link, target);

    ExecCredentialPluginPolicy policy = ExecCredentialPluginPolicy.allowlist(link.toString());
    assertThat(policy.checkAllowed(link.toString(), "", null, false)).isEqualTo(link.toString());
    assertThatThrownBy(() -> policy.checkAllowed(target.toString(), "", null, false))
        .isInstanceOf(ExecCredentialPluginDeniedException.class);
  }

  @Test
  void lookPathIgnoresRelativeAndMissingEntries(@TempDir Path tempDir) throws IOException {
    if (isWindows()) {
      return;
    }
    Path bin = tempDir.resolve("bin");
    Path plugin = executable(bin, "p");
    Files.writeString(bin.resolve("not-exec"), "");
    String pathEnv = "relative" + File.pathSeparator + File.pathSeparator + bin;
    assertThat(ExecCredentialPluginPolicy.lookPath("p", pathEnv, null, false))
        .isEqualTo(plugin.toString());
    assertThat(ExecCredentialPluginPolicy.lookPath("not-exec", pathEnv, null, false)).isNull();
    assertThat(ExecCredentialPluginPolicy.lookPath("missing", pathEnv, null, false)).isNull();
    assertThat(ExecCredentialPluginPolicy.lookPath("p", null, null, false)).isNull();
  }

  @Test
  void kubeRcPolicies() {
    String header = "apiVersion: kubectl.config.k8s.io/v1beta1\nkind: Preference\n";
    assertThat(ExecCredentialPluginPolicy.fromKubeRc(new StringReader(header)))
        .isSameAs(ExecCredentialPluginPolicy.ALLOW_ALL);
    assertThat(
            ExecCredentialPluginPolicy.fromKubeRc(
                new StringReader(header + "credentialPluginPolicy: \"\"\n")))
        .isSameAs(ExecCredentialPluginPolicy.ALLOW_ALL);
    assertThat(
            ExecCredentialPluginPolicy.fromKubeRc(
                new StringReader(header + "credentialPluginPolicy: AllowAll\n")))
        .isSameAs(ExecCredentialPluginPolicy.ALLOW_ALL);
    assertThat(
            ExecCredentialPluginPolicy.fromKubeRc(
                new StringReader(header + "credentialPluginPolicy: DenyAll\n")))
        .isSameAs(ExecCredentialPluginPolicy.DENY_ALL);

    ExecCredentialPluginPolicy allowlist =
        ExecCredentialPluginPolicy.fromKubeRc(
            new StringReader(
                header
                    + "credentialPluginPolicy: Allowlist\n"
                    + "credentialPluginAllowlist:\n"
                    + "  - command: my-trusted-binary\n"
                    + "  - name: /usr/local/bin/my-other-trusted-binary\n"));
    assertThat(allowlist.getType()).isEqualTo(ExecCredentialPluginPolicy.PolicyType.ALLOWLIST);
    assertThat(allowlist.getAllowlist())
        .containsExactly("my-trusted-binary", "/usr/local/bin/my-other-trusted-binary");
  }

  @Test
  void invalidKubeRcPolicies() {
    String header = "apiVersion: kubectl.config.k8s.io/v1beta1\nkind: Preference\n";
    for (String body :
        Arrays.asList(
            // allowlist missing (e.g. misspelled)
            "credentialPluginPolicy: Allowlist\ncredentialPluginAlowlist:\n  - command: foo\n",
            // allowlist empty
            "credentialPluginPolicy: Allowlist\ncredentialPluginAllowlist: []\n",
            // empty entry
            "credentialPluginPolicy: Allowlist\ncredentialPluginAllowlist:\n  - command: \"\"\n",
            "credentialPluginPolicy: Allowlist\ncredentialPluginAllowlist:\n  - {}\n",
            // both name and command
            "credentialPluginPolicy: Allowlist\ncredentialPluginAllowlist:\n  - name: a\n    command: a\n",
            // allowlist with non-Allowlist policy
            "credentialPluginPolicy: DenyAll\ncredentialPluginAllowlist:\n  - command: foo\n",
            "credentialPluginAllowlist:\n  - command: foo\n",
            // unknown policy
            "credentialPluginPolicy: allowall\n")) {
      assertThatThrownBy(() -> ExecCredentialPluginPolicy.fromKubeRc(new StringReader(header + body)))
          .as(body)
          .isInstanceOf(IllegalArgumentException.class);
    }
    assertThatThrownBy(
            () ->
                ExecCredentialPluginPolicy.fromKubeRc(
                    new StringReader("apiVersion: v1\nkind: Config\n")))
        .isInstanceOf(IllegalArgumentException.class);
  }

  @Test
  void defaultKubeRcLocation(@TempDir Path home) throws IOException {
    // missing kuberc
    assertThat(ExecCredentialPluginPolicy.fromDefaultKubeRc(null, null, home.toFile()))
        .isSameAs(ExecCredentialPluginPolicy.ALLOW_ALL);

    Path kuberc = Files.createDirectories(home.resolve(".kube")).resolve("kuberc");
    Files.writeString(
        kuberc,
        "apiVersion: kubectl.config.k8s.io/v1beta1\nkind: Preference\ncredentialPluginPolicy: DenyAll\n");
    assertThat(ExecCredentialPluginPolicy.fromDefaultKubeRc(null, null, home.toFile()))
        .isSameAs(ExecCredentialPluginPolicy.DENY_ALL);
    // disabled
    assertThat(ExecCredentialPluginPolicy.fromDefaultKubeRc(null, "off", home.toFile()))
        .isSameAs(ExecCredentialPluginPolicy.ALLOW_ALL);
    assertThat(ExecCredentialPluginPolicy.fromDefaultKubeRc("false", null, home.toFile()))
        .isSameAs(ExecCredentialPluginPolicy.ALLOW_ALL);

    // explicit $KUBERC
    Path explicit = home.resolve("explicit");
    Files.writeString(
        explicit,
        "apiVersion: kubectl.config.k8s.io/v1beta1\nkind: Preference\n"
            + "credentialPluginPolicy: Allowlist\ncredentialPluginAllowlist:\n  - command: foo\n");
    assertThat(
            ExecCredentialPluginPolicy.fromDefaultKubeRc(null, explicit.toString(), home.toFile())
                .getAllowlist())
        .isEqualTo(Collections.singletonList("foo"));
    assertThatThrownBy(
            () ->
                ExecCredentialPluginPolicy.fromDefaultKubeRc(
                    null, home.resolve("missing").toString(), home.toFile()))
        .isInstanceOf(IOException.class);

    // unparseable default kuberc is ignored, like kubectl
    Files.writeString(kuberc, "{{{ not yaml");
    assertThat(ExecCredentialPluginPolicy.fromDefaultKubeRc(null, null, home.toFile()))
        .isSameAs(ExecCredentialPluginPolicy.ALLOW_ALL);
    // but an invalid policy is an error
    Files.writeString(
        kuberc,
        "apiVersion: kubectl.config.k8s.io/v1beta1\nkind: Preference\ncredentialPluginPolicy: Allowlist\n");
    assertThatThrownBy(() -> ExecCredentialPluginPolicy.fromDefaultKubeRc(null, null, home.toFile()))
        .isInstanceOf(IllegalArgumentException.class);
  }

  private static final String KUBECONFIG_EXEC_SCRIPT =
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
          + "touch \"$(dirname \"$0\")/started\"\n"
          + "echo '{\"apiVersion\": \"client.authentication.k8s.io/v1beta1\", \"kind\": \"ExecCredential\", \"status\": {\"token\": \"abc123\"}}'\n";

  private static KubeConfig loadScriptConfig(Path tempDir) throws IOException {
    Path config = tempDir.resolve(".kubeconfig");
    Files.writeString(config, KUBECONFIG_EXEC_SCRIPT);
    Path script = Files.createDirectories(tempDir.resolve("bin")).resolve("authenticate");
    Files.writeString(script, AUTH_SCRIPT);
    script.toFile().setExecutable(true);
    try (FileReader reader = new FileReader(config.toFile())) {
      KubeConfig kc = KubeConfig.loadKubeConfig(reader);
      kc.setFile(config.toFile());
      return kc;
    }
  }

  @Test
  void kubeConfigDeniedPluginNeverStarts(@TempDir Path tempDir) throws IOException {
    if (isWindows()) {
      return;
    }
    KubeConfig kc = loadScriptConfig(tempDir);
    kc.setExecCredentialPluginPolicy(ExecCredentialPluginPolicy.DENY_ALL);
    assertThatThrownBy(kc::getCredentials).isInstanceOf(ExecCredentialPluginDeniedException.class);

    kc.setExecCredentialPluginPolicy(ExecCredentialPluginPolicy.allowlist("another-plugin"));
    assertThatThrownBy(kc::getCredentials).isInstanceOf(ExecCredentialPluginDeniedException.class);
    assertThat(tempDir.resolve("bin").resolve("started")).doesNotExist();
  }

  @Test
  void kubeConfigAllowedPluginRuns(@TempDir Path tempDir) throws IOException {
    if (isWindows()) {
      return;
    }
    KubeConfig kc = loadScriptConfig(tempDir);
    String script = tempDir.resolve("bin").resolve("authenticate").toString();
    kc.setExecCredentialPluginPolicy(ExecCredentialPluginPolicy.allowlist(script));
    assertThat(kc.getCredentials()).containsEntry(KubeConfig.CRED_TOKEN_KEY, "abc123");
    assertThat(tempDir.resolve("bin").resolve("started")).exists();

    kc.setExecCredentialPluginPolicy(null);
    assertThat(kc.getExecCredentialPluginPolicy()).isSameAs(ExecCredentialPluginPolicy.ALLOW_ALL);
    assertThat(kc.getCredentials()).containsEntry(KubeConfig.CRED_TOKEN_KEY, "abc123");
  }

  @Test
  void denyAllDoesNotAffectNonExecCredentials() {
    KubeConfig kc = KubeConfig.loadKubeConfig(new StringReader(KubeConfigTest.KUBECONFIG_TOKEN));
    kc.setExecCredentialPluginPolicy(ExecCredentialPluginPolicy.DENY_ALL);
    assertThat(kc.getCredentials()).containsEntry(KubeConfig.CRED_TOKEN_KEY, "foobaz");
  }
}
