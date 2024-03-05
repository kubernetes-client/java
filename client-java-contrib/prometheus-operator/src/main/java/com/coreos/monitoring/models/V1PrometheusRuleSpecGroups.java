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
 * RuleGroup is a list of sequentially evaluated recording and alerting rules. Note:
 * PartialResponseStrategy is only used by ThanosRuler and will be ignored by Prometheus instances.
 * Valid values for this field are &#39;warn&#39; or &#39;abort&#39;. More info:
 * https://github.com/thanos-io/thanos/blob/master/docs/components/rule.md#partial-response
 */
@ApiModel(
    description =
        "RuleGroup is a list of sequentially evaluated recording and alerting rules. Note: PartialResponseStrategy is only used by ThanosRuler and will be ignored by Prometheus instances.  Valid values for this field are 'warn' or 'abort'.  More info: https://github.com/thanos-io/thanos/blob/master/docs/components/rule.md#partial-response")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1PrometheusRuleSpecGroups {
  public static final String SERIALIZED_NAME_INTERVAL = "interval";

  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private String interval;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARTIAL_RESPONSE_STRATEGY =
      "partial_response_strategy";

  @SerializedName(SERIALIZED_NAME_PARTIAL_RESPONSE_STRATEGY)
  private String partialResponseStrategy;

  public static final String SERIALIZED_NAME_RULES = "rules";

  @SerializedName(SERIALIZED_NAME_RULES)
  private List<V1PrometheusRuleSpecRules> rules = new ArrayList<V1PrometheusRuleSpecRules>();

  public V1PrometheusRuleSpecGroups interval(String interval) {

    this.interval = interval;
    return this;
  }

  /**
   * Get interval
   *
   * @return interval
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public V1PrometheusRuleSpecGroups name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1PrometheusRuleSpecGroups partialResponseStrategy(String partialResponseStrategy) {

    this.partialResponseStrategy = partialResponseStrategy;
    return this;
  }

  /**
   * Get partialResponseStrategy
   *
   * @return partialResponseStrategy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getPartialResponseStrategy() {
    return partialResponseStrategy;
  }

  public void setPartialResponseStrategy(String partialResponseStrategy) {
    this.partialResponseStrategy = partialResponseStrategy;
  }

  public V1PrometheusRuleSpecGroups rules(List<V1PrometheusRuleSpecRules> rules) {

    this.rules = rules;
    return this;
  }

  public V1PrometheusRuleSpecGroups addRulesItem(V1PrometheusRuleSpecRules rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * Get rules
   *
   * @return rules
   */
  @ApiModelProperty(required = true, value = "")
  public List<V1PrometheusRuleSpecRules> getRules() {
    return rules;
  }

  public void setRules(List<V1PrometheusRuleSpecRules> rules) {
    this.rules = rules;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PrometheusRuleSpecGroups v1PrometheusRuleSpecGroups = (V1PrometheusRuleSpecGroups) o;
    return Objects.equals(this.interval, v1PrometheusRuleSpecGroups.interval)
        && Objects.equals(this.name, v1PrometheusRuleSpecGroups.name)
        && Objects.equals(
            this.partialResponseStrategy, v1PrometheusRuleSpecGroups.partialResponseStrategy)
        && Objects.equals(this.rules, v1PrometheusRuleSpecGroups.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, name, partialResponseStrategy, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusRuleSpecGroups {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    partialResponseStrategy: ")
        .append(toIndentedString(partialResponseStrategy))
        .append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
