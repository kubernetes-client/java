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
import io.kubernetes.client.openapi.models.V1LifecycleHandler;
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
 * Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
 */
@ApiModel(description = "Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1Lifecycle {
  public static final String SERIALIZED_NAME_POST_START = "postStart";
  @SerializedName(SERIALIZED_NAME_POST_START)
  @jakarta.annotation.Nullable
  private V1LifecycleHandler postStart;

  public static final String SERIALIZED_NAME_PRE_STOP = "preStop";
  @SerializedName(SERIALIZED_NAME_PRE_STOP)
  @jakarta.annotation.Nullable
  private V1LifecycleHandler preStop;

  public static final String SERIALIZED_NAME_STOP_SIGNAL = "stopSignal";
  @SerializedName(SERIALIZED_NAME_STOP_SIGNAL)
  @jakarta.annotation.Nullable
  private String stopSignal;

  public V1Lifecycle() {
  }

  public V1Lifecycle postStart(@jakarta.annotation.Nullable V1LifecycleHandler postStart) {
    this.postStart = postStart;
    return this;
  }

  /**
   * Get postStart
   * @return postStart
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LifecycleHandler getPostStart() {
    return postStart;
  }

  public void setPostStart(@jakarta.annotation.Nullable V1LifecycleHandler postStart) {
    this.postStart = postStart;
  }


  public V1Lifecycle preStop(@jakarta.annotation.Nullable V1LifecycleHandler preStop) {
    this.preStop = preStop;
    return this;
  }

  /**
   * Get preStop
   * @return preStop
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LifecycleHandler getPreStop() {
    return preStop;
  }

  public void setPreStop(@jakarta.annotation.Nullable V1LifecycleHandler preStop) {
    this.preStop = preStop;
  }


  public V1Lifecycle stopSignal(@jakarta.annotation.Nullable String stopSignal) {
    this.stopSignal = stopSignal;
    return this;
  }

  /**
   * StopSignal defines which signal will be sent to a container when it is being stopped. If not specified, the default is defined by the container runtime in use. StopSignal can only be set for Pods with a non-empty .spec.os.name
   * @return stopSignal
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "StopSignal defines which signal will be sent to a container when it is being stopped. If not specified, the default is defined by the container runtime in use. StopSignal can only be set for Pods with a non-empty .spec.os.name")
  public String getStopSignal() {
    return stopSignal;
  }

  public void setStopSignal(@jakarta.annotation.Nullable String stopSignal) {
    this.stopSignal = stopSignal;
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
        Objects.equals(this.preStop, v1Lifecycle.preStop) &&
        Objects.equals(this.stopSignal, v1Lifecycle.stopSignal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postStart, preStop, stopSignal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Lifecycle {\n");
    sb.append("    postStart: ").append(toIndentedString(postStart)).append("\n");
    sb.append("    preStop: ").append(toIndentedString(preStop)).append("\n");
    sb.append("    stopSignal: ").append(toIndentedString(stopSignal)).append("\n");
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
    openapiFields.add("stopSignal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1Lifecycle
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1Lifecycle.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1Lifecycle is not found in the empty JSON string", V1Lifecycle.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1Lifecycle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1Lifecycle` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `postStart`
      if (jsonObj.get("postStart") != null && !jsonObj.get("postStart").isJsonNull()) {
        V1LifecycleHandler.validateJsonElement(jsonObj.get("postStart"));
      }
      // validate the optional field `preStop`
      if (jsonObj.get("preStop") != null && !jsonObj.get("preStop").isJsonNull()) {
        V1LifecycleHandler.validateJsonElement(jsonObj.get("preStop"));
      }
      if ((jsonObj.get("stopSignal") != null && !jsonObj.get("stopSignal").isJsonNull()) && !jsonObj.get("stopSignal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stopSignal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stopSignal").toString()));
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
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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
