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
import io.kubernetes.client.openapi.models.V1alpha1MatchResources;
import io.kubernetes.client.openapi.models.V1alpha1ParamRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ValidatingAdmissionPolicyBindingSpec is the specification of the ValidatingAdmissionPolicyBinding.
 */
@ApiModel(description = "ValidatingAdmissionPolicyBindingSpec is the specification of the ValidatingAdmissionPolicyBinding.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1alpha1ValidatingAdmissionPolicyBindingSpec {
  public static final String SERIALIZED_NAME_MATCH_RESOURCES = "matchResources";
  @SerializedName(SERIALIZED_NAME_MATCH_RESOURCES)
  private V1alpha1MatchResources matchResources;

  public static final String SERIALIZED_NAME_PARAM_REF = "paramRef";
  @SerializedName(SERIALIZED_NAME_PARAM_REF)
  private V1alpha1ParamRef paramRef;

  public static final String SERIALIZED_NAME_POLICY_NAME = "policyName";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  private String policyName;

  public static final String SERIALIZED_NAME_VALIDATION_ACTIONS = "validationActions";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ACTIONS)
  private List<String> validationActions = null;


  public V1alpha1ValidatingAdmissionPolicyBindingSpec matchResources(V1alpha1MatchResources matchResources) {

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


  public V1alpha1ValidatingAdmissionPolicyBindingSpec paramRef(V1alpha1ParamRef paramRef) {

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


  public V1alpha1ValidatingAdmissionPolicyBindingSpec policyName(String policyName) {

    this.policyName = policyName;
    return this;
  }

   /**
   * PolicyName references a ValidatingAdmissionPolicy name which the ValidatingAdmissionPolicyBinding binds to. If the referenced resource does not exist, this binding is considered invalid and will be ignored Required.
   * @return policyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PolicyName references a ValidatingAdmissionPolicy name which the ValidatingAdmissionPolicyBinding binds to. If the referenced resource does not exist, this binding is considered invalid and will be ignored Required.")

  public String getPolicyName() {
    return policyName;
  }


  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }


  public V1alpha1ValidatingAdmissionPolicyBindingSpec validationActions(List<String> validationActions) {

    this.validationActions = validationActions;
    return this;
  }

  public V1alpha1ValidatingAdmissionPolicyBindingSpec addValidationActionsItem(String validationActionsItem) {
    if (this.validationActions == null) {
      this.validationActions = new ArrayList<>();
    }
    this.validationActions.add(validationActionsItem);
    return this;
  }

   /**
   * validationActions declares how Validations of the referenced ValidatingAdmissionPolicy are enforced. If a validation evaluates to false it is always enforced according to these actions.  Failures defined by the ValidatingAdmissionPolicy&#39;s FailurePolicy are enforced according to these actions only if the FailurePolicy is set to Fail, otherwise the failures are ignored. This includes compilation errors, runtime errors and misconfigurations of the policy.  validationActions is declared as a set of action values. Order does not matter. validationActions may not contain duplicates of the same action.  The supported actions values are:  \&quot;Deny\&quot; specifies that a validation failure results in a denied request.  \&quot;Warn\&quot; specifies that a validation failure is reported to the request client in HTTP Warning headers, with a warning code of 299. Warnings can be sent both for allowed or denied admission responses.  \&quot;Audit\&quot; specifies that a validation failure is included in the published audit event for the request. The audit event will contain a &#x60;validation.policy.admission.k8s.io/validation_failure&#x60; audit annotation with a value containing the details of the validation failures, formatted as a JSON list of objects, each with the following fields: - message: The validation failure message string - policy: The resource name of the ValidatingAdmissionPolicy - binding: The resource name of the ValidatingAdmissionPolicyBinding - expressionIndex: The index of the failed validations in the ValidatingAdmissionPolicy - validationActions: The enforcement actions enacted for the validation failure Example audit annotation: &#x60;\&quot;validation.policy.admission.k8s.io/validation_failure\&quot;: \&quot;[{\&quot;message\&quot;: \&quot;Invalid value\&quot;, {\&quot;policy\&quot;: \&quot;policy.example.com\&quot;, {\&quot;binding\&quot;: \&quot;policybinding.example.com\&quot;, {\&quot;expressionIndex\&quot;: \&quot;1\&quot;, {\&quot;validationActions\&quot;: [\&quot;Audit\&quot;]}]\&quot;&#x60;  Clients should expect to handle additional values by ignoring any values not recognized.  \&quot;Deny\&quot; and \&quot;Warn\&quot; may not be used together since this combination needlessly duplicates the validation failure both in the API response body and the HTTP warning headers.  Required.
   * @return validationActions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "validationActions declares how Validations of the referenced ValidatingAdmissionPolicy are enforced. If a validation evaluates to false it is always enforced according to these actions.  Failures defined by the ValidatingAdmissionPolicy's FailurePolicy are enforced according to these actions only if the FailurePolicy is set to Fail, otherwise the failures are ignored. This includes compilation errors, runtime errors and misconfigurations of the policy.  validationActions is declared as a set of action values. Order does not matter. validationActions may not contain duplicates of the same action.  The supported actions values are:  \"Deny\" specifies that a validation failure results in a denied request.  \"Warn\" specifies that a validation failure is reported to the request client in HTTP Warning headers, with a warning code of 299. Warnings can be sent both for allowed or denied admission responses.  \"Audit\" specifies that a validation failure is included in the published audit event for the request. The audit event will contain a `validation.policy.admission.k8s.io/validation_failure` audit annotation with a value containing the details of the validation failures, formatted as a JSON list of objects, each with the following fields: - message: The validation failure message string - policy: The resource name of the ValidatingAdmissionPolicy - binding: The resource name of the ValidatingAdmissionPolicyBinding - expressionIndex: The index of the failed validations in the ValidatingAdmissionPolicy - validationActions: The enforcement actions enacted for the validation failure Example audit annotation: `\"validation.policy.admission.k8s.io/validation_failure\": \"[{\"message\": \"Invalid value\", {\"policy\": \"policy.example.com\", {\"binding\": \"policybinding.example.com\", {\"expressionIndex\": \"1\", {\"validationActions\": [\"Audit\"]}]\"`  Clients should expect to handle additional values by ignoring any values not recognized.  \"Deny\" and \"Warn\" may not be used together since this combination needlessly duplicates the validation failure both in the API response body and the HTTP warning headers.  Required.")

  public List<String> getValidationActions() {
    return validationActions;
  }


  public void setValidationActions(List<String> validationActions) {
    this.validationActions = validationActions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ValidatingAdmissionPolicyBindingSpec v1alpha1ValidatingAdmissionPolicyBindingSpec = (V1alpha1ValidatingAdmissionPolicyBindingSpec) o;
    return Objects.equals(this.matchResources, v1alpha1ValidatingAdmissionPolicyBindingSpec.matchResources) &&
        Objects.equals(this.paramRef, v1alpha1ValidatingAdmissionPolicyBindingSpec.paramRef) &&
        Objects.equals(this.policyName, v1alpha1ValidatingAdmissionPolicyBindingSpec.policyName) &&
        Objects.equals(this.validationActions, v1alpha1ValidatingAdmissionPolicyBindingSpec.validationActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchResources, paramRef, policyName, validationActions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ValidatingAdmissionPolicyBindingSpec {\n");
    sb.append("    matchResources: ").append(toIndentedString(matchResources)).append("\n");
    sb.append("    paramRef: ").append(toIndentedString(paramRef)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    validationActions: ").append(toIndentedString(validationActions)).append("\n");
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
