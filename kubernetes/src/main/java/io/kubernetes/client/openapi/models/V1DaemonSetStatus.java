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
import io.kubernetes.client.openapi.models.V1DaemonSetCondition;
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
 * DaemonSetStatus represents the current status of a daemon set.
 */
@ApiModel(description = "DaemonSetStatus represents the current status of a daemon set.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1DaemonSetStatus {
  public static final String SERIALIZED_NAME_COLLISION_COUNT = "collisionCount";
  @SerializedName(SERIALIZED_NAME_COLLISION_COUNT)
  @jakarta.annotation.Nullable
  private Integer collisionCount;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<V1DaemonSetCondition> conditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CURRENT_NUMBER_SCHEDULED = "currentNumberScheduled";
  @SerializedName(SERIALIZED_NAME_CURRENT_NUMBER_SCHEDULED)
  @jakarta.annotation.Nonnull
  private Integer currentNumberScheduled;

  public static final String SERIALIZED_NAME_DESIRED_NUMBER_SCHEDULED = "desiredNumberScheduled";
  @SerializedName(SERIALIZED_NAME_DESIRED_NUMBER_SCHEDULED)
  @jakarta.annotation.Nonnull
  private Integer desiredNumberScheduled;

  public static final String SERIALIZED_NAME_NUMBER_AVAILABLE = "numberAvailable";
  @SerializedName(SERIALIZED_NAME_NUMBER_AVAILABLE)
  @jakarta.annotation.Nullable
  private Integer numberAvailable;

  public static final String SERIALIZED_NAME_NUMBER_MISSCHEDULED = "numberMisscheduled";
  @SerializedName(SERIALIZED_NAME_NUMBER_MISSCHEDULED)
  @jakarta.annotation.Nonnull
  private Integer numberMisscheduled;

  public static final String SERIALIZED_NAME_NUMBER_READY = "numberReady";
  @SerializedName(SERIALIZED_NAME_NUMBER_READY)
  @jakarta.annotation.Nonnull
  private Integer numberReady;

  public static final String SERIALIZED_NAME_NUMBER_UNAVAILABLE = "numberUnavailable";
  @SerializedName(SERIALIZED_NAME_NUMBER_UNAVAILABLE)
  @jakarta.annotation.Nullable
  private Integer numberUnavailable;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  @jakarta.annotation.Nullable
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_UPDATED_NUMBER_SCHEDULED = "updatedNumberScheduled";
  @SerializedName(SERIALIZED_NAME_UPDATED_NUMBER_SCHEDULED)
  @jakarta.annotation.Nullable
  private Integer updatedNumberScheduled;

  public V1DaemonSetStatus() {
  }

  public V1DaemonSetStatus collisionCount(@jakarta.annotation.Nullable Integer collisionCount) {
    this.collisionCount = collisionCount;
    return this;
  }

  /**
   * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
   * @return collisionCount
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.")
  public Integer getCollisionCount() {
    return collisionCount;
  }

  public void setCollisionCount(@jakarta.annotation.Nullable Integer collisionCount) {
    this.collisionCount = collisionCount;
  }


  public V1DaemonSetStatus conditions(@jakarta.annotation.Nullable List<V1DaemonSetCondition> conditions) {
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
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Represents the latest available observations of a DaemonSet's current state.")
  public List<V1DaemonSetCondition> getConditions() {
    return conditions;
  }

  public void setConditions(@jakarta.annotation.Nullable List<V1DaemonSetCondition> conditions) {
    this.conditions = conditions;
  }


  public V1DaemonSetStatus currentNumberScheduled(@jakarta.annotation.Nonnull Integer currentNumberScheduled) {
    this.currentNumberScheduled = currentNumberScheduled;
    return this;
  }

  /**
   * The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
   * @return currentNumberScheduled
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/")
  public Integer getCurrentNumberScheduled() {
    return currentNumberScheduled;
  }

  public void setCurrentNumberScheduled(@jakarta.annotation.Nonnull Integer currentNumberScheduled) {
    this.currentNumberScheduled = currentNumberScheduled;
  }


  public V1DaemonSetStatus desiredNumberScheduled(@jakarta.annotation.Nonnull Integer desiredNumberScheduled) {
    this.desiredNumberScheduled = desiredNumberScheduled;
    return this;
  }

  /**
   * The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
   * @return desiredNumberScheduled
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/")
  public Integer getDesiredNumberScheduled() {
    return desiredNumberScheduled;
  }

  public void setDesiredNumberScheduled(@jakarta.annotation.Nonnull Integer desiredNumberScheduled) {
    this.desiredNumberScheduled = desiredNumberScheduled;
  }


  public V1DaemonSetStatus numberAvailable(@jakarta.annotation.Nullable Integer numberAvailable) {
    this.numberAvailable = numberAvailable;
    return this;
  }

  /**
   * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)
   * @return numberAvailable
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)")
  public Integer getNumberAvailable() {
    return numberAvailable;
  }

  public void setNumberAvailable(@jakarta.annotation.Nullable Integer numberAvailable) {
    this.numberAvailable = numberAvailable;
  }


  public V1DaemonSetStatus numberMisscheduled(@jakarta.annotation.Nonnull Integer numberMisscheduled) {
    this.numberMisscheduled = numberMisscheduled;
    return this;
  }

  /**
   * The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
   * @return numberMisscheduled
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/")
  public Integer getNumberMisscheduled() {
    return numberMisscheduled;
  }

  public void setNumberMisscheduled(@jakarta.annotation.Nonnull Integer numberMisscheduled) {
    this.numberMisscheduled = numberMisscheduled;
  }


  public V1DaemonSetStatus numberReady(@jakarta.annotation.Nonnull Integer numberReady) {
    this.numberReady = numberReady;
    return this;
  }

  /**
   * numberReady is the number of nodes that should be running the daemon pod and have one or more of the daemon pod running with a Ready Condition.
   * @return numberReady
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "numberReady is the number of nodes that should be running the daemon pod and have one or more of the daemon pod running with a Ready Condition.")
  public Integer getNumberReady() {
    return numberReady;
  }

  public void setNumberReady(@jakarta.annotation.Nonnull Integer numberReady) {
    this.numberReady = numberReady;
  }


  public V1DaemonSetStatus numberUnavailable(@jakarta.annotation.Nullable Integer numberUnavailable) {
    this.numberUnavailable = numberUnavailable;
    return this;
  }

  /**
   * The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)
   * @return numberUnavailable
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)")
  public Integer getNumberUnavailable() {
    return numberUnavailable;
  }

  public void setNumberUnavailable(@jakarta.annotation.Nullable Integer numberUnavailable) {
    this.numberUnavailable = numberUnavailable;
  }


  public V1DaemonSetStatus observedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * The most recent generation observed by the daemon set controller.
   * @return observedGeneration
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The most recent generation observed by the daemon set controller.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  public V1DaemonSetStatus updatedNumberScheduled(@jakarta.annotation.Nullable Integer updatedNumberScheduled) {
    this.updatedNumberScheduled = updatedNumberScheduled;
    return this;
  }

  /**
   * The total number of nodes that are running updated daemon pod
   * @return updatedNumberScheduled
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The total number of nodes that are running updated daemon pod")
  public Integer getUpdatedNumberScheduled() {
    return updatedNumberScheduled;
  }

  public void setUpdatedNumberScheduled(@jakarta.annotation.Nullable Integer updatedNumberScheduled) {
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
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1DaemonSetStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1DaemonSetStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1DaemonSetStatus is not found in the empty JSON string", V1DaemonSetStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1DaemonSetStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1DaemonSetStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1DaemonSetStatus.openapiRequiredFields) {
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
            V1DaemonSetCondition.validateJsonElement(jsonArrayconditions.get(i));
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
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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
