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
 * PriorityLevelConfigurationCondition defines the condition of priority level.
 */
@ApiModel(description = "PriorityLevelConfigurationCondition defines the condition of priority level.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T16:56:46.431280Z[Etc/UTC]")
public class V1PriorityLevelConfigurationCondition {
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


  public V1PriorityLevelConfigurationCondition lastTransitionTime(OffsetDateTime lastTransitionTime) {

    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * &#x60;lastTransitionTime&#x60; is the last time the condition transitioned from one status to another.
   * @return lastTransitionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`lastTransitionTime` is the last time the condition transitioned from one status to another.")

  public OffsetDateTime getLastTransitionTime() {
    return lastTransitionTime;
  }


  public void setLastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }


  public V1PriorityLevelConfigurationCondition message(String message) {

    this.message = message;
    return this;
  }

   /**
   * &#x60;message&#x60; is a human-readable message indicating details about last transition.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`message` is a human-readable message indicating details about last transition.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public V1PriorityLevelConfigurationCondition reason(String reason) {

    this.reason = reason;
    return this;
  }

   /**
   * &#x60;reason&#x60; is a unique, one-word, CamelCase reason for the condition&#39;s last transition.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`reason` is a unique, one-word, CamelCase reason for the condition's last transition.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public V1PriorityLevelConfigurationCondition status(String status) {

    this.status = status;
    return this;
  }

   /**
   * &#x60;status&#x60; is the status of the condition. Can be True, False, Unknown. Required.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`status` is the status of the condition. Can be True, False, Unknown. Required.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public V1PriorityLevelConfigurationCondition type(String type) {

    this.type = type;
    return this;
  }

   /**
   * &#x60;type&#x60; is the type of the condition. Required.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`type` is the type of the condition. Required.")

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
    V1PriorityLevelConfigurationCondition v1PriorityLevelConfigurationCondition = (V1PriorityLevelConfigurationCondition) o;
    return Objects.equals(this.lastTransitionTime, v1PriorityLevelConfigurationCondition.lastTransitionTime) &&
        Objects.equals(this.message, v1PriorityLevelConfigurationCondition.message) &&
        Objects.equals(this.reason, v1PriorityLevelConfigurationCondition.reason) &&
        Objects.equals(this.status, v1PriorityLevelConfigurationCondition.status) &&
        Objects.equals(this.type, v1PriorityLevelConfigurationCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTransitionTime, message, reason, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PriorityLevelConfigurationCondition {\n");
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
