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
 * Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support ownership
 * management or SELinux relabeling.
 */
@ApiModel(
    description =
        "Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support ownership management or SELinux relabeling.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1NFSVolumeSource {
  public static final String SERIALIZED_NAME_PATH = "path";

  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SERVER = "server";

  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public V1NFSVolumeSource path(String path) {

    this.path = path;
    return this;
  }

  /**
   * path that is exported by the NFS server. More info:
   * https://kubernetes.io/docs/concepts/storage/volumes#nfs
   *
   * @return path
   */
  @ApiModelProperty(
      required = true,
      value =
          "path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1NFSVolumeSource readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * readOnly here will force the NFS export to be mounted with read-only permissions. Defaults to
   * false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "readOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1NFSVolumeSource server(String server) {

    this.server = server;
    return this;
  }

  /**
   * server is the hostname or IP address of the NFS server. More info:
   * https://kubernetes.io/docs/concepts/storage/volumes#nfs
   *
   * @return server
   */
  @ApiModelProperty(
      required = true,
      value =
          "server is the hostname or IP address of the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NFSVolumeSource v1NFSVolumeSource = (V1NFSVolumeSource) o;
    return Objects.equals(this.path, v1NFSVolumeSource.path)
        && Objects.equals(this.readOnly, v1NFSVolumeSource.readOnly)
        && Objects.equals(this.server, v1NFSVolumeSource.server);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, readOnly, server);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NFSVolumeSource {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
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
