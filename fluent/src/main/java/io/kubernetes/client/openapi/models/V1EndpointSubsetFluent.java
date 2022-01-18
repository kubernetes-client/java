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
public interface V1EndpointSubsetFluent<
        A extends io.kubernetes.client.openapi.models.V1EndpointSubsetFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToAddresses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointAddress item);

  public A setToAddresses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointAddress item);

  public A addToAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... items);

  public A addAllToAddresses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointAddress> items);

  public A removeFromAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... items);

  public A removeAllFromAddresses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointAddress> items);

  public A removeMatchingFromAddresses(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildAddresses instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1EndpointAddress> getAddresses();

  public java.util.List<io.kubernetes.client.openapi.models.V1EndpointAddress> buildAddresses();

  public io.kubernetes.client.openapi.models.V1EndpointAddress buildAddress(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1EndpointAddress buildFirstAddress();

  public io.kubernetes.client.openapi.models.V1EndpointAddress buildLastAddress();

  public io.kubernetes.client.openapi.models.V1EndpointAddress buildMatchingAddress(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>
          predicate);

  public java.lang.Boolean hasMatchingAddress(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>
          predicate);

  public A withAddresses(
      java.util.List<io.kubernetes.client.openapi.models.V1EndpointAddress> addresses);

  public A withAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... addresses);

  public java.lang.Boolean hasAddresses();

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A>
      addNewAddress();

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A>
      addNewAddressLike(io.kubernetes.client.openapi.models.V1EndpointAddress item);

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A>
      setNewAddressLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointAddress item);

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A> editAddress(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A>
      editFirstAddress();

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A>
      editLastAddress();

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A>
      editMatchingAddress(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>
              predicate);

  public A addToNotReadyAddresses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointAddress item);

  public A setToNotReadyAddresses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointAddress item);

  public A addToNotReadyAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... items);

  public A addAllToNotReadyAddresses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointAddress> items);

  public A removeFromNotReadyAddresses(
      io.kubernetes.client.openapi.models.V1EndpointAddress... items);

  public A removeAllFromNotReadyAddresses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointAddress> items);

  public A removeMatchingFromNotReadyAddresses(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildNotReadyAddresses instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1EndpointAddress>
      getNotReadyAddresses();

  public java.util.List<io.kubernetes.client.openapi.models.V1EndpointAddress>
      buildNotReadyAddresses();

  public io.kubernetes.client.openapi.models.V1EndpointAddress buildNotReadyAddress(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1EndpointAddress buildFirstNotReadyAddress();

  public io.kubernetes.client.openapi.models.V1EndpointAddress buildLastNotReadyAddress();

  public io.kubernetes.client.openapi.models.V1EndpointAddress buildMatchingNotReadyAddress(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>
          predicate);

  public java.lang.Boolean hasMatchingNotReadyAddress(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>
          predicate);

  public A withNotReadyAddresses(
      java.util.List<io.kubernetes.client.openapi.models.V1EndpointAddress> notReadyAddresses);

  public A withNotReadyAddresses(
      io.kubernetes.client.openapi.models.V1EndpointAddress... notReadyAddresses);

  public java.lang.Boolean hasNotReadyAddresses();

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A>
      addNewNotReadyAddress();

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A>
      addNewNotReadyAddressLike(io.kubernetes.client.openapi.models.V1EndpointAddress item);

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A>
      setNewNotReadyAddressLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointAddress item);

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A>
      editNotReadyAddress(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A>
      editFirstNotReadyAddress();

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A>
      editLastNotReadyAddress();

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A>
      editMatchingNotReadyAddress(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>
              predicate);

  public A addToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.CoreV1EndpointPort item);

  public A setToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.CoreV1EndpointPort item);

  public A addToPorts(io.kubernetes.client.openapi.models.CoreV1EndpointPort... items);

  public A addAllToPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.CoreV1EndpointPort> items);

  public A removeFromPorts(io.kubernetes.client.openapi.models.CoreV1EndpointPort... items);

  public A removeAllFromPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.CoreV1EndpointPort> items);

  public A removeMatchingFromPorts(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildPorts instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.CoreV1EndpointPort> getPorts();

  public java.util.List<io.kubernetes.client.openapi.models.CoreV1EndpointPort> buildPorts();

  public io.kubernetes.client.openapi.models.CoreV1EndpointPort buildPort(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.CoreV1EndpointPort buildFirstPort();

  public io.kubernetes.client.openapi.models.CoreV1EndpointPort buildLastPort();

  public io.kubernetes.client.openapi.models.CoreV1EndpointPort buildMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder>
          predicate);

  public java.lang.Boolean hasMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder>
          predicate);

  public A withPorts(java.util.List<io.kubernetes.client.openapi.models.CoreV1EndpointPort> ports);

  public A withPorts(io.kubernetes.client.openapi.models.CoreV1EndpointPort... ports);

  public java.lang.Boolean hasPorts();

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> addNewPort();

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> addNewPortLike(
      io.kubernetes.client.openapi.models.CoreV1EndpointPort item);

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> setNewPortLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.CoreV1EndpointPort item);

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> editPort(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> editFirstPort();

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> editLastPort();

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> editMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder>
          predicate);

  public interface AddressesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1EndpointAddressFluent<
              io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<N>> {
    public N and();

    public N endAddress();
  }

  public interface NotReadyAddressesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1EndpointAddressFluent<
              io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<
                  N>> {
    public N and();

    public N endNotReadyAddress();
  }

  public interface PortsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.CoreV1EndpointPortFluent<
              io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<N>> {
    public N and();

    public N endPort();
  }
}
