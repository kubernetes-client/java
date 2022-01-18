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
public interface V1APIGroupFluent<A extends io.kubernetes.client.openapi.models.V1APIGroupFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public java.lang.Boolean hasApiVersion();

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original);

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original);

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildPreferredVersion instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery getPreferredVersion();

  public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildPreferredVersion();

  public A withPreferredVersion(
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery preferredVersion);

  public java.lang.Boolean hasPreferredVersion();

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<A>
      withNewPreferredVersion();

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<A>
      withNewPreferredVersionLike(
          io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item);

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<A>
      editPreferredVersion();

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<A>
      editOrNewPreferredVersion();

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<A>
      editOrNewPreferredVersionLike(
          io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item);

  public A addToServerAddressByClientCIDRs(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item);

  public A setToServerAddressByClientCIDRs(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item);

  public A addToServerAddressByClientCIDRs(
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR... items);

  public A addAllToServerAddressByClientCIDRs(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR> items);

  public A removeFromServerAddressByClientCIDRs(
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR... items);

  public A removeAllFromServerAddressByClientCIDRs(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR> items);

  public A removeMatchingFromServerAddressByClientCIDRs(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildServerAddressByClientCIDRs instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR>
      getServerAddressByClientCIDRs();

  public java.util.List<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR>
      buildServerAddressByClientCIDRs();

  public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR
      buildServerAddressByClientCIDR(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR
      buildFirstServerAddressByClientCIDR();

  public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR
      buildLastServerAddressByClientCIDR();

  public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR
      buildMatchingServerAddressByClientCIDR(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder>
              predicate);

  public java.lang.Boolean hasMatchingServerAddressByClientCIDR(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder>
          predicate);

  public A withServerAddressByClientCIDRs(
      java.util.List<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR>
          serverAddressByClientCIDRs);

  public A withServerAddressByClientCIDRs(
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR...
          serverAddressByClientCIDRs);

  public java.lang.Boolean hasServerAddressByClientCIDRs();

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A>
      addNewServerAddressByClientCIDR();

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A>
      addNewServerAddressByClientCIDRLike(
          io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item);

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A>
      setNewServerAddressByClientCIDRLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item);

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A>
      editServerAddressByClientCIDR(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A>
      editFirstServerAddressByClientCIDR();

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A>
      editLastServerAddressByClientCIDR();

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A>
      editMatchingServerAddressByClientCIDR(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder>
              predicate);

  public A addToVersions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item);

  public A setToVersions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item);

  public A addToVersions(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery... items);

  public A addAllToVersions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery> items);

  public A removeFromVersions(
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery... items);

  public A removeAllFromVersions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery> items);

  public A removeMatchingFromVersions(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildVersions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery>
      getVersions();

  public java.util.List<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery>
      buildVersions();

  public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildVersion(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildFirstVersion();

  public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildLastVersion();

  public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildMatchingVersion(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder>
          predicate);

  public java.lang.Boolean hasMatchingVersion(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder>
          predicate);

  public A withVersions(
      java.util.List<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery> versions);

  public A withVersions(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery... versions);

  public java.lang.Boolean hasVersions();

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> addNewVersion();

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> addNewVersionLike(
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item);

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> setNewVersionLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item);

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> editVersion(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> editFirstVersion();

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> editLastVersion();

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> editMatchingVersion(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder>
          predicate);

  public interface PreferredVersionNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryFluent<
              io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<N>> {
    public N and();

    public N endPreferredVersion();
  }

  public interface ServerAddressByClientCIDRsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRFluent<
              io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<
                  N>> {
    public N and();

    public N endServerAddressByClientCIDR();
  }

  public interface VersionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryFluent<
              io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<N>> {
    public N and();

    public N endVersion();
  }
}
