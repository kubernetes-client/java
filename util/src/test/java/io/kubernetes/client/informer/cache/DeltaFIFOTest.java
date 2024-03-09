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
package io.kubernetes.client.informer.cache;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import org.apache.commons.lang3.tuple.MutablePair;
import org.junit.jupiter.api.Test;

class DeltaFIFOTest {
  @Test
  void deltaFIFOBasic() throws InterruptedException {
    Deque<MutablePair<DeltaFIFO.DeltaType, KubernetesObject>> receivingDeltas = new LinkedList<>();
    V1Pod foo1 = new V1Pod().metadata(new V1ObjectMeta().name("foo1").namespace("default"));
    Cache cache = new Cache();
    DeltaFIFO deltaFIFO = new DeltaFIFO(Caches::deletionHandlingMetaNamespaceKeyFunc, cache);

    MutablePair<DeltaFIFO.DeltaType, KubernetesObject> receivingDelta;
    // basic add operation
    deltaFIFO.add(foo1);
    cache.add(foo1);
    deltaFIFO.pop(
        (deltas) -> {
          MutablePair<DeltaFIFO.DeltaType, KubernetesObject> delta = deltas.peekFirst();
          receivingDeltas.add(delta);
        });
    receivingDelta = receivingDeltas.peekFirst();
    receivingDeltas.removeFirst();
    assertThat(receivingDelta.getRight()).isEqualTo(foo1);
    assertThat(receivingDelta.getLeft()).isEqualTo(DeltaFIFO.DeltaType.Added);

    // basic update operation
    deltaFIFO.update(foo1);
    cache.update(foo1);
    deltaFIFO.pop(
        (deltas) -> {
          MutablePair<DeltaFIFO.DeltaType, KubernetesObject> delta = deltas.peekFirst();
          receivingDeltas.add(delta);
        });
    receivingDelta = receivingDeltas.peekFirst();
    receivingDeltas.removeFirst();
    assertThat(receivingDelta.getRight()).isEqualTo(foo1);
    assertThat(receivingDelta.getLeft()).isEqualTo(DeltaFIFO.DeltaType.Updated);

    // basic delete operation
    deltaFIFO.delete(foo1);
    cache.delete(foo1);
    deltaFIFO.pop(
        (deltas) -> {
          MutablePair<DeltaFIFO.DeltaType, KubernetesObject> delta = deltas.peekFirst();
          receivingDeltas.add(delta);
        });
    receivingDelta = receivingDeltas.peekFirst();
    receivingDeltas.removeFirst();
    assertThat(receivingDelta.getRight()).isEqualTo(foo1);
    assertThat(receivingDelta.getLeft()).isEqualTo(DeltaFIFO.DeltaType.Deleted);

    // basic sync operation
    deltaFIFO.replace(Arrays.asList(foo1), "0");
    cache.replace(Arrays.asList(foo1), "0");
    deltaFIFO.pop(
        (deltas) -> {
          MutablePair<DeltaFIFO.DeltaType, KubernetesObject> delta = deltas.peekFirst();
          receivingDeltas.add(delta);
        });
    receivingDelta = receivingDeltas.peekFirst();
    receivingDeltas.removeFirst();
    assertThat(receivingDelta.getRight()).isEqualTo(foo1);
    assertThat(receivingDelta.getLeft()).isEqualTo(DeltaFIFO.DeltaType.Sync);
  }

