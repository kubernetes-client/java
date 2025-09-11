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
import io.kubernetes.client.openapi.models.V1ExecAction;
import io.kubernetes.client.openapi.models.V1HTTPGetAction;
import io.kubernetes.client.openapi.models.V1SleepAction;
import io.kubernetes.client.openapi.models.V1TCPSocketAction;
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
 * LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.
 */
@ApiModel(description = "LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1LifecycleHandler {
  public static final String SERIALIZED_NAME_EXEC = "exec";
  @SerializedName(SERIALIZED_NAME_EXEC)
  @jakarta.annotation.Nullable
  private V1ExecAction exec;

  public static final String SERIALIZED_NAME_HTTP_GET = "httpGet";
  @SerializedName(SERIALIZED_NAME_HTTP_GET)
  @jakarta.annotation.Nullable
  private V1HTTPGetAction httpGet;

  public static final String SERIALIZED_NAME_SLEEP = "sleep";
  @SerializedName(SERIALIZED_NAME_SLEEP)
  @jakarta.annotation.Nullable
  private V1SleepAction sleep;

  public static final String SERIALIZED_NAME_TCP_SOCKET = "tcpSocket";
  @SerializedName(SERIALIZED_NAME_TCP_SOCKET)
  @jakarta.annotation.Nullable
  private V1TCPSocketAction tcpSocket;

  public V1LifecycleHandler() {
  }

  public V1LifecycleHandler exec(@jakarta.annotation.Nullable V1ExecAction exec) {
    this.exec = exec;
    return this;
  }

  /**
   * Get exec
   * @return exec
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ExecAction getExec() {
    return exec;
  }

  public void setExec(@jakarta.annotation.Nullable V1ExecAction exec) {
    this.exec = exec;
  }


  public V1LifecycleHandler httpGet(@jakarta.annotation.Nullable V1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
    return this;
  }

  /**
   * Get httpGet
   * @return httpGet
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1HTTPGetAction getHttpGet() {
    return httpGet;
  }

  public void setHttpGet(@jakarta.annotation.Nullable V1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
  }


  public V1LifecycleHandler sleep(@jakarta.annotation.Nullable V1SleepAction sleep) {
    this.sleep = sleep;
    return this;
  }

  /**
   * Get sleep
   * @return sleep
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1SleepAction getSleep() {
    return sleep;
  }

  public void setSleep(@jakarta.annotation.Nullable V1SleepAction sleep) {
    this.sleep = sleep;
  }


  public V1LifecycleHandler tcpSocket(@jakarta.annotation.Nullable V1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
    return this;
  }

  /**
   * Get tcpSocket
   * @return tcpSocket
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1TCPSocketAction getTcpSocket() {
    return tcpSocket;
  }

  public void setTcpSocket(@jakarta.annotation.Nullable V1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LifecycleHandler v1LifecycleHandler = (V1LifecycleHandler) o;
    return Objects.equals(this.exec, v1LifecycleHandler.exec) &&
        Objects.equals(this.httpGet, v1LifecycleHandler.httpGet) &&
        Objects.equals(this.sleep, v1LifecycleHandler.sleep) &&
        Objects.equals(this.tcpSocket, v1LifecycleHandler.tcpSocket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exec, httpGet, sleep, tcpSocket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LifecycleHandler {\n");
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
    sb.append("    sleep: ").append(toIndentedString(sleep)).append("\n");
    sb.append("    tcpSocket: ").append(toIndentedString(tcpSocket)).append("\n");
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
    openapiFields.add("exec");
    openapiFields.add("httpGet");
    openapiFields.add("sleep");
    openapiFields.add("tcpSocket");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1LifecycleHandler
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1LifecycleHandler.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1LifecycleHandler is not found in the empty JSON string", V1LifecycleHandler.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1LifecycleHandler.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1LifecycleHandler` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `exec`
      if (jsonObj.get("exec") != null && !jsonObj.get("exec").isJsonNull()) {
        V1ExecAction.validateJsonElement(jsonObj.get("exec"));
      }
      // validate the optional field `httpGet`
      if (jsonObj.get("httpGet") != null && !jsonObj.get("httpGet").isJsonNull()) {
        V1HTTPGetAction.validateJsonElement(jsonObj.get("httpGet"));
      }
      // validate the optional field `sleep`
      if (jsonObj.get("sleep") != null && !jsonObj.get("sleep").isJsonNull()) {
        V1SleepAction.validateJsonElement(jsonObj.get("sleep"));
      }
      // validate the optional field `tcpSocket`
      if (jsonObj.get("tcpSocket") != null && !jsonObj.get("tcpSocket").isJsonNull()) {
        V1TCPSocketAction.validateJsonElement(jsonObj.get("tcpSocket"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1LifecycleHandler.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1LifecycleHandler' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1LifecycleHandler> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1LifecycleHandler.class));

       return (TypeAdapter<T>) new TypeAdapter<V1LifecycleHandler>() {
           @Override
           public void write(JsonWriter out, V1LifecycleHandler value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1LifecycleHandler read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1LifecycleHandler given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1LifecycleHandler
   * @throws IOException if the JSON string is invalid with respect to V1LifecycleHandler
   */
  public static V1LifecycleHandler fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1LifecycleHandler.class);
  }

  /**
   * Convert an instance of V1LifecycleHandler to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
