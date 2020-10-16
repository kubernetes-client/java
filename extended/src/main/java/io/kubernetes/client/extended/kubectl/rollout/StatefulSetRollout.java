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
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.extended.kubectl.rollout.response.RolloutHistory;
import io.kubernetes.client.openapi.models.V1StatefulSet;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import java.io.InputStream;
import java.util.Set;

public class StatefulSetRollout extends Rollout<V1StatefulSet> {

  public StatefulSetRollout(
      GenericKubernetesApi<V1StatefulSet, ? extends KubernetesListObject> api, String name) {
    super(api, name);
  }

  public StatefulSetRollout(
      GenericKubernetesApi<V1StatefulSet, ? extends KubernetesListObject> api,
      String name,
      String namespace) {
    super(api, name, namespace);
  }

  @Override
  public Set<RolloutHistory<V1StatefulSet>> history() {
    return null;
  }

  @Override
  public V1StatefulSet undo() {
    return null;
  }

  @Override
  public InputStream status() {
    return null;
  }

  @Override
  public V1StatefulSet resume() throws KubectlException {
    throw new KubectlException("Unsupported Operation on StatefulSet ");
  }

  @Override
  public V1StatefulSet restart() throws KubectlException {
    validate();
    getResource();

    KubernetesApiResponse<V1StatefulSet> patchResponse =
        getApi().patch(getNamespace(), getName(), getRestartPatch());
    if (patchResponse == null || patchResponse.getObject() == null) {
      throw new KubectlException("Failed to restart resource " + getName());
    }
    return patchResponse.getObject();
  }

  @Override
  public KubernetesObject pause() throws KubectlException {
    throw new KubectlException("Unsupported Operation on StatefulSet ");
  }
}
