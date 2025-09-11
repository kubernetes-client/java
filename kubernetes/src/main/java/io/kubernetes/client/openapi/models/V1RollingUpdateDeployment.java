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
import io.kubernetes.client.custom.IntOrString;
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
 * Spec to control the desired behavior of rolling update.
 */
@ApiModel(description = "Spec to control the desired behavior of rolling update.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1RollingUpdateDeployment {
  public static final String SERIALIZED_NAME_MAX_SURGE = "maxSurge";
  @SerializedName(SERIALIZED_NAME_MAX_SURGE)
  @jakarta.annotation.Nullable
  private IntOrString maxSurge;

  public static final String SERIALIZED_NAME_MAX_UNAVAILABLE = "maxUnavailable";
  @SerializedName(SERIALIZED_NAME_MAX_UNAVAILABLE)
  @jakarta.annotation.Nullable
  private IntOrString maxUnavailable;

  public V1RollingUpdateDeployment() {
  }

  public V1RollingUpdateDeployment maxSurge(@jakarta.annotation.Nullable IntOrString maxSurge) {
    this.maxSurge = maxSurge;
    return this;
  }

  /**
   * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
   * @return maxSurge
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.")
  public IntOrString getMaxSurge() {
    return maxSurge;
  }

  public void setMaxSurge(@jakarta.annotation.Nullable IntOrString maxSurge) {
    this.maxSurge = maxSurge;
  }


  public V1RollingUpdateDeployment maxUnavailable(@jakarta.annotation.Nullable IntOrString maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return this;
  }

  /**
   * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
   * @return maxUnavailable
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.")
  public IntOrString getMaxUnavailable() {
    return maxUnavailable;
  }

  public void setMaxUnavailable(@jakarta.annotation.Nullable IntOrString maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1RollingUpdateDeployment v1RollingUpdateDeployment = (V1RollingUpdateDeployment) o;
    return Objects.equals(this.maxSurge, v1RollingUpdateDeployment.maxSurge) &&
        Objects.equals(this.maxUnavailable, v1RollingUpdateDeployment.maxUnavailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSurge, maxUnavailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RollingUpdateDeployment {\n");
    sb.append("    maxSurge: ").append(toIndentedString(maxSurge)).append("\n");
    sb.append("    maxUnavailable: ").append(toIndentedString(maxUnavailable)).append("\n");
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
    openapiFields.add("maxSurge");
    openapiFields.add("maxUnavailable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1RollingUpdateDeployment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1RollingUpdateDeployment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1RollingUpdateDeployment is not found in the empty JSON string", V1RollingUpdateDeployment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1RollingUpdateDeployment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1RollingUpdateDeployment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("maxSurge") != null && !jsonObj.get("maxSurge").isJsonNull()) && !jsonObj.get("maxSurge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxSurge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxSurge").toString()));
      }
      if ((jsonObj.get("maxUnavailable") != null && !jsonObj.get("maxUnavailable").isJsonNull()) && !jsonObj.get("maxUnavailable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxUnavailable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxUnavailable").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1RollingUpdateDeployment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1RollingUpdateDeployment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1RollingUpdateDeployment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1RollingUpdateDeployment.class));

       return (TypeAdapter<T>) new TypeAdapter<V1RollingUpdateDeployment>() {
           @Override
           public void write(JsonWriter out, V1RollingUpdateDeployment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1RollingUpdateDeployment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1RollingUpdateDeployment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1RollingUpdateDeployment
   * @throws IOException if the JSON string is invalid with respect to V1RollingUpdateDeployment
   */
  public static V1RollingUpdateDeployment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1RollingUpdateDeployment.class);
  }

  /**
   * Convert an instance of V1RollingUpdateDeployment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
