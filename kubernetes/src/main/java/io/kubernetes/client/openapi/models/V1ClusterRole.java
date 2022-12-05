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

/**
 * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit
 * by a RoleBinding or ClusterRoleBinding.
 */
@ApiModel(
    description =
        "ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ClusterRole implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_AGGREGATION_RULE = "aggregationRule";

  @SerializedName(SERIALIZED_NAME_AGGREGATION_RULE)
  private V1AggregationRule aggregationRule;

  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";

  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_RULES = "rules";

  @SerializedName(SERIALIZED_NAME_RULES)
  private List<V1PolicyRule> rules = null;

  public V1ClusterRole aggregationRule(V1AggregationRule aggregationRule) {

    this.aggregationRule = aggregationRule;
    return this;
  }

  /**
   * Get aggregationRule
   *
   * @return aggregationRule
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1AggregationRule getAggregationRule() {
    return aggregationRule;
  }

  public void setAggregationRule(V1AggregationRule aggregationRule) {
    this.aggregationRule = aggregationRule;
  }

  public V1ClusterRole apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should
   * convert recognized schemas to the latest internal value, and may reject unrecognized values.
   * More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   *
   * @return apiVersion
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1ClusterRole kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer
   * this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More
   * info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   *
   * @return kind
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1ClusterRole metadata(V1ObjectMeta metadata) {

    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   *
   * @return metadata
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1ClusterRole rules(List<V1PolicyRule> rules) {

    this.rules = rules;
    return this;
  }

  public V1ClusterRole addRulesItem(V1PolicyRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * Rules holds all the PolicyRules for this ClusterRole
   *
   * @return rules
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rules holds all the PolicyRules for this ClusterRole")
  public List<V1PolicyRule> getRules() {
    return rules;
  }

  public void setRules(List<V1PolicyRule> rules) {
    this.rules = rules;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterRole v1ClusterRole = (V1ClusterRole) o;
    return Objects.equals(this.aggregationRule, v1ClusterRole.aggregationRule)
        && Objects.equals(this.apiVersion, v1ClusterRole.apiVersion)
        && Objects.equals(this.kind, v1ClusterRole.kind)
        && Objects.equals(this.metadata, v1ClusterRole.metadata)
        && Objects.equals(this.rules, v1ClusterRole.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationRule, apiVersion, kind, metadata, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterRole {\n");
    sb.append("    aggregationRule: ").append(toIndentedString(aggregationRule)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
