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

/** ServicePort contains information on service&#39;s port. */
@ApiModel(description = "ServicePort contains information on service's port.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ServicePort {
  public static final String SERIALIZED_NAME_APP_PROTOCOL = "appProtocol";

  @SerializedName(SERIALIZED_NAME_APP_PROTOCOL)
  private String appProtocol;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_PORT = "nodePort";

  @SerializedName(SERIALIZED_NAME_NODE_PORT)
  private Integer nodePort;

  public static final String SERIALIZED_NAME_PORT = "port";

  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";

  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_TARGET_PORT = "targetPort";

  @SerializedName(SERIALIZED_NAME_TARGET_PORT)
  private IntOrString targetPort;

  public V1ServicePort appProtocol(String appProtocol) {

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

  public V1ServicePort name(String name) {

    this.name = name;
    return this;
  }

  /**
   * The name of this port within the service. This must be a DNS_LABEL. All ports within a
   * ServiceSpec must have unique names. When considering the endpoints for a Service, this must
   * match the &#39;name&#39; field in the EndpointPort. Optional if only one ServicePort is defined
   * on this service.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ServicePort nodePort(Integer nodePort) {

    this.nodePort = nodePort;
    return this;
  }

  /**
   * The port on each node on which this service is exposed when type is NodePort or LoadBalancer.
   * Usually assigned by the system. If a value is specified, in-range, and not in use it will be
   * used, otherwise the operation will fail. If not specified, a port will be allocated if this
   * Service requires one. If this field is specified when creating a Service which does not need
   * it, creation will fail. This field will be wiped when updating a Service to no longer need it
   * (e.g. changing type from NodePort to ClusterIP). More info:
   * https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
   *
   * @return nodePort
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The port on each node on which this service is exposed when type is NodePort or LoadBalancer.  Usually assigned by the system. If a value is specified, in-range, and not in use it will be used, otherwise the operation will fail.  If not specified, a port will be allocated if this Service requires one.  If this field is specified when creating a Service which does not need it, creation will fail. This field will be wiped when updating a Service to no longer need it (e.g. changing type from NodePort to ClusterIP). More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport")
  public Integer getNodePort() {
    return nodePort;
  }

  public void setNodePort(Integer nodePort) {
    this.nodePort = nodePort;
  }

  public V1ServicePort port(Integer port) {

    this.port = port;
    return this;
  }

  /**
   * The port that will be exposed by this service.
   *
   * @return port
   */
  @ApiModelProperty(required = true, value = "The port that will be exposed by this service.")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public V1ServicePort protocol(String protocol) {

    this.protocol = protocol;
    return this;
  }

  /**
   * The IP protocol for this port. Supports \&quot;TCP\&quot;, \&quot;UDP\&quot;, and
   * \&quot;SCTP\&quot;. Default is TCP.
   *
   * @return protocol
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The IP protocol for this port. Supports \"TCP\", \"UDP\", and \"SCTP\". Default is TCP.  ")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public V1ServicePort targetPort(IntOrString targetPort) {

    this.targetPort = targetPort;
    return this;
  }

  /**
   * IntOrString is a type that can hold an int32 or a string. When used in JSON or YAML marshalling
   * and unmarshalling, it produces or consumes the inner type. This allows you to have, for
   * example, a JSON field that can accept a name or number.
   *
   * @return targetPort
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.")
  public IntOrString getTargetPort() {
    return targetPort;
  }

  public void setTargetPort(IntOrString targetPort) {
    this.targetPort = targetPort;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ServicePort v1ServicePort = (V1ServicePort) o;
    return Objects.equals(this.appProtocol, v1ServicePort.appProtocol)
        && Objects.equals(this.name, v1ServicePort.name)
        && Objects.equals(this.nodePort, v1ServicePort.nodePort)
        && Objects.equals(this.port, v1ServicePort.port)
        && Objects.equals(this.protocol, v1ServicePort.protocol)
        && Objects.equals(this.targetPort, v1ServicePort.targetPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appProtocol, name, nodePort, port, protocol, targetPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServicePort {\n");
    sb.append("    appProtocol: ").append(toIndentedString(appProtocol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodePort: ").append(toIndentedString(nodePort)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
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
