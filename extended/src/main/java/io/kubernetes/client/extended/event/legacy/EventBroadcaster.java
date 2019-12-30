package io.kubernetes.client.extended.event.legacy;

import io.kubernetes.client.openapi.models.V1EventSource;

public interface EventBroadcaster {

  EventRecorder newRecorder(V1EventSource eventSource);

  void startRecording();

  void shutdown();
}
