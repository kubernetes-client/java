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
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Objects;

/** V1beta1CertificateSigningRequestCondition */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-01-04T09:55:14.976Z[Etc/UTC]")
public class V1beta1CertificateSigningRequestCondition {
  public static final String SERIALIZED_NAME_LAST_TRANSITION_TIME = "lastTransitionTime";

  @SerializedName(SERIALIZED_NAME_LAST_TRANSITION_TIME)
  private OffsetDateTime lastTransitionTime;

  public static final String SERIALIZED_NAME_LAST_UPDATE_TIME = "lastUpdateTime";

  @SerializedName(SERIALIZED_NAME_LAST_UPDATE_TIME)
  private OffsetDateTime lastUpdateTime;

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

  public V1beta1CertificateSigningRequestCondition lastTransitionTime(
      OffsetDateTime lastTransitionTime) {

    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * lastTransitionTime is the time the condition last transitioned from one status to another. If
   * unset, when a new condition type is added or an existing condition&#39;s status is changed, the
   * server defaults this to the current time.
   *
   * @return lastTransitionTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition's status is changed, the server defaults this to the current time.")
  public OffsetDateTime getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public V1beta1CertificateSigningRequestCondition lastUpdateTime(OffsetDateTime lastUpdateTime) {

    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  /**
   * timestamp for the last update to this condition
   *
   * @return lastUpdateTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "timestamp for the last update to this condition")
  public OffsetDateTime getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(OffsetDateTime lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public V1beta1CertificateSigningRequestCondition message(String message) {

    this.message = message;
    return this;
  }

  /**
   * human readable message with details about the request state
   *
   * @return message
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "human readable message with details about the request state")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1beta1CertificateSigningRequestCondition reason(String reason) {

    this.reason = reason;
    return this;
  }

  /**
   * brief reason for the request state
   *
   * @return reason
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "brief reason for the request state")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1beta1CertificateSigningRequestCondition status(String status) {

    this.status = status;
    return this;
  }

  /**
   * Status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions
   * may not be \&quot;False\&quot; or \&quot;Unknown\&quot;. Defaults to \&quot;True\&quot;. If
   * unset, should be treated as \&quot;True\&quot;.
   *
   * @return status
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be \"False\" or \"Unknown\". Defaults to \"True\". If unset, should be treated as \"True\".")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public V1beta1CertificateSigningRequestCondition type(String type) {

    this.type = type;
    return this;
  }

  /**
   * type of the condition. Known conditions include \&quot;Approved\&quot;, \&quot;Denied\&quot;,
   * and \&quot;Failed\&quot;.
   *
   * @return type
   */
  @ApiModelProperty(
      required = true,
      value =
          "type of the condition. Known conditions include \"Approved\", \"Denied\", and \"Failed\".")
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
    V1beta1CertificateSigningRequestCondition v1beta1CertificateSigningRequestCondition =
        (V1beta1CertificateSigningRequestCondition) o;
    return Objects.equals(
            this.lastTransitionTime, v1beta1CertificateSigningRequestCondition.lastTransitionTime)
        && Objects.equals(
            this.lastUpdateTime, v1beta1CertificateSigningRequestCondition.lastUpdateTime)
        && Objects.equals(this.message, v1beta1CertificateSigningRequestCondition.message)
        && Objects.equals(this.reason, v1beta1CertificateSigningRequestCondition.reason)
        && Objects.equals(this.status, v1beta1CertificateSigningRequestCondition.status)
        && Objects.equals(this.type, v1beta1CertificateSigningRequestCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTransitionTime, lastUpdateTime, message, reason, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CertificateSigningRequestCondition {\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
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
