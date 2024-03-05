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
 * A null or empty node selector term matches no objects. The requirements of them are ANDed. The
 * TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
 */
@ApiModel(
    description =
        "A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public
class V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms {
  public static final String SERIALIZED_NAME_MATCH_EXPRESSIONS = "matchExpressions";

  @SerializedName(SERIALIZED_NAME_MATCH_EXPRESSIONS)
  private List<V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions> matchExpressions =
      null;

  public static final String SERIALIZED_NAME_MATCH_FIELDS = "matchFields";

  @SerializedName(SERIALIZED_NAME_MATCH_FIELDS)
  private List<V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions> matchFields = null;

  public
  V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms
      matchExpressions(
          List<V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions> matchExpressions) {

    this.matchExpressions = matchExpressions;
    return this;
  }

  public
  V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms
      addMatchExpressionsItem(
          V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions matchExpressionsItem) {
    if (this.matchExpressions == null) {
      this.matchExpressions =
          new ArrayList<V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions>();
    }
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }

  /**
   * A list of node selector requirements by node&#39;s labels.
   *
   * @return matchExpressions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of node selector requirements by node's labels.")
  public List<V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions>
      getMatchExpressions() {
    return matchExpressions;
  }

  public void setMatchExpressions(
      List<V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }

  public
  V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms
      matchFields(
          List<V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions> matchFields) {

    this.matchFields = matchFields;
    return this;
  }

  public
  V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms
      addMatchFieldsItem(
          V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions matchFieldsItem) {
    if (this.matchFields == null) {
      this.matchFields =
          new ArrayList<V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions>();
    }
    this.matchFields.add(matchFieldsItem);
    return this;
  }

  /**
   * A list of node selector requirements by node&#39;s fields.
   *
   * @return matchFields
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of node selector requirements by node's fields.")
  public List<V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions> getMatchFields() {
    return matchFields;
  }

  public void setMatchFields(
      List<V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions> matchFields) {
    this.matchFields = matchFields;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms
        v1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms =
            (V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms)
                o;
    return Objects.equals(
            this.matchExpressions,
            v1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms
                .matchExpressions)
        && Objects.equals(
            this.matchFields,
            v1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms
                .matchFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpressions, matchFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms {\n");
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
    sb.append("    matchFields: ").append(toIndentedString(matchFields)).append("\n");
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
