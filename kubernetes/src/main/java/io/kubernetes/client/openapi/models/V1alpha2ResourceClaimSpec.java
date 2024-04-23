/*
Copyright 2024 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1alpha2ResourceClaimParametersReference;
import java.io.IOException;

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
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * ResourceClaimSpec defines how a resource is to be allocated.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha2ResourceClaimSpec {
  public static final String SERIALIZED_NAME_ALLOCATION_MODE = "allocationMode";
  @SerializedName(SERIALIZED_NAME_ALLOCATION_MODE)
  private String allocationMode;

  public static final String SERIALIZED_NAME_PARAMETERS_REF = "parametersRef";
  @SerializedName(SERIALIZED_NAME_PARAMETERS_REF)
  private V1alpha2ResourceClaimParametersReference parametersRef;

  public static final String SERIALIZED_NAME_RESOURCE_CLASS_NAME = "resourceClassName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_CLASS_NAME)
  private String resourceClassName;

  public V1alpha2ResourceClaimSpec() {
  }

  public V1alpha2ResourceClaimSpec allocationMode(String allocationMode) {

    this.allocationMode = allocationMode;
    return this;
  }

   /**
   * Allocation can start immediately or when a Pod wants to use the resource. \&quot;WaitForFirstConsumer\&quot; is the default.
   * @return allocationMode
  **/
  @jakarta.annotation.Nullable
  public String getAllocationMode() {
    return allocationMode;
  }


  public void setAllocationMode(String allocationMode) {
    this.allocationMode = allocationMode;
  }


  public V1alpha2ResourceClaimSpec parametersRef(V1alpha2ResourceClaimParametersReference parametersRef) {

    this.parametersRef = parametersRef;
    return this;
  }

   /**
   * Get parametersRef
   * @return parametersRef
  **/
  @jakarta.annotation.Nullable
  public V1alpha2ResourceClaimParametersReference getParametersRef() {
    return parametersRef;
  }


  public void setParametersRef(V1alpha2ResourceClaimParametersReference parametersRef) {
    this.parametersRef = parametersRef;
  }


  public V1alpha2ResourceClaimSpec resourceClassName(String resourceClassName) {

    this.resourceClassName = resourceClassName;
    return this;
  }

   /**
   * ResourceClassName references the driver and additional parameters via the name of a ResourceClass that was created as part of the driver deployment.
   * @return resourceClassName
  **/
  @jakarta.annotation.Nonnull
  public String getResourceClassName() {
    return resourceClassName;
  }


  public void setResourceClassName(String resourceClassName) {
    this.resourceClassName = resourceClassName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2ResourceClaimSpec v1alpha2ResourceClaimSpec = (V1alpha2ResourceClaimSpec) o;
    return Objects.equals(this.allocationMode, v1alpha2ResourceClaimSpec.allocationMode) &&
        Objects.equals(this.parametersRef, v1alpha2ResourceClaimSpec.parametersRef) &&
        Objects.equals(this.resourceClassName, v1alpha2ResourceClaimSpec.resourceClassName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationMode, parametersRef, resourceClassName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2ResourceClaimSpec {\n");
    sb.append("    allocationMode: ").append(toIndentedString(allocationMode)).append("\n");
    sb.append("    parametersRef: ").append(toIndentedString(parametersRef)).append("\n");
    sb.append("    resourceClassName: ").append(toIndentedString(resourceClassName)).append("\n");
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
    openapiFields.add("allocationMode");
    openapiFields.add("parametersRef");
    openapiFields.add("resourceClassName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("resourceClassName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha2ResourceClaimSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha2ResourceClaimSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2ResourceClaimSpec is not found in the empty JSON string", V1alpha2ResourceClaimSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2ResourceClaimSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2ResourceClaimSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha2ResourceClaimSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("allocationMode") != null && !jsonObj.get("allocationMode").isJsonNull()) && !jsonObj.get("allocationMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `allocationMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allocationMode").toString()));
      }
      // validate the optional field `parametersRef`
      if (jsonObj.get("parametersRef") != null && !jsonObj.get("parametersRef").isJsonNull()) {
        V1alpha2ResourceClaimParametersReference.validateJsonObject(jsonObj.getAsJsonObject("parametersRef"));
      }
      if (!jsonObj.get("resourceClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceClassName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2ResourceClaimSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2ResourceClaimSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2ResourceClaimSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2ResourceClaimSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2ResourceClaimSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha2ResourceClaimSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2ResourceClaimSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2ResourceClaimSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2ResourceClaimSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha2ResourceClaimSpec
  */
  public static V1alpha2ResourceClaimSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2ResourceClaimSpec.class);
  }

 /**
  * Convert an instance of V1alpha2ResourceClaimSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
