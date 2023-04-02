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

/** TokenReviewStatus is the result of the token authentication request. */
@ApiModel(description = "TokenReviewStatus is the result of the token authentication request.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1TokenReviewStatus {
  public static final String SERIALIZED_NAME_AUDIENCES = "audiences";

  @SerializedName(SERIALIZED_NAME_AUDIENCES)
  private List<String> audiences = null;

  public static final String SERIALIZED_NAME_AUTHENTICATED = "authenticated";

  @SerializedName(SERIALIZED_NAME_AUTHENTICATED)
  private Boolean authenticated;

  public static final String SERIALIZED_NAME_ERROR = "error";

  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_USER = "user";

  @SerializedName(SERIALIZED_NAME_USER)
  private V1UserInfo user;

  public V1TokenReviewStatus audiences(List<String> audiences) {

    this.audiences = audiences;
    return this;
  }

  public V1TokenReviewStatus addAudiencesItem(String audiencesItem) {
    if (this.audiences == null) {
      this.audiences = new ArrayList<>();
    }
    this.audiences.add(audiencesItem);
    return this;
  }

  /**
   * Audiences are audience identifiers chosen by the authenticator that are compatible with both
   * the TokenReview and token. An identifier is any identifier in the intersection of the
   * TokenReviewSpec audiences and the token&#39;s audiences. A client of the TokenReview API that
   * sets the spec.audiences field should validate that a compatible audience identifier is returned
   * in the status.audiences field to ensure that the TokenReview server is audience aware. If a
   * TokenReview returns an empty status.audience field where status.authenticated is
   * \&quot;true\&quot;, the token is valid against the audience of the Kubernetes API server.
   *
   * @return audiences
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Audiences are audience identifiers chosen by the authenticator that are compatible with both the TokenReview and token. An identifier is any identifier in the intersection of the TokenReviewSpec audiences and the token's audiences. A client of the TokenReview API that sets the spec.audiences field should validate that a compatible audience identifier is returned in the status.audiences field to ensure that the TokenReview server is audience aware. If a TokenReview returns an empty status.audience field where status.authenticated is \"true\", the token is valid against the audience of the Kubernetes API server.")
  public List<String> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<String> audiences) {
    this.audiences = audiences;
  }

  public V1TokenReviewStatus authenticated(Boolean authenticated) {

    this.authenticated = authenticated;
    return this;
  }

  /**
   * Authenticated indicates that the token was associated with a known user.
   *
   * @return authenticated
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Authenticated indicates that the token was associated with a known user.")
  public Boolean getAuthenticated() {
    return authenticated;
  }

  public void setAuthenticated(Boolean authenticated) {
    this.authenticated = authenticated;
  }

  public V1TokenReviewStatus error(String error) {

    this.error = error;
    return this;
  }

  /**
   * Error indicates that the token couldn&#39;t be checked
   *
   * @return error
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error indicates that the token couldn't be checked")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public V1TokenReviewStatus user(V1UserInfo user) {

    this.user = user;
    return this;
  }

  /**
   * Get user
   *
   * @return user
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1UserInfo getUser() {
    return user;
  }

  public void setUser(V1UserInfo user) {
    this.user = user;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TokenReviewStatus v1TokenReviewStatus = (V1TokenReviewStatus) o;
    return Objects.equals(this.audiences, v1TokenReviewStatus.audiences)
        && Objects.equals(this.authenticated, v1TokenReviewStatus.authenticated)
        && Objects.equals(this.error, v1TokenReviewStatus.error)
        && Objects.equals(this.user, v1TokenReviewStatus.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audiences, authenticated, error, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TokenReviewStatus {\n");
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
