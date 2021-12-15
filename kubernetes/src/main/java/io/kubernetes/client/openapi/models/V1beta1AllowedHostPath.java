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
 * AllowedHostPath defines the host volume conditions that will be enabled by a policy for pods to
 * use. It requires the path prefix to be defined.
 */
@ApiModel(
    description =
        "AllowedHostPath defines the host volume conditions that will be enabled by a policy for pods to use. It requires the path prefix to be defined.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1beta1AllowedHostPath {
  public static final String SERIALIZED_NAME_PATH_PREFIX = "pathPrefix";

  @SerializedName(SERIALIZED_NAME_PATH_PREFIX)
  private String pathPrefix;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public V1beta1AllowedHostPath pathPrefix(String pathPrefix) {

    this.pathPrefix = pathPrefix;
    return this;
  }

  /**
   * pathPrefix is the path prefix that the host volume must match. It does not support
   * &#x60;*&#x60;. Trailing slashes are trimmed when validating the path prefix with a host path.
   * Examples: &#x60;/foo&#x60; would allow &#x60;/foo&#x60;, &#x60;/foo/&#x60; and
   * &#x60;/foo/bar&#x60; &#x60;/foo&#x60; would not allow &#x60;/food&#x60; or &#x60;/etc/foo&#x60;
   *
   * @return pathPrefix
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "pathPrefix is the path prefix that the host volume must match. It does not support `*`. Trailing slashes are trimmed when validating the path prefix with a host path.  Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food` or `/etc/foo`")
  public String getPathPrefix() {
    return pathPrefix;
  }

  public void setPathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
  }

  public V1beta1AllowedHostPath readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are
   * readOnly.
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.")
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
    V1beta1AllowedHostPath v1beta1AllowedHostPath = (V1beta1AllowedHostPath) o;
    return Objects.equals(this.pathPrefix, v1beta1AllowedHostPath.pathPrefix)
        && Objects.equals(this.readOnly, v1beta1AllowedHostPath.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathPrefix, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1AllowedHostPath {\n");
    sb.append("    pathPrefix: ").append(toIndentedString(pathPrefix)).append("\n");
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
