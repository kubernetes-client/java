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

/** LimitRangeSpec defines a min/max usage limit for resources that match on kind. */
@ApiModel(
    description = "LimitRangeSpec defines a min/max usage limit for resources that match on kind.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1LimitRangeSpec {
  public static final String SERIALIZED_NAME_LIMITS = "limits";

  @SerializedName(SERIALIZED_NAME_LIMITS)
  private List<V1LimitRangeItem> limits = new ArrayList<>();

  public V1LimitRangeSpec limits(List<V1LimitRangeItem> limits) {

    this.limits = limits;
    return this;
  }

  public V1LimitRangeSpec addLimitsItem(V1LimitRangeItem limitsItem) {
    this.limits.add(limitsItem);
    return this;
  }

  /**
   * Limits is the list of LimitRangeItem objects that are enforced.
   *
   * @return limits
   */
  @ApiModelProperty(
      required = true,
      value = "Limits is the list of LimitRangeItem objects that are enforced.")
  public List<V1LimitRangeItem> getLimits() {
    return limits;
  }

  public void setLimits(List<V1LimitRangeItem> limits) {
    this.limits = limits;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LimitRangeSpec v1LimitRangeSpec = (V1LimitRangeSpec) o;
    return Objects.equals(this.limits, v1LimitRangeSpec.limits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LimitRangeSpec {\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
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
