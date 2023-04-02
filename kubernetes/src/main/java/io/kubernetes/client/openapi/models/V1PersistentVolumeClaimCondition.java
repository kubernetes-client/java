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

/** PersistentVolumeClaimCondition contails details about state of pvc */
@ApiModel(description = "PersistentVolumeClaimCondition contails details about state of pvc")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1PersistentVolumeClaimCondition {
  public static final String SERIALIZED_NAME_LAST_PROBE_TIME = "lastProbeTime";

  @SerializedName(SERIALIZED_NAME_LAST_PROBE_TIME)
  private OffsetDateTime lastProbeTime;

  public static final String SERIALIZED_NAME_LAST_TRANSITION_TIME = "lastTransitionTime";

  @SerializedName(SERIALIZED_NAME_LAST_TRANSITION_TIME)
  private OffsetDateTime lastTransitionTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";

  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";

  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_STATUS = "status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1PersistentVolumeClaimCondition lastProbeTime(OffsetDateTime lastProbeTime) {

    this.lastProbeTime = lastProbeTime;
    return this;
  }

  /**
   * lastProbeTime is the time we probed the condition.
   *
   * @return lastProbeTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "lastProbeTime is the time we probed the condition.")
  public OffsetDateTime getLastProbeTime() {
    return lastProbeTime;
  }

  public void setLastProbeTime(OffsetDateTime lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
  }

  public V1PersistentVolumeClaimCondition lastTransitionTime(OffsetDateTime lastTransitionTime) {

    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * lastTransitionTime is the time the condition transitioned from one status to another.
   *
   * @return lastTransitionTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "lastTransitionTime is the time the condition transitioned from one status to another.")
  public OffsetDateTime getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public V1PersistentVolumeClaimCondition message(String message) {

    this.message = message;
    return this;
  }

  /**
   * message is the human-readable message indicating details about last transition.
   *
   * @return message
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "message is the human-readable message indicating details about last transition.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1PersistentVolumeClaimCondition reason(String reason) {

    this.reason = reason;
    return this;
  }

  /**
   * reason is a unique, this should be a short, machine understandable string that gives the reason
   * for condition&#39;s last transition. If it reports \&quot;ResizeStarted\&quot; that means the
   * underlying persistent volume is being resized.
   *
   * @return reason
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "reason is a unique, this should be a short, machine understandable string that gives the reason for condition's last transition. If it reports \"ResizeStarted\" that means the underlying persistent volume is being resized.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1PersistentVolumeClaimCondition status(String status) {

    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public V1PersistentVolumeClaimCondition type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PersistentVolumeClaimCondition v1PersistentVolumeClaimCondition =
        (V1PersistentVolumeClaimCondition) o;
    return Objects.equals(this.lastProbeTime, v1PersistentVolumeClaimCondition.lastProbeTime)
        && Objects.equals(
            this.lastTransitionTime, v1PersistentVolumeClaimCondition.lastTransitionTime)
        && Objects.equals(this.message, v1PersistentVolumeClaimCondition.message)
        && Objects.equals(this.reason, v1PersistentVolumeClaimCondition.reason)
        && Objects.equals(this.status, v1PersistentVolumeClaimCondition.status)
        && Objects.equals(this.type, v1PersistentVolumeClaimCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastProbeTime, lastTransitionTime, message, reason, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PersistentVolumeClaimCondition {\n");
    sb.append("    lastProbeTime: ").append(toIndentedString(lastProbeTime)).append("\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
