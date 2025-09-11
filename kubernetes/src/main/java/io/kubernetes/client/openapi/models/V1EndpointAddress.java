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
import io.kubernetes.client.openapi.models.V1ObjectReference;
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
 * EndpointAddress is a tuple that describes single IP address. Deprecated: This API is deprecated in v1.33+.
 */
@ApiModel(description = "EndpointAddress is a tuple that describes single IP address. Deprecated: This API is deprecated in v1.33+.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1EndpointAddress {
  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  @jakarta.annotation.Nullable
  private String hostname;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  @jakarta.annotation.Nonnull
  private String ip;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  @jakarta.annotation.Nullable
  private String nodeName;

  public static final String SERIALIZED_NAME_TARGET_REF = "targetRef";
  @SerializedName(SERIALIZED_NAME_TARGET_REF)
  @jakarta.annotation.Nullable
  private V1ObjectReference targetRef;

  public V1EndpointAddress() {
  }

  public V1EndpointAddress hostname(@jakarta.annotation.Nullable String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * The Hostname of this endpoint
   * @return hostname
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The Hostname of this endpoint")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(@jakarta.annotation.Nullable String hostname) {
    this.hostname = hostname;
  }


  public V1EndpointAddress ip(@jakarta.annotation.Nonnull String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * The IP of this endpoint. May not be loopback (127.0.0.0/8 or ::1), link-local (169.254.0.0/16 or fe80::/10), or link-local multicast (224.0.0.0/24 or ff02::/16).
   * @return ip
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The IP of this endpoint. May not be loopback (127.0.0.0/8 or ::1), link-local (169.254.0.0/16 or fe80::/10), or link-local multicast (224.0.0.0/24 or ff02::/16).")
  public String getIp() {
    return ip;
  }

  public void setIp(@jakarta.annotation.Nonnull String ip) {
    this.ip = ip;
  }


  public V1EndpointAddress nodeName(@jakarta.annotation.Nullable String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

  /**
   * Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node.
   * @return nodeName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node.")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(@jakarta.annotation.Nullable String nodeName) {
    this.nodeName = nodeName;
  }


  public V1EndpointAddress targetRef(@jakarta.annotation.Nullable V1ObjectReference targetRef) {
    this.targetRef = targetRef;
    return this;
  }

  /**
   * Get targetRef
   * @return targetRef
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectReference getTargetRef() {
    return targetRef;
  }

  public void setTargetRef(@jakarta.annotation.Nullable V1ObjectReference targetRef) {
    this.targetRef = targetRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EndpointAddress v1EndpointAddress = (V1EndpointAddress) o;
    return Objects.equals(this.hostname, v1EndpointAddress.hostname) &&
        Objects.equals(this.ip, v1EndpointAddress.ip) &&
        Objects.equals(this.nodeName, v1EndpointAddress.nodeName) &&
        Objects.equals(this.targetRef, v1EndpointAddress.targetRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, ip, nodeName, targetRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EndpointAddress {\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    targetRef: ").append(toIndentedString(targetRef)).append("\n");
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
    openapiFields.add("hostname");
    openapiFields.add("ip");
    openapiFields.add("nodeName");
    openapiFields.add("targetRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ip");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1EndpointAddress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1EndpointAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1EndpointAddress is not found in the empty JSON string", V1EndpointAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1EndpointAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1EndpointAddress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1EndpointAddress.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      if (!jsonObj.get("ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip").toString()));
      }
      if ((jsonObj.get("nodeName") != null && !jsonObj.get("nodeName").isJsonNull()) && !jsonObj.get("nodeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeName").toString()));
      }
      // validate the optional field `targetRef`
      if (jsonObj.get("targetRef") != null && !jsonObj.get("targetRef").isJsonNull()) {
        V1ObjectReference.validateJsonElement(jsonObj.get("targetRef"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1EndpointAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1EndpointAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1EndpointAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1EndpointAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<V1EndpointAddress>() {
           @Override
           public void write(JsonWriter out, V1EndpointAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1EndpointAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1EndpointAddress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1EndpointAddress
   * @throws IOException if the JSON string is invalid with respect to V1EndpointAddress
   */
  public static V1EndpointAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1EndpointAddress.class);
  }

  /**
   * Convert an instance of V1EndpointAddress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
