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
import io.kubernetes.client.openapi.models.V2MetricIdentifier;
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
 * ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V2ExternalMetricStatus {
  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private V2MetricValueStatus current;

  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private V2MetricIdentifier metric;

  public V2ExternalMetricStatus() {
  }

  public V2ExternalMetricStatus current(V2MetricValueStatus current) {

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


  public V2ExternalMetricStatus metric(V2MetricIdentifier metric) {

    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @jakarta.annotation.Nonnull
  public V2MetricIdentifier getMetric() {
    return metric;
  }


  public void setMetric(V2MetricIdentifier metric) {
    this.metric = metric;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ExternalMetricStatus v2ExternalMetricStatus = (V2ExternalMetricStatus) o;
    return Objects.equals(this.current, v2ExternalMetricStatus.current) &&
        Objects.equals(this.metric, v2ExternalMetricStatus.metric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, metric);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ExternalMetricStatus {\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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
    openapiFields.add("current");
    openapiFields.add("metric");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("current");
    openapiRequiredFields.add("metric");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V2ExternalMetricStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V2ExternalMetricStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V2ExternalMetricStatus is not found in the empty JSON string", V2ExternalMetricStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V2ExternalMetricStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V2ExternalMetricStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V2ExternalMetricStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `current`
      V2MetricValueStatus.validateJsonObject(jsonObj.getAsJsonObject("current"));
      // validate the required field `metric`
      V2MetricIdentifier.validateJsonObject(jsonObj.getAsJsonObject("metric"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V2ExternalMetricStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V2ExternalMetricStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V2ExternalMetricStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V2ExternalMetricStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V2ExternalMetricStatus>() {
           @Override
           public void write(JsonWriter out, V2ExternalMetricStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V2ExternalMetricStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V2ExternalMetricStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V2ExternalMetricStatus
  * @throws IOException if the JSON string is invalid with respect to V2ExternalMetricStatus
  */
  public static V2ExternalMetricStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V2ExternalMetricStatus.class);
  }

 /**
  * Convert an instance of V2ExternalMetricStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
