/*
Copyright 2022 The Kubernetes Authors.
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
package io.kubernetes.client.openapi.models;

import java.util.Iterator;
import java.util.List;

/** Generated */
public class V1PodSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1PodSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1PodSpecFluent<A> {
  public V1PodSpecFluentImpl() {}

  public V1PodSpecFluentImpl(io.kubernetes.client.openapi.models.V1PodSpec instance) {
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

  private java.lang.Long activeDeadlineSeconds;
  private io.kubernetes.client.openapi.models.V1AffinityBuilder affinity;
  private java.lang.Boolean automountServiceAccountToken;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerBuilder> containers;
  private io.kubernetes.client.openapi.models.V1PodDNSConfigBuilder dnsConfig;
  private io.kubernetes.client.openapi.models.V1PodSpec.DnsPolicyEnum dnsPolicy;
  private java.lang.Boolean enableServiceLinks;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder>
      ephemeralContainers;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1HostAliasBuilder> hostAliases;
  private java.lang.Boolean hostIPC;
  private java.lang.Boolean hostNetwork;
  private java.lang.Boolean hostPID;
  private java.lang.String hostname;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>
      imagePullSecrets;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerBuilder>
      initContainers;
  private java.lang.String nodeName;
  private java.util.Map<java.lang.String, java.lang.String> nodeSelector;
  private io.kubernetes.client.openapi.models.V1PodOSBuilder os;
  private java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> overhead;
  private java.lang.String preemptionPolicy;
  private java.lang.Integer priority;
  private java.lang.String priorityClassName;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder>
      readinessGates;
  private io.kubernetes.client.openapi.models.V1PodSpec.RestartPolicyEnum restartPolicy;
  private java.lang.String runtimeClassName;
  private java.lang.String schedulerName;
  private io.kubernetes.client.openapi.models.V1PodSecurityContextBuilder securityContext;
  private java.lang.String serviceAccount;
  private java.lang.String serviceAccountName;
  private java.lang.Boolean setHostnameAsFQDN;
  private java.lang.Boolean shareProcessNamespace;
  private java.lang.String subdomain;
  private java.lang.Long terminationGracePeriodSeconds;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1TolerationBuilder> tolerations;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder>
      topologySpreadConstraints;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeBuilder> volumes;

  public java.lang.Long getActiveDeadlineSeconds() {
    return this.activeDeadlineSeconds;
  }

  public A withActiveDeadlineSeconds(java.lang.Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return (A) this;
  }

  public java.lang.Boolean hasActiveDeadlineSeconds() {
    return this.activeDeadlineSeconds != null;
  }

  /**
   * This method has been deprecated, please use method buildAffinity instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1Affinity getAffinity() {
    return this.affinity != null ? this.affinity.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1Affinity buildAffinity() {
    return this.affinity != null ? this.affinity.build() : null;
  }

  public A withAffinity(io.kubernetes.client.openapi.models.V1Affinity affinity) {
    _visitables.get("affinity").remove(this.affinity);
    if (affinity != null) {
      this.affinity = new io.kubernetes.client.openapi.models.V1AffinityBuilder(affinity);
      _visitables.get("affinity").add(this.affinity);
    }
    return (A) this;
  }

  public java.lang.Boolean hasAffinity() {
    return this.affinity != null;
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.AffinityNested<A> withNewAffinity() {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.AffinityNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.AffinityNested<A> withNewAffinityLike(
      io.kubernetes.client.openapi.models.V1Affinity item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.AffinityNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.AffinityNested<A> editAffinity() {
    return withNewAffinityLike(getAffinity());
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.AffinityNested<A> editOrNewAffinity() {
    return withNewAffinityLike(
        getAffinity() != null
            ? getAffinity()
            : new io.kubernetes.client.openapi.models.V1AffinityBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.AffinityNested<A>
      editOrNewAffinityLike(io.kubernetes.client.openapi.models.V1Affinity item) {
    return withNewAffinityLike(getAffinity() != null ? getAffinity() : item);
  }

  public java.lang.Boolean getAutomountServiceAccountToken() {
    return this.automountServiceAccountToken;
  }

  public A withAutomountServiceAccountToken(java.lang.Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
    return (A) this;
  }

  public java.lang.Boolean hasAutomountServiceAccountToken() {
    return this.automountServiceAccountToken != null;
  }

  public A addToContainers(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Container item) {
    if (this.containers == null) {
      this.containers =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ContainerBuilder builder =
        new io.kubernetes.client.openapi.models.V1ContainerBuilder(item);
    _visitables
        .get("containers")
        .add(index >= 0 ? index : _visitables.get("containers").size(), builder);
    this.containers.add(index >= 0 ? index : containers.size(), builder);
    return (A) this;
  }

  public A setToContainers(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Container item) {
    if (this.containers == null) {
      this.containers =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ContainerBuilder builder =
        new io.kubernetes.client.openapi.models.V1ContainerBuilder(item);
    if (index < 0 || index >= _visitables.get("containers").size()) {
      _visitables.get("containers").add(builder);
    } else {
      _visitables.get("containers").set(index, builder);
    }
    if (index < 0 || index >= containers.size()) {
      containers.add(builder);
    } else {
      containers.set(index, builder);
    }
    return (A) this;
  }

  public A addToContainers(io.kubernetes.client.openapi.models.V1Container... items) {
    if (this.containers == null) {
      this.containers =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Container item : items) {
      io.kubernetes.client.openapi.models.V1ContainerBuilder builder =
          new io.kubernetes.client.openapi.models.V1ContainerBuilder(item);
      _visitables.get("containers").add(builder);
      this.containers.add(builder);
    }
    return (A) this;
  }

  public A addAllToContainers(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Container> items) {
    if (this.containers == null) {
      this.containers =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Container item : items) {
      io.kubernetes.client.openapi.models.V1ContainerBuilder builder =
          new io.kubernetes.client.openapi.models.V1ContainerBuilder(item);
      _visitables.get("containers").add(builder);
      this.containers.add(builder);
    }
    return (A) this;
  }

  public A removeFromContainers(io.kubernetes.client.openapi.models.V1Container... items) {
    for (io.kubernetes.client.openapi.models.V1Container item : items) {
      io.kubernetes.client.openapi.models.V1ContainerBuilder builder =
          new io.kubernetes.client.openapi.models.V1ContainerBuilder(item);
      _visitables.get("containers").remove(builder);
      if (this.containers != null) {
        this.containers.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromContainers(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Container> items) {
    for (io.kubernetes.client.openapi.models.V1Container item : items) {
      io.kubernetes.client.openapi.models.V1ContainerBuilder builder =
          new io.kubernetes.client.openapi.models.V1ContainerBuilder(item);
      _visitables.get("containers").remove(builder);
      if (this.containers != null) {
        this.containers.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromContainers(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerBuilder>
          predicate) {
    if (containers == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1ContainerBuilder> each =
        containers.iterator();
    final List visitables = _visitables.get("containers");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1ContainerBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildContainers instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1Container> getContainers() {
    return containers != null ? build(containers) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1Container> buildContainers() {
    return containers != null ? build(containers) : null;
  }

  public io.kubernetes.client.openapi.models.V1Container buildContainer(java.lang.Integer index) {
    return this.containers.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1Container buildFirstContainer() {
    return this.containers.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1Container buildLastContainer() {
    return this.containers.get(containers.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1Container buildMatchingContainer(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ContainerBuilder item : containers) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingContainer(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ContainerBuilder item : containers) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withContainers(
      java.util.List<io.kubernetes.client.openapi.models.V1Container> containers) {
    if (this.containers != null) {
      _visitables.get("containers").removeAll(this.containers);
    }
    if (containers != null) {
      this.containers = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1Container item : containers) {
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
    }
    if (containers != null) {
      for (io.kubernetes.client.openapi.models.V1Container item : containers) {
        this.addToContainers(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasContainers() {
    return containers != null && !containers.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ContainersNested<A> addNewContainer() {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.ContainersNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ContainersNested<A>
      addNewContainerLike(io.kubernetes.client.openapi.models.V1Container item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.ContainersNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ContainersNested<A>
      setNewContainerLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1Container item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.ContainersNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ContainersNested<A> editContainer(
      java.lang.Integer index) {
    if (containers.size() <= index)
      throw new RuntimeException("Can't edit containers. Index exceeds size.");
    return setNewContainerLike(index, buildContainer(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ContainersNested<A>
      editFirstContainer() {
    if (containers.size() == 0)
      throw new RuntimeException("Can't edit first containers. The list is empty.");
    return setNewContainerLike(0, buildContainer(0));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ContainersNested<A>
      editLastContainer() {
    int index = containers.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last containers. The list is empty.");
    return setNewContainerLike(index, buildContainer(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ContainersNested<A>
      editMatchingContainer(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < containers.size(); i++) {
      if (predicate.test(containers.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching containers. No match found.");
    return setNewContainerLike(index, buildContainer(index));
  }

  /**
   * This method has been deprecated, please use method buildDnsConfig instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PodDNSConfig getDnsConfig() {
    return this.dnsConfig != null ? this.dnsConfig.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1PodDNSConfig buildDnsConfig() {
    return this.dnsConfig != null ? this.dnsConfig.build() : null;
  }

  public A withDnsConfig(io.kubernetes.client.openapi.models.V1PodDNSConfig dnsConfig) {
    _visitables.get("dnsConfig").remove(this.dnsConfig);
    if (dnsConfig != null) {
      this.dnsConfig = new io.kubernetes.client.openapi.models.V1PodDNSConfigBuilder(dnsConfig);
      _visitables.get("dnsConfig").add(this.dnsConfig);
    }
    return (A) this;
  }

  public java.lang.Boolean hasDnsConfig() {
    return this.dnsConfig != null;
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.DnsConfigNested<A> withNewDnsConfig() {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.DnsConfigNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.DnsConfigNested<A>
      withNewDnsConfigLike(io.kubernetes.client.openapi.models.V1PodDNSConfig item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.DnsConfigNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.DnsConfigNested<A> editDnsConfig() {
    return withNewDnsConfigLike(getDnsConfig());
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.DnsConfigNested<A>
      editOrNewDnsConfig() {
    return withNewDnsConfigLike(
        getDnsConfig() != null
            ? getDnsConfig()
            : new io.kubernetes.client.openapi.models.V1PodDNSConfigBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.DnsConfigNested<A>
      editOrNewDnsConfigLike(io.kubernetes.client.openapi.models.V1PodDNSConfig item) {
    return withNewDnsConfigLike(getDnsConfig() != null ? getDnsConfig() : item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpec.DnsPolicyEnum getDnsPolicy() {
    return this.dnsPolicy;
  }

  public A withDnsPolicy(io.kubernetes.client.openapi.models.V1PodSpec.DnsPolicyEnum dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
    return (A) this;
  }

  public java.lang.Boolean hasDnsPolicy() {
    return this.dnsPolicy != null;
  }

  public java.lang.Boolean getEnableServiceLinks() {
    return this.enableServiceLinks;
  }

  public A withEnableServiceLinks(java.lang.Boolean enableServiceLinks) {
    this.enableServiceLinks = enableServiceLinks;
    return (A) this;
  }

  public java.lang.Boolean hasEnableServiceLinks() {
    return this.enableServiceLinks != null;
  }

  public A addToEphemeralContainers(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EphemeralContainer item) {
    if (this.ephemeralContainers == null) {
      this.ephemeralContainers =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder>();
    }
    io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder builder =
        new io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder(item);
    _visitables
        .get("ephemeralContainers")
        .add(index >= 0 ? index : _visitables.get("ephemeralContainers").size(), builder);
    this.ephemeralContainers.add(index >= 0 ? index : ephemeralContainers.size(), builder);
    return (A) this;
  }

  public A setToEphemeralContainers(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EphemeralContainer item) {
    if (this.ephemeralContainers == null) {
      this.ephemeralContainers =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder>();
    }
    io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder builder =
        new io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder(item);
    if (index < 0 || index >= _visitables.get("ephemeralContainers").size()) {
      _visitables.get("ephemeralContainers").add(builder);
    } else {
      _visitables.get("ephemeralContainers").set(index, builder);
    }
    if (index < 0 || index >= ephemeralContainers.size()) {
      ephemeralContainers.add(builder);
    } else {
      ephemeralContainers.set(index, builder);
    }
    return (A) this;
  }

  public A addToEphemeralContainers(
      io.kubernetes.client.openapi.models.V1EphemeralContainer... items) {
    if (this.ephemeralContainers == null) {
      this.ephemeralContainers =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1EphemeralContainer item : items) {
      io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder builder =
          new io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder(item);
      _visitables.get("ephemeralContainers").add(builder);
      this.ephemeralContainers.add(builder);
    }
    return (A) this;
  }

  public A addAllToEphemeralContainers(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EphemeralContainer> items) {
    if (this.ephemeralContainers == null) {
      this.ephemeralContainers =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1EphemeralContainer item : items) {
      io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder builder =
          new io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder(item);
      _visitables.get("ephemeralContainers").add(builder);
      this.ephemeralContainers.add(builder);
    }
    return (A) this;
  }

  public A removeFromEphemeralContainers(
      io.kubernetes.client.openapi.models.V1EphemeralContainer... items) {
    for (io.kubernetes.client.openapi.models.V1EphemeralContainer item : items) {
      io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder builder =
          new io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder(item);
      _visitables.get("ephemeralContainers").remove(builder);
      if (this.ephemeralContainers != null) {
        this.ephemeralContainers.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromEphemeralContainers(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EphemeralContainer> items) {
    for (io.kubernetes.client.openapi.models.V1EphemeralContainer item : items) {
      io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder builder =
          new io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder(item);
      _visitables.get("ephemeralContainers").remove(builder);
      if (this.ephemeralContainers != null) {
        this.ephemeralContainers.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromEphemeralContainers(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder>
          predicate) {
    if (ephemeralContainers == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder> each =
        ephemeralContainers.iterator();
    final List visitables = _visitables.get("ephemeralContainers");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildEphemeralContainers instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1EphemeralContainer>
      getEphemeralContainers() {
    return ephemeralContainers != null ? build(ephemeralContainers) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1EphemeralContainer>
      buildEphemeralContainers() {
    return ephemeralContainers != null ? build(ephemeralContainers) : null;
  }

  public io.kubernetes.client.openapi.models.V1EphemeralContainer buildEphemeralContainer(
      java.lang.Integer index) {
    return this.ephemeralContainers.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1EphemeralContainer buildFirstEphemeralContainer() {
    return this.ephemeralContainers.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1EphemeralContainer buildLastEphemeralContainer() {
    return this.ephemeralContainers.get(ephemeralContainers.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1EphemeralContainer buildMatchingEphemeralContainer(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder item :
        ephemeralContainers) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingEphemeralContainer(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder item :
        ephemeralContainers) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withEphemeralContainers(
      java.util.List<io.kubernetes.client.openapi.models.V1EphemeralContainer>
          ephemeralContainers) {
    if (this.ephemeralContainers != null) {
      _visitables.get("ephemeralContainers").removeAll(this.ephemeralContainers);
    }
    if (ephemeralContainers != null) {
      this.ephemeralContainers = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1EphemeralContainer item : ephemeralContainers) {
        this.addToEphemeralContainers(item);
      }
    } else {
      this.ephemeralContainers = null;
    }
    return (A) this;
  }

  public A withEphemeralContainers(
      io.kubernetes.client.openapi.models.V1EphemeralContainer... ephemeralContainers) {
    if (this.ephemeralContainers != null) {
      this.ephemeralContainers.clear();
    }
    if (ephemeralContainers != null) {
      for (io.kubernetes.client.openapi.models.V1EphemeralContainer item : ephemeralContainers) {
        this.addToEphemeralContainers(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasEphemeralContainers() {
    return ephemeralContainers != null && !ephemeralContainers.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.EphemeralContainersNested<A>
      addNewEphemeralContainer() {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl
        .EphemeralContainersNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.EphemeralContainersNested<A>
      addNewEphemeralContainerLike(io.kubernetes.client.openapi.models.V1EphemeralContainer item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl
        .EphemeralContainersNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.EphemeralContainersNested<A>
      setNewEphemeralContainerLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1EphemeralContainer item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl
        .EphemeralContainersNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.EphemeralContainersNested<A>
      editEphemeralContainer(java.lang.Integer index) {
    if (ephemeralContainers.size() <= index)
      throw new RuntimeException("Can't edit ephemeralContainers. Index exceeds size.");
    return setNewEphemeralContainerLike(index, buildEphemeralContainer(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.EphemeralContainersNested<A>
      editFirstEphemeralContainer() {
    if (ephemeralContainers.size() == 0)
      throw new RuntimeException("Can't edit first ephemeralContainers. The list is empty.");
    return setNewEphemeralContainerLike(0, buildEphemeralContainer(0));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.EphemeralContainersNested<A>
      editLastEphemeralContainer() {
    int index = ephemeralContainers.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last ephemeralContainers. The list is empty.");
    return setNewEphemeralContainerLike(index, buildEphemeralContainer(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.EphemeralContainersNested<A>
      editMatchingEphemeralContainer(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < ephemeralContainers.size(); i++) {
      if (predicate.test(ephemeralContainers.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException("Can't edit matching ephemeralContainers. No match found.");
    return setNewEphemeralContainerLike(index, buildEphemeralContainer(index));
  }

  public A addToHostAliases(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1HostAlias item) {
    if (this.hostAliases == null) {
      this.hostAliases =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1HostAliasBuilder>();
    }
    io.kubernetes.client.openapi.models.V1HostAliasBuilder builder =
        new io.kubernetes.client.openapi.models.V1HostAliasBuilder(item);
    _visitables
        .get("hostAliases")
        .add(index >= 0 ? index : _visitables.get("hostAliases").size(), builder);
    this.hostAliases.add(index >= 0 ? index : hostAliases.size(), builder);
    return (A) this;
  }

  public A setToHostAliases(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1HostAlias item) {
    if (this.hostAliases == null) {
      this.hostAliases =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1HostAliasBuilder>();
    }
    io.kubernetes.client.openapi.models.V1HostAliasBuilder builder =
        new io.kubernetes.client.openapi.models.V1HostAliasBuilder(item);
    if (index < 0 || index >= _visitables.get("hostAliases").size()) {
      _visitables.get("hostAliases").add(builder);
    } else {
      _visitables.get("hostAliases").set(index, builder);
    }
    if (index < 0 || index >= hostAliases.size()) {
      hostAliases.add(builder);
    } else {
      hostAliases.set(index, builder);
    }
    return (A) this;
  }

  public A addToHostAliases(io.kubernetes.client.openapi.models.V1HostAlias... items) {
    if (this.hostAliases == null) {
      this.hostAliases =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1HostAliasBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1HostAlias item : items) {
      io.kubernetes.client.openapi.models.V1HostAliasBuilder builder =
          new io.kubernetes.client.openapi.models.V1HostAliasBuilder(item);
      _visitables.get("hostAliases").add(builder);
      this.hostAliases.add(builder);
    }
    return (A) this;
  }

  public A addAllToHostAliases(
      java.util.Collection<io.kubernetes.client.openapi.models.V1HostAlias> items) {
    if (this.hostAliases == null) {
      this.hostAliases =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1HostAliasBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1HostAlias item : items) {
      io.kubernetes.client.openapi.models.V1HostAliasBuilder builder =
          new io.kubernetes.client.openapi.models.V1HostAliasBuilder(item);
      _visitables.get("hostAliases").add(builder);
      this.hostAliases.add(builder);
    }
    return (A) this;
  }

  public A removeFromHostAliases(io.kubernetes.client.openapi.models.V1HostAlias... items) {
    for (io.kubernetes.client.openapi.models.V1HostAlias item : items) {
      io.kubernetes.client.openapi.models.V1HostAliasBuilder builder =
          new io.kubernetes.client.openapi.models.V1HostAliasBuilder(item);
      _visitables.get("hostAliases").remove(builder);
      if (this.hostAliases != null) {
        this.hostAliases.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromHostAliases(
      java.util.Collection<io.kubernetes.client.openapi.models.V1HostAlias> items) {
    for (io.kubernetes.client.openapi.models.V1HostAlias item : items) {
      io.kubernetes.client.openapi.models.V1HostAliasBuilder builder =
          new io.kubernetes.client.openapi.models.V1HostAliasBuilder(item);
      _visitables.get("hostAliases").remove(builder);
      if (this.hostAliases != null) {
        this.hostAliases.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromHostAliases(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HostAliasBuilder>
          predicate) {
    if (hostAliases == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1HostAliasBuilder> each =
        hostAliases.iterator();
    final List visitables = _visitables.get("hostAliases");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1HostAliasBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildHostAliases instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1HostAlias> getHostAliases() {
    return hostAliases != null ? build(hostAliases) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1HostAlias> buildHostAliases() {
    return hostAliases != null ? build(hostAliases) : null;
  }

  public io.kubernetes.client.openapi.models.V1HostAlias buildHostAlias(java.lang.Integer index) {
    return this.hostAliases.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1HostAlias buildFirstHostAlias() {
    return this.hostAliases.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1HostAlias buildLastHostAlias() {
    return this.hostAliases.get(hostAliases.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1HostAlias buildMatchingHostAlias(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HostAliasBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1HostAliasBuilder item : hostAliases) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingHostAlias(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HostAliasBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1HostAliasBuilder item : hostAliases) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withHostAliases(
      java.util.List<io.kubernetes.client.openapi.models.V1HostAlias> hostAliases) {
    if (this.hostAliases != null) {
      _visitables.get("hostAliases").removeAll(this.hostAliases);
    }
    if (hostAliases != null) {
      this.hostAliases = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1HostAlias item : hostAliases) {
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
    }
    if (hostAliases != null) {
      for (io.kubernetes.client.openapi.models.V1HostAlias item : hostAliases) {
        this.addToHostAliases(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasHostAliases() {
    return hostAliases != null && !hostAliases.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.HostAliasesNested<A>
      addNewHostAlias() {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.HostAliasesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.HostAliasesNested<A>
      addNewHostAliasLike(io.kubernetes.client.openapi.models.V1HostAlias item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.HostAliasesNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.HostAliasesNested<A>
      setNewHostAliasLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1HostAlias item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.HostAliasesNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.HostAliasesNested<A> editHostAlias(
      java.lang.Integer index) {
    if (hostAliases.size() <= index)
      throw new RuntimeException("Can't edit hostAliases. Index exceeds size.");
    return setNewHostAliasLike(index, buildHostAlias(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.HostAliasesNested<A>
      editFirstHostAlias() {
    if (hostAliases.size() == 0)
      throw new RuntimeException("Can't edit first hostAliases. The list is empty.");
    return setNewHostAliasLike(0, buildHostAlias(0));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.HostAliasesNested<A>
      editLastHostAlias() {
    int index = hostAliases.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last hostAliases. The list is empty.");
    return setNewHostAliasLike(index, buildHostAlias(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.HostAliasesNested<A>
      editMatchingHostAlias(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HostAliasBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < hostAliases.size(); i++) {
      if (predicate.test(hostAliases.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching hostAliases. No match found.");
    return setNewHostAliasLike(index, buildHostAlias(index));
  }

  public java.lang.Boolean getHostIPC() {
    return this.hostIPC;
  }

  public A withHostIPC(java.lang.Boolean hostIPC) {
    this.hostIPC = hostIPC;
    return (A) this;
  }

  public java.lang.Boolean hasHostIPC() {
    return this.hostIPC != null;
  }

  public java.lang.Boolean getHostNetwork() {
    return this.hostNetwork;
  }

  public A withHostNetwork(java.lang.Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
    return (A) this;
  }

  public java.lang.Boolean hasHostNetwork() {
    return this.hostNetwork != null;
  }

  public java.lang.Boolean getHostPID() {
    return this.hostPID;
  }

  public A withHostPID(java.lang.Boolean hostPID) {
    this.hostPID = hostPID;
    return (A) this;
  }

  public java.lang.Boolean hasHostPID() {
    return this.hostPID != null;
  }

  public java.lang.String getHostname() {
    return this.hostname;
  }

  public A withHostname(java.lang.String hostname) {
    this.hostname = hostname;
    return (A) this;
  }

  public java.lang.Boolean hasHostname() {
    return this.hostname != null;
  }

  /** Method is deprecated. use withHostname instead. */
  @java.lang.Deprecated
  public A withNewHostname(java.lang.String original) {
    return (A) withHostname(new String(original));
  }

  public A addToImagePullSecrets(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>();
    }
    io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder =
        new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(item);
    _visitables
        .get("imagePullSecrets")
        .add(index >= 0 ? index : _visitables.get("imagePullSecrets").size(), builder);
    this.imagePullSecrets.add(index >= 0 ? index : imagePullSecrets.size(), builder);
    return (A) this;
  }

