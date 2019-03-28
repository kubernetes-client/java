/*
Copyright 2019 The Kubernetes Authors.
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
