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

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.Resources;
import io.kubernetes.client.persister.FilePersister;
import org.junit.jupiter.api.io.TempDir;

/** Tests for the FilePersister helper class */
class FilePersisterTest {

  private static final String KUBECONFIG_FILE_PATH = Resources.getResource("kubeconfig").getPath();

  @Test
  void persistence(@TempDir Path tempDir) throws IOException {
    File file = Files.createTempFile(tempDir, "testconfig", null).toFile();

    KubeConfig config;
    try (Reader reader = new FileReader(KUBECONFIG_FILE_PATH)) {
      config = KubeConfig.loadKubeConfig(reader);
    }

    FilePersister fp = new FilePersister(file);
    fp.save(
        config.getContexts(),
        config.getClusters(),
        config.getUsers(),
        config.getPreferences(),
        config.getCurrentContext());

    try (Reader reader = new FileReader(file)) {
      KubeConfig configOut = KubeConfig.loadKubeConfig(reader);
      assertThat(configOut.getCurrentContext()).isEqualTo(config.getCurrentContext());
      assertThat(configOut.getClusters()).isEqualTo(config.getClusters());
      assertThat(configOut.getContexts()).isEqualTo(config.getContexts());
      assertThat(configOut.getUsers()).isEqualTo(config.getUsers());
    }
  }
}
