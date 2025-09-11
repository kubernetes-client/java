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
import io.kubernetes.client.openapi.models.V1StatefulSetCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * StatefulSetStatus represents the current state of a StatefulSet.
 */
@ApiModel(description = "StatefulSetStatus represents the current state of a StatefulSet.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1StatefulSetStatus {
  public static final String SERIALIZED_NAME_AVAILABLE_REPLICAS = "availableReplicas";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_REPLICAS)
  @jakarta.annotation.Nullable
  private Integer availableReplicas;

  public static final String SERIALIZED_NAME_COLLISION_COUNT = "collisionCount";
  @SerializedName(SERIALIZED_NAME_COLLISION_COUNT)
  @jakarta.annotation.Nullable
  private Integer collisionCount;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<V1StatefulSetCondition> conditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CURRENT_REPLICAS = "currentReplicas";
  @SerializedName(SERIALIZED_NAME_CURRENT_REPLICAS)
  @jakarta.annotation.Nullable
  private Integer currentReplicas;

  public static final String SERIALIZED_NAME_CURRENT_REVISION = "currentRevision";
  @SerializedName(SERIALIZED_NAME_CURRENT_REVISION)
  @jakarta.annotation.Nullable
  private String currentRevision;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  @jakarta.annotation.Nullable
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_READY_REPLICAS = "readyReplicas";
  @SerializedName(SERIALIZED_NAME_READY_REPLICAS)
  @jakarta.annotation.Nullable
  private Integer readyReplicas;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  @jakarta.annotation.Nonnull
  private Integer replicas;

  public static final String SERIALIZED_NAME_UPDATE_REVISION = "updateRevision";
  @SerializedName(SERIALIZED_NAME_UPDATE_REVISION)
  @jakarta.annotation.Nullable
  private String updateRevision;

  public static final String SERIALIZED_NAME_UPDATED_REPLICAS = "updatedReplicas";
  @SerializedName(SERIALIZED_NAME_UPDATED_REPLICAS)
  @jakarta.annotation.Nullable
  private Integer updatedReplicas;

  public V1StatefulSetStatus() {
  }

  public V1StatefulSetStatus availableReplicas(@jakarta.annotation.Nullable Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
    return this;
  }

  /**
   * Total number of available pods (ready for at least minReadySeconds) targeted by this statefulset.
   * @return availableReplicas
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Total number of available pods (ready for at least minReadySeconds) targeted by this statefulset.")
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }

  public void setAvailableReplicas(@jakarta.annotation.Nullable Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }


  public V1StatefulSetStatus collisionCount(@jakarta.annotation.Nullable Integer collisionCount) {
    this.collisionCount = collisionCount;
    return this;
  }

  /**
   * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
   * @return collisionCount
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.")
  public Integer getCollisionCount() {
    return collisionCount;
  }

  public void setCollisionCount(@jakarta.annotation.Nullable Integer collisionCount) {
    this.collisionCount = collisionCount;
  }


  public V1StatefulSetStatus conditions(@jakarta.annotation.Nullable List<V1StatefulSetCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1StatefulSetStatus addConditionsItem(V1StatefulSetCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Represents the latest available observations of a statefulset&#39;s current state.
   * @return conditions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Represents the latest available observations of a statefulset's current state.")
  public List<V1StatefulSetCondition> getConditions() {
    return conditions;
  }

  public void setConditions(@jakarta.annotation.Nullable List<V1StatefulSetCondition> conditions) {
    this.conditions = conditions;
  }


  public V1StatefulSetStatus currentReplicas(@jakarta.annotation.Nullable Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
    return this;
  }

  /**
   * currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
   * @return currentReplicas
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.")
  public Integer getCurrentReplicas() {
    return currentReplicas;
  }

  public void setCurrentReplicas(@jakarta.annotation.Nullable Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
  }


  public V1StatefulSetStatus currentRevision(@jakarta.annotation.Nullable String currentRevision) {
    this.currentRevision = currentRevision;
    return this;
  }

  /**
   * currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
   * @return currentRevision
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).")
  public String getCurrentRevision() {
    return currentRevision;
  }

  public void setCurrentRevision(@jakarta.annotation.Nullable String currentRevision) {
    this.currentRevision = currentRevision;
  }


  public V1StatefulSetStatus observedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet&#39;s generation, which is updated on mutation by the API Server.
   * @return observedGeneration
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet's generation, which is updated on mutation by the API Server.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  public V1StatefulSetStatus readyReplicas(@jakarta.annotation.Nullable Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
    return this;
  }

  /**
   * readyReplicas is the number of pods created for this StatefulSet with a Ready Condition.
   * @return readyReplicas
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "readyReplicas is the number of pods created for this StatefulSet with a Ready Condition.")
  public Integer getReadyReplicas() {
    return readyReplicas;
  }

  public void setReadyReplicas(@jakarta.annotation.Nullable Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }


  public V1StatefulSetStatus replicas(@jakarta.annotation.Nonnull Integer replicas) {
    this.replicas = replicas;
    return this;
  }

  /**
   * replicas is the number of Pods created by the StatefulSet controller.
   * @return replicas
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "replicas is the number of Pods created by the StatefulSet controller.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(@jakarta.annotation.Nonnull Integer replicas) {
    this.replicas = replicas;
  }


  public V1StatefulSetStatus updateRevision(@jakarta.annotation.Nullable String updateRevision) {
    this.updateRevision = updateRevision;
    return this;
  }

  /**
   * updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
   * @return updateRevision
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)")
  public String getUpdateRevision() {
    return updateRevision;
  }

  public void setUpdateRevision(@jakarta.annotation.Nullable String updateRevision) {
    this.updateRevision = updateRevision;
  }


  public V1StatefulSetStatus updatedReplicas(@jakarta.annotation.Nullable Integer updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
    return this;
  }

  /**
   * updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
   * @return updatedReplicas
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.")
  public Integer getUpdatedReplicas() {
    return updatedReplicas;
  }

  public void setUpdatedReplicas(@jakarta.annotation.Nullable Integer updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1StatefulSetStatus v1StatefulSetStatus = (V1StatefulSetStatus) o;
    return Objects.equals(this.availableReplicas, v1StatefulSetStatus.availableReplicas) &&
        Objects.equals(this.collisionCount, v1StatefulSetStatus.collisionCount) &&
        Objects.equals(this.conditions, v1StatefulSetStatus.conditions) &&
        Objects.equals(this.currentReplicas, v1StatefulSetStatus.currentReplicas) &&
        Objects.equals(this.currentRevision, v1StatefulSetStatus.currentRevision) &&
        Objects.equals(this.observedGeneration, v1StatefulSetStatus.observedGeneration) &&
        Objects.equals(this.readyReplicas, v1StatefulSetStatus.readyReplicas) &&
        Objects.equals(this.replicas, v1StatefulSetStatus.replicas) &&
        Objects.equals(this.updateRevision, v1StatefulSetStatus.updateRevision) &&
        Objects.equals(this.updatedReplicas, v1StatefulSetStatus.updatedReplicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableReplicas, collisionCount, conditions, currentReplicas, currentRevision, observedGeneration, readyReplicas, replicas, updateRevision, updatedReplicas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1StatefulSetStatus {\n");
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    collisionCount: ").append(toIndentedString(collisionCount)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    currentReplicas: ").append(toIndentedString(currentReplicas)).append("\n");
    sb.append("    currentRevision: ").append(toIndentedString(currentRevision)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    updateRevision: ").append(toIndentedString(updateRevision)).append("\n");
    sb.append("    updatedReplicas: ").append(toIndentedString(updatedReplicas)).append("\n");
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
    openapiFields.add("availableReplicas");
    openapiFields.add("collisionCount");
    openapiFields.add("conditions");
    openapiFields.add("currentReplicas");
    openapiFields.add("currentRevision");
    openapiFields.add("observedGeneration");
    openapiFields.add("readyReplicas");
    openapiFields.add("replicas");
    openapiFields.add("updateRevision");
    openapiFields.add("updatedReplicas");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("replicas");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1StatefulSetStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1StatefulSetStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1StatefulSetStatus is not found in the empty JSON string", V1StatefulSetStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1StatefulSetStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1StatefulSetStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1StatefulSetStatus.openapiRequiredFields) {
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
            V1StatefulSetCondition.validateJsonElement(jsonArrayconditions.get(i));
          };
        }
      }
      if ((jsonObj.get("currentRevision") != null && !jsonObj.get("currentRevision").isJsonNull()) && !jsonObj.get("currentRevision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentRevision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentRevision").toString()));
      }
      if ((jsonObj.get("updateRevision") != null && !jsonObj.get("updateRevision").isJsonNull()) && !jsonObj.get("updateRevision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateRevision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateRevision").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1StatefulSetStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1StatefulSetStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1StatefulSetStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1StatefulSetStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1StatefulSetStatus>() {
           @Override
           public void write(JsonWriter out, V1StatefulSetStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1StatefulSetStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1StatefulSetStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1StatefulSetStatus
   * @throws IOException if the JSON string is invalid with respect to V1StatefulSetStatus
   */
  public static V1StatefulSetStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1StatefulSetStatus.class);
  }

  /**
   * Convert an instance of V1StatefulSetStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
