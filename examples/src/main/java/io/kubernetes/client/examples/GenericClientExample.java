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
package io.kubernetes.client.examples;

import com.google.common.annotations.Beta;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.extended.generic.GenericKubernetesApi;
import io.kubernetes.client.extended.generic.KubernetesApiResponse;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1Container;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.openapi.models.V1PodSpec;
import io.kubernetes.client.util.ClientBuilder;
import java.util.Arrays;

@Beta
public class GenericClientExample {

  public static void main(String[] args) throws Exception {

    // The following codes demonstrates using generic client to manipulate pods
    V1Pod pod =
        new V1Pod()
            .metadata(new V1ObjectMeta().name("foo").namespace("default"))
            .spec(
                new V1PodSpec()
                    .containers(Arrays.asList(new V1Container().name("c").image("test"))));
    ApiClient apiClient = ClientBuilder.standard().build();
    GenericKubernetesApi<V1Pod, V1PodList> podClient =
        new GenericKubernetesApi<>(V1Pod.class, V1PodList.class, "", "v1", "pods", apiClient);

    KubernetesApiResponse<V1Pod> createResponse = podClient.create(pod);
    if (!createResponse.isSuccess()) {
      throw new RuntimeException(createResponse.getStatus().toString());
    }
    System.out.println("Created!");

    KubernetesApiResponse<V1Pod> patchResponse =
        podClient.patch(
            "default",
            "foo",
            V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH,
            new V1Patch("{\"metadata\":{\"finalizers\":[\"example.io/foo\"]}}"));
    if (!patchResponse.isSuccess()) {
      throw new RuntimeException(patchResponse.getStatus().toString());
    }
    System.out.println("Patched!");

    KubernetesApiResponse<V1Pod> deleteResponse = podClient.delete("default", "foo");
    if (!deleteResponse.isSuccess()) {
      throw new RuntimeException(deleteResponse.getStatus().toString());
    }
    if (deleteResponse.getObject() != null) {
      System.out.println(
          "Received after-deletion status of the requested object, will be deleting in background!");
    }
    System.out.println("Deleted!");
  }
}
