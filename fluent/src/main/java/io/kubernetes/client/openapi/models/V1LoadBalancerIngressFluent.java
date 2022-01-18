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
public interface V1LoadBalancerIngressFluent<
        A extends io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getHostname();

  public A withHostname(java.lang.String hostname);

  public java.lang.Boolean hasHostname();

  /** Method is deprecated. use withHostname instead. */
  @java.lang.Deprecated
  public A withNewHostname(java.lang.String original);

  public java.lang.String getIp();

  public A withIp(java.lang.String ip);

  public java.lang.Boolean hasIp();

  /** Method is deprecated. use withIp instead. */
  @java.lang.Deprecated
  public A withNewIp(java.lang.String original);

  public A addToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PortStatus item);

  public A setToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PortStatus item);

  public A addToPorts(io.kubernetes.client.openapi.models.V1PortStatus... items);

  public A addAllToPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PortStatus> items);

  public A removeFromPorts(io.kubernetes.client.openapi.models.V1PortStatus... items);

  public A removeAllFromPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PortStatus> items);

  public A removeMatchingFromPorts(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PortStatusBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildPorts instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1PortStatus> getPorts();

  public java.util.List<io.kubernetes.client.openapi.models.V1PortStatus> buildPorts();

  public io.kubernetes.client.openapi.models.V1PortStatus buildPort(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PortStatus buildFirstPort();

  public io.kubernetes.client.openapi.models.V1PortStatus buildLastPort();

  public io.kubernetes.client.openapi.models.V1PortStatus buildMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PortStatusBuilder>
          predicate);

  public java.lang.Boolean hasMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PortStatusBuilder>
          predicate);

  public A withPorts(java.util.List<io.kubernetes.client.openapi.models.V1PortStatus> ports);

  public A withPorts(io.kubernetes.client.openapi.models.V1PortStatus... ports);

  public java.lang.Boolean hasPorts();

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A>
      addNewPort();

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A>
      addNewPortLike(io.kubernetes.client.openapi.models.V1PortStatus item);

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A>
      setNewPortLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1PortStatus item);

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A> editPort(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A>
      editFirstPort();

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A>
      editLastPort();

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A>
      editMatchingPort(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PortStatusBuilder>
              predicate);

  public interface PortsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1PortStatusFluent<
              io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<N>> {
    public N and();

    public N endPort();
  }
}
