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
 * The ingress based HTTP01 challenge solver will solve challenges by creating or modifying Ingress
 * resources in order to route requests for &#39;/.well-known/acme-challenge/XYZ&#39; to
 * &#39;challenge solver&#39; pods that are provisioned by cert-manager for each Challenge to be
 * completed.
 */
@ApiModel(
    description =
        "The ingress based HTTP01 challenge solver will solve challenges by creating or modifying Ingress resources in order to route requests for '/.well-known/acme-challenge/XYZ' to 'challenge solver' pods that are provisioned by cert-manager for each Challenge to be completed.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeHttp01Ingress {
  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "class";

  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private String propertyClass;

  public static final String SERIALIZED_NAME_INGRESS_TEMPLATE = "ingressTemplate";

  @SerializedName(SERIALIZED_NAME_INGRESS_TEMPLATE)
  private V1alpha2IssuerSpecAcmeHttp01IngressIngressTemplate ingressTemplate;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POD_TEMPLATE = "podTemplate";

  @SerializedName(SERIALIZED_NAME_POD_TEMPLATE)
  private V1alpha2IssuerSpecAcmeHttp01IngressPodTemplate podTemplate;

  public static final String SERIALIZED_NAME_SERVICE_TYPE = "serviceType";

  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private String serviceType;

  public V1alpha2IssuerSpecAcmeHttp01Ingress propertyClass(String propertyClass) {

    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * The ingress class to use when creating Ingress resources to solve ACME challenges that use this
   * challenge solver. Only one of &#39;class&#39; or &#39;name&#39; may be specified.
   *
   * @return propertyClass
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The ingress class to use when creating Ingress resources to solve ACME challenges that use this challenge solver. Only one of 'class' or 'name' may be specified.")
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public V1alpha2IssuerSpecAcmeHttp01Ingress ingressTemplate(
      V1alpha2IssuerSpecAcmeHttp01IngressIngressTemplate ingressTemplate) {

    this.ingressTemplate = ingressTemplate;
    return this;
  }

  /**
   * Get ingressTemplate
   *
   * @return ingressTemplate
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeHttp01IngressIngressTemplate getIngressTemplate() {
    return ingressTemplate;
  }

  public void setIngressTemplate(
      V1alpha2IssuerSpecAcmeHttp01IngressIngressTemplate ingressTemplate) {
    this.ingressTemplate = ingressTemplate;
  }

  public V1alpha2IssuerSpecAcmeHttp01Ingress name(String name) {

    this.name = name;
    return this;
  }

  /**
   * The name of the ingress resource that should have ACME challenge solving routes inserted into
   * it in order to solve HTTP01 challenges. This is typically used in conjunction with ingress
   * controllers like ingress-gce, which maintains a 1:1 mapping between external IPs and ingress
   * resources.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The name of the ingress resource that should have ACME challenge solving routes inserted into it in order to solve HTTP01 challenges. This is typically used in conjunction with ingress controllers like ingress-gce, which maintains a 1:1 mapping between external IPs and ingress resources.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1alpha2IssuerSpecAcmeHttp01Ingress podTemplate(
      V1alpha2IssuerSpecAcmeHttp01IngressPodTemplate podTemplate) {

    this.podTemplate = podTemplate;
    return this;
  }

  /**
   * Get podTemplate
   *
   * @return podTemplate
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplate getPodTemplate() {
    return podTemplate;
  }

  public void setPodTemplate(V1alpha2IssuerSpecAcmeHttp01IngressPodTemplate podTemplate) {
    this.podTemplate = podTemplate;
  }

  public V1alpha2IssuerSpecAcmeHttp01Ingress serviceType(String serviceType) {

    this.serviceType = serviceType;
    return this;
  }

  /**
   * Optional service type for Kubernetes solver service
   *
   * @return serviceType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional service type for Kubernetes solver service")
  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecAcmeHttp01Ingress v1alpha2IssuerSpecAcmeHttp01Ingress =
        (V1alpha2IssuerSpecAcmeHttp01Ingress) o;
    return Objects.equals(this.propertyClass, v1alpha2IssuerSpecAcmeHttp01Ingress.propertyClass)
        && Objects.equals(this.ingressTemplate, v1alpha2IssuerSpecAcmeHttp01Ingress.ingressTemplate)
        && Objects.equals(this.name, v1alpha2IssuerSpecAcmeHttp01Ingress.name)
        && Objects.equals(this.podTemplate, v1alpha2IssuerSpecAcmeHttp01Ingress.podTemplate)
        && Objects.equals(this.serviceType, v1alpha2IssuerSpecAcmeHttp01Ingress.serviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, ingressTemplate, name, podTemplate, serviceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecAcmeHttp01Ingress {\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    ingressTemplate: ").append(toIndentedString(ingressTemplate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    podTemplate: ").append(toIndentedString(podTemplate)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
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
