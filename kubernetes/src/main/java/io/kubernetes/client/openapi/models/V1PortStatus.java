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
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** V1PortStatus */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1PortStatus {
  public static final String SERIALIZED_NAME_ERROR = "error";

  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_PORT = "port";

  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";

  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public V1PortStatus error(String error) {

    this.error = error;
    return this;
  }

  /**
   * Error is to record the problem with the service port The format of the error shall comply with
   * the following rules: - built-in error values shall be specified in this file and those shall
   * use CamelCase names - cloud provider specific error values must have names that comply with the
   * format foo.example.com/CamelCase.
   *
   * @return error
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Error is to record the problem with the service port The format of the error shall comply with the following rules: - built-in error values shall be specified in this file and those shall use   CamelCase names - cloud provider specific error values must have names that comply with the   format foo.example.com/CamelCase.")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public V1PortStatus port(Integer port) {

    this.port = port;
    return this;
  }

  /**
   * Port is the port number of the service port of which status is recorded here
   *
   * @return port
   */
  @ApiModelProperty(
      required = true,
      value = "Port is the port number of the service port of which status is recorded here")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public V1PortStatus protocol(String protocol) {

    this.protocol = protocol;
    return this;
  }

  /**
   * Protocol is the protocol of the service port of which status is recorded here The supported
   * values are: \&quot;TCP\&quot;, \&quot;UDP\&quot;, \&quot;SCTP\&quot;
   *
   * @return protocol
   */
  @ApiModelProperty(
      required = true,
      value =
          "Protocol is the protocol of the service port of which status is recorded here The supported values are: \"TCP\", \"UDP\", \"SCTP\"  ")
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
    V1PortStatus v1PortStatus = (V1PortStatus) o;
    return Objects.equals(this.error, v1PortStatus.error)
        && Objects.equals(this.port, v1PortStatus.port)
        && Objects.equals(this.protocol, v1PortStatus.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, port, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PortStatus {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
