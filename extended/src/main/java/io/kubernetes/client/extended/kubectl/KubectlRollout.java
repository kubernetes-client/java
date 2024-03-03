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
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.AppsV1Api;
import io.kubernetes.client.openapi.models.V1ControllerRevision;
import io.kubernetes.client.openapi.models.V1ControllerRevisionList;
import io.kubernetes.client.openapi.models.V1DaemonSet;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import io.kubernetes.client.openapi.models.V1ReplicaSet;
import io.kubernetes.client.openapi.models.V1StatefulSet;
import io.kubernetes.client.util.labels.LabelSelector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KubectlRollout<ApiType extends KubernetesObject> {

  @FunctionalInterface
  public interface PodTemplateParser {
    V1PodTemplateSpec parse(V1ControllerRevision history) throws ApiException, KubectlException;
  }

  KubectlRollout(Class<ApiType> apiTypeClass) {
    this.apiTypeClass = apiTypeClass;
  }

  private Class<ApiType> apiTypeClass;

  public KubectlRolloutHistory history() {
    return new KubectlRolloutHistory();
  }

 public class KubectlRolloutHistory extends Kubectl.ResourceBuilder<ApiType, KubectlRolloutHistory>
      implements Kubectl.Executable<List<History>> {

    KubectlRolloutHistory() {
      super(KubectlRollout.this.apiTypeClass);
      histories = new ArrayList<>();
      revision = 0;
    }

    public static final String CHANGE_CAUSE_ANNOTATION = "kubernetes.io/change-cause";

    private long revision;

    private final List<History> histories;

    private V1PodTemplateSpec template;

    @Override
    public List<History> execute() throws KubectlException {
      validate();
      AppsV1Api api = new AppsV1Api(this.apiClient);
      refreshDiscovery();
      try {
        if (apiTypeClass.equals(V1Deployment.class)) {
          V1Deployment deployment = api.readNamespacedDeployment(name, namespace).execute();
          deploymentViewHistory(deployment, api);
        } else if (apiTypeClass.equals(V1DaemonSet.class)) {
          V1DaemonSet daemonSet = api.readNamespacedDaemonSet(name, namespace).execute();
          daemonSetViewHistory(daemonSet, api);
        } else if (apiTypeClass.equals(V1StatefulSet.class)) {
          V1StatefulSet statefulSet = api.readNamespacedStatefulSet(name, namespace).execute();
          statefulSetViewHistory(statefulSet, api);
        } else {
          throw new KubectlException("Unsupported class for rollout history: " + apiTypeClass);
        }
        return histories;
      } catch (ApiException ex) {
        throw new KubectlException(ex);
      }
    }

    public KubectlRolloutHistoryRevision revision(int revision) {
      this.revision = revision;
      return new KubectlRolloutHistoryRevision();
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
          historyInfo
              .get(v)
              .getMetadata()
              .getAnnotations()
              .put(CHANGE_CAUSE_ANNOTATION, changeCause);
        }
      }

      if (revision > 0) {
        // get details of a specific revision
        V1PodTemplateSpec template = historyInfo.get(revision);
        if (template == null) {
          throw new ApiException(
              "unable to find the specified revision "
                  + revision
                  + ", supported revisions: ["
                  + historyInfo.keySet().stream()
                      .map(Object::toString)
                      .collect(Collectors.joining(","))
                  + "]");
        }
        this.template = template;
        return;
      }
      List<Long> revisions = new ArrayList<>(historyInfo.keySet());
      revisions.sort(Long::compareTo);
      for (Long revision : revisions) {
        String changeCause = getChangeCause(historyInfo.get(revision).getMetadata());
        if (changeCause == null || changeCause.isEmpty()) {
          changeCause = "<none>";
        }
        histories.add(new History(revision, changeCause));
      }
    }

    private void daemonSetViewHistory(V1DaemonSet daemonSet, AppsV1Api api)
        throws ApiException, KubectlException {
      LabelSelector selector = LabelSelector.parse(daemonSet.getSpec().getSelector());
      List<V1ControllerRevision> historyList = controlledHistory(api, daemonSet, selector);
      parseHistory(
          historyList,
          history -> {
            V1DaemonSet dsOfHistory = applyDaemonSetHistory(history);
            return dsOfHistory.getSpec().getTemplate();
          });
    }

    private V1DaemonSet applyDaemonSetHistory(V1ControllerRevision history)
        throws KubectlException, ApiException {
      String patch = apiClient.getJSON().serialize(history.getData());
      return (V1DaemonSet)
          PatchHelper.dryRunStrategyMergePatch(getGenericApi(), patch, namespace, name);
    }

    private void statefulSetViewHistory(V1StatefulSet statefulSet, AppsV1Api api)
        throws ApiException, KubectlException {
      LabelSelector selector = LabelSelector.parse(statefulSet.getSpec().getSelector());
      List<V1ControllerRevision> historyList = controlledHistory(api, statefulSet, selector);
      parseHistory(
          historyList,
          history -> {
            V1StatefulSet stsOfHistory = applyStatefulSetHistory(history);
            return stsOfHistory.getSpec().getTemplate();
          });
    }

    private V1StatefulSet applyStatefulSetHistory(V1ControllerRevision history)
        throws KubectlException, ApiException {
      String patch = apiClient.getJSON().serialize(history.getData());
      return (V1StatefulSet)
          PatchHelper.dryRunStrategyMergePatch(getGenericApi(), patch, namespace, name);
    }

    private void parseHistory(List<V1ControllerRevision> historyList, PodTemplateParser parser)
        throws ApiException, KubectlException {
      Map<Long, V1ControllerRevision> historyInfo = new HashMap<>();
      for (V1ControllerRevision history : historyList) {
        historyInfo.put(history.getRevision(), history);
      }

      if (revision > 0) {
        V1ControllerRevision history = historyInfo.get(revision);
        if (history == null) {
          throw new ApiException(
              "unable to find the specified revision "
                  + revision
                  + ", supported revisions: ["
                  + historyInfo.keySet().stream()
                      .map(Object::toString)
                      .collect(Collectors.joining(","))
                  + "]");
        }
        template = parser.parse(history);
        return;
      }

      List<Long> revisions = new ArrayList<>(historyInfo.keySet());
      revisions.sort(Long::compareTo);
      for (Long revision : revisions) {
        String changeCause = getChangeCause(historyInfo.get(revision).getMetadata());
        if (changeCause == null || changeCause.isEmpty()) {
          changeCause = "<none>";
        }
        histories.add(new History(revision, changeCause));
      }
    }

    // controlledHistories returns all ControllerRevisions in namespace that selected by selector
    // and
    // owned by accessor
    private List<V1ControllerRevision> controlledHistory(
        AppsV1Api api, KubernetesObject accessor, LabelSelector selector) throws ApiException {
      List<V1ControllerRevision> result = new ArrayList<>();
      V1ControllerRevisionList historyList =
          api.listNamespacedControllerRevision(
              namespace).labelSelector(selector.toString()).execute();
      for (V1ControllerRevision history : historyList.getItems()) {
        if (isControlledBy(history, accessor)) {
          result.add(history);
        }
      }
      return result;
    }

    private boolean isControlledBy(KubernetesObject obj, KubernetesObject owner) {
      return obj.getMetadata().getOwnerReferences().stream()
          .filter(r -> r.getController() != null && r.getController())
          .findAny()
          .map(v1OwnerReference -> v1OwnerReference.getUid().equals(owner.getMetadata().getUid()))
          .orElse(false);
    }

    // getChangeCause returns the change-cause annotation of the input object
    private String getChangeCause(V1ObjectMeta meta) {
      if (meta.getAnnotations() == null) {
        return null;
      }
      return meta.getAnnotations().get(CHANGE_CAUSE_ANNOTATION);
    }

    public class KubectlRolloutHistoryRevision
        extends Kubectl.ResourceBuilder<ApiType, KubectlRolloutHistoryRevision>
        implements Kubectl.Executable<V1PodTemplateSpec> {

      KubectlRolloutHistoryRevision() {
        super(KubectlRolloutHistory.this.apiTypeClass);
      }

      @Override
      public KubectlRolloutHistoryRevision name(String name) {
        KubectlRolloutHistory.this.name(name);
        return super.name(name);
      }

      @Override
      public KubectlRolloutHistoryRevision namespace(String namespace) {
        KubectlRolloutHistory.this.namespace(namespace);
        return super.namespace(namespace);
      }

      @Override
      public KubectlRolloutHistoryRevision apiClient(ApiClient apiClient) {
        KubectlRolloutHistory.this.apiClient(apiClient);
        return super.apiClient(apiClient);
      }

      @Override
      public KubectlRolloutHistoryRevision skipDiscovery() {
        KubectlRolloutHistory.this.skipDiscovery();
        return super.skipDiscovery();
      }

      @Override
      public V1PodTemplateSpec execute() throws KubectlException {
        KubectlRolloutHistory.this.execute();
        return KubectlRolloutHistory.this.template;
      }
    }
  }
}
