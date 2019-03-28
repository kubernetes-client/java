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
