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

/** Describes the state of the storageVersion at a certain point. */
@ApiModel(description = "Describes the state of the storageVersion at a certain point.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1alpha1StorageVersionCondition {
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

  public V1alpha1StorageVersionCondition lastTransitionTime(OffsetDateTime lastTransitionTime) {

    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * Last time the condition transitioned from one status to another.
   *
   * @return lastTransitionTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last time the condition transitioned from one status to another.")
  public OffsetDateTime getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public V1alpha1StorageVersionCondition message(String message) {

    this.message = message;
    return this;
  }

  /**
   * A human readable message indicating details about the transition.
   *
   * @return message
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human readable message indicating details about the transition.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1alpha1StorageVersionCondition observedGeneration(Long observedGeneration) {

    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * If set, this represents the .metadata.generation that the condition was set based upon.
   *
   * @return observedGeneration
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If set, this represents the .metadata.generation that the condition was set based upon.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public V1alpha1StorageVersionCondition reason(String reason) {

    this.reason = reason;
    return this;
  }

  /**
   * The reason for the condition&#39;s last transition.
   *
   * @return reason
   */
  @ApiModelProperty(required = true, value = "The reason for the condition's last transition.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1alpha1StorageVersionCondition status(String status) {

    this.status = status;
    return this;
  }

  /**
   * Status of the condition, one of True, False, Unknown.
   *
   * @return status
   */
  @ApiModelProperty(
      required = true,
      value = "Status of the condition, one of True, False, Unknown.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public V1alpha1StorageVersionCondition type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Type of the condition.
   *
   * @return type
   */
  @ApiModelProperty(required = true, value = "Type of the condition.")
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
    V1alpha1StorageVersionCondition v1alpha1StorageVersionCondition =
        (V1alpha1StorageVersionCondition) o;
    return Objects.equals(
            this.lastTransitionTime, v1alpha1StorageVersionCondition.lastTransitionTime)
        && Objects.equals(this.message, v1alpha1StorageVersionCondition.message)
        && Objects.equals(
            this.observedGeneration, v1alpha1StorageVersionCondition.observedGeneration)
        && Objects.equals(this.reason, v1alpha1StorageVersionCondition.reason)
        && Objects.equals(this.status, v1alpha1StorageVersionCondition.status)
        && Objects.equals(this.type, v1alpha1StorageVersionCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTransitionTime, message, observedGeneration, reason, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1StorageVersionCondition {\n");
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
