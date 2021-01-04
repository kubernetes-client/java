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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** JobStatus represents the current state of a Job. */
@ApiModel(description = "JobStatus represents the current state of a Job.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-01-04T09:55:14.976Z[Etc/UTC]")
public class V1JobStatus {
  public static final String SERIALIZED_NAME_ACTIVE = "active";

  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Integer active;

  public static final String SERIALIZED_NAME_COMPLETION_TIME = "completionTime";

  @SerializedName(SERIALIZED_NAME_COMPLETION_TIME)
  private OffsetDateTime completionTime;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1JobCondition> conditions = null;

  public static final String SERIALIZED_NAME_FAILED = "failed";

  @SerializedName(SERIALIZED_NAME_FAILED)
  private Integer failed;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";

  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_SUCCEEDED = "succeeded";

  @SerializedName(SERIALIZED_NAME_SUCCEEDED)
  private Integer succeeded;

  public V1JobStatus active(Integer active) {

    this.active = active;
    return this;
  }

  /**
   * The number of actively running pods.
   *
   * @return active
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of actively running pods.")
  public Integer getActive() {
    return active;
  }

  public void setActive(Integer active) {
    this.active = active;
  }

  public V1JobStatus completionTime(OffsetDateTime completionTime) {

    this.completionTime = completionTime;
    return this;
  }

  /**
   * Represents time when the job was completed. It is not guaranteed to be set in happens-before
   * order across separate operations. It is represented in RFC3339 form and is in UTC. The
   * completion time is only set when the job finishes successfully.
   *
   * @return completionTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. The completion time is only set when the job finishes successfully.")
  public OffsetDateTime getCompletionTime() {
    return completionTime;
  }

  public void setCompletionTime(OffsetDateTime completionTime) {
    this.completionTime = completionTime;
  }

  public V1JobStatus conditions(List<V1JobCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1JobStatus addConditionsItem(V1JobCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * The latest available observations of an object&#39;s current state. When a job fails, one of
   * the conditions will have type &#x3D;&#x3D; \&quot;Failed\&quot;. More info:
   * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The latest available observations of an object's current state. When a job fails, one of the conditions will have type == \"Failed\". More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/")
  public List<V1JobCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1JobCondition> conditions) {
    this.conditions = conditions;
  }

  public V1JobStatus failed(Integer failed) {

    this.failed = failed;
    return this;
  }

  /**
   * The number of pods which reached phase Failed.
   *
   * @return failed
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of pods which reached phase Failed.")
  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  public V1JobStatus startTime(OffsetDateTime startTime) {

    this.startTime = startTime;
    return this;
  }

  /**
   * Represents time when the job was acknowledged by the job controller. It is not guaranteed to be
   * set in happens-before order across separate operations. It is represented in RFC3339 form and
   * is in UTC.
   *
   * @return startTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public V1JobStatus succeeded(Integer succeeded) {

    this.succeeded = succeeded;
    return this;
  }

  /**
   * The number of pods which reached phase Succeeded.
   *
   * @return succeeded
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of pods which reached phase Succeeded.")
  public Integer getSucceeded() {
    return succeeded;
  }

  public void setSucceeded(Integer succeeded) {
    this.succeeded = succeeded;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1JobStatus v1JobStatus = (V1JobStatus) o;
    return Objects.equals(this.active, v1JobStatus.active)
        && Objects.equals(this.completionTime, v1JobStatus.completionTime)
        && Objects.equals(this.conditions, v1JobStatus.conditions)
        && Objects.equals(this.failed, v1JobStatus.failed)
        && Objects.equals(this.startTime, v1JobStatus.startTime)
        && Objects.equals(this.succeeded, v1JobStatus.succeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, completionTime, conditions, failed, startTime, succeeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1JobStatus {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
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
