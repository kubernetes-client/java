package io.kubernetes.client.extended.leaderelection;

import io.kubernetes.client.openapi.ApiException;

/**
 * Lock offers a common interface for locking on arbitrary resources used in leader election. The
 * Lock is used to hide the details on specific implementations in order to allow them to change
 * over time. This interface is strictly for use by the leaderelection code.
 */
public interface Lock {

  /**
   * get returns the LeaderElectionRecord which contains the information about the current lock
   * holder
   *
   * @return the Leader election record
   * @throws ApiException
   */
  LeaderElectionRecord get() throws ApiException;

  /**
   * create attempts to create a LeaderElectionRecord
   *
   * @param record the information of this candidate
   * @return the result is successful or not
   */
  boolean create(LeaderElectionRecord record);

  /**
   * update attempts to update the existing LeaderElectionRecord
   *
   * @param record the information of this candidate
   * @return the result is successful or not
   */
  boolean update(LeaderElectionRecord record);

  /**
   * identity returns the locks Identity
   *
   * @return the identity
   */
  String identity();

  /**
   * Describe is used to convert details on current resource lock into a string
   *
   * @return the description
   */
  String describe();
}
