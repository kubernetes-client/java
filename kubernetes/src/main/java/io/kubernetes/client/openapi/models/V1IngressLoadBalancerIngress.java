/*
Copyright 2023 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1IngressPortStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IngressLoadBalancerIngress represents the status of a load-balancer ingress point.
 */
@ApiModel(description = "IngressLoadBalancerIngress represents the status of a load-balancer ingress point.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1IngressLoadBalancerIngress {
  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<V1IngressPortStatus> ports = null;


  public V1IngressLoadBalancerIngress hostname(String hostname) {

    this.hostname = hostname;
    return this;
  }

   /**
   * hostname is set for load-balancer ingress points that are DNS based.
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "hostname is set for load-balancer ingress points that are DNS based.")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public V1IngressLoadBalancerIngress ip(String ip) {

    this.ip = ip;
    return this;
  }

   /**
   * ip is set for load-balancer ingress points that are IP based.
   * @return ip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ip is set for load-balancer ingress points that are IP based.")

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }


  public V1IngressLoadBalancerIngress ports(List<V1IngressPortStatus> ports) {

    this.ports = ports;
    return this;
  }

  public V1IngressLoadBalancerIngress addPortsItem(V1IngressPortStatus portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * ports provides information about the ports exposed by this LoadBalancer.
   * @return ports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ports provides information about the ports exposed by this LoadBalancer.")

  public List<V1IngressPortStatus> getPorts() {
    return ports;
  }


  public void setPorts(List<V1IngressPortStatus> ports) {
    this.ports = ports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1IngressLoadBalancerIngress v1IngressLoadBalancerIngress = (V1IngressLoadBalancerIngress) o;
    return Objects.equals(this.hostname, v1IngressLoadBalancerIngress.hostname) &&
        Objects.equals(this.ip, v1IngressLoadBalancerIngress.ip) &&
        Objects.equals(this.ports, v1IngressLoadBalancerIngress.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, ip, ports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1IngressLoadBalancerIngress {\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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
