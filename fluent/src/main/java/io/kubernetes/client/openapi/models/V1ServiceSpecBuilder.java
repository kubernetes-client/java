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

public class V1ServiceSpecBuilder
    extends io.kubernetes.client.openapi.models.V1ServiceSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1ServiceSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ServiceSpec,
        io.kubernetes.client.openapi.models.V1ServiceSpecBuilder> {
  public V1ServiceSpecBuilder() {
    this(false);
  }

  public V1ServiceSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ServiceSpec(), validationEnabled);
  }

  public V1ServiceSpecBuilder(io.kubernetes.client.openapi.models.V1ServiceSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ServiceSpecBuilder(
      io.kubernetes.client.openapi.models.V1ServiceSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ServiceSpec(), validationEnabled);
  }

  public V1ServiceSpecBuilder(
      io.kubernetes.client.openapi.models.V1ServiceSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ServiceSpec instance) {
    this(fluent, instance, false);
  }

  public V1ServiceSpecBuilder(
      io.kubernetes.client.openapi.models.V1ServiceSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ServiceSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAllocateLoadBalancerNodePorts(instance.getAllocateLoadBalancerNodePorts());

    fluent.withClusterIP(instance.getClusterIP());

    fluent.withClusterIPs(instance.getClusterIPs());

    fluent.withExternalIPs(instance.getExternalIPs());

    fluent.withExternalName(instance.getExternalName());

    fluent.withExternalTrafficPolicy(instance.getExternalTrafficPolicy());

    fluent.withHealthCheckNodePort(instance.getHealthCheckNodePort());

    fluent.withInternalTrafficPolicy(instance.getInternalTrafficPolicy());

    fluent.withIpFamilies(instance.getIpFamilies());

    fluent.withIpFamilyPolicy(instance.getIpFamilyPolicy());

    fluent.withLoadBalancerClass(instance.getLoadBalancerClass());

    fluent.withLoadBalancerIP(instance.getLoadBalancerIP());

    fluent.withLoadBalancerSourceRanges(instance.getLoadBalancerSourceRanges());

    fluent.withPorts(instance.getPorts());

    fluent.withPublishNotReadyAddresses(instance.getPublishNotReadyAddresses());

    fluent.withSelector(instance.getSelector());

    fluent.withSessionAffinity(instance.getSessionAffinity());

    fluent.withSessionAffinityConfig(instance.getSessionAffinityConfig());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1ServiceSpecBuilder(io.kubernetes.client.openapi.models.V1ServiceSpec instance) {
    this(instance, false);
  }

  public V1ServiceSpecBuilder(
      io.kubernetes.client.openapi.models.V1ServiceSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
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

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ServiceSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ServiceSpec build() {
    V1ServiceSpec buildable = new V1ServiceSpec();
    buildable.setAllocateLoadBalancerNodePorts(fluent.getAllocateLoadBalancerNodePorts());
    buildable.setClusterIP(fluent.getClusterIP());
    buildable.setClusterIPs(fluent.getClusterIPs());
    buildable.setExternalIPs(fluent.getExternalIPs());
    buildable.setExternalName(fluent.getExternalName());
    buildable.setExternalTrafficPolicy(fluent.getExternalTrafficPolicy());
    buildable.setHealthCheckNodePort(fluent.getHealthCheckNodePort());
    buildable.setInternalTrafficPolicy(fluent.getInternalTrafficPolicy());
    buildable.setIpFamilies(fluent.getIpFamilies());
    buildable.setIpFamilyPolicy(fluent.getIpFamilyPolicy());
    buildable.setLoadBalancerClass(fluent.getLoadBalancerClass());
    buildable.setLoadBalancerIP(fluent.getLoadBalancerIP());
    buildable.setLoadBalancerSourceRanges(fluent.getLoadBalancerSourceRanges());
    buildable.setPorts(fluent.getPorts());
    buildable.setPublishNotReadyAddresses(fluent.getPublishNotReadyAddresses());
    buildable.setSelector(fluent.getSelector());
    buildable.setSessionAffinity(fluent.getSessionAffinity());
    buildable.setSessionAffinityConfig(fluent.getSessionAffinityConfig());
    buildable.setType(fluent.getType());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ServiceSpecBuilder that = (V1ServiceSpecBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
