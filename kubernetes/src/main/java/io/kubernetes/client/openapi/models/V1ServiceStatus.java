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

/** ServiceStatus represents the current status of a service. */
@ApiModel(description = "ServiceStatus represents the current status of a service.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ServiceStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1Condition> conditions = null;

  public static final String SERIALIZED_NAME_LOAD_BALANCER = "loadBalancer";

  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER)
  private V1LoadBalancerStatus loadBalancer;

  public V1ServiceStatus conditions(List<V1Condition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1ServiceStatus addConditionsItem(V1Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Current service state
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current service state")
  public List<V1Condition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1Condition> conditions) {
    this.conditions = conditions;
  }

  public V1ServiceStatus loadBalancer(V1LoadBalancerStatus loadBalancer) {

    this.loadBalancer = loadBalancer;
    return this;
  }

  /**
   * Get loadBalancer
   *
   * @return loadBalancer
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LoadBalancerStatus getLoadBalancer() {
    return loadBalancer;
  }

  public void setLoadBalancer(V1LoadBalancerStatus loadBalancer) {
    this.loadBalancer = loadBalancer;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ServiceStatus v1ServiceStatus = (V1ServiceStatus) o;
    return Objects.equals(this.conditions, v1ServiceStatus.conditions)
        && Objects.equals(this.loadBalancer, v1ServiceStatus.loadBalancer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, loadBalancer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServiceStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    loadBalancer: ").append(toIndentedString(loadBalancer)).append("\n");
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
