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
import io.kubernetes.client.openapi.models.V1Condition;
import io.kubernetes.client.openapi.models.V1beta1TypeChecking;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ValidatingAdmissionPolicyStatus represents the status of an admission validation policy.
 */
@ApiModel(description = "ValidatingAdmissionPolicyStatus represents the status of an admission validation policy.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1beta1ValidatingAdmissionPolicyStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1Condition> conditions = null;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_TYPE_CHECKING = "typeChecking";
  @SerializedName(SERIALIZED_NAME_TYPE_CHECKING)
  private V1beta1TypeChecking typeChecking;


  public V1beta1ValidatingAdmissionPolicyStatus conditions(List<V1Condition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1beta1ValidatingAdmissionPolicyStatus addConditionsItem(V1Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * The conditions represent the latest available observations of a policy&#39;s current state.
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The conditions represent the latest available observations of a policy's current state.")

  public List<V1Condition> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1Condition> conditions) {
    this.conditions = conditions;
  }


  public V1beta1ValidatingAdmissionPolicyStatus observedGeneration(Long observedGeneration) {

    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * The generation observed by the controller.
   * @return observedGeneration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The generation observed by the controller.")

  public Long getObservedGeneration() {
    return observedGeneration;
  }


  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  public V1beta1ValidatingAdmissionPolicyStatus typeChecking(V1beta1TypeChecking typeChecking) {

    this.typeChecking = typeChecking;
    return this;
  }

   /**
   * Get typeChecking
   * @return typeChecking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1TypeChecking getTypeChecking() {
    return typeChecking;
  }


  public void setTypeChecking(V1beta1TypeChecking typeChecking) {
    this.typeChecking = typeChecking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ValidatingAdmissionPolicyStatus v1beta1ValidatingAdmissionPolicyStatus = (V1beta1ValidatingAdmissionPolicyStatus) o;
    return Objects.equals(this.conditions, v1beta1ValidatingAdmissionPolicyStatus.conditions) &&
        Objects.equals(this.observedGeneration, v1beta1ValidatingAdmissionPolicyStatus.observedGeneration) &&
        Objects.equals(this.typeChecking, v1beta1ValidatingAdmissionPolicyStatus.typeChecking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, observedGeneration, typeChecking);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ValidatingAdmissionPolicyStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    typeChecking: ").append(toIndentedString(typeChecking)).append("\n");
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
