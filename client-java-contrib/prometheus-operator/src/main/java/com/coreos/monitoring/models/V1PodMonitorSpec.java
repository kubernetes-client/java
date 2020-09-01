/*
Copyright 2020 The Kubernetes Authors.
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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Specification of desired Pod selection for target discovery by Prometheus. */
@ApiModel(
    description = "Specification of desired Pod selection for target discovery by Prometheus.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1PodMonitorSpec {
  public static final String SERIALIZED_NAME_JOB_LABEL = "jobLabel";

  @SerializedName(SERIALIZED_NAME_JOB_LABEL)
  private String jobLabel;

  public static final String SERIALIZED_NAME_NAMESPACE_SELECTOR = "namespaceSelector";

  @SerializedName(SERIALIZED_NAME_NAMESPACE_SELECTOR)
  private V1ServiceMonitorSpecNamespaceSelector namespaceSelector;

  public static final String SERIALIZED_NAME_POD_METRICS_ENDPOINTS = "podMetricsEndpoints";

  @SerializedName(SERIALIZED_NAME_POD_METRICS_ENDPOINTS)
  private List<V1PodMonitorSpecPodMetricsEndpoints> podMetricsEndpoints =
      new ArrayList<V1PodMonitorSpecPodMetricsEndpoints>();

  public static final String SERIALIZED_NAME_POD_TARGET_LABELS = "podTargetLabels";

  @SerializedName(SERIALIZED_NAME_POD_TARGET_LABELS)
  private List<String> podTargetLabels = null;

  public static final String SERIALIZED_NAME_SAMPLE_LIMIT = "sampleLimit";

  @SerializedName(SERIALIZED_NAME_SAMPLE_LIMIT)
  private Long sampleLimit;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";

  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1PodMonitorSpecSelector selector;

  public V1PodMonitorSpec jobLabel(String jobLabel) {

    this.jobLabel = jobLabel;
    return this;
  }

  /**
   * The label to use to retrieve the job name from.
   *
   * @return jobLabel
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The label to use to retrieve the job name from.")
  public String getJobLabel() {
    return jobLabel;
  }

  public void setJobLabel(String jobLabel) {
    this.jobLabel = jobLabel;
  }

  public V1PodMonitorSpec namespaceSelector(
      V1ServiceMonitorSpecNamespaceSelector namespaceSelector) {

    this.namespaceSelector = namespaceSelector;
    return this;
  }

  /**
   * Get namespaceSelector
   *
   * @return namespaceSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ServiceMonitorSpecNamespaceSelector getNamespaceSelector() {
    return namespaceSelector;
  }

  public void setNamespaceSelector(V1ServiceMonitorSpecNamespaceSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }

  public V1PodMonitorSpec podMetricsEndpoints(
      List<V1PodMonitorSpecPodMetricsEndpoints> podMetricsEndpoints) {

    this.podMetricsEndpoints = podMetricsEndpoints;
    return this;
  }

  public V1PodMonitorSpec addPodMetricsEndpointsItem(
      V1PodMonitorSpecPodMetricsEndpoints podMetricsEndpointsItem) {
    this.podMetricsEndpoints.add(podMetricsEndpointsItem);
    return this;
  }

  /**
   * A list of endpoints allowed as part of this PodMonitor.
   *
   * @return podMetricsEndpoints
   */
  @ApiModelProperty(
      required = true,
      value = "A list of endpoints allowed as part of this PodMonitor.")
  public List<V1PodMonitorSpecPodMetricsEndpoints> getPodMetricsEndpoints() {
    return podMetricsEndpoints;
  }

  public void setPodMetricsEndpoints(
      List<V1PodMonitorSpecPodMetricsEndpoints> podMetricsEndpoints) {
    this.podMetricsEndpoints = podMetricsEndpoints;
  }

  public V1PodMonitorSpec podTargetLabels(List<String> podTargetLabels) {

    this.podTargetLabels = podTargetLabels;
    return this;
  }

  public V1PodMonitorSpec addPodTargetLabelsItem(String podTargetLabelsItem) {
    if (this.podTargetLabels == null) {
      this.podTargetLabels = new ArrayList<String>();
    }
    this.podTargetLabels.add(podTargetLabelsItem);
    return this;
  }

  /**
   * PodTargetLabels transfers labels on the Kubernetes Pod onto the target.
   *
   * @return podTargetLabels
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "PodTargetLabels transfers labels on the Kubernetes Pod onto the target.")
  public List<String> getPodTargetLabels() {
    return podTargetLabels;
  }

  public void setPodTargetLabels(List<String> podTargetLabels) {
    this.podTargetLabels = podTargetLabels;
  }

  public V1PodMonitorSpec sampleLimit(Long sampleLimit) {

    this.sampleLimit = sampleLimit;
    return this;
  }

  /**
   * SampleLimit defines per-scrape limit on number of scraped samples that will be accepted.
   *
   * @return sampleLimit
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "SampleLimit defines per-scrape limit on number of scraped samples that will be accepted.")
  public Long getSampleLimit() {
    return sampleLimit;
  }

  public void setSampleLimit(Long sampleLimit) {
    this.sampleLimit = sampleLimit;
  }

  public V1PodMonitorSpec selector(V1PodMonitorSpecSelector selector) {

    this.selector = selector;
    return this;
  }

  /**
   * Get selector
   *
   * @return selector
   */
  @ApiModelProperty(required = true, value = "")
  public V1PodMonitorSpecSelector getSelector() {
    return selector;
  }

  public void setSelector(V1PodMonitorSpecSelector selector) {
    this.selector = selector;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodMonitorSpec v1PodMonitorSpec = (V1PodMonitorSpec) o;
    return Objects.equals(this.jobLabel, v1PodMonitorSpec.jobLabel)
        && Objects.equals(this.namespaceSelector, v1PodMonitorSpec.namespaceSelector)
        && Objects.equals(this.podMetricsEndpoints, v1PodMonitorSpec.podMetricsEndpoints)
        && Objects.equals(this.podTargetLabels, v1PodMonitorSpec.podTargetLabels)
        && Objects.equals(this.sampleLimit, v1PodMonitorSpec.sampleLimit)
        && Objects.equals(this.selector, v1PodMonitorSpec.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        jobLabel, namespaceSelector, podMetricsEndpoints, podTargetLabels, sampleLimit, selector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodMonitorSpec {\n");
    sb.append("    jobLabel: ").append(toIndentedString(jobLabel)).append("\n");
    sb.append("    namespaceSelector: ").append(toIndentedString(namespaceSelector)).append("\n");
    sb.append("    podMetricsEndpoints: ")
        .append(toIndentedString(podMetricsEndpoints))
        .append("\n");
    sb.append("    podTargetLabels: ").append(toIndentedString(podTargetLabels)).append("\n");
    sb.append("    sampleLimit: ").append(toIndentedString(sampleLimit)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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
