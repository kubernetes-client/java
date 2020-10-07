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
package io.kubernetes.client.extended.kubectl.rollout;

import io.kubernetes.client.extended.kubectl.rollout.response.RolloutHistory;
import io.kubernetes.client.openapi.models.V1Deployment;
import java.io.InputStream;
import java.util.Set;

public class DeploymentRollbacker extends Rollbacker<V1Deployment> {

  public DeploymentRollbacker(String name) {
    super(name);
  }

  public DeploymentRollbacker(String name, String namespace) {
    super(name, namespace);
  }

  @Override
  public Set<RolloutHistory<V1Deployment>> history() {
    return null;
  }

  @Override
  public V1Deployment undo() {
    return null;
  }

  @Override
  public V1Deployment pause() {
    return null;
  }

  @Override
  public V1Deployment restart() {
    return null;
  }

  @Override
  public V1Deployment resume() {
    return null;
  }

  @Override
  public InputStream status() {
    return null;
  }
}
