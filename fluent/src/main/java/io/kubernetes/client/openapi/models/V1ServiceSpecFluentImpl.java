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
public class V1ServiceSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ServiceSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ServiceSpecFluent<A> {
  public V1ServiceSpecFluentImpl() {}

  public V1ServiceSpecFluentImpl(io.kubernetes.client.openapi.models.V1ServiceSpec instance) {
    this.withAllocateLoadBalancerNodePorts(instance.getAllocateLoadBalancerNodePorts());

    this.withClusterIP(instance.getClusterIP());

    this.withClusterIPs(instance.getClusterIPs());

    this.withExternalIPs(instance.getExternalIPs());

    this.withExternalName(instance.getExternalName());

    this.withExternalTrafficPolicy(instance.getExternalTrafficPolicy());

    this.withHealthCheckNodePort(instance.getHealthCheckNodePort());

    this.withInternalTrafficPolicy(instance.getInternalTrafficPolicy());

    this.withIpFamilies(instance.getIpFamilies());

    this.withIpFamilyPolicy(instance.getIpFamilyPolicy());

    this.withLoadBalancerClass(instance.getLoadBalancerClass());

    this.withLoadBalancerIP(instance.getLoadBalancerIP());

    this.withLoadBalancerSourceRanges(instance.getLoadBalancerSourceRanges());

    this.withPorts(instance.getPorts());

    this.withPublishNotReadyAddresses(instance.getPublishNotReadyAddresses());

    this.withSelector(instance.getSelector());

    this.withSessionAffinity(instance.getSessionAffinity());

    this.withSessionAffinityConfig(instance.getSessionAffinityConfig());

    this.withType(instance.getType());
  }

  private java.lang.Boolean allocateLoadBalancerNodePorts;
  private java.lang.String clusterIP;
  private java.util.List<java.lang.String> clusterIPs;
  private java.util.List<java.lang.String> externalIPs;
  private java.lang.String externalName;
  private io.kubernetes.client.openapi.models.V1ServiceSpec.ExternalTrafficPolicyEnum
      externalTrafficPolicy;
  private java.lang.Integer healthCheckNodePort;
  private java.lang.String internalTrafficPolicy;
  private java.util.List<java.lang.String> ipFamilies;
  private java.lang.String ipFamilyPolicy;
  private java.lang.String loadBalancerClass;
  private java.lang.String loadBalancerIP;
  private java.util.List<java.lang.String> loadBalancerSourceRanges;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1ServicePortBuilder> ports;
  private java.lang.Boolean publishNotReadyAddresses;
  private java.util.Map<java.lang.String, java.lang.String> selector;
  private io.kubernetes.client.openapi.models.V1ServiceSpec.SessionAffinityEnum sessionAffinity;
  private io.kubernetes.client.openapi.models.V1SessionAffinityConfigBuilder sessionAffinityConfig;
  private io.kubernetes.client.openapi.models.V1ServiceSpec.TypeEnum type;

  public java.lang.Boolean getAllocateLoadBalancerNodePorts() {
    return this.allocateLoadBalancerNodePorts;
  }

  public A withAllocateLoadBalancerNodePorts(java.lang.Boolean allocateLoadBalancerNodePorts) {
    this.allocateLoadBalancerNodePorts = allocateLoadBalancerNodePorts;
    return (A) this;
  }

  public java.lang.Boolean hasAllocateLoadBalancerNodePorts() {
    return this.allocateLoadBalancerNodePorts != null;
  }

  public java.lang.String getClusterIP() {
    return this.clusterIP;
  }

  public A withClusterIP(java.lang.String clusterIP) {
    this.clusterIP = clusterIP;
    return (A) this;
  }

  public java.lang.Boolean hasClusterIP() {
    return this.clusterIP != null;
  }

  /** Method is deprecated. use withClusterIP instead. */
  @java.lang.Deprecated
  public A withNewClusterIP(java.lang.String original) {
    return (A) withClusterIP(new String(original));
  }

  public A addToClusterIPs(java.lang.Integer index, java.lang.String item) {
    if (this.clusterIPs == null) {
      this.clusterIPs = new java.util.ArrayList<java.lang.String>();
    }
    this.clusterIPs.add(index, item);
    return (A) this;
  }

