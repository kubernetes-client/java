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
import io.kubernetes.client.openapi.models.V1beta1MatchCondition;
import io.kubernetes.client.openapi.models.V1beta1MatchResources;
import io.kubernetes.client.openapi.models.V1beta1Mutation;
import io.kubernetes.client.openapi.models.V1beta1ParamKind;
import io.kubernetes.client.openapi.models.V1beta1Variable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MutatingAdmissionPolicySpec is the specification of the desired behavior of the admission policy.
 */
@ApiModel(description = "MutatingAdmissionPolicySpec is the specification of the desired behavior of the admission policy.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T22:12:20.439480Z[Etc/UTC]")
public class V1beta1MutatingAdmissionPolicySpec {
  public static final String SERIALIZED_NAME_FAILURE_POLICY = "failurePolicy";
  @SerializedName(SERIALIZED_NAME_FAILURE_POLICY)
  private String failurePolicy;

  public static final String SERIALIZED_NAME_MATCH_CONDITIONS = "matchConditions";
  @SerializedName(SERIALIZED_NAME_MATCH_CONDITIONS)
  private List<V1beta1MatchCondition> matchConditions = null;

  public static final String SERIALIZED_NAME_MATCH_CONSTRAINTS = "matchConstraints";
  @SerializedName(SERIALIZED_NAME_MATCH_CONSTRAINTS)
  private V1beta1MatchResources matchConstraints;

  public static final String SERIALIZED_NAME_MUTATIONS = "mutations";
  @SerializedName(SERIALIZED_NAME_MUTATIONS)
  private List<V1beta1Mutation> mutations = null;

  public static final String SERIALIZED_NAME_PARAM_KIND = "paramKind";
  @SerializedName(SERIALIZED_NAME_PARAM_KIND)
  private V1beta1ParamKind paramKind;

  public static final String SERIALIZED_NAME_REINVOCATION_POLICY = "reinvocationPolicy";
  @SerializedName(SERIALIZED_NAME_REINVOCATION_POLICY)
  private String reinvocationPolicy;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private List<V1beta1Variable> variables = null;


  public V1beta1MutatingAdmissionPolicySpec failurePolicy(String failurePolicy) {

    this.failurePolicy = failurePolicy;
    return this;
  }

