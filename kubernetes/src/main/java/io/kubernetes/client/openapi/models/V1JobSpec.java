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
import java.util.Objects;

/** JobSpec describes how the job execution will look like. */
@ApiModel(description = "JobSpec describes how the job execution will look like.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1JobSpec {
  public static final String SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS = "activeDeadlineSeconds";

  @SerializedName(SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS)
  private Long activeDeadlineSeconds;

  public static final String SERIALIZED_NAME_BACKOFF_LIMIT = "backoffLimit";

  @SerializedName(SERIALIZED_NAME_BACKOFF_LIMIT)
  private Integer backoffLimit;

  public static final String SERIALIZED_NAME_COMPLETION_MODE = "completionMode";

  @SerializedName(SERIALIZED_NAME_COMPLETION_MODE)
  private String completionMode;

  public static final String SERIALIZED_NAME_COMPLETIONS = "completions";

  @SerializedName(SERIALIZED_NAME_COMPLETIONS)
  private Integer completions;

  public static final String SERIALIZED_NAME_MANUAL_SELECTOR = "manualSelector";

  @SerializedName(SERIALIZED_NAME_MANUAL_SELECTOR)
  private Boolean manualSelector;

  public static final String SERIALIZED_NAME_PARALLELISM = "parallelism";

  @SerializedName(SERIALIZED_NAME_PARALLELISM)
  private Integer parallelism;

  public static final String SERIALIZED_NAME_POD_FAILURE_POLICY = "podFailurePolicy";

  @SerializedName(SERIALIZED_NAME_POD_FAILURE_POLICY)
  private V1PodFailurePolicy podFailurePolicy;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";

  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1LabelSelector selector;

  public static final String SERIALIZED_NAME_SUSPEND = "suspend";

  @SerializedName(SERIALIZED_NAME_SUSPEND)
  private Boolean suspend;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";

  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private V1PodTemplateSpec template;

  public static final String SERIALIZED_NAME_TTL_SECONDS_AFTER_FINISHED = "ttlSecondsAfterFinished";

  @SerializedName(SERIALIZED_NAME_TTL_SECONDS_AFTER_FINISHED)
  private Integer ttlSecondsAfterFinished;

  public V1JobSpec activeDeadlineSeconds(Long activeDeadlineSeconds) {

    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

  /**
   * Specifies the duration in seconds relative to the startTime that the job may be continuously
   * active before the system tries to terminate it; value must be positive integer. If a Job is
   * suspended (at creation or through an update), this timer will effectively be stopped and reset
   * when the Job is resumed again.
   *
   * @return activeDeadlineSeconds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Specifies the duration in seconds relative to the startTime that the job may be continuously active before the system tries to terminate it; value must be positive integer. If a Job is suspended (at creation or through an update), this timer will effectively be stopped and reset when the Job is resumed again.")
  public Long getActiveDeadlineSeconds() {
    return activeDeadlineSeconds;
  }

  public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
  }

  public V1JobSpec backoffLimit(Integer backoffLimit) {

    this.backoffLimit = backoffLimit;
    return this;
  }

  /**
   * Specifies the number of retries before marking this job failed. Defaults to 6
   *
   * @return backoffLimit
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Specifies the number of retries before marking this job failed. Defaults to 6")
  public Integer getBackoffLimit() {
    return backoffLimit;
  }

  public void setBackoffLimit(Integer backoffLimit) {
    this.backoffLimit = backoffLimit;
  }

  public V1JobSpec completionMode(String completionMode) {

    this.completionMode = completionMode;
    return this;
  }

  /**
   * CompletionMode specifies how Pod completions are tracked. It can be &#x60;NonIndexed&#x60;
   * (default) or &#x60;Indexed&#x60;. &#x60;NonIndexed&#x60; means that the Job is considered
   * complete when there have been .spec.completions successfully completed Pods. Each Pod
   * completion is homologous to each other. &#x60;Indexed&#x60; means that the Pods of a Job get an
   * associated completion index from 0 to (.spec.completions - 1), available in the annotation
   * batch.kubernetes.io/job-completion-index. The Job is considered complete when there is one
   * successfully completed Pod for each index. When value is &#x60;Indexed&#x60;, .spec.completions
   * must be specified and &#x60;.spec.parallelism&#x60; must be less than or equal to 10^5. In
   * addition, The Pod name takes the form &#x60;$(job-name)-$(index)-$(random-string)&#x60;, the
   * Pod hostname takes the form &#x60;$(job-name)-$(index)&#x60;. More completion modes can be
   * added in the future. If the Job controller observes a mode that it doesn&#39;t recognize, which
   * is possible during upgrades due to version skew, the controller skips updates for the Job.
   *
   * @return completionMode
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "CompletionMode specifies how Pod completions are tracked. It can be `NonIndexed` (default) or `Indexed`.  `NonIndexed` means that the Job is considered complete when there have been .spec.completions successfully completed Pods. Each Pod completion is homologous to each other.  `Indexed` means that the Pods of a Job get an associated completion index from 0 to (.spec.completions - 1), available in the annotation batch.kubernetes.io/job-completion-index. The Job is considered complete when there is one successfully completed Pod for each index. When value is `Indexed`, .spec.completions must be specified and `.spec.parallelism` must be less than or equal to 10^5. In addition, The Pod name takes the form `$(job-name)-$(index)-$(random-string)`, the Pod hostname takes the form `$(job-name)-$(index)`.  More completion modes can be added in the future. If the Job controller observes a mode that it doesn't recognize, which is possible during upgrades due to version skew, the controller skips updates for the Job.")
  public String getCompletionMode() {
    return completionMode;
  }

  public void setCompletionMode(String completionMode) {
    this.completionMode = completionMode;
  }

  public V1JobSpec completions(Integer completions) {

    this.completions = completions;
    return this;
  }

  /**
   * Specifies the desired number of successfully finished pods the job should be run with. Setting
   * to nil means that the success of any pod signals the success of all pods, and allows
   * parallelism to have any positive value. Setting to 1 means that parallelism is limited to 1 and
   * the success of that pod signals the success of the job. More info:
   * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   *
   * @return completions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Specifies the desired number of successfully finished pods the job should be run with.  Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/")
  public Integer getCompletions() {
    return completions;
  }

  public void setCompletions(Integer completions) {
    this.completions = completions;
  }

  public V1JobSpec manualSelector(Boolean manualSelector) {

    this.manualSelector = manualSelector;
    return this;
  }

  /**
   * manualSelector controls generation of pod labels and pod selectors. Leave
   * &#x60;manualSelector&#x60; unset unless you are certain what you are doing. When false or
   * unset, the system pick labels unique to this job and appends those labels to the pod template.
   * When true, the user is responsible for picking unique labels and specifying the selector.
   * Failure to pick a unique label may cause this and other jobs to not function correctly.
   * However, You may see &#x60;manualSelector&#x3D;true&#x60; in jobs that were created with the
   * old &#x60;extensions/v1beta1&#x60; API. More info:
   * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
   *
   * @return manualSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector` unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see `manualSelector=true` in jobs that were created with the old `extensions/v1beta1` API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector")
  public Boolean getManualSelector() {
    return manualSelector;
  }

  public void setManualSelector(Boolean manualSelector) {
    this.manualSelector = manualSelector;
  }

  public V1JobSpec parallelism(Integer parallelism) {

    this.parallelism = parallelism;
    return this;
  }

  /**
   * Specifies the maximum desired number of pods the job should run at any given time. The actual
   * number of pods running in steady state will be less than this number when ((.spec.completions -
   * .status.successful) &lt; .spec.parallelism), i.e. when the work left to do is less than max
   * parallelism. More info:
   * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   *
   * @return parallelism
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/")
  public Integer getParallelism() {
    return parallelism;
  }

  public void setParallelism(Integer parallelism) {
    this.parallelism = parallelism;
  }

  public V1JobSpec podFailurePolicy(V1PodFailurePolicy podFailurePolicy) {

    this.podFailurePolicy = podFailurePolicy;
    return this;
  }

  /**
   * Get podFailurePolicy
   *
   * @return podFailurePolicy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PodFailurePolicy getPodFailurePolicy() {
    return podFailurePolicy;
  }

  public void setPodFailurePolicy(V1PodFailurePolicy podFailurePolicy) {
    this.podFailurePolicy = podFailurePolicy;
  }

  public V1JobSpec selector(V1LabelSelector selector) {

    this.selector = selector;
    return this;
  }

  /**
   * Get selector
   *
   * @return selector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }

  public V1JobSpec suspend(Boolean suspend) {

    this.suspend = suspend;
    return this;
  }

  /**
   * Suspend specifies whether the Job controller should create Pods or not. If a Job is created
   * with suspend set to true, no Pods are created by the Job controller. If a Job is suspended
   * after creation (i.e. the flag goes from false to true), the Job controller will delete all
   * active Pods associated with this Job. Users must design their workload to gracefully handle
   * this. Suspending a Job will reset the StartTime field of the Job, effectively resetting the
   * ActiveDeadlineSeconds timer too. Defaults to false.
   *
   * @return suspend
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Suspend specifies whether the Job controller should create Pods or not. If a Job is created with suspend set to true, no Pods are created by the Job controller. If a Job is suspended after creation (i.e. the flag goes from false to true), the Job controller will delete all active Pods associated with this Job. Users must design their workload to gracefully handle this. Suspending a Job will reset the StartTime field of the Job, effectively resetting the ActiveDeadlineSeconds timer too. Defaults to false.")
  public Boolean getSuspend() {
    return suspend;
  }

  public void setSuspend(Boolean suspend) {
    this.suspend = suspend;
  }

  public V1JobSpec template(V1PodTemplateSpec template) {

    this.template = template;
    return this;
  }

  /**
   * Get template
   *
   * @return template
   */
  @ApiModelProperty(required = true, value = "")
  public V1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(V1PodTemplateSpec template) {
    this.template = template;
  }

  public V1JobSpec ttlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {

    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    return this;
  }

  /**
   * ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either
   * Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it
   * is eligible to be automatically deleted. When the Job is being deleted, its lifecycle
   * guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won&#39;t be
   * automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted
   * immediately after it finishes.
   *
   * @return ttlSecondsAfterFinished
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes.")
  public Integer getTtlSecondsAfterFinished() {
    return ttlSecondsAfterFinished;
  }

  public void setTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1JobSpec v1JobSpec = (V1JobSpec) o;
    return Objects.equals(this.activeDeadlineSeconds, v1JobSpec.activeDeadlineSeconds)
        && Objects.equals(this.backoffLimit, v1JobSpec.backoffLimit)
        && Objects.equals(this.completionMode, v1JobSpec.completionMode)
        && Objects.equals(this.completions, v1JobSpec.completions)
        && Objects.equals(this.manualSelector, v1JobSpec.manualSelector)
        && Objects.equals(this.parallelism, v1JobSpec.parallelism)
        && Objects.equals(this.podFailurePolicy, v1JobSpec.podFailurePolicy)
        && Objects.equals(this.selector, v1JobSpec.selector)
        && Objects.equals(this.suspend, v1JobSpec.suspend)
        && Objects.equals(this.template, v1JobSpec.template)
        && Objects.equals(this.ttlSecondsAfterFinished, v1JobSpec.ttlSecondsAfterFinished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        activeDeadlineSeconds,
        backoffLimit,
        completionMode,
        completions,
        manualSelector,
        parallelism,
        podFailurePolicy,
        selector,
        suspend,
        template,
        ttlSecondsAfterFinished);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1JobSpec {\n");
    sb.append("    activeDeadlineSeconds: ")
        .append(toIndentedString(activeDeadlineSeconds))
        .append("\n");
    sb.append("    backoffLimit: ").append(toIndentedString(backoffLimit)).append("\n");
    sb.append("    completionMode: ").append(toIndentedString(completionMode)).append("\n");
    sb.append("    completions: ").append(toIndentedString(completions)).append("\n");
    sb.append("    manualSelector: ").append(toIndentedString(manualSelector)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    podFailurePolicy: ").append(toIndentedString(podFailurePolicy)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    ttlSecondsAfterFinished: ")
        .append(toIndentedString(ttlSecondsAfterFinished))
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
