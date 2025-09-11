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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V1PodFailurePolicy;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import io.kubernetes.client.openapi.models.V1SuccessPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * JobSpec describes how the job execution will look like.
 */
@ApiModel(description = "JobSpec describes how the job execution will look like.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1JobSpec {
  public static final String SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS = "activeDeadlineSeconds";
  @SerializedName(SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS)
  @jakarta.annotation.Nullable
  private Long activeDeadlineSeconds;

  public static final String SERIALIZED_NAME_BACKOFF_LIMIT = "backoffLimit";
  @SerializedName(SERIALIZED_NAME_BACKOFF_LIMIT)
  @jakarta.annotation.Nullable
  private Integer backoffLimit;

  public static final String SERIALIZED_NAME_BACKOFF_LIMIT_PER_INDEX = "backoffLimitPerIndex";
  @SerializedName(SERIALIZED_NAME_BACKOFF_LIMIT_PER_INDEX)
  @jakarta.annotation.Nullable
  private Integer backoffLimitPerIndex;

  public static final String SERIALIZED_NAME_COMPLETION_MODE = "completionMode";
  @SerializedName(SERIALIZED_NAME_COMPLETION_MODE)
  @jakarta.annotation.Nullable
  private String completionMode;

  public static final String SERIALIZED_NAME_COMPLETIONS = "completions";
  @SerializedName(SERIALIZED_NAME_COMPLETIONS)
  @jakarta.annotation.Nullable
  private Integer completions;

  public static final String SERIALIZED_NAME_MANAGED_BY = "managedBy";
  @SerializedName(SERIALIZED_NAME_MANAGED_BY)
  @jakarta.annotation.Nullable
  private String managedBy;

  public static final String SERIALIZED_NAME_MANUAL_SELECTOR = "manualSelector";
  @SerializedName(SERIALIZED_NAME_MANUAL_SELECTOR)
  @jakarta.annotation.Nullable
  private Boolean manualSelector;

  public static final String SERIALIZED_NAME_MAX_FAILED_INDEXES = "maxFailedIndexes";
  @SerializedName(SERIALIZED_NAME_MAX_FAILED_INDEXES)
  @jakarta.annotation.Nullable
  private Integer maxFailedIndexes;

  public static final String SERIALIZED_NAME_PARALLELISM = "parallelism";
  @SerializedName(SERIALIZED_NAME_PARALLELISM)
  @jakarta.annotation.Nullable
  private Integer parallelism;

  public static final String SERIALIZED_NAME_POD_FAILURE_POLICY = "podFailurePolicy";
  @SerializedName(SERIALIZED_NAME_POD_FAILURE_POLICY)
  @jakarta.annotation.Nullable
  private V1PodFailurePolicy podFailurePolicy;

  public static final String SERIALIZED_NAME_POD_REPLACEMENT_POLICY = "podReplacementPolicy";
  @SerializedName(SERIALIZED_NAME_POD_REPLACEMENT_POLICY)
  @jakarta.annotation.Nullable
  private String podReplacementPolicy;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  @jakarta.annotation.Nullable
  private V1LabelSelector selector;

  public static final String SERIALIZED_NAME_SUCCESS_POLICY = "successPolicy";
  @SerializedName(SERIALIZED_NAME_SUCCESS_POLICY)
  @jakarta.annotation.Nullable
  private V1SuccessPolicy successPolicy;

  public static final String SERIALIZED_NAME_SUSPEND = "suspend";
  @SerializedName(SERIALIZED_NAME_SUSPEND)
  @jakarta.annotation.Nullable
  private Boolean suspend;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  @jakarta.annotation.Nonnull
  private V1PodTemplateSpec template;

  public static final String SERIALIZED_NAME_TTL_SECONDS_AFTER_FINISHED = "ttlSecondsAfterFinished";
  @SerializedName(SERIALIZED_NAME_TTL_SECONDS_AFTER_FINISHED)
  @jakarta.annotation.Nullable
  private Integer ttlSecondsAfterFinished;

  public V1JobSpec() {
  }

  public V1JobSpec activeDeadlineSeconds(@jakarta.annotation.Nullable Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

  /**
   * Specifies the duration in seconds relative to the startTime that the job may be continuously active before the system tries to terminate it; value must be positive integer. If a Job is suspended (at creation or through an update), this timer will effectively be stopped and reset when the Job is resumed again.
   * @return activeDeadlineSeconds
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies the duration in seconds relative to the startTime that the job may be continuously active before the system tries to terminate it; value must be positive integer. If a Job is suspended (at creation or through an update), this timer will effectively be stopped and reset when the Job is resumed again.")
  public Long getActiveDeadlineSeconds() {
    return activeDeadlineSeconds;
  }

  public void setActiveDeadlineSeconds(@jakarta.annotation.Nullable Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
  }


  public V1JobSpec backoffLimit(@jakarta.annotation.Nullable Integer backoffLimit) {
    this.backoffLimit = backoffLimit;
    return this;
  }

  /**
   * Specifies the number of retries before marking this job failed. Defaults to 6, unless backoffLimitPerIndex (only Indexed Job) is specified. When backoffLimitPerIndex is specified, backoffLimit defaults to 2147483647.
   * @return backoffLimit
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies the number of retries before marking this job failed. Defaults to 6, unless backoffLimitPerIndex (only Indexed Job) is specified. When backoffLimitPerIndex is specified, backoffLimit defaults to 2147483647.")
  public Integer getBackoffLimit() {
    return backoffLimit;
  }

  public void setBackoffLimit(@jakarta.annotation.Nullable Integer backoffLimit) {
    this.backoffLimit = backoffLimit;
  }


  public V1JobSpec backoffLimitPerIndex(@jakarta.annotation.Nullable Integer backoffLimitPerIndex) {
    this.backoffLimitPerIndex = backoffLimitPerIndex;
    return this;
  }

  /**
   * Specifies the limit for the number of retries within an index before marking this index as failed. When enabled the number of failures per index is kept in the pod&#39;s batch.kubernetes.io/job-index-failure-count annotation. It can only be set when Job&#39;s completionMode&#x3D;Indexed, and the Pod&#39;s restart policy is Never. The field is immutable.
   * @return backoffLimitPerIndex
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies the limit for the number of retries within an index before marking this index as failed. When enabled the number of failures per index is kept in the pod's batch.kubernetes.io/job-index-failure-count annotation. It can only be set when Job's completionMode=Indexed, and the Pod's restart policy is Never. The field is immutable.")
  public Integer getBackoffLimitPerIndex() {
    return backoffLimitPerIndex;
  }

  public void setBackoffLimitPerIndex(@jakarta.annotation.Nullable Integer backoffLimitPerIndex) {
    this.backoffLimitPerIndex = backoffLimitPerIndex;
  }


  public V1JobSpec completionMode(@jakarta.annotation.Nullable String completionMode) {
    this.completionMode = completionMode;
    return this;
  }

  /**
   * completionMode specifies how Pod completions are tracked. It can be &#x60;NonIndexed&#x60; (default) or &#x60;Indexed&#x60;.  &#x60;NonIndexed&#x60; means that the Job is considered complete when there have been .spec.completions successfully completed Pods. Each Pod completion is homologous to each other.  &#x60;Indexed&#x60; means that the Pods of a Job get an associated completion index from 0 to (.spec.completions - 1), available in the annotation batch.kubernetes.io/job-completion-index. The Job is considered complete when there is one successfully completed Pod for each index. When value is &#x60;Indexed&#x60;, .spec.completions must be specified and &#x60;.spec.parallelism&#x60; must be less than or equal to 10^5. In addition, The Pod name takes the form &#x60;$(job-name)-$(index)-$(random-string)&#x60;, the Pod hostname takes the form &#x60;$(job-name)-$(index)&#x60;.  More completion modes can be added in the future. If the Job controller observes a mode that it doesn&#39;t recognize, which is possible during upgrades due to version skew, the controller skips updates for the Job.
   * @return completionMode
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "completionMode specifies how Pod completions are tracked. It can be `NonIndexed` (default) or `Indexed`.  `NonIndexed` means that the Job is considered complete when there have been .spec.completions successfully completed Pods. Each Pod completion is homologous to each other.  `Indexed` means that the Pods of a Job get an associated completion index from 0 to (.spec.completions - 1), available in the annotation batch.kubernetes.io/job-completion-index. The Job is considered complete when there is one successfully completed Pod for each index. When value is `Indexed`, .spec.completions must be specified and `.spec.parallelism` must be less than or equal to 10^5. In addition, The Pod name takes the form `$(job-name)-$(index)-$(random-string)`, the Pod hostname takes the form `$(job-name)-$(index)`.  More completion modes can be added in the future. If the Job controller observes a mode that it doesn't recognize, which is possible during upgrades due to version skew, the controller skips updates for the Job.")
  public String getCompletionMode() {
    return completionMode;
  }

  public void setCompletionMode(@jakarta.annotation.Nullable String completionMode) {
    this.completionMode = completionMode;
  }


  public V1JobSpec completions(@jakarta.annotation.Nullable Integer completions) {
    this.completions = completions;
    return this;
  }

  /**
   * Specifies the desired number of successfully finished pods the job should be run with.  Setting to null means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   * @return completions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies the desired number of successfully finished pods the job should be run with.  Setting to null means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/")
  public Integer getCompletions() {
    return completions;
  }

  public void setCompletions(@jakarta.annotation.Nullable Integer completions) {
    this.completions = completions;
  }


  public V1JobSpec managedBy(@jakarta.annotation.Nullable String managedBy) {
    this.managedBy = managedBy;
    return this;
  }

  /**
   * ManagedBy field indicates the controller that manages a Job. The k8s Job controller reconciles jobs which don&#39;t have this field at all or the field value is the reserved string &#x60;kubernetes.io/job-controller&#x60;, but skips reconciling Jobs with a custom value for this field. The value must be a valid domain-prefixed path (e.g. acme.io/foo) - all characters before the first \&quot;/\&quot; must be a valid subdomain as defined by RFC 1123. All characters trailing the first \&quot;/\&quot; must be valid HTTP Path characters as defined by RFC 3986. The value cannot exceed 63 characters. This field is immutable.  This field is beta-level. The job controller accepts setting the field when the feature gate JobManagedBy is enabled (enabled by default).
   * @return managedBy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ManagedBy field indicates the controller that manages a Job. The k8s Job controller reconciles jobs which don't have this field at all or the field value is the reserved string `kubernetes.io/job-controller`, but skips reconciling Jobs with a custom value for this field. The value must be a valid domain-prefixed path (e.g. acme.io/foo) - all characters before the first \"/\" must be a valid subdomain as defined by RFC 1123. All characters trailing the first \"/\" must be valid HTTP Path characters as defined by RFC 3986. The value cannot exceed 63 characters. This field is immutable.  This field is beta-level. The job controller accepts setting the field when the feature gate JobManagedBy is enabled (enabled by default).")
  public String getManagedBy() {
    return managedBy;
  }

  public void setManagedBy(@jakarta.annotation.Nullable String managedBy) {
    this.managedBy = managedBy;
  }


  public V1JobSpec manualSelector(@jakarta.annotation.Nullable Boolean manualSelector) {
    this.manualSelector = manualSelector;
    return this;
  }

  /**
   * manualSelector controls generation of pod labels and pod selectors. Leave &#x60;manualSelector&#x60; unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see &#x60;manualSelector&#x3D;true&#x60; in jobs that were created with the old &#x60;extensions/v1beta1&#x60; API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
   * @return manualSelector
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector` unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see `manualSelector=true` in jobs that were created with the old `extensions/v1beta1` API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector")
  public Boolean getManualSelector() {
    return manualSelector;
  }

  public void setManualSelector(@jakarta.annotation.Nullable Boolean manualSelector) {
    this.manualSelector = manualSelector;
  }


  public V1JobSpec maxFailedIndexes(@jakarta.annotation.Nullable Integer maxFailedIndexes) {
    this.maxFailedIndexes = maxFailedIndexes;
    return this;
  }

  /**
   * Specifies the maximal number of failed indexes before marking the Job as failed, when backoffLimitPerIndex is set. Once the number of failed indexes exceeds this number the entire Job is marked as Failed and its execution is terminated. When left as null the job continues execution of all of its indexes and is marked with the &#x60;Complete&#x60; Job condition. It can only be specified when backoffLimitPerIndex is set. It can be null or up to completions. It is required and must be less than or equal to 10^4 when is completions greater than 10^5.
   * @return maxFailedIndexes
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies the maximal number of failed indexes before marking the Job as failed, when backoffLimitPerIndex is set. Once the number of failed indexes exceeds this number the entire Job is marked as Failed and its execution is terminated. When left as null the job continues execution of all of its indexes and is marked with the `Complete` Job condition. It can only be specified when backoffLimitPerIndex is set. It can be null or up to completions. It is required and must be less than or equal to 10^4 when is completions greater than 10^5.")
  public Integer getMaxFailedIndexes() {
    return maxFailedIndexes;
  }

  public void setMaxFailedIndexes(@jakarta.annotation.Nullable Integer maxFailedIndexes) {
    this.maxFailedIndexes = maxFailedIndexes;
  }


  public V1JobSpec parallelism(@jakarta.annotation.Nullable Integer parallelism) {
    this.parallelism = parallelism;
    return this;
  }

  /**
   * Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   * @return parallelism
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/")
  public Integer getParallelism() {
    return parallelism;
  }

  public void setParallelism(@jakarta.annotation.Nullable Integer parallelism) {
    this.parallelism = parallelism;
  }


  public V1JobSpec podFailurePolicy(@jakarta.annotation.Nullable V1PodFailurePolicy podFailurePolicy) {
    this.podFailurePolicy = podFailurePolicy;
    return this;
  }

  /**
   * Get podFailurePolicy
   * @return podFailurePolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PodFailurePolicy getPodFailurePolicy() {
    return podFailurePolicy;
  }

  public void setPodFailurePolicy(@jakarta.annotation.Nullable V1PodFailurePolicy podFailurePolicy) {
    this.podFailurePolicy = podFailurePolicy;
  }


  public V1JobSpec podReplacementPolicy(@jakarta.annotation.Nullable String podReplacementPolicy) {
    this.podReplacementPolicy = podReplacementPolicy;
    return this;
  }

  /**
   * podReplacementPolicy specifies when to create replacement Pods. Possible values are: - TerminatingOrFailed means that we recreate pods   when they are terminating (has a metadata.deletionTimestamp) or failed. - Failed means to wait until a previously created Pod is fully terminated (has phase   Failed or Succeeded) before creating a replacement Pod.  When using podFailurePolicy, Failed is the the only allowed value. TerminatingOrFailed and Failed are allowed values when podFailurePolicy is not in use.
   * @return podReplacementPolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "podReplacementPolicy specifies when to create replacement Pods. Possible values are: - TerminatingOrFailed means that we recreate pods   when they are terminating (has a metadata.deletionTimestamp) or failed. - Failed means to wait until a previously created Pod is fully terminated (has phase   Failed or Succeeded) before creating a replacement Pod.  When using podFailurePolicy, Failed is the the only allowed value. TerminatingOrFailed and Failed are allowed values when podFailurePolicy is not in use.")
  public String getPodReplacementPolicy() {
    return podReplacementPolicy;
  }

  public void setPodReplacementPolicy(@jakarta.annotation.Nullable String podReplacementPolicy) {
    this.podReplacementPolicy = podReplacementPolicy;
  }


  public V1JobSpec selector(@jakarta.annotation.Nullable V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

  /**
   * Get selector
   * @return selector
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(@jakarta.annotation.Nullable V1LabelSelector selector) {
    this.selector = selector;
  }


  public V1JobSpec successPolicy(@jakarta.annotation.Nullable V1SuccessPolicy successPolicy) {
    this.successPolicy = successPolicy;
    return this;
  }

  /**
   * Get successPolicy
   * @return successPolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1SuccessPolicy getSuccessPolicy() {
    return successPolicy;
  }

  public void setSuccessPolicy(@jakarta.annotation.Nullable V1SuccessPolicy successPolicy) {
    this.successPolicy = successPolicy;
  }


  public V1JobSpec suspend(@jakarta.annotation.Nullable Boolean suspend) {
    this.suspend = suspend;
    return this;
  }

  /**
   * suspend specifies whether the Job controller should create Pods or not. If a Job is created with suspend set to true, no Pods are created by the Job controller. If a Job is suspended after creation (i.e. the flag goes from false to true), the Job controller will delete all active Pods associated with this Job. Users must design their workload to gracefully handle this. Suspending a Job will reset the StartTime field of the Job, effectively resetting the ActiveDeadlineSeconds timer too. Defaults to false.
   * @return suspend
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "suspend specifies whether the Job controller should create Pods or not. If a Job is created with suspend set to true, no Pods are created by the Job controller. If a Job is suspended after creation (i.e. the flag goes from false to true), the Job controller will delete all active Pods associated with this Job. Users must design their workload to gracefully handle this. Suspending a Job will reset the StartTime field of the Job, effectively resetting the ActiveDeadlineSeconds timer too. Defaults to false.")
  public Boolean getSuspend() {
    return suspend;
  }

  public void setSuspend(@jakarta.annotation.Nullable Boolean suspend) {
    this.suspend = suspend;
  }


  public V1JobSpec template(@jakarta.annotation.Nonnull V1PodTemplateSpec template) {
    this.template = template;
    return this;
  }

  /**
   * Get template
   * @return template
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public V1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(@jakarta.annotation.Nonnull V1PodTemplateSpec template) {
    this.template = template;
  }


  public V1JobSpec ttlSecondsAfterFinished(@jakarta.annotation.Nullable Integer ttlSecondsAfterFinished) {
    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    return this;
  }

  /**
   * ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won&#39;t be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes.
   * @return ttlSecondsAfterFinished
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes.")
  public Integer getTtlSecondsAfterFinished() {
    return ttlSecondsAfterFinished;
  }

  public void setTtlSecondsAfterFinished(@jakarta.annotation.Nullable Integer ttlSecondsAfterFinished) {
    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
  }



  @Override
  public boolean equals(Object o) {
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
        Objects.equals(this.managedBy, v1JobSpec.managedBy) &&
        Objects.equals(this.manualSelector, v1JobSpec.manualSelector) &&
        Objects.equals(this.maxFailedIndexes, v1JobSpec.maxFailedIndexes) &&
        Objects.equals(this.parallelism, v1JobSpec.parallelism) &&
        Objects.equals(this.podFailurePolicy, v1JobSpec.podFailurePolicy) &&
        Objects.equals(this.podReplacementPolicy, v1JobSpec.podReplacementPolicy) &&
        Objects.equals(this.selector, v1JobSpec.selector) &&
        Objects.equals(this.successPolicy, v1JobSpec.successPolicy) &&
        Objects.equals(this.suspend, v1JobSpec.suspend) &&
        Objects.equals(this.template, v1JobSpec.template) &&
        Objects.equals(this.ttlSecondsAfterFinished, v1JobSpec.ttlSecondsAfterFinished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDeadlineSeconds, backoffLimit, backoffLimitPerIndex, completionMode, completions, managedBy, manualSelector, maxFailedIndexes, parallelism, podFailurePolicy, podReplacementPolicy, selector, successPolicy, suspend, template, ttlSecondsAfterFinished);
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
    sb.append("    managedBy: ").append(toIndentedString(managedBy)).append("\n");
    sb.append("    manualSelector: ").append(toIndentedString(manualSelector)).append("\n");
    sb.append("    maxFailedIndexes: ").append(toIndentedString(maxFailedIndexes)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    podFailurePolicy: ").append(toIndentedString(podFailurePolicy)).append("\n");
    sb.append("    podReplacementPolicy: ").append(toIndentedString(podReplacementPolicy)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    successPolicy: ").append(toIndentedString(successPolicy)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("activeDeadlineSeconds");
    openapiFields.add("backoffLimit");
    openapiFields.add("backoffLimitPerIndex");
    openapiFields.add("completionMode");
    openapiFields.add("completions");
    openapiFields.add("managedBy");
    openapiFields.add("manualSelector");
    openapiFields.add("maxFailedIndexes");
    openapiFields.add("parallelism");
    openapiFields.add("podFailurePolicy");
    openapiFields.add("podReplacementPolicy");
    openapiFields.add("selector");
    openapiFields.add("successPolicy");
    openapiFields.add("suspend");
    openapiFields.add("template");
    openapiFields.add("ttlSecondsAfterFinished");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("template");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1JobSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1JobSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1JobSpec is not found in the empty JSON string", V1JobSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1JobSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1JobSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1JobSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("completionMode") != null && !jsonObj.get("completionMode").isJsonNull()) && !jsonObj.get("completionMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `completionMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("completionMode").toString()));
      }
      if ((jsonObj.get("managedBy") != null && !jsonObj.get("managedBy").isJsonNull()) && !jsonObj.get("managedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `managedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("managedBy").toString()));
      }
      // validate the optional field `podFailurePolicy`
      if (jsonObj.get("podFailurePolicy") != null && !jsonObj.get("podFailurePolicy").isJsonNull()) {
        V1PodFailurePolicy.validateJsonElement(jsonObj.get("podFailurePolicy"));
      }
      if ((jsonObj.get("podReplacementPolicy") != null && !jsonObj.get("podReplacementPolicy").isJsonNull()) && !jsonObj.get("podReplacementPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `podReplacementPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("podReplacementPolicy").toString()));
      }
      // validate the optional field `selector`
      if (jsonObj.get("selector") != null && !jsonObj.get("selector").isJsonNull()) {
        V1LabelSelector.validateJsonElement(jsonObj.get("selector"));
      }
      // validate the optional field `successPolicy`
      if (jsonObj.get("successPolicy") != null && !jsonObj.get("successPolicy").isJsonNull()) {
        V1SuccessPolicy.validateJsonElement(jsonObj.get("successPolicy"));
      }
      // validate the required field `template`
      V1PodTemplateSpec.validateJsonElement(jsonObj.get("template"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1JobSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1JobSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1JobSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1JobSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1JobSpec>() {
           @Override
           public void write(JsonWriter out, V1JobSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1JobSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1JobSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1JobSpec
   * @throws IOException if the JSON string is invalid with respect to V1JobSpec
   */
  public static V1JobSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1JobSpec.class);
  }

  /**
   * Convert an instance of V1JobSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
