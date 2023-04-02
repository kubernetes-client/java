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

/** AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole */
@ApiModel(
    description =
        "AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1AggregationRule {
  public static final String SERIALIZED_NAME_CLUSTER_ROLE_SELECTORS = "clusterRoleSelectors";

  @SerializedName(SERIALIZED_NAME_CLUSTER_ROLE_SELECTORS)
  private List<V1LabelSelector> clusterRoleSelectors = null;

  public V1AggregationRule clusterRoleSelectors(List<V1LabelSelector> clusterRoleSelectors) {

    this.clusterRoleSelectors = clusterRoleSelectors;
    return this;
  }

  public V1AggregationRule addClusterRoleSelectorsItem(V1LabelSelector clusterRoleSelectorsItem) {
    if (this.clusterRoleSelectors == null) {
      this.clusterRoleSelectors = new ArrayList<>();
    }
    this.clusterRoleSelectors.add(clusterRoleSelectorsItem);
    return this;
  }

  /**
   * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and
   * create the rules. If any of the selectors match, then the ClusterRole&#39;s permissions will be
   * added
   *
   * @return clusterRoleSelectors
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole's permissions will be added")
  public List<V1LabelSelector> getClusterRoleSelectors() {
    return clusterRoleSelectors;
  }

  public void setClusterRoleSelectors(List<V1LabelSelector> clusterRoleSelectors) {
    this.clusterRoleSelectors = clusterRoleSelectors;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AggregationRule v1AggregationRule = (V1AggregationRule) o;
    return Objects.equals(this.clusterRoleSelectors, v1AggregationRule.clusterRoleSelectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterRoleSelectors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AggregationRule {\n");
    sb.append("    clusterRoleSelectors: ")
        .append(toIndentedString(clusterRoleSelectors))
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
