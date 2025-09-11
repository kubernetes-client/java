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
import io.kubernetes.client.openapi.models.V2CrossVersionObjectReference;
import io.kubernetes.client.openapi.models.V2MetricIdentifier;
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
 * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 */
@ApiModel(description = "ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V2ObjectMetricSource {
  public static final String SERIALIZED_NAME_DESCRIBED_OBJECT = "describedObject";
  @SerializedName(SERIALIZED_NAME_DESCRIBED_OBJECT)
  @jakarta.annotation.Nonnull
  private V2CrossVersionObjectReference describedObject;

  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  @jakarta.annotation.Nonnull
  private V2MetricIdentifier metric;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  @jakarta.annotation.Nonnull
  private V2MetricTarget target;

  public V2ObjectMetricSource() {
  }

  public V2ObjectMetricSource describedObject(@jakarta.annotation.Nonnull V2CrossVersionObjectReference describedObject) {
    this.describedObject = describedObject;
    return this;
  }

  /**
   * Get describedObject
   * @return describedObject
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public V2CrossVersionObjectReference getDescribedObject() {
    return describedObject;
  }

  public void setDescribedObject(@jakarta.annotation.Nonnull V2CrossVersionObjectReference describedObject) {
    this.describedObject = describedObject;
  }


  public V2ObjectMetricSource metric(@jakarta.annotation.Nonnull V2MetricIdentifier metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Get metric
   * @return metric
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public V2MetricIdentifier getMetric() {
    return metric;
  }

  public void setMetric(@jakarta.annotation.Nonnull V2MetricIdentifier metric) {
    this.metric = metric;
  }


  public V2ObjectMetricSource target(@jakarta.annotation.Nonnull V2MetricTarget target) {
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
    V2ObjectMetricSource v2ObjectMetricSource = (V2ObjectMetricSource) o;
    return Objects.equals(this.describedObject, v2ObjectMetricSource.describedObject) &&
        Objects.equals(this.metric, v2ObjectMetricSource.metric) &&
        Objects.equals(this.target, v2ObjectMetricSource.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(describedObject, metric, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ObjectMetricSource {\n");
    sb.append("    describedObject: ").append(toIndentedString(describedObject)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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
    openapiFields.add("describedObject");
    openapiFields.add("metric");
    openapiFields.add("target");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("describedObject");
    openapiRequiredFields.add("metric");
    openapiRequiredFields.add("target");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V2ObjectMetricSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V2ObjectMetricSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V2ObjectMetricSource is not found in the empty JSON string", V2ObjectMetricSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V2ObjectMetricSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V2ObjectMetricSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V2ObjectMetricSource.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `describedObject`
      V2CrossVersionObjectReference.validateJsonElement(jsonObj.get("describedObject"));
      // validate the required field `metric`
      V2MetricIdentifier.validateJsonElement(jsonObj.get("metric"));
      // validate the required field `target`
      V2MetricTarget.validateJsonElement(jsonObj.get("target"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V2ObjectMetricSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V2ObjectMetricSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V2ObjectMetricSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V2ObjectMetricSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V2ObjectMetricSource>() {
           @Override
           public void write(JsonWriter out, V2ObjectMetricSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V2ObjectMetricSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V2ObjectMetricSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V2ObjectMetricSource
   * @throws IOException if the JSON string is invalid with respect to V2ObjectMetricSource
   */
  public static V2ObjectMetricSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V2ObjectMetricSource.class);
  }

  /**
   * Convert an instance of V2ObjectMetricSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
