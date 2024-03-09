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
package io.kubernetes.client.informer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1ListMeta;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1NamespaceList;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import io.kubernetes.client.util.generic.options.ListOptions;
import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SharedInformerFactoryTest {

  @Mock private CoreV1Api coreV1Api;

  @Mock private GenericKubernetesApi<V1Pod, V1PodList> genericKubernetesApi;

  @Test
  void shutdownInformerFactoryInstantlyAfterStarting() throws ApiException {
    SharedInformerFactory factory = new SharedInformerFactory();
    SharedInformer<V1Namespace> nsInformer =
        factory.sharedIndexInformerFor(
            (CallGeneratorParams params) -> {
              return coreV1Api.listNamespace()
                      .resourceVersion(params.resourceVersion)
                      .timeoutSeconds(params.timeoutSeconds)
                      .watch(params.watch)
                      .buildCall(null);
            },
            V1Namespace.class,
            V1NamespaceList.class);

    assertThat(nsInformer).isNotNull();

    factory.startAllRegisteredInformers();
    factory.stopAllRegisteredInformers();
  }

  @Test
  void clusterScopedNewInformerUsingGenericApi() {
    SharedInformerFactory factory = new SharedInformerFactory();
    SharedInformer<V1Pod> podInformer =
        factory.sharedIndexInformerFor(genericKubernetesApi, V1Pod.class, 0);
    assertThat(podInformer).isNotNull();

    when(genericKubernetesApi.list(any(ListOptions.class)))
        .thenReturn(
            new KubernetesApiResponse<V1PodList>(
                new V1PodList().metadata(new V1ListMeta().resourceVersion("0"))));
    factory.startAllRegisteredInformers();
    await().timeout(Duration.ofSeconds(2)).until(podInformer::hasSynced);
    verify(genericKubernetesApi, atLeastOnce()).list(any(ListOptions.class));
  }

  @Test
  void namespaceScopedNewInformerUsingGenericApi() {
    SharedInformerFactory factory = new SharedInformerFactory();
    SharedInformer<V1Pod> podInformer =
        factory.sharedIndexInformerFor(genericKubernetesApi, V1Pod.class, 0, "default");
    assertThat(podInformer).isNotNull();

    when(genericKubernetesApi.list(eq("default"), any(ListOptions.class)))
        .thenReturn(
            new KubernetesApiResponse<V1PodList>(
                new V1PodList().metadata(new V1ListMeta().resourceVersion("0"))));
    factory.startAllRegisteredInformers();
    await().timeout(Duration.ofSeconds(2)).until(podInformer::hasSynced);
    verify(genericKubernetesApi, atLeastOnce()).list(eq("default"), any(ListOptions.class));
  }
}
