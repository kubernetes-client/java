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
package io.kubernetes.client.e2e.dynamic;

import static org.assertj.core.api.Assertions.assertThat;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import io.kubernetes.client.util.generic.options.ListOptions;
import io.kubernetes.client.util.generic.dynamic.DynamicKubernetesApi;
import io.kubernetes.client.util.generic.dynamic.DynamicKubernetesListObject;
import io.kubernetes.client.util.generic.dynamic.DynamicKubernetesObject;
import io.kubernetes.client.util.generic.dynamic.Dynamics;
import org.junit.jupiter.api.Test;

class DynamicApiTest {

  @Test
  void dynamicApiCreateAndDeleteNamespace() throws Exception {
    ApiClient client = ClientBuilder.defaultClient();
    DynamicKubernetesApi dynamicApi =
        new DynamicKubernetesApi("", "v1", "namespaces", client);
    V1Namespace namespaceFoo = new V1Namespace().metadata(new V1ObjectMeta().name("e2e-dynamic"));

    DynamicKubernetesObject createdNamespace =
        dynamicApi.create(Dynamics.newFromJson(JSON.serialize(namespaceFoo))).getObject();
    assertThat(createdNamespace).isNotNull();

    DynamicKubernetesObject deleted =
        dynamicApi.delete("e2e-dynamic").throwsApiException().getObject();
    assertThat(deleted).isNotNull();
  }

  @Test
  void dynamicApiListWithResourceVersionMatchAndWatchBookmarks() throws Exception {
    ApiClient client = ClientBuilder.defaultClient();
    DynamicKubernetesApi dynamicApi =
        new DynamicKubernetesApi("", "v1", "namespaces", client);
    String namespaceName = "e2e-dynamic-list-options";
    V1Namespace namespace = new V1Namespace().metadata(new V1ObjectMeta().name(namespaceName));

    DynamicKubernetesObject createdNamespace =
        dynamicApi.create(Dynamics.newFromJson(JSON.serialize(namespace))).getObject();
    assertThat(createdNamespace).isNotNull();

    try {
      KubernetesApiResponse<DynamicKubernetesListObject> listResponse =
          dynamicApi.list(
              ListOptions.builder()
                  .fieldSelector("metadata.name=" + namespaceName)
                  .resourceVersion(createdNamespace.getMetadata().getResourceVersion())
                  .resourceVersionMatch("NotOlderThan")
                  .allowWatchBookmarks(true)
                  .build());

      assertThat(listResponse.isSuccess()).isTrue();
      assertThat(listResponse.getObject()).isNotNull();
      assertThat(listResponse.getObject().getItems())
          .anySatisfy(item -> assertThat(item.getMetadata().getName()).isEqualTo(namespaceName));
    } finally {
      dynamicApi.delete(namespaceName).throwsApiException();
    }
  }
}
