/*
Copyright 2022 The Kubernetes Authors.
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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ClusterCIDRSpec defines the desired state of ClusterCIDR. */
@ApiModel(description = "ClusterCIDRSpec defines the desired state of ClusterCIDR.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
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

  public V1alpha1ClusterCIDRSpec ipv4(String ipv4) {

    this.ipv4 = ipv4;
    return this;
  }

  /**
   * IPv4 defines an IPv4 IP block in CIDR notation(e.g. \&quot;10.0.0.0/8\&quot;). At least one of
   * IPv4 and IPv6 must be specified. This field is immutable.
   *
   * @return ipv4
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "IPv4 defines an IPv4 IP block in CIDR notation(e.g. \"10.0.0.0/8\"). At least one of IPv4 and IPv6 must be specified. This field is immutable.")
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
   * IPv6 defines an IPv6 IP block in CIDR notation(e.g. \&quot;fd12:3456:789a:1::/64\&quot;). At
   * least one of IPv4 and IPv6 must be specified. This field is immutable.
   *
   * @return ipv6
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "IPv6 defines an IPv6 IP block in CIDR notation(e.g. \"fd12:3456:789a:1::/64\"). At least one of IPv4 and IPv6 must be specified. This field is immutable.")
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
   *
   * @return nodeSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
   * PerNodeHostBits defines the number of host bits to be configured per node. A subnet mask
   * determines how much of the address is used for network bits and host bits. For example an IPv4
   * address of 192.168.0.0/24, splits the address into 24 bits for the network portion and 8 bits
   * for the host portion. To allocate 256 IPs, set this field to 8 (a /24 mask for IPv4 or a /120
   * for IPv6). Minimum value is 4 (16 IPs). This field is immutable.
   *
   * @return perNodeHostBits
   */
  @ApiModelProperty(
      required = true,
      value =
          "PerNodeHostBits defines the number of host bits to be configured per node. A subnet mask determines how much of the address is used for network bits and host bits. For example an IPv4 address of 192.168.0.0/24, splits the address into 24 bits for the network portion and 8 bits for the host portion. To allocate 256 IPs, set this field to 8 (a /24 mask for IPv4 or a /120 for IPv6). Minimum value is 4 (16 IPs). This field is immutable.")
  public Integer getPerNodeHostBits() {
    return perNodeHostBits;
  }

  public void setPerNodeHostBits(Integer perNodeHostBits) {
    this.perNodeHostBits = perNodeHostBits;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterCIDRSpec v1alpha1ClusterCIDRSpec = (V1alpha1ClusterCIDRSpec) o;
    return Objects.equals(this.ipv4, v1alpha1ClusterCIDRSpec.ipv4)
        && Objects.equals(this.ipv6, v1alpha1ClusterCIDRSpec.ipv6)
        && Objects.equals(this.nodeSelector, v1alpha1ClusterCIDRSpec.nodeSelector)
        && Objects.equals(this.perNodeHostBits, v1alpha1ClusterCIDRSpec.perNodeHostBits);
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
