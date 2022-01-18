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
public class V1APIGroupFluentImpl<A extends io.kubernetes.client.openapi.models.V1APIGroupFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1APIGroupFluent<A> {
  public V1APIGroupFluentImpl() {}

  public V1APIGroupFluentImpl(io.kubernetes.client.openapi.models.V1APIGroup instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withPreferredVersion(instance.getPreferredVersion());

    this.withServerAddressByClientCIDRs(instance.getServerAddressByClientCIDRs());

    this.withVersions(instance.getVersions());
  }

  private java.lang.String apiVersion;
  private java.lang.String kind;
  private java.lang.String name;
  private io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder preferredVersion;
  private java.util.ArrayList<
          io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder>
      serverAddressByClientCIDRs;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder>
      versions;

  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public java.lang.Boolean hasApiVersion() {
    return this.apiVersion != null;
  }

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original) {
    return (A) withApiVersion(new String(original));
  }

  public java.lang.String getKind() {
    return this.kind;
  }

  public A withKind(java.lang.String kind) {
    this.kind = kind;
    return (A) this;
  }

  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original) {
    return (A) withKind(new String(original));
  }

  public java.lang.String getName() {
    return this.name;
  }

  public A withName(java.lang.String name) {
    this.name = name;
    return (A) this;
  }

  public java.lang.Boolean hasName() {
    return this.name != null;
  }

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original) {
    return (A) withName(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildPreferredVersion instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery getPreferredVersion() {
    return this.preferredVersion != null ? this.preferredVersion.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildPreferredVersion() {
    return this.preferredVersion != null ? this.preferredVersion.build() : null;
  }

  public A withPreferredVersion(
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery preferredVersion) {
    _visitables.get("preferredVersion").remove(this.preferredVersion);
    if (preferredVersion != null) {
      this.preferredVersion =
          new io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder(
              preferredVersion);
      _visitables.get("preferredVersion").add(this.preferredVersion);
    }
    return (A) this;
  }

  public java.lang.Boolean hasPreferredVersion() {
    return this.preferredVersion != null;
  }

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<A>
      withNewPreferredVersion() {
    return new io.kubernetes.client.openapi.models.V1APIGroupFluentImpl
        .PreferredVersionNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<A>
      withNewPreferredVersionLike(
          io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item) {
    return new io.kubernetes.client.openapi.models.V1APIGroupFluentImpl.PreferredVersionNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<A>
      editPreferredVersion() {
    return withNewPreferredVersionLike(getPreferredVersion());
  }

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<A>
      editOrNewPreferredVersion() {
    return withNewPreferredVersionLike(
        getPreferredVersion() != null
            ? getPreferredVersion()
            : new io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<A>
      editOrNewPreferredVersionLike(
          io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item) {
    return withNewPreferredVersionLike(
        getPreferredVersion() != null ? getPreferredVersion() : item);
  }

  public A addToServerAddressByClientCIDRs(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item) {
    if (this.serverAddressByClientCIDRs == null) {
      this.serverAddressByClientCIDRs =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder builder =
        new io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder(item);
    _visitables
        .get("serverAddressByClientCIDRs")
        .add(index >= 0 ? index : _visitables.get("serverAddressByClientCIDRs").size(), builder);
    this.serverAddressByClientCIDRs.add(
        index >= 0 ? index : serverAddressByClientCIDRs.size(), builder);
    return (A) this;
  }

  public A setToServerAddressByClientCIDRs(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item) {
    if (this.serverAddressByClientCIDRs == null) {
      this.serverAddressByClientCIDRs =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder builder =
        new io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder(item);
    if (index < 0 || index >= _visitables.get("serverAddressByClientCIDRs").size()) {
      _visitables.get("serverAddressByClientCIDRs").add(builder);
    } else {
      _visitables.get("serverAddressByClientCIDRs").set(index, builder);
    }
    if (index < 0 || index >= serverAddressByClientCIDRs.size()) {
      serverAddressByClientCIDRs.add(builder);
    } else {
      serverAddressByClientCIDRs.set(index, builder);
    }
    return (A) this;
  }

  public A addToServerAddressByClientCIDRs(
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR... items) {
    if (this.serverAddressByClientCIDRs == null) {
      this.serverAddressByClientCIDRs =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item : items) {
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder builder =
          new io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder(item);
      _visitables.get("serverAddressByClientCIDRs").add(builder);
      this.serverAddressByClientCIDRs.add(builder);
    }
    return (A) this;
  }

  public A addAllToServerAddressByClientCIDRs(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR> items) {
    if (this.serverAddressByClientCIDRs == null) {
      this.serverAddressByClientCIDRs =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item : items) {
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder builder =
          new io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder(item);
      _visitables.get("serverAddressByClientCIDRs").add(builder);
      this.serverAddressByClientCIDRs.add(builder);
    }
    return (A) this;
  }

  public A removeFromServerAddressByClientCIDRs(
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR... items) {
    for (io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item : items) {
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder builder =
          new io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder(item);
      _visitables.get("serverAddressByClientCIDRs").remove(builder);
      if (this.serverAddressByClientCIDRs != null) {
        this.serverAddressByClientCIDRs.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromServerAddressByClientCIDRs(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR> items) {
    for (io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item : items) {
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder builder =
          new io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder(item);
      _visitables.get("serverAddressByClientCIDRs").remove(builder);
      if (this.serverAddressByClientCIDRs != null) {
        this.serverAddressByClientCIDRs.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromServerAddressByClientCIDRs(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder>
          predicate) {
    if (serverAddressByClientCIDRs == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder> each =
        serverAddressByClientCIDRs.iterator();
    final List visitables = _visitables.get("serverAddressByClientCIDRs");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildServerAddressByClientCIDRs instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR>
      getServerAddressByClientCIDRs() {
    return serverAddressByClientCIDRs != null ? build(serverAddressByClientCIDRs) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR>
      buildServerAddressByClientCIDRs() {
    return serverAddressByClientCIDRs != null ? build(serverAddressByClientCIDRs) : null;
  }

  public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR
      buildServerAddressByClientCIDR(java.lang.Integer index) {
    return this.serverAddressByClientCIDRs.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR
      buildFirstServerAddressByClientCIDR() {
    return this.serverAddressByClientCIDRs.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR
      buildLastServerAddressByClientCIDR() {
    return this.serverAddressByClientCIDRs.get(serverAddressByClientCIDRs.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR
      buildMatchingServerAddressByClientCIDR(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder>
              predicate) {
    for (io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder item :
        serverAddressByClientCIDRs) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingServerAddressByClientCIDR(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder item :
        serverAddressByClientCIDRs) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withServerAddressByClientCIDRs(
      java.util.List<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR>
          serverAddressByClientCIDRs) {
    if (this.serverAddressByClientCIDRs != null) {
      _visitables.get("serverAddressByClientCIDRs").removeAll(this.serverAddressByClientCIDRs);
    }
    if (serverAddressByClientCIDRs != null) {
      this.serverAddressByClientCIDRs = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item :
          serverAddressByClientCIDRs) {
        this.addToServerAddressByClientCIDRs(item);
      }
    } else {
      this.serverAddressByClientCIDRs = null;
    }
    return (A) this;
  }

  public A withServerAddressByClientCIDRs(
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR...
          serverAddressByClientCIDRs) {
    if (this.serverAddressByClientCIDRs != null) {
      this.serverAddressByClientCIDRs.clear();
    }
    if (serverAddressByClientCIDRs != null) {
      for (io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item :
          serverAddressByClientCIDRs) {
        this.addToServerAddressByClientCIDRs(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasServerAddressByClientCIDRs() {
    return serverAddressByClientCIDRs != null && !serverAddressByClientCIDRs.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A>
      addNewServerAddressByClientCIDR() {
    return new io.kubernetes.client.openapi.models.V1APIGroupFluentImpl
        .ServerAddressByClientCIDRsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A>
      addNewServerAddressByClientCIDRLike(
          io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item) {
    return new io.kubernetes.client.openapi.models.V1APIGroupFluentImpl
        .ServerAddressByClientCIDRsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A>
      setNewServerAddressByClientCIDRLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item) {
    return new io.kubernetes.client.openapi.models.V1APIGroupFluentImpl
        .ServerAddressByClientCIDRsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A>
      editServerAddressByClientCIDR(java.lang.Integer index) {
    if (serverAddressByClientCIDRs.size() <= index)
      throw new RuntimeException("Can't edit serverAddressByClientCIDRs. Index exceeds size.");
    return setNewServerAddressByClientCIDRLike(index, buildServerAddressByClientCIDR(index));
  }

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A>
      editFirstServerAddressByClientCIDR() {
    if (serverAddressByClientCIDRs.size() == 0)
      throw new RuntimeException("Can't edit first serverAddressByClientCIDRs. The list is empty.");
    return setNewServerAddressByClientCIDRLike(0, buildServerAddressByClientCIDR(0));
  }

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A>
      editLastServerAddressByClientCIDR() {
    int index = serverAddressByClientCIDRs.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last serverAddressByClientCIDRs. The list is empty.");
    return setNewServerAddressByClientCIDRLike(index, buildServerAddressByClientCIDR(index));
  }

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A>
      editMatchingServerAddressByClientCIDR(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < serverAddressByClientCIDRs.size(); i++) {
      if (predicate.test(serverAddressByClientCIDRs.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException("Can't edit matching serverAddressByClientCIDRs. No match found.");
    return setNewServerAddressByClientCIDRLike(index, buildServerAddressByClientCIDR(index));
  }

  public A addToVersions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item) {
    if (this.versions == null) {
      this.versions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder>();
    }
    io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder builder =
        new io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder(item);
    _visitables
        .get("versions")
        .add(index >= 0 ? index : _visitables.get("versions").size(), builder);
    this.versions.add(index >= 0 ? index : versions.size(), builder);
    return (A) this;
  }

  public A setToVersions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item) {
    if (this.versions == null) {
      this.versions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder>();
    }
    io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder builder =
        new io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder(item);
    if (index < 0 || index >= _visitables.get("versions").size()) {
      _visitables.get("versions").add(builder);
    } else {
      _visitables.get("versions").set(index, builder);
    }
    if (index < 0 || index >= versions.size()) {
      versions.add(builder);
    } else {
      versions.set(index, builder);
    }
    return (A) this;
  }

  public A addToVersions(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery... items) {
    if (this.versions == null) {
      this.versions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item : items) {
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder builder =
          new io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder(item);
      _visitables.get("versions").add(builder);
      this.versions.add(builder);
    }
    return (A) this;
  }

  public A addAllToVersions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery> items) {
    if (this.versions == null) {
      this.versions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item : items) {
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder builder =
          new io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder(item);
      _visitables.get("versions").add(builder);
      this.versions.add(builder);
    }
    return (A) this;
  }

  public A removeFromVersions(
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery... items) {
    for (io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item : items) {
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder builder =
          new io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder(item);
      _visitables.get("versions").remove(builder);
      if (this.versions != null) {
        this.versions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromVersions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery> items) {
    for (io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item : items) {
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder builder =
          new io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder(item);
      _visitables.get("versions").remove(builder);
      if (this.versions != null) {
        this.versions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromVersions(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder>
          predicate) {
    if (versions == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder> each =
        versions.iterator();
    final List visitables = _visitables.get("versions");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildVersions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery>
      getVersions() {
    return versions != null ? build(versions) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery>
      buildVersions() {
    return versions != null ? build(versions) : null;
  }

  public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildVersion(
      java.lang.Integer index) {
    return this.versions.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildFirstVersion() {
    return this.versions.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildLastVersion() {
    return this.versions.get(versions.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildMatchingVersion(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder item : versions) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingVersion(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder item : versions) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withVersions(
      java.util.List<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery> versions) {
    if (this.versions != null) {
      _visitables.get("versions").removeAll(this.versions);
    }
    if (versions != null) {
      this.versions = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item : versions) {
        this.addToVersions(item);
      }
    } else {
      this.versions = null;
    }
    return (A) this;
  }

  public A withVersions(
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery... versions) {
    if (this.versions != null) {
      this.versions.clear();
    }
    if (versions != null) {
      for (io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item : versions) {
        this.addToVersions(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasVersions() {
    return versions != null && !versions.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> addNewVersion() {
    return new io.kubernetes.client.openapi.models.V1APIGroupFluentImpl.VersionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> addNewVersionLike(
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item) {
    return new io.kubernetes.client.openapi.models.V1APIGroupFluentImpl.VersionsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> setNewVersionLike(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item) {
    return new io.kubernetes.client.openapi.models.V1APIGroupFluentImpl.VersionsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> editVersion(
      java.lang.Integer index) {
    if (versions.size() <= index)
      throw new RuntimeException("Can't edit versions. Index exceeds size.");
    return setNewVersionLike(index, buildVersion(index));
  }

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> editFirstVersion() {
    if (versions.size() == 0)
      throw new RuntimeException("Can't edit first versions. The list is empty.");
    return setNewVersionLike(0, buildVersion(0));
  }

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> editLastVersion() {
    int index = versions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last versions. The list is empty.");
    return setNewVersionLike(index, buildVersion(index));
  }

  public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> editMatchingVersion(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder>
          predicate) {
    int index = -1;
    for (int i = 0; i < versions.size(); i++) {
      if (predicate.test(versions.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching versions. No match found.");
    return setNewVersionLike(index, buildVersion(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1APIGroupFluentImpl that = (V1APIGroupFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (preferredVersion != null
        ? !preferredVersion.equals(that.preferredVersion)
        : that.preferredVersion != null) return false;
    if (serverAddressByClientCIDRs != null
        ? !serverAddressByClientCIDRs.equals(that.serverAddressByClientCIDRs)
        : that.serverAddressByClientCIDRs != null) return false;
    if (versions != null ? !versions.equals(that.versions) : that.versions != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        apiVersion,
        kind,
        name,
        preferredVersion,
        serverAddressByClientCIDRs,
        versions,
        super.hashCode());
  }

  public class PreferredVersionNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryFluentImpl<
          io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<N>>
      implements io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PreferredVersionNestedImpl(
        io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder(this, item);
    }

    PreferredVersionNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder builder;

    public N and() {
      return (N) V1APIGroupFluentImpl.this.withPreferredVersion(builder.build());
    }

    public N endPreferredVersion() {
      return and();
    }
  }

  public class ServerAddressByClientCIDRsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRFluentImpl<
          io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<N>>
      implements io.kubernetes.client.openapi.models.V1APIGroupFluent
                  .ServerAddressByClientCIDRsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ServerAddressByClientCIDRsNestedImpl(
        java.lang.Integer index,
        io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder(this, item);
    }

    ServerAddressByClientCIDRsNestedImpl() {
      this.index = -1;
      this.builder =
          new io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1APIGroupFluentImpl.this.setToServerAddressByClientCIDRs(index, builder.build());
    }

    public N endServerAddressByClientCIDR() {
      return and();
    }
  }

  public class VersionsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryFluentImpl<
          io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<N>>
      implements io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    VersionsNestedImpl(
        java.lang.Integer index,
        io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder(this, item);
    }

    VersionsNestedImpl() {
      this.index = -1;
      this.builder =
          new io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1APIGroupFluentImpl.this.setToVersions(index, builder.build());
    }

    public N endVersion() {
      return and();
    }
  }
}
