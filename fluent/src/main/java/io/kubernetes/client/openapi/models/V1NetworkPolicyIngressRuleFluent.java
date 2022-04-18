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
import java.util.function.Predicate;

/** Generated */
public interface V1NetworkPolicyIngressRuleFluent<A extends V1NetworkPolicyIngressRuleFluent<A>>
    extends Fluent<A> {
  public A addToFrom(Integer index, V1NetworkPolicyPeer item);

  public A setToFrom(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item);

  public A addToFrom(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... items);

  public A addAllToFrom(Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> items);

  public A removeFromFrom(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... items);

  public A removeAllFromFrom(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> items);

  public A removeMatchingFromFrom(Predicate<V1NetworkPolicyPeerBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildFrom instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> getFrom();

  public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> buildFrom();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildFrom(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildFirstFrom();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildLastFrom();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildMatchingFrom(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>
          predicate);

  public Boolean hasMatchingFrom(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>
          predicate);

  public A withFrom(java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> from);

  public A withFrom(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... from);

  public java.lang.Boolean hasFrom();

  public V1NetworkPolicyIngressRuleFluent.FromNested<A> addNewFrom();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A>
      addNewFromLike(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item);

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A>
      setNewFromLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item);

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A>
      editFrom(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A>
      editFirstFrom();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A>
      editLastFrom();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A>
      editMatchingFrom(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>
              predicate);

  public A addToPorts(java.lang.Integer index, V1NetworkPolicyPort item);

  public A setToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPort item);

  public A addToPorts(io.kubernetes.client.openapi.models.V1NetworkPolicyPort... items);

  public A addAllToPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyPort> items);

  public A removeFromPorts(io.kubernetes.client.openapi.models.V1NetworkPolicyPort... items);

  public A removeAllFromPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyPort> items);

  public A removeMatchingFromPorts(
      java.util.function.Predicate<V1NetworkPolicyPortBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildPorts instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPort> getPorts();

  public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPort> buildPorts();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPort buildPort(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPort buildFirstPort();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPort buildLastPort();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPort buildMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder>
          predicate);

  public java.lang.Boolean hasMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder>
          predicate);

  public A withPorts(java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPort> ports);

  public A withPorts(io.kubernetes.client.openapi.models.V1NetworkPolicyPort... ports);

  public java.lang.Boolean hasPorts();

  public V1NetworkPolicyIngressRuleFluent.PortsNested<A> addNewPort();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A>
      addNewPortLike(io.kubernetes.client.openapi.models.V1NetworkPolicyPort item);

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A>
      setNewPortLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPort item);

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A>
      editPort(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A>
      editFirstPort();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A>
      editLastPort();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A>
      editMatchingPort(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder>
              predicate);

  public interface FromNested<N>
      extends Nested<N>, V1NetworkPolicyPeerFluent<V1NetworkPolicyIngressRuleFluent.FromNested<N>> {
    public N and();

    public N endFrom();
  }

  public interface PortsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1NetworkPolicyPortFluent<V1NetworkPolicyIngressRuleFluent.PortsNested<N>> {
    public N and();

    public N endPort();
  }
}
