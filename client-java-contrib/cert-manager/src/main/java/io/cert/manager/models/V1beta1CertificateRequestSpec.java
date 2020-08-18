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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/** Desired state of the CertificateRequest resource. */
@ApiModel(description = "Desired state of the CertificateRequest resource.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1beta1CertificateRequestSpec {
  public static final String SERIALIZED_NAME_DURATION = "duration";

  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_IS_C_A = "isCA";

  @SerializedName(SERIALIZED_NAME_IS_C_A)
  private Boolean isCA;

  public static final String SERIALIZED_NAME_ISSUER_REF = "issuerRef";

  @SerializedName(SERIALIZED_NAME_ISSUER_REF)
  private V1beta1CertificateRequestSpecIssuerRef issuerRef;

  public static final String SERIALIZED_NAME_REQUEST = "request";

  @SerializedName(SERIALIZED_NAME_REQUEST)
  private byte[] request;

  /**
   * KeyUsage specifies valid usage contexts for keys. See:
   * https://tools.ietf.org/html/rfc5280#section-4.2.1.3
   * https://tools.ietf.org/html/rfc5280#section-4.2.1.12 Valid KeyUsage values are as follows:
   * \&quot;signing\&quot;, \&quot;digital signature\&quot;, \&quot;content commitment\&quot;,
   * \&quot;key encipherment\&quot;, \&quot;key agreement\&quot;, \&quot;data encipherment\&quot;,
   * \&quot;cert sign\&quot;, \&quot;crl sign\&quot;, \&quot;encipher only\&quot;, \&quot;decipher
   * only\&quot;, \&quot;any\&quot;, \&quot;server auth\&quot;, \&quot;client auth\&quot;,
   * \&quot;code signing\&quot;, \&quot;email protection\&quot;, \&quot;s/mime\&quot;, \&quot;ipsec
   * end system\&quot;, \&quot;ipsec tunnel\&quot;, \&quot;ipsec user\&quot;,
   * \&quot;timestamping\&quot;, \&quot;ocsp signing\&quot;, \&quot;microsoft sgc\&quot;,
   * \&quot;netscape sgc\&quot;
   */
  @JsonAdapter(UsagesEnum.Adapter.class)
  public enum UsagesEnum {
    SIGNING("signing"),

    DIGITAL_SIGNATURE("digital signature"),

    CONTENT_COMMITMENT("content commitment"),

    KEY_ENCIPHERMENT("key encipherment"),

    KEY_AGREEMENT("key agreement"),

    DATA_ENCIPHERMENT("data encipherment"),

    CERT_SIGN("cert sign"),

    CRL_SIGN("crl sign"),

    ENCIPHER_ONLY("encipher only"),

    DECIPHER_ONLY("decipher only"),

    ANY("any"),

    SERVER_AUTH("server auth"),

    CLIENT_AUTH("client auth"),

    CODE_SIGNING("code signing"),

    EMAIL_PROTECTION("email protection"),

    S_MIME("s/mime"),

    IPSEC_END_SYSTEM("ipsec end system"),

    IPSEC_TUNNEL("ipsec tunnel"),

    IPSEC_USER("ipsec user"),

    TIMESTAMPING("timestamping"),

    OCSP_SIGNING("ocsp signing"),

    MICROSOFT_SGC("microsoft sgc"),

    NETSCAPE_SGC("netscape sgc");

    private String value;

    UsagesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UsagesEnum fromValue(String value) {
      for (UsagesEnum b : UsagesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UsagesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UsagesEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UsagesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return UsagesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_USAGES = "usages";

  @SerializedName(SERIALIZED_NAME_USAGES)
  private List<UsagesEnum> usages = null;

  public V1beta1CertificateRequestSpec duration(String duration) {

    this.duration = duration;
    return this;
  }

  /**
   * The requested &#39;duration&#39; (i.e. lifetime) of the Certificate. This option may be
   * ignored/overridden by some issuer types.
   *
   * @return duration
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The requested 'duration' (i.e. lifetime) of the Certificate. This option may be ignored/overridden by some issuer types.")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public V1beta1CertificateRequestSpec isCA(Boolean isCA) {

    this.isCA = isCA;
    return this;
  }

  /**
   * IsCA will request to mark the certificate as valid for certificate signing when submitting to
   * the issuer. This will automatically add the &#x60;cert sign&#x60; usage to the list of
   * &#x60;usages&#x60;.
   *
   * @return isCA
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "IsCA will request to mark the certificate as valid for certificate signing when submitting to the issuer. This will automatically add the `cert sign` usage to the list of `usages`.")
  public Boolean getIsCA() {
    return isCA;
  }

  public void setIsCA(Boolean isCA) {
    this.isCA = isCA;
  }

  public V1beta1CertificateRequestSpec issuerRef(V1beta1CertificateRequestSpecIssuerRef issuerRef) {

    this.issuerRef = issuerRef;
    return this;
  }

  /**
   * Get issuerRef
   *
   * @return issuerRef
   */
  @ApiModelProperty(required = true, value = "")
  public V1beta1CertificateRequestSpecIssuerRef getIssuerRef() {
    return issuerRef;
  }

  public void setIssuerRef(V1beta1CertificateRequestSpecIssuerRef issuerRef) {
    this.issuerRef = issuerRef;
  }

  public V1beta1CertificateRequestSpec request(byte[] request) {

    this.request = request;
    return this;
  }

  /**
   * The PEM-encoded x509 certificate signing request to be submitted to the CA for signing.
   *
   * @return request
   */
  @ApiModelProperty(
      required = true,
      value =
          "The PEM-encoded x509 certificate signing request to be submitted to the CA for signing.")
  public byte[] getRequest() {
    return request;
  }

  public void setRequest(byte[] request) {
    this.request = request;
  }

  public V1beta1CertificateRequestSpec usages(List<UsagesEnum> usages) {

    this.usages = usages;
    return this;
  }

  public V1beta1CertificateRequestSpec addUsagesItem(UsagesEnum usagesItem) {
    if (this.usages == null) {
      this.usages = new ArrayList<UsagesEnum>();
    }
    this.usages.add(usagesItem);
    return this;
  }

  /**
   * Usages is the set of x509 usages that are requested for the certificate. Defaults to
   * &#x60;digital signature&#x60; and &#x60;key encipherment&#x60; if not specified.
   *
   * @return usages
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Usages is the set of x509 usages that are requested for the certificate. Defaults to `digital signature` and `key encipherment` if not specified.")
  public List<UsagesEnum> getUsages() {
    return usages;
  }

  public void setUsages(List<UsagesEnum> usages) {
    this.usages = usages;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CertificateRequestSpec v1beta1CertificateRequestSpec = (V1beta1CertificateRequestSpec) o;
    return Objects.equals(this.duration, v1beta1CertificateRequestSpec.duration)
        && Objects.equals(this.isCA, v1beta1CertificateRequestSpec.isCA)
        && Objects.equals(this.issuerRef, v1beta1CertificateRequestSpec.issuerRef)
        && Arrays.equals(this.request, v1beta1CertificateRequestSpec.request)
        && Objects.equals(this.usages, v1beta1CertificateRequestSpec.usages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, isCA, issuerRef, Arrays.hashCode(request), usages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CertificateRequestSpec {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    isCA: ").append(toIndentedString(isCA)).append("\n");
    sb.append("    issuerRef: ").append(toIndentedString(issuerRef)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
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
