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
 * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support
 * ownership management or SELinux relabeling.
 */
@ApiModel(
    description =
        "Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1GlusterfsPersistentVolumeSource {
  public static final String SERIALIZED_NAME_ENDPOINTS = "endpoints";

  @SerializedName(SERIALIZED_NAME_ENDPOINTS)
  private String endpoints;

  public static final String SERIALIZED_NAME_ENDPOINTS_NAMESPACE = "endpointsNamespace";

  @SerializedName(SERIALIZED_NAME_ENDPOINTS_NAMESPACE)
  private String endpointsNamespace;

  public static final String SERIALIZED_NAME_PATH = "path";

  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public V1GlusterfsPersistentVolumeSource endpoints(String endpoints) {

    this.endpoints = endpoints;
    return this;
  }

  /**
   * endpoints is the endpoint name that details Glusterfs topology. More info:
   * https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
   *
   * @return endpoints
   */
  @ApiModelProperty(
      required = true,
      value =
          "endpoints is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod")
  public String getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(String endpoints) {
    this.endpoints = endpoints;
  }

  public V1GlusterfsPersistentVolumeSource endpointsNamespace(String endpointsNamespace) {

    this.endpointsNamespace = endpointsNamespace;
    return this;
  }

  /**
   * endpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is empty,
   * the EndpointNamespace defaults to the same namespace as the bound PVC. More info:
   * https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
   *
   * @return endpointsNamespace
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "endpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod")
  public String getEndpointsNamespace() {
    return endpointsNamespace;
  }

  public void setEndpointsNamespace(String endpointsNamespace) {
    this.endpointsNamespace = endpointsNamespace;
  }

  public V1GlusterfsPersistentVolumeSource path(String path) {

    this.path = path;
    return this;
  }

  /**
   * path is the Glusterfs volume path. More info:
   * https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
   *
   * @return path
   */
  @ApiModelProperty(
      required = true,
      value =
          "path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1GlusterfsPersistentVolumeSource readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * readOnly here will force the Glusterfs volume to be mounted with read-only permissions.
   * Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "readOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod")
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
    V1GlusterfsPersistentVolumeSource v1GlusterfsPersistentVolumeSource =
        (V1GlusterfsPersistentVolumeSource) o;
    return Objects.equals(this.endpoints, v1GlusterfsPersistentVolumeSource.endpoints)
        && Objects.equals(
            this.endpointsNamespace, v1GlusterfsPersistentVolumeSource.endpointsNamespace)
        && Objects.equals(this.path, v1GlusterfsPersistentVolumeSource.path)
        && Objects.equals(this.readOnly, v1GlusterfsPersistentVolumeSource.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoints, endpointsNamespace, path, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GlusterfsPersistentVolumeSource {\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    endpointsNamespace: ").append(toIndentedString(endpointsNamespace)).append("\n");
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
