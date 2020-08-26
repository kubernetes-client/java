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
package io.cert.manager.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * PodSpec defines overrides for the HTTP01 challenge solver pod. Only the &#39;nodeSelector&#39;,
 * &#39;affinity&#39; and &#39;tolerations&#39; fields are supported currently. All other fields
 * will be ignored.
 */
@ApiModel(
    description =
        "PodSpec defines overrides for the HTTP01 challenge solver pod. Only the 'nodeSelector', 'affinity' and 'tolerations' fields are supported currently. All other fields will be ignored.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpec {
  public static final String SERIALIZED_NAME_AFFINITY = "affinity";

  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinity affinity;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";

  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = null;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";

  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private List<V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecTolerations> tolerations = null;

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpec affinity(
      V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinity affinity) {

    this.affinity = affinity;
    return this;
  }

  /**
   * Get affinity
   *
   * @return affinity
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinity getAffinity() {
    return affinity;
  }

  public void setAffinity(V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinity affinity) {
    this.affinity = affinity;
  }

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpec nodeSelector(
      Map<String, String> nodeSelector) {

    this.nodeSelector = nodeSelector;
    return this;
  }

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpec putNodeSelectorItem(
      String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<String, String>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

  /**
   * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must
   * match a node&#39;s labels for the pod to be scheduled on that node. More info:
   * https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
   *
   * @return nodeSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/")
  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }

  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpec tolerations(
      List<V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecTolerations> tolerations) {

    this.tolerations = tolerations;
    return this;
  }

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpec addTolerationsItem(
      V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecTolerations tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations =
          new ArrayList<V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecTolerations>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

  /**
   * If specified, the pod&#39;s tolerations.
   *
   * @return tolerations
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the pod's tolerations.")
  public List<V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecTolerations> getTolerations() {
    return tolerations;
  }

  public void setTolerations(
      List<V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecTolerations> tolerations) {
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
    V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpec
        v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpec =
            (V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpec) o;
    return Objects.equals(
            this.affinity, v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpec.affinity)
        && Objects.equals(
            this.nodeSelector, v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpec.nodeSelector)
        && Objects.equals(
            this.tolerations, v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpec.tolerations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinity, nodeSelector, tolerations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpec {\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
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
