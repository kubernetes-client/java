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
 * Solver contains the domain solving configuration that should be used to solve this challenge
 * resource.
 */
@ApiModel(
    description =
        "Solver contains the domain solving configuration that should be used to solve this challenge resource.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha3ChallengeSpecSolver {
  public static final String SERIALIZED_NAME_DNS01 = "dns01";

  @SerializedName(SERIALIZED_NAME_DNS01)
  private V1alpha2IssuerSpecAcmeDns01 dns01;

  public static final String SERIALIZED_NAME_HTTP01 = "http01";

  @SerializedName(SERIALIZED_NAME_HTTP01)
  private V1alpha2IssuerSpecAcmeHttp01 http01;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";

  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1alpha2IssuerSpecAcmeSelector selector;

  public V1alpha3ChallengeSpecSolver dns01(V1alpha2IssuerSpecAcmeDns01 dns01) {

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
  public V1alpha2IssuerSpecAcmeDns01 getDns01() {
    return dns01;
  }

  public void setDns01(V1alpha2IssuerSpecAcmeDns01 dns01) {
    this.dns01 = dns01;
  }

  public V1alpha3ChallengeSpecSolver http01(V1alpha2IssuerSpecAcmeHttp01 http01) {

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

  public V1alpha3ChallengeSpecSolver selector(V1alpha2IssuerSpecAcmeSelector selector) {

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
    V1alpha3ChallengeSpecSolver v1alpha3ChallengeSpecSolver = (V1alpha3ChallengeSpecSolver) o;
    return Objects.equals(this.dns01, v1alpha3ChallengeSpecSolver.dns01)
        && Objects.equals(this.http01, v1alpha3ChallengeSpecSolver.http01)
        && Objects.equals(this.selector, v1alpha3ChallengeSpecSolver.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dns01, http01, selector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3ChallengeSpecSolver {\n");
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
