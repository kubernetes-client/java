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
 * Specification of the desired behavior of the Alertmanager cluster. More info:
 * https://github.com/kubernetes/community/blob/master/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
 */
@ApiModel(
    description =
        "Specification of the desired behavior of the Alertmanager cluster. More info: https://github.com/kubernetes/community/blob/master/contributors/devel/sig-architecture/api-conventions.md#spec-and-status")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1AlertmanagerSpec {
  public static final String SERIALIZED_NAME_ADDITIONAL_PEERS = "additionalPeers";

  @SerializedName(SERIALIZED_NAME_ADDITIONAL_PEERS)
  private List<String> additionalPeers = null;

  public static final String SERIALIZED_NAME_AFFINITY = "affinity";

  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private V1ThanosRulerSpecAffinity affinity;

  public static final String SERIALIZED_NAME_BASE_IMAGE = "baseImage";

  @SerializedName(SERIALIZED_NAME_BASE_IMAGE)
  private String baseImage;

  public static final String SERIALIZED_NAME_CONFIG_MAPS = "configMaps";

  @SerializedName(SERIALIZED_NAME_CONFIG_MAPS)
  private List<String> configMaps = null;

  public static final String SERIALIZED_NAME_CONFIG_SECRET = "configSecret";

  @SerializedName(SERIALIZED_NAME_CONFIG_SECRET)
  private String configSecret;

  public static final String SERIALIZED_NAME_CONTAINERS = "containers";

  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private List<V1ThanosRulerSpecContainers> containers = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL = "externalUrl";

  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private String externalUrl;

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

  public static final String SERIALIZED_NAME_PAUSED = "paused";

  @SerializedName(SERIALIZED_NAME_PAUSED)
  private Boolean paused;

  public static final String SERIALIZED_NAME_POD_METADATA = "podMetadata";

  @SerializedName(SERIALIZED_NAME_POD_METADATA)
  private V1AlertmanagerSpecPodMetadata podMetadata;

  public static final String SERIALIZED_NAME_PORT_NAME = "portName";

  @SerializedName(SERIALIZED_NAME_PORT_NAME)
  private String portName;

  public static final String SERIALIZED_NAME_PRIORITY_CLASS_NAME = "priorityClassName";

  @SerializedName(SERIALIZED_NAME_PRIORITY_CLASS_NAME)
  private String priorityClassName;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";

  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";

  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1AlertmanagerSpecResources resources;

  public static final String SERIALIZED_NAME_RETENTION = "retention";

  @SerializedName(SERIALIZED_NAME_RETENTION)
  private String retention;

  public static final String SERIALIZED_NAME_ROUTE_PREFIX = "routePrefix";

  @SerializedName(SERIALIZED_NAME_ROUTE_PREFIX)
  private String routePrefix;

  public static final String SERIALIZED_NAME_SECRETS = "secrets";

  @SerializedName(SERIALIZED_NAME_SECRETS)
  private List<String> secrets = null;

  public static final String SERIALIZED_NAME_SECURITY_CONTEXT = "securityContext";

  @SerializedName(SERIALIZED_NAME_SECURITY_CONTEXT)
  private V1ThanosRulerSpecSecurityContext1 securityContext;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_NAME = "serviceAccountName";

  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_NAME)
  private String serviceAccountName;

  public static final String SERIALIZED_NAME_SHA = "sha";

  @SerializedName(SERIALIZED_NAME_SHA)
  private String sha;

  public static final String SERIALIZED_NAME_STORAGE = "storage";

  @SerializedName(SERIALIZED_NAME_STORAGE)
  private V1AlertmanagerSpecStorage storage;

  public static final String SERIALIZED_NAME_TAG = "tag";

  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

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

  public V1AlertmanagerSpec additionalPeers(List<String> additionalPeers) {

    this.additionalPeers = additionalPeers;
    return this;
  }

  public V1AlertmanagerSpec addAdditionalPeersItem(String additionalPeersItem) {
    if (this.additionalPeers == null) {
      this.additionalPeers = new ArrayList<String>();
    }
    this.additionalPeers.add(additionalPeersItem);
    return this;
  }

  /**
   * AdditionalPeers allows injecting a set of additional Alertmanagers to peer with to form a
   * highly available cluster.
   *
   * @return additionalPeers
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "AdditionalPeers allows injecting a set of additional Alertmanagers to peer with to form a highly available cluster.")
  public List<String> getAdditionalPeers() {
    return additionalPeers;
  }

  public void setAdditionalPeers(List<String> additionalPeers) {
    this.additionalPeers = additionalPeers;
  }

  public V1AlertmanagerSpec affinity(V1ThanosRulerSpecAffinity affinity) {

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

  public V1AlertmanagerSpec baseImage(String baseImage) {

    this.baseImage = baseImage;
    return this;
  }

  /**
   * Base image that is used to deploy pods, without tag.
   *
   * @return baseImage
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base image that is used to deploy pods, without tag.")
  public String getBaseImage() {
    return baseImage;
  }

  public void setBaseImage(String baseImage) {
    this.baseImage = baseImage;
  }

  public V1AlertmanagerSpec configMaps(List<String> configMaps) {

    this.configMaps = configMaps;
    return this;
  }

  public V1AlertmanagerSpec addConfigMapsItem(String configMapsItem) {
    if (this.configMaps == null) {
      this.configMaps = new ArrayList<String>();
    }
    this.configMaps.add(configMapsItem);
    return this;
  }

  /**
   * ConfigMaps is a list of ConfigMaps in the same namespace as the Alertmanager object, which
   * shall be mounted into the Alertmanager Pods. The ConfigMaps are mounted into
   * /etc/alertmanager/configmaps/&lt;configmap-name&gt;.
   *
   * @return configMaps
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ConfigMaps is a list of ConfigMaps in the same namespace as the Alertmanager object, which shall be mounted into the Alertmanager Pods. The ConfigMaps are mounted into /etc/alertmanager/configmaps/<configmap-name>.")
  public List<String> getConfigMaps() {
    return configMaps;
  }

  public void setConfigMaps(List<String> configMaps) {
    this.configMaps = configMaps;
  }

  public V1AlertmanagerSpec configSecret(String configSecret) {

    this.configSecret = configSecret;
    return this;
  }

  /**
   * ConfigSecret is the name of a Kubernetes Secret in the same namespace as the Alertmanager
   * object, which contains configuration for this Alertmanager instance. Defaults to
   * &#39;alertmanager-&lt;alertmanager-name&gt;&#39; The secret is mounted into
   * /etc/alertmanager/config.
   *
   * @return configSecret
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ConfigSecret is the name of a Kubernetes Secret in the same namespace as the Alertmanager object, which contains configuration for this Alertmanager instance. Defaults to 'alertmanager-<alertmanager-name>' The secret is mounted into /etc/alertmanager/config.")
  public String getConfigSecret() {
    return configSecret;
  }

  public void setConfigSecret(String configSecret) {
    this.configSecret = configSecret;
  }

  public V1AlertmanagerSpec containers(List<V1ThanosRulerSpecContainers> containers) {

    this.containers = containers;
    return this;
  }

  public V1AlertmanagerSpec addContainersItem(V1ThanosRulerSpecContainers containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<V1ThanosRulerSpecContainers>();
    }
    this.containers.add(containersItem);
    return this;
  }

  /**
   * Containers allows injecting additional containers. This is meant to allow adding an
   * authentication proxy to an Alertmanager pod.
   *
   * @return containers
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Containers allows injecting additional containers. This is meant to allow adding an authentication proxy to an Alertmanager pod.")
  public List<V1ThanosRulerSpecContainers> getContainers() {
    return containers;
  }

  public void setContainers(List<V1ThanosRulerSpecContainers> containers) {
    this.containers = containers;
  }

  public V1AlertmanagerSpec externalUrl(String externalUrl) {

    this.externalUrl = externalUrl;
    return this;
  }

  /**
   * The external URL the Alertmanager instances will be available under. This is necessary to
   * generate correct URLs. This is necessary if Alertmanager is not served from root of a DNS name.
   *
   * @return externalUrl
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The external URL the Alertmanager instances will be available under. This is necessary to generate correct URLs. This is necessary if Alertmanager is not served from root of a DNS name.")
  public String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  public V1AlertmanagerSpec image(String image) {

    this.image = image;
    return this;
  }

  /**
   * Image if specified has precedence over baseImage, tag and sha combinations. Specifying the
   * version is still necessary to ensure the Prometheus Operator knows what version of Alertmanager
   * is being configured.
   *
   * @return image
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Image if specified has precedence over baseImage, tag and sha combinations. Specifying the version is still necessary to ensure the Prometheus Operator knows what version of Alertmanager is being configured.")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public V1AlertmanagerSpec imagePullSecrets(
      List<V1ThanosRulerSpecImagePullSecrets> imagePullSecrets) {

    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public V1AlertmanagerSpec addImagePullSecretsItem(
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

  public V1AlertmanagerSpec initContainers(List<V1ThanosRulerSpecContainers> initContainers) {

    this.initContainers = initContainers;
    return this;
  }

  public V1AlertmanagerSpec addInitContainersItem(V1ThanosRulerSpecContainers initContainersItem) {
    if (this.initContainers == null) {
      this.initContainers = new ArrayList<V1ThanosRulerSpecContainers>();
    }
    this.initContainers.add(initContainersItem);
    return this;
  }

  /**
   * InitContainers allows adding initContainers to the pod definition. Those can be used to e.g.
   * fetch secrets for injection into the Alertmanager configuration from external sources. Any
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
          "InitContainers allows adding initContainers to the pod definition. Those can be used to e.g. fetch secrets for injection into the Alertmanager configuration from external sources. Any errors during the execution of an initContainer will lead to a restart of the Pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/ Using initContainers for any use case other then secret fetching is entirely outside the scope of what the maintainers will support and by doing so, you accept that this behaviour may break at any time without notice.")
  public List<V1ThanosRulerSpecContainers> getInitContainers() {
    return initContainers;
  }

  public void setInitContainers(List<V1ThanosRulerSpecContainers> initContainers) {
    this.initContainers = initContainers;
  }

  public V1AlertmanagerSpec listenLocal(Boolean listenLocal) {

    this.listenLocal = listenLocal;
    return this;
  }

  /**
   * ListenLocal makes the Alertmanager server listen on loopback, so that it does not bind against
   * the Pod IP. Note this is only for the Alertmanager UI, not the gossip communication.
   *
   * @return listenLocal
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ListenLocal makes the Alertmanager server listen on loopback, so that it does not bind against the Pod IP. Note this is only for the Alertmanager UI, not the gossip communication.")
  public Boolean getListenLocal() {
    return listenLocal;
  }

  public void setListenLocal(Boolean listenLocal) {
    this.listenLocal = listenLocal;
  }

  public V1AlertmanagerSpec logFormat(String logFormat) {

    this.logFormat = logFormat;
    return this;
  }

  /**
   * Log format for Alertmanager to be configured with.
   *
   * @return logFormat
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Log format for Alertmanager to be configured with.")
  public String getLogFormat() {
    return logFormat;
  }

  public void setLogFormat(String logFormat) {
    this.logFormat = logFormat;
  }

  public V1AlertmanagerSpec logLevel(String logLevel) {

    this.logLevel = logLevel;
    return this;
  }

  /**
   * Log level for Alertmanager to be configured with.
   *
   * @return logLevel
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Log level for Alertmanager to be configured with.")
  public String getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(String logLevel) {
    this.logLevel = logLevel;
  }

  public V1AlertmanagerSpec nodeSelector(Map<String, String> nodeSelector) {

    this.nodeSelector = nodeSelector;
    return this;
  }

  public V1AlertmanagerSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
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

  public V1AlertmanagerSpec paused(Boolean paused) {

    this.paused = paused;
    return this;
  }

  /**
   * If set to true all actions on the underlaying managed objects are not goint to be performed,
   * except for delete actions.
   *
   * @return paused
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If set to true all actions on the underlaying managed objects are not goint to be performed, except for delete actions.")
  public Boolean getPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public V1AlertmanagerSpec podMetadata(V1AlertmanagerSpecPodMetadata podMetadata) {

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
  public V1AlertmanagerSpecPodMetadata getPodMetadata() {
    return podMetadata;
  }

  public void setPodMetadata(V1AlertmanagerSpecPodMetadata podMetadata) {
    this.podMetadata = podMetadata;
  }

  public V1AlertmanagerSpec portName(String portName) {

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

  public V1AlertmanagerSpec priorityClassName(String priorityClassName) {

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

  public V1AlertmanagerSpec replicas(Integer replicas) {

    this.replicas = replicas;
    return this;
  }

  /**
   * Size is the expected size of the alertmanager cluster. The controller will eventually make the
   * size of the running cluster equal to the expected size.
   *
   * @return replicas
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Size is the expected size of the alertmanager cluster. The controller will eventually make the size of the running cluster equal to the expected size.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public V1AlertmanagerSpec resources(V1AlertmanagerSpecResources resources) {

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

  public V1AlertmanagerSpec retention(String retention) {

    this.retention = retention;
    return this;
  }

  /**
   * Time duration Alertmanager shall retain data for. Default is &#39;120h&#39;, and must match the
   * regular expression &#x60;[0-9]+(ms|s|m|h)&#x60; (milliseconds seconds minutes hours).
   *
   * @return retention
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Time duration Alertmanager shall retain data for. Default is '120h', and must match the regular expression `[0-9]+(ms|s|m|h)` (milliseconds seconds minutes hours).")
  public String getRetention() {
    return retention;
  }

  public void setRetention(String retention) {
    this.retention = retention;
  }

  public V1AlertmanagerSpec routePrefix(String routePrefix) {

    this.routePrefix = routePrefix;
    return this;
  }

  /**
   * The route prefix Alertmanager registers HTTP handlers for. This is useful, if using ExternalURL
   * and a proxy is rewriting HTTP routes of a request, and the actual ExternalURL is still true,
   * but the server serves requests under a different route prefix. For example for use with
   * &#x60;kubectl proxy&#x60;.
   *
   * @return routePrefix
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The route prefix Alertmanager registers HTTP handlers for. This is useful, if using ExternalURL and a proxy is rewriting HTTP routes of a request, and the actual ExternalURL is still true, but the server serves requests under a different route prefix. For example for use with `kubectl proxy`.")
  public String getRoutePrefix() {
    return routePrefix;
  }

  public void setRoutePrefix(String routePrefix) {
    this.routePrefix = routePrefix;
  }

  public V1AlertmanagerSpec secrets(List<String> secrets) {

    this.secrets = secrets;
    return this;
  }

  public V1AlertmanagerSpec addSecretsItem(String secretsItem) {
    if (this.secrets == null) {
      this.secrets = new ArrayList<String>();
    }
    this.secrets.add(secretsItem);
    return this;
  }

  /**
   * Secrets is a list of Secrets in the same namespace as the Alertmanager object, which shall be
   * mounted into the Alertmanager Pods. The Secrets are mounted into
   * /etc/alertmanager/secrets/&lt;secret-name&gt;.
   *
   * @return secrets
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Secrets is a list of Secrets in the same namespace as the Alertmanager object, which shall be mounted into the Alertmanager Pods. The Secrets are mounted into /etc/alertmanager/secrets/<secret-name>.")
  public List<String> getSecrets() {
    return secrets;
  }

  public void setSecrets(List<String> secrets) {
    this.secrets = secrets;
  }

  public V1AlertmanagerSpec securityContext(V1ThanosRulerSpecSecurityContext1 securityContext) {

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

  public V1AlertmanagerSpec serviceAccountName(String serviceAccountName) {

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

  public V1AlertmanagerSpec sha(String sha) {

    this.sha = sha;
    return this;
  }

  /**
   * SHA of Alertmanager container image to be deployed. Defaults to the value of
   * &#x60;version&#x60;. Similar to a tag, but the SHA explicitly deploys an immutable container
   * image. Version and Tag are ignored if SHA is set.
   *
   * @return sha
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "SHA of Alertmanager container image to be deployed. Defaults to the value of `version`. Similar to a tag, but the SHA explicitly deploys an immutable container image. Version and Tag are ignored if SHA is set.")
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }

  public V1AlertmanagerSpec storage(V1AlertmanagerSpecStorage storage) {

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
  public V1AlertmanagerSpecStorage getStorage() {
    return storage;
  }

  public void setStorage(V1AlertmanagerSpecStorage storage) {
    this.storage = storage;
  }

  public V1AlertmanagerSpec tag(String tag) {

    this.tag = tag;
    return this;
  }

  /**
   * Tag of Alertmanager container image to be deployed. Defaults to the value of
   * &#x60;version&#x60;. Version is ignored if Tag is set.
   *
   * @return tag
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Tag of Alertmanager container image to be deployed. Defaults to the value of `version`. Version is ignored if Tag is set.")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public V1AlertmanagerSpec tolerations(List<V1ThanosRulerSpecTolerations> tolerations) {

    this.tolerations = tolerations;
    return this;
  }

  public V1AlertmanagerSpec addTolerationsItem(V1ThanosRulerSpecTolerations tolerationsItem) {
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

  public V1AlertmanagerSpec version(String version) {

    this.version = version;
    return this;
  }

  /**
   * Version the cluster should be on.
   *
   * @return version
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version the cluster should be on.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public V1AlertmanagerSpec volumeMounts(List<V1ThanosRulerSpecVolumeMounts> volumeMounts) {

    this.volumeMounts = volumeMounts;
    return this;
  }

  public V1AlertmanagerSpec addVolumeMountsItem(V1ThanosRulerSpecVolumeMounts volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<V1ThanosRulerSpecVolumeMounts>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

  /**
   * VolumeMounts allows configuration of additional VolumeMounts on the output StatefulSet
   * definition. VolumeMounts specified will be appended to other VolumeMounts in the alertmanager
   * container, that are generated as a result of StorageSpec objects.
   *
   * @return volumeMounts
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "VolumeMounts allows configuration of additional VolumeMounts on the output StatefulSet definition. VolumeMounts specified will be appended to other VolumeMounts in the alertmanager container, that are generated as a result of StorageSpec objects.")
  public List<V1ThanosRulerSpecVolumeMounts> getVolumeMounts() {
    return volumeMounts;
  }

  public void setVolumeMounts(List<V1ThanosRulerSpecVolumeMounts> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }

  public V1AlertmanagerSpec volumes(List<V1ThanosRulerSpecVolumes> volumes) {

    this.volumes = volumes;
    return this;
  }

  public V1AlertmanagerSpec addVolumesItem(V1ThanosRulerSpecVolumes volumesItem) {
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
    V1AlertmanagerSpec v1AlertmanagerSpec = (V1AlertmanagerSpec) o;
    return Objects.equals(this.additionalPeers, v1AlertmanagerSpec.additionalPeers)
        && Objects.equals(this.affinity, v1AlertmanagerSpec.affinity)
        && Objects.equals(this.baseImage, v1AlertmanagerSpec.baseImage)
        && Objects.equals(this.configMaps, v1AlertmanagerSpec.configMaps)
        && Objects.equals(this.configSecret, v1AlertmanagerSpec.configSecret)
        && Objects.equals(this.containers, v1AlertmanagerSpec.containers)
        && Objects.equals(this.externalUrl, v1AlertmanagerSpec.externalUrl)
        && Objects.equals(this.image, v1AlertmanagerSpec.image)
        && Objects.equals(this.imagePullSecrets, v1AlertmanagerSpec.imagePullSecrets)
        && Objects.equals(this.initContainers, v1AlertmanagerSpec.initContainers)
        && Objects.equals(this.listenLocal, v1AlertmanagerSpec.listenLocal)
        && Objects.equals(this.logFormat, v1AlertmanagerSpec.logFormat)
        && Objects.equals(this.logLevel, v1AlertmanagerSpec.logLevel)
        && Objects.equals(this.nodeSelector, v1AlertmanagerSpec.nodeSelector)
        && Objects.equals(this.paused, v1AlertmanagerSpec.paused)
        && Objects.equals(this.podMetadata, v1AlertmanagerSpec.podMetadata)
        && Objects.equals(this.portName, v1AlertmanagerSpec.portName)
        && Objects.equals(this.priorityClassName, v1AlertmanagerSpec.priorityClassName)
        && Objects.equals(this.replicas, v1AlertmanagerSpec.replicas)
        && Objects.equals(this.resources, v1AlertmanagerSpec.resources)
        && Objects.equals(this.retention, v1AlertmanagerSpec.retention)
        && Objects.equals(this.routePrefix, v1AlertmanagerSpec.routePrefix)
        && Objects.equals(this.secrets, v1AlertmanagerSpec.secrets)
        && Objects.equals(this.securityContext, v1AlertmanagerSpec.securityContext)
        && Objects.equals(this.serviceAccountName, v1AlertmanagerSpec.serviceAccountName)
        && Objects.equals(this.sha, v1AlertmanagerSpec.sha)
        && Objects.equals(this.storage, v1AlertmanagerSpec.storage)
        && Objects.equals(this.tag, v1AlertmanagerSpec.tag)
        && Objects.equals(this.tolerations, v1AlertmanagerSpec.tolerations)
        && Objects.equals(this.version, v1AlertmanagerSpec.version)
        && Objects.equals(this.volumeMounts, v1AlertmanagerSpec.volumeMounts)
        && Objects.equals(this.volumes, v1AlertmanagerSpec.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        additionalPeers,
        affinity,
        baseImage,
        configMaps,
        configSecret,
        containers,
        externalUrl,
        image,
        imagePullSecrets,
        initContainers,
        listenLocal,
        logFormat,
        logLevel,
        nodeSelector,
        paused,
        podMetadata,
        portName,
        priorityClassName,
        replicas,
        resources,
        retention,
        routePrefix,
        secrets,
        securityContext,
        serviceAccountName,
        sha,
        storage,
        tag,
        tolerations,
        version,
        volumeMounts,
        volumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AlertmanagerSpec {\n");
    sb.append("    additionalPeers: ").append(toIndentedString(additionalPeers)).append("\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    baseImage: ").append(toIndentedString(baseImage)).append("\n");
    sb.append("    configMaps: ").append(toIndentedString(configMaps)).append("\n");
    sb.append("    configSecret: ").append(toIndentedString(configSecret)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    listenLocal: ").append(toIndentedString(listenLocal)).append("\n");
    sb.append("    logFormat: ").append(toIndentedString(logFormat)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    podMetadata: ").append(toIndentedString(podMetadata)).append("\n");
    sb.append("    portName: ").append(toIndentedString(portName)).append("\n");
    sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
    sb.append("    routePrefix: ").append(toIndentedString(routePrefix)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
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
