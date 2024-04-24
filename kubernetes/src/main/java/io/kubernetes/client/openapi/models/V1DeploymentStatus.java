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
import io.kubernetes.client.openapi.models.V1DeploymentCondition;
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
 * DeploymentStatus is the most recently observed status of the Deployment.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1DeploymentStatus {
  public static final String SERIALIZED_NAME_AVAILABLE_REPLICAS = "availableReplicas";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_REPLICAS)
  private Integer availableReplicas;

  public static final String SERIALIZED_NAME_COLLISION_COUNT = "collisionCount";
  @SerializedName(SERIALIZED_NAME_COLLISION_COUNT)
  private Integer collisionCount;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1DeploymentCondition> conditions;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_READY_REPLICAS = "readyReplicas";
  @SerializedName(SERIALIZED_NAME_READY_REPLICAS)
  private Integer readyReplicas;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_UNAVAILABLE_REPLICAS = "unavailableReplicas";
  @SerializedName(SERIALIZED_NAME_UNAVAILABLE_REPLICAS)
  private Integer unavailableReplicas;

  public static final String SERIALIZED_NAME_UPDATED_REPLICAS = "updatedReplicas";
  @SerializedName(SERIALIZED_NAME_UPDATED_REPLICAS)
  private Integer updatedReplicas;

  public V1DeploymentStatus() {
  }

  public V1DeploymentStatus availableReplicas(Integer availableReplicas) {

    this.availableReplicas = availableReplicas;
    return this;
  }

   /**
   * Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
   * @return availableReplicas
  **/
  @jakarta.annotation.Nullable
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }


  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }


  public V1DeploymentStatus collisionCount(Integer collisionCount) {

    this.collisionCount = collisionCount;
    return this;
  }

   /**
   * Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
   * @return collisionCount
  **/
  @jakarta.annotation.Nullable
  public Integer getCollisionCount() {
    return collisionCount;
  }


  public void setCollisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
  }


  public V1DeploymentStatus conditions(List<V1DeploymentCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1DeploymentStatus addConditionsItem(V1DeploymentCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Represents the latest available observations of a deployment&#39;s current state.
   * @return conditions
  **/
  @jakarta.annotation.Nullable
  public List<V1DeploymentCondition> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1DeploymentCondition> conditions) {
    this.conditions = conditions;
  }


  public V1DeploymentStatus observedGeneration(Long observedGeneration) {

    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * The generation observed by the deployment controller.
   * @return observedGeneration
  **/
  @jakarta.annotation.Nullable
  public Long getObservedGeneration() {
    return observedGeneration;
  }


  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  public V1DeploymentStatus readyReplicas(Integer readyReplicas) {

    this.readyReplicas = readyReplicas;
    return this;
  }

   /**
   * readyReplicas is the number of pods targeted by this Deployment with a Ready Condition.
   * @return readyReplicas
  **/
  @jakarta.annotation.Nullable
  public Integer getReadyReplicas() {
    return readyReplicas;
  }


  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }


  public V1DeploymentStatus replicas(Integer replicas) {

    this.replicas = replicas;
    return this;
  }

   /**
   * Total number of non-terminated pods targeted by this deployment (their labels match the selector).
   * @return replicas
  **/
  @jakarta.annotation.Nullable
  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public V1DeploymentStatus unavailableReplicas(Integer unavailableReplicas) {

    this.unavailableReplicas = unavailableReplicas;
    return this;
  }

   /**
   * Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.
   * @return unavailableReplicas
  **/
  @jakarta.annotation.Nullable
  public Integer getUnavailableReplicas() {
    return unavailableReplicas;
  }


  public void setUnavailableReplicas(Integer unavailableReplicas) {
    this.unavailableReplicas = unavailableReplicas;
  }


  public V1DeploymentStatus updatedReplicas(Integer updatedReplicas) {

    this.updatedReplicas = updatedReplicas;
    return this;
  }

   /**
   * Total number of non-terminated pods targeted by this deployment that have the desired template spec.
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
    V1DeploymentStatus v1DeploymentStatus = (V1DeploymentStatus) o;
    return Objects.equals(this.availableReplicas, v1DeploymentStatus.availableReplicas) &&
        Objects.equals(this.collisionCount, v1DeploymentStatus.collisionCount) &&
        Objects.equals(this.conditions, v1DeploymentStatus.conditions) &&
        Objects.equals(this.observedGeneration, v1DeploymentStatus.observedGeneration) &&
        Objects.equals(this.readyReplicas, v1DeploymentStatus.readyReplicas) &&
        Objects.equals(this.replicas, v1DeploymentStatus.replicas) &&
        Objects.equals(this.unavailableReplicas, v1DeploymentStatus.unavailableReplicas) &&
        Objects.equals(this.updatedReplicas, v1DeploymentStatus.updatedReplicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableReplicas, collisionCount, conditions, observedGeneration, readyReplicas, replicas, unavailableReplicas, updatedReplicas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DeploymentStatus {\n");
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    collisionCount: ").append(toIndentedString(collisionCount)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    unavailableReplicas: ").append(toIndentedString(unavailableReplicas)).append("\n");
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
    openapiFields.add("observedGeneration");
    openapiFields.add("readyReplicas");
    openapiFields.add("replicas");
    openapiFields.add("unavailableReplicas");
    openapiFields.add("updatedReplicas");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1DeploymentStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1DeploymentStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1DeploymentStatus is not found in the empty JSON string", V1DeploymentStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1DeploymentStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1DeploymentStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
            V1DeploymentCondition.validateJsonObject(jsonArrayconditions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1DeploymentStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1DeploymentStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1DeploymentStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1DeploymentStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1DeploymentStatus>() {
           @Override
           public void write(JsonWriter out, V1DeploymentStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1DeploymentStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1DeploymentStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1DeploymentStatus
  * @throws IOException if the JSON string is invalid with respect to V1DeploymentStatus
  */
  public static V1DeploymentStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1DeploymentStatus.class);
  }

 /**
  * Convert an instance of V1DeploymentStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
