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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone,
 * etc. as some other pod(s)).
 */
@ApiModel(
    description =
        "Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecAffinityPodAntiAffinity {
  public static final String SERIALIZED_NAME_PREFERRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION =
      "preferredDuringSchedulingIgnoredDuringExecution";

  @SerializedName(SERIALIZED_NAME_PREFERRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION)
  private List<V1ThanosRulerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution>
      preferredDuringSchedulingIgnoredDuringExecution = null;

  public static final String SERIALIZED_NAME_REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION =
      "requiredDuringSchedulingIgnoredDuringExecution";

  @SerializedName(SERIALIZED_NAME_REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION)
  private List<V1ThanosRulerSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution>
      requiredDuringSchedulingIgnoredDuringExecution = null;

  public V1ThanosRulerSpecAffinityPodAntiAffinity preferredDuringSchedulingIgnoredDuringExecution(
      List<V1ThanosRulerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution>
          preferredDuringSchedulingIgnoredDuringExecution) {

    this.preferredDuringSchedulingIgnoredDuringExecution =
        preferredDuringSchedulingIgnoredDuringExecution;
    return this;
  }

  public V1ThanosRulerSpecAffinityPodAntiAffinity
      addPreferredDuringSchedulingIgnoredDuringExecutionItem(
          V1ThanosRulerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution
              preferredDuringSchedulingIgnoredDuringExecutionItem) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      this.preferredDuringSchedulingIgnoredDuringExecution =
          new ArrayList<
              V1ThanosRulerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution>();
    }
    this.preferredDuringSchedulingIgnoredDuringExecution.add(
        preferredDuringSchedulingIgnoredDuringExecutionItem);
    return this;
  }

  /**
   * The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions
   * specified by this field, but it may choose a node that violates one or more of the expressions.
   * The node that is most preferred is the one with the greatest sum of weights, i.e. for each node
   * that meets all of the scheduling requirements (resource request, requiredDuringScheduling
   * anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field
   * and adding \&quot;weight\&quot; to the sum if the node has pods which matches the corresponding
   * podAffinityTerm; the node(s) with the highest sum are the most preferred.
   *
   * @return preferredDuringSchedulingIgnoredDuringExecution
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding \"weight\" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.")
  public List<V1ThanosRulerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution>
      getPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution;
  }

  public void setPreferredDuringSchedulingIgnoredDuringExecution(
      List<V1ThanosRulerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution>
          preferredDuringSchedulingIgnoredDuringExecution) {
    this.preferredDuringSchedulingIgnoredDuringExecution =
        preferredDuringSchedulingIgnoredDuringExecution;
  }

  public V1ThanosRulerSpecAffinityPodAntiAffinity requiredDuringSchedulingIgnoredDuringExecution(
      List<V1ThanosRulerSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution>
          requiredDuringSchedulingIgnoredDuringExecution) {

    this.requiredDuringSchedulingIgnoredDuringExecution =
        requiredDuringSchedulingIgnoredDuringExecution;
    return this;
  }

  public V1ThanosRulerSpecAffinityPodAntiAffinity
      addRequiredDuringSchedulingIgnoredDuringExecutionItem(
          V1ThanosRulerSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution
              requiredDuringSchedulingIgnoredDuringExecutionItem) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {
      this.requiredDuringSchedulingIgnoredDuringExecution =
          new ArrayList<
              V1ThanosRulerSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution>();
    }
    this.requiredDuringSchedulingIgnoredDuringExecution.add(
        requiredDuringSchedulingIgnoredDuringExecutionItem);
    return this;
  }

  /**
   * If the anti-affinity requirements specified by this field are not met at scheduling time, the
   * pod will not be scheduled onto the node. If the anti-affinity requirements specified by this
   * field cease to be met at some point during pod execution (e.g. due to a pod label update), the
   * system may or may not try to eventually evict the pod from its node. When there are multiple
   * elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all
   * terms must be satisfied.
   *
   * @return requiredDuringSchedulingIgnoredDuringExecution
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.")
  public List<V1ThanosRulerSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution>
      getRequiredDuringSchedulingIgnoredDuringExecution() {
    return requiredDuringSchedulingIgnoredDuringExecution;
  }

  public void setRequiredDuringSchedulingIgnoredDuringExecution(
      List<V1ThanosRulerSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution>
          requiredDuringSchedulingIgnoredDuringExecution) {
    this.requiredDuringSchedulingIgnoredDuringExecution =
        requiredDuringSchedulingIgnoredDuringExecution;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecAffinityPodAntiAffinity v1ThanosRulerSpecAffinityPodAntiAffinity =
        (V1ThanosRulerSpecAffinityPodAntiAffinity) o;
    return Objects.equals(
            this.preferredDuringSchedulingIgnoredDuringExecution,
            v1ThanosRulerSpecAffinityPodAntiAffinity
                .preferredDuringSchedulingIgnoredDuringExecution)
        && Objects.equals(
            this.requiredDuringSchedulingIgnoredDuringExecution,
            v1ThanosRulerSpecAffinityPodAntiAffinity
                .requiredDuringSchedulingIgnoredDuringExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        preferredDuringSchedulingIgnoredDuringExecution,
        requiredDuringSchedulingIgnoredDuringExecution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecAffinityPodAntiAffinity {\n");
    sb.append("    preferredDuringSchedulingIgnoredDuringExecution: ")
        .append(toIndentedString(preferredDuringSchedulingIgnoredDuringExecution))
        .append("\n");
    sb.append("    requiredDuringSchedulingIgnoredDuringExecution: ")
        .append(toIndentedString(requiredDuringSchedulingIgnoredDuringExecution))
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
