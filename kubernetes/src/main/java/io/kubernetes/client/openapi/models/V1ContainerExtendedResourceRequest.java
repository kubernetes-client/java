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
 * ContainerExtendedResourceRequest has the mapping of container name, extended resource name to the device request name.
 */
@ApiModel(description = "ContainerExtendedResourceRequest has the mapping of container name, extended resource name to the device request name.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ContainerExtendedResourceRequest {
  public static final String SERIALIZED_NAME_CONTAINER_NAME = "containerName";
  @SerializedName(SERIALIZED_NAME_CONTAINER_NAME)
  @jakarta.annotation.Nonnull
  private String containerName;

  public static final String SERIALIZED_NAME_REQUEST_NAME = "requestName";
  @SerializedName(SERIALIZED_NAME_REQUEST_NAME)
  @jakarta.annotation.Nonnull
  private String requestName;

  public static final String SERIALIZED_NAME_RESOURCE_NAME = "resourceName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAME)
  @jakarta.annotation.Nonnull
  private String resourceName;

  public V1ContainerExtendedResourceRequest() {
  }

  public V1ContainerExtendedResourceRequest containerName(@jakarta.annotation.Nonnull String containerName) {
    this.containerName = containerName;
    return this;
  }

  /**
   * The name of the container requesting resources.
   * @return containerName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the container requesting resources.")
  public String getContainerName() {
    return containerName;
  }

  public void setContainerName(@jakarta.annotation.Nonnull String containerName) {
    this.containerName = containerName;
  }


  public V1ContainerExtendedResourceRequest requestName(@jakarta.annotation.Nonnull String requestName) {
    this.requestName = requestName;
    return this;
  }

  /**
   * The name of the request in the special ResourceClaim which corresponds to the extended resource.
   * @return requestName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the request in the special ResourceClaim which corresponds to the extended resource.")
  public String getRequestName() {
    return requestName;
  }

  public void setRequestName(@jakarta.annotation.Nonnull String requestName) {
    this.requestName = requestName;
  }


  public V1ContainerExtendedResourceRequest resourceName(@jakarta.annotation.Nonnull String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * The name of the extended resource in that container which gets backed by DRA.
   * @return resourceName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the extended resource in that container which gets backed by DRA.")
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(@jakarta.annotation.Nonnull String resourceName) {
    this.resourceName = resourceName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerExtendedResourceRequest v1ContainerExtendedResourceRequest = (V1ContainerExtendedResourceRequest) o;
    return Objects.equals(this.containerName, v1ContainerExtendedResourceRequest.containerName) &&
        Objects.equals(this.requestName, v1ContainerExtendedResourceRequest.requestName) &&
        Objects.equals(this.resourceName, v1ContainerExtendedResourceRequest.resourceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerName, requestName, resourceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerExtendedResourceRequest {\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    requestName: ").append(toIndentedString(requestName)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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
    openapiFields.add("containerName");
    openapiFields.add("requestName");
    openapiFields.add("resourceName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("containerName");
    openapiRequiredFields.add("requestName");
    openapiRequiredFields.add("resourceName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ContainerExtendedResourceRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ContainerExtendedResourceRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ContainerExtendedResourceRequest is not found in the empty JSON string", V1ContainerExtendedResourceRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ContainerExtendedResourceRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ContainerExtendedResourceRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ContainerExtendedResourceRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("containerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `containerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("containerName").toString()));
      }
      if (!jsonObj.get("requestName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestName").toString()));
      }
      if (!jsonObj.get("resourceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ContainerExtendedResourceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ContainerExtendedResourceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ContainerExtendedResourceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ContainerExtendedResourceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ContainerExtendedResourceRequest>() {
           @Override
           public void write(JsonWriter out, V1ContainerExtendedResourceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ContainerExtendedResourceRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ContainerExtendedResourceRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ContainerExtendedResourceRequest
   * @throws IOException if the JSON string is invalid with respect to V1ContainerExtendedResourceRequest
   */
  public static V1ContainerExtendedResourceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ContainerExtendedResourceRequest.class);
  }

  /**
   * Convert an instance of V1ContainerExtendedResourceRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
