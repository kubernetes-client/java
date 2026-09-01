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
package io.kubernetes.client.e2e.informer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1NamespaceList;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class NamespaceInformerTest {
  @Test
  void listWatchingNamespaces() throws Exception {
    ApiClient client = ClientBuilder.defaultClient();
    SharedInformerFactory informerFactory = new SharedInformerFactory(client);

    GenericKubernetesApi<V1Namespace, V1NamespaceList> api =
        new GenericKubernetesApi<>(
            V1Namespace.class,
            V1NamespaceList.class,
            "",
            "v1",
            "namespaces",
            ClientBuilder.defaultClient());

    SharedIndexInformer<V1Namespace> nsInformer =
        informerFactory.sharedIndexInformerFor(api, V1Namespace.class, 0);
    Lister<V1Namespace> nsLister = new Lister<>(nsInformer.getIndexer());

    try {
      informerFactory.startAllRegisteredInformers();

      await()
          .untilAsserted(
              () -> {
                assertThat(nsInformer.hasSynced()).isTrue();
                assertThat(nsLister.list()).isNotEmpty();
              });
    } finally {
      informerFactory.stopAllRegisteredInformers(true);
    }
  }

  @Test
  void listWatchingNamespacesWithCachePredicate() throws Exception {
    ApiClient client = ClientBuilder.defaultClient();
    CoreV1Api coreV1Api = new CoreV1Api(client);
    SharedInformerFactory informerFactory = new SharedInformerFactory(client);
    String selectedNamespace = "e2e-cache-selected";
    String ignoredNamespace = "e2e-cache-ignored";

    coreV1Api
        .createNamespace(
            new V1Namespace()
                .metadata(
                    new V1ObjectMeta()
                        .name(selectedNamespace)
                        .labels(java.util.Map.of("cache-filter", "keep"))))
        .execute();
    coreV1Api
        .createNamespace(
            new V1Namespace()
                .metadata(
                    new V1ObjectMeta()
                        .name(ignoredNamespace)
                        .labels(java.util.Map.of("cache-filter", "drop"))))
        .execute();

    GenericKubernetesApi<V1Namespace, V1NamespaceList> api =
        new GenericKubernetesApi<>(V1Namespace.class, V1NamespaceList.class, "", "v1", "namespaces", client);
    SharedIndexInformer<V1Namespace> nsInformer =
        informerFactory.sharedIndexInformerFor(
            api,
            V1Namespace.class,
            0,
            ns ->
                ns.getMetadata() != null
                    && ns.getMetadata().getLabels() != null
                    && "keep".equals(ns.getMetadata().getLabels().get("cache-filter")));

    try {
      informerFactory.startAllRegisteredInformers();
      await().untilAsserted(() -> assertThat(nsInformer.hasSynced()).isTrue());
      await()
          .untilAsserted(
              () -> {
                java.util.List<String> cachedNamespaceNames =
                    nsInformer.getIndexer().list().stream()
                        .map(ns -> ns.getMetadata().getName())
                        .collect(Collectors.toList());
                assertThat(cachedNamespaceNames).contains(selectedNamespace);
                assertThat(cachedNamespaceNames).doesNotContain(ignoredNamespace);
              });
    } finally {
      informerFactory.stopAllRegisteredInformers(true);
      coreV1Api.deleteNamespace(selectedNamespace).execute();
      coreV1Api.deleteNamespace(ignoredNamespace).execute();
    }
  }
}
