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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/** CronJobSpec describes how the job execution will look like and when it will actually run. */
@ApiModel(
    description =
        "CronJobSpec describes how the job execution will look like and when it will actually run.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1CronJobSpec {
  /**
   * Specifies how to treat concurrent executions of a Job. Valid values are: - \&quot;Allow\&quot;
   * (default): allows CronJobs to run concurrently; - \&quot;Forbid\&quot;: forbids concurrent
   * runs, skipping next run if previous run hasn&#39;t finished yet; - \&quot;Replace\&quot;:
   * cancels currently running job and replaces it with a new one Possible enum values: -
   * &#x60;\&quot;Allow\&quot;&#x60; allows CronJobs to run concurrently. -
   * &#x60;\&quot;Forbid\&quot;&#x60; forbids concurrent runs, skipping next run if previous
   * hasn&#39;t finished yet. - &#x60;\&quot;Replace\&quot;&#x60; cancels currently running job and
   * replaces it with a new one.
   */
  @JsonAdapter(ConcurrencyPolicyEnum.Adapter.class)
  public enum ConcurrencyPolicyEnum {
    ALLOW("Allow"),

    FORBID("Forbid"),

    REPLACE("Replace");

    private String value;

    ConcurrencyPolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConcurrencyPolicyEnum fromValue(String value) {
      for (ConcurrencyPolicyEnum b : ConcurrencyPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConcurrencyPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConcurrencyPolicyEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConcurrencyPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConcurrencyPolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONCURRENCY_POLICY = "concurrencyPolicy";

  @SerializedName(SERIALIZED_NAME_CONCURRENCY_POLICY)
  private ConcurrencyPolicyEnum concurrencyPolicy;

  public static final String SERIALIZED_NAME_FAILED_JOBS_HISTORY_LIMIT = "failedJobsHistoryLimit";

  @SerializedName(SERIALIZED_NAME_FAILED_JOBS_HISTORY_LIMIT)
  private Integer failedJobsHistoryLimit;

  public static final String SERIALIZED_NAME_JOB_TEMPLATE = "jobTemplate";

  @SerializedName(SERIALIZED_NAME_JOB_TEMPLATE)
  private V1JobTemplateSpec jobTemplate;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";

  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private String schedule;

  public static final String SERIALIZED_NAME_STARTING_DEADLINE_SECONDS = "startingDeadlineSeconds";

  @SerializedName(SERIALIZED_NAME_STARTING_DEADLINE_SECONDS)
  private Long startingDeadlineSeconds;

  public static final String SERIALIZED_NAME_SUCCESSFUL_JOBS_HISTORY_LIMIT =
      "successfulJobsHistoryLimit";

  @SerializedName(SERIALIZED_NAME_SUCCESSFUL_JOBS_HISTORY_LIMIT)
  private Integer successfulJobsHistoryLimit;

  public static final String SERIALIZED_NAME_SUSPEND = "suspend";

  @SerializedName(SERIALIZED_NAME_SUSPEND)
  private Boolean suspend;

  public V1CronJobSpec concurrencyPolicy(ConcurrencyPolicyEnum concurrencyPolicy) {

    this.concurrencyPolicy = concurrencyPolicy;
    return this;
  }

  /**
   * Specifies how to treat concurrent executions of a Job. Valid values are: - \&quot;Allow\&quot;
   * (default): allows CronJobs to run concurrently; - \&quot;Forbid\&quot;: forbids concurrent
   * runs, skipping next run if previous run hasn&#39;t finished yet; - \&quot;Replace\&quot;:
   * cancels currently running job and replaces it with a new one Possible enum values: -
   * &#x60;\&quot;Allow\&quot;&#x60; allows CronJobs to run concurrently. -
   * &#x60;\&quot;Forbid\&quot;&#x60; forbids concurrent runs, skipping next run if previous
   * hasn&#39;t finished yet. - &#x60;\&quot;Replace\&quot;&#x60; cancels currently running job and
   * replaces it with a new one.
   *
   * @return concurrencyPolicy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Specifies how to treat concurrent executions of a Job. Valid values are: - \"Allow\" (default): allows CronJobs to run concurrently; - \"Forbid\": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - \"Replace\": cancels currently running job and replaces it with a new one  Possible enum values:  - `\"Allow\"` allows CronJobs to run concurrently.  - `\"Forbid\"` forbids concurrent runs, skipping next run if previous hasn't finished yet.  - `\"Replace\"` cancels currently running job and replaces it with a new one.")
  public ConcurrencyPolicyEnum getConcurrencyPolicy() {
    return concurrencyPolicy;
  }

  public void setConcurrencyPolicy(ConcurrencyPolicyEnum concurrencyPolicy) {
    this.concurrencyPolicy = concurrencyPolicy;
  }

  public V1CronJobSpec failedJobsHistoryLimit(Integer failedJobsHistoryLimit) {

    this.failedJobsHistoryLimit = failedJobsHistoryLimit;
    return this;
  }

  /**
   * The number of failed finished jobs to retain. Value must be non-negative integer. Defaults to
   * 1.
   *
   * @return failedJobsHistoryLimit
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The number of failed finished jobs to retain. Value must be non-negative integer. Defaults to 1.")
  public Integer getFailedJobsHistoryLimit() {
    return failedJobsHistoryLimit;
  }

  public void setFailedJobsHistoryLimit(Integer failedJobsHistoryLimit) {
    this.failedJobsHistoryLimit = failedJobsHistoryLimit;
  }

  public V1CronJobSpec jobTemplate(V1JobTemplateSpec jobTemplate) {

    this.jobTemplate = jobTemplate;
    return this;
  }

  /**
   * Get jobTemplate
   *
   * @return jobTemplate
   */
  @ApiModelProperty(required = true, value = "")
  public V1JobTemplateSpec getJobTemplate() {
    return jobTemplate;
  }

  public void setJobTemplate(V1JobTemplateSpec jobTemplate) {
    this.jobTemplate = jobTemplate;
  }

  public V1CronJobSpec schedule(String schedule) {

    this.schedule = schedule;
    return this;
  }

  /**
   * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
   *
   * @return schedule
   */
  @ApiModelProperty(
      required = true,
      value = "The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.")
  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  public V1CronJobSpec startingDeadlineSeconds(Long startingDeadlineSeconds) {

    this.startingDeadlineSeconds = startingDeadlineSeconds;
    return this;
  }

  /**
   * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.
   * Missed jobs executions will be counted as failed ones.
   *
   * @return startingDeadlineSeconds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.")
  public Long getStartingDeadlineSeconds() {
    return startingDeadlineSeconds;
  }

  public void setStartingDeadlineSeconds(Long startingDeadlineSeconds) {
    this.startingDeadlineSeconds = startingDeadlineSeconds;
  }

  public V1CronJobSpec successfulJobsHistoryLimit(Integer successfulJobsHistoryLimit) {

    this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
    return this;
  }

  /**
   * The number of successful finished jobs to retain. Value must be non-negative integer. Defaults
   * to 3.
   *
   * @return successfulJobsHistoryLimit
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The number of successful finished jobs to retain. Value must be non-negative integer. Defaults to 3.")
  public Integer getSuccessfulJobsHistoryLimit() {
    return successfulJobsHistoryLimit;
  }

  public void setSuccessfulJobsHistoryLimit(Integer successfulJobsHistoryLimit) {
    this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
  }

  public V1CronJobSpec suspend(Boolean suspend) {

    this.suspend = suspend;
    return this;
  }

  /**
   * This flag tells the controller to suspend subsequent executions, it does not apply to already
   * started executions. Defaults to false.
   *
   * @return suspend
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.")
  public Boolean getSuspend() {
    return suspend;
  }

  public void setSuspend(Boolean suspend) {
    this.suspend = suspend;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CronJobSpec v1CronJobSpec = (V1CronJobSpec) o;
    return Objects.equals(this.concurrencyPolicy, v1CronJobSpec.concurrencyPolicy)
        && Objects.equals(this.failedJobsHistoryLimit, v1CronJobSpec.failedJobsHistoryLimit)
        && Objects.equals(this.jobTemplate, v1CronJobSpec.jobTemplate)
        && Objects.equals(this.schedule, v1CronJobSpec.schedule)
        && Objects.equals(this.startingDeadlineSeconds, v1CronJobSpec.startingDeadlineSeconds)
        && Objects.equals(this.successfulJobsHistoryLimit, v1CronJobSpec.successfulJobsHistoryLimit)
        && Objects.equals(this.suspend, v1CronJobSpec.suspend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        concurrencyPolicy,
        failedJobsHistoryLimit,
        jobTemplate,
        schedule,
        startingDeadlineSeconds,
        successfulJobsHistoryLimit,
        suspend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CronJobSpec {\n");
    sb.append("    concurrencyPolicy: ").append(toIndentedString(concurrencyPolicy)).append("\n");
    sb.append("    failedJobsHistoryLimit: ")
        .append(toIndentedString(failedJobsHistoryLimit))
        .append("\n");
    sb.append("    jobTemplate: ").append(toIndentedString(jobTemplate)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    startingDeadlineSeconds: ")
        .append(toIndentedString(startingDeadlineSeconds))
        .append("\n");
    sb.append("    successfulJobsHistoryLimit: ")
        .append(toIndentedString(successfulJobsHistoryLimit))
        .append("\n");
    sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
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