   /**
   * failurePolicy defines how to handle failures for the admission policy. Failures can occur from CEL expression parse errors, type check errors, runtime errors and invalid or mis-configured policy definitions or bindings.  A policy is invalid if paramKind refers to a non-existent Kind. A binding is invalid if paramRef.name refers to a non-existent resource.  failurePolicy does not define how validations that evaluate to false are handled.  Allowed values are Ignore or Fail. Defaults to Fail.
   * @return failurePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "failurePolicy defines how to handle failures for the admission policy. Failures can occur from CEL expression parse errors, type check errors, runtime errors and invalid or mis-configured policy definitions or bindings.  A policy is invalid if paramKind refers to a non-existent Kind. A binding is invalid if paramRef.name refers to a non-existent resource.  failurePolicy does not define how validations that evaluate to false are handled.  Allowed values are Ignore or Fail. Defaults to Fail.")

  public String getFailurePolicy() {
    return failurePolicy;
  }


  public void setFailurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
  }


  public V1beta1MutatingAdmissionPolicySpec matchConditions(List<V1beta1MatchCondition> matchConditions) {

    this.matchConditions = matchConditions;
    return this;
  }

  public V1beta1MutatingAdmissionPolicySpec addMatchConditionsItem(V1beta1MatchCondition matchConditionsItem) {
    if (this.matchConditions == null) {
      this.matchConditions = new ArrayList<>();
    }
    this.matchConditions.add(matchConditionsItem);
    return this;
  }

   /**
   * matchConditions is a list of conditions that must be met for a request to be validated. Match conditions filter requests that have already been matched by the matchConstraints. An empty list of matchConditions matches all requests. There are a maximum of 64 match conditions allowed.  If a parameter object is provided, it can be accessed via the &#x60;params&#x60; handle in the same manner as validation expressions.  The exact matching logic is (in order):   1. If ANY matchCondition evaluates to FALSE, the policy is skipped.   2. If ALL matchConditions evaluate to TRUE, the policy is evaluated.   3. If any matchCondition evaluates to an error (but none are FALSE):      - If failurePolicy&#x3D;Fail, reject the request      - If failurePolicy&#x3D;Ignore, the policy is skipped
   * @return matchConditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "matchConditions is a list of conditions that must be met for a request to be validated. Match conditions filter requests that have already been matched by the matchConstraints. An empty list of matchConditions matches all requests. There are a maximum of 64 match conditions allowed.  If a parameter object is provided, it can be accessed via the `params` handle in the same manner as validation expressions.  The exact matching logic is (in order):   1. If ANY matchCondition evaluates to FALSE, the policy is skipped.   2. If ALL matchConditions evaluate to TRUE, the policy is evaluated.   3. If any matchCondition evaluates to an error (but none are FALSE):      - If failurePolicy=Fail, reject the request      - If failurePolicy=Ignore, the policy is skipped")

  public List<V1beta1MatchCondition> getMatchConditions() {
    return matchConditions;
  }


  public void setMatchConditions(List<V1beta1MatchCondition> matchConditions) {
    this.matchConditions = matchConditions;
  }


  public V1beta1MutatingAdmissionPolicySpec matchConstraints(V1beta1MatchResources matchConstraints) {

    this.matchConstraints = matchConstraints;
    return this;
  }

   /**
   * Get matchConstraints
   * @return matchConstraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1MatchResources getMatchConstraints() {
    return matchConstraints;
  }


  public void setMatchConstraints(V1beta1MatchResources matchConstraints) {
    this.matchConstraints = matchConstraints;
  }


  public V1beta1MutatingAdmissionPolicySpec mutations(List<V1beta1Mutation> mutations) {

    this.mutations = mutations;
    return this;
  }

  public V1beta1MutatingAdmissionPolicySpec addMutationsItem(V1beta1Mutation mutationsItem) {
    if (this.mutations == null) {
      this.mutations = new ArrayList<>();
    }
    this.mutations.add(mutationsItem);
    return this;
  }

   /**
   * mutations contain operations to perform on matching objects. mutations may not be empty; a minimum of one mutation is required. mutations are evaluated in order, and are reinvoked according to the reinvocationPolicy. The mutations of a policy are invoked for each binding of this policy and reinvocation of mutations occurs on a per binding basis.
   * @return mutations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "mutations contain operations to perform on matching objects. mutations may not be empty; a minimum of one mutation is required. mutations are evaluated in order, and are reinvoked according to the reinvocationPolicy. The mutations of a policy are invoked for each binding of this policy and reinvocation of mutations occurs on a per binding basis.")

  public List<V1beta1Mutation> getMutations() {
    return mutations;
  }


  public void setMutations(List<V1beta1Mutation> mutations) {
    this.mutations = mutations;
  }


  public V1beta1MutatingAdmissionPolicySpec paramKind(V1beta1ParamKind paramKind) {

    this.paramKind = paramKind;
    return this;
  }

   /**
   * Get paramKind
   * @return paramKind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1ParamKind getParamKind() {
    return paramKind;
  }


  public void setParamKind(V1beta1ParamKind paramKind) {
    this.paramKind = paramKind;
  }


  public V1beta1MutatingAdmissionPolicySpec reinvocationPolicy(String reinvocationPolicy) {

    this.reinvocationPolicy = reinvocationPolicy;
    return this;
  }

   /**
   * reinvocationPolicy indicates whether mutations may be called multiple times per MutatingAdmissionPolicyBinding as part of a single admission evaluation. Allowed values are \&quot;Never\&quot; and \&quot;IfNeeded\&quot;.  Never: These mutations will not be called more than once per binding in a single admission evaluation.  IfNeeded: These mutations may be invoked more than once per binding for a single admission request and there is no guarantee of order with respect to other admission plugins, admission webhooks, bindings of this policy and admission policies.  Mutations are only reinvoked when mutations change the object after this mutation is invoked. Required.
   * @return reinvocationPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "reinvocationPolicy indicates whether mutations may be called multiple times per MutatingAdmissionPolicyBinding as part of a single admission evaluation. Allowed values are \"Never\" and \"IfNeeded\".  Never: These mutations will not be called more than once per binding in a single admission evaluation.  IfNeeded: These mutations may be invoked more than once per binding for a single admission request and there is no guarantee of order with respect to other admission plugins, admission webhooks, bindings of this policy and admission policies.  Mutations are only reinvoked when mutations change the object after this mutation is invoked. Required.")

  public String getReinvocationPolicy() {
    return reinvocationPolicy;
  }


  public void setReinvocationPolicy(String reinvocationPolicy) {
    this.reinvocationPolicy = reinvocationPolicy;
  }


  public V1beta1MutatingAdmissionPolicySpec variables(List<V1beta1Variable> variables) {

    this.variables = variables;
    return this;
  }

  public V1beta1MutatingAdmissionPolicySpec addVariablesItem(V1beta1Variable variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

   /**
   * variables contain definitions of variables that can be used in composition of other expressions. Each variable is defined as a named CEL expression. The variables defined here will be available under &#x60;variables&#x60; in other expressions of the policy except matchConditions because matchConditions are evaluated before the rest of the policy.  The expression of a variable can refer to other variables defined earlier in the list but not those after. Thus, variables must be sorted by the order of first appearance and acyclic.
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "variables contain definitions of variables that can be used in composition of other expressions. Each variable is defined as a named CEL expression. The variables defined here will be available under `variables` in other expressions of the policy except matchConditions because matchConditions are evaluated before the rest of the policy.  The expression of a variable can refer to other variables defined earlier in the list but not those after. Thus, variables must be sorted by the order of first appearance and acyclic.")

  public List<V1beta1Variable> getVariables() {
    return variables;
  }


  public void setVariables(List<V1beta1Variable> variables) {
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
    V1beta1MutatingAdmissionPolicySpec v1beta1MutatingAdmissionPolicySpec = (V1beta1MutatingAdmissionPolicySpec) o;
    return Objects.equals(this.failurePolicy, v1beta1MutatingAdmissionPolicySpec.failurePolicy) &&
        Objects.equals(this.matchConditions, v1beta1MutatingAdmissionPolicySpec.matchConditions) &&
        Objects.equals(this.matchConstraints, v1beta1MutatingAdmissionPolicySpec.matchConstraints) &&
        Objects.equals(this.mutations, v1beta1MutatingAdmissionPolicySpec.mutations) &&
        Objects.equals(this.paramKind, v1beta1MutatingAdmissionPolicySpec.paramKind) &&
        Objects.equals(this.reinvocationPolicy, v1beta1MutatingAdmissionPolicySpec.reinvocationPolicy) &&
        Objects.equals(this.variables, v1beta1MutatingAdmissionPolicySpec.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failurePolicy, matchConditions, matchConstraints, mutations, paramKind, reinvocationPolicy, variables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1MutatingAdmissionPolicySpec {\n");
    sb.append("    failurePolicy: ").append(toIndentedString(failurePolicy)).append("\n");
    sb.append("    matchConditions: ").append(toIndentedString(matchConditions)).append("\n");
    sb.append("    matchConstraints: ").append(toIndentedString(matchConstraints)).append("\n");
    sb.append("    mutations: ").append(toIndentedString(mutations)).append("\n");
    sb.append("    paramKind: ").append(toIndentedString(paramKind)).append("\n");
    sb.append("    reinvocationPolicy: ").append(toIndentedString(reinvocationPolicy)).append("\n");
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
