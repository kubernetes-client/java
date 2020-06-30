package io.kubernetes.client.extended.event.legacy;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.event.EventType;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import java.util.Map;

public interface EventRecorder {

  void event(KubernetesObject object, EventType t, String reason, String format, String... args);

  void event(
      KubernetesObject object,
      Map<String, String> attachedAnnotation,
      EventType t,
      String reason,
      String format,
      String... args);

  void event(V1ObjectReference ref, EventType t, String reason, String format, String... args);

  void event(
      V1ObjectReference ref,
      Map<String, String> attachedAnnotation,
      EventType t,
      String reason,
      String format,
      String... args);
}
