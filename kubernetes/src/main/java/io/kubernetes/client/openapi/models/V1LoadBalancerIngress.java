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
package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for
 * the service should be sent to an ingress point.
 */
@ApiModel(
    description =
        "LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for the service should be sent to an ingress point.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-07-29T18:17:00.375Z[Etc/UTC]")
public class V1LoadBalancerIngress {
  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";

  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_IP = "ip";

  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public V1LoadBalancerIngress hostname(String hostname) {

    this.hostname = hostname;
    return this;
  }

  /**
   * Hostname is set for load-balancer ingress points that are DNS based (typically AWS
   * load-balancers)
   *
   * @return hostname
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers)")
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
   * IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack
   * load-balancers)
   *
   * @return ip
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers)")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
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
    return Objects.equals(this.hostname, v1LoadBalancerIngress.hostname)
        && Objects.equals(this.ip, v1LoadBalancerIngress.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, ip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LoadBalancerIngress {\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
