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

/** Use the Akamai DNS zone management API to manage DNS01 challenge records. */
@ApiModel(description = "Use the Akamai DNS zone management API to manage DNS01 challenge records.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeDns01Akamai {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN_SECRET_REF = "accessTokenSecretRef";

  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN_SECRET_REF)
  private V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef accessTokenSecretRef;

  public static final String SERIALIZED_NAME_CLIENT_SECRET_SECRET_REF = "clientSecretSecretRef";

  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET_SECRET_REF)
  private V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef clientSecretSecretRef;

  public static final String SERIALIZED_NAME_CLIENT_TOKEN_SECRET_REF = "clientTokenSecretRef";

  @SerializedName(SERIALIZED_NAME_CLIENT_TOKEN_SECRET_REF)
  private V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef clientTokenSecretRef;

  public static final String SERIALIZED_NAME_SERVICE_CONSUMER_DOMAIN = "serviceConsumerDomain";

  @SerializedName(SERIALIZED_NAME_SERVICE_CONSUMER_DOMAIN)
  private String serviceConsumerDomain;

  public V1alpha2IssuerSpecAcmeDns01Akamai accessTokenSecretRef(
      V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef accessTokenSecretRef) {

    this.accessTokenSecretRef = accessTokenSecretRef;
    return this;
  }

  /**
   * Get accessTokenSecretRef
   *
   * @return accessTokenSecretRef
   */
  @ApiModelProperty(required = true, value = "")
  public V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef getAccessTokenSecretRef() {
    return accessTokenSecretRef;
  }

  public void setAccessTokenSecretRef(
      V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef accessTokenSecretRef) {
    this.accessTokenSecretRef = accessTokenSecretRef;
  }

  public V1alpha2IssuerSpecAcmeDns01Akamai clientSecretSecretRef(
      V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef clientSecretSecretRef) {

    this.clientSecretSecretRef = clientSecretSecretRef;
    return this;
  }

  /**
   * Get clientSecretSecretRef
   *
   * @return clientSecretSecretRef
   */
  @ApiModelProperty(required = true, value = "")
  public V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef getClientSecretSecretRef() {
    return clientSecretSecretRef;
  }

  public void setClientSecretSecretRef(
      V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef clientSecretSecretRef) {
    this.clientSecretSecretRef = clientSecretSecretRef;
  }

  public V1alpha2IssuerSpecAcmeDns01Akamai clientTokenSecretRef(
      V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef clientTokenSecretRef) {

    this.clientTokenSecretRef = clientTokenSecretRef;
    return this;
  }

  /**
   * Get clientTokenSecretRef
   *
   * @return clientTokenSecretRef
   */
  @ApiModelProperty(required = true, value = "")
  public V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef getClientTokenSecretRef() {
    return clientTokenSecretRef;
  }

  public void setClientTokenSecretRef(
      V1alpha2IssuerSpecAcmeDns01AcmednsAccountSecretRef clientTokenSecretRef) {
    this.clientTokenSecretRef = clientTokenSecretRef;
  }

  public V1alpha2IssuerSpecAcmeDns01Akamai serviceConsumerDomain(String serviceConsumerDomain) {

    this.serviceConsumerDomain = serviceConsumerDomain;
    return this;
  }

  /**
   * Get serviceConsumerDomain
   *
   * @return serviceConsumerDomain
   */
  @ApiModelProperty(required = true, value = "")
  public String getServiceConsumerDomain() {
    return serviceConsumerDomain;
  }

  public void setServiceConsumerDomain(String serviceConsumerDomain) {
    this.serviceConsumerDomain = serviceConsumerDomain;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecAcmeDns01Akamai v1alpha2IssuerSpecAcmeDns01Akamai =
        (V1alpha2IssuerSpecAcmeDns01Akamai) o;
    return Objects.equals(
            this.accessTokenSecretRef, v1alpha2IssuerSpecAcmeDns01Akamai.accessTokenSecretRef)
        && Objects.equals(
            this.clientSecretSecretRef, v1alpha2IssuerSpecAcmeDns01Akamai.clientSecretSecretRef)
        && Objects.equals(
            this.clientTokenSecretRef, v1alpha2IssuerSpecAcmeDns01Akamai.clientTokenSecretRef)
        && Objects.equals(
            this.serviceConsumerDomain, v1alpha2IssuerSpecAcmeDns01Akamai.serviceConsumerDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessTokenSecretRef, clientSecretSecretRef, clientTokenSecretRef, serviceConsumerDomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecAcmeDns01Akamai {\n");
    sb.append("    accessTokenSecretRef: ")
        .append(toIndentedString(accessTokenSecretRef))
        .append("\n");
    sb.append("    clientSecretSecretRef: ")
        .append(toIndentedString(clientSecretSecretRef))
        .append("\n");
    sb.append("    clientTokenSecretRef: ")
        .append(toIndentedString(clientTokenSecretRef))
        .append("\n");
    sb.append("    serviceConsumerDomain: ")
        .append(toIndentedString(serviceConsumerDomain))
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
