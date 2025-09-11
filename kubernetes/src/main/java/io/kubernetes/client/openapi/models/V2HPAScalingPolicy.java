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
 * HPAScalingPolicy is a single policy which must hold true for a specified past interval.
 */
@ApiModel(description = "HPAScalingPolicy is a single policy which must hold true for a specified past interval.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V2HPAScalingPolicy {
  public static final String SERIALIZED_NAME_PERIOD_SECONDS = "periodSeconds";
  @SerializedName(SERIALIZED_NAME_PERIOD_SECONDS)
  @jakarta.annotation.Nonnull
  private Integer periodSeconds;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @jakarta.annotation.Nonnull
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @jakarta.annotation.Nonnull
  private Integer value;

  public V2HPAScalingPolicy() {
  }

  public V2HPAScalingPolicy periodSeconds(@jakarta.annotation.Nonnull Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
    return this;
  }

  /**
   * periodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).
   * @return periodSeconds
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "periodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).")
  public Integer getPeriodSeconds() {
    return periodSeconds;
  }

  public void setPeriodSeconds(@jakarta.annotation.Nonnull Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
  }


  public V2HPAScalingPolicy type(@jakarta.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * type is used to specify the scaling policy.
   * @return type
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "type is used to specify the scaling policy.")
  public String getType() {
    return type;
  }

  public void setType(@jakarta.annotation.Nonnull String type) {
    this.type = type;
  }


  public V2HPAScalingPolicy value(@jakarta.annotation.Nonnull Integer value) {
    this.value = value;
    return this;
  }

  /**
   * value contains the amount of change which is permitted by the policy. It must be greater than zero
   * @return value
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "value contains the amount of change which is permitted by the policy. It must be greater than zero")
  public Integer getValue() {
    return value;
  }

  public void setValue(@jakarta.annotation.Nonnull Integer value) {
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
    V2HPAScalingPolicy v2HPAScalingPolicy = (V2HPAScalingPolicy) o;
    return Objects.equals(this.periodSeconds, v2HPAScalingPolicy.periodSeconds) &&
        Objects.equals(this.type, v2HPAScalingPolicy.type) &&
        Objects.equals(this.value, v2HPAScalingPolicy.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodSeconds, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2HPAScalingPolicy {\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("periodSeconds");
    openapiFields.add("type");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("periodSeconds");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("value");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V2HPAScalingPolicy
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V2HPAScalingPolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V2HPAScalingPolicy is not found in the empty JSON string", V2HPAScalingPolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V2HPAScalingPolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V2HPAScalingPolicy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V2HPAScalingPolicy.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V2HPAScalingPolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V2HPAScalingPolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V2HPAScalingPolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V2HPAScalingPolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<V2HPAScalingPolicy>() {
           @Override
           public void write(JsonWriter out, V2HPAScalingPolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V2HPAScalingPolicy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V2HPAScalingPolicy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V2HPAScalingPolicy
   * @throws IOException if the JSON string is invalid with respect to V2HPAScalingPolicy
   */
  public static V2HPAScalingPolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V2HPAScalingPolicy.class);
  }

  /**
   * Convert an instance of V2HPAScalingPolicy to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
