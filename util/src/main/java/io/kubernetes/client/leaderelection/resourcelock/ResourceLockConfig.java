package io.kubernetes.client.leaderelection.resourcelock;

/**
 * ResourceLockConfig common data that exists across different resource locks
 */
public class ResourceLockConfig {

  /**
   * Identity is the unique string identifying a lease holder across all participants in an
   * election.
   */
  private String identity;
  /**
   * EventRecorder is optional.
   */
  private EventRecorder eventRecorder;

  /**
   * Identity is the unique string identifying a lease holder across all participants in an
   * election.
   */
  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  /**
   * EventRecorder is optional.
   */
  public EventRecorder getEventRecorder() {
    return eventRecorder;
  }

  public void setEventRecorder(EventRecorder eventRecorder) {
    this.eventRecorder = eventRecorder;
  }
}
