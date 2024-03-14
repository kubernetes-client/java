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
package io.kubernetes.client.extended.controller;

import static org.assertj.core.api.Assertions.assertThat;

import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.workqueue.DefaultWorkQueue;
import io.kubernetes.client.extended.workqueue.WorkQueue;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodSpec;
import java.time.Duration;
import org.junit.jupiter.api.Test;

class ControllerWatchTest {
  private V1Pod testPod =
      new V1Pod().metadata(new V1ObjectMeta().namespace("ns1").name("pod1")).spec(new V1PodSpec());

  @Test
  void onAdd() {
    WorkQueue<Request> workQueue = new DefaultWorkQueue<>();
    DefaultControllerWatch<V1Pod> controllerWatch =
        new DefaultControllerWatch(
            V1Pod.class, workQueue, Controllers.defaultReflectiveKeyFunc(), Duration.ZERO);
    controllerWatch.getResourceEventHandler().onAdd(testPod);
    assertThat(workQueue.length()).isEqualTo(1);

    controllerWatch.setOnAddFilterPredicate((V1Pod addedPod) -> false);
    controllerWatch.getResourceEventHandler().onAdd(testPod);
    assertThat(workQueue.length()).isEqualTo(1);
  }

  @Test
  void onUpdate() {
    WorkQueue<Request> workQueue = new DefaultWorkQueue<>();
    DefaultControllerWatch<V1Pod> controllerWatch =
        new DefaultControllerWatch(
            V1Pod.class, workQueue, Controllers.defaultReflectiveKeyFunc(), Duration.ZERO);
    controllerWatch.getResourceEventHandler().onUpdate(null, testPod);
    assertThat(workQueue.length()).isEqualTo(1);

    controllerWatch.setOnUpdateFilterPredicate((V1Pod oldPod, V1Pod newPod) -> false);
    controllerWatch.getResourceEventHandler().onUpdate(null, testPod);
    assertThat(workQueue.length()).isEqualTo(1);
  }

  @Test
  void onDelete() {
    WorkQueue<Request> workQueue = new DefaultWorkQueue<>();
    DefaultControllerWatch<V1Pod> controllerWatch =
        new DefaultControllerWatch(
            V1Pod.class, workQueue, Controllers.defaultReflectiveKeyFunc(), Duration.ZERO);
    controllerWatch.getResourceEventHandler().onDelete(testPod, false);
    assertThat(workQueue.length()).isEqualTo(1);

    controllerWatch.setOnDeleteFilterPredicate((V1Pod newPod, Boolean stateUnknown) -> false);
    controllerWatch.getResourceEventHandler().onDelete(testPod, false);
    assertThat(workQueue.length()).isEqualTo(1);
  }
}
