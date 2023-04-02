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

/**
 * ACME specific status options. This field should only be set if the Issuer is configured to use an
 * ACME server to issue certificates.
 */
@ApiModel(
    description =
        "ACME specific status options. This field should only be set if the Issuer is configured to use an ACME server to issue certificates.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerStatusAcme {
  public static final String SERIALIZED_NAME_LAST_REGISTERED_EMAIL = "lastRegisteredEmail";

  @SerializedName(SERIALIZED_NAME_LAST_REGISTERED_EMAIL)
  private String lastRegisteredEmail;

  public static final String SERIALIZED_NAME_URI = "uri";

  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public V1alpha2IssuerStatusAcme lastRegisteredEmail(String lastRegisteredEmail) {

    this.lastRegisteredEmail = lastRegisteredEmail;
    return this;
  }

  /**
   * LastRegisteredEmail is the email associated with the latest registered ACME account, in order
   * to track changes made to registered account associated with the Issuer
   *
   * @return lastRegisteredEmail
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "LastRegisteredEmail is the email associated with the latest registered ACME account, in order to track changes made to registered account associated with the  Issuer")
  public String getLastRegisteredEmail() {
    return lastRegisteredEmail;
  }

  public void setLastRegisteredEmail(String lastRegisteredEmail) {
    this.lastRegisteredEmail = lastRegisteredEmail;
  }

  public V1alpha2IssuerStatusAcme uri(String uri) {

    this.uri = uri;
    return this;
  }

  /**
   * URI is the unique account identifier, which can also be used to retrieve account details from
   * the CA
   *
   * @return uri
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "URI is the unique account identifier, which can also be used to retrieve account details from the CA")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerStatusAcme v1alpha2IssuerStatusAcme = (V1alpha2IssuerStatusAcme) o;
    return Objects.equals(this.lastRegisteredEmail, v1alpha2IssuerStatusAcme.lastRegisteredEmail)
        && Objects.equals(this.uri, v1alpha2IssuerStatusAcme.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastRegisteredEmail, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerStatusAcme {\n");
    sb.append("    lastRegisteredEmail: ")
        .append(toIndentedString(lastRegisteredEmail))
        .append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
