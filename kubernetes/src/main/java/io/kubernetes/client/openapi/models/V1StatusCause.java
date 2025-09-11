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
 * StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.
 */
@ApiModel(description = "StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1StatusCause {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  @jakarta.annotation.Nullable
  private String field;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @jakarta.annotation.Nullable
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  @jakarta.annotation.Nullable
  private String reason;

  public V1StatusCause() {
  }

  public V1StatusCause field(@jakarta.annotation.Nullable String field) {
    this.field = field;
    return this;
  }

  /**
   * The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.  Examples:   \&quot;name\&quot; - the field \&quot;name\&quot; on the current resource   \&quot;items[0].name\&quot; - the field \&quot;name\&quot; on the first array entry in \&quot;items\&quot;
   * @return field
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.  Examples:   \"name\" - the field \"name\" on the current resource   \"items[0].name\" - the field \"name\" on the first array entry in \"items\"")
  public String getField() {
    return field;
  }

  public void setField(@jakarta.annotation.Nullable String field) {
    this.field = field;
  }


  public V1StatusCause message(@jakarta.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
   * @return message
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A human-readable description of the cause of the error.  This field may be presented as-is to a reader.")
  public String getMessage() {
    return message;
  }

  public void setMessage(@jakarta.annotation.Nullable String message) {
    this.message = message;
  }


  public V1StatusCause reason(@jakarta.annotation.Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * A machine-readable description of the cause of the error. If this value is empty there is no information available.
   * @return reason
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A machine-readable description of the cause of the error. If this value is empty there is no information available.")
  public String getReason() {
    return reason;
  }

  public void setReason(@jakarta.annotation.Nullable String reason) {
    this.reason = reason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1StatusCause v1StatusCause = (V1StatusCause) o;
    return Objects.equals(this.field, v1StatusCause.field) &&
        Objects.equals(this.message, v1StatusCause.message) &&
        Objects.equals(this.reason, v1StatusCause.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, message, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1StatusCause {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
    openapiFields.add("field");
    openapiFields.add("message");
    openapiFields.add("reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1StatusCause
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1StatusCause.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1StatusCause is not found in the empty JSON string", V1StatusCause.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1StatusCause.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1StatusCause` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("field") != null && !jsonObj.get("field").isJsonNull()) && !jsonObj.get("field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1StatusCause.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1StatusCause' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1StatusCause> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1StatusCause.class));

       return (TypeAdapter<T>) new TypeAdapter<V1StatusCause>() {
           @Override
           public void write(JsonWriter out, V1StatusCause value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1StatusCause read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1StatusCause given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1StatusCause
   * @throws IOException if the JSON string is invalid with respect to V1StatusCause
   */
  public static V1StatusCause fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1StatusCause.class);
  }

  /**
   * Convert an instance of V1StatusCause to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
