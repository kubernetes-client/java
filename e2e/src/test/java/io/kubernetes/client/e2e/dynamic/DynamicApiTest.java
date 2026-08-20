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
import io.kubernetes.client.util.Watch;
import io.kubernetes.client.util.Watchable;
import io.kubernetes.client.util.generic.dynamic.DynamicKubernetesApi;
import io.kubernetes.client.util.generic.dynamic.DynamicKubernetesObject;
import io.kubernetes.client.util.generic.dynamic.Dynamics;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

class DynamicApiTest {

  private static final long WATCH_TIMEOUT_MS = 30_000;

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
  void dynamicApiWatchPreservesRawData() throws Exception {
    ApiClient client = ClientBuilder.defaultClient();
    DynamicKubernetesApi dynamicApi =
        new DynamicKubernetesApi("", "v1", "namespaces", client);

    BlockingQueue<Watch.Response<DynamicKubernetesObject>> events =
        new ArrayBlockingQueue<>(10);

    try (Watchable<DynamicKubernetesObject> watch = dynamicApi.watch()) {
      // Collect watch events in a background thread
      Thread watchThread =
          new Thread(
              () -> {
                try {
                  while (watch.hasNext()) {
                    events.offer(watch.next());
                  }
                } catch (RuntimeException e) {
                  // watch closed
                }
              });
      watchThread.setDaemon(true);
      watchThread.start();

      // Create a namespace to trigger an ADDED event
      V1Namespace ns = new V1Namespace().metadata(new V1ObjectMeta().name("e2e-dynamic-watch"));
      dynamicApi.create(Dynamics.newFromJson(JSON.serialize(ns))).throwsApiException();

      try {
        // Wait for an ADDED event for the created namespace
        Watch.Response<DynamicKubernetesObject> addedEvent = null;
        long deadline = System.currentTimeMillis() + WATCH_TIMEOUT_MS;
        while (System.currentTimeMillis() < deadline) {
          Watch.Response<DynamicKubernetesObject> event =
              events.poll(5, TimeUnit.SECONDS);
          if (event != null
              && "ADDED".equals(event.type)
              && event.object != null
              && event.object.getMetadata() != null
              && "e2e-dynamic-watch".equals(event.object.getMetadata().getName())) {
            addedEvent = event;
            break;
          }
        }

        assertThat(addedEvent).isNotNull();
        assertThat(addedEvent.object).isNotNull();
        // Verify that the raw JSON data is preserved in the DynamicKubernetesObject
        assertThat(addedEvent.object.getRaw()).isNotNull();
        assertThat(addedEvent.object.getRaw().has("metadata")).isTrue();
        assertThat(addedEvent.object.getRaw().has("kind")).isTrue();
        assertThat(addedEvent.object.getMetadata()).isNotNull();
        assertThat(addedEvent.object.getMetadata().getName()).isEqualTo("e2e-dynamic-watch");
      } finally {
        dynamicApi.delete("e2e-dynamic-watch").throwsApiException();
      }
    }
  }
}
