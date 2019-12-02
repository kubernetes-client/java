package io.kubernetes.client.extended.controller;

import static org.junit.Assert.*;

import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.workqueue.DefaultWorkQueue;
import io.kubernetes.client.extended.workqueue.WorkQueue;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodSpec;
import org.junit.Test;

public class ControllerWatchTest {
  private V1Pod testPod =
      new V1Pod().metadata(new V1ObjectMeta().namespace("ns1").name("pod1")).spec(new V1PodSpec());

  @Test
  public void testOnAdd() {
    WorkQueue<Request> workQueue = new DefaultWorkQueue<>();
    DefaultControllerWatch<V1Pod> controllerWatch =
        new DefaultControllerWatch(V1Pod.class, workQueue, Controllers.defaultReflectiveKeyFunc());
    controllerWatch.getResourceEventHandler().onAdd(testPod);
    assertEquals(1, workQueue.length());

    controllerWatch.setOnAddFilterPredicate((V1Pod addedPod) -> false);
    controllerWatch.getResourceEventHandler().onAdd(testPod);
    assertEquals(1, workQueue.length());
  }

  @Test
  public void testOnUpdate() {
    WorkQueue<Request> workQueue = new DefaultWorkQueue<>();
    DefaultControllerWatch<V1Pod> controllerWatch =
        new DefaultControllerWatch(V1Pod.class, workQueue, Controllers.defaultReflectiveKeyFunc());
    controllerWatch.getResourceEventHandler().onUpdate(null, testPod);
    assertEquals(1, workQueue.length());

    controllerWatch.setOnUpdateFilterPredicate((V1Pod oldPod, V1Pod newPod) -> false);
    controllerWatch.getResourceEventHandler().onUpdate(null, testPod);
    assertEquals(1, workQueue.length());
  }

  @Test
  public void testOnDelete() {
    WorkQueue<Request> workQueue = new DefaultWorkQueue<>();
    DefaultControllerWatch<V1Pod> controllerWatch =
        new DefaultControllerWatch(V1Pod.class, workQueue, Controllers.defaultReflectiveKeyFunc());
    controllerWatch.getResourceEventHandler().onDelete(testPod, false);
    assertEquals(1, workQueue.length());

    controllerWatch.setOnDeleteFilterPredicate((V1Pod newPod, Boolean stateUnknown) -> false);
    controllerWatch.getResourceEventHandler().onDelete(testPod, false);
    assertEquals(1, workQueue.length());
  }
}
