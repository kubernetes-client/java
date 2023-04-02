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

/** Options to control private keys used for the Certificate. */
@ApiModel(description = "Options to control private keys used for the Certificate.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2CertificateSpecPrivateKey {
  public static final String SERIALIZED_NAME_ROTATION_POLICY = "rotationPolicy";

  @SerializedName(SERIALIZED_NAME_ROTATION_POLICY)
  private String rotationPolicy;

  public V1alpha2CertificateSpecPrivateKey rotationPolicy(String rotationPolicy) {

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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2CertificateSpecPrivateKey v1alpha2CertificateSpecPrivateKey =
        (V1alpha2CertificateSpecPrivateKey) o;
    return Objects.equals(this.rotationPolicy, v1alpha2CertificateSpecPrivateKey.rotationPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rotationPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2CertificateSpecPrivateKey {\n");
    sb.append("    rotationPolicy: ").append(toIndentedString(rotationPolicy)).append("\n");
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
