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
 * Glusterfs represents a Glusterfs mount on the host that shares a pod&#39;s lifetime. More info:
 * https://examples.k8s.io/volumes/glusterfs/README.md
 */
@ApiModel(
    description =
        "Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecGlusterfs {
  public static final String SERIALIZED_NAME_ENDPOINTS = "endpoints";

  @SerializedName(SERIALIZED_NAME_ENDPOINTS)
  private String endpoints;

  public static final String SERIALIZED_NAME_PATH = "path";

  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public V1ThanosRulerSpecGlusterfs endpoints(String endpoints) {

    this.endpoints = endpoints;
    return this;
  }

  /**
   * EndpointsName is the endpoint name that details Glusterfs topology. More info:
   * https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
   *
   * @return endpoints
   */
  @ApiModelProperty(
      required = true,
      value =
          "EndpointsName is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod")
  public String getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(String endpoints) {
    this.endpoints = endpoints;
  }

  public V1ThanosRulerSpecGlusterfs path(String path) {

    this.path = path;
    return this;
  }

  /**
   * Path is the Glusterfs volume path. More info:
   * https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
   *
   * @return path
   */
  @ApiModelProperty(
      required = true,
      value =
          "Path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1ThanosRulerSpecGlusterfs readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions.
   * Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod")
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
    V1ThanosRulerSpecGlusterfs v1ThanosRulerSpecGlusterfs = (V1ThanosRulerSpecGlusterfs) o;
    return Objects.equals(this.endpoints, v1ThanosRulerSpecGlusterfs.endpoints)
        && Objects.equals(this.path, v1ThanosRulerSpecGlusterfs.path)
        && Objects.equals(this.readOnly, v1ThanosRulerSpecGlusterfs.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoints, path, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecGlusterfs {\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
