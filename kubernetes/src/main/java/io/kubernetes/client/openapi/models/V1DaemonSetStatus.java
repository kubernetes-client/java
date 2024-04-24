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
import io.kubernetes.client.openapi.models.V1DaemonSetCondition;
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
 * DaemonSetStatus represents the current status of a daemon set.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1DaemonSetStatus {
  public static final String SERIALIZED_NAME_COLLISION_COUNT = "collisionCount";
  @SerializedName(SERIALIZED_NAME_COLLISION_COUNT)
  private Integer collisionCount;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1DaemonSetCondition> conditions;

  public static final String SERIALIZED_NAME_CURRENT_NUMBER_SCHEDULED = "currentNumberScheduled";
  @SerializedName(SERIALIZED_NAME_CURRENT_NUMBER_SCHEDULED)
  private Integer currentNumberScheduled;

  public static final String SERIALIZED_NAME_DESIRED_NUMBER_SCHEDULED = "desiredNumberScheduled";
  @SerializedName(SERIALIZED_NAME_DESIRED_NUMBER_SCHEDULED)
  private Integer desiredNumberScheduled;

  public static final String SERIALIZED_NAME_NUMBER_AVAILABLE = "numberAvailable";
  @SerializedName(SERIALIZED_NAME_NUMBER_AVAILABLE)
  private Integer numberAvailable;

  public static final String SERIALIZED_NAME_NUMBER_MISSCHEDULED = "numberMisscheduled";
  @SerializedName(SERIALIZED_NAME_NUMBER_MISSCHEDULED)
  private Integer numberMisscheduled;

  public static final String SERIALIZED_NAME_NUMBER_READY = "numberReady";
  @SerializedName(SERIALIZED_NAME_NUMBER_READY)
  private Integer numberReady;

  public static final String SERIALIZED_NAME_NUMBER_UNAVAILABLE = "numberUnavailable";
  @SerializedName(SERIALIZED_NAME_NUMBER_UNAVAILABLE)
  private Integer numberUnavailable;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_UPDATED_NUMBER_SCHEDULED = "updatedNumberScheduled";
  @SerializedName(SERIALIZED_NAME_UPDATED_NUMBER_SCHEDULED)
  private Integer updatedNumberScheduled;

  public V1DaemonSetStatus() {
  }

  public V1DaemonSetStatus collisionCount(Integer collisionCount) {

    this.collisionCount = collisionCount;
    return this;
  }

   /**
   * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
   * @return collisionCount
  **/
  @jakarta.annotation.Nullable
  public Integer getCollisionCount() {
    return collisionCount;
  }


  public void setCollisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
  }


  public V1DaemonSetStatus conditions(List<V1DaemonSetCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1DaemonSetStatus addConditionsItem(V1DaemonSetCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Represents the latest available observations of a DaemonSet&#39;s current state.
   * @return conditions
  **/
  @jakarta.annotation.Nullable
  public List<V1DaemonSetCondition> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1DaemonSetCondition> conditions) {
    this.conditions = conditions;
  }


  public V1DaemonSetStatus currentNumberScheduled(Integer currentNumberScheduled) {

    this.currentNumberScheduled = currentNumberScheduled;
    return this;
  }

   /**
   * The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
   * @return currentNumberScheduled
  **/
  @jakarta.annotation.Nonnull
  public Integer getCurrentNumberScheduled() {
    return currentNumberScheduled;
  }


  public void setCurrentNumberScheduled(Integer currentNumberScheduled) {
    this.currentNumberScheduled = currentNumberScheduled;
  }


  public V1DaemonSetStatus desiredNumberScheduled(Integer desiredNumberScheduled) {

    this.desiredNumberScheduled = desiredNumberScheduled;
    return this;
  }

   /**
   * The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
   * @return desiredNumberScheduled
  **/
  @jakarta.annotation.Nonnull
  public Integer getDesiredNumberScheduled() {
    return desiredNumberScheduled;
  }


  public void setDesiredNumberScheduled(Integer desiredNumberScheduled) {
    this.desiredNumberScheduled = desiredNumberScheduled;
  }


  public V1DaemonSetStatus numberAvailable(Integer numberAvailable) {

    this.numberAvailable = numberAvailable;
    return this;
  }

   /**
   * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)
   * @return numberAvailable
  **/
  @jakarta.annotation.Nullable
  public Integer getNumberAvailable() {
    return numberAvailable;
  }


  public void setNumberAvailable(Integer numberAvailable) {
    this.numberAvailable = numberAvailable;
  }


  public V1DaemonSetStatus numberMisscheduled(Integer numberMisscheduled) {

    this.numberMisscheduled = numberMisscheduled;
    return this;
  }

   /**
   * The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
   * @return numberMisscheduled
  **/
  @jakarta.annotation.Nonnull
  public Integer getNumberMisscheduled() {
    return numberMisscheduled;
  }


  public void setNumberMisscheduled(Integer numberMisscheduled) {
    this.numberMisscheduled = numberMisscheduled;
  }


  public V1DaemonSetStatus numberReady(Integer numberReady) {

    this.numberReady = numberReady;
    return this;
  }

   /**
   * numberReady is the number of nodes that should be running the daemon pod and have one or more of the daemon pod running with a Ready Condition.
   * @return numberReady
  **/
  @jakarta.annotation.Nonnull
  public Integer getNumberReady() {
    return numberReady;
  }


  public void setNumberReady(Integer numberReady) {
    this.numberReady = numberReady;
  }


  public V1DaemonSetStatus numberUnavailable(Integer numberUnavailable) {

    this.numberUnavailable = numberUnavailable;
    return this;
  }

   /**
   * The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)
   * @return numberUnavailable
  **/
  @jakarta.annotation.Nullable
  public Integer getNumberUnavailable() {
    return numberUnavailable;
  }


  public void setNumberUnavailable(Integer numberUnavailable) {
    this.numberUnavailable = numberUnavailable;
  }


  public V1DaemonSetStatus observedGeneration(Long observedGeneration) {

    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * The most recent generation observed by the daemon set controller.
   * @return observedGeneration
  **/
  @jakarta.annotation.Nullable
  public Long getObservedGeneration() {
    return observedGeneration;
  }


  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  public V1DaemonSetStatus updatedNumberScheduled(Integer updatedNumberScheduled) {

    this.updatedNumberScheduled = updatedNumberScheduled;
    return this;
  }

   /**
   * The total number of nodes that are running updated daemon pod
   * @return updatedNumberScheduled
  **/
  @jakarta.annotation.Nullable
  public Integer getUpdatedNumberScheduled() {
    return updatedNumberScheduled;
  }


  public void setUpdatedNumberScheduled(Integer updatedNumberScheduled) {
    this.updatedNumberScheduled = updatedNumberScheduled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DaemonSetStatus v1DaemonSetStatus = (V1DaemonSetStatus) o;
    return Objects.equals(this.collisionCount, v1DaemonSetStatus.collisionCount) &&
        Objects.equals(this.conditions, v1DaemonSetStatus.conditions) &&
        Objects.equals(this.currentNumberScheduled, v1DaemonSetStatus.currentNumberScheduled) &&
        Objects.equals(this.desiredNumberScheduled, v1DaemonSetStatus.desiredNumberScheduled) &&
        Objects.equals(this.numberAvailable, v1DaemonSetStatus.numberAvailable) &&
        Objects.equals(this.numberMisscheduled, v1DaemonSetStatus.numberMisscheduled) &&
        Objects.equals(this.numberReady, v1DaemonSetStatus.numberReady) &&
        Objects.equals(this.numberUnavailable, v1DaemonSetStatus.numberUnavailable) &&
        Objects.equals(this.observedGeneration, v1DaemonSetStatus.observedGeneration) &&
        Objects.equals(this.updatedNumberScheduled, v1DaemonSetStatus.updatedNumberScheduled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collisionCount, conditions, currentNumberScheduled, desiredNumberScheduled, numberAvailable, numberMisscheduled, numberReady, numberUnavailable, observedGeneration, updatedNumberScheduled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DaemonSetStatus {\n");
    sb.append("    collisionCount: ").append(toIndentedString(collisionCount)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    currentNumberScheduled: ").append(toIndentedString(currentNumberScheduled)).append("\n");
    sb.append("    desiredNumberScheduled: ").append(toIndentedString(desiredNumberScheduled)).append("\n");
    sb.append("    numberAvailable: ").append(toIndentedString(numberAvailable)).append("\n");
    sb.append("    numberMisscheduled: ").append(toIndentedString(numberMisscheduled)).append("\n");
    sb.append("    numberReady: ").append(toIndentedString(numberReady)).append("\n");
    sb.append("    numberUnavailable: ").append(toIndentedString(numberUnavailable)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    updatedNumberScheduled: ").append(toIndentedString(updatedNumberScheduled)).append("\n");
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
    openapiFields.add("collisionCount");
    openapiFields.add("conditions");
    openapiFields.add("currentNumberScheduled");
    openapiFields.add("desiredNumberScheduled");
    openapiFields.add("numberAvailable");
    openapiFields.add("numberMisscheduled");
    openapiFields.add("numberReady");
    openapiFields.add("numberUnavailable");
    openapiFields.add("observedGeneration");
    openapiFields.add("updatedNumberScheduled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("currentNumberScheduled");
    openapiRequiredFields.add("desiredNumberScheduled");
    openapiRequiredFields.add("numberMisscheduled");
    openapiRequiredFields.add("numberReady");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1DaemonSetStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1DaemonSetStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1DaemonSetStatus is not found in the empty JSON string", V1DaemonSetStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1DaemonSetStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1DaemonSetStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1DaemonSetStatus.openapiRequiredFields) {
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
            V1DaemonSetCondition.validateJsonObject(jsonArrayconditions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1DaemonSetStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1DaemonSetStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1DaemonSetStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1DaemonSetStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1DaemonSetStatus>() {
           @Override
           public void write(JsonWriter out, V1DaemonSetStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1DaemonSetStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1DaemonSetStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1DaemonSetStatus
  * @throws IOException if the JSON string is invalid with respect to V1DaemonSetStatus
  */
  public static V1DaemonSetStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1DaemonSetStatus.class);
  }

 /**
  * Convert an instance of V1DaemonSetStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
