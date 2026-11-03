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
 * ResponderStatus represents the last observed status of the eviction process of the responder. It should be only updated by the designated responder whose name is .name field.
 */
@ApiModel(description = "ResponderStatus represents the last observed status of the eviction process of the responder. It should be only updated by the designated responder whose name is .name field.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-10-15T02:48:00.835726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1alpha1ResponderStatus {
  public static final String SERIALIZED_NAME_COMPLETION_TIME = "completionTime";
  @SerializedName(SERIALIZED_NAME_COMPLETION_TIME)
  @jakarta.annotation.Nullable
  private OffsetDateTime completionTime;

  public static final String SERIALIZED_NAME_EXPECTED_COMPLETION_TIME = "expectedCompletionTime";
  @SerializedName(SERIALIZED_NAME_EXPECTED_COMPLETION_TIME)
  @jakarta.annotation.Nullable
  private OffsetDateTime expectedCompletionTime;

  public static final String SERIALIZED_NAME_HEARTBEAT_TIME = "heartbeatTime";
  @SerializedName(SERIALIZED_NAME_HEARTBEAT_TIME)
  @jakarta.annotation.Nullable
  private OffsetDateTime heartbeatTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @jakarta.annotation.Nullable
  private String message;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  @jakarta.annotation.Nullable
  private OffsetDateTime startTime;

  public V1alpha1ResponderStatus() {
  }

  public V1alpha1ResponderStatus completionTime(@jakarta.annotation.Nullable OffsetDateTime completionTime) {
    this.completionTime = completionTime;
    return this;
  }

  /**
   * completionTime tracks the time at which the Responder stopped processing the eviction request. Completion means that the responders has either fully or partially completed the eviction process, which may have resulted in target eviction (e.g. pod termination). It should reflect the present time when set. This field becomes immutable once set.
   * @return completionTime
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "completionTime tracks the time at which the Responder stopped processing the eviction request. Completion means that the responders has either fully or partially completed the eviction process, which may have resulted in target eviction (e.g. pod termination). It should reflect the present time when set. This field becomes immutable once set.")
  public OffsetDateTime getCompletionTime() {
    return completionTime;
  }

  public void setCompletionTime(@jakarta.annotation.Nullable OffsetDateTime completionTime) {
    this.completionTime = completionTime;
  }


  public V1alpha1ResponderStatus expectedCompletionTime(@jakarta.annotation.Nullable OffsetDateTime expectedCompletionTime) {
    this.expectedCompletionTime = expectedCompletionTime;
    return this;
  }

  /**
   * expectedCompletionTime is the time at which the eviction process step is expected to end for the responder. The time cannot be set to the past. May be omitted if no estimate can be made.
   * @return expectedCompletionTime
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "expectedCompletionTime is the time at which the eviction process step is expected to end for the responder. The time cannot be set to the past. May be omitted if no estimate can be made.")
  public OffsetDateTime getExpectedCompletionTime() {
    return expectedCompletionTime;
  }

  public void setExpectedCompletionTime(@jakarta.annotation.Nullable OffsetDateTime expectedCompletionTime) {
    this.expectedCompletionTime = expectedCompletionTime;
  }


  public V1alpha1ResponderStatus heartbeatTime(@jakarta.annotation.Nullable OffsetDateTime heartbeatTime) {
    this.heartbeatTime = heartbeatTime;
    return this;
  }

  /**
   * heartbeatTime is the last time at which the eviction process was reported to be in progress by the responder. It should reflect the present time when set. Responders should avoid heartbeats more frequent than 20 seconds to avoid overloading the control-plane.
   * @return heartbeatTime
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "heartbeatTime is the last time at which the eviction process was reported to be in progress by the responder. It should reflect the present time when set. Responders should avoid heartbeats more frequent than 20 seconds to avoid overloading the control-plane.")
  public OffsetDateTime getHeartbeatTime() {
    return heartbeatTime;
  }

  public void setHeartbeatTime(@jakarta.annotation.Nullable OffsetDateTime heartbeatTime) {
    this.heartbeatTime = heartbeatTime;
  }


  public V1alpha1ResponderStatus message(@jakarta.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * message provides human-readable details about the state of the responder and the eviction process. Maximum length is 4000 characters.
   * @return message
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "message provides human-readable details about the state of the responder and the eviction process. Maximum length is 4000 characters.")
  public String getMessage() {
    return message;
  }

  public void setMessage(@jakarta.annotation.Nullable String message) {
    this.message = message;
  }


  public V1alpha1ResponderStatus name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * name allows you to identify the responder reacting to the Eviction.  It must be a valid domain-prefixed key (such as \&quot;acme.io/foo\&quot;). This field is initialized by Kubernetes and must be unique for each responder. This field is required.
   * @return name
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "name allows you to identify the responder reacting to the Eviction.  It must be a valid domain-prefixed key (such as \"acme.io/foo\"). This field is initialized by Kubernetes and must be unique for each responder. This field is required.")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }


  public V1alpha1ResponderStatus startTime(@jakarta.annotation.Nullable OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * startTime tracks the time at which this responder was designated as active and should start processing the eviction request. It should reflect the present time when set. This field is initialized by Kubernetes when this responder becomes active. This field becomes immutable once set.
   * @return startTime
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "startTime tracks the time at which this responder was designated as active and should start processing the eviction request. It should reflect the present time when set. This field is initialized by Kubernetes when this responder becomes active. This field becomes immutable once set.")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(@jakarta.annotation.Nullable OffsetDateTime startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ResponderStatus v1alpha1ResponderStatus = (V1alpha1ResponderStatus) o;
    return Objects.equals(this.completionTime, v1alpha1ResponderStatus.completionTime) &&
        Objects.equals(this.expectedCompletionTime, v1alpha1ResponderStatus.expectedCompletionTime) &&
        Objects.equals(this.heartbeatTime, v1alpha1ResponderStatus.heartbeatTime) &&
        Objects.equals(this.message, v1alpha1ResponderStatus.message) &&
        Objects.equals(this.name, v1alpha1ResponderStatus.name) &&
        Objects.equals(this.startTime, v1alpha1ResponderStatus.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionTime, expectedCompletionTime, heartbeatTime, message, name, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ResponderStatus {\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    expectedCompletionTime: ").append(toIndentedString(expectedCompletionTime)).append("\n");
    sb.append("    heartbeatTime: ").append(toIndentedString(heartbeatTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("completionTime", "expectedCompletionTime", "heartbeatTime", "message", "name", "startTime"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("name"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha1ResponderStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha1ResponderStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1alpha1ResponderStatus is not found in the empty JSON string", V1alpha1ResponderStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ResponderStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1alpha1ResponderStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ResponderStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ResponderStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ResponderStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ResponderStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ResponderStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ResponderStatus>() {
           @Override
           public void write(JsonWriter out, V1alpha1ResponderStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ResponderStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha1ResponderStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha1ResponderStatus
   * @throws IOException if the JSON string is invalid with respect to V1alpha1ResponderStatus
   */
  public static V1alpha1ResponderStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ResponderStatus.class);
  }

  /**
   * Convert an instance of V1alpha1ResponderStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
