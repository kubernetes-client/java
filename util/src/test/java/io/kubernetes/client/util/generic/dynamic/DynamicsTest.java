/*
Copyright 2021 The Kubernetes Authors.
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
package io.kubernetes.client.util.generic.dynamic;

import static org.assertj.core.api.Assertions.assertThat;

import com.google.gson.JsonObject;
import io.kubernetes.client.Resources;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.util.Yaml;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class DynamicsTest {

  private static final String TEST_POD_YAML_FILE =
      new File(Resources.getResource("test-pod.yaml").getPath()).toString();

  private static final String TEST_POD_JSON_FILE =
      new File(Resources.getResource("test-pod.json").getPath()).toString();

  private JSON json = new JSON();

  @Test
  void yamlToJson() throws IOException {
    String podYamlContent = new String(Files.readAllBytes(Paths.get(TEST_POD_YAML_FILE)));
    String podJsonContent = new String(Files.readAllBytes(Paths.get(TEST_POD_JSON_FILE)));
    String convertedJsonContent = Dynamics.fromYamlToJson(podYamlContent);

    assertThat(json.getGson().fromJson(convertedJsonContent, JsonObject.class))
        .isEqualTo(json.getGson().fromJson(podJsonContent, JsonObject.class));
  }

  @Test
  void jsonToYaml() throws IOException {
    String podYamlContent = new String(Files.readAllBytes(Paths.get(TEST_POD_YAML_FILE)));
    String podJsonContent = new String(Files.readAllBytes(Paths.get(TEST_POD_JSON_FILE)));
    String convertedYamlContent = Dynamics.fromJsonToYaml(podJsonContent);

    assertThat(Yaml.load(convertedYamlContent)).isEqualTo(Yaml.load(podYamlContent));
  }

  @Test
  void loadingJsonToDynamicObj() throws IOException {
    String podJsonContent = new String(Files.readAllBytes(Paths.get(TEST_POD_JSON_FILE)));
    DynamicKubernetesObject obj = Dynamics.newFromJson(podJsonContent);

    assertThat("v1").isEqualTo(obj.getApiVersion());
    assertThat("Pod").isEqualTo(obj.getKind());
  }

  @Test
  void loadingYamlToDynamicObj() throws IOException {
    String podYamlContent = new String(Files.readAllBytes(Paths.get(TEST_POD_YAML_FILE)));
    DynamicKubernetesObject obj = Dynamics.newFromYaml(podYamlContent);

    assertThat("v1").isEqualTo(obj.getApiVersion());
    assertThat("Pod").isEqualTo(obj.getKind());
  }
}
