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
 * Venafi configures this issuer to sign certificates using a Venafi TPP or Venafi Cloud policy
 * zone.
 */
@ApiModel(
    description =
        "Venafi configures this issuer to sign certificates using a Venafi TPP or Venafi Cloud policy zone.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecVenafi {
  public static final String SERIALIZED_NAME_CLOUD = "cloud";

  @SerializedName(SERIALIZED_NAME_CLOUD)
  private V1alpha2IssuerSpecVenafiCloud cloud;

  public static final String SERIALIZED_NAME_TPP = "tpp";

  @SerializedName(SERIALIZED_NAME_TPP)
  private V1alpha2IssuerSpecVenafiTpp tpp;

  public static final String SERIALIZED_NAME_ZONE = "zone";

  @SerializedName(SERIALIZED_NAME_ZONE)
  private String zone;

  public V1alpha2IssuerSpecVenafi cloud(V1alpha2IssuerSpecVenafiCloud cloud) {

    this.cloud = cloud;
    return this;
  }

  /**
   * Get cloud
   *
   * @return cloud
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecVenafiCloud getCloud() {
    return cloud;
  }

  public void setCloud(V1alpha2IssuerSpecVenafiCloud cloud) {
    this.cloud = cloud;
  }

  public V1alpha2IssuerSpecVenafi tpp(V1alpha2IssuerSpecVenafiTpp tpp) {

    this.tpp = tpp;
    return this;
  }

  /**
   * Get tpp
   *
   * @return tpp
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecVenafiTpp getTpp() {
    return tpp;
  }

  public void setTpp(V1alpha2IssuerSpecVenafiTpp tpp) {
    this.tpp = tpp;
  }

  public V1alpha2IssuerSpecVenafi zone(String zone) {

    this.zone = zone;
    return this;
  }

  /**
   * Zone is the Venafi Policy Zone to use for this issuer. All requests made to the Venafi platform
   * will be restricted by the named zone policy. This field is required.
   *
   * @return zone
   */
  @ApiModelProperty(
      required = true,
      value =
          "Zone is the Venafi Policy Zone to use for this issuer. All requests made to the Venafi platform will be restricted by the named zone policy. This field is required.")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecVenafi v1alpha2IssuerSpecVenafi = (V1alpha2IssuerSpecVenafi) o;
    return Objects.equals(this.cloud, v1alpha2IssuerSpecVenafi.cloud)
        && Objects.equals(this.tpp, v1alpha2IssuerSpecVenafi.tpp)
        && Objects.equals(this.zone, v1alpha2IssuerSpecVenafi.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloud, tpp, zone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecVenafi {\n");
    sb.append("    cloud: ").append(toIndentedString(cloud)).append("\n");
    sb.append("    tpp: ").append(toIndentedString(tpp)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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
