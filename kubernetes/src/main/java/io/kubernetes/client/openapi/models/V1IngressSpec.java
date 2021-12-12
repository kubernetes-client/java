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
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1IngressSpec {
  public static final String SERIALIZED_NAME_DEFAULT_BACKEND = "defaultBackend";

  @SerializedName(SERIALIZED_NAME_DEFAULT_BACKEND)
  private V1IngressBackend defaultBackend;

  public static final String SERIALIZED_NAME_INGRESS_CLASS_NAME = "ingressClassName";

  @SerializedName(SERIALIZED_NAME_INGRESS_CLASS_NAME)
  private String ingressClassName;

  public static final String SERIALIZED_NAME_RULES = "rules";

  @SerializedName(SERIALIZED_NAME_RULES)
  private List<V1IngressRule> rules = null;

  public static final String SERIALIZED_NAME_TLS = "tls";

  @SerializedName(SERIALIZED_NAME_TLS)
  private List<V1IngressTLS> tls = null;

  public V1IngressSpec defaultBackend(V1IngressBackend defaultBackend) {

    this.defaultBackend = defaultBackend;
    return this;
  }

  /**
   * Get defaultBackend
   *
   * @return defaultBackend
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1IngressBackend getDefaultBackend() {
    return defaultBackend;
  }

  public void setDefaultBackend(V1IngressBackend defaultBackend) {
    this.defaultBackend = defaultBackend;
  }

  public V1IngressSpec ingressClassName(String ingressClassName) {

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

  public V1IngressSpec rules(List<V1IngressRule> rules) {

    this.rules = rules;
    return this;
  }

  public V1IngressSpec addRulesItem(V1IngressRule rulesItem) {
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
  public List<V1IngressRule> getRules() {
    return rules;
  }

  public void setRules(List<V1IngressRule> rules) {
    this.rules = rules;
  }

  public V1IngressSpec tls(List<V1IngressTLS> tls) {

    this.tls = tls;
    return this;
  }

  public V1IngressSpec addTlsItem(V1IngressTLS tlsItem) {
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
  public List<V1IngressTLS> getTls() {
    return tls;
  }

  public void setTls(List<V1IngressTLS> tls) {
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
    V1IngressSpec v1IngressSpec = (V1IngressSpec) o;
    return Objects.equals(this.defaultBackend, v1IngressSpec.defaultBackend)
        && Objects.equals(this.ingressClassName, v1IngressSpec.ingressClassName)
        && Objects.equals(this.rules, v1IngressSpec.rules)
        && Objects.equals(this.tls, v1IngressSpec.tls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultBackend, ingressClassName, rules, tls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1IngressSpec {\n");
    sb.append("    defaultBackend: ").append(toIndentedString(defaultBackend)).append("\n");
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
