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
 * Defines a set of pods (namely those matching the labelSelector relative to the given
 * namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity)
 * with, where co-located is defined as running on a node whose value of the label with key
 * &lt;topologyKey&gt; matches that of any node on which a pod of the set of pods is running
 */
@ApiModel(
    description =
        "Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution {
  public static final String SERIALIZED_NAME_LABEL_SELECTOR = "labelSelector";

  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR)
  private V1ThanosRulerSpecAffinityPodAffinityPodAffinityTermLabelSelector labelSelector;

  public static final String SERIALIZED_NAME_NAMESPACES = "namespaces";

  @SerializedName(SERIALIZED_NAME_NAMESPACES)
  private List<String> namespaces = null;

  public static final String SERIALIZED_NAME_TOPOLOGY_KEY = "topologyKey";

  @SerializedName(SERIALIZED_NAME_TOPOLOGY_KEY)
  private String topologyKey;

  public V1ThanosRulerSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution
      labelSelector(
          V1ThanosRulerSpecAffinityPodAffinityPodAffinityTermLabelSelector labelSelector) {

    this.labelSelector = labelSelector;
    return this;
  }

  /**
   * Get labelSelector
   *
   * @return labelSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecAffinityPodAffinityPodAffinityTermLabelSelector getLabelSelector() {
    return labelSelector;
  }

  public void setLabelSelector(
      V1ThanosRulerSpecAffinityPodAffinityPodAffinityTermLabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }

  public V1ThanosRulerSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution
      namespaces(List<String> namespaces) {

    this.namespaces = namespaces;
    return this;
  }

  public V1ThanosRulerSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution
      addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<String>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

  /**
   * namespaces specifies which namespaces the labelSelector applies to (matches against); null or
   * empty list means \&quot;this pod&#39;s namespace\&quot;
   *
   * @return namespaces
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means \"this pod's namespace\"")
  public List<String> getNamespaces() {
    return namespaces;
  }

  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }

  public V1ThanosRulerSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution
      topologyKey(String topologyKey) {

    this.topologyKey = topologyKey;
    return this;
  }

  /**
   * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods
   * matching the labelSelector in the specified namespaces, where co-located is defined as running
   * on a node whose value of the label with key topologyKey matches that of any node on which any
   * of the selected pods is running. Empty topologyKey is not allowed.
   *
   * @return topologyKey
   */
  @ApiModelProperty(
      required = true,
      value =
          "This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.")
  public String getTopologyKey() {
    return topologyKey;
  }

  public void setTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution
        v1ThanosRulerSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution =
            (V1ThanosRulerSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution) o;
    return Objects.equals(
            this.labelSelector,
            v1ThanosRulerSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution
                .labelSelector)
        && Objects.equals(
            this.namespaces,
            v1ThanosRulerSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution
                .namespaces)
        && Objects.equals(
            this.topologyKey,
            v1ThanosRulerSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution
                .topologyKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSelector, namespaces, topologyKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class V1ThanosRulerSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution {\n");
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    topologyKey: ").append(toIndentedString(topologyKey)).append("\n");
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
