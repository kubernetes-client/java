/*
Copyright 2021 The Kubernetes Authors.
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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/** NodeAddress contains information for the node&#39;s address. */
@ApiModel(description = "NodeAddress contains information for the node's address.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1NodeAddress {
  public static final String SERIALIZED_NAME_ADDRESS = "address";

  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  /**
   * Node address type, one of Hostname, ExternalIP or InternalIP. Possible enum values: -
   * &#x60;\&quot;ExternalDNS\&quot;&#x60; identifies a DNS name which resolves to an IP address
   * which has the characteristics of a NodeExternalIP. The IP it resolves to may or may not be a
   * listed NodeExternalIP address. - &#x60;\&quot;ExternalIP\&quot;&#x60; identifies an IP address
   * which is, in some way, intended to be more usable from outside the cluster then an internal IP,
   * though no specific semantics are defined. It may be a globally routable IP, though it is not
   * required to be. External IPs may be assigned directly to an interface on the node, like a
   * NodeInternalIP, or alternatively, packets sent to the external IP may be NAT&#39;ed to an
   * internal node IP rather than being delivered directly (making the IP less efficient for
   * node-to-node traffic than a NodeInternalIP). - &#x60;\&quot;Hostname\&quot;&#x60; identifies a
   * name of the node. Although every node can be assumed to have a NodeAddress of this type, its
   * exact syntax and semantics are not defined, and are not consistent between different clusters.
   * - &#x60;\&quot;InternalDNS\&quot;&#x60; identifies a DNS name which resolves to an IP address
   * which has the characteristics of a NodeInternalIP. The IP it resolves to may or may not be a
   * listed NodeInternalIP address. - &#x60;\&quot;InternalIP\&quot;&#x60; identifies an IP address
   * which is assigned to one of the node&#39;s network interfaces. Every node should have at least
   * one address of this type. An internal IP is normally expected to be reachable from every other
   * node, but may not be visible to hosts outside the cluster. By default it is assumed that
   * kube-apiserver can reach node internal IPs, though it is possible to configure clusters where
   * this is not the case. NodeInternalIP is the default type of node IP, and does not necessarily
   * imply that the IP is ONLY reachable internally. If a node has multiple internal IPs, no
   * specific semantics are assigned to the additional IPs.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    EXTERNALDNS("ExternalDNS"),

    EXTERNALIP("ExternalIP"),

    HOSTNAME("Hostname"),

    INTERNALDNS("InternalDNS"),

    INTERNALIP("InternalIP");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public V1NodeAddress address(String address) {

    this.address = address;
    return this;
  }

  /**
   * The node address.
   *
   * @return address
   */
  @ApiModelProperty(required = true, value = "The node address.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public V1NodeAddress type(TypeEnum type) {

    this.type = type;
    return this;
  }

  /**
   * Node address type, one of Hostname, ExternalIP or InternalIP. Possible enum values: -
   * &#x60;\&quot;ExternalDNS\&quot;&#x60; identifies a DNS name which resolves to an IP address
   * which has the characteristics of a NodeExternalIP. The IP it resolves to may or may not be a
   * listed NodeExternalIP address. - &#x60;\&quot;ExternalIP\&quot;&#x60; identifies an IP address
   * which is, in some way, intended to be more usable from outside the cluster then an internal IP,
   * though no specific semantics are defined. It may be a globally routable IP, though it is not
   * required to be. External IPs may be assigned directly to an interface on the node, like a
   * NodeInternalIP, or alternatively, packets sent to the external IP may be NAT&#39;ed to an
   * internal node IP rather than being delivered directly (making the IP less efficient for
   * node-to-node traffic than a NodeInternalIP). - &#x60;\&quot;Hostname\&quot;&#x60; identifies a
   * name of the node. Although every node can be assumed to have a NodeAddress of this type, its
   * exact syntax and semantics are not defined, and are not consistent between different clusters.
   * - &#x60;\&quot;InternalDNS\&quot;&#x60; identifies a DNS name which resolves to an IP address
   * which has the characteristics of a NodeInternalIP. The IP it resolves to may or may not be a
   * listed NodeInternalIP address. - &#x60;\&quot;InternalIP\&quot;&#x60; identifies an IP address
   * which is assigned to one of the node&#39;s network interfaces. Every node should have at least
   * one address of this type. An internal IP is normally expected to be reachable from every other
   * node, but may not be visible to hosts outside the cluster. By default it is assumed that
   * kube-apiserver can reach node internal IPs, though it is possible to configure clusters where
   * this is not the case. NodeInternalIP is the default type of node IP, and does not necessarily
   * imply that the IP is ONLY reachable internally. If a node has multiple internal IPs, no
   * specific semantics are assigned to the additional IPs.
   *
   * @return type
   */
  @ApiModelProperty(
      required = true,
      value =
          "Node address type, one of Hostname, ExternalIP or InternalIP.  Possible enum values:  - `\"ExternalDNS\"` identifies a DNS name which resolves to an IP address which has the characteristics of a NodeExternalIP. The IP it resolves to may or may not be a listed NodeExternalIP address.  - `\"ExternalIP\"` identifies an IP address which is, in some way, intended to be more usable from outside the cluster then an internal IP, though no specific semantics are defined. It may be a globally routable IP, though it is not required to be. External IPs may be assigned directly to an interface on the node, like a NodeInternalIP, or alternatively, packets sent to the external IP may be NAT'ed to an internal node IP rather than being delivered directly (making the IP less efficient for node-to-node traffic than a NodeInternalIP).  - `\"Hostname\"` identifies a name of the node. Although every node can be assumed to have a NodeAddress of this type, its exact syntax and semantics are not defined, and are not consistent between different clusters.  - `\"InternalDNS\"` identifies a DNS name which resolves to an IP address which has the characteristics of a NodeInternalIP. The IP it resolves to may or may not be a listed NodeInternalIP address.  - `\"InternalIP\"` identifies an IP address which is assigned to one of the node's network interfaces. Every node should have at least one address of this type. An internal IP is normally expected to be reachable from every other node, but may not be visible to hosts outside the cluster. By default it is assumed that kube-apiserver can reach node internal IPs, though it is possible to configure clusters where this is not the case. NodeInternalIP is the default type of node IP, and does not necessarily imply that the IP is ONLY reachable internally. If a node has multiple internal IPs, no specific semantics are assigned to the additional IPs.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeAddress v1NodeAddress = (V1NodeAddress) o;
    return Objects.equals(this.address, v1NodeAddress.address)
        && Objects.equals(this.type, v1NodeAddress.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeAddress {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
