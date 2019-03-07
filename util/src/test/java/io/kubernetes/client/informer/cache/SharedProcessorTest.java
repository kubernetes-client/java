package io.kubernetes.client.informer.cache;

import static org.junit.Assert.*;

import io.kubernetes.client.informer.ResourceEventHandler;
import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.models.V1Pod;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.EnvironmentVariables;

public class SharedProcessorTest {

  @Rule public final EnvironmentVariables environmentVariables = new EnvironmentVariables();

  @Test
  public void testListenerAddition() throws InterruptedException {

    SharedProcessor<V1Pod> sharedProcessor = new SharedProcessor<>();

    V1Pod foo1 = new V1Pod().metadata(new V1ObjectMeta().name("foo1").namespace("default"));
    ProcessorListener.Notification<V1Pod> addNotification =
        new ProcessorListener.AddNotification<V1Pod>(foo1);
    ProcessorListener.Notification<V1Pod> updateNotification =
        new ProcessorListener.UpdateNotification<V1Pod>(null, foo1);
    ProcessorListener.Notification<V1Pod> deleteNotification =
        new ProcessorListener.DeleteNotification<V1Pod>(foo1);

    ExpectingNoticationHandler<V1Pod> expectAddHandler =
        new ExpectingNoticationHandler<V1Pod>(addNotification);
    ExpectingNoticationHandler<V1Pod> expectUpdateHandler =
        new ExpectingNoticationHandler<V1Pod>(updateNotification);
    ExpectingNoticationHandler<V1Pod> expectDeleteHandler =
        new ExpectingNoticationHandler<V1Pod>(deleteNotification);

    sharedProcessor.addAndStartListener(expectAddHandler);
    sharedProcessor.addAndStartListener(expectUpdateHandler);
    sharedProcessor.addAndStartListener(expectDeleteHandler);

    sharedProcessor.distribute(addNotification, false);
    sharedProcessor.distribute(updateNotification, false);
    sharedProcessor.distribute(deleteNotification, false);
    // sleep 1s for notification distribution completing
    Thread.sleep(1000);

    assertTrue(expectAddHandler.isSatisfied());
    assertTrue(expectUpdateHandler.isSatisfied());
    assertTrue(expectDeleteHandler.isSatisfied());
  }

  private static class ExpectingNoticationHandler<ApiType> extends ProcessorListener<ApiType> {

    public ExpectingNoticationHandler(Notification<ApiType> expectingNotification) {
      this(
          new ResourceEventHandler<ApiType>() {
            @Override
            public void onAdd(ApiType obj) {}

            @Override
            public void onUpdate(ApiType oldObj, ApiType newObj) {}

            @Override
            public void onDelete(ApiType obj, boolean deletedFinalStateUnknown) {}
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
}
