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
import io.kubernetes.client.custom.IntOrString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * RollingUpdateStatefulSetStrategy is used to communicate parameter for
 * RollingUpdateStatefulSetStrategyType.
 */
@ApiModel(
    description =
        "RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1RollingUpdateStatefulSetStrategy {
  public static final String SERIALIZED_NAME_MAX_UNAVAILABLE = "maxUnavailable";

  @SerializedName(SERIALIZED_NAME_MAX_UNAVAILABLE)
  private IntOrString maxUnavailable;

  public static final String SERIALIZED_NAME_PARTITION = "partition";

  @SerializedName(SERIALIZED_NAME_PARTITION)
  private Integer partition;

  public V1RollingUpdateStatefulSetStrategy maxUnavailable(IntOrString maxUnavailable) {

    this.maxUnavailable = maxUnavailable;
    return this;
  }

  /**
   * IntOrString is a type that can hold an int32 or a string. When used in JSON or YAML marshalling
   * and unmarshalling, it produces or consumes the inner type. This allows you to have, for
   * example, a JSON field that can accept a name or number.
   *
   * @return maxUnavailable
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.")
  public IntOrString getMaxUnavailable() {
    return maxUnavailable;
  }

  public void setMaxUnavailable(IntOrString maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
  }

  public V1RollingUpdateStatefulSetStrategy partition(Integer partition) {

    this.partition = partition;
    return this;
  }

  /**
   * Partition indicates the ordinal at which the StatefulSet should be partitioned for updates.
   * During a rolling update, all pods from ordinal Replicas-1 to Partition are updated. All pods
   * from ordinal Partition-1 to 0 remain untouched. This is helpful in being able to do a canary
   * based deployment. The default value is 0.
   *
   * @return partition
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Partition indicates the ordinal at which the StatefulSet should be partitioned for updates. During a rolling update, all pods from ordinal Replicas-1 to Partition are updated. All pods from ordinal Partition-1 to 0 remain untouched. This is helpful in being able to do a canary based deployment. The default value is 0.")
  public Integer getPartition() {
    return partition;
  }

  public void setPartition(Integer partition) {
    this.partition = partition;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1RollingUpdateStatefulSetStrategy v1RollingUpdateStatefulSetStrategy =
        (V1RollingUpdateStatefulSetStrategy) o;
    return Objects.equals(this.maxUnavailable, v1RollingUpdateStatefulSetStrategy.maxUnavailable)
        && Objects.equals(this.partition, v1RollingUpdateStatefulSetStrategy.partition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxUnavailable, partition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RollingUpdateStatefulSetStrategy {\n");
    sb.append("    maxUnavailable: ").append(toIndentedString(maxUnavailable)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
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
