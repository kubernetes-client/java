package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import java.util.Iterator;
import io.kubernetes.client.custom.Quantity;
import java.lang.Integer;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1PodSpecFluentImpl<A extends V1PodSpecFluent<A>> extends BaseFluent<A> implements V1PodSpecFluent<A>{
  public V1PodSpecFluentImpl() {
  }
  public V1PodSpecFluentImpl(V1PodSpec instance) {
    this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds());

    this.withAffinity(instance.getAffinity());

    this.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken());

    this.withContainers(instance.getContainers());

    this.withDnsConfig(instance.getDnsConfig());

    this.withDnsPolicy(instance.getDnsPolicy());

    this.withEnableServiceLinks(instance.getEnableServiceLinks());

    this.withEphemeralContainers(instance.getEphemeralContainers());

    this.withHostAliases(instance.getHostAliases());

    this.withHostIPC(instance.getHostIPC());

    this.withHostNetwork(instance.getHostNetwork());

    this.withHostPID(instance.getHostPID());

    this.withHostUsers(instance.getHostUsers());

    this.withHostname(instance.getHostname());

    this.withImagePullSecrets(instance.getImagePullSecrets());

    this.withInitContainers(instance.getInitContainers());

    this.withNodeName(instance.getNodeName());

    this.withNodeSelector(instance.getNodeSelector());

    this.withOs(instance.getOs());

    this.withOverhead(instance.getOverhead());

    this.withPreemptionPolicy(instance.getPreemptionPolicy());

    this.withPriority(instance.getPriority());

    this.withPriorityClassName(instance.getPriorityClassName());

    this.withReadinessGates(instance.getReadinessGates());

    this.withRestartPolicy(instance.getRestartPolicy());

    this.withRuntimeClassName(instance.getRuntimeClassName());

    this.withSchedulerName(instance.getSchedulerName());

    this.withSecurityContext(instance.getSecurityContext());

    this.withServiceAccount(instance.getServiceAccount());

    this.withServiceAccountName(instance.getServiceAccountName());

    this.withSetHostnameAsFQDN(instance.getSetHostnameAsFQDN());

    this.withShareProcessNamespace(instance.getShareProcessNamespace());

    this.withSubdomain(instance.getSubdomain());

    this.withTerminationGracePeriodSeconds(instance.getTerminationGracePeriodSeconds());

    this.withTolerations(instance.getTolerations());

    this.withTopologySpreadConstraints(instance.getTopologySpreadConstraints());

    this.withVolumes(instance.getVolumes());

  }
  private Long activeDeadlineSeconds;
  private V1AffinityBuilder affinity;
  private Boolean automountServiceAccountToken;
  private ArrayList<V1ContainerBuilder> containers;
  private V1PodDNSConfigBuilder dnsConfig;
  private String dnsPolicy;
  private Boolean enableServiceLinks;
  private ArrayList<V1EphemeralContainerBuilder> ephemeralContainers;
  private ArrayList<V1HostAliasBuilder> hostAliases;
  private Boolean hostIPC;
  private Boolean hostNetwork;
  private Boolean hostPID;
  private Boolean hostUsers;
  private String hostname;
  private ArrayList<V1LocalObjectReferenceBuilder> imagePullSecrets;
  private ArrayList<V1ContainerBuilder> initContainers;
  private String nodeName;
  private Map<String,String> nodeSelector;
  private V1PodOSBuilder os;
  private Map<String,Quantity> overhead;
  private String preemptionPolicy;
  private Integer priority;
  private String priorityClassName;
  private ArrayList<V1PodReadinessGateBuilder> readinessGates;
  private String restartPolicy;
  private String runtimeClassName;
  private String schedulerName;
  private V1PodSecurityContextBuilder securityContext;
  private String serviceAccount;
  private String serviceAccountName;
  private Boolean setHostnameAsFQDN;
  private Boolean shareProcessNamespace;
  private String subdomain;
  private Long terminationGracePeriodSeconds;
  private ArrayList<V1TolerationBuilder> tolerations;
  private ArrayList<V1TopologySpreadConstraintBuilder> topologySpreadConstraints;
  private ArrayList<V1VolumeBuilder> volumes;
  public Long getActiveDeadlineSeconds() {
    return this.activeDeadlineSeconds;
  }
  public A withActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds=activeDeadlineSeconds; return (A) this;
  }
  public Boolean hasActiveDeadlineSeconds() {
    return this.activeDeadlineSeconds != null;
  }
  
  /**
   * This method has been deprecated, please use method buildAffinity instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1Affinity getAffinity() {
    return this.affinity!=null ?this.affinity.build():null;
  }
  public V1Affinity buildAffinity() {
    return this.affinity!=null ?this.affinity.build():null;
  }
  public A withAffinity(V1Affinity affinity) {
    _visitables.get("affinity").remove(this.affinity);
    if (affinity!=null){ this.affinity= new V1AffinityBuilder(affinity); _visitables.get("affinity").add(this.affinity);} else { this.affinity = null; _visitables.get("affinity").remove(this.affinity); } return (A) this;
  }
  public Boolean hasAffinity() {
    return this.affinity != null;
  }
  public V1PodSpecFluent.AffinityNested<A> withNewAffinity() {
    return new V1PodSpecFluentImpl.AffinityNestedImpl();
  }
  public V1PodSpecFluent.AffinityNested<A> withNewAffinityLike(V1Affinity item) {
    return new V1PodSpecFluentImpl.AffinityNestedImpl(item);
  }
  public V1PodSpecFluent.AffinityNested<A> editAffinity() {
    return withNewAffinityLike(getAffinity());
  }
  public V1PodSpecFluent.AffinityNested<A> editOrNewAffinity() {
    return withNewAffinityLike(getAffinity() != null ? getAffinity(): new V1AffinityBuilder().build());
  }
  public V1PodSpecFluent.AffinityNested<A> editOrNewAffinityLike(V1Affinity item) {
    return withNewAffinityLike(getAffinity() != null ? getAffinity(): item);
  }
  public Boolean getAutomountServiceAccountToken() {
    return this.automountServiceAccountToken;
  }
  public A withAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken=automountServiceAccountToken; return (A) this;
  }
  public Boolean hasAutomountServiceAccountToken() {
    return this.automountServiceAccountToken != null;
  }
  public A addToContainers(Integer index,V1Container item) {
    if (this.containers == null) {this.containers = new ArrayList<V1ContainerBuilder>();}
    V1ContainerBuilder builder = new V1ContainerBuilder(item);_visitables.get("containers").add(index >= 0 ? index : _visitables.get("containers").size(), builder);this.containers.add(index >= 0 ? index : containers.size(), builder); return (A)this;
  }
  public A setToContainers(Integer index,V1Container item) {
    if (this.containers == null) {this.containers = new ArrayList<V1ContainerBuilder>();}
    V1ContainerBuilder builder = new V1ContainerBuilder(item);
    if (index < 0 || index >= _visitables.get("containers").size()) { _visitables.get("containers").add(builder); } else { _visitables.get("containers").set(index, builder);}
    if (index < 0 || index >= containers.size()) { containers.add(builder); } else { containers.set(index, builder);}
     return (A)this;
  }
  public A addToContainers(io.kubernetes.client.openapi.models.V1Container... items) {
    if (this.containers == null) {this.containers = new ArrayList<V1ContainerBuilder>();}
    for (V1Container item : items) {V1ContainerBuilder builder = new V1ContainerBuilder(item);_visitables.get("containers").add(builder);this.containers.add(builder);} return (A)this;
  }
  public A addAllToContainers(Collection<V1Container> items) {
    if (this.containers == null) {this.containers = new ArrayList<V1ContainerBuilder>();}
    for (V1Container item : items) {V1ContainerBuilder builder = new V1ContainerBuilder(item);_visitables.get("containers").add(builder);this.containers.add(builder);} return (A)this;
  }
  public A removeFromContainers(io.kubernetes.client.openapi.models.V1Container... items) {
    for (V1Container item : items) {V1ContainerBuilder builder = new V1ContainerBuilder(item);_visitables.get("containers").remove(builder);if (this.containers != null) {this.containers.remove(builder);}} return (A)this;
  }
  public A removeAllFromContainers(Collection<V1Container> items) {
    for (V1Container item : items) {V1ContainerBuilder builder = new V1ContainerBuilder(item);_visitables.get("containers").remove(builder);if (this.containers != null) {this.containers.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromContainers(Predicate<V1ContainerBuilder> predicate) {
    if (containers == null) return (A) this;
    final Iterator<V1ContainerBuilder> each = containers.iterator();
    final List visitables = _visitables.get("containers");
    while (each.hasNext()) {
      V1ContainerBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildContainers instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Container> getContainers() {
    return containers != null ? build(containers) : null;
  }
  public List<V1Container> buildContainers() {
    return containers != null ? build(containers) : null;
  }
  public V1Container buildContainer(Integer index) {
    return this.containers.get(index).build();
  }
  public V1Container buildFirstContainer() {
    return this.containers.get(0).build();
  }
  public V1Container buildLastContainer() {
    return this.containers.get(containers.size() - 1).build();
  }
  public V1Container buildMatchingContainer(Predicate<V1ContainerBuilder> predicate) {
    for (V1ContainerBuilder item: containers) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingContainer(Predicate<V1ContainerBuilder> predicate) {
    for (V1ContainerBuilder item: containers) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withContainers(List<V1Container> containers) {
    if (this.containers != null) { _visitables.get("containers").removeAll(this.containers);}
    if (containers != null) {this.containers = new ArrayList(); for (V1Container item : containers){this.addToContainers(item);}} else { this.containers = null;} return (A) this;
  }
  public A withContainers(io.kubernetes.client.openapi.models.V1Container... containers) {
    if (this.containers != null) {this.containers.clear();}
    if (containers != null) {for (V1Container item :containers){ this.addToContainers(item);}} return (A) this;
  }
  public Boolean hasContainers() {
    return containers != null && !containers.isEmpty();
  }
  public V1PodSpecFluent.ContainersNested<A> addNewContainer() {
    return new V1PodSpecFluentImpl.ContainersNestedImpl();
  }
  public V1PodSpecFluent.ContainersNested<A> addNewContainerLike(V1Container item) {
    return new V1PodSpecFluentImpl.ContainersNestedImpl(-1, item);
  }
  public V1PodSpecFluent.ContainersNested<A> setNewContainerLike(Integer index,V1Container item) {
    return new V1PodSpecFluentImpl.ContainersNestedImpl(index, item);
  }
  public V1PodSpecFluent.ContainersNested<A> editContainer(Integer index) {
    if (containers.size() <= index) throw new RuntimeException("Can't edit containers. Index exceeds size.");
    return setNewContainerLike(index, buildContainer(index));
  }
  public V1PodSpecFluent.ContainersNested<A> editFirstContainer() {
    if (containers.size() == 0) throw new RuntimeException("Can't edit first containers. The list is empty.");
    return setNewContainerLike(0, buildContainer(0));
  }
  public V1PodSpecFluent.ContainersNested<A> editLastContainer() {
    int index = containers.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last containers. The list is empty.");
    return setNewContainerLike(index, buildContainer(index));
  }
  public V1PodSpecFluent.ContainersNested<A> editMatchingContainer(Predicate<V1ContainerBuilder> predicate) {
    int index = -1;
    for (int i=0;i<containers.size();i++) { 
    if (predicate.test(containers.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching containers. No match found.");
    return setNewContainerLike(index, buildContainer(index));
  }
  
  /**
   * This method has been deprecated, please use method buildDnsConfig instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodDNSConfig getDnsConfig() {
    return this.dnsConfig!=null ?this.dnsConfig.build():null;
  }
  public V1PodDNSConfig buildDnsConfig() {
    return this.dnsConfig!=null ?this.dnsConfig.build():null;
  }
  public A withDnsConfig(V1PodDNSConfig dnsConfig) {
    _visitables.get("dnsConfig").remove(this.dnsConfig);
    if (dnsConfig!=null){ this.dnsConfig= new V1PodDNSConfigBuilder(dnsConfig); _visitables.get("dnsConfig").add(this.dnsConfig);} else { this.dnsConfig = null; _visitables.get("dnsConfig").remove(this.dnsConfig); } return (A) this;
  }
  public Boolean hasDnsConfig() {
    return this.dnsConfig != null;
  }
  public V1PodSpecFluent.DnsConfigNested<A> withNewDnsConfig() {
    return new V1PodSpecFluentImpl.DnsConfigNestedImpl();
  }
  public V1PodSpecFluent.DnsConfigNested<A> withNewDnsConfigLike(V1PodDNSConfig item) {
    return new V1PodSpecFluentImpl.DnsConfigNestedImpl(item);
  }
  public V1PodSpecFluent.DnsConfigNested<A> editDnsConfig() {
    return withNewDnsConfigLike(getDnsConfig());
  }
  public V1PodSpecFluent.DnsConfigNested<A> editOrNewDnsConfig() {
    return withNewDnsConfigLike(getDnsConfig() != null ? getDnsConfig(): new V1PodDNSConfigBuilder().build());
  }
  public V1PodSpecFluent.DnsConfigNested<A> editOrNewDnsConfigLike(V1PodDNSConfig item) {
    return withNewDnsConfigLike(getDnsConfig() != null ? getDnsConfig(): item);
  }
  public String getDnsPolicy() {
    return this.dnsPolicy;
  }
  public A withDnsPolicy(String dnsPolicy) {
    this.dnsPolicy=dnsPolicy; return (A) this;
  }
  public Boolean hasDnsPolicy() {
    return this.dnsPolicy != null;
  }
  public Boolean getEnableServiceLinks() {
    return this.enableServiceLinks;
  }
  public A withEnableServiceLinks(Boolean enableServiceLinks) {
    this.enableServiceLinks=enableServiceLinks; return (A) this;
  }
  public Boolean hasEnableServiceLinks() {
    return this.enableServiceLinks != null;
  }
  public A addToEphemeralContainers(Integer index,V1EphemeralContainer item) {
    if (this.ephemeralContainers == null) {this.ephemeralContainers = new ArrayList<V1EphemeralContainerBuilder>();}
    V1EphemeralContainerBuilder builder = new V1EphemeralContainerBuilder(item);_visitables.get("ephemeralContainers").add(index >= 0 ? index : _visitables.get("ephemeralContainers").size(), builder);this.ephemeralContainers.add(index >= 0 ? index : ephemeralContainers.size(), builder); return (A)this;
  }
  public A setToEphemeralContainers(Integer index,V1EphemeralContainer item) {
    if (this.ephemeralContainers == null) {this.ephemeralContainers = new ArrayList<V1EphemeralContainerBuilder>();}
    V1EphemeralContainerBuilder builder = new V1EphemeralContainerBuilder(item);
    if (index < 0 || index >= _visitables.get("ephemeralContainers").size()) { _visitables.get("ephemeralContainers").add(builder); } else { _visitables.get("ephemeralContainers").set(index, builder);}
    if (index < 0 || index >= ephemeralContainers.size()) { ephemeralContainers.add(builder); } else { ephemeralContainers.set(index, builder);}
     return (A)this;
  }
  public A addToEphemeralContainers(io.kubernetes.client.openapi.models.V1EphemeralContainer... items) {
    if (this.ephemeralContainers == null) {this.ephemeralContainers = new ArrayList<V1EphemeralContainerBuilder>();}
    for (V1EphemeralContainer item : items) {V1EphemeralContainerBuilder builder = new V1EphemeralContainerBuilder(item);_visitables.get("ephemeralContainers").add(builder);this.ephemeralContainers.add(builder);} return (A)this;
  }
  public A addAllToEphemeralContainers(Collection<V1EphemeralContainer> items) {
    if (this.ephemeralContainers == null) {this.ephemeralContainers = new ArrayList<V1EphemeralContainerBuilder>();}
    for (V1EphemeralContainer item : items) {V1EphemeralContainerBuilder builder = new V1EphemeralContainerBuilder(item);_visitables.get("ephemeralContainers").add(builder);this.ephemeralContainers.add(builder);} return (A)this;
  }
  public A removeFromEphemeralContainers(io.kubernetes.client.openapi.models.V1EphemeralContainer... items) {
    for (V1EphemeralContainer item : items) {V1EphemeralContainerBuilder builder = new V1EphemeralContainerBuilder(item);_visitables.get("ephemeralContainers").remove(builder);if (this.ephemeralContainers != null) {this.ephemeralContainers.remove(builder);}} return (A)this;
  }
  public A removeAllFromEphemeralContainers(Collection<V1EphemeralContainer> items) {
    for (V1EphemeralContainer item : items) {V1EphemeralContainerBuilder builder = new V1EphemeralContainerBuilder(item);_visitables.get("ephemeralContainers").remove(builder);if (this.ephemeralContainers != null) {this.ephemeralContainers.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromEphemeralContainers(Predicate<V1EphemeralContainerBuilder> predicate) {
    if (ephemeralContainers == null) return (A) this;
    final Iterator<V1EphemeralContainerBuilder> each = ephemeralContainers.iterator();
    final List visitables = _visitables.get("ephemeralContainers");
    while (each.hasNext()) {
      V1EphemeralContainerBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildEphemeralContainers instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1EphemeralContainer> getEphemeralContainers() {
    return ephemeralContainers != null ? build(ephemeralContainers) : null;
  }
  public List<V1EphemeralContainer> buildEphemeralContainers() {
    return ephemeralContainers != null ? build(ephemeralContainers) : null;
  }
  public V1EphemeralContainer buildEphemeralContainer(Integer index) {
    return this.ephemeralContainers.get(index).build();
  }
  public V1EphemeralContainer buildFirstEphemeralContainer() {
    return this.ephemeralContainers.get(0).build();
  }
  public V1EphemeralContainer buildLastEphemeralContainer() {
    return this.ephemeralContainers.get(ephemeralContainers.size() - 1).build();
  }
  public V1EphemeralContainer buildMatchingEphemeralContainer(Predicate<V1EphemeralContainerBuilder> predicate) {
    for (V1EphemeralContainerBuilder item: ephemeralContainers) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingEphemeralContainer(Predicate<V1EphemeralContainerBuilder> predicate) {
    for (V1EphemeralContainerBuilder item: ephemeralContainers) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withEphemeralContainers(List<V1EphemeralContainer> ephemeralContainers) {
    if (this.ephemeralContainers != null) { _visitables.get("ephemeralContainers").removeAll(this.ephemeralContainers);}
    if (ephemeralContainers != null) {this.ephemeralContainers = new ArrayList(); for (V1EphemeralContainer item : ephemeralContainers){this.addToEphemeralContainers(item);}} else { this.ephemeralContainers = null;} return (A) this;
  }
  public A withEphemeralContainers(io.kubernetes.client.openapi.models.V1EphemeralContainer... ephemeralContainers) {
    if (this.ephemeralContainers != null) {this.ephemeralContainers.clear();}
    if (ephemeralContainers != null) {for (V1EphemeralContainer item :ephemeralContainers){ this.addToEphemeralContainers(item);}} return (A) this;
  }
  public Boolean hasEphemeralContainers() {
    return ephemeralContainers != null && !ephemeralContainers.isEmpty();
  }
  public V1PodSpecFluent.EphemeralContainersNested<A> addNewEphemeralContainer() {
    return new V1PodSpecFluentImpl.EphemeralContainersNestedImpl();
  }
  public V1PodSpecFluent.EphemeralContainersNested<A> addNewEphemeralContainerLike(V1EphemeralContainer item) {
    return new V1PodSpecFluentImpl.EphemeralContainersNestedImpl(-1, item);
  }
  public V1PodSpecFluent.EphemeralContainersNested<A> setNewEphemeralContainerLike(Integer index,V1EphemeralContainer item) {
    return new V1PodSpecFluentImpl.EphemeralContainersNestedImpl(index, item);
  }
  public V1PodSpecFluent.EphemeralContainersNested<A> editEphemeralContainer(Integer index) {
    if (ephemeralContainers.size() <= index) throw new RuntimeException("Can't edit ephemeralContainers. Index exceeds size.");
    return setNewEphemeralContainerLike(index, buildEphemeralContainer(index));
  }
  public V1PodSpecFluent.EphemeralContainersNested<A> editFirstEphemeralContainer() {
    if (ephemeralContainers.size() == 0) throw new RuntimeException("Can't edit first ephemeralContainers. The list is empty.");
    return setNewEphemeralContainerLike(0, buildEphemeralContainer(0));
  }
  public V1PodSpecFluent.EphemeralContainersNested<A> editLastEphemeralContainer() {
    int index = ephemeralContainers.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ephemeralContainers. The list is empty.");
    return setNewEphemeralContainerLike(index, buildEphemeralContainer(index));
  }
  public V1PodSpecFluent.EphemeralContainersNested<A> editMatchingEphemeralContainer(Predicate<V1EphemeralContainerBuilder> predicate) {
    int index = -1;
    for (int i=0;i<ephemeralContainers.size();i++) { 
    if (predicate.test(ephemeralContainers.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching ephemeralContainers. No match found.");
    return setNewEphemeralContainerLike(index, buildEphemeralContainer(index));
  }
  public A addToHostAliases(Integer index,V1HostAlias item) {
    if (this.hostAliases == null) {this.hostAliases = new ArrayList<V1HostAliasBuilder>();}
    V1HostAliasBuilder builder = new V1HostAliasBuilder(item);_visitables.get("hostAliases").add(index >= 0 ? index : _visitables.get("hostAliases").size(), builder);this.hostAliases.add(index >= 0 ? index : hostAliases.size(), builder); return (A)this;
  }
  public A setToHostAliases(Integer index,V1HostAlias item) {
    if (this.hostAliases == null) {this.hostAliases = new ArrayList<V1HostAliasBuilder>();}
    V1HostAliasBuilder builder = new V1HostAliasBuilder(item);
    if (index < 0 || index >= _visitables.get("hostAliases").size()) { _visitables.get("hostAliases").add(builder); } else { _visitables.get("hostAliases").set(index, builder);}
    if (index < 0 || index >= hostAliases.size()) { hostAliases.add(builder); } else { hostAliases.set(index, builder);}
     return (A)this;
  }
  public A addToHostAliases(io.kubernetes.client.openapi.models.V1HostAlias... items) {
    if (this.hostAliases == null) {this.hostAliases = new ArrayList<V1HostAliasBuilder>();}
    for (V1HostAlias item : items) {V1HostAliasBuilder builder = new V1HostAliasBuilder(item);_visitables.get("hostAliases").add(builder);this.hostAliases.add(builder);} return (A)this;
  }
  public A addAllToHostAliases(Collection<V1HostAlias> items) {
    if (this.hostAliases == null) {this.hostAliases = new ArrayList<V1HostAliasBuilder>();}
    for (V1HostAlias item : items) {V1HostAliasBuilder builder = new V1HostAliasBuilder(item);_visitables.get("hostAliases").add(builder);this.hostAliases.add(builder);} return (A)this;
  }
  public A removeFromHostAliases(io.kubernetes.client.openapi.models.V1HostAlias... items) {
    for (V1HostAlias item : items) {V1HostAliasBuilder builder = new V1HostAliasBuilder(item);_visitables.get("hostAliases").remove(builder);if (this.hostAliases != null) {this.hostAliases.remove(builder);}} return (A)this;
  }
  public A removeAllFromHostAliases(Collection<V1HostAlias> items) {
    for (V1HostAlias item : items) {V1HostAliasBuilder builder = new V1HostAliasBuilder(item);_visitables.get("hostAliases").remove(builder);if (this.hostAliases != null) {this.hostAliases.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromHostAliases(Predicate<V1HostAliasBuilder> predicate) {
    if (hostAliases == null) return (A) this;
    final Iterator<V1HostAliasBuilder> each = hostAliases.iterator();
    final List visitables = _visitables.get("hostAliases");
    while (each.hasNext()) {
      V1HostAliasBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildHostAliases instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1HostAlias> getHostAliases() {
    return hostAliases != null ? build(hostAliases) : null;
  }
  public List<V1HostAlias> buildHostAliases() {
    return hostAliases != null ? build(hostAliases) : null;
  }
  public V1HostAlias buildHostAlias(Integer index) {
    return this.hostAliases.get(index).build();
  }
  public V1HostAlias buildFirstHostAlias() {
    return this.hostAliases.get(0).build();
  }
  public V1HostAlias buildLastHostAlias() {
    return this.hostAliases.get(hostAliases.size() - 1).build();
  }
  public V1HostAlias buildMatchingHostAlias(Predicate<V1HostAliasBuilder> predicate) {
    for (V1HostAliasBuilder item: hostAliases) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingHostAlias(Predicate<V1HostAliasBuilder> predicate) {
    for (V1HostAliasBuilder item: hostAliases) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withHostAliases(List<V1HostAlias> hostAliases) {
    if (this.hostAliases != null) { _visitables.get("hostAliases").removeAll(this.hostAliases);}
    if (hostAliases != null) {this.hostAliases = new ArrayList(); for (V1HostAlias item : hostAliases){this.addToHostAliases(item);}} else { this.hostAliases = null;} return (A) this;
  }
  public A withHostAliases(io.kubernetes.client.openapi.models.V1HostAlias... hostAliases) {
    if (this.hostAliases != null) {this.hostAliases.clear();}
    if (hostAliases != null) {for (V1HostAlias item :hostAliases){ this.addToHostAliases(item);}} return (A) this;
  }
  public Boolean hasHostAliases() {
    return hostAliases != null && !hostAliases.isEmpty();
  }
  public V1PodSpecFluent.HostAliasesNested<A> addNewHostAlias() {
    return new V1PodSpecFluentImpl.HostAliasesNestedImpl();
  }
  public V1PodSpecFluent.HostAliasesNested<A> addNewHostAliasLike(V1HostAlias item) {
    return new V1PodSpecFluentImpl.HostAliasesNestedImpl(-1, item);
  }
  public V1PodSpecFluent.HostAliasesNested<A> setNewHostAliasLike(Integer index,V1HostAlias item) {
    return new V1PodSpecFluentImpl.HostAliasesNestedImpl(index, item);
  }
  public V1PodSpecFluent.HostAliasesNested<A> editHostAlias(Integer index) {
    if (hostAliases.size() <= index) throw new RuntimeException("Can't edit hostAliases. Index exceeds size.");
    return setNewHostAliasLike(index, buildHostAlias(index));
  }
  public V1PodSpecFluent.HostAliasesNested<A> editFirstHostAlias() {
    if (hostAliases.size() == 0) throw new RuntimeException("Can't edit first hostAliases. The list is empty.");
    return setNewHostAliasLike(0, buildHostAlias(0));
  }
  public V1PodSpecFluent.HostAliasesNested<A> editLastHostAlias() {
    int index = hostAliases.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last hostAliases. The list is empty.");
    return setNewHostAliasLike(index, buildHostAlias(index));
  }
  public V1PodSpecFluent.HostAliasesNested<A> editMatchingHostAlias(Predicate<V1HostAliasBuilder> predicate) {
    int index = -1;
    for (int i=0;i<hostAliases.size();i++) { 
    if (predicate.test(hostAliases.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching hostAliases. No match found.");
    return setNewHostAliasLike(index, buildHostAlias(index));
  }
  public Boolean getHostIPC() {
    return this.hostIPC;
  }
  public A withHostIPC(Boolean hostIPC) {
    this.hostIPC=hostIPC; return (A) this;
  }
  public Boolean hasHostIPC() {
    return this.hostIPC != null;
  }
  public Boolean getHostNetwork() {
    return this.hostNetwork;
  }
  public A withHostNetwork(Boolean hostNetwork) {
    this.hostNetwork=hostNetwork; return (A) this;
  }
  public Boolean hasHostNetwork() {
    return this.hostNetwork != null;
  }
  public Boolean getHostPID() {
    return this.hostPID;
  }
  public A withHostPID(Boolean hostPID) {
    this.hostPID=hostPID; return (A) this;
  }
  public Boolean hasHostPID() {
    return this.hostPID != null;
  }
  public Boolean getHostUsers() {
    return this.hostUsers;
  }
  public A withHostUsers(Boolean hostUsers) {
    this.hostUsers=hostUsers; return (A) this;
  }
  public Boolean hasHostUsers() {
    return this.hostUsers != null;
  }
  public String getHostname() {
    return this.hostname;
  }
  public A withHostname(String hostname) {
    this.hostname=hostname; return (A) this;
  }
  public Boolean hasHostname() {
    return this.hostname != null;
  }
  public A addToImagePullSecrets(Integer index,V1LocalObjectReference item) {
    if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<V1LocalObjectReferenceBuilder>();}
    V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);_visitables.get("imagePullSecrets").add(index >= 0 ? index : _visitables.get("imagePullSecrets").size(), builder);this.imagePullSecrets.add(index >= 0 ? index : imagePullSecrets.size(), builder); return (A)this;
  }
  public A setToImagePullSecrets(Integer index,V1LocalObjectReference item) {
    if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<V1LocalObjectReferenceBuilder>();}
    V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);
    if (index < 0 || index >= _visitables.get("imagePullSecrets").size()) { _visitables.get("imagePullSecrets").add(builder); } else { _visitables.get("imagePullSecrets").set(index, builder);}
    if (index < 0 || index >= imagePullSecrets.size()) { imagePullSecrets.add(builder); } else { imagePullSecrets.set(index, builder);}
     return (A)this;
  }
  public A addToImagePullSecrets(io.kubernetes.client.openapi.models.V1LocalObjectReference... items) {
    if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<V1LocalObjectReferenceBuilder>();}
    for (V1LocalObjectReference item : items) {V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);_visitables.get("imagePullSecrets").add(builder);this.imagePullSecrets.add(builder);} return (A)this;
  }
  public A addAllToImagePullSecrets(Collection<V1LocalObjectReference> items) {
    if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<V1LocalObjectReferenceBuilder>();}
    for (V1LocalObjectReference item : items) {V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);_visitables.get("imagePullSecrets").add(builder);this.imagePullSecrets.add(builder);} return (A)this;
  }
  public A removeFromImagePullSecrets(io.kubernetes.client.openapi.models.V1LocalObjectReference... items) {
    for (V1LocalObjectReference item : items) {V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);_visitables.get("imagePullSecrets").remove(builder);if (this.imagePullSecrets != null) {this.imagePullSecrets.remove(builder);}} return (A)this;
  }
  public A removeAllFromImagePullSecrets(Collection<V1LocalObjectReference> items) {
    for (V1LocalObjectReference item : items) {V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);_visitables.get("imagePullSecrets").remove(builder);if (this.imagePullSecrets != null) {this.imagePullSecrets.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromImagePullSecrets(Predicate<V1LocalObjectReferenceBuilder> predicate) {
    if (imagePullSecrets == null) return (A) this;
    final Iterator<V1LocalObjectReferenceBuilder> each = imagePullSecrets.iterator();
    final List visitables = _visitables.get("imagePullSecrets");
    while (each.hasNext()) {
      V1LocalObjectReferenceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildImagePullSecrets instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets != null ? build(imagePullSecrets) : null;
  }
  public List<V1LocalObjectReference> buildImagePullSecrets() {
    return imagePullSecrets != null ? build(imagePullSecrets) : null;
  }
  public V1LocalObjectReference buildImagePullSecret(Integer index) {
    return this.imagePullSecrets.get(index).build();
  }
  public V1LocalObjectReference buildFirstImagePullSecret() {
    return this.imagePullSecrets.get(0).build();
  }
  public V1LocalObjectReference buildLastImagePullSecret() {
    return this.imagePullSecrets.get(imagePullSecrets.size() - 1).build();
  }
  public V1LocalObjectReference buildMatchingImagePullSecret(Predicate<V1LocalObjectReferenceBuilder> predicate) {
    for (V1LocalObjectReferenceBuilder item: imagePullSecrets) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingImagePullSecret(Predicate<V1LocalObjectReferenceBuilder> predicate) {
    for (V1LocalObjectReferenceBuilder item: imagePullSecrets) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withImagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    if (this.imagePullSecrets != null) { _visitables.get("imagePullSecrets").removeAll(this.imagePullSecrets);}
    if (imagePullSecrets != null) {this.imagePullSecrets = new ArrayList(); for (V1LocalObjectReference item : imagePullSecrets){this.addToImagePullSecrets(item);}} else { this.imagePullSecrets = null;} return (A) this;
  }
  public A withImagePullSecrets(io.kubernetes.client.openapi.models.V1LocalObjectReference... imagePullSecrets) {
    if (this.imagePullSecrets != null) {this.imagePullSecrets.clear();}
    if (imagePullSecrets != null) {for (V1LocalObjectReference item :imagePullSecrets){ this.addToImagePullSecrets(item);}} return (A) this;
  }
  public Boolean hasImagePullSecrets() {
    return imagePullSecrets != null && !imagePullSecrets.isEmpty();
  }
  public V1PodSpecFluent.ImagePullSecretsNested<A> addNewImagePullSecret() {
    return new V1PodSpecFluentImpl.ImagePullSecretsNestedImpl();
  }
  public V1PodSpecFluent.ImagePullSecretsNested<A> addNewImagePullSecretLike(V1LocalObjectReference item) {
    return new V1PodSpecFluentImpl.ImagePullSecretsNestedImpl(-1, item);
  }
  public V1PodSpecFluent.ImagePullSecretsNested<A> setNewImagePullSecretLike(Integer index,V1LocalObjectReference item) {
    return new V1PodSpecFluentImpl.ImagePullSecretsNestedImpl(index, item);
  }
  public V1PodSpecFluent.ImagePullSecretsNested<A> editImagePullSecret(Integer index) {
    if (imagePullSecrets.size() <= index) throw new RuntimeException("Can't edit imagePullSecrets. Index exceeds size.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }
  public V1PodSpecFluent.ImagePullSecretsNested<A> editFirstImagePullSecret() {
    if (imagePullSecrets.size() == 0) throw new RuntimeException("Can't edit first imagePullSecrets. The list is empty.");
    return setNewImagePullSecretLike(0, buildImagePullSecret(0));
  }
  public V1PodSpecFluent.ImagePullSecretsNested<A> editLastImagePullSecret() {
    int index = imagePullSecrets.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last imagePullSecrets. The list is empty.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }
  public V1PodSpecFluent.ImagePullSecretsNested<A> editMatchingImagePullSecret(Predicate<V1LocalObjectReferenceBuilder> predicate) {
    int index = -1;
    for (int i=0;i<imagePullSecrets.size();i++) { 
    if (predicate.test(imagePullSecrets.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching imagePullSecrets. No match found.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }
  public A addToInitContainers(Integer index,V1Container item) {
    if (this.initContainers == null) {this.initContainers = new ArrayList<V1ContainerBuilder>();}
    V1ContainerBuilder builder = new V1ContainerBuilder(item);_visitables.get("initContainers").add(index >= 0 ? index : _visitables.get("initContainers").size(), builder);this.initContainers.add(index >= 0 ? index : initContainers.size(), builder); return (A)this;
  }
  public A setToInitContainers(Integer index,V1Container item) {
    if (this.initContainers == null) {this.initContainers = new ArrayList<V1ContainerBuilder>();}
    V1ContainerBuilder builder = new V1ContainerBuilder(item);
    if (index < 0 || index >= _visitables.get("initContainers").size()) { _visitables.get("initContainers").add(builder); } else { _visitables.get("initContainers").set(index, builder);}
    if (index < 0 || index >= initContainers.size()) { initContainers.add(builder); } else { initContainers.set(index, builder);}
     return (A)this;
  }
  public A addToInitContainers(io.kubernetes.client.openapi.models.V1Container... items) {
    if (this.initContainers == null) {this.initContainers = new ArrayList<V1ContainerBuilder>();}
    for (V1Container item : items) {V1ContainerBuilder builder = new V1ContainerBuilder(item);_visitables.get("initContainers").add(builder);this.initContainers.add(builder);} return (A)this;
  }
  public A addAllToInitContainers(Collection<V1Container> items) {
    if (this.initContainers == null) {this.initContainers = new ArrayList<V1ContainerBuilder>();}
    for (V1Container item : items) {V1ContainerBuilder builder = new V1ContainerBuilder(item);_visitables.get("initContainers").add(builder);this.initContainers.add(builder);} return (A)this;
  }
  public A removeFromInitContainers(io.kubernetes.client.openapi.models.V1Container... items) {
    for (V1Container item : items) {V1ContainerBuilder builder = new V1ContainerBuilder(item);_visitables.get("initContainers").remove(builder);if (this.initContainers != null) {this.initContainers.remove(builder);}} return (A)this;
  }
  public A removeAllFromInitContainers(Collection<V1Container> items) {
    for (V1Container item : items) {V1ContainerBuilder builder = new V1ContainerBuilder(item);_visitables.get("initContainers").remove(builder);if (this.initContainers != null) {this.initContainers.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromInitContainers(Predicate<V1ContainerBuilder> predicate) {
    if (initContainers == null) return (A) this;
    final Iterator<V1ContainerBuilder> each = initContainers.iterator();
    final List visitables = _visitables.get("initContainers");
    while (each.hasNext()) {
      V1ContainerBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildInitContainers instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Container> getInitContainers() {
    return initContainers != null ? build(initContainers) : null;
  }
  public List<V1Container> buildInitContainers() {
    return initContainers != null ? build(initContainers) : null;
  }
  public V1Container buildInitContainer(Integer index) {
    return this.initContainers.get(index).build();
  }
  public V1Container buildFirstInitContainer() {
    return this.initContainers.get(0).build();
  }
  public V1Container buildLastInitContainer() {
    return this.initContainers.get(initContainers.size() - 1).build();
  }
  public V1Container buildMatchingInitContainer(Predicate<V1ContainerBuilder> predicate) {
    for (V1ContainerBuilder item: initContainers) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingInitContainer(Predicate<V1ContainerBuilder> predicate) {
    for (V1ContainerBuilder item: initContainers) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withInitContainers(List<V1Container> initContainers) {
    if (this.initContainers != null) { _visitables.get("initContainers").removeAll(this.initContainers);}
    if (initContainers != null) {this.initContainers = new ArrayList(); for (V1Container item : initContainers){this.addToInitContainers(item);}} else { this.initContainers = null;} return (A) this;
  }
  public A withInitContainers(io.kubernetes.client.openapi.models.V1Container... initContainers) {
    if (this.initContainers != null) {this.initContainers.clear();}
    if (initContainers != null) {for (V1Container item :initContainers){ this.addToInitContainers(item);}} return (A) this;
  }
  public Boolean hasInitContainers() {
    return initContainers != null && !initContainers.isEmpty();
  }
  public V1PodSpecFluent.InitContainersNested<A> addNewInitContainer() {
    return new V1PodSpecFluentImpl.InitContainersNestedImpl();
  }
  public V1PodSpecFluent.InitContainersNested<A> addNewInitContainerLike(V1Container item) {
    return new V1PodSpecFluentImpl.InitContainersNestedImpl(-1, item);
  }
  public V1PodSpecFluent.InitContainersNested<A> setNewInitContainerLike(Integer index,V1Container item) {
    return new V1PodSpecFluentImpl.InitContainersNestedImpl(index, item);
  }
  public V1PodSpecFluent.InitContainersNested<A> editInitContainer(Integer index) {
    if (initContainers.size() <= index) throw new RuntimeException("Can't edit initContainers. Index exceeds size.");
    return setNewInitContainerLike(index, buildInitContainer(index));
  }
  public V1PodSpecFluent.InitContainersNested<A> editFirstInitContainer() {
    if (initContainers.size() == 0) throw new RuntimeException("Can't edit first initContainers. The list is empty.");
    return setNewInitContainerLike(0, buildInitContainer(0));
  }
  public V1PodSpecFluent.InitContainersNested<A> editLastInitContainer() {
    int index = initContainers.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last initContainers. The list is empty.");
    return setNewInitContainerLike(index, buildInitContainer(index));
  }
  public V1PodSpecFluent.InitContainersNested<A> editMatchingInitContainer(Predicate<V1ContainerBuilder> predicate) {
    int index = -1;
    for (int i=0;i<initContainers.size();i++) { 
    if (predicate.test(initContainers.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching initContainers. No match found.");
    return setNewInitContainerLike(index, buildInitContainer(index));
  }
  public String getNodeName() {
    return this.nodeName;
  }
  public A withNodeName(String nodeName) {
    this.nodeName=nodeName; return (A) this;
  }
  public Boolean hasNodeName() {
    return this.nodeName != null;
  }
  public A addToNodeSelector(String key,String value) {
    if(this.nodeSelector == null && key != null && value != null) { this.nodeSelector = new LinkedHashMap(); }
    if(key != null && value != null) {this.nodeSelector.put(key, value);} return (A)this;
  }
  public A addToNodeSelector(Map<String,String> map) {
    if(this.nodeSelector == null && map != null) { this.nodeSelector = new LinkedHashMap(); }
    if(map != null) { this.nodeSelector.putAll(map);} return (A)this;
  }
  public A removeFromNodeSelector(String key) {
    if(this.nodeSelector == null) { return (A) this; }
    if(key != null && this.nodeSelector != null) {this.nodeSelector.remove(key);} return (A)this;
  }
  public A removeFromNodeSelector(Map<String,String> map) {
    if(this.nodeSelector == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.nodeSelector != null){this.nodeSelector.remove(key);}}} return (A)this;
  }
  public Map<String,String> getNodeSelector() {
    return this.nodeSelector;
  }
  public <K,V>A withNodeSelector(Map<String,String> nodeSelector) {
    if (nodeSelector == null) { this.nodeSelector =  null;} else {this.nodeSelector = new LinkedHashMap(nodeSelector);} return (A) this;
  }
  public Boolean hasNodeSelector() {
    return this.nodeSelector != null;
  }
  
  /**
   * This method has been deprecated, please use method buildOs instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodOS getOs() {
    return this.os!=null ?this.os.build():null;
  }
  public V1PodOS buildOs() {
    return this.os!=null ?this.os.build():null;
  }
  public A withOs(V1PodOS os) {
    _visitables.get("os").remove(this.os);
    if (os!=null){ this.os= new V1PodOSBuilder(os); _visitables.get("os").add(this.os);} else { this.os = null; _visitables.get("os").remove(this.os); } return (A) this;
  }
  public Boolean hasOs() {
    return this.os != null;
  }
  public V1PodSpecFluent.OsNested<A> withNewOs() {
    return new V1PodSpecFluentImpl.OsNestedImpl();
  }
  public V1PodSpecFluent.OsNested<A> withNewOsLike(V1PodOS item) {
    return new V1PodSpecFluentImpl.OsNestedImpl(item);
  }
  public V1PodSpecFluent.OsNested<A> editOs() {
    return withNewOsLike(getOs());
  }
  public V1PodSpecFluent.OsNested<A> editOrNewOs() {
    return withNewOsLike(getOs() != null ? getOs(): new V1PodOSBuilder().build());
  }
  public V1PodSpecFluent.OsNested<A> editOrNewOsLike(V1PodOS item) {
    return withNewOsLike(getOs() != null ? getOs(): item);
  }
  public A addToOverhead(String key,Quantity value) {
    if(this.overhead == null && key != null && value != null) { this.overhead = new LinkedHashMap(); }
    if(key != null && value != null) {this.overhead.put(key, value);} return (A)this;
  }
  public A addToOverhead(Map<String,Quantity> map) {
    if(this.overhead == null && map != null) { this.overhead = new LinkedHashMap(); }
    if(map != null) { this.overhead.putAll(map);} return (A)this;
  }
  public A removeFromOverhead(String key) {
    if(this.overhead == null) { return (A) this; }
    if(key != null && this.overhead != null) {this.overhead.remove(key);} return (A)this;
  }
  public A removeFromOverhead(Map<String,Quantity> map) {
    if(this.overhead == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.overhead != null){this.overhead.remove(key);}}} return (A)this;
  }
  public Map<String,Quantity> getOverhead() {
    return this.overhead;
  }
  public <K,V>A withOverhead(Map<String,Quantity> overhead) {
    if (overhead == null) { this.overhead =  null;} else {this.overhead = new LinkedHashMap(overhead);} return (A) this;
  }
  public Boolean hasOverhead() {
    return this.overhead != null;
  }
  public String getPreemptionPolicy() {
    return this.preemptionPolicy;
  }
  public A withPreemptionPolicy(String preemptionPolicy) {
    this.preemptionPolicy=preemptionPolicy; return (A) this;
  }
  public Boolean hasPreemptionPolicy() {
    return this.preemptionPolicy != null;
  }
  public Integer getPriority() {
    return this.priority;
  }
  public A withPriority(Integer priority) {
    this.priority=priority; return (A) this;
  }
  public Boolean hasPriority() {
    return this.priority != null;
  }
  public String getPriorityClassName() {
    return this.priorityClassName;
  }
  public A withPriorityClassName(String priorityClassName) {
    this.priorityClassName=priorityClassName; return (A) this;
  }
  public Boolean hasPriorityClassName() {
    return this.priorityClassName != null;
  }
  public A addToReadinessGates(Integer index,V1PodReadinessGate item) {
    if (this.readinessGates == null) {this.readinessGates = new ArrayList<V1PodReadinessGateBuilder>();}
    V1PodReadinessGateBuilder builder = new V1PodReadinessGateBuilder(item);_visitables.get("readinessGates").add(index >= 0 ? index : _visitables.get("readinessGates").size(), builder);this.readinessGates.add(index >= 0 ? index : readinessGates.size(), builder); return (A)this;
  }
  public A setToReadinessGates(Integer index,V1PodReadinessGate item) {
    if (this.readinessGates == null) {this.readinessGates = new ArrayList<V1PodReadinessGateBuilder>();}
    V1PodReadinessGateBuilder builder = new V1PodReadinessGateBuilder(item);
    if (index < 0 || index >= _visitables.get("readinessGates").size()) { _visitables.get("readinessGates").add(builder); } else { _visitables.get("readinessGates").set(index, builder);}
    if (index < 0 || index >= readinessGates.size()) { readinessGates.add(builder); } else { readinessGates.set(index, builder);}
     return (A)this;
  }
  public A addToReadinessGates(io.kubernetes.client.openapi.models.V1PodReadinessGate... items) {
    if (this.readinessGates == null) {this.readinessGates = new ArrayList<V1PodReadinessGateBuilder>();}
    for (V1PodReadinessGate item : items) {V1PodReadinessGateBuilder builder = new V1PodReadinessGateBuilder(item);_visitables.get("readinessGates").add(builder);this.readinessGates.add(builder);} return (A)this;
  }
  public A addAllToReadinessGates(Collection<V1PodReadinessGate> items) {
    if (this.readinessGates == null) {this.readinessGates = new ArrayList<V1PodReadinessGateBuilder>();}
    for (V1PodReadinessGate item : items) {V1PodReadinessGateBuilder builder = new V1PodReadinessGateBuilder(item);_visitables.get("readinessGates").add(builder);this.readinessGates.add(builder);} return (A)this;
  }
  public A removeFromReadinessGates(io.kubernetes.client.openapi.models.V1PodReadinessGate... items) {
    for (V1PodReadinessGate item : items) {V1PodReadinessGateBuilder builder = new V1PodReadinessGateBuilder(item);_visitables.get("readinessGates").remove(builder);if (this.readinessGates != null) {this.readinessGates.remove(builder);}} return (A)this;
  }
  public A removeAllFromReadinessGates(Collection<V1PodReadinessGate> items) {
    for (V1PodReadinessGate item : items) {V1PodReadinessGateBuilder builder = new V1PodReadinessGateBuilder(item);_visitables.get("readinessGates").remove(builder);if (this.readinessGates != null) {this.readinessGates.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromReadinessGates(Predicate<V1PodReadinessGateBuilder> predicate) {
    if (readinessGates == null) return (A) this;
    final Iterator<V1PodReadinessGateBuilder> each = readinessGates.iterator();
    final List visitables = _visitables.get("readinessGates");
    while (each.hasNext()) {
      V1PodReadinessGateBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildReadinessGates instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PodReadinessGate> getReadinessGates() {
    return readinessGates != null ? build(readinessGates) : null;
  }
  public List<V1PodReadinessGate> buildReadinessGates() {
    return readinessGates != null ? build(readinessGates) : null;
  }
  public V1PodReadinessGate buildReadinessGate(Integer index) {
    return this.readinessGates.get(index).build();
  }
  public V1PodReadinessGate buildFirstReadinessGate() {
    return this.readinessGates.get(0).build();
  }
  public V1PodReadinessGate buildLastReadinessGate() {
    return this.readinessGates.get(readinessGates.size() - 1).build();
  }
  public V1PodReadinessGate buildMatchingReadinessGate(Predicate<V1PodReadinessGateBuilder> predicate) {
    for (V1PodReadinessGateBuilder item: readinessGates) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingReadinessGate(Predicate<V1PodReadinessGateBuilder> predicate) {
    for (V1PodReadinessGateBuilder item: readinessGates) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withReadinessGates(List<V1PodReadinessGate> readinessGates) {
    if (this.readinessGates != null) { _visitables.get("readinessGates").removeAll(this.readinessGates);}
    if (readinessGates != null) {this.readinessGates = new ArrayList(); for (V1PodReadinessGate item : readinessGates){this.addToReadinessGates(item);}} else { this.readinessGates = null;} return (A) this;
  }
  public A withReadinessGates(io.kubernetes.client.openapi.models.V1PodReadinessGate... readinessGates) {
    if (this.readinessGates != null) {this.readinessGates.clear();}
    if (readinessGates != null) {for (V1PodReadinessGate item :readinessGates){ this.addToReadinessGates(item);}} return (A) this;
  }
  public Boolean hasReadinessGates() {
    return readinessGates != null && !readinessGates.isEmpty();
  }
  public V1PodSpecFluent.ReadinessGatesNested<A> addNewReadinessGate() {
    return new V1PodSpecFluentImpl.ReadinessGatesNestedImpl();
  }
  public V1PodSpecFluent.ReadinessGatesNested<A> addNewReadinessGateLike(V1PodReadinessGate item) {
    return new V1PodSpecFluentImpl.ReadinessGatesNestedImpl(-1, item);
  }
  public V1PodSpecFluent.ReadinessGatesNested<A> setNewReadinessGateLike(Integer index,V1PodReadinessGate item) {
    return new V1PodSpecFluentImpl.ReadinessGatesNestedImpl(index, item);
  }
  public V1PodSpecFluent.ReadinessGatesNested<A> editReadinessGate(Integer index) {
    if (readinessGates.size() <= index) throw new RuntimeException("Can't edit readinessGates. Index exceeds size.");
    return setNewReadinessGateLike(index, buildReadinessGate(index));
  }
  public V1PodSpecFluent.ReadinessGatesNested<A> editFirstReadinessGate() {
    if (readinessGates.size() == 0) throw new RuntimeException("Can't edit first readinessGates. The list is empty.");
    return setNewReadinessGateLike(0, buildReadinessGate(0));
  }
  public V1PodSpecFluent.ReadinessGatesNested<A> editLastReadinessGate() {
    int index = readinessGates.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last readinessGates. The list is empty.");
    return setNewReadinessGateLike(index, buildReadinessGate(index));
  }
  public V1PodSpecFluent.ReadinessGatesNested<A> editMatchingReadinessGate(Predicate<V1PodReadinessGateBuilder> predicate) {
    int index = -1;
    for (int i=0;i<readinessGates.size();i++) { 
    if (predicate.test(readinessGates.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching readinessGates. No match found.");
    return setNewReadinessGateLike(index, buildReadinessGate(index));
  }
  public String getRestartPolicy() {
    return this.restartPolicy;
  }
  public A withRestartPolicy(String restartPolicy) {
    this.restartPolicy=restartPolicy; return (A) this;
  }
  public Boolean hasRestartPolicy() {
    return this.restartPolicy != null;
  }
  public String getRuntimeClassName() {
    return this.runtimeClassName;
  }
  public A withRuntimeClassName(String runtimeClassName) {
    this.runtimeClassName=runtimeClassName; return (A) this;
  }
  public Boolean hasRuntimeClassName() {
    return this.runtimeClassName != null;
  }
  public String getSchedulerName() {
    return this.schedulerName;
  }
  public A withSchedulerName(String schedulerName) {
    this.schedulerName=schedulerName; return (A) this;
  }
  public Boolean hasSchedulerName() {
    return this.schedulerName != null;
  }
  
  /**
   * This method has been deprecated, please use method buildSecurityContext instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodSecurityContext getSecurityContext() {
    return this.securityContext!=null ?this.securityContext.build():null;
  }
  public V1PodSecurityContext buildSecurityContext() {
    return this.securityContext!=null ?this.securityContext.build():null;
  }
  public A withSecurityContext(V1PodSecurityContext securityContext) {
    _visitables.get("securityContext").remove(this.securityContext);
    if (securityContext!=null){ this.securityContext= new V1PodSecurityContextBuilder(securityContext); _visitables.get("securityContext").add(this.securityContext);} else { this.securityContext = null; _visitables.get("securityContext").remove(this.securityContext); } return (A) this;
  }
  public Boolean hasSecurityContext() {
    return this.securityContext != null;
  }
  public V1PodSpecFluent.SecurityContextNested<A> withNewSecurityContext() {
    return new V1PodSpecFluentImpl.SecurityContextNestedImpl();
  }
  public V1PodSpecFluent.SecurityContextNested<A> withNewSecurityContextLike(V1PodSecurityContext item) {
    return new V1PodSpecFluentImpl.SecurityContextNestedImpl(item);
  }
  public V1PodSpecFluent.SecurityContextNested<A> editSecurityContext() {
    return withNewSecurityContextLike(getSecurityContext());
  }
  public V1PodSpecFluent.SecurityContextNested<A> editOrNewSecurityContext() {
    return withNewSecurityContextLike(getSecurityContext() != null ? getSecurityContext(): new V1PodSecurityContextBuilder().build());
  }
  public V1PodSpecFluent.SecurityContextNested<A> editOrNewSecurityContextLike(V1PodSecurityContext item) {
    return withNewSecurityContextLike(getSecurityContext() != null ? getSecurityContext(): item);
  }
  public String getServiceAccount() {
    return this.serviceAccount;
  }
  public A withServiceAccount(String serviceAccount) {
    this.serviceAccount=serviceAccount; return (A) this;
  }
  public Boolean hasServiceAccount() {
    return this.serviceAccount != null;
  }
  public String getServiceAccountName() {
    return this.serviceAccountName;
  }
  public A withServiceAccountName(String serviceAccountName) {
    this.serviceAccountName=serviceAccountName; return (A) this;
  }
  public Boolean hasServiceAccountName() {
    return this.serviceAccountName != null;
  }
  public Boolean getSetHostnameAsFQDN() {
    return this.setHostnameAsFQDN;
  }
  public A withSetHostnameAsFQDN(Boolean setHostnameAsFQDN) {
    this.setHostnameAsFQDN=setHostnameAsFQDN; return (A) this;
  }
  public Boolean hasSetHostnameAsFQDN() {
    return this.setHostnameAsFQDN != null;
  }
  public Boolean getShareProcessNamespace() {
    return this.shareProcessNamespace;
  }
  public A withShareProcessNamespace(Boolean shareProcessNamespace) {
    this.shareProcessNamespace=shareProcessNamespace; return (A) this;
  }
  public Boolean hasShareProcessNamespace() {
    return this.shareProcessNamespace != null;
  }
  public String getSubdomain() {
    return this.subdomain;
  }
  public A withSubdomain(String subdomain) {
    this.subdomain=subdomain; return (A) this;
  }
  public Boolean hasSubdomain() {
    return this.subdomain != null;
  }
  public Long getTerminationGracePeriodSeconds() {
    return this.terminationGracePeriodSeconds;
  }
  public A withTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds=terminationGracePeriodSeconds; return (A) this;
  }
  public Boolean hasTerminationGracePeriodSeconds() {
    return this.terminationGracePeriodSeconds != null;
  }
  public A addToTolerations(Integer index,V1Toleration item) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<V1TolerationBuilder>();}
    V1TolerationBuilder builder = new V1TolerationBuilder(item);_visitables.get("tolerations").add(index >= 0 ? index : _visitables.get("tolerations").size(), builder);this.tolerations.add(index >= 0 ? index : tolerations.size(), builder); return (A)this;
  }
  public A setToTolerations(Integer index,V1Toleration item) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<V1TolerationBuilder>();}
    V1TolerationBuilder builder = new V1TolerationBuilder(item);
    if (index < 0 || index >= _visitables.get("tolerations").size()) { _visitables.get("tolerations").add(builder); } else { _visitables.get("tolerations").set(index, builder);}
    if (index < 0 || index >= tolerations.size()) { tolerations.add(builder); } else { tolerations.set(index, builder);}
     return (A)this;
  }
  public A addToTolerations(io.kubernetes.client.openapi.models.V1Toleration... items) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<V1TolerationBuilder>();}
    for (V1Toleration item : items) {V1TolerationBuilder builder = new V1TolerationBuilder(item);_visitables.get("tolerations").add(builder);this.tolerations.add(builder);} return (A)this;
  }
  public A addAllToTolerations(Collection<V1Toleration> items) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<V1TolerationBuilder>();}
    for (V1Toleration item : items) {V1TolerationBuilder builder = new V1TolerationBuilder(item);_visitables.get("tolerations").add(builder);this.tolerations.add(builder);} return (A)this;
  }
  public A removeFromTolerations(io.kubernetes.client.openapi.models.V1Toleration... items) {
    for (V1Toleration item : items) {V1TolerationBuilder builder = new V1TolerationBuilder(item);_visitables.get("tolerations").remove(builder);if (this.tolerations != null) {this.tolerations.remove(builder);}} return (A)this;
  }
  public A removeAllFromTolerations(Collection<V1Toleration> items) {
    for (V1Toleration item : items) {V1TolerationBuilder builder = new V1TolerationBuilder(item);_visitables.get("tolerations").remove(builder);if (this.tolerations != null) {this.tolerations.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromTolerations(Predicate<V1TolerationBuilder> predicate) {
    if (tolerations == null) return (A) this;
    final Iterator<V1TolerationBuilder> each = tolerations.iterator();
    final List visitables = _visitables.get("tolerations");
    while (each.hasNext()) {
      V1TolerationBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildTolerations instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Toleration> getTolerations() {
    return tolerations != null ? build(tolerations) : null;
  }
  public List<V1Toleration> buildTolerations() {
    return tolerations != null ? build(tolerations) : null;
  }
  public V1Toleration buildToleration(Integer index) {
    return this.tolerations.get(index).build();
  }
  public V1Toleration buildFirstToleration() {
    return this.tolerations.get(0).build();
  }
  public V1Toleration buildLastToleration() {
    return this.tolerations.get(tolerations.size() - 1).build();
  }
  public V1Toleration buildMatchingToleration(Predicate<V1TolerationBuilder> predicate) {
    for (V1TolerationBuilder item: tolerations) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingToleration(Predicate<V1TolerationBuilder> predicate) {
    for (V1TolerationBuilder item: tolerations) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withTolerations(List<V1Toleration> tolerations) {
    if (this.tolerations != null) { _visitables.get("tolerations").removeAll(this.tolerations);}
    if (tolerations != null) {this.tolerations = new ArrayList(); for (V1Toleration item : tolerations){this.addToTolerations(item);}} else { this.tolerations = null;} return (A) this;
  }
  public A withTolerations(io.kubernetes.client.openapi.models.V1Toleration... tolerations) {
    if (this.tolerations != null) {this.tolerations.clear();}
    if (tolerations != null) {for (V1Toleration item :tolerations){ this.addToTolerations(item);}} return (A) this;
  }
  public Boolean hasTolerations() {
    return tolerations != null && !tolerations.isEmpty();
  }
  public V1PodSpecFluent.TolerationsNested<A> addNewToleration() {
    return new V1PodSpecFluentImpl.TolerationsNestedImpl();
  }
  public V1PodSpecFluent.TolerationsNested<A> addNewTolerationLike(V1Toleration item) {
    return new V1PodSpecFluentImpl.TolerationsNestedImpl(-1, item);
  }
  public V1PodSpecFluent.TolerationsNested<A> setNewTolerationLike(Integer index,V1Toleration item) {
    return new V1PodSpecFluentImpl.TolerationsNestedImpl(index, item);
  }
  public V1PodSpecFluent.TolerationsNested<A> editToleration(Integer index) {
    if (tolerations.size() <= index) throw new RuntimeException("Can't edit tolerations. Index exceeds size.");
    return setNewTolerationLike(index, buildToleration(index));
  }
  public V1PodSpecFluent.TolerationsNested<A> editFirstToleration() {
    if (tolerations.size() == 0) throw new RuntimeException("Can't edit first tolerations. The list is empty.");
    return setNewTolerationLike(0, buildToleration(0));
  }
  public V1PodSpecFluent.TolerationsNested<A> editLastToleration() {
    int index = tolerations.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last tolerations. The list is empty.");
    return setNewTolerationLike(index, buildToleration(index));
  }
  public V1PodSpecFluent.TolerationsNested<A> editMatchingToleration(Predicate<V1TolerationBuilder> predicate) {
    int index = -1;
    for (int i=0;i<tolerations.size();i++) { 
    if (predicate.test(tolerations.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching tolerations. No match found.");
    return setNewTolerationLike(index, buildToleration(index));
  }
  public A addToTopologySpreadConstraints(Integer index,V1TopologySpreadConstraint item) {
    if (this.topologySpreadConstraints == null) {this.topologySpreadConstraints = new ArrayList<V1TopologySpreadConstraintBuilder>();}
    V1TopologySpreadConstraintBuilder builder = new V1TopologySpreadConstraintBuilder(item);_visitables.get("topologySpreadConstraints").add(index >= 0 ? index : _visitables.get("topologySpreadConstraints").size(), builder);this.topologySpreadConstraints.add(index >= 0 ? index : topologySpreadConstraints.size(), builder); return (A)this;
  }
  public A setToTopologySpreadConstraints(Integer index,V1TopologySpreadConstraint item) {
    if (this.topologySpreadConstraints == null) {this.topologySpreadConstraints = new ArrayList<V1TopologySpreadConstraintBuilder>();}
    V1TopologySpreadConstraintBuilder builder = new V1TopologySpreadConstraintBuilder(item);
    if (index < 0 || index >= _visitables.get("topologySpreadConstraints").size()) { _visitables.get("topologySpreadConstraints").add(builder); } else { _visitables.get("topologySpreadConstraints").set(index, builder);}
    if (index < 0 || index >= topologySpreadConstraints.size()) { topologySpreadConstraints.add(builder); } else { topologySpreadConstraints.set(index, builder);}
     return (A)this;
  }
  public A addToTopologySpreadConstraints(io.kubernetes.client.openapi.models.V1TopologySpreadConstraint... items) {
    if (this.topologySpreadConstraints == null) {this.topologySpreadConstraints = new ArrayList<V1TopologySpreadConstraintBuilder>();}
    for (V1TopologySpreadConstraint item : items) {V1TopologySpreadConstraintBuilder builder = new V1TopologySpreadConstraintBuilder(item);_visitables.get("topologySpreadConstraints").add(builder);this.topologySpreadConstraints.add(builder);} return (A)this;
  }
  public A addAllToTopologySpreadConstraints(Collection<V1TopologySpreadConstraint> items) {
    if (this.topologySpreadConstraints == null) {this.topologySpreadConstraints = new ArrayList<V1TopologySpreadConstraintBuilder>();}
    for (V1TopologySpreadConstraint item : items) {V1TopologySpreadConstraintBuilder builder = new V1TopologySpreadConstraintBuilder(item);_visitables.get("topologySpreadConstraints").add(builder);this.topologySpreadConstraints.add(builder);} return (A)this;
  }
  public A removeFromTopologySpreadConstraints(io.kubernetes.client.openapi.models.V1TopologySpreadConstraint... items) {
    for (V1TopologySpreadConstraint item : items) {V1TopologySpreadConstraintBuilder builder = new V1TopologySpreadConstraintBuilder(item);_visitables.get("topologySpreadConstraints").remove(builder);if (this.topologySpreadConstraints != null) {this.topologySpreadConstraints.remove(builder);}} return (A)this;
  }
  public A removeAllFromTopologySpreadConstraints(Collection<V1TopologySpreadConstraint> items) {
    for (V1TopologySpreadConstraint item : items) {V1TopologySpreadConstraintBuilder builder = new V1TopologySpreadConstraintBuilder(item);_visitables.get("topologySpreadConstraints").remove(builder);if (this.topologySpreadConstraints != null) {this.topologySpreadConstraints.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromTopologySpreadConstraints(Predicate<V1TopologySpreadConstraintBuilder> predicate) {
    if (topologySpreadConstraints == null) return (A) this;
    final Iterator<V1TopologySpreadConstraintBuilder> each = topologySpreadConstraints.iterator();
    final List visitables = _visitables.get("topologySpreadConstraints");
    while (each.hasNext()) {
      V1TopologySpreadConstraintBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildTopologySpreadConstraints instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1TopologySpreadConstraint> getTopologySpreadConstraints() {
    return topologySpreadConstraints != null ? build(topologySpreadConstraints) : null;
  }
  public List<V1TopologySpreadConstraint> buildTopologySpreadConstraints() {
    return topologySpreadConstraints != null ? build(topologySpreadConstraints) : null;
  }
  public V1TopologySpreadConstraint buildTopologySpreadConstraint(Integer index) {
    return this.topologySpreadConstraints.get(index).build();
  }
  public V1TopologySpreadConstraint buildFirstTopologySpreadConstraint() {
    return this.topologySpreadConstraints.get(0).build();
  }
  public V1TopologySpreadConstraint buildLastTopologySpreadConstraint() {
    return this.topologySpreadConstraints.get(topologySpreadConstraints.size() - 1).build();
  }
  public V1TopologySpreadConstraint buildMatchingTopologySpreadConstraint(Predicate<V1TopologySpreadConstraintBuilder> predicate) {
    for (V1TopologySpreadConstraintBuilder item: topologySpreadConstraints) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingTopologySpreadConstraint(Predicate<V1TopologySpreadConstraintBuilder> predicate) {
    for (V1TopologySpreadConstraintBuilder item: topologySpreadConstraints) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withTopologySpreadConstraints(List<V1TopologySpreadConstraint> topologySpreadConstraints) {
    if (this.topologySpreadConstraints != null) { _visitables.get("topologySpreadConstraints").removeAll(this.topologySpreadConstraints);}
    if (topologySpreadConstraints != null) {this.topologySpreadConstraints = new ArrayList(); for (V1TopologySpreadConstraint item : topologySpreadConstraints){this.addToTopologySpreadConstraints(item);}} else { this.topologySpreadConstraints = null;} return (A) this;
  }
  public A withTopologySpreadConstraints(io.kubernetes.client.openapi.models.V1TopologySpreadConstraint... topologySpreadConstraints) {
    if (this.topologySpreadConstraints != null) {this.topologySpreadConstraints.clear();}
    if (topologySpreadConstraints != null) {for (V1TopologySpreadConstraint item :topologySpreadConstraints){ this.addToTopologySpreadConstraints(item);}} return (A) this;
  }
  public Boolean hasTopologySpreadConstraints() {
    return topologySpreadConstraints != null && !topologySpreadConstraints.isEmpty();
  }
  public V1PodSpecFluent.TopologySpreadConstraintsNested<A> addNewTopologySpreadConstraint() {
    return new V1PodSpecFluentImpl.TopologySpreadConstraintsNestedImpl();
  }
  public V1PodSpecFluent.TopologySpreadConstraintsNested<A> addNewTopologySpreadConstraintLike(V1TopologySpreadConstraint item) {
    return new V1PodSpecFluentImpl.TopologySpreadConstraintsNestedImpl(-1, item);
  }
  public V1PodSpecFluent.TopologySpreadConstraintsNested<A> setNewTopologySpreadConstraintLike(Integer index,V1TopologySpreadConstraint item) {
    return new V1PodSpecFluentImpl.TopologySpreadConstraintsNestedImpl(index, item);
  }
  public V1PodSpecFluent.TopologySpreadConstraintsNested<A> editTopologySpreadConstraint(Integer index) {
    if (topologySpreadConstraints.size() <= index) throw new RuntimeException("Can't edit topologySpreadConstraints. Index exceeds size.");
    return setNewTopologySpreadConstraintLike(index, buildTopologySpreadConstraint(index));
  }
  public V1PodSpecFluent.TopologySpreadConstraintsNested<A> editFirstTopologySpreadConstraint() {
    if (topologySpreadConstraints.size() == 0) throw new RuntimeException("Can't edit first topologySpreadConstraints. The list is empty.");
    return setNewTopologySpreadConstraintLike(0, buildTopologySpreadConstraint(0));
  }
  public V1PodSpecFluent.TopologySpreadConstraintsNested<A> editLastTopologySpreadConstraint() {
    int index = topologySpreadConstraints.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last topologySpreadConstraints. The list is empty.");
    return setNewTopologySpreadConstraintLike(index, buildTopologySpreadConstraint(index));
  }
  public V1PodSpecFluent.TopologySpreadConstraintsNested<A> editMatchingTopologySpreadConstraint(Predicate<V1TopologySpreadConstraintBuilder> predicate) {
    int index = -1;
    for (int i=0;i<topologySpreadConstraints.size();i++) { 
    if (predicate.test(topologySpreadConstraints.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching topologySpreadConstraints. No match found.");
    return setNewTopologySpreadConstraintLike(index, buildTopologySpreadConstraint(index));
  }
  public A addToVolumes(Integer index,V1Volume item) {
    if (this.volumes == null) {this.volumes = new ArrayList<V1VolumeBuilder>();}
    V1VolumeBuilder builder = new V1VolumeBuilder(item);_visitables.get("volumes").add(index >= 0 ? index : _visitables.get("volumes").size(), builder);this.volumes.add(index >= 0 ? index : volumes.size(), builder); return (A)this;
  }
  public A setToVolumes(Integer index,V1Volume item) {
    if (this.volumes == null) {this.volumes = new ArrayList<V1VolumeBuilder>();}
    V1VolumeBuilder builder = new V1VolumeBuilder(item);
    if (index < 0 || index >= _visitables.get("volumes").size()) { _visitables.get("volumes").add(builder); } else { _visitables.get("volumes").set(index, builder);}
    if (index < 0 || index >= volumes.size()) { volumes.add(builder); } else { volumes.set(index, builder);}
     return (A)this;
  }
  public A addToVolumes(io.kubernetes.client.openapi.models.V1Volume... items) {
    if (this.volumes == null) {this.volumes = new ArrayList<V1VolumeBuilder>();}
    for (V1Volume item : items) {V1VolumeBuilder builder = new V1VolumeBuilder(item);_visitables.get("volumes").add(builder);this.volumes.add(builder);} return (A)this;
  }
  public A addAllToVolumes(Collection<V1Volume> items) {
    if (this.volumes == null) {this.volumes = new ArrayList<V1VolumeBuilder>();}
    for (V1Volume item : items) {V1VolumeBuilder builder = new V1VolumeBuilder(item);_visitables.get("volumes").add(builder);this.volumes.add(builder);} return (A)this;
  }
  public A removeFromVolumes(io.kubernetes.client.openapi.models.V1Volume... items) {
    for (V1Volume item : items) {V1VolumeBuilder builder = new V1VolumeBuilder(item);_visitables.get("volumes").remove(builder);if (this.volumes != null) {this.volumes.remove(builder);}} return (A)this;
  }
  public A removeAllFromVolumes(Collection<V1Volume> items) {
    for (V1Volume item : items) {V1VolumeBuilder builder = new V1VolumeBuilder(item);_visitables.get("volumes").remove(builder);if (this.volumes != null) {this.volumes.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromVolumes(Predicate<V1VolumeBuilder> predicate) {
    if (volumes == null) return (A) this;
    final Iterator<V1VolumeBuilder> each = volumes.iterator();
    final List visitables = _visitables.get("volumes");
    while (each.hasNext()) {
      V1VolumeBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildVolumes instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Volume> getVolumes() {
    return volumes != null ? build(volumes) : null;
  }
  public List<V1Volume> buildVolumes() {
    return volumes != null ? build(volumes) : null;
  }
  public V1Volume buildVolume(Integer index) {
    return this.volumes.get(index).build();
  }
  public V1Volume buildFirstVolume() {
    return this.volumes.get(0).build();
  }
  public V1Volume buildLastVolume() {
    return this.volumes.get(volumes.size() - 1).build();
  }
  public V1Volume buildMatchingVolume(Predicate<V1VolumeBuilder> predicate) {
    for (V1VolumeBuilder item: volumes) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingVolume(Predicate<V1VolumeBuilder> predicate) {
    for (V1VolumeBuilder item: volumes) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withVolumes(List<V1Volume> volumes) {
    if (this.volumes != null) { _visitables.get("volumes").removeAll(this.volumes);}
    if (volumes != null) {this.volumes = new ArrayList(); for (V1Volume item : volumes){this.addToVolumes(item);}} else { this.volumes = null;} return (A) this;
  }
  public A withVolumes(io.kubernetes.client.openapi.models.V1Volume... volumes) {
    if (this.volumes != null) {this.volumes.clear();}
    if (volumes != null) {for (V1Volume item :volumes){ this.addToVolumes(item);}} return (A) this;
  }
  public Boolean hasVolumes() {
    return volumes != null && !volumes.isEmpty();
  }
  public V1PodSpecFluent.VolumesNested<A> addNewVolume() {
    return new V1PodSpecFluentImpl.VolumesNestedImpl();
  }
  public V1PodSpecFluent.VolumesNested<A> addNewVolumeLike(V1Volume item) {
    return new V1PodSpecFluentImpl.VolumesNestedImpl(-1, item);
  }
  public V1PodSpecFluent.VolumesNested<A> setNewVolumeLike(Integer index,V1Volume item) {
    return new V1PodSpecFluentImpl.VolumesNestedImpl(index, item);
  }
  public V1PodSpecFluent.VolumesNested<A> editVolume(Integer index) {
    if (volumes.size() <= index) throw new RuntimeException("Can't edit volumes. Index exceeds size.");
    return setNewVolumeLike(index, buildVolume(index));
  }
  public V1PodSpecFluent.VolumesNested<A> editFirstVolume() {
    if (volumes.size() == 0) throw new RuntimeException("Can't edit first volumes. The list is empty.");
    return setNewVolumeLike(0, buildVolume(0));
  }
  public V1PodSpecFluent.VolumesNested<A> editLastVolume() {
    int index = volumes.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last volumes. The list is empty.");
    return setNewVolumeLike(index, buildVolume(index));
  }
  public V1PodSpecFluent.VolumesNested<A> editMatchingVolume(Predicate<V1VolumeBuilder> predicate) {
    int index = -1;
    for (int i=0;i<volumes.size();i++) { 
    if (predicate.test(volumes.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching volumes. No match found.");
    return setNewVolumeLike(index, buildVolume(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodSpecFluentImpl that = (V1PodSpecFluentImpl) o;
    if (activeDeadlineSeconds != null ? !activeDeadlineSeconds.equals(that.activeDeadlineSeconds) :that.activeDeadlineSeconds != null) return false;
    if (affinity != null ? !affinity.equals(that.affinity) :that.affinity != null) return false;
    if (automountServiceAccountToken != null ? !automountServiceAccountToken.equals(that.automountServiceAccountToken) :that.automountServiceAccountToken != null) return false;
    if (containers != null ? !containers.equals(that.containers) :that.containers != null) return false;
    if (dnsConfig != null ? !dnsConfig.equals(that.dnsConfig) :that.dnsConfig != null) return false;
    if (dnsPolicy != null ? !dnsPolicy.equals(that.dnsPolicy) :that.dnsPolicy != null) return false;
    if (enableServiceLinks != null ? !enableServiceLinks.equals(that.enableServiceLinks) :that.enableServiceLinks != null) return false;
    if (ephemeralContainers != null ? !ephemeralContainers.equals(that.ephemeralContainers) :that.ephemeralContainers != null) return false;
    if (hostAliases != null ? !hostAliases.equals(that.hostAliases) :that.hostAliases != null) return false;
    if (hostIPC != null ? !hostIPC.equals(that.hostIPC) :that.hostIPC != null) return false;
    if (hostNetwork != null ? !hostNetwork.equals(that.hostNetwork) :that.hostNetwork != null) return false;
    if (hostPID != null ? !hostPID.equals(that.hostPID) :that.hostPID != null) return false;
    if (hostUsers != null ? !hostUsers.equals(that.hostUsers) :that.hostUsers != null) return false;
    if (hostname != null ? !hostname.equals(that.hostname) :that.hostname != null) return false;
    if (imagePullSecrets != null ? !imagePullSecrets.equals(that.imagePullSecrets) :that.imagePullSecrets != null) return false;
    if (initContainers != null ? !initContainers.equals(that.initContainers) :that.initContainers != null) return false;
    if (nodeName != null ? !nodeName.equals(that.nodeName) :that.nodeName != null) return false;
    if (nodeSelector != null ? !nodeSelector.equals(that.nodeSelector) :that.nodeSelector != null) return false;
    if (os != null ? !os.equals(that.os) :that.os != null) return false;
    if (overhead != null ? !overhead.equals(that.overhead) :that.overhead != null) return false;
    if (preemptionPolicy != null ? !preemptionPolicy.equals(that.preemptionPolicy) :that.preemptionPolicy != null) return false;
    if (priority != null ? !priority.equals(that.priority) :that.priority != null) return false;
    if (priorityClassName != null ? !priorityClassName.equals(that.priorityClassName) :that.priorityClassName != null) return false;
    if (readinessGates != null ? !readinessGates.equals(that.readinessGates) :that.readinessGates != null) return false;
    if (restartPolicy != null ? !restartPolicy.equals(that.restartPolicy) :that.restartPolicy != null) return false;
    if (runtimeClassName != null ? !runtimeClassName.equals(that.runtimeClassName) :that.runtimeClassName != null) return false;
    if (schedulerName != null ? !schedulerName.equals(that.schedulerName) :that.schedulerName != null) return false;
    if (securityContext != null ? !securityContext.equals(that.securityContext) :that.securityContext != null) return false;
    if (serviceAccount != null ? !serviceAccount.equals(that.serviceAccount) :that.serviceAccount != null) return false;
    if (serviceAccountName != null ? !serviceAccountName.equals(that.serviceAccountName) :that.serviceAccountName != null) return false;
    if (setHostnameAsFQDN != null ? !setHostnameAsFQDN.equals(that.setHostnameAsFQDN) :that.setHostnameAsFQDN != null) return false;
    if (shareProcessNamespace != null ? !shareProcessNamespace.equals(that.shareProcessNamespace) :that.shareProcessNamespace != null) return false;
    if (subdomain != null ? !subdomain.equals(that.subdomain) :that.subdomain != null) return false;
    if (terminationGracePeriodSeconds != null ? !terminationGracePeriodSeconds.equals(that.terminationGracePeriodSeconds) :that.terminationGracePeriodSeconds != null) return false;
    if (tolerations != null ? !tolerations.equals(that.tolerations) :that.tolerations != null) return false;
    if (topologySpreadConstraints != null ? !topologySpreadConstraints.equals(that.topologySpreadConstraints) :that.topologySpreadConstraints != null) return false;
    if (volumes != null ? !volumes.equals(that.volumes) :that.volumes != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(activeDeadlineSeconds,  affinity,  automountServiceAccountToken,  containers,  dnsConfig,  dnsPolicy,  enableServiceLinks,  ephemeralContainers,  hostAliases,  hostIPC,  hostNetwork,  hostPID,  hostUsers,  hostname,  imagePullSecrets,  initContainers,  nodeName,  nodeSelector,  os,  overhead,  preemptionPolicy,  priority,  priorityClassName,  readinessGates,  restartPolicy,  runtimeClassName,  schedulerName,  securityContext,  serviceAccount,  serviceAccountName,  setHostnameAsFQDN,  shareProcessNamespace,  subdomain,  terminationGracePeriodSeconds,  tolerations,  topologySpreadConstraints,  volumes,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (activeDeadlineSeconds != null) { sb.append("activeDeadlineSeconds:"); sb.append(activeDeadlineSeconds + ","); }
    if (affinity != null) { sb.append("affinity:"); sb.append(affinity + ","); }
    if (automountServiceAccountToken != null) { sb.append("automountServiceAccountToken:"); sb.append(automountServiceAccountToken + ","); }
    if (containers != null && !containers.isEmpty()) { sb.append("containers:"); sb.append(containers + ","); }
    if (dnsConfig != null) { sb.append("dnsConfig:"); sb.append(dnsConfig + ","); }
    if (dnsPolicy != null) { sb.append("dnsPolicy:"); sb.append(dnsPolicy + ","); }
    if (enableServiceLinks != null) { sb.append("enableServiceLinks:"); sb.append(enableServiceLinks + ","); }
    if (ephemeralContainers != null && !ephemeralContainers.isEmpty()) { sb.append("ephemeralContainers:"); sb.append(ephemeralContainers + ","); }
    if (hostAliases != null && !hostAliases.isEmpty()) { sb.append("hostAliases:"); sb.append(hostAliases + ","); }
    if (hostIPC != null) { sb.append("hostIPC:"); sb.append(hostIPC + ","); }
    if (hostNetwork != null) { sb.append("hostNetwork:"); sb.append(hostNetwork + ","); }
    if (hostPID != null) { sb.append("hostPID:"); sb.append(hostPID + ","); }
    if (hostUsers != null) { sb.append("hostUsers:"); sb.append(hostUsers + ","); }
    if (hostname != null) { sb.append("hostname:"); sb.append(hostname + ","); }
    if (imagePullSecrets != null && !imagePullSecrets.isEmpty()) { sb.append("imagePullSecrets:"); sb.append(imagePullSecrets + ","); }
    if (initContainers != null && !initContainers.isEmpty()) { sb.append("initContainers:"); sb.append(initContainers + ","); }
    if (nodeName != null) { sb.append("nodeName:"); sb.append(nodeName + ","); }
    if (nodeSelector != null && !nodeSelector.isEmpty()) { sb.append("nodeSelector:"); sb.append(nodeSelector + ","); }
    if (os != null) { sb.append("os:"); sb.append(os + ","); }
    if (overhead != null && !overhead.isEmpty()) { sb.append("overhead:"); sb.append(overhead + ","); }
    if (preemptionPolicy != null) { sb.append("preemptionPolicy:"); sb.append(preemptionPolicy + ","); }
    if (priority != null) { sb.append("priority:"); sb.append(priority + ","); }
    if (priorityClassName != null) { sb.append("priorityClassName:"); sb.append(priorityClassName + ","); }
    if (readinessGates != null && !readinessGates.isEmpty()) { sb.append("readinessGates:"); sb.append(readinessGates + ","); }
    if (restartPolicy != null) { sb.append("restartPolicy:"); sb.append(restartPolicy + ","); }
    if (runtimeClassName != null) { sb.append("runtimeClassName:"); sb.append(runtimeClassName + ","); }
    if (schedulerName != null) { sb.append("schedulerName:"); sb.append(schedulerName + ","); }
    if (securityContext != null) { sb.append("securityContext:"); sb.append(securityContext + ","); }
    if (serviceAccount != null) { sb.append("serviceAccount:"); sb.append(serviceAccount + ","); }
    if (serviceAccountName != null) { sb.append("serviceAccountName:"); sb.append(serviceAccountName + ","); }
    if (setHostnameAsFQDN != null) { sb.append("setHostnameAsFQDN:"); sb.append(setHostnameAsFQDN + ","); }
    if (shareProcessNamespace != null) { sb.append("shareProcessNamespace:"); sb.append(shareProcessNamespace + ","); }
    if (subdomain != null) { sb.append("subdomain:"); sb.append(subdomain + ","); }
    if (terminationGracePeriodSeconds != null) { sb.append("terminationGracePeriodSeconds:"); sb.append(terminationGracePeriodSeconds + ","); }
    if (tolerations != null && !tolerations.isEmpty()) { sb.append("tolerations:"); sb.append(tolerations + ","); }
    if (topologySpreadConstraints != null && !topologySpreadConstraints.isEmpty()) { sb.append("topologySpreadConstraints:"); sb.append(topologySpreadConstraints + ","); }
    if (volumes != null && !volumes.isEmpty()) { sb.append("volumes:"); sb.append(volumes); }
    sb.append("}");
    return sb.toString();
  }
  public A withAutomountServiceAccountToken() {
    return withAutomountServiceAccountToken(true);
  }
  public A withEnableServiceLinks() {
    return withEnableServiceLinks(true);
  }
  public A withHostIPC() {
    return withHostIPC(true);
  }
  public A withHostNetwork() {
    return withHostNetwork(true);
  }
  public A withHostPID() {
    return withHostPID(true);
  }
  public A withHostUsers() {
    return withHostUsers(true);
  }
  public A withSetHostnameAsFQDN() {
    return withSetHostnameAsFQDN(true);
  }
  public A withShareProcessNamespace() {
    return withShareProcessNamespace(true);
  }
  class AffinityNestedImpl<N> extends V1AffinityFluentImpl<V1PodSpecFluent.AffinityNested<N>> implements V1PodSpecFluent.AffinityNested<N>,Nested<N>{
    AffinityNestedImpl(V1Affinity item) {
      this.builder = new V1AffinityBuilder(this, item);
    }
    AffinityNestedImpl() {
      this.builder = new V1AffinityBuilder(this);
    }
    V1AffinityBuilder builder;
    public N and() {
      return (N) V1PodSpecFluentImpl.this.withAffinity(builder.build());
    }
    public N endAffinity() {
      return and();
    }
    
  }
  class ContainersNestedImpl<N> extends V1ContainerFluentImpl<V1PodSpecFluent.ContainersNested<N>> implements V1PodSpecFluent.ContainersNested<N>,Nested<N>{
    ContainersNestedImpl(Integer index,V1Container item) {
      this.index = index;
      this.builder = new V1ContainerBuilder(this, item);
    }
    ContainersNestedImpl() {
      this.index = -1;
      this.builder = new V1ContainerBuilder(this);
    }
    V1ContainerBuilder builder;
    Integer index;
    public N and() {
      return (N) V1PodSpecFluentImpl.this.setToContainers(index,builder.build());
    }
    public N endContainer() {
      return and();
    }
    
  }
  class DnsConfigNestedImpl<N> extends V1PodDNSConfigFluentImpl<V1PodSpecFluent.DnsConfigNested<N>> implements V1PodSpecFluent.DnsConfigNested<N>,Nested<N>{
    DnsConfigNestedImpl(V1PodDNSConfig item) {
      this.builder = new V1PodDNSConfigBuilder(this, item);
    }
    DnsConfigNestedImpl() {
      this.builder = new V1PodDNSConfigBuilder(this);
    }
    V1PodDNSConfigBuilder builder;
    public N and() {
      return (N) V1PodSpecFluentImpl.this.withDnsConfig(builder.build());
    }
    public N endDnsConfig() {
      return and();
    }
    
  }
  class EphemeralContainersNestedImpl<N> extends V1EphemeralContainerFluentImpl<V1PodSpecFluent.EphemeralContainersNested<N>> implements V1PodSpecFluent.EphemeralContainersNested<N>,Nested<N>{
    EphemeralContainersNestedImpl(Integer index,V1EphemeralContainer item) {
      this.index = index;
      this.builder = new V1EphemeralContainerBuilder(this, item);
    }
    EphemeralContainersNestedImpl() {
      this.index = -1;
      this.builder = new V1EphemeralContainerBuilder(this);
    }
    V1EphemeralContainerBuilder builder;
    Integer index;
    public N and() {
      return (N) V1PodSpecFluentImpl.this.setToEphemeralContainers(index,builder.build());
    }
    public N endEphemeralContainer() {
      return and();
    }
    
  }
  class HostAliasesNestedImpl<N> extends V1HostAliasFluentImpl<V1PodSpecFluent.HostAliasesNested<N>> implements V1PodSpecFluent.HostAliasesNested<N>,Nested<N>{
    HostAliasesNestedImpl(Integer index,V1HostAlias item) {
      this.index = index;
      this.builder = new V1HostAliasBuilder(this, item);
    }
    HostAliasesNestedImpl() {
      this.index = -1;
      this.builder = new V1HostAliasBuilder(this);
    }
    V1HostAliasBuilder builder;
    Integer index;
    public N and() {
      return (N) V1PodSpecFluentImpl.this.setToHostAliases(index,builder.build());
    }
    public N endHostAlias() {
      return and();
    }
    
  }
  class ImagePullSecretsNestedImpl<N> extends V1LocalObjectReferenceFluentImpl<V1PodSpecFluent.ImagePullSecretsNested<N>> implements V1PodSpecFluent.ImagePullSecretsNested<N>,Nested<N>{
    ImagePullSecretsNestedImpl(Integer index,V1LocalObjectReference item) {
      this.index = index;
      this.builder = new V1LocalObjectReferenceBuilder(this, item);
    }
    ImagePullSecretsNestedImpl() {
      this.index = -1;
      this.builder = new V1LocalObjectReferenceBuilder(this);
    }
    V1LocalObjectReferenceBuilder builder;
    Integer index;
    public N and() {
      return (N) V1PodSpecFluentImpl.this.setToImagePullSecrets(index,builder.build());
    }
    public N endImagePullSecret() {
      return and();
    }
    
  }
  class InitContainersNestedImpl<N> extends V1ContainerFluentImpl<V1PodSpecFluent.InitContainersNested<N>> implements V1PodSpecFluent.InitContainersNested<N>,Nested<N>{
    InitContainersNestedImpl(Integer index,V1Container item) {
      this.index = index;
      this.builder = new V1ContainerBuilder(this, item);
    }
    InitContainersNestedImpl() {
      this.index = -1;
      this.builder = new V1ContainerBuilder(this);
    }
    V1ContainerBuilder builder;
    Integer index;
    public N and() {
      return (N) V1PodSpecFluentImpl.this.setToInitContainers(index,builder.build());
    }
    public N endInitContainer() {
      return and();
    }
    
  }
  class OsNestedImpl<N> extends V1PodOSFluentImpl<V1PodSpecFluent.OsNested<N>> implements V1PodSpecFluent.OsNested<N>,Nested<N>{
    OsNestedImpl(V1PodOS item) {
      this.builder = new V1PodOSBuilder(this, item);
    }
    OsNestedImpl() {
      this.builder = new V1PodOSBuilder(this);
    }
    V1PodOSBuilder builder;
    public N and() {
      return (N) V1PodSpecFluentImpl.this.withOs(builder.build());
    }
    public N endOs() {
      return and();
    }
    
  }
  class ReadinessGatesNestedImpl<N> extends V1PodReadinessGateFluentImpl<V1PodSpecFluent.ReadinessGatesNested<N>> implements V1PodSpecFluent.ReadinessGatesNested<N>,Nested<N>{
    ReadinessGatesNestedImpl(Integer index,V1PodReadinessGate item) {
      this.index = index;
      this.builder = new V1PodReadinessGateBuilder(this, item);
    }
    ReadinessGatesNestedImpl() {
      this.index = -1;
      this.builder = new V1PodReadinessGateBuilder(this);
    }
    V1PodReadinessGateBuilder builder;
    Integer index;
    public N and() {
      return (N) V1PodSpecFluentImpl.this.setToReadinessGates(index,builder.build());
    }
    public N endReadinessGate() {
      return and();
    }
    
  }
  class SecurityContextNestedImpl<N> extends V1PodSecurityContextFluentImpl<V1PodSpecFluent.SecurityContextNested<N>> implements V1PodSpecFluent.SecurityContextNested<N>,Nested<N>{
    SecurityContextNestedImpl(V1PodSecurityContext item) {
      this.builder = new V1PodSecurityContextBuilder(this, item);
    }
    SecurityContextNestedImpl() {
      this.builder = new V1PodSecurityContextBuilder(this);
    }
    V1PodSecurityContextBuilder builder;
    public N and() {
      return (N) V1PodSpecFluentImpl.this.withSecurityContext(builder.build());
    }
    public N endSecurityContext() {
      return and();
    }
    
  }
  class TolerationsNestedImpl<N> extends V1TolerationFluentImpl<V1PodSpecFluent.TolerationsNested<N>> implements V1PodSpecFluent.TolerationsNested<N>,Nested<N>{
    TolerationsNestedImpl(Integer index,V1Toleration item) {
      this.index = index;
      this.builder = new V1TolerationBuilder(this, item);
    }
    TolerationsNestedImpl() {
      this.index = -1;
      this.builder = new V1TolerationBuilder(this);
    }
    V1TolerationBuilder builder;
    Integer index;
    public N and() {
      return (N) V1PodSpecFluentImpl.this.setToTolerations(index,builder.build());
    }
    public N endToleration() {
      return and();
    }
    
  }
  class TopologySpreadConstraintsNestedImpl<N> extends V1TopologySpreadConstraintFluentImpl<V1PodSpecFluent.TopologySpreadConstraintsNested<N>> implements V1PodSpecFluent.TopologySpreadConstraintsNested<N>,Nested<N>{
    TopologySpreadConstraintsNestedImpl(Integer index,V1TopologySpreadConstraint item) {
      this.index = index;
      this.builder = new V1TopologySpreadConstraintBuilder(this, item);
    }
    TopologySpreadConstraintsNestedImpl() {
      this.index = -1;
      this.builder = new V1TopologySpreadConstraintBuilder(this);
    }
    V1TopologySpreadConstraintBuilder builder;
    Integer index;
    public N and() {
      return (N) V1PodSpecFluentImpl.this.setToTopologySpreadConstraints(index,builder.build());
    }
    public N endTopologySpreadConstraint() {
      return and();
    }
    
  }
  class VolumesNestedImpl<N> extends V1VolumeFluentImpl<V1PodSpecFluent.VolumesNested<N>> implements V1PodSpecFluent.VolumesNested<N>,Nested<N>{
    VolumesNestedImpl(Integer index,V1Volume item) {
      this.index = index;
      this.builder = new V1VolumeBuilder(this, item);
    }
    VolumesNestedImpl() {
      this.index = -1;
      this.builder = new V1VolumeBuilder(this);
    }
    V1VolumeBuilder builder;
    Integer index;
    public N and() {
      return (N) V1PodSpecFluentImpl.this.setToVolumes(index,builder.build());
    }
    public N endVolume() {
      return and();
    }
    
  }
  
}