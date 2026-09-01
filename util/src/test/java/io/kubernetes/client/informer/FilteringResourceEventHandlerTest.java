/*
Copyright 2026 The Kubernetes Authors.
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

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;

import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FilteringResourceEventHandlerTest {

  private static V1Pod pod(String name) {
    return new V1Pod().metadata(new V1ObjectMeta().namespace("default").name(name));
  }

  @Test
  void dropsAddForFilteredOutObject() {
    ResourceEventHandler<V1Pod> delegate = Mockito.mock(ResourceEventHandler.class);
    FilteringResourceEventHandler<V1Pod> handler =
        new FilteringResourceEventHandler<>(delegate, obj -> "selected".equals(obj.getMetadata().getName()));

    handler.onAdd(pod("ignored"));

    verifyNoInteractions(delegate);
  }

  @Test
  void convertsUpdateTransitionIntoAdd() {
    ResourceEventHandler<V1Pod> delegate = Mockito.mock(ResourceEventHandler.class);
    FilteringResourceEventHandler<V1Pod> handler =
        new FilteringResourceEventHandler<>(delegate, obj -> "selected".equals(obj.getMetadata().getName()));
    V1Pod oldObj = pod("ignored");
    V1Pod newObj = pod("selected");

    handler.onUpdate(oldObj, newObj);

    verify(delegate).onAdd(newObj);
    verify(delegate, never()).onUpdate(oldObj, newObj);
    verify(delegate, never()).onDelete(oldObj, false);
  }

  @Test
  void convertsUpdateTransitionIntoDelete() {
    ResourceEventHandler<V1Pod> delegate = Mockito.mock(ResourceEventHandler.class);
    FilteringResourceEventHandler<V1Pod> handler =
        new FilteringResourceEventHandler<>(delegate, obj -> "selected".equals(obj.getMetadata().getName()));
    V1Pod oldObj = pod("selected");
    V1Pod newObj = pod("ignored");

    handler.onUpdate(oldObj, newObj);

    verify(delegate).onDelete(oldObj, false);
    verify(delegate, never()).onUpdate(oldObj, newObj);
    verify(delegate, never()).onAdd(newObj);
  }

  @Test
  void preservesUpdateWhenOldAndNewMatch() {
    ResourceEventHandler<V1Pod> delegate = Mockito.mock(ResourceEventHandler.class);
    FilteringResourceEventHandler<V1Pod> handler =
        new FilteringResourceEventHandler<>(delegate, obj -> "selected".equals(obj.getMetadata().getName()));
    V1Pod oldObj = pod("selected");
    V1Pod newObj = pod("selected");

    handler.onUpdate(oldObj, newObj);

    verify(delegate).onUpdate(oldObj, newObj);
    verify(delegate, never()).onAdd(newObj);
    verify(delegate, never()).onDelete(oldObj, false);
  }

  @Test
  void dropsDeleteForFilteredOutObject() {
    ResourceEventHandler<V1Pod> delegate = Mockito.mock(ResourceEventHandler.class);
    FilteringResourceEventHandler<V1Pod> handler =
        new FilteringResourceEventHandler<>(delegate, obj -> "selected".equals(obj.getMetadata().getName()));

    handler.onDelete(pod("ignored"), false);

    verifyNoInteractions(delegate);
  }
}
