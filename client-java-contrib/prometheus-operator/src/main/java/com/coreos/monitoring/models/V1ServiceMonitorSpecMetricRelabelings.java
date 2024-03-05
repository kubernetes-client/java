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

/**
 * RelabelConfig allows dynamic rewriting of the label set, being applied to samples before
 * ingestion. It defines &#x60;&lt;metric_relabel_configs&gt;&#x60;-section of Prometheus
 * configuration. More info:
 * https://prometheus.io/docs/prometheus/latest/configuration/configuration/#metric_relabel_configs
 */
@ApiModel(
    description =
        "RelabelConfig allows dynamic rewriting of the label set, being applied to samples before ingestion. It defines `<metric_relabel_configs>`-section of Prometheus configuration. More info: https://prometheus.io/docs/prometheus/latest/configuration/configuration/#metric_relabel_configs")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ServiceMonitorSpecMetricRelabelings {
  public static final String SERIALIZED_NAME_ACTION = "action";

  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_MODULUS = "modulus";

  @SerializedName(SERIALIZED_NAME_MODULUS)
  private Long modulus;

  public static final String SERIALIZED_NAME_REGEX = "regex";

  @SerializedName(SERIALIZED_NAME_REGEX)
  private String regex;

  public static final String SERIALIZED_NAME_REPLACEMENT = "replacement";

  @SerializedName(SERIALIZED_NAME_REPLACEMENT)
  private String replacement;

  public static final String SERIALIZED_NAME_SEPARATOR = "separator";

  @SerializedName(SERIALIZED_NAME_SEPARATOR)
  private String separator;

  public static final String SERIALIZED_NAME_SOURCE_LABELS = "sourceLabels";

  @SerializedName(SERIALIZED_NAME_SOURCE_LABELS)
  private List<String> sourceLabels = null;

  public static final String SERIALIZED_NAME_TARGET_LABEL = "targetLabel";

  @SerializedName(SERIALIZED_NAME_TARGET_LABEL)
  private String targetLabel;

  public V1ServiceMonitorSpecMetricRelabelings action(String action) {

    this.action = action;
    return this;
  }

  /**
   * Action to perform based on regex matching. Default is &#39;replace&#39;
   *
   * @return action
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Action to perform based on regex matching. Default is 'replace'")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public V1ServiceMonitorSpecMetricRelabelings modulus(Long modulus) {

    this.modulus = modulus;
    return this;
  }

  /**
   * Modulus to take of the hash of the source label values.
   *
   * @return modulus
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Modulus to take of the hash of the source label values.")
  public Long getModulus() {
    return modulus;
  }

  public void setModulus(Long modulus) {
    this.modulus = modulus;
  }

  public V1ServiceMonitorSpecMetricRelabelings regex(String regex) {

    this.regex = regex;
    return this;
  }

  /**
   * Regular expression against which the extracted value is matched. Default is &#39;(.*)&#39;
   *
   * @return regex
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Regular expression against which the extracted value is matched. Default is '(.*)'")
  public String getRegex() {
    return regex;
  }

  public void setRegex(String regex) {
    this.regex = regex;
  }

  public V1ServiceMonitorSpecMetricRelabelings replacement(String replacement) {

    this.replacement = replacement;
    return this;
  }

  /**
   * Replacement value against which a regex replace is performed if the regular expression matches.
   * Regex capture groups are available. Default is &#39;$1&#39;
   *
   * @return replacement
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Replacement value against which a regex replace is performed if the regular expression matches. Regex capture groups are available. Default is '$1'")
  public String getReplacement() {
    return replacement;
  }

  public void setReplacement(String replacement) {
    this.replacement = replacement;
  }

  public V1ServiceMonitorSpecMetricRelabelings separator(String separator) {

    this.separator = separator;
    return this;
  }

  /**
   * Separator placed between concatenated source label values. default is &#39;;&#39;.
   *
   * @return separator
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Separator placed between concatenated source label values. default is ';'.")
  public String getSeparator() {
    return separator;
  }

  public void setSeparator(String separator) {
    this.separator = separator;
  }

  public V1ServiceMonitorSpecMetricRelabelings sourceLabels(List<String> sourceLabels) {

    this.sourceLabels = sourceLabels;
    return this;
  }

  public V1ServiceMonitorSpecMetricRelabelings addSourceLabelsItem(String sourceLabelsItem) {
    if (this.sourceLabels == null) {
      this.sourceLabels = new ArrayList<String>();
    }
    this.sourceLabels.add(sourceLabelsItem);
    return this;
  }

  /**
   * The source labels select values from existing labels. Their content is concatenated using the
   * configured separator and matched against the configured regular expression for the replace,
   * keep, and drop actions.
   *
   * @return sourceLabels
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The source labels select values from existing labels. Their content is concatenated using the configured separator and matched against the configured regular expression for the replace, keep, and drop actions.")
  public List<String> getSourceLabels() {
    return sourceLabels;
  }

  public void setSourceLabels(List<String> sourceLabels) {
    this.sourceLabels = sourceLabels;
  }

  public V1ServiceMonitorSpecMetricRelabelings targetLabel(String targetLabel) {

    this.targetLabel = targetLabel;
    return this;
  }

  /**
   * Label to which the resulting value is written in a replace action. It is mandatory for replace
   * actions. Regex capture groups are available.
   *
   * @return targetLabel
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Label to which the resulting value is written in a replace action. It is mandatory for replace actions. Regex capture groups are available.")
  public String getTargetLabel() {
    return targetLabel;
  }

  public void setTargetLabel(String targetLabel) {
    this.targetLabel = targetLabel;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ServiceMonitorSpecMetricRelabelings v1ServiceMonitorSpecMetricRelabelings =
        (V1ServiceMonitorSpecMetricRelabelings) o;
    return Objects.equals(this.action, v1ServiceMonitorSpecMetricRelabelings.action)
        && Objects.equals(this.modulus, v1ServiceMonitorSpecMetricRelabelings.modulus)
        && Objects.equals(this.regex, v1ServiceMonitorSpecMetricRelabelings.regex)
        && Objects.equals(this.replacement, v1ServiceMonitorSpecMetricRelabelings.replacement)
        && Objects.equals(this.separator, v1ServiceMonitorSpecMetricRelabelings.separator)
        && Objects.equals(this.sourceLabels, v1ServiceMonitorSpecMetricRelabelings.sourceLabels)
        && Objects.equals(this.targetLabel, v1ServiceMonitorSpecMetricRelabelings.targetLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, modulus, regex, replacement, separator, sourceLabels, targetLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServiceMonitorSpecMetricRelabelings {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    modulus: ").append(toIndentedString(modulus)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    replacement: ").append(toIndentedString(replacement)).append("\n");
    sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
    sb.append("    sourceLabels: ").append(toIndentedString(sourceLabels)).append("\n");
    sb.append("    targetLabel: ").append(toIndentedString(targetLabel)).append("\n");
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
