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

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/** Generated */
public interface V1ServiceSpecFluent<A extends V1ServiceSpecFluent<A>> extends Fluent<A> {
  public Boolean getAllocateLoadBalancerNodePorts();

  public A withAllocateLoadBalancerNodePorts(java.lang.Boolean allocateLoadBalancerNodePorts);

  public java.lang.Boolean hasAllocateLoadBalancerNodePorts();

  public String getClusterIP();

  public A withClusterIP(java.lang.String clusterIP);

  public java.lang.Boolean hasClusterIP();

  public A addToClusterIPs(Integer index, java.lang.String item);

  public A setToClusterIPs(java.lang.Integer index, java.lang.String item);

  public A addToClusterIPs(java.lang.String... items);

  public A addAllToClusterIPs(Collection<java.lang.String> items);

  public A removeFromClusterIPs(java.lang.String... items);

  public A removeAllFromClusterIPs(java.util.Collection<java.lang.String> items);

  public List<java.lang.String> getClusterIPs();

  public java.lang.String getClusterIP(java.lang.Integer index);

  public java.lang.String getFirstClusterIP();

  public java.lang.String getLastClusterIP();

  public java.lang.String getMatchingClusterIP(Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingClusterIP(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withClusterIPs(java.util.List<java.lang.String> clusterIPs);

  public A withClusterIPs(java.lang.String... clusterIPs);

  public java.lang.Boolean hasClusterIPs();

  public A addToExternalIPs(java.lang.Integer index, java.lang.String item);

  public A setToExternalIPs(java.lang.Integer index, java.lang.String item);

  public A addToExternalIPs(java.lang.String... items);

  public A addAllToExternalIPs(java.util.Collection<java.lang.String> items);

  public A removeFromExternalIPs(java.lang.String... items);

  public A removeAllFromExternalIPs(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getExternalIPs();

  public java.lang.String getExternalIP(java.lang.Integer index);

  public java.lang.String getFirstExternalIP();

  public java.lang.String getLastExternalIP();

  public java.lang.String getMatchingExternalIP(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingExternalIP(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withExternalIPs(java.util.List<java.lang.String> externalIPs);

  public A withExternalIPs(java.lang.String... externalIPs);

  public java.lang.Boolean hasExternalIPs();

  public java.lang.String getExternalName();

  public A withExternalName(java.lang.String externalName);

  public java.lang.Boolean hasExternalName();

  public java.lang.String getExternalTrafficPolicy();

  public A withExternalTrafficPolicy(java.lang.String externalTrafficPolicy);

  public java.lang.Boolean hasExternalTrafficPolicy();

  public java.lang.Integer getHealthCheckNodePort();

  public A withHealthCheckNodePort(java.lang.Integer healthCheckNodePort);

  public java.lang.Boolean hasHealthCheckNodePort();

  public java.lang.String getInternalTrafficPolicy();

  public A withInternalTrafficPolicy(java.lang.String internalTrafficPolicy);

  public java.lang.Boolean hasInternalTrafficPolicy();

  public A addToIpFamilies(java.lang.Integer index, java.lang.String item);

  public A setToIpFamilies(java.lang.Integer index, java.lang.String item);

  public A addToIpFamilies(java.lang.String... items);

  public A addAllToIpFamilies(java.util.Collection<java.lang.String> items);

  public A removeFromIpFamilies(java.lang.String... items);

  public A removeAllFromIpFamilies(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getIpFamilies();

  public java.lang.String getIpFamily(java.lang.Integer index);

  public java.lang.String getFirstIpFamily();

  public java.lang.String getLastIpFamily();

  public java.lang.String getMatchingIpFamily(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingIpFamily(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withIpFamilies(java.util.List<java.lang.String> ipFamilies);

  public A withIpFamilies(java.lang.String... ipFamilies);

  public java.lang.Boolean hasIpFamilies();

  public java.lang.String getIpFamilyPolicy();

  public A withIpFamilyPolicy(java.lang.String ipFamilyPolicy);

  public java.lang.Boolean hasIpFamilyPolicy();

  public java.lang.String getLoadBalancerClass();

  public A withLoadBalancerClass(java.lang.String loadBalancerClass);

  public java.lang.Boolean hasLoadBalancerClass();

  public java.lang.String getLoadBalancerIP();

  public A withLoadBalancerIP(java.lang.String loadBalancerIP);

  public java.lang.Boolean hasLoadBalancerIP();

  public A addToLoadBalancerSourceRanges(java.lang.Integer index, java.lang.String item);

  public A setToLoadBalancerSourceRanges(java.lang.Integer index, java.lang.String item);

  public A addToLoadBalancerSourceRanges(java.lang.String... items);

  public A addAllToLoadBalancerSourceRanges(java.util.Collection<java.lang.String> items);

  public A removeFromLoadBalancerSourceRanges(java.lang.String... items);

  public A removeAllFromLoadBalancerSourceRanges(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getLoadBalancerSourceRanges();

  public java.lang.String getLoadBalancerSourceRange(java.lang.Integer index);

  public java.lang.String getFirstLoadBalancerSourceRange();

  public java.lang.String getLastLoadBalancerSourceRange();

  public java.lang.String getMatchingLoadBalancerSourceRange(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingLoadBalancerSourceRange(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withLoadBalancerSourceRanges(java.util.List<java.lang.String> loadBalancerSourceRanges);

  public A withLoadBalancerSourceRanges(java.lang.String... loadBalancerSourceRanges);

  public java.lang.Boolean hasLoadBalancerSourceRanges();

  public A addToPorts(java.lang.Integer index, V1ServicePort item);

  public A setToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ServicePort item);

  public A addToPorts(io.kubernetes.client.openapi.models.V1ServicePort... items);

  public A addAllToPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ServicePort> items);

  public A removeFromPorts(io.kubernetes.client.openapi.models.V1ServicePort... items);

  public A removeAllFromPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ServicePort> items);

  public A removeMatchingFromPorts(java.util.function.Predicate<V1ServicePortBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildPorts instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ServicePort> getPorts();

  public java.util.List<io.kubernetes.client.openapi.models.V1ServicePort> buildPorts();

  public io.kubernetes.client.openapi.models.V1ServicePort buildPort(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ServicePort buildFirstPort();

  public io.kubernetes.client.openapi.models.V1ServicePort buildLastPort();

  public io.kubernetes.client.openapi.models.V1ServicePort buildMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ServicePortBuilder>
          predicate);

  public java.lang.Boolean hasMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ServicePortBuilder>
          predicate);

  public A withPorts(java.util.List<io.kubernetes.client.openapi.models.V1ServicePort> ports);

  public A withPorts(io.kubernetes.client.openapi.models.V1ServicePort... ports);

  public java.lang.Boolean hasPorts();

  public V1ServiceSpecFluent.PortsNested<A> addNewPort();

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.PortsNested<A> addNewPortLike(
      io.kubernetes.client.openapi.models.V1ServicePort item);

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.PortsNested<A> setNewPortLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ServicePort item);

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.PortsNested<A> editPort(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.PortsNested<A> editFirstPort();

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.PortsNested<A> editLastPort();

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.PortsNested<A> editMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ServicePortBuilder>
          predicate);

  public java.lang.Boolean getPublishNotReadyAddresses();

  public A withPublishNotReadyAddresses(java.lang.Boolean publishNotReadyAddresses);

  public java.lang.Boolean hasPublishNotReadyAddresses();

  public A addToSelector(java.lang.String key, java.lang.String value);

  public A addToSelector(Map<java.lang.String, java.lang.String> map);

  public A removeFromSelector(java.lang.String key);

  public A removeFromSelector(java.util.Map<java.lang.String, java.lang.String> map);

  public java.util.Map<java.lang.String, java.lang.String> getSelector();

  public <K, V> A withSelector(java.util.Map<java.lang.String, java.lang.String> selector);

  public java.lang.Boolean hasSelector();

  public java.lang.String getSessionAffinity();

  public A withSessionAffinity(java.lang.String sessionAffinity);

  public java.lang.Boolean hasSessionAffinity();

  /**
   * This method has been deprecated, please use method buildSessionAffinityConfig instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1SessionAffinityConfig getSessionAffinityConfig();

  public io.kubernetes.client.openapi.models.V1SessionAffinityConfig buildSessionAffinityConfig();

  public A withSessionAffinityConfig(
      io.kubernetes.client.openapi.models.V1SessionAffinityConfig sessionAffinityConfig);

  public java.lang.Boolean hasSessionAffinityConfig();

  public V1ServiceSpecFluent.SessionAffinityConfigNested<A> withNewSessionAffinityConfig();

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.SessionAffinityConfigNested<A>
      withNewSessionAffinityConfigLike(
          io.kubernetes.client.openapi.models.V1SessionAffinityConfig item);

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.SessionAffinityConfigNested<A>
      editSessionAffinityConfig();

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.SessionAffinityConfigNested<A>
      editOrNewSessionAffinityConfig();

  public io.kubernetes.client.openapi.models.V1ServiceSpecFluent.SessionAffinityConfigNested<A>
      editOrNewSessionAffinityConfigLike(
          io.kubernetes.client.openapi.models.V1SessionAffinityConfig item);

  public java.lang.String getType();

  public A withType(java.lang.String type);

  public java.lang.Boolean hasType();

  public A withAllocateLoadBalancerNodePorts();

  public A withPublishNotReadyAddresses();

  public interface PortsNested<N>
      extends Nested<N>, V1ServicePortFluent<V1ServiceSpecFluent.PortsNested<N>> {
    public N and();

    public N endPort();
  }

  public interface SessionAffinityConfigNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1SessionAffinityConfigFluent<V1ServiceSpecFluent.SessionAffinityConfigNested<N>> {
    public N and();

    public N endSessionAffinityConfig();
  }
}
