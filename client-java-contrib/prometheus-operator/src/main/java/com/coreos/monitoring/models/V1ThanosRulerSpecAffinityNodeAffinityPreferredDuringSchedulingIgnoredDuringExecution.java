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
 * An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it&#39;s a
 * no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
 */
@ApiModel(
    description =
        "An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution {
  public static final String SERIALIZED_NAME_PREFERENCE = "preference";

  @SerializedName(SERIALIZED_NAME_PREFERENCE)
  private V1ThanosRulerSpecAffinityNodeAffinityPreference preference;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";

  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;

  public V1ThanosRulerSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution
      preference(V1ThanosRulerSpecAffinityNodeAffinityPreference preference) {

    this.preference = preference;
    return this;
  }

  /**
   * Get preference
   *
   * @return preference
   */
  @ApiModelProperty(required = true, value = "")
  public V1ThanosRulerSpecAffinityNodeAffinityPreference getPreference() {
    return preference;
  }

  public void setPreference(V1ThanosRulerSpecAffinityNodeAffinityPreference preference) {
    this.preference = preference;
  }

  public V1ThanosRulerSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution
      weight(Integer weight) {

    this.weight = weight;
    return this;
  }

  /**
   * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
   *
   * @return weight
   */
  @ApiModelProperty(
      required = true,
      value =
          "Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.")
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
    V1ThanosRulerSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution
        v1ThanosRulerSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution =
            (V1ThanosRulerSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution)
                o;
    return Objects.equals(
            this.preference,
            v1ThanosRulerSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution
                .preference)
        && Objects.equals(
            this.weight,
            v1ThanosRulerSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution
                .weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preference, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class V1ThanosRulerSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution {\n");
    sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
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
