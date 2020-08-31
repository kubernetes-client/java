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

/** DownwardAPIVolumeFile represents information to create the file containing the pod field */
@ApiModel(
    description =
        "DownwardAPIVolumeFile represents information to create the file containing the pod field")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecDownwardAPIItems {
  public static final String SERIALIZED_NAME_FIELD_REF = "fieldRef";

  @SerializedName(SERIALIZED_NAME_FIELD_REF)
  private V1ThanosRulerSpecDownwardAPIFieldRef fieldRef;

  public static final String SERIALIZED_NAME_MODE = "mode";

  @SerializedName(SERIALIZED_NAME_MODE)
  private Integer mode;

  public static final String SERIALIZED_NAME_PATH = "path";

  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_RESOURCE_FIELD_REF = "resourceFieldRef";

  @SerializedName(SERIALIZED_NAME_RESOURCE_FIELD_REF)
  private V1ThanosRulerSpecDownwardAPIResourceFieldRef resourceFieldRef;

  public V1ThanosRulerSpecDownwardAPIItems fieldRef(V1ThanosRulerSpecDownwardAPIFieldRef fieldRef) {

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
  public V1ThanosRulerSpecDownwardAPIFieldRef getFieldRef() {
    return fieldRef;
  }

  public void setFieldRef(V1ThanosRulerSpecDownwardAPIFieldRef fieldRef) {
    this.fieldRef = fieldRef;
  }

  public V1ThanosRulerSpecDownwardAPIItems mode(Integer mode) {

    this.mode = mode;
    return this;
  }

  /**
   * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified,
   * the volume defaultMode will be used. This might be in conflict with other options that affect
   * the file mode, like fsGroup, and the result can be other mode bits set.
   *
   * @return mode
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
  public Integer getMode() {
    return mode;
  }

  public void setMode(Integer mode) {
    this.mode = mode;
  }

  public V1ThanosRulerSpecDownwardAPIItems path(String path) {

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

  public V1ThanosRulerSpecDownwardAPIItems resourceFieldRef(
      V1ThanosRulerSpecDownwardAPIResourceFieldRef resourceFieldRef) {

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
  public V1ThanosRulerSpecDownwardAPIResourceFieldRef getResourceFieldRef() {
    return resourceFieldRef;
  }

  public void setResourceFieldRef(V1ThanosRulerSpecDownwardAPIResourceFieldRef resourceFieldRef) {
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
    V1ThanosRulerSpecDownwardAPIItems v1ThanosRulerSpecDownwardAPIItems =
        (V1ThanosRulerSpecDownwardAPIItems) o;
    return Objects.equals(this.fieldRef, v1ThanosRulerSpecDownwardAPIItems.fieldRef)
        && Objects.equals(this.mode, v1ThanosRulerSpecDownwardAPIItems.mode)
        && Objects.equals(this.path, v1ThanosRulerSpecDownwardAPIItems.path)
        && Objects.equals(
            this.resourceFieldRef, v1ThanosRulerSpecDownwardAPIItems.resourceFieldRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldRef, mode, path, resourceFieldRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecDownwardAPIItems {\n");
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
