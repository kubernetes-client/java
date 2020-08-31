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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** RemoteWriteSpec defines the remote_write configuration for prometheus. */
@ApiModel(description = "RemoteWriteSpec defines the remote_write configuration for prometheus.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1PrometheusSpecRemoteWrite {
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

  public static final String SERIALIZED_NAME_QUEUE_CONFIG = "queueConfig";

  @SerializedName(SERIALIZED_NAME_QUEUE_CONFIG)
  private V1PrometheusSpecQueueConfig queueConfig;

  public static final String SERIALIZED_NAME_REMOTE_TIMEOUT = "remoteTimeout";

  @SerializedName(SERIALIZED_NAME_REMOTE_TIMEOUT)
  private String remoteTimeout;

  public static final String SERIALIZED_NAME_TLS_CONFIG = "tlsConfig";

  @SerializedName(SERIALIZED_NAME_TLS_CONFIG)
  private V1PrometheusSpecTlsConfig1 tlsConfig;

  public static final String SERIALIZED_NAME_URL = "url";

  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_WRITE_RELABEL_CONFIGS = "writeRelabelConfigs";

  @SerializedName(SERIALIZED_NAME_WRITE_RELABEL_CONFIGS)
  private List<V1ServiceMonitorSpecMetricRelabelings> writeRelabelConfigs = null;

  public V1PrometheusSpecRemoteWrite basicAuth(V1PrometheusSpecBasicAuth basicAuth) {

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

  public V1PrometheusSpecRemoteWrite bearerToken(String bearerToken) {

    this.bearerToken = bearerToken;
    return this;
  }

  /**
   * File to read bearer token for remote write.
   *
   * @return bearerToken
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File to read bearer token for remote write.")
  public String getBearerToken() {
    return bearerToken;
  }

  public void setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
  }

  public V1PrometheusSpecRemoteWrite bearerTokenFile(String bearerTokenFile) {

    this.bearerTokenFile = bearerTokenFile;
    return this;
  }

  /**
   * File to read bearer token for remote write.
   *
   * @return bearerTokenFile
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File to read bearer token for remote write.")
  public String getBearerTokenFile() {
    return bearerTokenFile;
  }

  public void setBearerTokenFile(String bearerTokenFile) {
    this.bearerTokenFile = bearerTokenFile;
  }

  public V1PrometheusSpecRemoteWrite proxyUrl(String proxyUrl) {

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

  public V1PrometheusSpecRemoteWrite queueConfig(V1PrometheusSpecQueueConfig queueConfig) {

    this.queueConfig = queueConfig;
    return this;
  }

  /**
   * Get queueConfig
   *
   * @return queueConfig
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecQueueConfig getQueueConfig() {
    return queueConfig;
  }

  public void setQueueConfig(V1PrometheusSpecQueueConfig queueConfig) {
    this.queueConfig = queueConfig;
  }

  public V1PrometheusSpecRemoteWrite remoteTimeout(String remoteTimeout) {

    this.remoteTimeout = remoteTimeout;
    return this;
  }

  /**
   * Timeout for requests to the remote write endpoint.
   *
   * @return remoteTimeout
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timeout for requests to the remote write endpoint.")
  public String getRemoteTimeout() {
    return remoteTimeout;
  }

  public void setRemoteTimeout(String remoteTimeout) {
    this.remoteTimeout = remoteTimeout;
  }

  public V1PrometheusSpecRemoteWrite tlsConfig(V1PrometheusSpecTlsConfig1 tlsConfig) {

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
  public V1PrometheusSpecTlsConfig1 getTlsConfig() {
    return tlsConfig;
  }

  public void setTlsConfig(V1PrometheusSpecTlsConfig1 tlsConfig) {
    this.tlsConfig = tlsConfig;
  }

  public V1PrometheusSpecRemoteWrite url(String url) {

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

  public V1PrometheusSpecRemoteWrite writeRelabelConfigs(
      List<V1ServiceMonitorSpecMetricRelabelings> writeRelabelConfigs) {

    this.writeRelabelConfigs = writeRelabelConfigs;
    return this;
  }

  public V1PrometheusSpecRemoteWrite addWriteRelabelConfigsItem(
      V1ServiceMonitorSpecMetricRelabelings writeRelabelConfigsItem) {
    if (this.writeRelabelConfigs == null) {
      this.writeRelabelConfigs = new ArrayList<V1ServiceMonitorSpecMetricRelabelings>();
    }
    this.writeRelabelConfigs.add(writeRelabelConfigsItem);
    return this;
  }

  /**
   * The list of remote write relabel configurations.
   *
   * @return writeRelabelConfigs
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of remote write relabel configurations.")
  public List<V1ServiceMonitorSpecMetricRelabelings> getWriteRelabelConfigs() {
    return writeRelabelConfigs;
  }

  public void setWriteRelabelConfigs(
      List<V1ServiceMonitorSpecMetricRelabelings> writeRelabelConfigs) {
    this.writeRelabelConfigs = writeRelabelConfigs;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PrometheusSpecRemoteWrite v1PrometheusSpecRemoteWrite = (V1PrometheusSpecRemoteWrite) o;
    return Objects.equals(this.basicAuth, v1PrometheusSpecRemoteWrite.basicAuth)
        && Objects.equals(this.bearerToken, v1PrometheusSpecRemoteWrite.bearerToken)
        && Objects.equals(this.bearerTokenFile, v1PrometheusSpecRemoteWrite.bearerTokenFile)
        && Objects.equals(this.proxyUrl, v1PrometheusSpecRemoteWrite.proxyUrl)
        && Objects.equals(this.queueConfig, v1PrometheusSpecRemoteWrite.queueConfig)
        && Objects.equals(this.remoteTimeout, v1PrometheusSpecRemoteWrite.remoteTimeout)
        && Objects.equals(this.tlsConfig, v1PrometheusSpecRemoteWrite.tlsConfig)
        && Objects.equals(this.url, v1PrometheusSpecRemoteWrite.url)
        && Objects.equals(
            this.writeRelabelConfigs, v1PrometheusSpecRemoteWrite.writeRelabelConfigs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        basicAuth,
        bearerToken,
        bearerTokenFile,
        proxyUrl,
        queueConfig,
        remoteTimeout,
        tlsConfig,
        url,
        writeRelabelConfigs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusSpecRemoteWrite {\n");
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    bearerToken: ").append(toIndentedString(bearerToken)).append("\n");
    sb.append("    bearerTokenFile: ").append(toIndentedString(bearerTokenFile)).append("\n");
    sb.append("    proxyUrl: ").append(toIndentedString(proxyUrl)).append("\n");
    sb.append("    queueConfig: ").append(toIndentedString(queueConfig)).append("\n");
    sb.append("    remoteTimeout: ").append(toIndentedString(remoteTimeout)).append("\n");
    sb.append("    tlsConfig: ").append(toIndentedString(tlsConfig)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    writeRelabelConfigs: ")
        .append(toIndentedString(writeRelabelConfigs))
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
