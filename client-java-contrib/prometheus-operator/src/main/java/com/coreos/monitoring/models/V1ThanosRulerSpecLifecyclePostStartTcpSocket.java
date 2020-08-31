/*
Copyright 2020 The Kubernetes Authors.
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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported TODO: implement a
 * realistic TCP lifecycle hook
 */
@ApiModel(
    description =
        "TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecLifecyclePostStartTcpSocket {
  public static final String SERIALIZED_NAME_HOST = "host";

  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_PORT = "port";

  @SerializedName(SERIALIZED_NAME_PORT)
  private Object port;

  public V1ThanosRulerSpecLifecyclePostStartTcpSocket host(String host) {

    this.host = host;
    return this;
  }

  /**
   * Optional: Host name to connect to, defaults to the pod IP.
   *
   * @return host
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Host name to connect to, defaults to the pod IP.")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public V1ThanosRulerSpecLifecyclePostStartTcpSocket port(Object port) {

    this.port = port;
    return this;
  }

  /**
   * Number or name of the port to access on the container. Number must be in the range 1 to 65535.
   * Name must be an IANA_SVC_NAME.
   *
   * @return port
   */
  @ApiModelProperty(
      required = true,
      value =
          "Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.")
  public Object getPort() {
    return port;
  }

  public void setPort(Object port) {
    this.port = port;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecLifecyclePostStartTcpSocket v1ThanosRulerSpecLifecyclePostStartTcpSocket =
        (V1ThanosRulerSpecLifecyclePostStartTcpSocket) o;
    return Objects.equals(this.host, v1ThanosRulerSpecLifecyclePostStartTcpSocket.host)
        && Objects.equals(this.port, v1ThanosRulerSpecLifecyclePostStartTcpSocket.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecLifecyclePostStartTcpSocket {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
