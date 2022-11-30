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
 * EmptyDirVolumeSource to be used by the Prometheus StatefulSets. If specified, used in place of
 * any volumeClaimTemplate. More info: https://kubernetes.io/docs/concepts/storage/volumes/#emptydir
 */
@ApiModel(
    description =
        "EmptyDirVolumeSource to be used by the Prometheus StatefulSets. If specified, used in place of any volumeClaimTemplate. More info: https://kubernetes.io/docs/concepts/storage/volumes/#emptydir")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecStorageEmptyDir {
  public static final String SERIALIZED_NAME_MEDIUM = "medium";

  @SerializedName(SERIALIZED_NAME_MEDIUM)
  private String medium;

  public static final String SERIALIZED_NAME_SIZE_LIMIT = "sizeLimit";

  @SerializedName(SERIALIZED_NAME_SIZE_LIMIT)
  private String sizeLimit;

  public V1ThanosRulerSpecStorageEmptyDir medium(String medium) {

    this.medium = medium;
    return this;
  }

  /**
   * What type of storage medium should back this directory. The default is \&quot;\&quot; which
   * means to use the node&#39;s default medium. Must be an empty string (default) or Memory. More
   * info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
   *
   * @return medium
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "What type of storage medium should back this directory. The default is \"\" which means to use the node's default medium. Must be an empty string (default) or Memory. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir")
  public String getMedium() {
    return medium;
  }

  public void setMedium(String medium) {
    this.medium = medium;
  }

  public V1ThanosRulerSpecStorageEmptyDir sizeLimit(String sizeLimit) {

    this.sizeLimit = sizeLimit;
    return this;
  }

  /**
   * Total amount of local storage required for this EmptyDir volume. The size limit is also
   * applicable for memory medium. The maximum usage on memory medium EmptyDir would be the minimum
   * value between the SizeLimit specified here and the sum of memory limits of all containers in a
   * pod. The default is nil which means that the limit is undefined. More info:
   * https://kubernetes.io/docs/user-guide/volumes#emptydir
   *
   * @return sizeLimit
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Total amount of local storage required for this EmptyDir volume. The size limit is also applicable for memory medium. The maximum usage on memory medium EmptyDir would be the minimum value between the SizeLimit specified here and the sum of memory limits of all containers in a pod. The default is nil which means that the limit is undefined. More info: https://kubernetes.io/docs/user-guide/volumes#emptydir")
  public String getSizeLimit() {
    return sizeLimit;
  }

  public void setSizeLimit(String sizeLimit) {
    this.sizeLimit = sizeLimit;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecStorageEmptyDir v1ThanosRulerSpecStorageEmptyDir =
        (V1ThanosRulerSpecStorageEmptyDir) o;
    return Objects.equals(this.medium, v1ThanosRulerSpecStorageEmptyDir.medium)
        && Objects.equals(this.sizeLimit, v1ThanosRulerSpecStorageEmptyDir.sizeLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(medium, sizeLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecStorageEmptyDir {\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    sizeLimit: ").append(toIndentedString(sizeLimit)).append("\n");
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
