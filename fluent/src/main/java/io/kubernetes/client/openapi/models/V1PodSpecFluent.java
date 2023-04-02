package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.util.Collection;
import java.util.Map;
import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import java.util.Iterator;
import io.kubernetes.client.custom.Quantity;
import java.lang.Integer;

 /**
  * Generated
  */
public interface V1PodSpecFluent<A extends V1PodSpecFluent<A>> extends Fluent<A>{
  public Long getActiveDeadlineSeconds();
  public A withActiveDeadlineSeconds(Long activeDeadlineSeconds);
  public Boolean hasActiveDeadlineSeconds();
  
  /**
   * This method has been deprecated, please use method buildAffinity instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1Affinity getAffinity();
  public V1Affinity buildAffinity();
  public A withAffinity(V1Affinity affinity);
  public Boolean hasAffinity();
  public V1PodSpecFluent.AffinityNested<A> withNewAffinity();
  public V1PodSpecFluent.AffinityNested<A> withNewAffinityLike(V1Affinity item);
  public V1PodSpecFluent.AffinityNested<A> editAffinity();
  public V1PodSpecFluent.AffinityNested<A> editOrNewAffinity();
  public V1PodSpecFluent.AffinityNested<A> editOrNewAffinityLike(V1Affinity item);
  public Boolean getAutomountServiceAccountToken();
  public A withAutomountServiceAccountToken(Boolean automountServiceAccountToken);
  public Boolean hasAutomountServiceAccountToken();
  public A addToContainers(Integer index,V1Container item);
  public A setToContainers(Integer index,V1Container item);
  public A addToContainers(io.kubernetes.client.openapi.models.V1Container... items);
  public A addAllToContainers(Collection<V1Container> items);
  public A removeFromContainers(io.kubernetes.client.openapi.models.V1Container... items);
  public A removeAllFromContainers(Collection<V1Container> items);
  public A removeMatchingFromContainers(Predicate<V1ContainerBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildContainers instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Container> getContainers();
  public List<V1Container> buildContainers();
  public V1Container buildContainer(Integer index);
  public V1Container buildFirstContainer();
  public V1Container buildLastContainer();
  public V1Container buildMatchingContainer(Predicate<V1ContainerBuilder> predicate);
  public Boolean hasMatchingContainer(Predicate<V1ContainerBuilder> predicate);
  public A withContainers(List<V1Container> containers);
  public A withContainers(io.kubernetes.client.openapi.models.V1Container... containers);
  public Boolean hasContainers();
  public V1PodSpecFluent.ContainersNested<A> addNewContainer();
  public V1PodSpecFluent.ContainersNested<A> addNewContainerLike(V1Container item);
  public V1PodSpecFluent.ContainersNested<A> setNewContainerLike(Integer index,V1Container item);
  public V1PodSpecFluent.ContainersNested<A> editContainer(Integer index);
  public V1PodSpecFluent.ContainersNested<A> editFirstContainer();
  public V1PodSpecFluent.ContainersNested<A> editLastContainer();
  public V1PodSpecFluent.ContainersNested<A> editMatchingContainer(Predicate<V1ContainerBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildDnsConfig instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodDNSConfig getDnsConfig();
  public V1PodDNSConfig buildDnsConfig();
  public A withDnsConfig(V1PodDNSConfig dnsConfig);
  public Boolean hasDnsConfig();
  public V1PodSpecFluent.DnsConfigNested<A> withNewDnsConfig();
  public V1PodSpecFluent.DnsConfigNested<A> withNewDnsConfigLike(V1PodDNSConfig item);
  public V1PodSpecFluent.DnsConfigNested<A> editDnsConfig();
  public V1PodSpecFluent.DnsConfigNested<A> editOrNewDnsConfig();
  public V1PodSpecFluent.DnsConfigNested<A> editOrNewDnsConfigLike(V1PodDNSConfig item);
  public String getDnsPolicy();
  public A withDnsPolicy(String dnsPolicy);
  public Boolean hasDnsPolicy();
  public Boolean getEnableServiceLinks();
  public A withEnableServiceLinks(Boolean enableServiceLinks);
  public Boolean hasEnableServiceLinks();
  public A addToEphemeralContainers(Integer index,V1EphemeralContainer item);
  public A setToEphemeralContainers(Integer index,V1EphemeralContainer item);
  public A addToEphemeralContainers(io.kubernetes.client.openapi.models.V1EphemeralContainer... items);
  public A addAllToEphemeralContainers(Collection<V1EphemeralContainer> items);
  public A removeFromEphemeralContainers(io.kubernetes.client.openapi.models.V1EphemeralContainer... items);
  public A removeAllFromEphemeralContainers(Collection<V1EphemeralContainer> items);
  public A removeMatchingFromEphemeralContainers(Predicate<V1EphemeralContainerBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildEphemeralContainers instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1EphemeralContainer> getEphemeralContainers();
  public List<V1EphemeralContainer> buildEphemeralContainers();
  public V1EphemeralContainer buildEphemeralContainer(Integer index);
  public V1EphemeralContainer buildFirstEphemeralContainer();
  public V1EphemeralContainer buildLastEphemeralContainer();
  public V1EphemeralContainer buildMatchingEphemeralContainer(Predicate<V1EphemeralContainerBuilder> predicate);
  public Boolean hasMatchingEphemeralContainer(Predicate<V1EphemeralContainerBuilder> predicate);
  public A withEphemeralContainers(List<V1EphemeralContainer> ephemeralContainers);
  public A withEphemeralContainers(io.kubernetes.client.openapi.models.V1EphemeralContainer... ephemeralContainers);
  public Boolean hasEphemeralContainers();
  public V1PodSpecFluent.EphemeralContainersNested<A> addNewEphemeralContainer();
  public V1PodSpecFluent.EphemeralContainersNested<A> addNewEphemeralContainerLike(V1EphemeralContainer item);
  public V1PodSpecFluent.EphemeralContainersNested<A> setNewEphemeralContainerLike(Integer index,V1EphemeralContainer item);
  public V1PodSpecFluent.EphemeralContainersNested<A> editEphemeralContainer(Integer index);
  public V1PodSpecFluent.EphemeralContainersNested<A> editFirstEphemeralContainer();
  public V1PodSpecFluent.EphemeralContainersNested<A> editLastEphemeralContainer();
  public V1PodSpecFluent.EphemeralContainersNested<A> editMatchingEphemeralContainer(Predicate<V1EphemeralContainerBuilder> predicate);
  public A addToHostAliases(Integer index,V1HostAlias item);
  public A setToHostAliases(Integer index,V1HostAlias item);
  public A addToHostAliases(io.kubernetes.client.openapi.models.V1HostAlias... items);
  public A addAllToHostAliases(Collection<V1HostAlias> items);
  public A removeFromHostAliases(io.kubernetes.client.openapi.models.V1HostAlias... items);
  public A removeAllFromHostAliases(Collection<V1HostAlias> items);
  public A removeMatchingFromHostAliases(Predicate<V1HostAliasBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildHostAliases instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1HostAlias> getHostAliases();
  public List<V1HostAlias> buildHostAliases();
  public V1HostAlias buildHostAlias(Integer index);
  public V1HostAlias buildFirstHostAlias();
  public V1HostAlias buildLastHostAlias();
  public V1HostAlias buildMatchingHostAlias(Predicate<V1HostAliasBuilder> predicate);
  public Boolean hasMatchingHostAlias(Predicate<V1HostAliasBuilder> predicate);
  public A withHostAliases(List<V1HostAlias> hostAliases);
  public A withHostAliases(io.kubernetes.client.openapi.models.V1HostAlias... hostAliases);
  public Boolean hasHostAliases();
  public V1PodSpecFluent.HostAliasesNested<A> addNewHostAlias();
  public V1PodSpecFluent.HostAliasesNested<A> addNewHostAliasLike(V1HostAlias item);
  public V1PodSpecFluent.HostAliasesNested<A> setNewHostAliasLike(Integer index,V1HostAlias item);
  public V1PodSpecFluent.HostAliasesNested<A> editHostAlias(Integer index);
  public V1PodSpecFluent.HostAliasesNested<A> editFirstHostAlias();
  public V1PodSpecFluent.HostAliasesNested<A> editLastHostAlias();
  public V1PodSpecFluent.HostAliasesNested<A> editMatchingHostAlias(Predicate<V1HostAliasBuilder> predicate);
  public Boolean getHostIPC();
  public A withHostIPC(Boolean hostIPC);
  public Boolean hasHostIPC();
  public Boolean getHostNetwork();
  public A withHostNetwork(Boolean hostNetwork);
  public Boolean hasHostNetwork();
  public Boolean getHostPID();
  public A withHostPID(Boolean hostPID);
  public Boolean hasHostPID();
  public Boolean getHostUsers();
  public A withHostUsers(Boolean hostUsers);
  public Boolean hasHostUsers();
  public String getHostname();
  public A withHostname(String hostname);
  public Boolean hasHostname();
  public A addToImagePullSecrets(Integer index,V1LocalObjectReference item);
  public A setToImagePullSecrets(Integer index,V1LocalObjectReference item);
  public A addToImagePullSecrets(io.kubernetes.client.openapi.models.V1LocalObjectReference... items);
  public A addAllToImagePullSecrets(Collection<V1LocalObjectReference> items);
  public A removeFromImagePullSecrets(io.kubernetes.client.openapi.models.V1LocalObjectReference... items);
  public A removeAllFromImagePullSecrets(Collection<V1LocalObjectReference> items);
  public A removeMatchingFromImagePullSecrets(Predicate<V1LocalObjectReferenceBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildImagePullSecrets instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1LocalObjectReference> getImagePullSecrets();
  public List<V1LocalObjectReference> buildImagePullSecrets();
  public V1LocalObjectReference buildImagePullSecret(Integer index);
  public V1LocalObjectReference buildFirstImagePullSecret();
  public V1LocalObjectReference buildLastImagePullSecret();
  public V1LocalObjectReference buildMatchingImagePullSecret(Predicate<V1LocalObjectReferenceBuilder> predicate);
  public Boolean hasMatchingImagePullSecret(Predicate<V1LocalObjectReferenceBuilder> predicate);
  public A withImagePullSecrets(List<V1LocalObjectReference> imagePullSecrets);
  public A withImagePullSecrets(io.kubernetes.client.openapi.models.V1LocalObjectReference... imagePullSecrets);
  public Boolean hasImagePullSecrets();
  public V1PodSpecFluent.ImagePullSecretsNested<A> addNewImagePullSecret();
  public V1PodSpecFluent.ImagePullSecretsNested<A> addNewImagePullSecretLike(V1LocalObjectReference item);
  public V1PodSpecFluent.ImagePullSecretsNested<A> setNewImagePullSecretLike(Integer index,V1LocalObjectReference item);
  public V1PodSpecFluent.ImagePullSecretsNested<A> editImagePullSecret(Integer index);
  public V1PodSpecFluent.ImagePullSecretsNested<A> editFirstImagePullSecret();
  public V1PodSpecFluent.ImagePullSecretsNested<A> editLastImagePullSecret();
  public V1PodSpecFluent.ImagePullSecretsNested<A> editMatchingImagePullSecret(Predicate<V1LocalObjectReferenceBuilder> predicate);
  public A addToInitContainers(Integer index,V1Container item);
  public A setToInitContainers(Integer index,V1Container item);
  public A addToInitContainers(io.kubernetes.client.openapi.models.V1Container... items);
  public A addAllToInitContainers(Collection<V1Container> items);
  public A removeFromInitContainers(io.kubernetes.client.openapi.models.V1Container... items);
  public A removeAllFromInitContainers(Collection<V1Container> items);
  public A removeMatchingFromInitContainers(Predicate<V1ContainerBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildInitContainers instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Container> getInitContainers();
  public List<V1Container> buildInitContainers();
  public V1Container buildInitContainer(Integer index);
  public V1Container buildFirstInitContainer();
  public V1Container buildLastInitContainer();
  public V1Container buildMatchingInitContainer(Predicate<V1ContainerBuilder> predicate);
  public Boolean hasMatchingInitContainer(Predicate<V1ContainerBuilder> predicate);
  public A withInitContainers(List<V1Container> initContainers);
  public A withInitContainers(io.kubernetes.client.openapi.models.V1Container... initContainers);
  public Boolean hasInitContainers();
  public V1PodSpecFluent.InitContainersNested<A> addNewInitContainer();
  public V1PodSpecFluent.InitContainersNested<A> addNewInitContainerLike(V1Container item);
  public V1PodSpecFluent.InitContainersNested<A> setNewInitContainerLike(Integer index,V1Container item);
  public V1PodSpecFluent.InitContainersNested<A> editInitContainer(Integer index);
  public V1PodSpecFluent.InitContainersNested<A> editFirstInitContainer();
  public V1PodSpecFluent.InitContainersNested<A> editLastInitContainer();
  public V1PodSpecFluent.InitContainersNested<A> editMatchingInitContainer(Predicate<V1ContainerBuilder> predicate);
  public String getNodeName();
  public A withNodeName(String nodeName);
  public Boolean hasNodeName();
  public A addToNodeSelector(String key,String value);
  public A addToNodeSelector(Map<String,String> map);
  public A removeFromNodeSelector(String key);
  public A removeFromNodeSelector(Map<String,String> map);
  public Map<String,String> getNodeSelector();
  public <K,V>A withNodeSelector(Map<String,String> nodeSelector);
  public Boolean hasNodeSelector();
  
  /**
   * This method has been deprecated, please use method buildOs instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodOS getOs();
  public V1PodOS buildOs();
  public A withOs(V1PodOS os);
  public Boolean hasOs();
  public V1PodSpecFluent.OsNested<A> withNewOs();
  public V1PodSpecFluent.OsNested<A> withNewOsLike(V1PodOS item);
  public V1PodSpecFluent.OsNested<A> editOs();
  public V1PodSpecFluent.OsNested<A> editOrNewOs();
  public V1PodSpecFluent.OsNested<A> editOrNewOsLike(V1PodOS item);
  public A addToOverhead(String key,Quantity value);
  public A addToOverhead(Map<String,Quantity> map);
  public A removeFromOverhead(String key);
  public A removeFromOverhead(Map<String,Quantity> map);
  public Map<String,Quantity> getOverhead();
  public <K,V>A withOverhead(Map<String,Quantity> overhead);
  public Boolean hasOverhead();
  public String getPreemptionPolicy();
  public A withPreemptionPolicy(String preemptionPolicy);
  public Boolean hasPreemptionPolicy();
  public Integer getPriority();
  public A withPriority(Integer priority);
  public Boolean hasPriority();
  public String getPriorityClassName();
  public A withPriorityClassName(String priorityClassName);
  public Boolean hasPriorityClassName();
  public A addToReadinessGates(Integer index,V1PodReadinessGate item);
  public A setToReadinessGates(Integer index,V1PodReadinessGate item);
  public A addToReadinessGates(io.kubernetes.client.openapi.models.V1PodReadinessGate... items);
  public A addAllToReadinessGates(Collection<V1PodReadinessGate> items);
  public A removeFromReadinessGates(io.kubernetes.client.openapi.models.V1PodReadinessGate... items);
  public A removeAllFromReadinessGates(Collection<V1PodReadinessGate> items);
  public A removeMatchingFromReadinessGates(Predicate<V1PodReadinessGateBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildReadinessGates instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PodReadinessGate> getReadinessGates();
  public List<V1PodReadinessGate> buildReadinessGates();
  public V1PodReadinessGate buildReadinessGate(Integer index);
  public V1PodReadinessGate buildFirstReadinessGate();
  public V1PodReadinessGate buildLastReadinessGate();
  public V1PodReadinessGate buildMatchingReadinessGate(Predicate<V1PodReadinessGateBuilder> predicate);
  public Boolean hasMatchingReadinessGate(Predicate<V1PodReadinessGateBuilder> predicate);
  public A withReadinessGates(List<V1PodReadinessGate> readinessGates);
  public A withReadinessGates(io.kubernetes.client.openapi.models.V1PodReadinessGate... readinessGates);
  public Boolean hasReadinessGates();
  public V1PodSpecFluent.ReadinessGatesNested<A> addNewReadinessGate();
  public V1PodSpecFluent.ReadinessGatesNested<A> addNewReadinessGateLike(V1PodReadinessGate item);
  public V1PodSpecFluent.ReadinessGatesNested<A> setNewReadinessGateLike(Integer index,V1PodReadinessGate item);
  public V1PodSpecFluent.ReadinessGatesNested<A> editReadinessGate(Integer index);
  public V1PodSpecFluent.ReadinessGatesNested<A> editFirstReadinessGate();
  public V1PodSpecFluent.ReadinessGatesNested<A> editLastReadinessGate();
  public V1PodSpecFluent.ReadinessGatesNested<A> editMatchingReadinessGate(Predicate<V1PodReadinessGateBuilder> predicate);
  public String getRestartPolicy();
  public A withRestartPolicy(String restartPolicy);
  public Boolean hasRestartPolicy();
  public String getRuntimeClassName();
  public A withRuntimeClassName(String runtimeClassName);
  public Boolean hasRuntimeClassName();
  public String getSchedulerName();
  public A withSchedulerName(String schedulerName);
  public Boolean hasSchedulerName();
  
  /**
   * This method has been deprecated, please use method buildSecurityContext instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodSecurityContext getSecurityContext();
  public V1PodSecurityContext buildSecurityContext();
  public A withSecurityContext(V1PodSecurityContext securityContext);
  public Boolean hasSecurityContext();
  public V1PodSpecFluent.SecurityContextNested<A> withNewSecurityContext();
  public V1PodSpecFluent.SecurityContextNested<A> withNewSecurityContextLike(V1PodSecurityContext item);
  public V1PodSpecFluent.SecurityContextNested<A> editSecurityContext();
  public V1PodSpecFluent.SecurityContextNested<A> editOrNewSecurityContext();
  public V1PodSpecFluent.SecurityContextNested<A> editOrNewSecurityContextLike(V1PodSecurityContext item);
  public String getServiceAccount();
  public A withServiceAccount(String serviceAccount);
  public Boolean hasServiceAccount();
  public String getServiceAccountName();
  public A withServiceAccountName(String serviceAccountName);
  public Boolean hasServiceAccountName();
  public Boolean getSetHostnameAsFQDN();
  public A withSetHostnameAsFQDN(Boolean setHostnameAsFQDN);
  public Boolean hasSetHostnameAsFQDN();
  public Boolean getShareProcessNamespace();
  public A withShareProcessNamespace(Boolean shareProcessNamespace);
  public Boolean hasShareProcessNamespace();
  public String getSubdomain();
  public A withSubdomain(String subdomain);
  public Boolean hasSubdomain();
  public Long getTerminationGracePeriodSeconds();
  public A withTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds);
  public Boolean hasTerminationGracePeriodSeconds();
  public A addToTolerations(Integer index,V1Toleration item);
  public A setToTolerations(Integer index,V1Toleration item);
  public A addToTolerations(io.kubernetes.client.openapi.models.V1Toleration... items);
  public A addAllToTolerations(Collection<V1Toleration> items);
  public A removeFromTolerations(io.kubernetes.client.openapi.models.V1Toleration... items);
  public A removeAllFromTolerations(Collection<V1Toleration> items);
  public A removeMatchingFromTolerations(Predicate<V1TolerationBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildTolerations instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Toleration> getTolerations();
  public List<V1Toleration> buildTolerations();
  public V1Toleration buildToleration(Integer index);
  public V1Toleration buildFirstToleration();
  public V1Toleration buildLastToleration();
  public V1Toleration buildMatchingToleration(Predicate<V1TolerationBuilder> predicate);
  public Boolean hasMatchingToleration(Predicate<V1TolerationBuilder> predicate);
  public A withTolerations(List<V1Toleration> tolerations);
  public A withTolerations(io.kubernetes.client.openapi.models.V1Toleration... tolerations);
  public Boolean hasTolerations();
  public V1PodSpecFluent.TolerationsNested<A> addNewToleration();
  public V1PodSpecFluent.TolerationsNested<A> addNewTolerationLike(V1Toleration item);
  public V1PodSpecFluent.TolerationsNested<A> setNewTolerationLike(Integer index,V1Toleration item);
  public V1PodSpecFluent.TolerationsNested<A> editToleration(Integer index);
  public V1PodSpecFluent.TolerationsNested<A> editFirstToleration();
  public V1PodSpecFluent.TolerationsNested<A> editLastToleration();
  public V1PodSpecFluent.TolerationsNested<A> editMatchingToleration(Predicate<V1TolerationBuilder> predicate);
  public A addToTopologySpreadConstraints(Integer index,V1TopologySpreadConstraint item);
  public A setToTopologySpreadConstraints(Integer index,V1TopologySpreadConstraint item);
  public A addToTopologySpreadConstraints(io.kubernetes.client.openapi.models.V1TopologySpreadConstraint... items);
  public A addAllToTopologySpreadConstraints(Collection<V1TopologySpreadConstraint> items);
  public A removeFromTopologySpreadConstraints(io.kubernetes.client.openapi.models.V1TopologySpreadConstraint... items);
  public A removeAllFromTopologySpreadConstraints(Collection<V1TopologySpreadConstraint> items);
  public A removeMatchingFromTopologySpreadConstraints(Predicate<V1TopologySpreadConstraintBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildTopologySpreadConstraints instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1TopologySpreadConstraint> getTopologySpreadConstraints();
  public List<V1TopologySpreadConstraint> buildTopologySpreadConstraints();
  public V1TopologySpreadConstraint buildTopologySpreadConstraint(Integer index);
  public V1TopologySpreadConstraint buildFirstTopologySpreadConstraint();
  public V1TopologySpreadConstraint buildLastTopologySpreadConstraint();
  public V1TopologySpreadConstraint buildMatchingTopologySpreadConstraint(Predicate<V1TopologySpreadConstraintBuilder> predicate);
  public Boolean hasMatchingTopologySpreadConstraint(Predicate<V1TopologySpreadConstraintBuilder> predicate);
  public A withTopologySpreadConstraints(List<V1TopologySpreadConstraint> topologySpreadConstraints);
  public A withTopologySpreadConstraints(io.kubernetes.client.openapi.models.V1TopologySpreadConstraint... topologySpreadConstraints);
  public Boolean hasTopologySpreadConstraints();
  public V1PodSpecFluent.TopologySpreadConstraintsNested<A> addNewTopologySpreadConstraint();
  public V1PodSpecFluent.TopologySpreadConstraintsNested<A> addNewTopologySpreadConstraintLike(V1TopologySpreadConstraint item);
  public V1PodSpecFluent.TopologySpreadConstraintsNested<A> setNewTopologySpreadConstraintLike(Integer index,V1TopologySpreadConstraint item);
  public V1PodSpecFluent.TopologySpreadConstraintsNested<A> editTopologySpreadConstraint(Integer index);
  public V1PodSpecFluent.TopologySpreadConstraintsNested<A> editFirstTopologySpreadConstraint();
  public V1PodSpecFluent.TopologySpreadConstraintsNested<A> editLastTopologySpreadConstraint();
  public V1PodSpecFluent.TopologySpreadConstraintsNested<A> editMatchingTopologySpreadConstraint(Predicate<V1TopologySpreadConstraintBuilder> predicate);
  public A addToVolumes(Integer index,V1Volume item);
  public A setToVolumes(Integer index,V1Volume item);
  public A addToVolumes(io.kubernetes.client.openapi.models.V1Volume... items);
  public A addAllToVolumes(Collection<V1Volume> items);
  public A removeFromVolumes(io.kubernetes.client.openapi.models.V1Volume... items);
  public A removeAllFromVolumes(Collection<V1Volume> items);
  public A removeMatchingFromVolumes(Predicate<V1VolumeBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildVolumes instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Volume> getVolumes();
  public List<V1Volume> buildVolumes();
  public V1Volume buildVolume(Integer index);
  public V1Volume buildFirstVolume();
  public V1Volume buildLastVolume();
  public V1Volume buildMatchingVolume(Predicate<V1VolumeBuilder> predicate);
  public Boolean hasMatchingVolume(Predicate<V1VolumeBuilder> predicate);
  public A withVolumes(List<V1Volume> volumes);
  public A withVolumes(io.kubernetes.client.openapi.models.V1Volume... volumes);
  public Boolean hasVolumes();
  public V1PodSpecFluent.VolumesNested<A> addNewVolume();
  public V1PodSpecFluent.VolumesNested<A> addNewVolumeLike(V1Volume item);
  public V1PodSpecFluent.VolumesNested<A> setNewVolumeLike(Integer index,V1Volume item);
  public V1PodSpecFluent.VolumesNested<A> editVolume(Integer index);
  public V1PodSpecFluent.VolumesNested<A> editFirstVolume();
  public V1PodSpecFluent.VolumesNested<A> editLastVolume();
  public V1PodSpecFluent.VolumesNested<A> editMatchingVolume(Predicate<V1VolumeBuilder> predicate);
  public A withAutomountServiceAccountToken();
  public A withEnableServiceLinks();
  public A withHostIPC();
  public A withHostNetwork();
  public A withHostPID();
  public A withHostUsers();
  public A withSetHostnameAsFQDN();
  public A withShareProcessNamespace();
  public interface AffinityNested<N> extends Nested<N>,V1AffinityFluent<V1PodSpecFluent.AffinityNested<N>>{
    public N and();
    public N endAffinity();
    
  }
  public interface ContainersNested<N> extends Nested<N>,V1ContainerFluent<V1PodSpecFluent.ContainersNested<N>>{
    public N and();
    public N endContainer();
    
  }
  public interface DnsConfigNested<N> extends Nested<N>,V1PodDNSConfigFluent<V1PodSpecFluent.DnsConfigNested<N>>{
    public N and();
    public N endDnsConfig();
    
  }
  public interface EphemeralContainersNested<N> extends Nested<N>,V1EphemeralContainerFluent<V1PodSpecFluent.EphemeralContainersNested<N>>{
    public N and();
    public N endEphemeralContainer();
    
  }
  public interface HostAliasesNested<N> extends Nested<N>,V1HostAliasFluent<V1PodSpecFluent.HostAliasesNested<N>>{
    public N and();
    public N endHostAlias();
    
  }
  public interface ImagePullSecretsNested<N> extends Nested<N>,V1LocalObjectReferenceFluent<V1PodSpecFluent.ImagePullSecretsNested<N>>{
    public N and();
    public N endImagePullSecret();
    
  }
  public interface InitContainersNested<N> extends Nested<N>,V1ContainerFluent<V1PodSpecFluent.InitContainersNested<N>>{
    public N and();
    public N endInitContainer();
    
  }
  public interface OsNested<N> extends Nested<N>,V1PodOSFluent<V1PodSpecFluent.OsNested<N>>{
    public N and();
    public N endOs();
    
  }
  public interface ReadinessGatesNested<N> extends Nested<N>,V1PodReadinessGateFluent<V1PodSpecFluent.ReadinessGatesNested<N>>{
    public N and();
    public N endReadinessGate();
    
  }
  public interface SecurityContextNested<N> extends Nested<N>,V1PodSecurityContextFluent<V1PodSpecFluent.SecurityContextNested<N>>{
    public N and();
    public N endSecurityContext();
    
  }
  public interface TolerationsNested<N> extends Nested<N>,V1TolerationFluent<V1PodSpecFluent.TolerationsNested<N>>{
    public N and();
    public N endToleration();
    
  }
  public interface TopologySpreadConstraintsNested<N> extends Nested<N>,V1TopologySpreadConstraintFluent<V1PodSpecFluent.TopologySpreadConstraintsNested<N>>{
    public N and();
    public N endTopologySpreadConstraint();
    
  }
  public interface VolumesNested<N> extends Nested<N>,V1VolumeFluent<V1PodSpecFluent.VolumesNested<N>>{
    public N and();
    public N endVolume();
    
  }
  
}