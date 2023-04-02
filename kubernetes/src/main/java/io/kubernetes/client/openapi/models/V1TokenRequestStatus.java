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
import java.time.OffsetDateTime;
import java.util.Objects;

/** TokenRequestStatus is the result of a token request. */
@ApiModel(description = "TokenRequestStatus is the result of a token request.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1TokenRequestStatus {
  public static final String SERIALIZED_NAME_EXPIRATION_TIMESTAMP = "expirationTimestamp";

  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIMESTAMP)
  private OffsetDateTime expirationTimestamp;

  public static final String SERIALIZED_NAME_TOKEN = "token";

  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public V1TokenRequestStatus expirationTimestamp(OffsetDateTime expirationTimestamp) {

    this.expirationTimestamp = expirationTimestamp;
    return this;
  }

  /**
   * ExpirationTimestamp is the time of expiration of the returned token.
   *
   * @return expirationTimestamp
   */
  @ApiModelProperty(
      required = true,
      value = "ExpirationTimestamp is the time of expiration of the returned token.")
  public OffsetDateTime getExpirationTimestamp() {
    return expirationTimestamp;
  }

  public void setExpirationTimestamp(OffsetDateTime expirationTimestamp) {
    this.expirationTimestamp = expirationTimestamp;
  }

  public V1TokenRequestStatus token(String token) {

    this.token = token;
    return this;
  }

  /**
   * Token is the opaque bearer token.
   *
   * @return token
   */
  @ApiModelProperty(required = true, value = "Token is the opaque bearer token.")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TokenRequestStatus v1TokenRequestStatus = (V1TokenRequestStatus) o;
    return Objects.equals(this.expirationTimestamp, v1TokenRequestStatus.expirationTimestamp)
        && Objects.equals(this.token, v1TokenRequestStatus.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationTimestamp, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TokenRequestStatus {\n");
    sb.append("    expirationTimestamp: ")
        .append(toIndentedString(expirationTimestamp))
        .append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
