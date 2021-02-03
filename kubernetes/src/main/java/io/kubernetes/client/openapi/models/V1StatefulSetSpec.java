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
package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** A StatefulSetSpec is the specification of a StatefulSet. */
@ApiModel(description = "A StatefulSetSpec is the specification of a StatefulSet.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-01-04T09:55:14.976Z[Etc/UTC]")
public class V1StatefulSetSpec {
  public static final String SERIALIZED_NAME_POD_MANAGEMENT_POLICY = "podManagementPolicy";

  @SerializedName(SERIALIZED_NAME_POD_MANAGEMENT_POLICY)
  private String podManagementPolicy;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";

  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_REVISION_HISTORY_LIMIT = "revisionHistoryLimit";

  @SerializedName(SERIALIZED_NAME_REVISION_HISTORY_LIMIT)
  private Integer revisionHistoryLimit;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";

  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1LabelSelector selector;

  public static final String SERIALIZED_NAME_SERVICE_NAME = "serviceName";

  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";

  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private V1PodTemplateSpec template;

  public static final String SERIALIZED_NAME_UPDATE_STRATEGY = "updateStrategy";

  @SerializedName(SERIALIZED_NAME_UPDATE_STRATEGY)
  private V1StatefulSetUpdateStrategy updateStrategy;

  public static final String SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATES = "volumeClaimTemplates";

  @SerializedName(SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATES)
  private List<V1PersistentVolumeClaim> volumeClaimTemplates = null;

  public V1StatefulSetSpec podManagementPolicy(String podManagementPolicy) {

    this.podManagementPolicy = podManagementPolicy;
    return this;
  }

  /**
   * podManagementPolicy controls how pods are created during initial scale up, when replacing pods
   * on nodes, or when scaling down. The default policy is &#x60;OrderedReady&#x60;, where pods are
   * created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each
   * pod is ready before continuing. When scaling down, the pods are removed in the opposite order.
   * The alternative policy is &#x60;Parallel&#x60; which will create pods in parallel to match the
   * desired scale without waiting, and on scale down will delete all pods at once.
   *
   * @return podManagementPolicy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.")
  public String getPodManagementPolicy() {
    return podManagementPolicy;
  }

  public void setPodManagementPolicy(String podManagementPolicy) {
    this.podManagementPolicy = podManagementPolicy;
  }

  public V1StatefulSetSpec replicas(Integer replicas) {

    this.replicas = replicas;
    return this;
  }

  /**
   * replicas is the desired number of replicas of the given Template. These are replicas in the
   * sense that they are instantiations of the same Template, but individual replicas also have a
   * consistent identity. If unspecified, defaults to 1.
   *
   * @return replicas
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public V1StatefulSetSpec revisionHistoryLimit(Integer revisionHistoryLimit) {

    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

  /**
   * revisionHistoryLimit is the maximum number of revisions that will be maintained in the
   * StatefulSet&#39;s revision history. The revision history consists of all revisions not
   * represented by a currently applied StatefulSetSpec version. The default value is 10.
   *
   * @return revisionHistoryLimit
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet's revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.")
  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }

  public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }

  public V1StatefulSetSpec selector(V1LabelSelector selector) {

    this.selector = selector;
    return this;
  }

  /**
   * Get selector
   *
   * @return selector
   */
  @ApiModelProperty(required = true, value = "")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }

  public V1StatefulSetSpec serviceName(String serviceName) {

    this.serviceName = serviceName;
    return this;
  }

  /**
   * serviceName is the name of the service that governs this StatefulSet. This service must exist
   * before the StatefulSet, and is responsible for the network identity of the set. Pods get
   * DNS/hostnames that follow the pattern:
   * pod-specific-string.serviceName.default.svc.cluster.local where
   * \&quot;pod-specific-string\&quot; is managed by the StatefulSet controller.
   *
   * @return serviceName
   */
  @ApiModelProperty(
      required = true,
      value =
          "serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where \"pod-specific-string\" is managed by the StatefulSet controller.")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public V1StatefulSetSpec template(V1PodTemplateSpec template) {

    this.template = template;
    return this;
  }

  /**
   * Get template
   *
   * @return template
   */
  @ApiModelProperty(required = true, value = "")
  public V1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(V1PodTemplateSpec template) {
    this.template = template;
  }

  public V1StatefulSetSpec updateStrategy(V1StatefulSetUpdateStrategy updateStrategy) {

    this.updateStrategy = updateStrategy;
    return this;
  }

  /**
   * Get updateStrategy
   *
   * @return updateStrategy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1StatefulSetUpdateStrategy getUpdateStrategy() {
    return updateStrategy;
  }

  public void setUpdateStrategy(V1StatefulSetUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
  }

  public V1StatefulSetSpec volumeClaimTemplates(
      List<V1PersistentVolumeClaim> volumeClaimTemplates) {

    this.volumeClaimTemplates = volumeClaimTemplates;
    return this;
  }

  public V1StatefulSetSpec addVolumeClaimTemplatesItem(
      V1PersistentVolumeClaim volumeClaimTemplatesItem) {
    if (this.volumeClaimTemplates == null) {
      this.volumeClaimTemplates = new ArrayList<>();
    }
    this.volumeClaimTemplates.add(volumeClaimTemplatesItem);
    return this;
  }

  /**
   * volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet
   * controller is responsible for mapping network identities to claims in a way that maintains the
   * identity of a pod. Every claim in this list must have at least one matching (by name)
   * volumeMount in one container in the template. A claim in this list takes precedence over any
   * volumes in the template, with the same name.
   *
   * @return volumeClaimTemplates
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.")
  public List<V1PersistentVolumeClaim> getVolumeClaimTemplates() {
    return volumeClaimTemplates;
  }

  public void setVolumeClaimTemplates(List<V1PersistentVolumeClaim> volumeClaimTemplates) {
    this.volumeClaimTemplates = volumeClaimTemplates;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1StatefulSetSpec v1StatefulSetSpec = (V1StatefulSetSpec) o;
    return Objects.equals(this.podManagementPolicy, v1StatefulSetSpec.podManagementPolicy)
        && Objects.equals(this.replicas, v1StatefulSetSpec.replicas)
        && Objects.equals(this.revisionHistoryLimit, v1StatefulSetSpec.revisionHistoryLimit)
        && Objects.equals(this.selector, v1StatefulSetSpec.selector)
        && Objects.equals(this.serviceName, v1StatefulSetSpec.serviceName)
        && Objects.equals(this.template, v1StatefulSetSpec.template)
        && Objects.equals(this.updateStrategy, v1StatefulSetSpec.updateStrategy)
        && Objects.equals(this.volumeClaimTemplates, v1StatefulSetSpec.volumeClaimTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        podManagementPolicy,
        replicas,
        revisionHistoryLimit,
        selector,
        serviceName,
        template,
        updateStrategy,
        volumeClaimTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1StatefulSetSpec {\n");
    sb.append("    podManagementPolicy: ")
        .append(toIndentedString(podManagementPolicy))
        .append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    revisionHistoryLimit: ")
        .append(toIndentedString(revisionHistoryLimit))
        .append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    updateStrategy: ").append(toIndentedString(updateStrategy)).append("\n");
    sb.append("    volumeClaimTemplates: ")
        .append(toIndentedString(volumeClaimTemplates))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
