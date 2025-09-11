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
 * The node this Taint is attached to has the \&quot;effect\&quot; on any pod that does not tolerate the Taint.
 */
@ApiModel(description = "The node this Taint is attached to has the \"effect\" on any pod that does not tolerate the Taint.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1Taint {
  public static final String SERIALIZED_NAME_EFFECT = "effect";
  @SerializedName(SERIALIZED_NAME_EFFECT)
  @jakarta.annotation.Nonnull
  private String effect;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @jakarta.annotation.Nonnull
  private String key;

  public static final String SERIALIZED_NAME_TIME_ADDED = "timeAdded";
  @SerializedName(SERIALIZED_NAME_TIME_ADDED)
  @jakarta.annotation.Nullable
  private OffsetDateTime timeAdded;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @jakarta.annotation.Nullable
  private String value;

  public V1Taint() {
  }

  public V1Taint effect(@jakarta.annotation.Nonnull String effect) {
    this.effect = effect;
    return this;
  }

  /**
   * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.
   * @return effect
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.")
  public String getEffect() {
    return effect;
  }

  public void setEffect(@jakarta.annotation.Nonnull String effect) {
    this.effect = effect;
  }


  public V1Taint key(@jakarta.annotation.Nonnull String key) {
    this.key = key;
    return this;
  }

  /**
   * Required. The taint key to be applied to a node.
   * @return key
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Required. The taint key to be applied to a node.")
  public String getKey() {
    return key;
  }

  public void setKey(@jakarta.annotation.Nonnull String key) {
    this.key = key;
  }


  public V1Taint timeAdded(@jakarta.annotation.Nullable OffsetDateTime timeAdded) {
    this.timeAdded = timeAdded;
    return this;
  }

  /**
   * TimeAdded represents the time at which the taint was added.
   * @return timeAdded
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "TimeAdded represents the time at which the taint was added.")
  public OffsetDateTime getTimeAdded() {
    return timeAdded;
  }

  public void setTimeAdded(@jakarta.annotation.Nullable OffsetDateTime timeAdded) {
    this.timeAdded = timeAdded;
  }


  public V1Taint value(@jakarta.annotation.Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * The taint value corresponding to the taint key.
   * @return value
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The taint value corresponding to the taint key.")
  public String getValue() {
    return value;
  }

  public void setValue(@jakarta.annotation.Nullable String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Taint v1Taint = (V1Taint) o;
    return Objects.equals(this.effect, v1Taint.effect) &&
        Objects.equals(this.key, v1Taint.key) &&
        Objects.equals(this.timeAdded, v1Taint.timeAdded) &&
        Objects.equals(this.value, v1Taint.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, key, timeAdded, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Taint {\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    timeAdded: ").append(toIndentedString(timeAdded)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("effect");
    openapiFields.add("key");
    openapiFields.add("timeAdded");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("effect");
    openapiRequiredFields.add("key");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1Taint
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1Taint.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1Taint is not found in the empty JSON string", V1Taint.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1Taint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1Taint` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1Taint.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("effect").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effect` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effect").toString()));
      }
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1Taint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1Taint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1Taint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1Taint.class));

       return (TypeAdapter<T>) new TypeAdapter<V1Taint>() {
           @Override
           public void write(JsonWriter out, V1Taint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1Taint read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1Taint given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1Taint
   * @throws IOException if the JSON string is invalid with respect to V1Taint
   */
  public static V1Taint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1Taint.class);
  }

  /**
   * Convert an instance of V1Taint to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
