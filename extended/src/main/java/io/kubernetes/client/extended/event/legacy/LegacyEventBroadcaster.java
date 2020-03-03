package io.kubernetes.client.extended.event.legacy;

import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Event;
import io.kubernetes.client.openapi.models.V1EventBuilder;
import io.kubernetes.client.openapi.models.V1EventSource;
import io.kubernetes.client.util.PatchUtils;
import java.net.HttpURLConnection;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.tuple.MutablePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LegacyEventBroadcaster implements EventBroadcaster {

  private static final Logger logger = LoggerFactory.getLogger(LegacyEventBroadcaster.class);

  private static final int maxTriesPerEvent = 10;

  public LegacyEventBroadcaster(CoreV1Api coreV1Api) {
    this(
        new EventCorrelator(),
        new EventSink() {
          @Override
          public V1Event create(V1Event event) throws ApiException {
            return coreV1Api.createNamespacedEvent(
                event.getMetadata().getNamespace(), event, null, null, null);
          }

          @Override
          public V1Event update(V1Event event) throws ApiException {
            return coreV1Api.replaceNamespacedEvent(
                event.getMetadata().getName(),
                event.getMetadata().getNamespace(),
                event,
                null,
                null,
                null);
          }

          @Override
          public V1Event patch(V1Event event, V1Patch patch) throws ApiException {
            return PatchUtils.patch(
                V1Event.class,
                () ->
                    coreV1Api.patchNamespacedEventCall(
                        event.getMetadata().getName(),
                        event.getMetadata().getNamespace(),
                        patch,
                        null,
                        null,
                        null,
                        null,
                        null),
                V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH,
                coreV1Api.getApiClient());
          }
        });
  }

  public LegacyEventBroadcaster(EventCorrelator correlator, EventSink sink) {
    this.pendingEventQueue = new LinkedBlockingQueue<>();
    this.eventProcessingWorker = Executors.newSingleThreadExecutor();
    this.eventCorrelator = correlator;
    this.sleepDuration = Duration.ofSeconds(10);
    this.eventSink = sink;
  }

  private BlockingQueue<V1Event> pendingEventQueue;
  private ExecutorService eventProcessingWorker;
  private EventSink eventSink;
  private EventCorrelator eventCorrelator;
  private Duration sleepDuration;
  private boolean shuttingDown;

  @Override
  public EventRecorder newRecorder(V1EventSource eventSource) {
    return new ObjectReferenceResolvingEventRecorder(this.pendingEventQueue);
  }

  @Override
  public void startRecording() {
    this.eventProcessingWorker.submit(
        () -> {
          while (!this.shuttingDown) {
            try {
              V1Event event = pendingEventQueue.poll(100, TimeUnit.MILLISECONDS);
              if (event != null) {
                recordToSink(event);
              }
            } catch (InterruptedException e) {
              logger.info("shutdown signaled");
            }
          }
        });
  }

  @Override
  public void shutdown() {
    this.eventProcessingWorker.shutdown();
    this.shuttingDown = true;
  }

  private void recordToSink(V1Event event) throws InterruptedException {
    Optional<MutablePair<V1Event, V1Patch>> eventAndPatch = this.eventCorrelator.correlate(event);
    if (!eventAndPatch.isPresent()) {
      // skip
      return;
    }
    V1Event recordingEvent = eventAndPatch.get().getLeft();
    V1Patch patch = eventAndPatch.get().getRight();
    for (int retries = 0; retries < maxTriesPerEvent; retries++) {
      if (recordEvent(recordingEvent, patch, event.getCount() > 1)) {
        break;
      }
      Thread.sleep(sleepDuration.toMillis());
    }
  }

  private boolean recordEvent(V1Event event, V1Patch patch, boolean updateExistingEvent) {
    V1Event newEvent = null;
    try {
      if (updateExistingEvent) {
        try {
          newEvent = this.eventSink.patch(event, patch);
        } catch (ApiException patchException) {
          if (patchException.getCode() == HttpURLConnection.HTTP_NOT_FOUND) { // not found
            event = new V1EventBuilder(event).build();
            event.getMetadata().setResourceVersion("");
            updateExistingEvent = false;
          }
        }
      }
      if (!updateExistingEvent) {
        try {
          newEvent = this.eventSink.create(event);
        } catch (ApiException e) {
          if (e.getCode()
              == HttpURLConnection
                  .HTTP_CONFLICT) { // "409 Conflict" suggests the requested resource already exists
            logger.error("event already exists", e);
            return true;
          }
          return false;
        }
      }
    } finally {
      if (newEvent != null) {
        this.eventCorrelator.updateState(newEvent);
      }
    }
    return true;
  }
}
