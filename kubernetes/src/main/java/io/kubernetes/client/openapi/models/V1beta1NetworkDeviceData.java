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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NetworkDeviceData provides network-related details for the allocated device. This information may be filled by drivers or other components to configure or identify the device within a network context.
 */
@ApiModel(description = "NetworkDeviceData provides network-related details for the allocated device. This information may be filled by drivers or other components to configure or identify the device within a network context.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T22:12:20.439480Z[Etc/UTC]")
public class V1beta1NetworkDeviceData {
  public static final String SERIALIZED_NAME_HARDWARE_ADDRESS = "hardwareAddress";
  @SerializedName(SERIALIZED_NAME_HARDWARE_ADDRESS)
  private String hardwareAddress;

  public static final String SERIALIZED_NAME_INTERFACE_NAME = "interfaceName";
  @SerializedName(SERIALIZED_NAME_INTERFACE_NAME)
  private String interfaceName;

  public static final String SERIALIZED_NAME_IPS = "ips";
  @SerializedName(SERIALIZED_NAME_IPS)
  private List<String> ips = null;


  public V1beta1NetworkDeviceData hardwareAddress(String hardwareAddress) {

    this.hardwareAddress = hardwareAddress;
    return this;
  }

   /**
   * HardwareAddress represents the hardware address (e.g. MAC Address) of the device&#39;s network interface.  Must not be longer than 128 characters.
   * @return hardwareAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HardwareAddress represents the hardware address (e.g. MAC Address) of the device's network interface.  Must not be longer than 128 characters.")

  public String getHardwareAddress() {
    return hardwareAddress;
  }


  public void setHardwareAddress(String hardwareAddress) {
    this.hardwareAddress = hardwareAddress;
  }


  public V1beta1NetworkDeviceData interfaceName(String interfaceName) {

    this.interfaceName = interfaceName;
    return this;
  }

   /**
   * InterfaceName specifies the name of the network interface associated with the allocated device. This might be the name of a physical or virtual network interface being configured in the pod.  Must not be longer than 256 characters.
   * @return interfaceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "InterfaceName specifies the name of the network interface associated with the allocated device. This might be the name of a physical or virtual network interface being configured in the pod.  Must not be longer than 256 characters.")

  public String getInterfaceName() {
    return interfaceName;
  }


  public void setInterfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
  }


  public V1beta1NetworkDeviceData ips(List<String> ips) {

    this.ips = ips;
    return this;
  }

  public V1beta1NetworkDeviceData addIpsItem(String ipsItem) {
    if (this.ips == null) {
      this.ips = new ArrayList<>();
    }
    this.ips.add(ipsItem);
    return this;
  }

   /**
   * IPs lists the network addresses assigned to the device&#39;s network interface. This can include both IPv4 and IPv6 addresses. The IPs are in the CIDR notation, which includes both the address and the associated subnet mask. e.g.: \&quot;192.0.2.5/24\&quot; for IPv4 and \&quot;2001:db8::5/64\&quot; for IPv6.  Must not contain more than 16 entries.
   * @return ips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IPs lists the network addresses assigned to the device's network interface. This can include both IPv4 and IPv6 addresses. The IPs are in the CIDR notation, which includes both the address and the associated subnet mask. e.g.: \"192.0.2.5/24\" for IPv4 and \"2001:db8::5/64\" for IPv6.  Must not contain more than 16 entries.")

  public List<String> getIps() {
    return ips;
  }


  public void setIps(List<String> ips) {
    this.ips = ips;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1NetworkDeviceData v1beta1NetworkDeviceData = (V1beta1NetworkDeviceData) o;
    return Objects.equals(this.hardwareAddress, v1beta1NetworkDeviceData.hardwareAddress) &&
        Objects.equals(this.interfaceName, v1beta1NetworkDeviceData.interfaceName) &&
        Objects.equals(this.ips, v1beta1NetworkDeviceData.ips);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hardwareAddress, interfaceName, ips);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1NetworkDeviceData {\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
