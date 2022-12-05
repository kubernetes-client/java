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

/**
 * PersistentVolumeClaimVolumeSource references the user&#39;s PVC in the same namespace. This
 * volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource
 * is, essentially, a wrapper around another type of volume that is owned by someone else (the
 * system).
 */
@ApiModel(
    description =
        "PersistentVolumeClaimVolumeSource references the user's PVC in the same namespace. This volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume that is owned by someone else (the system).")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1PersistentVolumeClaimVolumeSource {
  public static final String SERIALIZED_NAME_CLAIM_NAME = "claimName";

  @SerializedName(SERIALIZED_NAME_CLAIM_NAME)
  private String claimName;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public V1PersistentVolumeClaimVolumeSource claimName(String claimName) {

    this.claimName = claimName;
    return this;
  }

  /**
   * claimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this
   * volume. More info:
   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
   *
   * @return claimName
   */
  @ApiModelProperty(
      required = true,
      value =
          "claimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
  public String getClaimName() {
    return claimName;
  }

  public void setClaimName(String claimName) {
    this.claimName = claimName;
  }

  public V1PersistentVolumeClaimVolumeSource readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * readOnly Will force the ReadOnly setting in VolumeMounts. Default false.
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "readOnly Will force the ReadOnly setting in VolumeMounts. Default false.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PersistentVolumeClaimVolumeSource v1PersistentVolumeClaimVolumeSource =
        (V1PersistentVolumeClaimVolumeSource) o;
    return Objects.equals(this.claimName, v1PersistentVolumeClaimVolumeSource.claimName)
        && Objects.equals(this.readOnly, v1PersistentVolumeClaimVolumeSource.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimName, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PersistentVolumeClaimVolumeSource {\n");
    sb.append("    claimName: ").append(toIndentedString(claimName)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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
