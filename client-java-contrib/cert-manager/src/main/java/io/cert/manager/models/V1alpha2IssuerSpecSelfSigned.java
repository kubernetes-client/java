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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SelfSigned configures this issuer to &#39;self sign&#39; certificates using the private key used
 * to create the CertificateRequest object.
 */
@ApiModel(
    description =
        "SelfSigned configures this issuer to 'self sign' certificates using the private key used to create the CertificateRequest object.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecSelfSigned {
  public static final String SERIALIZED_NAME_CRL_DISTRIBUTION_POINTS = "crlDistributionPoints";

  @SerializedName(SERIALIZED_NAME_CRL_DISTRIBUTION_POINTS)
  private List<String> crlDistributionPoints = null;

  public V1alpha2IssuerSpecSelfSigned crlDistributionPoints(List<String> crlDistributionPoints) {

    this.crlDistributionPoints = crlDistributionPoints;
    return this;
  }

  public V1alpha2IssuerSpecSelfSigned addCrlDistributionPointsItem(
      String crlDistributionPointsItem) {
    if (this.crlDistributionPoints == null) {
      this.crlDistributionPoints = new ArrayList<String>();
    }
    this.crlDistributionPoints.add(crlDistributionPointsItem);
    return this;
  }

  /**
   * The CRL distribution points is an X.509 v3 certificate extension which identifies the location
   * of the CRL from which the revocation of this certificate can be checked. If not set certificate
   * will be issued without CDP. Values are strings.
   *
   * @return crlDistributionPoints
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The CRL distribution points is an X.509 v3 certificate extension which identifies the location of the CRL from which the revocation of this certificate can be checked. If not set certificate will be issued without CDP. Values are strings.")
  public List<String> getCrlDistributionPoints() {
    return crlDistributionPoints;
  }

  public void setCrlDistributionPoints(List<String> crlDistributionPoints) {
    this.crlDistributionPoints = crlDistributionPoints;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecSelfSigned v1alpha2IssuerSpecSelfSigned = (V1alpha2IssuerSpecSelfSigned) o;
    return Objects.equals(
        this.crlDistributionPoints, v1alpha2IssuerSpecSelfSigned.crlDistributionPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crlDistributionPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecSelfSigned {\n");
    sb.append("    crlDistributionPoints: ")
        .append(toIndentedString(crlDistributionPoints))
        .append("\n");
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
