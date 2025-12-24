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
import java.util.Locale;
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
import java.util.Locale;

import io.kubernetes.client.openapi.JSON;

/**
 * ContainerStateTerminated is a terminated state of a container.
 */
@ApiModel(description = "ContainerStateTerminated is a terminated state of a container.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-11-21T03:25:56.836812Z[Etc/UTC]", comments = "Generator version: 7.16.0")
public class V1ContainerStateTerminated {
  public static final String SERIALIZED_NAME_CONTAINER_I_D = "containerID";
  @SerializedName(SERIALIZED_NAME_CONTAINER_I_D)
  @jakarta.annotation.Nullable
  private String containerID;

  public static final String SERIALIZED_NAME_EXIT_CODE = "exitCode";
  @SerializedName(SERIALIZED_NAME_EXIT_CODE)
  @jakarta.annotation.Nonnull
  private Integer exitCode;

  public static final String SERIALIZED_NAME_FINISHED_AT = "finishedAt";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT)
  @jakarta.annotation.Nullable
  private OffsetDateTime finishedAt;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @jakarta.annotation.Nullable
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  @jakarta.annotation.Nullable
  private String reason;

  public static final String SERIALIZED_NAME_SIGNAL = "signal";
  @SerializedName(SERIALIZED_NAME_SIGNAL)
  @jakarta.annotation.Nullable
  private Integer signal;

  public static final String SERIALIZED_NAME_STARTED_AT = "startedAt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  @jakarta.annotation.Nullable
  private OffsetDateTime startedAt;

  public V1ContainerStateTerminated() {
  }

  public V1ContainerStateTerminated containerID(@jakarta.annotation.Nullable String containerID) {
    this.containerID = containerID;
    return this;
  }

  /**
   * Container&#39;s ID in the format &#39;&lt;type&gt;://&lt;container_id&gt;&#39;
   * @return containerID
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Container's ID in the format '<type>://<container_id>'")
  public String getContainerID() {
    return containerID;
  }

  public void setContainerID(@jakarta.annotation.Nullable String containerID) {
    this.containerID = containerID;
  }


  public V1ContainerStateTerminated exitCode(@jakarta.annotation.Nonnull Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  /**
   * Exit status from the last termination of the container
   * @return exitCode
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Exit status from the last termination of the container")
  public Integer getExitCode() {
    return exitCode;
  }

  public void setExitCode(@jakarta.annotation.Nonnull Integer exitCode) {
    this.exitCode = exitCode;
  }


  public V1ContainerStateTerminated finishedAt(@jakarta.annotation.Nullable OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Time at which the container last terminated
   * @return finishedAt
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Time at which the container last terminated")
  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(@jakarta.annotation.Nullable OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }


  public V1ContainerStateTerminated message(@jakarta.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Message regarding the last termination of the container
   * @return message
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Message regarding the last termination of the container")
  public String getMessage() {
    return message;
  }

  public void setMessage(@jakarta.annotation.Nullable String message) {
    this.message = message;
  }


  public V1ContainerStateTerminated reason(@jakarta.annotation.Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * (brief) reason from the last termination of the container
   * @return reason
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "(brief) reason from the last termination of the container")
  public String getReason() {
    return reason;
  }

  public void setReason(@jakarta.annotation.Nullable String reason) {
    this.reason = reason;
  }


  public V1ContainerStateTerminated signal(@jakarta.annotation.Nullable Integer signal) {
    this.signal = signal;
    return this;
  }

  /**
   * Signal from the last termination of the container
   * @return signal
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Signal from the last termination of the container")
  public Integer getSignal() {
    return signal;
  }

  public void setSignal(@jakarta.annotation.Nullable Integer signal) {
    this.signal = signal;
  }


  public V1ContainerStateTerminated startedAt(@jakarta.annotation.Nullable OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Time at which previous execution of the container started
   * @return startedAt
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Time at which previous execution of the container started")
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(@jakarta.annotation.Nullable OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerStateTerminated v1ContainerStateTerminated = (V1ContainerStateTerminated) o;
    return Objects.equals(this.containerID, v1ContainerStateTerminated.containerID) &&
        Objects.equals(this.exitCode, v1ContainerStateTerminated.exitCode) &&
        Objects.equals(this.finishedAt, v1ContainerStateTerminated.finishedAt) &&
        Objects.equals(this.message, v1ContainerStateTerminated.message) &&
        Objects.equals(this.reason, v1ContainerStateTerminated.reason) &&
        Objects.equals(this.signal, v1ContainerStateTerminated.signal) &&
        Objects.equals(this.startedAt, v1ContainerStateTerminated.startedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerID, exitCode, finishedAt, message, reason, signal, startedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerStateTerminated {\n");
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    signal: ").append(toIndentedString(signal)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("containerID", "exitCode", "finishedAt", "message", "reason", "signal", "startedAt"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("exitCode"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ContainerStateTerminated
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ContainerStateTerminated.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The required field(s) %s in V1ContainerStateTerminated is not found in the empty JSON string", V1ContainerStateTerminated.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ContainerStateTerminated.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1ContainerStateTerminated` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ContainerStateTerminated.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("containerID") != null && !jsonObj.get("containerID").isJsonNull()) && !jsonObj.get("containerID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `containerID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("containerID").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ContainerStateTerminated.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ContainerStateTerminated' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ContainerStateTerminated> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ContainerStateTerminated.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ContainerStateTerminated>() {
           @Override
           public void write(JsonWriter out, V1ContainerStateTerminated value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ContainerStateTerminated read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ContainerStateTerminated given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ContainerStateTerminated
   * @throws IOException if the JSON string is invalid with respect to V1ContainerStateTerminated
   */
  public static V1ContainerStateTerminated fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ContainerStateTerminated.class);
  }

  /**
   * Convert an instance of V1ContainerStateTerminated to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
