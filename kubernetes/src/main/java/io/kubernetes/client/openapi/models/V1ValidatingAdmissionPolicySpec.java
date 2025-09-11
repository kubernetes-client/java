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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * ValidatingAdmissionPolicySpec is the specification of the desired behavior of the AdmissionPolicy.
 */
@ApiModel(description = "ValidatingAdmissionPolicySpec is the specification of the desired behavior of the AdmissionPolicy.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ValidatingAdmissionPolicySpec {
  public static final String SERIALIZED_NAME_AUDIT_ANNOTATIONS = "auditAnnotations";
  @SerializedName(SERIALIZED_NAME_AUDIT_ANNOTATIONS)
  @jakarta.annotation.Nullable
  private List<V1AuditAnnotation> auditAnnotations = new ArrayList<>();

  public static final String SERIALIZED_NAME_FAILURE_POLICY = "failurePolicy";
  @SerializedName(SERIALIZED_NAME_FAILURE_POLICY)
  @jakarta.annotation.Nullable
  private String failurePolicy;

  public static final String SERIALIZED_NAME_MATCH_CONDITIONS = "matchConditions";
  @SerializedName(SERIALIZED_NAME_MATCH_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<V1MatchCondition> matchConditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_MATCH_CONSTRAINTS = "matchConstraints";
  @SerializedName(SERIALIZED_NAME_MATCH_CONSTRAINTS)
  @jakarta.annotation.Nullable
  private V1MatchResources matchConstraints;

  public static final String SERIALIZED_NAME_PARAM_KIND = "paramKind";
  @SerializedName(SERIALIZED_NAME_PARAM_KIND)
  @jakarta.annotation.Nullable
  private V1ParamKind paramKind;

  public static final String SERIALIZED_NAME_VALIDATIONS = "validations";
  @SerializedName(SERIALIZED_NAME_VALIDATIONS)
  @jakarta.annotation.Nullable
  private List<V1Validation> validations = new ArrayList<>();

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  @jakarta.annotation.Nullable
  private List<V1Variable> variables = new ArrayList<>();

  public V1ValidatingAdmissionPolicySpec() {
  }

  public V1ValidatingAdmissionPolicySpec auditAnnotations(@jakarta.annotation.Nullable List<V1AuditAnnotation> auditAnnotations) {
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
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "auditAnnotations contains CEL expressions which are used to produce audit annotations for the audit event of the API request. validations and auditAnnotations may not both be empty; a least one of validations or auditAnnotations is required.")
  public List<V1AuditAnnotation> getAuditAnnotations() {
    return auditAnnotations;
  }

  public void setAuditAnnotations(@jakarta.annotation.Nullable List<V1AuditAnnotation> auditAnnotations) {
    this.auditAnnotations = auditAnnotations;
  }


  public V1ValidatingAdmissionPolicySpec failurePolicy(@jakarta.annotation.Nullable String failurePolicy) {
    this.failurePolicy = failurePolicy;
    return this;
  }

  /**
   * failurePolicy defines how to handle failures for the admission policy. Failures can occur from CEL expression parse errors, type check errors, runtime errors and invalid or mis-configured policy definitions or bindings.  A policy is invalid if spec.paramKind refers to a non-existent Kind. A binding is invalid if spec.paramRef.name refers to a non-existent resource.  failurePolicy does not define how validations that evaluate to false are handled.  When failurePolicy is set to Fail, ValidatingAdmissionPolicyBinding validationActions define how failures are enforced.  Allowed values are Ignore or Fail. Defaults to Fail.
   * @return failurePolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "failurePolicy defines how to handle failures for the admission policy. Failures can occur from CEL expression parse errors, type check errors, runtime errors and invalid or mis-configured policy definitions or bindings.  A policy is invalid if spec.paramKind refers to a non-existent Kind. A binding is invalid if spec.paramRef.name refers to a non-existent resource.  failurePolicy does not define how validations that evaluate to false are handled.  When failurePolicy is set to Fail, ValidatingAdmissionPolicyBinding validationActions define how failures are enforced.  Allowed values are Ignore or Fail. Defaults to Fail.")
  public String getFailurePolicy() {
    return failurePolicy;
  }

  public void setFailurePolicy(@jakarta.annotation.Nullable String failurePolicy) {
    this.failurePolicy = failurePolicy;
  }


  public V1ValidatingAdmissionPolicySpec matchConditions(@jakarta.annotation.Nullable List<V1MatchCondition> matchConditions) {
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
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "MatchConditions is a list of conditions that must be met for a request to be validated. Match conditions filter requests that have already been matched by the rules, namespaceSelector, and objectSelector. An empty list of matchConditions matches all requests. There are a maximum of 64 match conditions allowed.  If a parameter object is provided, it can be accessed via the `params` handle in the same manner as validation expressions.  The exact matching logic is (in order):   1. If ANY matchCondition evaluates to FALSE, the policy is skipped.   2. If ALL matchConditions evaluate to TRUE, the policy is evaluated.   3. If any matchCondition evaluates to an error (but none are FALSE):      - If failurePolicy=Fail, reject the request      - If failurePolicy=Ignore, the policy is skipped")
  public List<V1MatchCondition> getMatchConditions() {
    return matchConditions;
  }

  public void setMatchConditions(@jakarta.annotation.Nullable List<V1MatchCondition> matchConditions) {
    this.matchConditions = matchConditions;
  }


  public V1ValidatingAdmissionPolicySpec matchConstraints(@jakarta.annotation.Nullable V1MatchResources matchConstraints) {
    this.matchConstraints = matchConstraints;
    return this;
  }

  /**
   * Get matchConstraints
   * @return matchConstraints
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1MatchResources getMatchConstraints() {
    return matchConstraints;
  }

  public void setMatchConstraints(@jakarta.annotation.Nullable V1MatchResources matchConstraints) {
    this.matchConstraints = matchConstraints;
  }


  public V1ValidatingAdmissionPolicySpec paramKind(@jakarta.annotation.Nullable V1ParamKind paramKind) {
    this.paramKind = paramKind;
    return this;
  }

  /**
   * Get paramKind
   * @return paramKind
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ParamKind getParamKind() {
    return paramKind;
  }

  public void setParamKind(@jakarta.annotation.Nullable V1ParamKind paramKind) {
    this.paramKind = paramKind;
  }


  public V1ValidatingAdmissionPolicySpec validations(@jakarta.annotation.Nullable List<V1Validation> validations) {
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
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Validations contain CEL expressions which is used to apply the validation. Validations and AuditAnnotations may not both be empty; a minimum of one Validations or AuditAnnotations is required.")
  public List<V1Validation> getValidations() {
    return validations;
  }

  public void setValidations(@jakarta.annotation.Nullable List<V1Validation> validations) {
    this.validations = validations;
  }


  public V1ValidatingAdmissionPolicySpec variables(@jakarta.annotation.Nullable List<V1Variable> variables) {
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
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Variables contain definitions of variables that can be used in composition of other expressions. Each variable is defined as a named CEL expression. The variables defined here will be available under `variables` in other expressions of the policy except MatchConditions because MatchConditions are evaluated before the rest of the policy.  The expression of a variable can refer to other variables defined earlier in the list but not those after. Thus, Variables must be sorted by the order of first appearance and acyclic.")
  public List<V1Variable> getVariables() {
    return variables;
  }

  public void setVariables(@jakarta.annotation.Nullable List<V1Variable> variables) {
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
    openapiFields.add("auditAnnotations");
    openapiFields.add("failurePolicy");
    openapiFields.add("matchConditions");
    openapiFields.add("matchConstraints");
    openapiFields.add("paramKind");
    openapiFields.add("validations");
    openapiFields.add("variables");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ValidatingAdmissionPolicySpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ValidatingAdmissionPolicySpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ValidatingAdmissionPolicySpec is not found in the empty JSON string", V1ValidatingAdmissionPolicySpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ValidatingAdmissionPolicySpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ValidatingAdmissionPolicySpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("auditAnnotations") != null && !jsonObj.get("auditAnnotations").isJsonNull()) {
        JsonArray jsonArrayauditAnnotations = jsonObj.getAsJsonArray("auditAnnotations");
        if (jsonArrayauditAnnotations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("auditAnnotations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `auditAnnotations` to be an array in the JSON string but got `%s`", jsonObj.get("auditAnnotations").toString()));
          }

          // validate the optional field `auditAnnotations` (array)
          for (int i = 0; i < jsonArrayauditAnnotations.size(); i++) {
            V1AuditAnnotation.validateJsonElement(jsonArrayauditAnnotations.get(i));
          };
        }
      }
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
            V1MatchCondition.validateJsonElement(jsonArraymatchConditions.get(i));
          };
        }
      }
      // validate the optional field `matchConstraints`
      if (jsonObj.get("matchConstraints") != null && !jsonObj.get("matchConstraints").isJsonNull()) {
        V1MatchResources.validateJsonElement(jsonObj.get("matchConstraints"));
      }
      // validate the optional field `paramKind`
      if (jsonObj.get("paramKind") != null && !jsonObj.get("paramKind").isJsonNull()) {
        V1ParamKind.validateJsonElement(jsonObj.get("paramKind"));
      }
      if (jsonObj.get("validations") != null && !jsonObj.get("validations").isJsonNull()) {
        JsonArray jsonArrayvalidations = jsonObj.getAsJsonArray("validations");
        if (jsonArrayvalidations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("validations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `validations` to be an array in the JSON string but got `%s`", jsonObj.get("validations").toString()));
          }

          // validate the optional field `validations` (array)
          for (int i = 0; i < jsonArrayvalidations.size(); i++) {
            V1Validation.validateJsonElement(jsonArrayvalidations.get(i));
          };
        }
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
            V1Variable.validateJsonElement(jsonArrayvariables.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ValidatingAdmissionPolicySpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ValidatingAdmissionPolicySpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ValidatingAdmissionPolicySpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ValidatingAdmissionPolicySpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ValidatingAdmissionPolicySpec>() {
           @Override
           public void write(JsonWriter out, V1ValidatingAdmissionPolicySpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ValidatingAdmissionPolicySpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ValidatingAdmissionPolicySpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ValidatingAdmissionPolicySpec
   * @throws IOException if the JSON string is invalid with respect to V1ValidatingAdmissionPolicySpec
   */
  public static V1ValidatingAdmissionPolicySpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ValidatingAdmissionPolicySpec.class);
  }

  /**
   * Convert an instance of V1ValidatingAdmissionPolicySpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