  public A setToImagePullSecrets(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>();
    }
    io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder =
        new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(item);
    if (index < 0 || index >= _visitables.get("imagePullSecrets").size()) {
      _visitables.get("imagePullSecrets").add(builder);
    } else {
      _visitables.get("imagePullSecrets").set(index, builder);
    }
    if (index < 0 || index >= imagePullSecrets.size()) {
      imagePullSecrets.add(builder);
    } else {
      imagePullSecrets.set(index, builder);
    }
    return (A) this;
  }

  public A addToImagePullSecrets(
      io.kubernetes.client.openapi.models.V1LocalObjectReference... items) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1LocalObjectReference item : items) {
      io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(item);
      _visitables.get("imagePullSecrets").add(builder);
      this.imagePullSecrets.add(builder);
    }
    return (A) this;
  }

  public A addAllToImagePullSecrets(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LocalObjectReference> items) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1LocalObjectReference item : items) {
      io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(item);
      _visitables.get("imagePullSecrets").add(builder);
      this.imagePullSecrets.add(builder);
    }
    return (A) this;
  }

  public A removeFromImagePullSecrets(
      io.kubernetes.client.openapi.models.V1LocalObjectReference... items) {
    for (io.kubernetes.client.openapi.models.V1LocalObjectReference item : items) {
      io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(item);
      _visitables.get("imagePullSecrets").remove(builder);
      if (this.imagePullSecrets != null) {
        this.imagePullSecrets.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromImagePullSecrets(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LocalObjectReference> items) {
    for (io.kubernetes.client.openapi.models.V1LocalObjectReference item : items) {
      io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(item);
      _visitables.get("imagePullSecrets").remove(builder);
      if (this.imagePullSecrets != null) {
        this.imagePullSecrets.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromImagePullSecrets(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>
          predicate) {
    if (imagePullSecrets == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder> each =
        imagePullSecrets.iterator();
    final List visitables = _visitables.get("imagePullSecrets");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildImagePullSecrets instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1LocalObjectReference>
      getImagePullSecrets() {
    return imagePullSecrets != null ? build(imagePullSecrets) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1LocalObjectReference>
      buildImagePullSecrets() {
    return imagePullSecrets != null ? build(imagePullSecrets) : null;
  }

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildImagePullSecret(
      java.lang.Integer index) {
    return this.imagePullSecrets.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildFirstImagePullSecret() {
    return this.imagePullSecrets.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildLastImagePullSecret() {
    return this.imagePullSecrets.get(imagePullSecrets.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildMatchingImagePullSecret(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder item :
        imagePullSecrets) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingImagePullSecret(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder item :
        imagePullSecrets) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withImagePullSecrets(
      java.util.List<io.kubernetes.client.openapi.models.V1LocalObjectReference> imagePullSecrets) {
    if (this.imagePullSecrets != null) {
      _visitables.get("imagePullSecrets").removeAll(this.imagePullSecrets);
    }
    if (imagePullSecrets != null) {
      this.imagePullSecrets = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1LocalObjectReference item : imagePullSecrets) {
        this.addToImagePullSecrets(item);
      }
    } else {
      this.imagePullSecrets = null;
    }
    return (A) this;
  }

  public A withImagePullSecrets(
      io.kubernetes.client.openapi.models.V1LocalObjectReference... imagePullSecrets) {
    if (this.imagePullSecrets != null) {
      this.imagePullSecrets.clear();
    }
    if (imagePullSecrets != null) {
      for (io.kubernetes.client.openapi.models.V1LocalObjectReference item : imagePullSecrets) {
        this.addToImagePullSecrets(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasImagePullSecrets() {
    return imagePullSecrets != null && !imagePullSecrets.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ImagePullSecretsNested<A>
      addNewImagePullSecret() {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.ImagePullSecretsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ImagePullSecretsNested<A>
      addNewImagePullSecretLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.ImagePullSecretsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ImagePullSecretsNested<A>
      setNewImagePullSecretLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.ImagePullSecretsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ImagePullSecretsNested<A>
      editImagePullSecret(java.lang.Integer index) {
    if (imagePullSecrets.size() <= index)
      throw new RuntimeException("Can't edit imagePullSecrets. Index exceeds size.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ImagePullSecretsNested<A>
      editFirstImagePullSecret() {
    if (imagePullSecrets.size() == 0)
      throw new RuntimeException("Can't edit first imagePullSecrets. The list is empty.");
    return setNewImagePullSecretLike(0, buildImagePullSecret(0));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ImagePullSecretsNested<A>
      editLastImagePullSecret() {
    int index = imagePullSecrets.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last imagePullSecrets. The list is empty.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ImagePullSecretsNested<A>
      editMatchingImagePullSecret(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < imagePullSecrets.size(); i++) {
      if (predicate.test(imagePullSecrets.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException("Can't edit matching imagePullSecrets. No match found.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }

  public A addToInitContainers(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Container item) {
    if (this.initContainers == null) {
      this.initContainers =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ContainerBuilder builder =
        new io.kubernetes.client.openapi.models.V1ContainerBuilder(item);
    _visitables
        .get("initContainers")
        .add(index >= 0 ? index : _visitables.get("initContainers").size(), builder);
    this.initContainers.add(index >= 0 ? index : initContainers.size(), builder);
    return (A) this;
  }

  public A setToInitContainers(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Container item) {
    if (this.initContainers == null) {
      this.initContainers =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ContainerBuilder builder =
        new io.kubernetes.client.openapi.models.V1ContainerBuilder(item);
    if (index < 0 || index >= _visitables.get("initContainers").size()) {
      _visitables.get("initContainers").add(builder);
    } else {
      _visitables.get("initContainers").set(index, builder);
    }
    if (index < 0 || index >= initContainers.size()) {
      initContainers.add(builder);
    } else {
      initContainers.set(index, builder);
    }
    return (A) this;
  }

  public A addToInitContainers(io.kubernetes.client.openapi.models.V1Container... items) {
    if (this.initContainers == null) {
      this.initContainers =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Container item : items) {
      io.kubernetes.client.openapi.models.V1ContainerBuilder builder =
          new io.kubernetes.client.openapi.models.V1ContainerBuilder(item);
      _visitables.get("initContainers").add(builder);
      this.initContainers.add(builder);
    }
    return (A) this;
  }

  public A addAllToInitContainers(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Container> items) {
    if (this.initContainers == null) {
      this.initContainers =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Container item : items) {
      io.kubernetes.client.openapi.models.V1ContainerBuilder builder =
          new io.kubernetes.client.openapi.models.V1ContainerBuilder(item);
      _visitables.get("initContainers").add(builder);
      this.initContainers.add(builder);
    }
    return (A) this;
  }

  public A removeFromInitContainers(io.kubernetes.client.openapi.models.V1Container... items) {
    for (io.kubernetes.client.openapi.models.V1Container item : items) {
      io.kubernetes.client.openapi.models.V1ContainerBuilder builder =
          new io.kubernetes.client.openapi.models.V1ContainerBuilder(item);
      _visitables.get("initContainers").remove(builder);
      if (this.initContainers != null) {
        this.initContainers.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromInitContainers(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Container> items) {
    for (io.kubernetes.client.openapi.models.V1Container item : items) {
      io.kubernetes.client.openapi.models.V1ContainerBuilder builder =
          new io.kubernetes.client.openapi.models.V1ContainerBuilder(item);
      _visitables.get("initContainers").remove(builder);
      if (this.initContainers != null) {
        this.initContainers.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromInitContainers(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerBuilder>
          predicate) {
    if (initContainers == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1ContainerBuilder> each =
        initContainers.iterator();
    final List visitables = _visitables.get("initContainers");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1ContainerBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildInitContainers instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1Container> getInitContainers() {
    return initContainers != null ? build(initContainers) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1Container> buildInitContainers() {
    return initContainers != null ? build(initContainers) : null;
  }

  public io.kubernetes.client.openapi.models.V1Container buildInitContainer(
      java.lang.Integer index) {
    return this.initContainers.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1Container buildFirstInitContainer() {
    return this.initContainers.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1Container buildLastInitContainer() {
    return this.initContainers.get(initContainers.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1Container buildMatchingInitContainer(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ContainerBuilder item : initContainers) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingInitContainer(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ContainerBuilder item : initContainers) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withInitContainers(
      java.util.List<io.kubernetes.client.openapi.models.V1Container> initContainers) {
    if (this.initContainers != null) {
      _visitables.get("initContainers").removeAll(this.initContainers);
    }
    if (initContainers != null) {
      this.initContainers = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1Container item : initContainers) {
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
    }
    if (initContainers != null) {
      for (io.kubernetes.client.openapi.models.V1Container item : initContainers) {
        this.addToInitContainers(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasInitContainers() {
    return initContainers != null && !initContainers.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.InitContainersNested<A>
      addNewInitContainer() {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.InitContainersNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.InitContainersNested<A>
      addNewInitContainerLike(io.kubernetes.client.openapi.models.V1Container item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.InitContainersNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.InitContainersNested<A>
      setNewInitContainerLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1Container item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.InitContainersNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.InitContainersNested<A>
      editInitContainer(java.lang.Integer index) {
    if (initContainers.size() <= index)
      throw new RuntimeException("Can't edit initContainers. Index exceeds size.");
    return setNewInitContainerLike(index, buildInitContainer(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.InitContainersNested<A>
      editFirstInitContainer() {
    if (initContainers.size() == 0)
      throw new RuntimeException("Can't edit first initContainers. The list is empty.");
    return setNewInitContainerLike(0, buildInitContainer(0));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.InitContainersNested<A>
      editLastInitContainer() {
    int index = initContainers.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last initContainers. The list is empty.");
    return setNewInitContainerLike(index, buildInitContainer(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.InitContainersNested<A>
      editMatchingInitContainer(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < initContainers.size(); i++) {
      if (predicate.test(initContainers.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException("Can't edit matching initContainers. No match found.");
    return setNewInitContainerLike(index, buildInitContainer(index));
  }

  public java.lang.String getNodeName() {
    return this.nodeName;
  }

  public A withNodeName(java.lang.String nodeName) {
    this.nodeName = nodeName;
    return (A) this;
  }

  public java.lang.Boolean hasNodeName() {
    return this.nodeName != null;
  }

  /** Method is deprecated. use withNodeName instead. */
  @java.lang.Deprecated
  public A withNewNodeName(java.lang.String original) {
    return (A) withNodeName(new String(original));
  }

  public A addToNodeSelector(java.lang.String key, java.lang.String value) {
    if (this.nodeSelector == null && key != null && value != null) {
      this.nodeSelector = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.nodeSelector.put(key, value);
    }
    return (A) this;
  }

  public A addToNodeSelector(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.nodeSelector == null && map != null) {
      this.nodeSelector = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.nodeSelector.putAll(map);
    }
    return (A) this;
  }

  public A removeFromNodeSelector(java.lang.String key) {
    if (this.nodeSelector == null) {
      return (A) this;
    }
    if (key != null && this.nodeSelector != null) {
      this.nodeSelector.remove(key);
    }
    return (A) this;
  }

  public A removeFromNodeSelector(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.nodeSelector == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.nodeSelector != null) {
          this.nodeSelector.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, java.lang.String> getNodeSelector() {
    return this.nodeSelector;
  }

  public <K, V> A withNodeSelector(java.util.Map<java.lang.String, java.lang.String> nodeSelector) {
    if (nodeSelector == null) {
      this.nodeSelector = null;
    } else {
      this.nodeSelector = new java.util.LinkedHashMap(nodeSelector);
    }
    return (A) this;
  }

  public java.lang.Boolean hasNodeSelector() {
    return this.nodeSelector != null;
  }

  /**
   * This method has been deprecated, please use method buildOs instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PodOS getOs() {
    return this.os != null ? this.os.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1PodOS buildOs() {
    return this.os != null ? this.os.build() : null;
  }

  public A withOs(io.kubernetes.client.openapi.models.V1PodOS os) {
    _visitables.get("os").remove(this.os);
    if (os != null) {
      this.os = new io.kubernetes.client.openapi.models.V1PodOSBuilder(os);
      _visitables.get("os").add(this.os);
    }
    return (A) this;
  }

  public java.lang.Boolean hasOs() {
    return this.os != null;
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.OsNested<A> withNewOs() {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.OsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.OsNested<A> withNewOsLike(
      io.kubernetes.client.openapi.models.V1PodOS item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.OsNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.OsNested<A> editOs() {
    return withNewOsLike(getOs());
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.OsNested<A> editOrNewOs() {
    return withNewOsLike(
        getOs() != null
            ? getOs()
            : new io.kubernetes.client.openapi.models.V1PodOSBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.OsNested<A> editOrNewOsLike(
      io.kubernetes.client.openapi.models.V1PodOS item) {
    return withNewOsLike(getOs() != null ? getOs() : item);
  }

  public A addToOverhead(java.lang.String key, io.kubernetes.client.custom.Quantity value) {
    if (this.overhead == null && key != null && value != null) {
      this.overhead = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.overhead.put(key, value);
    }
    return (A) this;
  }

  public A addToOverhead(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.overhead == null && map != null) {
      this.overhead = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.overhead.putAll(map);
    }
    return (A) this;
  }

  public A removeFromOverhead(java.lang.String key) {
    if (this.overhead == null) {
      return (A) this;
    }
    if (key != null && this.overhead != null) {
      this.overhead.remove(key);
    }
    return (A) this;
  }

  public A removeFromOverhead(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.overhead == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.overhead != null) {
          this.overhead.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getOverhead() {
    return this.overhead;
  }

  public <K, V> A withOverhead(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> overhead) {
    if (overhead == null) {
      this.overhead = null;
    } else {
      this.overhead = new java.util.LinkedHashMap(overhead);
    }
    return (A) this;
  }

  public java.lang.Boolean hasOverhead() {
    return this.overhead != null;
  }

  public java.lang.String getPreemptionPolicy() {
    return this.preemptionPolicy;
  }

  public A withPreemptionPolicy(java.lang.String preemptionPolicy) {
    this.preemptionPolicy = preemptionPolicy;
    return (A) this;
  }

  public java.lang.Boolean hasPreemptionPolicy() {
    return this.preemptionPolicy != null;
  }

  /** Method is deprecated. use withPreemptionPolicy instead. */
  @java.lang.Deprecated
  public A withNewPreemptionPolicy(java.lang.String original) {
    return (A) withPreemptionPolicy(new String(original));
  }

  public java.lang.Integer getPriority() {
    return this.priority;
  }

  public A withPriority(java.lang.Integer priority) {
    this.priority = priority;
    return (A) this;
  }

  public java.lang.Boolean hasPriority() {
    return this.priority != null;
  }

  public java.lang.String getPriorityClassName() {
    return this.priorityClassName;
  }

  public A withPriorityClassName(java.lang.String priorityClassName) {
    this.priorityClassName = priorityClassName;
    return (A) this;
  }

  public java.lang.Boolean hasPriorityClassName() {
    return this.priorityClassName != null;
  }

  /** Method is deprecated. use withPriorityClassName instead. */
  @java.lang.Deprecated
  public A withNewPriorityClassName(java.lang.String original) {
    return (A) withPriorityClassName(new String(original));
  }

  public A addToReadinessGates(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodReadinessGate item) {
    if (this.readinessGates == null) {
      this.readinessGates =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder>();
    }
    io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder builder =
        new io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder(item);
    _visitables
        .get("readinessGates")
        .add(index >= 0 ? index : _visitables.get("readinessGates").size(), builder);
    this.readinessGates.add(index >= 0 ? index : readinessGates.size(), builder);
    return (A) this;
  }

  public A setToReadinessGates(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodReadinessGate item) {
    if (this.readinessGates == null) {
      this.readinessGates =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder>();
    }
    io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder builder =
        new io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder(item);
    if (index < 0 || index >= _visitables.get("readinessGates").size()) {
      _visitables.get("readinessGates").add(builder);
    } else {
      _visitables.get("readinessGates").set(index, builder);
    }
    if (index < 0 || index >= readinessGates.size()) {
      readinessGates.add(builder);
    } else {
      readinessGates.set(index, builder);
    }
    return (A) this;
  }

  public A addToReadinessGates(io.kubernetes.client.openapi.models.V1PodReadinessGate... items) {
    if (this.readinessGates == null) {
      this.readinessGates =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1PodReadinessGate item : items) {
      io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder builder =
          new io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder(item);
      _visitables.get("readinessGates").add(builder);
      this.readinessGates.add(builder);
    }
    return (A) this;
  }

  public A addAllToReadinessGates(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PodReadinessGate> items) {
    if (this.readinessGates == null) {
      this.readinessGates =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1PodReadinessGate item : items) {
      io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder builder =
          new io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder(item);
      _visitables.get("readinessGates").add(builder);
      this.readinessGates.add(builder);
    }
    return (A) this;
  }

  public A removeFromReadinessGates(
      io.kubernetes.client.openapi.models.V1PodReadinessGate... items) {
    for (io.kubernetes.client.openapi.models.V1PodReadinessGate item : items) {
      io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder builder =
          new io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder(item);
      _visitables.get("readinessGates").remove(builder);
      if (this.readinessGates != null) {
        this.readinessGates.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromReadinessGates(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PodReadinessGate> items) {
    for (io.kubernetes.client.openapi.models.V1PodReadinessGate item : items) {
      io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder builder =
          new io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder(item);
      _visitables.get("readinessGates").remove(builder);
      if (this.readinessGates != null) {
        this.readinessGates.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromReadinessGates(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder>
          predicate) {
    if (readinessGates == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder> each =
        readinessGates.iterator();
    final List visitables = _visitables.get("readinessGates");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildReadinessGates instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1PodReadinessGate>
      getReadinessGates() {
    return readinessGates != null ? build(readinessGates) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1PodReadinessGate>
      buildReadinessGates() {
    return readinessGates != null ? build(readinessGates) : null;
  }

  public io.kubernetes.client.openapi.models.V1PodReadinessGate buildReadinessGate(
      java.lang.Integer index) {
    return this.readinessGates.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1PodReadinessGate buildFirstReadinessGate() {
    return this.readinessGates.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1PodReadinessGate buildLastReadinessGate() {
    return this.readinessGates.get(readinessGates.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1PodReadinessGate buildMatchingReadinessGate(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder item : readinessGates) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingReadinessGate(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder item : readinessGates) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withReadinessGates(
      java.util.List<io.kubernetes.client.openapi.models.V1PodReadinessGate> readinessGates) {
    if (this.readinessGates != null) {
      _visitables.get("readinessGates").removeAll(this.readinessGates);
    }
    if (readinessGates != null) {
      this.readinessGates = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1PodReadinessGate item : readinessGates) {
        this.addToReadinessGates(item);
      }
    } else {
      this.readinessGates = null;
    }
    return (A) this;
  }

  public A withReadinessGates(
      io.kubernetes.client.openapi.models.V1PodReadinessGate... readinessGates) {
    if (this.readinessGates != null) {
      this.readinessGates.clear();
    }
    if (readinessGates != null) {
      for (io.kubernetes.client.openapi.models.V1PodReadinessGate item : readinessGates) {
        this.addToReadinessGates(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasReadinessGates() {
    return readinessGates != null && !readinessGates.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ReadinessGatesNested<A>
      addNewReadinessGate() {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.ReadinessGatesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ReadinessGatesNested<A>
      addNewReadinessGateLike(io.kubernetes.client.openapi.models.V1PodReadinessGate item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.ReadinessGatesNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ReadinessGatesNested<A>
      setNewReadinessGateLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodReadinessGate item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.ReadinessGatesNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ReadinessGatesNested<A>
      editReadinessGate(java.lang.Integer index) {
    if (readinessGates.size() <= index)
      throw new RuntimeException("Can't edit readinessGates. Index exceeds size.");
    return setNewReadinessGateLike(index, buildReadinessGate(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ReadinessGatesNested<A>
      editFirstReadinessGate() {
    if (readinessGates.size() == 0)
      throw new RuntimeException("Can't edit first readinessGates. The list is empty.");
    return setNewReadinessGateLike(0, buildReadinessGate(0));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ReadinessGatesNested<A>
      editLastReadinessGate() {
    int index = readinessGates.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last readinessGates. The list is empty.");
    return setNewReadinessGateLike(index, buildReadinessGate(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ReadinessGatesNested<A>
      editMatchingReadinessGate(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < readinessGates.size(); i++) {
      if (predicate.test(readinessGates.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException("Can't edit matching readinessGates. No match found.");
    return setNewReadinessGateLike(index, buildReadinessGate(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSpec.RestartPolicyEnum getRestartPolicy() {
    return this.restartPolicy;
  }

  public A withRestartPolicy(
      io.kubernetes.client.openapi.models.V1PodSpec.RestartPolicyEnum restartPolicy) {
    this.restartPolicy = restartPolicy;
    return (A) this;
  }

  public java.lang.Boolean hasRestartPolicy() {
    return this.restartPolicy != null;
  }

  public java.lang.String getRuntimeClassName() {
    return this.runtimeClassName;
  }

  public A withRuntimeClassName(java.lang.String runtimeClassName) {
    this.runtimeClassName = runtimeClassName;
    return (A) this;
  }

  public java.lang.Boolean hasRuntimeClassName() {
    return this.runtimeClassName != null;
  }

  /** Method is deprecated. use withRuntimeClassName instead. */
  @java.lang.Deprecated
  public A withNewRuntimeClassName(java.lang.String original) {
    return (A) withRuntimeClassName(new String(original));
  }

  public java.lang.String getSchedulerName() {
    return this.schedulerName;
  }

  public A withSchedulerName(java.lang.String schedulerName) {
    this.schedulerName = schedulerName;
    return (A) this;
  }

  public java.lang.Boolean hasSchedulerName() {
    return this.schedulerName != null;
  }

  /** Method is deprecated. use withSchedulerName instead. */
  @java.lang.Deprecated
  public A withNewSchedulerName(java.lang.String original) {
    return (A) withSchedulerName(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildSecurityContext instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PodSecurityContext getSecurityContext() {
    return this.securityContext != null ? this.securityContext.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContext buildSecurityContext() {
    return this.securityContext != null ? this.securityContext.build() : null;
  }

  public A withSecurityContext(
      io.kubernetes.client.openapi.models.V1PodSecurityContext securityContext) {
    _visitables.get("securityContext").remove(this.securityContext);
    if (securityContext != null) {
      this.securityContext =
          new io.kubernetes.client.openapi.models.V1PodSecurityContextBuilder(securityContext);
      _visitables.get("securityContext").add(this.securityContext);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSecurityContext() {
    return this.securityContext != null;
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.SecurityContextNested<A>
      withNewSecurityContext() {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.SecurityContextNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.SecurityContextNested<A>
      withNewSecurityContextLike(io.kubernetes.client.openapi.models.V1PodSecurityContext item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.SecurityContextNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.SecurityContextNested<A>
      editSecurityContext() {
    return withNewSecurityContextLike(getSecurityContext());
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.SecurityContextNested<A>
      editOrNewSecurityContext() {
    return withNewSecurityContextLike(
        getSecurityContext() != null
            ? getSecurityContext()
            : new io.kubernetes.client.openapi.models.V1PodSecurityContextBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.SecurityContextNested<A>
      editOrNewSecurityContextLike(io.kubernetes.client.openapi.models.V1PodSecurityContext item) {
    return withNewSecurityContextLike(getSecurityContext() != null ? getSecurityContext() : item);
  }

  public java.lang.String getServiceAccount() {
    return this.serviceAccount;
  }

  public A withServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return (A) this;
  }

  public java.lang.Boolean hasServiceAccount() {
    return this.serviceAccount != null;
  }

  /** Method is deprecated. use withServiceAccount instead. */
  @java.lang.Deprecated
  public A withNewServiceAccount(java.lang.String original) {
    return (A) withServiceAccount(new String(original));
  }

  public java.lang.String getServiceAccountName() {
    return this.serviceAccountName;
  }

  public A withServiceAccountName(java.lang.String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return (A) this;
  }

  public java.lang.Boolean hasServiceAccountName() {
    return this.serviceAccountName != null;
  }

  /** Method is deprecated. use withServiceAccountName instead. */
  @java.lang.Deprecated
  public A withNewServiceAccountName(java.lang.String original) {
    return (A) withServiceAccountName(new String(original));
  }

  public java.lang.Boolean getSetHostnameAsFQDN() {
    return this.setHostnameAsFQDN;
  }

  public A withSetHostnameAsFQDN(java.lang.Boolean setHostnameAsFQDN) {
    this.setHostnameAsFQDN = setHostnameAsFQDN;
    return (A) this;
  }

  public java.lang.Boolean hasSetHostnameAsFQDN() {
    return this.setHostnameAsFQDN != null;
  }

  public java.lang.Boolean getShareProcessNamespace() {
    return this.shareProcessNamespace;
  }

  public A withShareProcessNamespace(java.lang.Boolean shareProcessNamespace) {
    this.shareProcessNamespace = shareProcessNamespace;
    return (A) this;
  }

  public java.lang.Boolean hasShareProcessNamespace() {
    return this.shareProcessNamespace != null;
  }

  public java.lang.String getSubdomain() {
    return this.subdomain;
  }

  public A withSubdomain(java.lang.String subdomain) {
    this.subdomain = subdomain;
    return (A) this;
  }

  public java.lang.Boolean hasSubdomain() {
    return this.subdomain != null;
  }

  /** Method is deprecated. use withSubdomain instead. */
  @java.lang.Deprecated
  public A withNewSubdomain(java.lang.String original) {
    return (A) withSubdomain(new String(original));
  }

  public java.lang.Long getTerminationGracePeriodSeconds() {
    return this.terminationGracePeriodSeconds;
  }

  public A withTerminationGracePeriodSeconds(java.lang.Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    return (A) this;
  }

  public java.lang.Boolean hasTerminationGracePeriodSeconds() {
    return this.terminationGracePeriodSeconds != null;
  }

  public A addToTolerations(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Toleration item) {
    if (this.tolerations == null) {
      this.tolerations =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1TolerationBuilder>();
    }
    io.kubernetes.client.openapi.models.V1TolerationBuilder builder =
        new io.kubernetes.client.openapi.models.V1TolerationBuilder(item);
    _visitables
        .get("tolerations")
        .add(index >= 0 ? index : _visitables.get("tolerations").size(), builder);
    this.tolerations.add(index >= 0 ? index : tolerations.size(), builder);
    return (A) this;
  }

  public A setToTolerations(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Toleration item) {
    if (this.tolerations == null) {
      this.tolerations =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1TolerationBuilder>();
    }
    io.kubernetes.client.openapi.models.V1TolerationBuilder builder =
        new io.kubernetes.client.openapi.models.V1TolerationBuilder(item);
    if (index < 0 || index >= _visitables.get("tolerations").size()) {
      _visitables.get("tolerations").add(builder);
    } else {
      _visitables.get("tolerations").set(index, builder);
    }
    if (index < 0 || index >= tolerations.size()) {
      tolerations.add(builder);
    } else {
      tolerations.set(index, builder);
    }
    return (A) this;
  }

  public A addToTolerations(io.kubernetes.client.openapi.models.V1Toleration... items) {
    if (this.tolerations == null) {
      this.tolerations =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1TolerationBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Toleration item : items) {
      io.kubernetes.client.openapi.models.V1TolerationBuilder builder =
          new io.kubernetes.client.openapi.models.V1TolerationBuilder(item);
      _visitables.get("tolerations").add(builder);
      this.tolerations.add(builder);
    }
    return (A) this;
  }

  public A addAllToTolerations(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Toleration> items) {
    if (this.tolerations == null) {
      this.tolerations =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1TolerationBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Toleration item : items) {
      io.kubernetes.client.openapi.models.V1TolerationBuilder builder =
          new io.kubernetes.client.openapi.models.V1TolerationBuilder(item);
      _visitables.get("tolerations").add(builder);
      this.tolerations.add(builder);
    }
    return (A) this;
  }

  public A removeFromTolerations(io.kubernetes.client.openapi.models.V1Toleration... items) {
    for (io.kubernetes.client.openapi.models.V1Toleration item : items) {
      io.kubernetes.client.openapi.models.V1TolerationBuilder builder =
          new io.kubernetes.client.openapi.models.V1TolerationBuilder(item);
      _visitables.get("tolerations").remove(builder);
      if (this.tolerations != null) {
        this.tolerations.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromTolerations(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Toleration> items) {
    for (io.kubernetes.client.openapi.models.V1Toleration item : items) {
      io.kubernetes.client.openapi.models.V1TolerationBuilder builder =
          new io.kubernetes.client.openapi.models.V1TolerationBuilder(item);
      _visitables.get("tolerations").remove(builder);
      if (this.tolerations != null) {
        this.tolerations.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromTolerations(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TolerationBuilder>
          predicate) {
    if (tolerations == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1TolerationBuilder> each =
        tolerations.iterator();
    final List visitables = _visitables.get("tolerations");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1TolerationBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildTolerations instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1Toleration> getTolerations() {
    return tolerations != null ? build(tolerations) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1Toleration> buildTolerations() {
    return tolerations != null ? build(tolerations) : null;
  }

  public io.kubernetes.client.openapi.models.V1Toleration buildToleration(java.lang.Integer index) {
    return this.tolerations.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1Toleration buildFirstToleration() {
    return this.tolerations.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1Toleration buildLastToleration() {
    return this.tolerations.get(tolerations.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1Toleration buildMatchingToleration(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TolerationBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1TolerationBuilder item : tolerations) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingToleration(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TolerationBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1TolerationBuilder item : tolerations) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withTolerations(
      java.util.List<io.kubernetes.client.openapi.models.V1Toleration> tolerations) {
    if (this.tolerations != null) {
      _visitables.get("tolerations").removeAll(this.tolerations);
    }
    if (tolerations != null) {
      this.tolerations = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1Toleration item : tolerations) {
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
    }
    if (tolerations != null) {
      for (io.kubernetes.client.openapi.models.V1Toleration item : tolerations) {
        this.addToTolerations(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasTolerations() {
    return tolerations != null && !tolerations.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TolerationsNested<A>
      addNewToleration() {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.TolerationsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TolerationsNested<A>
      addNewTolerationLike(io.kubernetes.client.openapi.models.V1Toleration item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.TolerationsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TolerationsNested<A>
      setNewTolerationLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1Toleration item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.TolerationsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TolerationsNested<A> editToleration(
      java.lang.Integer index) {
    if (tolerations.size() <= index)
      throw new RuntimeException("Can't edit tolerations. Index exceeds size.");
    return setNewTolerationLike(index, buildToleration(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TolerationsNested<A>
      editFirstToleration() {
    if (tolerations.size() == 0)
      throw new RuntimeException("Can't edit first tolerations. The list is empty.");
    return setNewTolerationLike(0, buildToleration(0));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TolerationsNested<A>
      editLastToleration() {
    int index = tolerations.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last tolerations. The list is empty.");
    return setNewTolerationLike(index, buildToleration(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TolerationsNested<A>
      editMatchingToleration(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TolerationBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < tolerations.size(); i++) {
      if (predicate.test(tolerations.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching tolerations. No match found.");
    return setNewTolerationLike(index, buildToleration(index));
  }

  public A addToTopologySpreadConstraints(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraint item) {
    if (this.topologySpreadConstraints == null) {
      this.topologySpreadConstraints =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder>();
    }
    io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder builder =
        new io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder(item);
    _visitables
        .get("topologySpreadConstraints")
        .add(index >= 0 ? index : _visitables.get("topologySpreadConstraints").size(), builder);
    this.topologySpreadConstraints.add(
        index >= 0 ? index : topologySpreadConstraints.size(), builder);
    return (A) this;
  }

  public A setToTopologySpreadConstraints(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraint item) {
    if (this.topologySpreadConstraints == null) {
      this.topologySpreadConstraints =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder>();
    }
    io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder builder =
        new io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder(item);
    if (index < 0 || index >= _visitables.get("topologySpreadConstraints").size()) {
      _visitables.get("topologySpreadConstraints").add(builder);
    } else {
      _visitables.get("topologySpreadConstraints").set(index, builder);
    }
    if (index < 0 || index >= topologySpreadConstraints.size()) {
      topologySpreadConstraints.add(builder);
    } else {
      topologySpreadConstraints.set(index, builder);
    }
    return (A) this;
  }

  public A addToTopologySpreadConstraints(
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraint... items) {
    if (this.topologySpreadConstraints == null) {
      this.topologySpreadConstraints =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1TopologySpreadConstraint item : items) {
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder builder =
          new io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder(item);
      _visitables.get("topologySpreadConstraints").add(builder);
      this.topologySpreadConstraints.add(builder);
    }
    return (A) this;
  }

  public A addAllToTopologySpreadConstraints(
      java.util.Collection<io.kubernetes.client.openapi.models.V1TopologySpreadConstraint> items) {
    if (this.topologySpreadConstraints == null) {
      this.topologySpreadConstraints =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1TopologySpreadConstraint item : items) {
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder builder =
          new io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder(item);
      _visitables.get("topologySpreadConstraints").add(builder);
      this.topologySpreadConstraints.add(builder);
    }
    return (A) this;
  }

  public A removeFromTopologySpreadConstraints(
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraint... items) {
    for (io.kubernetes.client.openapi.models.V1TopologySpreadConstraint item : items) {
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder builder =
          new io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder(item);
      _visitables.get("topologySpreadConstraints").remove(builder);
      if (this.topologySpreadConstraints != null) {
        this.topologySpreadConstraints.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromTopologySpreadConstraints(
      java.util.Collection<io.kubernetes.client.openapi.models.V1TopologySpreadConstraint> items) {
    for (io.kubernetes.client.openapi.models.V1TopologySpreadConstraint item : items) {
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder builder =
          new io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder(item);
      _visitables.get("topologySpreadConstraints").remove(builder);
      if (this.topologySpreadConstraints != null) {
        this.topologySpreadConstraints.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromTopologySpreadConstraints(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder>
          predicate) {
    if (topologySpreadConstraints == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder> each =
        topologySpreadConstraints.iterator();
    final List visitables = _visitables.get("topologySpreadConstraints");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildTopologySpreadConstraints instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1TopologySpreadConstraint>
      getTopologySpreadConstraints() {
    return topologySpreadConstraints != null ? build(topologySpreadConstraints) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1TopologySpreadConstraint>
      buildTopologySpreadConstraints() {
    return topologySpreadConstraints != null ? build(topologySpreadConstraints) : null;
  }

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraint
      buildTopologySpreadConstraint(java.lang.Integer index) {
    return this.topologySpreadConstraints.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraint
      buildFirstTopologySpreadConstraint() {
    return this.topologySpreadConstraints.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraint
      buildLastTopologySpreadConstraint() {
    return this.topologySpreadConstraints.get(topologySpreadConstraints.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraint
      buildMatchingTopologySpreadConstraint(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder>
              predicate) {
    for (io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder item :
        topologySpreadConstraints) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingTopologySpreadConstraint(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder item :
        topologySpreadConstraints) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withTopologySpreadConstraints(
      java.util.List<io.kubernetes.client.openapi.models.V1TopologySpreadConstraint>
          topologySpreadConstraints) {
    if (this.topologySpreadConstraints != null) {
      _visitables.get("topologySpreadConstraints").removeAll(this.topologySpreadConstraints);
    }
    if (topologySpreadConstraints != null) {
      this.topologySpreadConstraints = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1TopologySpreadConstraint item :
          topologySpreadConstraints) {
        this.addToTopologySpreadConstraints(item);
      }
    } else {
      this.topologySpreadConstraints = null;
    }
    return (A) this;
  }

  public A withTopologySpreadConstraints(
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraint... topologySpreadConstraints) {
    if (this.topologySpreadConstraints != null) {
      this.topologySpreadConstraints.clear();
    }
    if (topologySpreadConstraints != null) {
      for (io.kubernetes.client.openapi.models.V1TopologySpreadConstraint item :
          topologySpreadConstraints) {
        this.addToTopologySpreadConstraints(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasTopologySpreadConstraints() {
    return topologySpreadConstraints != null && !topologySpreadConstraints.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TopologySpreadConstraintsNested<A>
      addNewTopologySpreadConstraint() {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl
        .TopologySpreadConstraintsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TopologySpreadConstraintsNested<A>
      addNewTopologySpreadConstraintLike(
          io.kubernetes.client.openapi.models.V1TopologySpreadConstraint item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl
        .TopologySpreadConstraintsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TopologySpreadConstraintsNested<A>
      setNewTopologySpreadConstraintLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1TopologySpreadConstraint item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl
        .TopologySpreadConstraintsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TopologySpreadConstraintsNested<A>
      editTopologySpreadConstraint(java.lang.Integer index) {
    if (topologySpreadConstraints.size() <= index)
      throw new RuntimeException("Can't edit topologySpreadConstraints. Index exceeds size.");
    return setNewTopologySpreadConstraintLike(index, buildTopologySpreadConstraint(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TopologySpreadConstraintsNested<A>
      editFirstTopologySpreadConstraint() {
    if (topologySpreadConstraints.size() == 0)
      throw new RuntimeException("Can't edit first topologySpreadConstraints. The list is empty.");
    return setNewTopologySpreadConstraintLike(0, buildTopologySpreadConstraint(0));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TopologySpreadConstraintsNested<A>
      editLastTopologySpreadConstraint() {
    int index = topologySpreadConstraints.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last topologySpreadConstraints. The list is empty.");
    return setNewTopologySpreadConstraintLike(index, buildTopologySpreadConstraint(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TopologySpreadConstraintsNested<A>
      editMatchingTopologySpreadConstraint(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < topologySpreadConstraints.size(); i++) {
      if (predicate.test(topologySpreadConstraints.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException("Can't edit matching topologySpreadConstraints. No match found.");
    return setNewTopologySpreadConstraintLike(index, buildTopologySpreadConstraint(index));
  }

  public A addToVolumes(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Volume item) {
    if (this.volumes == null) {
      this.volumes = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeBuilder>();
    }
    io.kubernetes.client.openapi.models.V1VolumeBuilder builder =
        new io.kubernetes.client.openapi.models.V1VolumeBuilder(item);
    _visitables.get("volumes").add(index >= 0 ? index : _visitables.get("volumes").size(), builder);
    this.volumes.add(index >= 0 ? index : volumes.size(), builder);
    return (A) this;
  }

  public A setToVolumes(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Volume item) {
    if (this.volumes == null) {
      this.volumes = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeBuilder>();
    }
    io.kubernetes.client.openapi.models.V1VolumeBuilder builder =
        new io.kubernetes.client.openapi.models.V1VolumeBuilder(item);
    if (index < 0 || index >= _visitables.get("volumes").size()) {
      _visitables.get("volumes").add(builder);
    } else {
      _visitables.get("volumes").set(index, builder);
    }
    if (index < 0 || index >= volumes.size()) {
      volumes.add(builder);
    } else {
      volumes.set(index, builder);
    }
    return (A) this;
  }

  public A addToVolumes(io.kubernetes.client.openapi.models.V1Volume... items) {
    if (this.volumes == null) {
      this.volumes = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Volume item : items) {
      io.kubernetes.client.openapi.models.V1VolumeBuilder builder =
          new io.kubernetes.client.openapi.models.V1VolumeBuilder(item);
      _visitables.get("volumes").add(builder);
      this.volumes.add(builder);
    }
    return (A) this;
  }

  public A addAllToVolumes(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Volume> items) {
    if (this.volumes == null) {
      this.volumes = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Volume item : items) {
      io.kubernetes.client.openapi.models.V1VolumeBuilder builder =
          new io.kubernetes.client.openapi.models.V1VolumeBuilder(item);
      _visitables.get("volumes").add(builder);
      this.volumes.add(builder);
    }
    return (A) this;
  }

  public A removeFromVolumes(io.kubernetes.client.openapi.models.V1Volume... items) {
    for (io.kubernetes.client.openapi.models.V1Volume item : items) {
      io.kubernetes.client.openapi.models.V1VolumeBuilder builder =
          new io.kubernetes.client.openapi.models.V1VolumeBuilder(item);
      _visitables.get("volumes").remove(builder);
      if (this.volumes != null) {
        this.volumes.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromVolumes(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Volume> items) {
    for (io.kubernetes.client.openapi.models.V1Volume item : items) {
      io.kubernetes.client.openapi.models.V1VolumeBuilder builder =
          new io.kubernetes.client.openapi.models.V1VolumeBuilder(item);
      _visitables.get("volumes").remove(builder);
      if (this.volumes != null) {
        this.volumes.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromVolumes(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeBuilder> predicate) {
    if (volumes == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1VolumeBuilder> each = volumes.iterator();
    final List visitables = _visitables.get("volumes");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1VolumeBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildVolumes instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1Volume> getVolumes() {
    return volumes != null ? build(volumes) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1Volume> buildVolumes() {
    return volumes != null ? build(volumes) : null;
  }

  public io.kubernetes.client.openapi.models.V1Volume buildVolume(java.lang.Integer index) {
    return this.volumes.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1Volume buildFirstVolume() {
    return this.volumes.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1Volume buildLastVolume() {
    return this.volumes.get(volumes.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1Volume buildMatchingVolume(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeBuilder> predicate) {
    for (io.kubernetes.client.openapi.models.V1VolumeBuilder item : volumes) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingVolume(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeBuilder> predicate) {
    for (io.kubernetes.client.openapi.models.V1VolumeBuilder item : volumes) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withVolumes(java.util.List<io.kubernetes.client.openapi.models.V1Volume> volumes) {
    if (this.volumes != null) {
      _visitables.get("volumes").removeAll(this.volumes);
    }
    if (volumes != null) {
      this.volumes = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1Volume item : volumes) {
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
    }
    if (volumes != null) {
      for (io.kubernetes.client.openapi.models.V1Volume item : volumes) {
        this.addToVolumes(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasVolumes() {
    return volumes != null && !volumes.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.VolumesNested<A> addNewVolume() {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.VolumesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.VolumesNested<A> addNewVolumeLike(
      io.kubernetes.client.openapi.models.V1Volume item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.VolumesNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.VolumesNested<A> setNewVolumeLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Volume item) {
    return new io.kubernetes.client.openapi.models.V1PodSpecFluentImpl.VolumesNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.VolumesNested<A> editVolume(
      java.lang.Integer index) {
    if (volumes.size() <= index)
      throw new RuntimeException("Can't edit volumes. Index exceeds size.");
    return setNewVolumeLike(index, buildVolume(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.VolumesNested<A> editFirstVolume() {
    if (volumes.size() == 0)
      throw new RuntimeException("Can't edit first volumes. The list is empty.");
    return setNewVolumeLike(0, buildVolume(0));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.VolumesNested<A> editLastVolume() {
    int index = volumes.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last volumes. The list is empty.");
    return setNewVolumeLike(index, buildVolume(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.VolumesNested<A> editMatchingVolume(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeBuilder> predicate) {
    int index = -1;
    for (int i = 0; i < volumes.size(); i++) {
      if (predicate.test(volumes.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching volumes. No match found.");
    return setNewVolumeLike(index, buildVolume(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodSpecFluentImpl that = (V1PodSpecFluentImpl) o;
    if (activeDeadlineSeconds != null
        ? !activeDeadlineSeconds.equals(that.activeDeadlineSeconds)
        : that.activeDeadlineSeconds != null) return false;
    if (affinity != null ? !affinity.equals(that.affinity) : that.affinity != null) return false;
    if (automountServiceAccountToken != null
        ? !automountServiceAccountToken.equals(that.automountServiceAccountToken)
        : that.automountServiceAccountToken != null) return false;
    if (containers != null ? !containers.equals(that.containers) : that.containers != null)
      return false;
    if (dnsConfig != null ? !dnsConfig.equals(that.dnsConfig) : that.dnsConfig != null)
      return false;
    if (dnsPolicy != null ? !dnsPolicy.equals(that.dnsPolicy) : that.dnsPolicy != null)
      return false;
    if (enableServiceLinks != null
        ? !enableServiceLinks.equals(that.enableServiceLinks)
        : that.enableServiceLinks != null) return false;
    if (ephemeralContainers != null
        ? !ephemeralContainers.equals(that.ephemeralContainers)
        : that.ephemeralContainers != null) return false;
    if (hostAliases != null ? !hostAliases.equals(that.hostAliases) : that.hostAliases != null)
      return false;
    if (hostIPC != null ? !hostIPC.equals(that.hostIPC) : that.hostIPC != null) return false;
    if (hostNetwork != null ? !hostNetwork.equals(that.hostNetwork) : that.hostNetwork != null)
      return false;
    if (hostPID != null ? !hostPID.equals(that.hostPID) : that.hostPID != null) return false;
    if (hostname != null ? !hostname.equals(that.hostname) : that.hostname != null) return false;
    if (imagePullSecrets != null
        ? !imagePullSecrets.equals(that.imagePullSecrets)
        : that.imagePullSecrets != null) return false;
    if (initContainers != null
        ? !initContainers.equals(that.initContainers)
        : that.initContainers != null) return false;
    if (nodeName != null ? !nodeName.equals(that.nodeName) : that.nodeName != null) return false;
    if (nodeSelector != null ? !nodeSelector.equals(that.nodeSelector) : that.nodeSelector != null)
      return false;
    if (os != null ? !os.equals(that.os) : that.os != null) return false;
    if (overhead != null ? !overhead.equals(that.overhead) : that.overhead != null) return false;
    if (preemptionPolicy != null
        ? !preemptionPolicy.equals(that.preemptionPolicy)
        : that.preemptionPolicy != null) return false;
    if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;
    if (priorityClassName != null
        ? !priorityClassName.equals(that.priorityClassName)
        : that.priorityClassName != null) return false;
    if (readinessGates != null
        ? !readinessGates.equals(that.readinessGates)
        : that.readinessGates != null) return false;
    if (restartPolicy != null
        ? !restartPolicy.equals(that.restartPolicy)
        : that.restartPolicy != null) return false;
    if (runtimeClassName != null
        ? !runtimeClassName.equals(that.runtimeClassName)
        : that.runtimeClassName != null) return false;
    if (schedulerName != null
        ? !schedulerName.equals(that.schedulerName)
        : that.schedulerName != null) return false;
    if (securityContext != null
        ? !securityContext.equals(that.securityContext)
        : that.securityContext != null) return false;
    if (serviceAccount != null
        ? !serviceAccount.equals(that.serviceAccount)
        : that.serviceAccount != null) return false;
    if (serviceAccountName != null
        ? !serviceAccountName.equals(that.serviceAccountName)
        : that.serviceAccountName != null) return false;
    if (setHostnameAsFQDN != null
        ? !setHostnameAsFQDN.equals(that.setHostnameAsFQDN)
        : that.setHostnameAsFQDN != null) return false;
    if (shareProcessNamespace != null
        ? !shareProcessNamespace.equals(that.shareProcessNamespace)
        : that.shareProcessNamespace != null) return false;
    if (subdomain != null ? !subdomain.equals(that.subdomain) : that.subdomain != null)
      return false;
    if (terminationGracePeriodSeconds != null
        ? !terminationGracePeriodSeconds.equals(that.terminationGracePeriodSeconds)
        : that.terminationGracePeriodSeconds != null) return false;
    if (tolerations != null ? !tolerations.equals(that.tolerations) : that.tolerations != null)
      return false;
    if (topologySpreadConstraints != null
        ? !topologySpreadConstraints.equals(that.topologySpreadConstraints)
        : that.topologySpreadConstraints != null) return false;
    if (volumes != null ? !volumes.equals(that.volumes) : that.volumes != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        activeDeadlineSeconds,
        affinity,
        automountServiceAccountToken,
        containers,
        dnsConfig,
        dnsPolicy,
        enableServiceLinks,
        ephemeralContainers,
        hostAliases,
        hostIPC,
        hostNetwork,
        hostPID,
        hostname,
        imagePullSecrets,
        initContainers,
        nodeName,
        nodeSelector,
        os,
        overhead,
        preemptionPolicy,
        priority,
        priorityClassName,
        readinessGates,
        restartPolicy,
        runtimeClassName,
        schedulerName,
        securityContext,
        serviceAccount,
        serviceAccountName,
        setHostnameAsFQDN,
        shareProcessNamespace,
        subdomain,
        terminationGracePeriodSeconds,
        tolerations,
        topologySpreadConstraints,
        volumes,
        super.hashCode());
  }

  public class AffinityNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1AffinityFluentImpl<
          io.kubernetes.client.openapi.models.V1PodSpecFluent.AffinityNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodSpecFluent.AffinityNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    AffinityNestedImpl(io.kubernetes.client.openapi.models.V1Affinity item) {
      this.builder = new io.kubernetes.client.openapi.models.V1AffinityBuilder(this, item);
    }

    AffinityNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1AffinityBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1AffinityBuilder builder;

    public N and() {
      return (N) V1PodSpecFluentImpl.this.withAffinity(builder.build());
    }

    public N endAffinity() {
      return and();
    }
  }

  public class ContainersNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ContainerFluentImpl<
          io.kubernetes.client.openapi.models.V1PodSpecFluent.ContainersNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodSpecFluent.ContainersNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ContainersNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1Container item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1ContainerBuilder(this, item);
    }

    ContainersNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1ContainerBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ContainerBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1PodSpecFluentImpl.this.setToContainers(index, builder.build());
    }

    public N endContainer() {
      return and();
    }
  }

  public class DnsConfigNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PodDNSConfigFluentImpl<
          io.kubernetes.client.openapi.models.V1PodSpecFluent.DnsConfigNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodSpecFluent.DnsConfigNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    DnsConfigNestedImpl(io.kubernetes.client.openapi.models.V1PodDNSConfig item) {
      this.builder = new io.kubernetes.client.openapi.models.V1PodDNSConfigBuilder(this, item);
    }

    DnsConfigNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1PodDNSConfigBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PodDNSConfigBuilder builder;

    public N and() {
      return (N) V1PodSpecFluentImpl.this.withDnsConfig(builder.build());
    }

    public N endDnsConfig() {
      return and();
    }
  }

  public class EphemeralContainersNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1EphemeralContainerFluentImpl<
          io.kubernetes.client.openapi.models.V1PodSpecFluent.EphemeralContainersNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodSpecFluent.EphemeralContainersNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    EphemeralContainersNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1EphemeralContainer item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder(this, item);
    }

    EphemeralContainersNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1PodSpecFluentImpl.this.setToEphemeralContainers(index, builder.build());
    }

    public N endEphemeralContainer() {
      return and();
    }
  }

  public class HostAliasesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1HostAliasFluentImpl<
          io.kubernetes.client.openapi.models.V1PodSpecFluent.HostAliasesNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodSpecFluent.HostAliasesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    HostAliasesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1HostAlias item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1HostAliasBuilder(this, item);
    }

    HostAliasesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1HostAliasBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1HostAliasBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1PodSpecFluentImpl.this.setToHostAliases(index, builder.build());
    }

    public N endHostAlias() {
      return and();
    }
  }

  public class ImagePullSecretsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1PodSpecFluent.ImagePullSecretsNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodSpecFluent.ImagePullSecretsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ImagePullSecretsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(this, item);
    }

    ImagePullSecretsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1PodSpecFluentImpl.this.setToImagePullSecrets(index, builder.build());
    }

    public N endImagePullSecret() {
      return and();
    }
  }

  public class InitContainersNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ContainerFluentImpl<
          io.kubernetes.client.openapi.models.V1PodSpecFluent.InitContainersNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodSpecFluent.InitContainersNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    InitContainersNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1Container item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1ContainerBuilder(this, item);
    }

    InitContainersNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1ContainerBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ContainerBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1PodSpecFluentImpl.this.setToInitContainers(index, builder.build());
    }

    public N endInitContainer() {
      return and();
    }
  }

  public class OsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PodOSFluentImpl<
          io.kubernetes.client.openapi.models.V1PodSpecFluent.OsNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodSpecFluent.OsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    OsNestedImpl(io.kubernetes.client.openapi.models.V1PodOS item) {
      this.builder = new io.kubernetes.client.openapi.models.V1PodOSBuilder(this, item);
    }

    OsNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1PodOSBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PodOSBuilder builder;

    public N and() {
      return (N) V1PodSpecFluentImpl.this.withOs(builder.build());
    }

    public N endOs() {
      return and();
    }
  }

  public class ReadinessGatesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PodReadinessGateFluentImpl<
          io.kubernetes.client.openapi.models.V1PodSpecFluent.ReadinessGatesNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodSpecFluent.ReadinessGatesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ReadinessGatesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodReadinessGate item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder(this, item);
    }

    ReadinessGatesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1PodSpecFluentImpl.this.setToReadinessGates(index, builder.build());
    }

    public N endReadinessGate() {
      return and();
    }
  }

  public class SecurityContextNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PodSecurityContextFluentImpl<
          io.kubernetes.client.openapi.models.V1PodSpecFluent.SecurityContextNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodSpecFluent.SecurityContextNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SecurityContextNestedImpl(io.kubernetes.client.openapi.models.V1PodSecurityContext item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1PodSecurityContextBuilder(this, item);
    }

    SecurityContextNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1PodSecurityContextBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PodSecurityContextBuilder builder;

    public N and() {
      return (N) V1PodSpecFluentImpl.this.withSecurityContext(builder.build());
    }

    public N endSecurityContext() {
      return and();
    }
  }

  public class TolerationsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1TolerationFluentImpl<
          io.kubernetes.client.openapi.models.V1PodSpecFluent.TolerationsNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodSpecFluent.TolerationsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    TolerationsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1Toleration item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1TolerationBuilder(this, item);
    }

    TolerationsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1TolerationBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1TolerationBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1PodSpecFluentImpl.this.setToTolerations(index, builder.build());
    }

    public N endToleration() {
      return and();
    }
  }

  public class TopologySpreadConstraintsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluentImpl<
          io.kubernetes.client.openapi.models.V1PodSpecFluent.TopologySpreadConstraintsNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodSpecFluent
                  .TopologySpreadConstraintsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    TopologySpreadConstraintsNestedImpl(
        java.lang.Integer index,
        io.kubernetes.client.openapi.models.V1TopologySpreadConstraint item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder(this, item);
    }

    TopologySpreadConstraintsNestedImpl() {
      this.index = -1;
      this.builder =
          new io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1PodSpecFluentImpl.this.setToTopologySpreadConstraints(index, builder.build());
    }

    public N endTopologySpreadConstraint() {
      return and();
    }
  }

  public class VolumesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1VolumeFluentImpl<
          io.kubernetes.client.openapi.models.V1PodSpecFluent.VolumesNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodSpecFluent.VolumesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    VolumesNestedImpl(java.lang.Integer index, io.kubernetes.client.openapi.models.V1Volume item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1VolumeBuilder(this, item);
    }

    VolumesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1VolumeBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1VolumeBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1PodSpecFluentImpl.this.setToVolumes(index, builder.build());
    }

    public N endVolume() {
      return and();
    }
  }
}
