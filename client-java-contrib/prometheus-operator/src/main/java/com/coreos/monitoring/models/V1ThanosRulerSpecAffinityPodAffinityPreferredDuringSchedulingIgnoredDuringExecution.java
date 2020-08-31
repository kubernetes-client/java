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
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution {
  public static final String SERIALIZED_NAME_POD_AFFINITY_TERM = "podAffinityTerm";

  @SerializedName(SERIALIZED_NAME_POD_AFFINITY_TERM)
  private V1ThanosRulerSpecAffinityPodAffinityPodAffinityTerm podAffinityTerm;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";

  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;

  public V1ThanosRulerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution
      podAffinityTerm(V1ThanosRulerSpecAffinityPodAffinityPodAffinityTerm podAffinityTerm) {

    this.podAffinityTerm = podAffinityTerm;
    return this;
  }

  /**
   * Get podAffinityTerm
   *
   * @return podAffinityTerm
   */
  @ApiModelProperty(required = true, value = "")
  public V1ThanosRulerSpecAffinityPodAffinityPodAffinityTerm getPodAffinityTerm() {
    return podAffinityTerm;
  }

  public void setPodAffinityTerm(
      V1ThanosRulerSpecAffinityPodAffinityPodAffinityTerm podAffinityTerm) {
    this.podAffinityTerm = podAffinityTerm;
  }

  public V1ThanosRulerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution weight(
      Integer weight) {

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
    V1ThanosRulerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution
        v1ThanosRulerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution =
            (V1ThanosRulerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution) o;
    return Objects.equals(
            this.podAffinityTerm,
            v1ThanosRulerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution
                .podAffinityTerm)
        && Objects.equals(
            this.weight,
            v1ThanosRulerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution
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
        "class V1ThanosRulerSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution {\n");
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
