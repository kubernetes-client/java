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
 * APIServerConfig allows specifying a host and auth methods to access apiserver. If left empty,
 * Prometheus is assumed to run inside of the cluster and will discover API servers automatically
 * and use the pod&#39;s CA certificate and bearer token file at
 * /var/run/secrets/kubernetes.io/serviceaccount/.
 */
@ApiModel(
    description =
        "APIServerConfig allows specifying a host and auth methods to access apiserver. If left empty, Prometheus is assumed to run inside of the cluster and will discover API servers automatically and use the pod's CA certificate and bearer token file at /var/run/secrets/kubernetes.io/serviceaccount/.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1PrometheusSpecApiserverConfig {
  public static final String SERIALIZED_NAME_BASIC_AUTH = "basicAuth";

  @SerializedName(SERIALIZED_NAME_BASIC_AUTH)
  private V1PrometheusSpecApiserverConfigBasicAuth basicAuth;

  public static final String SERIALIZED_NAME_BEARER_TOKEN = "bearerToken";

  @SerializedName(SERIALIZED_NAME_BEARER_TOKEN)
  private String bearerToken;

  public static final String SERIALIZED_NAME_BEARER_TOKEN_FILE = "bearerTokenFile";

  @SerializedName(SERIALIZED_NAME_BEARER_TOKEN_FILE)
  private String bearerTokenFile;

  public static final String SERIALIZED_NAME_HOST = "host";

  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_TLS_CONFIG = "tlsConfig";

  @SerializedName(SERIALIZED_NAME_TLS_CONFIG)
  private V1PrometheusSpecApiserverConfigTlsConfig tlsConfig;

  public V1PrometheusSpecApiserverConfig basicAuth(
      V1PrometheusSpecApiserverConfigBasicAuth basicAuth) {

    this.basicAuth = basicAuth;
    return this;
  }

  /**
   * Get basicAuth
   *
   * @return basicAuth
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecApiserverConfigBasicAuth getBasicAuth() {
    return basicAuth;
  }

  public void setBasicAuth(V1PrometheusSpecApiserverConfigBasicAuth basicAuth) {
    this.basicAuth = basicAuth;
  }

  public V1PrometheusSpecApiserverConfig bearerToken(String bearerToken) {

    this.bearerToken = bearerToken;
    return this;
  }

  /**
   * Bearer token for accessing apiserver.
   *
   * @return bearerToken
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bearer token for accessing apiserver.")
  public String getBearerToken() {
    return bearerToken;
  }

  public void setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
  }

  public V1PrometheusSpecApiserverConfig bearerTokenFile(String bearerTokenFile) {

    this.bearerTokenFile = bearerTokenFile;
    return this;
  }

  /**
   * File to read bearer token for accessing apiserver.
   *
   * @return bearerTokenFile
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File to read bearer token for accessing apiserver.")
  public String getBearerTokenFile() {
    return bearerTokenFile;
  }

  public void setBearerTokenFile(String bearerTokenFile) {
    this.bearerTokenFile = bearerTokenFile;
  }

  public V1PrometheusSpecApiserverConfig host(String host) {

    this.host = host;
    return this;
  }

  /**
   * Host of apiserver. A valid string consisting of a hostname or IP followed by an optional port
   * number
   *
   * @return host
   */
  @ApiModelProperty(
      required = true,
      value =
          "Host of apiserver. A valid string consisting of a hostname or IP followed by an optional port number")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public V1PrometheusSpecApiserverConfig tlsConfig(
      V1PrometheusSpecApiserverConfigTlsConfig tlsConfig) {

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
  public V1PrometheusSpecApiserverConfigTlsConfig getTlsConfig() {
    return tlsConfig;
  }

  public void setTlsConfig(V1PrometheusSpecApiserverConfigTlsConfig tlsConfig) {
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
    V1PrometheusSpecApiserverConfig v1PrometheusSpecApiserverConfig =
        (V1PrometheusSpecApiserverConfig) o;
    return Objects.equals(this.basicAuth, v1PrometheusSpecApiserverConfig.basicAuth)
        && Objects.equals(this.bearerToken, v1PrometheusSpecApiserverConfig.bearerToken)
        && Objects.equals(this.bearerTokenFile, v1PrometheusSpecApiserverConfig.bearerTokenFile)
        && Objects.equals(this.host, v1PrometheusSpecApiserverConfig.host)
        && Objects.equals(this.tlsConfig, v1PrometheusSpecApiserverConfig.tlsConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicAuth, bearerToken, bearerTokenFile, host, tlsConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusSpecApiserverConfig {\n");
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    bearerToken: ").append(toIndentedString(bearerToken)).append("\n");
    sb.append("    bearerTokenFile: ").append(toIndentedString(bearerTokenFile)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
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
