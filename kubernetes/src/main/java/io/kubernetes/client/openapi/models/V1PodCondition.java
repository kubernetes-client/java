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
 * PodCondition contains details for the current condition of this pod.
 */
@ApiModel(description = "PodCondition contains details for the current condition of this pod.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1PodCondition {
  public static final String SERIALIZED_NAME_LAST_PROBE_TIME = "lastProbeTime";
  @SerializedName(SERIALIZED_NAME_LAST_PROBE_TIME)
  @jakarta.annotation.Nullable
  private OffsetDateTime lastProbeTime;

  public static final String SERIALIZED_NAME_LAST_TRANSITION_TIME = "lastTransitionTime";
  @SerializedName(SERIALIZED_NAME_LAST_TRANSITION_TIME)
  @jakarta.annotation.Nullable
  private OffsetDateTime lastTransitionTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @jakarta.annotation.Nullable
  private String message;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  @jakarta.annotation.Nullable
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  @jakarta.annotation.Nullable
  private String reason;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @jakarta.annotation.Nonnull
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @jakarta.annotation.Nonnull
  private String type;

  public V1PodCondition() {
  }

  public V1PodCondition lastProbeTime(@jakarta.annotation.Nullable OffsetDateTime lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
    return this;
  }

  /**
   * Last time we probed the condition.
   * @return lastProbeTime
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Last time we probed the condition.")
  public OffsetDateTime getLastProbeTime() {
    return lastProbeTime;
  }

  public void setLastProbeTime(@jakarta.annotation.Nullable OffsetDateTime lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
  }


  public V1PodCondition lastTransitionTime(@jakarta.annotation.Nullable OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * Last time the condition transitioned from one status to another.
   * @return lastTransitionTime
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Last time the condition transitioned from one status to another.")
  public OffsetDateTime getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(@jakarta.annotation.Nullable OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }


  public V1PodCondition message(@jakarta.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Human-readable message indicating details about last transition.
   * @return message
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Human-readable message indicating details about last transition.")
  public String getMessage() {
    return message;
  }

  public void setMessage(@jakarta.annotation.Nullable String message) {
    this.message = message;
  }


  public V1PodCondition observedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * If set, this represents the .metadata.generation that the pod condition was set based upon. This is an alpha field. Enable PodObservedGenerationTracking to be able to use this field.
   * @return observedGeneration
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If set, this represents the .metadata.generation that the pod condition was set based upon. This is an alpha field. Enable PodObservedGenerationTracking to be able to use this field.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  public V1PodCondition reason(@jakarta.annotation.Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Unique, one-word, CamelCase reason for the condition&#39;s last transition.
   * @return reason
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Unique, one-word, CamelCase reason for the condition's last transition.")
  public String getReason() {
    return reason;
  }

  public void setReason(@jakarta.annotation.Nullable String reason) {
    this.reason = reason;
  }


  public V1PodCondition status(@jakarta.annotation.Nonnull String status) {
    this.status = status;
    return this;
  }

  /**
   * Status is the status of the condition. Can be True, False, Unknown. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
   * @return status
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Status is the status of the condition. Can be True, False, Unknown. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions")
  public String getStatus() {
    return status;
  }

  public void setStatus(@jakarta.annotation.Nonnull String status) {
    this.status = status;
  }


  public V1PodCondition type(@jakarta.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * Type is the type of the condition. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
   * @return type
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Type is the type of the condition. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions")
  public String getType() {
    return type;
  }

  public void setType(@jakarta.annotation.Nonnull String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodCondition v1PodCondition = (V1PodCondition) o;
    return Objects.equals(this.lastProbeTime, v1PodCondition.lastProbeTime) &&
        Objects.equals(this.lastTransitionTime, v1PodCondition.lastTransitionTime) &&
        Objects.equals(this.message, v1PodCondition.message) &&
        Objects.equals(this.observedGeneration, v1PodCondition.observedGeneration) &&
        Objects.equals(this.reason, v1PodCondition.reason) &&
        Objects.equals(this.status, v1PodCondition.status) &&
        Objects.equals(this.type, v1PodCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastProbeTime, lastTransitionTime, message, observedGeneration, reason, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodCondition {\n");
    sb.append("    lastProbeTime: ").append(toIndentedString(lastProbeTime)).append("\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("lastProbeTime");
    openapiFields.add("lastTransitionTime");
    openapiFields.add("message");
    openapiFields.add("observedGeneration");
    openapiFields.add("reason");
    openapiFields.add("status");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1PodCondition
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PodCondition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PodCondition is not found in the empty JSON string", V1PodCondition.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PodCondition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PodCondition` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1PodCondition.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PodCondition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PodCondition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PodCondition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PodCondition.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PodCondition>() {
           @Override
           public void write(JsonWriter out, V1PodCondition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PodCondition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1PodCondition given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1PodCondition
   * @throws IOException if the JSON string is invalid with respect to V1PodCondition
   */
  public static V1PodCondition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PodCondition.class);
  }

  /**
   * Convert an instance of V1PodCondition to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
