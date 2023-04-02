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

/** DaemonSetSpec is the specification of a daemon set. */
@ApiModel(description = "DaemonSetSpec is the specification of a daemon set.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1DaemonSetSpec {
  public static final String SERIALIZED_NAME_MIN_READY_SECONDS = "minReadySeconds";

  @SerializedName(SERIALIZED_NAME_MIN_READY_SECONDS)
  private Integer minReadySeconds;

  public static final String SERIALIZED_NAME_REVISION_HISTORY_LIMIT = "revisionHistoryLimit";

  @SerializedName(SERIALIZED_NAME_REVISION_HISTORY_LIMIT)
  private Integer revisionHistoryLimit;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";

  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1LabelSelector selector;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";

  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private V1PodTemplateSpec template;

  public static final String SERIALIZED_NAME_UPDATE_STRATEGY = "updateStrategy";

  @SerializedName(SERIALIZED_NAME_UPDATE_STRATEGY)
  private V1DaemonSetUpdateStrategy updateStrategy;

  public V1DaemonSetSpec minReadySeconds(Integer minReadySeconds) {

    this.minReadySeconds = minReadySeconds;
    return this;
  }

  /**
   * The minimum number of seconds for which a newly created DaemonSet pod should be ready without
   * any of its container crashing, for it to be considered available. Defaults to 0 (pod will be
   * considered available as soon as it is ready).
   *
   * @return minReadySeconds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).")
  public Integer getMinReadySeconds() {
    return minReadySeconds;
  }

  public void setMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
  }

  public V1DaemonSetSpec revisionHistoryLimit(Integer revisionHistoryLimit) {

    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

  /**
   * The number of old history to retain to allow rollback. This is a pointer to distinguish between
   * explicit zero and not specified. Defaults to 10.
   *
   * @return revisionHistoryLimit
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.")
  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }

  public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }

  public V1DaemonSetSpec selector(V1LabelSelector selector) {

    this.selector = selector;
    return this;
  }

  /**
   * Get selector
   *
   * @return selector
   */
  @ApiModelProperty(required = true, value = "")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }

  public V1DaemonSetSpec template(V1PodTemplateSpec template) {

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

  public V1DaemonSetSpec updateStrategy(V1DaemonSetUpdateStrategy updateStrategy) {

    this.updateStrategy = updateStrategy;
    return this;
  }

  /**
   * Get updateStrategy
   *
   * @return updateStrategy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1DaemonSetUpdateStrategy getUpdateStrategy() {
    return updateStrategy;
  }

  public void setUpdateStrategy(V1DaemonSetUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DaemonSetSpec v1DaemonSetSpec = (V1DaemonSetSpec) o;
    return Objects.equals(this.minReadySeconds, v1DaemonSetSpec.minReadySeconds)
        && Objects.equals(this.revisionHistoryLimit, v1DaemonSetSpec.revisionHistoryLimit)
        && Objects.equals(this.selector, v1DaemonSetSpec.selector)
        && Objects.equals(this.template, v1DaemonSetSpec.template)
        && Objects.equals(this.updateStrategy, v1DaemonSetSpec.updateStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minReadySeconds, revisionHistoryLimit, selector, template, updateStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DaemonSetSpec {\n");
    sb.append("    minReadySeconds: ").append(toIndentedString(minReadySeconds)).append("\n");
    sb.append("    revisionHistoryLimit: ")
        .append(toIndentedString(revisionHistoryLimit))
        .append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    updateStrategy: ").append(toIndentedString(updateStrategy)).append("\n");
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
