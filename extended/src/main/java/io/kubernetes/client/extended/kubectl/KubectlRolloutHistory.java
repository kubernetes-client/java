/*
Copyright 2021 The Kubernetes Authors.
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
import io.kubernetes.client.extended.kubectl.util.deployment.DeploymentHelper;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.AppsV1Api;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import io.kubernetes.client.openapi.models.V1ReplicaSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KubectlRolloutHistory<ApiType extends KubernetesObject>
    extends Kubectl.ResourceBuilder<ApiType, KubectlRolloutHistory<ApiType>>
    implements Kubectl.Executable<ApiType> {

  public static final String CHANGE_CAUSE_ANNOTATION = "kubernetes.io/change-cause";

  public V1PodTemplateSpec getTemplate() {
    return template;
  }

  public List<History> getHistories() {
    return histories;
  }

  public static class History {
    private final long revision;
    private final String changeCause;

    public long getRevision() {
      return revision;
    }

    public String getChangeCause() {
      return changeCause;
    }

    public History(long revision, String changeCause) {
      this.revision = revision;
      this.changeCause = changeCause;
    }

    @Override
    public String toString() {
      return "{revision :" + revision + ", changeCause :" + changeCause + "}";
    }
  }

  private long revision;

  private final List<History> histories;

  private V1PodTemplateSpec template;

  @Override
  public ApiType execute() throws KubectlException {
    validate();
    AppsV1Api api = new AppsV1Api(this.apiClient);
    try {
      if (apiTypeClass.equals(V1Deployment.class)) {
        V1Deployment deployment = api.readNamespacedDeployment(name, namespace, null, null, null);
        deploymentViewHistory(deployment, api);
        return (ApiType) deployment;
      } else {
        throw new KubectlException("Unsupported class for rollout history: " + apiTypeClass);
      }
    } catch (ApiException ex) {
      throw new KubectlException(ex);
    }
  }

  KubectlRolloutHistory(Class<ApiType> apiTypeClass) {
    super(apiTypeClass);
    revision = 0;
    histories = new ArrayList<>();
  }

  public KubectlRolloutHistory<ApiType> revision(int revision) {
    this.revision = revision;
    return this;
  }

  private void validate() throws KubectlException {
    StringBuilder msg = new StringBuilder();
    if (name == null) {
      msg.append("Missing name, ");
    }
    if (namespace == null) {
      msg.append("Missing namespace, ");
    }
    if (revision < 0) {
      msg.append("revision must be a positive integer: ").append(revision);
    }
    if (msg.length() > 0) {
      throw new KubectlException(msg.toString());
    }
  }

  private void deploymentViewHistory(V1Deployment deployment, AppsV1Api api) throws ApiException {
    List<V1ReplicaSet> allOldRSs = new ArrayList<>();
    List<V1ReplicaSet> oldRSs = new ArrayList<>();
    V1ReplicaSet newRs = DeploymentHelper.getAllReplicaSets(deployment, api, oldRSs, allOldRSs);
    if (newRs != null) {
      allOldRSs.add(newRs);
    }
    Map<Long, V1PodTemplateSpec> historyInfo = new HashMap<>();
    for (V1ReplicaSet rs : allOldRSs) {
      Long v = DeploymentHelper.revision(rs.getMetadata());
      historyInfo.put(v, rs.getSpec().getTemplate());
      String changeCause = getChangeCause(rs.getMetadata());
      if (historyInfo.get(v).getMetadata().getAnnotations() == null) {
        historyInfo.get(v).getMetadata().setAnnotations(new HashMap<>());
      }
      if (changeCause != null && changeCause.length() > 0) {
        historyInfo.get(v).getMetadata().getAnnotations().put(CHANGE_CAUSE_ANNOTATION, changeCause);
      }
    }

    if (revision > 0) {
      // get details of a specific revision
      V1PodTemplateSpec template = historyInfo.get(revision);
      if (template == null) {
        throw new ApiException("unable to find the specified revision " + revision);
      }
      this.template = template;
      return;
    }
    List<Long> revisions = new ArrayList<>(historyInfo.keySet());
    revisions.sort(Long::compareTo);
    for (Long revision : revisions) {
      String changeCause =
          historyInfo.get(revision).getMetadata().getAnnotations().get(CHANGE_CAUSE_ANNOTATION);
      if (changeCause == null || changeCause.isEmpty()) {
        changeCause = "<none>";
      }
      histories.add(new History(revision, changeCause));
    }
  }

  // getChangeCause returns the change-cause annotation of the input object
  private static String getChangeCause(V1ObjectMeta meta) {
    return meta.getAnnotations().get(CHANGE_CAUSE_ANNOTATION);
  }
}
