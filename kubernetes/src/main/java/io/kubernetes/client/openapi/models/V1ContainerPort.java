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
 * ContainerPort represents a network port in a single container.
 */
@ApiModel(description = "ContainerPort represents a network port in a single container.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ContainerPort {
  public static final String SERIALIZED_NAME_CONTAINER_PORT = "containerPort";
  @SerializedName(SERIALIZED_NAME_CONTAINER_PORT)
  @jakarta.annotation.Nonnull
  private Integer containerPort;

  public static final String SERIALIZED_NAME_HOST_I_P = "hostIP";
  @SerializedName(SERIALIZED_NAME_HOST_I_P)
  @jakarta.annotation.Nullable
  private String hostIP;

  public static final String SERIALIZED_NAME_HOST_PORT = "hostPort";
  @SerializedName(SERIALIZED_NAME_HOST_PORT)
  @jakarta.annotation.Nullable
  private Integer hostPort;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  @jakarta.annotation.Nullable
  private String protocol;

  public V1ContainerPort() {
  }

  public V1ContainerPort containerPort(@jakarta.annotation.Nonnull Integer containerPort) {
    this.containerPort = containerPort;
    return this;
  }

  /**
   * Number of port to expose on the pod&#39;s IP address. This must be a valid port number, 0 &lt; x &lt; 65536.
   * @return containerPort
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536.")
  public Integer getContainerPort() {
    return containerPort;
  }

  public void setContainerPort(@jakarta.annotation.Nonnull Integer containerPort) {
    this.containerPort = containerPort;
  }


  public V1ContainerPort hostIP(@jakarta.annotation.Nullable String hostIP) {
    this.hostIP = hostIP;
    return this;
  }

  /**
   * What host IP to bind the external port to.
   * @return hostIP
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "What host IP to bind the external port to.")
  public String getHostIP() {
    return hostIP;
  }

  public void setHostIP(@jakarta.annotation.Nullable String hostIP) {
    this.hostIP = hostIP;
  }


  public V1ContainerPort hostPort(@jakarta.annotation.Nullable Integer hostPort) {
    this.hostPort = hostPort;
    return this;
  }

  /**
   * Number of port to expose on the host. If specified, this must be a valid port number, 0 &lt; x &lt; 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
   * @return hostPort
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Number of port to expose on the host. If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.")
  public Integer getHostPort() {
    return hostPort;
  }

  public void setHostPort(@jakarta.annotation.Nullable Integer hostPort) {
    this.hostPort = hostPort;
  }


  public V1ContainerPort name(@jakarta.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
   * @return name
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nullable String name) {
    this.name = name;
  }


  public V1ContainerPort protocol(@jakarta.annotation.Nullable String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to \&quot;TCP\&quot;.
   * @return protocol
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Protocol for port. Must be UDP, TCP, or SCTP. Defaults to \"TCP\".")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(@jakarta.annotation.Nullable String protocol) {
    this.protocol = protocol;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerPort v1ContainerPort = (V1ContainerPort) o;
    return Objects.equals(this.containerPort, v1ContainerPort.containerPort) &&
        Objects.equals(this.hostIP, v1ContainerPort.hostIP) &&
        Objects.equals(this.hostPort, v1ContainerPort.hostPort) &&
        Objects.equals(this.name, v1ContainerPort.name) &&
        Objects.equals(this.protocol, v1ContainerPort.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerPort, hostIP, hostPort, name, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerPort {\n");
    sb.append("    containerPort: ").append(toIndentedString(containerPort)).append("\n");
    sb.append("    hostIP: ").append(toIndentedString(hostIP)).append("\n");
    sb.append("    hostPort: ").append(toIndentedString(hostPort)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
    openapiFields.add("containerPort");
    openapiFields.add("hostIP");
    openapiFields.add("hostPort");
    openapiFields.add("name");
    openapiFields.add("protocol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("containerPort");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ContainerPort
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ContainerPort.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ContainerPort is not found in the empty JSON string", V1ContainerPort.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ContainerPort.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ContainerPort` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ContainerPort.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("hostIP") != null && !jsonObj.get("hostIP").isJsonNull()) && !jsonObj.get("hostIP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostIP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostIP").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("protocol") != null && !jsonObj.get("protocol").isJsonNull()) && !jsonObj.get("protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protocol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ContainerPort.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ContainerPort' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ContainerPort> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ContainerPort.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ContainerPort>() {
           @Override
           public void write(JsonWriter out, V1ContainerPort value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ContainerPort read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ContainerPort given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ContainerPort
   * @throws IOException if the JSON string is invalid with respect to V1ContainerPort
   */
  public static V1ContainerPort fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ContainerPort.class);
  }

  /**
   * Convert an instance of V1ContainerPort to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
