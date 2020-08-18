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

/** Desired state of the ClusterIssuer resource. */
@ApiModel(description = "Desired state of the ClusterIssuer resource.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1beta1ClusterIssuerSpec {
  public static final String SERIALIZED_NAME_ACME = "acme";

  @SerializedName(SERIALIZED_NAME_ACME)
  private V1beta1IssuerSpecAcme acme;

  public static final String SERIALIZED_NAME_CA = "ca";

  @SerializedName(SERIALIZED_NAME_CA)
  private V1alpha2IssuerSpecCa ca;

  public static final String SERIALIZED_NAME_SELF_SIGNED = "selfSigned";

  @SerializedName(SERIALIZED_NAME_SELF_SIGNED)
  private V1alpha2IssuerSpecSelfSigned selfSigned;

  public static final String SERIALIZED_NAME_VAULT = "vault";

  @SerializedName(SERIALIZED_NAME_VAULT)
  private V1alpha2IssuerSpecVault vault;

  public static final String SERIALIZED_NAME_VENAFI = "venafi";

  @SerializedName(SERIALIZED_NAME_VENAFI)
  private V1alpha2IssuerSpecVenafi venafi;

  public V1beta1ClusterIssuerSpec acme(V1beta1IssuerSpecAcme acme) {

    this.acme = acme;
    return this;
  }

  /**
   * Get acme
   *
   * @return acme
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1IssuerSpecAcme getAcme() {
    return acme;
  }

  public void setAcme(V1beta1IssuerSpecAcme acme) {
    this.acme = acme;
  }

  public V1beta1ClusterIssuerSpec ca(V1alpha2IssuerSpecCa ca) {

    this.ca = ca;
    return this;
  }

  /**
   * Get ca
   *
   * @return ca
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecCa getCa() {
    return ca;
  }

  public void setCa(V1alpha2IssuerSpecCa ca) {
    this.ca = ca;
  }

  public V1beta1ClusterIssuerSpec selfSigned(V1alpha2IssuerSpecSelfSigned selfSigned) {

    this.selfSigned = selfSigned;
    return this;
  }

  /**
   * Get selfSigned
   *
   * @return selfSigned
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecSelfSigned getSelfSigned() {
    return selfSigned;
  }

  public void setSelfSigned(V1alpha2IssuerSpecSelfSigned selfSigned) {
    this.selfSigned = selfSigned;
  }

  public V1beta1ClusterIssuerSpec vault(V1alpha2IssuerSpecVault vault) {

    this.vault = vault;
    return this;
  }

  /**
   * Get vault
   *
   * @return vault
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecVault getVault() {
    return vault;
  }

  public void setVault(V1alpha2IssuerSpecVault vault) {
    this.vault = vault;
  }

  public V1beta1ClusterIssuerSpec venafi(V1alpha2IssuerSpecVenafi venafi) {

    this.venafi = venafi;
    return this;
  }

  /**
   * Get venafi
   *
   * @return venafi
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecVenafi getVenafi() {
    return venafi;
  }

  public void setVenafi(V1alpha2IssuerSpecVenafi venafi) {
    this.venafi = venafi;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ClusterIssuerSpec v1beta1ClusterIssuerSpec = (V1beta1ClusterIssuerSpec) o;
    return Objects.equals(this.acme, v1beta1ClusterIssuerSpec.acme)
        && Objects.equals(this.ca, v1beta1ClusterIssuerSpec.ca)
        && Objects.equals(this.selfSigned, v1beta1ClusterIssuerSpec.selfSigned)
        && Objects.equals(this.vault, v1beta1ClusterIssuerSpec.vault)
        && Objects.equals(this.venafi, v1beta1ClusterIssuerSpec.venafi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acme, ca, selfSigned, vault, venafi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ClusterIssuerSpec {\n");
    sb.append("    acme: ").append(toIndentedString(acme)).append("\n");
    sb.append("    ca: ").append(toIndentedString(ca)).append("\n");
    sb.append("    selfSigned: ").append(toIndentedString(selfSigned)).append("\n");
    sb.append("    vault: ").append(toIndentedString(vault)).append("\n");
    sb.append("    venafi: ").append(toIndentedString(venafi)).append("\n");
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
