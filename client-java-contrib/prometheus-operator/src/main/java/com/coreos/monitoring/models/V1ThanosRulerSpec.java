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
 * Specification of the desired behavior of the ThanosRuler cluster. More info:
 * https://github.com/kubernetes/community/blob/master/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
 */
@ApiModel(
    description =
        "Specification of the desired behavior of the ThanosRuler cluster. More info: https://github.com/kubernetes/community/blob/master/contributors/devel/sig-architecture/api-conventions.md#spec-and-status")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpec {
  public static final String SERIALIZED_NAME_AFFINITY = "affinity";

  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private V1ThanosRulerSpecAffinity affinity;

  public static final String SERIALIZED_NAME_ALERT_DROP_LABELS = "alertDropLabels";

  @SerializedName(SERIALIZED_NAME_ALERT_DROP_LABELS)
  private List<String> alertDropLabels = null;

  public static final String SERIALIZED_NAME_ALERT_QUERY_URL = "alertQueryUrl";

  @SerializedName(SERIALIZED_NAME_ALERT_QUERY_URL)
  private String alertQueryUrl;

  public static final String SERIALIZED_NAME_ALERTMANAGERS_CONFIG = "alertmanagersConfig";

  @SerializedName(SERIALIZED_NAME_ALERTMANAGERS_CONFIG)
  private V1ThanosRulerSpecAlertmanagersConfig alertmanagersConfig;

  public static final String SERIALIZED_NAME_ALERTMANAGERS_URL = "alertmanagersUrl";

  @SerializedName(SERIALIZED_NAME_ALERTMANAGERS_URL)
  private List<String> alertmanagersUrl = null;

  public static final String SERIALIZED_NAME_CONTAINERS = "containers";

  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private List<V1ThanosRulerSpecContainers> containers = null;

  public static final String SERIALIZED_NAME_ENFORCED_NAMESPACE_LABEL = "enforcedNamespaceLabel";

  @SerializedName(SERIALIZED_NAME_ENFORCED_NAMESPACE_LABEL)
  private String enforcedNamespaceLabel;

  public static final String SERIALIZED_NAME_EVALUATION_INTERVAL = "evaluationInterval";

  @SerializedName(SERIALIZED_NAME_EVALUATION_INTERVAL)
  private String evaluationInterval;

  public static final String SERIALIZED_NAME_EXTERNAL_PREFIX = "externalPrefix";

  @SerializedName(SERIALIZED_NAME_EXTERNAL_PREFIX)
  private String externalPrefix;

  public static final String SERIALIZED_NAME_GRPC_SERVER_TLS_CONFIG = "grpcServerTlsConfig";

  @SerializedName(SERIALIZED_NAME_GRPC_SERVER_TLS_CONFIG)
  private V1ThanosRulerSpecGrpcServerTlsConfig grpcServerTlsConfig;

  public static final String SERIALIZED_NAME_IMAGE = "image";

  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_PULL_SECRETS = "imagePullSecrets";

  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_SECRETS)
  private List<V1ThanosRulerSpecImagePullSecrets> imagePullSecrets = null;

  public static final String SERIALIZED_NAME_INIT_CONTAINERS = "initContainers";

  @SerializedName(SERIALIZED_NAME_INIT_CONTAINERS)
  private List<V1ThanosRulerSpecContainers> initContainers = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";

  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;

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

  public static final String SERIALIZED_NAME_OBJECT_STORAGE_CONFIG = "objectStorageConfig";

  @SerializedName(SERIALIZED_NAME_OBJECT_STORAGE_CONFIG)
  private V1ThanosRulerSpecObjectStorageConfig objectStorageConfig;

  public static final String SERIALIZED_NAME_PAUSED = "paused";

  @SerializedName(SERIALIZED_NAME_PAUSED)
  private Boolean paused;

  public static final String SERIALIZED_NAME_POD_METADATA = "podMetadata";

  @SerializedName(SERIALIZED_NAME_POD_METADATA)
  private V1ThanosRulerSpecPodMetadata podMetadata;

  public static final String SERIALIZED_NAME_PORT_NAME = "portName";

  @SerializedName(SERIALIZED_NAME_PORT_NAME)
  private String portName;

  public static final String SERIALIZED_NAME_PRIORITY_CLASS_NAME = "priorityClassName";

  @SerializedName(SERIALIZED_NAME_PRIORITY_CLASS_NAME)
  private String priorityClassName;

  public static final String SERIALIZED_NAME_QUERY_CONFIG = "queryConfig";

  @SerializedName(SERIALIZED_NAME_QUERY_CONFIG)
  private V1ThanosRulerSpecQueryConfig queryConfig;

  public static final String SERIALIZED_NAME_QUERY_ENDPOINTS = "queryEndpoints";

  @SerializedName(SERIALIZED_NAME_QUERY_ENDPOINTS)
  private List<String> queryEndpoints = null;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";

  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";

  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1ThanosRulerSpecResources1 resources;

  public static final String SERIALIZED_NAME_RETENTION = "retention";

  @SerializedName(SERIALIZED_NAME_RETENTION)
  private String retention;

  public static final String SERIALIZED_NAME_ROUTE_PREFIX = "routePrefix";

  @SerializedName(SERIALIZED_NAME_ROUTE_PREFIX)
  private String routePrefix;

  public static final String SERIALIZED_NAME_RULE_NAMESPACE_SELECTOR = "ruleNamespaceSelector";

  @SerializedName(SERIALIZED_NAME_RULE_NAMESPACE_SELECTOR)
  private V1ThanosRulerSpecRuleNamespaceSelector ruleNamespaceSelector;

  public static final String SERIALIZED_NAME_RULE_SELECTOR = "ruleSelector";

  @SerializedName(SERIALIZED_NAME_RULE_SELECTOR)
  private V1ThanosRulerSpecRuleSelector ruleSelector;

  public static final String SERIALIZED_NAME_SECURITY_CONTEXT = "securityContext";

  @SerializedName(SERIALIZED_NAME_SECURITY_CONTEXT)
  private V1ThanosRulerSpecSecurityContext1 securityContext;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_NAME = "serviceAccountName";

  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_NAME)
  private String serviceAccountName;

  public static final String SERIALIZED_NAME_STORAGE = "storage";

  @SerializedName(SERIALIZED_NAME_STORAGE)
  private V1ThanosRulerSpecStorage storage;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";

  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private List<V1ThanosRulerSpecTolerations> tolerations = null;

  public static final String SERIALIZED_NAME_TRACING_CONFIG = "tracingConfig";

  @SerializedName(SERIALIZED_NAME_TRACING_CONFIG)
  private V1ThanosRulerSpecTracingConfig tracingConfig;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";

  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<V1ThanosRulerSpecVolumes> volumes = null;

  public V1ThanosRulerSpec affinity(V1ThanosRulerSpecAffinity affinity) {

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

  public V1ThanosRulerSpec alertDropLabels(List<String> alertDropLabels) {

    this.alertDropLabels = alertDropLabels;
    return this;
  }

  public V1ThanosRulerSpec addAlertDropLabelsItem(String alertDropLabelsItem) {
    if (this.alertDropLabels == null) {
      this.alertDropLabels = new ArrayList<String>();
    }
    this.alertDropLabels.add(alertDropLabelsItem);
    return this;
  }

  /**
   * AlertDropLabels configure the label names which should be dropped in ThanosRuler alerts. If
   * &#x60;labels&#x60; field is not provided, &#x60;thanos_ruler_replica&#x60; will be dropped in
   * alerts by default.
   *
   * @return alertDropLabels
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "AlertDropLabels configure the label names which should be dropped in ThanosRuler alerts. If `labels` field is not provided, `thanos_ruler_replica` will be dropped in alerts by default.")
  public List<String> getAlertDropLabels() {
    return alertDropLabels;
  }

  public void setAlertDropLabels(List<String> alertDropLabels) {
    this.alertDropLabels = alertDropLabels;
  }

  public V1ThanosRulerSpec alertQueryUrl(String alertQueryUrl) {

    this.alertQueryUrl = alertQueryUrl;
    return this;
  }

  /**
   * The external Query URL the Thanos Ruler will set in the &#39;Source&#39; field of all alerts.
   * Maps to the &#39;--alert.query-url&#39; CLI arg.
   *
   * @return alertQueryUrl
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The external Query URL the Thanos Ruler will set in the 'Source' field of all alerts. Maps to the '--alert.query-url' CLI arg.")
  public String getAlertQueryUrl() {
    return alertQueryUrl;
  }

  public void setAlertQueryUrl(String alertQueryUrl) {
    this.alertQueryUrl = alertQueryUrl;
  }

  public V1ThanosRulerSpec alertmanagersConfig(
      V1ThanosRulerSpecAlertmanagersConfig alertmanagersConfig) {

    this.alertmanagersConfig = alertmanagersConfig;
    return this;
  }

  /**
   * Get alertmanagersConfig
   *
   * @return alertmanagersConfig
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecAlertmanagersConfig getAlertmanagersConfig() {
    return alertmanagersConfig;
  }

  public void setAlertmanagersConfig(V1ThanosRulerSpecAlertmanagersConfig alertmanagersConfig) {
    this.alertmanagersConfig = alertmanagersConfig;
  }

  public V1ThanosRulerSpec alertmanagersUrl(List<String> alertmanagersUrl) {

    this.alertmanagersUrl = alertmanagersUrl;
    return this;
  }

  public V1ThanosRulerSpec addAlertmanagersUrlItem(String alertmanagersUrlItem) {
    if (this.alertmanagersUrl == null) {
      this.alertmanagersUrl = new ArrayList<String>();
    }
    this.alertmanagersUrl.add(alertmanagersUrlItem);
    return this;
  }

  /**
   * Define URLs to send alerts to Alertmanager. For Thanos v0.10.0 and higher, AlertManagersConfig
   * should be used instead. Note: this field will be ignored if AlertManagersConfig is specified.
   * Maps to the &#x60;alertmanagers.url&#x60; arg.
   *
   * @return alertmanagersUrl
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Define URLs to send alerts to Alertmanager.  For Thanos v0.10.0 and higher, AlertManagersConfig should be used instead.  Note: this field will be ignored if AlertManagersConfig is specified. Maps to the `alertmanagers.url` arg.")
  public List<String> getAlertmanagersUrl() {
    return alertmanagersUrl;
  }

  public void setAlertmanagersUrl(List<String> alertmanagersUrl) {
    this.alertmanagersUrl = alertmanagersUrl;
  }

  public V1ThanosRulerSpec containers(List<V1ThanosRulerSpecContainers> containers) {

    this.containers = containers;
    return this;
  }

  public V1ThanosRulerSpec addContainersItem(V1ThanosRulerSpecContainers containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<V1ThanosRulerSpecContainers>();
    }
    this.containers.add(containersItem);
    return this;
  }

  /**
   * Containers allows injecting additional containers or modifying operator generated containers.
   * This can be used to allow adding an authentication proxy to a ThanosRuler pod or to change the
   * behavior of an operator generated container. Containers described here modify an operator
   * generated container if they share the same name and modifications are done via a strategic
   * merge patch. The current container names are: &#x60;thanos-ruler&#x60; and
   * &#x60;rules-configmap-reloader&#x60;. Overriding containers is entirely outside the scope of
   * what the maintainers will support and by doing so, you accept that this behaviour may break at
   * any time without notice.
   *
   * @return containers
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Containers allows injecting additional containers or modifying operator generated containers. This can be used to allow adding an authentication proxy to a ThanosRuler pod or to change the behavior of an operator generated container. Containers described here modify an operator generated container if they share the same name and modifications are done via a strategic merge patch. The current container names are: `thanos-ruler` and `rules-configmap-reloader`. Overriding containers is entirely outside the scope of what the maintainers will support and by doing so, you accept that this behaviour may break at any time without notice.")
  public List<V1ThanosRulerSpecContainers> getContainers() {
    return containers;
  }

  public void setContainers(List<V1ThanosRulerSpecContainers> containers) {
    this.containers = containers;
  }

  public V1ThanosRulerSpec enforcedNamespaceLabel(String enforcedNamespaceLabel) {

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

  public V1ThanosRulerSpec evaluationInterval(String evaluationInterval) {

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

  public V1ThanosRulerSpec externalPrefix(String externalPrefix) {

    this.externalPrefix = externalPrefix;
    return this;
  }

  /**
   * The external URL the Thanos Ruler instances will be available under. This is necessary to
   * generate correct URLs. This is necessary if Thanos Ruler is not served from root of a DNS name.
   *
   * @return externalPrefix
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The external URL the Thanos Ruler instances will be available under. This is necessary to generate correct URLs. This is necessary if Thanos Ruler is not served from root of a DNS name.")
  public String getExternalPrefix() {
    return externalPrefix;
  }

  public void setExternalPrefix(String externalPrefix) {
    this.externalPrefix = externalPrefix;
  }

  public V1ThanosRulerSpec grpcServerTlsConfig(
      V1ThanosRulerSpecGrpcServerTlsConfig grpcServerTlsConfig) {

    this.grpcServerTlsConfig = grpcServerTlsConfig;
    return this;
  }

  /**
   * Get grpcServerTlsConfig
   *
   * @return grpcServerTlsConfig
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecGrpcServerTlsConfig getGrpcServerTlsConfig() {
    return grpcServerTlsConfig;
  }

  public void setGrpcServerTlsConfig(V1ThanosRulerSpecGrpcServerTlsConfig grpcServerTlsConfig) {
    this.grpcServerTlsConfig = grpcServerTlsConfig;
  }

  public V1ThanosRulerSpec image(String image) {

    this.image = image;
    return this;
  }

  /**
   * Thanos container image URL.
   *
   * @return image
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Thanos container image URL.")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public V1ThanosRulerSpec imagePullSecrets(
      List<V1ThanosRulerSpecImagePullSecrets> imagePullSecrets) {

    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public V1ThanosRulerSpec addImagePullSecretsItem(
      V1ThanosRulerSpecImagePullSecrets imagePullSecretsItem) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets = new ArrayList<V1ThanosRulerSpecImagePullSecrets>();
    }
    this.imagePullSecrets.add(imagePullSecretsItem);
    return this;
  }

  /**
   * An optional list of references to secrets in the same namespace to use for pulling thanos
   * images from registries see
   * http://kubernetes.io/docs/user-guide/images#specifying-imagepullsecrets-on-a-pod
   *
   * @return imagePullSecrets
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "An optional list of references to secrets in the same namespace to use for pulling thanos images from registries see http://kubernetes.io/docs/user-guide/images#specifying-imagepullsecrets-on-a-pod")
  public List<V1ThanosRulerSpecImagePullSecrets> getImagePullSecrets() {
    return imagePullSecrets;
  }

  public void setImagePullSecrets(List<V1ThanosRulerSpecImagePullSecrets> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }

  public V1ThanosRulerSpec initContainers(List<V1ThanosRulerSpecContainers> initContainers) {

    this.initContainers = initContainers;
    return this;
  }

  public V1ThanosRulerSpec addInitContainersItem(V1ThanosRulerSpecContainers initContainersItem) {
    if (this.initContainers == null) {
      this.initContainers = new ArrayList<V1ThanosRulerSpecContainers>();
    }
    this.initContainers.add(initContainersItem);
    return this;
  }

  /**
   * InitContainers allows adding initContainers to the pod definition. Those can be used to e.g.
   * fetch secrets for injection into the ThanosRuler configuration from external sources. Any
   * errors during the execution of an initContainer will lead to a restart of the Pod. More info:
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
          "InitContainers allows adding initContainers to the pod definition. Those can be used to e.g. fetch secrets for injection into the ThanosRuler configuration from external sources. Any errors during the execution of an initContainer will lead to a restart of the Pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/ Using initContainers for any use case other then secret fetching is entirely outside the scope of what the maintainers will support and by doing so, you accept that this behaviour may break at any time without notice.")
  public List<V1ThanosRulerSpecContainers> getInitContainers() {
    return initContainers;
  }

  public void setInitContainers(List<V1ThanosRulerSpecContainers> initContainers) {
    this.initContainers = initContainers;
  }

  public V1ThanosRulerSpec labels(Map<String, String> labels) {

    this.labels = labels;
    return this;
  }

  public V1ThanosRulerSpec putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Labels configure the external label pairs to ThanosRuler. If not provided, default replica
   * label &#x60;thanos_ruler_replica&#x60; will be added as a label and be dropped in alerts.
   *
   * @return labels
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Labels configure the external label pairs to ThanosRuler. If not provided, default replica label `thanos_ruler_replica` will be added as a label and be dropped in alerts.")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public V1ThanosRulerSpec listenLocal(Boolean listenLocal) {

    this.listenLocal = listenLocal;
    return this;
  }

  /**
   * ListenLocal makes the Thanos ruler listen on loopback, so that it does not bind against the Pod
   * IP.
   *
   * @return listenLocal
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ListenLocal makes the Thanos ruler listen on loopback, so that it does not bind against the Pod IP.")
  public Boolean getListenLocal() {
    return listenLocal;
  }

  public void setListenLocal(Boolean listenLocal) {
    this.listenLocal = listenLocal;
  }

  public V1ThanosRulerSpec logFormat(String logFormat) {

    this.logFormat = logFormat;
    return this;
  }

  /**
   * Log format for ThanosRuler to be configured with.
   *
   * @return logFormat
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Log format for ThanosRuler to be configured with.")
  public String getLogFormat() {
    return logFormat;
  }

  public void setLogFormat(String logFormat) {
    this.logFormat = logFormat;
  }

  public V1ThanosRulerSpec logLevel(String logLevel) {

    this.logLevel = logLevel;
    return this;
  }

  /**
   * Log level for ThanosRuler to be configured with.
   *
   * @return logLevel
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Log level for ThanosRuler to be configured with.")
  public String getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(String logLevel) {
    this.logLevel = logLevel;
  }

  public V1ThanosRulerSpec nodeSelector(Map<String, String> nodeSelector) {

    this.nodeSelector = nodeSelector;
    return this;
  }

  public V1ThanosRulerSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
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

  public V1ThanosRulerSpec objectStorageConfig(
      V1ThanosRulerSpecObjectStorageConfig objectStorageConfig) {

    this.objectStorageConfig = objectStorageConfig;
    return this;
  }

  /**
   * Get objectStorageConfig
   *
   * @return objectStorageConfig
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecObjectStorageConfig getObjectStorageConfig() {
    return objectStorageConfig;
  }

  public void setObjectStorageConfig(V1ThanosRulerSpecObjectStorageConfig objectStorageConfig) {
    this.objectStorageConfig = objectStorageConfig;
  }

  public V1ThanosRulerSpec paused(Boolean paused) {

    this.paused = paused;
    return this;
  }

  /**
   * When a ThanosRuler deployment is paused, no actions except for deletion will be performed on
   * the underlying objects.
   *
   * @return paused
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "When a ThanosRuler deployment is paused, no actions except for deletion will be performed on the underlying objects.")
  public Boolean getPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public V1ThanosRulerSpec podMetadata(V1ThanosRulerSpecPodMetadata podMetadata) {

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
  public V1ThanosRulerSpecPodMetadata getPodMetadata() {
    return podMetadata;
  }

  public void setPodMetadata(V1ThanosRulerSpecPodMetadata podMetadata) {
    this.podMetadata = podMetadata;
  }

  public V1ThanosRulerSpec portName(String portName) {

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

  public V1ThanosRulerSpec priorityClassName(String priorityClassName) {

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

  public V1ThanosRulerSpec queryConfig(V1ThanosRulerSpecQueryConfig queryConfig) {

    this.queryConfig = queryConfig;
    return this;
  }

  /**
   * Get queryConfig
   *
   * @return queryConfig
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecQueryConfig getQueryConfig() {
    return queryConfig;
  }

  public void setQueryConfig(V1ThanosRulerSpecQueryConfig queryConfig) {
    this.queryConfig = queryConfig;
  }

  public V1ThanosRulerSpec queryEndpoints(List<String> queryEndpoints) {

    this.queryEndpoints = queryEndpoints;
    return this;
  }

  public V1ThanosRulerSpec addQueryEndpointsItem(String queryEndpointsItem) {
    if (this.queryEndpoints == null) {
      this.queryEndpoints = new ArrayList<String>();
    }
    this.queryEndpoints.add(queryEndpointsItem);
    return this;
  }

  /**
   * QueryEndpoints defines Thanos querier endpoints from which to query metrics. Maps to the
   * --query flag of thanos ruler.
   *
   * @return queryEndpoints
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "QueryEndpoints defines Thanos querier endpoints from which to query metrics. Maps to the --query flag of thanos ruler.")
  public List<String> getQueryEndpoints() {
    return queryEndpoints;
  }

  public void setQueryEndpoints(List<String> queryEndpoints) {
    this.queryEndpoints = queryEndpoints;
  }

  public V1ThanosRulerSpec replicas(Integer replicas) {

    this.replicas = replicas;
    return this;
  }

  /**
   * Number of thanos ruler instances to deploy.
   *
   * @return replicas
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of thanos ruler instances to deploy.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public V1ThanosRulerSpec resources(V1ThanosRulerSpecResources1 resources) {

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
  public V1ThanosRulerSpecResources1 getResources() {
    return resources;
  }

  public void setResources(V1ThanosRulerSpecResources1 resources) {
    this.resources = resources;
  }

  public V1ThanosRulerSpec retention(String retention) {

    this.retention = retention;
    return this;
  }

  /**
   * Time duration ThanosRuler shall retain data for. Default is &#39;24h&#39;, and must match the
   * regular expression &#x60;[0-9]+(ms|s|m|h|d|w|y)&#x60; (milliseconds seconds minutes hours days
   * weeks years).
   *
   * @return retention
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Time duration ThanosRuler shall retain data for. Default is '24h', and must match the regular expression `[0-9]+(ms|s|m|h|d|w|y)` (milliseconds seconds minutes hours days weeks years).")
  public String getRetention() {
    return retention;
  }

  public void setRetention(String retention) {
    this.retention = retention;
  }

  public V1ThanosRulerSpec routePrefix(String routePrefix) {

    this.routePrefix = routePrefix;
    return this;
  }

  /**
   * The route prefix ThanosRuler registers HTTP handlers for. This allows thanos UI to be served on
   * a sub-path.
   *
   * @return routePrefix
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The route prefix ThanosRuler registers HTTP handlers for. This allows thanos UI to be served on a sub-path.")
  public String getRoutePrefix() {
    return routePrefix;
  }

  public void setRoutePrefix(String routePrefix) {
    this.routePrefix = routePrefix;
  }

  public V1ThanosRulerSpec ruleNamespaceSelector(
      V1ThanosRulerSpecRuleNamespaceSelector ruleNamespaceSelector) {

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
  public V1ThanosRulerSpecRuleNamespaceSelector getRuleNamespaceSelector() {
    return ruleNamespaceSelector;
  }

  public void setRuleNamespaceSelector(
      V1ThanosRulerSpecRuleNamespaceSelector ruleNamespaceSelector) {
    this.ruleNamespaceSelector = ruleNamespaceSelector;
  }

  public V1ThanosRulerSpec ruleSelector(V1ThanosRulerSpecRuleSelector ruleSelector) {

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
  public V1ThanosRulerSpecRuleSelector getRuleSelector() {
    return ruleSelector;
  }

  public void setRuleSelector(V1ThanosRulerSpecRuleSelector ruleSelector) {
    this.ruleSelector = ruleSelector;
  }

  public V1ThanosRulerSpec securityContext(V1ThanosRulerSpecSecurityContext1 securityContext) {

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

  public V1ThanosRulerSpec serviceAccountName(String serviceAccountName) {

    this.serviceAccountName = serviceAccountName;
    return this;
  }

  /**
   * ServiceAccountName is the name of the ServiceAccount to use to run the Thanos Ruler Pods.
   *
   * @return serviceAccountName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ServiceAccountName is the name of the ServiceAccount to use to run the Thanos Ruler Pods.")
  public String getServiceAccountName() {
    return serviceAccountName;
  }

  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }

  public V1ThanosRulerSpec storage(V1ThanosRulerSpecStorage storage) {

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

  public V1ThanosRulerSpec tolerations(List<V1ThanosRulerSpecTolerations> tolerations) {

    this.tolerations = tolerations;
    return this;
  }

  public V1ThanosRulerSpec addTolerationsItem(V1ThanosRulerSpecTolerations tolerationsItem) {
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

  public V1ThanosRulerSpec tracingConfig(V1ThanosRulerSpecTracingConfig tracingConfig) {

    this.tracingConfig = tracingConfig;
    return this;
  }

  /**
   * Get tracingConfig
   *
   * @return tracingConfig
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecTracingConfig getTracingConfig() {
    return tracingConfig;
  }

  public void setTracingConfig(V1ThanosRulerSpecTracingConfig tracingConfig) {
    this.tracingConfig = tracingConfig;
  }

  public V1ThanosRulerSpec volumes(List<V1ThanosRulerSpecVolumes> volumes) {

    this.volumes = volumes;
    return this;
  }

  public V1ThanosRulerSpec addVolumesItem(V1ThanosRulerSpecVolumes volumesItem) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpec v1ThanosRulerSpec = (V1ThanosRulerSpec) o;
    return Objects.equals(this.affinity, v1ThanosRulerSpec.affinity)
        && Objects.equals(this.alertDropLabels, v1ThanosRulerSpec.alertDropLabels)
        && Objects.equals(this.alertQueryUrl, v1ThanosRulerSpec.alertQueryUrl)
        && Objects.equals(this.alertmanagersConfig, v1ThanosRulerSpec.alertmanagersConfig)
        && Objects.equals(this.alertmanagersUrl, v1ThanosRulerSpec.alertmanagersUrl)
        && Objects.equals(this.containers, v1ThanosRulerSpec.containers)
        && Objects.equals(this.enforcedNamespaceLabel, v1ThanosRulerSpec.enforcedNamespaceLabel)
        && Objects.equals(this.evaluationInterval, v1ThanosRulerSpec.evaluationInterval)
        && Objects.equals(this.externalPrefix, v1ThanosRulerSpec.externalPrefix)
        && Objects.equals(this.grpcServerTlsConfig, v1ThanosRulerSpec.grpcServerTlsConfig)
        && Objects.equals(this.image, v1ThanosRulerSpec.image)
        && Objects.equals(this.imagePullSecrets, v1ThanosRulerSpec.imagePullSecrets)
        && Objects.equals(this.initContainers, v1ThanosRulerSpec.initContainers)
        && Objects.equals(this.labels, v1ThanosRulerSpec.labels)
        && Objects.equals(this.listenLocal, v1ThanosRulerSpec.listenLocal)
        && Objects.equals(this.logFormat, v1ThanosRulerSpec.logFormat)
        && Objects.equals(this.logLevel, v1ThanosRulerSpec.logLevel)
        && Objects.equals(this.nodeSelector, v1ThanosRulerSpec.nodeSelector)
        && Objects.equals(this.objectStorageConfig, v1ThanosRulerSpec.objectStorageConfig)
        && Objects.equals(this.paused, v1ThanosRulerSpec.paused)
        && Objects.equals(this.podMetadata, v1ThanosRulerSpec.podMetadata)
        && Objects.equals(this.portName, v1ThanosRulerSpec.portName)
        && Objects.equals(this.priorityClassName, v1ThanosRulerSpec.priorityClassName)
        && Objects.equals(this.queryConfig, v1ThanosRulerSpec.queryConfig)
        && Objects.equals(this.queryEndpoints, v1ThanosRulerSpec.queryEndpoints)
        && Objects.equals(this.replicas, v1ThanosRulerSpec.replicas)
        && Objects.equals(this.resources, v1ThanosRulerSpec.resources)
        && Objects.equals(this.retention, v1ThanosRulerSpec.retention)
        && Objects.equals(this.routePrefix, v1ThanosRulerSpec.routePrefix)
        && Objects.equals(this.ruleNamespaceSelector, v1ThanosRulerSpec.ruleNamespaceSelector)
        && Objects.equals(this.ruleSelector, v1ThanosRulerSpec.ruleSelector)
        && Objects.equals(this.securityContext, v1ThanosRulerSpec.securityContext)
        && Objects.equals(this.serviceAccountName, v1ThanosRulerSpec.serviceAccountName)
        && Objects.equals(this.storage, v1ThanosRulerSpec.storage)
        && Objects.equals(this.tolerations, v1ThanosRulerSpec.tolerations)
        && Objects.equals(this.tracingConfig, v1ThanosRulerSpec.tracingConfig)
        && Objects.equals(this.volumes, v1ThanosRulerSpec.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        affinity,
        alertDropLabels,
        alertQueryUrl,
        alertmanagersConfig,
        alertmanagersUrl,
        containers,
        enforcedNamespaceLabel,
        evaluationInterval,
        externalPrefix,
        grpcServerTlsConfig,
        image,
        imagePullSecrets,
        initContainers,
        labels,
        listenLocal,
        logFormat,
        logLevel,
        nodeSelector,
        objectStorageConfig,
        paused,
        podMetadata,
        portName,
        priorityClassName,
        queryConfig,
        queryEndpoints,
        replicas,
        resources,
        retention,
        routePrefix,
        ruleNamespaceSelector,
        ruleSelector,
        securityContext,
        serviceAccountName,
        storage,
        tolerations,
        tracingConfig,
        volumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpec {\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    alertDropLabels: ").append(toIndentedString(alertDropLabels)).append("\n");
    sb.append("    alertQueryUrl: ").append(toIndentedString(alertQueryUrl)).append("\n");
    sb.append("    alertmanagersConfig: ")
        .append(toIndentedString(alertmanagersConfig))
        .append("\n");
    sb.append("    alertmanagersUrl: ").append(toIndentedString(alertmanagersUrl)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    enforcedNamespaceLabel: ")
        .append(toIndentedString(enforcedNamespaceLabel))
        .append("\n");
    sb.append("    evaluationInterval: ").append(toIndentedString(evaluationInterval)).append("\n");
    sb.append("    externalPrefix: ").append(toIndentedString(externalPrefix)).append("\n");
    sb.append("    grpcServerTlsConfig: ")
        .append(toIndentedString(grpcServerTlsConfig))
        .append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    listenLocal: ").append(toIndentedString(listenLocal)).append("\n");
    sb.append("    logFormat: ").append(toIndentedString(logFormat)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    objectStorageConfig: ")
        .append(toIndentedString(objectStorageConfig))
        .append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    podMetadata: ").append(toIndentedString(podMetadata)).append("\n");
    sb.append("    portName: ").append(toIndentedString(portName)).append("\n");
    sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
    sb.append("    queryConfig: ").append(toIndentedString(queryConfig)).append("\n");
    sb.append("    queryEndpoints: ").append(toIndentedString(queryEndpoints)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
    sb.append("    routePrefix: ").append(toIndentedString(routePrefix)).append("\n");
    sb.append("    ruleNamespaceSelector: ")
        .append(toIndentedString(ruleNamespaceSelector))
        .append("\n");
    sb.append("    ruleSelector: ").append(toIndentedString(ruleSelector)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    tracingConfig: ").append(toIndentedString(tracingConfig)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