  public A setToClusterIPs(java.lang.Integer index, java.lang.String item) {
    if (this.clusterIPs == null) {
      this.clusterIPs = new java.util.ArrayList<java.lang.String>();
    }
    this.clusterIPs.set(index, item);
    return (A) this;
  }

  public A addToClusterIPs(java.lang.String... items) {
    if (this.clusterIPs == null) {
      this.clusterIPs = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.clusterIPs.add(item);
    }
    return (A) this;
  }

  public A addAllToClusterIPs(java.util.Collection<java.lang.String> items) {
    if (this.clusterIPs == null) {
      this.clusterIPs = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.clusterIPs.add(item);
    }
    return (A) this;
  }

  public A removeFromClusterIPs(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.clusterIPs != null) {
        this.clusterIPs.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromClusterIPs(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.clusterIPs != null) {
        this.clusterIPs.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getClusterIPs() {
    return this.clusterIPs;
  }

  public java.lang.String getClusterIP(java.lang.Integer index) {
    return this.clusterIPs.get(index);
  }

  public java.lang.String getFirstClusterIP() {
    return this.clusterIPs.get(0);
  }

  public java.lang.String getLastClusterIP() {
    return this.clusterIPs.get(clusterIPs.size() - 1);
  }

  public java.lang.String getMatchingClusterIP(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : clusterIPs) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingClusterIP(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : clusterIPs) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withClusterIPs(java.util.List<java.lang.String> clusterIPs) {
    if (clusterIPs != null) {
      this.clusterIPs = new java.util.ArrayList();
      for (java.lang.String item : clusterIPs) {
        this.addToClusterIPs(item);
      }
    } else {
      this.clusterIPs = null;
    }
    return (A) this;
  }

  public A withClusterIPs(java.lang.String... clusterIPs) {
    if (this.clusterIPs != null) {
      this.clusterIPs.clear();
    }
    if (clusterIPs != null) {
      for (java.lang.String item : clusterIPs) {
        this.addToClusterIPs(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasClusterIPs() {
    return clusterIPs != null && !clusterIPs.isEmpty();
  }

  public A addNewClusterIP(java.lang.String original) {
    return (A) addToClusterIPs(new String(original));
  }

  public A addToExternalIPs(java.lang.Integer index, java.lang.String item) {
    if (this.externalIPs == null) {
      this.externalIPs = new java.util.ArrayList<java.lang.String>();
    }
    this.externalIPs.add(index, item);
    return (A) this;
  }

  public A setToExternalIPs(java.lang.Integer index, java.lang.String item) {
    if (this.externalIPs == null) {
      this.externalIPs = new java.util.ArrayList<java.lang.String>();
    }
    this.externalIPs.set(index, item);
    return (A) this;
  }

  public A addToExternalIPs(java.lang.String... items) {
    if (this.externalIPs == null) {
      this.externalIPs = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.externalIPs.add(item);
    }
    return (A) this;
  }

  public A addAllToExternalIPs(java.util.Collection<java.lang.String> items) {
    if (this.externalIPs == null) {
      this.externalIPs = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.externalIPs.add(item);
    }
    return (A) this;
  }

  public A removeFromExternalIPs(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.externalIPs != null) {
        this.externalIPs.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromExternalIPs(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.externalIPs != null) {
        this.externalIPs.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getExternalIPs() {
    return this.externalIPs;
  }

  public java.lang.String getExternalIP(java.lang.Integer index) {
    return this.externalIPs.get(index);
  }

  public java.lang.String getFirstExternalIP() {
    return this.externalIPs.get(0);
  }

  public java.lang.String getLastExternalIP() {
    return this.externalIPs.get(externalIPs.size() - 1);
  }

  public java.lang.String getMatchingExternalIP(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : externalIPs) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingExternalIP(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : externalIPs) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withExternalIPs(java.util.List<java.lang.String> externalIPs) {
    if (externalIPs != null) {
      this.externalIPs = new java.util.ArrayList();
      for (java.lang.String item : externalIPs) {
        this.addToExternalIPs(item);
      }
    } else {
      this.externalIPs = null;
    }
    return (A) this;
  }

  public A withExternalIPs(java.lang.String... externalIPs) {
    if (this.externalIPs != null) {
      this.externalIPs.clear();
    }
    if (externalIPs != null) {
      for (java.lang.String item : externalIPs) {
        this.addToExternalIPs(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasExternalIPs() {
    return externalIPs != null && !externalIPs.isEmpty();
  }

  public A addNewExternalIP(java.lang.String original) {
    return (A) addToExternalIPs(new String(original));
  }

  public java.lang.String getExternalName() {
    return this.externalName;
  }

  public A withExternalName(java.lang.String externalName) {
    this.externalName = externalName;
    return (A) this;
  }

  public java.lang.Boolean hasExternalName() {
    return this.externalName != null;
  }

  /** Method is deprecated. use withExternalName instead. */
  @java.lang.Deprecated
  public A withNewExternalName(java.lang.String original) {
    return (A) withExternalName(new String(original));
  }

  public io.kubernetes.client.openapi.models.V1ServiceSpec.ExternalTrafficPolicyEnum
      getExternalTrafficPolicy() {
    return this.externalTrafficPolicy;
  }

  public A withExternalTrafficPolicy(
      io.kubernetes.client.openapi.models.V1ServiceSpec.ExternalTrafficPolicyEnum
          externalTrafficPolicy) {
    this.externalTrafficPolicy = externalTrafficPolicy;
    return (A) this;
  }

  public java.lang.Boolean hasExternalTrafficPolicy() {
    return this.externalTrafficPolicy != null;
  }

  public java.lang.Integer getHealthCheckNodePort() {
    return this.healthCheckNodePort;
  }

  public A withHealthCheckNodePort(java.lang.Integer healthCheckNodePort) {
    this.healthCheckNodePort = healthCheckNodePort;
    return (A) this;
  }

  public java.lang.Boolean hasHealthCheckNodePort() {
    return this.healthCheckNodePort != null;
  }

  public java.lang.String getInternalTrafficPolicy() {
    return this.internalTrafficPolicy;
  }

  public A withInternalTrafficPolicy(java.lang.String internalTrafficPolicy) {
    this.internalTrafficPolicy = internalTrafficPolicy;
    return (A) this;
  }

  public java.lang.Boolean hasInternalTrafficPolicy() {
    return this.internalTrafficPolicy != null;
  }

  /** Method is deprecated. use withInternalTrafficPolicy instead. */
  @java.lang.Deprecated
  public A withNewInternalTrafficPolicy(java.lang.String original) {
    return (A) withInternalTrafficPolicy(new String(original));
  }

  public A addToIpFamilies(java.lang.Integer index, java.lang.String item) {
    if (this.ipFamilies == null) {
      this.ipFamilies = new java.util.ArrayList<java.lang.String>();
    }
    this.ipFamilies.add(index, item);
    return (A) this;
  }

  public A setToIpFamilies(java.lang.Integer index, java.lang.String item) {
    if (this.ipFamilies == null) {
      this.ipFamilies = new java.util.ArrayList<java.lang.String>();
    }
    this.ipFamilies.set(index, item);
    return (A) this;
  }

  public A addToIpFamilies(java.lang.String... items) {
    if (this.ipFamilies == null) {
      this.ipFamilies = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.ipFamilies.add(item);
    }
    return (A) this;
  }

  public A addAllToIpFamilies(java.util.Collection<java.lang.String> items) {
    if (this.ipFamilies == null) {
      this.ipFamilies = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.ipFamilies.add(item);
    }
    return (A) this;
  }

  public A removeFromIpFamilies(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.ipFamilies != null) {
        this.ipFamilies.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromIpFamilies(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.ipFamilies != null) {
        this.ipFamilies.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getIpFamilies() {
    return this.ipFamilies;
  }

  public java.lang.String getIpFamily(java.lang.Integer index) {
    return this.ipFamilies.get(index);
  }

  public java.lang.String getFirstIpFamily() {
    return this.ipFamilies.get(0);
  }

  public java.lang.String getLastIpFamily() {
    return this.ipFamilies.get(ipFamilies.size() - 1);
  }

  public java.lang.String getMatchingIpFamily(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : ipFamilies) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingIpFamily(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : ipFamilies) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withIpFamilies(java.util.List<java.lang.String> ipFamilies) {
    if (ipFamilies != null) {
      this.ipFamilies = new java.util.ArrayList();
      for (java.lang.String item : ipFamilies) {
        this.addToIpFamilies(item);
      }
    } else {
      this.ipFamilies = null;
    }
    return (A) this;
  }

  public A withIpFamilies(java.lang.String... ipFamilies) {
    if (this.ipFamilies != null) {
      this.ipFamilies.clear();
    }
    if (ipFamilies != null) {
      for (java.lang.String item : ipFamilies) {
        this.addToIpFamilies(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasIpFamilies() {
    return ipFamilies != null && !ipFamilies.isEmpty();
  }

  public A addNewIpFamily(java.lang.String original) {
    return (A) addToIpFamilies(new String(original));
  }

  public java.lang.String getIpFamilyPolicy() {
    return this.ipFamilyPolicy;
  }

  public A withIpFamilyPolicy(java.lang.String ipFamilyPolicy) {
    this.ipFamilyPolicy = ipFamilyPolicy;
    return (A) this;
  }

  public java.lang.Boolean hasIpFamilyPolicy() {
    return this.ipFamilyPolicy != null;
  }

  /** Method is deprecated. use withIpFamilyPolicy instead. */
  @java.lang.Deprecated
  public A withNewIpFamilyPolicy(java.lang.String original) {
    return (A) withIpFamilyPolicy(new String(original));
  }

  public java.lang.String getLoadBalancerClass() {
    return this.loadBalancerClass;
  }

  public A withLoadBalancerClass(java.lang.String loadBalancerClass) {
    this.loadBalancerClass = loadBalancerClass;
    return (A) this;
  }

  public java.lang.Boolean hasLoadBalancerClass() {
    return this.loadBalancerClass != null;
  }

  /** Method is deprecated. use withLoadBalancerClass instead. */
  @java.lang.Deprecated
  public A withNewLoadBalancerClass(java.lang.String original) {
    return (A) withLoadBalancerClass(new String(original));
  }

  public java.lang.String getLoadBalancerIP() {
    return this.loadBalancerIP;
  }

  public A withLoadBalancerIP(java.lang.String loadBalancerIP) {
    this.loadBalancerIP = loadBalancerIP;
    return (A) this;
  }

  public java.lang.Boolean hasLoadBalancerIP() {
    return this.loadBalancerIP != null;
  }

  /** Method is deprecated. use withLoadBalancerIP instead. */
  @java.lang.Deprecated
  public A withNewLoadBalancerIP(java.lang.String original) {
    return (A) withLoadBalancerIP(new String(original));
  }

  public A addToLoadBalancerSourceRanges(java.lang.Integer index, java.lang.String item) {
    if (this.loadBalancerSourceRanges == null) {
      this.loadBalancerSourceRanges = new java.util.ArrayList<java.lang.String>();
    }
    this.loadBalancerSourceRanges.add(index, item);
    return (A) this;
  }

  public A setToLoadBalancerSourceRanges(java.lang.Integer index, java.lang.String item) {
    if (this.loadBalancerSourceRanges == null) {
      this.loadBalancerSourceRanges = new java.util.ArrayList<java.lang.String>();
    }
    this.loadBalancerSourceRanges.set(index, item);
    return (A) this;
  }

  public A addToLoadBalancerSourceRanges(java.lang.String... items) {
    if (this.loadBalancerSourceRanges == null) {
      this.loadBalancerSourceRanges = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.loadBalancerSourceRanges.add(item);
    }
    return (A) this;
  }

  public A addAllToLoadBalancerSourceRanges(java.util.Collection<java.lang.String> items) {
    if (this.loadBalancerSourceRanges == null) {
      this.loadBalancerSourceRanges = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.loadBalancerSourceRanges.add(item);
    }
    return (A) this;
  }

  public A removeFromLoadBalancerSourceRanges(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.loadBalancerSourceRanges != null) {
        this.loadBalancerSourceRanges.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromLoadBalancerSourceRanges(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.loadBalancerSourceRanges != null) {
        this.loadBalancerSourceRanges.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getLoadBalancerSourceRanges() {
    return this.loadBalancerSourceRanges;
  }

  public java.lang.String getLoadBalancerSourceRange(java.lang.Integer index) {
    return this.loadBalancerSourceRanges.get(index);
  }

  public java.lang.String getFirstLoadBalancerSourceRange() {
    return this.loadBalancerSourceRanges.get(0);
  }

  public java.lang.String getLastLoadBalancerSourceRange() {
    return this.loadBalancerSourceRanges.get(loadBalancerSourceRanges.size() - 1);
  }

  public java.lang.String getMatchingLoadBalancerSourceRange(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : loadBalancerSourceRanges) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingLoadBalancerSourceRange(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : loadBalancerSourceRanges) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withLoadBalancerSourceRanges(java.util.List<java.lang.String> loadBalancerSourceRanges) {
    if (loadBalancerSourceRanges != null) {
      this.loadBalancerSourceRanges = new java.util.ArrayList();
      for (java.lang.String item : loadBalancerSourceRanges) {
        this.addToLoadBalancerSourceRanges(item);
      }
    } else {
      this.loadBalancerSourceRanges = null;
    }
    return (A) this;
  }

  public A withLoadBalancerSourceRanges(java.lang.String... loadBalancerSourceRanges) {
    if (this.loadBalancerSourceRanges != null) {
      this.loadBalancerSourceRanges.clear();
    }
    if (loadBalancerSourceRanges != null) {
      for (java.lang.String item : loadBalancerSourceRanges) {
        this.addToLoadBalancerSourceRanges(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasLoadBalancerSourceRanges() {
    return loadBalancerSourceRanges != null && !loadBalancerSourceRanges.isEmpty();
  }

  public A addNewLoadBalancerSourceRange(java.lang.String original) {
    return (A) addToLoadBalancerSourceRanges(new String(original));
  }

  public A addToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ServicePort item) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ServicePortBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ServicePortBuilder builder =
        new io.kubernetes.client.openapi.models.V1ServicePortBuilder(item);
    _visitables.get("ports").add(index >= 0 ? index : _visitables.get("ports").size(), builder);
    this.ports.add(index >= 0 ? index : ports.size(), builder);
    return (A) this;
  }

  public A setToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ServicePort item) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ServicePortBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ServicePortBuilder builder =
        new io.kubernetes.client.openapi.models.V1ServicePortBuilder(item);
    if (index < 0 || index >= _visitables.get("ports").size()) {
      _visitables.get("ports").add(builder);
    } else {
      _visitables.get("ports").set(index, builder);
    }
    if (index < 0 || index >= ports.size()) {
      ports.add(builder);
    } else {
      ports.set(index, builder);
    }
    return (A) this;
  }

  public A addToPorts(io.kubernetes.client.openapi.models.V1ServicePort... items) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ServicePortBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ServicePort item : items) {
      io.kubernetes.client.openapi.models.V1ServicePortBuilder builder =
          new io.kubernetes.client.openapi.models.V1ServicePortBuilder(item);
      _visitables.get("ports").add(builder);
      this.ports.add(builder);
    }
    return (A) this;
  }

  public A addAllToPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ServicePort> items) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ServicePortBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ServicePort item : items) {
      io.kubernetes.client.openapi.models.V1ServicePortBuilder builder =
          new io.kubernetes.client.openapi.models.V1ServicePortBuilder(item);
      _visitables.get("ports").add(builder);
      this.ports.add(builder);
    }
    return (A) this;
  }

  public A removeFromPorts(io.kubernetes.client.openapi.models.V1ServicePort... items) {
    for (io.kubernetes.client.openapi.models.V1ServicePort item : items) {
      io.kubernetes.client.openapi.models.V1ServicePortBuilder builder =
          new io.kubernetes.client.openapi.models.V1ServicePortBuilder(item);
      _visitables.get("ports").remove(builder);
      if (this.ports != null) {
        this.ports.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ServicePort> items) {
    for (io.kubernetes.client.openapi.models.V1ServicePort item : items) {
      io.kubernetes.client.openapi.models.V1ServicePortBuilder builder =
          new io.kubernetes.client.openapi.models.V1ServicePortBuilder(item);
      _visitables.get("ports").remove(builder);
      if (this.ports != null) {
        this.ports.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromPorts(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ServicePortBuilder>
          predicate) {
    if (ports == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1ServicePortBuilder> each =
        ports.iterator();
    final List visitables = _visitables.get("ports");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1ServicePortBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildPorts instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ServicePort> getPorts() {
    return ports != null ? build(ports) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1ServicePort> buildPorts() {
    return ports != null ? build(ports) : null;
  }

  public io.kubernetes.client.openapi.models.V1ServicePort buildPort(java.lang.Integer index) {
    return this.ports.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1ServicePort buildFirstPort() {
    return this.ports.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1ServicePort buildLastPort() {
    return this.ports.get(ports.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1ServicePort buildMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ServicePortBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ServicePortBuilder item : ports) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ServicePortBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ServicePortBuilder item : ports) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withPorts(java.util.List<io.kubernetes.client.openapi.models.V1ServicePort> ports) {
    if (this.ports != null) {
      _visitables.get("ports").removeAll(this.ports);
    }
    if (ports != null) {
      this.ports = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1ServicePort item : ports) {
        this.addToPorts(item);
      }
    } else {
      this.ports = null;
    }
    return (A) this;
  }

  public A withPorts(io.kubernetes.client.openapi.models.V1ServicePort... ports) {
    if (this.ports != null) {
      this.ports.clear();
    }
    if (ports != null) {
      for (io.kubernetes.client.openapi.models.V1ServicePort item : ports) {
        this.addToPorts(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasPorts() {
    return ports != null && !ports.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.PortsNested<A> addNewPort() {
    return new io.kubernetes.client.openapi.models.V1ServiceSpecFluentImpl.PortsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.PortsNested<A> addNewPortLike(
      io.kubernetes.client.openapi.models.V1ServicePort item) {
    return new io.kubernetes.client.openapi.models.V1ServiceSpecFluentImpl.PortsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.PortsNested<A> setNewPortLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ServicePort item) {
    return new io.kubernetes.client.openapi.models.V1ServiceSpecFluentImpl.PortsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.PortsNested<A> editPort(
      java.lang.Integer index) {
    if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
    return setNewPortLike(index, buildPort(index));
  }

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.PortsNested<A> editFirstPort() {
    if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
    return setNewPortLike(0, buildPort(0));
  }

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.PortsNested<A> editLastPort() {
    int index = ports.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
    return setNewPortLike(index, buildPort(index));
  }

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.PortsNested<A> editMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ServicePortBuilder>
          predicate) {
    int index = -1;
    for (int i = 0; i < ports.size(); i++) {
      if (predicate.test(ports.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching ports. No match found.");
    return setNewPortLike(index, buildPort(index));
  }

  public java.lang.Boolean getPublishNotReadyAddresses() {
    return this.publishNotReadyAddresses;
  }

  public A withPublishNotReadyAddresses(java.lang.Boolean publishNotReadyAddresses) {
    this.publishNotReadyAddresses = publishNotReadyAddresses;
    return (A) this;
  }

  public java.lang.Boolean hasPublishNotReadyAddresses() {
    return this.publishNotReadyAddresses != null;
  }

  public A addToSelector(java.lang.String key, java.lang.String value) {
    if (this.selector == null && key != null && value != null) {
      this.selector = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.selector.put(key, value);
    }
    return (A) this;
  }

  public A addToSelector(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.selector == null && map != null) {
      this.selector = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.selector.putAll(map);
    }
    return (A) this;
  }

  public A removeFromSelector(java.lang.String key) {
    if (this.selector == null) {
      return (A) this;
    }
    if (key != null && this.selector != null) {
      this.selector.remove(key);
    }
    return (A) this;
  }

  public A removeFromSelector(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.selector == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.selector != null) {
          this.selector.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, java.lang.String> getSelector() {
    return this.selector;
  }

  public <K, V> A withSelector(java.util.Map<java.lang.String, java.lang.String> selector) {
    if (selector == null) {
      this.selector = null;
    } else {
      this.selector = new java.util.LinkedHashMap(selector);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSelector() {
    return this.selector != null;
  }

  public io.kubernetes.client.openapi.models.V1ServiceSpec.SessionAffinityEnum
      getSessionAffinity() {
    return this.sessionAffinity;
  }

  public A withSessionAffinity(
      io.kubernetes.client.openapi.models.V1ServiceSpec.SessionAffinityEnum sessionAffinity) {
    this.sessionAffinity = sessionAffinity;
    return (A) this;
  }

  public java.lang.Boolean hasSessionAffinity() {
    return this.sessionAffinity != null;
  }

  /**
   * This method has been deprecated, please use method buildSessionAffinityConfig instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SessionAffinityConfig getSessionAffinityConfig() {
    return this.sessionAffinityConfig != null ? this.sessionAffinityConfig.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1SessionAffinityConfig buildSessionAffinityConfig() {
    return this.sessionAffinityConfig != null ? this.sessionAffinityConfig.build() : null;
  }

  public A withSessionAffinityConfig(
      io.kubernetes.client.openapi.models.V1SessionAffinityConfig sessionAffinityConfig) {
    _visitables.get("sessionAffinityConfig").remove(this.sessionAffinityConfig);
    if (sessionAffinityConfig != null) {
      this.sessionAffinityConfig =
          new io.kubernetes.client.openapi.models.V1SessionAffinityConfigBuilder(
              sessionAffinityConfig);
      _visitables.get("sessionAffinityConfig").add(this.sessionAffinityConfig);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSessionAffinityConfig() {
    return this.sessionAffinityConfig != null;
  }

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.SessionAffinityConfigNested<A>
      withNewSessionAffinityConfig() {
    return new io.kubernetes.client.openapi.models.V1ServiceSpecFluentImpl
        .SessionAffinityConfigNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.SessionAffinityConfigNested<A>
      withNewSessionAffinityConfigLike(
          io.kubernetes.client.openapi.models.V1SessionAffinityConfig item) {
    return new io.kubernetes.client.openapi.models.V1ServiceSpecFluentImpl
        .SessionAffinityConfigNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.SessionAffinityConfigNested<A>
      editSessionAffinityConfig() {
    return withNewSessionAffinityConfigLike(getSessionAffinityConfig());
  }

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.SessionAffinityConfigNested<A>
      editOrNewSessionAffinityConfig() {
    return withNewSessionAffinityConfigLike(
        getSessionAffinityConfig() != null
            ? getSessionAffinityConfig()
            : new io.kubernetes.client.openapi.models.V1SessionAffinityConfigBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.SessionAffinityConfigNested<A>
      editOrNewSessionAffinityConfigLike(
          io.kubernetes.client.openapi.models.V1SessionAffinityConfig item) {
    return withNewSessionAffinityConfigLike(
        getSessionAffinityConfig() != null ? getSessionAffinityConfig() : item);
  }

  public io.kubernetes.client.openapi.models.V1ServiceSpec.TypeEnum getType() {
    return this.type;
  }

  public A withType(io.kubernetes.client.openapi.models.V1ServiceSpec.TypeEnum type) {
    this.type = type;
    return (A) this;
  }

  public java.lang.Boolean hasType() {
    return this.type != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ServiceSpecFluentImpl that = (V1ServiceSpecFluentImpl) o;
    if (allocateLoadBalancerNodePorts != null
        ? !allocateLoadBalancerNodePorts.equals(that.allocateLoadBalancerNodePorts)
        : that.allocateLoadBalancerNodePorts != null) return false;
    if (clusterIP != null ? !clusterIP.equals(that.clusterIP) : that.clusterIP != null)
      return false;
    if (clusterIPs != null ? !clusterIPs.equals(that.clusterIPs) : that.clusterIPs != null)
      return false;
    if (externalIPs != null ? !externalIPs.equals(that.externalIPs) : that.externalIPs != null)
      return false;
    if (externalName != null ? !externalName.equals(that.externalName) : that.externalName != null)
      return false;
    if (externalTrafficPolicy != null
        ? !externalTrafficPolicy.equals(that.externalTrafficPolicy)
        : that.externalTrafficPolicy != null) return false;
    if (healthCheckNodePort != null
        ? !healthCheckNodePort.equals(that.healthCheckNodePort)
        : that.healthCheckNodePort != null) return false;
    if (internalTrafficPolicy != null
        ? !internalTrafficPolicy.equals(that.internalTrafficPolicy)
        : that.internalTrafficPolicy != null) return false;
    if (ipFamilies != null ? !ipFamilies.equals(that.ipFamilies) : that.ipFamilies != null)
      return false;
    if (ipFamilyPolicy != null
        ? !ipFamilyPolicy.equals(that.ipFamilyPolicy)
        : that.ipFamilyPolicy != null) return false;
    if (loadBalancerClass != null
        ? !loadBalancerClass.equals(that.loadBalancerClass)
        : that.loadBalancerClass != null) return false;
    if (loadBalancerIP != null
        ? !loadBalancerIP.equals(that.loadBalancerIP)
        : that.loadBalancerIP != null) return false;
    if (loadBalancerSourceRanges != null
        ? !loadBalancerSourceRanges.equals(that.loadBalancerSourceRanges)
        : that.loadBalancerSourceRanges != null) return false;
    if (ports != null ? !ports.equals(that.ports) : that.ports != null) return false;
    if (publishNotReadyAddresses != null
        ? !publishNotReadyAddresses.equals(that.publishNotReadyAddresses)
        : that.publishNotReadyAddresses != null) return false;
    if (selector != null ? !selector.equals(that.selector) : that.selector != null) return false;
    if (sessionAffinity != null
        ? !sessionAffinity.equals(that.sessionAffinity)
        : that.sessionAffinity != null) return false;
    if (sessionAffinityConfig != null
        ? !sessionAffinityConfig.equals(that.sessionAffinityConfig)
        : that.sessionAffinityConfig != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        allocateLoadBalancerNodePorts,
        clusterIP,
        clusterIPs,
        externalIPs,
        externalName,
        externalTrafficPolicy,
        healthCheckNodePort,
        internalTrafficPolicy,
        ipFamilies,
        ipFamilyPolicy,
        loadBalancerClass,
        loadBalancerIP,
        loadBalancerSourceRanges,
        ports,
        publishNotReadyAddresses,
        selector,
        sessionAffinity,
        sessionAffinityConfig,
        type,
        super.hashCode());
  }

  public class PortsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ServicePortFluentImpl<
          io.kubernetes.client.openapi.models.V1ServiceSpecFluent.PortsNested<N>>
      implements io.kubernetes.client.openapi.models.V1ServiceSpecFluent.PortsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PortsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1ServicePort item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1ServicePortBuilder(this, item);
    }

    PortsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1ServicePortBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ServicePortBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1ServiceSpecFluentImpl.this.setToPorts(index, builder.build());
    }

    public N endPort() {
      return and();
    }
  }

  public class SessionAffinityConfigNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluentImpl<
          io.kubernetes.client.openapi.models.V1ServiceSpecFluent.SessionAffinityConfigNested<N>>
      implements io.kubernetes.client.openapi.models.V1ServiceSpecFluent
                  .SessionAffinityConfigNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    SessionAffinityConfigNestedImpl(
        io.kubernetes.client.openapi.models.V1SessionAffinityConfig item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1SessionAffinityConfigBuilder(this, item);
    }

    SessionAffinityConfigNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1SessionAffinityConfigBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1SessionAffinityConfigBuilder builder;

    public N and() {
      return (N) V1ServiceSpecFluentImpl.this.withSessionAffinityConfig(builder.build());
    }

    public N endSessionAffinityConfig() {
      return and();
    }
  }
}
