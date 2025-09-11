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
import java.time.OffsetDateTime;
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
 * current status of a horizontal pod autoscaler
 */
@ApiModel(description = "current status of a horizontal pod autoscaler")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1HorizontalPodAutoscalerStatus {
  public static final String SERIALIZED_NAME_CURRENT_C_P_U_UTILIZATION_PERCENTAGE = "currentCPUUtilizationPercentage";
  @SerializedName(SERIALIZED_NAME_CURRENT_C_P_U_UTILIZATION_PERCENTAGE)
  @jakarta.annotation.Nullable
  private Integer currentCPUUtilizationPercentage;

  public static final String SERIALIZED_NAME_CURRENT_REPLICAS = "currentReplicas";
  @SerializedName(SERIALIZED_NAME_CURRENT_REPLICAS)
  @jakarta.annotation.Nonnull
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

  public V1HorizontalPodAutoscalerStatus() {
  }

  public V1HorizontalPodAutoscalerStatus currentCPUUtilizationPercentage(@jakarta.annotation.Nullable Integer currentCPUUtilizationPercentage) {
    this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
    return this;
  }

  /**
   * currentCPUUtilizationPercentage is the current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
   * @return currentCPUUtilizationPercentage
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "currentCPUUtilizationPercentage is the current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.")
  public Integer getCurrentCPUUtilizationPercentage() {
    return currentCPUUtilizationPercentage;
  }

  public void setCurrentCPUUtilizationPercentage(@jakarta.annotation.Nullable Integer currentCPUUtilizationPercentage) {
    this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
  }


  public V1HorizontalPodAutoscalerStatus currentReplicas(@jakarta.annotation.Nonnull Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
    return this;
  }

  /**
   * currentReplicas is the current number of replicas of pods managed by this autoscaler.
   * @return currentReplicas
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "currentReplicas is the current number of replicas of pods managed by this autoscaler.")
  public Integer getCurrentReplicas() {
    return currentReplicas;
  }

  public void setCurrentReplicas(@jakarta.annotation.Nonnull Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
  }


  public V1HorizontalPodAutoscalerStatus desiredReplicas(@jakarta.annotation.Nonnull Integer desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
    return this;
  }

  /**
   * desiredReplicas is the  desired number of replicas of pods managed by this autoscaler.
   * @return desiredReplicas
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "desiredReplicas is the  desired number of replicas of pods managed by this autoscaler.")
  public Integer getDesiredReplicas() {
    return desiredReplicas;
  }

  public void setDesiredReplicas(@jakarta.annotation.Nonnull Integer desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
  }


  public V1HorizontalPodAutoscalerStatus lastScaleTime(@jakarta.annotation.Nullable OffsetDateTime lastScaleTime) {
    this.lastScaleTime = lastScaleTime;
    return this;
  }

  /**
   * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed.
   * @return lastScaleTime
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed.")
  public OffsetDateTime getLastScaleTime() {
    return lastScaleTime;
  }

  public void setLastScaleTime(@jakarta.annotation.Nullable OffsetDateTime lastScaleTime) {
    this.lastScaleTime = lastScaleTime;
  }


  public V1HorizontalPodAutoscalerStatus observedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
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
    V1HorizontalPodAutoscalerStatus v1HorizontalPodAutoscalerStatus = (V1HorizontalPodAutoscalerStatus) o;
    return Objects.equals(this.currentCPUUtilizationPercentage, v1HorizontalPodAutoscalerStatus.currentCPUUtilizationPercentage) &&
        Objects.equals(this.currentReplicas, v1HorizontalPodAutoscalerStatus.currentReplicas) &&
        Objects.equals(this.desiredReplicas, v1HorizontalPodAutoscalerStatus.desiredReplicas) &&
        Objects.equals(this.lastScaleTime, v1HorizontalPodAutoscalerStatus.lastScaleTime) &&
        Objects.equals(this.observedGeneration, v1HorizontalPodAutoscalerStatus.observedGeneration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentCPUUtilizationPercentage, currentReplicas, desiredReplicas, lastScaleTime, observedGeneration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HorizontalPodAutoscalerStatus {\n");
    sb.append("    currentCPUUtilizationPercentage: ").append(toIndentedString(currentCPUUtilizationPercentage)).append("\n");
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
    openapiFields.add("currentCPUUtilizationPercentage");
    openapiFields.add("currentReplicas");
    openapiFields.add("desiredReplicas");
    openapiFields.add("lastScaleTime");
    openapiFields.add("observedGeneration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("currentReplicas");
    openapiRequiredFields.add("desiredReplicas");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1HorizontalPodAutoscalerStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1HorizontalPodAutoscalerStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1HorizontalPodAutoscalerStatus is not found in the empty JSON string", V1HorizontalPodAutoscalerStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1HorizontalPodAutoscalerStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1HorizontalPodAutoscalerStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1HorizontalPodAutoscalerStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1HorizontalPodAutoscalerStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1HorizontalPodAutoscalerStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1HorizontalPodAutoscalerStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1HorizontalPodAutoscalerStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1HorizontalPodAutoscalerStatus>() {
           @Override
           public void write(JsonWriter out, V1HorizontalPodAutoscalerStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1HorizontalPodAutoscalerStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1HorizontalPodAutoscalerStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1HorizontalPodAutoscalerStatus
   * @throws IOException if the JSON string is invalid with respect to V1HorizontalPodAutoscalerStatus
   */
  public static V1HorizontalPodAutoscalerStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1HorizontalPodAutoscalerStatus.class);
  }

  /**
   * Convert an instance of V1HorizontalPodAutoscalerStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
