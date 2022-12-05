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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** JobStatus represents the current state of a Job. */
@ApiModel(description = "JobStatus represents the current state of a Job.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1JobStatus {
  public static final String SERIALIZED_NAME_ACTIVE = "active";

  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Integer active;

  public static final String SERIALIZED_NAME_COMPLETED_INDEXES = "completedIndexes";

  @SerializedName(SERIALIZED_NAME_COMPLETED_INDEXES)
  private String completedIndexes;

  public static final String SERIALIZED_NAME_COMPLETION_TIME = "completionTime";

  @SerializedName(SERIALIZED_NAME_COMPLETION_TIME)
  private OffsetDateTime completionTime;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1JobCondition> conditions = null;

  public static final String SERIALIZED_NAME_FAILED = "failed";

  @SerializedName(SERIALIZED_NAME_FAILED)
  private Integer failed;

  public static final String SERIALIZED_NAME_READY = "ready";

  @SerializedName(SERIALIZED_NAME_READY)
  private Integer ready;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";

  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_SUCCEEDED = "succeeded";

  @SerializedName(SERIALIZED_NAME_SUCCEEDED)
  private Integer succeeded;

  public static final String SERIALIZED_NAME_UNCOUNTED_TERMINATED_PODS = "uncountedTerminatedPods";

  @SerializedName(SERIALIZED_NAME_UNCOUNTED_TERMINATED_PODS)
  private V1UncountedTerminatedPods uncountedTerminatedPods;

  public V1JobStatus active(Integer active) {

    this.active = active;
    return this;
  }

  /**
   * The number of pending and running pods.
   *
   * @return active
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of pending and running pods.")
  public Integer getActive() {
    return active;
  }

  public void setActive(Integer active) {
    this.active = active;
  }

  public V1JobStatus completedIndexes(String completedIndexes) {

    this.completedIndexes = completedIndexes;
    return this;
  }

  /**
   * CompletedIndexes holds the completed indexes when .spec.completionMode &#x3D;
   * \&quot;Indexed\&quot; in a text format. The indexes are represented as decimal integers
   * separated by commas. The numbers are listed in increasing order. Three or more consecutive
   * numbers are compressed and represented by the first and last element of the series, separated
   * by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented
   * as \&quot;1,3-5,7\&quot;.
   *
   * @return completedIndexes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "CompletedIndexes holds the completed indexes when .spec.completionMode = \"Indexed\" in a text format. The indexes are represented as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as \"1,3-5,7\".")
  public String getCompletedIndexes() {
    return completedIndexes;
  }

  public void setCompletedIndexes(String completedIndexes) {
    this.completedIndexes = completedIndexes;
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
   * The latest available observations of an object&#39;s current state. When a Job fails, one of
   * the conditions will have type \&quot;Failed\&quot; and status true. When a Job is suspended,
   * one of the conditions will have type \&quot;Suspended\&quot; and status true; when the Job is
   * resumed, the status of this condition will become false. When a Job is completed, one of the
   * conditions will have type \&quot;Complete\&quot; and status true. More info:
   * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The latest available observations of an object's current state. When a Job fails, one of the conditions will have type \"Failed\" and status true. When a Job is suspended, one of the conditions will have type \"Suspended\" and status true; when the Job is resumed, the status of this condition will become false. When a Job is completed, one of the conditions will have type \"Complete\" and status true. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/")
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

  public V1JobStatus ready(Integer ready) {

    this.ready = ready;
    return this;
  }

  /**
   * The number of pods which have a Ready condition. This field is beta-level. The job controller
   * populates the field when the feature gate JobReadyPods is enabled (enabled by default).
   *
   * @return ready
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The number of pods which have a Ready condition.  This field is beta-level. The job controller populates the field when the feature gate JobReadyPods is enabled (enabled by default).")
  public Integer getReady() {
    return ready;
  }

  public void setReady(Integer ready) {
    this.ready = ready;
  }

  public V1JobStatus startTime(OffsetDateTime startTime) {

    this.startTime = startTime;
    return this;
  }

  /**
   * Represents time when the job controller started processing a job. When a Job is created in the
   * suspended state, this field is not set until the first time it is resumed. This field is reset
   * every time a Job is resumed from suspension. It is represented in RFC3339 form and is in UTC.
   *
   * @return startTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Represents time when the job controller started processing a job. When a Job is created in the suspended state, this field is not set until the first time it is resumed. This field is reset every time a Job is resumed from suspension. It is represented in RFC3339 form and is in UTC.")
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

  public V1JobStatus uncountedTerminatedPods(V1UncountedTerminatedPods uncountedTerminatedPods) {

    this.uncountedTerminatedPods = uncountedTerminatedPods;
    return this;
  }

  /**
   * Get uncountedTerminatedPods
   *
   * @return uncountedTerminatedPods
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1UncountedTerminatedPods getUncountedTerminatedPods() {
    return uncountedTerminatedPods;
  }

  public void setUncountedTerminatedPods(V1UncountedTerminatedPods uncountedTerminatedPods) {
    this.uncountedTerminatedPods = uncountedTerminatedPods;
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
        && Objects.equals(this.completedIndexes, v1JobStatus.completedIndexes)
        && Objects.equals(this.completionTime, v1JobStatus.completionTime)
        && Objects.equals(this.conditions, v1JobStatus.conditions)
        && Objects.equals(this.failed, v1JobStatus.failed)
        && Objects.equals(this.ready, v1JobStatus.ready)
        && Objects.equals(this.startTime, v1JobStatus.startTime)
        && Objects.equals(this.succeeded, v1JobStatus.succeeded)
        && Objects.equals(this.uncountedTerminatedPods, v1JobStatus.uncountedTerminatedPods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        active,
        completedIndexes,
        completionTime,
        conditions,
        failed,
        ready,
        startTime,
        succeeded,
        uncountedTerminatedPods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1JobStatus {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    completedIndexes: ").append(toIndentedString(completedIndexes)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
    sb.append("    uncountedTerminatedPods: ")
        .append(toIndentedString(uncountedTerminatedPods))
        .append("\n");
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
