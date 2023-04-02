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
import java.util.Objects;

/** Options to control private keys used for the Certificate. */
@ApiModel(description = "Options to control private keys used for the Certificate.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1beta1CertificateSpecPrivateKey {
  /**
   * Algorithm is the private key algorithm of the corresponding private key for this certificate.
   * If provided, allowed values are either \&quot;rsa\&quot; or \&quot;ecdsa\&quot; If
   * &#x60;algorithm&#x60; is specified and &#x60;size&#x60; is not provided, key size of 256 will
   * be used for \&quot;ecdsa\&quot; key algorithm and key size of 2048 will be used for
   * \&quot;rsa\&quot; key algorithm.
   */
  @JsonAdapter(AlgorithmEnum.Adapter.class)
  public enum AlgorithmEnum {
    RSA("RSA"),

    ECDSA("ECDSA");

    private String value;

    AlgorithmEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AlgorithmEnum fromValue(String value) {
      for (AlgorithmEnum b : AlgorithmEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AlgorithmEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlgorithmEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlgorithmEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AlgorithmEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ALGORITHM = "algorithm";

  @SerializedName(SERIALIZED_NAME_ALGORITHM)
  private AlgorithmEnum algorithm;

  /**
   * The private key cryptography standards (PKCS) encoding for this certificate&#39;s private key
   * to be encoded in. If provided, allowed values are \&quot;pkcs1\&quot; and \&quot;pkcs8\&quot;
   * standing for PKCS#1 and PKCS#8, respectively. Defaults to PKCS#1 if not specified.
   */
  @JsonAdapter(EncodingEnum.Adapter.class)
  public enum EncodingEnum {
    PKCS1("PKCS1"),

    PKCS8("PKCS8");

    private String value;

    EncodingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EncodingEnum fromValue(String value) {
      for (EncodingEnum b : EncodingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EncodingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EncodingEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EncodingEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EncodingEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENCODING = "encoding";

  @SerializedName(SERIALIZED_NAME_ENCODING)
  private EncodingEnum encoding;

  public static final String SERIALIZED_NAME_ROTATION_POLICY = "rotationPolicy";

  @SerializedName(SERIALIZED_NAME_ROTATION_POLICY)
  private String rotationPolicy;

  public static final String SERIALIZED_NAME_SIZE = "size";

  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public V1beta1CertificateSpecPrivateKey algorithm(AlgorithmEnum algorithm) {

    this.algorithm = algorithm;
    return this;
  }

  /**
   * Algorithm is the private key algorithm of the corresponding private key for this certificate.
   * If provided, allowed values are either \&quot;rsa\&quot; or \&quot;ecdsa\&quot; If
   * &#x60;algorithm&#x60; is specified and &#x60;size&#x60; is not provided, key size of 256 will
   * be used for \&quot;ecdsa\&quot; key algorithm and key size of 2048 will be used for
   * \&quot;rsa\&quot; key algorithm.
   *
   * @return algorithm
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Algorithm is the private key algorithm of the corresponding private key for this certificate. If provided, allowed values are either \"rsa\" or \"ecdsa\" If `algorithm` is specified and `size` is not provided, key size of 256 will be used for \"ecdsa\" key algorithm and key size of 2048 will be used for \"rsa\" key algorithm.")
  public AlgorithmEnum getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(AlgorithmEnum algorithm) {
    this.algorithm = algorithm;
  }

  public V1beta1CertificateSpecPrivateKey encoding(EncodingEnum encoding) {

    this.encoding = encoding;
    return this;
  }

  /**
   * The private key cryptography standards (PKCS) encoding for this certificate&#39;s private key
   * to be encoded in. If provided, allowed values are \&quot;pkcs1\&quot; and \&quot;pkcs8\&quot;
   * standing for PKCS#1 and PKCS#8, respectively. Defaults to PKCS#1 if not specified.
   *
   * @return encoding
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The private key cryptography standards (PKCS) encoding for this certificate's private key to be encoded in. If provided, allowed values are \"pkcs1\" and \"pkcs8\" standing for PKCS#1 and PKCS#8, respectively. Defaults to PKCS#1 if not specified.")
  public EncodingEnum getEncoding() {
    return encoding;
  }

  public void setEncoding(EncodingEnum encoding) {
    this.encoding = encoding;
  }

  public V1beta1CertificateSpecPrivateKey rotationPolicy(String rotationPolicy) {

    this.rotationPolicy = rotationPolicy;
    return this;
  }

  /**
   * RotationPolicy controls how private keys should be regenerated when a re-issuance is being
   * processed. If set to Never, a private key will only be generated if one does not already exist
   * in the target &#x60;spec.secretName&#x60;. If one does exists but it does not have the correct
   * algorithm or size, a warning will be raised to await user intervention. If set to Always, a
   * private key matching the specified requirements will be generated whenever a re-issuance
   * occurs. Default is &#39;Never&#39; for backward compatibility.
   *
   * @return rotationPolicy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "RotationPolicy controls how private keys should be regenerated when a re-issuance is being processed. If set to Never, a private key will only be generated if one does not already exist in the target `spec.secretName`. If one does exists but it does not have the correct algorithm or size, a warning will be raised to await user intervention. If set to Always, a private key matching the specified requirements will be generated whenever a re-issuance occurs. Default is 'Never' for backward compatibility.")
  public String getRotationPolicy() {
    return rotationPolicy;
  }

  public void setRotationPolicy(String rotationPolicy) {
    this.rotationPolicy = rotationPolicy;
  }

  public V1beta1CertificateSpecPrivateKey size(Integer size) {

    this.size = size;
    return this;
  }

  /**
   * Size is the key bit size of the corresponding private key for this certificate. If
   * &#x60;algorithm&#x60; is set to &#x60;RSA&#x60;, valid values are &#x60;2048&#x60;,
   * &#x60;4096&#x60; or &#x60;8192&#x60;, and will default to &#x60;2048&#x60; if not specified. If
   * &#x60;algorithm&#x60; is set to &#x60;ECDSA&#x60;, valid values are &#x60;256&#x60;,
   * &#x60;384&#x60; or &#x60;521&#x60;, and will default to &#x60;256&#x60; if not specified. No
   * other values are allowed. minimum: 0 maximum: 8192
   *
   * @return size
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Size is the key bit size of the corresponding private key for this certificate. If `algorithm` is set to `RSA`, valid values are `2048`, `4096` or `8192`, and will default to `2048` if not specified. If `algorithm` is set to `ECDSA`, valid values are `256`, `384` or `521`, and will default to `256` if not specified. No other values are allowed.")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CertificateSpecPrivateKey v1beta1CertificateSpecPrivateKey =
        (V1beta1CertificateSpecPrivateKey) o;
    return Objects.equals(this.algorithm, v1beta1CertificateSpecPrivateKey.algorithm)
        && Objects.equals(this.encoding, v1beta1CertificateSpecPrivateKey.encoding)
        && Objects.equals(this.rotationPolicy, v1beta1CertificateSpecPrivateKey.rotationPolicy)
        && Objects.equals(this.size, v1beta1CertificateSpecPrivateKey.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, encoding, rotationPolicy, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CertificateSpecPrivateKey {\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    rotationPolicy: ").append(toIndentedString(rotationPolicy)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
