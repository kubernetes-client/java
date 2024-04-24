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
import io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet;
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
 * DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1DaemonSetUpdateStrategy {
  public static final String SERIALIZED_NAME_ROLLING_UPDATE = "rollingUpdate";
  @SerializedName(SERIALIZED_NAME_ROLLING_UPDATE)
  private V1RollingUpdateDaemonSet rollingUpdate;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1DaemonSetUpdateStrategy() {
  }

  public V1DaemonSetUpdateStrategy rollingUpdate(V1RollingUpdateDaemonSet rollingUpdate) {

    this.rollingUpdate = rollingUpdate;
    return this;
  }

   /**
   * Get rollingUpdate
   * @return rollingUpdate
  **/
  @jakarta.annotation.Nullable
  public V1RollingUpdateDaemonSet getRollingUpdate() {
    return rollingUpdate;
  }


  public void setRollingUpdate(V1RollingUpdateDaemonSet rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
  }


  public V1DaemonSetUpdateStrategy type(String type) {

    this.type = type;
    return this;
  }

   /**
   * Type of daemon set update. Can be \&quot;RollingUpdate\&quot; or \&quot;OnDelete\&quot;. Default is RollingUpdate.
   * @return type
  **/
  @jakarta.annotation.Nullable
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
    V1DaemonSetUpdateStrategy v1DaemonSetUpdateStrategy = (V1DaemonSetUpdateStrategy) o;
    return Objects.equals(this.rollingUpdate, v1DaemonSetUpdateStrategy.rollingUpdate) &&
        Objects.equals(this.type, v1DaemonSetUpdateStrategy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rollingUpdate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DaemonSetUpdateStrategy {\n");
    sb.append("    rollingUpdate: ").append(toIndentedString(rollingUpdate)).append("\n");
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
    openapiFields.add("rollingUpdate");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1DaemonSetUpdateStrategy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1DaemonSetUpdateStrategy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1DaemonSetUpdateStrategy is not found in the empty JSON string", V1DaemonSetUpdateStrategy.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1DaemonSetUpdateStrategy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1DaemonSetUpdateStrategy` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `rollingUpdate`
      if (jsonObj.get("rollingUpdate") != null && !jsonObj.get("rollingUpdate").isJsonNull()) {
        V1RollingUpdateDaemonSet.validateJsonObject(jsonObj.getAsJsonObject("rollingUpdate"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1DaemonSetUpdateStrategy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1DaemonSetUpdateStrategy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1DaemonSetUpdateStrategy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1DaemonSetUpdateStrategy.class));

       return (TypeAdapter<T>) new TypeAdapter<V1DaemonSetUpdateStrategy>() {
           @Override
           public void write(JsonWriter out, V1DaemonSetUpdateStrategy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1DaemonSetUpdateStrategy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1DaemonSetUpdateStrategy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1DaemonSetUpdateStrategy
  * @throws IOException if the JSON string is invalid with respect to V1DaemonSetUpdateStrategy
  */
  public static V1DaemonSetUpdateStrategy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1DaemonSetUpdateStrategy.class);
  }

 /**
  * Convert an instance of V1DaemonSetUpdateStrategy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
