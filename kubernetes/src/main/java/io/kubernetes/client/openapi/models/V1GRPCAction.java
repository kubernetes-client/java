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
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** V1GRPCAction */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1GRPCAction {
  public static final String SERIALIZED_NAME_PORT = "port";

  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_SERVICE = "service";

  @SerializedName(SERIALIZED_NAME_SERVICE)
  private String service;

  public V1GRPCAction port(Integer port) {

    this.port = port;
    return this;
  }

  /**
   * Port number of the gRPC service. Number must be in the range 1 to 65535.
   *
   * @return port
   */
  @ApiModelProperty(
      required = true,
      value = "Port number of the gRPC service. Number must be in the range 1 to 65535.")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public V1GRPCAction service(String service) {

    this.service = service;
    return this;
  }

  /**
   * Service is the name of the service to place in the gRPC HealthCheckRequest (see
   * https://github.com/grpc/grpc/blob/master/doc/health-checking.md). If this is not specified, the
   * default behavior is defined by gRPC.
   *
   * @return service
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).  If this is not specified, the default behavior is defined by gRPC.")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GRPCAction v1GRPCAction = (V1GRPCAction) o;
    return Objects.equals(this.port, v1GRPCAction.port)
        && Objects.equals(this.service, v1GRPCAction.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(port, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GRPCAction {\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
