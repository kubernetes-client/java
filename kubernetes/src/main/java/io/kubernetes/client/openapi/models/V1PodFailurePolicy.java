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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** PodFailurePolicy describes how failed pods influence the backoffLimit. */
@ApiModel(description = "PodFailurePolicy describes how failed pods influence the backoffLimit.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1PodFailurePolicy {
  public static final String SERIALIZED_NAME_RULES = "rules";

  @SerializedName(SERIALIZED_NAME_RULES)
  private List<V1PodFailurePolicyRule> rules = new ArrayList<>();

  public V1PodFailurePolicy rules(List<V1PodFailurePolicyRule> rules) {

    this.rules = rules;
    return this;
  }

  public V1PodFailurePolicy addRulesItem(V1PodFailurePolicyRule rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * A list of pod failure policy rules. The rules are evaluated in order. Once a rule matches a Pod
   * failure, the remaining of the rules are ignored. When no rule matches the Pod failure, the
   * default handling applies - the counter of pod failures is incremented and it is checked against
   * the backoffLimit. At most 20 elements are allowed.
   *
   * @return rules
   */
  @ApiModelProperty(
      required = true,
      value =
          "A list of pod failure policy rules. The rules are evaluated in order. Once a rule matches a Pod failure, the remaining of the rules are ignored. When no rule matches the Pod failure, the default handling applies - the counter of pod failures is incremented and it is checked against the backoffLimit. At most 20 elements are allowed.")
  public List<V1PodFailurePolicyRule> getRules() {
    return rules;
  }

  public void setRules(List<V1PodFailurePolicyRule> rules) {
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
    V1PodFailurePolicy v1PodFailurePolicy = (V1PodFailurePolicy) o;
    return Objects.equals(this.rules, v1PodFailurePolicy.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodFailurePolicy {\n");
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
