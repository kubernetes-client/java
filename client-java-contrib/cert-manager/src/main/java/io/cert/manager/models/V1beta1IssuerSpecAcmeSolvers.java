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
 * Configures an issuer to solve challenges using the specified options. Only one of HTTP01 or DNS01
 * may be provided.
 */
@ApiModel(
    description =
        "Configures an issuer to solve challenges using the specified options. Only one of HTTP01 or DNS01 may be provided.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1beta1IssuerSpecAcmeSolvers {
  public static final String SERIALIZED_NAME_DNS01 = "dns01";

  @SerializedName(SERIALIZED_NAME_DNS01)
  private V1beta1ChallengeSpecSolverDns01 dns01;

  public static final String SERIALIZED_NAME_HTTP01 = "http01";

  @SerializedName(SERIALIZED_NAME_HTTP01)
  private V1alpha2IssuerSpecAcmeHttp01 http01;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";

  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1alpha2IssuerSpecAcmeSelector selector;

  public V1beta1IssuerSpecAcmeSolvers dns01(V1beta1ChallengeSpecSolverDns01 dns01) {

    this.dns01 = dns01;
    return this;
  }

  /**
   * Get dns01
   *
   * @return dns01
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1ChallengeSpecSolverDns01 getDns01() {
    return dns01;
  }

  public void setDns01(V1beta1ChallengeSpecSolverDns01 dns01) {
    this.dns01 = dns01;
  }

  public V1beta1IssuerSpecAcmeSolvers http01(V1alpha2IssuerSpecAcmeHttp01 http01) {

    this.http01 = http01;
    return this;
  }

  /**
   * Get http01
   *
   * @return http01
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeHttp01 getHttp01() {
    return http01;
  }

  public void setHttp01(V1alpha2IssuerSpecAcmeHttp01 http01) {
    this.http01 = http01;
  }

  public V1beta1IssuerSpecAcmeSolvers selector(V1alpha2IssuerSpecAcmeSelector selector) {

    this.selector = selector;
    return this;
  }

  /**
   * Get selector
   *
   * @return selector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeSelector getSelector() {
    return selector;
  }

  public void setSelector(V1alpha2IssuerSpecAcmeSelector selector) {
    this.selector = selector;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1IssuerSpecAcmeSolvers v1beta1IssuerSpecAcmeSolvers = (V1beta1IssuerSpecAcmeSolvers) o;
    return Objects.equals(this.dns01, v1beta1IssuerSpecAcmeSolvers.dns01)
        && Objects.equals(this.http01, v1beta1IssuerSpecAcmeSolvers.http01)
        && Objects.equals(this.selector, v1beta1IssuerSpecAcmeSolvers.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dns01, http01, selector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1IssuerSpecAcmeSolvers {\n");
    sb.append("    dns01: ").append(toIndentedString(dns01)).append("\n");
    sb.append("    http01: ").append(toIndentedString(http01)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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
