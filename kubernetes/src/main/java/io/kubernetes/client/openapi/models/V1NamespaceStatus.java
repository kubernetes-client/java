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

/** NamespaceStatus is information about the current status of a Namespace. */
@ApiModel(description = "NamespaceStatus is information about the current status of a Namespace.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1NamespaceStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1NamespaceCondition> conditions = null;

  public static final String SERIALIZED_NAME_PHASE = "phase";

  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public V1NamespaceStatus conditions(List<V1NamespaceCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1NamespaceStatus addConditionsItem(V1NamespaceCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Represents the latest available observations of a namespace&#39;s current state.
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Represents the latest available observations of a namespace's current state.")
  public List<V1NamespaceCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1NamespaceCondition> conditions) {
    this.conditions = conditions;
  }

  public V1NamespaceStatus phase(String phase) {

    this.phase = phase;
    return this;
  }

  /**
   * Phase is the current lifecycle phase of the namespace. More info:
   * https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
   *
   * @return phase
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/  ")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NamespaceStatus v1NamespaceStatus = (V1NamespaceStatus) o;
    return Objects.equals(this.conditions, v1NamespaceStatus.conditions)
        && Objects.equals(this.phase, v1NamespaceStatus.phase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, phase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NamespaceStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
