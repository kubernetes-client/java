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

/**
 * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the
 * most preferred node(s)
 */
@ApiModel(
    description =
        "The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public
class V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution {
  public static final String SERIALIZED_NAME_POD_AFFINITY_TERM = "podAffinityTerm";

  @SerializedName(SERIALIZED_NAME_POD_AFFINITY_TERM)
  private V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTerm
      podAffinityTerm;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";

  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;

  public
  V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution
      podAffinityTerm(
          V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTerm
              podAffinityTerm) {

    this.podAffinityTerm = podAffinityTerm;
    return this;
  }

  /**
   * Get podAffinityTerm
   *
   * @return podAffinityTerm
   */
  @ApiModelProperty(required = true, value = "")
  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTerm
      getPodAffinityTerm() {
    return podAffinityTerm;
  }

  public void setPodAffinityTerm(
      V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPodAffinityTerm
          podAffinityTerm) {
    this.podAffinityTerm = podAffinityTerm;
  }

  public
  V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution
      weight(Integer weight) {

    this.weight = weight;
    return this;
  }

  /**
   * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
   *
   * @return weight
   */
  @ApiModelProperty(
      required = true,
      value =
          "weight associated with matching the corresponding podAffinityTerm, in the range 1-100.")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution
        v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution =
            (V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution)
                o;
    return Objects.equals(
            this.podAffinityTerm,
            v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution
                .podAffinityTerm)
        && Objects.equals(
            this.weight,
            v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution
                .weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podAffinityTerm, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution {\n");
    sb.append("    podAffinityTerm: ").append(toIndentedString(podAffinityTerm)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
