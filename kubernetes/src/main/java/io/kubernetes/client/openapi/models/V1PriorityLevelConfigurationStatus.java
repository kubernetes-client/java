/*
Copyright 2025 The Kubernetes Authors.
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1PriorityLevelConfigurationCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PriorityLevelConfigurationStatus represents the current state of a \&quot;request-priority\&quot;.
 */
@ApiModel(description = "PriorityLevelConfigurationStatus represents the current state of a \"request-priority\".")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T23:11:52.603861Z[Etc/UTC]")
public class V1PriorityLevelConfigurationStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1PriorityLevelConfigurationCondition> conditions = null;


  public V1PriorityLevelConfigurationStatus conditions(List<V1PriorityLevelConfigurationCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1PriorityLevelConfigurationStatus addConditionsItem(V1PriorityLevelConfigurationCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * &#x60;conditions&#x60; is the current state of \&quot;request-priority\&quot;.
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`conditions` is the current state of \"request-priority\".")

  public List<V1PriorityLevelConfigurationCondition> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1PriorityLevelConfigurationCondition> conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PriorityLevelConfigurationStatus v1PriorityLevelConfigurationStatus = (V1PriorityLevelConfigurationStatus) o;
    return Objects.equals(this.conditions, v1PriorityLevelConfigurationStatus.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PriorityLevelConfigurationStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
