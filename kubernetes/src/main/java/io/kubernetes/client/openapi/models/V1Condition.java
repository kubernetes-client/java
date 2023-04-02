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

/** Condition contains details for one aspect of the current state of this API Resource. */
@ApiModel(
    description =
        "Condition contains details for one aspect of the current state of this API Resource.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1Condition {
  public static final String SERIALIZED_NAME_LAST_TRANSITION_TIME = "lastTransitionTime";

  @SerializedName(SERIALIZED_NAME_LAST_TRANSITION_TIME)
  private OffsetDateTime lastTransitionTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";

  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";

  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_REASON = "reason";

  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_STATUS = "status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1Condition lastTransitionTime(OffsetDateTime lastTransitionTime) {

    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * lastTransitionTime is the last time the condition transitioned from one status to another. This
   * should be when the underlying condition changed. If that is not known, then using the time when
   * the API field changed is acceptable.
   *
   * @return lastTransitionTime
   */
  @ApiModelProperty(
      required = true,
      value =
          "lastTransitionTime is the last time the condition transitioned from one status to another. This should be when the underlying condition changed.  If that is not known, then using the time when the API field changed is acceptable.")
  public OffsetDateTime getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public V1Condition message(String message) {

    this.message = message;
    return this;
  }

  /**
   * message is a human readable message indicating details about the transition. This may be an
   * empty string.
   *
   * @return message
   */
  @ApiModelProperty(
      required = true,
      value =
          "message is a human readable message indicating details about the transition. This may be an empty string.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1Condition observedGeneration(Long observedGeneration) {

    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * observedGeneration represents the .metadata.generation that the condition was set based upon.
   * For instance, if .metadata.generation is currently 12, but the
   * .status.conditions[x].observedGeneration is 9, the condition is out of date with respect to the
   * current state of the instance.
   *
   * @return observedGeneration
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "observedGeneration represents the .metadata.generation that the condition was set based upon. For instance, if .metadata.generation is currently 12, but the .status.conditions[x].observedGeneration is 9, the condition is out of date with respect to the current state of the instance.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public V1Condition reason(String reason) {

    this.reason = reason;
    return this;
  }

  /**
   * reason contains a programmatic identifier indicating the reason for the condition&#39;s last
   * transition. Producers of specific condition types may define expected values and meanings for
   * this field, and whether the values are considered a guaranteed API. The value should be a
   * CamelCase string. This field may not be empty.
   *
   * @return reason
   */
  @ApiModelProperty(
      required = true,
      value =
          "reason contains a programmatic identifier indicating the reason for the condition's last transition. Producers of specific condition types may define expected values and meanings for this field, and whether the values are considered a guaranteed API. The value should be a CamelCase string. This field may not be empty.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1Condition status(String status) {

    this.status = status;
    return this;
  }

  /**
   * status of the condition, one of True, False, Unknown.
   *
   * @return status
   */
  @ApiModelProperty(
      required = true,
      value = "status of the condition, one of True, False, Unknown.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public V1Condition type(String type) {

    this.type = type;
    return this;
  }

  /**
   * type of condition in CamelCase or in foo.example.com/CamelCase.
   *
   * @return type
   */
  @ApiModelProperty(
      required = true,
      value = "type of condition in CamelCase or in foo.example.com/CamelCase.")
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
    V1Condition v1Condition = (V1Condition) o;
    return Objects.equals(this.lastTransitionTime, v1Condition.lastTransitionTime)
        && Objects.equals(this.message, v1Condition.message)
        && Objects.equals(this.observedGeneration, v1Condition.observedGeneration)
        && Objects.equals(this.reason, v1Condition.reason)
        && Objects.equals(this.status, v1Condition.status)
        && Objects.equals(this.type, v1Condition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTransitionTime, message, observedGeneration, reason, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Condition {\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
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
