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
import io.kubernetes.client.openapi.models.V1ReplicaSetCondition;
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
 * ReplicaSetStatus represents the current status of a ReplicaSet.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ReplicaSetStatus {
  public static final String SERIALIZED_NAME_AVAILABLE_REPLICAS = "availableReplicas";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_REPLICAS)
  private Integer availableReplicas;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1ReplicaSetCondition> conditions;

  public static final String SERIALIZED_NAME_FULLY_LABELED_REPLICAS = "fullyLabeledReplicas";
  @SerializedName(SERIALIZED_NAME_FULLY_LABELED_REPLICAS)
  private Integer fullyLabeledReplicas;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_READY_REPLICAS = "readyReplicas";
  @SerializedName(SERIALIZED_NAME_READY_REPLICAS)
  private Integer readyReplicas;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public V1ReplicaSetStatus() {
  }

  public V1ReplicaSetStatus availableReplicas(Integer availableReplicas) {

    this.availableReplicas = availableReplicas;
    return this;
  }

   /**
   * The number of available replicas (ready for at least minReadySeconds) for this replica set.
   * @return availableReplicas
  **/
  @jakarta.annotation.Nullable
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }


  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }


  public V1ReplicaSetStatus conditions(List<V1ReplicaSetCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1ReplicaSetStatus addConditionsItem(V1ReplicaSetCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Represents the latest available observations of a replica set&#39;s current state.
   * @return conditions
  **/
  @jakarta.annotation.Nullable
  public List<V1ReplicaSetCondition> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1ReplicaSetCondition> conditions) {
    this.conditions = conditions;
  }


  public V1ReplicaSetStatus fullyLabeledReplicas(Integer fullyLabeledReplicas) {

    this.fullyLabeledReplicas = fullyLabeledReplicas;
    return this;
  }

   /**
   * The number of pods that have labels matching the labels of the pod template of the replicaset.
   * @return fullyLabeledReplicas
  **/
  @jakarta.annotation.Nullable
  public Integer getFullyLabeledReplicas() {
    return fullyLabeledReplicas;
  }


  public void setFullyLabeledReplicas(Integer fullyLabeledReplicas) {
    this.fullyLabeledReplicas = fullyLabeledReplicas;
  }


  public V1ReplicaSetStatus observedGeneration(Long observedGeneration) {

    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
   * @return observedGeneration
  **/
  @jakarta.annotation.Nullable
  public Long getObservedGeneration() {
    return observedGeneration;
  }


  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  public V1ReplicaSetStatus readyReplicas(Integer readyReplicas) {

    this.readyReplicas = readyReplicas;
    return this;
  }

   /**
   * readyReplicas is the number of pods targeted by this ReplicaSet with a Ready Condition.
   * @return readyReplicas
  **/
  @jakarta.annotation.Nullable
  public Integer getReadyReplicas() {
    return readyReplicas;
  }


  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }


  public V1ReplicaSetStatus replicas(Integer replicas) {

    this.replicas = replicas;
    return this;
  }

   /**
   * Replicas is the most recently observed number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
   * @return replicas
  **/
  @jakarta.annotation.Nonnull
  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ReplicaSetStatus v1ReplicaSetStatus = (V1ReplicaSetStatus) o;
    return Objects.equals(this.availableReplicas, v1ReplicaSetStatus.availableReplicas) &&
        Objects.equals(this.conditions, v1ReplicaSetStatus.conditions) &&
        Objects.equals(this.fullyLabeledReplicas, v1ReplicaSetStatus.fullyLabeledReplicas) &&
        Objects.equals(this.observedGeneration, v1ReplicaSetStatus.observedGeneration) &&
        Objects.equals(this.readyReplicas, v1ReplicaSetStatus.readyReplicas) &&
        Objects.equals(this.replicas, v1ReplicaSetStatus.replicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableReplicas, conditions, fullyLabeledReplicas, observedGeneration, readyReplicas, replicas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ReplicaSetStatus {\n");
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    fullyLabeledReplicas: ").append(toIndentedString(fullyLabeledReplicas)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
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
    openapiFields.add("conditions");
    openapiFields.add("fullyLabeledReplicas");
    openapiFields.add("observedGeneration");
    openapiFields.add("readyReplicas");
    openapiFields.add("replicas");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("replicas");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ReplicaSetStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ReplicaSetStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ReplicaSetStatus is not found in the empty JSON string", V1ReplicaSetStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ReplicaSetStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ReplicaSetStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ReplicaSetStatus.openapiRequiredFields) {
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
            V1ReplicaSetCondition.validateJsonObject(jsonArrayconditions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ReplicaSetStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ReplicaSetStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ReplicaSetStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ReplicaSetStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ReplicaSetStatus>() {
           @Override
           public void write(JsonWriter out, V1ReplicaSetStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ReplicaSetStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ReplicaSetStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ReplicaSetStatus
  * @throws IOException if the JSON string is invalid with respect to V1ReplicaSetStatus
  */
  public static V1ReplicaSetStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ReplicaSetStatus.class);
  }

 /**
  * Convert an instance of V1ReplicaSetStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
