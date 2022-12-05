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

/**
 * ServerAddressByClientCIDR helps the client to determine the server address that they should use,
 * depending on the clientCIDR that they match.
 */
@ApiModel(
    description =
        "ServerAddressByClientCIDR helps the client to determine the server address that they should use, depending on the clientCIDR that they match.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ServerAddressByClientCIDR {
  public static final String SERIALIZED_NAME_CLIENT_C_I_D_R = "clientCIDR";

  @SerializedName(SERIALIZED_NAME_CLIENT_C_I_D_R)
  private String clientCIDR;

  public static final String SERIALIZED_NAME_SERVER_ADDRESS = "serverAddress";

  @SerializedName(SERIALIZED_NAME_SERVER_ADDRESS)
  private String serverAddress;

  public V1ServerAddressByClientCIDR clientCIDR(String clientCIDR) {

    this.clientCIDR = clientCIDR;
    return this;
  }

  /**
   * The CIDR with which clients can match their IP to figure out the server address that they
   * should use.
   *
   * @return clientCIDR
   */
  @ApiModelProperty(
      required = true,
      value =
          "The CIDR with which clients can match their IP to figure out the server address that they should use.")
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
   * Address of this server, suitable for a client that matches the above CIDR. This can be a
   * hostname, hostname:port, IP or IP:port.
   *
   * @return serverAddress
   */
  @ApiModelProperty(
      required = true,
      value =
          "Address of this server, suitable for a client that matches the above CIDR. This can be a hostname, hostname:port, IP or IP:port.")
  public String getServerAddress() {
    return serverAddress;
  }

  public void setServerAddress(String serverAddress) {
    this.serverAddress = serverAddress;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ServerAddressByClientCIDR v1ServerAddressByClientCIDR = (V1ServerAddressByClientCIDR) o;
    return Objects.equals(this.clientCIDR, v1ServerAddressByClientCIDR.clientCIDR)
        && Objects.equals(this.serverAddress, v1ServerAddressByClientCIDR.serverAddress);
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
