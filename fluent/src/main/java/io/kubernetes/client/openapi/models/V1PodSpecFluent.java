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
import java.util.Iterator;
import io.kubernetes.client.custom.Quantity;
import java.lang.Integer;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PodSpecFluent<A extends V1PodSpecFluent<A>> extends BaseFluent<A>{
  public V1PodSpecFluent() {
  }
  
  public V1PodSpecFluent(V1PodSpec instance) {
    this.copyInstance(instance);
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
  private ArrayList<V1PodResourceClaimBuilder> resourceClaims;
  private String restartPolicy;
  private String runtimeClassName;
  private String schedulerName;
  private ArrayList<V1PodSchedulingGateBuilder> schedulingGates;
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
  
  protected void copyInstance(V1PodSpec instance) {
    instance = (instance != null ? instance : new V1PodSpec());
    if (instance != null) {
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
          this.withResourceClaims(instance.getResourceClaims());
          this.withRestartPolicy(instance.getRestartPolicy());
          this.withRuntimeClassName(instance.getRuntimeClassName());
          this.withSchedulerName(instance.getSchedulerName());
          this.withSchedulingGates(instance.getSchedulingGates());
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
  }
  
  public Long getActiveDeadlineSeconds() {
    return this.activeDeadlineSeconds;
  }
  
  public A withActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return (A) this;
  }
  
  public boolean hasActiveDeadlineSeconds() {
    return this.activeDeadlineSeconds != null;
  }
  
  public V1Affinity buildAffinity() {
    return this.affinity != null ? this.affinity.build() : null;
  }
  
  public A withAffinity(V1Affinity affinity) {
    this._visitables.remove("affinity");
    if (affinity != null) {
        this.affinity = new V1AffinityBuilder(affinity);
        this._visitables.get("affinity").add(this.affinity);
    } else {
        this.affinity = null;
        this._visitables.get("affinity").remove(this.affinity);
    }
    return (A) this;
  }
  
  public boolean hasAffinity() {
    return this.affinity != null;
  }
  
  public AffinityNested<A> withNewAffinity() {
    return new AffinityNested(null);
  }
  
  public AffinityNested<A> withNewAffinityLike(V1Affinity item) {
    return new AffinityNested(item);
  }
  
  public AffinityNested<A> editAffinity() {
    return withNewAffinityLike(java.util.Optional.ofNullable(buildAffinity()).orElse(null));
  }
  
  public AffinityNested<A> editOrNewAffinity() {
    return withNewAffinityLike(java.util.Optional.ofNullable(buildAffinity()).orElse(new V1AffinityBuilder().build()));
  }
  
  public AffinityNested<A> editOrNewAffinityLike(V1Affinity item) {
    return withNewAffinityLike(java.util.Optional.ofNullable(buildAffinity()).orElse(item));
  }
  
  public Boolean getAutomountServiceAccountToken() {
    return this.automountServiceAccountToken;
  }
  
  public A withAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
    return (A) this;
  }
  
  public boolean hasAutomountServiceAccountToken() {
    return this.automountServiceAccountToken != null;
  }
  
  public A addToContainers(int index,V1Container item) {
    if (this.containers == null) {this.containers = new ArrayList<V1ContainerBuilder>();}
    V1ContainerBuilder builder = new V1ContainerBuilder(item);
    if (index < 0 || index >= containers.size()) { _visitables.get("containers").add(builder); containers.add(builder); } else { _visitables.get("containers").add(index, builder); containers.add(index, builder);}
    return (A)this;
  }
  
  public A setToContainers(int index,V1Container item) {
    if (this.containers == null) {this.containers = new ArrayList<V1ContainerBuilder>();}
    V1ContainerBuilder builder = new V1ContainerBuilder(item);
    if (index < 0 || index >= containers.size()) { _visitables.get("containers").add(builder); containers.add(builder); } else { _visitables.get("containers").set(index, builder); containers.set(index, builder);}
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
    if (this.containers == null) return (A)this;
    for (V1Container item : items) {V1ContainerBuilder builder = new V1ContainerBuilder(item);_visitables.get("containers").remove(builder); this.containers.remove(builder);} return (A)this;
  }
  
  public A removeAllFromContainers(Collection<V1Container> items) {
    if (this.containers == null) return (A)this;
    for (V1Container item : items) {V1ContainerBuilder builder = new V1ContainerBuilder(item);_visitables.get("containers").remove(builder); this.containers.remove(builder);} return (A)this;
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
  
  public List<V1Container> buildContainers() {
    return this.containers != null ? build(containers) : null;
  }
  
  public V1Container buildContainer(int index) {
    return this.containers.get(index).build();
  }
  
  public V1Container buildFirstContainer() {
    return this.containers.get(0).build();
  }
  
  public V1Container buildLastContainer() {
    return this.containers.get(containers.size() - 1).build();
  }
  
  public V1Container buildMatchingContainer(Predicate<V1ContainerBuilder> predicate) {
      for (V1ContainerBuilder item : containers) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingContainer(Predicate<V1ContainerBuilder> predicate) {
      for (V1ContainerBuilder item : containers) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withContainers(List<V1Container> containers) {
    if (this.containers != null) {
      this._visitables.get("containers").clear();
    }
    if (containers != null) {
        this.containers = new ArrayList();
        for (V1Container item : containers) {
          this.addToContainers(item);
        }
    } else {
      this.containers = null;
    }
    return (A) this;
  }
  
  public A withContainers(io.kubernetes.client.openapi.models.V1Container... containers) {
    if (this.containers != null) {
        this.containers.clear();
        _visitables.remove("containers");
    }
    if (containers != null) {
      for (V1Container item : containers) {
        this.addToContainers(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasContainers() {
    return this.containers != null && !this.containers.isEmpty();
  }
  
  public ContainersNested<A> addNewContainer() {
    return new ContainersNested(-1, null);
  }
  
  public ContainersNested<A> addNewContainerLike(V1Container item) {
    return new ContainersNested(-1, item);
  }
  
  public ContainersNested<A> setNewContainerLike(int index,V1Container item) {
    return new ContainersNested(index, item);
  }
  
  public ContainersNested<A> editContainer(int index) {
    if (containers.size() <= index) throw new RuntimeException("Can't edit containers. Index exceeds size.");
    return setNewContainerLike(index, buildContainer(index));
  }
  
  public ContainersNested<A> editFirstContainer() {
    if (containers.size() == 0) throw new RuntimeException("Can't edit first containers. The list is empty.");
    return setNewContainerLike(0, buildContainer(0));
  }
  
  public ContainersNested<A> editLastContainer() {
    int index = containers.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last containers. The list is empty.");
    return setNewContainerLike(index, buildContainer(index));
  }
  
  public ContainersNested<A> editMatchingContainer(Predicate<V1ContainerBuilder> predicate) {
    int index = -1;
    for (int i=0;i<containers.size();i++) { 
    if (predicate.test(containers.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching containers. No match found.");
    return setNewContainerLike(index, buildContainer(index));
  }
  
  public V1PodDNSConfig buildDnsConfig() {
    return this.dnsConfig != null ? this.dnsConfig.build() : null;
  }
  
  public A withDnsConfig(V1PodDNSConfig dnsConfig) {
    this._visitables.remove("dnsConfig");
    if (dnsConfig != null) {
        this.dnsConfig = new V1PodDNSConfigBuilder(dnsConfig);
        this._visitables.get("dnsConfig").add(this.dnsConfig);
    } else {
        this.dnsConfig = null;
        this._visitables.get("dnsConfig").remove(this.dnsConfig);
    }
    return (A) this;
  }
  
  public boolean hasDnsConfig() {
    return this.dnsConfig != null;
  }
  
  public DnsConfigNested<A> withNewDnsConfig() {
    return new DnsConfigNested(null);
  }
  
  public DnsConfigNested<A> withNewDnsConfigLike(V1PodDNSConfig item) {
    return new DnsConfigNested(item);
  }
  
  public DnsConfigNested<A> editDnsConfig() {
    return withNewDnsConfigLike(java.util.Optional.ofNullable(buildDnsConfig()).orElse(null));
  }
  
  public DnsConfigNested<A> editOrNewDnsConfig() {
    return withNewDnsConfigLike(java.util.Optional.ofNullable(buildDnsConfig()).orElse(new V1PodDNSConfigBuilder().build()));
  }
  
  public DnsConfigNested<A> editOrNewDnsConfigLike(V1PodDNSConfig item) {
    return withNewDnsConfigLike(java.util.Optional.ofNullable(buildDnsConfig()).orElse(item));
  }
  
  public String getDnsPolicy() {
    return this.dnsPolicy;
  }
  
  public A withDnsPolicy(String dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
    return (A) this;
  }
  
  public boolean hasDnsPolicy() {
    return this.dnsPolicy != null;
  }
  
  public Boolean getEnableServiceLinks() {
    return this.enableServiceLinks;
  }
  
  public A withEnableServiceLinks(Boolean enableServiceLinks) {
    this.enableServiceLinks = enableServiceLinks;
    return (A) this;
  }
  
  public boolean hasEnableServiceLinks() {
    return this.enableServiceLinks != null;
  }
  
  public A addToEphemeralContainers(int index,V1EphemeralContainer item) {
    if (this.ephemeralContainers == null) {this.ephemeralContainers = new ArrayList<V1EphemeralContainerBuilder>();}
    V1EphemeralContainerBuilder builder = new V1EphemeralContainerBuilder(item);
    if (index < 0 || index >= ephemeralContainers.size()) { _visitables.get("ephemeralContainers").add(builder); ephemeralContainers.add(builder); } else { _visitables.get("ephemeralContainers").add(index, builder); ephemeralContainers.add(index, builder);}
    return (A)this;
  }
  
  public A setToEphemeralContainers(int index,V1EphemeralContainer item) {
    if (this.ephemeralContainers == null) {this.ephemeralContainers = new ArrayList<V1EphemeralContainerBuilder>();}
    V1EphemeralContainerBuilder builder = new V1EphemeralContainerBuilder(item);
    if (index < 0 || index >= ephemeralContainers.size()) { _visitables.get("ephemeralContainers").add(builder); ephemeralContainers.add(builder); } else { _visitables.get("ephemeralContainers").set(index, builder); ephemeralContainers.set(index, builder);}
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
    if (this.ephemeralContainers == null) return (A)this;
    for (V1EphemeralContainer item : items) {V1EphemeralContainerBuilder builder = new V1EphemeralContainerBuilder(item);_visitables.get("ephemeralContainers").remove(builder); this.ephemeralContainers.remove(builder);} return (A)this;
  }
  
  public A removeAllFromEphemeralContainers(Collection<V1EphemeralContainer> items) {
    if (this.ephemeralContainers == null) return (A)this;
    for (V1EphemeralContainer item : items) {V1EphemeralContainerBuilder builder = new V1EphemeralContainerBuilder(item);_visitables.get("ephemeralContainers").remove(builder); this.ephemeralContainers.remove(builder);} return (A)this;
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
  
  public List<V1EphemeralContainer> buildEphemeralContainers() {
    return this.ephemeralContainers != null ? build(ephemeralContainers) : null;
  }
  
  public V1EphemeralContainer buildEphemeralContainer(int index) {
    return this.ephemeralContainers.get(index).build();
  }
  
  public V1EphemeralContainer buildFirstEphemeralContainer() {
    return this.ephemeralContainers.get(0).build();
  }
  
  public V1EphemeralContainer buildLastEphemeralContainer() {
    return this.ephemeralContainers.get(ephemeralContainers.size() - 1).build();
  }
  
  public V1EphemeralContainer buildMatchingEphemeralContainer(Predicate<V1EphemeralContainerBuilder> predicate) {
      for (V1EphemeralContainerBuilder item : ephemeralContainers) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingEphemeralContainer(Predicate<V1EphemeralContainerBuilder> predicate) {
      for (V1EphemeralContainerBuilder item : ephemeralContainers) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withEphemeralContainers(List<V1EphemeralContainer> ephemeralContainers) {
    if (this.ephemeralContainers != null) {
      this._visitables.get("ephemeralContainers").clear();
    }
    if (ephemeralContainers != null) {
        this.ephemeralContainers = new ArrayList();
        for (V1EphemeralContainer item : ephemeralContainers) {
          this.addToEphemeralContainers(item);
        }
    } else {
      this.ephemeralContainers = null;
    }
    return (A) this;
  }
  
  public A withEphemeralContainers(io.kubernetes.client.openapi.models.V1EphemeralContainer... ephemeralContainers) {
    if (this.ephemeralContainers != null) {
        this.ephemeralContainers.clear();
        _visitables.remove("ephemeralContainers");
    }
    if (ephemeralContainers != null) {
      for (V1EphemeralContainer item : ephemeralContainers) {
        this.addToEphemeralContainers(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasEphemeralContainers() {
    return this.ephemeralContainers != null && !this.ephemeralContainers.isEmpty();
  }
  
  public EphemeralContainersNested<A> addNewEphemeralContainer() {
    return new EphemeralContainersNested(-1, null);
  }
  
  public EphemeralContainersNested<A> addNewEphemeralContainerLike(V1EphemeralContainer item) {
    return new EphemeralContainersNested(-1, item);
  }
  
  public EphemeralContainersNested<A> setNewEphemeralContainerLike(int index,V1EphemeralContainer item) {
    return new EphemeralContainersNested(index, item);
  }
  
  public EphemeralContainersNested<A> editEphemeralContainer(int index) {
    if (ephemeralContainers.size() <= index) throw new RuntimeException("Can't edit ephemeralContainers. Index exceeds size.");
    return setNewEphemeralContainerLike(index, buildEphemeralContainer(index));
  }
  
  public EphemeralContainersNested<A> editFirstEphemeralContainer() {
    if (ephemeralContainers.size() == 0) throw new RuntimeException("Can't edit first ephemeralContainers. The list is empty.");
    return setNewEphemeralContainerLike(0, buildEphemeralContainer(0));
  }
  
  public EphemeralContainersNested<A> editLastEphemeralContainer() {
    int index = ephemeralContainers.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ephemeralContainers. The list is empty.");
    return setNewEphemeralContainerLike(index, buildEphemeralContainer(index));
  }
  
  public EphemeralContainersNested<A> editMatchingEphemeralContainer(Predicate<V1EphemeralContainerBuilder> predicate) {
    int index = -1;
    for (int i=0;i<ephemeralContainers.size();i++) { 
    if (predicate.test(ephemeralContainers.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching ephemeralContainers. No match found.");
    return setNewEphemeralContainerLike(index, buildEphemeralContainer(index));
  }
  
  public A addToHostAliases(int index,V1HostAlias item) {
    if (this.hostAliases == null) {this.hostAliases = new ArrayList<V1HostAliasBuilder>();}
    V1HostAliasBuilder builder = new V1HostAliasBuilder(item);
    if (index < 0 || index >= hostAliases.size()) { _visitables.get("hostAliases").add(builder); hostAliases.add(builder); } else { _visitables.get("hostAliases").add(index, builder); hostAliases.add(index, builder);}
    return (A)this;
  }
  
  public A setToHostAliases(int index,V1HostAlias item) {
    if (this.hostAliases == null) {this.hostAliases = new ArrayList<V1HostAliasBuilder>();}
    V1HostAliasBuilder builder = new V1HostAliasBuilder(item);
    if (index < 0 || index >= hostAliases.size()) { _visitables.get("hostAliases").add(builder); hostAliases.add(builder); } else { _visitables.get("hostAliases").set(index, builder); hostAliases.set(index, builder);}
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
    if (this.hostAliases == null) return (A)this;
    for (V1HostAlias item : items) {V1HostAliasBuilder builder = new V1HostAliasBuilder(item);_visitables.get("hostAliases").remove(builder); this.hostAliases.remove(builder);} return (A)this;
  }
  
  public A removeAllFromHostAliases(Collection<V1HostAlias> items) {
    if (this.hostAliases == null) return (A)this;
    for (V1HostAlias item : items) {V1HostAliasBuilder builder = new V1HostAliasBuilder(item);_visitables.get("hostAliases").remove(builder); this.hostAliases.remove(builder);} return (A)this;
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
  
  public List<V1HostAlias> buildHostAliases() {
    return this.hostAliases != null ? build(hostAliases) : null;
  }
  
  public V1HostAlias buildHostAlias(int index) {
    return this.hostAliases.get(index).build();
  }
  
  public V1HostAlias buildFirstHostAlias() {
    return this.hostAliases.get(0).build();
  }
  
  public V1HostAlias buildLastHostAlias() {
    return this.hostAliases.get(hostAliases.size() - 1).build();
  }
  
  public V1HostAlias buildMatchingHostAlias(Predicate<V1HostAliasBuilder> predicate) {
      for (V1HostAliasBuilder item : hostAliases) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingHostAlias(Predicate<V1HostAliasBuilder> predicate) {
      for (V1HostAliasBuilder item : hostAliases) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withHostAliases(List<V1HostAlias> hostAliases) {
    if (this.hostAliases != null) {
      this._visitables.get("hostAliases").clear();
    }
    if (hostAliases != null) {
        this.hostAliases = new ArrayList();
        for (V1HostAlias item : hostAliases) {
          this.addToHostAliases(item);
        }
    } else {
      this.hostAliases = null;
    }
    return (A) this;
  }
  
  public A withHostAliases(io.kubernetes.client.openapi.models.V1HostAlias... hostAliases) {
    if (this.hostAliases != null) {
        this.hostAliases.clear();
        _visitables.remove("hostAliases");
    }
    if (hostAliases != null) {
      for (V1HostAlias item : hostAliases) {
        this.addToHostAliases(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasHostAliases() {
    return this.hostAliases != null && !this.hostAliases.isEmpty();
  }
  
  public HostAliasesNested<A> addNewHostAlias() {
    return new HostAliasesNested(-1, null);
  }
  
  public HostAliasesNested<A> addNewHostAliasLike(V1HostAlias item) {
    return new HostAliasesNested(-1, item);
  }
  
  public HostAliasesNested<A> setNewHostAliasLike(int index,V1HostAlias item) {
    return new HostAliasesNested(index, item);
  }
  
  public HostAliasesNested<A> editHostAlias(int index) {
    if (hostAliases.size() <= index) throw new RuntimeException("Can't edit hostAliases. Index exceeds size.");
    return setNewHostAliasLike(index, buildHostAlias(index));
  }
  
  public HostAliasesNested<A> editFirstHostAlias() {
    if (hostAliases.size() == 0) throw new RuntimeException("Can't edit first hostAliases. The list is empty.");
    return setNewHostAliasLike(0, buildHostAlias(0));
  }
  
  public HostAliasesNested<A> editLastHostAlias() {
    int index = hostAliases.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last hostAliases. The list is empty.");
    return setNewHostAliasLike(index, buildHostAlias(index));
  }
  
  public HostAliasesNested<A> editMatchingHostAlias(Predicate<V1HostAliasBuilder> predicate) {
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
    this.hostIPC = hostIPC;
    return (A) this;
  }
  
  public boolean hasHostIPC() {
    return this.hostIPC != null;
  }
  
  public Boolean getHostNetwork() {
    return this.hostNetwork;
  }
  
  public A withHostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
    return (A) this;
  }
  
  public boolean hasHostNetwork() {
    return this.hostNetwork != null;
  }
  
  public Boolean getHostPID() {
    return this.hostPID;
  }
  
  public A withHostPID(Boolean hostPID) {
    this.hostPID = hostPID;
    return (A) this;
  }
  
  public boolean hasHostPID() {
    return this.hostPID != null;
  }
  
  public Boolean getHostUsers() {
    return this.hostUsers;
  }
  
  public A withHostUsers(Boolean hostUsers) {
    this.hostUsers = hostUsers;
    return (A) this;
  }
  
  public boolean hasHostUsers() {
    return this.hostUsers != null;
  }
  
  public String getHostname() {
    return this.hostname;
  }
  
  public A withHostname(String hostname) {
    this.hostname = hostname;
    return (A) this;
  }
  
  public boolean hasHostname() {
    return this.hostname != null;
  }
  
  public A addToImagePullSecrets(int index,V1LocalObjectReference item) {
    if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<V1LocalObjectReferenceBuilder>();}
    V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);
    if (index < 0 || index >= imagePullSecrets.size()) { _visitables.get("imagePullSecrets").add(builder); imagePullSecrets.add(builder); } else { _visitables.get("imagePullSecrets").add(index, builder); imagePullSecrets.add(index, builder);}
    return (A)this;
  }
  
  public A setToImagePullSecrets(int index,V1LocalObjectReference item) {
    if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<V1LocalObjectReferenceBuilder>();}
    V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);
    if (index < 0 || index >= imagePullSecrets.size()) { _visitables.get("imagePullSecrets").add(builder); imagePullSecrets.add(builder); } else { _visitables.get("imagePullSecrets").set(index, builder); imagePullSecrets.set(index, builder);}
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
    if (this.imagePullSecrets == null) return (A)this;
    for (V1LocalObjectReference item : items) {V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);_visitables.get("imagePullSecrets").remove(builder); this.imagePullSecrets.remove(builder);} return (A)this;
  }
  
  public A removeAllFromImagePullSecrets(Collection<V1LocalObjectReference> items) {
    if (this.imagePullSecrets == null) return (A)this;
    for (V1LocalObjectReference item : items) {V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);_visitables.get("imagePullSecrets").remove(builder); this.imagePullSecrets.remove(builder);} return (A)this;
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
  
  public List<V1LocalObjectReference> buildImagePullSecrets() {
    return this.imagePullSecrets != null ? build(imagePullSecrets) : null;
  }
  
  public V1LocalObjectReference buildImagePullSecret(int index) {
    return this.imagePullSecrets.get(index).build();
  }
  
  public V1LocalObjectReference buildFirstImagePullSecret() {
    return this.imagePullSecrets.get(0).build();
  }
  
  public V1LocalObjectReference buildLastImagePullSecret() {
    return this.imagePullSecrets.get(imagePullSecrets.size() - 1).build();
  }
  
  public V1LocalObjectReference buildMatchingImagePullSecret(Predicate<V1LocalObjectReferenceBuilder> predicate) {
      for (V1LocalObjectReferenceBuilder item : imagePullSecrets) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingImagePullSecret(Predicate<V1LocalObjectReferenceBuilder> predicate) {
      for (V1LocalObjectReferenceBuilder item : imagePullSecrets) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withImagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    if (this.imagePullSecrets != null) {
      this._visitables.get("imagePullSecrets").clear();
    }
    if (imagePullSecrets != null) {
        this.imagePullSecrets = new ArrayList();
        for (V1LocalObjectReference item : imagePullSecrets) {
          this.addToImagePullSecrets(item);
        }
    } else {
      this.imagePullSecrets = null;
    }
    return (A) this;
  }
  
  public A withImagePullSecrets(io.kubernetes.client.openapi.models.V1LocalObjectReference... imagePullSecrets) {
    if (this.imagePullSecrets != null) {
        this.imagePullSecrets.clear();
        _visitables.remove("imagePullSecrets");
    }
    if (imagePullSecrets != null) {
      for (V1LocalObjectReference item : imagePullSecrets) {
        this.addToImagePullSecrets(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasImagePullSecrets() {
    return this.imagePullSecrets != null && !this.imagePullSecrets.isEmpty();
  }
  
  public ImagePullSecretsNested<A> addNewImagePullSecret() {
    return new ImagePullSecretsNested(-1, null);
  }
  
  public ImagePullSecretsNested<A> addNewImagePullSecretLike(V1LocalObjectReference item) {
    return new ImagePullSecretsNested(-1, item);
  }
  
  public ImagePullSecretsNested<A> setNewImagePullSecretLike(int index,V1LocalObjectReference item) {
    return new ImagePullSecretsNested(index, item);
  }
  
  public ImagePullSecretsNested<A> editImagePullSecret(int index) {
    if (imagePullSecrets.size() <= index) throw new RuntimeException("Can't edit imagePullSecrets. Index exceeds size.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }
  
  public ImagePullSecretsNested<A> editFirstImagePullSecret() {
    if (imagePullSecrets.size() == 0) throw new RuntimeException("Can't edit first imagePullSecrets. The list is empty.");
    return setNewImagePullSecretLike(0, buildImagePullSecret(0));
  }
  
  public ImagePullSecretsNested<A> editLastImagePullSecret() {
    int index = imagePullSecrets.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last imagePullSecrets. The list is empty.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }
  
  public ImagePullSecretsNested<A> editMatchingImagePullSecret(Predicate<V1LocalObjectReferenceBuilder> predicate) {
    int index = -1;
    for (int i=0;i<imagePullSecrets.size();i++) { 
    if (predicate.test(imagePullSecrets.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching imagePullSecrets. No match found.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }
  
  public A addToInitContainers(int index,V1Container item) {
    if (this.initContainers == null) {this.initContainers = new ArrayList<V1ContainerBuilder>();}
    V1ContainerBuilder builder = new V1ContainerBuilder(item);
    if (index < 0 || index >= initContainers.size()) { _visitables.get("initContainers").add(builder); initContainers.add(builder); } else { _visitables.get("initContainers").add(index, builder); initContainers.add(index, builder);}
    return (A)this;
  }
  
  public A setToInitContainers(int index,V1Container item) {
    if (this.initContainers == null) {this.initContainers = new ArrayList<V1ContainerBuilder>();}
    V1ContainerBuilder builder = new V1ContainerBuilder(item);
    if (index < 0 || index >= initContainers.size()) { _visitables.get("initContainers").add(builder); initContainers.add(builder); } else { _visitables.get("initContainers").set(index, builder); initContainers.set(index, builder);}
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
    if (this.initContainers == null) return (A)this;
    for (V1Container item : items) {V1ContainerBuilder builder = new V1ContainerBuilder(item);_visitables.get("initContainers").remove(builder); this.initContainers.remove(builder);} return (A)this;
  }
  
  public A removeAllFromInitContainers(Collection<V1Container> items) {
    if (this.initContainers == null) return (A)this;
    for (V1Container item : items) {V1ContainerBuilder builder = new V1ContainerBuilder(item);_visitables.get("initContainers").remove(builder); this.initContainers.remove(builder);} return (A)this;
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
  
  public List<V1Container> buildInitContainers() {
    return this.initContainers != null ? build(initContainers) : null;
  }
  
  public V1Container buildInitContainer(int index) {
    return this.initContainers.get(index).build();
  }
  
  public V1Container buildFirstInitContainer() {
    return this.initContainers.get(0).build();
  }
  
  public V1Container buildLastInitContainer() {
    return this.initContainers.get(initContainers.size() - 1).build();
  }
  
  public V1Container buildMatchingInitContainer(Predicate<V1ContainerBuilder> predicate) {
      for (V1ContainerBuilder item : initContainers) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingInitContainer(Predicate<V1ContainerBuilder> predicate) {
      for (V1ContainerBuilder item : initContainers) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withInitContainers(List<V1Container> initContainers) {
    if (this.initContainers != null) {
      this._visitables.get("initContainers").clear();
    }
    if (initContainers != null) {
        this.initContainers = new ArrayList();
        for (V1Container item : initContainers) {
          this.addToInitContainers(item);
        }
    } else {
      this.initContainers = null;
    }
    return (A) this;
  }
  
  public A withInitContainers(io.kubernetes.client.openapi.models.V1Container... initContainers) {
    if (this.initContainers != null) {
        this.initContainers.clear();
        _visitables.remove("initContainers");
    }
    if (initContainers != null) {
      for (V1Container item : initContainers) {
        this.addToInitContainers(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasInitContainers() {
    return this.initContainers != null && !this.initContainers.isEmpty();
  }
  
  public InitContainersNested<A> addNewInitContainer() {
    return new InitContainersNested(-1, null);
  }
  
  public InitContainersNested<A> addNewInitContainerLike(V1Container item) {
    return new InitContainersNested(-1, item);
  }
  
  public InitContainersNested<A> setNewInitContainerLike(int index,V1Container item) {
    return new InitContainersNested(index, item);
  }
  
  public InitContainersNested<A> editInitContainer(int index) {
    if (initContainers.size() <= index) throw new RuntimeException("Can't edit initContainers. Index exceeds size.");
    return setNewInitContainerLike(index, buildInitContainer(index));
  }
  
  public InitContainersNested<A> editFirstInitContainer() {
    if (initContainers.size() == 0) throw new RuntimeException("Can't edit first initContainers. The list is empty.");
    return setNewInitContainerLike(0, buildInitContainer(0));
  }
  
  public InitContainersNested<A> editLastInitContainer() {
    int index = initContainers.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last initContainers. The list is empty.");
    return setNewInitContainerLike(index, buildInitContainer(index));
  }
  
  public InitContainersNested<A> editMatchingInitContainer(Predicate<V1ContainerBuilder> predicate) {
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
    this.nodeName = nodeName;
    return (A) this;
  }
  
  public boolean hasNodeName() {
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
    if (nodeSelector == null) {
      this.nodeSelector = null;
    } else {
      this.nodeSelector = new LinkedHashMap(nodeSelector);
    }
    return (A) this;
  }
  
  public boolean hasNodeSelector() {
    return this.nodeSelector != null;
  }
  
  public V1PodOS buildOs() {
    return this.os != null ? this.os.build() : null;
  }
  
  public A withOs(V1PodOS os) {
    this._visitables.remove("os");
    if (os != null) {
        this.os = new V1PodOSBuilder(os);
        this._visitables.get("os").add(this.os);
    } else {
        this.os = null;
        this._visitables.get("os").remove(this.os);
    }
    return (A) this;
  }
  
  public boolean hasOs() {
    return this.os != null;
  }
  
  public OsNested<A> withNewOs() {
    return new OsNested(null);
  }
  
  public OsNested<A> withNewOsLike(V1PodOS item) {
    return new OsNested(item);
  }
  
  public OsNested<A> editOs() {
    return withNewOsLike(java.util.Optional.ofNullable(buildOs()).orElse(null));
  }
  
  public OsNested<A> editOrNewOs() {
    return withNewOsLike(java.util.Optional.ofNullable(buildOs()).orElse(new V1PodOSBuilder().build()));
  }
  
  public OsNested<A> editOrNewOsLike(V1PodOS item) {
    return withNewOsLike(java.util.Optional.ofNullable(buildOs()).orElse(item));
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
    if (overhead == null) {
      this.overhead = null;
    } else {
      this.overhead = new LinkedHashMap(overhead);
    }
    return (A) this;
  }
  
  public boolean hasOverhead() {
    return this.overhead != null;
  }
  
  public String getPreemptionPolicy() {
    return this.preemptionPolicy;
  }
  
  public A withPreemptionPolicy(String preemptionPolicy) {
    this.preemptionPolicy = preemptionPolicy;
    return (A) this;
  }
  
  public boolean hasPreemptionPolicy() {
    return this.preemptionPolicy != null;
  }
  
  public Integer getPriority() {
    return this.priority;
  }
  
  public A withPriority(Integer priority) {
    this.priority = priority;
    return (A) this;
  }
  
  public boolean hasPriority() {
    return this.priority != null;
  }
  
  public String getPriorityClassName() {
    return this.priorityClassName;
  }
  
  public A withPriorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
    return (A) this;
  }
  
  public boolean hasPriorityClassName() {
    return this.priorityClassName != null;
  }
  
  public A addToReadinessGates(int index,V1PodReadinessGate item) {
    if (this.readinessGates == null) {this.readinessGates = new ArrayList<V1PodReadinessGateBuilder>();}
    V1PodReadinessGateBuilder builder = new V1PodReadinessGateBuilder(item);
    if (index < 0 || index >= readinessGates.size()) { _visitables.get("readinessGates").add(builder); readinessGates.add(builder); } else { _visitables.get("readinessGates").add(index, builder); readinessGates.add(index, builder);}
    return (A)this;
  }
  
  public A setToReadinessGates(int index,V1PodReadinessGate item) {
    if (this.readinessGates == null) {this.readinessGates = new ArrayList<V1PodReadinessGateBuilder>();}
    V1PodReadinessGateBuilder builder = new V1PodReadinessGateBuilder(item);
    if (index < 0 || index >= readinessGates.size()) { _visitables.get("readinessGates").add(builder); readinessGates.add(builder); } else { _visitables.get("readinessGates").set(index, builder); readinessGates.set(index, builder);}
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
    if (this.readinessGates == null) return (A)this;
    for (V1PodReadinessGate item : items) {V1PodReadinessGateBuilder builder = new V1PodReadinessGateBuilder(item);_visitables.get("readinessGates").remove(builder); this.readinessGates.remove(builder);} return (A)this;
  }
  
  public A removeAllFromReadinessGates(Collection<V1PodReadinessGate> items) {
    if (this.readinessGates == null) return (A)this;
    for (V1PodReadinessGate item : items) {V1PodReadinessGateBuilder builder = new V1PodReadinessGateBuilder(item);_visitables.get("readinessGates").remove(builder); this.readinessGates.remove(builder);} return (A)this;
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
  
  public List<V1PodReadinessGate> buildReadinessGates() {
    return this.readinessGates != null ? build(readinessGates) : null;
  }
  
  public V1PodReadinessGate buildReadinessGate(int index) {
    return this.readinessGates.get(index).build();
  }
  
  public V1PodReadinessGate buildFirstReadinessGate() {
    return this.readinessGates.get(0).build();
  }
  
  public V1PodReadinessGate buildLastReadinessGate() {
    return this.readinessGates.get(readinessGates.size() - 1).build();
  }
  
  public V1PodReadinessGate buildMatchingReadinessGate(Predicate<V1PodReadinessGateBuilder> predicate) {
      for (V1PodReadinessGateBuilder item : readinessGates) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingReadinessGate(Predicate<V1PodReadinessGateBuilder> predicate) {
      for (V1PodReadinessGateBuilder item : readinessGates) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withReadinessGates(List<V1PodReadinessGate> readinessGates) {
    if (this.readinessGates != null) {
      this._visitables.get("readinessGates").clear();
    }
    if (readinessGates != null) {
        this.readinessGates = new ArrayList();
        for (V1PodReadinessGate item : readinessGates) {
          this.addToReadinessGates(item);
        }
    } else {
      this.readinessGates = null;
    }
    return (A) this;
  }
  
  public A withReadinessGates(io.kubernetes.client.openapi.models.V1PodReadinessGate... readinessGates) {
    if (this.readinessGates != null) {
        this.readinessGates.clear();
        _visitables.remove("readinessGates");
    }
    if (readinessGates != null) {
      for (V1PodReadinessGate item : readinessGates) {
        this.addToReadinessGates(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasReadinessGates() {
    return this.readinessGates != null && !this.readinessGates.isEmpty();
  }
  
  public ReadinessGatesNested<A> addNewReadinessGate() {
    return new ReadinessGatesNested(-1, null);
  }
  
  public ReadinessGatesNested<A> addNewReadinessGateLike(V1PodReadinessGate item) {
    return new ReadinessGatesNested(-1, item);
  }
  
  public ReadinessGatesNested<A> setNewReadinessGateLike(int index,V1PodReadinessGate item) {
    return new ReadinessGatesNested(index, item);
  }
  
  public ReadinessGatesNested<A> editReadinessGate(int index) {
    if (readinessGates.size() <= index) throw new RuntimeException("Can't edit readinessGates. Index exceeds size.");
    return setNewReadinessGateLike(index, buildReadinessGate(index));
  }
  
  public ReadinessGatesNested<A> editFirstReadinessGate() {
    if (readinessGates.size() == 0) throw new RuntimeException("Can't edit first readinessGates. The list is empty.");
    return setNewReadinessGateLike(0, buildReadinessGate(0));
  }
  
  public ReadinessGatesNested<A> editLastReadinessGate() {
    int index = readinessGates.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last readinessGates. The list is empty.");
    return setNewReadinessGateLike(index, buildReadinessGate(index));
  }
  
  public ReadinessGatesNested<A> editMatchingReadinessGate(Predicate<V1PodReadinessGateBuilder> predicate) {
    int index = -1;
    for (int i=0;i<readinessGates.size();i++) { 
    if (predicate.test(readinessGates.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching readinessGates. No match found.");
    return setNewReadinessGateLike(index, buildReadinessGate(index));
  }
  
  public A addToResourceClaims(int index,V1PodResourceClaim item) {
    if (this.resourceClaims == null) {this.resourceClaims = new ArrayList<V1PodResourceClaimBuilder>();}
    V1PodResourceClaimBuilder builder = new V1PodResourceClaimBuilder(item);
    if (index < 0 || index >= resourceClaims.size()) { _visitables.get("resourceClaims").add(builder); resourceClaims.add(builder); } else { _visitables.get("resourceClaims").add(index, builder); resourceClaims.add(index, builder);}
    return (A)this;
  }
  
  public A setToResourceClaims(int index,V1PodResourceClaim item) {
    if (this.resourceClaims == null) {this.resourceClaims = new ArrayList<V1PodResourceClaimBuilder>();}
    V1PodResourceClaimBuilder builder = new V1PodResourceClaimBuilder(item);
    if (index < 0 || index >= resourceClaims.size()) { _visitables.get("resourceClaims").add(builder); resourceClaims.add(builder); } else { _visitables.get("resourceClaims").set(index, builder); resourceClaims.set(index, builder);}
    return (A)this;
  }
  
  public A addToResourceClaims(io.kubernetes.client.openapi.models.V1PodResourceClaim... items) {
    if (this.resourceClaims == null) {this.resourceClaims = new ArrayList<V1PodResourceClaimBuilder>();}
    for (V1PodResourceClaim item : items) {V1PodResourceClaimBuilder builder = new V1PodResourceClaimBuilder(item);_visitables.get("resourceClaims").add(builder);this.resourceClaims.add(builder);} return (A)this;
  }
  
  public A addAllToResourceClaims(Collection<V1PodResourceClaim> items) {
    if (this.resourceClaims == null) {this.resourceClaims = new ArrayList<V1PodResourceClaimBuilder>();}
    for (V1PodResourceClaim item : items) {V1PodResourceClaimBuilder builder = new V1PodResourceClaimBuilder(item);_visitables.get("resourceClaims").add(builder);this.resourceClaims.add(builder);} return (A)this;
  }
  
  public A removeFromResourceClaims(io.kubernetes.client.openapi.models.V1PodResourceClaim... items) {
    if (this.resourceClaims == null) return (A)this;
    for (V1PodResourceClaim item : items) {V1PodResourceClaimBuilder builder = new V1PodResourceClaimBuilder(item);_visitables.get("resourceClaims").remove(builder); this.resourceClaims.remove(builder);} return (A)this;
  }
  
  public A removeAllFromResourceClaims(Collection<V1PodResourceClaim> items) {
    if (this.resourceClaims == null) return (A)this;
    for (V1PodResourceClaim item : items) {V1PodResourceClaimBuilder builder = new V1PodResourceClaimBuilder(item);_visitables.get("resourceClaims").remove(builder); this.resourceClaims.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromResourceClaims(Predicate<V1PodResourceClaimBuilder> predicate) {
    if (resourceClaims == null) return (A) this;
    final Iterator<V1PodResourceClaimBuilder> each = resourceClaims.iterator();
    final List visitables = _visitables.get("resourceClaims");
    while (each.hasNext()) {
      V1PodResourceClaimBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1PodResourceClaim> buildResourceClaims() {
    return this.resourceClaims != null ? build(resourceClaims) : null;
  }
  
  public V1PodResourceClaim buildResourceClaim(int index) {
    return this.resourceClaims.get(index).build();
  }
  
  public V1PodResourceClaim buildFirstResourceClaim() {
    return this.resourceClaims.get(0).build();
  }
  
  public V1PodResourceClaim buildLastResourceClaim() {
    return this.resourceClaims.get(resourceClaims.size() - 1).build();
  }
  
  public V1PodResourceClaim buildMatchingResourceClaim(Predicate<V1PodResourceClaimBuilder> predicate) {
      for (V1PodResourceClaimBuilder item : resourceClaims) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingResourceClaim(Predicate<V1PodResourceClaimBuilder> predicate) {
      for (V1PodResourceClaimBuilder item : resourceClaims) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withResourceClaims(List<V1PodResourceClaim> resourceClaims) {
    if (this.resourceClaims != null) {
      this._visitables.get("resourceClaims").clear();
    }
    if (resourceClaims != null) {
        this.resourceClaims = new ArrayList();
        for (V1PodResourceClaim item : resourceClaims) {
          this.addToResourceClaims(item);
        }
    } else {
      this.resourceClaims = null;
    }
    return (A) this;
  }
  
  public A withResourceClaims(io.kubernetes.client.openapi.models.V1PodResourceClaim... resourceClaims) {
    if (this.resourceClaims != null) {
        this.resourceClaims.clear();
        _visitables.remove("resourceClaims");
    }
    if (resourceClaims != null) {
      for (V1PodResourceClaim item : resourceClaims) {
        this.addToResourceClaims(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasResourceClaims() {
    return this.resourceClaims != null && !this.resourceClaims.isEmpty();
  }
  
  public ResourceClaimsNested<A> addNewResourceClaim() {
    return new ResourceClaimsNested(-1, null);
  }
  
  public ResourceClaimsNested<A> addNewResourceClaimLike(V1PodResourceClaim item) {
    return new ResourceClaimsNested(-1, item);
  }
  
  public ResourceClaimsNested<A> setNewResourceClaimLike(int index,V1PodResourceClaim item) {
    return new ResourceClaimsNested(index, item);
  }
  
  public ResourceClaimsNested<A> editResourceClaim(int index) {
    if (resourceClaims.size() <= index) throw new RuntimeException("Can't edit resourceClaims. Index exceeds size.");
    return setNewResourceClaimLike(index, buildResourceClaim(index));
  }
  
  public ResourceClaimsNested<A> editFirstResourceClaim() {
    if (resourceClaims.size() == 0) throw new RuntimeException("Can't edit first resourceClaims. The list is empty.");
    return setNewResourceClaimLike(0, buildResourceClaim(0));
  }
  
  public ResourceClaimsNested<A> editLastResourceClaim() {
    int index = resourceClaims.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last resourceClaims. The list is empty.");
    return setNewResourceClaimLike(index, buildResourceClaim(index));
  }
  
  public ResourceClaimsNested<A> editMatchingResourceClaim(Predicate<V1PodResourceClaimBuilder> predicate) {
    int index = -1;
    for (int i=0;i<resourceClaims.size();i++) { 
    if (predicate.test(resourceClaims.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching resourceClaims. No match found.");
    return setNewResourceClaimLike(index, buildResourceClaim(index));
  }
  
  public String getRestartPolicy() {
    return this.restartPolicy;
  }
  
  public A withRestartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
    return (A) this;
  }
  
  public boolean hasRestartPolicy() {
    return this.restartPolicy != null;
  }
  
  public String getRuntimeClassName() {
    return this.runtimeClassName;
  }
  
  public A withRuntimeClassName(String runtimeClassName) {
    this.runtimeClassName = runtimeClassName;
    return (A) this;
  }
  
  public boolean hasRuntimeClassName() {
    return this.runtimeClassName != null;
  }
  
  public String getSchedulerName() {
    return this.schedulerName;
  }
  
  public A withSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
    return (A) this;
  }
  
  public boolean hasSchedulerName() {
    return this.schedulerName != null;
  }
  
  public A addToSchedulingGates(int index,V1PodSchedulingGate item) {
    if (this.schedulingGates == null) {this.schedulingGates = new ArrayList<V1PodSchedulingGateBuilder>();}
    V1PodSchedulingGateBuilder builder = new V1PodSchedulingGateBuilder(item);
    if (index < 0 || index >= schedulingGates.size()) { _visitables.get("schedulingGates").add(builder); schedulingGates.add(builder); } else { _visitables.get("schedulingGates").add(index, builder); schedulingGates.add(index, builder);}
    return (A)this;
  }
  
  public A setToSchedulingGates(int index,V1PodSchedulingGate item) {
    if (this.schedulingGates == null) {this.schedulingGates = new ArrayList<V1PodSchedulingGateBuilder>();}
    V1PodSchedulingGateBuilder builder = new V1PodSchedulingGateBuilder(item);
    if (index < 0 || index >= schedulingGates.size()) { _visitables.get("schedulingGates").add(builder); schedulingGates.add(builder); } else { _visitables.get("schedulingGates").set(index, builder); schedulingGates.set(index, builder);}
    return (A)this;
  }
  
  public A addToSchedulingGates(io.kubernetes.client.openapi.models.V1PodSchedulingGate... items) {
    if (this.schedulingGates == null) {this.schedulingGates = new ArrayList<V1PodSchedulingGateBuilder>();}
    for (V1PodSchedulingGate item : items) {V1PodSchedulingGateBuilder builder = new V1PodSchedulingGateBuilder(item);_visitables.get("schedulingGates").add(builder);this.schedulingGates.add(builder);} return (A)this;
  }
  
  public A addAllToSchedulingGates(Collection<V1PodSchedulingGate> items) {
    if (this.schedulingGates == null) {this.schedulingGates = new ArrayList<V1PodSchedulingGateBuilder>();}
    for (V1PodSchedulingGate item : items) {V1PodSchedulingGateBuilder builder = new V1PodSchedulingGateBuilder(item);_visitables.get("schedulingGates").add(builder);this.schedulingGates.add(builder);} return (A)this;
  }
  
  public A removeFromSchedulingGates(io.kubernetes.client.openapi.models.V1PodSchedulingGate... items) {
    if (this.schedulingGates == null) return (A)this;
    for (V1PodSchedulingGate item : items) {V1PodSchedulingGateBuilder builder = new V1PodSchedulingGateBuilder(item);_visitables.get("schedulingGates").remove(builder); this.schedulingGates.remove(builder);} return (A)this;
  }
  
  public A removeAllFromSchedulingGates(Collection<V1PodSchedulingGate> items) {
    if (this.schedulingGates == null) return (A)this;
    for (V1PodSchedulingGate item : items) {V1PodSchedulingGateBuilder builder = new V1PodSchedulingGateBuilder(item);_visitables.get("schedulingGates").remove(builder); this.schedulingGates.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromSchedulingGates(Predicate<V1PodSchedulingGateBuilder> predicate) {
    if (schedulingGates == null) return (A) this;
    final Iterator<V1PodSchedulingGateBuilder> each = schedulingGates.iterator();
    final List visitables = _visitables.get("schedulingGates");
    while (each.hasNext()) {
      V1PodSchedulingGateBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1PodSchedulingGate> buildSchedulingGates() {
    return this.schedulingGates != null ? build(schedulingGates) : null;
  }
  
  public V1PodSchedulingGate buildSchedulingGate(int index) {
    return this.schedulingGates.get(index).build();
  }
  
  public V1PodSchedulingGate buildFirstSchedulingGate() {
    return this.schedulingGates.get(0).build();
  }
  
  public V1PodSchedulingGate buildLastSchedulingGate() {
    return this.schedulingGates.get(schedulingGates.size() - 1).build();
  }
  
  public V1PodSchedulingGate buildMatchingSchedulingGate(Predicate<V1PodSchedulingGateBuilder> predicate) {
      for (V1PodSchedulingGateBuilder item : schedulingGates) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingSchedulingGate(Predicate<V1PodSchedulingGateBuilder> predicate) {
      for (V1PodSchedulingGateBuilder item : schedulingGates) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withSchedulingGates(List<V1PodSchedulingGate> schedulingGates) {
    if (this.schedulingGates != null) {
      this._visitables.get("schedulingGates").clear();
    }
    if (schedulingGates != null) {
        this.schedulingGates = new ArrayList();
        for (V1PodSchedulingGate item : schedulingGates) {
          this.addToSchedulingGates(item);
        }
    } else {
      this.schedulingGates = null;
    }
    return (A) this;
  }
  
  public A withSchedulingGates(io.kubernetes.client.openapi.models.V1PodSchedulingGate... schedulingGates) {
    if (this.schedulingGates != null) {
        this.schedulingGates.clear();
        _visitables.remove("schedulingGates");
    }
    if (schedulingGates != null) {
      for (V1PodSchedulingGate item : schedulingGates) {
        this.addToSchedulingGates(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasSchedulingGates() {
    return this.schedulingGates != null && !this.schedulingGates.isEmpty();
  }
  
  public SchedulingGatesNested<A> addNewSchedulingGate() {
    return new SchedulingGatesNested(-1, null);
  }
  
  public SchedulingGatesNested<A> addNewSchedulingGateLike(V1PodSchedulingGate item) {
    return new SchedulingGatesNested(-1, item);
  }
  
  public SchedulingGatesNested<A> setNewSchedulingGateLike(int index,V1PodSchedulingGate item) {
    return new SchedulingGatesNested(index, item);
  }
  
  public SchedulingGatesNested<A> editSchedulingGate(int index) {
    if (schedulingGates.size() <= index) throw new RuntimeException("Can't edit schedulingGates. Index exceeds size.");
    return setNewSchedulingGateLike(index, buildSchedulingGate(index));
  }
  
  public SchedulingGatesNested<A> editFirstSchedulingGate() {
    if (schedulingGates.size() == 0) throw new RuntimeException("Can't edit first schedulingGates. The list is empty.");
    return setNewSchedulingGateLike(0, buildSchedulingGate(0));
  }
  
  public SchedulingGatesNested<A> editLastSchedulingGate() {
    int index = schedulingGates.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last schedulingGates. The list is empty.");
    return setNewSchedulingGateLike(index, buildSchedulingGate(index));
  }
  
  public SchedulingGatesNested<A> editMatchingSchedulingGate(Predicate<V1PodSchedulingGateBuilder> predicate) {
    int index = -1;
    for (int i=0;i<schedulingGates.size();i++) { 
    if (predicate.test(schedulingGates.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching schedulingGates. No match found.");
    return setNewSchedulingGateLike(index, buildSchedulingGate(index));
  }
  
  public V1PodSecurityContext buildSecurityContext() {
    return this.securityContext != null ? this.securityContext.build() : null;
  }
  
  public A withSecurityContext(V1PodSecurityContext securityContext) {
    this._visitables.remove("securityContext");
    if (securityContext != null) {
        this.securityContext = new V1PodSecurityContextBuilder(securityContext);
        this._visitables.get("securityContext").add(this.securityContext);
    } else {
        this.securityContext = null;
        this._visitables.get("securityContext").remove(this.securityContext);
    }
    return (A) this;
  }
  
  public boolean hasSecurityContext() {
    return this.securityContext != null;
  }
  
  public SecurityContextNested<A> withNewSecurityContext() {
    return new SecurityContextNested(null);
  }
  
  public SecurityContextNested<A> withNewSecurityContextLike(V1PodSecurityContext item) {
    return new SecurityContextNested(item);
  }
  
  public SecurityContextNested<A> editSecurityContext() {
    return withNewSecurityContextLike(java.util.Optional.ofNullable(buildSecurityContext()).orElse(null));
  }
  
  public SecurityContextNested<A> editOrNewSecurityContext() {
    return withNewSecurityContextLike(java.util.Optional.ofNullable(buildSecurityContext()).orElse(new V1PodSecurityContextBuilder().build()));
  }
  
  public SecurityContextNested<A> editOrNewSecurityContextLike(V1PodSecurityContext item) {
    return withNewSecurityContextLike(java.util.Optional.ofNullable(buildSecurityContext()).orElse(item));
  }
  
  public String getServiceAccount() {
    return this.serviceAccount;
  }
  
  public A withServiceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return (A) this;
  }
  
  public boolean hasServiceAccount() {
    return this.serviceAccount != null;
  }
  
  public String getServiceAccountName() {
    return this.serviceAccountName;
  }
  
  public A withServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return (A) this;
  }
  
  public boolean hasServiceAccountName() {
    return this.serviceAccountName != null;
  }
  
  public Boolean getSetHostnameAsFQDN() {
    return this.setHostnameAsFQDN;
  }
  
  public A withSetHostnameAsFQDN(Boolean setHostnameAsFQDN) {
    this.setHostnameAsFQDN = setHostnameAsFQDN;
    return (A) this;
  }
  
  public boolean hasSetHostnameAsFQDN() {
    return this.setHostnameAsFQDN != null;
  }
  
  public Boolean getShareProcessNamespace() {
    return this.shareProcessNamespace;
  }
  
  public A withShareProcessNamespace(Boolean shareProcessNamespace) {
    this.shareProcessNamespace = shareProcessNamespace;
    return (A) this;
  }
  
  public boolean hasShareProcessNamespace() {
    return this.shareProcessNamespace != null;
  }
  
  public String getSubdomain() {
    return this.subdomain;
  }
  
  public A withSubdomain(String subdomain) {
    this.subdomain = subdomain;
    return (A) this;
  }
  
  public boolean hasSubdomain() {
    return this.subdomain != null;
  }
  
  public Long getTerminationGracePeriodSeconds() {
    return this.terminationGracePeriodSeconds;
  }
  
  public A withTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    return (A) this;
  }
  
  public boolean hasTerminationGracePeriodSeconds() {
    return this.terminationGracePeriodSeconds != null;
  }
  
  public A addToTolerations(int index,V1Toleration item) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<V1TolerationBuilder>();}
    V1TolerationBuilder builder = new V1TolerationBuilder(item);
    if (index < 0 || index >= tolerations.size()) { _visitables.get("tolerations").add(builder); tolerations.add(builder); } else { _visitables.get("tolerations").add(index, builder); tolerations.add(index, builder);}
    return (A)this;
  }
  
  public A setToTolerations(int index,V1Toleration item) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<V1TolerationBuilder>();}
    V1TolerationBuilder builder = new V1TolerationBuilder(item);
    if (index < 0 || index >= tolerations.size()) { _visitables.get("tolerations").add(builder); tolerations.add(builder); } else { _visitables.get("tolerations").set(index, builder); tolerations.set(index, builder);}
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
    if (this.tolerations == null) return (A)this;
    for (V1Toleration item : items) {V1TolerationBuilder builder = new V1TolerationBuilder(item);_visitables.get("tolerations").remove(builder); this.tolerations.remove(builder);} return (A)this;
  }
  
  public A removeAllFromTolerations(Collection<V1Toleration> items) {
    if (this.tolerations == null) return (A)this;
    for (V1Toleration item : items) {V1TolerationBuilder builder = new V1TolerationBuilder(item);_visitables.get("tolerations").remove(builder); this.tolerations.remove(builder);} return (A)this;
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
  
  public List<V1Toleration> buildTolerations() {
    return this.tolerations != null ? build(tolerations) : null;
  }
  
  public V1Toleration buildToleration(int index) {
    return this.tolerations.get(index).build();
  }
  
  public V1Toleration buildFirstToleration() {
    return this.tolerations.get(0).build();
  }
  
  public V1Toleration buildLastToleration() {
    return this.tolerations.get(tolerations.size() - 1).build();
  }
  
  public V1Toleration buildMatchingToleration(Predicate<V1TolerationBuilder> predicate) {
      for (V1TolerationBuilder item : tolerations) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingToleration(Predicate<V1TolerationBuilder> predicate) {
      for (V1TolerationBuilder item : tolerations) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTolerations(List<V1Toleration> tolerations) {
    if (this.tolerations != null) {
      this._visitables.get("tolerations").clear();
    }
    if (tolerations != null) {
        this.tolerations = new ArrayList();
        for (V1Toleration item : tolerations) {
          this.addToTolerations(item);
        }
    } else {
      this.tolerations = null;
    }
    return (A) this;
  }
  
  public A withTolerations(io.kubernetes.client.openapi.models.V1Toleration... tolerations) {
    if (this.tolerations != null) {
        this.tolerations.clear();
        _visitables.remove("tolerations");
    }
    if (tolerations != null) {
      for (V1Toleration item : tolerations) {
        this.addToTolerations(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTolerations() {
    return this.tolerations != null && !this.tolerations.isEmpty();
  }
  
  public TolerationsNested<A> addNewToleration() {
    return new TolerationsNested(-1, null);
  }
  
  public TolerationsNested<A> addNewTolerationLike(V1Toleration item) {
    return new TolerationsNested(-1, item);
  }
  
  public TolerationsNested<A> setNewTolerationLike(int index,V1Toleration item) {
    return new TolerationsNested(index, item);
  }
  
  public TolerationsNested<A> editToleration(int index) {
    if (tolerations.size() <= index) throw new RuntimeException("Can't edit tolerations. Index exceeds size.");
    return setNewTolerationLike(index, buildToleration(index));
  }
  
  public TolerationsNested<A> editFirstToleration() {
    if (tolerations.size() == 0) throw new RuntimeException("Can't edit first tolerations. The list is empty.");
    return setNewTolerationLike(0, buildToleration(0));
  }
  
  public TolerationsNested<A> editLastToleration() {
    int index = tolerations.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last tolerations. The list is empty.");
    return setNewTolerationLike(index, buildToleration(index));
  }
  
  public TolerationsNested<A> editMatchingToleration(Predicate<V1TolerationBuilder> predicate) {
    int index = -1;
    for (int i=0;i<tolerations.size();i++) { 
    if (predicate.test(tolerations.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching tolerations. No match found.");
    return setNewTolerationLike(index, buildToleration(index));
  }
  
  public A addToTopologySpreadConstraints(int index,V1TopologySpreadConstraint item) {
    if (this.topologySpreadConstraints == null) {this.topologySpreadConstraints = new ArrayList<V1TopologySpreadConstraintBuilder>();}
    V1TopologySpreadConstraintBuilder builder = new V1TopologySpreadConstraintBuilder(item);
    if (index < 0 || index >= topologySpreadConstraints.size()) { _visitables.get("topologySpreadConstraints").add(builder); topologySpreadConstraints.add(builder); } else { _visitables.get("topologySpreadConstraints").add(index, builder); topologySpreadConstraints.add(index, builder);}
    return (A)this;
  }
  
  public A setToTopologySpreadConstraints(int index,V1TopologySpreadConstraint item) {
    if (this.topologySpreadConstraints == null) {this.topologySpreadConstraints = new ArrayList<V1TopologySpreadConstraintBuilder>();}
    V1TopologySpreadConstraintBuilder builder = new V1TopologySpreadConstraintBuilder(item);
    if (index < 0 || index >= topologySpreadConstraints.size()) { _visitables.get("topologySpreadConstraints").add(builder); topologySpreadConstraints.add(builder); } else { _visitables.get("topologySpreadConstraints").set(index, builder); topologySpreadConstraints.set(index, builder);}
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
    if (this.topologySpreadConstraints == null) return (A)this;
    for (V1TopologySpreadConstraint item : items) {V1TopologySpreadConstraintBuilder builder = new V1TopologySpreadConstraintBuilder(item);_visitables.get("topologySpreadConstraints").remove(builder); this.topologySpreadConstraints.remove(builder);} return (A)this;
  }
  
  public A removeAllFromTopologySpreadConstraints(Collection<V1TopologySpreadConstraint> items) {
    if (this.topologySpreadConstraints == null) return (A)this;
    for (V1TopologySpreadConstraint item : items) {V1TopologySpreadConstraintBuilder builder = new V1TopologySpreadConstraintBuilder(item);_visitables.get("topologySpreadConstraints").remove(builder); this.topologySpreadConstraints.remove(builder);} return (A)this;
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
  
  public List<V1TopologySpreadConstraint> buildTopologySpreadConstraints() {
    return this.topologySpreadConstraints != null ? build(topologySpreadConstraints) : null;
  }
  
  public V1TopologySpreadConstraint buildTopologySpreadConstraint(int index) {
    return this.topologySpreadConstraints.get(index).build();
  }
  
  public V1TopologySpreadConstraint buildFirstTopologySpreadConstraint() {
    return this.topologySpreadConstraints.get(0).build();
  }
  
  public V1TopologySpreadConstraint buildLastTopologySpreadConstraint() {
    return this.topologySpreadConstraints.get(topologySpreadConstraints.size() - 1).build();
  }
  
  public V1TopologySpreadConstraint buildMatchingTopologySpreadConstraint(Predicate<V1TopologySpreadConstraintBuilder> predicate) {
      for (V1TopologySpreadConstraintBuilder item : topologySpreadConstraints) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingTopologySpreadConstraint(Predicate<V1TopologySpreadConstraintBuilder> predicate) {
      for (V1TopologySpreadConstraintBuilder item : topologySpreadConstraints) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTopologySpreadConstraints(List<V1TopologySpreadConstraint> topologySpreadConstraints) {
    if (this.topologySpreadConstraints != null) {
      this._visitables.get("topologySpreadConstraints").clear();
    }
    if (topologySpreadConstraints != null) {
        this.topologySpreadConstraints = new ArrayList();
        for (V1TopologySpreadConstraint item : topologySpreadConstraints) {
          this.addToTopologySpreadConstraints(item);
        }
    } else {
      this.topologySpreadConstraints = null;
    }
    return (A) this;
  }
  
  public A withTopologySpreadConstraints(io.kubernetes.client.openapi.models.V1TopologySpreadConstraint... topologySpreadConstraints) {
    if (this.topologySpreadConstraints != null) {
        this.topologySpreadConstraints.clear();
        _visitables.remove("topologySpreadConstraints");
    }
    if (topologySpreadConstraints != null) {
      for (V1TopologySpreadConstraint item : topologySpreadConstraints) {
        this.addToTopologySpreadConstraints(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTopologySpreadConstraints() {
    return this.topologySpreadConstraints != null && !this.topologySpreadConstraints.isEmpty();
  }
  
  public TopologySpreadConstraintsNested<A> addNewTopologySpreadConstraint() {
    return new TopologySpreadConstraintsNested(-1, null);
  }
  
  public TopologySpreadConstraintsNested<A> addNewTopologySpreadConstraintLike(V1TopologySpreadConstraint item) {
    return new TopologySpreadConstraintsNested(-1, item);
  }
  
  public TopologySpreadConstraintsNested<A> setNewTopologySpreadConstraintLike(int index,V1TopologySpreadConstraint item) {
    return new TopologySpreadConstraintsNested(index, item);
  }
  
  public TopologySpreadConstraintsNested<A> editTopologySpreadConstraint(int index) {
    if (topologySpreadConstraints.size() <= index) throw new RuntimeException("Can't edit topologySpreadConstraints. Index exceeds size.");
    return setNewTopologySpreadConstraintLike(index, buildTopologySpreadConstraint(index));
  }
  
  public TopologySpreadConstraintsNested<A> editFirstTopologySpreadConstraint() {
    if (topologySpreadConstraints.size() == 0) throw new RuntimeException("Can't edit first topologySpreadConstraints. The list is empty.");
    return setNewTopologySpreadConstraintLike(0, buildTopologySpreadConstraint(0));
  }
  
  public TopologySpreadConstraintsNested<A> editLastTopologySpreadConstraint() {
    int index = topologySpreadConstraints.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last topologySpreadConstraints. The list is empty.");
    return setNewTopologySpreadConstraintLike(index, buildTopologySpreadConstraint(index));
  }
  
  public TopologySpreadConstraintsNested<A> editMatchingTopologySpreadConstraint(Predicate<V1TopologySpreadConstraintBuilder> predicate) {
    int index = -1;
    for (int i=0;i<topologySpreadConstraints.size();i++) { 
    if (predicate.test(topologySpreadConstraints.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching topologySpreadConstraints. No match found.");
    return setNewTopologySpreadConstraintLike(index, buildTopologySpreadConstraint(index));
  }
  
  public A addToVolumes(int index,V1Volume item) {
    if (this.volumes == null) {this.volumes = new ArrayList<V1VolumeBuilder>();}
    V1VolumeBuilder builder = new V1VolumeBuilder(item);
    if (index < 0 || index >= volumes.size()) { _visitables.get("volumes").add(builder); volumes.add(builder); } else { _visitables.get("volumes").add(index, builder); volumes.add(index, builder);}
    return (A)this;
  }
  
  public A setToVolumes(int index,V1Volume item) {
    if (this.volumes == null) {this.volumes = new ArrayList<V1VolumeBuilder>();}
    V1VolumeBuilder builder = new V1VolumeBuilder(item);
    if (index < 0 || index >= volumes.size()) { _visitables.get("volumes").add(builder); volumes.add(builder); } else { _visitables.get("volumes").set(index, builder); volumes.set(index, builder);}
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
    if (this.volumes == null) return (A)this;
    for (V1Volume item : items) {V1VolumeBuilder builder = new V1VolumeBuilder(item);_visitables.get("volumes").remove(builder); this.volumes.remove(builder);} return (A)this;
  }
  
  public A removeAllFromVolumes(Collection<V1Volume> items) {
    if (this.volumes == null) return (A)this;
    for (V1Volume item : items) {V1VolumeBuilder builder = new V1VolumeBuilder(item);_visitables.get("volumes").remove(builder); this.volumes.remove(builder);} return (A)this;
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
  
  public List<V1Volume> buildVolumes() {
    return this.volumes != null ? build(volumes) : null;
  }
  
  public V1Volume buildVolume(int index) {
    return this.volumes.get(index).build();
  }
  
  public V1Volume buildFirstVolume() {
    return this.volumes.get(0).build();
  }
  
  public V1Volume buildLastVolume() {
    return this.volumes.get(volumes.size() - 1).build();
  }
  
  public V1Volume buildMatchingVolume(Predicate<V1VolumeBuilder> predicate) {
      for (V1VolumeBuilder item : volumes) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingVolume(Predicate<V1VolumeBuilder> predicate) {
      for (V1VolumeBuilder item : volumes) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withVolumes(List<V1Volume> volumes) {
    if (this.volumes != null) {
      this._visitables.get("volumes").clear();
    }
    if (volumes != null) {
        this.volumes = new ArrayList();
        for (V1Volume item : volumes) {
          this.addToVolumes(item);
        }
    } else {
      this.volumes = null;
    }
    return (A) this;
  }
  
  public A withVolumes(io.kubernetes.client.openapi.models.V1Volume... volumes) {
    if (this.volumes != null) {
        this.volumes.clear();
        _visitables.remove("volumes");
    }
    if (volumes != null) {
      for (V1Volume item : volumes) {
        this.addToVolumes(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasVolumes() {
    return this.volumes != null && !this.volumes.isEmpty();
  }
  
  public VolumesNested<A> addNewVolume() {
    return new VolumesNested(-1, null);
  }
  
  public VolumesNested<A> addNewVolumeLike(V1Volume item) {
    return new VolumesNested(-1, item);
  }
  
  public VolumesNested<A> setNewVolumeLike(int index,V1Volume item) {
    return new VolumesNested(index, item);
  }
  
  public VolumesNested<A> editVolume(int index) {
    if (volumes.size() <= index) throw new RuntimeException("Can't edit volumes. Index exceeds size.");
    return setNewVolumeLike(index, buildVolume(index));
  }
  
  public VolumesNested<A> editFirstVolume() {
    if (volumes.size() == 0) throw new RuntimeException("Can't edit first volumes. The list is empty.");
    return setNewVolumeLike(0, buildVolume(0));
  }
  
  public VolumesNested<A> editLastVolume() {
    int index = volumes.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last volumes. The list is empty.");
    return setNewVolumeLike(index, buildVolume(index));
  }
  
  public VolumesNested<A> editMatchingVolume(Predicate<V1VolumeBuilder> predicate) {
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
    if (!super.equals(o)) return false;
    V1PodSpecFluent that = (V1PodSpecFluent) o;
    if (!java.util.Objects.equals(activeDeadlineSeconds, that.activeDeadlineSeconds)) return false;
    if (!java.util.Objects.equals(affinity, that.affinity)) return false;
    if (!java.util.Objects.equals(automountServiceAccountToken, that.automountServiceAccountToken)) return false;
    if (!java.util.Objects.equals(containers, that.containers)) return false;
    if (!java.util.Objects.equals(dnsConfig, that.dnsConfig)) return false;
    if (!java.util.Objects.equals(dnsPolicy, that.dnsPolicy)) return false;
    if (!java.util.Objects.equals(enableServiceLinks, that.enableServiceLinks)) return false;
    if (!java.util.Objects.equals(ephemeralContainers, that.ephemeralContainers)) return false;
    if (!java.util.Objects.equals(hostAliases, that.hostAliases)) return false;
    if (!java.util.Objects.equals(hostIPC, that.hostIPC)) return false;
    if (!java.util.Objects.equals(hostNetwork, that.hostNetwork)) return false;
    if (!java.util.Objects.equals(hostPID, that.hostPID)) return false;
    if (!java.util.Objects.equals(hostUsers, that.hostUsers)) return false;
    if (!java.util.Objects.equals(hostname, that.hostname)) return false;
    if (!java.util.Objects.equals(imagePullSecrets, that.imagePullSecrets)) return false;
    if (!java.util.Objects.equals(initContainers, that.initContainers)) return false;
    if (!java.util.Objects.equals(nodeName, that.nodeName)) return false;
    if (!java.util.Objects.equals(nodeSelector, that.nodeSelector)) return false;
    if (!java.util.Objects.equals(os, that.os)) return false;
    if (!java.util.Objects.equals(overhead, that.overhead)) return false;
    if (!java.util.Objects.equals(preemptionPolicy, that.preemptionPolicy)) return false;
    if (!java.util.Objects.equals(priority, that.priority)) return false;
    if (!java.util.Objects.equals(priorityClassName, that.priorityClassName)) return false;
    if (!java.util.Objects.equals(readinessGates, that.readinessGates)) return false;
    if (!java.util.Objects.equals(resourceClaims, that.resourceClaims)) return false;
    if (!java.util.Objects.equals(restartPolicy, that.restartPolicy)) return false;
    if (!java.util.Objects.equals(runtimeClassName, that.runtimeClassName)) return false;
    if (!java.util.Objects.equals(schedulerName, that.schedulerName)) return false;
    if (!java.util.Objects.equals(schedulingGates, that.schedulingGates)) return false;
    if (!java.util.Objects.equals(securityContext, that.securityContext)) return false;
    if (!java.util.Objects.equals(serviceAccount, that.serviceAccount)) return false;
    if (!java.util.Objects.equals(serviceAccountName, that.serviceAccountName)) return false;
    if (!java.util.Objects.equals(setHostnameAsFQDN, that.setHostnameAsFQDN)) return false;
    if (!java.util.Objects.equals(shareProcessNamespace, that.shareProcessNamespace)) return false;
    if (!java.util.Objects.equals(subdomain, that.subdomain)) return false;
    if (!java.util.Objects.equals(terminationGracePeriodSeconds, that.terminationGracePeriodSeconds)) return false;
    if (!java.util.Objects.equals(tolerations, that.tolerations)) return false;
    if (!java.util.Objects.equals(topologySpreadConstraints, that.topologySpreadConstraints)) return false;
    if (!java.util.Objects.equals(volumes, that.volumes)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(activeDeadlineSeconds,  affinity,  automountServiceAccountToken,  containers,  dnsConfig,  dnsPolicy,  enableServiceLinks,  ephemeralContainers,  hostAliases,  hostIPC,  hostNetwork,  hostPID,  hostUsers,  hostname,  imagePullSecrets,  initContainers,  nodeName,  nodeSelector,  os,  overhead,  preemptionPolicy,  priority,  priorityClassName,  readinessGates,  resourceClaims,  restartPolicy,  runtimeClassName,  schedulerName,  schedulingGates,  securityContext,  serviceAccount,  serviceAccountName,  setHostnameAsFQDN,  shareProcessNamespace,  subdomain,  terminationGracePeriodSeconds,  tolerations,  topologySpreadConstraints,  volumes,  super.hashCode());
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
    if (resourceClaims != null && !resourceClaims.isEmpty()) { sb.append("resourceClaims:"); sb.append(resourceClaims + ","); }
    if (restartPolicy != null) { sb.append("restartPolicy:"); sb.append(restartPolicy + ","); }
    if (runtimeClassName != null) { sb.append("runtimeClassName:"); sb.append(runtimeClassName + ","); }
    if (schedulerName != null) { sb.append("schedulerName:"); sb.append(schedulerName + ","); }
    if (schedulingGates != null && !schedulingGates.isEmpty()) { sb.append("schedulingGates:"); sb.append(schedulingGates + ","); }
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
  public class AffinityNested<N> extends V1AffinityFluent<AffinityNested<N>> implements Nested<N>{
    AffinityNested(V1Affinity item) {
      this.builder = new V1AffinityBuilder(this, item);
    }
    V1AffinityBuilder builder;
    
    public N and() {
      return (N) V1PodSpecFluent.this.withAffinity(builder.build());
    }
    
    public N endAffinity() {
      return and();
    }
    
  
  }
  public class ContainersNested<N> extends V1ContainerFluent<ContainersNested<N>> implements Nested<N>{
    ContainersNested(int index,V1Container item) {
      this.index = index;
      this.builder = new V1ContainerBuilder(this, item);
    }
    V1ContainerBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodSpecFluent.this.setToContainers(index,builder.build());
    }
    
    public N endContainer() {
      return and();
    }
    
  
  }
  public class DnsConfigNested<N> extends V1PodDNSConfigFluent<DnsConfigNested<N>> implements Nested<N>{
    DnsConfigNested(V1PodDNSConfig item) {
      this.builder = new V1PodDNSConfigBuilder(this, item);
    }
    V1PodDNSConfigBuilder builder;
    
    public N and() {
      return (N) V1PodSpecFluent.this.withDnsConfig(builder.build());
    }
    
    public N endDnsConfig() {
      return and();
    }
    
  
  }
  public class EphemeralContainersNested<N> extends V1EphemeralContainerFluent<EphemeralContainersNested<N>> implements Nested<N>{
    EphemeralContainersNested(int index,V1EphemeralContainer item) {
      this.index = index;
      this.builder = new V1EphemeralContainerBuilder(this, item);
    }
    V1EphemeralContainerBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodSpecFluent.this.setToEphemeralContainers(index,builder.build());
    }
    
    public N endEphemeralContainer() {
      return and();
    }
    
  
  }
  public class HostAliasesNested<N> extends V1HostAliasFluent<HostAliasesNested<N>> implements Nested<N>{
    HostAliasesNested(int index,V1HostAlias item) {
      this.index = index;
      this.builder = new V1HostAliasBuilder(this, item);
    }
    V1HostAliasBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodSpecFluent.this.setToHostAliases(index,builder.build());
    }
    
    public N endHostAlias() {
      return and();
    }
    
  
  }
  public class ImagePullSecretsNested<N> extends V1LocalObjectReferenceFluent<ImagePullSecretsNested<N>> implements Nested<N>{
    ImagePullSecretsNested(int index,V1LocalObjectReference item) {
      this.index = index;
      this.builder = new V1LocalObjectReferenceBuilder(this, item);
    }
    V1LocalObjectReferenceBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodSpecFluent.this.setToImagePullSecrets(index,builder.build());
    }
    
    public N endImagePullSecret() {
      return and();
    }
    
  
  }
  public class InitContainersNested<N> extends V1ContainerFluent<InitContainersNested<N>> implements Nested<N>{
    InitContainersNested(int index,V1Container item) {
      this.index = index;
      this.builder = new V1ContainerBuilder(this, item);
    }
    V1ContainerBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodSpecFluent.this.setToInitContainers(index,builder.build());
    }
    
    public N endInitContainer() {
      return and();
    }
    
  
  }
  public class OsNested<N> extends V1PodOSFluent<OsNested<N>> implements Nested<N>{
    OsNested(V1PodOS item) {
      this.builder = new V1PodOSBuilder(this, item);
    }
    V1PodOSBuilder builder;
    
    public N and() {
      return (N) V1PodSpecFluent.this.withOs(builder.build());
    }
    
    public N endOs() {
      return and();
    }
    
  
  }
  public class ReadinessGatesNested<N> extends V1PodReadinessGateFluent<ReadinessGatesNested<N>> implements Nested<N>{
    ReadinessGatesNested(int index,V1PodReadinessGate item) {
      this.index = index;
      this.builder = new V1PodReadinessGateBuilder(this, item);
    }
    V1PodReadinessGateBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodSpecFluent.this.setToReadinessGates(index,builder.build());
    }
    
    public N endReadinessGate() {
      return and();
    }
    
  
  }
  public class ResourceClaimsNested<N> extends V1PodResourceClaimFluent<ResourceClaimsNested<N>> implements Nested<N>{
    ResourceClaimsNested(int index,V1PodResourceClaim item) {
      this.index = index;
      this.builder = new V1PodResourceClaimBuilder(this, item);
    }
    V1PodResourceClaimBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodSpecFluent.this.setToResourceClaims(index,builder.build());
    }
    
    public N endResourceClaim() {
      return and();
    }
    
  
  }
  public class SchedulingGatesNested<N> extends V1PodSchedulingGateFluent<SchedulingGatesNested<N>> implements Nested<N>{
    SchedulingGatesNested(int index,V1PodSchedulingGate item) {
      this.index = index;
      this.builder = new V1PodSchedulingGateBuilder(this, item);
    }
    V1PodSchedulingGateBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodSpecFluent.this.setToSchedulingGates(index,builder.build());
    }
    
    public N endSchedulingGate() {
      return and();
    }
    
  
  }
  public class SecurityContextNested<N> extends V1PodSecurityContextFluent<SecurityContextNested<N>> implements Nested<N>{
    SecurityContextNested(V1PodSecurityContext item) {
      this.builder = new V1PodSecurityContextBuilder(this, item);
    }
    V1PodSecurityContextBuilder builder;
    
    public N and() {
      return (N) V1PodSpecFluent.this.withSecurityContext(builder.build());
    }
    
    public N endSecurityContext() {
      return and();
    }
    
  
  }
  public class TolerationsNested<N> extends V1TolerationFluent<TolerationsNested<N>> implements Nested<N>{
    TolerationsNested(int index,V1Toleration item) {
      this.index = index;
      this.builder = new V1TolerationBuilder(this, item);
    }
    V1TolerationBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodSpecFluent.this.setToTolerations(index,builder.build());
    }
    
    public N endToleration() {
      return and();
    }
    
  
  }
  public class TopologySpreadConstraintsNested<N> extends V1TopologySpreadConstraintFluent<TopologySpreadConstraintsNested<N>> implements Nested<N>{
    TopologySpreadConstraintsNested(int index,V1TopologySpreadConstraint item) {
      this.index = index;
      this.builder = new V1TopologySpreadConstraintBuilder(this, item);
    }
    V1TopologySpreadConstraintBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodSpecFluent.this.setToTopologySpreadConstraints(index,builder.build());
    }
    
    public N endTopologySpreadConstraint() {
      return and();
    }
    
  
  }
  public class VolumesNested<N> extends V1VolumeFluent<VolumesNested<N>> implements Nested<N>{
    VolumesNested(int index,V1Volume item) {
      this.index = index;
      this.builder = new V1VolumeBuilder(this, item);
    }
    V1VolumeBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodSpecFluent.this.setToVolumes(index,builder.build());
    }
    
    public N endVolume() {
      return and();
    }
    
  
  }

}