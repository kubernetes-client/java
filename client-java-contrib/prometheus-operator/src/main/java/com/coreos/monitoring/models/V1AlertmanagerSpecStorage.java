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

/** Storage is the definition of how storage will be used by the Alertmanager instances. */
@ApiModel(
    description =
        "Storage is the definition of how storage will be used by the Alertmanager instances.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1AlertmanagerSpecStorage {
  public static final String SERIALIZED_NAME_EMPTY_DIR = "emptyDir";

  @SerializedName(SERIALIZED_NAME_EMPTY_DIR)
  private V1ThanosRulerSpecStorageEmptyDir emptyDir;

  public static final String SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATE = "volumeClaimTemplate";

  @SerializedName(SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATE)
  private V1ThanosRulerSpecStorageVolumeClaimTemplate volumeClaimTemplate;

  public V1AlertmanagerSpecStorage emptyDir(V1ThanosRulerSpecStorageEmptyDir emptyDir) {

    this.emptyDir = emptyDir;
    return this;
  }

  /**
   * Get emptyDir
   *
   * @return emptyDir
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecStorageEmptyDir getEmptyDir() {
    return emptyDir;
  }

  public void setEmptyDir(V1ThanosRulerSpecStorageEmptyDir emptyDir) {
    this.emptyDir = emptyDir;
  }

  public V1AlertmanagerSpecStorage volumeClaimTemplate(
      V1ThanosRulerSpecStorageVolumeClaimTemplate volumeClaimTemplate) {

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
  public V1ThanosRulerSpecStorageVolumeClaimTemplate getVolumeClaimTemplate() {
    return volumeClaimTemplate;
  }

  public void setVolumeClaimTemplate(
      V1ThanosRulerSpecStorageVolumeClaimTemplate volumeClaimTemplate) {
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
    V1AlertmanagerSpecStorage v1AlertmanagerSpecStorage = (V1AlertmanagerSpecStorage) o;
    return Objects.equals(this.emptyDir, v1AlertmanagerSpecStorage.emptyDir)
        && Objects.equals(this.volumeClaimTemplate, v1AlertmanagerSpecStorage.volumeClaimTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emptyDir, volumeClaimTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AlertmanagerSpecStorage {\n");
    sb.append("    emptyDir: ").append(toIndentedString(emptyDir)).append("\n");
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
