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
import io.kubernetes.client.extended.kubectl.rollout.DaemonSetRollout;
import io.kubernetes.client.extended.kubectl.rollout.DeploymentRollout;
import io.kubernetes.client.extended.kubectl.rollout.Rollout;
import io.kubernetes.client.extended.kubectl.rollout.StatefulSetRollout;
import io.kubernetes.client.extended.kubectl.rollout.response.RolloutResponse;
import io.kubernetes.client.openapi.models.V1DaemonSet;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1StatefulSet;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import org.bouncycastle.util.Strings;

public class KubectlRollout<ApiType extends KubernetesObject>
    extends Kubectl.ResourceBuilder<ApiType, KubectlRollout<ApiType>>
    implements Kubectl.Executable<RolloutResponse> {

  private RolloutActionType actionType;

  KubectlRollout(Class<ApiType> apiTypeClass) {
    super(apiTypeClass);
  }

  public KubectlRollout<ApiType> history() throws KubectlException {
    validateAction();
    this.actionType = RolloutActionType.HISTORY;
    return this;
  }

  public KubectlRollout<ApiType> resume() throws KubectlException {
    validateAction();
    this.actionType = RolloutActionType.RESUME;
    return this;
  }

  public KubectlRollout<ApiType> restart() throws KubectlException {
    validateAction();
    this.actionType = RolloutActionType.RESTART;
    return this;
  }

  public KubectlRollout<ApiType> pause() throws KubectlException {
    validateAction();
    this.actionType = RolloutActionType.PAUSE;
    return this;
  }

  public KubectlRollout<ApiType> undo() throws KubectlException {
    validateAction();
    this.actionType = RolloutActionType.UNDO;
    return this;
  }

  public KubectlRollout<ApiType> status() throws KubectlException {
    validateAction();
    this.actionType = RolloutActionType.STATUS;
    return this;
  }

  @Override
  public RolloutResponse execute() throws KubectlException {
    refreshDiscovery();
    RolloutResponse response = null;
    switch (actionType) {
      case HISTORY:
        response = new RolloutResponse(getRollout().history());
        break;
      case PAUSE:
        response = new RolloutResponse(getRollout().pause());
        break;
      case RESTART:
        response = new RolloutResponse(getRollout().restart());
        break;
      case RESUME:
        response = new RolloutResponse(getRollout().resume());
        break;
      case UNDO:
        response = new RolloutResponse(getRollout().undo());
        break;
      case STATUS:
        response = new RolloutResponse(getRollout().status());
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

  private Rollout<? extends KubernetesObject> getRollout() throws KubectlException {
    GenericKubernetesApi api = getGenericApi(apiTypeClass);
    Rollout<? extends KubernetesObject> rollout = null;
    if (apiTypeClass.equals(V1DaemonSet.class)) {
      rollout = new DaemonSetRollout(api, name, namespace);
    } else if (apiTypeClass.equals(V1Deployment.class)) {
      rollout = new DeploymentRollout(api, name, namespace);
    } else if (apiTypeClass.equals(V1StatefulSet.class)) {
      rollout = new StatefulSetRollout(api, name, namespace);
    }
    if (rollout == null) {
      throw new KubectlException("Unsupported class for rollout: " + apiTypeClass);
    }
    rollout.withApiClient(apiClient);
    return rollout;
  }

  private void validateAction() throws KubectlException {
    if (actionType != null) {
      throw new KubectlException(
          "Cannot execute multiple actions. Action :"
              + Strings.toLowerCase(actionType.name())
              + "is already registerd");
    }
  }
}
