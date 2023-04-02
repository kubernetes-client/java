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
import java.util.Arrays;
import java.util.Objects;

/** WebhookClientConfig contains the information to make a TLS connection with the webhook */
@ApiModel(
    description =
        "WebhookClientConfig contains the information to make a TLS connection with the webhook")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class AdmissionregistrationV1WebhookClientConfig {
  public static final String SERIALIZED_NAME_CA_BUNDLE = "caBundle";

  @SerializedName(SERIALIZED_NAME_CA_BUNDLE)
  private byte[] caBundle;

  public static final String SERIALIZED_NAME_SERVICE = "service";

  @SerializedName(SERIALIZED_NAME_SERVICE)
  private AdmissionregistrationV1ServiceReference service;

  public static final String SERIALIZED_NAME_URL = "url";

  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public AdmissionregistrationV1WebhookClientConfig caBundle(byte[] caBundle) {

    this.caBundle = caBundle;
    return this;
  }

  /**
   * &#x60;caBundle&#x60; is a PEM encoded CA bundle which will be used to validate the
   * webhook&#39;s server certificate. If unspecified, system trust roots on the apiserver are used.
   *
   * @return caBundle
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "`caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified, system trust roots on the apiserver are used.")
  public byte[] getCaBundle() {
    return caBundle;
  }

  public void setCaBundle(byte[] caBundle) {
    this.caBundle = caBundle;
  }

  public AdmissionregistrationV1WebhookClientConfig service(
      AdmissionregistrationV1ServiceReference service) {

    this.service = service;
    return this;
  }

  /**
   * Get service
   *
   * @return service
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public AdmissionregistrationV1ServiceReference getService() {
    return service;
  }

  public void setService(AdmissionregistrationV1ServiceReference service) {
    this.service = service;
  }

  public AdmissionregistrationV1WebhookClientConfig url(String url) {

    this.url = url;
    return this;
  }

  /**
   * &#x60;url&#x60; gives the location of the webhook, in standard URL form
   * (&#x60;scheme://host:port/path&#x60;). Exactly one of &#x60;url&#x60; or &#x60;service&#x60;
   * must be specified. The &#x60;host&#x60; should not refer to a service running in the cluster;
   * use the &#x60;service&#x60; field instead. The host might be resolved via external DNS in some
   * apiservers (e.g., &#x60;kube-apiserver&#x60; cannot resolve in-cluster DNS as that would be a
   * layering violation). &#x60;host&#x60; may also be an IP address. Please note that using
   * &#x60;localhost&#x60; or &#x60;127.0.0.1&#x60; as a &#x60;host&#x60; is risky unless you take
   * great care to run this webhook on all hosts which run an apiserver which might need to make
   * calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up
   * in a new cluster. The scheme must be \&quot;https\&quot;; the URL must begin with
   * \&quot;https://\&quot;. A path is optional, and if present may be any string permissible in a
   * URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster
   * identifier. Attempting to use a user or basic auth e.g. \&quot;user:password@\&quot; is not
   * allowed. Fragments (\&quot;#...\&quot;) and query parameters (\&quot;?...\&quot;) are not
   * allowed, either.
   *
   * @return url
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "`url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or `service` must be specified.  The `host` should not refer to a service running in the cluster; use the `service` field instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation). `host` may also be an IP address.  Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.  The scheme must be \"https\"; the URL must begin with \"https://\".  A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.  Attempting to use a user or basic auth e.g. \"user:password@\" is not allowed. Fragments (\"#...\") and query parameters (\"?...\") are not allowed, either.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdmissionregistrationV1WebhookClientConfig admissionregistrationV1WebhookClientConfig =
        (AdmissionregistrationV1WebhookClientConfig) o;
    return Arrays.equals(this.caBundle, admissionregistrationV1WebhookClientConfig.caBundle)
        && Objects.equals(this.service, admissionregistrationV1WebhookClientConfig.service)
        && Objects.equals(this.url, admissionregistrationV1WebhookClientConfig.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(caBundle), service, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdmissionregistrationV1WebhookClientConfig {\n");
    sb.append("    caBundle: ").append(toIndentedString(caBundle)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
