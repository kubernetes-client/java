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

/**
 * ExternalAccountBinding is a reference to a CA external account of the ACME server. If set, upon
 * registration cert-manager will attempt to associate the given external account credentials with
 * the registered ACME account.
 */
@ApiModel(
    description =
        "ExternalAccountBinding is a reference to a CA external account of the ACME server. If set, upon registration cert-manager will attempt to associate the given external account credentials with the registered ACME account.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeExternalAccountBinding {
  /**
   * keyAlgorithm is the MAC key algorithm that the key is used for. Valid values are
   * \&quot;HS256\&quot;, \&quot;HS384\&quot; and \&quot;HS512\&quot;.
   */
  @JsonAdapter(KeyAlgorithmEnum.Adapter.class)
  public enum KeyAlgorithmEnum {
    HS256("HS256"),

    HS384("HS384"),

    HS512("HS512");

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

  public static final String SERIALIZED_NAME_KEY_I_D = "keyID";

  @SerializedName(SERIALIZED_NAME_KEY_I_D)
  private String keyID;

  public static final String SERIALIZED_NAME_KEY_SECRET_REF = "keySecretRef";

  @SerializedName(SERIALIZED_NAME_KEY_SECRET_REF)
  private V1alpha2IssuerSpecAcmeExternalAccountBindingKeySecretRef keySecretRef;

  public V1alpha2IssuerSpecAcmeExternalAccountBinding keyAlgorithm(KeyAlgorithmEnum keyAlgorithm) {

    this.keyAlgorithm = keyAlgorithm;
    return this;
  }

  /**
   * keyAlgorithm is the MAC key algorithm that the key is used for. Valid values are
   * \&quot;HS256\&quot;, \&quot;HS384\&quot; and \&quot;HS512\&quot;.
   *
   * @return keyAlgorithm
   */
  @ApiModelProperty(
      required = true,
      value =
          "keyAlgorithm is the MAC key algorithm that the key is used for. Valid values are \"HS256\", \"HS384\" and \"HS512\".")
  public KeyAlgorithmEnum getKeyAlgorithm() {
    return keyAlgorithm;
  }

  public void setKeyAlgorithm(KeyAlgorithmEnum keyAlgorithm) {
    this.keyAlgorithm = keyAlgorithm;
  }

  public V1alpha2IssuerSpecAcmeExternalAccountBinding keyID(String keyID) {

    this.keyID = keyID;
    return this;
  }

  /**
   * keyID is the ID of the CA key that the External Account is bound to.
   *
   * @return keyID
   */
  @ApiModelProperty(
      required = true,
      value = "keyID is the ID of the CA key that the External Account is bound to.")
  public String getKeyID() {
    return keyID;
  }

  public void setKeyID(String keyID) {
    this.keyID = keyID;
  }

  public V1alpha2IssuerSpecAcmeExternalAccountBinding keySecretRef(
      V1alpha2IssuerSpecAcmeExternalAccountBindingKeySecretRef keySecretRef) {

    this.keySecretRef = keySecretRef;
    return this;
  }

  /**
   * Get keySecretRef
   *
   * @return keySecretRef
   */
  @ApiModelProperty(required = true, value = "")
  public V1alpha2IssuerSpecAcmeExternalAccountBindingKeySecretRef getKeySecretRef() {
    return keySecretRef;
  }

  public void setKeySecretRef(
      V1alpha2IssuerSpecAcmeExternalAccountBindingKeySecretRef keySecretRef) {
    this.keySecretRef = keySecretRef;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecAcmeExternalAccountBinding v1alpha2IssuerSpecAcmeExternalAccountBinding =
        (V1alpha2IssuerSpecAcmeExternalAccountBinding) o;
    return Objects.equals(
            this.keyAlgorithm, v1alpha2IssuerSpecAcmeExternalAccountBinding.keyAlgorithm)
        && Objects.equals(this.keyID, v1alpha2IssuerSpecAcmeExternalAccountBinding.keyID)
        && Objects.equals(
            this.keySecretRef, v1alpha2IssuerSpecAcmeExternalAccountBinding.keySecretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyAlgorithm, keyID, keySecretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecAcmeExternalAccountBinding {\n");
    sb.append("    keyAlgorithm: ").append(toIndentedString(keyAlgorithm)).append("\n");
    sb.append("    keyID: ").append(toIndentedString(keyID)).append("\n");
    sb.append("    keySecretRef: ").append(toIndentedString(keySecretRef)).append("\n");
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
