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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Namespaces to be selected for PrometheusRules discovery. If unspecified, only the same namespace
 * as the Prometheus object is in is used.
 */
@ApiModel(
    description =
        "Namespaces to be selected for PrometheusRules discovery. If unspecified, only the same namespace as the Prometheus object is in is used.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1PrometheusSpecRuleNamespaceSelector {
  public static final String SERIALIZED_NAME_MATCH_EXPRESSIONS = "matchExpressions";

  @SerializedName(SERIALIZED_NAME_MATCH_EXPRESSIONS)
  private List<V1ServiceMonitorSpecSelectorMatchExpressions> matchExpressions = null;

  public static final String SERIALIZED_NAME_MATCH_LABELS = "matchLabels";

  @SerializedName(SERIALIZED_NAME_MATCH_LABELS)
  private Map<String, String> matchLabels = null;

  public V1PrometheusSpecRuleNamespaceSelector matchExpressions(
      List<V1ServiceMonitorSpecSelectorMatchExpressions> matchExpressions) {

    this.matchExpressions = matchExpressions;
    return this;
  }

  public V1PrometheusSpecRuleNamespaceSelector addMatchExpressionsItem(
      V1ServiceMonitorSpecSelectorMatchExpressions matchExpressionsItem) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList<V1ServiceMonitorSpecSelectorMatchExpressions>();
    }
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }

  /**
   * matchExpressions is a list of label selector requirements. The requirements are ANDed.
   *
   * @return matchExpressions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "matchExpressions is a list of label selector requirements. The requirements are ANDed.")
  public List<V1ServiceMonitorSpecSelectorMatchExpressions> getMatchExpressions() {
    return matchExpressions;
  }

  public void setMatchExpressions(
      List<V1ServiceMonitorSpecSelectorMatchExpressions> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }

  public V1PrometheusSpecRuleNamespaceSelector matchLabels(Map<String, String> matchLabels) {

    this.matchLabels = matchLabels;
    return this;
  }

  public V1PrometheusSpecRuleNamespaceSelector putMatchLabelsItem(
      String key, String matchLabelsItem) {
    if (this.matchLabels == null) {
      this.matchLabels = new HashMap<String, String>();
    }
    this.matchLabels.put(key, matchLabelsItem);
    return this;
  }

  /**
   * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is
   * equivalent to an element of matchExpressions, whose key field is \&quot;key\&quot;, the
   * operator is \&quot;In\&quot;, and the values array contains only \&quot;value\&quot;. The
   * requirements are ANDed.
   *
   * @return matchLabels
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is \"key\", the operator is \"In\", and the values array contains only \"value\". The requirements are ANDed.")
  public Map<String, String> getMatchLabels() {
    return matchLabels;
  }

  public void setMatchLabels(Map<String, String> matchLabels) {
    this.matchLabels = matchLabels;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PrometheusSpecRuleNamespaceSelector v1PrometheusSpecRuleNamespaceSelector =
        (V1PrometheusSpecRuleNamespaceSelector) o;
    return Objects.equals(
            this.matchExpressions, v1PrometheusSpecRuleNamespaceSelector.matchExpressions)
        && Objects.equals(this.matchLabels, v1PrometheusSpecRuleNamespaceSelector.matchLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpressions, matchLabels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusSpecRuleNamespaceSelector {\n");
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
    sb.append("    matchLabels: ").append(toIndentedString(matchLabels)).append("\n");
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
