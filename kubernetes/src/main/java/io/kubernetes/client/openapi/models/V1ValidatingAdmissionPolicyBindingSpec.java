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
import io.kubernetes.client.openapi.models.V1MatchResources;
import io.kubernetes.client.openapi.models.V1ParamRef;
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
 * ValidatingAdmissionPolicyBindingSpec is the specification of the ValidatingAdmissionPolicyBinding.
 */
@ApiModel(description = "ValidatingAdmissionPolicyBindingSpec is the specification of the ValidatingAdmissionPolicyBinding.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ValidatingAdmissionPolicyBindingSpec {
  public static final String SERIALIZED_NAME_MATCH_RESOURCES = "matchResources";
  @SerializedName(SERIALIZED_NAME_MATCH_RESOURCES)
  @jakarta.annotation.Nullable
  private V1MatchResources matchResources;

  public static final String SERIALIZED_NAME_PARAM_REF = "paramRef";
  @SerializedName(SERIALIZED_NAME_PARAM_REF)
  @jakarta.annotation.Nullable
  private V1ParamRef paramRef;

  public static final String SERIALIZED_NAME_POLICY_NAME = "policyName";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  @jakarta.annotation.Nullable
  private String policyName;

  public static final String SERIALIZED_NAME_VALIDATION_ACTIONS = "validationActions";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ACTIONS)
  @jakarta.annotation.Nullable
  private List<String> validationActions = new ArrayList<>();

  public V1ValidatingAdmissionPolicyBindingSpec() {
  }

  public V1ValidatingAdmissionPolicyBindingSpec matchResources(@jakarta.annotation.Nullable V1MatchResources matchResources) {
    this.matchResources = matchResources;
    return this;
  }

  /**
   * Get matchResources
   * @return matchResources
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1MatchResources getMatchResources() {
    return matchResources;
  }

  public void setMatchResources(@jakarta.annotation.Nullable V1MatchResources matchResources) {
    this.matchResources = matchResources;
  }


  public V1ValidatingAdmissionPolicyBindingSpec paramRef(@jakarta.annotation.Nullable V1ParamRef paramRef) {
    this.paramRef = paramRef;
    return this;
  }

  /**
   * Get paramRef
   * @return paramRef
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ParamRef getParamRef() {
    return paramRef;
  }

  public void setParamRef(@jakarta.annotation.Nullable V1ParamRef paramRef) {
    this.paramRef = paramRef;
  }


  public V1ValidatingAdmissionPolicyBindingSpec policyName(@jakarta.annotation.Nullable String policyName) {
    this.policyName = policyName;
    return this;
  }

  /**
   * PolicyName references a ValidatingAdmissionPolicy name which the ValidatingAdmissionPolicyBinding binds to. If the referenced resource does not exist, this binding is considered invalid and will be ignored Required.
   * @return policyName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "PolicyName references a ValidatingAdmissionPolicy name which the ValidatingAdmissionPolicyBinding binds to. If the referenced resource does not exist, this binding is considered invalid and will be ignored Required.")
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(@jakarta.annotation.Nullable String policyName) {
    this.policyName = policyName;
  }


  public V1ValidatingAdmissionPolicyBindingSpec validationActions(@jakarta.annotation.Nullable List<String> validationActions) {
    this.validationActions = validationActions;
    return this;
  }

  public V1ValidatingAdmissionPolicyBindingSpec addValidationActionsItem(String validationActionsItem) {
    if (this.validationActions == null) {
      this.validationActions = new ArrayList<>();
    }
    this.validationActions.add(validationActionsItem);
    return this;
  }

  /**
   * validationActions declares how Validations of the referenced ValidatingAdmissionPolicy are enforced. If a validation evaluates to false it is always enforced according to these actions.  Failures defined by the ValidatingAdmissionPolicy&#39;s FailurePolicy are enforced according to these actions only if the FailurePolicy is set to Fail, otherwise the failures are ignored. This includes compilation errors, runtime errors and misconfigurations of the policy.  validationActions is declared as a set of action values. Order does not matter. validationActions may not contain duplicates of the same action.  The supported actions values are:  \&quot;Deny\&quot; specifies that a validation failure results in a denied request.  \&quot;Warn\&quot; specifies that a validation failure is reported to the request client in HTTP Warning headers, with a warning code of 299. Warnings can be sent both for allowed or denied admission responses.  \&quot;Audit\&quot; specifies that a validation failure is included in the published audit event for the request. The audit event will contain a &#x60;validation.policy.admission.k8s.io/validation_failure&#x60; audit annotation with a value containing the details of the validation failures, formatted as a JSON list of objects, each with the following fields: - message: The validation failure message string - policy: The resource name of the ValidatingAdmissionPolicy - binding: The resource name of the ValidatingAdmissionPolicyBinding - expressionIndex: The index of the failed validations in the ValidatingAdmissionPolicy - validationActions: The enforcement actions enacted for the validation failure Example audit annotation: &#x60;\&quot;validation.policy.admission.k8s.io/validation_failure\&quot;: \&quot;[{\\\&quot;message\\\&quot;: \\\&quot;Invalid value\\\&quot;, {\\\&quot;policy\\\&quot;: \\\&quot;policy.example.com\\\&quot;, {\\\&quot;binding\\\&quot;: \\\&quot;policybinding.example.com\\\&quot;, {\\\&quot;expressionIndex\\\&quot;: \\\&quot;1\\\&quot;, {\\\&quot;validationActions\\\&quot;: [\\\&quot;Audit\\\&quot;]}]\&quot;&#x60;  Clients should expect to handle additional values by ignoring any values not recognized.  \&quot;Deny\&quot; and \&quot;Warn\&quot; may not be used together since this combination needlessly duplicates the validation failure both in the API response body and the HTTP warning headers.  Required.
   * @return validationActions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "validationActions declares how Validations of the referenced ValidatingAdmissionPolicy are enforced. If a validation evaluates to false it is always enforced according to these actions.  Failures defined by the ValidatingAdmissionPolicy's FailurePolicy are enforced according to these actions only if the FailurePolicy is set to Fail, otherwise the failures are ignored. This includes compilation errors, runtime errors and misconfigurations of the policy.  validationActions is declared as a set of action values. Order does not matter. validationActions may not contain duplicates of the same action.  The supported actions values are:  \"Deny\" specifies that a validation failure results in a denied request.  \"Warn\" specifies that a validation failure is reported to the request client in HTTP Warning headers, with a warning code of 299. Warnings can be sent both for allowed or denied admission responses.  \"Audit\" specifies that a validation failure is included in the published audit event for the request. The audit event will contain a `validation.policy.admission.k8s.io/validation_failure` audit annotation with a value containing the details of the validation failures, formatted as a JSON list of objects, each with the following fields: - message: The validation failure message string - policy: The resource name of the ValidatingAdmissionPolicy - binding: The resource name of the ValidatingAdmissionPolicyBinding - expressionIndex: The index of the failed validations in the ValidatingAdmissionPolicy - validationActions: The enforcement actions enacted for the validation failure Example audit annotation: `\"validation.policy.admission.k8s.io/validation_failure\": \"[{\\\"message\\\": \\\"Invalid value\\\", {\\\"policy\\\": \\\"policy.example.com\\\", {\\\"binding\\\": \\\"policybinding.example.com\\\", {\\\"expressionIndex\\\": \\\"1\\\", {\\\"validationActions\\\": [\\\"Audit\\\"]}]\"`  Clients should expect to handle additional values by ignoring any values not recognized.  \"Deny\" and \"Warn\" may not be used together since this combination needlessly duplicates the validation failure both in the API response body and the HTTP warning headers.  Required.")
  public List<String> getValidationActions() {
    return validationActions;
  }

  public void setValidationActions(@jakarta.annotation.Nullable List<String> validationActions) {
    this.validationActions = validationActions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ValidatingAdmissionPolicyBindingSpec v1ValidatingAdmissionPolicyBindingSpec = (V1ValidatingAdmissionPolicyBindingSpec) o;
    return Objects.equals(this.matchResources, v1ValidatingAdmissionPolicyBindingSpec.matchResources) &&
        Objects.equals(this.paramRef, v1ValidatingAdmissionPolicyBindingSpec.paramRef) &&
        Objects.equals(this.policyName, v1ValidatingAdmissionPolicyBindingSpec.policyName) &&
        Objects.equals(this.validationActions, v1ValidatingAdmissionPolicyBindingSpec.validationActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchResources, paramRef, policyName, validationActions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ValidatingAdmissionPolicyBindingSpec {\n");
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
    openapiFields.add("matchResources");
    openapiFields.add("paramRef");
    openapiFields.add("policyName");
    openapiFields.add("validationActions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ValidatingAdmissionPolicyBindingSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ValidatingAdmissionPolicyBindingSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ValidatingAdmissionPolicyBindingSpec is not found in the empty JSON string", V1ValidatingAdmissionPolicyBindingSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ValidatingAdmissionPolicyBindingSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ValidatingAdmissionPolicyBindingSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `matchResources`
      if (jsonObj.get("matchResources") != null && !jsonObj.get("matchResources").isJsonNull()) {
        V1MatchResources.validateJsonElement(jsonObj.get("matchResources"));
      }
      // validate the optional field `paramRef`
      if (jsonObj.get("paramRef") != null && !jsonObj.get("paramRef").isJsonNull()) {
        V1ParamRef.validateJsonElement(jsonObj.get("paramRef"));
      }
      if ((jsonObj.get("policyName") != null && !jsonObj.get("policyName").isJsonNull()) && !jsonObj.get("policyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policyName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("validationActions") != null && !jsonObj.get("validationActions").isJsonNull() && !jsonObj.get("validationActions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validationActions` to be an array in the JSON string but got `%s`", jsonObj.get("validationActions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ValidatingAdmissionPolicyBindingSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ValidatingAdmissionPolicyBindingSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ValidatingAdmissionPolicyBindingSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ValidatingAdmissionPolicyBindingSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ValidatingAdmissionPolicyBindingSpec>() {
           @Override
           public void write(JsonWriter out, V1ValidatingAdmissionPolicyBindingSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ValidatingAdmissionPolicyBindingSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ValidatingAdmissionPolicyBindingSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ValidatingAdmissionPolicyBindingSpec
   * @throws IOException if the JSON string is invalid with respect to V1ValidatingAdmissionPolicyBindingSpec
   */
  public static V1ValidatingAdmissionPolicyBindingSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ValidatingAdmissionPolicyBindingSpec.class);
  }

  /**
   * Convert an instance of V1ValidatingAdmissionPolicyBindingSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
