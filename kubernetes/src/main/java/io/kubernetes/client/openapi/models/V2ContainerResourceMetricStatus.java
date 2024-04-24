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
import io.kubernetes.client.openapi.models.V2MetricValueStatus;
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
 * ContainerResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing a single container in each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \&quot;pods\&quot; source.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V2ContainerResourceMetricStatus {
  public static final String SERIALIZED_NAME_CONTAINER = "container";
  @SerializedName(SERIALIZED_NAME_CONTAINER)
  private String container;

  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private V2MetricValueStatus current;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public V2ContainerResourceMetricStatus() {
  }

  public V2ContainerResourceMetricStatus container(String container) {

    this.container = container;
    return this;
  }

   /**
   * container is the name of the container in the pods of the scaling target
   * @return container
  **/
  @jakarta.annotation.Nonnull
  public String getContainer() {
    return container;
  }


  public void setContainer(String container) {
    this.container = container;
  }


  public V2ContainerResourceMetricStatus current(V2MetricValueStatus current) {

    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @jakarta.annotation.Nonnull
  public V2MetricValueStatus getCurrent() {
    return current;
  }


  public void setCurrent(V2MetricValueStatus current) {
    this.current = current;
  }


  public V2ContainerResourceMetricStatus name(String name) {

    this.name = name;
    return this;
  }

   /**
   * name is the name of the resource in question.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ContainerResourceMetricStatus v2ContainerResourceMetricStatus = (V2ContainerResourceMetricStatus) o;
    return Objects.equals(this.container, v2ContainerResourceMetricStatus.container) &&
        Objects.equals(this.current, v2ContainerResourceMetricStatus.current) &&
        Objects.equals(this.name, v2ContainerResourceMetricStatus.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(container, current, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ContainerResourceMetricStatus {\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("container");
    openapiFields.add("current");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("container");
    openapiRequiredFields.add("current");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V2ContainerResourceMetricStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V2ContainerResourceMetricStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V2ContainerResourceMetricStatus is not found in the empty JSON string", V2ContainerResourceMetricStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V2ContainerResourceMetricStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V2ContainerResourceMetricStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V2ContainerResourceMetricStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("container").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `container` to be a primitive type in the JSON string but got `%s`", jsonObj.get("container").toString()));
      }
      // validate the required field `current`
      V2MetricValueStatus.validateJsonObject(jsonObj.getAsJsonObject("current"));
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V2ContainerResourceMetricStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V2ContainerResourceMetricStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V2ContainerResourceMetricStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V2ContainerResourceMetricStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V2ContainerResourceMetricStatus>() {
           @Override
           public void write(JsonWriter out, V2ContainerResourceMetricStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V2ContainerResourceMetricStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V2ContainerResourceMetricStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V2ContainerResourceMetricStatus
  * @throws IOException if the JSON string is invalid with respect to V2ContainerResourceMetricStatus
  */
  public static V2ContainerResourceMetricStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V2ContainerResourceMetricStatus.class);
  }

 /**
  * Convert an instance of V2ContainerResourceMetricStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
