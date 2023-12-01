/*
Copyright 2023 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1beta3FlowSchemaCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FlowSchemaStatus represents the current state of a FlowSchema.
 */
@ApiModel(description = "FlowSchemaStatus represents the current state of a FlowSchema.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1beta3FlowSchemaStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1beta3FlowSchemaCondition> conditions = null;


  public V1beta3FlowSchemaStatus conditions(List<V1beta3FlowSchemaCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1beta3FlowSchemaStatus addConditionsItem(V1beta3FlowSchemaCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * &#x60;conditions&#x60; is a list of the current states of FlowSchema.
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`conditions` is a list of the current states of FlowSchema.")

  public List<V1beta3FlowSchemaCondition> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1beta3FlowSchemaCondition> conditions) {
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
    V1beta3FlowSchemaStatus v1beta3FlowSchemaStatus = (V1beta3FlowSchemaStatus) o;
    return Objects.equals(this.conditions, v1beta3FlowSchemaStatus.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta3FlowSchemaStatus {\n");
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
