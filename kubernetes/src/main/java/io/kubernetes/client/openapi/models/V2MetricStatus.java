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
import io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatus;
import io.kubernetes.client.openapi.models.V2ExternalMetricStatus;
import io.kubernetes.client.openapi.models.V2ObjectMetricStatus;
import io.kubernetes.client.openapi.models.V2PodsMetricStatus;
import io.kubernetes.client.openapi.models.V2ResourceMetricStatus;
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
 * MetricStatus describes the last-read state of a single metric.
 */
@ApiModel(description = "MetricStatus describes the last-read state of a single metric.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V2MetricStatus {
  public static final String SERIALIZED_NAME_CONTAINER_RESOURCE = "containerResource";
  @SerializedName(SERIALIZED_NAME_CONTAINER_RESOURCE)
  @jakarta.annotation.Nullable
  private V2ContainerResourceMetricStatus containerResource;

  public static final String SERIALIZED_NAME_EXTERNAL = "external";
  @SerializedName(SERIALIZED_NAME_EXTERNAL)
  @jakarta.annotation.Nullable
  private V2ExternalMetricStatus external;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  @jakarta.annotation.Nullable
  private V2ObjectMetricStatus _object;

  public static final String SERIALIZED_NAME_PODS = "pods";
  @SerializedName(SERIALIZED_NAME_PODS)
  @jakarta.annotation.Nullable
  private V2PodsMetricStatus pods;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  @jakarta.annotation.Nullable
  private V2ResourceMetricStatus resource;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @jakarta.annotation.Nonnull
  private String type;

  public V2MetricStatus() {
  }

  public V2MetricStatus containerResource(@jakarta.annotation.Nullable V2ContainerResourceMetricStatus containerResource) {
    this.containerResource = containerResource;
    return this;
  }

  /**
   * Get containerResource
   * @return containerResource
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V2ContainerResourceMetricStatus getContainerResource() {
    return containerResource;
  }

  public void setContainerResource(@jakarta.annotation.Nullable V2ContainerResourceMetricStatus containerResource) {
    this.containerResource = containerResource;
  }


  public V2MetricStatus external(@jakarta.annotation.Nullable V2ExternalMetricStatus external) {
    this.external = external;
    return this;
  }

  /**
   * Get external
   * @return external
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V2ExternalMetricStatus getExternal() {
    return external;
  }

  public void setExternal(@jakarta.annotation.Nullable V2ExternalMetricStatus external) {
    this.external = external;
  }


  public V2MetricStatus _object(@jakarta.annotation.Nullable V2ObjectMetricStatus _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V2ObjectMetricStatus getObject() {
    return _object;
  }

  public void setObject(@jakarta.annotation.Nullable V2ObjectMetricStatus _object) {
    this._object = _object;
  }


  public V2MetricStatus pods(@jakarta.annotation.Nullable V2PodsMetricStatus pods) {
    this.pods = pods;
    return this;
  }

  /**
   * Get pods
   * @return pods
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V2PodsMetricStatus getPods() {
    return pods;
  }

  public void setPods(@jakarta.annotation.Nullable V2PodsMetricStatus pods) {
    this.pods = pods;
  }


  public V2MetricStatus resource(@jakarta.annotation.Nullable V2ResourceMetricStatus resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   * @return resource
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V2ResourceMetricStatus getResource() {
    return resource;
  }

  public void setResource(@jakarta.annotation.Nullable V2ResourceMetricStatus resource) {
    this.resource = resource;
  }


  public V2MetricStatus type(@jakarta.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * type is the type of metric source.  It will be one of \&quot;ContainerResource\&quot;, \&quot;External\&quot;, \&quot;Object\&quot;, \&quot;Pods\&quot; or \&quot;Resource\&quot;, each corresponds to a matching field in the object.
   * @return type
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "type is the type of metric source.  It will be one of \"ContainerResource\", \"External\", \"Object\", \"Pods\" or \"Resource\", each corresponds to a matching field in the object.")
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
    V2MetricStatus v2MetricStatus = (V2MetricStatus) o;
    return Objects.equals(this.containerResource, v2MetricStatus.containerResource) &&
        Objects.equals(this.external, v2MetricStatus.external) &&
        Objects.equals(this._object, v2MetricStatus._object) &&
        Objects.equals(this.pods, v2MetricStatus.pods) &&
        Objects.equals(this.resource, v2MetricStatus.resource) &&
        Objects.equals(this.type, v2MetricStatus.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerResource, external, _object, pods, resource, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2MetricStatus {\n");
    sb.append("    containerResource: ").append(toIndentedString(containerResource)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    pods: ").append(toIndentedString(pods)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
    openapiFields.add("containerResource");
    openapiFields.add("external");
    openapiFields.add("object");
    openapiFields.add("pods");
    openapiFields.add("resource");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V2MetricStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V2MetricStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V2MetricStatus is not found in the empty JSON string", V2MetricStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V2MetricStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V2MetricStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V2MetricStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `containerResource`
      if (jsonObj.get("containerResource") != null && !jsonObj.get("containerResource").isJsonNull()) {
        V2ContainerResourceMetricStatus.validateJsonElement(jsonObj.get("containerResource"));
      }
      // validate the optional field `external`
      if (jsonObj.get("external") != null && !jsonObj.get("external").isJsonNull()) {
        V2ExternalMetricStatus.validateJsonElement(jsonObj.get("external"));
      }
      // validate the optional field `object`
      if (jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) {
        V2ObjectMetricStatus.validateJsonElement(jsonObj.get("object"));
      }
      // validate the optional field `pods`
      if (jsonObj.get("pods") != null && !jsonObj.get("pods").isJsonNull()) {
        V2PodsMetricStatus.validateJsonElement(jsonObj.get("pods"));
      }
      // validate the optional field `resource`
      if (jsonObj.get("resource") != null && !jsonObj.get("resource").isJsonNull()) {
        V2ResourceMetricStatus.validateJsonElement(jsonObj.get("resource"));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V2MetricStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V2MetricStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V2MetricStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V2MetricStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V2MetricStatus>() {
           @Override
           public void write(JsonWriter out, V2MetricStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V2MetricStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V2MetricStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V2MetricStatus
   * @throws IOException if the JSON string is invalid with respect to V2MetricStatus
   */
  public static V2MetricStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V2MetricStatus.class);
  }

  /**
   * Convert an instance of V2MetricStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
