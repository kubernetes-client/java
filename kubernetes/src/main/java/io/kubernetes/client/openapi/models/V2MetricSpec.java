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
import io.kubernetes.client.openapi.models.V2ContainerResourceMetricSource;
import io.kubernetes.client.openapi.models.V2ExternalMetricSource;
import io.kubernetes.client.openapi.models.V2ObjectMetricSource;
import io.kubernetes.client.openapi.models.V2PodsMetricSource;
import io.kubernetes.client.openapi.models.V2ResourceMetricSource;
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
 * MetricSpec specifies how to scale based on a single metric (only &#x60;type&#x60; and one other matching field should be set at once).
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V2MetricSpec {
  public static final String SERIALIZED_NAME_CONTAINER_RESOURCE = "containerResource";
  @SerializedName(SERIALIZED_NAME_CONTAINER_RESOURCE)
  private V2ContainerResourceMetricSource containerResource;

  public static final String SERIALIZED_NAME_EXTERNAL = "external";
  @SerializedName(SERIALIZED_NAME_EXTERNAL)
  private V2ExternalMetricSource external;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private V2ObjectMetricSource _object;

  public static final String SERIALIZED_NAME_PODS = "pods";
  @SerializedName(SERIALIZED_NAME_PODS)
  private V2PodsMetricSource pods;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private V2ResourceMetricSource resource;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V2MetricSpec() {
  }

  public V2MetricSpec containerResource(V2ContainerResourceMetricSource containerResource) {

    this.containerResource = containerResource;
    return this;
  }

   /**
   * Get containerResource
   * @return containerResource
  **/
  @jakarta.annotation.Nullable
  public V2ContainerResourceMetricSource getContainerResource() {
    return containerResource;
  }


  public void setContainerResource(V2ContainerResourceMetricSource containerResource) {
    this.containerResource = containerResource;
  }


  public V2MetricSpec external(V2ExternalMetricSource external) {

    this.external = external;
    return this;
  }

   /**
   * Get external
   * @return external
  **/
  @jakarta.annotation.Nullable
  public V2ExternalMetricSource getExternal() {
    return external;
  }


  public void setExternal(V2ExternalMetricSource external) {
    this.external = external;
  }


  public V2MetricSpec _object(V2ObjectMetricSource _object) {

    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @jakarta.annotation.Nullable
  public V2ObjectMetricSource getObject() {
    return _object;
  }


  public void setObject(V2ObjectMetricSource _object) {
    this._object = _object;
  }


  public V2MetricSpec pods(V2PodsMetricSource pods) {

    this.pods = pods;
    return this;
  }

   /**
   * Get pods
   * @return pods
  **/
  @jakarta.annotation.Nullable
  public V2PodsMetricSource getPods() {
    return pods;
  }


  public void setPods(V2PodsMetricSource pods) {
    this.pods = pods;
  }


  public V2MetricSpec resource(V2ResourceMetricSource resource) {

    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @jakarta.annotation.Nullable
  public V2ResourceMetricSource getResource() {
    return resource;
  }


  public void setResource(V2ResourceMetricSource resource) {
    this.resource = resource;
  }


  public V2MetricSpec type(String type) {

    this.type = type;
    return this;
  }

   /**
   * type is the type of metric source.  It should be one of \&quot;ContainerResource\&quot;, \&quot;External\&quot;, \&quot;Object\&quot;, \&quot;Pods\&quot; or \&quot;Resource\&quot;, each mapping to a matching field in the object. Note: \&quot;ContainerResource\&quot; type is available on when the feature-gate HPAContainerMetrics is enabled
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
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
    V2MetricSpec v2MetricSpec = (V2MetricSpec) o;
    return Objects.equals(this.containerResource, v2MetricSpec.containerResource) &&
        Objects.equals(this.external, v2MetricSpec.external) &&
        Objects.equals(this._object, v2MetricSpec._object) &&
        Objects.equals(this.pods, v2MetricSpec.pods) &&
        Objects.equals(this.resource, v2MetricSpec.resource) &&
        Objects.equals(this.type, v2MetricSpec.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerResource, external, _object, pods, resource, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2MetricSpec {\n");
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V2MetricSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V2MetricSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V2MetricSpec is not found in the empty JSON string", V2MetricSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V2MetricSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V2MetricSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V2MetricSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `containerResource`
      if (jsonObj.get("containerResource") != null && !jsonObj.get("containerResource").isJsonNull()) {
        V2ContainerResourceMetricSource.validateJsonObject(jsonObj.getAsJsonObject("containerResource"));
      }
      // validate the optional field `external`
      if (jsonObj.get("external") != null && !jsonObj.get("external").isJsonNull()) {
        V2ExternalMetricSource.validateJsonObject(jsonObj.getAsJsonObject("external"));
      }
      // validate the optional field `object`
      if (jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) {
        V2ObjectMetricSource.validateJsonObject(jsonObj.getAsJsonObject("object"));
      }
      // validate the optional field `pods`
      if (jsonObj.get("pods") != null && !jsonObj.get("pods").isJsonNull()) {
        V2PodsMetricSource.validateJsonObject(jsonObj.getAsJsonObject("pods"));
      }
      // validate the optional field `resource`
      if (jsonObj.get("resource") != null && !jsonObj.get("resource").isJsonNull()) {
        V2ResourceMetricSource.validateJsonObject(jsonObj.getAsJsonObject("resource"));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V2MetricSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V2MetricSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V2MetricSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V2MetricSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V2MetricSpec>() {
           @Override
           public void write(JsonWriter out, V2MetricSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V2MetricSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V2MetricSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V2MetricSpec
  * @throws IOException if the JSON string is invalid with respect to V2MetricSpec
  */
  public static V2MetricSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V2MetricSpec.class);
  }

 /**
  * Convert an instance of V2MetricSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
