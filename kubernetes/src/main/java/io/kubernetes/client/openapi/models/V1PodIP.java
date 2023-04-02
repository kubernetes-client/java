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

/**
 * IP address information for entries in the (plural) PodIPs field. Each entry includes: IP: An IP
 * address allocated to the pod. Routable at least within the cluster.
 */
@ApiModel(
    description =
        "IP address information for entries in the (plural) PodIPs field. Each entry includes:   IP: An IP address allocated to the pod. Routable at least within the cluster.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1PodIP {
  public static final String SERIALIZED_NAME_IP = "ip";

  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public V1PodIP ip(String ip) {

    this.ip = ip;
    return this;
  }

  /**
   * ip is an IP address (IPv4 or IPv6) assigned to the pod
   *
   * @return ip
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ip is an IP address (IPv4 or IPv6) assigned to the pod")
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
    V1PodIP v1PodIP = (V1PodIP) o;
    return Objects.equals(this.ip, v1PodIP.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodIP {\n");
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
