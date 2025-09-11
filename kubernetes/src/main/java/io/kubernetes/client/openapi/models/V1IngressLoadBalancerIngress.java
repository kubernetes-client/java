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
import io.kubernetes.client.openapi.models.V1IngressPortStatus;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * IngressLoadBalancerIngress represents the status of a load-balancer ingress point.
 */
@ApiModel(description = "IngressLoadBalancerIngress represents the status of a load-balancer ingress point.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1IngressLoadBalancerIngress {
  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  @jakarta.annotation.Nullable
  private String hostname;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  @jakarta.annotation.Nullable
  private String ip;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  @jakarta.annotation.Nullable
  private List<V1IngressPortStatus> ports = new ArrayList<>();

  public V1IngressLoadBalancerIngress() {
  }

  public V1IngressLoadBalancerIngress hostname(@jakarta.annotation.Nullable String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * hostname is set for load-balancer ingress points that are DNS based.
   * @return hostname
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "hostname is set for load-balancer ingress points that are DNS based.")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(@jakarta.annotation.Nullable String hostname) {
    this.hostname = hostname;
  }


  public V1IngressLoadBalancerIngress ip(@jakarta.annotation.Nullable String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * ip is set for load-balancer ingress points that are IP based.
   * @return ip
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ip is set for load-balancer ingress points that are IP based.")
  public String getIp() {
    return ip;
  }

  public void setIp(@jakarta.annotation.Nullable String ip) {
    this.ip = ip;
  }


  public V1IngressLoadBalancerIngress ports(@jakarta.annotation.Nullable List<V1IngressPortStatus> ports) {
    this.ports = ports;
    return this;
  }

  public V1IngressLoadBalancerIngress addPortsItem(V1IngressPortStatus portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * ports provides information about the ports exposed by this LoadBalancer.
   * @return ports
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ports provides information about the ports exposed by this LoadBalancer.")
  public List<V1IngressPortStatus> getPorts() {
    return ports;
  }

  public void setPorts(@jakarta.annotation.Nullable List<V1IngressPortStatus> ports) {
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
    V1IngressLoadBalancerIngress v1IngressLoadBalancerIngress = (V1IngressLoadBalancerIngress) o;
    return Objects.equals(this.hostname, v1IngressLoadBalancerIngress.hostname) &&
        Objects.equals(this.ip, v1IngressLoadBalancerIngress.ip) &&
        Objects.equals(this.ports, v1IngressLoadBalancerIngress.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, ip, ports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1IngressLoadBalancerIngress {\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
    openapiFields.add("ports");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1IngressLoadBalancerIngress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1IngressLoadBalancerIngress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1IngressLoadBalancerIngress is not found in the empty JSON string", V1IngressLoadBalancerIngress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1IngressLoadBalancerIngress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1IngressLoadBalancerIngress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      if ((jsonObj.get("ip") != null && !jsonObj.get("ip").isJsonNull()) && !jsonObj.get("ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip").toString()));
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
            V1IngressPortStatus.validateJsonElement(jsonArrayports.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1IngressLoadBalancerIngress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1IngressLoadBalancerIngress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1IngressLoadBalancerIngress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1IngressLoadBalancerIngress.class));

       return (TypeAdapter<T>) new TypeAdapter<V1IngressLoadBalancerIngress>() {
           @Override
           public void write(JsonWriter out, V1IngressLoadBalancerIngress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1IngressLoadBalancerIngress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1IngressLoadBalancerIngress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1IngressLoadBalancerIngress
   * @throws IOException if the JSON string is invalid with respect to V1IngressLoadBalancerIngress
   */
  public static V1IngressLoadBalancerIngress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1IngressLoadBalancerIngress.class);
  }

  /**
   * Convert an instance of V1IngressLoadBalancerIngress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
