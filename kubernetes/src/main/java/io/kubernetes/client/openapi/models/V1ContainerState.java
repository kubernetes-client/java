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
import io.kubernetes.client.openapi.models.V1ContainerStateRunning;
import io.kubernetes.client.openapi.models.V1ContainerStateTerminated;
import io.kubernetes.client.openapi.models.V1ContainerStateWaiting;
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
 * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
 */
@ApiModel(description = "ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ContainerState {
  public static final String SERIALIZED_NAME_RUNNING = "running";
  @SerializedName(SERIALIZED_NAME_RUNNING)
  @jakarta.annotation.Nullable
  private V1ContainerStateRunning running;

  public static final String SERIALIZED_NAME_TERMINATED = "terminated";
  @SerializedName(SERIALIZED_NAME_TERMINATED)
  @jakarta.annotation.Nullable
  private V1ContainerStateTerminated terminated;

  public static final String SERIALIZED_NAME_WAITING = "waiting";
  @SerializedName(SERIALIZED_NAME_WAITING)
  @jakarta.annotation.Nullable
  private V1ContainerStateWaiting waiting;

  public V1ContainerState() {
  }

  public V1ContainerState running(@jakarta.annotation.Nullable V1ContainerStateRunning running) {
    this.running = running;
    return this;
  }

  /**
   * Get running
   * @return running
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ContainerStateRunning getRunning() {
    return running;
  }

  public void setRunning(@jakarta.annotation.Nullable V1ContainerStateRunning running) {
    this.running = running;
  }


  public V1ContainerState terminated(@jakarta.annotation.Nullable V1ContainerStateTerminated terminated) {
    this.terminated = terminated;
    return this;
  }

  /**
   * Get terminated
   * @return terminated
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ContainerStateTerminated getTerminated() {
    return terminated;
  }

  public void setTerminated(@jakarta.annotation.Nullable V1ContainerStateTerminated terminated) {
    this.terminated = terminated;
  }


  public V1ContainerState waiting(@jakarta.annotation.Nullable V1ContainerStateWaiting waiting) {
    this.waiting = waiting;
    return this;
  }

  /**
   * Get waiting
   * @return waiting
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ContainerStateWaiting getWaiting() {
    return waiting;
  }

  public void setWaiting(@jakarta.annotation.Nullable V1ContainerStateWaiting waiting) {
    this.waiting = waiting;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerState v1ContainerState = (V1ContainerState) o;
    return Objects.equals(this.running, v1ContainerState.running) &&
        Objects.equals(this.terminated, v1ContainerState.terminated) &&
        Objects.equals(this.waiting, v1ContainerState.waiting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(running, terminated, waiting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerState {\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    terminated: ").append(toIndentedString(terminated)).append("\n");
    sb.append("    waiting: ").append(toIndentedString(waiting)).append("\n");
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
    openapiFields.add("running");
    openapiFields.add("terminated");
    openapiFields.add("waiting");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ContainerState
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ContainerState.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ContainerState is not found in the empty JSON string", V1ContainerState.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ContainerState.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ContainerState` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `running`
      if (jsonObj.get("running") != null && !jsonObj.get("running").isJsonNull()) {
        V1ContainerStateRunning.validateJsonElement(jsonObj.get("running"));
      }
      // validate the optional field `terminated`
      if (jsonObj.get("terminated") != null && !jsonObj.get("terminated").isJsonNull()) {
        V1ContainerStateTerminated.validateJsonElement(jsonObj.get("terminated"));
      }
      // validate the optional field `waiting`
      if (jsonObj.get("waiting") != null && !jsonObj.get("waiting").isJsonNull()) {
        V1ContainerStateWaiting.validateJsonElement(jsonObj.get("waiting"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ContainerState.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ContainerState' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ContainerState> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ContainerState.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ContainerState>() {
           @Override
           public void write(JsonWriter out, V1ContainerState value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ContainerState read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ContainerState given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ContainerState
   * @throws IOException if the JSON string is invalid with respect to V1ContainerState
   */
  public static V1ContainerState fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ContainerState.class);
  }

  /**
   * Convert an instance of V1ContainerState to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
