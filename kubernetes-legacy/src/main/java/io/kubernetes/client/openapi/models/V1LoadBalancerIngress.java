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
import io.kubernetes.client.openapi.models.V1PortStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for the service should be sent to an ingress point.
 */
@ApiModel(description = "LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for the service should be sent to an ingress point.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1LoadBalancerIngress {
  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<V1PortStatus> ports = null;


  public V1LoadBalancerIngress hostname(String hostname) {

    this.hostname = hostname;
    return this;
  }

   /**
   * Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers)
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers)")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public V1LoadBalancerIngress ip(String ip) {

    this.ip = ip;
    return this;
  }

   /**
   * IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers)
   * @return ip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers)")

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }


  public V1LoadBalancerIngress ports(List<V1PortStatus> ports) {

    this.ports = ports;
    return this;
  }

  public V1LoadBalancerIngress addPortsItem(V1PortStatus portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Ports is a list of records of service ports If used, every port defined in the service should have an entry in it
   * @return ports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ports is a list of records of service ports If used, every port defined in the service should have an entry in it")

  public List<V1PortStatus> getPorts() {
    return ports;
  }


  public void setPorts(List<V1PortStatus> ports) {
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
    V1LoadBalancerIngress v1LoadBalancerIngress = (V1LoadBalancerIngress) o;
    return Objects.equals(this.hostname, v1LoadBalancerIngress.hostname) &&
        Objects.equals(this.ip, v1LoadBalancerIngress.ip) &&
        Objects.equals(this.ports, v1LoadBalancerIngress.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, ip, ports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LoadBalancerIngress {\n");
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
