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

/** Represents an ephemeral volume that is handled by a normal storage driver. */
@ApiModel(
    description = "Represents an ephemeral volume that is handled by a normal storage driver.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-01-04T09:55:14.976Z[Etc/UTC]")
public class V1EphemeralVolumeSource {
  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATE = "volumeClaimTemplate";

  @SerializedName(SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATE)
  private V1PersistentVolumeClaimTemplate volumeClaimTemplate;

  public V1EphemeralVolumeSource readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * Specifies a read-only configuration for the volume. Defaults to false (read/write).
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Specifies a read-only configuration for the volume. Defaults to false (read/write).")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1EphemeralVolumeSource volumeClaimTemplate(
      V1PersistentVolumeClaimTemplate volumeClaimTemplate) {

    this.volumeClaimTemplate = volumeClaimTemplate;
    return this;
  }

  /**
   * Get volumeClaimTemplate
   *
   * @return volumeClaimTemplate
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PersistentVolumeClaimTemplate getVolumeClaimTemplate() {
    return volumeClaimTemplate;
  }

  public void setVolumeClaimTemplate(V1PersistentVolumeClaimTemplate volumeClaimTemplate) {
    this.volumeClaimTemplate = volumeClaimTemplate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EphemeralVolumeSource v1EphemeralVolumeSource = (V1EphemeralVolumeSource) o;
    return Objects.equals(this.readOnly, v1EphemeralVolumeSource.readOnly)
        && Objects.equals(this.volumeClaimTemplate, v1EphemeralVolumeSource.volumeClaimTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readOnly, volumeClaimTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EphemeralVolumeSource {\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    volumeClaimTemplate: ")
        .append(toIndentedString(volumeClaimTemplate))
        .append("\n");
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
