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
 * Configures cert-manager to attempt to complete authorizations by performing the HTTP01 challenge
 * flow. It is not possible to obtain certificates for wildcard domain names (e.g.
 * &#x60;*.example.com&#x60;) using the HTTP01 challenge mechanism.
 */
@ApiModel(
    description =
        "Configures cert-manager to attempt to complete authorizations by performing the HTTP01 challenge flow. It is not possible to obtain certificates for wildcard domain names (e.g. `*.example.com`) using the HTTP01 challenge mechanism.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeHttp01 {
  public static final String SERIALIZED_NAME_INGRESS = "ingress";

  @SerializedName(SERIALIZED_NAME_INGRESS)
  private V1alpha2IssuerSpecAcmeHttp01Ingress ingress;

  public V1alpha2IssuerSpecAcmeHttp01 ingress(V1alpha2IssuerSpecAcmeHttp01Ingress ingress) {

    this.ingress = ingress;
    return this;
  }

  /**
   * Get ingress
   *
   * @return ingress
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeHttp01Ingress getIngress() {
    return ingress;
  }

  public void setIngress(V1alpha2IssuerSpecAcmeHttp01Ingress ingress) {
    this.ingress = ingress;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecAcmeHttp01 v1alpha2IssuerSpecAcmeHttp01 = (V1alpha2IssuerSpecAcmeHttp01) o;
    return Objects.equals(this.ingress, v1alpha2IssuerSpecAcmeHttp01.ingress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecAcmeHttp01 {\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
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
