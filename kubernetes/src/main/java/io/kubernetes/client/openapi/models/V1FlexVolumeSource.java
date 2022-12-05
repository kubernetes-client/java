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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based
 * plugin.
 */
@ApiModel(
    description =
        "FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1FlexVolumeSource {
  public static final String SERIALIZED_NAME_DRIVER = "driver";

  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";

  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_OPTIONS = "options";

  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, String> options = null;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";

  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1LocalObjectReference secretRef;

  public V1FlexVolumeSource driver(String driver) {

    this.driver = driver;
    return this;
  }

  /**
   * driver is the name of the driver to use for this volume.
   *
   * @return driver
   */
  @ApiModelProperty(
      required = true,
      value = "driver is the name of the driver to use for this volume.")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public V1FlexVolumeSource fsType(String fsType) {

    this.fsType = fsType;
    return this;
  }

  /**
   * fsType is the filesystem type to mount. Must be a filesystem type supported by the host
   * operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. The default
   * filesystem depends on FlexVolume script.
   *
   * @return fsType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". The default filesystem depends on FlexVolume script.")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public V1FlexVolumeSource options(Map<String, String> options) {

    this.options = options;
    return this;
  }

  public V1FlexVolumeSource putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * options is Optional: this field holds extra command options if any.
   *
   * @return options
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "options is Optional: this field holds extra command options if any.")
  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }

  public V1FlexVolumeSource readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * readOnly is Optional: defaults to false (read/write). ReadOnly here will force the ReadOnly
   * setting in VolumeMounts.
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "readOnly is Optional: defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1FlexVolumeSource secretRef(V1LocalObjectReference secretRef) {

    this.secretRef = secretRef;
    return this;
  }

  /**
   * Get secretRef
   *
   * @return secretRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LocalObjectReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(V1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1FlexVolumeSource v1FlexVolumeSource = (V1FlexVolumeSource) o;
    return Objects.equals(this.driver, v1FlexVolumeSource.driver)
        && Objects.equals(this.fsType, v1FlexVolumeSource.fsType)
        && Objects.equals(this.options, v1FlexVolumeSource.options)
        && Objects.equals(this.readOnly, v1FlexVolumeSource.readOnly)
        && Objects.equals(this.secretRef, v1FlexVolumeSource.secretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driver, fsType, options, readOnly, secretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1FlexVolumeSource {\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
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
