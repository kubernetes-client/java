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

/** Specification of desired alerting rule definitions for Prometheus. */
@ApiModel(description = "Specification of desired alerting rule definitions for Prometheus.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1PrometheusRuleSpec {
  public static final String SERIALIZED_NAME_GROUPS = "groups";

  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<V1PrometheusRuleSpecGroups> groups = null;

  public V1PrometheusRuleSpec groups(List<V1PrometheusRuleSpecGroups> groups) {

    this.groups = groups;
    return this;
  }

  public V1PrometheusRuleSpec addGroupsItem(V1PrometheusRuleSpecGroups groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<V1PrometheusRuleSpecGroups>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Content of Prometheus rule file
   *
   * @return groups
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Content of Prometheus rule file")
  public List<V1PrometheusRuleSpecGroups> getGroups() {
    return groups;
  }

  public void setGroups(List<V1PrometheusRuleSpecGroups> groups) {
    this.groups = groups;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PrometheusRuleSpec v1PrometheusRuleSpec = (V1PrometheusRuleSpec) o;
    return Objects.equals(this.groups, v1PrometheusRuleSpec.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusRuleSpec {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
