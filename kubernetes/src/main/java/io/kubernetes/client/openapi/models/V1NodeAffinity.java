/*
Copyright 2022 The Kubernetes Authors.
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

/** Node affinity is a group of node affinity scheduling rules. */
@ApiModel(description = "Node affinity is a group of node affinity scheduling rules.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1NodeAffinity {
  public static final String SERIALIZED_NAME_PREFERRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION =
      "preferredDuringSchedulingIgnoredDuringExecution";

  @SerializedName(SERIALIZED_NAME_PREFERRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION)
  private List<V1PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution = null;

  public static final String SERIALIZED_NAME_REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION =
      "requiredDuringSchedulingIgnoredDuringExecution";

  @SerializedName(SERIALIZED_NAME_REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION)
  private V1NodeSelector requiredDuringSchedulingIgnoredDuringExecution;

  public V1NodeAffinity preferredDuringSchedulingIgnoredDuringExecution(
      List<V1PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {

    this.preferredDuringSchedulingIgnoredDuringExecution =
        preferredDuringSchedulingIgnoredDuringExecution;
    return this;
  }

  public V1NodeAffinity addPreferredDuringSchedulingIgnoredDuringExecutionItem(
      V1PreferredSchedulingTerm preferredDuringSchedulingIgnoredDuringExecutionItem) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<>();
    }
    this.preferredDuringSchedulingIgnoredDuringExecution.add(
        preferredDuringSchedulingIgnoredDuringExecutionItem);
    return this;
  }

  /**
   * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions
   * specified by this field, but it may choose a node that violates one or more of the expressions.
   * The node that is most preferred is the one with the greatest sum of weights, i.e. for each node
   * that meets all of the scheduling requirements (resource request, requiredDuringScheduling
   * affinity expressions, etc.), compute a sum by iterating through the elements of this field and
   * adding \&quot;weight\&quot; to the sum if the node matches the corresponding matchExpressions;
   * the node(s) with the highest sum are the most preferred.
   *
   * @return preferredDuringSchedulingIgnoredDuringExecution
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding \"weight\" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.")
  public List<V1PreferredSchedulingTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution;
  }

  public void setPreferredDuringSchedulingIgnoredDuringExecution(
      List<V1PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
    this.preferredDuringSchedulingIgnoredDuringExecution =
        preferredDuringSchedulingIgnoredDuringExecution;
  }

  public V1NodeAffinity requiredDuringSchedulingIgnoredDuringExecution(
      V1NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {

    this.requiredDuringSchedulingIgnoredDuringExecution =
        requiredDuringSchedulingIgnoredDuringExecution;
    return this;
  }

  /**
   * Get requiredDuringSchedulingIgnoredDuringExecution
   *
   * @return requiredDuringSchedulingIgnoredDuringExecution
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution() {
    return requiredDuringSchedulingIgnoredDuringExecution;
  }

  public void setRequiredDuringSchedulingIgnoredDuringExecution(
      V1NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
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
    V1NodeAffinity v1NodeAffinity = (V1NodeAffinity) o;
    return Objects.equals(
            this.preferredDuringSchedulingIgnoredDuringExecution,
            v1NodeAffinity.preferredDuringSchedulingIgnoredDuringExecution)
        && Objects.equals(
            this.requiredDuringSchedulingIgnoredDuringExecution,
            v1NodeAffinity.requiredDuringSchedulingIgnoredDuringExecution);
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
    sb.append("class V1NodeAffinity {\n");
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
