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
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * NodeCondition contains condition information for a node.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1NodeCondition {
  public static final String SERIALIZED_NAME_LAST_HEARTBEAT_TIME = "lastHeartbeatTime";
  @SerializedName(SERIALIZED_NAME_LAST_HEARTBEAT_TIME)
  private OffsetDateTime lastHeartbeatTime;

  public static final String SERIALIZED_NAME_LAST_TRANSITION_TIME = "lastTransitionTime";
  @SerializedName(SERIALIZED_NAME_LAST_TRANSITION_TIME)
  private OffsetDateTime lastTransitionTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1NodeCondition() {
  }

  public V1NodeCondition lastHeartbeatTime(OffsetDateTime lastHeartbeatTime) {

    this.lastHeartbeatTime = lastHeartbeatTime;
    return this;
  }

   /**
   * Last time we got an update on a given condition.
   * @return lastHeartbeatTime
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getLastHeartbeatTime() {
    return lastHeartbeatTime;
  }


  public void setLastHeartbeatTime(OffsetDateTime lastHeartbeatTime) {
    this.lastHeartbeatTime = lastHeartbeatTime;
  }


  public V1NodeCondition lastTransitionTime(OffsetDateTime lastTransitionTime) {

    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * Last time the condition transit from one status to another.
   * @return lastTransitionTime
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getLastTransitionTime() {
    return lastTransitionTime;
  }


  public void setLastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }


  public V1NodeCondition message(String message) {

    this.message = message;
    return this;
  }

   /**
   * Human readable message indicating details about last transition.
   * @return message
  **/
  @jakarta.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public V1NodeCondition reason(String reason) {

    this.reason = reason;
    return this;
  }

   /**
   * (brief) reason for the condition&#39;s last transition.
   * @return reason
  **/
  @jakarta.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public V1NodeCondition status(String status) {

    this.status = status;
    return this;
  }

   /**
   * Status of the condition, one of True, False, Unknown.
   * @return status
  **/
  @jakarta.annotation.Nonnull
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public V1NodeCondition type(String type) {

    this.type = type;
    return this;
  }

   /**
   * Type of node condition.
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
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
    V1NodeCondition v1NodeCondition = (V1NodeCondition) o;
    return Objects.equals(this.lastHeartbeatTime, v1NodeCondition.lastHeartbeatTime) &&
        Objects.equals(this.lastTransitionTime, v1NodeCondition.lastTransitionTime) &&
        Objects.equals(this.message, v1NodeCondition.message) &&
        Objects.equals(this.reason, v1NodeCondition.reason) &&
        Objects.equals(this.status, v1NodeCondition.status) &&
        Objects.equals(this.type, v1NodeCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastHeartbeatTime, lastTransitionTime, message, reason, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeCondition {\n");
    sb.append("    lastHeartbeatTime: ").append(toIndentedString(lastHeartbeatTime)).append("\n");
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
    openapiFields.add("lastHeartbeatTime");
    openapiFields.add("lastTransitionTime");
    openapiFields.add("message");
    openapiFields.add("reason");
    openapiFields.add("status");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1NodeCondition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1NodeCondition.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NodeCondition is not found in the empty JSON string", V1NodeCondition.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1NodeCondition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NodeCondition` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1NodeCondition.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
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
       if (!V1NodeCondition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NodeCondition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NodeCondition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NodeCondition.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NodeCondition>() {
           @Override
           public void write(JsonWriter out, V1NodeCondition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NodeCondition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1NodeCondition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1NodeCondition
  * @throws IOException if the JSON string is invalid with respect to V1NodeCondition
  */
  public static V1NodeCondition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NodeCondition.class);
  }

 /**
  * Convert an instance of V1NodeCondition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
