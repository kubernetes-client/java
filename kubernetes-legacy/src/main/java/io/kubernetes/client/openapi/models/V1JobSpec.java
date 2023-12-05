/*
Copyright 2023 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V1PodFailurePolicy;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * JobSpec describes how the job execution will look like.
 */
@ApiModel(description = "JobSpec describes how the job execution will look like.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1JobSpec {
  public static final String SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS = "activeDeadlineSeconds";
  @SerializedName(SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS)
  private Long activeDeadlineSeconds;

  public static final String SERIALIZED_NAME_BACKOFF_LIMIT = "backoffLimit";
  @SerializedName(SERIALIZED_NAME_BACKOFF_LIMIT)
  private Integer backoffLimit;

  public static final String SERIALIZED_NAME_BACKOFF_LIMIT_PER_INDEX = "backoffLimitPerIndex";
  @SerializedName(SERIALIZED_NAME_BACKOFF_LIMIT_PER_INDEX)
  private Integer backoffLimitPerIndex;

  public static final String SERIALIZED_NAME_COMPLETION_MODE = "completionMode";
  @SerializedName(SERIALIZED_NAME_COMPLETION_MODE)
  private String completionMode;

  public static final String SERIALIZED_NAME_COMPLETIONS = "completions";
  @SerializedName(SERIALIZED_NAME_COMPLETIONS)
  private Integer completions;

  public static final String SERIALIZED_NAME_MANUAL_SELECTOR = "manualSelector";
  @SerializedName(SERIALIZED_NAME_MANUAL_SELECTOR)
  private Boolean manualSelector;

  public static final String SERIALIZED_NAME_MAX_FAILED_INDEXES = "maxFailedIndexes";
  @SerializedName(SERIALIZED_NAME_MAX_FAILED_INDEXES)
  private Integer maxFailedIndexes;

  public static final String SERIALIZED_NAME_PARALLELISM = "parallelism";
  @SerializedName(SERIALIZED_NAME_PARALLELISM)
  private Integer parallelism;

  public static final String SERIALIZED_NAME_POD_FAILURE_POLICY = "podFailurePolicy";
  @SerializedName(SERIALIZED_NAME_POD_FAILURE_POLICY)
  private V1PodFailurePolicy podFailurePolicy;

  public static final String SERIALIZED_NAME_POD_REPLACEMENT_POLICY = "podReplacementPolicy";
  @SerializedName(SERIALIZED_NAME_POD_REPLACEMENT_POLICY)
  private String podReplacementPolicy;

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
   * Specifies the duration in seconds relative to the startTime that the job may be continuously active before the system tries to terminate it; value must be positive integer. If a Job is suspended (at creation or through an update), this timer will effectively be stopped and reset when the Job is resumed again.
   * @return activeDeadlineSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the duration in seconds relative to the startTime that the job may be continuously active before the system tries to terminate it; value must be positive integer. If a Job is suspended (at creation or through an update), this timer will effectively be stopped and reset when the Job is resumed again.")

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
   * @return backoffLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the number of retries before marking this job failed. Defaults to 6")

  public Integer getBackoffLimit() {
    return backoffLimit;
  }


  public void setBackoffLimit(Integer backoffLimit) {
    this.backoffLimit = backoffLimit;
  }


  public V1JobSpec backoffLimitPerIndex(Integer backoffLimitPerIndex) {

    this.backoffLimitPerIndex = backoffLimitPerIndex;
    return this;
  }

   /**
   * Specifies the limit for the number of retries within an index before marking this index as failed. When enabled the number of failures per index is kept in the pod&#39;s batch.kubernetes.io/job-index-failure-count annotation. It can only be set when Job&#39;s completionMode&#x3D;Indexed, and the Pod&#39;s restart policy is Never. The field is immutable. This field is alpha-level. It can be used when the &#x60;JobBackoffLimitPerIndex&#x60; feature gate is enabled (disabled by default).
   * @return backoffLimitPerIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the limit for the number of retries within an index before marking this index as failed. When enabled the number of failures per index is kept in the pod's batch.kubernetes.io/job-index-failure-count annotation. It can only be set when Job's completionMode=Indexed, and the Pod's restart policy is Never. The field is immutable. This field is alpha-level. It can be used when the `JobBackoffLimitPerIndex` feature gate is enabled (disabled by default).")

  public Integer getBackoffLimitPerIndex() {
    return backoffLimitPerIndex;
  }


  public void setBackoffLimitPerIndex(Integer backoffLimitPerIndex) {
    this.backoffLimitPerIndex = backoffLimitPerIndex;
  }


  public V1JobSpec completionMode(String completionMode) {

    this.completionMode = completionMode;
    return this;
  }

   /**
   * completionMode specifies how Pod completions are tracked. It can be &#x60;NonIndexed&#x60; (default) or &#x60;Indexed&#x60;.  &#x60;NonIndexed&#x60; means that the Job is considered complete when there have been .spec.completions successfully completed Pods. Each Pod completion is homologous to each other.  &#x60;Indexed&#x60; means that the Pods of a Job get an associated completion index from 0 to (.spec.completions - 1), available in the annotation batch.kubernetes.io/job-completion-index. The Job is considered complete when there is one successfully completed Pod for each index. When value is &#x60;Indexed&#x60;, .spec.completions must be specified and &#x60;.spec.parallelism&#x60; must be less than or equal to 10^5. In addition, The Pod name takes the form &#x60;$(job-name)-$(index)-$(random-string)&#x60;, the Pod hostname takes the form &#x60;$(job-name)-$(index)&#x60;.  More completion modes can be added in the future. If the Job controller observes a mode that it doesn&#39;t recognize, which is possible during upgrades due to version skew, the controller skips updates for the Job.
   * @return completionMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "completionMode specifies how Pod completions are tracked. It can be `NonIndexed` (default) or `Indexed`.  `NonIndexed` means that the Job is considered complete when there have been .spec.completions successfully completed Pods. Each Pod completion is homologous to each other.  `Indexed` means that the Pods of a Job get an associated completion index from 0 to (.spec.completions - 1), available in the annotation batch.kubernetes.io/job-completion-index. The Job is considered complete when there is one successfully completed Pod for each index. When value is `Indexed`, .spec.completions must be specified and `.spec.parallelism` must be less than or equal to 10^5. In addition, The Pod name takes the form `$(job-name)-$(index)-$(random-string)`, the Pod hostname takes the form `$(job-name)-$(index)`.  More completion modes can be added in the future. If the Job controller observes a mode that it doesn't recognize, which is possible during upgrades due to version skew, the controller skips updates for the Job.")

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
   * Specifies the desired number of successfully finished pods the job should be run with.  Setting to null means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   * @return completions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the desired number of successfully finished pods the job should be run with.  Setting to null means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/")

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
   * manualSelector controls generation of pod labels and pod selectors. Leave &#x60;manualSelector&#x60; unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see &#x60;manualSelector&#x3D;true&#x60; in jobs that were created with the old &#x60;extensions/v1beta1&#x60; API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
   * @return manualSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector` unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see `manualSelector=true` in jobs that were created with the old `extensions/v1beta1` API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector")

  public Boolean getManualSelector() {
    return manualSelector;
  }


  public void setManualSelector(Boolean manualSelector) {
    this.manualSelector = manualSelector;
  }


  public V1JobSpec maxFailedIndexes(Integer maxFailedIndexes) {

    this.maxFailedIndexes = maxFailedIndexes;
    return this;
  }

   /**
   * Specifies the maximal number of failed indexes before marking the Job as failed, when backoffLimitPerIndex is set. Once the number of failed indexes exceeds this number the entire Job is marked as Failed and its execution is terminated. When left as null the job continues execution of all of its indexes and is marked with the &#x60;Complete&#x60; Job condition. It can only be specified when backoffLimitPerIndex is set. It can be null or up to completions. It is required and must be less than or equal to 10^4 when is completions greater than 10^5. This field is alpha-level. It can be used when the &#x60;JobBackoffLimitPerIndex&#x60; feature gate is enabled (disabled by default).
   * @return maxFailedIndexes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the maximal number of failed indexes before marking the Job as failed, when backoffLimitPerIndex is set. Once the number of failed indexes exceeds this number the entire Job is marked as Failed and its execution is terminated. When left as null the job continues execution of all of its indexes and is marked with the `Complete` Job condition. It can only be specified when backoffLimitPerIndex is set. It can be null or up to completions. It is required and must be less than or equal to 10^4 when is completions greater than 10^5. This field is alpha-level. It can be used when the `JobBackoffLimitPerIndex` feature gate is enabled (disabled by default).")

  public Integer getMaxFailedIndexes() {
    return maxFailedIndexes;
  }


  public void setMaxFailedIndexes(Integer maxFailedIndexes) {
    this.maxFailedIndexes = maxFailedIndexes;
  }


  public V1JobSpec parallelism(Integer parallelism) {

    this.parallelism = parallelism;
    return this;
  }

   /**
   * Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   * @return parallelism
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/")

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
   * @return podFailurePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PodFailurePolicy getPodFailurePolicy() {
    return podFailurePolicy;
  }


  public void setPodFailurePolicy(V1PodFailurePolicy podFailurePolicy) {
    this.podFailurePolicy = podFailurePolicy;
  }


  public V1JobSpec podReplacementPolicy(String podReplacementPolicy) {

    this.podReplacementPolicy = podReplacementPolicy;
    return this;
  }

   /**
   * podReplacementPolicy specifies when to create replacement Pods. Possible values are: - TerminatingOrFailed means that we recreate pods   when they are terminating (has a metadata.deletionTimestamp) or failed. - Failed means to wait until a previously created Pod is fully terminated (has phase   Failed or Succeeded) before creating a replacement Pod.  When using podFailurePolicy, Failed is the the only allowed value. TerminatingOrFailed and Failed are allowed values when podFailurePolicy is not in use. This is an alpha field. Enable JobPodReplacementPolicy to be able to use this field.
   * @return podReplacementPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "podReplacementPolicy specifies when to create replacement Pods. Possible values are: - TerminatingOrFailed means that we recreate pods   when they are terminating (has a metadata.deletionTimestamp) or failed. - Failed means to wait until a previously created Pod is fully terminated (has phase   Failed or Succeeded) before creating a replacement Pod.  When using podFailurePolicy, Failed is the the only allowed value. TerminatingOrFailed and Failed are allowed values when podFailurePolicy is not in use. This is an alpha field. Enable JobPodReplacementPolicy to be able to use this field.")

  public String getPodReplacementPolicy() {
    return podReplacementPolicy;
  }


  public void setPodReplacementPolicy(String podReplacementPolicy) {
    this.podReplacementPolicy = podReplacementPolicy;
  }


  public V1JobSpec selector(V1LabelSelector selector) {

    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
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
   * suspend specifies whether the Job controller should create Pods or not. If a Job is created with suspend set to true, no Pods are created by the Job controller. If a Job is suspended after creation (i.e. the flag goes from false to true), the Job controller will delete all active Pods associated with this Job. Users must design their workload to gracefully handle this. Suspending a Job will reset the StartTime field of the Job, effectively resetting the ActiveDeadlineSeconds timer too. Defaults to false.
   * @return suspend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "suspend specifies whether the Job controller should create Pods or not. If a Job is created with suspend set to true, no Pods are created by the Job controller. If a Job is suspended after creation (i.e. the flag goes from false to true), the Job controller will delete all active Pods associated with this Job. Users must design their workload to gracefully handle this. Suspending a Job will reset the StartTime field of the Job, effectively resetting the ActiveDeadlineSeconds timer too. Defaults to false.")

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
   * @return template
  **/
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
   * ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won&#39;t be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes.
   * @return ttlSecondsAfterFinished
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes.")

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
    return Objects.equals(this.activeDeadlineSeconds, v1JobSpec.activeDeadlineSeconds) &&
        Objects.equals(this.backoffLimit, v1JobSpec.backoffLimit) &&
        Objects.equals(this.backoffLimitPerIndex, v1JobSpec.backoffLimitPerIndex) &&
        Objects.equals(this.completionMode, v1JobSpec.completionMode) &&
        Objects.equals(this.completions, v1JobSpec.completions) &&
        Objects.equals(this.manualSelector, v1JobSpec.manualSelector) &&
        Objects.equals(this.maxFailedIndexes, v1JobSpec.maxFailedIndexes) &&
        Objects.equals(this.parallelism, v1JobSpec.parallelism) &&
        Objects.equals(this.podFailurePolicy, v1JobSpec.podFailurePolicy) &&
        Objects.equals(this.podReplacementPolicy, v1JobSpec.podReplacementPolicy) &&
        Objects.equals(this.selector, v1JobSpec.selector) &&
        Objects.equals(this.suspend, v1JobSpec.suspend) &&
        Objects.equals(this.template, v1JobSpec.template) &&
        Objects.equals(this.ttlSecondsAfterFinished, v1JobSpec.ttlSecondsAfterFinished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDeadlineSeconds, backoffLimit, backoffLimitPerIndex, completionMode, completions, manualSelector, maxFailedIndexes, parallelism, podFailurePolicy, podReplacementPolicy, selector, suspend, template, ttlSecondsAfterFinished);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1JobSpec {\n");
    sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
    sb.append("    backoffLimit: ").append(toIndentedString(backoffLimit)).append("\n");
    sb.append("    backoffLimitPerIndex: ").append(toIndentedString(backoffLimitPerIndex)).append("\n");
    sb.append("    completionMode: ").append(toIndentedString(completionMode)).append("\n");
    sb.append("    completions: ").append(toIndentedString(completions)).append("\n");
    sb.append("    manualSelector: ").append(toIndentedString(manualSelector)).append("\n");
    sb.append("    maxFailedIndexes: ").append(toIndentedString(maxFailedIndexes)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    podFailurePolicy: ").append(toIndentedString(podFailurePolicy)).append("\n");
    sb.append("    podReplacementPolicy: ").append(toIndentedString(podReplacementPolicy)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    ttlSecondsAfterFinished: ").append(toIndentedString(ttlSecondsAfterFinished)).append("\n");
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
