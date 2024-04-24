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
import io.kubernetes.client.openapi.models.V1StatefulSetCondition;
import java.io.IOException;
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
 * StatefulSetStatus represents the current state of a StatefulSet.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1StatefulSetStatus {
  public static final String SERIALIZED_NAME_AVAILABLE_REPLICAS = "availableReplicas";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_REPLICAS)
  private Integer availableReplicas;

  public static final String SERIALIZED_NAME_COLLISION_COUNT = "collisionCount";
  @SerializedName(SERIALIZED_NAME_COLLISION_COUNT)
  private Integer collisionCount;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1StatefulSetCondition> conditions;

  public static final String SERIALIZED_NAME_CURRENT_REPLICAS = "currentReplicas";
  @SerializedName(SERIALIZED_NAME_CURRENT_REPLICAS)
  private Integer currentReplicas;

  public static final String SERIALIZED_NAME_CURRENT_REVISION = "currentRevision";
  @SerializedName(SERIALIZED_NAME_CURRENT_REVISION)
  private String currentRevision;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_READY_REPLICAS = "readyReplicas";
  @SerializedName(SERIALIZED_NAME_READY_REPLICAS)
  private Integer readyReplicas;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_UPDATE_REVISION = "updateRevision";
  @SerializedName(SERIALIZED_NAME_UPDATE_REVISION)
  private String updateRevision;

  public static final String SERIALIZED_NAME_UPDATED_REPLICAS = "updatedReplicas";
  @SerializedName(SERIALIZED_NAME_UPDATED_REPLICAS)
  private Integer updatedReplicas;

  public V1StatefulSetStatus() {
  }

  public V1StatefulSetStatus availableReplicas(Integer availableReplicas) {

    this.availableReplicas = availableReplicas;
    return this;
  }

   /**
   * Total number of available pods (ready for at least minReadySeconds) targeted by this statefulset.
   * @return availableReplicas
  **/
  @jakarta.annotation.Nullable
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }


  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }


  public V1StatefulSetStatus collisionCount(Integer collisionCount) {

    this.collisionCount = collisionCount;
    return this;
  }

   /**
   * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
   * @return collisionCount
  **/
  @jakarta.annotation.Nullable
  public Integer getCollisionCount() {
    return collisionCount;
  }


  public void setCollisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
  }


  public V1StatefulSetStatus conditions(List<V1StatefulSetCondition> conditions) {

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
  **/
  @jakarta.annotation.Nullable
  public List<V1StatefulSetCondition> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1StatefulSetCondition> conditions) {
    this.conditions = conditions;
  }


  public V1StatefulSetStatus currentReplicas(Integer currentReplicas) {

    this.currentReplicas = currentReplicas;
    return this;
  }

   /**
   * currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
   * @return currentReplicas
  **/
  @jakarta.annotation.Nullable
  public Integer getCurrentReplicas() {
    return currentReplicas;
  }


  public void setCurrentReplicas(Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
  }


  public V1StatefulSetStatus currentRevision(String currentRevision) {

    this.currentRevision = currentRevision;
    return this;
  }

   /**
   * currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
   * @return currentRevision
  **/
  @jakarta.annotation.Nullable
  public String getCurrentRevision() {
    return currentRevision;
  }


  public void setCurrentRevision(String currentRevision) {
    this.currentRevision = currentRevision;
  }


  public V1StatefulSetStatus observedGeneration(Long observedGeneration) {

    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet&#39;s generation, which is updated on mutation by the API Server.
   * @return observedGeneration
  **/
  @jakarta.annotation.Nullable
  public Long getObservedGeneration() {
    return observedGeneration;
  }


  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  public V1StatefulSetStatus readyReplicas(Integer readyReplicas) {

    this.readyReplicas = readyReplicas;
    return this;
  }

   /**
   * readyReplicas is the number of pods created for this StatefulSet with a Ready Condition.
   * @return readyReplicas
  **/
  @jakarta.annotation.Nullable
  public Integer getReadyReplicas() {
    return readyReplicas;
  }


  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }


  public V1StatefulSetStatus replicas(Integer replicas) {

    this.replicas = replicas;
    return this;
  }

   /**
   * replicas is the number of Pods created by the StatefulSet controller.
   * @return replicas
  **/
  @jakarta.annotation.Nonnull
  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public V1StatefulSetStatus updateRevision(String updateRevision) {

    this.updateRevision = updateRevision;
    return this;
  }

   /**
   * updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
   * @return updateRevision
  **/
  @jakarta.annotation.Nullable
  public String getUpdateRevision() {
    return updateRevision;
  }


  public void setUpdateRevision(String updateRevision) {
    this.updateRevision = updateRevision;
  }


  public V1StatefulSetStatus updatedReplicas(Integer updatedReplicas) {

    this.updatedReplicas = updatedReplicas;
    return this;
  }

   /**
   * updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
   * @return updatedReplicas
  **/
  @jakarta.annotation.Nullable
  public Integer getUpdatedReplicas() {
    return updatedReplicas;
  }


  public void setUpdatedReplicas(Integer updatedReplicas) {
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1StatefulSetStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1StatefulSetStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1StatefulSetStatus is not found in the empty JSON string", V1StatefulSetStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1StatefulSetStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1StatefulSetStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1StatefulSetStatus.openapiRequiredFields) {
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
            V1StatefulSetCondition.validateJsonObject(jsonArrayconditions.get(i).getAsJsonObject());
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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
