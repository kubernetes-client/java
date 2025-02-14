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
import io.kubernetes.client.openapi.models.V1alpha1MatchResources;
import io.kubernetes.client.openapi.models.V1alpha1ParamRef;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * MutatingAdmissionPolicyBindingSpec is the specification of the MutatingAdmissionPolicyBinding.
 */
@ApiModel(description = "MutatingAdmissionPolicyBindingSpec is the specification of the MutatingAdmissionPolicyBinding.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T21:15:49.397498Z[Etc/UTC]", comments = "Generator version: 7.6.0")
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

  public V1alpha1MutatingAdmissionPolicyBindingSpec() {
  }

  public V1alpha1MutatingAdmissionPolicyBindingSpec matchResources(V1alpha1MatchResources matchResources) {
    this.matchResources = matchResources;
    return this;
  }

   /**
   * Get matchResources
   * @return matchResources
  **/
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "policyName references a MutatingAdmissionPolicy name which the MutatingAdmissionPolicyBinding binds to. If the referenced resource does not exist, this binding is considered invalid and will be ignored Required.")
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha1MutatingAdmissionPolicyBindingSpec
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha1MutatingAdmissionPolicyBindingSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1MutatingAdmissionPolicyBindingSpec is not found in the empty JSON string", V1alpha1MutatingAdmissionPolicyBindingSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1MutatingAdmissionPolicyBindingSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1MutatingAdmissionPolicyBindingSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `matchResources`
      if (jsonObj.get("matchResources") != null && !jsonObj.get("matchResources").isJsonNull()) {
        V1alpha1MatchResources.validateJsonElement(jsonObj.get("matchResources"));
      }
      // validate the optional field `paramRef`
      if (jsonObj.get("paramRef") != null && !jsonObj.get("paramRef").isJsonNull()) {
        V1alpha1ParamRef.validateJsonElement(jsonObj.get("paramRef"));
      }
      if ((jsonObj.get("policyName") != null && !jsonObj.get("policyName").isJsonNull()) && !jsonObj.get("policyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policyName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1MutatingAdmissionPolicyBindingSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1MutatingAdmissionPolicyBindingSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1MutatingAdmissionPolicyBindingSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1MutatingAdmissionPolicyBindingSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1MutatingAdmissionPolicyBindingSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1MutatingAdmissionPolicyBindingSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1MutatingAdmissionPolicyBindingSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1MutatingAdmissionPolicyBindingSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1MutatingAdmissionPolicyBindingSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1MutatingAdmissionPolicyBindingSpec
  */
  public static V1alpha1MutatingAdmissionPolicyBindingSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1MutatingAdmissionPolicyBindingSpec.class);
  }

 /**
  * Convert an instance of V1alpha1MutatingAdmissionPolicyBindingSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
