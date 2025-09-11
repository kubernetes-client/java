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
 * PriorityLevelConfigurationCondition defines the condition of priority level.
 */
@ApiModel(description = "PriorityLevelConfigurationCondition defines the condition of priority level.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1PriorityLevelConfigurationCondition {
  public static final String SERIALIZED_NAME_LAST_TRANSITION_TIME = "lastTransitionTime";
  @SerializedName(SERIALIZED_NAME_LAST_TRANSITION_TIME)
  @jakarta.annotation.Nullable
  private OffsetDateTime lastTransitionTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @jakarta.annotation.Nullable
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  @jakarta.annotation.Nullable
  private String reason;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @jakarta.annotation.Nullable
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @jakarta.annotation.Nullable
  private String type;

  public V1PriorityLevelConfigurationCondition() {
  }

  public V1PriorityLevelConfigurationCondition lastTransitionTime(@jakarta.annotation.Nullable OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * &#x60;lastTransitionTime&#x60; is the last time the condition transitioned from one status to another.
   * @return lastTransitionTime
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "`lastTransitionTime` is the last time the condition transitioned from one status to another.")
  public OffsetDateTime getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(@jakarta.annotation.Nullable OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }


  public V1PriorityLevelConfigurationCondition message(@jakarta.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * &#x60;message&#x60; is a human-readable message indicating details about last transition.
   * @return message
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "`message` is a human-readable message indicating details about last transition.")
  public String getMessage() {
    return message;
  }

  public void setMessage(@jakarta.annotation.Nullable String message) {
    this.message = message;
  }


  public V1PriorityLevelConfigurationCondition reason(@jakarta.annotation.Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * &#x60;reason&#x60; is a unique, one-word, CamelCase reason for the condition&#39;s last transition.
   * @return reason
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "`reason` is a unique, one-word, CamelCase reason for the condition's last transition.")
  public String getReason() {
    return reason;
  }

  public void setReason(@jakarta.annotation.Nullable String reason) {
    this.reason = reason;
  }


  public V1PriorityLevelConfigurationCondition status(@jakarta.annotation.Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * &#x60;status&#x60; is the status of the condition. Can be True, False, Unknown. Required.
   * @return status
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "`status` is the status of the condition. Can be True, False, Unknown. Required.")
  public String getStatus() {
    return status;
  }

  public void setStatus(@jakarta.annotation.Nullable String status) {
    this.status = status;
  }


  public V1PriorityLevelConfigurationCondition type(@jakarta.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * &#x60;type&#x60; is the type of the condition. Required.
   * @return type
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "`type` is the type of the condition. Required.")
  public String getType() {
    return type;
  }

  public void setType(@jakarta.annotation.Nullable String type) {
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
    V1PriorityLevelConfigurationCondition v1PriorityLevelConfigurationCondition = (V1PriorityLevelConfigurationCondition) o;
    return Objects.equals(this.lastTransitionTime, v1PriorityLevelConfigurationCondition.lastTransitionTime) &&
        Objects.equals(this.message, v1PriorityLevelConfigurationCondition.message) &&
        Objects.equals(this.reason, v1PriorityLevelConfigurationCondition.reason) &&
        Objects.equals(this.status, v1PriorityLevelConfigurationCondition.status) &&
        Objects.equals(this.type, v1PriorityLevelConfigurationCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTransitionTime, message, reason, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PriorityLevelConfigurationCondition {\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("reason");
    openapiFields.add("status");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1PriorityLevelConfigurationCondition
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PriorityLevelConfigurationCondition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PriorityLevelConfigurationCondition is not found in the empty JSON string", V1PriorityLevelConfigurationCondition.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PriorityLevelConfigurationCondition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PriorityLevelConfigurationCondition` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PriorityLevelConfigurationCondition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PriorityLevelConfigurationCondition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PriorityLevelConfigurationCondition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PriorityLevelConfigurationCondition.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PriorityLevelConfigurationCondition>() {
           @Override
           public void write(JsonWriter out, V1PriorityLevelConfigurationCondition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PriorityLevelConfigurationCondition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1PriorityLevelConfigurationCondition given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1PriorityLevelConfigurationCondition
   * @throws IOException if the JSON string is invalid with respect to V1PriorityLevelConfigurationCondition
   */
  public static V1PriorityLevelConfigurationCondition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PriorityLevelConfigurationCondition.class);
  }

  /**
   * Convert an instance of V1PriorityLevelConfigurationCondition to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
