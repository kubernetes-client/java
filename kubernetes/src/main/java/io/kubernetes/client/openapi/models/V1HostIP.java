/*
Copyright 2025 The Kubernetes Authors.
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * HostIP represents a single IP address allocated to the host.
 */
@ApiModel(description = "HostIP represents a single IP address allocated to the host.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T22:12:20.439480Z[Etc/UTC]")
public class V1HostIP {
  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;


  public V1HostIP ip(String ip) {

    this.ip = ip;
    return this;
  }

   /**
   * IP is the IP address assigned to the host
   * @return ip
  **/
  @ApiModelProperty(required = true, value = "IP is the IP address assigned to the host")

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
    V1HostIP v1HostIP = (V1HostIP) o;
    return Objects.equals(this.ip, v1HostIP.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HostIP {\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
