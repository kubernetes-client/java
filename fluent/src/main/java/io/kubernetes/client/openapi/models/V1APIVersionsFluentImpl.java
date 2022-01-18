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
public class V1APIVersionsFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1APIVersionsFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1APIVersionsFluent<A> {
  public V1APIVersionsFluentImpl() {}

  public V1APIVersionsFluentImpl(io.kubernetes.client.openapi.models.V1APIVersions instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withServerAddressByClientCIDRs(instance.getServerAddressByClientCIDRs());

    this.withVersions(instance.getVersions());
  }

  private java.lang.String apiVersion;
  private java.lang.String kind;
  private java.util.ArrayList<
          io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder>
      serverAddressByClientCIDRs;
  private java.util.List<java.lang.String> versions;

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

  public io.kubernetes.client.openapi.models.V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A>
      addNewServerAddressByClientCIDR() {
    return new io.kubernetes.client.openapi.models.V1APIVersionsFluentImpl
        .ServerAddressByClientCIDRsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A>
      addNewServerAddressByClientCIDRLike(
          io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item) {
    return new io.kubernetes.client.openapi.models.V1APIVersionsFluentImpl
        .ServerAddressByClientCIDRsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A>
      setNewServerAddressByClientCIDRLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item) {
    return new io.kubernetes.client.openapi.models.V1APIVersionsFluentImpl
        .ServerAddressByClientCIDRsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A>
      editServerAddressByClientCIDR(java.lang.Integer index) {
    if (serverAddressByClientCIDRs.size() <= index)
      throw new RuntimeException("Can't edit serverAddressByClientCIDRs. Index exceeds size.");
    return setNewServerAddressByClientCIDRLike(index, buildServerAddressByClientCIDR(index));
  }

  public io.kubernetes.client.openapi.models.V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A>
      editFirstServerAddressByClientCIDR() {
    if (serverAddressByClientCIDRs.size() == 0)
      throw new RuntimeException("Can't edit first serverAddressByClientCIDRs. The list is empty.");
    return setNewServerAddressByClientCIDRLike(0, buildServerAddressByClientCIDR(0));
  }

  public io.kubernetes.client.openapi.models.V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A>
      editLastServerAddressByClientCIDR() {
    int index = serverAddressByClientCIDRs.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last serverAddressByClientCIDRs. The list is empty.");
    return setNewServerAddressByClientCIDRLike(index, buildServerAddressByClientCIDR(index));
  }

  public io.kubernetes.client.openapi.models.V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A>
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

  public A addToVersions(java.lang.Integer index, java.lang.String item) {
    if (this.versions == null) {
      this.versions = new java.util.ArrayList<java.lang.String>();
    }
    this.versions.add(index, item);
    return (A) this;
  }

  public A setToVersions(java.lang.Integer index, java.lang.String item) {
    if (this.versions == null) {
      this.versions = new java.util.ArrayList<java.lang.String>();
    }
    this.versions.set(index, item);
    return (A) this;
  }

  public A addToVersions(java.lang.String... items) {
    if (this.versions == null) {
      this.versions = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.versions.add(item);
    }
    return (A) this;
  }

  public A addAllToVersions(java.util.Collection<java.lang.String> items) {
    if (this.versions == null) {
      this.versions = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.versions.add(item);
    }
    return (A) this;
  }

  public A removeFromVersions(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.versions != null) {
        this.versions.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromVersions(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.versions != null) {
        this.versions.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getVersions() {
    return this.versions;
  }

  public java.lang.String getVersion(java.lang.Integer index) {
    return this.versions.get(index);
  }

  public java.lang.String getFirstVersion() {
    return this.versions.get(0);
  }

  public java.lang.String getLastVersion() {
    return this.versions.get(versions.size() - 1);
  }

  public java.lang.String getMatchingVersion(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : versions) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingVersion(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : versions) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withVersions(java.util.List<java.lang.String> versions) {
    if (versions != null) {
      this.versions = new java.util.ArrayList();
      for (java.lang.String item : versions) {
        this.addToVersions(item);
      }
    } else {
      this.versions = null;
    }
    return (A) this;
  }

  public A withVersions(java.lang.String... versions) {
    if (this.versions != null) {
      this.versions.clear();
    }
    if (versions != null) {
      for (java.lang.String item : versions) {
        this.addToVersions(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasVersions() {
    return versions != null && !versions.isEmpty();
  }

  public A addNewVersion(java.lang.String original) {
    return (A) addToVersions(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1APIVersionsFluentImpl that = (V1APIVersionsFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (serverAddressByClientCIDRs != null
        ? !serverAddressByClientCIDRs.equals(that.serverAddressByClientCIDRs)
        : that.serverAddressByClientCIDRs != null) return false;
    if (versions != null ? !versions.equals(that.versions) : that.versions != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        apiVersion, kind, serverAddressByClientCIDRs, versions, super.hashCode());
  }

  public class ServerAddressByClientCIDRsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRFluentImpl<
          io.kubernetes.client.openapi.models.V1APIVersionsFluent.ServerAddressByClientCIDRsNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1APIVersionsFluent
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
      return (N)
          V1APIVersionsFluentImpl.this.setToServerAddressByClientCIDRs(index, builder.build());
    }

    public N endServerAddressByClientCIDR() {
      return and();
    }
  }
}
