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
public class V1alpha2CertificateSpec {
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

  /**
   * KeyAlgorithm is the private key algorithm of the corresponding private key for this
   * certificate. If provided, allowed values are either \&quot;rsa\&quot; or \&quot;ecdsa\&quot; If
   * &#x60;keyAlgorithm&#x60; is specified and &#x60;keySize&#x60; is not provided, key size of 256
   * will be used for \&quot;ecdsa\&quot; key algorithm and key size of 2048 will be used for
   * \&quot;rsa\&quot; key algorithm.
   */
  @JsonAdapter(KeyAlgorithmEnum.Adapter.class)
  public enum KeyAlgorithmEnum {
    RSA("rsa"),

    ECDSA("ecdsa");

    private String value;

    KeyAlgorithmEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KeyAlgorithmEnum fromValue(String value) {
      for (KeyAlgorithmEnum b : KeyAlgorithmEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KeyAlgorithmEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyAlgorithmEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeyAlgorithmEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return KeyAlgorithmEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_KEY_ALGORITHM = "keyAlgorithm";

  @SerializedName(SERIALIZED_NAME_KEY_ALGORITHM)
  private KeyAlgorithmEnum keyAlgorithm;

  /**
   * KeyEncoding is the private key cryptography standards (PKCS) for this certificate&#39;s private
   * key to be encoded in. If provided, allowed values are \&quot;pkcs1\&quot; and
   * \&quot;pkcs8\&quot; standing for PKCS#1 and PKCS#8, respectively. If KeyEncoding is not
   * specified, then PKCS#1 will be used by default.
   */
  @JsonAdapter(KeyEncodingEnum.Adapter.class)
  public enum KeyEncodingEnum {
    PKCS1("pkcs1"),

    PKCS8("pkcs8");

    private String value;

    KeyEncodingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KeyEncodingEnum fromValue(String value) {
      for (KeyEncodingEnum b : KeyEncodingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KeyEncodingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyEncodingEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeyEncodingEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return KeyEncodingEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_KEY_ENCODING = "keyEncoding";

  @SerializedName(SERIALIZED_NAME_KEY_ENCODING)
  private KeyEncodingEnum keyEncoding;

  public static final String SERIALIZED_NAME_KEY_SIZE = "keySize";

  @SerializedName(SERIALIZED_NAME_KEY_SIZE)
  private Integer keySize;

  public static final String SERIALIZED_NAME_KEYSTORES = "keystores";

  @SerializedName(SERIALIZED_NAME_KEYSTORES)
  private V1beta1CertificateSpecKeystores keystores;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";

  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private List<String> organization = null;

  public static final String SERIALIZED_NAME_PRIVATE_KEY = "privateKey";

  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY)
  private V1alpha2CertificateSpecPrivateKey privateKey;

  public static final String SERIALIZED_NAME_RENEW_BEFORE = "renewBefore";

  @SerializedName(SERIALIZED_NAME_RENEW_BEFORE)
  private String renewBefore;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";

  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";

  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private V1alpha2CertificateSpecSubject subject;

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

  public V1alpha2CertificateSpec commonName(String commonName) {

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

  public V1alpha2CertificateSpec dnsNames(List<String> dnsNames) {

    this.dnsNames = dnsNames;
    return this;
  }

  public V1alpha2CertificateSpec addDnsNamesItem(String dnsNamesItem) {
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

  public V1alpha2CertificateSpec duration(String duration) {

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

  public V1alpha2CertificateSpec emailSANs(List<String> emailSANs) {

    this.emailSANs = emailSANs;
    return this;
  }

  public V1alpha2CertificateSpec addEmailSANsItem(String emailSANsItem) {
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

  public V1alpha2CertificateSpec ipAddresses(List<String> ipAddresses) {

    this.ipAddresses = ipAddresses;
    return this;
  }

  public V1alpha2CertificateSpec addIpAddressesItem(String ipAddressesItem) {
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

  public V1alpha2CertificateSpec isCA(Boolean isCA) {

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

  public V1alpha2CertificateSpec issuerRef(V1beta1CertificateSpecIssuerRef issuerRef) {

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

  public V1alpha2CertificateSpec keyAlgorithm(KeyAlgorithmEnum keyAlgorithm) {

    this.keyAlgorithm = keyAlgorithm;
    return this;
  }

  /**
   * KeyAlgorithm is the private key algorithm of the corresponding private key for this
   * certificate. If provided, allowed values are either \&quot;rsa\&quot; or \&quot;ecdsa\&quot; If
   * &#x60;keyAlgorithm&#x60; is specified and &#x60;keySize&#x60; is not provided, key size of 256
   * will be used for \&quot;ecdsa\&quot; key algorithm and key size of 2048 will be used for
   * \&quot;rsa\&quot; key algorithm.
   *
   * @return keyAlgorithm
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "KeyAlgorithm is the private key algorithm of the corresponding private key for this certificate. If provided, allowed values are either \"rsa\" or \"ecdsa\" If `keyAlgorithm` is specified and `keySize` is not provided, key size of 256 will be used for \"ecdsa\" key algorithm and key size of 2048 will be used for \"rsa\" key algorithm.")
  public KeyAlgorithmEnum getKeyAlgorithm() {
    return keyAlgorithm;
  }

  public void setKeyAlgorithm(KeyAlgorithmEnum keyAlgorithm) {
    this.keyAlgorithm = keyAlgorithm;
  }

  public V1alpha2CertificateSpec keyEncoding(KeyEncodingEnum keyEncoding) {

    this.keyEncoding = keyEncoding;
    return this;
  }

  /**
   * KeyEncoding is the private key cryptography standards (PKCS) for this certificate&#39;s private
   * key to be encoded in. If provided, allowed values are \&quot;pkcs1\&quot; and
   * \&quot;pkcs8\&quot; standing for PKCS#1 and PKCS#8, respectively. If KeyEncoding is not
   * specified, then PKCS#1 will be used by default.
   *
   * @return keyEncoding
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "KeyEncoding is the private key cryptography standards (PKCS) for this certificate's private key to be encoded in. If provided, allowed values are \"pkcs1\" and \"pkcs8\" standing for PKCS#1 and PKCS#8, respectively. If KeyEncoding is not specified, then PKCS#1 will be used by default.")
  public KeyEncodingEnum getKeyEncoding() {
    return keyEncoding;
  }

  public void setKeyEncoding(KeyEncodingEnum keyEncoding) {
    this.keyEncoding = keyEncoding;
  }

  public V1alpha2CertificateSpec keySize(Integer keySize) {

    this.keySize = keySize;
    return this;
  }

  /**
   * KeySize is the key bit size of the corresponding private key for this certificate. If
   * &#x60;keyAlgorithm&#x60; is set to &#x60;RSA&#x60;, valid values are &#x60;2048&#x60;,
   * &#x60;4096&#x60; or &#x60;8192&#x60;, and will default to &#x60;2048&#x60; if not specified. If
   * &#x60;keyAlgorithm&#x60; is set to &#x60;ECDSA&#x60;, valid values are &#x60;256&#x60;,
   * &#x60;384&#x60; or &#x60;521&#x60;, and will default to &#x60;256&#x60; if not specified. No
   * other values are allowed. minimum: 0 maximum: 8192
   *
   * @return keySize
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "KeySize is the key bit size of the corresponding private key for this certificate. If `keyAlgorithm` is set to `RSA`, valid values are `2048`, `4096` or `8192`, and will default to `2048` if not specified. If `keyAlgorithm` is set to `ECDSA`, valid values are `256`, `384` or `521`, and will default to `256` if not specified. No other values are allowed.")
  public Integer getKeySize() {
    return keySize;
  }

  public void setKeySize(Integer keySize) {
    this.keySize = keySize;
  }

  public V1alpha2CertificateSpec keystores(V1beta1CertificateSpecKeystores keystores) {

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

  public V1alpha2CertificateSpec organization(List<String> organization) {

    this.organization = organization;
    return this;
  }

  public V1alpha2CertificateSpec addOrganizationItem(String organizationItem) {
    if (this.organization == null) {
      this.organization = new ArrayList<String>();
    }
    this.organization.add(organizationItem);
    return this;
  }

  /**
   * Organization is a list of organizations to be used on the Certificate.
   *
   * @return organization
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Organization is a list of organizations to be used on the Certificate.")
  public List<String> getOrganization() {
    return organization;
  }

  public void setOrganization(List<String> organization) {
    this.organization = organization;
  }

  public V1alpha2CertificateSpec privateKey(V1alpha2CertificateSpecPrivateKey privateKey) {

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
  public V1alpha2CertificateSpecPrivateKey getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(V1alpha2CertificateSpecPrivateKey privateKey) {
    this.privateKey = privateKey;
  }

  public V1alpha2CertificateSpec renewBefore(String renewBefore) {

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

  public V1alpha2CertificateSpec secretName(String secretName) {

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

  public V1alpha2CertificateSpec subject(V1alpha2CertificateSpecSubject subject) {

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
  public V1alpha2CertificateSpecSubject getSubject() {
    return subject;
  }

  public void setSubject(V1alpha2CertificateSpecSubject subject) {
    this.subject = subject;
  }

  public V1alpha2CertificateSpec uriSANs(List<String> uriSANs) {

    this.uriSANs = uriSANs;
    return this;
  }

  public V1alpha2CertificateSpec addUriSANsItem(String uriSANsItem) {
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

  public V1alpha2CertificateSpec usages(List<UsagesEnum> usages) {

    this.usages = usages;
    return this;
  }

  public V1alpha2CertificateSpec addUsagesItem(UsagesEnum usagesItem) {
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
    V1alpha2CertificateSpec v1alpha2CertificateSpec = (V1alpha2CertificateSpec) o;
    return Objects.equals(this.commonName, v1alpha2CertificateSpec.commonName)
        && Objects.equals(this.dnsNames, v1alpha2CertificateSpec.dnsNames)
        && Objects.equals(this.duration, v1alpha2CertificateSpec.duration)
        && Objects.equals(this.emailSANs, v1alpha2CertificateSpec.emailSANs)
        && Objects.equals(this.ipAddresses, v1alpha2CertificateSpec.ipAddresses)
        && Objects.equals(this.isCA, v1alpha2CertificateSpec.isCA)
        && Objects.equals(this.issuerRef, v1alpha2CertificateSpec.issuerRef)
        && Objects.equals(this.keyAlgorithm, v1alpha2CertificateSpec.keyAlgorithm)
        && Objects.equals(this.keyEncoding, v1alpha2CertificateSpec.keyEncoding)
        && Objects.equals(this.keySize, v1alpha2CertificateSpec.keySize)
        && Objects.equals(this.keystores, v1alpha2CertificateSpec.keystores)
        && Objects.equals(this.organization, v1alpha2CertificateSpec.organization)
        && Objects.equals(this.privateKey, v1alpha2CertificateSpec.privateKey)
        && Objects.equals(this.renewBefore, v1alpha2CertificateSpec.renewBefore)
        && Objects.equals(this.secretName, v1alpha2CertificateSpec.secretName)
        && Objects.equals(this.subject, v1alpha2CertificateSpec.subject)
        && Objects.equals(this.uriSANs, v1alpha2CertificateSpec.uriSANs)
        && Objects.equals(this.usages, v1alpha2CertificateSpec.usages);
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
        keyAlgorithm,
        keyEncoding,
        keySize,
        keystores,
        organization,
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
    sb.append("class V1alpha2CertificateSpec {\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    dnsNames: ").append(toIndentedString(dnsNames)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    emailSANs: ").append(toIndentedString(emailSANs)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    isCA: ").append(toIndentedString(isCA)).append("\n");
    sb.append("    issuerRef: ").append(toIndentedString(issuerRef)).append("\n");
    sb.append("    keyAlgorithm: ").append(toIndentedString(keyAlgorithm)).append("\n");
    sb.append("    keyEncoding: ").append(toIndentedString(keyEncoding)).append("\n");
    sb.append("    keySize: ").append(toIndentedString(keySize)).append("\n");
    sb.append("    keystores: ").append(toIndentedString(keystores)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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
