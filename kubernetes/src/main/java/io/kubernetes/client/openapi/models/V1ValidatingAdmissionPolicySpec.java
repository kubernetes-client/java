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
import io.kubernetes.client.openapi.models.V1AuditAnnotation;
import io.kubernetes.client.openapi.models.V1MatchCondition;
import io.kubernetes.client.openapi.models.V1MatchResources;
import io.kubernetes.client.openapi.models.V1ParamKind;
import io.kubernetes.client.openapi.models.V1Validation;
import io.kubernetes.client.openapi.models.V1Variable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ValidatingAdmissionPolicySpec is the specification of the desired behavior of the AdmissionPolicy.
 */
@ApiModel(description = "ValidatingAdmissionPolicySpec is the specification of the desired behavior of the AdmissionPolicy.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T23:11:52.603861Z[Etc/UTC]")
public class V1ValidatingAdmissionPolicySpec {
  public static final String SERIALIZED_NAME_AUDIT_ANNOTATIONS = "auditAnnotations";
  @SerializedName(SERIALIZED_NAME_AUDIT_ANNOTATIONS)
  private List<V1AuditAnnotation> auditAnnotations = null;

  public static final String SERIALIZED_NAME_FAILURE_POLICY = "failurePolicy";
  @SerializedName(SERIALIZED_NAME_FAILURE_POLICY)
  private String failurePolicy;

  public static final String SERIALIZED_NAME_MATCH_CONDITIONS = "matchConditions";
  @SerializedName(SERIALIZED_NAME_MATCH_CONDITIONS)
  private List<V1MatchCondition> matchConditions = null;

  public static final String SERIALIZED_NAME_MATCH_CONSTRAINTS = "matchConstraints";
  @SerializedName(SERIALIZED_NAME_MATCH_CONSTRAINTS)
  private V1MatchResources matchConstraints;

  public static final String SERIALIZED_NAME_PARAM_KIND = "paramKind";
  @SerializedName(SERIALIZED_NAME_PARAM_KIND)
  private V1ParamKind paramKind;

  public static final String SERIALIZED_NAME_VALIDATIONS = "validations";
  @SerializedName(SERIALIZED_NAME_VALIDATIONS)
  private List<V1Validation> validations = null;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private List<V1Variable> variables = null;


  public V1ValidatingAdmissionPolicySpec auditAnnotations(List<V1AuditAnnotation> auditAnnotations) {

    this.auditAnnotations = auditAnnotations;
    return this;
  }

  public V1ValidatingAdmissionPolicySpec addAuditAnnotationsItem(V1AuditAnnotation auditAnnotationsItem) {
    if (this.auditAnnotations == null) {
      this.auditAnnotations = new ArrayList<>();
    }
    this.auditAnnotations.add(auditAnnotationsItem);
    return this;
  }

