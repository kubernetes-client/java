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
import io.kubernetes.client.openapi.models.V1alpha1MatchResources;
import io.kubernetes.client.openapi.models.V1alpha1ParamRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MutatingAdmissionPolicyBindingSpec is the specification of the MutatingAdmissionPolicyBinding.
 */
@ApiModel(description = "MutatingAdmissionPolicyBindingSpec is the specification of the MutatingAdmissionPolicyBinding.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-22T21:20:49.874193Z[Etc/UTC]")
public class V1alpha1MutatingAdmissionPolicyBindingSpec {
  public static final String SERIALIZED_NAME_MATCH_RESOURCES = "matchResources";
  @SerializedName(SERIALIZED_NAME_MATCH_RESOURCES)
  private V1alpha1MatchResources matchResources;

  public static final String SERIALIZED_NAME_PARAM_REF = "paramRef";
  @SerializedName(SERIALIZED_NAME_PARAM_REF)
  private V1alpha1ParamRef paramRef;

  public static final String SERIALIZED_NAME_POLICY_NAME = "policyName";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  private String policyName;


  public V1alpha1MutatingAdmissionPolicyBindingSpec matchResources(V1alpha1MatchResources matchResources) {

    this.matchResources = matchResources;
    return this;
  }

   /**
   * Get matchResources
   * @return matchResources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1MatchResources getMatchResources() {
    return matchResources;
  }


  public void setMatchResources(V1alpha1MatchResources matchResources) {
    this.matchResources = matchResources;
  }


  public V1alpha1MutatingAdmissionPolicyBindingSpec paramRef(V1alpha1ParamRef paramRef) {

    this.paramRef = paramRef;
    return this;
  }

   /**
   * Get paramRef
   * @return paramRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1ParamRef getParamRef() {
    return paramRef;
  }


  public void setParamRef(V1alpha1ParamRef paramRef) {
    this.paramRef = paramRef;
  }


  public V1alpha1MutatingAdmissionPolicyBindingSpec policyName(String policyName) {

    this.policyName = policyName;
    return this;
  }

   /**
   * policyName references a MutatingAdmissionPolicy name which the MutatingAdmissionPolicyBinding binds to. If the referenced resource does not exist, this binding is considered invalid and will be ignored Required.
   * @return policyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "policyName references a MutatingAdmissionPolicy name which the MutatingAdmissionPolicyBinding binds to. If the referenced resource does not exist, this binding is considered invalid and will be ignored Required.")

  public String getPolicyName() {
    return policyName;
  }


  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1MutatingAdmissionPolicyBindingSpec v1alpha1MutatingAdmissionPolicyBindingSpec = (V1alpha1MutatingAdmissionPolicyBindingSpec) o;
    return Objects.equals(this.matchResources, v1alpha1MutatingAdmissionPolicyBindingSpec.matchResources) &&
        Objects.equals(this.paramRef, v1alpha1MutatingAdmissionPolicyBindingSpec.paramRef) &&
        Objects.equals(this.policyName, v1alpha1MutatingAdmissionPolicyBindingSpec.policyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchResources, paramRef, policyName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1MutatingAdmissionPolicyBindingSpec {\n");
    sb.append("    matchResources: ").append(toIndentedString(matchResources)).append("\n");
    sb.append("    paramRef: ").append(toIndentedString(paramRef)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
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
