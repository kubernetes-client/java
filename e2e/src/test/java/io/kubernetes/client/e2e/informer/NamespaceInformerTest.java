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
import io.kubernetes.client.informer.ResourceEventHandler;
import io.kubernetes.client.informer.ListerWatcher;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1NamespaceList;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.Watchable;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.options.ListOptions;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
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
  void listWatchingNamespacesWithPredicateHandler() throws Exception {
    ApiClient client = ClientBuilder.defaultClient();
    CoreV1Api coreV1Api = new CoreV1Api(client);
    SharedInformerFactory informerFactory = new SharedInformerFactory(client);
    String selectedNamespace = "e2e-filtered-selected";
    String ignoredNamespace = "e2e-filtered-ignored";

    coreV1Api.createNamespace(new V1Namespace().metadata(new V1ObjectMeta().name(selectedNamespace))).execute();
    coreV1Api.createNamespace(new V1Namespace().metadata(new V1ObjectMeta().name(ignoredNamespace))).execute();

    GenericKubernetesApi<V1Namespace, V1NamespaceList> api =
        new GenericKubernetesApi<>(V1Namespace.class, V1NamespaceList.class, "", "v1", "namespaces", client);

    SharedIndexInformer<V1Namespace> nsInformer =
        informerFactory.sharedIndexInformerFor(api, V1Namespace.class, 0);
    CountDownLatch selectedSeen = new CountDownLatch(1);
    AtomicBoolean ignoredSeen = new AtomicBoolean(false);
    AtomicBoolean selectedSeenByHandler = new AtomicBoolean(false);
    try {
      nsInformer.addEventHandler(
          new ResourceEventHandler<V1Namespace>() {
            @Override
            public void onAdd(V1Namespace obj) {
              String name = obj.getMetadata().getName();
              if (selectedNamespace.equals(name)) {
                selectedSeenByHandler.set(true);
                selectedSeen.countDown();
              }
              if (ignoredNamespace.equals(name)) {
                ignoredSeen.set(true);
              }
            }

            @Override
            public void onUpdate(V1Namespace oldObj, V1Namespace newObj) {}

            @Override
            public void onDelete(V1Namespace obj, boolean deletedFinalStateUnknown) {}
          },
          ns -> selectedNamespace.equals(ns.getMetadata().getName()));

      informerFactory.startAllRegisteredInformers();

      await().untilAsserted(() -> assertThat(nsInformer.hasSynced()).isTrue());
      assertThat(selectedSeen.await(30, TimeUnit.SECONDS)).isTrue();
      assertThat(selectedSeenByHandler.get()).isTrue();
      assertThat(ignoredSeen.get()).isFalse();
    } finally {
      informerFactory.stopAllRegisteredInformers(true);
      coreV1Api.deleteNamespace(selectedNamespace).execute();
      coreV1Api.deleteNamespace(ignoredNamespace).execute();
    }
  }

  @Test
  void listWatchingNamespacesRecoversFromInitialConnectExceptions() throws Exception {
    ApiClient client = ClientBuilder.defaultClient();
    CoreV1Api coreV1Api = new CoreV1Api(client);
    SharedInformerFactory informerFactory = new SharedInformerFactory(client);
    String namespaceName = "e2e-informer-retry";
    AtomicInteger watchAttempts = new AtomicInteger(0);
    GenericKubernetesApi<V1Namespace, V1NamespaceList> api =
        new GenericKubernetesApi<>(V1Namespace.class, V1NamespaceList.class, "", "v1", "namespaces", client);

    ListerWatcher<V1Namespace, V1NamespaceList> flakyWatcher =
        new ListerWatcher<V1Namespace, V1NamespaceList>() {
          @Override
          public V1NamespaceList list(CallGeneratorParams params) {
            return api
                .list(
                    new ListOptions()
                        .resourceVersion(params.resourceVersion)
                        .timeoutSeconds(params.timeoutSeconds))
                .getObject();
          }

          @Override
          public Watchable<V1Namespace> watch(CallGeneratorParams params) throws ApiException {
            if (watchAttempts.incrementAndGet() <= 2) {
              throw new RuntimeException(new java.net.ConnectException("simulated transient failure"));
            }
            return api.watch(
                new ListOptions()
                    .resourceVersion(params.resourceVersion)
                    .timeoutSeconds(params.timeoutSeconds));
          }
        };

    SharedIndexInformer<V1Namespace> nsInformer =
        informerFactory.sharedIndexInformerFor(flakyWatcher, V1Namespace.class, 0);
    CountDownLatch selectedSeen = new CountDownLatch(1);
    try {
      nsInformer.addEventHandler(
          new ResourceEventHandler<V1Namespace>() {
            @Override
            public void onAdd(V1Namespace obj) {
              if (namespaceName.equals(obj.getMetadata().getName())) {
                selectedSeen.countDown();
              }
            }

            @Override
            public void onUpdate(V1Namespace oldObj, V1Namespace newObj) {}

            @Override
            public void onDelete(V1Namespace obj, boolean deletedFinalStateUnknown) {}
          });

      informerFactory.startAllRegisteredInformers();
      await().untilAsserted(() -> assertThat(nsInformer.hasSynced()).isTrue());
      coreV1Api.createNamespace(new V1Namespace().metadata(new V1ObjectMeta().name(namespaceName))).execute();
      assertThat(selectedSeen.await(45, TimeUnit.SECONDS)).isTrue();
      assertThat(watchAttempts.get()).isGreaterThanOrEqualTo(3);
    } finally {
      informerFactory.stopAllRegisteredInformers(true);
      coreV1Api.deleteNamespace(namespaceName).execute();
    }
  }
}
