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

/** ContainerPort represents a network port in a single container. */
@ApiModel(description = "ContainerPort represents a network port in a single container.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecPorts {
  public static final String SERIALIZED_NAME_CONTAINER_PORT = "containerPort";

  @SerializedName(SERIALIZED_NAME_CONTAINER_PORT)
  private Integer containerPort;

  public static final String SERIALIZED_NAME_HOST_I_P = "hostIP";

  @SerializedName(SERIALIZED_NAME_HOST_I_P)
  private String hostIP;

  public static final String SERIALIZED_NAME_HOST_PORT = "hostPort";

  @SerializedName(SERIALIZED_NAME_HOST_PORT)
  private Integer hostPort;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";

  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public V1ThanosRulerSpecPorts containerPort(Integer containerPort) {

    this.containerPort = containerPort;
    return this;
  }

  /**
   * Number of port to expose on the pod&#39;s IP address. This must be a valid port number, 0 &lt;
   * x &lt; 65536.
   *
   * @return containerPort
   */
  @ApiModelProperty(
      required = true,
      value =
          "Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536.")
  public Integer getContainerPort() {
    return containerPort;
  }

  public void setContainerPort(Integer containerPort) {
    this.containerPort = containerPort;
  }

  public V1ThanosRulerSpecPorts hostIP(String hostIP) {

    this.hostIP = hostIP;
    return this;
  }

  /**
   * What host IP to bind the external port to.
   *
   * @return hostIP
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "What host IP to bind the external port to.")
  public String getHostIP() {
    return hostIP;
  }

  public void setHostIP(String hostIP) {
    this.hostIP = hostIP;
  }

  public V1ThanosRulerSpecPorts hostPort(Integer hostPort) {

    this.hostPort = hostPort;
    return this;
  }

  /**
   * Number of port to expose on the host. If specified, this must be a valid port number, 0 &lt; x
   * &lt; 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not
   * need this.
   *
   * @return hostPort
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Number of port to expose on the host. If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.")
  public Integer getHostPort() {
    return hostPort;
  }

  public void setHostPort(Integer hostPort) {
    this.hostPort = hostPort;
  }

  public V1ThanosRulerSpecPorts name(String name) {

    this.name = name;
    return this;
  }

  /**
   * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod
   * must have a unique name. Name for the port that can be referred to by services.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ThanosRulerSpecPorts protocol(String protocol) {

    this.protocol = protocol;
    return this;
  }

  /**
   * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to \&quot;TCP\&quot;.
   *
   * @return protocol
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protocol for port. Must be UDP, TCP, or SCTP. Defaults to \"TCP\".")
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
    V1ThanosRulerSpecPorts v1ThanosRulerSpecPorts = (V1ThanosRulerSpecPorts) o;
    return Objects.equals(this.containerPort, v1ThanosRulerSpecPorts.containerPort)
        && Objects.equals(this.hostIP, v1ThanosRulerSpecPorts.hostIP)
        && Objects.equals(this.hostPort, v1ThanosRulerSpecPorts.hostPort)
        && Objects.equals(this.name, v1ThanosRulerSpecPorts.name)
        && Objects.equals(this.protocol, v1ThanosRulerSpecPorts.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerPort, hostIP, hostPort, name, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecPorts {\n");
    sb.append("    containerPort: ").append(toIndentedString(containerPort)).append("\n");
    sb.append("    hostIP: ").append(toIndentedString(hostIP)).append("\n");
    sb.append("    hostPort: ").append(toIndentedString(hostPort)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
