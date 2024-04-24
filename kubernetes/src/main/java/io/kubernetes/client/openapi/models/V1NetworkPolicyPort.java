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
 * NetworkPolicyPort describes a port to allow traffic on
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1NetworkPolicyPort {
  public static final String SERIALIZED_NAME_END_PORT = "endPort";
  @SerializedName(SERIALIZED_NAME_END_PORT)
  private Integer endPort;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private IntOrString port;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public V1NetworkPolicyPort() {
  }

  public V1NetworkPolicyPort endPort(Integer endPort) {

    this.endPort = endPort;
    return this;
  }

   /**
   * endPort indicates that the range of ports from port to endPort if set, inclusive, should be allowed by the policy. This field cannot be defined if the port field is not defined or if the port field is defined as a named (string) port. The endPort must be equal or greater than port.
   * @return endPort
  **/
  @jakarta.annotation.Nullable
  public Integer getEndPort() {
    return endPort;
  }


  public void setEndPort(Integer endPort) {
    this.endPort = endPort;
  }


  public V1NetworkPolicyPort port(IntOrString port) {

    this.port = port;
    return this;
  }

   /**
   * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
   * @return port
  **/
  @jakarta.annotation.Nullable
  public IntOrString getPort() {
    return port;
  }


  public void setPort(IntOrString port) {
    this.port = port;
  }


  public V1NetworkPolicyPort protocol(String protocol) {

    this.protocol = protocol;
    return this;
  }

   /**
   * protocol represents the protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
   * @return protocol
  **/
  @jakarta.annotation.Nullable
  public String getProtocol() {
    return protocol;
  }


  public void setProtocol(String protocol) {
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
    V1NetworkPolicyPort v1NetworkPolicyPort = (V1NetworkPolicyPort) o;
    return Objects.equals(this.endPort, v1NetworkPolicyPort.endPort) &&
        Objects.equals(this.port, v1NetworkPolicyPort.port) &&
        Objects.equals(this.protocol, v1NetworkPolicyPort.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endPort, port, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NetworkPolicyPort {\n");
    sb.append("    endPort: ").append(toIndentedString(endPort)).append("\n");
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
    openapiFields.add("endPort");
    openapiFields.add("port");
    openapiFields.add("protocol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1NetworkPolicyPort
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1NetworkPolicyPort.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NetworkPolicyPort is not found in the empty JSON string", V1NetworkPolicyPort.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1NetworkPolicyPort.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NetworkPolicyPort` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("port") != null && !jsonObj.get("port").isJsonNull()) && !jsonObj.get("port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("port").toString()));
      }
      if ((jsonObj.get("protocol") != null && !jsonObj.get("protocol").isJsonNull()) && !jsonObj.get("protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protocol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NetworkPolicyPort.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NetworkPolicyPort' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NetworkPolicyPort> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NetworkPolicyPort.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NetworkPolicyPort>() {
           @Override
           public void write(JsonWriter out, V1NetworkPolicyPort value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NetworkPolicyPort read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1NetworkPolicyPort given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1NetworkPolicyPort
  * @throws IOException if the JSON string is invalid with respect to V1NetworkPolicyPort
  */
  public static V1NetworkPolicyPort fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NetworkPolicyPort.class);
  }

 /**
  * Convert an instance of V1NetworkPolicyPort to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
