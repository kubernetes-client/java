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
package io.cert.manager.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Use the Cloudflare API to manage DNS01 challenge records. */
@ApiModel(description = "Use the Cloudflare API to manage DNS01 challenge records.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeDns01Cloudflare {
  public static final String SERIALIZED_NAME_API_KEY_SECRET_REF = "apiKeySecretRef";

  @SerializedName(SERIALIZED_NAME_API_KEY_SECRET_REF)
  private V1alpha2IssuerSpecAcmeDns01CloudflareApiKeySecretRef apiKeySecretRef;

  public static final String SERIALIZED_NAME_API_TOKEN_SECRET_REF = "apiTokenSecretRef";

  @SerializedName(SERIALIZED_NAME_API_TOKEN_SECRET_REF)
  private V1alpha2IssuerSpecAcmeDns01CloudflareApiTokenSecretRef apiTokenSecretRef;

  public static final String SERIALIZED_NAME_EMAIL = "email";

  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public V1alpha2IssuerSpecAcmeDns01Cloudflare apiKeySecretRef(
      V1alpha2IssuerSpecAcmeDns01CloudflareApiKeySecretRef apiKeySecretRef) {

    this.apiKeySecretRef = apiKeySecretRef;
    return this;
  }

  /**
   * Get apiKeySecretRef
   *
   * @return apiKeySecretRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeDns01CloudflareApiKeySecretRef getApiKeySecretRef() {
    return apiKeySecretRef;
  }

  public void setApiKeySecretRef(
      V1alpha2IssuerSpecAcmeDns01CloudflareApiKeySecretRef apiKeySecretRef) {
    this.apiKeySecretRef = apiKeySecretRef;
  }

  public V1alpha2IssuerSpecAcmeDns01Cloudflare apiTokenSecretRef(
      V1alpha2IssuerSpecAcmeDns01CloudflareApiTokenSecretRef apiTokenSecretRef) {

    this.apiTokenSecretRef = apiTokenSecretRef;
    return this;
  }

  /**
   * Get apiTokenSecretRef
   *
   * @return apiTokenSecretRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeDns01CloudflareApiTokenSecretRef getApiTokenSecretRef() {
    return apiTokenSecretRef;
  }

  public void setApiTokenSecretRef(
      V1alpha2IssuerSpecAcmeDns01CloudflareApiTokenSecretRef apiTokenSecretRef) {
    this.apiTokenSecretRef = apiTokenSecretRef;
  }

  public V1alpha2IssuerSpecAcmeDns01Cloudflare email(String email) {

    this.email = email;
    return this;
  }

  /**
   * Email of the account, only required when using API key based authentication.
   *
   * @return email
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Email of the account, only required when using API key based authentication.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecAcmeDns01Cloudflare v1alpha2IssuerSpecAcmeDns01Cloudflare =
        (V1alpha2IssuerSpecAcmeDns01Cloudflare) o;
    return Objects.equals(
            this.apiKeySecretRef, v1alpha2IssuerSpecAcmeDns01Cloudflare.apiKeySecretRef)
        && Objects.equals(
            this.apiTokenSecretRef, v1alpha2IssuerSpecAcmeDns01Cloudflare.apiTokenSecretRef)
        && Objects.equals(this.email, v1alpha2IssuerSpecAcmeDns01Cloudflare.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKeySecretRef, apiTokenSecretRef, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecAcmeDns01Cloudflare {\n");
    sb.append("    apiKeySecretRef: ").append(toIndentedString(apiKeySecretRef)).append("\n");
    sb.append("    apiTokenSecretRef: ").append(toIndentedString(apiTokenSecretRef)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
