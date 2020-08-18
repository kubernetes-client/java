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
 * CA configures this issuer to sign certificates using a signing CA keypair stored in a Secret
 * resource. This is used to build internal PKIs that are managed by cert-manager.
 */
@ApiModel(
    description =
        "CA configures this issuer to sign certificates using a signing CA keypair stored in a Secret resource. This is used to build internal PKIs that are managed by cert-manager.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecCa {
  public static final String SERIALIZED_NAME_CRL_DISTRIBUTION_POINTS = "crlDistributionPoints";

  @SerializedName(SERIALIZED_NAME_CRL_DISTRIBUTION_POINTS)
  private List<String> crlDistributionPoints = null;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";

  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;

  public V1alpha2IssuerSpecCa crlDistributionPoints(List<String> crlDistributionPoints) {

    this.crlDistributionPoints = crlDistributionPoints;
    return this;
  }

  public V1alpha2IssuerSpecCa addCrlDistributionPointsItem(String crlDistributionPointsItem) {
    if (this.crlDistributionPoints == null) {
      this.crlDistributionPoints = new ArrayList<String>();
    }
    this.crlDistributionPoints.add(crlDistributionPointsItem);
    return this;
  }

  /**
   * The CRL distribution points is an X.509 v3 certificate extension which identifies the location
   * of the CRL from which the revocation of this certificate can be checked. If not set,
   * certificates will be issued without distribution points set.
   *
   * @return crlDistributionPoints
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The CRL distribution points is an X.509 v3 certificate extension which identifies the location of the CRL from which the revocation of this certificate can be checked. If not set, certificates will be issued without distribution points set.")
  public List<String> getCrlDistributionPoints() {
    return crlDistributionPoints;
  }

  public void setCrlDistributionPoints(List<String> crlDistributionPoints) {
    this.crlDistributionPoints = crlDistributionPoints;
  }

  public V1alpha2IssuerSpecCa secretName(String secretName) {

    this.secretName = secretName;
    return this;
  }

  /**
   * SecretName is the name of the secret used to sign Certificates issued by this Issuer.
   *
   * @return secretName
   */
  @ApiModelProperty(
      required = true,
      value =
          "SecretName is the name of the secret used to sign Certificates issued by this Issuer.")
  public String getSecretName() {
    return secretName;
  }

  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecCa v1alpha2IssuerSpecCa = (V1alpha2IssuerSpecCa) o;
    return Objects.equals(this.crlDistributionPoints, v1alpha2IssuerSpecCa.crlDistributionPoints)
        && Objects.equals(this.secretName, v1alpha2IssuerSpecCa.secretName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crlDistributionPoints, secretName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecCa {\n");
    sb.append("    crlDistributionPoints: ")
        .append(toIndentedString(crlDistributionPoints))
        .append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
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
