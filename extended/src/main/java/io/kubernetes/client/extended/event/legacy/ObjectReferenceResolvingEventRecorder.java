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
package io.kubernetes.client.extended.event.legacy;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.event.EventType;
import io.kubernetes.client.openapi.models.CoreV1Event;
import io.kubernetes.client.openapi.models.CoreV1EventBuilder;
import io.kubernetes.client.openapi.models.V1EventSource;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1ObjectMetaBuilder;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder;
import io.kubernetes.client.util.Strings;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObjectReferenceResolvingEventRecorder implements EventRecorder {

  private static final Logger logger =
      LoggerFactory.getLogger(ObjectReferenceResolvingEventRecorder.class);

  public ObjectReferenceResolvingEventRecorder(
      BlockingQueue<CoreV1Event> queue, V1EventSource eventSource) {
    this.pendingEventQueue = queue;
    this.eventSource = eventSource;
  }

  private BlockingQueue<CoreV1Event> pendingEventQueue;
  private V1EventSource eventSource;

  @Override
  public void event(
      KubernetesObject object, EventType t, String reason, String format, String... args) {
    event(object, new HashMap<>(), t, reason, format, args);
  }

  @Override
  public void event(
      KubernetesObject object,
      Map<String, String> attachedAnnotation,
      EventType t,
      String reason,
      String format,
      String... args) {
    generateEvent(
        constructObjectReference(object),
        attachedAnnotation,
        t,
        reason,
        String.format(format, args));
  }

  @Override
  public void event(
      V1ObjectReference ref, EventType t, String reason, String format, String... args) {
    event(ref, new HashMap<>(), t, reason, format, args);
  }

  @Override
  public void event(
      V1ObjectReference ref,
      Map<String, String> attachedAnnotation,
      EventType t,
      String reason,
      String format,
      String... args) {
    generateEvent(ref, attachedAnnotation, t, reason, String.format(format, args));
  }

  private V1ObjectReference constructObjectReference(KubernetesObject eventRefObject) {
    V1ObjectMeta meta = eventRefObject.getMetadata();
    return new V1ObjectReferenceBuilder()
        .withApiVersion(eventRefObject.getApiVersion())
        .withKind(eventRefObject.getKind())
        .withUid(meta.getUid())
        .withNamespace(meta.getNamespace())
        .withName(meta.getName())
        .withResourceVersion(meta.getResourceVersion())
        .build();
  }

  private void generateEvent(
      V1ObjectReference eventRef,
      Map<String, String> annotations,
      EventType t,
      String reason,
      String message) {

    // defaulting event namespace for cluster-scoped resources..
    String namespace = eventRef.getNamespace();
    if (Strings.isNullOrEmpty(eventRef.getNamespace())) {
      namespace = "default";
    }

    // build event
    OffsetDateTime now = OffsetDateTime.now();
    CoreV1Event event =
        new CoreV1EventBuilder()
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
            .withSource(this.eventSource)
            .withCount(1)
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
