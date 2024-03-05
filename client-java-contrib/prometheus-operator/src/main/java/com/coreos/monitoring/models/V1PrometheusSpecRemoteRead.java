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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** RemoteReadSpec defines the remote_read configuration for prometheus. */
@ApiModel(description = "RemoteReadSpec defines the remote_read configuration for prometheus.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1PrometheusSpecRemoteRead {
  public static final String SERIALIZED_NAME_BASIC_AUTH = "basicAuth";

  @SerializedName(SERIALIZED_NAME_BASIC_AUTH)
  private V1PrometheusSpecBasicAuth basicAuth;

  public static final String SERIALIZED_NAME_BEARER_TOKEN = "bearerToken";

  @SerializedName(SERIALIZED_NAME_BEARER_TOKEN)
  private String bearerToken;

  public static final String SERIALIZED_NAME_BEARER_TOKEN_FILE = "bearerTokenFile";

  @SerializedName(SERIALIZED_NAME_BEARER_TOKEN_FILE)
  private String bearerTokenFile;

  public static final String SERIALIZED_NAME_PROXY_URL = "proxyUrl";

  @SerializedName(SERIALIZED_NAME_PROXY_URL)
  private String proxyUrl;

  public static final String SERIALIZED_NAME_READ_RECENT = "readRecent";

  @SerializedName(SERIALIZED_NAME_READ_RECENT)
  private Boolean readRecent;

  public static final String SERIALIZED_NAME_REMOTE_TIMEOUT = "remoteTimeout";

  @SerializedName(SERIALIZED_NAME_REMOTE_TIMEOUT)
  private String remoteTimeout;

  public static final String SERIALIZED_NAME_REQUIRED_MATCHERS = "requiredMatchers";

  @SerializedName(SERIALIZED_NAME_REQUIRED_MATCHERS)
  private Map<String, String> requiredMatchers = null;

  public static final String SERIALIZED_NAME_TLS_CONFIG = "tlsConfig";

  @SerializedName(SERIALIZED_NAME_TLS_CONFIG)
  private V1PrometheusSpecTlsConfig tlsConfig;

  public static final String SERIALIZED_NAME_URL = "url";

  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public V1PrometheusSpecRemoteRead basicAuth(V1PrometheusSpecBasicAuth basicAuth) {

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
  public V1PrometheusSpecBasicAuth getBasicAuth() {
    return basicAuth;
  }

  public void setBasicAuth(V1PrometheusSpecBasicAuth basicAuth) {
    this.basicAuth = basicAuth;
  }

  public V1PrometheusSpecRemoteRead bearerToken(String bearerToken) {

    this.bearerToken = bearerToken;
    return this;
  }

  /**
   * bearer token for remote read.
   *
   * @return bearerToken
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "bearer token for remote read.")
  public String getBearerToken() {
    return bearerToken;
  }

  public void setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
  }

  public V1PrometheusSpecRemoteRead bearerTokenFile(String bearerTokenFile) {

    this.bearerTokenFile = bearerTokenFile;
    return this;
  }

  /**
   * File to read bearer token for remote read.
   *
   * @return bearerTokenFile
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File to read bearer token for remote read.")
  public String getBearerTokenFile() {
    return bearerTokenFile;
  }

  public void setBearerTokenFile(String bearerTokenFile) {
    this.bearerTokenFile = bearerTokenFile;
  }

  public V1PrometheusSpecRemoteRead proxyUrl(String proxyUrl) {

    this.proxyUrl = proxyUrl;
    return this;
  }

  /**
   * Optional ProxyURL
   *
   * @return proxyUrl
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional ProxyURL")
  public String getProxyUrl() {
    return proxyUrl;
  }

  public void setProxyUrl(String proxyUrl) {
    this.proxyUrl = proxyUrl;
  }

  public V1PrometheusSpecRemoteRead readRecent(Boolean readRecent) {

    this.readRecent = readRecent;
    return this;
  }

  /**
   * Whether reads should be made for queries for time ranges that the local storage should have
   * complete data for.
   *
   * @return readRecent
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Whether reads should be made for queries for time ranges that the local storage should have complete data for.")
  public Boolean getReadRecent() {
    return readRecent;
  }

  public void setReadRecent(Boolean readRecent) {
    this.readRecent = readRecent;
  }

  public V1PrometheusSpecRemoteRead remoteTimeout(String remoteTimeout) {

    this.remoteTimeout = remoteTimeout;
    return this;
  }

  /**
   * Timeout for requests to the remote read endpoint.
   *
   * @return remoteTimeout
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timeout for requests to the remote read endpoint.")
  public String getRemoteTimeout() {
    return remoteTimeout;
  }

  public void setRemoteTimeout(String remoteTimeout) {
    this.remoteTimeout = remoteTimeout;
  }

  public V1PrometheusSpecRemoteRead requiredMatchers(Map<String, String> requiredMatchers) {

    this.requiredMatchers = requiredMatchers;
    return this;
  }

  public V1PrometheusSpecRemoteRead putRequiredMatchersItem(
      String key, String requiredMatchersItem) {
    if (this.requiredMatchers == null) {
      this.requiredMatchers = new HashMap<String, String>();
    }
    this.requiredMatchers.put(key, requiredMatchersItem);
    return this;
  }

  /**
   * An optional list of equality matchers which have to be present in a selector to query the
   * remote read endpoint.
   *
   * @return requiredMatchers
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "An optional list of equality matchers which have to be present in a selector to query the remote read endpoint.")
  public Map<String, String> getRequiredMatchers() {
    return requiredMatchers;
  }

  public void setRequiredMatchers(Map<String, String> requiredMatchers) {
    this.requiredMatchers = requiredMatchers;
  }

  public V1PrometheusSpecRemoteRead tlsConfig(V1PrometheusSpecTlsConfig tlsConfig) {

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
  public V1PrometheusSpecTlsConfig getTlsConfig() {
    return tlsConfig;
  }

  public void setTlsConfig(V1PrometheusSpecTlsConfig tlsConfig) {
    this.tlsConfig = tlsConfig;
  }

  public V1PrometheusSpecRemoteRead url(String url) {

    this.url = url;
    return this;
  }

  /**
   * The URL of the endpoint to send samples to.
   *
   * @return url
   */
  @ApiModelProperty(required = true, value = "The URL of the endpoint to send samples to.")
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
    V1PrometheusSpecRemoteRead v1PrometheusSpecRemoteRead = (V1PrometheusSpecRemoteRead) o;
    return Objects.equals(this.basicAuth, v1PrometheusSpecRemoteRead.basicAuth)
        && Objects.equals(this.bearerToken, v1PrometheusSpecRemoteRead.bearerToken)
        && Objects.equals(this.bearerTokenFile, v1PrometheusSpecRemoteRead.bearerTokenFile)
        && Objects.equals(this.proxyUrl, v1PrometheusSpecRemoteRead.proxyUrl)
        && Objects.equals(this.readRecent, v1PrometheusSpecRemoteRead.readRecent)
        && Objects.equals(this.remoteTimeout, v1PrometheusSpecRemoteRead.remoteTimeout)
        && Objects.equals(this.requiredMatchers, v1PrometheusSpecRemoteRead.requiredMatchers)
        && Objects.equals(this.tlsConfig, v1PrometheusSpecRemoteRead.tlsConfig)
        && Objects.equals(this.url, v1PrometheusSpecRemoteRead.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        basicAuth,
        bearerToken,
        bearerTokenFile,
        proxyUrl,
        readRecent,
        remoteTimeout,
        requiredMatchers,
        tlsConfig,
        url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusSpecRemoteRead {\n");
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    bearerToken: ").append(toIndentedString(bearerToken)).append("\n");
    sb.append("    bearerTokenFile: ").append(toIndentedString(bearerTokenFile)).append("\n");
    sb.append("    proxyUrl: ").append(toIndentedString(proxyUrl)).append("\n");
    sb.append("    readRecent: ").append(toIndentedString(readRecent)).append("\n");
    sb.append("    remoteTimeout: ").append(toIndentedString(remoteTimeout)).append("\n");
    sb.append("    requiredMatchers: ").append(toIndentedString(requiredMatchers)).append("\n");
    sb.append("    tlsConfig: ").append(toIndentedString(tlsConfig)).append("\n");
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
