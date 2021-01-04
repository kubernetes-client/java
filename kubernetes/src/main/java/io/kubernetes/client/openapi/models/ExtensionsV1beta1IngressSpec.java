/*
Copyright 2021 The Kubernetes Authors.
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
package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** IngressSpec describes the Ingress the user wishes to exist. */
@ApiModel(description = "IngressSpec describes the Ingress the user wishes to exist.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-01-04T09:55:14.976Z[Etc/UTC]")
public class ExtensionsV1beta1IngressSpec {
  public static final String SERIALIZED_NAME_BACKEND = "backend";

  @SerializedName(SERIALIZED_NAME_BACKEND)
  private ExtensionsV1beta1IngressBackend backend;

  public static final String SERIALIZED_NAME_INGRESS_CLASS_NAME = "ingressClassName";

  @SerializedName(SERIALIZED_NAME_INGRESS_CLASS_NAME)
  private String ingressClassName;

  public static final String SERIALIZED_NAME_RULES = "rules";

  @SerializedName(SERIALIZED_NAME_RULES)
  private List<ExtensionsV1beta1IngressRule> rules = null;

  public static final String SERIALIZED_NAME_TLS = "tls";

  @SerializedName(SERIALIZED_NAME_TLS)
  private List<ExtensionsV1beta1IngressTLS> tls = null;

  public ExtensionsV1beta1IngressSpec backend(ExtensionsV1beta1IngressBackend backend) {

    this.backend = backend;
    return this;
  }

  /**
   * Get backend
   *
   * @return backend
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public ExtensionsV1beta1IngressBackend getBackend() {
    return backend;
  }

  public void setBackend(ExtensionsV1beta1IngressBackend backend) {
    this.backend = backend;
  }

  public ExtensionsV1beta1IngressSpec ingressClassName(String ingressClassName) {

    this.ingressClassName = ingressClassName;
    return this;
  }

  /**
   * IngressClassName is the name of the IngressClass cluster resource. The associated IngressClass
   * defines which controller will implement the resource. This replaces the deprecated
   * &#x60;kubernetes.io/ingress.class&#x60; annotation. For backwards compatibility, when that
   * annotation is set, it must be given precedence over this field. The controller may emit a
   * warning if the field and annotation have different values. Implementations of this API should
   * ignore Ingresses without a class specified. An IngressClass resource may be marked as default,
   * which can be used to set a default value for this field. For more information, refer to the
   * IngressClass documentation.
   *
   * @return ingressClassName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "IngressClassName is the name of the IngressClass cluster resource. The associated IngressClass defines which controller will implement the resource. This replaces the deprecated `kubernetes.io/ingress.class` annotation. For backwards compatibility, when that annotation is set, it must be given precedence over this field. The controller may emit a warning if the field and annotation have different values. Implementations of this API should ignore Ingresses without a class specified. An IngressClass resource may be marked as default, which can be used to set a default value for this field. For more information, refer to the IngressClass documentation.")
  public String getIngressClassName() {
    return ingressClassName;
  }

  public void setIngressClassName(String ingressClassName) {
    this.ingressClassName = ingressClassName;
  }

  public ExtensionsV1beta1IngressSpec rules(List<ExtensionsV1beta1IngressRule> rules) {

    this.rules = rules;
    return this;
  }

  public ExtensionsV1beta1IngressSpec addRulesItem(ExtensionsV1beta1IngressRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all
   * traffic is sent to the default backend.
   *
   * @return rules
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.")
  public List<ExtensionsV1beta1IngressRule> getRules() {
    return rules;
  }

  public void setRules(List<ExtensionsV1beta1IngressRule> rules) {
    this.rules = rules;
  }

  public ExtensionsV1beta1IngressSpec tls(List<ExtensionsV1beta1IngressTLS> tls) {

    this.tls = tls;
    return this;
  }

  public ExtensionsV1beta1IngressSpec addTlsItem(ExtensionsV1beta1IngressTLS tlsItem) {
    if (this.tls == null) {
      this.tls = new ArrayList<>();
    }
    this.tls.add(tlsItem);
    return this;
  }

  /**
   * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple
   * members of this list specify different hosts, they will be multiplexed on the same port
   * according to the hostname specified through the SNI TLS extension, if the ingress controller
   * fulfilling the ingress supports SNI.
   *
   * @return tls
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.")
  public List<ExtensionsV1beta1IngressTLS> getTls() {
    return tls;
  }

  public void setTls(List<ExtensionsV1beta1IngressTLS> tls) {
    this.tls = tls;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionsV1beta1IngressSpec extensionsV1beta1IngressSpec = (ExtensionsV1beta1IngressSpec) o;
    return Objects.equals(this.backend, extensionsV1beta1IngressSpec.backend)
        && Objects.equals(this.ingressClassName, extensionsV1beta1IngressSpec.ingressClassName)
        && Objects.equals(this.rules, extensionsV1beta1IngressSpec.rules)
        && Objects.equals(this.tls, extensionsV1beta1IngressSpec.tls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backend, ingressClassName, rules, tls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionsV1beta1IngressSpec {\n");
    sb.append("    backend: ").append(toIndentedString(backend)).append("\n");
    sb.append("    ingressClassName: ").append(toIndentedString(ingressClassName)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
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
