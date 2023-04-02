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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** TokenRequestSpec contains client provided parameters of a token request. */
@ApiModel(description = "TokenRequestSpec contains client provided parameters of a token request.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1TokenRequestSpec {
  public static final String SERIALIZED_NAME_AUDIENCES = "audiences";

  @SerializedName(SERIALIZED_NAME_AUDIENCES)
  private List<String> audiences = new ArrayList<>();

  public static final String SERIALIZED_NAME_BOUND_OBJECT_REF = "boundObjectRef";

  @SerializedName(SERIALIZED_NAME_BOUND_OBJECT_REF)
  private V1BoundObjectReference boundObjectRef;

  public static final String SERIALIZED_NAME_EXPIRATION_SECONDS = "expirationSeconds";

  @SerializedName(SERIALIZED_NAME_EXPIRATION_SECONDS)
  private Long expirationSeconds;

  public V1TokenRequestSpec audiences(List<String> audiences) {

    this.audiences = audiences;
    return this;
  }

  public V1TokenRequestSpec addAudiencesItem(String audiencesItem) {
    this.audiences.add(audiencesItem);
    return this;
  }

  /**
   * Audiences are the intendend audiences of the token. A recipient of a token must identify
   * themself with an identifier in the list of audiences of the token, and otherwise should reject
   * the token. A token issued for multiple audiences may be used to authenticate against any of the
   * audiences listed but implies a high degree of trust between the target audiences.
   *
   * @return audiences
   */
  @ApiModelProperty(
      required = true,
      value =
          "Audiences are the intendend audiences of the token. A recipient of a token must identify themself with an identifier in the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be used to authenticate against any of the audiences listed but implies a high degree of trust between the target audiences.")
  public List<String> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<String> audiences) {
    this.audiences = audiences;
  }

  public V1TokenRequestSpec boundObjectRef(V1BoundObjectReference boundObjectRef) {

    this.boundObjectRef = boundObjectRef;
    return this;
  }

  /**
   * Get boundObjectRef
   *
   * @return boundObjectRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1BoundObjectReference getBoundObjectRef() {
    return boundObjectRef;
  }

  public void setBoundObjectRef(V1BoundObjectReference boundObjectRef) {
    this.boundObjectRef = boundObjectRef;
  }

  public V1TokenRequestSpec expirationSeconds(Long expirationSeconds) {

    this.expirationSeconds = expirationSeconds;
    return this;
  }

  /**
   * ExpirationSeconds is the requested duration of validity of the request. The token issuer may
   * return a token with a different validity duration so a client needs to check the
   * &#39;expiration&#39; field in a response.
   *
   * @return expirationSeconds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ExpirationSeconds is the requested duration of validity of the request. The token issuer may return a token with a different validity duration so a client needs to check the 'expiration' field in a response.")
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
    V1TokenRequestSpec v1TokenRequestSpec = (V1TokenRequestSpec) o;
    return Objects.equals(this.audiences, v1TokenRequestSpec.audiences)
        && Objects.equals(this.boundObjectRef, v1TokenRequestSpec.boundObjectRef)
        && Objects.equals(this.expirationSeconds, v1TokenRequestSpec.expirationSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audiences, boundObjectRef, expirationSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TokenRequestSpec {\n");
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
    sb.append("    boundObjectRef: ").append(toIndentedString(boundObjectRef)).append("\n");
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
