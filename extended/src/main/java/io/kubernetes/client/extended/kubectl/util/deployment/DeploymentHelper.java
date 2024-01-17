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
package io.kubernetes.client.extended.kubectl.util.deployment;

import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.AppsV1Api;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1OwnerReference;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import io.kubernetes.client.openapi.models.V1ReplicaSet;
import io.kubernetes.client.openapi.models.V1ReplicaSetList;
import io.kubernetes.client.util.Yaml;
import io.kubernetes.client.util.labels.LabelSelector;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class DeploymentHelper {

  public static final String DEFAULT_DEPLOYMENT_UNIQUE_LABEL_KEY = "pod-template-hash";
  public static final String REVISION_ANNOTATION = "deployment.kubernetes.io/revision";

  /**
   * getAllReplicaSets get the old replica sets and return new replica targeted by the given
   * Deployment. It gets PodList and ReplicaSetList from client interface. Note that the first set
   * of old replica sets doesn't include the ones with no pods, and the second set of old replica
   * sets include all old replica sets. The returned value is the new replica set, and it may be nil
   * if it doesn't exist yet.
   *
   * @param deployment the given deployment
   * @param api the client interface
   * @param oldRSes container of all old ReplicaSet exclude the ones with no pods
   * @param allOldRSes container of all old ReplicaSet
   * @return the new replica set
   */
  public static V1ReplicaSet getAllReplicaSets(
      V1Deployment deployment,
      AppsV1Api api,
      List<V1ReplicaSet> oldRSes,
      List<V1ReplicaSet> allOldRSes)
      throws ApiException {
    List<V1ReplicaSet> rsList = listReplicaSets(deployment, api);
    V1ReplicaSet newRs = findNewReplicaSet(deployment, rsList);
    findOldReplicaSets(rsList, newRs, oldRSes, allOldRSes);
    return newRs;
  }

  /**
   * revision returns the revision number of the input object.
   *
   * @param meta metadata of object
   * @return the revision number
   */
  public static Long revision(V1ObjectMeta meta) {
    if (meta.getAnnotations() == null) return 0L;
    String v = meta.getAnnotations().get(REVISION_ANNOTATION);
    return v == null ? 0L : Long.parseLong(v);
  }

  /**
   * listReplicaSets returns a list of RSes the given deployment targets. Note that this does NOT
   * attempt to reconcile ControllerRef (adopt/orphan), because only the controller itself should do
   * that. However, it does filter out anything whose ControllerRef doesn't match.
   */
  private static List<V1ReplicaSet> listReplicaSets(V1Deployment deployment, AppsV1Api api)
      throws ApiException {
    String namespace = deployment.getMetadata().getNamespace();
    LabelSelector selector = LabelSelector.parse(deployment.getSpec().getSelector());
    List<V1ReplicaSet> all = rsListFromClient(namespace, selector.toString(), api);
    List<V1ReplicaSet> owned = new ArrayList<>(all.size());
    for (V1ReplicaSet rs : all) {
      List<V1OwnerReference> refs = rs.getMetadata().getOwnerReferences();
      Optional<V1OwnerReference> ref =
          refs.stream().filter(o -> o.getController() != null && o.getController()).findAny();
      // Only include those whose ControllerRef matches the Deployment.
      if (ref.isPresent() && ref.get().getUid().equals(deployment.getMetadata().getUid())) {
        owned.add(rs);
      }
    }
    return owned;
  }

  private static List<V1ReplicaSet> rsListFromClient(
      String namespace, String selector, AppsV1Api api) throws ApiException {
    V1ReplicaSetList rsList =
        api.listNamespacedReplicaSet(
            namespace).labelSelector(selector)
                .execute();
    return rsList.getItems();
  }

  /**
   * findNewReplicaSet returns the new RS this given deployment targets (the one with the same pod
   * template)
   */
  private static V1ReplicaSet findNewReplicaSet(
      V1Deployment deployment, List<V1ReplicaSet> rsList) {
    rsList.sort(
        (o1, o2) -> {
          if (o1.getMetadata()
              .getCreationTimestamp()
              .equals(o2.getMetadata().getCreationTimestamp())) {
            return o1.getMetadata().getName().compareTo(o2.getMetadata().getName());
          }
          if (o1.getMetadata()
              .getCreationTimestamp()
              .isBefore(o2.getMetadata().getCreationTimestamp())) {
            return -1;
          }
          return 1;
        });
    for (V1ReplicaSet rs : rsList) {
      if (equalIgnoreHash(rs.getSpec().getTemplate(), deployment.getSpec().getTemplate())) {
        return rs;
      }
    }
    // new ReplicaSet does not exist.
    return null;
  }

  /**
   * EqualIgnoreHash returns true if two given podTemplateSpec are equal, ignoring the diff in value
   * of Labels[pod-template-hash] We ignore pod-template-hash because: 1. The hash result would be
   * different upon podTemplateSpec API changes (e.g. the addition of a new field will cause the
   * hash code to change) 2. The deployment template won't have hash labels
   */
  private static boolean equalIgnoreHash(V1PodTemplateSpec template1, V1PodTemplateSpec template2) {
    if (!Objects.equals(template1.getSpec(), template2.getSpec())) return false;
    V1ObjectMeta m1Copy = objectMetaDeepCopy(template1.getMetadata());
    V1ObjectMeta m2Copy = objectMetaDeepCopy(template2.getMetadata());
    m1Copy.getLabels().remove(DEFAULT_DEPLOYMENT_UNIQUE_LABEL_KEY);
    m2Copy.getLabels().remove(DEFAULT_DEPLOYMENT_UNIQUE_LABEL_KEY);
    return m1Copy.equals(m2Copy);
  }

  /**
   * FindOldReplicaSets returns the old replica sets targeted by the given Deployment, with the
   * given list of RSes. Note that the first set of old replica sets doesn't include the ones with
   * no pods, and the second set of old replica sets include all old replica sets.
   */
  private static void findOldReplicaSets(
      List<V1ReplicaSet> rsList,
      V1ReplicaSet newRs,
      List<V1ReplicaSet> oldRSes,
      List<V1ReplicaSet> allOldRSes) {
    for (V1ReplicaSet rs : rsList) {
      // Filter out new replica set
      if (newRs != null && rs.getMetadata().getUid().equals(newRs.getMetadata().getUid())) {
        continue;
      }
      allOldRSes.add(rs);
      if (!rs.getSpec().getReplicas().equals(0)) {
        oldRSes.add(rs);
      }
    }
  }

  private static V1ObjectMeta objectMetaDeepCopy(V1ObjectMeta meta) {
    String data = Yaml.dump(meta);
    return Yaml.loadAs(data, V1ObjectMeta.class);
  }
}
