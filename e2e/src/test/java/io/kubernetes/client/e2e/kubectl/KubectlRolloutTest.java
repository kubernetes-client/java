/*
Copyright 2024 The Kubernetes Authors.
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
package io.kubernetes.client.e2e.kubectl;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.kubectl.Kubectl;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.models.V1DaemonSet;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import io.kubernetes.client.openapi.models.V1StatefulSet;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.Yaml;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KubectlRolloutTest {
  @BeforeEach
  void setup() throws Exception {
    Configuration.setDefaultApiClient(ClientBuilder.defaultClient());
  }

  @Test
  void rolloutDaemonSet() throws Exception {
    testRollout(V1DaemonSet.class, "/test-daemonset.yaml", "/test-daemonset-updated.yaml");
  }

  @Test
  void rolloutDeployment() throws Exception {
    testRollout(V1Deployment.class, "/test-deployment.yaml", "/test-deployment-updated.yaml");
  }

  @Test
  void rolloutStatefulSet() throws Exception {
    testRollout(V1StatefulSet.class, "/test-statefulset.yaml", "/test-statefulset-updated.yaml");
  }

  <ApiType extends KubernetesObject> void testRollout(
      Class<ApiType> apiType, String initialYaml, String twoContainerYaml) throws Exception {
    // Create the resource
    ApiType created =
        Kubectl.create(apiType)
            .resource((ApiType) Yaml.load(resourceToString(initialYaml)))
            .execute();
    assertThat(created).isNotNull();

    // Wait until it is visible
    await()
        .untilAsserted(
            () ->
                assertThat(
                        Kubectl.rollout(apiType)
                            .history()
                            .namespace(created.getMetadata().getNamespace())
                            .name(created.getMetadata().getName())
                            .execute())
                    .hasSize(1));

    // Replace with two containers
    ApiType updated =
        Kubectl.replace(apiType)
            .resource((ApiType) Yaml.load(resourceToString(twoContainerYaml)))
            .execute();
    assertThat(updated).isNotNull();

    // Wait until the change is visible
    await()
        .untilAsserted(
            () ->
                assertThat(
                        Kubectl.rollout(apiType)
                            .history()
                            .namespace(updated.getMetadata().getNamespace())
                            .name(updated.getMetadata().getName())
                            .execute())
                    .hasSize(2));

    // Read back version 2 to see if it is consistent (with two containers)
    V1PodTemplateSpec updatedFromApi =
        Kubectl.rollout(apiType)
            .history()
            .revision(2)
            .namespace(updated.getMetadata().getNamespace())
            .name(updated.getMetadata().getName())
            .execute();
    assertThat(updatedFromApi.getSpec().getContainers()).hasSize(2);

    // Clean up the resource
    Kubectl.delete(apiType)
        .namespace(updated.getMetadata().getNamespace())
        .name(updated.getMetadata().getName())
        .execute();
  }

  String resourceToString(String resource) throws IOException {
    try (Reader reader = new InputStreamReader(getClass().getResourceAsStream(resource), UTF_8)) {
      char[] buf = new char[2048];
      StringBuilder builder = new StringBuilder();
      int read;
      while ((read = reader.read(buf)) != -1) {
        builder.append(buf, 0, read);
      }
      return builder.toString();
    }
  }
}
