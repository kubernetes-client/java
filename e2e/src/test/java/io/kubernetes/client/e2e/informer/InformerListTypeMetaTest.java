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

import io.kubernetes.client.informer.ResourceEventHandler;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1NamespaceList;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * E2E test verifying that initial list items delivered via the informer's onAdd callback contain
 * the expected kind and apiVersion fields (not null), consistent with watch events.
 */
class InformerListTypeMetaTest {

  @Test
  void initialListItemsShouldHaveKindAndApiVersionPopulated() throws Exception {
    ApiClient client = ClientBuilder.defaultClient();
    SharedInformerFactory informerFactory = new SharedInformerFactory(client);

    GenericKubernetesApi<V1Namespace, V1NamespaceList> api =
        new GenericKubernetesApi<>(
            V1Namespace.class,
            V1NamespaceList.class,
            "",
            "v1",
            "namespaces",
            client);

    SharedIndexInformer<V1Namespace> nsInformer =
        informerFactory.sharedIndexInformerFor(api, V1Namespace.class, 0);
    Lister<V1Namespace> nsLister = new Lister<>(nsInformer.getIndexer());

    // Collect items received via onAdd during the initial list phase
    List<V1Namespace> addedItems = new ArrayList<>();
    nsInformer.addEventHandler(
        new ResourceEventHandler<V1Namespace>() {
          @Override
          public void onAdd(V1Namespace obj) {
            addedItems.add(obj);
          }

          @Override
          public void onUpdate(V1Namespace oldObj, V1Namespace newObj) {}

          @Override
          public void onDelete(V1Namespace obj, boolean deletedFinalStateUnknown) {}
        });

    try {
      informerFactory.startAllRegisteredInformers();

      await()
          .atMost(Duration.ofSeconds(30))
          .untilAsserted(
              () -> {
                assertThat(nsInformer.hasSynced()).isTrue();
                assertThat(nsLister.list()).isNotEmpty();
              });

      // All items received via onAdd during the initial list must have kind and apiVersion set
      assertThat(addedItems).isNotEmpty();
      for (V1Namespace ns : addedItems) {
        assertThat(ns.getKind())
            .as("kind should be populated for namespace %s", ns.getMetadata().getName())
            .isEqualTo("Namespace");
        assertThat(ns.getApiVersion())
            .as("apiVersion should be populated for namespace %s", ns.getMetadata().getName())
            .isEqualTo("v1");
      }
    } finally {
      informerFactory.stopAllRegisteredInformers(true);
    }
  }
}
