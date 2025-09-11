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

import io.kubernetes.client.openapi.JSON;

/**
 * PodFailurePolicyOnPodConditionsPattern describes a pattern for matching an actual pod condition type.
 */
@ApiModel(description = "PodFailurePolicyOnPodConditionsPattern describes a pattern for matching an actual pod condition type.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1PodFailurePolicyOnPodConditionsPattern {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @jakarta.annotation.Nonnull
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @jakarta.annotation.Nonnull
  private String type;

  public V1PodFailurePolicyOnPodConditionsPattern() {
  }

  public V1PodFailurePolicyOnPodConditionsPattern status(@jakarta.annotation.Nonnull String status) {
    this.status = status;
    return this;
  }

  /**
   * Specifies the required Pod condition status. To match a pod condition it is required that the specified status equals the pod condition status. Defaults to True.
   * @return status
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the required Pod condition status. To match a pod condition it is required that the specified status equals the pod condition status. Defaults to True.")
  public String getStatus() {
    return status;
  }

  public void setStatus(@jakarta.annotation.Nonnull String status) {
    this.status = status;
  }


  public V1PodFailurePolicyOnPodConditionsPattern type(@jakarta.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * Specifies the required Pod condition type. To match a pod condition it is required that specified type equals the pod condition type.
   * @return type
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the required Pod condition type. To match a pod condition it is required that specified type equals the pod condition type.")
  public String getType() {
    return type;
  }

  public void setType(@jakarta.annotation.Nonnull String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodFailurePolicyOnPodConditionsPattern v1PodFailurePolicyOnPodConditionsPattern = (V1PodFailurePolicyOnPodConditionsPattern) o;
    return Objects.equals(this.status, v1PodFailurePolicyOnPodConditionsPattern.status) &&
        Objects.equals(this.type, v1PodFailurePolicyOnPodConditionsPattern.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodFailurePolicyOnPodConditionsPattern {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1PodFailurePolicyOnPodConditionsPattern
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PodFailurePolicyOnPodConditionsPattern.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PodFailurePolicyOnPodConditionsPattern is not found in the empty JSON string", V1PodFailurePolicyOnPodConditionsPattern.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PodFailurePolicyOnPodConditionsPattern.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PodFailurePolicyOnPodConditionsPattern` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1PodFailurePolicyOnPodConditionsPattern.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PodFailurePolicyOnPodConditionsPattern.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PodFailurePolicyOnPodConditionsPattern' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PodFailurePolicyOnPodConditionsPattern> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PodFailurePolicyOnPodConditionsPattern.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PodFailurePolicyOnPodConditionsPattern>() {
           @Override
           public void write(JsonWriter out, V1PodFailurePolicyOnPodConditionsPattern value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PodFailurePolicyOnPodConditionsPattern read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1PodFailurePolicyOnPodConditionsPattern given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1PodFailurePolicyOnPodConditionsPattern
   * @throws IOException if the JSON string is invalid with respect to V1PodFailurePolicyOnPodConditionsPattern
   */
  public static V1PodFailurePolicyOnPodConditionsPattern fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PodFailurePolicyOnPodConditionsPattern.class);
  }

  /**
   * Convert an instance of V1PodFailurePolicyOnPodConditionsPattern to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
