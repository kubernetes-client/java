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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * RunAsUserStrategyOptions defines the strategy type and any options used to create the strategy.
 */
@ApiModel(
    description =
        "RunAsUserStrategyOptions defines the strategy type and any options used to create the strategy.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1beta1RunAsUserStrategyOptions {
  public static final String SERIALIZED_NAME_RANGES = "ranges";

  @SerializedName(SERIALIZED_NAME_RANGES)
  private List<V1beta1IDRange> ranges = null;

  public static final String SERIALIZED_NAME_RULE = "rule";

  @SerializedName(SERIALIZED_NAME_RULE)
  private String rule;

  public V1beta1RunAsUserStrategyOptions ranges(List<V1beta1IDRange> ranges) {

    this.ranges = ranges;
    return this;
  }

  public V1beta1RunAsUserStrategyOptions addRangesItem(V1beta1IDRange rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<>();
    }
    this.ranges.add(rangesItem);
    return this;
  }

  /**
   * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
   * then supply a single range with the same start and end. Required for MustRunAs.
   *
   * @return ranges
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ranges are the allowed ranges of uids that may be used. If you would like to force a single uid then supply a single range with the same start and end. Required for MustRunAs.")
  public List<V1beta1IDRange> getRanges() {
    return ranges;
  }

  public void setRanges(List<V1beta1IDRange> ranges) {
    this.ranges = ranges;
  }

  public V1beta1RunAsUserStrategyOptions rule(String rule) {

    this.rule = rule;
    return this;
  }

  /**
   * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
   *
   * @return rule
   */
  @ApiModelProperty(
      required = true,
      value =
          "rule is the strategy that will dictate the allowable RunAsUser values that may be set.")
  public String getRule() {
    return rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1RunAsUserStrategyOptions v1beta1RunAsUserStrategyOptions =
        (V1beta1RunAsUserStrategyOptions) o;
    return Objects.equals(this.ranges, v1beta1RunAsUserStrategyOptions.ranges)
        && Objects.equals(this.rule, v1beta1RunAsUserStrategyOptions.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranges, rule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1RunAsUserStrategyOptions {\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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
