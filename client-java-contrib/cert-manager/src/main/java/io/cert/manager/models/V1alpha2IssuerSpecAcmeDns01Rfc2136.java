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
 * Use RFC2136 (\&quot;Dynamic Updates in the Domain Name System\&quot;)
 * (https://datatracker.ietf.org/doc/rfc2136/) to manage DNS01 challenge records.
 */
@ApiModel(
    description =
        "Use RFC2136 (\"Dynamic Updates in the Domain Name System\") (https://datatracker.ietf.org/doc/rfc2136/) to manage DNS01 challenge records.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeDns01Rfc2136 {
  public static final String SERIALIZED_NAME_NAMESERVER = "nameserver";

  @SerializedName(SERIALIZED_NAME_NAMESERVER)
  private String nameserver;

  public static final String SERIALIZED_NAME_TSIG_ALGORITHM = "tsigAlgorithm";

  @SerializedName(SERIALIZED_NAME_TSIG_ALGORITHM)
  private String tsigAlgorithm;

  public static final String SERIALIZED_NAME_TSIG_KEY_NAME = "tsigKeyName";

  @SerializedName(SERIALIZED_NAME_TSIG_KEY_NAME)
  private String tsigKeyName;

  public static final String SERIALIZED_NAME_TSIG_SECRET_SECRET_REF = "tsigSecretSecretRef";

  @SerializedName(SERIALIZED_NAME_TSIG_SECRET_SECRET_REF)
  private V1alpha2IssuerSpecAcmeDns01Rfc2136TsigSecretSecretRef tsigSecretSecretRef;

  public V1alpha2IssuerSpecAcmeDns01Rfc2136 nameserver(String nameserver) {

    this.nameserver = nameserver;
    return this;
  }

  /**
   * The IP address or hostname of an authoritative DNS server supporting RFC2136 in the form
   * host:port. If the host is an IPv6 address it must be enclosed in square brackets (e.g
   * [2001:db8::1]) ; port is optional. This field is required.
   *
   * @return nameserver
   */
  @ApiModelProperty(
      required = true,
      value =
          "The IP address or hostname of an authoritative DNS server supporting RFC2136 in the form host:port. If the host is an IPv6 address it must be enclosed in square brackets (e.g [2001:db8::1]) ; port is optional. This field is required.")
  public String getNameserver() {
    return nameserver;
  }

  public void setNameserver(String nameserver) {
    this.nameserver = nameserver;
  }

  public V1alpha2IssuerSpecAcmeDns01Rfc2136 tsigAlgorithm(String tsigAlgorithm) {

    this.tsigAlgorithm = tsigAlgorithm;
    return this;
  }

  /**
   * The TSIG Algorithm configured in the DNS supporting RFC2136. Used only when
   * &#x60;&#x60;tsigSecretSecretRef&#x60;&#x60; and &#x60;&#x60;tsigKeyName&#x60;&#x60; are
   * defined. Supported values are (case-insensitive): &#x60;&#x60;HMACMD5&#x60;&#x60; (default),
   * &#x60;&#x60;HMACSHA1&#x60;&#x60;, &#x60;&#x60;HMACSHA256&#x60;&#x60; or
   * &#x60;&#x60;HMACSHA512&#x60;&#x60;.
   *
   * @return tsigAlgorithm
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The TSIG Algorithm configured in the DNS supporting RFC2136. Used only when ``tsigSecretSecretRef`` and ``tsigKeyName`` are defined. Supported values are (case-insensitive): ``HMACMD5`` (default), ``HMACSHA1``, ``HMACSHA256`` or ``HMACSHA512``.")
  public String getTsigAlgorithm() {
    return tsigAlgorithm;
  }

  public void setTsigAlgorithm(String tsigAlgorithm) {
    this.tsigAlgorithm = tsigAlgorithm;
  }

  public V1alpha2IssuerSpecAcmeDns01Rfc2136 tsigKeyName(String tsigKeyName) {

    this.tsigKeyName = tsigKeyName;
    return this;
  }

  /**
   * The TSIG Key name configured in the DNS. If &#x60;&#x60;tsigSecretSecretRef&#x60;&#x60; is
   * defined, this field is required.
   *
   * @return tsigKeyName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The TSIG Key name configured in the DNS. If ``tsigSecretSecretRef`` is defined, this field is required.")
  public String getTsigKeyName() {
    return tsigKeyName;
  }

  public void setTsigKeyName(String tsigKeyName) {
    this.tsigKeyName = tsigKeyName;
  }

  public V1alpha2IssuerSpecAcmeDns01Rfc2136 tsigSecretSecretRef(
      V1alpha2IssuerSpecAcmeDns01Rfc2136TsigSecretSecretRef tsigSecretSecretRef) {

    this.tsigSecretSecretRef = tsigSecretSecretRef;
    return this;
  }

  /**
   * Get tsigSecretSecretRef
   *
   * @return tsigSecretSecretRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeDns01Rfc2136TsigSecretSecretRef getTsigSecretSecretRef() {
    return tsigSecretSecretRef;
  }

  public void setTsigSecretSecretRef(
      V1alpha2IssuerSpecAcmeDns01Rfc2136TsigSecretSecretRef tsigSecretSecretRef) {
    this.tsigSecretSecretRef = tsigSecretSecretRef;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecAcmeDns01Rfc2136 v1alpha2IssuerSpecAcmeDns01Rfc2136 =
        (V1alpha2IssuerSpecAcmeDns01Rfc2136) o;
    return Objects.equals(this.nameserver, v1alpha2IssuerSpecAcmeDns01Rfc2136.nameserver)
        && Objects.equals(this.tsigAlgorithm, v1alpha2IssuerSpecAcmeDns01Rfc2136.tsigAlgorithm)
        && Objects.equals(this.tsigKeyName, v1alpha2IssuerSpecAcmeDns01Rfc2136.tsigKeyName)
        && Objects.equals(
            this.tsigSecretSecretRef, v1alpha2IssuerSpecAcmeDns01Rfc2136.tsigSecretSecretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameserver, tsigAlgorithm, tsigKeyName, tsigSecretSecretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecAcmeDns01Rfc2136 {\n");
    sb.append("    nameserver: ").append(toIndentedString(nameserver)).append("\n");
    sb.append("    tsigAlgorithm: ").append(toIndentedString(tsigAlgorithm)).append("\n");
    sb.append("    tsigKeyName: ").append(toIndentedString(tsigKeyName)).append("\n");
    sb.append("    tsigSecretSecretRef: ")
        .append(toIndentedString(tsigSecretSecretRef))
        .append("\n");
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
