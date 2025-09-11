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
 * IngressPortStatus represents the error condition of a service port
 */
@ApiModel(description = "IngressPortStatus represents the error condition of a service port")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1IngressPortStatus {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  @jakarta.annotation.Nullable
  private String error;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  @jakarta.annotation.Nonnull
  private Integer port;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  @jakarta.annotation.Nonnull
  private String protocol;

  public V1IngressPortStatus() {
  }

  public V1IngressPortStatus error(@jakarta.annotation.Nullable String error) {
    this.error = error;
    return this;
  }

  /**
   * error is to record the problem with the service port The format of the error shall comply with the following rules: - built-in error values shall be specified in this file and those shall use   CamelCase names - cloud provider specific error values must have names that comply with the   format foo.example.com/CamelCase.
   * @return error
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "error is to record the problem with the service port The format of the error shall comply with the following rules: - built-in error values shall be specified in this file and those shall use   CamelCase names - cloud provider specific error values must have names that comply with the   format foo.example.com/CamelCase.")
  public String getError() {
    return error;
  }

  public void setError(@jakarta.annotation.Nullable String error) {
    this.error = error;
  }


  public V1IngressPortStatus port(@jakarta.annotation.Nonnull Integer port) {
    this.port = port;
    return this;
  }

  /**
   * port is the port number of the ingress port.
   * @return port
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "port is the port number of the ingress port.")
  public Integer getPort() {
    return port;
  }

  public void setPort(@jakarta.annotation.Nonnull Integer port) {
    this.port = port;
  }


  public V1IngressPortStatus protocol(@jakarta.annotation.Nonnull String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * protocol is the protocol of the ingress port. The supported values are: \&quot;TCP\&quot;, \&quot;UDP\&quot;, \&quot;SCTP\&quot;
   * @return protocol
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "protocol is the protocol of the ingress port. The supported values are: \"TCP\", \"UDP\", \"SCTP\"")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(@jakarta.annotation.Nonnull String protocol) {
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
    V1IngressPortStatus v1IngressPortStatus = (V1IngressPortStatus) o;
    return Objects.equals(this.error, v1IngressPortStatus.error) &&
        Objects.equals(this.port, v1IngressPortStatus.port) &&
        Objects.equals(this.protocol, v1IngressPortStatus.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, port, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1IngressPortStatus {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
    openapiFields.add("error");
    openapiFields.add("port");
    openapiFields.add("protocol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("port");
    openapiRequiredFields.add("protocol");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1IngressPortStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1IngressPortStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1IngressPortStatus is not found in the empty JSON string", V1IngressPortStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1IngressPortStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1IngressPortStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1IngressPortStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      if (!jsonObj.get("protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protocol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1IngressPortStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1IngressPortStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1IngressPortStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1IngressPortStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1IngressPortStatus>() {
           @Override
           public void write(JsonWriter out, V1IngressPortStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1IngressPortStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1IngressPortStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1IngressPortStatus
   * @throws IOException if the JSON string is invalid with respect to V1IngressPortStatus
   */
  public static V1IngressPortStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1IngressPortStatus.class);
  }

  /**
   * Convert an instance of V1IngressPortStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
