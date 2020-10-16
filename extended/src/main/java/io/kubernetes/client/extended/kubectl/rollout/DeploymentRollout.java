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

import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.extended.kubectl.rollout.response.RolloutHistory;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import java.io.InputStream;
import java.util.Set;

public class DeploymentRollout extends Rollout<V1Deployment> {

  private static final String PAUSE_PATCH = "{\"spec\":{\"paused\":%s}}";

  public DeploymentRollout(
      GenericKubernetesApi<V1Deployment, ? extends KubernetesListObject> api, String name) {
    super(api, name);
  }

  public DeploymentRollout(
      GenericKubernetesApi<V1Deployment, ? extends KubernetesListObject> api,
      String name,
      String namespace) {
    super(api, name, namespace);
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
  public InputStream status() {
    return null;
  }

  @Override
  public V1Deployment resume() throws KubectlException {
    validate();
    V1Deployment deployment = getResource();

    if (!deployment.getSpec().getPaused()) {
      throw new KubectlException("Resource " + getName() + " is not paused");
    }

    V1Patch patch = new V1Patch(String.format(PAUSE_PATCH, Boolean.FALSE.toString()));
    KubernetesApiResponse<V1Deployment> patchResponse =
        getApi().patch(getNamespace(), getName(), patch);
    if (patchResponse == null || patchResponse.getObject() == null) {
      throw new KubectlException(
          "Failed to resume resource "
              + getName()
              + " returned with status code "
              + patchResponse.getHttpStatusCode());
    }
    return patchResponse.getObject();
  }

  @Override
  public V1Deployment restart() throws KubectlException {
    validate();
    V1Deployment deployment = getResource();

    // Cannot restart a paused deployment
    if (deployment.getSpec().getPaused()) {
      throw new KubectlException(
          "Resource " + getName() + " is paused, run `rollout resume` first");
    }

    KubernetesApiResponse<V1Deployment> patchResponse =
        getApi().patch(getNamespace(), getName(), getRestartPatch());
    if (patchResponse == null || patchResponse.getObject() == null) {
      throw new KubectlException("Failed to restart resource " + getName());
    }
    return patchResponse.getObject();
  }

  @Override
  public V1Deployment pause() throws KubectlException {
    validate();
    V1Deployment deployment = getResource();

    // Cannot pause an already paused deployment
    if (deployment.getSpec().getPaused()) {
      throw new KubectlException("Resource " + getName() + " is already paused");
    }

    V1Patch patch = new V1Patch(String.format(PAUSE_PATCH, Boolean.TRUE.toString()));
    KubernetesApiResponse<V1Deployment> patchResponse =
        getApi().patch(getNamespace(), getName(), patch);
    if (patchResponse == null || patchResponse.getObject() == null) {
      throw new KubectlException("Failed to pause resource " + getName());
    }
    return patchResponse.getObject();
  }
}
