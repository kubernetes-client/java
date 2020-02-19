package io.kubernetes.client.extended.event.legacy;

import com.google.common.base.Strings;
import io.kubernetes.client.extended.event.EventType;
import io.kubernetes.client.openapi.models.V1Event;
import io.kubernetes.client.openapi.models.V1EventBuilder;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1ObjectMetaBuilder;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder;
import io.kubernetes.client.util.ObjectAccessor;
import io.kubernetes.client.util.TypeAccessor;
import io.kubernetes.client.util.exception.ObjectMetaReflectException;
import io.kubernetes.client.util.exception.TypeMetaReflectException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObjectReferenceResolvingEventRecorder implements EventRecorder {

  private static final Logger logger =
      LoggerFactory.getLogger(ObjectReferenceResolvingEventRecorder.class);

  public ObjectReferenceResolvingEventRecorder(BlockingQueue<V1Event> queue) {
    this.pendingEventQueue = queue;
  }

  private BlockingQueue<V1Event> pendingEventQueue;

  @Override
  public void event(Object object, EventType t, String reason, String format, String... args) {
    event(object, new HashMap<>(), t, reason, format, args);
  }

  @Override
  public void event(
      Object object,
      Map<String, String> attachedAnnotation,
      EventType t,
      String reason,
      String format,
      String... args) {
    generateEvent(object, attachedAnnotation, t, reason, String.format(format, args));
  }

  @Override
  public void event(
      V1ObjectReference ref, EventType t, String reason, String format, String... args) {
    event((Object) ref, t, reason, format, args);
  }

  @Override
  public void event(
      V1ObjectReference ref,
      Map<String, String> attachedAnnotation,
      EventType t,
      String reason,
      String format,
      String... args) {
    event((Object) ref, attachedAnnotation, t, reason, format, args);
  }

  private void generateEvent(
      Object eventRefObject,
      Map<String, String> annotations,
      EventType t,
      String reason,
      String message) {
    V1ObjectReference eventRef;
    if (eventRefObject instanceof V1ObjectReference) {
      eventRef = (V1ObjectReference) eventRefObject;
    } else {
      try {
        V1ObjectMeta meta = ObjectAccessor.objectMetadata(eventRefObject);
        eventRef =
            new V1ObjectReferenceBuilder()
                .withApiVersion(TypeAccessor.apiVersion(eventRefObject))
                .withKind(TypeAccessor.kind(eventRefObject))
                .withUid(meta.getUid())
                .withNamespace(meta.getNamespace())
                .withName(meta.getName())
                .withResourceVersion(meta.getResourceVersion())
                .build();
      } catch (ObjectMetaReflectException | TypeMetaReflectException e) {
        logger.error("failed parsing eventRefObject", e);
        return;
      }
    }

    // defaulting event namespace for cluster-scoped resources..
    String namespace = eventRef.getNamespace();
    if (Strings.isNullOrEmpty(eventRef.getNamespace())) {
      namespace = "default";
    }

    // build event
    DateTime now = DateTime.now();
    V1Event event =
        new V1EventBuilder()
            .withMetadata(
                new V1ObjectMetaBuilder()
                    .withName(EventUtils.generateName(eventRef.getName(), now))
                    .withNamespace(namespace)
                    .withAnnotations(annotations)
                    .build())
            .withInvolvedObject(eventRef)
            .withType(t.toString())
            .withReason(reason)
            .withMessage(message)
            .withFirstTimestamp(now)
            .withLastTimestamp(now)
            .build();

    // fire event
    try {
      this.pendingEventQueue.offer(event, 100, TimeUnit.MILLISECONDS);
    } catch (InterruptedException e) {
      // the queue is full, drop the event..
      logger.warn(
          "the event queue is full, dropping requesting event upon {}/{}",
          eventRef.getNamespace(),
          eventRef.getName());
    }
  }
}
