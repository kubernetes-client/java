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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * AlertmanagerEndpoints defines a selection of a single Endpoints object containing alertmanager
 * IPs to fire alerts against.
 */
@ApiModel(
    description =
        "AlertmanagerEndpoints defines a selection of a single Endpoints object containing alertmanager IPs to fire alerts against.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1PrometheusSpecAlertingAlertmanagers {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_BEARER_TOKEN_FILE = "bearerTokenFile";

  @SerializedName(SERIALIZED_NAME_BEARER_TOKEN_FILE)
  private String bearerTokenFile;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";

  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_PATH_PREFIX = "pathPrefix";

  @SerializedName(SERIALIZED_NAME_PATH_PREFIX)
  private String pathPrefix;

  public static final String SERIALIZED_NAME_PORT = "port";

  @SerializedName(SERIALIZED_NAME_PORT)
  private Object port;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";

  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme;

  public static final String SERIALIZED_NAME_TLS_CONFIG = "tlsConfig";

  @SerializedName(SERIALIZED_NAME_TLS_CONFIG)
  private V1PrometheusSpecAlertingTlsConfig tlsConfig;

  public V1PrometheusSpecAlertingAlertmanagers apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Version of the Alertmanager API that Prometheus uses to send alerts. It can be \&quot;v1\&quot;
   * or \&quot;v2\&quot;.
   *
   * @return apiVersion
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Version of the Alertmanager API that Prometheus uses to send alerts. It can be \"v1\" or \"v2\".")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1PrometheusSpecAlertingAlertmanagers bearerTokenFile(String bearerTokenFile) {

    this.bearerTokenFile = bearerTokenFile;
    return this;
  }

  /**
   * BearerTokenFile to read from filesystem to use when authenticating to Alertmanager.
   *
   * @return bearerTokenFile
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "BearerTokenFile to read from filesystem to use when authenticating to Alertmanager.")
  public String getBearerTokenFile() {
    return bearerTokenFile;
  }

  public void setBearerTokenFile(String bearerTokenFile) {
    this.bearerTokenFile = bearerTokenFile;
  }

  public V1PrometheusSpecAlertingAlertmanagers name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name of Endpoints object in Namespace.
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "Name of Endpoints object in Namespace.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1PrometheusSpecAlertingAlertmanagers namespace(String namespace) {

    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace of Endpoints object.
   *
   * @return namespace
   */
  @ApiModelProperty(required = true, value = "Namespace of Endpoints object.")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public V1PrometheusSpecAlertingAlertmanagers pathPrefix(String pathPrefix) {

    this.pathPrefix = pathPrefix;
    return this;
  }

  /**
   * Prefix for the HTTP path alerts are pushed to.
   *
   * @return pathPrefix
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Prefix for the HTTP path alerts are pushed to.")
  public String getPathPrefix() {
    return pathPrefix;
  }

  public void setPathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
  }

  public V1PrometheusSpecAlertingAlertmanagers port(Object port) {

    this.port = port;
    return this;
  }

  /**
   * Port the Alertmanager API is exposed on.
   *
   * @return port
   */
  @ApiModelProperty(required = true, value = "Port the Alertmanager API is exposed on.")
  public Object getPort() {
    return port;
  }

  public void setPort(Object port) {
    this.port = port;
  }

  public V1PrometheusSpecAlertingAlertmanagers scheme(String scheme) {

    this.scheme = scheme;
    return this;
  }

  /**
   * Scheme to use when firing alerts.
   *
   * @return scheme
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Scheme to use when firing alerts.")
  public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  public V1PrometheusSpecAlertingAlertmanagers tlsConfig(
      V1PrometheusSpecAlertingTlsConfig tlsConfig) {

    this.tlsConfig = tlsConfig;
    return this;
  }

  /**
   * Get tlsConfig
   *
   * @return tlsConfig
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecAlertingTlsConfig getTlsConfig() {
    return tlsConfig;
  }

  public void setTlsConfig(V1PrometheusSpecAlertingTlsConfig tlsConfig) {
    this.tlsConfig = tlsConfig;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PrometheusSpecAlertingAlertmanagers v1PrometheusSpecAlertingAlertmanagers =
        (V1PrometheusSpecAlertingAlertmanagers) o;
    return Objects.equals(this.apiVersion, v1PrometheusSpecAlertingAlertmanagers.apiVersion)
        && Objects.equals(
            this.bearerTokenFile, v1PrometheusSpecAlertingAlertmanagers.bearerTokenFile)
        && Objects.equals(this.name, v1PrometheusSpecAlertingAlertmanagers.name)
        && Objects.equals(this.namespace, v1PrometheusSpecAlertingAlertmanagers.namespace)
        && Objects.equals(this.pathPrefix, v1PrometheusSpecAlertingAlertmanagers.pathPrefix)
        && Objects.equals(this.port, v1PrometheusSpecAlertingAlertmanagers.port)
        && Objects.equals(this.scheme, v1PrometheusSpecAlertingAlertmanagers.scheme)
        && Objects.equals(this.tlsConfig, v1PrometheusSpecAlertingAlertmanagers.tlsConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apiVersion, bearerTokenFile, name, namespace, pathPrefix, port, scheme, tlsConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusSpecAlertingAlertmanagers {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    bearerTokenFile: ").append(toIndentedString(bearerTokenFile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    pathPrefix: ").append(toIndentedString(pathPrefix)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    tlsConfig: ").append(toIndentedString(tlsConfig)).append("\n");
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
