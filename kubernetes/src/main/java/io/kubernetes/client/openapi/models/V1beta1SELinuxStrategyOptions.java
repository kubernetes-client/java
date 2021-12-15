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
import java.util.Objects;

/** SELinuxStrategyOptions defines the strategy type and any options used to create the strategy. */
@ApiModel(
    description =
        "SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1beta1SELinuxStrategyOptions {
  public static final String SERIALIZED_NAME_RULE = "rule";

  @SerializedName(SERIALIZED_NAME_RULE)
  private String rule;

  public static final String SERIALIZED_NAME_SE_LINUX_OPTIONS = "seLinuxOptions";

  @SerializedName(SERIALIZED_NAME_SE_LINUX_OPTIONS)
  private V1SELinuxOptions seLinuxOptions;

  public V1beta1SELinuxStrategyOptions rule(String rule) {

    this.rule = rule;
    return this;
  }

  /**
   * rule is the strategy that will dictate the allowable labels that may be set.
   *
   * @return rule
   */
  @ApiModelProperty(
      required = true,
      value = "rule is the strategy that will dictate the allowable labels that may be set.")
  public String getRule() {
    return rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }

  public V1beta1SELinuxStrategyOptions seLinuxOptions(V1SELinuxOptions seLinuxOptions) {

    this.seLinuxOptions = seLinuxOptions;
    return this;
  }

  /**
   * Get seLinuxOptions
   *
   * @return seLinuxOptions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1SELinuxOptions getSeLinuxOptions() {
    return seLinuxOptions;
  }

  public void setSeLinuxOptions(V1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1SELinuxStrategyOptions v1beta1SELinuxStrategyOptions = (V1beta1SELinuxStrategyOptions) o;
    return Objects.equals(this.rule, v1beta1SELinuxStrategyOptions.rule)
        && Objects.equals(this.seLinuxOptions, v1beta1SELinuxStrategyOptions.seLinuxOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rule, seLinuxOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1SELinuxStrategyOptions {\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    seLinuxOptions: ").append(toIndentedString(seLinuxOptions)).append("\n");
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