  @Test
  void deltaFIFODedup() {
    V1Pod foo1 =
        new V1Pod()
            .metadata(new V1ObjectMeta().name("foo1").namespace("default").resourceVersion("ver"));
    Cache cache = new Cache();
    DeltaFIFO deltaFIFO = new DeltaFIFO(Caches::deletionHandlingMetaNamespaceKeyFunc, cache);
    Deque<MutablePair<DeltaFIFO.DeltaType, KubernetesObject>> deltas;

    // add-delete dedup
    deltaFIFO.add(foo1);
    deltaFIFO.delete(foo1);
    deltas = deltaFIFO.getItems().get(Caches.deletionHandlingMetaNamespaceKeyFunc(foo1));
    assertThat(deltas.peekLast().getLeft()).isEqualTo(DeltaFIFO.DeltaType.Deleted);
    assertThat(deltas.peekLast().getRight()).isEqualTo(foo1);
    assertThat(deltas.peekFirst().getLeft()).isEqualTo(DeltaFIFO.DeltaType.Added);
    assertThat(deltas.peekFirst().getRight()).isEqualTo(foo1);
    assertThat(deltas).hasSize(2);
    deltaFIFO.getItems().remove(Caches.deletionHandlingMetaNamespaceKeyFunc(foo1));

    // add-delete-delete dedup
    deltaFIFO.add(foo1);
    deltaFIFO.delete(foo1);
    deltaFIFO.delete(foo1);
    deltas = deltaFIFO.getItems().get(Caches.deletionHandlingMetaNamespaceKeyFunc(foo1));
    assertThat(deltas.peekLast().getLeft()).isEqualTo(DeltaFIFO.DeltaType.Deleted);
    assertThat(deltas.peekLast().getRight()).isEqualTo(foo1);
    assertThat(deltas.peekFirst().getLeft()).isEqualTo(DeltaFIFO.DeltaType.Added);
    assertThat(deltas.peekFirst().getRight()).isEqualTo(foo1);
    assertThat(deltas).hasSize(2);
    deltaFIFO.getItems().remove(Caches.deletionHandlingMetaNamespaceKeyFunc(foo1));

    // add-sync dedupe
    deltaFIFO.add(foo1);
    deltaFIFO.replace(Collections.singletonList(foo1), foo1.getMetadata().getResourceVersion());
    deltas = deltaFIFO.getItems().get(Caches.deletionHandlingMetaNamespaceKeyFunc(foo1));
    assertThat(deltas).hasSize(1);
  }

  @Test
  void deltaFIFOResync() {
    V1Pod foo1 = new V1Pod().metadata(new V1ObjectMeta().name("foo1").namespace("default"));
    Cache cache = new Cache();
    DeltaFIFO deltaFIFO = new DeltaFIFO(Caches::deletionHandlingMetaNamespaceKeyFunc, cache);

    // sync after add
    cache.add(foo1);
    deltaFIFO.resync();

    Deque<MutablePair<DeltaFIFO.DeltaType, KubernetesObject>> deltas =
        deltaFIFO.getItems().get(Caches.deletionHandlingMetaNamespaceKeyFunc(foo1));

    assertThat(deltas).hasSize(1);
    assertThat(deltas.peekLast().getRight()).isEqualTo(foo1);
    assertThat(deltas.peekLast().getLeft()).isEqualTo(DeltaFIFO.DeltaType.Sync);
  }

  @Test
  void deltaFIFOReplaceWithDeleteDeltaIn() throws InterruptedException {
    V1Pod oldPod = new V1Pod().metadata(new V1ObjectMeta().namespace("default").name("foo1"));
    V1Pod newPod = new V1Pod().metadata(new V1ObjectMeta().namespace("default").name("foo2"));

    Cache mockCache = mock(Cache.class);
    doReturn(oldPod).when(mockCache).getByKey(Caches.deletionHandlingMetaNamespaceKeyFunc(oldPod));
    DeltaFIFO deltaFIFO = new DeltaFIFO(Caches::deletionHandlingMetaNamespaceKeyFunc, mockCache);

    deltaFIFO.delete(oldPod);
    deltaFIFO.replace(Arrays.asList(newPod), "0");

    deltaFIFO.pop(
        (deltas) -> {
          assertThat(deltas.getFirst().getLeft()).isEqualTo(DeltaFIFO.DeltaType.Deleted);
          assertThat(deltas.getFirst().getRight()).isEqualTo(oldPod);
        });

    deltaFIFO.pop(
        (deltas) -> {
          assertThat(deltas.getFirst().getLeft()).isEqualTo(DeltaFIFO.DeltaType.Sync);
          assertThat(deltas.getFirst().getRight()).isEqualTo(newPod);
        });
  }
}
