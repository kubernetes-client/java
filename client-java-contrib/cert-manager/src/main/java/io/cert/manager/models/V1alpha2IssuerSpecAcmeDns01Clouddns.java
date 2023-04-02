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

/** Use the Google Cloud DNS API to manage DNS01 challenge records. */
@ApiModel(description = "Use the Google Cloud DNS API to manage DNS01 challenge records.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeDns01Clouddns {
  public static final String SERIALIZED_NAME_HOSTED_ZONE_NAME = "hostedZoneName";

  @SerializedName(SERIALIZED_NAME_HOSTED_ZONE_NAME)
  private String hostedZoneName;

  public static final String SERIALIZED_NAME_PROJECT = "project";

  @SerializedName(SERIALIZED_NAME_PROJECT)
  private String project;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_SECRET_REF = "serviceAccountSecretRef";

  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_SECRET_REF)
  private V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef serviceAccountSecretRef;

  public V1alpha2IssuerSpecAcmeDns01Clouddns hostedZoneName(String hostedZoneName) {

    this.hostedZoneName = hostedZoneName;
    return this;
  }

  /**
   * HostedZoneName is an optional field that tells cert-manager in which Cloud DNS zone the
   * challenge record has to be created. If left empty cert-manager will automatically choose a
   * zone.
   *
   * @return hostedZoneName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "HostedZoneName is an optional field that tells cert-manager in which Cloud DNS zone the challenge record has to be created. If left empty cert-manager will automatically choose a zone.")
  public String getHostedZoneName() {
    return hostedZoneName;
  }

  public void setHostedZoneName(String hostedZoneName) {
    this.hostedZoneName = hostedZoneName;
  }

  public V1alpha2IssuerSpecAcmeDns01Clouddns project(String project) {

    this.project = project;
    return this;
  }

  /**
   * Get project
   *
   * @return project
   */
  @ApiModelProperty(required = true, value = "")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public V1alpha2IssuerSpecAcmeDns01Clouddns serviceAccountSecretRef(
      V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef serviceAccountSecretRef) {

    this.serviceAccountSecretRef = serviceAccountSecretRef;
    return this;
  }

  /**
   * Get serviceAccountSecretRef
   *
   * @return serviceAccountSecretRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef getServiceAccountSecretRef() {
    return serviceAccountSecretRef;
  }

  public void setServiceAccountSecretRef(
      V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef serviceAccountSecretRef) {
    this.serviceAccountSecretRef = serviceAccountSecretRef;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecAcmeDns01Clouddns v1alpha2IssuerSpecAcmeDns01Clouddns =
        (V1alpha2IssuerSpecAcmeDns01Clouddns) o;
    return Objects.equals(this.hostedZoneName, v1alpha2IssuerSpecAcmeDns01Clouddns.hostedZoneName)
        && Objects.equals(this.project, v1alpha2IssuerSpecAcmeDns01Clouddns.project)
        && Objects.equals(
            this.serviceAccountSecretRef,
            v1alpha2IssuerSpecAcmeDns01Clouddns.serviceAccountSecretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostedZoneName, project, serviceAccountSecretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecAcmeDns01Clouddns {\n");
    sb.append("    hostedZoneName: ").append(toIndentedString(hostedZoneName)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    serviceAccountSecretRef: ")
        .append(toIndentedString(serviceAccountSecretRef))
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
