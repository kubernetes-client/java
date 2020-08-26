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
 * Keystores configures additional keystore output formats stored in the &#x60;secretName&#x60;
 * Secret resource.
 */
@ApiModel(
    description =
        "Keystores configures additional keystore output formats stored in the `secretName` Secret resource.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1beta1CertificateSpecKeystores {
  public static final String SERIALIZED_NAME_JKS = "jks";

  @SerializedName(SERIALIZED_NAME_JKS)
  private V1beta1CertificateSpecKeystoresJks jks;

  public static final String SERIALIZED_NAME_PKCS12 = "pkcs12";

  @SerializedName(SERIALIZED_NAME_PKCS12)
  private V1beta1CertificateSpecKeystoresPkcs12 pkcs12;

  public V1beta1CertificateSpecKeystores jks(V1beta1CertificateSpecKeystoresJks jks) {

    this.jks = jks;
    return this;
  }

  /**
   * Get jks
   *
   * @return jks
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1CertificateSpecKeystoresJks getJks() {
    return jks;
  }

  public void setJks(V1beta1CertificateSpecKeystoresJks jks) {
    this.jks = jks;
  }

  public V1beta1CertificateSpecKeystores pkcs12(V1beta1CertificateSpecKeystoresPkcs12 pkcs12) {

    this.pkcs12 = pkcs12;
    return this;
  }

  /**
   * Get pkcs12
   *
   * @return pkcs12
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1CertificateSpecKeystoresPkcs12 getPkcs12() {
    return pkcs12;
  }

  public void setPkcs12(V1beta1CertificateSpecKeystoresPkcs12 pkcs12) {
    this.pkcs12 = pkcs12;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CertificateSpecKeystores v1beta1CertificateSpecKeystores =
        (V1beta1CertificateSpecKeystores) o;
    return Objects.equals(this.jks, v1beta1CertificateSpecKeystores.jks)
        && Objects.equals(this.pkcs12, v1beta1CertificateSpecKeystores.pkcs12);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jks, pkcs12);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CertificateSpecKeystores {\n");
    sb.append("    jks: ").append(toIndentedString(jks)).append("\n");
    sb.append("    pkcs12: ").append(toIndentedString(pkcs12)).append("\n");
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