   /**
   * auditAnnotations contains CEL expressions which are used to produce audit annotations for the audit event of the API request. validations and auditAnnotations may not both be empty; a least one of validations or auditAnnotations is required.
   * @return auditAnnotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "auditAnnotations contains CEL expressions which are used to produce audit annotations for the audit event of the API request. validations and auditAnnotations may not both be empty; a least one of validations or auditAnnotations is required.")

  public List<V1AuditAnnotation> getAuditAnnotations() {
    return auditAnnotations;
  }


  public void setAuditAnnotations(List<V1AuditAnnotation> auditAnnotations) {
    this.auditAnnotations = auditAnnotations;
  }


  public V1ValidatingAdmissionPolicySpec failurePolicy(String failurePolicy) {

    this.failurePolicy = failurePolicy;
    return this;
  }

   /**
   * failurePolicy defines how to handle failures for the admission policy. Failures can occur from CEL expression parse errors, type check errors, runtime errors and invalid or mis-configured policy definitions or bindings.  A policy is invalid if spec.paramKind refers to a non-existent Kind. A binding is invalid if spec.paramRef.name refers to a non-existent resource.  failurePolicy does not define how validations that evaluate to false are handled.  When failurePolicy is set to Fail, ValidatingAdmissionPolicyBinding validationActions define how failures are enforced.  Allowed values are Ignore or Fail. Defaults to Fail.
   * @return failurePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "failurePolicy defines how to handle failures for the admission policy. Failures can occur from CEL expression parse errors, type check errors, runtime errors and invalid or mis-configured policy definitions or bindings.  A policy is invalid if spec.paramKind refers to a non-existent Kind. A binding is invalid if spec.paramRef.name refers to a non-existent resource.  failurePolicy does not define how validations that evaluate to false are handled.  When failurePolicy is set to Fail, ValidatingAdmissionPolicyBinding validationActions define how failures are enforced.  Allowed values are Ignore or Fail. Defaults to Fail.")

  public String getFailurePolicy() {
    return failurePolicy;
  }


  public void setFailurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
  }


  public V1ValidatingAdmissionPolicySpec matchConditions(List<V1MatchCondition> matchConditions) {

    this.matchConditions = matchConditions;
    return this;
  }

  public V1ValidatingAdmissionPolicySpec addMatchConditionsItem(V1MatchCondition matchConditionsItem) {
    if (this.matchConditions == null) {
      this.matchConditions = new ArrayList<>();
    }
    this.matchConditions.add(matchConditionsItem);
    return this;
  }

   /**
   * MatchConditions is a list of conditions that must be met for a request to be validated. Match conditions filter requests that have already been matched by the rules, namespaceSelector, and objectSelector. An empty list of matchConditions matches all requests. There are a maximum of 64 match conditions allowed.  If a parameter object is provided, it can be accessed via the &#x60;params&#x60; handle in the same manner as validation expressions.  The exact matching logic is (in order):   1. If ANY matchCondition evaluates to FALSE, the policy is skipped.   2. If ALL matchConditions evaluate to TRUE, the policy is evaluated.   3. If any matchCondition evaluates to an error (but none are FALSE):      - If failurePolicy&#x3D;Fail, reject the request      - If failurePolicy&#x3D;Ignore, the policy is skipped
   * @return matchConditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MatchConditions is a list of conditions that must be met for a request to be validated. Match conditions filter requests that have already been matched by the rules, namespaceSelector, and objectSelector. An empty list of matchConditions matches all requests. There are a maximum of 64 match conditions allowed.  If a parameter object is provided, it can be accessed via the `params` handle in the same manner as validation expressions.  The exact matching logic is (in order):   1. If ANY matchCondition evaluates to FALSE, the policy is skipped.   2. If ALL matchConditions evaluate to TRUE, the policy is evaluated.   3. If any matchCondition evaluates to an error (but none are FALSE):      - If failurePolicy=Fail, reject the request      - If failurePolicy=Ignore, the policy is skipped")

  public List<V1MatchCondition> getMatchConditions() {
    return matchConditions;
  }


  public void setMatchConditions(List<V1MatchCondition> matchConditions) {
    this.matchConditions = matchConditions;
  }


  public V1ValidatingAdmissionPolicySpec matchConstraints(V1MatchResources matchConstraints) {

    this.matchConstraints = matchConstraints;
    return this;
  }

   /**
   * Get matchConstraints
   * @return matchConstraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1MatchResources getMatchConstraints() {
    return matchConstraints;
  }


  public void setMatchConstraints(V1MatchResources matchConstraints) {
    this.matchConstraints = matchConstraints;
  }


  public V1ValidatingAdmissionPolicySpec paramKind(V1ParamKind paramKind) {

    this.paramKind = paramKind;
    return this;
  }

   /**
   * Get paramKind
   * @return paramKind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ParamKind getParamKind() {
    return paramKind;
  }


  public void setParamKind(V1ParamKind paramKind) {
    this.paramKind = paramKind;
  }


  public V1ValidatingAdmissionPolicySpec validations(List<V1Validation> validations) {

    this.validations = validations;
    return this;
  }

  public V1ValidatingAdmissionPolicySpec addValidationsItem(V1Validation validationsItem) {
    if (this.validations == null) {
      this.validations = new ArrayList<>();
    }
    this.validations.add(validationsItem);
    return this;
  }

   /**
   * Validations contain CEL expressions which is used to apply the validation. Validations and AuditAnnotations may not both be empty; a minimum of one Validations or AuditAnnotations is required.
   * @return validations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Validations contain CEL expressions which is used to apply the validation. Validations and AuditAnnotations may not both be empty; a minimum of one Validations or AuditAnnotations is required.")

  public List<V1Validation> getValidations() {
    return validations;
  }


  public void setValidations(List<V1Validation> validations) {
    this.validations = validations;
  }


  public V1ValidatingAdmissionPolicySpec variables(List<V1Variable> variables) {

    this.variables = variables;
    return this;
  }

  public V1ValidatingAdmissionPolicySpec addVariablesItem(V1Variable variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

   /**
   * Variables contain definitions of variables that can be used in composition of other expressions. Each variable is defined as a named CEL expression. The variables defined here will be available under &#x60;variables&#x60; in other expressions of the policy except MatchConditions because MatchConditions are evaluated before the rest of the policy.  The expression of a variable can refer to other variables defined earlier in the list but not those after. Thus, Variables must be sorted by the order of first appearance and acyclic.
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Variables contain definitions of variables that can be used in composition of other expressions. Each variable is defined as a named CEL expression. The variables defined here will be available under `variables` in other expressions of the policy except MatchConditions because MatchConditions are evaluated before the rest of the policy.  The expression of a variable can refer to other variables defined earlier in the list but not those after. Thus, Variables must be sorted by the order of first appearance and acyclic.")

  public List<V1Variable> getVariables() {
    return variables;
  }


  public void setVariables(List<V1Variable> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ValidatingAdmissionPolicySpec v1ValidatingAdmissionPolicySpec = (V1ValidatingAdmissionPolicySpec) o;
    return Objects.equals(this.auditAnnotations, v1ValidatingAdmissionPolicySpec.auditAnnotations) &&
        Objects.equals(this.failurePolicy, v1ValidatingAdmissionPolicySpec.failurePolicy) &&
        Objects.equals(this.matchConditions, v1ValidatingAdmissionPolicySpec.matchConditions) &&
        Objects.equals(this.matchConstraints, v1ValidatingAdmissionPolicySpec.matchConstraints) &&
        Objects.equals(this.paramKind, v1ValidatingAdmissionPolicySpec.paramKind) &&
        Objects.equals(this.validations, v1ValidatingAdmissionPolicySpec.validations) &&
        Objects.equals(this.variables, v1ValidatingAdmissionPolicySpec.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditAnnotations, failurePolicy, matchConditions, matchConstraints, paramKind, validations, variables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ValidatingAdmissionPolicySpec {\n");
    sb.append("    auditAnnotations: ").append(toIndentedString(auditAnnotations)).append("\n");
    sb.append("    failurePolicy: ").append(toIndentedString(failurePolicy)).append("\n");
    sb.append("    matchConditions: ").append(toIndentedString(matchConditions)).append("\n");
    sb.append("    matchConstraints: ").append(toIndentedString(matchConstraints)).append("\n");
    sb.append("    paramKind: ").append(toIndentedString(paramKind)).append("\n");
    sb.append("    validations: ").append(toIndentedString(validations)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
