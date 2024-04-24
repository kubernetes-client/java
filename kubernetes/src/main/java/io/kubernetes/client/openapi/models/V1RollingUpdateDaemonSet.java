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
import io.kubernetes.client.custom.IntOrString;
import java.io.IOException;

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
 * Spec to control the desired behavior of daemon set rolling update.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1RollingUpdateDaemonSet {
  public static final String SERIALIZED_NAME_MAX_SURGE = "maxSurge";
  @SerializedName(SERIALIZED_NAME_MAX_SURGE)
  private IntOrString maxSurge;

  public static final String SERIALIZED_NAME_MAX_UNAVAILABLE = "maxUnavailable";
  @SerializedName(SERIALIZED_NAME_MAX_UNAVAILABLE)
  private IntOrString maxUnavailable;

  public V1RollingUpdateDaemonSet() {
  }

  public V1RollingUpdateDaemonSet maxSurge(IntOrString maxSurge) {

    this.maxSurge = maxSurge;
    return this;
  }

   /**
   * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
   * @return maxSurge
  **/
  @jakarta.annotation.Nullable
  public IntOrString getMaxSurge() {
    return maxSurge;
  }


  public void setMaxSurge(IntOrString maxSurge) {
    this.maxSurge = maxSurge;
  }


  public V1RollingUpdateDaemonSet maxUnavailable(IntOrString maxUnavailable) {

    this.maxUnavailable = maxUnavailable;
    return this;
  }

   /**
   * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
   * @return maxUnavailable
  **/
  @jakarta.annotation.Nullable
  public IntOrString getMaxUnavailable() {
    return maxUnavailable;
  }


  public void setMaxUnavailable(IntOrString maxUnavailable) {
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
    V1RollingUpdateDaemonSet v1RollingUpdateDaemonSet = (V1RollingUpdateDaemonSet) o;
    return Objects.equals(this.maxSurge, v1RollingUpdateDaemonSet.maxSurge) &&
        Objects.equals(this.maxUnavailable, v1RollingUpdateDaemonSet.maxUnavailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSurge, maxUnavailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RollingUpdateDaemonSet {\n");
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1RollingUpdateDaemonSet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1RollingUpdateDaemonSet.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1RollingUpdateDaemonSet is not found in the empty JSON string", V1RollingUpdateDaemonSet.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1RollingUpdateDaemonSet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1RollingUpdateDaemonSet` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
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
       if (!V1RollingUpdateDaemonSet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1RollingUpdateDaemonSet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1RollingUpdateDaemonSet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1RollingUpdateDaemonSet.class));

       return (TypeAdapter<T>) new TypeAdapter<V1RollingUpdateDaemonSet>() {
           @Override
           public void write(JsonWriter out, V1RollingUpdateDaemonSet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1RollingUpdateDaemonSet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1RollingUpdateDaemonSet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1RollingUpdateDaemonSet
  * @throws IOException if the JSON string is invalid with respect to V1RollingUpdateDaemonSet
  */
  public static V1RollingUpdateDaemonSet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1RollingUpdateDaemonSet.class);
  }

 /**
  * Convert an instance of V1RollingUpdateDaemonSet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
