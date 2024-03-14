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

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.informer.ResourceEventHandler;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import java.time.Duration;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import org.junit.jupiter.api.Test;

class SharedProcessorTest {

  @Test
  void listenerAddition() throws InterruptedException {

    SharedProcessor<V1Pod> sharedProcessor = new SharedProcessor<>();

    V1Pod foo1 = new V1Pod().metadata(new V1ObjectMeta().name("foo1").namespace("default"));
    ProcessorListener.Notification<V1Pod> addNotification =
        new ProcessorListener.AddNotification<V1Pod>(foo1);
    ProcessorListener.Notification<V1Pod> updateNotification =
        new ProcessorListener.UpdateNotification<V1Pod>(null, foo1);
    ProcessorListener.Notification<V1Pod> deleteNotification =
        new ProcessorListener.DeleteNotification<V1Pod>(foo1);

    CountDownLatch latch = new CountDownLatch(9);

    ExpectingNoticationHandler<V1Pod> expectAddHandler =
        new ExpectingNoticationHandler<V1Pod>(addNotification, latch);
    ExpectingNoticationHandler<V1Pod> expectUpdateHandler =
        new ExpectingNoticationHandler<V1Pod>(updateNotification, latch);
    ExpectingNoticationHandler<V1Pod> expectDeleteHandler =
        new ExpectingNoticationHandler<V1Pod>(deleteNotification, latch);

    sharedProcessor.addAndStartListener(expectAddHandler);
    sharedProcessor.addAndStartListener(expectUpdateHandler);
    sharedProcessor.addAndStartListener(expectDeleteHandler);

    sharedProcessor.distribute(addNotification, false);
    sharedProcessor.distribute(updateNotification, false);
    sharedProcessor.distribute(deleteNotification, false);

    latch.await();

    assertThat(expectAddHandler.isSatisfied()).isTrue();
    assertThat(expectUpdateHandler.isSatisfied()).isTrue();
    assertThat(expectDeleteHandler.isSatisfied()).isTrue();
  }

  @Test
  void shutdownGracefully() throws InterruptedException {
    SharedProcessor<V1Pod> sharedProcessor =
        new SharedProcessor<>(Executors.newCachedThreadPool(), Duration.ofSeconds(5));
    TestWorker<V1Pod> slowWorker = new TestWorker<>(null, 0);
    final boolean[] interrupted = {false};
    CountDownLatch latch = new CountDownLatch(1);
    slowWorker.setTask(
        () -> {
          try {
            // sleep 10s so that it could be interrupted by shutdownNow()
            Thread.sleep(10 * 1000);
          } catch (InterruptedException e) {
            interrupted[0] = true;
          } finally {
            latch.countDown();
          }
        });
    sharedProcessor.addAndStartListener(slowWorker);
    sharedProcessor.stop();
    latch.await();
    assertThat(interrupted[0]).isTrue();
  }

  private static class ExpectingNoticationHandler<ApiType extends KubernetesObject>
      extends ProcessorListener<ApiType> {

    public ExpectingNoticationHandler(
        Notification<ApiType> expectingNotification, CountDownLatch countDownLatch) {
      this(
          new ResourceEventHandler<ApiType>() {
            CountDownLatch latch = countDownLatch;

            @Override
            public void onAdd(ApiType obj) {
              latch.countDown();
            }

            @Override
            public void onUpdate(ApiType oldObj, ApiType newObj) {
              latch.countDown();
            }

            @Override
            public void onDelete(ApiType obj, boolean deletedFinalStateUnknown) {
              latch.countDown();
            }
          },
          0);
      this.expectingNotification = expectingNotification;
    }

    public ExpectingNoticationHandler(ResourceEventHandler<ApiType> handler, long resyncPeriod) {
      super(handler, resyncPeriod);
    }

    private ProcessorListener.Notification<ApiType> expectingNotification;
    private boolean satisfied;

    @Override
    public void add(Notification<ApiType> obj) {
      super.add(obj);
      if (!satisfied) {
        satisfied = obj.equals(expectingNotification);
      }
    }

    public boolean isSatisfied() {
      return satisfied;
    }
  }

  private static class TestWorker<ApiType extends KubernetesObject>
      extends ProcessorListener<ApiType> {

    private Runnable task;

    public TestWorker(ResourceEventHandler<ApiType> handler, long resyncPeriod) {
      super(handler, resyncPeriod);
    }

    public void setTask(Runnable task) {
      this.task = task;
    }

    @Override
    public void run() {
      this.task.run();
    }
  }
}
