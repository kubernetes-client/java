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
package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * HTTPIngressPath associates a path regex with a backend. Incoming urls matching the path are
 * forwarded to the backend.
 */
@ApiModel(
    description =
        "HTTPIngressPath associates a path regex with a backend. Incoming urls matching the path are forwarded to the backend.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-06-19T10:47:33.387Z[Etc/UTC]")
public class NetworkingV1beta1HTTPIngressPath {
  public static final String SERIALIZED_NAME_BACKEND = "backend";

  @SerializedName(SERIALIZED_NAME_BACKEND)
  private NetworkingV1beta1IngressBackend backend;

  public static final String SERIALIZED_NAME_PATH = "path";

  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

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
   * Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix
   * syntax, not the perl syntax) matched against the path of an incoming request. Currently it can
   * contain characters disallowed from the conventional \&quot;path\&quot; part of a URL as defined
   * by RFC 3986. Paths must begin with a &#39;/&#39;. If unspecified, the path defaults to a catch
   * all sending traffic to the backend.
   *
   * @return path
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional \"path\" part of a URL as defined by RFC 3986. Paths must begin with a '/'. If unspecified, the path defaults to a catch all sending traffic to the backend.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
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
        && Objects.equals(this.path, networkingV1beta1HTTPIngressPath.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backend, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkingV1beta1HTTPIngressPath {\n");
    sb.append("    backend: ").append(toIndentedString(backend)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
