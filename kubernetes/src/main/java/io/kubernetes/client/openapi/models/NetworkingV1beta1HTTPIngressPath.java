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

/**
 * HTTPIngressPath associates a path with a backend. Incoming urls matching the path are forwarded
 * to the backend.
 */
@ApiModel(
    description =
        "HTTPIngressPath associates a path with a backend. Incoming urls matching the path are forwarded to the backend.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-01-04T09:55:14.976Z[Etc/UTC]")
public class NetworkingV1beta1HTTPIngressPath {
  public static final String SERIALIZED_NAME_BACKEND = "backend";

  @SerializedName(SERIALIZED_NAME_BACKEND)
  private NetworkingV1beta1IngressBackend backend;

  public static final String SERIALIZED_NAME_PATH = "path";

  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PATH_TYPE = "pathType";

  @SerializedName(SERIALIZED_NAME_PATH_TYPE)
  private String pathType;

  public NetworkingV1beta1HTTPIngressPath backend(NetworkingV1beta1IngressBackend backend) {

    this.backend = backend;
    return this;
  }

  /**
   * Get backend
   *
   * @return backend
   */
  @ApiModelProperty(required = true, value = "")
  public NetworkingV1beta1IngressBackend getBackend() {
    return backend;
  }

  public void setBackend(NetworkingV1beta1IngressBackend backend) {
    this.backend = backend;
  }

  public NetworkingV1beta1HTTPIngressPath path(String path) {

    this.path = path;
    return this;
  }

  /**
   * Path is matched against the path of an incoming request. Currently it can contain characters
   * disallowed from the conventional \&quot;path\&quot; part of a URL as defined by RFC 3986. Paths
   * must begin with a &#39;/&#39;. When unspecified, all paths from incoming requests are matched.
   *
   * @return path
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Path is matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional \"path\" part of a URL as defined by RFC 3986. Paths must begin with a '/'. When unspecified, all paths from incoming requests are matched.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public NetworkingV1beta1HTTPIngressPath pathType(String pathType) {

    this.pathType = pathType;
    return this;
  }

  /**
   * PathType determines the interpretation of the Path matching. PathType can be one of the
   * following values: * Exact: Matches the URL path exactly. * Prefix: Matches based on a URL path
   * prefix split by &#39;/&#39;. Matching is done on a path element by element basis. A path
   * element refers is the list of labels in the path split by the &#39;/&#39; separator. A request
   * is a match for path p if every p is an element-wise prefix of p of the request path. Note that
   * if the last element of the path is a substring of the last element in request path, it is not a
   * match (e.g. /foo/bar matches /foo/bar/baz, but does not match /foo/barbaz). *
   * ImplementationSpecific: Interpretation of the Path matching is up to the IngressClass.
   * Implementations can treat this as a separate PathType or treat it identically to Prefix or
   * Exact path types. Implementations are required to support all path types. Defaults to
   * ImplementationSpecific.
   *
   * @return pathType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "PathType determines the interpretation of the Path matching. PathType can be one of the following values: * Exact: Matches the URL path exactly. * Prefix: Matches based on a URL path prefix split by '/'. Matching is   done on a path element by element basis. A path element refers is the   list of labels in the path split by the '/' separator. A request is a   match for path p if every p is an element-wise prefix of p of the   request path. Note that if the last element of the path is a substring   of the last element in request path, it is not a match (e.g. /foo/bar   matches /foo/bar/baz, but does not match /foo/barbaz). * ImplementationSpecific: Interpretation of the Path matching is up to   the IngressClass. Implementations can treat this as a separate PathType   or treat it identically to Prefix or Exact path types. Implementations are required to support all path types. Defaults to ImplementationSpecific.")
  public String getPathType() {
    return pathType;
  }

  public void setPathType(String pathType) {
    this.pathType = pathType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkingV1beta1HTTPIngressPath networkingV1beta1HTTPIngressPath =
        (NetworkingV1beta1HTTPIngressPath) o;
    return Objects.equals(this.backend, networkingV1beta1HTTPIngressPath.backend)
        && Objects.equals(this.path, networkingV1beta1HTTPIngressPath.path)
        && Objects.equals(this.pathType, networkingV1beta1HTTPIngressPath.pathType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backend, path, pathType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkingV1beta1HTTPIngressPath {\n");
    sb.append("    backend: ").append(toIndentedString(backend)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pathType: ").append(toIndentedString(pathType)).append("\n");
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
