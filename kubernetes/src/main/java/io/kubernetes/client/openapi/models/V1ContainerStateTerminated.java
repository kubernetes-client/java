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
import java.time.OffsetDateTime;
import java.util.Objects;

/** ContainerStateTerminated is a terminated state of a container. */
@ApiModel(description = "ContainerStateTerminated is a terminated state of a container.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ContainerStateTerminated {
  public static final String SERIALIZED_NAME_CONTAINER_I_D = "containerID";

  @SerializedName(SERIALIZED_NAME_CONTAINER_I_D)
  private String containerID;

  public static final String SERIALIZED_NAME_EXIT_CODE = "exitCode";

  @SerializedName(SERIALIZED_NAME_EXIT_CODE)
  private Integer exitCode;

  public static final String SERIALIZED_NAME_FINISHED_AT = "finishedAt";

  @SerializedName(SERIALIZED_NAME_FINISHED_AT)
  private OffsetDateTime finishedAt;

  public static final String SERIALIZED_NAME_MESSAGE = "message";

  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";

  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_SIGNAL = "signal";

  @SerializedName(SERIALIZED_NAME_SIGNAL)
  private Integer signal;

  public static final String SERIALIZED_NAME_STARTED_AT = "startedAt";

  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private OffsetDateTime startedAt;

  public V1ContainerStateTerminated containerID(String containerID) {

    this.containerID = containerID;
    return this;
  }

  /**
   * Container&#39;s ID in the format &#39;&lt;type&gt;://&lt;container_id&gt;&#39;
   *
   * @return containerID
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Container's ID in the format '<type>://<container_id>'")
  public String getContainerID() {
    return containerID;
  }

  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }

  public V1ContainerStateTerminated exitCode(Integer exitCode) {

    this.exitCode = exitCode;
    return this;
  }

  /**
   * Exit status from the last termination of the container
   *
   * @return exitCode
   */
  @ApiModelProperty(
      required = true,
      value = "Exit status from the last termination of the container")
  public Integer getExitCode() {
    return exitCode;
  }

  public void setExitCode(Integer exitCode) {
    this.exitCode = exitCode;
  }

  public V1ContainerStateTerminated finishedAt(OffsetDateTime finishedAt) {

    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Time at which the container last terminated
   *
   * @return finishedAt
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time at which the container last terminated")
  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }

  public V1ContainerStateTerminated message(String message) {

    this.message = message;
    return this;
  }

  /**
   * Message regarding the last termination of the container
   *
   * @return message
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message regarding the last termination of the container")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1ContainerStateTerminated reason(String reason) {

    this.reason = reason;
    return this;
  }

  /**
   * (brief) reason from the last termination of the container
   *
   * @return reason
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(brief) reason from the last termination of the container")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1ContainerStateTerminated signal(Integer signal) {

    this.signal = signal;
    return this;
  }

  /**
   * Signal from the last termination of the container
   *
   * @return signal
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Signal from the last termination of the container")
  public Integer getSignal() {
    return signal;
  }

  public void setSignal(Integer signal) {
    this.signal = signal;
  }

  public V1ContainerStateTerminated startedAt(OffsetDateTime startedAt) {

    this.startedAt = startedAt;
    return this;
  }

  /**
   * Time at which previous execution of the container started
   *
   * @return startedAt
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time at which previous execution of the container started")
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerStateTerminated v1ContainerStateTerminated = (V1ContainerStateTerminated) o;
    return Objects.equals(this.containerID, v1ContainerStateTerminated.containerID)
        && Objects.equals(this.exitCode, v1ContainerStateTerminated.exitCode)
        && Objects.equals(this.finishedAt, v1ContainerStateTerminated.finishedAt)
        && Objects.equals(this.message, v1ContainerStateTerminated.message)
        && Objects.equals(this.reason, v1ContainerStateTerminated.reason)
        && Objects.equals(this.signal, v1ContainerStateTerminated.signal)
        && Objects.equals(this.startedAt, v1ContainerStateTerminated.startedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerID, exitCode, finishedAt, message, reason, signal, startedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerStateTerminated {\n");
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    signal: ").append(toIndentedString(signal)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
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
