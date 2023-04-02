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
import java.util.List;
import java.util.Objects;

/** Required. A pod affinity term, associated with the corresponding weight. */
@ApiModel(description = "Required. A pod affinity term, associated with the corresponding weight.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTerm {
  public static final String SERIALIZED_NAME_LABEL_SELECTOR = "labelSelector";

  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR)
  private
  V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTermLabelSelector
      labelSelector;

  public static final String SERIALIZED_NAME_NAMESPACES = "namespaces";

  @SerializedName(SERIALIZED_NAME_NAMESPACES)
  private List<String> namespaces = null;

  public static final String SERIALIZED_NAME_TOPOLOGY_KEY = "topologyKey";

  @SerializedName(SERIALIZED_NAME_TOPOLOGY_KEY)
  private String topologyKey;

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTerm
      labelSelector(
          V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTermLabelSelector
              labelSelector) {

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
  public
  V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTermLabelSelector
      getLabelSelector() {
    return labelSelector;
  }

  public void setLabelSelector(
      V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTermLabelSelector
          labelSelector) {
    this.labelSelector = labelSelector;
  }

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTerm
      namespaces(List<String> namespaces) {

    this.namespaces = namespaces;
    return this;
  }

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTerm
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

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTerm
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
    V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTerm
        v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTerm =
            (V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTerm)
                o;
    return Objects.equals(
            this.labelSelector,
            v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTerm
                .labelSelector)
        && Objects.equals(
            this.namespaces,
            v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTerm
                .namespaces)
        && Objects.equals(
            this.topologyKey,
            v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTerm
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
        "class V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTerm {\n");
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
