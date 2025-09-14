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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ContainerRestartRuleOnExitCodes describes the condition for handling an exited container based on its exit codes.
 */
@ApiModel(description = "ContainerRestartRuleOnExitCodes describes the condition for handling an exited container based on its exit codes.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T23:11:52.603861Z[Etc/UTC]")
public class V1ContainerRestartRuleOnExitCodes {
  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<Integer> values = null;


  public V1ContainerRestartRuleOnExitCodes operator(String operator) {

    this.operator = operator;
    return this;
  }

   /**
   * Represents the relationship between the container exit code(s) and the specified values. Possible values are: - In: the requirement is satisfied if the container exit code is in the   set of specified values. - NotIn: the requirement is satisfied if the container exit code is   not in the set of specified values.
   * @return operator
  **/
  @ApiModelProperty(required = true, value = "Represents the relationship between the container exit code(s) and the specified values. Possible values are: - In: the requirement is satisfied if the container exit code is in the   set of specified values. - NotIn: the requirement is satisfied if the container exit code is   not in the set of specified values.")

  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public V1ContainerRestartRuleOnExitCodes values(List<Integer> values) {

    this.values = values;
    return this;
  }

  public V1ContainerRestartRuleOnExitCodes addValuesItem(Integer valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Specifies the set of values to check for container exit codes. At most 255 elements are allowed.
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the set of values to check for container exit codes. At most 255 elements are allowed.")

  public List<Integer> getValues() {
    return values;
  }


  public void setValues(List<Integer> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerRestartRuleOnExitCodes v1ContainerRestartRuleOnExitCodes = (V1ContainerRestartRuleOnExitCodes) o;
    return Objects.equals(this.operator, v1ContainerRestartRuleOnExitCodes.operator) &&
        Objects.equals(this.values, v1ContainerRestartRuleOnExitCodes.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerRestartRuleOnExitCodes {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
