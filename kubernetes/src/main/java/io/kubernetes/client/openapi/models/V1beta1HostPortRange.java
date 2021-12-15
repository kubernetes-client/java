/*
Copyright 2021 The Kubernetes Authors.
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
import java.util.Objects;

/**
 * HostPortRange defines a range of host ports that will be enabled by a policy for pods to use. It
 * requires both the start and end to be defined.
 */
@ApiModel(
    description =
        "HostPortRange defines a range of host ports that will be enabled by a policy for pods to use.  It requires both the start and end to be defined.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1beta1HostPortRange {
  public static final String SERIALIZED_NAME_MAX = "max";

  @SerializedName(SERIALIZED_NAME_MAX)
  private Integer max;

  public static final String SERIALIZED_NAME_MIN = "min";

  @SerializedName(SERIALIZED_NAME_MIN)
  private Integer min;

  public V1beta1HostPortRange max(Integer max) {

    this.max = max;
    return this;
  }

  /**
   * max is the end of the range, inclusive.
   *
   * @return max
   */
  @ApiModelProperty(required = true, value = "max is the end of the range, inclusive.")
  public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }

  public V1beta1HostPortRange min(Integer min) {

    this.min = min;
    return this;
  }

  /**
   * min is the start of the range, inclusive.
   *
   * @return min
   */
  @ApiModelProperty(required = true, value = "min is the start of the range, inclusive.")
  public Integer getMin() {
    return min;
  }

  public void setMin(Integer min) {
    this.min = min;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1HostPortRange v1beta1HostPortRange = (V1beta1HostPortRange) o;
    return Objects.equals(this.max, v1beta1HostPortRange.max)
        && Objects.equals(this.min, v1beta1HostPortRange.min);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1HostPortRange {\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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
