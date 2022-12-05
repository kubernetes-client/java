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
import io.kubernetes.client.custom.IntOrString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NetworkPolicyPort describes a port to allow traffic on */
@ApiModel(description = "NetworkPolicyPort describes a port to allow traffic on")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1NetworkPolicyPort {
  public static final String SERIALIZED_NAME_END_PORT = "endPort";

  @SerializedName(SERIALIZED_NAME_END_PORT)
  private Integer endPort;

  public static final String SERIALIZED_NAME_PORT = "port";

  @SerializedName(SERIALIZED_NAME_PORT)
  private IntOrString port;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";

  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public V1NetworkPolicyPort endPort(Integer endPort) {

    this.endPort = endPort;
    return this;
  }

  /**
   * If set, indicates that the range of ports from port to endPort, inclusive, should be allowed by
   * the policy. This field cannot be defined if the port field is not defined or if the port field
   * is defined as a named (string) port. The endPort must be equal or greater than port.
   *
   * @return endPort
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If set, indicates that the range of ports from port to endPort, inclusive, should be allowed by the policy. This field cannot be defined if the port field is not defined or if the port field is defined as a named (string) port. The endPort must be equal or greater than port.")
  public Integer getEndPort() {
    return endPort;
  }

  public void setEndPort(Integer endPort) {
    this.endPort = endPort;
  }

  public V1NetworkPolicyPort port(IntOrString port) {

    this.port = port;
    return this;
  }

  /**
   * IntOrString is a type that can hold an int32 or a string. When used in JSON or YAML marshalling
   * and unmarshalling, it produces or consumes the inner type. This allows you to have, for
   * example, a JSON field that can accept a name or number.
   *
   * @return port
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.")
  public IntOrString getPort() {
    return port;
  }

  public void setPort(IntOrString port) {
    this.port = port;
  }

  public V1NetworkPolicyPort protocol(String protocol) {

    this.protocol = protocol;
    return this;
  }

  /**
   * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field
   * defaults to TCP.
   *
   * @return protocol
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NetworkPolicyPort v1NetworkPolicyPort = (V1NetworkPolicyPort) o;
    return Objects.equals(this.endPort, v1NetworkPolicyPort.endPort)
        && Objects.equals(this.port, v1NetworkPolicyPort.port)
        && Objects.equals(this.protocol, v1NetworkPolicyPort.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endPort, port, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NetworkPolicyPort {\n");
    sb.append("    endPort: ").append(toIndentedString(endPort)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
