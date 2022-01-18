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
public class V1StorageClassFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1StorageClassFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1StorageClassFluent<A> {
  public V1StorageClassFluentImpl() {}

  public V1StorageClassFluentImpl(io.kubernetes.client.openapi.models.V1StorageClass instance) {
    this.withAllowVolumeExpansion(instance.getAllowVolumeExpansion());

    this.withAllowedTopologies(instance.getAllowedTopologies());

    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withMountOptions(instance.getMountOptions());

    this.withParameters(instance.getParameters());

    this.withProvisioner(instance.getProvisioner());

    this.withReclaimPolicy(instance.getReclaimPolicy());

    this.withVolumeBindingMode(instance.getVolumeBindingMode());
  }

  private java.lang.Boolean allowVolumeExpansion;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder>
      allowedTopologies;
  private java.lang.String apiVersion;
  private java.lang.String kind;
  private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
  private java.util.List<java.lang.String> mountOptions;
  private java.util.Map<java.lang.String, java.lang.String> parameters;
  private java.lang.String provisioner;
  private java.lang.String reclaimPolicy;
  private java.lang.String volumeBindingMode;

  public java.lang.Boolean getAllowVolumeExpansion() {
    return this.allowVolumeExpansion;
  }

  public A withAllowVolumeExpansion(java.lang.Boolean allowVolumeExpansion) {
    this.allowVolumeExpansion = allowVolumeExpansion;
    return (A) this;
  }

  public java.lang.Boolean hasAllowVolumeExpansion() {
    return this.allowVolumeExpansion != null;
  }

  public A addToAllowedTopologies(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1TopologySelectorTerm item) {
    if (this.allowedTopologies == null) {
      this.allowedTopologies =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder>();
    }
    io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder builder =
        new io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder(item);
    _visitables
        .get("allowedTopologies")
        .add(index >= 0 ? index : _visitables.get("allowedTopologies").size(), builder);
    this.allowedTopologies.add(index >= 0 ? index : allowedTopologies.size(), builder);
    return (A) this;
  }

  public A setToAllowedTopologies(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1TopologySelectorTerm item) {
    if (this.allowedTopologies == null) {
      this.allowedTopologies =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder>();
    }
    io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder builder =
        new io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder(item);
    if (index < 0 || index >= _visitables.get("allowedTopologies").size()) {
      _visitables.get("allowedTopologies").add(builder);
    } else {
      _visitables.get("allowedTopologies").set(index, builder);
    }
    if (index < 0 || index >= allowedTopologies.size()) {
      allowedTopologies.add(builder);
    } else {
      allowedTopologies.set(index, builder);
    }
    return (A) this;
  }

  public A addToAllowedTopologies(
      io.kubernetes.client.openapi.models.V1TopologySelectorTerm... items) {
    if (this.allowedTopologies == null) {
      this.allowedTopologies =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1TopologySelectorTerm item : items) {
      io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder(item);
      _visitables.get("allowedTopologies").add(builder);
      this.allowedTopologies.add(builder);
    }
    return (A) this;
  }

  public A addAllToAllowedTopologies(
      java.util.Collection<io.kubernetes.client.openapi.models.V1TopologySelectorTerm> items) {
    if (this.allowedTopologies == null) {
      this.allowedTopologies =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1TopologySelectorTerm item : items) {
      io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder(item);
      _visitables.get("allowedTopologies").add(builder);
      this.allowedTopologies.add(builder);
    }
    return (A) this;
  }

