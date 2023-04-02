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
 * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same
 * namespace. More info:
 * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
 */
@ApiModel(
    description =
        "PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecPersistentVolumeClaim {
  public static final String SERIALIZED_NAME_CLAIM_NAME = "claimName";

  @SerializedName(SERIALIZED_NAME_CLAIM_NAME)
  private String claimName;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public V1ThanosRulerSpecPersistentVolumeClaim claimName(String claimName) {

    this.claimName = claimName;
    return this;
  }

  /**
   * ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this
   * volume. More info:
   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
   *
   * @return claimName
   */
  @ApiModelProperty(
      required = true,
      value =
          "ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
  public String getClaimName() {
    return claimName;
  }

  public void setClaimName(String claimName) {
    this.claimName = claimName;
  }

  public V1ThanosRulerSpecPersistentVolumeClaim readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * Will force the ReadOnly setting in VolumeMounts. Default false.
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Will force the ReadOnly setting in VolumeMounts. Default false.")
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
    V1ThanosRulerSpecPersistentVolumeClaim v1ThanosRulerSpecPersistentVolumeClaim =
        (V1ThanosRulerSpecPersistentVolumeClaim) o;
    return Objects.equals(this.claimName, v1ThanosRulerSpecPersistentVolumeClaim.claimName)
        && Objects.equals(this.readOnly, v1ThanosRulerSpecPersistentVolumeClaim.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimName, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecPersistentVolumeClaim {\n");
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
