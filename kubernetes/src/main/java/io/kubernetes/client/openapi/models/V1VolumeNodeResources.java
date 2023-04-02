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
import java.util.Objects;

/** VolumeNodeResources is a set of resource limits for scheduling of volumes. */
@ApiModel(
    description = "VolumeNodeResources is a set of resource limits for scheduling of volumes.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1VolumeNodeResources {
  public static final String SERIALIZED_NAME_COUNT = "count";

  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public V1VolumeNodeResources count(Integer count) {

    this.count = count;
    return this;
  }

  /**
   * Maximum number of unique volumes managed by the CSI driver that can be used on a node. A volume
   * that is both attached and mounted on a node is considered to be used once, not twice. The same
   * rule applies for a unique volume that is shared among multiple pods on the same node. If this
   * field is not specified, then the supported number of volumes on this node is unbounded.
   *
   * @return count
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Maximum number of unique volumes managed by the CSI driver that can be used on a node. A volume that is both attached and mounted on a node is considered to be used once, not twice. The same rule applies for a unique volume that is shared among multiple pods on the same node. If this field is not specified, then the supported number of volumes on this node is unbounded.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VolumeNodeResources v1VolumeNodeResources = (V1VolumeNodeResources) o;
    return Objects.equals(this.count, v1VolumeNodeResources.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeNodeResources {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
