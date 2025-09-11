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
import io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition;
import io.kubernetes.client.openapi.models.V2MetricStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
 */
@ApiModel(description = "HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V2HorizontalPodAutoscalerStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<V2HorizontalPodAutoscalerCondition> conditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CURRENT_METRICS = "currentMetrics";
  @SerializedName(SERIALIZED_NAME_CURRENT_METRICS)
  @jakarta.annotation.Nullable
  private List<V2MetricStatus> currentMetrics = new ArrayList<>();

  public static final String SERIALIZED_NAME_CURRENT_REPLICAS = "currentReplicas";
  @SerializedName(SERIALIZED_NAME_CURRENT_REPLICAS)
  @jakarta.annotation.Nullable
  private Integer currentReplicas;

  public static final String SERIALIZED_NAME_DESIRED_REPLICAS = "desiredReplicas";
  @SerializedName(SERIALIZED_NAME_DESIRED_REPLICAS)
  @jakarta.annotation.Nonnull
  private Integer desiredReplicas;

  public static final String SERIALIZED_NAME_LAST_SCALE_TIME = "lastScaleTime";
  @SerializedName(SERIALIZED_NAME_LAST_SCALE_TIME)
  @jakarta.annotation.Nullable
  private OffsetDateTime lastScaleTime;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  @jakarta.annotation.Nullable
  private Long observedGeneration;

  public V2HorizontalPodAutoscalerStatus() {
  }

  public V2HorizontalPodAutoscalerStatus conditions(@jakarta.annotation.Nullable List<V2HorizontalPodAutoscalerCondition> conditions) {
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
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.")
  public List<V2HorizontalPodAutoscalerCondition> getConditions() {
    return conditions;
  }

  public void setConditions(@jakarta.annotation.Nullable List<V2HorizontalPodAutoscalerCondition> conditions) {
    this.conditions = conditions;
  }


  public V2HorizontalPodAutoscalerStatus currentMetrics(@jakarta.annotation.Nullable List<V2MetricStatus> currentMetrics) {
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
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "currentMetrics is the last read state of the metrics used by this autoscaler.")
  public List<V2MetricStatus> getCurrentMetrics() {
    return currentMetrics;
  }

  public void setCurrentMetrics(@jakarta.annotation.Nullable List<V2MetricStatus> currentMetrics) {
    this.currentMetrics = currentMetrics;
  }


  public V2HorizontalPodAutoscalerStatus currentReplicas(@jakarta.annotation.Nullable Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
    return this;
  }

  /**
   * currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
   * @return currentReplicas
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.")
  public Integer getCurrentReplicas() {
    return currentReplicas;
  }

  public void setCurrentReplicas(@jakarta.annotation.Nullable Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
  }


  public V2HorizontalPodAutoscalerStatus desiredReplicas(@jakarta.annotation.Nonnull Integer desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
    return this;
  }

  /**
   * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
   * @return desiredReplicas
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.")
  public Integer getDesiredReplicas() {
    return desiredReplicas;
  }

  public void setDesiredReplicas(@jakarta.annotation.Nonnull Integer desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
  }


  public V2HorizontalPodAutoscalerStatus lastScaleTime(@jakarta.annotation.Nullable OffsetDateTime lastScaleTime) {
    this.lastScaleTime = lastScaleTime;
    return this;
  }

  /**
   * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.
   * @return lastScaleTime
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.")
  public OffsetDateTime getLastScaleTime() {
    return lastScaleTime;
  }

  public void setLastScaleTime(@jakarta.annotation.Nullable OffsetDateTime lastScaleTime) {
    this.lastScaleTime = lastScaleTime;
  }


  public V2HorizontalPodAutoscalerStatus observedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * observedGeneration is the most recent generation observed by this autoscaler.
   * @return observedGeneration
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "observedGeneration is the most recent generation observed by this autoscaler.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
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
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V2HorizontalPodAutoscalerStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V2HorizontalPodAutoscalerStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V2HorizontalPodAutoscalerStatus is not found in the empty JSON string", V2HorizontalPodAutoscalerStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V2HorizontalPodAutoscalerStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V2HorizontalPodAutoscalerStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V2HorizontalPodAutoscalerStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            V2HorizontalPodAutoscalerCondition.validateJsonElement(jsonArrayconditions.get(i));
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
            V2MetricStatus.validateJsonElement(jsonArraycurrentMetrics.get(i));
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
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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
