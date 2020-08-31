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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * PreStop is called immediately before a container is terminated due to an API request or
 * management event such as liveness/startup probe failure, preemption, resource contention, etc.
 * The handler is not called if the container crashes or exits. The reason for termination is passed
 * to the handler. The Pod&#39;s termination grace period countdown begins before the PreStop hooked
 * is executed. Regardless of the outcome of the handler, the container will eventually terminate
 * within the Pod&#39;s termination grace period. Other management of the container blocks until the
 * hook completes or until the termination grace period is reached. More info:
 * https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
 */
@ApiModel(
    description =
        "PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc. The handler is not called if the container crashes or exits. The reason for termination is passed to the handler. The Pod's termination grace period countdown begins before the PreStop hooked is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period. Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecLifecyclePreStop {
  public static final String SERIALIZED_NAME_EXEC = "exec";

  @SerializedName(SERIALIZED_NAME_EXEC)
  private V1ThanosRulerSpecLifecyclePostStartExec exec;

  public static final String SERIALIZED_NAME_HTTP_GET = "httpGet";

  @SerializedName(SERIALIZED_NAME_HTTP_GET)
  private V1ThanosRulerSpecLifecyclePostStartHttpGet httpGet;

  public static final String SERIALIZED_NAME_TCP_SOCKET = "tcpSocket";

  @SerializedName(SERIALIZED_NAME_TCP_SOCKET)
  private V1ThanosRulerSpecLifecyclePostStartTcpSocket tcpSocket;

  public V1ThanosRulerSpecLifecyclePreStop exec(V1ThanosRulerSpecLifecyclePostStartExec exec) {

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
  public V1ThanosRulerSpecLifecyclePostStartExec getExec() {
    return exec;
  }

  public void setExec(V1ThanosRulerSpecLifecyclePostStartExec exec) {
    this.exec = exec;
  }

  public V1ThanosRulerSpecLifecyclePreStop httpGet(
      V1ThanosRulerSpecLifecyclePostStartHttpGet httpGet) {

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
  public V1ThanosRulerSpecLifecyclePostStartHttpGet getHttpGet() {
    return httpGet;
  }

  public void setHttpGet(V1ThanosRulerSpecLifecyclePostStartHttpGet httpGet) {
    this.httpGet = httpGet;
  }

  public V1ThanosRulerSpecLifecyclePreStop tcpSocket(
      V1ThanosRulerSpecLifecyclePostStartTcpSocket tcpSocket) {

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
  public V1ThanosRulerSpecLifecyclePostStartTcpSocket getTcpSocket() {
    return tcpSocket;
  }

  public void setTcpSocket(V1ThanosRulerSpecLifecyclePostStartTcpSocket tcpSocket) {
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
    V1ThanosRulerSpecLifecyclePreStop v1ThanosRulerSpecLifecyclePreStop =
        (V1ThanosRulerSpecLifecyclePreStop) o;
    return Objects.equals(this.exec, v1ThanosRulerSpecLifecyclePreStop.exec)
        && Objects.equals(this.httpGet, v1ThanosRulerSpecLifecyclePreStop.httpGet)
        && Objects.equals(this.tcpSocket, v1ThanosRulerSpecLifecyclePreStop.tcpSocket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exec, httpGet, tcpSocket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecLifecyclePreStop {\n");
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
