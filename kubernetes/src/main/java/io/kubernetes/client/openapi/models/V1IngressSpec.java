/*
Copyright 2022 The Kubernetes Authors.
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
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
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
   * IngressClassName is the name of an IngressClass cluster resource. Ingress controller
   * implementations use this field to know whether they should be serving this Ingress resource, by
   * a transitive connection (controller -&gt; IngressClass -&gt; Ingress resource). Although the
   * &#x60;kubernetes.io/ingress.class&#x60; annotation (simple constant name) was never formally
   * defined, it was widely supported by Ingress controllers to create a direct binding between
   * Ingress controller and Ingress resources. Newly created Ingress resources should prefer using
   * the field. However, even though the annotation is officially deprecated, for backwards
   * compatibility reasons, ingress controllers should still honor that annotation if present.
   *
   * @return ingressClassName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "IngressClassName is the name of an IngressClass cluster resource. Ingress controller implementations use this field to know whether they should be serving this Ingress resource, by a transitive connection (controller -> IngressClass -> Ingress resource). Although the `kubernetes.io/ingress.class` annotation (simple constant name) was never formally defined, it was widely supported by Ingress controllers to create a direct binding between Ingress controller and Ingress resources. Newly created Ingress resources should prefer using the field. However, even though the annotation is officially deprecated, for backwards compatibility reasons, ingress controllers should still honor that annotation if present.")
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
