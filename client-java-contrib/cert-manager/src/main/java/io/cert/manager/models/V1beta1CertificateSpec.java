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
import java.util.List;
import java.util.Objects;

/** Desired state of the Certificate resource. */
@ApiModel(description = "Desired state of the Certificate resource.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1beta1CertificateSpec {
  public static final String SERIALIZED_NAME_COMMON_NAME = "commonName";

  @SerializedName(SERIALIZED_NAME_COMMON_NAME)
  private String commonName;

  public static final String SERIALIZED_NAME_DNS_NAMES = "dnsNames";

  @SerializedName(SERIALIZED_NAME_DNS_NAMES)
  private List<String> dnsNames = null;

  public static final String SERIALIZED_NAME_DURATION = "duration";

  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_EMAIL_S_A_NS = "emailSANs";

  @SerializedName(SERIALIZED_NAME_EMAIL_S_A_NS)
  private List<String> emailSANs = null;

  public static final String SERIALIZED_NAME_IP_ADDRESSES = "ipAddresses";

  @SerializedName(SERIALIZED_NAME_IP_ADDRESSES)
  private List<String> ipAddresses = null;

  public static final String SERIALIZED_NAME_IS_C_A = "isCA";

  @SerializedName(SERIALIZED_NAME_IS_C_A)
  private Boolean isCA;

  public static final String SERIALIZED_NAME_ISSUER_REF = "issuerRef";

  @SerializedName(SERIALIZED_NAME_ISSUER_REF)
  private V1beta1CertificateSpecIssuerRef issuerRef;

  public static final String SERIALIZED_NAME_KEYSTORES = "keystores";

  @SerializedName(SERIALIZED_NAME_KEYSTORES)
  private V1beta1CertificateSpecKeystores keystores;

  public static final String SERIALIZED_NAME_PRIVATE_KEY = "privateKey";

  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY)
  private V1beta1CertificateSpecPrivateKey privateKey;

  public static final String SERIALIZED_NAME_RENEW_BEFORE = "renewBefore";

  @SerializedName(SERIALIZED_NAME_RENEW_BEFORE)
  private String renewBefore;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";

  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";

  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private V1beta1CertificateSpecSubject subject;

  public static final String SERIALIZED_NAME_URI_S_A_NS = "uriSANs";

  @SerializedName(SERIALIZED_NAME_URI_S_A_NS)
  private List<String> uriSANs = null;

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

  public V1beta1CertificateSpec commonName(String commonName) {

    this.commonName = commonName;
    return this;
  }

  /**
   * CommonName is a common name to be used on the Certificate. The CommonName should have a length
   * of 64 characters or fewer to avoid generating invalid CSRs. This value is ignored by TLS
   * clients when any subject alt name is set. This is x509 behaviour:
   * https://tools.ietf.org/html/rfc6125#section-6.4.4
   *
   * @return commonName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "CommonName is a common name to be used on the Certificate. The CommonName should have a length of 64 characters or fewer to avoid generating invalid CSRs. This value is ignored by TLS clients when any subject alt name is set. This is x509 behaviour: https://tools.ietf.org/html/rfc6125#section-6.4.4")
  public String getCommonName() {
    return commonName;
  }

  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }

  public V1beta1CertificateSpec dnsNames(List<String> dnsNames) {

    this.dnsNames = dnsNames;
    return this;
  }

  public V1beta1CertificateSpec addDnsNamesItem(String dnsNamesItem) {
    if (this.dnsNames == null) {
      this.dnsNames = new ArrayList<String>();
    }
    this.dnsNames.add(dnsNamesItem);
    return this;
  }

  /**
   * DNSNames is a list of DNS subjectAltNames to be set on the Certificate.
   *
   * @return dnsNames
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "DNSNames is a list of DNS subjectAltNames to be set on the Certificate.")
  public List<String> getDnsNames() {
    return dnsNames;
  }

  public void setDnsNames(List<String> dnsNames) {
    this.dnsNames = dnsNames;
  }

  public V1beta1CertificateSpec duration(String duration) {

    this.duration = duration;
    return this;
  }

  /**
   * The requested &#39;duration&#39; (i.e. lifetime) of the Certificate. This option may be
   * ignored/overridden by some issuer types. If overridden and &#x60;renewBefore&#x60; is greater
   * than the actual certificate duration, the certificate will be automatically renewed 2/3rds of
   * the way through the certificate&#39;s duration.
   *
   * @return duration
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The requested 'duration' (i.e. lifetime) of the Certificate. This option may be ignored/overridden by some issuer types. If overridden and `renewBefore` is greater than the actual certificate duration, the certificate will be automatically renewed 2/3rds of the way through the certificate's duration.")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public V1beta1CertificateSpec emailSANs(List<String> emailSANs) {

    this.emailSANs = emailSANs;
    return this;
  }

  public V1beta1CertificateSpec addEmailSANsItem(String emailSANsItem) {
    if (this.emailSANs == null) {
      this.emailSANs = new ArrayList<String>();
    }
    this.emailSANs.add(emailSANsItem);
    return this;
  }

  /**
   * EmailSANs is a list of email subjectAltNames to be set on the Certificate.
   *
   * @return emailSANs
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "EmailSANs is a list of email subjectAltNames to be set on the Certificate.")
  public List<String> getEmailSANs() {
    return emailSANs;
  }

  public void setEmailSANs(List<String> emailSANs) {
    this.emailSANs = emailSANs;
  }

  public V1beta1CertificateSpec ipAddresses(List<String> ipAddresses) {

    this.ipAddresses = ipAddresses;
    return this;
  }

  public V1beta1CertificateSpec addIpAddressesItem(String ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<String>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

  /**
   * IPAddresses is a list of IP address subjectAltNames to be set on the Certificate.
   *
   * @return ipAddresses
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "IPAddresses is a list of IP address subjectAltNames to be set on the Certificate.")
  public List<String> getIpAddresses() {
    return ipAddresses;
  }

  public void setIpAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }

  public V1beta1CertificateSpec isCA(Boolean isCA) {

    this.isCA = isCA;
    return this;
  }

  /**
   * IsCA will mark this Certificate as valid for certificate signing. This will automatically add
   * the &#x60;cert sign&#x60; usage to the list of &#x60;usages&#x60;.
   *
   * @return isCA
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "IsCA will mark this Certificate as valid for certificate signing. This will automatically add the `cert sign` usage to the list of `usages`.")
  public Boolean getIsCA() {
    return isCA;
  }

  public void setIsCA(Boolean isCA) {
    this.isCA = isCA;
  }

  public V1beta1CertificateSpec issuerRef(V1beta1CertificateSpecIssuerRef issuerRef) {

    this.issuerRef = issuerRef;
    return this;
  }

  /**
   * Get issuerRef
   *
   * @return issuerRef
   */
  @ApiModelProperty(required = true, value = "")
  public V1beta1CertificateSpecIssuerRef getIssuerRef() {
    return issuerRef;
  }

  public void setIssuerRef(V1beta1CertificateSpecIssuerRef issuerRef) {
    this.issuerRef = issuerRef;
  }

  public V1beta1CertificateSpec keystores(V1beta1CertificateSpecKeystores keystores) {

    this.keystores = keystores;
    return this;
  }

  /**
   * Get keystores
   *
   * @return keystores
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1CertificateSpecKeystores getKeystores() {
    return keystores;
  }

  public void setKeystores(V1beta1CertificateSpecKeystores keystores) {
    this.keystores = keystores;
  }

  public V1beta1CertificateSpec privateKey(V1beta1CertificateSpecPrivateKey privateKey) {

    this.privateKey = privateKey;
    return this;
  }

  /**
   * Get privateKey
   *
   * @return privateKey
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1CertificateSpecPrivateKey getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(V1beta1CertificateSpecPrivateKey privateKey) {
    this.privateKey = privateKey;
  }

  public V1beta1CertificateSpec renewBefore(String renewBefore) {

    this.renewBefore = renewBefore;
    return this;
  }

  /**
   * The amount of time before the currently issued certificate&#39;s &#x60;notAfter&#x60; time that
   * cert-manager will begin to attempt to renew the certificate. If this value is greater than the
   * total duration of the certificate (i.e. notAfter - notBefore), it will be automatically renewed
   * 2/3rds of the way through the certificate&#39;s duration.
   *
   * @return renewBefore
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The amount of time before the currently issued certificate's `notAfter` time that cert-manager will begin to attempt to renew the certificate. If this value is greater than the total duration of the certificate (i.e. notAfter - notBefore), it will be automatically renewed 2/3rds of the way through the certificate's duration.")
  public String getRenewBefore() {
    return renewBefore;
  }

  public void setRenewBefore(String renewBefore) {
    this.renewBefore = renewBefore;
  }

  public V1beta1CertificateSpec secretName(String secretName) {

    this.secretName = secretName;
    return this;
  }

  /**
   * SecretName is the name of the secret resource that will be automatically created and managed by
   * this Certificate resource. It will be populated with a private key and certificate, signed by
   * the denoted issuer.
   *
   * @return secretName
   */
  @ApiModelProperty(
      required = true,
      value =
          "SecretName is the name of the secret resource that will be automatically created and managed by this Certificate resource. It will be populated with a private key and certificate, signed by the denoted issuer.")
  public String getSecretName() {
    return secretName;
  }

  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }

  public V1beta1CertificateSpec subject(V1beta1CertificateSpecSubject subject) {

    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   *
   * @return subject
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1CertificateSpecSubject getSubject() {
    return subject;
  }

  public void setSubject(V1beta1CertificateSpecSubject subject) {
    this.subject = subject;
  }

  public V1beta1CertificateSpec uriSANs(List<String> uriSANs) {

    this.uriSANs = uriSANs;
    return this;
  }

  public V1beta1CertificateSpec addUriSANsItem(String uriSANsItem) {
    if (this.uriSANs == null) {
      this.uriSANs = new ArrayList<String>();
    }
    this.uriSANs.add(uriSANsItem);
    return this;
  }

  /**
   * URISANs is a list of URI subjectAltNames to be set on the Certificate.
   *
   * @return uriSANs
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "URISANs is a list of URI subjectAltNames to be set on the Certificate.")
  public List<String> getUriSANs() {
    return uriSANs;
  }

  public void setUriSANs(List<String> uriSANs) {
    this.uriSANs = uriSANs;
  }

  public V1beta1CertificateSpec usages(List<UsagesEnum> usages) {

    this.usages = usages;
    return this;
  }

  public V1beta1CertificateSpec addUsagesItem(UsagesEnum usagesItem) {
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
    V1beta1CertificateSpec v1beta1CertificateSpec = (V1beta1CertificateSpec) o;
    return Objects.equals(this.commonName, v1beta1CertificateSpec.commonName)
        && Objects.equals(this.dnsNames, v1beta1CertificateSpec.dnsNames)
        && Objects.equals(this.duration, v1beta1CertificateSpec.duration)
        && Objects.equals(this.emailSANs, v1beta1CertificateSpec.emailSANs)
        && Objects.equals(this.ipAddresses, v1beta1CertificateSpec.ipAddresses)
        && Objects.equals(this.isCA, v1beta1CertificateSpec.isCA)
        && Objects.equals(this.issuerRef, v1beta1CertificateSpec.issuerRef)
        && Objects.equals(this.keystores, v1beta1CertificateSpec.keystores)
        && Objects.equals(this.privateKey, v1beta1CertificateSpec.privateKey)
        && Objects.equals(this.renewBefore, v1beta1CertificateSpec.renewBefore)
        && Objects.equals(this.secretName, v1beta1CertificateSpec.secretName)
        && Objects.equals(this.subject, v1beta1CertificateSpec.subject)
        && Objects.equals(this.uriSANs, v1beta1CertificateSpec.uriSANs)
        && Objects.equals(this.usages, v1beta1CertificateSpec.usages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        commonName,
        dnsNames,
        duration,
        emailSANs,
        ipAddresses,
        isCA,
        issuerRef,
        keystores,
        privateKey,
        renewBefore,
        secretName,
        subject,
        uriSANs,
        usages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CertificateSpec {\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    dnsNames: ").append(toIndentedString(dnsNames)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    emailSANs: ").append(toIndentedString(emailSANs)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    isCA: ").append(toIndentedString(isCA)).append("\n");
    sb.append("    issuerRef: ").append(toIndentedString(issuerRef)).append("\n");
    sb.append("    keystores: ").append(toIndentedString(keystores)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    renewBefore: ").append(toIndentedString(renewBefore)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    uriSANs: ").append(toIndentedString(uriSANs)).append("\n");
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
