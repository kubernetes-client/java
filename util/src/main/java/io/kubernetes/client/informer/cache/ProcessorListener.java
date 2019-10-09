package io.kubernetes.client.informer.cache;

import io.kubernetes.client.informer.ResourceEventHandler;
import io.kubernetes.client.informer.exception.BadNotificationException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ProcessorListener implements Runnable interface. It's supposed to run in background and actually
 * executes its event handler on notification.
 */
public class ProcessorListener<ApiType> implements Runnable {

  private static final Logger log = LoggerFactory.getLogger(ProcessorListener.class);

  // resyncPeriod is how frequently the listener wants a full resync from the shared informer. This
  // value may differ from requestedResyncPeriod if the shared informer adjusts it to align with the
  // informer's overall resync check period.
  private long resyncPeriod;
  private DateTime nextResync;

  private BlockingQueue<Notification> queue;

  private ResourceEventHandler<ApiType> handler;

  public ProcessorListener(ResourceEventHandler<ApiType> handler, long resyncPeriod) {
    this.resyncPeriod = resyncPeriod;
    this.handler = handler;

    this.queue = new LinkedBlockingQueue<>();

    determineNextResync(DateTime.now());
  }

  @Override
  public void run() {
    while (true) {
      try {
        Notification obj = queue.take();
        if (obj instanceof UpdateNotification) {
          UpdateNotification notification = (UpdateNotification) obj;
          try {
            this.handler.onUpdate(
                (ApiType) notification.getOldObj(), (ApiType) notification.getNewObj());
          } catch (Throwable t) {
            // Catch all exceptions here so that listeners won't quit unexpectedly
            log.error("failed invoking UPDATE event handler: {}", t.getMessage());
            continue;
          }
        } else if (obj instanceof AddNotification) {
          AddNotification notification = (AddNotification) obj;
          try {
            this.handler.onAdd((ApiType) notification.getNewObj());
          } catch (Throwable t) {
            // Catch all exceptions here so that listeners won't quit unexpectedly
            log.error("failed invoking ADD event handler: {}", t.getMessage());
            continue;
          }
        } else if (obj instanceof DeleteNotification) {
          Object deletedObj = ((DeleteNotification) obj).getOldObj();
          try {
            if (deletedObj instanceof DeltaFIFO.DeletedFinalStateUnknown) {
              this.handler.onDelete(
                  ((DeltaFIFO.DeletedFinalStateUnknown<ApiType>) deletedObj).getObj(), true);
            } else {
              this.handler.onDelete((ApiType) deletedObj, false);
            }
          } catch (Throwable t) {
            // Catch all exceptions here so that listeners won't quit unexpectedly
            log.error("failed invoking DELETE event handler: {}", t.getMessage());
            continue;
          }
        } else {
          throw new BadNotificationException("unrecognized notification");
        }
      } catch (InterruptedException e) {
        log.error("processor interrupted: {}", e.getMessage());
        return;
      }
    }
  }

  public void add(Notification<ApiType> obj) {
    if (obj == null) {
      return;
    }
    this.queue.add(obj);
  }

  public void determineNextResync(DateTime now) {
    this.nextResync = now.plus(this.resyncPeriod);
  }

  public boolean shouldResync(DateTime now) {
    return this.resyncPeriod != 0 && (now.isAfter(this.nextResync) || now.equals(this.nextResync));
  }

  public static class Notification<ApiType> {}

  public static final class UpdateNotification<ApiType> extends Notification<ApiType> {

    private ApiType oldObj;
    private ApiType newObj;

    public UpdateNotification(ApiType oldObj, ApiType newObj) {
      this.oldObj = oldObj;
      this.newObj = newObj;
    }

    ApiType getOldObj() {
      return oldObj;
    }

    ApiType getNewObj() {
      return newObj;
    }
  }

  public static final class AddNotification<ApiType> extends Notification<ApiType> {

    private ApiType newObj;

    public AddNotification(ApiType newObj) {
      this.newObj = newObj;
    }

    ApiType getNewObj() {
      return newObj;
    }
  }

  public static final class DeleteNotification<ApiType> extends Notification<ApiType> {

    private ApiType oldObj;

    public DeleteNotification(ApiType oldObj) {
      this.oldObj = oldObj;
    }

    ApiType getOldObj() {
      return oldObj;
    }
  }
}
