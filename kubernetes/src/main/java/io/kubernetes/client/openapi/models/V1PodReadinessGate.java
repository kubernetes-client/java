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

/**
 * PodReadinessGate contains the reference to a pod condition
 */
@ApiModel(description = "PodReadinessGate contains the reference to a pod condition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T16:56:46.431280Z[Etc/UTC]")
public class V1PodReadinessGate {
  public static final String SERIALIZED_NAME_CONDITION_TYPE = "conditionType";
  @SerializedName(SERIALIZED_NAME_CONDITION_TYPE)
  private String conditionType;


  public V1PodReadinessGate conditionType(String conditionType) {

    this.conditionType = conditionType;
    return this;
  }

   /**
   * ConditionType refers to a condition in the pod&#39;s condition list with matching type.
   * @return conditionType
  **/
  @ApiModelProperty(required = true, value = "ConditionType refers to a condition in the pod's condition list with matching type.")

  public String getConditionType() {
    return conditionType;
  }


  public void setConditionType(String conditionType) {
    this.conditionType = conditionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodReadinessGate v1PodReadinessGate = (V1PodReadinessGate) o;
    return Objects.equals(this.conditionType, v1PodReadinessGate.conditionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodReadinessGate {\n");
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
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
