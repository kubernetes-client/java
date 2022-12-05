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

/** TokenReviewSpec is a description of the token authentication request. */
@ApiModel(description = "TokenReviewSpec is a description of the token authentication request.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1TokenReviewSpec {
  public static final String SERIALIZED_NAME_AUDIENCES = "audiences";

  @SerializedName(SERIALIZED_NAME_AUDIENCES)
  private List<String> audiences = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";

  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public V1TokenReviewSpec audiences(List<String> audiences) {

    this.audiences = audiences;
    return this;
  }

  public V1TokenReviewSpec addAudiencesItem(String audiencesItem) {
    if (this.audiences == null) {
      this.audiences = new ArrayList<>();
    }
    this.audiences.add(audiencesItem);
    return this;
  }

  /**
   * Audiences is a list of the identifiers that the resource server presented with the token
   * identifies as. Audience-aware token authenticators will verify that the token was intended for
   * at least one of the audiences in this list. If no audiences are provided, the audience will
   * default to the audience of the Kubernetes apiserver.
   *
   * @return audiences
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.")
  public List<String> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<String> audiences) {
    this.audiences = audiences;
  }

  public V1TokenReviewSpec token(String token) {

    this.token = token;
    return this;
  }

  /**
   * Token is the opaque bearer token.
   *
   * @return token
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token is the opaque bearer token.")
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
    V1TokenReviewSpec v1TokenReviewSpec = (V1TokenReviewSpec) o;
    return Objects.equals(this.audiences, v1TokenReviewSpec.audiences)
        && Objects.equals(this.token, v1TokenReviewSpec.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audiences, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TokenReviewSpec {\n");
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
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
