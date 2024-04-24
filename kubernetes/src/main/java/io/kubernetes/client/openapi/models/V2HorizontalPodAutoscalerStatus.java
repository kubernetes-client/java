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
import io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition;
import io.kubernetes.client.openapi.models.V2MetricStatus;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

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
 * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V2HorizontalPodAutoscalerStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V2HorizontalPodAutoscalerCondition> conditions;

  public static final String SERIALIZED_NAME_CURRENT_METRICS = "currentMetrics";
  @SerializedName(SERIALIZED_NAME_CURRENT_METRICS)
  private List<V2MetricStatus> currentMetrics;

  public static final String SERIALIZED_NAME_CURRENT_REPLICAS = "currentReplicas";
  @SerializedName(SERIALIZED_NAME_CURRENT_REPLICAS)
  private Integer currentReplicas;

  public static final String SERIALIZED_NAME_DESIRED_REPLICAS = "desiredReplicas";
  @SerializedName(SERIALIZED_NAME_DESIRED_REPLICAS)
  private Integer desiredReplicas;

  public static final String SERIALIZED_NAME_LAST_SCALE_TIME = "lastScaleTime";
  @SerializedName(SERIALIZED_NAME_LAST_SCALE_TIME)
  private OffsetDateTime lastScaleTime;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;

  public V2HorizontalPodAutoscalerStatus() {
  }

  public V2HorizontalPodAutoscalerStatus conditions(List<V2HorizontalPodAutoscalerCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V2HorizontalPodAutoscalerStatus addConditionsItem(V2HorizontalPodAutoscalerCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
   * @return conditions
  **/
  @jakarta.annotation.Nullable
  public List<V2HorizontalPodAutoscalerCondition> getConditions() {
    return conditions;
  }


  public void setConditions(List<V2HorizontalPodAutoscalerCondition> conditions) {
    this.conditions = conditions;
  }


  public V2HorizontalPodAutoscalerStatus currentMetrics(List<V2MetricStatus> currentMetrics) {

    this.currentMetrics = currentMetrics;
    return this;
  }

  public V2HorizontalPodAutoscalerStatus addCurrentMetricsItem(V2MetricStatus currentMetricsItem) {
    if (this.currentMetrics == null) {
      this.currentMetrics = new ArrayList<>();
    }
    this.currentMetrics.add(currentMetricsItem);
    return this;
  }

   /**
   * currentMetrics is the last read state of the metrics used by this autoscaler.
   * @return currentMetrics
  **/
  @jakarta.annotation.Nullable
  public List<V2MetricStatus> getCurrentMetrics() {
    return currentMetrics;
  }


  public void setCurrentMetrics(List<V2MetricStatus> currentMetrics) {
    this.currentMetrics = currentMetrics;
  }


  public V2HorizontalPodAutoscalerStatus currentReplicas(Integer currentReplicas) {

    this.currentReplicas = currentReplicas;
    return this;
  }

   /**
   * currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
   * @return currentReplicas
  **/
  @jakarta.annotation.Nullable
  public Integer getCurrentReplicas() {
    return currentReplicas;
  }


  public void setCurrentReplicas(Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
  }


  public V2HorizontalPodAutoscalerStatus desiredReplicas(Integer desiredReplicas) {

    this.desiredReplicas = desiredReplicas;
    return this;
  }

   /**
   * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
   * @return desiredReplicas
  **/
  @jakarta.annotation.Nonnull
  public Integer getDesiredReplicas() {
    return desiredReplicas;
  }


  public void setDesiredReplicas(Integer desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
  }


  public V2HorizontalPodAutoscalerStatus lastScaleTime(OffsetDateTime lastScaleTime) {

    this.lastScaleTime = lastScaleTime;
    return this;
  }

   /**
   * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.
   * @return lastScaleTime
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getLastScaleTime() {
    return lastScaleTime;
  }


  public void setLastScaleTime(OffsetDateTime lastScaleTime) {
    this.lastScaleTime = lastScaleTime;
  }


  public V2HorizontalPodAutoscalerStatus observedGeneration(Long observedGeneration) {

    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * observedGeneration is the most recent generation observed by this autoscaler.
   * @return observedGeneration
  **/
  @jakarta.annotation.Nullable
  public Long getObservedGeneration() {
    return observedGeneration;
  }


  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2HorizontalPodAutoscalerStatus v2HorizontalPodAutoscalerStatus = (V2HorizontalPodAutoscalerStatus) o;
    return Objects.equals(this.conditions, v2HorizontalPodAutoscalerStatus.conditions) &&
        Objects.equals(this.currentMetrics, v2HorizontalPodAutoscalerStatus.currentMetrics) &&
        Objects.equals(this.currentReplicas, v2HorizontalPodAutoscalerStatus.currentReplicas) &&
        Objects.equals(this.desiredReplicas, v2HorizontalPodAutoscalerStatus.desiredReplicas) &&
        Objects.equals(this.lastScaleTime, v2HorizontalPodAutoscalerStatus.lastScaleTime) &&
        Objects.equals(this.observedGeneration, v2HorizontalPodAutoscalerStatus.observedGeneration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, currentMetrics, currentReplicas, desiredReplicas, lastScaleTime, observedGeneration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2HorizontalPodAutoscalerStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    currentMetrics: ").append(toIndentedString(currentMetrics)).append("\n");
    sb.append("    currentReplicas: ").append(toIndentedString(currentReplicas)).append("\n");
    sb.append("    desiredReplicas: ").append(toIndentedString(desiredReplicas)).append("\n");
    sb.append("    lastScaleTime: ").append(toIndentedString(lastScaleTime)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
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
    openapiFields.add("conditions");
    openapiFields.add("currentMetrics");
    openapiFields.add("currentReplicas");
    openapiFields.add("desiredReplicas");
    openapiFields.add("lastScaleTime");
    openapiFields.add("observedGeneration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("desiredReplicas");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V2HorizontalPodAutoscalerStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V2HorizontalPodAutoscalerStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V2HorizontalPodAutoscalerStatus is not found in the empty JSON string", V2HorizontalPodAutoscalerStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V2HorizontalPodAutoscalerStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V2HorizontalPodAutoscalerStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V2HorizontalPodAutoscalerStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            V2HorizontalPodAutoscalerCondition.validateJsonObject(jsonArrayconditions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("currentMetrics") != null && !jsonObj.get("currentMetrics").isJsonNull()) {
        JsonArray jsonArraycurrentMetrics = jsonObj.getAsJsonArray("currentMetrics");
        if (jsonArraycurrentMetrics != null) {
          // ensure the json data is an array
          if (!jsonObj.get("currentMetrics").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `currentMetrics` to be an array in the JSON string but got `%s`", jsonObj.get("currentMetrics").toString()));
          }

          // validate the optional field `currentMetrics` (array)
          for (int i = 0; i < jsonArraycurrentMetrics.size(); i++) {
            V2MetricStatus.validateJsonObject(jsonArraycurrentMetrics.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V2HorizontalPodAutoscalerStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V2HorizontalPodAutoscalerStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V2HorizontalPodAutoscalerStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V2HorizontalPodAutoscalerStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V2HorizontalPodAutoscalerStatus>() {
           @Override
           public void write(JsonWriter out, V2HorizontalPodAutoscalerStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V2HorizontalPodAutoscalerStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V2HorizontalPodAutoscalerStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V2HorizontalPodAutoscalerStatus
  * @throws IOException if the JSON string is invalid with respect to V2HorizontalPodAutoscalerStatus
  */
  public static V2HorizontalPodAutoscalerStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V2HorizontalPodAutoscalerStatus.class);
  }

 /**
  * Convert an instance of V2HorizontalPodAutoscalerStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
