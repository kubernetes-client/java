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
 * Use the &#39;ACME DNS&#39; (https://github.com/joohoi/acme-dns) API to manage DNS01 challenge
 * records.
 */
@ApiModel(
    description =
        "Use the 'ACME DNS' (https://github.com/joohoi/acme-dns) API to manage DNS01 challenge records.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeDns01Acmedns {
  public static final String SERIALIZED_NAME_ACCOUNT_SECRET_REF = "accountSecretRef";

  @SerializedName(SERIALIZED_NAME_ACCOUNT_SECRET_REF)
  private V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef accountSecretRef;

  public static final String SERIALIZED_NAME_HOST = "host";

  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public V1alpha2IssuerSpecAcmeDns01Acmedns accountSecretRef(
      V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef accountSecretRef) {

    this.accountSecretRef = accountSecretRef;
    return this;
  }

  /**
   * Get accountSecretRef
   *
   * @return accountSecretRef
   */
  @ApiModelProperty(required = true, value = "")
  public V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef getAccountSecretRef() {
    return accountSecretRef;
  }

  public void setAccountSecretRef(
      V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef accountSecretRef) {
    this.accountSecretRef = accountSecretRef;
  }

  public V1alpha2IssuerSpecAcmeDns01Acmedns host(String host) {

    this.host = host;
    return this;
  }

  /**
   * Get host
   *
   * @return host
   */
  @ApiModelProperty(required = true, value = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecAcmeDns01Acmedns v1alpha2IssuerSpecAcmeDns01Acmedns =
        (V1alpha2IssuerSpecAcmeDns01Acmedns) o;
    return Objects.equals(
            this.accountSecretRef, v1alpha2IssuerSpecAcmeDns01Acmedns.accountSecretRef)
        && Objects.equals(this.host, v1alpha2IssuerSpecAcmeDns01Acmedns.host);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSecretRef, host);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecAcmeDns01Acmedns {\n");
    sb.append("    accountSecretRef: ").append(toIndentedString(accountSecretRef)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
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
