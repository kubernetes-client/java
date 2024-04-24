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
import io.kubernetes.client.openapi.models.V1PortStatus;
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
 * LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for the service should be sent to an ingress point.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1LoadBalancerIngress {
  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_IP_MODE = "ipMode";
  @SerializedName(SERIALIZED_NAME_IP_MODE)
  private String ipMode;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<V1PortStatus> ports;

  public V1LoadBalancerIngress() {
  }

  public V1LoadBalancerIngress hostname(String hostname) {

    this.hostname = hostname;
    return this;
  }

   /**
   * Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers)
   * @return hostname
  **/
  @jakarta.annotation.Nullable
  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public V1LoadBalancerIngress ip(String ip) {

    this.ip = ip;
    return this;
  }

   /**
   * IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers)
   * @return ip
  **/
  @jakarta.annotation.Nullable
  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }


  public V1LoadBalancerIngress ipMode(String ipMode) {

    this.ipMode = ipMode;
    return this;
  }

   /**
   * IPMode specifies how the load-balancer IP behaves, and may only be specified when the ip field is specified. Setting this to \&quot;VIP\&quot; indicates that traffic is delivered to the node with the destination set to the load-balancer&#39;s IP and port. Setting this to \&quot;Proxy\&quot; indicates that traffic is delivered to the node or pod with the destination set to the node&#39;s IP and node port or the pod&#39;s IP and port. Service implementations may use this information to adjust traffic routing.
   * @return ipMode
  **/
  @jakarta.annotation.Nullable
  public String getIpMode() {
    return ipMode;
  }


  public void setIpMode(String ipMode) {
    this.ipMode = ipMode;
  }


  public V1LoadBalancerIngress ports(List<V1PortStatus> ports) {

    this.ports = ports;
    return this;
  }

  public V1LoadBalancerIngress addPortsItem(V1PortStatus portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Ports is a list of records of service ports If used, every port defined in the service should have an entry in it
   * @return ports
  **/
  @jakarta.annotation.Nullable
  public List<V1PortStatus> getPorts() {
    return ports;
  }


  public void setPorts(List<V1PortStatus> ports) {
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
    V1LoadBalancerIngress v1LoadBalancerIngress = (V1LoadBalancerIngress) o;
    return Objects.equals(this.hostname, v1LoadBalancerIngress.hostname) &&
        Objects.equals(this.ip, v1LoadBalancerIngress.ip) &&
        Objects.equals(this.ipMode, v1LoadBalancerIngress.ipMode) &&
        Objects.equals(this.ports, v1LoadBalancerIngress.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, ip, ipMode, ports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LoadBalancerIngress {\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    ipMode: ").append(toIndentedString(ipMode)).append("\n");
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
    openapiFields.add("hostname");
    openapiFields.add("ip");
    openapiFields.add("ipMode");
    openapiFields.add("ports");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1LoadBalancerIngress
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1LoadBalancerIngress.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1LoadBalancerIngress is not found in the empty JSON string", V1LoadBalancerIngress.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1LoadBalancerIngress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1LoadBalancerIngress` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      if ((jsonObj.get("ip") != null && !jsonObj.get("ip").isJsonNull()) && !jsonObj.get("ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip").toString()));
      }
      if ((jsonObj.get("ipMode") != null && !jsonObj.get("ipMode").isJsonNull()) && !jsonObj.get("ipMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipMode").toString()));
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
            V1PortStatus.validateJsonObject(jsonArrayports.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1LoadBalancerIngress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1LoadBalancerIngress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1LoadBalancerIngress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1LoadBalancerIngress.class));

       return (TypeAdapter<T>) new TypeAdapter<V1LoadBalancerIngress>() {
           @Override
           public void write(JsonWriter out, V1LoadBalancerIngress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1LoadBalancerIngress read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1LoadBalancerIngress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1LoadBalancerIngress
  * @throws IOException if the JSON string is invalid with respect to V1LoadBalancerIngress
  */
  public static V1LoadBalancerIngress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1LoadBalancerIngress.class);
  }

 /**
  * Convert an instance of V1LoadBalancerIngress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
