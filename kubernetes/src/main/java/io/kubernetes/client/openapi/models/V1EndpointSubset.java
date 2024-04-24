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
import io.kubernetes.client.openapi.models.CoreV1EndpointPort;
import io.kubernetes.client.openapi.models.V1EndpointAddress;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * EndpointSubset is a group of addresses with a common set of ports. The expanded set of endpoints is the Cartesian product of Addresses x Ports. For example, given:   {    Addresses: [{\&quot;ip\&quot;: \&quot;10.10.1.1\&quot;}, {\&quot;ip\&quot;: \&quot;10.10.2.2\&quot;}],    Ports:     [{\&quot;name\&quot;: \&quot;a\&quot;, \&quot;port\&quot;: 8675}, {\&quot;name\&quot;: \&quot;b\&quot;, \&quot;port\&quot;: 309}]  }  The resulting set of endpoints can be viewed as:   a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],  b: [ 10.10.1.1:309, 10.10.2.2:309 ]
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1EndpointSubset {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<V1EndpointAddress> addresses;

  public static final String SERIALIZED_NAME_NOT_READY_ADDRESSES = "notReadyAddresses";
  @SerializedName(SERIALIZED_NAME_NOT_READY_ADDRESSES)
  private List<V1EndpointAddress> notReadyAddresses;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<CoreV1EndpointPort> ports;

  public V1EndpointSubset() {
  }

  public V1EndpointSubset addresses(List<V1EndpointAddress> addresses) {

    this.addresses = addresses;
    return this;
  }

  public V1EndpointSubset addAddressesItem(V1EndpointAddress addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
   * @return addresses
  **/
  @jakarta.annotation.Nullable
  public List<V1EndpointAddress> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<V1EndpointAddress> addresses) {
    this.addresses = addresses;
  }


  public V1EndpointSubset notReadyAddresses(List<V1EndpointAddress> notReadyAddresses) {

    this.notReadyAddresses = notReadyAddresses;
    return this;
  }

  public V1EndpointSubset addNotReadyAddressesItem(V1EndpointAddress notReadyAddressesItem) {
    if (this.notReadyAddresses == null) {
      this.notReadyAddresses = new ArrayList<>();
    }
    this.notReadyAddresses.add(notReadyAddressesItem);
    return this;
  }

   /**
   * IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
   * @return notReadyAddresses
  **/
  @jakarta.annotation.Nullable
  public List<V1EndpointAddress> getNotReadyAddresses() {
    return notReadyAddresses;
  }


  public void setNotReadyAddresses(List<V1EndpointAddress> notReadyAddresses) {
    this.notReadyAddresses = notReadyAddresses;
  }


  public V1EndpointSubset ports(List<CoreV1EndpointPort> ports) {

    this.ports = ports;
    return this;
  }

  public V1EndpointSubset addPortsItem(CoreV1EndpointPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Port numbers available on the related IP addresses.
   * @return ports
  **/
  @jakarta.annotation.Nullable
  public List<CoreV1EndpointPort> getPorts() {
    return ports;
  }


  public void setPorts(List<CoreV1EndpointPort> ports) {
    this.ports = ports;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EndpointSubset v1EndpointSubset = (V1EndpointSubset) o;
    return Objects.equals(this.addresses, v1EndpointSubset.addresses) &&
        Objects.equals(this.notReadyAddresses, v1EndpointSubset.notReadyAddresses) &&
        Objects.equals(this.ports, v1EndpointSubset.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, notReadyAddresses, ports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EndpointSubset {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    notReadyAddresses: ").append(toIndentedString(notReadyAddresses)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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
    openapiFields.add("addresses");
    openapiFields.add("notReadyAddresses");
    openapiFields.add("ports");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1EndpointSubset
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1EndpointSubset.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1EndpointSubset is not found in the empty JSON string", V1EndpointSubset.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1EndpointSubset.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1EndpointSubset` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("addresses") != null && !jsonObj.get("addresses").isJsonNull()) {
        JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
        if (jsonArrayaddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("addresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
          }

          // validate the optional field `addresses` (array)
          for (int i = 0; i < jsonArrayaddresses.size(); i++) {
            V1EndpointAddress.validateJsonObject(jsonArrayaddresses.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("notReadyAddresses") != null && !jsonObj.get("notReadyAddresses").isJsonNull()) {
        JsonArray jsonArraynotReadyAddresses = jsonObj.getAsJsonArray("notReadyAddresses");
        if (jsonArraynotReadyAddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("notReadyAddresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `notReadyAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("notReadyAddresses").toString()));
          }

          // validate the optional field `notReadyAddresses` (array)
          for (int i = 0; i < jsonArraynotReadyAddresses.size(); i++) {
            V1EndpointAddress.validateJsonObject(jsonArraynotReadyAddresses.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("ports") != null && !jsonObj.get("ports").isJsonNull()) {
        JsonArray jsonArrayports = jsonObj.getAsJsonArray("ports");
        if (jsonArrayports != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ports").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ports` to be an array in the JSON string but got `%s`", jsonObj.get("ports").toString()));
          }

          // validate the optional field `ports` (array)
          for (int i = 0; i < jsonArrayports.size(); i++) {
            CoreV1EndpointPort.validateJsonObject(jsonArrayports.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1EndpointSubset.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1EndpointSubset' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1EndpointSubset> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1EndpointSubset.class));

       return (TypeAdapter<T>) new TypeAdapter<V1EndpointSubset>() {
           @Override
           public void write(JsonWriter out, V1EndpointSubset value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1EndpointSubset read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1EndpointSubset given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1EndpointSubset
  * @throws IOException if the JSON string is invalid with respect to V1EndpointSubset
  */
  public static V1EndpointSubset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1EndpointSubset.class);
  }

 /**
  * Convert an instance of V1EndpointSubset to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
