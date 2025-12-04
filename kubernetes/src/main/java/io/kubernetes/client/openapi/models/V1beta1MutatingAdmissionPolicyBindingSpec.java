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
import java.util.Locale;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1beta1MatchResources;
import io.kubernetes.client.openapi.models.V1beta1ParamRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;

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
import java.util.Locale;

import io.kubernetes.client.openapi.JSON;

/**
 * MutatingAdmissionPolicyBindingSpec is the specification of the MutatingAdmissionPolicyBinding.
 */
@ApiModel(description = "MutatingAdmissionPolicyBindingSpec is the specification of the MutatingAdmissionPolicyBinding.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-11-21T03:25:56.836812Z[Etc/UTC]", comments = "Generator version: 7.16.0")
public class V1beta1MutatingAdmissionPolicyBindingSpec {
  public static final String SERIALIZED_NAME_MATCH_RESOURCES = "matchResources";
  @SerializedName(SERIALIZED_NAME_MATCH_RESOURCES)
  @jakarta.annotation.Nullable
  private V1beta1MatchResources matchResources;

  public static final String SERIALIZED_NAME_PARAM_REF = "paramRef";
  @SerializedName(SERIALIZED_NAME_PARAM_REF)
  @jakarta.annotation.Nullable
  private V1beta1ParamRef paramRef;

  public static final String SERIALIZED_NAME_POLICY_NAME = "policyName";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  @jakarta.annotation.Nullable
  private String policyName;

  public V1beta1MutatingAdmissionPolicyBindingSpec() {
  }

  public V1beta1MutatingAdmissionPolicyBindingSpec matchResources(@jakarta.annotation.Nullable V1beta1MatchResources matchResources) {
    this.matchResources = matchResources;
    return this;
  }

  /**
   * Get matchResources
   * @return matchResources
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1MatchResources getMatchResources() {
    return matchResources;
  }

  public void setMatchResources(@jakarta.annotation.Nullable V1beta1MatchResources matchResources) {
    this.matchResources = matchResources;
  }


  public V1beta1MutatingAdmissionPolicyBindingSpec paramRef(@jakarta.annotation.Nullable V1beta1ParamRef paramRef) {
    this.paramRef = paramRef;
    return this;
  }

  /**
   * Get paramRef
   * @return paramRef
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1ParamRef getParamRef() {
    return paramRef;
  }

  public void setParamRef(@jakarta.annotation.Nullable V1beta1ParamRef paramRef) {
    this.paramRef = paramRef;
  }


  public V1beta1MutatingAdmissionPolicyBindingSpec policyName(@jakarta.annotation.Nullable String policyName) {
    this.policyName = policyName;
    return this;
  }

  /**
   * policyName references a MutatingAdmissionPolicy name which the MutatingAdmissionPolicyBinding binds to. If the referenced resource does not exist, this binding is considered invalid and will be ignored Required.
   * @return policyName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "policyName references a MutatingAdmissionPolicy name which the MutatingAdmissionPolicyBinding binds to. If the referenced resource does not exist, this binding is considered invalid and will be ignored Required.")
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(@jakarta.annotation.Nullable String policyName) {
    this.policyName = policyName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1MutatingAdmissionPolicyBindingSpec v1beta1MutatingAdmissionPolicyBindingSpec = (V1beta1MutatingAdmissionPolicyBindingSpec) o;
    return Objects.equals(this.matchResources, v1beta1MutatingAdmissionPolicyBindingSpec.matchResources) &&
        Objects.equals(this.paramRef, v1beta1MutatingAdmissionPolicyBindingSpec.paramRef) &&
        Objects.equals(this.policyName, v1beta1MutatingAdmissionPolicyBindingSpec.policyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchResources, paramRef, policyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1MutatingAdmissionPolicyBindingSpec {\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("matchResources", "paramRef", "policyName"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1beta1MutatingAdmissionPolicyBindingSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta1MutatingAdmissionPolicyBindingSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The required field(s) %s in V1beta1MutatingAdmissionPolicyBindingSpec is not found in the empty JSON string", V1beta1MutatingAdmissionPolicyBindingSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta1MutatingAdmissionPolicyBindingSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1beta1MutatingAdmissionPolicyBindingSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `matchResources`
      if (jsonObj.get("matchResources") != null && !jsonObj.get("matchResources").isJsonNull()) {
        V1beta1MatchResources.validateJsonElement(jsonObj.get("matchResources"));
      }
      // validate the optional field `paramRef`
      if (jsonObj.get("paramRef") != null && !jsonObj.get("paramRef").isJsonNull()) {
        V1beta1ParamRef.validateJsonElement(jsonObj.get("paramRef"));
      }
      if ((jsonObj.get("policyName") != null && !jsonObj.get("policyName").isJsonNull()) && !jsonObj.get("policyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `policyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policyName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1MutatingAdmissionPolicyBindingSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1MutatingAdmissionPolicyBindingSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1MutatingAdmissionPolicyBindingSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1MutatingAdmissionPolicyBindingSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1MutatingAdmissionPolicyBindingSpec>() {
           @Override
           public void write(JsonWriter out, V1beta1MutatingAdmissionPolicyBindingSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1MutatingAdmissionPolicyBindingSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1beta1MutatingAdmissionPolicyBindingSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1beta1MutatingAdmissionPolicyBindingSpec
   * @throws IOException if the JSON string is invalid with respect to V1beta1MutatingAdmissionPolicyBindingSpec
   */
  public static V1beta1MutatingAdmissionPolicyBindingSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta1MutatingAdmissionPolicyBindingSpec.class);
  }

  /**
   * Convert an instance of V1beta1MutatingAdmissionPolicyBindingSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
