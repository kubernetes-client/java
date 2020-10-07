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
package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.extended.kubectl.rollout.DaemonSetRollbacker;
import io.kubernetes.client.extended.kubectl.rollout.DeploymentRollbacker;
import io.kubernetes.client.extended.kubectl.rollout.Rollbacker;
import io.kubernetes.client.extended.kubectl.rollout.StatefulSetRollbacker;
import io.kubernetes.client.extended.kubectl.rollout.response.RolloutResponse;
import io.kubernetes.client.openapi.models.V1DaemonSet;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1StatefulSet;

public class KubectlRollout<ApiType extends KubernetesObject>
    extends Kubectl.ResourceBuilder<ApiType, KubectlRollout<ApiType>>
    implements Kubectl.Executable<RolloutResponse> {

  private RolloutActionType actionType;

  KubectlRollout(Class<ApiType> apiTypeClass) {
    super(apiTypeClass);
  }

  public KubectlRollout<ApiType> history() {
    this.actionType = RolloutActionType.HISTORY;
    return this;
  }

  public KubectlRollout<ApiType> resume() {
    this.actionType = RolloutActionType.RESUME;
    return this;
  }

  public KubectlRollout<ApiType> restart() {
    this.actionType = RolloutActionType.RESTART;
    return this;
  }

  public KubectlRollout<ApiType> pause() {
    this.actionType = RolloutActionType.PAUSE;
    return this;
  }

  public KubectlRollout<ApiType> undo() {
    this.actionType = RolloutActionType.UNDO;
    return this;
  }

  public KubectlRollout<ApiType> status() {
    this.actionType = RolloutActionType.STATUS;
    return this;
  }

  @Override
  public RolloutResponse execute() throws KubectlException {
    RolloutResponse response = null;
    switch (actionType) {
      case HISTORY:
        response = new RolloutResponse(getRollbacker().history());
        break;
      case PAUSE:
        response = new RolloutResponse(getRollbacker().pause());
        break;
      case RESTART:
        response = new RolloutResponse(getRollbacker().restart());
        break;
      case RESUME:
        response = new RolloutResponse(getRollbacker().resume());
        break;
      case UNDO:
        response = new RolloutResponse(getRollbacker().undo());
        break;
      case STATUS:
        response = new RolloutResponse(getRollbacker().status());
        break;
      default:
        throw new KubectlException("Unsupported rollout action :" + actionType);
    }
    return response;
  }

  private enum RolloutActionType {
    HISTORY,
    PAUSE,
    RESTART,
    RESUME,
    STATUS,
    UNDO;
  }

  private Rollbacker<? extends KubernetesObject> getRollbacker() throws KubectlException {
    if (apiTypeClass.equals(V1DaemonSet.class)) {
      return new DaemonSetRollbacker(name, namespace);
    } else if (apiTypeClass.equals(V1Deployment.class)) {
      return new DeploymentRollbacker(name, namespace);
    } else if (apiTypeClass.equals(V1StatefulSet.class)) {
      return new StatefulSetRollbacker(name, namespace);
    }
    throw new KubectlException("Unsupported class for rollout: " + apiTypeClass);
  }
}
