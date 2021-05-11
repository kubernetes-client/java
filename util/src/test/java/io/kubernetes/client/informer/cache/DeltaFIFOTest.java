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

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import org.apache.commons.lang3.tuple.MutablePair;
import org.junit.Test;

public class DeltaFIFOTest {
  @Test
  public void testDeltaFIFOBasic() throws InterruptedException {
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
    assertEquals(foo1, receivingDelta.getRight());
    assertEquals(DeltaFIFO.DeltaType.Added, receivingDelta.getLeft());

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
    assertEquals(foo1, receivingDelta.getRight());
    assertEquals(DeltaFIFO.DeltaType.Updated, receivingDelta.getLeft());

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
    assertEquals(foo1, receivingDelta.getRight());
    assertEquals(DeltaFIFO.DeltaType.Deleted, receivingDelta.getLeft());

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
    assertEquals(foo1, receivingDelta.getRight());
    assertEquals(DeltaFIFO.DeltaType.Sync, receivingDelta.getLeft());
  }

  @Test
  public void testDeltaFIFODedup() {
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
    assertEquals(DeltaFIFO.DeltaType.Deleted, deltas.peekLast().getLeft());
    assertEquals(foo1, deltas.peekLast().getRight());
    assertEquals(DeltaFIFO.DeltaType.Added, deltas.peekFirst().getLeft());
    assertEquals(foo1, deltas.peekFirst().getRight());
    assertEquals(2, deltas.size());
    deltaFIFO.getItems().remove(Caches.deletionHandlingMetaNamespaceKeyFunc(foo1));

    // add-delete-delete dedup
    deltaFIFO.add(foo1);
    deltaFIFO.delete(foo1);
    deltaFIFO.delete(foo1);
    deltas = deltaFIFO.getItems().get(Caches.deletionHandlingMetaNamespaceKeyFunc(foo1));
    assertEquals(DeltaFIFO.DeltaType.Deleted, deltas.peekLast().getLeft());
    assertEquals(foo1, deltas.peekLast().getRight());
    assertEquals(DeltaFIFO.DeltaType.Added, deltas.peekFirst().getLeft());
    assertEquals(foo1, deltas.peekFirst().getRight());
    assertEquals(2, deltas.size());
    deltaFIFO.getItems().remove(Caches.deletionHandlingMetaNamespaceKeyFunc(foo1));

    // add-sync dedupe
    deltaFIFO.add(foo1);
    deltaFIFO.replace(Collections.singletonList(foo1), foo1.getMetadata().getResourceVersion());
    deltas = deltaFIFO.getItems().get(Caches.deletionHandlingMetaNamespaceKeyFunc(foo1));
    assertEquals(1, deltas.size());
  }

  @Test
  public void testDeltaFIFOResync() {
    V1Pod foo1 = new V1Pod().metadata(new V1ObjectMeta().name("foo1").namespace("default"));
    Cache cache = new Cache();
    DeltaFIFO deltaFIFO = new DeltaFIFO(Caches::deletionHandlingMetaNamespaceKeyFunc, cache);

    // sync after add
    cache.add(foo1);
    deltaFIFO.resync();

    Deque<MutablePair<DeltaFIFO.DeltaType, KubernetesObject>> deltas =
        deltaFIFO.getItems().get(Caches.deletionHandlingMetaNamespaceKeyFunc(foo1));

    assertEquals(1, deltas.size());
    assertEquals(foo1, deltas.peekLast().getRight());
    assertEquals(DeltaFIFO.DeltaType.Sync, deltas.peekLast().getLeft());
  }

  @Test
  public void testDeltaFIFOReplaceWithDeleteDeltaIn() throws InterruptedException {
    V1Pod oldPod = new V1Pod().metadata(new V1ObjectMeta().namespace("default").name("foo1"));
    V1Pod newPod = new V1Pod().metadata(new V1ObjectMeta().namespace("default").name("foo2"));

    Cache mockCache = mock(Cache.class);
    doReturn(oldPod).when(mockCache).getByKey(Caches.deletionHandlingMetaNamespaceKeyFunc(oldPod));
    DeltaFIFO deltaFIFO = new DeltaFIFO(Caches::deletionHandlingMetaNamespaceKeyFunc, mockCache);

    deltaFIFO.delete(oldPod);
    deltaFIFO.replace(Arrays.asList(newPod), "0");

    deltaFIFO.pop(
        (deltas) -> {
          assertEquals(DeltaFIFO.DeltaType.Deleted, deltas.getFirst().getLeft());
          assertEquals(oldPod, deltas.getFirst().getRight());
        });

    deltaFIFO.pop(
        (deltas) -> {
          assertEquals(DeltaFIFO.DeltaType.Sync, deltas.getFirst().getLeft());
          assertEquals(newPod, deltas.getFirst().getRight());
        });
  }
}
