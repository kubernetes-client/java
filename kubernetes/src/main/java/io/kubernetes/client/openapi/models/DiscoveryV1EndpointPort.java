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
 * EndpointPort represents a Port used by an EndpointSlice
 */
@ApiModel(description = "EndpointPort represents a Port used by an EndpointSlice")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class DiscoveryV1EndpointPort {
  public static final String SERIALIZED_NAME_APP_PROTOCOL = "appProtocol";
  @SerializedName(SERIALIZED_NAME_APP_PROTOCOL)
  @jakarta.annotation.Nullable
  private String appProtocol;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  @jakarta.annotation.Nullable
  private Integer port;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  @jakarta.annotation.Nullable
  private String protocol;

  public DiscoveryV1EndpointPort() {
  }

  public DiscoveryV1EndpointPort appProtocol(@jakarta.annotation.Nullable String appProtocol) {
    this.appProtocol = appProtocol;
    return this;
  }

  /**
   * The application protocol for this port. This is used as a hint for implementations to offer richer behavior for protocols that they understand. This field follows standard Kubernetes label syntax. Valid values are either:  * Un-prefixed protocol names - reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names).  * Kubernetes-defined prefixed names:   * &#39;kubernetes.io/h2c&#39; - HTTP/2 prior knowledge over cleartext as described in https://www.rfc-editor.org/rfc/rfc9113.html#name-starting-http-2-with-prior-   * &#39;kubernetes.io/ws&#39;  - WebSocket over cleartext as described in https://www.rfc-editor.org/rfc/rfc6455   * &#39;kubernetes.io/wss&#39; - WebSocket over TLS as described in https://www.rfc-editor.org/rfc/rfc6455  * Other protocols should use implementation-defined prefixed names such as mycompany.com/my-custom-protocol.
   * @return appProtocol
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The application protocol for this port. This is used as a hint for implementations to offer richer behavior for protocols that they understand. This field follows standard Kubernetes label syntax. Valid values are either:  * Un-prefixed protocol names - reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names).  * Kubernetes-defined prefixed names:   * 'kubernetes.io/h2c' - HTTP/2 prior knowledge over cleartext as described in https://www.rfc-editor.org/rfc/rfc9113.html#name-starting-http-2-with-prior-   * 'kubernetes.io/ws'  - WebSocket over cleartext as described in https://www.rfc-editor.org/rfc/rfc6455   * 'kubernetes.io/wss' - WebSocket over TLS as described in https://www.rfc-editor.org/rfc/rfc6455  * Other protocols should use implementation-defined prefixed names such as mycompany.com/my-custom-protocol.")
  public String getAppProtocol() {
    return appProtocol;
  }

  public void setAppProtocol(@jakarta.annotation.Nullable String appProtocol) {
    this.appProtocol = appProtocol;
  }


  public DiscoveryV1EndpointPort name(@jakarta.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * name represents the name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is derived from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or &#39;-&#39;. * must start and end with an alphanumeric character. Default is empty string.
   * @return name
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "name represents the name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is derived from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or '-'. * must start and end with an alphanumeric character. Default is empty string.")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nullable String name) {
    this.name = name;
  }


  public DiscoveryV1EndpointPort port(@jakarta.annotation.Nullable Integer port) {
    this.port = port;
    return this;
  }

  /**
   * port represents the port number of the endpoint. If the EndpointSlice is derived from a Kubernetes service, this must be set to the service&#39;s target port. EndpointSlices used for other purposes may have a nil port.
   * @return port
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "port represents the port number of the endpoint. If the EndpointSlice is derived from a Kubernetes service, this must be set to the service's target port. EndpointSlices used for other purposes may have a nil port.")
  public Integer getPort() {
    return port;
  }

  public void setPort(@jakarta.annotation.Nullable Integer port) {
    this.port = port;
  }


  public DiscoveryV1EndpointPort protocol(@jakarta.annotation.Nullable String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * protocol represents the IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
   * @return protocol
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "protocol represents the IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.")
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
    DiscoveryV1EndpointPort discoveryV1EndpointPort = (DiscoveryV1EndpointPort) o;
    return Objects.equals(this.appProtocol, discoveryV1EndpointPort.appProtocol) &&
        Objects.equals(this.name, discoveryV1EndpointPort.name) &&
        Objects.equals(this.port, discoveryV1EndpointPort.port) &&
        Objects.equals(this.protocol, discoveryV1EndpointPort.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appProtocol, name, port, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscoveryV1EndpointPort {\n");
    sb.append("    appProtocol: ").append(toIndentedString(appProtocol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
    openapiFields.add("appProtocol");
    openapiFields.add("name");
    openapiFields.add("port");
    openapiFields.add("protocol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DiscoveryV1EndpointPort
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DiscoveryV1EndpointPort.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DiscoveryV1EndpointPort is not found in the empty JSON string", DiscoveryV1EndpointPort.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DiscoveryV1EndpointPort.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DiscoveryV1EndpointPort` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("appProtocol") != null && !jsonObj.get("appProtocol").isJsonNull()) && !jsonObj.get("appProtocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appProtocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appProtocol").toString()));
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
       if (!DiscoveryV1EndpointPort.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiscoveryV1EndpointPort' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiscoveryV1EndpointPort> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiscoveryV1EndpointPort.class));

       return (TypeAdapter<T>) new TypeAdapter<DiscoveryV1EndpointPort>() {
           @Override
           public void write(JsonWriter out, DiscoveryV1EndpointPort value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiscoveryV1EndpointPort read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DiscoveryV1EndpointPort given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DiscoveryV1EndpointPort
   * @throws IOException if the JSON string is invalid with respect to DiscoveryV1EndpointPort
   */
  public static DiscoveryV1EndpointPort fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiscoveryV1EndpointPort.class);
  }

  /**
   * Convert an instance of DiscoveryV1EndpointPort to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
