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
 * ServerAddressByClientCIDR helps the client to determine the server address that they should use, depending on the clientCIDR that they match.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ServerAddressByClientCIDR {
  public static final String SERIALIZED_NAME_CLIENT_C_I_D_R = "clientCIDR";
  @SerializedName(SERIALIZED_NAME_CLIENT_C_I_D_R)
  private String clientCIDR;

  public static final String SERIALIZED_NAME_SERVER_ADDRESS = "serverAddress";
  @SerializedName(SERIALIZED_NAME_SERVER_ADDRESS)
  private String serverAddress;

  public V1ServerAddressByClientCIDR() {
  }

  public V1ServerAddressByClientCIDR clientCIDR(String clientCIDR) {

    this.clientCIDR = clientCIDR;
    return this;
  }

   /**
   * The CIDR with which clients can match their IP to figure out the server address that they should use.
   * @return clientCIDR
  **/
  @jakarta.annotation.Nonnull
  public String getClientCIDR() {
    return clientCIDR;
  }


  public void setClientCIDR(String clientCIDR) {
    this.clientCIDR = clientCIDR;
  }


  public V1ServerAddressByClientCIDR serverAddress(String serverAddress) {

    this.serverAddress = serverAddress;
    return this;
  }

   /**
   * Address of this server, suitable for a client that matches the above CIDR. This can be a hostname, hostname:port, IP or IP:port.
   * @return serverAddress
  **/
  @jakarta.annotation.Nonnull
  public String getServerAddress() {
    return serverAddress;
  }


  public void setServerAddress(String serverAddress) {
    this.serverAddress = serverAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ServerAddressByClientCIDR v1ServerAddressByClientCIDR = (V1ServerAddressByClientCIDR) o;
    return Objects.equals(this.clientCIDR, v1ServerAddressByClientCIDR.clientCIDR) &&
        Objects.equals(this.serverAddress, v1ServerAddressByClientCIDR.serverAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientCIDR, serverAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServerAddressByClientCIDR {\n");
    sb.append("    clientCIDR: ").append(toIndentedString(clientCIDR)).append("\n");
    sb.append("    serverAddress: ").append(toIndentedString(serverAddress)).append("\n");
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
    openapiFields.add("clientCIDR");
    openapiFields.add("serverAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("clientCIDR");
    openapiRequiredFields.add("serverAddress");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ServerAddressByClientCIDR
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ServerAddressByClientCIDR.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ServerAddressByClientCIDR is not found in the empty JSON string", V1ServerAddressByClientCIDR.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ServerAddressByClientCIDR.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ServerAddressByClientCIDR` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ServerAddressByClientCIDR.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("clientCIDR").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientCIDR` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientCIDR").toString()));
      }
      if (!jsonObj.get("serverAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ServerAddressByClientCIDR.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ServerAddressByClientCIDR' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ServerAddressByClientCIDR> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ServerAddressByClientCIDR.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ServerAddressByClientCIDR>() {
           @Override
           public void write(JsonWriter out, V1ServerAddressByClientCIDR value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ServerAddressByClientCIDR read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ServerAddressByClientCIDR given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ServerAddressByClientCIDR
  * @throws IOException if the JSON string is invalid with respect to V1ServerAddressByClientCIDR
  */
  public static V1ServerAddressByClientCIDR fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ServerAddressByClientCIDR.class);
  }

 /**
  * Convert an instance of V1ServerAddressByClientCIDR to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
