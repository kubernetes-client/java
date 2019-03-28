package io.kubernetes.client.leaderelection.resourcelock;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.leaderelection.LeaderElectionRecord;

/**
 * Lock offers a common interface for locking on arbitrary resources used in leader election.  The
 * Interface is used to hide the details on specific implementations in order to allow them to
 * change over time.  This interface is strictly for use by the leaderelection code.
 */
public interface Lock {

  String LeaderElectionRecordAnnotationKey = "control-plane.alpha.kubernetes.io/leader";

  LeaderElectionRecord get() throws ApiException;

  void create(LeaderElectionRecord leaderElectionRecord) throws ApiException;

  void update(LeaderElectionRecord leaderElectionRecord) throws ApiException;

  void recordEvent(String s);

  String describe();

  String identity();
}
