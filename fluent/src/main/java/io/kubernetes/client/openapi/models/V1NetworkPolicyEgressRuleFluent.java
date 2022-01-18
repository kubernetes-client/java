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

/** Generated */
public interface V1NetworkPolicyEgressRuleFluent<
        A extends io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPort item);

  public A setToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPort item);

  public A addToPorts(io.kubernetes.client.openapi.models.V1NetworkPolicyPort... items);

  public A addAllToPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyPort> items);

  public A removeFromPorts(io.kubernetes.client.openapi.models.V1NetworkPolicyPort... items);

  public A removeAllFromPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyPort> items);

  public A removeMatchingFromPorts(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder>
          predicate);

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

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.PortsNested<A>
      addNewPort();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.PortsNested<A>
      addNewPortLike(io.kubernetes.client.openapi.models.V1NetworkPolicyPort item);

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.PortsNested<A>
      setNewPortLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPort item);

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.PortsNested<A>
      editPort(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.PortsNested<A>
      editFirstPort();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.PortsNested<A>
      editLastPort();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.PortsNested<A>
      editMatchingPort(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder>
              predicate);

  public A addToTo(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item);

  public A setToTo(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item);

  public A addToTo(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... items);

  public A addAllToTo(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> items);

  public A removeFromTo(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... items);

  public A removeAllFromTo(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> items);

  public A removeMatchingFromTo(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildTo instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> getTo();

  public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> buildTo();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildTo(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildFirstTo();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildLastTo();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildMatchingTo(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>
          predicate);

  public java.lang.Boolean hasMatchingTo(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>
          predicate);

  public A withTo(java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> to);

  public A withTo(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... to);

  public java.lang.Boolean hasTo();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.ToNested<A> addNewTo();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.ToNested<A>
      addNewToLike(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item);

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.ToNested<A>
      setNewToLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item);

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.ToNested<A> editTo(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.ToNested<A>
      editFirstTo();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.ToNested<A>
      editLastTo();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.ToNested<A>
      editMatchingTo(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>
              predicate);

  public interface PortsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1NetworkPolicyPortFluent<
              io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.PortsNested<N>> {
    public N and();

    public N endPort();
  }

  public interface ToNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent<
              io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.ToNested<N>> {
    public N and();

    public N endTo();
  }
}
