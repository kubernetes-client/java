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
import io.kubernetes.client.openapi.models.V1ReplicaSetCondition;
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
 * ReplicaSetStatus represents the current status of a ReplicaSet.
 */
@ApiModel(description = "ReplicaSetStatus represents the current status of a ReplicaSet.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ReplicaSetStatus {
  public static final String SERIALIZED_NAME_AVAILABLE_REPLICAS = "availableReplicas";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_REPLICAS)
  @jakarta.annotation.Nullable
  private Integer availableReplicas;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<V1ReplicaSetCondition> conditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_FULLY_LABELED_REPLICAS = "fullyLabeledReplicas";
  @SerializedName(SERIALIZED_NAME_FULLY_LABELED_REPLICAS)
  @jakarta.annotation.Nullable
  private Integer fullyLabeledReplicas;

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

  public static final String SERIALIZED_NAME_TERMINATING_REPLICAS = "terminatingReplicas";
  @SerializedName(SERIALIZED_NAME_TERMINATING_REPLICAS)
  @jakarta.annotation.Nullable
  private Integer terminatingReplicas;

  public V1ReplicaSetStatus() {
  }

  public V1ReplicaSetStatus availableReplicas(@jakarta.annotation.Nullable Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
    return this;
  }

  /**
   * The number of available non-terminating pods (ready for at least minReadySeconds) for this replica set.
   * @return availableReplicas
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The number of available non-terminating pods (ready for at least minReadySeconds) for this replica set.")
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }

  public void setAvailableReplicas(@jakarta.annotation.Nullable Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }


  public V1ReplicaSetStatus conditions(@jakarta.annotation.Nullable List<V1ReplicaSetCondition> conditions) {
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
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Represents the latest available observations of a replica set's current state.")
  public List<V1ReplicaSetCondition> getConditions() {
    return conditions;
  }

  public void setConditions(@jakarta.annotation.Nullable List<V1ReplicaSetCondition> conditions) {
    this.conditions = conditions;
  }


  public V1ReplicaSetStatus fullyLabeledReplicas(@jakarta.annotation.Nullable Integer fullyLabeledReplicas) {
    this.fullyLabeledReplicas = fullyLabeledReplicas;
    return this;
  }

  /**
   * The number of non-terminating pods that have labels matching the labels of the pod template of the replicaset.
   * @return fullyLabeledReplicas
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The number of non-terminating pods that have labels matching the labels of the pod template of the replicaset.")
  public Integer getFullyLabeledReplicas() {
    return fullyLabeledReplicas;
  }

  public void setFullyLabeledReplicas(@jakarta.annotation.Nullable Integer fullyLabeledReplicas) {
    this.fullyLabeledReplicas = fullyLabeledReplicas;
  }


  public V1ReplicaSetStatus observedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
   * @return observedGeneration
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ObservedGeneration reflects the generation of the most recently observed ReplicaSet.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  public V1ReplicaSetStatus readyReplicas(@jakarta.annotation.Nullable Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
    return this;
  }

  /**
   * The number of non-terminating pods targeted by this ReplicaSet with a Ready Condition.
   * @return readyReplicas
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The number of non-terminating pods targeted by this ReplicaSet with a Ready Condition.")
  public Integer getReadyReplicas() {
    return readyReplicas;
  }

  public void setReadyReplicas(@jakarta.annotation.Nullable Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }


  public V1ReplicaSetStatus replicas(@jakarta.annotation.Nonnull Integer replicas) {
    this.replicas = replicas;
    return this;
  }

  /**
   * Replicas is the most recently observed number of non-terminating pods. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicaset
   * @return replicas
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Replicas is the most recently observed number of non-terminating pods. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicaset")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(@jakarta.annotation.Nonnull Integer replicas) {
    this.replicas = replicas;
  }


  public V1ReplicaSetStatus terminatingReplicas(@jakarta.annotation.Nullable Integer terminatingReplicas) {
    this.terminatingReplicas = terminatingReplicas;
    return this;
  }

  /**
   * The number of terminating pods for this replica set. Terminating pods have a non-null .metadata.deletionTimestamp and have not yet reached the Failed or Succeeded .status.phase.  This is an alpha field. Enable DeploymentReplicaSetTerminatingReplicas to be able to use this field.
   * @return terminatingReplicas
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The number of terminating pods for this replica set. Terminating pods have a non-null .metadata.deletionTimestamp and have not yet reached the Failed or Succeeded .status.phase.  This is an alpha field. Enable DeploymentReplicaSetTerminatingReplicas to be able to use this field.")
  public Integer getTerminatingReplicas() {
    return terminatingReplicas;
  }

  public void setTerminatingReplicas(@jakarta.annotation.Nullable Integer terminatingReplicas) {
    this.terminatingReplicas = terminatingReplicas;
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
        Objects.equals(this.replicas, v1ReplicaSetStatus.replicas) &&
        Objects.equals(this.terminatingReplicas, v1ReplicaSetStatus.terminatingReplicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableReplicas, conditions, fullyLabeledReplicas, observedGeneration, readyReplicas, replicas, terminatingReplicas);
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
    sb.append("    terminatingReplicas: ").append(toIndentedString(terminatingReplicas)).append("\n");
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
    openapiFields.add("terminatingReplicas");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("replicas");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ReplicaSetStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ReplicaSetStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ReplicaSetStatus is not found in the empty JSON string", V1ReplicaSetStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ReplicaSetStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ReplicaSetStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ReplicaSetStatus.openapiRequiredFields) {
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
            V1ReplicaSetCondition.validateJsonElement(jsonArrayconditions.get(i));
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
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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
