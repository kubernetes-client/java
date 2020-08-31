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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Endpoint defines a scrapeable endpoint serving Prometheus metrics. */
@ApiModel(description = "Endpoint defines a scrapeable endpoint serving Prometheus metrics.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ServiceMonitorSpecEndpoints {
  public static final String SERIALIZED_NAME_BASIC_AUTH = "basicAuth";

  @SerializedName(SERIALIZED_NAME_BASIC_AUTH)
  private V1ServiceMonitorSpecBasicAuth basicAuth;

  public static final String SERIALIZED_NAME_BEARER_TOKEN_FILE = "bearerTokenFile";

  @SerializedName(SERIALIZED_NAME_BEARER_TOKEN_FILE)
  private String bearerTokenFile;

  public static final String SERIALIZED_NAME_BEARER_TOKEN_SECRET = "bearerTokenSecret";

  @SerializedName(SERIALIZED_NAME_BEARER_TOKEN_SECRET)
  private V1ServiceMonitorSpecBearerTokenSecret bearerTokenSecret;

  public static final String SERIALIZED_NAME_HONOR_LABELS = "honorLabels";

  @SerializedName(SERIALIZED_NAME_HONOR_LABELS)
  private Boolean honorLabels;

  public static final String SERIALIZED_NAME_HONOR_TIMESTAMPS = "honorTimestamps";

  @SerializedName(SERIALIZED_NAME_HONOR_TIMESTAMPS)
  private Boolean honorTimestamps;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";

  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private String interval;

  public static final String SERIALIZED_NAME_METRIC_RELABELINGS = "metricRelabelings";

  @SerializedName(SERIALIZED_NAME_METRIC_RELABELINGS)
  private List<V1ServiceMonitorSpecMetricRelabelings> metricRelabelings = null;

  public static final String SERIALIZED_NAME_PARAMS = "params";

  @SerializedName(SERIALIZED_NAME_PARAMS)
  private Map<String, List<String>> params = null;

  public static final String SERIALIZED_NAME_PATH = "path";

  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PORT = "port";

  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public static final String SERIALIZED_NAME_PROXY_URL = "proxyUrl";

  @SerializedName(SERIALIZED_NAME_PROXY_URL)
  private String proxyUrl;

  public static final String SERIALIZED_NAME_RELABELINGS = "relabelings";

  @SerializedName(SERIALIZED_NAME_RELABELINGS)
  private List<V1ServiceMonitorSpecMetricRelabelings> relabelings = null;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";

  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme;

  public static final String SERIALIZED_NAME_SCRAPE_TIMEOUT = "scrapeTimeout";

  @SerializedName(SERIALIZED_NAME_SCRAPE_TIMEOUT)
  private String scrapeTimeout;

  public static final String SERIALIZED_NAME_TARGET_PORT = "targetPort";

  @SerializedName(SERIALIZED_NAME_TARGET_PORT)
  private Object targetPort;

  public static final String SERIALIZED_NAME_TLS_CONFIG = "tlsConfig";

  @SerializedName(SERIALIZED_NAME_TLS_CONFIG)
  private V1ServiceMonitorSpecTlsConfig tlsConfig;

  public V1ServiceMonitorSpecEndpoints basicAuth(V1ServiceMonitorSpecBasicAuth basicAuth) {

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
  public V1ServiceMonitorSpecBasicAuth getBasicAuth() {
    return basicAuth;
  }

  public void setBasicAuth(V1ServiceMonitorSpecBasicAuth basicAuth) {
    this.basicAuth = basicAuth;
  }

  public V1ServiceMonitorSpecEndpoints bearerTokenFile(String bearerTokenFile) {

    this.bearerTokenFile = bearerTokenFile;
    return this;
  }

  /**
   * File to read bearer token for scraping targets.
   *
   * @return bearerTokenFile
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File to read bearer token for scraping targets.")
  public String getBearerTokenFile() {
    return bearerTokenFile;
  }

  public void setBearerTokenFile(String bearerTokenFile) {
    this.bearerTokenFile = bearerTokenFile;
  }

  public V1ServiceMonitorSpecEndpoints bearerTokenSecret(
      V1ServiceMonitorSpecBearerTokenSecret bearerTokenSecret) {

    this.bearerTokenSecret = bearerTokenSecret;
    return this;
  }

  /**
   * Get bearerTokenSecret
   *
   * @return bearerTokenSecret
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ServiceMonitorSpecBearerTokenSecret getBearerTokenSecret() {
    return bearerTokenSecret;
  }

  public void setBearerTokenSecret(V1ServiceMonitorSpecBearerTokenSecret bearerTokenSecret) {
    this.bearerTokenSecret = bearerTokenSecret;
  }

  public V1ServiceMonitorSpecEndpoints honorLabels(Boolean honorLabels) {

    this.honorLabels = honorLabels;
    return this;
  }

  /**
   * HonorLabels chooses the metric&#39;s labels on collisions with target labels.
   *
   * @return honorLabels
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "HonorLabels chooses the metric's labels on collisions with target labels.")
  public Boolean getHonorLabels() {
    return honorLabels;
  }

  public void setHonorLabels(Boolean honorLabels) {
    this.honorLabels = honorLabels;
  }

  public V1ServiceMonitorSpecEndpoints honorTimestamps(Boolean honorTimestamps) {

    this.honorTimestamps = honorTimestamps;
    return this;
  }

  /**
   * HonorTimestamps controls whether Prometheus respects the timestamps present in scraped data.
   *
   * @return honorTimestamps
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "HonorTimestamps controls whether Prometheus respects the timestamps present in scraped data.")
  public Boolean getHonorTimestamps() {
    return honorTimestamps;
  }

  public void setHonorTimestamps(Boolean honorTimestamps) {
    this.honorTimestamps = honorTimestamps;
  }

  public V1ServiceMonitorSpecEndpoints interval(String interval) {

    this.interval = interval;
    return this;
  }

  /**
   * Interval at which metrics should be scraped
   *
   * @return interval
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Interval at which metrics should be scraped")
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public V1ServiceMonitorSpecEndpoints metricRelabelings(
      List<V1ServiceMonitorSpecMetricRelabelings> metricRelabelings) {

    this.metricRelabelings = metricRelabelings;
    return this;
  }

  public V1ServiceMonitorSpecEndpoints addMetricRelabelingsItem(
      V1ServiceMonitorSpecMetricRelabelings metricRelabelingsItem) {
    if (this.metricRelabelings == null) {
      this.metricRelabelings = new ArrayList<V1ServiceMonitorSpecMetricRelabelings>();
    }
    this.metricRelabelings.add(metricRelabelingsItem);
    return this;
  }

  /**
   * MetricRelabelConfigs to apply to samples before ingestion.
   *
   * @return metricRelabelings
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MetricRelabelConfigs to apply to samples before ingestion.")
  public List<V1ServiceMonitorSpecMetricRelabelings> getMetricRelabelings() {
    return metricRelabelings;
  }

  public void setMetricRelabelings(List<V1ServiceMonitorSpecMetricRelabelings> metricRelabelings) {
    this.metricRelabelings = metricRelabelings;
  }

  public V1ServiceMonitorSpecEndpoints params(Map<String, List<String>> params) {

    this.params = params;
    return this;
  }

  public V1ServiceMonitorSpecEndpoints putParamsItem(String key, List<String> paramsItem) {
    if (this.params == null) {
      this.params = new HashMap<String, List<String>>();
    }
    this.params.put(key, paramsItem);
    return this;
  }

  /**
   * Optional HTTP URL parameters
   *
   * @return params
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional HTTP URL parameters")
  public Map<String, List<String>> getParams() {
    return params;
  }

  public void setParams(Map<String, List<String>> params) {
    this.params = params;
  }

  public V1ServiceMonitorSpecEndpoints path(String path) {

    this.path = path;
    return this;
  }

  /**
   * HTTP path to scrape for metrics.
   *
   * @return path
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HTTP path to scrape for metrics.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1ServiceMonitorSpecEndpoints port(String port) {

    this.port = port;
    return this;
  }

  /**
   * Name of the service port this endpoint refers to. Mutually exclusive with targetPort.
   *
   * @return port
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Name of the service port this endpoint refers to. Mutually exclusive with targetPort.")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public V1ServiceMonitorSpecEndpoints proxyUrl(String proxyUrl) {

    this.proxyUrl = proxyUrl;
    return this;
  }

  /**
   * ProxyURL eg http://proxyserver:2195 Directs scrapes to proxy through this endpoint.
   *
   * @return proxyUrl
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "ProxyURL eg http://proxyserver:2195 Directs scrapes to proxy through this endpoint.")
  public String getProxyUrl() {
    return proxyUrl;
  }

  public void setProxyUrl(String proxyUrl) {
    this.proxyUrl = proxyUrl;
  }

  public V1ServiceMonitorSpecEndpoints relabelings(
      List<V1ServiceMonitorSpecMetricRelabelings> relabelings) {

    this.relabelings = relabelings;
    return this;
  }

  public V1ServiceMonitorSpecEndpoints addRelabelingsItem(
      V1ServiceMonitorSpecMetricRelabelings relabelingsItem) {
    if (this.relabelings == null) {
      this.relabelings = new ArrayList<V1ServiceMonitorSpecMetricRelabelings>();
    }
    this.relabelings.add(relabelingsItem);
    return this;
  }

  /**
   * RelabelConfigs to apply to samples before scraping. More info:
   * https://prometheus.io/docs/prometheus/latest/configuration/configuration/#relabel_config
   *
   * @return relabelings
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "RelabelConfigs to apply to samples before scraping. More info: https://prometheus.io/docs/prometheus/latest/configuration/configuration/#relabel_config")
  public List<V1ServiceMonitorSpecMetricRelabelings> getRelabelings() {
    return relabelings;
  }

  public void setRelabelings(List<V1ServiceMonitorSpecMetricRelabelings> relabelings) {
    this.relabelings = relabelings;
  }

  public V1ServiceMonitorSpecEndpoints scheme(String scheme) {

    this.scheme = scheme;
    return this;
  }

  /**
   * HTTP scheme to use for scraping.
   *
   * @return scheme
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HTTP scheme to use for scraping.")
  public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  public V1ServiceMonitorSpecEndpoints scrapeTimeout(String scrapeTimeout) {

    this.scrapeTimeout = scrapeTimeout;
    return this;
  }

  /**
   * Timeout after which the scrape is ended
   *
   * @return scrapeTimeout
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timeout after which the scrape is ended")
  public String getScrapeTimeout() {
    return scrapeTimeout;
  }

  public void setScrapeTimeout(String scrapeTimeout) {
    this.scrapeTimeout = scrapeTimeout;
  }

  public V1ServiceMonitorSpecEndpoints targetPort(Object targetPort) {

    this.targetPort = targetPort;
    return this;
  }

  /**
   * Name or number of the pod port this endpoint refers to. Mutually exclusive with port.
   *
   * @return targetPort
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Name or number of the pod port this endpoint refers to. Mutually exclusive with port.")
  public Object getTargetPort() {
    return targetPort;
  }

  public void setTargetPort(Object targetPort) {
    this.targetPort = targetPort;
  }

  public V1ServiceMonitorSpecEndpoints tlsConfig(V1ServiceMonitorSpecTlsConfig tlsConfig) {

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
  public V1ServiceMonitorSpecTlsConfig getTlsConfig() {
    return tlsConfig;
  }

  public void setTlsConfig(V1ServiceMonitorSpecTlsConfig tlsConfig) {
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
    V1ServiceMonitorSpecEndpoints v1ServiceMonitorSpecEndpoints = (V1ServiceMonitorSpecEndpoints) o;
    return Objects.equals(this.basicAuth, v1ServiceMonitorSpecEndpoints.basicAuth)
        && Objects.equals(this.bearerTokenFile, v1ServiceMonitorSpecEndpoints.bearerTokenFile)
        && Objects.equals(this.bearerTokenSecret, v1ServiceMonitorSpecEndpoints.bearerTokenSecret)
        && Objects.equals(this.honorLabels, v1ServiceMonitorSpecEndpoints.honorLabels)
        && Objects.equals(this.honorTimestamps, v1ServiceMonitorSpecEndpoints.honorTimestamps)
        && Objects.equals(this.interval, v1ServiceMonitorSpecEndpoints.interval)
        && Objects.equals(this.metricRelabelings, v1ServiceMonitorSpecEndpoints.metricRelabelings)
        && Objects.equals(this.params, v1ServiceMonitorSpecEndpoints.params)
        && Objects.equals(this.path, v1ServiceMonitorSpecEndpoints.path)
        && Objects.equals(this.port, v1ServiceMonitorSpecEndpoints.port)
        && Objects.equals(this.proxyUrl, v1ServiceMonitorSpecEndpoints.proxyUrl)
        && Objects.equals(this.relabelings, v1ServiceMonitorSpecEndpoints.relabelings)
        && Objects.equals(this.scheme, v1ServiceMonitorSpecEndpoints.scheme)
        && Objects.equals(this.scrapeTimeout, v1ServiceMonitorSpecEndpoints.scrapeTimeout)
        && Objects.equals(this.targetPort, v1ServiceMonitorSpecEndpoints.targetPort)
        && Objects.equals(this.tlsConfig, v1ServiceMonitorSpecEndpoints.tlsConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        basicAuth,
        bearerTokenFile,
        bearerTokenSecret,
        honorLabels,
        honorTimestamps,
        interval,
        metricRelabelings,
        params,
        path,
        port,
        proxyUrl,
        relabelings,
        scheme,
        scrapeTimeout,
        targetPort,
        tlsConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServiceMonitorSpecEndpoints {\n");
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    bearerTokenFile: ").append(toIndentedString(bearerTokenFile)).append("\n");
    sb.append("    bearerTokenSecret: ").append(toIndentedString(bearerTokenSecret)).append("\n");
    sb.append("    honorLabels: ").append(toIndentedString(honorLabels)).append("\n");
    sb.append("    honorTimestamps: ").append(toIndentedString(honorTimestamps)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    metricRelabelings: ").append(toIndentedString(metricRelabelings)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    proxyUrl: ").append(toIndentedString(proxyUrl)).append("\n");
    sb.append("    relabelings: ").append(toIndentedString(relabelings)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    scrapeTimeout: ").append(toIndentedString(scrapeTimeout)).append("\n");
    sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
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
