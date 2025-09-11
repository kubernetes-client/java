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
import io.kubernetes.client.openapi.models.V1DeploymentCondition;
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
 * DeploymentStatus is the most recently observed status of the Deployment.
 */
@ApiModel(description = "DeploymentStatus is the most recently observed status of the Deployment.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1DeploymentStatus {
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
  private List<V1DeploymentCondition> conditions = new ArrayList<>();

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
  @jakarta.annotation.Nullable
  private Integer replicas;

  public static final String SERIALIZED_NAME_TERMINATING_REPLICAS = "terminatingReplicas";
  @SerializedName(SERIALIZED_NAME_TERMINATING_REPLICAS)
  @jakarta.annotation.Nullable
  private Integer terminatingReplicas;

  public static final String SERIALIZED_NAME_UNAVAILABLE_REPLICAS = "unavailableReplicas";
  @SerializedName(SERIALIZED_NAME_UNAVAILABLE_REPLICAS)
  @jakarta.annotation.Nullable
  private Integer unavailableReplicas;

  public static final String SERIALIZED_NAME_UPDATED_REPLICAS = "updatedReplicas";
  @SerializedName(SERIALIZED_NAME_UPDATED_REPLICAS)
  @jakarta.annotation.Nullable
  private Integer updatedReplicas;

  public V1DeploymentStatus() {
  }

  public V1DeploymentStatus availableReplicas(@jakarta.annotation.Nullable Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
    return this;
  }

  /**
   * Total number of available non-terminating pods (ready for at least minReadySeconds) targeted by this deployment.
   * @return availableReplicas
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Total number of available non-terminating pods (ready for at least minReadySeconds) targeted by this deployment.")
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }

  public void setAvailableReplicas(@jakarta.annotation.Nullable Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }


  public V1DeploymentStatus collisionCount(@jakarta.annotation.Nullable Integer collisionCount) {
    this.collisionCount = collisionCount;
    return this;
  }

  /**
   * Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
   * @return collisionCount
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.")
  public Integer getCollisionCount() {
    return collisionCount;
  }

  public void setCollisionCount(@jakarta.annotation.Nullable Integer collisionCount) {
    this.collisionCount = collisionCount;
  }


  public V1DeploymentStatus conditions(@jakarta.annotation.Nullable List<V1DeploymentCondition> conditions) {
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
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Represents the latest available observations of a deployment's current state.")
  public List<V1DeploymentCondition> getConditions() {
    return conditions;
  }

  public void setConditions(@jakarta.annotation.Nullable List<V1DeploymentCondition> conditions) {
    this.conditions = conditions;
  }


  public V1DeploymentStatus observedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * The generation observed by the deployment controller.
   * @return observedGeneration
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The generation observed by the deployment controller.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  public V1DeploymentStatus readyReplicas(@jakarta.annotation.Nullable Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
    return this;
  }

  /**
   * Total number of non-terminating pods targeted by this Deployment with a Ready Condition.
   * @return readyReplicas
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Total number of non-terminating pods targeted by this Deployment with a Ready Condition.")
  public Integer getReadyReplicas() {
    return readyReplicas;
  }

  public void setReadyReplicas(@jakarta.annotation.Nullable Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }


  public V1DeploymentStatus replicas(@jakarta.annotation.Nullable Integer replicas) {
    this.replicas = replicas;
    return this;
  }

  /**
   * Total number of non-terminating pods targeted by this deployment (their labels match the selector).
   * @return replicas
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Total number of non-terminating pods targeted by this deployment (their labels match the selector).")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(@jakarta.annotation.Nullable Integer replicas) {
    this.replicas = replicas;
  }


  public V1DeploymentStatus terminatingReplicas(@jakarta.annotation.Nullable Integer terminatingReplicas) {
    this.terminatingReplicas = terminatingReplicas;
    return this;
  }

  /**
   * Total number of terminating pods targeted by this deployment. Terminating pods have a non-null .metadata.deletionTimestamp and have not yet reached the Failed or Succeeded .status.phase.  This is an alpha field. Enable DeploymentReplicaSetTerminatingReplicas to be able to use this field.
   * @return terminatingReplicas
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Total number of terminating pods targeted by this deployment. Terminating pods have a non-null .metadata.deletionTimestamp and have not yet reached the Failed or Succeeded .status.phase.  This is an alpha field. Enable DeploymentReplicaSetTerminatingReplicas to be able to use this field.")
  public Integer getTerminatingReplicas() {
    return terminatingReplicas;
  }

  public void setTerminatingReplicas(@jakarta.annotation.Nullable Integer terminatingReplicas) {
    this.terminatingReplicas = terminatingReplicas;
  }


  public V1DeploymentStatus unavailableReplicas(@jakarta.annotation.Nullable Integer unavailableReplicas) {
    this.unavailableReplicas = unavailableReplicas;
    return this;
  }

  /**
   * Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.
   * @return unavailableReplicas
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.")
  public Integer getUnavailableReplicas() {
    return unavailableReplicas;
  }

  public void setUnavailableReplicas(@jakarta.annotation.Nullable Integer unavailableReplicas) {
    this.unavailableReplicas = unavailableReplicas;
  }


  public V1DeploymentStatus updatedReplicas(@jakarta.annotation.Nullable Integer updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
    return this;
  }

  /**
   * Total number of non-terminating pods targeted by this deployment that have the desired template spec.
   * @return updatedReplicas
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Total number of non-terminating pods targeted by this deployment that have the desired template spec.")
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
    V1DeploymentStatus v1DeploymentStatus = (V1DeploymentStatus) o;
    return Objects.equals(this.availableReplicas, v1DeploymentStatus.availableReplicas) &&
        Objects.equals(this.collisionCount, v1DeploymentStatus.collisionCount) &&
        Objects.equals(this.conditions, v1DeploymentStatus.conditions) &&
        Objects.equals(this.observedGeneration, v1DeploymentStatus.observedGeneration) &&
        Objects.equals(this.readyReplicas, v1DeploymentStatus.readyReplicas) &&
        Objects.equals(this.replicas, v1DeploymentStatus.replicas) &&
        Objects.equals(this.terminatingReplicas, v1DeploymentStatus.terminatingReplicas) &&
        Objects.equals(this.unavailableReplicas, v1DeploymentStatus.unavailableReplicas) &&
        Objects.equals(this.updatedReplicas, v1DeploymentStatus.updatedReplicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableReplicas, collisionCount, conditions, observedGeneration, readyReplicas, replicas, terminatingReplicas, unavailableReplicas, updatedReplicas);
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
    sb.append("    terminatingReplicas: ").append(toIndentedString(terminatingReplicas)).append("\n");
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
    openapiFields.add("terminatingReplicas");
    openapiFields.add("unavailableReplicas");
    openapiFields.add("updatedReplicas");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1DeploymentStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1DeploymentStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1DeploymentStatus is not found in the empty JSON string", V1DeploymentStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1DeploymentStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1DeploymentStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            V1DeploymentCondition.validateJsonElement(jsonArrayconditions.get(i));
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
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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
