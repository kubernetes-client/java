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
 * PKCS12 configures options for storing a PKCS12 keystore in the &#x60;spec.secretName&#x60; Secret
 * resource.
 */
@ApiModel(
    description =
        "PKCS12 configures options for storing a PKCS12 keystore in the `spec.secretName` Secret resource.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1beta1CertificateSpecKeystoresPkcs12 {
  public static final String SERIALIZED_NAME_CREATE = "create";

  @SerializedName(SERIALIZED_NAME_CREATE)
  private Boolean create;

  public static final String SERIALIZED_NAME_PASSWORD_SECRET_REF = "passwordSecretRef";

  @SerializedName(SERIALIZED_NAME_PASSWORD_SECRET_REF)
  private V1beta1CertificateSpecKeystoresPkcs12PasswordSecretRef passwordSecretRef;

  public V1beta1CertificateSpecKeystoresPkcs12 create(Boolean create) {

    this.create = create;
    return this;
  }

  /**
   * Create enables PKCS12 keystore creation for the Certificate. If true, a file named
   * &#x60;keystore.p12&#x60; will be created in the target Secret resource, encrypted using the
   * password stored in &#x60;passwordSecretRef&#x60;. The keystore file will only be updated upon
   * re-issuance.
   *
   * @return create
   */
  @ApiModelProperty(
      required = true,
      value =
          "Create enables PKCS12 keystore creation for the Certificate. If true, a file named `keystore.p12` will be created in the target Secret resource, encrypted using the password stored in `passwordSecretRef`. The keystore file will only be updated upon re-issuance.")
  public Boolean getCreate() {
    return create;
  }

  public void setCreate(Boolean create) {
    this.create = create;
  }

  public V1beta1CertificateSpecKeystoresPkcs12 passwordSecretRef(
      V1beta1CertificateSpecKeystoresPkcs12PasswordSecretRef passwordSecretRef) {

    this.passwordSecretRef = passwordSecretRef;
    return this;
  }

  /**
   * Get passwordSecretRef
   *
   * @return passwordSecretRef
   */
  @ApiModelProperty(required = true, value = "")
  public V1beta1CertificateSpecKeystoresPkcs12PasswordSecretRef getPasswordSecretRef() {
    return passwordSecretRef;
  }

  public void setPasswordSecretRef(
      V1beta1CertificateSpecKeystoresPkcs12PasswordSecretRef passwordSecretRef) {
    this.passwordSecretRef = passwordSecretRef;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CertificateSpecKeystoresPkcs12 v1beta1CertificateSpecKeystoresPkcs12 =
        (V1beta1CertificateSpecKeystoresPkcs12) o;
    return Objects.equals(this.create, v1beta1CertificateSpecKeystoresPkcs12.create)
        && Objects.equals(
            this.passwordSecretRef, v1beta1CertificateSpecKeystoresPkcs12.passwordSecretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, passwordSecretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CertificateSpecKeystoresPkcs12 {\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    passwordSecretRef: ").append(toIndentedString(passwordSecretRef)).append("\n");
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
