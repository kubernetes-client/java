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

/** TokenRequest contains parameters of a service account token. */
@ApiModel(description = "TokenRequest contains parameters of a service account token.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class StorageV1TokenRequest {
  public static final String SERIALIZED_NAME_AUDIENCE = "audience";

  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private String audience;

  public static final String SERIALIZED_NAME_EXPIRATION_SECONDS = "expirationSeconds";

  @SerializedName(SERIALIZED_NAME_EXPIRATION_SECONDS)
  private Long expirationSeconds;

  public StorageV1TokenRequest audience(String audience) {

    this.audience = audience;
    return this;
  }

  /**
   * Audience is the intended audience of the token in \&quot;TokenRequestSpec\&quot;. It will
   * default to the audiences of kube apiserver.
   *
   * @return audience
   */
  @ApiModelProperty(
      required = true,
      value =
          "Audience is the intended audience of the token in \"TokenRequestSpec\". It will default to the audiences of kube apiserver.")
  public String getAudience() {
    return audience;
  }

  public void setAudience(String audience) {
    this.audience = audience;
  }

  public StorageV1TokenRequest expirationSeconds(Long expirationSeconds) {

    this.expirationSeconds = expirationSeconds;
    return this;
  }

  /**
   * ExpirationSeconds is the duration of validity of the token in \&quot;TokenRequestSpec\&quot;.
   * It has the same default value of \&quot;ExpirationSeconds\&quot; in
   * \&quot;TokenRequestSpec\&quot;.
   *
   * @return expirationSeconds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ExpirationSeconds is the duration of validity of the token in \"TokenRequestSpec\". It has the same default value of \"ExpirationSeconds\" in \"TokenRequestSpec\".")
  public Long getExpirationSeconds() {
    return expirationSeconds;
  }

  public void setExpirationSeconds(Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageV1TokenRequest storageV1TokenRequest = (StorageV1TokenRequest) o;
    return Objects.equals(this.audience, storageV1TokenRequest.audience)
        && Objects.equals(this.expirationSeconds, storageV1TokenRequest.expirationSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audience, expirationSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageV1TokenRequest {\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    expirationSeconds: ").append(toIndentedString(expirationSeconds)).append("\n");
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
