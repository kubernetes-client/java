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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass. */
@ApiModel(
    description =
        "Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1Scheduling {
  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";

  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = null;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";

  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private List<V1Toleration> tolerations = null;

  public V1Scheduling nodeSelector(Map<String, String> nodeSelector) {

    this.nodeSelector = nodeSelector;
    return this;
  }

  public V1Scheduling putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

  /**
   * nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods
   * using this RuntimeClass can only be scheduled to a node matched by this selector. The
   * RuntimeClass nodeSelector is merged with a pod&#39;s existing nodeSelector. Any conflicts will
   * cause the pod to be rejected in admission.
   *
   * @return nodeSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod's existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.")
  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }

  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }

  public V1Scheduling tolerations(List<V1Toleration> tolerations) {

    this.tolerations = tolerations;
    return this;
  }

  public V1Scheduling addTolerationsItem(V1Toleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

  /**
   * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during
   * admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
   *
   * @return tolerations
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.")
  public List<V1Toleration> getTolerations() {
    return tolerations;
  }

  public void setTolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Scheduling v1Scheduling = (V1Scheduling) o;
    return Objects.equals(this.nodeSelector, v1Scheduling.nodeSelector)
        && Objects.equals(this.tolerations, v1Scheduling.tolerations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeSelector, tolerations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Scheduling {\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
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
