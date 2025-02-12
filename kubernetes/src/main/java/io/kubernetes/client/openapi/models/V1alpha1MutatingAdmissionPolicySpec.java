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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1alpha1MatchCondition;
import io.kubernetes.client.openapi.models.V1alpha1MatchResources;
import io.kubernetes.client.openapi.models.V1alpha1Mutation;
import io.kubernetes.client.openapi.models.V1alpha1ParamKind;
import io.kubernetes.client.openapi.models.V1alpha1Variable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * MutatingAdmissionPolicySpec is the specification of the desired behavior of the admission policy.
 */
@ApiModel(description = "MutatingAdmissionPolicySpec is the specification of the desired behavior of the admission policy.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T21:15:49.397498Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha1MutatingAdmissionPolicySpec {
  public static final String SERIALIZED_NAME_FAILURE_POLICY = "failurePolicy";
  @SerializedName(SERIALIZED_NAME_FAILURE_POLICY)
  private String failurePolicy;

  public static final String SERIALIZED_NAME_MATCH_CONDITIONS = "matchConditions";
  @SerializedName(SERIALIZED_NAME_MATCH_CONDITIONS)
  private List<V1alpha1MatchCondition> matchConditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_MATCH_CONSTRAINTS = "matchConstraints";
  @SerializedName(SERIALIZED_NAME_MATCH_CONSTRAINTS)
  private V1alpha1MatchResources matchConstraints;

  public static final String SERIALIZED_NAME_MUTATIONS = "mutations";
  @SerializedName(SERIALIZED_NAME_MUTATIONS)
  private List<V1alpha1Mutation> mutations = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARAM_KIND = "paramKind";
  @SerializedName(SERIALIZED_NAME_PARAM_KIND)
  private V1alpha1ParamKind paramKind;

  public static final String SERIALIZED_NAME_REINVOCATION_POLICY = "reinvocationPolicy";
  @SerializedName(SERIALIZED_NAME_REINVOCATION_POLICY)
  private String reinvocationPolicy;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private List<V1alpha1Variable> variables = new ArrayList<>();

  public V1alpha1MutatingAdmissionPolicySpec() {
  }

  public V1alpha1MutatingAdmissionPolicySpec failurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
    return this;
  }

   /**
   * failurePolicy defines how to handle failures for the admission policy. Failures can occur from CEL expression parse errors, type check errors, runtime errors and invalid or mis-configured policy definitions or bindings.  A policy is invalid if paramKind refers to a non-existent Kind. A binding is invalid if paramRef.name refers to a non-existent resource.  failurePolicy does not define how validations that evaluate to false are handled.  Allowed values are Ignore or Fail. Defaults to Fail.
   * @return failurePolicy
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "failurePolicy defines how to handle failures for the admission policy. Failures can occur from CEL expression parse errors, type check errors, runtime errors and invalid or mis-configured policy definitions or bindings.  A policy is invalid if paramKind refers to a non-existent Kind. A binding is invalid if paramRef.name refers to a non-existent resource.  failurePolicy does not define how validations that evaluate to false are handled.  Allowed values are Ignore or Fail. Defaults to Fail.")
  public String getFailurePolicy() {
    return failurePolicy;
  }

  public void setFailurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
  }


  public V1alpha1MutatingAdmissionPolicySpec matchConditions(List<V1alpha1MatchCondition> matchConditions) {
    this.matchConditions = matchConditions;
    return this;
  }

  public V1alpha1MutatingAdmissionPolicySpec addMatchConditionsItem(V1alpha1MatchCondition matchConditionsItem) {
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
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "matchConditions is a list of conditions that must be met for a request to be validated. Match conditions filter requests that have already been matched by the matchConstraints. An empty list of matchConditions matches all requests. There are a maximum of 64 match conditions allowed.  If a parameter object is provided, it can be accessed via the `params` handle in the same manner as validation expressions.  The exact matching logic is (in order):   1. If ANY matchCondition evaluates to FALSE, the policy is skipped.   2. If ALL matchConditions evaluate to TRUE, the policy is evaluated.   3. If any matchCondition evaluates to an error (but none are FALSE):      - If failurePolicy=Fail, reject the request      - If failurePolicy=Ignore, the policy is skipped")
  public List<V1alpha1MatchCondition> getMatchConditions() {
    return matchConditions;
  }

  public void setMatchConditions(List<V1alpha1MatchCondition> matchConditions) {
    this.matchConditions = matchConditions;
  }


  public V1alpha1MutatingAdmissionPolicySpec matchConstraints(V1alpha1MatchResources matchConstraints) {
    this.matchConstraints = matchConstraints;
    return this;
  }

   /**
   * Get matchConstraints
   * @return matchConstraints
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha1MatchResources getMatchConstraints() {
    return matchConstraints;
  }

  public void setMatchConstraints(V1alpha1MatchResources matchConstraints) {
    this.matchConstraints = matchConstraints;
  }


  public V1alpha1MutatingAdmissionPolicySpec mutations(List<V1alpha1Mutation> mutations) {
    this.mutations = mutations;
    return this;
  }

  public V1alpha1MutatingAdmissionPolicySpec addMutationsItem(V1alpha1Mutation mutationsItem) {
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
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "mutations contain operations to perform on matching objects. mutations may not be empty; a minimum of one mutation is required. mutations are evaluated in order, and are reinvoked according to the reinvocationPolicy. The mutations of a policy are invoked for each binding of this policy and reinvocation of mutations occurs on a per binding basis.")
  public List<V1alpha1Mutation> getMutations() {
    return mutations;
  }

  public void setMutations(List<V1alpha1Mutation> mutations) {
    this.mutations = mutations;
  }


  public V1alpha1MutatingAdmissionPolicySpec paramKind(V1alpha1ParamKind paramKind) {
    this.paramKind = paramKind;
    return this;
  }

   /**
   * Get paramKind
   * @return paramKind
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha1ParamKind getParamKind() {
    return paramKind;
  }

  public void setParamKind(V1alpha1ParamKind paramKind) {
    this.paramKind = paramKind;
  }


  public V1alpha1MutatingAdmissionPolicySpec reinvocationPolicy(String reinvocationPolicy) {
    this.reinvocationPolicy = reinvocationPolicy;
    return this;
  }

   /**
   * reinvocationPolicy indicates whether mutations may be called multiple times per MutatingAdmissionPolicyBinding as part of a single admission evaluation. Allowed values are \&quot;Never\&quot; and \&quot;IfNeeded\&quot;.  Never: These mutations will not be called more than once per binding in a single admission evaluation.  IfNeeded: These mutations may be invoked more than once per binding for a single admission request and there is no guarantee of order with respect to other admission plugins, admission webhooks, bindings of this policy and admission policies.  Mutations are only reinvoked when mutations change the object after this mutation is invoked. Required.
   * @return reinvocationPolicy
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "reinvocationPolicy indicates whether mutations may be called multiple times per MutatingAdmissionPolicyBinding as part of a single admission evaluation. Allowed values are \"Never\" and \"IfNeeded\".  Never: These mutations will not be called more than once per binding in a single admission evaluation.  IfNeeded: These mutations may be invoked more than once per binding for a single admission request and there is no guarantee of order with respect to other admission plugins, admission webhooks, bindings of this policy and admission policies.  Mutations are only reinvoked when mutations change the object after this mutation is invoked. Required.")
  public String getReinvocationPolicy() {
    return reinvocationPolicy;
  }

  public void setReinvocationPolicy(String reinvocationPolicy) {
    this.reinvocationPolicy = reinvocationPolicy;
  }


  public V1alpha1MutatingAdmissionPolicySpec variables(List<V1alpha1Variable> variables) {
    this.variables = variables;
    return this;
  }

  public V1alpha1MutatingAdmissionPolicySpec addVariablesItem(V1alpha1Variable variablesItem) {
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
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "variables contain definitions of variables that can be used in composition of other expressions. Each variable is defined as a named CEL expression. The variables defined here will be available under `variables` in other expressions of the policy except matchConditions because matchConditions are evaluated before the rest of the policy.  The expression of a variable can refer to other variables defined earlier in the list but not those after. Thus, variables must be sorted by the order of first appearance and acyclic.")
  public List<V1alpha1Variable> getVariables() {
    return variables;
  }

  public void setVariables(List<V1alpha1Variable> variables) {
    this.variables = variables;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1MutatingAdmissionPolicySpec v1alpha1MutatingAdmissionPolicySpec = (V1alpha1MutatingAdmissionPolicySpec) o;
    return Objects.equals(this.failurePolicy, v1alpha1MutatingAdmissionPolicySpec.failurePolicy) &&
        Objects.equals(this.matchConditions, v1alpha1MutatingAdmissionPolicySpec.matchConditions) &&
        Objects.equals(this.matchConstraints, v1alpha1MutatingAdmissionPolicySpec.matchConstraints) &&
        Objects.equals(this.mutations, v1alpha1MutatingAdmissionPolicySpec.mutations) &&
        Objects.equals(this.paramKind, v1alpha1MutatingAdmissionPolicySpec.paramKind) &&
        Objects.equals(this.reinvocationPolicy, v1alpha1MutatingAdmissionPolicySpec.reinvocationPolicy) &&
        Objects.equals(this.variables, v1alpha1MutatingAdmissionPolicySpec.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failurePolicy, matchConditions, matchConstraints, mutations, paramKind, reinvocationPolicy, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1MutatingAdmissionPolicySpec {\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("failurePolicy");
    openapiFields.add("matchConditions");
    openapiFields.add("matchConstraints");
    openapiFields.add("mutations");
    openapiFields.add("paramKind");
    openapiFields.add("reinvocationPolicy");
    openapiFields.add("variables");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha1MutatingAdmissionPolicySpec
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha1MutatingAdmissionPolicySpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1MutatingAdmissionPolicySpec is not found in the empty JSON string", V1alpha1MutatingAdmissionPolicySpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1MutatingAdmissionPolicySpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1MutatingAdmissionPolicySpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("failurePolicy") != null && !jsonObj.get("failurePolicy").isJsonNull()) && !jsonObj.get("failurePolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failurePolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failurePolicy").toString()));
      }
      if (jsonObj.get("matchConditions") != null && !jsonObj.get("matchConditions").isJsonNull()) {
        JsonArray jsonArraymatchConditions = jsonObj.getAsJsonArray("matchConditions");
        if (jsonArraymatchConditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("matchConditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `matchConditions` to be an array in the JSON string but got `%s`", jsonObj.get("matchConditions").toString()));
          }

          // validate the optional field `matchConditions` (array)
          for (int i = 0; i < jsonArraymatchConditions.size(); i++) {
            V1alpha1MatchCondition.validateJsonElement(jsonArraymatchConditions.get(i));
          };
        }
      }
      // validate the optional field `matchConstraints`
      if (jsonObj.get("matchConstraints") != null && !jsonObj.get("matchConstraints").isJsonNull()) {
        V1alpha1MatchResources.validateJsonElement(jsonObj.get("matchConstraints"));
      }
      if (jsonObj.get("mutations") != null && !jsonObj.get("mutations").isJsonNull()) {
        JsonArray jsonArraymutations = jsonObj.getAsJsonArray("mutations");
        if (jsonArraymutations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("mutations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `mutations` to be an array in the JSON string but got `%s`", jsonObj.get("mutations").toString()));
          }

          // validate the optional field `mutations` (array)
          for (int i = 0; i < jsonArraymutations.size(); i++) {
            V1alpha1Mutation.validateJsonElement(jsonArraymutations.get(i));
          };
        }
      }
      // validate the optional field `paramKind`
      if (jsonObj.get("paramKind") != null && !jsonObj.get("paramKind").isJsonNull()) {
        V1alpha1ParamKind.validateJsonElement(jsonObj.get("paramKind"));
      }
      if ((jsonObj.get("reinvocationPolicy") != null && !jsonObj.get("reinvocationPolicy").isJsonNull()) && !jsonObj.get("reinvocationPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reinvocationPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reinvocationPolicy").toString()));
      }
      if (jsonObj.get("variables") != null && !jsonObj.get("variables").isJsonNull()) {
        JsonArray jsonArrayvariables = jsonObj.getAsJsonArray("variables");
        if (jsonArrayvariables != null) {
          // ensure the json data is an array
          if (!jsonObj.get("variables").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `variables` to be an array in the JSON string but got `%s`", jsonObj.get("variables").toString()));
          }

          // validate the optional field `variables` (array)
          for (int i = 0; i < jsonArrayvariables.size(); i++) {
            V1alpha1Variable.validateJsonElement(jsonArrayvariables.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1MutatingAdmissionPolicySpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1MutatingAdmissionPolicySpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1MutatingAdmissionPolicySpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1MutatingAdmissionPolicySpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1MutatingAdmissionPolicySpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1MutatingAdmissionPolicySpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1MutatingAdmissionPolicySpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1MutatingAdmissionPolicySpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1MutatingAdmissionPolicySpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1MutatingAdmissionPolicySpec
  */
  public static V1alpha1MutatingAdmissionPolicySpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1MutatingAdmissionPolicySpec.class);
  }

 /**
  * Convert an instance of V1alpha1MutatingAdmissionPolicySpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
