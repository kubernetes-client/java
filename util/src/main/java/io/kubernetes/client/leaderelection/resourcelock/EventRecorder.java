package io.kubernetes.client.leaderelection.resourcelock;

/**
 * EventRecorder records a change in the ResourceLock.
 */
public interface EventRecorder {
    void eventf(Object obj, String eventType, String reason, String message);
}
