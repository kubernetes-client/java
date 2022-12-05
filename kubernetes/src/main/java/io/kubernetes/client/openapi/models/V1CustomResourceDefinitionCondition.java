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

/** CustomResourceDefinitionCondition contains details for the current condition of this pod. */
@ApiModel(
    description =
        "CustomResourceDefinitionCondition contains details for the current condition of this pod.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1CustomResourceDefinitionCondition {
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

  public V1CustomResourceDefinitionCondition lastTransitionTime(OffsetDateTime lastTransitionTime) {

    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * lastTransitionTime last time the condition transitioned from one status to another.
   *
   * @return lastTransitionTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "lastTransitionTime last time the condition transitioned from one status to another.")
  public OffsetDateTime getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public V1CustomResourceDefinitionCondition message(String message) {

    this.message = message;
    return this;
  }

  /**
   * message is a human-readable message indicating details about last transition.
   *
   * @return message
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "message is a human-readable message indicating details about last transition.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1CustomResourceDefinitionCondition reason(String reason) {

    this.reason = reason;
    return this;
  }

  /**
   * reason is a unique, one-word, CamelCase reason for the condition&#39;s last transition.
   *
   * @return reason
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "reason is a unique, one-word, CamelCase reason for the condition's last transition.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1CustomResourceDefinitionCondition status(String status) {

    this.status = status;
    return this;
  }

  /**
   * status is the status of the condition. Can be True, False, Unknown.
   *
   * @return status
   */
  @ApiModelProperty(
      required = true,
      value = "status is the status of the condition. Can be True, False, Unknown.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public V1CustomResourceDefinitionCondition type(String type) {

    this.type = type;
    return this;
  }

  /**
   * type is the type of the condition. Types include Established, NamesAccepted and Terminating.
   *
   * @return type
   */
  @ApiModelProperty(
      required = true,
      value =
          "type is the type of the condition. Types include Established, NamesAccepted and Terminating.")
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
    V1CustomResourceDefinitionCondition v1CustomResourceDefinitionCondition =
        (V1CustomResourceDefinitionCondition) o;
    return Objects.equals(
            this.lastTransitionTime, v1CustomResourceDefinitionCondition.lastTransitionTime)
        && Objects.equals(this.message, v1CustomResourceDefinitionCondition.message)
        && Objects.equals(this.reason, v1CustomResourceDefinitionCondition.reason)
        && Objects.equals(this.status, v1CustomResourceDefinitionCondition.status)
        && Objects.equals(this.type, v1CustomResourceDefinitionCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTransitionTime, message, reason, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CustomResourceDefinitionCondition {\n");
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
