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
import io.kubernetes.client.custom.V1Patch;
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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KubectlRollout<ApiType extends KubernetesObject> {

  private static final Logger logger = LoggerFactory.getLogger(KubectlRollout.class);

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

  public KubectlRolloutUndo undo() {
    return new KubectlRolloutUndo();
  }

  class KubectlRolloutHistory extends Kubectl.ResourceBuilder<ApiType, KubectlRolloutHistory>
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
          V1Deployment deployment = api.readNamespacedDeployment(name, namespace, null, null, null);
          deploymentViewHistory(deployment, api);
        } else if (apiTypeClass.equals(V1DaemonSet.class)) {
          V1DaemonSet daemonSet = api.readNamespacedDaemonSet(name, namespace, null, null, null);
          daemonSetViewHistory(daemonSet, api);
        } else if (apiTypeClass.equals(V1StatefulSet.class)) {
          V1StatefulSet statefulSet =
              api.readNamespacedStatefulSet(name, namespace, null, null, null);
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
        msg.append("Revision must be a positive integer: ").append(revision);
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
    // and owned by accessor
    private List<V1ControllerRevision> controlledHistory(
        AppsV1Api api, KubernetesObject accessor, LabelSelector selector) throws ApiException {
      List<V1ControllerRevision> result = new ArrayList<>();
      V1ControllerRevisionList historyList =
          api.listNamespacedControllerRevision(
              namespace, null, null, null, null, selector.toString(), null, null, null, null, null);
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

    class KubectlRolloutHistoryRevision
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

  class KubectlRolloutUndo extends Kubectl.ResourceBuilder<ApiType, KubectlRolloutUndo>
      implements Kubectl.Executable<ApiType> {

    private final Set<String> annotationsToSkip =
        new HashSet<String>() {
          {
            add(AnnotationKeyConstants.DEPRECATED_ROLLBACK_TO);
            add(AnnotationKeyConstants.LAST_APPLIED_CONFIG_ANNOTATION);
            add(DeploymentHelper.REVISION_ANNOTATION);
            add(DeploymentHelper.REVISION_HISTORY_ANNOTATION);
            add(DeploymentHelper.DESIRED_REPLICAS_ANNOTATION);
            add(DeploymentHelper.MAX_REPLICAS_ANNOTATION);
          }
        };

    KubectlRolloutUndo() {
      super(KubectlRollout.this.apiTypeClass);
      toRevision = 0L;
    }

    public KubectlRolloutUndo toRevision(long toRevision) {
      this.toRevision = toRevision;
      return this;
    }

    private long toRevision;

    private void validate() throws KubectlException {
      StringBuilder msg = new StringBuilder();
      if (name == null) {
        msg.append("Missing name, ");
      }
      if (namespace == null) {
        msg.append("Missing namespace, ");
      }
      if (toRevision < 0) {
        msg.append("ToRevision must be a positive integer: ").append(toRevision);
      }
      if (msg.length() > 0) {
        throw new KubectlException(msg.toString());
      }
    }

    @Override
    public ApiType execute() throws KubectlException {
      validate();
      AppsV1Api api = new AppsV1Api(this.apiClient);
      refreshDiscovery();
      try {
        if (apiTypeClass.equals(V1Deployment.class)) {
          V1Deployment deployment = api.readNamespacedDeployment(name, namespace, null, null, null);
          return deploymentRollBack(deployment, api);
        } else {
          throw new KubectlException("Unsupported class for rollout history: " + apiTypeClass);
        }
      } catch (ApiException ex) {
        throw new KubectlException(ex);
      }
    }

    private ApiType deploymentRollBack(V1Deployment deployment, AppsV1Api api)
        throws ApiException, KubectlException {
      V1ReplicaSet rsForRevision = deploymentRevision(deployment, api);
      Boolean paused = deployment.getSpec().getPaused();
      if (paused != null && paused) {
        throw new ApiException(
            "Cannot rollback a paused deployment, resume it first and try again");
      }
      if (DeploymentHelper.equalIgnoreHash(
          rsForRevision.getSpec().getTemplate(), deployment.getSpec().getTemplate())) {
        logger.info("Current template already matches revision {}", toRevision);
        return (ApiType) deployment;
      }

      rsForRevision
          .getSpec()
          .getTemplate()
          .getMetadata()
          .getLabels()
          .remove(DeploymentHelper.DEFAULT_DEPLOYMENT_UNIQUE_LABEL_KEY);
      Map<String, String> annotations = new HashMap<>();

      Map<String, String> deploymentAnnotations = deployment.getMetadata().getAnnotations();
      Map<String, String> rsAnnotations = rsForRevision.getMetadata().getAnnotations();
      for (String key : annotationsToSkip) {
        if (deploymentAnnotations == null) {
          break;
        }
        String value = deploymentAnnotations.get(key);
        if (value != null) {
          annotations.put(key, value);
        }
      }

      if (rsAnnotations != null) {
        for (Map.Entry<String, String> entry :
            rsForRevision.getMetadata().getAnnotations().entrySet()) {
          String key = entry.getKey();
          String value = entry.getValue();
          if (!annotationsToSkip.contains(key)) {
            annotations.put(key, value);
          }
        }
      }
      V1Patch patch = getDeploymentPatch(rsForRevision.getSpec().getTemplate(), annotations);
      return getGenericApi()
          .patch(namespace, name, V1Patch.PATCH_FORMAT_JSON_PATCH, patch)
          .throwsApiException()
          .getObject();
    }

    private V1Patch getDeploymentPatch(
        V1PodTemplateSpec template, Map<String, String> annotations) {
      List<Map<String, Object>> opList = new ArrayList<>();
      Map<String, Object> templateOp = new HashMap<>();
      templateOp.put("op", "replace");
      templateOp.put("path", "/spec/template");
      templateOp.put("value", template);

      Map<String, Object> annotationsOp = new HashMap<>();
      annotationsOp.put("op", "replace");
      annotationsOp.put("path", "/metadata/annotations");
      annotationsOp.put("value", annotations);

      opList.add(templateOp);
      opList.add(annotationsOp);

      return new V1Patch(apiClient.getJSON().serialize(opList));
    }

    private V1ReplicaSet deploymentRevision(V1Deployment deployment, AppsV1Api api)
        throws ApiException {
      List<V1ReplicaSet> allOldRSs = new ArrayList<>();
      List<V1ReplicaSet> oldRSs = new ArrayList<>();
      V1ReplicaSet newRs = DeploymentHelper.getAllReplicaSets(deployment, api, oldRSs, allOldRSs);
      if (newRs != null) {
        allOldRSs.add(newRs);
      }
      long latestRevision = -1L;
      long previousRevision = -1L;
      V1ReplicaSet latestReplicaSet = null;
      V1ReplicaSet previousReplicaSet = null;
      for (V1ReplicaSet rs : allOldRSs) {
        long revision = DeploymentHelper.revision(rs.getMetadata());
        if (toRevision == 0) {
          if (latestRevision < revision) {
            previousRevision = latestRevision;
            previousReplicaSet = latestReplicaSet;
            latestRevision = revision;
            latestReplicaSet = rs;
          } else if (previousRevision < revision) {
            previousRevision = revision;
            previousReplicaSet = rs;
          }
        } else if (toRevision == revision) {
          return rs;
        }
      }
      if (toRevision > 0) {
        throw new ApiException("Unable to find specified revision " + toRevision + " in history");
      }
      if (previousReplicaSet == null) {
        throw new ApiException(
            "No rollout history found for deployment " + deployment.getMetadata().getName());
      }
      return previousReplicaSet;
    }
  }
}
