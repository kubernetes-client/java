/*
Copyright 2021 The Kubernetes Authors.
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

/** Handler defines a specific action that should be taken */
@ApiModel(description = "Handler defines a specific action that should be taken")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-01-04T09:55:14.976Z[Etc/UTC]")
public class V1Handler {
  public static final String SERIALIZED_NAME_EXEC = "exec";

  @SerializedName(SERIALIZED_NAME_EXEC)
  private V1ExecAction exec;

  public static final String SERIALIZED_NAME_HTTP_GET = "httpGet";

  @SerializedName(SERIALIZED_NAME_HTTP_GET)
  private V1HTTPGetAction httpGet;

  public static final String SERIALIZED_NAME_TCP_SOCKET = "tcpSocket";

  @SerializedName(SERIALIZED_NAME_TCP_SOCKET)
  private V1TCPSocketAction tcpSocket;

  public V1Handler exec(V1ExecAction exec) {

    this.exec = exec;
    return this;
  }

  /**
   * Get exec
   *
   * @return exec
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ExecAction getExec() {
    return exec;
  }

  public void setExec(V1ExecAction exec) {
    this.exec = exec;
  }

  public V1Handler httpGet(V1HTTPGetAction httpGet) {

    this.httpGet = httpGet;
    return this;
  }

  /**
   * Get httpGet
   *
   * @return httpGet
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1HTTPGetAction getHttpGet() {
    return httpGet;
  }

  public void setHttpGet(V1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
  }

  public V1Handler tcpSocket(V1TCPSocketAction tcpSocket) {

    this.tcpSocket = tcpSocket;
    return this;
  }

  /**
   * Get tcpSocket
   *
   * @return tcpSocket
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1TCPSocketAction getTcpSocket() {
    return tcpSocket;
  }

  public void setTcpSocket(V1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Handler v1Handler = (V1Handler) o;
    return Objects.equals(this.exec, v1Handler.exec)
        && Objects.equals(this.httpGet, v1Handler.httpGet)
        && Objects.equals(this.tcpSocket, v1Handler.tcpSocket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exec, httpGet, tcpSocket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Handler {\n");
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
    sb.append("    tcpSocket: ").append(toIndentedString(tcpSocket)).append("\n");
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
