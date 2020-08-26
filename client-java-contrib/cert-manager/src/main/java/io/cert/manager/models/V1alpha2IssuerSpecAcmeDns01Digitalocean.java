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

/** Use the DigitalOcean DNS API to manage DNS01 challenge records. */
@ApiModel(description = "Use the DigitalOcean DNS API to manage DNS01 challenge records.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeDns01Digitalocean {
  public static final String SERIALIZED_NAME_TOKEN_SECRET_REF = "tokenSecretRef";

  @SerializedName(SERIALIZED_NAME_TOKEN_SECRET_REF)
  private V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef tokenSecretRef;

  public V1alpha2IssuerSpecAcmeDns01Digitalocean tokenSecretRef(
      V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef tokenSecretRef) {

    this.tokenSecretRef = tokenSecretRef;
    return this;
  }

  /**
   * Get tokenSecretRef
   *
   * @return tokenSecretRef
   */
  @ApiModelProperty(required = true, value = "")
  public V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef getTokenSecretRef() {
    return tokenSecretRef;
  }

  public void setTokenSecretRef(V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef tokenSecretRef) {
    this.tokenSecretRef = tokenSecretRef;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecAcmeDns01Digitalocean v1alpha2IssuerSpecAcmeDns01Digitalocean =
        (V1alpha2IssuerSpecAcmeDns01Digitalocean) o;
    return Objects.equals(
        this.tokenSecretRef, v1alpha2IssuerSpecAcmeDns01Digitalocean.tokenSecretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenSecretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecAcmeDns01Digitalocean {\n");
    sb.append("    tokenSecretRef: ").append(toIndentedString(tokenSecretRef)).append("\n");
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