  public A removeFromAllowedTopologies(
      io.kubernetes.client.openapi.models.V1TopologySelectorTerm... items) {
    for (io.kubernetes.client.openapi.models.V1TopologySelectorTerm item : items) {
      io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder(item);
      _visitables.get("allowedTopologies").remove(builder);
      if (this.allowedTopologies != null) {
        this.allowedTopologies.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromAllowedTopologies(
      java.util.Collection<io.kubernetes.client.openapi.models.V1TopologySelectorTerm> items) {
    for (io.kubernetes.client.openapi.models.V1TopologySelectorTerm item : items) {
      io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder(item);
      _visitables.get("allowedTopologies").remove(builder);
      if (this.allowedTopologies != null) {
        this.allowedTopologies.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromAllowedTopologies(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder>
          predicate) {
    if (allowedTopologies == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder> each =
        allowedTopologies.iterator();
    final List visitables = _visitables.get("allowedTopologies");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildAllowedTopologies instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1TopologySelectorTerm>
      getAllowedTopologies() {
    return allowedTopologies != null ? build(allowedTopologies) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1TopologySelectorTerm>
      buildAllowedTopologies() {
    return allowedTopologies != null ? build(allowedTopologies) : null;
  }

  public io.kubernetes.client.openapi.models.V1TopologySelectorTerm buildAllowedTopology(
      java.lang.Integer index) {
    return this.allowedTopologies.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1TopologySelectorTerm buildFirstAllowedTopology() {
    return this.allowedTopologies.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1TopologySelectorTerm buildLastAllowedTopology() {
    return this.allowedTopologies.get(allowedTopologies.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1TopologySelectorTerm buildMatchingAllowedTopology(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder item :
        allowedTopologies) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingAllowedTopology(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder item :
        allowedTopologies) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withAllowedTopologies(
      java.util.List<io.kubernetes.client.openapi.models.V1TopologySelectorTerm>
          allowedTopologies) {
    if (this.allowedTopologies != null) {
      _visitables.get("allowedTopologies").removeAll(this.allowedTopologies);
    }
    if (allowedTopologies != null) {
      this.allowedTopologies = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1TopologySelectorTerm item : allowedTopologies) {
        this.addToAllowedTopologies(item);
      }
    } else {
      this.allowedTopologies = null;
    }
    return (A) this;
  }

  public A withAllowedTopologies(
      io.kubernetes.client.openapi.models.V1TopologySelectorTerm... allowedTopologies) {
    if (this.allowedTopologies != null) {
      this.allowedTopologies.clear();
    }
    if (allowedTopologies != null) {
      for (io.kubernetes.client.openapi.models.V1TopologySelectorTerm item : allowedTopologies) {
        this.addToAllowedTopologies(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasAllowedTopologies() {
    return allowedTopologies != null && !allowedTopologies.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.AllowedTopologiesNested<A>
      addNewAllowedTopology() {
    return new io.kubernetes.client.openapi.models.V1StorageClassFluentImpl
        .AllowedTopologiesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.AllowedTopologiesNested<A>
      addNewAllowedTopologyLike(io.kubernetes.client.openapi.models.V1TopologySelectorTerm item) {
    return new io.kubernetes.client.openapi.models.V1StorageClassFluentImpl
        .AllowedTopologiesNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.AllowedTopologiesNested<A>
      setNewAllowedTopologyLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1TopologySelectorTerm item) {
    return new io.kubernetes.client.openapi.models.V1StorageClassFluentImpl
        .AllowedTopologiesNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.AllowedTopologiesNested<A>
      editAllowedTopology(java.lang.Integer index) {
    if (allowedTopologies.size() <= index)
      throw new RuntimeException("Can't edit allowedTopologies. Index exceeds size.");
    return setNewAllowedTopologyLike(index, buildAllowedTopology(index));
  }

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.AllowedTopologiesNested<A>
      editFirstAllowedTopology() {
    if (allowedTopologies.size() == 0)
      throw new RuntimeException("Can't edit first allowedTopologies. The list is empty.");
    return setNewAllowedTopologyLike(0, buildAllowedTopology(0));
  }

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.AllowedTopologiesNested<A>
      editLastAllowedTopology() {
    int index = allowedTopologies.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last allowedTopologies. The list is empty.");
    return setNewAllowedTopologyLike(index, buildAllowedTopology(index));
  }

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.AllowedTopologiesNested<A>
      editMatchingAllowedTopology(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < allowedTopologies.size(); i++) {
      if (predicate.test(allowedTopologies.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException("Can't edit matching allowedTopologies. No match found.");
    return setNewAllowedTopologyLike(index, buildAllowedTopology(index));
  }

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

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata != null) {
      this.metadata = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(metadata);
      _visitables.get("metadata").add(this.metadata);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMetadata() {
    return this.metadata != null;
  }

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.MetadataNested<A>
      withNewMetadata() {
    return new io.kubernetes.client.openapi.models.V1StorageClassFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new io.kubernetes.client.openapi.models.V1StorageClassFluentImpl.MetadataNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.MetadataNested<A>
      editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1StorageClassFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  public A addToMountOptions(java.lang.Integer index, java.lang.String item) {
    if (this.mountOptions == null) {
      this.mountOptions = new java.util.ArrayList<java.lang.String>();
    }
    this.mountOptions.add(index, item);
    return (A) this;
  }

  public A setToMountOptions(java.lang.Integer index, java.lang.String item) {
    if (this.mountOptions == null) {
      this.mountOptions = new java.util.ArrayList<java.lang.String>();
    }
    this.mountOptions.set(index, item);
    return (A) this;
  }

  public A addToMountOptions(java.lang.String... items) {
    if (this.mountOptions == null) {
      this.mountOptions = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.mountOptions.add(item);
    }
    return (A) this;
  }

  public A addAllToMountOptions(java.util.Collection<java.lang.String> items) {
    if (this.mountOptions == null) {
      this.mountOptions = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.mountOptions.add(item);
    }
    return (A) this;
  }

  public A removeFromMountOptions(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.mountOptions != null) {
        this.mountOptions.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromMountOptions(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.mountOptions != null) {
        this.mountOptions.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getMountOptions() {
    return this.mountOptions;
  }

  public java.lang.String getMountOption(java.lang.Integer index) {
    return this.mountOptions.get(index);
  }

  public java.lang.String getFirstMountOption() {
    return this.mountOptions.get(0);
  }

  public java.lang.String getLastMountOption() {
    return this.mountOptions.get(mountOptions.size() - 1);
  }

  public java.lang.String getMatchingMountOption(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : mountOptions) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingMountOption(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : mountOptions) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withMountOptions(java.util.List<java.lang.String> mountOptions) {
    if (mountOptions != null) {
      this.mountOptions = new java.util.ArrayList();
      for (java.lang.String item : mountOptions) {
        this.addToMountOptions(item);
      }
    } else {
      this.mountOptions = null;
    }
    return (A) this;
  }

  public A withMountOptions(java.lang.String... mountOptions) {
    if (this.mountOptions != null) {
      this.mountOptions.clear();
    }
    if (mountOptions != null) {
      for (java.lang.String item : mountOptions) {
        this.addToMountOptions(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasMountOptions() {
    return mountOptions != null && !mountOptions.isEmpty();
  }

  public A addNewMountOption(java.lang.String original) {
    return (A) addToMountOptions(new String(original));
  }

  public A addToParameters(java.lang.String key, java.lang.String value) {
    if (this.parameters == null && key != null && value != null) {
      this.parameters = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.parameters.put(key, value);
    }
    return (A) this;
  }

  public A addToParameters(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.parameters == null && map != null) {
      this.parameters = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.parameters.putAll(map);
    }
    return (A) this;
  }

  public A removeFromParameters(java.lang.String key) {
    if (this.parameters == null) {
      return (A) this;
    }
    if (key != null && this.parameters != null) {
      this.parameters.remove(key);
    }
    return (A) this;
  }

  public A removeFromParameters(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.parameters == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.parameters != null) {
          this.parameters.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, java.lang.String> getParameters() {
    return this.parameters;
  }

  public <K, V> A withParameters(java.util.Map<java.lang.String, java.lang.String> parameters) {
    if (parameters == null) {
      this.parameters = null;
    } else {
      this.parameters = new java.util.LinkedHashMap(parameters);
    }
    return (A) this;
  }

  public java.lang.Boolean hasParameters() {
    return this.parameters != null;
  }

  public java.lang.String getProvisioner() {
    return this.provisioner;
  }

  public A withProvisioner(java.lang.String provisioner) {
    this.provisioner = provisioner;
    return (A) this;
  }

  public java.lang.Boolean hasProvisioner() {
    return this.provisioner != null;
  }

  /** Method is deprecated. use withProvisioner instead. */
  @java.lang.Deprecated
  public A withNewProvisioner(java.lang.String original) {
    return (A) withProvisioner(new String(original));
  }

  public java.lang.String getReclaimPolicy() {
    return this.reclaimPolicy;
  }

  public A withReclaimPolicy(java.lang.String reclaimPolicy) {
    this.reclaimPolicy = reclaimPolicy;
    return (A) this;
  }

  public java.lang.Boolean hasReclaimPolicy() {
    return this.reclaimPolicy != null;
  }

  /** Method is deprecated. use withReclaimPolicy instead. */
  @java.lang.Deprecated
  public A withNewReclaimPolicy(java.lang.String original) {
    return (A) withReclaimPolicy(new String(original));
  }

  public java.lang.String getVolumeBindingMode() {
    return this.volumeBindingMode;
  }

  public A withVolumeBindingMode(java.lang.String volumeBindingMode) {
    this.volumeBindingMode = volumeBindingMode;
    return (A) this;
  }

  public java.lang.Boolean hasVolumeBindingMode() {
    return this.volumeBindingMode != null;
  }

  /** Method is deprecated. use withVolumeBindingMode instead. */
  @java.lang.Deprecated
  public A withNewVolumeBindingMode(java.lang.String original) {
    return (A) withVolumeBindingMode(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1StorageClassFluentImpl that = (V1StorageClassFluentImpl) o;
    if (allowVolumeExpansion != null
        ? !allowVolumeExpansion.equals(that.allowVolumeExpansion)
        : that.allowVolumeExpansion != null) return false;
    if (allowedTopologies != null
        ? !allowedTopologies.equals(that.allowedTopologies)
        : that.allowedTopologies != null) return false;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (mountOptions != null ? !mountOptions.equals(that.mountOptions) : that.mountOptions != null)
      return false;
    if (parameters != null ? !parameters.equals(that.parameters) : that.parameters != null)
      return false;
    if (provisioner != null ? !provisioner.equals(that.provisioner) : that.provisioner != null)
      return false;
    if (reclaimPolicy != null
        ? !reclaimPolicy.equals(that.reclaimPolicy)
        : that.reclaimPolicy != null) return false;
    if (volumeBindingMode != null
        ? !volumeBindingMode.equals(that.volumeBindingMode)
        : that.volumeBindingMode != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        allowVolumeExpansion,
        allowedTopologies,
        apiVersion,
        kind,
        metadata,
        mountOptions,
        parameters,
        provisioner,
        reclaimPolicy,
        volumeBindingMode,
        super.hashCode());
  }

  public class AllowedTopologiesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1TopologySelectorTermFluentImpl<
          io.kubernetes.client.openapi.models.V1StorageClassFluent.AllowedTopologiesNested<N>>
      implements io.kubernetes.client.openapi.models.V1StorageClassFluent.AllowedTopologiesNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    AllowedTopologiesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1TopologySelectorTerm item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder(this, item);
    }

    AllowedTopologiesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1StorageClassFluentImpl.this.setToAllowedTopologies(index, builder.build());
    }

    public N endAllowedTopology() {
      return and();
    }
  }

  public class MetadataNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<
          io.kubernetes.client.openapi.models.V1StorageClassFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.V1StorageClassFluent.MetadataNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1StorageClassFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }
}
