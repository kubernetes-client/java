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
import java.time.OffsetDateTime;

/**
 * NodeCondition contains condition information for a node.
 */
@ApiModel(description = "NodeCondition contains condition information for a node.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T16:56:46.431280Z[Etc/UTC]")
public class V1NodeCondition {
  public static final String SERIALIZED_NAME_LAST_HEARTBEAT_TIME = "lastHeartbeatTime";
  @SerializedName(SERIALIZED_NAME_LAST_HEARTBEAT_TIME)
  private OffsetDateTime lastHeartbeatTime;

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


  public V1NodeCondition lastHeartbeatTime(OffsetDateTime lastHeartbeatTime) {

    this.lastHeartbeatTime = lastHeartbeatTime;
    return this;
  }

   /**
   * Last time we got an update on a given condition.
   * @return lastHeartbeatTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last time we got an update on a given condition.")

  public OffsetDateTime getLastHeartbeatTime() {
    return lastHeartbeatTime;
  }


  public void setLastHeartbeatTime(OffsetDateTime lastHeartbeatTime) {
    this.lastHeartbeatTime = lastHeartbeatTime;
  }


  public V1NodeCondition lastTransitionTime(OffsetDateTime lastTransitionTime) {

    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * Last time the condition transit from one status to another.
   * @return lastTransitionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last time the condition transit from one status to another.")

  public OffsetDateTime getLastTransitionTime() {
    return lastTransitionTime;
  }


  public void setLastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }


  public V1NodeCondition message(String message) {

    this.message = message;
    return this;
  }

   /**
   * Human readable message indicating details about last transition.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Human readable message indicating details about last transition.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public V1NodeCondition reason(String reason) {

    this.reason = reason;
    return this;
  }

   /**
   * (brief) reason for the condition&#39;s last transition.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(brief) reason for the condition's last transition.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public V1NodeCondition status(String status) {

    this.status = status;
    return this;
  }

   /**
   * Status of the condition, one of True, False, Unknown.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status of the condition, one of True, False, Unknown.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public V1NodeCondition type(String type) {

    this.type = type;
    return this;
  }

   /**
   * Type of node condition.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of node condition.")

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
    V1NodeCondition v1NodeCondition = (V1NodeCondition) o;
    return Objects.equals(this.lastHeartbeatTime, v1NodeCondition.lastHeartbeatTime) &&
        Objects.equals(this.lastTransitionTime, v1NodeCondition.lastTransitionTime) &&
        Objects.equals(this.message, v1NodeCondition.message) &&
        Objects.equals(this.reason, v1NodeCondition.reason) &&
        Objects.equals(this.status, v1NodeCondition.status) &&
        Objects.equals(this.type, v1NodeCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastHeartbeatTime, lastTransitionTime, message, reason, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeCondition {\n");
    sb.append("    lastHeartbeatTime: ").append(toIndentedString(lastHeartbeatTime)).append("\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
