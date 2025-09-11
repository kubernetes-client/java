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
 * ContainerResizePolicy represents resource resize policy for the container.
 */
@ApiModel(description = "ContainerResizePolicy represents resource resize policy for the container.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ContainerResizePolicy {
  public static final String SERIALIZED_NAME_RESOURCE_NAME = "resourceName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAME)
  @jakarta.annotation.Nonnull
  private String resourceName;

  public static final String SERIALIZED_NAME_RESTART_POLICY = "restartPolicy";
  @SerializedName(SERIALIZED_NAME_RESTART_POLICY)
  @jakarta.annotation.Nonnull
  private String restartPolicy;

  public V1ContainerResizePolicy() {
  }

  public V1ContainerResizePolicy resourceName(@jakarta.annotation.Nonnull String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Name of the resource to which this resource resize policy applies. Supported values: cpu, memory.
   * @return resourceName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the resource to which this resource resize policy applies. Supported values: cpu, memory.")
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(@jakarta.annotation.Nonnull String resourceName) {
    this.resourceName = resourceName;
  }


  public V1ContainerResizePolicy restartPolicy(@jakarta.annotation.Nonnull String restartPolicy) {
    this.restartPolicy = restartPolicy;
    return this;
  }

  /**
   * Restart policy to apply when specified resource is resized. If not specified, it defaults to NotRequired.
   * @return restartPolicy
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Restart policy to apply when specified resource is resized. If not specified, it defaults to NotRequired.")
  public String getRestartPolicy() {
    return restartPolicy;
  }

  public void setRestartPolicy(@jakarta.annotation.Nonnull String restartPolicy) {
    this.restartPolicy = restartPolicy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerResizePolicy v1ContainerResizePolicy = (V1ContainerResizePolicy) o;
    return Objects.equals(this.resourceName, v1ContainerResizePolicy.resourceName) &&
        Objects.equals(this.restartPolicy, v1ContainerResizePolicy.restartPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceName, restartPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerResizePolicy {\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
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
    openapiFields.add("resourceName");
    openapiFields.add("restartPolicy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("resourceName");
    openapiRequiredFields.add("restartPolicy");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ContainerResizePolicy
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ContainerResizePolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ContainerResizePolicy is not found in the empty JSON string", V1ContainerResizePolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ContainerResizePolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ContainerResizePolicy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ContainerResizePolicy.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("resourceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceName").toString()));
      }
      if (!jsonObj.get("restartPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `restartPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("restartPolicy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ContainerResizePolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ContainerResizePolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ContainerResizePolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ContainerResizePolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ContainerResizePolicy>() {
           @Override
           public void write(JsonWriter out, V1ContainerResizePolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ContainerResizePolicy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ContainerResizePolicy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ContainerResizePolicy
   * @throws IOException if the JSON string is invalid with respect to V1ContainerResizePolicy
   */
  public static V1ContainerResizePolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ContainerResizePolicy.class);
  }

  /**
   * Convert an instance of V1ContainerResizePolicy to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
