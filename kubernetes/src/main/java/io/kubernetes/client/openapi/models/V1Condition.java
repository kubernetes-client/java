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
 * Condition contains details for one aspect of the current state of this API Resource.
 */
@ApiModel(description = "Condition contains details for one aspect of the current state of this API Resource.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1Condition {
  public static final String SERIALIZED_NAME_LAST_TRANSITION_TIME = "lastTransitionTime";
  @SerializedName(SERIALIZED_NAME_LAST_TRANSITION_TIME)
  @jakarta.annotation.Nonnull
  private OffsetDateTime lastTransitionTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @jakarta.annotation.Nonnull
  private String message;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  @jakarta.annotation.Nullable
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  @jakarta.annotation.Nonnull
  private String reason;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @jakarta.annotation.Nonnull
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @jakarta.annotation.Nonnull
  private String type;

  public V1Condition() {
  }

  public V1Condition lastTransitionTime(@jakarta.annotation.Nonnull OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * lastTransitionTime is the last time the condition transitioned from one status to another. This should be when the underlying condition changed.  If that is not known, then using the time when the API field changed is acceptable.
   * @return lastTransitionTime
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "lastTransitionTime is the last time the condition transitioned from one status to another. This should be when the underlying condition changed.  If that is not known, then using the time when the API field changed is acceptable.")
  public OffsetDateTime getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(@jakarta.annotation.Nonnull OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }


  public V1Condition message(@jakarta.annotation.Nonnull String message) {
    this.message = message;
    return this;
  }

  /**
   * message is a human readable message indicating details about the transition. This may be an empty string.
   * @return message
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "message is a human readable message indicating details about the transition. This may be an empty string.")
  public String getMessage() {
    return message;
  }

  public void setMessage(@jakarta.annotation.Nonnull String message) {
    this.message = message;
  }


  public V1Condition observedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * observedGeneration represents the .metadata.generation that the condition was set based upon. For instance, if .metadata.generation is currently 12, but the .status.conditions[x].observedGeneration is 9, the condition is out of date with respect to the current state of the instance.
   * @return observedGeneration
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "observedGeneration represents the .metadata.generation that the condition was set based upon. For instance, if .metadata.generation is currently 12, but the .status.conditions[x].observedGeneration is 9, the condition is out of date with respect to the current state of the instance.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  public V1Condition reason(@jakarta.annotation.Nonnull String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * reason contains a programmatic identifier indicating the reason for the condition&#39;s last transition. Producers of specific condition types may define expected values and meanings for this field, and whether the values are considered a guaranteed API. The value should be a CamelCase string. This field may not be empty.
   * @return reason
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "reason contains a programmatic identifier indicating the reason for the condition's last transition. Producers of specific condition types may define expected values and meanings for this field, and whether the values are considered a guaranteed API. The value should be a CamelCase string. This field may not be empty.")
  public String getReason() {
    return reason;
  }

  public void setReason(@jakarta.annotation.Nonnull String reason) {
    this.reason = reason;
  }


  public V1Condition status(@jakarta.annotation.Nonnull String status) {
    this.status = status;
    return this;
  }

  /**
   * status of the condition, one of True, False, Unknown.
   * @return status
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "status of the condition, one of True, False, Unknown.")
  public String getStatus() {
    return status;
  }

  public void setStatus(@jakarta.annotation.Nonnull String status) {
    this.status = status;
  }


  public V1Condition type(@jakarta.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * type of condition in CamelCase or in foo.example.com/CamelCase.
   * @return type
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "type of condition in CamelCase or in foo.example.com/CamelCase.")
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
    V1Condition v1Condition = (V1Condition) o;
    return Objects.equals(this.lastTransitionTime, v1Condition.lastTransitionTime) &&
        Objects.equals(this.message, v1Condition.message) &&
        Objects.equals(this.observedGeneration, v1Condition.observedGeneration) &&
        Objects.equals(this.reason, v1Condition.reason) &&
        Objects.equals(this.status, v1Condition.status) &&
        Objects.equals(this.type, v1Condition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTransitionTime, message, observedGeneration, reason, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Condition {\n");
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
    openapiFields.add("lastTransitionTime");
    openapiFields.add("message");
    openapiFields.add("observedGeneration");
    openapiFields.add("reason");
    openapiFields.add("status");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("lastTransitionTime");
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("reason");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1Condition
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1Condition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1Condition is not found in the empty JSON string", V1Condition.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1Condition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1Condition` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1Condition.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if (!jsonObj.get("reason").isJsonPrimitive()) {
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
       if (!V1Condition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1Condition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1Condition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1Condition.class));

       return (TypeAdapter<T>) new TypeAdapter<V1Condition>() {
           @Override
           public void write(JsonWriter out, V1Condition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1Condition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1Condition given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1Condition
   * @throws IOException if the JSON string is invalid with respect to V1Condition
   */
  public static V1Condition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1Condition.class);
  }

  /**
   * Convert an instance of V1Condition to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
