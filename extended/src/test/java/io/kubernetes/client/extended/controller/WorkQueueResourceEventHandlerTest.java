package io.kubernetes.client.extended.controller;

import static org.junit.Assert.*;

import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.workqueue.DefaultWorkQueue;
import io.kubernetes.client.extended.workqueue.WorkQueue;
import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.models.V1Pod;
import io.kubernetes.client.models.V1PodSpec;
import org.junit.Test;

public class WorkQueueResourceEventHandlerTest {
  private V1Pod testPod =
      new V1Pod().metadata(new V1ObjectMeta().namespace("ns1").name("pod1")).spec(new V1PodSpec());

  @Test
  public void testOnAdd() {
    WorkQueue<Request> workQueue = new DefaultWorkQueue<>();
    WorkQueueResourceEventHandler<V1Pod> handler =
        new WorkQueueResourceEventHandler(workQueue, Controllers.defaultReflectiveKeyFunc());
    handler.onAdd(testPod);
    assertEquals(1, workQueue.length());

    handler.setOnAddFilterPredicate((V1Pod addedPod) -> false);
    handler.onAdd(testPod);
    assertEquals(1, workQueue.length());
  }

  @Test
  public void testOnUpdate() {
    WorkQueue<Request> workQueue = new DefaultWorkQueue<>();
    WorkQueueResourceEventHandler<V1Pod> handler =
        new WorkQueueResourceEventHandler(workQueue, Controllers.defaultReflectiveKeyFunc());
    handler.onUpdate(null, testPod);
    assertEquals(1, workQueue.length());

    handler.setOnUpdateFilterPredicate((V1Pod oldPod, V1Pod newPod) -> false);
    handler.onUpdate(null, testPod);
    assertEquals(1, workQueue.length());
  }

  @Test
  public void testOnDelete() {
    WorkQueue<Request> workQueue = new DefaultWorkQueue<>();
    WorkQueueResourceEventHandler<V1Pod> handler =
        new WorkQueueResourceEventHandler(workQueue, Controllers.defaultReflectiveKeyFunc());
    handler.onDelete(testPod, false);
    assertEquals(1, workQueue.length());

    handler.setOnDeleteFilterPredicate((V1Pod newPod, Boolean stateUnknown) -> false);
    handler.onDelete(testPod, false);
    assertEquals(1, workQueue.length());
  }
}
