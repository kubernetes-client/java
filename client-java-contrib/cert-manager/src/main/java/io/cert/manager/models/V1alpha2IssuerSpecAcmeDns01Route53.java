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

/** Use the AWS Route53 API to manage DNS01 challenge records. */
@ApiModel(description = "Use the AWS Route53 API to manage DNS01 challenge records.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeDns01Route53 {
  public static final String SERIALIZED_NAME_ACCESS_KEY_I_D = "accessKeyID";

  @SerializedName(SERIALIZED_NAME_ACCESS_KEY_I_D)
  private String accessKeyID;

  public static final String SERIALIZED_NAME_HOSTED_ZONE_I_D = "hostedZoneID";

  @SerializedName(SERIALIZED_NAME_HOSTED_ZONE_I_D)
  private String hostedZoneID;

  public static final String SERIALIZED_NAME_REGION = "region";

  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_ROLE = "role";

  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_SECRET_ACCESS_KEY_SECRET_REF =
      "secretAccessKeySecretRef";

  @SerializedName(SERIALIZED_NAME_SECRET_ACCESS_KEY_SECRET_REF)
  private V1alpha2IssuerSpecAcmeDns01Route53SecretAccessKeySecretRef secretAccessKeySecretRef;

  public V1alpha2IssuerSpecAcmeDns01Route53 accessKeyID(String accessKeyID) {

    this.accessKeyID = accessKeyID;
    return this;
  }

  /**
   * The AccessKeyID is used for authentication. If not set we fall-back to using env vars, shared
   * credentials file or AWS Instance metadata see:
   * https://docs.aws.amazon.com/sdk-for-go/v1/developer-guide/configuring-sdk.html#specifying-credentials
   *
   * @return accessKeyID
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The AccessKeyID is used for authentication. If not set we fall-back to using env vars, shared credentials file or AWS Instance metadata see: https://docs.aws.amazon.com/sdk-for-go/v1/developer-guide/configuring-sdk.html#specifying-credentials")
  public String getAccessKeyID() {
    return accessKeyID;
  }

  public void setAccessKeyID(String accessKeyID) {
    this.accessKeyID = accessKeyID;
  }

  public V1alpha2IssuerSpecAcmeDns01Route53 hostedZoneID(String hostedZoneID) {

    this.hostedZoneID = hostedZoneID;
    return this;
  }

  /**
   * If set, the provider will manage only this zone in Route53 and will not do an lookup using the
   * route53:ListHostedZonesByName api call.
   *
   * @return hostedZoneID
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If set, the provider will manage only this zone in Route53 and will not do an lookup using the route53:ListHostedZonesByName api call.")
  public String getHostedZoneID() {
    return hostedZoneID;
  }

  public void setHostedZoneID(String hostedZoneID) {
    this.hostedZoneID = hostedZoneID;
  }

  public V1alpha2IssuerSpecAcmeDns01Route53 region(String region) {

    this.region = region;
    return this;
  }

  /**
   * Always set the region when using AccessKeyID and SecretAccessKey
   *
   * @return region
   */
  @ApiModelProperty(
      required = true,
      value = "Always set the region when using AccessKeyID and SecretAccessKey")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public V1alpha2IssuerSpecAcmeDns01Route53 role(String role) {

    this.role = role;
    return this;
  }

  /**
   * Role is a Role ARN which the Route53 provider will assume using either the explicit credentials
   * AccessKeyID/SecretAccessKey or the inferred credentials from environment variables, shared
   * credentials file or AWS Instance metadata
   *
   * @return role
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Role is a Role ARN which the Route53 provider will assume using either the explicit credentials AccessKeyID/SecretAccessKey or the inferred credentials from environment variables, shared credentials file or AWS Instance metadata")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public V1alpha2IssuerSpecAcmeDns01Route53 secretAccessKeySecretRef(
      V1alpha2IssuerSpecAcmeDns01Route53SecretAccessKeySecretRef secretAccessKeySecretRef) {

    this.secretAccessKeySecretRef = secretAccessKeySecretRef;
    return this;
  }

  /**
   * Get secretAccessKeySecretRef
   *
   * @return secretAccessKeySecretRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeDns01Route53SecretAccessKeySecretRef getSecretAccessKeySecretRef() {
    return secretAccessKeySecretRef;
  }

  public void setSecretAccessKeySecretRef(
      V1alpha2IssuerSpecAcmeDns01Route53SecretAccessKeySecretRef secretAccessKeySecretRef) {
    this.secretAccessKeySecretRef = secretAccessKeySecretRef;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecAcmeDns01Route53 v1alpha2IssuerSpecAcmeDns01Route53 =
        (V1alpha2IssuerSpecAcmeDns01Route53) o;
    return Objects.equals(this.accessKeyID, v1alpha2IssuerSpecAcmeDns01Route53.accessKeyID)
        && Objects.equals(this.hostedZoneID, v1alpha2IssuerSpecAcmeDns01Route53.hostedZoneID)
        && Objects.equals(this.region, v1alpha2IssuerSpecAcmeDns01Route53.region)
        && Objects.equals(this.role, v1alpha2IssuerSpecAcmeDns01Route53.role)
        && Objects.equals(
            this.secretAccessKeySecretRef,
            v1alpha2IssuerSpecAcmeDns01Route53.secretAccessKeySecretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyID, hostedZoneID, region, role, secretAccessKeySecretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecAcmeDns01Route53 {\n");
    sb.append("    accessKeyID: ").append(toIndentedString(accessKeyID)).append("\n");
    sb.append("    hostedZoneID: ").append(toIndentedString(hostedZoneID)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    secretAccessKeySecretRef: ")
        .append(toIndentedString(secretAccessKeySecretRef))
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
