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
 * Represents a host path mapped into a pod. Host path volumes do not support ownership management
 * or SELinux relabeling.
 */
@ApiModel(
    description =
        "Represents a host path mapped into a pod. Host path volumes do not support ownership management or SELinux relabeling.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1HostPathVolumeSource {
  public static final String SERIALIZED_NAME_PATH = "path";

  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1HostPathVolumeSource path(String path) {

    this.path = path;
    return this;
  }

  /**
   * path of the directory on the host. If the path is a symlink, it will follow the link to the
   * real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
   *
   * @return path
   */
  @ApiModelProperty(
      required = true,
      value =
          "path of the directory on the host. If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1HostPathVolumeSource type(String type) {

    this.type = type;
    return this;
  }

  /**
   * type for HostPath Volume Defaults to \&quot;\&quot; More info:
   * https://kubernetes.io/docs/concepts/storage/volumes#hostpath
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "type for HostPath Volume Defaults to \"\" More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HostPathVolumeSource v1HostPathVolumeSource = (V1HostPathVolumeSource) o;
    return Objects.equals(this.path, v1HostPathVolumeSource.path)
        && Objects.equals(this.type, v1HostPathVolumeSource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HostPathVolumeSource {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
