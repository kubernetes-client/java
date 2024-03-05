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
 * If the affinity requirements specified by this field are not met at scheduling time, the pod will
 * not be scheduled onto the node. If the affinity requirements specified by this field cease to be
 * met at some point during pod execution (e.g. due to an update), the system may or may not try to
 * eventually evict the pod from its node.
 */
@ApiModel(
    description =
        "If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution {
  public static final String SERIALIZED_NAME_NODE_SELECTOR_TERMS = "nodeSelectorTerms";

  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR_TERMS)
  private List<
          V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms>
      nodeSelectorTerms =
          new ArrayList<
              V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms>();

  public V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution
      nodeSelectorTerms(
          List<
                  V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms>
              nodeSelectorTerms) {

    this.nodeSelectorTerms = nodeSelectorTerms;
    return this;
  }

  public V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution
      addNodeSelectorTermsItem(
          V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms
              nodeSelectorTermsItem) {
    this.nodeSelectorTerms.add(nodeSelectorTermsItem);
    return this;
  }

  /**
   * Required. A list of node selector terms. The terms are ORed.
   *
   * @return nodeSelectorTerms
   */
  @ApiModelProperty(
      required = true,
      value = "Required. A list of node selector terms. The terms are ORed.")
  public List<
          V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms>
      getNodeSelectorTerms() {
    return nodeSelectorTerms;
  }

  public void setNodeSelectorTerms(
      List<
              V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms>
          nodeSelectorTerms) {
    this.nodeSelectorTerms = nodeSelectorTerms;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution
        v1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution =
            (V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution) o;
    return Objects.equals(
        this.nodeSelectorTerms,
        v1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution
            .nodeSelectorTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeSelectorTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class V1ThanosRulerSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution {\n");
    sb.append("    nodeSelectorTerms: ").append(toIndentedString(nodeSelectorTerms)).append("\n");
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
