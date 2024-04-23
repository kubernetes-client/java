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
import io.kubernetes.client.openapi.models.V1LifecycleHandler;
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
 * Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1Lifecycle {
  public static final String SERIALIZED_NAME_POST_START = "postStart";
  @SerializedName(SERIALIZED_NAME_POST_START)
  private V1LifecycleHandler postStart;

  public static final String SERIALIZED_NAME_PRE_STOP = "preStop";
  @SerializedName(SERIALIZED_NAME_PRE_STOP)
  private V1LifecycleHandler preStop;

  public V1Lifecycle() {
  }

  public V1Lifecycle postStart(V1LifecycleHandler postStart) {

    this.postStart = postStart;
    return this;
  }

   /**
   * Get postStart
   * @return postStart
  **/
  @jakarta.annotation.Nullable
  public V1LifecycleHandler getPostStart() {
    return postStart;
  }


  public void setPostStart(V1LifecycleHandler postStart) {
    this.postStart = postStart;
  }


  public V1Lifecycle preStop(V1LifecycleHandler preStop) {

    this.preStop = preStop;
    return this;
  }

   /**
   * Get preStop
   * @return preStop
  **/
  @jakarta.annotation.Nullable
  public V1LifecycleHandler getPreStop() {
    return preStop;
  }


  public void setPreStop(V1LifecycleHandler preStop) {
    this.preStop = preStop;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Lifecycle v1Lifecycle = (V1Lifecycle) o;
    return Objects.equals(this.postStart, v1Lifecycle.postStart) &&
        Objects.equals(this.preStop, v1Lifecycle.preStop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postStart, preStop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Lifecycle {\n");
    sb.append("    postStart: ").append(toIndentedString(postStart)).append("\n");
    sb.append("    preStop: ").append(toIndentedString(preStop)).append("\n");
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
    openapiFields.add("postStart");
    openapiFields.add("preStop");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1Lifecycle
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1Lifecycle.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1Lifecycle is not found in the empty JSON string", V1Lifecycle.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1Lifecycle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1Lifecycle` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `postStart`
      if (jsonObj.get("postStart") != null && !jsonObj.get("postStart").isJsonNull()) {
        V1LifecycleHandler.validateJsonObject(jsonObj.getAsJsonObject("postStart"));
      }
      // validate the optional field `preStop`
      if (jsonObj.get("preStop") != null && !jsonObj.get("preStop").isJsonNull()) {
        V1LifecycleHandler.validateJsonObject(jsonObj.getAsJsonObject("preStop"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1Lifecycle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1Lifecycle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1Lifecycle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1Lifecycle.class));

       return (TypeAdapter<T>) new TypeAdapter<V1Lifecycle>() {
           @Override
           public void write(JsonWriter out, V1Lifecycle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1Lifecycle read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1Lifecycle given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1Lifecycle
  * @throws IOException if the JSON string is invalid with respect to V1Lifecycle
  */
  public static V1Lifecycle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1Lifecycle.class);
  }

 /**
  * Convert an instance of V1Lifecycle to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
