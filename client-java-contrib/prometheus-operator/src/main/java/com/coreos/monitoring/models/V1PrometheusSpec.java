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

/**
 * Specification of the desired behavior of the Prometheus cluster. More info:
 * https://github.com/kubernetes/community/blob/master/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
 */
@ApiModel(
    description =
        "Specification of the desired behavior of the Prometheus cluster. More info: https://github.com/kubernetes/community/blob/master/contributors/devel/sig-architecture/api-conventions.md#spec-and-status")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1PrometheusSpec {
  public static final String SERIALIZED_NAME_ADDITIONAL_ALERT_MANAGER_CONFIGS =
      "additionalAlertManagerConfigs";

  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ALERT_MANAGER_CONFIGS)
  private V1PrometheusSpecAdditionalAlertManagerConfigs additionalAlertManagerConfigs;

  public static final String SERIALIZED_NAME_ADDITIONAL_ALERT_RELABEL_CONFIGS =
      "additionalAlertRelabelConfigs";

  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ALERT_RELABEL_CONFIGS)
  private V1PrometheusSpecAdditionalAlertRelabelConfigs additionalAlertRelabelConfigs;

  public static final String SERIALIZED_NAME_ADDITIONAL_SCRAPE_CONFIGS = "additionalScrapeConfigs";

  @SerializedName(SERIALIZED_NAME_ADDITIONAL_SCRAPE_CONFIGS)
  private V1PrometheusSpecAdditionalScrapeConfigs additionalScrapeConfigs;

  public static final String SERIALIZED_NAME_AFFINITY = "affinity";

  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private V1ThanosRulerSpecAffinity affinity;

  public static final String SERIALIZED_NAME_ALERTING = "alerting";

  @SerializedName(SERIALIZED_NAME_ALERTING)
  private V1PrometheusSpecAlerting alerting;

  public static final String SERIALIZED_NAME_APISERVER_CONFIG = "apiserverConfig";

  @SerializedName(SERIALIZED_NAME_APISERVER_CONFIG)
  private V1PrometheusSpecApiserverConfig apiserverConfig;

  public static final String SERIALIZED_NAME_ARBITRARY_F_S_ACCESS_THROUGH_S_MS =
      "arbitraryFSAccessThroughSMs";

  @SerializedName(SERIALIZED_NAME_ARBITRARY_F_S_ACCESS_THROUGH_S_MS)
  private V1PrometheusSpecArbitraryFSAccessThroughSMs arbitraryFSAccessThroughSMs;

  public static final String SERIALIZED_NAME_BASE_IMAGE = "baseImage";

  @SerializedName(SERIALIZED_NAME_BASE_IMAGE)
  private String baseImage;

  public static final String SERIALIZED_NAME_CONFIG_MAPS = "configMaps";

  @SerializedName(SERIALIZED_NAME_CONFIG_MAPS)
  private List<String> configMaps = null;

  public static final String SERIALIZED_NAME_CONTAINERS = "containers";

  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private List<V1ThanosRulerSpecContainers> containers = null;

  public static final String SERIALIZED_NAME_DISABLE_COMPACTION = "disableCompaction";

  @SerializedName(SERIALIZED_NAME_DISABLE_COMPACTION)
  private Boolean disableCompaction;

  public static final String SERIALIZED_NAME_ENABLE_ADMIN_A_P_I = "enableAdminAPI";

  @SerializedName(SERIALIZED_NAME_ENABLE_ADMIN_A_P_I)
  private Boolean enableAdminAPI;

  public static final String SERIALIZED_NAME_ENFORCED_NAMESPACE_LABEL = "enforcedNamespaceLabel";

  @SerializedName(SERIALIZED_NAME_ENFORCED_NAMESPACE_LABEL)
  private String enforcedNamespaceLabel;

  public static final String SERIALIZED_NAME_EVALUATION_INTERVAL = "evaluationInterval";

  @SerializedName(SERIALIZED_NAME_EVALUATION_INTERVAL)
  private String evaluationInterval;

  public static final String SERIALIZED_NAME_EXTERNAL_LABELS = "externalLabels";

  @SerializedName(SERIALIZED_NAME_EXTERNAL_LABELS)
  private Map<String, String> externalLabels = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL = "externalUrl";

  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private String externalUrl;

  public static final String SERIALIZED_NAME_IGNORE_NAMESPACE_SELECTORS =
      "ignoreNamespaceSelectors";

  @SerializedName(SERIALIZED_NAME_IGNORE_NAMESPACE_SELECTORS)
  private Boolean ignoreNamespaceSelectors;

  public static final String SERIALIZED_NAME_IMAGE = "image";

  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_PULL_SECRETS = "imagePullSecrets";

  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_SECRETS)
  private List<V1ThanosRulerSpecImagePullSecrets> imagePullSecrets = null;

  public static final String SERIALIZED_NAME_INIT_CONTAINERS = "initContainers";

  @SerializedName(SERIALIZED_NAME_INIT_CONTAINERS)
  private List<V1ThanosRulerSpecContainers> initContainers = null;

  public static final String SERIALIZED_NAME_LISTEN_LOCAL = "listenLocal";

  @SerializedName(SERIALIZED_NAME_LISTEN_LOCAL)
  private Boolean listenLocal;

  public static final String SERIALIZED_NAME_LOG_FORMAT = "logFormat";

  @SerializedName(SERIALIZED_NAME_LOG_FORMAT)
  private String logFormat;

  public static final String SERIALIZED_NAME_LOG_LEVEL = "logLevel";

  @SerializedName(SERIALIZED_NAME_LOG_LEVEL)
  private String logLevel;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";

  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = null;

  public static final String SERIALIZED_NAME_OVERRIDE_HONOR_LABELS = "overrideHonorLabels";

  @SerializedName(SERIALIZED_NAME_OVERRIDE_HONOR_LABELS)
  private Boolean overrideHonorLabels;

  public static final String SERIALIZED_NAME_OVERRIDE_HONOR_TIMESTAMPS = "overrideHonorTimestamps";

  @SerializedName(SERIALIZED_NAME_OVERRIDE_HONOR_TIMESTAMPS)
  private Boolean overrideHonorTimestamps;

  public static final String SERIALIZED_NAME_PAUSED = "paused";

  @SerializedName(SERIALIZED_NAME_PAUSED)
  private Boolean paused;

  public static final String SERIALIZED_NAME_POD_METADATA = "podMetadata";

  @SerializedName(SERIALIZED_NAME_POD_METADATA)
  private V1PrometheusSpecPodMetadata podMetadata;

  public static final String SERIALIZED_NAME_POD_MONITOR_NAMESPACE_SELECTOR =
      "podMonitorNamespaceSelector";

  @SerializedName(SERIALIZED_NAME_POD_MONITOR_NAMESPACE_SELECTOR)
  private V1PrometheusSpecPodMonitorNamespaceSelector podMonitorNamespaceSelector;

  public static final String SERIALIZED_NAME_POD_MONITOR_SELECTOR = "podMonitorSelector";

  @SerializedName(SERIALIZED_NAME_POD_MONITOR_SELECTOR)
  private V1PrometheusSpecPodMonitorSelector podMonitorSelector;

  public static final String SERIALIZED_NAME_PORT_NAME = "portName";

  @SerializedName(SERIALIZED_NAME_PORT_NAME)
  private String portName;

  public static final String SERIALIZED_NAME_PRIORITY_CLASS_NAME = "priorityClassName";

  @SerializedName(SERIALIZED_NAME_PRIORITY_CLASS_NAME)
  private String priorityClassName;

  public static final String SERIALIZED_NAME_PROMETHEUS_EXTERNAL_LABEL_NAME =
      "prometheusExternalLabelName";

  @SerializedName(SERIALIZED_NAME_PROMETHEUS_EXTERNAL_LABEL_NAME)
  private String prometheusExternalLabelName;

  public static final String SERIALIZED_NAME_QUERY = "query";

  @SerializedName(SERIALIZED_NAME_QUERY)
  private V1PrometheusSpecQuery query;

  public static final String SERIALIZED_NAME_REMOTE_READ = "remoteRead";

  @SerializedName(SERIALIZED_NAME_REMOTE_READ)
  private List<V1PrometheusSpecRemoteRead> remoteRead = null;

  public static final String SERIALIZED_NAME_REMOTE_WRITE = "remoteWrite";

  @SerializedName(SERIALIZED_NAME_REMOTE_WRITE)
  private List<V1PrometheusSpecRemoteWrite> remoteWrite = null;

  public static final String SERIALIZED_NAME_REPLICA_EXTERNAL_LABEL_NAME =
      "replicaExternalLabelName";

  @SerializedName(SERIALIZED_NAME_REPLICA_EXTERNAL_LABEL_NAME)
  private String replicaExternalLabelName;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";

  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";

  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1AlertmanagerSpecResources resources;

  public static final String SERIALIZED_NAME_RETENTION = "retention";

  @SerializedName(SERIALIZED_NAME_RETENTION)
  private String retention;

  public static final String SERIALIZED_NAME_RETENTION_SIZE = "retentionSize";

  @SerializedName(SERIALIZED_NAME_RETENTION_SIZE)
  private String retentionSize;

  public static final String SERIALIZED_NAME_ROUTE_PREFIX = "routePrefix";

  @SerializedName(SERIALIZED_NAME_ROUTE_PREFIX)
  private String routePrefix;

  public static final String SERIALIZED_NAME_RULE_NAMESPACE_SELECTOR = "ruleNamespaceSelector";

  @SerializedName(SERIALIZED_NAME_RULE_NAMESPACE_SELECTOR)
  private V1PrometheusSpecRuleNamespaceSelector ruleNamespaceSelector;

  public static final String SERIALIZED_NAME_RULE_SELECTOR = "ruleSelector";

  @SerializedName(SERIALIZED_NAME_RULE_SELECTOR)
  private V1PrometheusSpecRuleSelector ruleSelector;

  public static final String SERIALIZED_NAME_RULES = "rules";

  @SerializedName(SERIALIZED_NAME_RULES)
  private V1PrometheusSpecRules rules;

  public static final String SERIALIZED_NAME_SCRAPE_INTERVAL = "scrapeInterval";

  @SerializedName(SERIALIZED_NAME_SCRAPE_INTERVAL)
  private String scrapeInterval;

  public static final String SERIALIZED_NAME_SECRETS = "secrets";

  @SerializedName(SERIALIZED_NAME_SECRETS)
  private List<String> secrets = null;

  public static final String SERIALIZED_NAME_SECURITY_CONTEXT = "securityContext";

  @SerializedName(SERIALIZED_NAME_SECURITY_CONTEXT)
  private V1ThanosRulerSpecSecurityContext1 securityContext;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_NAME = "serviceAccountName";

  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_NAME)
  private String serviceAccountName;

  public static final String SERIALIZED_NAME_SERVICE_MONITOR_NAMESPACE_SELECTOR =
      "serviceMonitorNamespaceSelector";

  @SerializedName(SERIALIZED_NAME_SERVICE_MONITOR_NAMESPACE_SELECTOR)
  private V1PrometheusSpecServiceMonitorNamespaceSelector serviceMonitorNamespaceSelector;

  public static final String SERIALIZED_NAME_SERVICE_MONITOR_SELECTOR = "serviceMonitorSelector";

  @SerializedName(SERIALIZED_NAME_SERVICE_MONITOR_SELECTOR)
  private V1PrometheusSpecServiceMonitorSelector serviceMonitorSelector;

  public static final String SERIALIZED_NAME_SHA = "sha";

  @SerializedName(SERIALIZED_NAME_SHA)
  private String sha;

  public static final String SERIALIZED_NAME_STORAGE = "storage";

  @SerializedName(SERIALIZED_NAME_STORAGE)
  private V1ThanosRulerSpecStorage storage;

  public static final String SERIALIZED_NAME_TAG = "tag";

  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_THANOS = "thanos";

  @SerializedName(SERIALIZED_NAME_THANOS)
  private V1PrometheusSpecThanos thanos;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";

  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private List<V1ThanosRulerSpecTolerations> tolerations = null;

  public static final String SERIALIZED_NAME_VERSION = "version";

  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "volumeMounts";

  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  private List<V1ThanosRulerSpecVolumeMounts> volumeMounts = null;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";

  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<V1ThanosRulerSpecVolumes> volumes = null;

  public static final String SERIALIZED_NAME_WAL_COMPRESSION = "walCompression";

  @SerializedName(SERIALIZED_NAME_WAL_COMPRESSION)
  private Boolean walCompression;

  public V1PrometheusSpec additionalAlertManagerConfigs(
      V1PrometheusSpecAdditionalAlertManagerConfigs additionalAlertManagerConfigs) {

    this.additionalAlertManagerConfigs = additionalAlertManagerConfigs;
    return this;
  }

  /**
   * Get additionalAlertManagerConfigs
   *
   * @return additionalAlertManagerConfigs
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecAdditionalAlertManagerConfigs getAdditionalAlertManagerConfigs() {
    return additionalAlertManagerConfigs;
  }

  public void setAdditionalAlertManagerConfigs(
      V1PrometheusSpecAdditionalAlertManagerConfigs additionalAlertManagerConfigs) {
    this.additionalAlertManagerConfigs = additionalAlertManagerConfigs;
  }

  public V1PrometheusSpec additionalAlertRelabelConfigs(
      V1PrometheusSpecAdditionalAlertRelabelConfigs additionalAlertRelabelConfigs) {

    this.additionalAlertRelabelConfigs = additionalAlertRelabelConfigs;
    return this;
  }

  /**
   * Get additionalAlertRelabelConfigs
   *
   * @return additionalAlertRelabelConfigs
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecAdditionalAlertRelabelConfigs getAdditionalAlertRelabelConfigs() {
    return additionalAlertRelabelConfigs;
  }

  public void setAdditionalAlertRelabelConfigs(
      V1PrometheusSpecAdditionalAlertRelabelConfigs additionalAlertRelabelConfigs) {
    this.additionalAlertRelabelConfigs = additionalAlertRelabelConfigs;
  }

  public V1PrometheusSpec additionalScrapeConfigs(
      V1PrometheusSpecAdditionalScrapeConfigs additionalScrapeConfigs) {

    this.additionalScrapeConfigs = additionalScrapeConfigs;
    return this;
  }

  /**
   * Get additionalScrapeConfigs
   *
   * @return additionalScrapeConfigs
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecAdditionalScrapeConfigs getAdditionalScrapeConfigs() {
    return additionalScrapeConfigs;
  }

  public void setAdditionalScrapeConfigs(
      V1PrometheusSpecAdditionalScrapeConfigs additionalScrapeConfigs) {
    this.additionalScrapeConfigs = additionalScrapeConfigs;
  }

  public V1PrometheusSpec affinity(V1ThanosRulerSpecAffinity affinity) {

    this.affinity = affinity;
    return this;
  }

  /**
   * Get affinity
   *
   * @return affinity
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecAffinity getAffinity() {
    return affinity;
  }

  public void setAffinity(V1ThanosRulerSpecAffinity affinity) {
    this.affinity = affinity;
  }

  public V1PrometheusSpec alerting(V1PrometheusSpecAlerting alerting) {

    this.alerting = alerting;
    return this;
  }

  /**
   * Get alerting
   *
   * @return alerting
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecAlerting getAlerting() {
    return alerting;
  }

  public void setAlerting(V1PrometheusSpecAlerting alerting) {
    this.alerting = alerting;
  }

  public V1PrometheusSpec apiserverConfig(V1PrometheusSpecApiserverConfig apiserverConfig) {

    this.apiserverConfig = apiserverConfig;
    return this;
  }

  /**
   * Get apiserverConfig
   *
   * @return apiserverConfig
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecApiserverConfig getApiserverConfig() {
    return apiserverConfig;
  }

  public void setApiserverConfig(V1PrometheusSpecApiserverConfig apiserverConfig) {
    this.apiserverConfig = apiserverConfig;
  }

  public V1PrometheusSpec arbitraryFSAccessThroughSMs(
      V1PrometheusSpecArbitraryFSAccessThroughSMs arbitraryFSAccessThroughSMs) {

    this.arbitraryFSAccessThroughSMs = arbitraryFSAccessThroughSMs;
    return this;
  }

  /**
   * Get arbitraryFSAccessThroughSMs
   *
   * @return arbitraryFSAccessThroughSMs
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecArbitraryFSAccessThroughSMs getArbitraryFSAccessThroughSMs() {
    return arbitraryFSAccessThroughSMs;
  }

  public void setArbitraryFSAccessThroughSMs(
      V1PrometheusSpecArbitraryFSAccessThroughSMs arbitraryFSAccessThroughSMs) {
    this.arbitraryFSAccessThroughSMs = arbitraryFSAccessThroughSMs;
  }

  public V1PrometheusSpec baseImage(String baseImage) {

    this.baseImage = baseImage;
    return this;
  }

  /**
   * Base image to use for a Prometheus deployment.
   *
   * @return baseImage
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base image to use for a Prometheus deployment.")
  public String getBaseImage() {
    return baseImage;
  }

  public void setBaseImage(String baseImage) {
    this.baseImage = baseImage;
  }

  public V1PrometheusSpec configMaps(List<String> configMaps) {

    this.configMaps = configMaps;
    return this;
  }

  public V1PrometheusSpec addConfigMapsItem(String configMapsItem) {
    if (this.configMaps == null) {
      this.configMaps = new ArrayList<String>();
    }
    this.configMaps.add(configMapsItem);
    return this;
  }

  /**
   * ConfigMaps is a list of ConfigMaps in the same namespace as the Prometheus object, which shall
   * be mounted into the Prometheus Pods. The ConfigMaps are mounted into
   * /etc/prometheus/configmaps/&lt;configmap-name&gt;.
   *
   * @return configMaps
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ConfigMaps is a list of ConfigMaps in the same namespace as the Prometheus object, which shall be mounted into the Prometheus Pods. The ConfigMaps are mounted into /etc/prometheus/configmaps/<configmap-name>.")
  public List<String> getConfigMaps() {
    return configMaps;
  }

  public void setConfigMaps(List<String> configMaps) {
    this.configMaps = configMaps;
  }

  public V1PrometheusSpec containers(List<V1ThanosRulerSpecContainers> containers) {

    this.containers = containers;
    return this;
  }

  public V1PrometheusSpec addContainersItem(V1ThanosRulerSpecContainers containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<V1ThanosRulerSpecContainers>();
    }
    this.containers.add(containersItem);
    return this;
  }

  /**
   * Containers allows injecting additional containers or modifying operator generated containers.
   * This can be used to allow adding an authentication proxy to a Prometheus pod or to change the
   * behavior of an operator generated container. Containers described here modify an operator
   * generated container if they share the same name and modifications are done via a strategic
   * merge patch. The current container names are: &#x60;prometheus&#x60;,
   * &#x60;prometheus-config-reloader&#x60;, &#x60;rules-configmap-reloader&#x60;, and
   * &#x60;thanos-sidecar&#x60;. Overriding containers is entirely outside the scope of what the
   * maintainers will support and by doing so, you accept that this behaviour may break at any time
   * without notice.
   *
   * @return containers
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Containers allows injecting additional containers or modifying operator generated containers. This can be used to allow adding an authentication proxy to a Prometheus pod or to change the behavior of an operator generated container. Containers described here modify an operator generated container if they share the same name and modifications are done via a strategic merge patch. The current container names are: `prometheus`, `prometheus-config-reloader`, `rules-configmap-reloader`, and `thanos-sidecar`. Overriding containers is entirely outside the scope of what the maintainers will support and by doing so, you accept that this behaviour may break at any time without notice.")
  public List<V1ThanosRulerSpecContainers> getContainers() {
    return containers;
  }

  public void setContainers(List<V1ThanosRulerSpecContainers> containers) {
    this.containers = containers;
  }

  public V1PrometheusSpec disableCompaction(Boolean disableCompaction) {

    this.disableCompaction = disableCompaction;
    return this;
  }

  /**
   * Disable prometheus compaction.
   *
   * @return disableCompaction
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Disable prometheus compaction.")
  public Boolean getDisableCompaction() {
    return disableCompaction;
  }

  public void setDisableCompaction(Boolean disableCompaction) {
    this.disableCompaction = disableCompaction;
  }

  public V1PrometheusSpec enableAdminAPI(Boolean enableAdminAPI) {

    this.enableAdminAPI = enableAdminAPI;
    return this;
  }

  /**
   * Enable access to prometheus web admin API. Defaults to the value of &#x60;false&#x60;. WARNING:
   * Enabling the admin APIs enables mutating endpoints, to delete data, shutdown Prometheus, and
   * more. Enabling this should be done with care and the user is advised to add additional
   * authentication authorization via a proxy to ensure only clients authorized to perform these
   * actions can do so. For more information see
   * https://prometheus.io/docs/prometheus/latest/querying/api/#tsdb-admin-apis
   *
   * @return enableAdminAPI
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Enable access to prometheus web admin API. Defaults to the value of `false`. WARNING: Enabling the admin APIs enables mutating endpoints, to delete data, shutdown Prometheus, and more. Enabling this should be done with care and the user is advised to add additional authentication authorization via a proxy to ensure only clients authorized to perform these actions can do so. For more information see https://prometheus.io/docs/prometheus/latest/querying/api/#tsdb-admin-apis")
  public Boolean getEnableAdminAPI() {
    return enableAdminAPI;
  }

  public void setEnableAdminAPI(Boolean enableAdminAPI) {
    this.enableAdminAPI = enableAdminAPI;
  }

  public V1PrometheusSpec enforcedNamespaceLabel(String enforcedNamespaceLabel) {

    this.enforcedNamespaceLabel = enforcedNamespaceLabel;
    return this;
  }

  /**
   * EnforcedNamespaceLabel enforces adding a namespace label of origin for each alert and metric
   * that is user created. The label value will always be the namespace of the object that is being
   * created.
   *
   * @return enforcedNamespaceLabel
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "EnforcedNamespaceLabel enforces adding a namespace label of origin for each alert and metric that is user created. The label value will always be the namespace of the object that is being created.")
  public String getEnforcedNamespaceLabel() {
    return enforcedNamespaceLabel;
  }

  public void setEnforcedNamespaceLabel(String enforcedNamespaceLabel) {
    this.enforcedNamespaceLabel = enforcedNamespaceLabel;
  }

  public V1PrometheusSpec evaluationInterval(String evaluationInterval) {

    this.evaluationInterval = evaluationInterval;
    return this;
  }

  /**
   * Interval between consecutive evaluations.
   *
   * @return evaluationInterval
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Interval between consecutive evaluations.")
  public String getEvaluationInterval() {
    return evaluationInterval;
  }

  public void setEvaluationInterval(String evaluationInterval) {
    this.evaluationInterval = evaluationInterval;
  }

  public V1PrometheusSpec externalLabels(Map<String, String> externalLabels) {

    this.externalLabels = externalLabels;
    return this;
  }

  public V1PrometheusSpec putExternalLabelsItem(String key, String externalLabelsItem) {
    if (this.externalLabels == null) {
      this.externalLabels = new HashMap<String, String>();
    }
    this.externalLabels.put(key, externalLabelsItem);
    return this;
  }

  /**
   * The labels to add to any time series or alerts when communicating with external systems
   * (federation, remote storage, Alertmanager).
   *
   * @return externalLabels
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The labels to add to any time series or alerts when communicating with external systems (federation, remote storage, Alertmanager).")
  public Map<String, String> getExternalLabels() {
    return externalLabels;
  }

  public void setExternalLabels(Map<String, String> externalLabels) {
    this.externalLabels = externalLabels;
  }

  public V1PrometheusSpec externalUrl(String externalUrl) {

    this.externalUrl = externalUrl;
    return this;
  }

  /**
   * The external URL the Prometheus instances will be available under. This is necessary to
   * generate correct URLs. This is necessary if Prometheus is not served from root of a DNS name.
   *
   * @return externalUrl
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The external URL the Prometheus instances will be available under. This is necessary to generate correct URLs. This is necessary if Prometheus is not served from root of a DNS name.")
  public String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  public V1PrometheusSpec ignoreNamespaceSelectors(Boolean ignoreNamespaceSelectors) {

    this.ignoreNamespaceSelectors = ignoreNamespaceSelectors;
    return this;
  }

  /**
   * IgnoreNamespaceSelectors if set to true will ignore NamespaceSelector settings from the
   * podmonitor and servicemonitor configs, and they will only discover endpoints within their
   * current namespace. Defaults to false.
   *
   * @return ignoreNamespaceSelectors
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "IgnoreNamespaceSelectors if set to true will ignore NamespaceSelector settings from the podmonitor and servicemonitor configs, and they will only discover endpoints within their current namespace.  Defaults to false.")
  public Boolean getIgnoreNamespaceSelectors() {
    return ignoreNamespaceSelectors;
  }

  public void setIgnoreNamespaceSelectors(Boolean ignoreNamespaceSelectors) {
    this.ignoreNamespaceSelectors = ignoreNamespaceSelectors;
  }

  public V1PrometheusSpec image(String image) {

    this.image = image;
    return this;
  }

  /**
   * Image if specified has precedence over baseImage, tag and sha combinations. Specifying the
   * version is still necessary to ensure the Prometheus Operator knows what version of Prometheus
   * is being configured.
   *
   * @return image
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Image if specified has precedence over baseImage, tag and sha combinations. Specifying the version is still necessary to ensure the Prometheus Operator knows what version of Prometheus is being configured.")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public V1PrometheusSpec imagePullSecrets(
      List<V1ThanosRulerSpecImagePullSecrets> imagePullSecrets) {

    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public V1PrometheusSpec addImagePullSecretsItem(
      V1ThanosRulerSpecImagePullSecrets imagePullSecretsItem) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets = new ArrayList<V1ThanosRulerSpecImagePullSecrets>();
    }
    this.imagePullSecrets.add(imagePullSecretsItem);
    return this;
  }

  /**
   * An optional list of references to secrets in the same namespace to use for pulling prometheus
   * and alertmanager images from registries see
   * https://kubernetes.io/docs/user-guide/images#specifying-imagepullsecrets-on-a-pod
   *
   * @return imagePullSecrets
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "An optional list of references to secrets in the same namespace to use for pulling prometheus and alertmanager images from registries see https://kubernetes.io/docs/user-guide/images#specifying-imagepullsecrets-on-a-pod")
  public List<V1ThanosRulerSpecImagePullSecrets> getImagePullSecrets() {
    return imagePullSecrets;
  }

  public void setImagePullSecrets(List<V1ThanosRulerSpecImagePullSecrets> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }

  public V1PrometheusSpec initContainers(List<V1ThanosRulerSpecContainers> initContainers) {

    this.initContainers = initContainers;
    return this;
  }

  public V1PrometheusSpec addInitContainersItem(V1ThanosRulerSpecContainers initContainersItem) {
    if (this.initContainers == null) {
      this.initContainers = new ArrayList<V1ThanosRulerSpecContainers>();
    }
    this.initContainers.add(initContainersItem);
    return this;
  }

  /**
   * InitContainers allows adding initContainers to the pod definition. Those can be used to e.g.
   * fetch secrets for injection into the Prometheus configuration from external sources. Any errors
   * during the execution of an initContainer will lead to a restart of the Pod. More info:
   * https://kubernetes.io/docs/concepts/workloads/pods/init-containers/ Using initContainers for
   * any use case other then secret fetching is entirely outside the scope of what the maintainers
   * will support and by doing so, you accept that this behaviour may break at any time without
   * notice.
   *
   * @return initContainers
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "InitContainers allows adding initContainers to the pod definition. Those can be used to e.g. fetch secrets for injection into the Prometheus configuration from external sources. Any errors during the execution of an initContainer will lead to a restart of the Pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/ Using initContainers for any use case other then secret fetching is entirely outside the scope of what the maintainers will support and by doing so, you accept that this behaviour may break at any time without notice.")
  public List<V1ThanosRulerSpecContainers> getInitContainers() {
    return initContainers;
  }

  public void setInitContainers(List<V1ThanosRulerSpecContainers> initContainers) {
    this.initContainers = initContainers;
  }

  public V1PrometheusSpec listenLocal(Boolean listenLocal) {

    this.listenLocal = listenLocal;
    return this;
  }

  /**
   * ListenLocal makes the Prometheus server listen on loopback, so that it does not bind against
   * the Pod IP.
   *
   * @return listenLocal
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ListenLocal makes the Prometheus server listen on loopback, so that it does not bind against the Pod IP.")
  public Boolean getListenLocal() {
    return listenLocal;
  }

  public void setListenLocal(Boolean listenLocal) {
    this.listenLocal = listenLocal;
  }

  public V1PrometheusSpec logFormat(String logFormat) {

    this.logFormat = logFormat;
    return this;
  }

  /**
   * Log format for Prometheus to be configured with.
   *
   * @return logFormat
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Log format for Prometheus to be configured with.")
  public String getLogFormat() {
    return logFormat;
  }

  public void setLogFormat(String logFormat) {
    this.logFormat = logFormat;
  }

  public V1PrometheusSpec logLevel(String logLevel) {

    this.logLevel = logLevel;
    return this;
  }

  /**
   * Log level for Prometheus to be configured with.
   *
   * @return logLevel
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Log level for Prometheus to be configured with.")
  public String getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(String logLevel) {
    this.logLevel = logLevel;
  }

  public V1PrometheusSpec nodeSelector(Map<String, String> nodeSelector) {

    this.nodeSelector = nodeSelector;
    return this;
  }

  public V1PrometheusSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<String, String>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

  /**
   * Define which Nodes the Pods are scheduled on.
   *
   * @return nodeSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define which Nodes the Pods are scheduled on.")
  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }

  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }

  public V1PrometheusSpec overrideHonorLabels(Boolean overrideHonorLabels) {

    this.overrideHonorLabels = overrideHonorLabels;
    return this;
  }

  /**
   * OverrideHonorLabels if set to true overrides all user configured honor_labels. If HonorLabels
   * is set in ServiceMonitor or PodMonitor to true, this overrides honor_labels to false.
   *
   * @return overrideHonorLabels
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "OverrideHonorLabels if set to true overrides all user configured honor_labels. If HonorLabels is set in ServiceMonitor or PodMonitor to true, this overrides honor_labels to false.")
  public Boolean getOverrideHonorLabels() {
    return overrideHonorLabels;
  }

  public void setOverrideHonorLabels(Boolean overrideHonorLabels) {
    this.overrideHonorLabels = overrideHonorLabels;
  }

  public V1PrometheusSpec overrideHonorTimestamps(Boolean overrideHonorTimestamps) {

    this.overrideHonorTimestamps = overrideHonorTimestamps;
    return this;
  }

  /**
   * OverrideHonorTimestamps allows to globally enforce honoring timestamps in all scrape configs.
   *
   * @return overrideHonorTimestamps
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "OverrideHonorTimestamps allows to globally enforce honoring timestamps in all scrape configs.")
  public Boolean getOverrideHonorTimestamps() {
    return overrideHonorTimestamps;
  }

  public void setOverrideHonorTimestamps(Boolean overrideHonorTimestamps) {
    this.overrideHonorTimestamps = overrideHonorTimestamps;
  }

  public V1PrometheusSpec paused(Boolean paused) {

    this.paused = paused;
    return this;
  }

  /**
   * When a Prometheus deployment is paused, no actions except for deletion will be performed on the
   * underlying objects.
   *
   * @return paused
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "When a Prometheus deployment is paused, no actions except for deletion will be performed on the underlying objects.")
  public Boolean getPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public V1PrometheusSpec podMetadata(V1PrometheusSpecPodMetadata podMetadata) {

    this.podMetadata = podMetadata;
    return this;
  }

  /**
   * Get podMetadata
   *
   * @return podMetadata
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecPodMetadata getPodMetadata() {
    return podMetadata;
  }

  public void setPodMetadata(V1PrometheusSpecPodMetadata podMetadata) {
    this.podMetadata = podMetadata;
  }

  public V1PrometheusSpec podMonitorNamespaceSelector(
      V1PrometheusSpecPodMonitorNamespaceSelector podMonitorNamespaceSelector) {

    this.podMonitorNamespaceSelector = podMonitorNamespaceSelector;
    return this;
  }

  /**
   * Get podMonitorNamespaceSelector
   *
   * @return podMonitorNamespaceSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecPodMonitorNamespaceSelector getPodMonitorNamespaceSelector() {
    return podMonitorNamespaceSelector;
  }

  public void setPodMonitorNamespaceSelector(
      V1PrometheusSpecPodMonitorNamespaceSelector podMonitorNamespaceSelector) {
    this.podMonitorNamespaceSelector = podMonitorNamespaceSelector;
  }

  public V1PrometheusSpec podMonitorSelector(
      V1PrometheusSpecPodMonitorSelector podMonitorSelector) {

    this.podMonitorSelector = podMonitorSelector;
    return this;
  }

  /**
   * Get podMonitorSelector
   *
   * @return podMonitorSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecPodMonitorSelector getPodMonitorSelector() {
    return podMonitorSelector;
  }

  public void setPodMonitorSelector(V1PrometheusSpecPodMonitorSelector podMonitorSelector) {
    this.podMonitorSelector = podMonitorSelector;
  }

  public V1PrometheusSpec portName(String portName) {

    this.portName = portName;
    return this;
  }

  /**
   * Port name used for the pods and governing service. This defaults to web
   *
   * @return portName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Port name used for the pods and governing service. This defaults to web")
  public String getPortName() {
    return portName;
  }

  public void setPortName(String portName) {
    this.portName = portName;
  }

  public V1PrometheusSpec priorityClassName(String priorityClassName) {

    this.priorityClassName = priorityClassName;
    return this;
  }

  /**
   * Priority class assigned to the Pods
   *
   * @return priorityClassName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Priority class assigned to the Pods")
  public String getPriorityClassName() {
    return priorityClassName;
  }

  public void setPriorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
  }

  public V1PrometheusSpec prometheusExternalLabelName(String prometheusExternalLabelName) {

    this.prometheusExternalLabelName = prometheusExternalLabelName;
    return this;
  }

  /**
   * Name of Prometheus external label used to denote Prometheus instance name. Defaults to the
   * value of &#x60;prometheus&#x60;. External label will _not_ be added when value is set to empty
   * string (&#x60;\&quot;\&quot;&#x60;).
   *
   * @return prometheusExternalLabelName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Name of Prometheus external label used to denote Prometheus instance name. Defaults to the value of `prometheus`. External label will _not_ be added when value is set to empty string (`\"\"`).")
  public String getPrometheusExternalLabelName() {
    return prometheusExternalLabelName;
  }

  public void setPrometheusExternalLabelName(String prometheusExternalLabelName) {
    this.prometheusExternalLabelName = prometheusExternalLabelName;
  }

  public V1PrometheusSpec query(V1PrometheusSpecQuery query) {

    this.query = query;
    return this;
  }

  /**
   * Get query
   *
   * @return query
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecQuery getQuery() {
    return query;
  }

  public void setQuery(V1PrometheusSpecQuery query) {
    this.query = query;
  }

  public V1PrometheusSpec remoteRead(List<V1PrometheusSpecRemoteRead> remoteRead) {

    this.remoteRead = remoteRead;
    return this;
  }

  public V1PrometheusSpec addRemoteReadItem(V1PrometheusSpecRemoteRead remoteReadItem) {
    if (this.remoteRead == null) {
      this.remoteRead = new ArrayList<V1PrometheusSpecRemoteRead>();
    }
    this.remoteRead.add(remoteReadItem);
    return this;
  }

  /**
   * If specified, the remote_read spec. This is an experimental feature, it may change in any
   * upcoming release in a breaking way.
   *
   * @return remoteRead
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If specified, the remote_read spec. This is an experimental feature, it may change in any upcoming release in a breaking way.")
  public List<V1PrometheusSpecRemoteRead> getRemoteRead() {
    return remoteRead;
  }

  public void setRemoteRead(List<V1PrometheusSpecRemoteRead> remoteRead) {
    this.remoteRead = remoteRead;
  }

  public V1PrometheusSpec remoteWrite(List<V1PrometheusSpecRemoteWrite> remoteWrite) {

    this.remoteWrite = remoteWrite;
    return this;
  }

  public V1PrometheusSpec addRemoteWriteItem(V1PrometheusSpecRemoteWrite remoteWriteItem) {
    if (this.remoteWrite == null) {
      this.remoteWrite = new ArrayList<V1PrometheusSpecRemoteWrite>();
    }
    this.remoteWrite.add(remoteWriteItem);
    return this;
  }

  /**
   * If specified, the remote_write spec. This is an experimental feature, it may change in any
   * upcoming release in a breaking way.
   *
   * @return remoteWrite
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If specified, the remote_write spec. This is an experimental feature, it may change in any upcoming release in a breaking way.")
  public List<V1PrometheusSpecRemoteWrite> getRemoteWrite() {
    return remoteWrite;
  }

  public void setRemoteWrite(List<V1PrometheusSpecRemoteWrite> remoteWrite) {
    this.remoteWrite = remoteWrite;
  }

  public V1PrometheusSpec replicaExternalLabelName(String replicaExternalLabelName) {

    this.replicaExternalLabelName = replicaExternalLabelName;
    return this;
  }

  /**
   * Name of Prometheus external label used to denote replica name. Defaults to the value of
   * &#x60;prometheus_replica&#x60;. External label will _not_ be added when value is set to empty
   * string (&#x60;\&quot;\&quot;&#x60;).
   *
   * @return replicaExternalLabelName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Name of Prometheus external label used to denote replica name. Defaults to the value of `prometheus_replica`. External label will _not_ be added when value is set to empty string (`\"\"`).")
  public String getReplicaExternalLabelName() {
    return replicaExternalLabelName;
  }

  public void setReplicaExternalLabelName(String replicaExternalLabelName) {
    this.replicaExternalLabelName = replicaExternalLabelName;
  }

  public V1PrometheusSpec replicas(Integer replicas) {

    this.replicas = replicas;
    return this;
  }

  /**
   * Number of instances to deploy for a Prometheus deployment.
   *
   * @return replicas
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of instances to deploy for a Prometheus deployment.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public V1PrometheusSpec resources(V1AlertmanagerSpecResources resources) {

    this.resources = resources;
    return this;
  }

  /**
   * Get resources
   *
   * @return resources
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1AlertmanagerSpecResources getResources() {
    return resources;
  }

  public void setResources(V1AlertmanagerSpecResources resources) {
    this.resources = resources;
  }

  public V1PrometheusSpec retention(String retention) {

    this.retention = retention;
    return this;
  }

  /**
   * Time duration Prometheus shall retain data for. Default is &#39;24h&#39;, and must match the
   * regular expression &#x60;[0-9]+(ms|s|m|h|d|w|y)&#x60; (milliseconds seconds minutes hours days
   * weeks years).
   *
   * @return retention
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Time duration Prometheus shall retain data for. Default is '24h', and must match the regular expression `[0-9]+(ms|s|m|h|d|w|y)` (milliseconds seconds minutes hours days weeks years).")
  public String getRetention() {
    return retention;
  }

  public void setRetention(String retention) {
    this.retention = retention;
  }

  public V1PrometheusSpec retentionSize(String retentionSize) {

    this.retentionSize = retentionSize;
    return this;
  }

  /**
   * Maximum amount of disk space used by blocks.
   *
   * @return retentionSize
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum amount of disk space used by blocks.")
  public String getRetentionSize() {
    return retentionSize;
  }

  public void setRetentionSize(String retentionSize) {
    this.retentionSize = retentionSize;
  }

  public V1PrometheusSpec routePrefix(String routePrefix) {

    this.routePrefix = routePrefix;
    return this;
  }

  /**
   * The route prefix Prometheus registers HTTP handlers for. This is useful, if using ExternalURL
   * and a proxy is rewriting HTTP routes of a request, and the actual ExternalURL is still true,
   * but the server serves requests under a different route prefix. For example for use with
   * &#x60;kubectl proxy&#x60;.
   *
   * @return routePrefix
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The route prefix Prometheus registers HTTP handlers for. This is useful, if using ExternalURL and a proxy is rewriting HTTP routes of a request, and the actual ExternalURL is still true, but the server serves requests under a different route prefix. For example for use with `kubectl proxy`.")
  public String getRoutePrefix() {
    return routePrefix;
  }

  public void setRoutePrefix(String routePrefix) {
    this.routePrefix = routePrefix;
  }

  public V1PrometheusSpec ruleNamespaceSelector(
      V1PrometheusSpecRuleNamespaceSelector ruleNamespaceSelector) {

    this.ruleNamespaceSelector = ruleNamespaceSelector;
    return this;
  }

  /**
   * Get ruleNamespaceSelector
   *
   * @return ruleNamespaceSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecRuleNamespaceSelector getRuleNamespaceSelector() {
    return ruleNamespaceSelector;
  }

  public void setRuleNamespaceSelector(
      V1PrometheusSpecRuleNamespaceSelector ruleNamespaceSelector) {
    this.ruleNamespaceSelector = ruleNamespaceSelector;
  }

  public V1PrometheusSpec ruleSelector(V1PrometheusSpecRuleSelector ruleSelector) {

    this.ruleSelector = ruleSelector;
    return this;
  }

  /**
   * Get ruleSelector
   *
   * @return ruleSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecRuleSelector getRuleSelector() {
    return ruleSelector;
  }

  public void setRuleSelector(V1PrometheusSpecRuleSelector ruleSelector) {
    this.ruleSelector = ruleSelector;
  }

  public V1PrometheusSpec rules(V1PrometheusSpecRules rules) {

    this.rules = rules;
    return this;
  }

  /**
   * Get rules
   *
   * @return rules
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecRules getRules() {
    return rules;
  }

  public void setRules(V1PrometheusSpecRules rules) {
    this.rules = rules;
  }

  public V1PrometheusSpec scrapeInterval(String scrapeInterval) {

    this.scrapeInterval = scrapeInterval;
    return this;
  }

  /**
   * Interval between consecutive scrapes.
   *
   * @return scrapeInterval
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Interval between consecutive scrapes.")
  public String getScrapeInterval() {
    return scrapeInterval;
  }

  public void setScrapeInterval(String scrapeInterval) {
    this.scrapeInterval = scrapeInterval;
  }

  public V1PrometheusSpec secrets(List<String> secrets) {

    this.secrets = secrets;
    return this;
  }

  public V1PrometheusSpec addSecretsItem(String secretsItem) {
    if (this.secrets == null) {
      this.secrets = new ArrayList<String>();
    }
    this.secrets.add(secretsItem);
    return this;
  }

  /**
   * Secrets is a list of Secrets in the same namespace as the Prometheus object, which shall be
   * mounted into the Prometheus Pods. The Secrets are mounted into
   * /etc/prometheus/secrets/&lt;secret-name&gt;.
   *
   * @return secrets
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Secrets is a list of Secrets in the same namespace as the Prometheus object, which shall be mounted into the Prometheus Pods. The Secrets are mounted into /etc/prometheus/secrets/<secret-name>.")
  public List<String> getSecrets() {
    return secrets;
  }

  public void setSecrets(List<String> secrets) {
    this.secrets = secrets;
  }

  public V1PrometheusSpec securityContext(V1ThanosRulerSpecSecurityContext1 securityContext) {

    this.securityContext = securityContext;
    return this;
  }

  /**
   * Get securityContext
   *
   * @return securityContext
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecSecurityContext1 getSecurityContext() {
    return securityContext;
  }

  public void setSecurityContext(V1ThanosRulerSpecSecurityContext1 securityContext) {
    this.securityContext = securityContext;
  }

  public V1PrometheusSpec serviceAccountName(String serviceAccountName) {

    this.serviceAccountName = serviceAccountName;
    return this;
  }

  /**
   * ServiceAccountName is the name of the ServiceAccount to use to run the Prometheus Pods.
   *
   * @return serviceAccountName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ServiceAccountName is the name of the ServiceAccount to use to run the Prometheus Pods.")
  public String getServiceAccountName() {
    return serviceAccountName;
  }

  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }

  public V1PrometheusSpec serviceMonitorNamespaceSelector(
      V1PrometheusSpecServiceMonitorNamespaceSelector serviceMonitorNamespaceSelector) {

    this.serviceMonitorNamespaceSelector = serviceMonitorNamespaceSelector;
    return this;
  }

  /**
   * Get serviceMonitorNamespaceSelector
   *
   * @return serviceMonitorNamespaceSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecServiceMonitorNamespaceSelector getServiceMonitorNamespaceSelector() {
    return serviceMonitorNamespaceSelector;
  }

  public void setServiceMonitorNamespaceSelector(
      V1PrometheusSpecServiceMonitorNamespaceSelector serviceMonitorNamespaceSelector) {
    this.serviceMonitorNamespaceSelector = serviceMonitorNamespaceSelector;
  }

  public V1PrometheusSpec serviceMonitorSelector(
      V1PrometheusSpecServiceMonitorSelector serviceMonitorSelector) {

    this.serviceMonitorSelector = serviceMonitorSelector;
    return this;
  }

  /**
   * Get serviceMonitorSelector
   *
   * @return serviceMonitorSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecServiceMonitorSelector getServiceMonitorSelector() {
    return serviceMonitorSelector;
  }

  public void setServiceMonitorSelector(
      V1PrometheusSpecServiceMonitorSelector serviceMonitorSelector) {
    this.serviceMonitorSelector = serviceMonitorSelector;
  }

  public V1PrometheusSpec sha(String sha) {

    this.sha = sha;
    return this;
  }

  /**
   * SHA of Prometheus container image to be deployed. Defaults to the value of &#x60;version&#x60;.
   * Similar to a tag, but the SHA explicitly deploys an immutable container image. Version and Tag
   * are ignored if SHA is set.
   *
   * @return sha
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "SHA of Prometheus container image to be deployed. Defaults to the value of `version`. Similar to a tag, but the SHA explicitly deploys an immutable container image. Version and Tag are ignored if SHA is set.")
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }

  public V1PrometheusSpec storage(V1ThanosRulerSpecStorage storage) {

    this.storage = storage;
    return this;
  }

  /**
   * Get storage
   *
   * @return storage
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecStorage getStorage() {
    return storage;
  }

  public void setStorage(V1ThanosRulerSpecStorage storage) {
    this.storage = storage;
  }

  public V1PrometheusSpec tag(String tag) {

    this.tag = tag;
    return this;
  }

  /**
   * Tag of Prometheus container image to be deployed. Defaults to the value of &#x60;version&#x60;.
   * Version is ignored if Tag is set.
   *
   * @return tag
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Tag of Prometheus container image to be deployed. Defaults to the value of `version`. Version is ignored if Tag is set.")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public V1PrometheusSpec thanos(V1PrometheusSpecThanos thanos) {

    this.thanos = thanos;
    return this;
  }

  /**
   * Get thanos
   *
   * @return thanos
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecThanos getThanos() {
    return thanos;
  }

  public void setThanos(V1PrometheusSpecThanos thanos) {
    this.thanos = thanos;
  }

  public V1PrometheusSpec tolerations(List<V1ThanosRulerSpecTolerations> tolerations) {

    this.tolerations = tolerations;
    return this;
  }

  public V1PrometheusSpec addTolerationsItem(V1ThanosRulerSpecTolerations tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<V1ThanosRulerSpecTolerations>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

  /**
   * If specified, the pod&#39;s tolerations.
   *
   * @return tolerations
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the pod's tolerations.")
  public List<V1ThanosRulerSpecTolerations> getTolerations() {
    return tolerations;
  }

  public void setTolerations(List<V1ThanosRulerSpecTolerations> tolerations) {
    this.tolerations = tolerations;
  }

  public V1PrometheusSpec version(String version) {

    this.version = version;
    return this;
  }

  /**
   * Version of Prometheus to be deployed.
   *
   * @return version
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version of Prometheus to be deployed.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public V1PrometheusSpec volumeMounts(List<V1ThanosRulerSpecVolumeMounts> volumeMounts) {

    this.volumeMounts = volumeMounts;
    return this;
  }

  public V1PrometheusSpec addVolumeMountsItem(V1ThanosRulerSpecVolumeMounts volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<V1ThanosRulerSpecVolumeMounts>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

  /**
   * VolumeMounts allows configuration of additional VolumeMounts on the output StatefulSet
   * definition. VolumeMounts specified will be appended to other VolumeMounts in the prometheus
   * container, that are generated as a result of StorageSpec objects.
   *
   * @return volumeMounts
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "VolumeMounts allows configuration of additional VolumeMounts on the output StatefulSet definition. VolumeMounts specified will be appended to other VolumeMounts in the prometheus container, that are generated as a result of StorageSpec objects.")
  public List<V1ThanosRulerSpecVolumeMounts> getVolumeMounts() {
    return volumeMounts;
  }

  public void setVolumeMounts(List<V1ThanosRulerSpecVolumeMounts> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }

  public V1PrometheusSpec volumes(List<V1ThanosRulerSpecVolumes> volumes) {

    this.volumes = volumes;
    return this;
  }

  public V1PrometheusSpec addVolumesItem(V1ThanosRulerSpecVolumes volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<V1ThanosRulerSpecVolumes>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

  /**
   * Volumes allows configuration of additional volumes on the output StatefulSet definition.
   * Volumes specified will be appended to other volumes that are generated as a result of
   * StorageSpec objects.
   *
   * @return volumes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Volumes allows configuration of additional volumes on the output StatefulSet definition. Volumes specified will be appended to other volumes that are generated as a result of StorageSpec objects.")
  public List<V1ThanosRulerSpecVolumes> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<V1ThanosRulerSpecVolumes> volumes) {
    this.volumes = volumes;
  }

  public V1PrometheusSpec walCompression(Boolean walCompression) {

    this.walCompression = walCompression;
    return this;
  }

  /**
   * Enable compression of the write-ahead log using Snappy. This flag is only available in versions
   * of Prometheus &gt;&#x3D; 2.11.0.
   *
   * @return walCompression
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Enable compression of the write-ahead log using Snappy. This flag is only available in versions of Prometheus >= 2.11.0.")
  public Boolean getWalCompression() {
    return walCompression;
  }

  public void setWalCompression(Boolean walCompression) {
    this.walCompression = walCompression;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PrometheusSpec v1PrometheusSpec = (V1PrometheusSpec) o;
    return Objects.equals(
            this.additionalAlertManagerConfigs, v1PrometheusSpec.additionalAlertManagerConfigs)
        && Objects.equals(
            this.additionalAlertRelabelConfigs, v1PrometheusSpec.additionalAlertRelabelConfigs)
        && Objects.equals(this.additionalScrapeConfigs, v1PrometheusSpec.additionalScrapeConfigs)
        && Objects.equals(this.affinity, v1PrometheusSpec.affinity)
        && Objects.equals(this.alerting, v1PrometheusSpec.alerting)
        && Objects.equals(this.apiserverConfig, v1PrometheusSpec.apiserverConfig)
        && Objects.equals(
            this.arbitraryFSAccessThroughSMs, v1PrometheusSpec.arbitraryFSAccessThroughSMs)
        && Objects.equals(this.baseImage, v1PrometheusSpec.baseImage)
        && Objects.equals(this.configMaps, v1PrometheusSpec.configMaps)
        && Objects.equals(this.containers, v1PrometheusSpec.containers)
        && Objects.equals(this.disableCompaction, v1PrometheusSpec.disableCompaction)
        && Objects.equals(this.enableAdminAPI, v1PrometheusSpec.enableAdminAPI)
        && Objects.equals(this.enforcedNamespaceLabel, v1PrometheusSpec.enforcedNamespaceLabel)
        && Objects.equals(this.evaluationInterval, v1PrometheusSpec.evaluationInterval)
        && Objects.equals(this.externalLabels, v1PrometheusSpec.externalLabels)
        && Objects.equals(this.externalUrl, v1PrometheusSpec.externalUrl)
        && Objects.equals(this.ignoreNamespaceSelectors, v1PrometheusSpec.ignoreNamespaceSelectors)
        && Objects.equals(this.image, v1PrometheusSpec.image)
        && Objects.equals(this.imagePullSecrets, v1PrometheusSpec.imagePullSecrets)
        && Objects.equals(this.initContainers, v1PrometheusSpec.initContainers)
        && Objects.equals(this.listenLocal, v1PrometheusSpec.listenLocal)
        && Objects.equals(this.logFormat, v1PrometheusSpec.logFormat)
        && Objects.equals(this.logLevel, v1PrometheusSpec.logLevel)
        && Objects.equals(this.nodeSelector, v1PrometheusSpec.nodeSelector)
        && Objects.equals(this.overrideHonorLabels, v1PrometheusSpec.overrideHonorLabels)
        && Objects.equals(this.overrideHonorTimestamps, v1PrometheusSpec.overrideHonorTimestamps)
        && Objects.equals(this.paused, v1PrometheusSpec.paused)
        && Objects.equals(this.podMetadata, v1PrometheusSpec.podMetadata)
        && Objects.equals(
            this.podMonitorNamespaceSelector, v1PrometheusSpec.podMonitorNamespaceSelector)
        && Objects.equals(this.podMonitorSelector, v1PrometheusSpec.podMonitorSelector)
        && Objects.equals(this.portName, v1PrometheusSpec.portName)
        && Objects.equals(this.priorityClassName, v1PrometheusSpec.priorityClassName)
        && Objects.equals(
            this.prometheusExternalLabelName, v1PrometheusSpec.prometheusExternalLabelName)
        && Objects.equals(this.query, v1PrometheusSpec.query)
        && Objects.equals(this.remoteRead, v1PrometheusSpec.remoteRead)
        && Objects.equals(this.remoteWrite, v1PrometheusSpec.remoteWrite)
        && Objects.equals(this.replicaExternalLabelName, v1PrometheusSpec.replicaExternalLabelName)
        && Objects.equals(this.replicas, v1PrometheusSpec.replicas)
        && Objects.equals(this.resources, v1PrometheusSpec.resources)
        && Objects.equals(this.retention, v1PrometheusSpec.retention)
        && Objects.equals(this.retentionSize, v1PrometheusSpec.retentionSize)
        && Objects.equals(this.routePrefix, v1PrometheusSpec.routePrefix)
        && Objects.equals(this.ruleNamespaceSelector, v1PrometheusSpec.ruleNamespaceSelector)
        && Objects.equals(this.ruleSelector, v1PrometheusSpec.ruleSelector)
        && Objects.equals(this.rules, v1PrometheusSpec.rules)
        && Objects.equals(this.scrapeInterval, v1PrometheusSpec.scrapeInterval)
        && Objects.equals(this.secrets, v1PrometheusSpec.secrets)
        && Objects.equals(this.securityContext, v1PrometheusSpec.securityContext)
        && Objects.equals(this.serviceAccountName, v1PrometheusSpec.serviceAccountName)
        && Objects.equals(
            this.serviceMonitorNamespaceSelector, v1PrometheusSpec.serviceMonitorNamespaceSelector)
        && Objects.equals(this.serviceMonitorSelector, v1PrometheusSpec.serviceMonitorSelector)
        && Objects.equals(this.sha, v1PrometheusSpec.sha)
        && Objects.equals(this.storage, v1PrometheusSpec.storage)
        && Objects.equals(this.tag, v1PrometheusSpec.tag)
        && Objects.equals(this.thanos, v1PrometheusSpec.thanos)
        && Objects.equals(this.tolerations, v1PrometheusSpec.tolerations)
        && Objects.equals(this.version, v1PrometheusSpec.version)
        && Objects.equals(this.volumeMounts, v1PrometheusSpec.volumeMounts)
        && Objects.equals(this.volumes, v1PrometheusSpec.volumes)
        && Objects.equals(this.walCompression, v1PrometheusSpec.walCompression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        additionalAlertManagerConfigs,
        additionalAlertRelabelConfigs,
        additionalScrapeConfigs,
        affinity,
        alerting,
        apiserverConfig,
        arbitraryFSAccessThroughSMs,
        baseImage,
        configMaps,
        containers,
        disableCompaction,
        enableAdminAPI,
        enforcedNamespaceLabel,
        evaluationInterval,
        externalLabels,
        externalUrl,
        ignoreNamespaceSelectors,
        image,
        imagePullSecrets,
        initContainers,
        listenLocal,
        logFormat,
        logLevel,
        nodeSelector,
        overrideHonorLabels,
        overrideHonorTimestamps,
        paused,
        podMetadata,
        podMonitorNamespaceSelector,
        podMonitorSelector,
        portName,
        priorityClassName,
        prometheusExternalLabelName,
        query,
        remoteRead,
        remoteWrite,
        replicaExternalLabelName,
        replicas,
        resources,
        retention,
        retentionSize,
        routePrefix,
        ruleNamespaceSelector,
        ruleSelector,
        rules,
        scrapeInterval,
        secrets,
        securityContext,
        serviceAccountName,
        serviceMonitorNamespaceSelector,
        serviceMonitorSelector,
        sha,
        storage,
        tag,
        thanos,
        tolerations,
        version,
        volumeMounts,
        volumes,
        walCompression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusSpec {\n");
    sb.append("    additionalAlertManagerConfigs: ")
        .append(toIndentedString(additionalAlertManagerConfigs))
        .append("\n");
    sb.append("    additionalAlertRelabelConfigs: ")
        .append(toIndentedString(additionalAlertRelabelConfigs))
        .append("\n");
    sb.append("    additionalScrapeConfigs: ")
        .append(toIndentedString(additionalScrapeConfigs))
        .append("\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    alerting: ").append(toIndentedString(alerting)).append("\n");
    sb.append("    apiserverConfig: ").append(toIndentedString(apiserverConfig)).append("\n");
    sb.append("    arbitraryFSAccessThroughSMs: ")
        .append(toIndentedString(arbitraryFSAccessThroughSMs))
        .append("\n");
    sb.append("    baseImage: ").append(toIndentedString(baseImage)).append("\n");
    sb.append("    configMaps: ").append(toIndentedString(configMaps)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    disableCompaction: ").append(toIndentedString(disableCompaction)).append("\n");
    sb.append("    enableAdminAPI: ").append(toIndentedString(enableAdminAPI)).append("\n");
    sb.append("    enforcedNamespaceLabel: ")
        .append(toIndentedString(enforcedNamespaceLabel))
        .append("\n");
    sb.append("    evaluationInterval: ").append(toIndentedString(evaluationInterval)).append("\n");
    sb.append("    externalLabels: ").append(toIndentedString(externalLabels)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    ignoreNamespaceSelectors: ")
        .append(toIndentedString(ignoreNamespaceSelectors))
        .append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    listenLocal: ").append(toIndentedString(listenLocal)).append("\n");
    sb.append("    logFormat: ").append(toIndentedString(logFormat)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    overrideHonorLabels: ")
        .append(toIndentedString(overrideHonorLabels))
        .append("\n");
    sb.append("    overrideHonorTimestamps: ")
        .append(toIndentedString(overrideHonorTimestamps))
        .append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    podMetadata: ").append(toIndentedString(podMetadata)).append("\n");
    sb.append("    podMonitorNamespaceSelector: ")
        .append(toIndentedString(podMonitorNamespaceSelector))
        .append("\n");
    sb.append("    podMonitorSelector: ").append(toIndentedString(podMonitorSelector)).append("\n");
    sb.append("    portName: ").append(toIndentedString(portName)).append("\n");
    sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
    sb.append("    prometheusExternalLabelName: ")
        .append(toIndentedString(prometheusExternalLabelName))
        .append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    remoteRead: ").append(toIndentedString(remoteRead)).append("\n");
    sb.append("    remoteWrite: ").append(toIndentedString(remoteWrite)).append("\n");
    sb.append("    replicaExternalLabelName: ")
        .append(toIndentedString(replicaExternalLabelName))
        .append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
    sb.append("    retentionSize: ").append(toIndentedString(retentionSize)).append("\n");
    sb.append("    routePrefix: ").append(toIndentedString(routePrefix)).append("\n");
    sb.append("    ruleNamespaceSelector: ")
        .append(toIndentedString(ruleNamespaceSelector))
        .append("\n");
    sb.append("    ruleSelector: ").append(toIndentedString(ruleSelector)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    scrapeInterval: ").append(toIndentedString(scrapeInterval)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    serviceMonitorNamespaceSelector: ")
        .append(toIndentedString(serviceMonitorNamespaceSelector))
        .append("\n");
    sb.append("    serviceMonitorSelector: ")
        .append(toIndentedString(serviceMonitorSelector))
        .append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    thanos: ").append(toIndentedString(thanos)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    walCompression: ").append(toIndentedString(walCompression)).append("\n");
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
