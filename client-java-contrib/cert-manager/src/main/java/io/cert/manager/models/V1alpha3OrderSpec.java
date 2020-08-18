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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/** V1alpha3OrderSpec */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha3OrderSpec {
  public static final String SERIALIZED_NAME_COMMON_NAME = "commonName";

  @SerializedName(SERIALIZED_NAME_COMMON_NAME)
  private String commonName;

  public static final String SERIALIZED_NAME_CSR = "csr";

  @SerializedName(SERIALIZED_NAME_CSR)
  private byte[] csr;

  public static final String SERIALIZED_NAME_DNS_NAMES = "dnsNames";

  @SerializedName(SERIALIZED_NAME_DNS_NAMES)
  private List<String> dnsNames = new ArrayList<String>();

  public static final String SERIALIZED_NAME_ISSUER_REF = "issuerRef";

  @SerializedName(SERIALIZED_NAME_ISSUER_REF)
  private V1beta1OrderSpecIssuerRef issuerRef;

  public V1alpha3OrderSpec commonName(String commonName) {

    this.commonName = commonName;
    return this;
  }

  /**
   * CommonName is the common name as specified on the DER encoded CSR. If specified, this value
   * must also be present in &#x60;dnsNames&#x60;. This field must match the corresponding field on
   * the DER encoded CSR.
   *
   * @return commonName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "CommonName is the common name as specified on the DER encoded CSR. If specified, this value must also be present in `dnsNames`. This field must match the corresponding field on the DER encoded CSR.")
  public String getCommonName() {
    return commonName;
  }

  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }

  public V1alpha3OrderSpec csr(byte[] csr) {

    this.csr = csr;
    return this;
  }

  /**
   * Certificate signing request bytes in DER encoding. This will be used when finalizing the order.
   * This field must be set on the order.
   *
   * @return csr
   */
  @ApiModelProperty(
      required = true,
      value =
          "Certificate signing request bytes in DER encoding. This will be used when finalizing the order. This field must be set on the order.")
  public byte[] getCsr() {
    return csr;
  }

  public void setCsr(byte[] csr) {
    this.csr = csr;
  }

  public V1alpha3OrderSpec dnsNames(List<String> dnsNames) {

    this.dnsNames = dnsNames;
    return this;
  }

  public V1alpha3OrderSpec addDnsNamesItem(String dnsNamesItem) {
    this.dnsNames.add(dnsNamesItem);
    return this;
  }

  /**
   * DNSNames is a list of DNS names that should be included as part of the Order validation
   * process. This field must match the corresponding field on the DER encoded CSR.
   *
   * @return dnsNames
   */
  @ApiModelProperty(
      required = true,
      value =
          "DNSNames is a list of DNS names that should be included as part of the Order validation process. This field must match the corresponding field on the DER encoded CSR.")
  public List<String> getDnsNames() {
    return dnsNames;
  }

  public void setDnsNames(List<String> dnsNames) {
    this.dnsNames = dnsNames;
  }

  public V1alpha3OrderSpec issuerRef(V1beta1OrderSpecIssuerRef issuerRef) {

    this.issuerRef = issuerRef;
    return this;
  }

  /**
   * Get issuerRef
   *
   * @return issuerRef
   */
  @ApiModelProperty(required = true, value = "")
  public V1beta1OrderSpecIssuerRef getIssuerRef() {
    return issuerRef;
  }

  public void setIssuerRef(V1beta1OrderSpecIssuerRef issuerRef) {
    this.issuerRef = issuerRef;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3OrderSpec v1alpha3OrderSpec = (V1alpha3OrderSpec) o;
    return Objects.equals(this.commonName, v1alpha3OrderSpec.commonName)
        && Arrays.equals(this.csr, v1alpha3OrderSpec.csr)
        && Objects.equals(this.dnsNames, v1alpha3OrderSpec.dnsNames)
        && Objects.equals(this.issuerRef, v1alpha3OrderSpec.issuerRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonName, Arrays.hashCode(csr), dnsNames, issuerRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3OrderSpec {\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    csr: ").append(toIndentedString(csr)).append("\n");
    sb.append("    dnsNames: ").append(toIndentedString(dnsNames)).append("\n");
    sb.append("    issuerRef: ").append(toIndentedString(issuerRef)).append("\n");
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
