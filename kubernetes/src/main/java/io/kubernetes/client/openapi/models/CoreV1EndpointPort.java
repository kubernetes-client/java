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

/** EndpointPort is a tuple that describes a single port. */
@ApiModel(description = "EndpointPort is a tuple that describes a single port.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class CoreV1EndpointPort {
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

  public CoreV1EndpointPort appProtocol(String appProtocol) {

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

  public CoreV1EndpointPort name(String name) {

    this.name = name;
    return this;
  }

  /**
   * The name of this port. This must match the &#39;name&#39; field in the corresponding
   * ServicePort. Must be a DNS_LABEL. Optional only if one port is defined.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The name of this port.  This must match the 'name' field in the corresponding ServicePort. Must be a DNS_LABEL. Optional only if one port is defined.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CoreV1EndpointPort port(Integer port) {

    this.port = port;
    return this;
  }

  /**
   * The port number of the endpoint.
   *
   * @return port
   */
  @ApiModelProperty(required = true, value = "The port number of the endpoint.")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public CoreV1EndpointPort protocol(String protocol) {

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
      value = "The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.  ")
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
    CoreV1EndpointPort coreV1EndpointPort = (CoreV1EndpointPort) o;
    return Objects.equals(this.appProtocol, coreV1EndpointPort.appProtocol)
        && Objects.equals(this.name, coreV1EndpointPort.name)
        && Objects.equals(this.port, coreV1EndpointPort.port)
        && Objects.equals(this.protocol, coreV1EndpointPort.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appProtocol, name, port, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreV1EndpointPort {\n");
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
