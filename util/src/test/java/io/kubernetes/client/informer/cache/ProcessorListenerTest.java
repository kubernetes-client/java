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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.kubernetes.client.informer.ResourceEventHandler;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import java.util.concurrent.CountDownLatch;
import org.junit.Test;

public class ProcessorListenerTest {

  private static boolean addNotificationReceived;
  private static boolean updateNotificationReceived;
  private static boolean deleteNotificationReceived;

  @Test
  public void testNotificationHandling() throws InterruptedException {
    V1Pod pod = new V1Pod().metadata(new V1ObjectMeta().name("foo").namespace("default"));

    final CountDownLatch cLatch = new CountDownLatch(3);
    ProcessorListener<V1Pod> listener =
        new ProcessorListener<>(
            new ResourceEventHandler<V1Pod>() {

              @Override
              public void onAdd(V1Pod obj) {
                assertEquals(pod, obj);
                addNotificationReceived = true;
                cLatch.countDown();
              }

              @Override
              public void onUpdate(V1Pod oldObj, V1Pod newObj) {
                assertEquals(pod, newObj);
                updateNotificationReceived = true;
                cLatch.countDown();
              }

              @Override
              public void onDelete(V1Pod obj, boolean deletedFinalStateUnknown) {
                assertEquals(pod, obj);
                deleteNotificationReceived = true;
                cLatch.countDown();
              }
            },
            0);

    listener.add(new ProcessorListener.AddNotification<>(pod));
    listener.add(new ProcessorListener.UpdateNotification<>(null, pod));
    listener.add(new ProcessorListener.DeleteNotification<>(pod));

    Thread listenerThread = new Thread(listener::run);
    listenerThread.setDaemon(true);
    listenerThread.start();

    // wait until consumption of notifications from queue
    cLatch.await();

    assertTrue(addNotificationReceived);
    assertTrue(updateNotificationReceived);
    assertTrue(deleteNotificationReceived);
  }

  @Test
  public void testMultipleNotificationsHandling() throws InterruptedException {
    V1Pod pod = new V1Pod().metadata(new V1ObjectMeta().name("foo").namespace("default"));
    final int[] count = {0};

    int notificationCount = 2000;
    final CountDownLatch cLatch = new CountDownLatch(notificationCount);
    ProcessorListener<V1Pod> listener =
        new ProcessorListener<>(
            new ResourceEventHandler<V1Pod>() {
              @Override
              public void onAdd(V1Pod obj) {
                assertEquals(pod, obj);
                count[0]++;
                cLatch.countDown();
              }

              @Override
              public void onUpdate(V1Pod oldObj, V1Pod newObj) {}

              @Override
              public void onDelete(V1Pod obj, boolean deletedFinalStateUnknown) {}
            },
            0);

    for (int i = 0; i < notificationCount; i++) {
      listener.add(new ProcessorListener.AddNotification<>(pod));
    }

    Thread listenerThread = new Thread(listener);
    listenerThread.setDaemon(true);
    listenerThread.start();

    cLatch.await();

    assertEquals(count[0], 2000);
  }
}
