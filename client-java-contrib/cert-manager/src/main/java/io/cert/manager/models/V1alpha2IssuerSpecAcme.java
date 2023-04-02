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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ACME configures this issuer to communicate with a RFC8555 (ACME) server to obtain signed x509
 * certificates.
 */
@ApiModel(
    description =
        "ACME configures this issuer to communicate with a RFC8555 (ACME) server to obtain signed x509 certificates.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcme {
  public static final String SERIALIZED_NAME_EMAIL = "email";

  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EXTERNAL_ACCOUNT_BINDING = "externalAccountBinding";

  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACCOUNT_BINDING)
  private V1alpha2IssuerSpecAcmeExternalAccountBinding externalAccountBinding;

  public static final String SERIALIZED_NAME_PRIVATE_KEY_SECRET_REF = "privateKeySecretRef";

  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY_SECRET_REF)
  private V1alpha2IssuerSpecAcmePrivateKeySecretRef privateKeySecretRef;

  public static final String SERIALIZED_NAME_SERVER = "server";

  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public static final String SERIALIZED_NAME_SKIP_T_L_S_VERIFY = "skipTLSVerify";

  @SerializedName(SERIALIZED_NAME_SKIP_T_L_S_VERIFY)
  private Boolean skipTLSVerify;

  public static final String SERIALIZED_NAME_SOLVERS = "solvers";

  @SerializedName(SERIALIZED_NAME_SOLVERS)
  private List<V1alpha2IssuerSpecAcmeSolvers> solvers = null;

  public V1alpha2IssuerSpecAcme email(String email) {

    this.email = email;
    return this;
  }

  /**
   * Email is the email address to be associated with the ACME account. This field is optional, but
   * it is strongly recommended to be set. It will be used to contact you in case of issues with
   * your account or certificates, including expiry notification emails. This field may be updated
   * after the account is initially registered.
   *
   * @return email
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Email is the email address to be associated with the ACME account. This field is optional, but it is strongly recommended to be set. It will be used to contact you in case of issues with your account or certificates, including expiry notification emails. This field may be updated after the account is initially registered.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public V1alpha2IssuerSpecAcme externalAccountBinding(
      V1alpha2IssuerSpecAcmeExternalAccountBinding externalAccountBinding) {

    this.externalAccountBinding = externalAccountBinding;
    return this;
  }

  /**
   * Get externalAccountBinding
   *
   * @return externalAccountBinding
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeExternalAccountBinding getExternalAccountBinding() {
    return externalAccountBinding;
  }

  public void setExternalAccountBinding(
      V1alpha2IssuerSpecAcmeExternalAccountBinding externalAccountBinding) {
    this.externalAccountBinding = externalAccountBinding;
  }

  public V1alpha2IssuerSpecAcme privateKeySecretRef(
      V1alpha2IssuerSpecAcmePrivateKeySecretRef privateKeySecretRef) {

    this.privateKeySecretRef = privateKeySecretRef;
    return this;
  }

  /**
   * Get privateKeySecretRef
   *
   * @return privateKeySecretRef
   */
  @ApiModelProperty(required = true, value = "")
  public V1alpha2IssuerSpecAcmePrivateKeySecretRef getPrivateKeySecretRef() {
    return privateKeySecretRef;
  }

  public void setPrivateKeySecretRef(
      V1alpha2IssuerSpecAcmePrivateKeySecretRef privateKeySecretRef) {
    this.privateKeySecretRef = privateKeySecretRef;
  }

  public V1alpha2IssuerSpecAcme server(String server) {

    this.server = server;
    return this;
  }

  /**
   * Server is the URL used to access the ACME server&#39;s &#39;directory&#39; endpoint. For
   * example, for Let&#39;s Encrypt&#39;s staging endpoint, you would use:
   * \&quot;https://acme-staging-v02.api.letsencrypt.org/directory\&quot;. Only ACME v2 endpoints
   * (i.e. RFC 8555) are supported.
   *
   * @return server
   */
  @ApiModelProperty(
      required = true,
      value =
          "Server is the URL used to access the ACME server's 'directory' endpoint. For example, for Let's Encrypt's staging endpoint, you would use: \"https://acme-staging-v02.api.letsencrypt.org/directory\". Only ACME v2 endpoints (i.e. RFC 8555) are supported.")
  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }

  public V1alpha2IssuerSpecAcme skipTLSVerify(Boolean skipTLSVerify) {

    this.skipTLSVerify = skipTLSVerify;
    return this;
  }

  /**
   * Enables or disables validation of the ACME server TLS certificate. If true, requests to the
   * ACME server will not have their TLS certificate validated (i.e. insecure connections will be
   * allowed). Only enable this option in development environments. The cert-manager system
   * installed roots will be used to verify connections to the ACME server if this is false.
   * Defaults to false.
   *
   * @return skipTLSVerify
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Enables or disables validation of the ACME server TLS certificate. If true, requests to the ACME server will not have their TLS certificate validated (i.e. insecure connections will be allowed). Only enable this option in development environments. The cert-manager system installed roots will be used to verify connections to the ACME server if this is false. Defaults to false.")
  public Boolean getSkipTLSVerify() {
    return skipTLSVerify;
  }

  public void setSkipTLSVerify(Boolean skipTLSVerify) {
    this.skipTLSVerify = skipTLSVerify;
  }

  public V1alpha2IssuerSpecAcme solvers(List<V1alpha2IssuerSpecAcmeSolvers> solvers) {

    this.solvers = solvers;
    return this;
  }

  public V1alpha2IssuerSpecAcme addSolversItem(V1alpha2IssuerSpecAcmeSolvers solversItem) {
    if (this.solvers == null) {
      this.solvers = new ArrayList<V1alpha2IssuerSpecAcmeSolvers>();
    }
    this.solvers.add(solversItem);
    return this;
  }

  /**
   * Solvers is a list of challenge solvers that will be used to solve ACME challenges for the
   * matching domains. Solver configurations must be provided in order to obtain certificates from
   * an ACME server. For more information, see: https://cert-manager.io/docs/configuration/acme/
   *
   * @return solvers
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Solvers is a list of challenge solvers that will be used to solve ACME challenges for the matching domains. Solver configurations must be provided in order to obtain certificates from an ACME server. For more information, see: https://cert-manager.io/docs/configuration/acme/")
  public List<V1alpha2IssuerSpecAcmeSolvers> getSolvers() {
    return solvers;
  }

  public void setSolvers(List<V1alpha2IssuerSpecAcmeSolvers> solvers) {
    this.solvers = solvers;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecAcme v1alpha2IssuerSpecAcme = (V1alpha2IssuerSpecAcme) o;
    return Objects.equals(this.email, v1alpha2IssuerSpecAcme.email)
        && Objects.equals(
            this.externalAccountBinding, v1alpha2IssuerSpecAcme.externalAccountBinding)
        && Objects.equals(this.privateKeySecretRef, v1alpha2IssuerSpecAcme.privateKeySecretRef)
        && Objects.equals(this.server, v1alpha2IssuerSpecAcme.server)
        && Objects.equals(this.skipTLSVerify, v1alpha2IssuerSpecAcme.skipTLSVerify)
        && Objects.equals(this.solvers, v1alpha2IssuerSpecAcme.solvers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        email, externalAccountBinding, privateKeySecretRef, server, skipTLSVerify, solvers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecAcme {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    externalAccountBinding: ")
        .append(toIndentedString(externalAccountBinding))
        .append("\n");
    sb.append("    privateKeySecretRef: ")
        .append(toIndentedString(privateKeySecretRef))
        .append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    skipTLSVerify: ").append(toIndentedString(skipTLSVerify)).append("\n");
    sb.append("    solvers: ").append(toIndentedString(solvers)).append("\n");
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
