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

import io.kubernetes.client.extended.kubectl.Kubectl;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.ClientBuilder;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KubectlNamespaceTest {

  @Test
  void createApplyDelete() throws Exception {
    ApiClient client = ClientBuilder.standard().build();

    // Create a namespace
    V1Namespace namespace =
        Kubectl.create(V1Namespace.class)
            .apiClient(client)
            .resource(new V1Namespace().apiVersion("v1").metadata(new V1ObjectMeta().name("foo")))
            .execute();
    assertThat(namespace).isNotNull();

    // Add annotations to it
    namespace =
        Kubectl.apply(V1Namespace.class)
            .apiClient(client)
            .resource(
                new V1Namespace()
                    .apiVersion("v1")
                    .kind("Namespace")
                    .metadata(new V1ObjectMeta().name("foo").putAnnotationsItem("k", "v")))
            .execute();
    assertThat(namespace).isNotNull();

    // Verify we can see the annotations on when reading the namespace
    namespace = Kubectl.get(V1Namespace.class).apiClient(client).name("foo").execute();
    assertThat(namespace.getMetadata().getAnnotations()).containsEntry("k", "v");

    // Now, replace the value of an existing annotation key
    namespace =
        Kubectl.replace(V1Namespace.class)
            .apiClient(client)
            .resource(
                new V1Namespace()
                    .apiVersion("v1")
                    .kind("Namespace")
                    .metadata(new V1ObjectMeta().name("foo").putAnnotationsItem("k", "v2")))
            .execute();
    assertThat(namespace).isNotNull();

    // Verify we can see the new annotation value
    namespace = Kubectl.get(V1Namespace.class).apiClient(client).name("foo").execute();
    assertThat(namespace.getMetadata().getAnnotations()).containsEntry("k", "v2");

    // Finally, cleanup the namespace
    namespace = Kubectl.delete(V1Namespace.class).apiClient(client).name("foo").execute();
    assertThat(namespace).isNotNull();
  }
}
