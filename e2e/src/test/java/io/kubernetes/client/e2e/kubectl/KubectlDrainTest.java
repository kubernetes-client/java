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

import static org.assertj.core.api.Assertions.assertThat;

import io.kubernetes.client.extended.kubectl.Kubectl;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.models.V1Container;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodSpec;
import io.kubernetes.client.util.ClientBuilder;
import java.util.List;
import org.junit.jupiter.api.Test;

class KubectlDrainTest {
  @Test
  void podInvisibleAfterDrain() throws Exception {
    Configuration.setDefaultApiClient(ClientBuilder.defaultClient());

    V1Node testNode = new V1Node().metadata(new V1ObjectMeta().name("foo"));
    V1Pod testPod =
        new V1Pod()
            .metadata(new V1ObjectMeta().namespace("default").name("bar"))
            .spec(
                new V1PodSpec()
                    .nodeName(testNode.getMetadata().getName())
                    .containers(List.of(new V1Container().name("c1").image("nginx"))));

    V1Node createdNode = Kubectl.create(V1Node.class).resource(testNode).execute();
    assertThat(createdNode).isNotNull();

    // These tests were commented out in 06a989d0
    //// We should be able to create a pod on the node
    //V1Pod createdPod = Kubectl.create(V1Pod.class).resource(testPod).execute();
    //assertThat(createdPod).isNotNull();
    //
    //// We should be able to read back the pod
    //Kubectl.get(V1Pod.class).namespace("default").name(podName).execute();

    // Drain the node
    V1Node drainedNode =
        Kubectl.drain().gracePeriod(0).name(testNode.getMetadata().getName()).execute();
    assertThat(drainedNode).isNotNull();

    // We shouldn't be able to get the pod on a drained node
    try {
      Kubectl.get(V1Pod.class).namespace("default").name(testPod.getMetadata().getName()).execute();
    } catch (KubectlException e) {
      assertThat(e.getCause().getClass()).isEqualTo(ApiException.class);
    }

    // Cleanup
    Kubectl.delete(V1Node.class).name(testNode.getMetadata().getName()).execute();
  }
}
