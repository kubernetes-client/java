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
import io.kubernetes.client.openapi.models.V2MetricTarget;
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
 * ContainerResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \&quot;pods\&quot; source.  Only one \&quot;target\&quot; type should be set.
 */
@ApiModel(description = "ContainerResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \"pods\" source.  Only one \"target\" type should be set.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V2ContainerResourceMetricSource {
  public static final String SERIALIZED_NAME_CONTAINER = "container";
  @SerializedName(SERIALIZED_NAME_CONTAINER)
  @jakarta.annotation.Nonnull
  private String container;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  @jakarta.annotation.Nonnull
  private V2MetricTarget target;

  public V2ContainerResourceMetricSource() {
  }

  public V2ContainerResourceMetricSource container(@jakarta.annotation.Nonnull String container) {
    this.container = container;
    return this;
  }

  /**
   * container is the name of the container in the pods of the scaling target
   * @return container
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "container is the name of the container in the pods of the scaling target")
  public String getContainer() {
    return container;
  }

  public void setContainer(@jakarta.annotation.Nonnull String container) {
    this.container = container;
  }


  public V2ContainerResourceMetricSource name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * name is the name of the resource in question.
   * @return name
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "name is the name of the resource in question.")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }


  public V2ContainerResourceMetricSource target(@jakarta.annotation.Nonnull V2MetricTarget target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public V2MetricTarget getTarget() {
    return target;
  }

  public void setTarget(@jakarta.annotation.Nonnull V2MetricTarget target) {
    this.target = target;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ContainerResourceMetricSource v2ContainerResourceMetricSource = (V2ContainerResourceMetricSource) o;
    return Objects.equals(this.container, v2ContainerResourceMetricSource.container) &&
        Objects.equals(this.name, v2ContainerResourceMetricSource.name) &&
        Objects.equals(this.target, v2ContainerResourceMetricSource.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(container, name, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ContainerResourceMetricSource {\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("target");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("container");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("target");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V2ContainerResourceMetricSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V2ContainerResourceMetricSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V2ContainerResourceMetricSource is not found in the empty JSON string", V2ContainerResourceMetricSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V2ContainerResourceMetricSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V2ContainerResourceMetricSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V2ContainerResourceMetricSource.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("container").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `container` to be a primitive type in the JSON string but got `%s`", jsonObj.get("container").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `target`
      V2MetricTarget.validateJsonElement(jsonObj.get("target"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V2ContainerResourceMetricSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V2ContainerResourceMetricSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V2ContainerResourceMetricSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V2ContainerResourceMetricSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V2ContainerResourceMetricSource>() {
           @Override
           public void write(JsonWriter out, V2ContainerResourceMetricSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V2ContainerResourceMetricSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V2ContainerResourceMetricSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V2ContainerResourceMetricSource
   * @throws IOException if the JSON string is invalid with respect to V2ContainerResourceMetricSource
   */
  public static V2ContainerResourceMetricSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V2ContainerResourceMetricSource.class);
  }

  /**
   * Convert an instance of V2ContainerResourceMetricSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
