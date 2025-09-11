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
 * VolumeError captures an error encountered during a volume operation.
 */
@ApiModel(description = "VolumeError captures an error encountered during a volume operation.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1VolumeError {
  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  @jakarta.annotation.Nullable
  private Integer errorCode;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @jakarta.annotation.Nullable
  private String message;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  @jakarta.annotation.Nullable
  private OffsetDateTime time;

  public V1VolumeError() {
  }

  public V1VolumeError errorCode(@jakarta.annotation.Nullable Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * errorCode is a numeric gRPC code representing the error encountered during Attach or Detach operations.  This is an optional, beta field that requires the MutableCSINodeAllocatableCount feature gate being enabled to be set.
   * @return errorCode
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "errorCode is a numeric gRPC code representing the error encountered during Attach or Detach operations.  This is an optional, beta field that requires the MutableCSINodeAllocatableCount feature gate being enabled to be set.")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(@jakarta.annotation.Nullable Integer errorCode) {
    this.errorCode = errorCode;
  }


  public V1VolumeError message(@jakarta.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * message represents the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.
   * @return message
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "message represents the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.")
  public String getMessage() {
    return message;
  }

  public void setMessage(@jakarta.annotation.Nullable String message) {
    this.message = message;
  }


  public V1VolumeError time(@jakarta.annotation.Nullable OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * time represents the time the error was encountered.
   * @return time
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "time represents the time the error was encountered.")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(@jakarta.annotation.Nullable OffsetDateTime time) {
    this.time = time;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VolumeError v1VolumeError = (V1VolumeError) o;
    return Objects.equals(this.errorCode, v1VolumeError.errorCode) &&
        Objects.equals(this.message, v1VolumeError.message) &&
        Objects.equals(this.time, v1VolumeError.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeError {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
    openapiFields.add("errorCode");
    openapiFields.add("message");
    openapiFields.add("time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1VolumeError
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1VolumeError.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1VolumeError is not found in the empty JSON string", V1VolumeError.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1VolumeError.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1VolumeError` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1VolumeError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1VolumeError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1VolumeError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1VolumeError.class));

       return (TypeAdapter<T>) new TypeAdapter<V1VolumeError>() {
           @Override
           public void write(JsonWriter out, V1VolumeError value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1VolumeError read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1VolumeError given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1VolumeError
   * @throws IOException if the JSON string is invalid with respect to V1VolumeError
   */
  public static V1VolumeError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1VolumeError.class);
  }

  /**
   * Convert an instance of V1VolumeError to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
