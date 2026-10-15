/*
Copyright 2026 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1Condition;
import io.kubernetes.client.openapi.models.V1alpha1Requester;
import io.kubernetes.client.openapi.models.V1alpha1ResponderStatus;
import io.kubernetes.client.openapi.models.V1alpha1TargetResponder;
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
 * EvictionStatus represents the last observed status of the eviction request.
 */
@ApiModel(description = "EvictionStatus represents the last observed status of the eviction request.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-10-15T02:48:00.835726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1alpha1EvictionStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<V1Condition> conditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  @jakarta.annotation.Nullable
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_REQUESTERS = "requesters";
  @SerializedName(SERIALIZED_NAME_REQUESTERS)
  @jakarta.annotation.Nullable
  private List<V1alpha1Requester> requesters = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESPONDERS = "responders";
  @SerializedName(SERIALIZED_NAME_RESPONDERS)
  @jakarta.annotation.Nullable
  private List<V1alpha1ResponderStatus> responders = new ArrayList<>();

  public static final String SERIALIZED_NAME_TARGET_RESPONDERS = "targetResponders";
  @SerializedName(SERIALIZED_NAME_TARGET_RESPONDERS)
  @jakarta.annotation.Nullable
  private List<V1alpha1TargetResponder> targetResponders = new ArrayList<>();

  public V1alpha1EvictionStatus() {
  }

  public V1alpha1EvictionStatus conditions(@jakarta.annotation.Nullable List<V1Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1alpha1EvictionStatus addConditionsItem(V1Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * conditions contain information about the eviction request.  Eviction specific conditions are: TargetEvicted or Failed (managed by evictionrequest-controller). - Failed means that the eviction request is no longer being processed   by any eviction responder. This can happen if the request is canceled or if no responder   managed to evict the target (e.g. terminate or delete a pod). - TargetEvicted means that the target has been evicted (e.g. a pod has been terminated or deleted).   The maximum length of the conditions list is 100.
   * @return conditions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "conditions contain information about the eviction request.  Eviction specific conditions are: TargetEvicted or Failed (managed by evictionrequest-controller). - Failed means that the eviction request is no longer being processed   by any eviction responder. This can happen if the request is canceled or if no responder   managed to evict the target (e.g. terminate or delete a pod). - TargetEvicted means that the target has been evicted (e.g. a pod has been terminated or deleted).   The maximum length of the conditions list is 100.")
  public List<V1Condition> getConditions() {
    return conditions;
  }

  public void setConditions(@jakarta.annotation.Nullable List<V1Condition> conditions) {
    this.conditions = conditions;
  }


  public V1alpha1EvictionStatus observedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * observedGeneration is Eviction&#39;s .metadata.generation observed by the evictionrequest-controller. The observed generation value cannot be negative and can only be incremented. The minimum value is 1. This field is managed by evictionrequest-controller.
   * @return observedGeneration
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "observedGeneration is Eviction's .metadata.generation observed by the evictionrequest-controller. The observed generation value cannot be negative and can only be incremented. The minimum value is 1. This field is managed by evictionrequest-controller.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  public V1alpha1EvictionStatus requesters(@jakarta.annotation.Nullable List<V1alpha1Requester> requesters) {
    this.requesters = requesters;
    return this;
  }

  public V1alpha1EvictionStatus addRequestersItem(V1alpha1Requester requestersItem) {
    if (this.requesters == null) {
      this.requesters = new ArrayList<>();
    }
    this.requesters.add(requestersItem);
    return this;
  }

  /**
   * requesters allow you to identify the entities, that requested the eviction of the target. If all the requesters withdraw their eviction intent, the eviction will be canceled.  The maximum length of the requesters list is 100. If this limit is exceeded, requesters with Withdrawn intent should be dropped first.
   * @return requesters
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "requesters allow you to identify the entities, that requested the eviction of the target. If all the requesters withdraw their eviction intent, the eviction will be canceled.  The maximum length of the requesters list is 100. If this limit is exceeded, requesters with Withdrawn intent should be dropped first.")
  public List<V1alpha1Requester> getRequesters() {
    return requesters;
  }

  public void setRequesters(@jakarta.annotation.Nullable List<V1alpha1Requester> requesters) {
    this.requesters = requesters;
  }


  public V1alpha1EvictionStatus responders(@jakarta.annotation.Nullable List<V1alpha1ResponderStatus> responders) {
    this.responders = responders;
    return this;
  }

  public V1alpha1EvictionStatus addRespondersItem(V1alpha1ResponderStatus respondersItem) {
    if (this.responders == null) {
      this.responders = new ArrayList<>();
    }
    this.responders.add(respondersItem);
    return this;
  }

  /**
   * responders represents the eviction process status of each declared responder.  The responder list should be the same length and have the same .name fields as .status.targetResponders. Only responders with .name that have Active state in .targetResponders[].state should be updated and can be mutated. First initialization of the list is allowed.  Each ResponderStatus is initialized by evictionrequest-controller and then managed by the designated responder.
   * @return responders
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "responders represents the eviction process status of each declared responder.  The responder list should be the same length and have the same .name fields as .status.targetResponders. Only responders with .name that have Active state in .targetResponders[].state should be updated and can be mutated. First initialization of the list is allowed.  Each ResponderStatus is initialized by evictionrequest-controller and then managed by the designated responder.")
  public List<V1alpha1ResponderStatus> getResponders() {
    return responders;
  }

  public void setResponders(@jakarta.annotation.Nullable List<V1alpha1ResponderStatus> responders) {
    this.responders = responders;
  }


  public V1alpha1EvictionStatus targetResponders(@jakarta.annotation.Nullable List<V1alpha1TargetResponder> targetResponders) {
    this.targetResponders = targetResponders;
    return this;
  }

  public V1alpha1EvictionStatus addTargetRespondersItem(V1alpha1TargetResponder targetRespondersItem) {
    if (this.targetResponders == null) {
      this.targetResponders = new ArrayList<>();
    }
    this.targetResponders.add(targetRespondersItem);
    return this;
  }

  /**
   * targetResponders reference responders that should eventually respond to this eviction to help with the graceful eviction of a target. These responders are selected sequentially, according to their specified priority by setting the Active state to the TargetResponder .state field. The maximum number of active responders allowed is 1. Eventually each responder can end up in an Interrupted, Canceled or, Completed state. Responders should observe these states in order to navigate their lifecycle.  If the target is a pod, the field is populated from Pod&#39;s .spec.evictionResponders. Default responders may be added to the list according to the target.  Default responders: - imperative-eviction.k8s.io/evictor responder with a priority of 100 is added to the list if the   target is a pod. It will call the imperative Eviction API (pods/&lt;name&gt;/eviction subresource).   This call may not succeed due to PodDisruptionBudgets, which may block the pod termination.   It will update the responder message and try again with a backoff.  The maximum length of the responders list is 11. The length and keys of the list cannot change once set. This field is managed by evictionrequest-controller.
   * @return targetResponders
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "targetResponders reference responders that should eventually respond to this eviction to help with the graceful eviction of a target. These responders are selected sequentially, according to their specified priority by setting the Active state to the TargetResponder .state field. The maximum number of active responders allowed is 1. Eventually each responder can end up in an Interrupted, Canceled or, Completed state. Responders should observe these states in order to navigate their lifecycle.  If the target is a pod, the field is populated from Pod's .spec.evictionResponders. Default responders may be added to the list according to the target.  Default responders: - imperative-eviction.k8s.io/evictor responder with a priority of 100 is added to the list if the   target is a pod. It will call the imperative Eviction API (pods/<name>/eviction subresource).   This call may not succeed due to PodDisruptionBudgets, which may block the pod termination.   It will update the responder message and try again with a backoff.  The maximum length of the responders list is 11. The length and keys of the list cannot change once set. This field is managed by evictionrequest-controller.")
  public List<V1alpha1TargetResponder> getTargetResponders() {
    return targetResponders;
  }

  public void setTargetResponders(@jakarta.annotation.Nullable List<V1alpha1TargetResponder> targetResponders) {
    this.targetResponders = targetResponders;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1EvictionStatus v1alpha1EvictionStatus = (V1alpha1EvictionStatus) o;
    return Objects.equals(this.conditions, v1alpha1EvictionStatus.conditions) &&
        Objects.equals(this.observedGeneration, v1alpha1EvictionStatus.observedGeneration) &&
        Objects.equals(this.requesters, v1alpha1EvictionStatus.requesters) &&
        Objects.equals(this.responders, v1alpha1EvictionStatus.responders) &&
        Objects.equals(this.targetResponders, v1alpha1EvictionStatus.targetResponders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, observedGeneration, requesters, responders, targetResponders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1EvictionStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    requesters: ").append(toIndentedString(requesters)).append("\n");
    sb.append("    responders: ").append(toIndentedString(responders)).append("\n");
    sb.append("    targetResponders: ").append(toIndentedString(targetResponders)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("conditions", "observedGeneration", "requesters", "responders", "targetResponders"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha1EvictionStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha1EvictionStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1alpha1EvictionStatus is not found in the empty JSON string", V1alpha1EvictionStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1EvictionStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1alpha1EvictionStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            V1Condition.validateJsonElement(jsonArrayconditions.get(i));
          };
        }
      }
      if (jsonObj.get("requesters") != null && !jsonObj.get("requesters").isJsonNull()) {
        JsonArray jsonArrayrequesters = jsonObj.getAsJsonArray("requesters");
        if (jsonArrayrequesters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("requesters").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `requesters` to be an array in the JSON string but got `%s`", jsonObj.get("requesters").toString()));
          }

          // validate the optional field `requesters` (array)
          for (int i = 0; i < jsonArrayrequesters.size(); i++) {
            V1alpha1Requester.validateJsonElement(jsonArrayrequesters.get(i));
          };
        }
      }
      if (jsonObj.get("responders") != null && !jsonObj.get("responders").isJsonNull()) {
        JsonArray jsonArrayresponders = jsonObj.getAsJsonArray("responders");
        if (jsonArrayresponders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("responders").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `responders` to be an array in the JSON string but got `%s`", jsonObj.get("responders").toString()));
          }

          // validate the optional field `responders` (array)
          for (int i = 0; i < jsonArrayresponders.size(); i++) {
            V1alpha1ResponderStatus.validateJsonElement(jsonArrayresponders.get(i));
          };
        }
      }
      if (jsonObj.get("targetResponders") != null && !jsonObj.get("targetResponders").isJsonNull()) {
        JsonArray jsonArraytargetResponders = jsonObj.getAsJsonArray("targetResponders");
        if (jsonArraytargetResponders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("targetResponders").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `targetResponders` to be an array in the JSON string but got `%s`", jsonObj.get("targetResponders").toString()));
          }

          // validate the optional field `targetResponders` (array)
          for (int i = 0; i < jsonArraytargetResponders.size(); i++) {
            V1alpha1TargetResponder.validateJsonElement(jsonArraytargetResponders.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1EvictionStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1EvictionStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1EvictionStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1EvictionStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1EvictionStatus>() {
           @Override
           public void write(JsonWriter out, V1alpha1EvictionStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1EvictionStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha1EvictionStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha1EvictionStatus
   * @throws IOException if the JSON string is invalid with respect to V1alpha1EvictionStatus
   */
  public static V1alpha1EvictionStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1EvictionStatus.class);
  }

  /**
   * Convert an instance of V1alpha1EvictionStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
