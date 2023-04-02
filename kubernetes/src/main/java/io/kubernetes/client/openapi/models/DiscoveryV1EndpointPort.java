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

/** EndpointPort represents a Port used by an EndpointSlice */
@ApiModel(description = "EndpointPort represents a Port used by an EndpointSlice")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class DiscoveryV1EndpointPort {
  public static final String SERIALIZED_NAME_APP_PROTOCOL = "appProtocol";

  @SerializedName(SERIALIZED_NAME_APP_PROTOCOL)
  private String appProtocol;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PORT = "port";

  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";

  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public DiscoveryV1EndpointPort appProtocol(String appProtocol) {

    this.appProtocol = appProtocol;
    return this;
  }

  /**
   * The application protocol for this port. This field follows standard Kubernetes label syntax.
   * Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and
   * https://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed
   * names such as mycompany.com/my-custom-protocol.
   *
   * @return appProtocol
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.")
  public String getAppProtocol() {
    return appProtocol;
  }

  public void setAppProtocol(String appProtocol) {
    this.appProtocol = appProtocol;
  }

  public DiscoveryV1EndpointPort name(String name) {

    this.name = name;
    return this;
  }

  /**
   * The name of this port. All ports in an EndpointSlice must have a unique name. If the
   * EndpointSlice is dervied from a Kubernetes service, this corresponds to the
   * Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must
   * be no more than 63 characters long. * must consist of lower case alphanumeric characters or
   * &#39;-&#39;. * must start and end with an alphanumeric character. Default is empty string.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or '-'. * must start and end with an alphanumeric character. Default is empty string.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DiscoveryV1EndpointPort port(Integer port) {

    this.port = port;
    return this;
  }

  /**
   * The port number of the endpoint. If this is not specified, ports are not restricted and must be
   * interpreted in the context of the specific consumer.
   *
   * @return port
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public DiscoveryV1EndpointPort protocol(String protocol) {

    this.protocol = protocol;
    return this;
  }

  /**
   * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
   *
   * @return protocol
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.")
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
    DiscoveryV1EndpointPort discoveryV1EndpointPort = (DiscoveryV1EndpointPort) o;
    return Objects.equals(this.appProtocol, discoveryV1EndpointPort.appProtocol)
        && Objects.equals(this.name, discoveryV1EndpointPort.name)
        && Objects.equals(this.port, discoveryV1EndpointPort.port)
        && Objects.equals(this.protocol, discoveryV1EndpointPort.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appProtocol, name, port, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscoveryV1EndpointPort {\n");
    sb.append("    appProtocol: ").append(toIndentedString(appProtocol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
