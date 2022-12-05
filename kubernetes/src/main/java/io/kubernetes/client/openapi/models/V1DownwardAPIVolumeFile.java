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

/** DownwardAPIVolumeFile represents information to create the file containing the pod field */
@ApiModel(
    description =
        "DownwardAPIVolumeFile represents information to create the file containing the pod field")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1DownwardAPIVolumeFile {
  public static final String SERIALIZED_NAME_FIELD_REF = "fieldRef";

  @SerializedName(SERIALIZED_NAME_FIELD_REF)
  private V1ObjectFieldSelector fieldRef;

  public static final String SERIALIZED_NAME_MODE = "mode";

  @SerializedName(SERIALIZED_NAME_MODE)
  private Integer mode;

  public static final String SERIALIZED_NAME_PATH = "path";

  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_RESOURCE_FIELD_REF = "resourceFieldRef";

  @SerializedName(SERIALIZED_NAME_RESOURCE_FIELD_REF)
  private V1ResourceFieldSelector resourceFieldRef;

  public V1DownwardAPIVolumeFile fieldRef(V1ObjectFieldSelector fieldRef) {

    this.fieldRef = fieldRef;
    return this;
  }

  /**
   * Get fieldRef
   *
   * @return fieldRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectFieldSelector getFieldRef() {
    return fieldRef;
  }

  public void setFieldRef(V1ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
  }

  public V1DownwardAPIVolumeFile mode(Integer mode) {

    this.mode = mode;
    return this;
  }

  /**
   * Optional: mode bits used to set permissions on this file, must be an octal value between 0000
   * and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON
   * requires decimal values for mode bits. If not specified, the volume defaultMode will be used.
   * This might be in conflict with other options that affect the file mode, like fsGroup, and the
   * result can be other mode bits set.
   *
   * @return mode
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
  public Integer getMode() {
    return mode;
  }

  public void setMode(Integer mode) {
    this.mode = mode;
  }

  public V1DownwardAPIVolumeFile path(String path) {

    this.path = path;
    return this;
  }

  /**
   * Required: Path is the relative path name of the file to be created. Must not be absolute or
   * contain the &#39;..&#39; path. Must be utf-8 encoded. The first item of the relative path must
   * not start with &#39;..&#39;
   *
   * @return path
   */
  @ApiModelProperty(
      required = true,
      value =
          "Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1DownwardAPIVolumeFile resourceFieldRef(V1ResourceFieldSelector resourceFieldRef) {

    this.resourceFieldRef = resourceFieldRef;
    return this;
  }

  /**
   * Get resourceFieldRef
   *
   * @return resourceFieldRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ResourceFieldSelector getResourceFieldRef() {
    return resourceFieldRef;
  }

  public void setResourceFieldRef(V1ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DownwardAPIVolumeFile v1DownwardAPIVolumeFile = (V1DownwardAPIVolumeFile) o;
    return Objects.equals(this.fieldRef, v1DownwardAPIVolumeFile.fieldRef)
        && Objects.equals(this.mode, v1DownwardAPIVolumeFile.mode)
        && Objects.equals(this.path, v1DownwardAPIVolumeFile.path)
        && Objects.equals(this.resourceFieldRef, v1DownwardAPIVolumeFile.resourceFieldRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldRef, mode, path, resourceFieldRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DownwardAPIVolumeFile {\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    resourceFieldRef: ").append(toIndentedString(resourceFieldRef)).append("\n");
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
