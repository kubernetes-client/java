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
import java.util.Objects;

/** If specified, the pod&#39;s scheduling constraints */
@ApiModel(description = "If specified, the pod's scheduling constraints")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinity {
  public static final String SERIALIZED_NAME_NODE_AFFINITY = "nodeAffinity";

  @SerializedName(SERIALIZED_NAME_NODE_AFFINITY)
  private V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinity nodeAffinity;

  public static final String SERIALIZED_NAME_POD_AFFINITY = "podAffinity";

  @SerializedName(SERIALIZED_NAME_POD_AFFINITY)
  private V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinity podAffinity;

  public static final String SERIALIZED_NAME_POD_ANTI_AFFINITY = "podAntiAffinity";

  @SerializedName(SERIALIZED_NAME_POD_ANTI_AFFINITY)
  private V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinity nodeAffinity(
      V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinity nodeAffinity) {

    this.nodeAffinity = nodeAffinity;
    return this;
  }

  /**
   * Get nodeAffinity
   *
   * @return nodeAffinity
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinity getNodeAffinity() {
    return nodeAffinity;
  }

  public void setNodeAffinity(
      V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
  }

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinity podAffinity(
      V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinity podAffinity) {

    this.podAffinity = podAffinity;
    return this;
  }

  /**
   * Get podAffinity
   *
   * @return podAffinity
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinity getPodAffinity() {
    return podAffinity;
  }

  public void setPodAffinity(
      V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinity podAffinity) {
    this.podAffinity = podAffinity;
  }

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinity podAntiAffinity(
      V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {

    this.podAntiAffinity = podAntiAffinity;
    return this;
  }

  /**
   * Get podAntiAffinity
   *
   * @return podAntiAffinity
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAntiAffinity
      getPodAntiAffinity() {
    return podAntiAffinity;
  }

  public void setPodAntiAffinity(
      V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
    this.podAntiAffinity = podAntiAffinity;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinity
        v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinity =
            (V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinity) o;
    return Objects.equals(
            this.nodeAffinity,
            v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinity.nodeAffinity)
        && Objects.equals(
            this.podAffinity,
            v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinity.podAffinity)
        && Objects.equals(
            this.podAntiAffinity,
            v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinity.podAntiAffinity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeAffinity, podAffinity, podAntiAffinity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinity {\n");
    sb.append("    nodeAffinity: ").append(toIndentedString(nodeAffinity)).append("\n");
    sb.append("    podAffinity: ").append(toIndentedString(podAffinity)).append("\n");
    sb.append("    podAntiAffinity: ").append(toIndentedString(podAntiAffinity)).append("\n");
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
