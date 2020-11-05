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

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.extended.kubectl.rollout.response.RolloutHistory;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.AppsV1Api;
import io.kubernetes.client.openapi.models.V1ControllerRevision;
import io.kubernetes.client.openapi.models.V1ControllerRevisionList;
import io.kubernetes.client.openapi.models.V1DaemonSet;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1OwnerReference;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DaemonSetRollout extends Rollout<V1DaemonSet> {

  public DaemonSetRollout(
      GenericKubernetesApi<V1DaemonSet, ? extends KubernetesListObject> api,
      String name,
      String namespace) {
    super(api, name, namespace);
  }

  @Override
  public Map<Long, RolloutHistory> history() throws KubectlException {
    validate();
    V1DaemonSet daemonSet = getResource();
    String labelSelector =
        daemonSet.getSpec().getSelector().getMatchLabels().entrySet().stream()
            .map(
                each -> {
                  return each.getKey() + "=" + each.getValue();
                })
            .collect(Collectors.joining(","));
    AppsV1Api appsV1Api = new AppsV1Api(getApiClient());
    Map<Long, RolloutHistory> historyInfo = new HashMap<>();
    try {
      V1ControllerRevisionList controllerRevisionList =
          appsV1Api.listNamespacedControllerRevision(
              getNamespace(), "true", null, null, null, labelSelector, null, null, null, null);
      if (controllerRevisionList != null && controllerRevisionList.getItems() != null) {
        for (V1ControllerRevision each : controllerRevisionList.getItems()) {
          V1OwnerReference ownerReference = getControllerRefernce(each.getMetadata());
          if (ownerReference != null
              && ownerReference.getUid().equals(daemonSet.getMetadata().getUid())) {
            RolloutHistory rolloutHistory =
                new RolloutHistory(unmarshal((LinkedTreeMap) each.getData()));
            historyInfo.put(each.getRevision(), rolloutHistory);
          }
        }
      }
    } catch (ApiException e) {
      throw new KubectlException("Error while fetching Controller Revisions");
    }
    return historyInfo;
  }

  @Override
  public V1DaemonSet undo() {
    return null;
  }

  @Override
  public InputStream status() {
    return null;
  }

  @Override
  public V1DaemonSet resume() throws KubectlException {
    throw new KubectlException("Unsupported Operation on DaemonSet ");
  }

  @Override
  public V1DaemonSet restart() throws KubectlException {
    validate();
    getResource();

    KubernetesApiResponse<V1DaemonSet> patchResponse =
        getApi().patch(getNamespace(), getName(), getRestartPatch());
    if (patchResponse == null || patchResponse.getObject() == null) {
      throw new KubectlException(
          "Failed to restart resource "
              + getName()
              + " returned with status code "
              + patchResponse.getHttpStatusCode());
    }
    return patchResponse.getObject();
  }

  @Override
  public KubernetesObject pause() throws KubectlException {
    throw new KubectlException("Unsupported Operation on DaemonSets");
  }

  private V1OwnerReference getControllerRefernce(V1ObjectMeta meta) {
    for (V1OwnerReference ref : meta.getOwnerReferences()) {
      if (ref.getController()) {
        return ref;
      }
    }
    return null;
  }

  private V1PodTemplateSpec unmarshal(LinkedTreeMap data) {
    Object templateObj = ((LinkedTreeMap) data.get("spec")).get("template");
    Gson gson = new Gson();
    V1PodTemplateSpec podTemplateSpec =
        gson.fromJson(gson.toJsonTree(templateObj), V1PodTemplateSpec.class);
    return podTemplateSpec;
  }
}
