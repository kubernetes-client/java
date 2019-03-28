package io.kubernetes.client.leaderelection;

/**
 * LeaderCallbacks are callbacks that are triggered during certain lifecycle events of the
 * LeaderElector. These are invoked asynchronously.
 *
 * possible future callbacks: * OnChallenge()
 */
public interface LeaderCallbacks {

  /**
   * OnStartedLeading is called when a LeaderElector client starts leading
   */
  void onStartedLeading();

  /**
   * OnStoppedLeading is called when a LeaderElector client stops leading
   */
  void onStopLeading();

  /**
   * OnNewLeader is called when the client observes a leader that is not the previously observed
   * leader. This includes the first observed leader when the client starts.
   */
  void onNewLeader(String identity);
}
