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
 * ServiceAccountTokenProjection represents a projected service account token volume. This
 * projection can be used to insert a service account token into the pods runtime filesystem for use
 * against APIs (Kubernetes API Server or otherwise).
 */
@ApiModel(
    description =
        "ServiceAccountTokenProjection represents a projected service account token volume. This projection can be used to insert a service account token into the pods runtime filesystem for use against APIs (Kubernetes API Server or otherwise).")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ServiceAccountTokenProjection {
  public static final String SERIALIZED_NAME_AUDIENCE = "audience";

  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private String audience;

  public static final String SERIALIZED_NAME_EXPIRATION_SECONDS = "expirationSeconds";

  @SerializedName(SERIALIZED_NAME_EXPIRATION_SECONDS)
  private Long expirationSeconds;

  public static final String SERIALIZED_NAME_PATH = "path";

  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public V1ServiceAccountTokenProjection audience(String audience) {

    this.audience = audience;
    return this;
  }

  /**
   * audience is the intended audience of the token. A recipient of a token must identify itself
   * with an identifier specified in the audience of the token, and otherwise should reject the
   * token. The audience defaults to the identifier of the apiserver.
   *
   * @return audience
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.")
  public String getAudience() {
    return audience;
  }

  public void setAudience(String audience) {
    this.audience = audience;
  }

  public V1ServiceAccountTokenProjection expirationSeconds(Long expirationSeconds) {

    this.expirationSeconds = expirationSeconds;
    return this;
  }

  /**
   * expirationSeconds is the requested duration of validity of the service account token. As the
   * token approaches expiration, the kubelet volume plugin will proactively rotate the service
   * account token. The kubelet will start trying to rotate the token if the token is older than 80
   * percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must
   * be at least 10 minutes.
   *
   * @return expirationSeconds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "expirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.")
  public Long getExpirationSeconds() {
    return expirationSeconds;
  }

  public void setExpirationSeconds(Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
  }

  public V1ServiceAccountTokenProjection path(String path) {

    this.path = path;
    return this;
  }

  /**
   * path is the path relative to the mount point of the file to project the token into.
   *
   * @return path
   */
  @ApiModelProperty(
      required = true,
      value = "path is the path relative to the mount point of the file to project the token into.")
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
    V1ServiceAccountTokenProjection v1ServiceAccountTokenProjection =
        (V1ServiceAccountTokenProjection) o;
    return Objects.equals(this.audience, v1ServiceAccountTokenProjection.audience)
        && Objects.equals(this.expirationSeconds, v1ServiceAccountTokenProjection.expirationSeconds)
        && Objects.equals(this.path, v1ServiceAccountTokenProjection.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audience, expirationSeconds, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServiceAccountTokenProjection {\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    expirationSeconds: ").append(toIndentedString(expirationSeconds)).append("\n");
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
