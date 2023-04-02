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
import java.util.Objects;

/**
 * IngressRule represents the rules mapping the paths under a specified host to the related backend
 * services. Incoming requests are first evaluated for a host match, then routed to the backend
 * associated with the matching IngressRuleValue.
 */
@ApiModel(
    description =
        "IngressRule represents the rules mapping the paths under a specified host to the related backend services. Incoming requests are first evaluated for a host match, then routed to the backend associated with the matching IngressRuleValue.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1IngressRule {
  public static final String SERIALIZED_NAME_HOST = "host";

  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_HTTP = "http";

  @SerializedName(SERIALIZED_NAME_HTTP)
  private V1HTTPIngressRuleValue http;

  public V1IngressRule host(String host) {

    this.host = host;
    return this;
  }

  /**
   * Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the
   * following deviations from the \&quot;host\&quot; part of the URI as defined in RFC 3986: 1. IPs
   * are not allowed. Currently an IngressRuleValue can only apply to the IP in the Spec of the
   * parent Ingress. 2. The &#x60;:&#x60; delimiter is not respected because ports are not allowed.
   * Currently the port of an Ingress is implicitly :80 for http and :443 for https. Both these may
   * change in the future. Incoming requests are matched against the host before the
   * IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the
   * specified IngressRuleValue. Host can be \&quot;precise\&quot; which is a domain name without
   * the terminating dot of a network host (e.g. \&quot;foo.bar.com\&quot;) or
   * \&quot;wildcard\&quot;, which is a domain name prefixed with a single wildcard label (e.g.
   * \&quot;*.foo.com\&quot;). The wildcard character &#39;*&#39; must appear by itself as the first
   * DNS label and matches only a single label. You cannot have a wildcard label by itself (e.g.
   * Host &#x3D;&#x3D; \&quot;*\&quot;). Requests will be matched against the Host field in the
   * following way: 1. If Host is precise, the request matches this rule if the http host header is
   * equal to Host. 2. If Host is a wildcard, then the request matches this rule if the http host
   * header is to equal to the suffix (removing the first label) of the wildcard rule.
   *
   * @return host
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the following deviations from the \"host\" part of the URI as defined in RFC 3986: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to    the IP in the Spec of the parent Ingress. 2. The `:` delimiter is not respected because ports are not allowed.    Currently the port of an Ingress is implicitly :80 for http and    :443 for https. Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.  Host can be \"precise\" which is a domain name without the terminating dot of a network host (e.g. \"foo.bar.com\") or \"wildcard\", which is a domain name prefixed with a single wildcard label (e.g. \"*.foo.com\"). The wildcard character '*' must appear by itself as the first DNS label and matches only a single label. You cannot have a wildcard label by itself (e.g. Host == \"*\"). Requests will be matched against the Host field in the following way: 1. If Host is precise, the request matches this rule if the http host header is equal to Host. 2. If Host is a wildcard, then the request matches this rule if the http host header is to equal to the suffix (removing the first label) of the wildcard rule.")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public V1IngressRule http(V1HTTPIngressRuleValue http) {

    this.http = http;
    return this;
  }

  /**
   * Get http
   *
   * @return http
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1HTTPIngressRuleValue getHttp() {
    return http;
  }

  public void setHttp(V1HTTPIngressRuleValue http) {
    this.http = http;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1IngressRule v1IngressRule = (V1IngressRule) o;
    return Objects.equals(this.host, v1IngressRule.host)
        && Objects.equals(this.http, v1IngressRule.http);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, http);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1IngressRule {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
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
