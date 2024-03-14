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

import io.kubernetes.client.openapi.ApiClient;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.io.TempDir;
import uk.org.webcompere.systemstubs.environment.EnvironmentVariables;
import uk.org.webcompere.systemstubs.jupiter.SystemStub;
import uk.org.webcompere.systemstubs.jupiter.SystemStubsExtension;

/** Tests for the Config helper class */
@ExtendWith(SystemStubsExtension.class)
class ConfigTest {
  @TempDir
  private Path tempDir;

  @SystemStub
  private final EnvironmentVariables variables = new EnvironmentVariables();

  @Test
  void defaultClientNothingPresent() throws Exception {
    String path =
        variables.set("HOME", "/non-existent")
            .set("HOMEDRIVE", null)
            .set("USERPROFILE", null)
            .execute(
                () -> {
                  ApiClient client = Config.defaultClient();
                  return client.getBasePath();
                });
    assertThat(path).isEqualTo("http://localhost:8080");
  }

  public static String HOME_CONFIG =
      "apiVersion: v1\n"
          + "clusters:\n"
          + "- cluster:\n"
          + "    server: http://home.dir.com\n"
          + "  name: foo\n"
          + "contexts:\n"
          + "- context:\n"
          + "    cluster: foo\n"
          + "  name: foo-context\n"
          + "current-context: foo-context\n";

  public static String KUBECONFIG =
      "apiVersion: v1\n"
          + "clusters:\n"
          + "- cluster:\n"
          + "    server: http://kubeconfig.dir.com\n"
          + "  name: foo\n"
          + "contexts:\n"
          + "- context:\n"
          + "    cluster: foo\n"
          + "  name: foo-context\n"
          + "current-context: foo-context\n";

  Path config;
  Path kubedir;
  Path configFile;

  @BeforeEach
  void setUp() throws IOException {
    kubedir = Files.createDirectory(tempDir.resolve(".kube"));
    config = Files.createFile(kubedir.resolve("config"));
    Files.writeString(config, HOME_CONFIG);

    configFile = Files.createTempFile(tempDir, "config", null);
    Files.writeString(configFile, KUBECONFIG);
  }

  @Test
  void defaultClientHomeDir() throws Exception {
    String path =
        variables.set("HOME", tempDir.toString())
            .execute(
                () -> {
                  ApiClient client = Config.defaultClient();
                  return client.getBasePath();
                });
    assertThat(path).isEqualTo("http://home.dir.com");
  }

  @Test
  void defaultClientKubeConfig() throws Exception {
    String path =
        variables.set("KUBECONFIG", configFile.toString())
            .execute(
                () -> {
                  ApiClient client = Config.defaultClient();
                  return client.getBasePath();
                });
    assertThat(path).isEqualTo("http://kubeconfig.dir.com");
  }

  @Test
  void defaultClientPrecedence() throws Exception {
    String path =
        variables.set("HOME", tempDir.toString())
            .set("KUBECONFIG", configFile.toString())
            .execute(
                () -> {
                  ApiClient client = Config.defaultClient();
                  return client.getBasePath();
                });

    // $KUBECONFIG should take precedence over $HOME/.kube/config
    assertThat(path).isEqualTo("http://kubeconfig.dir.com");
  }
}
