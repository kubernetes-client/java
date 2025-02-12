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
import java.util.ArrayList;
import java.util.Arrays;
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
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * NetworkDeviceData provides network-related details for the allocated device. This information may be filled by drivers or other components to configure or identify the device within a network context.
 */
@ApiModel(description = "NetworkDeviceData provides network-related details for the allocated device. This information may be filled by drivers or other components to configure or identify the device within a network context.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T21:15:49.397498Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha3NetworkDeviceData {
  public static final String SERIALIZED_NAME_HARDWARE_ADDRESS = "hardwareAddress";
  @SerializedName(SERIALIZED_NAME_HARDWARE_ADDRESS)
  private String hardwareAddress;

  public static final String SERIALIZED_NAME_INTERFACE_NAME = "interfaceName";
  @SerializedName(SERIALIZED_NAME_INTERFACE_NAME)
  private String interfaceName;

  public static final String SERIALIZED_NAME_IPS = "ips";
  @SerializedName(SERIALIZED_NAME_IPS)
  private List<String> ips = new ArrayList<>();

  public V1alpha3NetworkDeviceData() {
  }

  public V1alpha3NetworkDeviceData hardwareAddress(String hardwareAddress) {
    this.hardwareAddress = hardwareAddress;
    return this;
  }

   /**
   * HardwareAddress represents the hardware address (e.g. MAC Address) of the device&#39;s network interface.  Must not be longer than 128 characters.
   * @return hardwareAddress
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "HardwareAddress represents the hardware address (e.g. MAC Address) of the device's network interface.  Must not be longer than 128 characters.")
  public String getHardwareAddress() {
    return hardwareAddress;
  }

  public void setHardwareAddress(String hardwareAddress) {
    this.hardwareAddress = hardwareAddress;
  }


  public V1alpha3NetworkDeviceData interfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
    return this;
  }

   /**
   * InterfaceName specifies the name of the network interface associated with the allocated device. This might be the name of a physical or virtual network interface being configured in the pod.  Must not be longer than 256 characters.
   * @return interfaceName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "InterfaceName specifies the name of the network interface associated with the allocated device. This might be the name of a physical or virtual network interface being configured in the pod.  Must not be longer than 256 characters.")
  public String getInterfaceName() {
    return interfaceName;
  }

  public void setInterfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
  }


  public V1alpha3NetworkDeviceData ips(List<String> ips) {
    this.ips = ips;
    return this;
  }

  public V1alpha3NetworkDeviceData addIpsItem(String ipsItem) {
    if (this.ips == null) {
      this.ips = new ArrayList<>();
    }
    this.ips.add(ipsItem);
    return this;
  }

   /**
   * IPs lists the network addresses assigned to the device&#39;s network interface. This can include both IPv4 and IPv6 addresses. The IPs are in the CIDR notation, which includes both the address and the associated subnet mask. e.g.: \&quot;192.0.2.5/24\&quot; for IPv4 and \&quot;2001:db8::5/64\&quot; for IPv6.
   * @return ips
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "IPs lists the network addresses assigned to the device's network interface. This can include both IPv4 and IPv6 addresses. The IPs are in the CIDR notation, which includes both the address and the associated subnet mask. e.g.: \"192.0.2.5/24\" for IPv4 and \"2001:db8::5/64\" for IPv6.")
  public List<String> getIps() {
    return ips;
  }

  public void setIps(List<String> ips) {
    this.ips = ips;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3NetworkDeviceData v1alpha3NetworkDeviceData = (V1alpha3NetworkDeviceData) o;
    return Objects.equals(this.hardwareAddress, v1alpha3NetworkDeviceData.hardwareAddress) &&
        Objects.equals(this.interfaceName, v1alpha3NetworkDeviceData.interfaceName) &&
        Objects.equals(this.ips, v1alpha3NetworkDeviceData.ips);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hardwareAddress, interfaceName, ips);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3NetworkDeviceData {\n");
    sb.append("    hardwareAddress: ").append(toIndentedString(hardwareAddress)).append("\n");
    sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
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
    openapiFields.add("hardwareAddress");
    openapiFields.add("interfaceName");
    openapiFields.add("ips");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha3NetworkDeviceData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3NetworkDeviceData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha3NetworkDeviceData is not found in the empty JSON string", V1alpha3NetworkDeviceData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3NetworkDeviceData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha3NetworkDeviceData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("hardwareAddress") != null && !jsonObj.get("hardwareAddress").isJsonNull()) && !jsonObj.get("hardwareAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hardwareAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hardwareAddress").toString()));
      }
      if ((jsonObj.get("interfaceName") != null && !jsonObj.get("interfaceName").isJsonNull()) && !jsonObj.get("interfaceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interfaceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interfaceName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ips") != null && !jsonObj.get("ips").isJsonNull() && !jsonObj.get("ips").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ips` to be an array in the JSON string but got `%s`", jsonObj.get("ips").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha3NetworkDeviceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3NetworkDeviceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3NetworkDeviceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3NetworkDeviceData.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3NetworkDeviceData>() {
           @Override
           public void write(JsonWriter out, V1alpha3NetworkDeviceData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3NetworkDeviceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha3NetworkDeviceData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha3NetworkDeviceData
  * @throws IOException if the JSON string is invalid with respect to V1alpha3NetworkDeviceData
  */
  public static V1alpha3NetworkDeviceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3NetworkDeviceData.class);
  }

 /**
  * Convert an instance of V1alpha3NetworkDeviceData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
