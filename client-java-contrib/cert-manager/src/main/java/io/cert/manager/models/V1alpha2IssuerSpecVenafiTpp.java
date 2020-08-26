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
import java.util.Arrays;
import java.util.Objects;

/**
 * TPP specifies Trust Protection Platform configuration settings. Only one of TPP or Cloud may be
 * specified.
 */
@ApiModel(
    description =
        "TPP specifies Trust Protection Platform configuration settings. Only one of TPP or Cloud may be specified.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecVenafiTpp {
  public static final String SERIALIZED_NAME_CA_BUNDLE = "caBundle";

  @SerializedName(SERIALIZED_NAME_CA_BUNDLE)
  private byte[] caBundle;

  public static final String SERIALIZED_NAME_CREDENTIALS_REF = "credentialsRef";

  @SerializedName(SERIALIZED_NAME_CREDENTIALS_REF)
  private V1alpha2IssuerSpecVenafiTppCredentialsRef credentialsRef;

  public static final String SERIALIZED_NAME_URL = "url";

  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public V1alpha2IssuerSpecVenafiTpp caBundle(byte[] caBundle) {

    this.caBundle = caBundle;
    return this;
  }

  /**
   * CABundle is a PEM encoded TLS certificate to use to verify connections to the TPP instance. If
   * specified, system roots will not be used and the issuing CA for the TPP instance must be
   * verifiable using the provided root. If not specified, the connection will be verified using the
   * cert-manager system root certificates.
   *
   * @return caBundle
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "CABundle is a PEM encoded TLS certificate to use to verify connections to the TPP instance. If specified, system roots will not be used and the issuing CA for the TPP instance must be verifiable using the provided root. If not specified, the connection will be verified using the cert-manager system root certificates.")
  public byte[] getCaBundle() {
    return caBundle;
  }

  public void setCaBundle(byte[] caBundle) {
    this.caBundle = caBundle;
  }

  public V1alpha2IssuerSpecVenafiTpp credentialsRef(
      V1alpha2IssuerSpecVenafiTppCredentialsRef credentialsRef) {

    this.credentialsRef = credentialsRef;
    return this;
  }

  /**
   * Get credentialsRef
   *
   * @return credentialsRef
   */
  @ApiModelProperty(required = true, value = "")
  public V1alpha2IssuerSpecVenafiTppCredentialsRef getCredentialsRef() {
    return credentialsRef;
  }

  public void setCredentialsRef(V1alpha2IssuerSpecVenafiTppCredentialsRef credentialsRef) {
    this.credentialsRef = credentialsRef;
  }

  public V1alpha2IssuerSpecVenafiTpp url(String url) {

    this.url = url;
    return this;
  }

  /**
   * URL is the base URL for the vedsdk endpoint of the Venafi TPP instance, for example:
   * \&quot;https://tpp.example.com/vedsdk\&quot;.
   *
   * @return url
   */
  @ApiModelProperty(
      required = true,
      value =
          "URL is the base URL for the vedsdk endpoint of the Venafi TPP instance, for example: \"https://tpp.example.com/vedsdk\".")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecVenafiTpp v1alpha2IssuerSpecVenafiTpp = (V1alpha2IssuerSpecVenafiTpp) o;
    return Arrays.equals(this.caBundle, v1alpha2IssuerSpecVenafiTpp.caBundle)
        && Objects.equals(this.credentialsRef, v1alpha2IssuerSpecVenafiTpp.credentialsRef)
        && Objects.equals(this.url, v1alpha2IssuerSpecVenafiTpp.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(caBundle), credentialsRef, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecVenafiTpp {\n");
    sb.append("    caBundle: ").append(toIndentedString(caBundle)).append("\n");
    sb.append("    credentialsRef: ").append(toIndentedString(credentialsRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
