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
import io.kubernetes.client.openapi.models.V1NodeSelector;
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
 * ClusterCIDRSpec defines the desired state of ClusterCIDR.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T01:56:23.031733Z[Etc/UTC]")
public class V1alpha1ClusterCIDRSpec {
  public static final String SERIALIZED_NAME_IPV4 = "ipv4";
  @SerializedName(SERIALIZED_NAME_IPV4)
  private String ipv4;

  public static final String SERIALIZED_NAME_IPV6 = "ipv6";
  @SerializedName(SERIALIZED_NAME_IPV6)
  private String ipv6;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private V1NodeSelector nodeSelector;

  public static final String SERIALIZED_NAME_PER_NODE_HOST_BITS = "perNodeHostBits";
  @SerializedName(SERIALIZED_NAME_PER_NODE_HOST_BITS)
  private Integer perNodeHostBits;

  public V1alpha1ClusterCIDRSpec() {
  }

  public V1alpha1ClusterCIDRSpec ipv4(String ipv4) {

    this.ipv4 = ipv4;
    return this;
  }

   /**
   * ipv4 defines an IPv4 IP block in CIDR notation(e.g. \&quot;10.0.0.0/8\&quot;). At least one of ipv4 and ipv6 must be specified. This field is immutable.
   * @return ipv4
  **/
  @jakarta.annotation.Nullable
  public String getIpv4() {
    return ipv4;
  }


  public void setIpv4(String ipv4) {
    this.ipv4 = ipv4;
  }


  public V1alpha1ClusterCIDRSpec ipv6(String ipv6) {

    this.ipv6 = ipv6;
    return this;
  }

   /**
   * ipv6 defines an IPv6 IP block in CIDR notation(e.g. \&quot;2001:db8::/64\&quot;). At least one of ipv4 and ipv6 must be specified. This field is immutable.
   * @return ipv6
  **/
  @jakarta.annotation.Nullable
  public String getIpv6() {
    return ipv6;
  }


  public void setIpv6(String ipv6) {
    this.ipv6 = ipv6;
  }


  public V1alpha1ClusterCIDRSpec nodeSelector(V1NodeSelector nodeSelector) {

    this.nodeSelector = nodeSelector;
    return this;
  }

   /**
   * Get nodeSelector
   * @return nodeSelector
  **/
  @jakarta.annotation.Nullable
  public V1NodeSelector getNodeSelector() {
    return nodeSelector;
  }


  public void setNodeSelector(V1NodeSelector nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public V1alpha1ClusterCIDRSpec perNodeHostBits(Integer perNodeHostBits) {

    this.perNodeHostBits = perNodeHostBits;
    return this;
  }

   /**
   * perNodeHostBits defines the number of host bits to be configured per node. A subnet mask determines how much of the address is used for network bits and host bits. For example an IPv4 address of 192.168.0.0/24, splits the address into 24 bits for the network portion and 8 bits for the host portion. To allocate 256 IPs, set this field to 8 (a /24 mask for IPv4 or a /120 for IPv6). Minimum value is 4 (16 IPs). This field is immutable.
   * @return perNodeHostBits
  **/
  @jakarta.annotation.Nonnull
  public Integer getPerNodeHostBits() {
    return perNodeHostBits;
  }


  public void setPerNodeHostBits(Integer perNodeHostBits) {
    this.perNodeHostBits = perNodeHostBits;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterCIDRSpec v1alpha1ClusterCIDRSpec = (V1alpha1ClusterCIDRSpec) o;
    return Objects.equals(this.ipv4, v1alpha1ClusterCIDRSpec.ipv4) &&
        Objects.equals(this.ipv6, v1alpha1ClusterCIDRSpec.ipv6) &&
        Objects.equals(this.nodeSelector, v1alpha1ClusterCIDRSpec.nodeSelector) &&
        Objects.equals(this.perNodeHostBits, v1alpha1ClusterCIDRSpec.perNodeHostBits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4, ipv6, nodeSelector, perNodeHostBits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterCIDRSpec {\n");
    sb.append("    ipv4: ").append(toIndentedString(ipv4)).append("\n");
    sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    perNodeHostBits: ").append(toIndentedString(perNodeHostBits)).append("\n");
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
    openapiFields.add("ipv4");
    openapiFields.add("ipv6");
    openapiFields.add("nodeSelector");
    openapiFields.add("perNodeHostBits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("perNodeHostBits");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterCIDRSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterCIDRSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterCIDRSpec is not found in the empty JSON string", V1alpha1ClusterCIDRSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterCIDRSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterCIDRSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterCIDRSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("ipv4") != null && !jsonObj.get("ipv4").isJsonNull()) && !jsonObj.get("ipv4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipv4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipv4").toString()));
      }
      if ((jsonObj.get("ipv6") != null && !jsonObj.get("ipv6").isJsonNull()) && !jsonObj.get("ipv6").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipv6` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipv6").toString()));
      }
      // validate the optional field `nodeSelector`
      if (jsonObj.get("nodeSelector") != null && !jsonObj.get("nodeSelector").isJsonNull()) {
        V1NodeSelector.validateJsonObject(jsonObj.getAsJsonObject("nodeSelector"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterCIDRSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterCIDRSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterCIDRSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterCIDRSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterCIDRSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterCIDRSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterCIDRSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterCIDRSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterCIDRSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterCIDRSpec
  */
  public static V1alpha1ClusterCIDRSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ClusterCIDRSpec.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterCIDRSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
