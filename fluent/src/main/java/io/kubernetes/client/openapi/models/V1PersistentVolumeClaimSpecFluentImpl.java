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
public class V1PersistentVolumeClaimSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent<A> {
  public V1PersistentVolumeClaimSpecFluentImpl() {}

  public V1PersistentVolumeClaimSpecFluentImpl(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec instance) {
    this.withAccessModes(instance.getAccessModes());

    this.withDataSource(instance.getDataSource());

    this.withDataSourceRef(instance.getDataSourceRef());

    this.withResources(instance.getResources());

    this.withSelector(instance.getSelector());

    this.withStorageClassName(instance.getStorageClassName());

    this.withVolumeMode(instance.getVolumeMode());

    this.withVolumeName(instance.getVolumeName());
  }

  private java.util.List<java.lang.String> accessModes;
  private io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder dataSource;
  private io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder dataSourceRef;
  private io.kubernetes.client.openapi.models.V1ResourceRequirementsBuilder resources;
  private io.kubernetes.client.openapi.models.V1LabelSelectorBuilder selector;
  private java.lang.String storageClassName;
  private java.lang.String volumeMode;
  private java.lang.String volumeName;

  public A addToAccessModes(java.lang.Integer index, java.lang.String item) {
    if (this.accessModes == null) {
      this.accessModes = new java.util.ArrayList<java.lang.String>();
    }
    this.accessModes.add(index, item);
    return (A) this;
  }

  public A setToAccessModes(java.lang.Integer index, java.lang.String item) {
    if (this.accessModes == null) {
      this.accessModes = new java.util.ArrayList<java.lang.String>();
    }
    this.accessModes.set(index, item);
    return (A) this;
  }

  public A addToAccessModes(java.lang.String... items) {
    if (this.accessModes == null) {
      this.accessModes = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.accessModes.add(item);
    }
    return (A) this;
  }

  public A addAllToAccessModes(java.util.Collection<java.lang.String> items) {
    if (this.accessModes == null) {
      this.accessModes = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.accessModes.add(item);
    }
    return (A) this;
  }

  public A removeFromAccessModes(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.accessModes != null) {
        this.accessModes.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromAccessModes(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.accessModes != null) {
        this.accessModes.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getAccessModes() {
    return this.accessModes;
  }

  public java.lang.String getAccessMode(java.lang.Integer index) {
    return this.accessModes.get(index);
  }

  public java.lang.String getFirstAccessMode() {
    return this.accessModes.get(0);
  }

  public java.lang.String getLastAccessMode() {
    return this.accessModes.get(accessModes.size() - 1);
  }

  public java.lang.String getMatchingAccessMode(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : accessModes) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingAccessMode(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : accessModes) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withAccessModes(java.util.List<java.lang.String> accessModes) {
    if (accessModes != null) {
      this.accessModes = new java.util.ArrayList();
      for (java.lang.String item : accessModes) {
        this.addToAccessModes(item);
      }
    } else {
      this.accessModes = null;
    }
    return (A) this;
  }

  public A withAccessModes(java.lang.String... accessModes) {
    if (this.accessModes != null) {
      this.accessModes.clear();
    }
    if (accessModes != null) {
      for (java.lang.String item : accessModes) {
        this.addToAccessModes(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasAccessModes() {
    return accessModes != null && !accessModes.isEmpty();
  }

  public A addNewAccessMode(java.lang.String original) {
    return (A) addToAccessModes(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildDataSource instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference getDataSource() {
    return this.dataSource != null ? this.dataSource.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference buildDataSource() {
    return this.dataSource != null ? this.dataSource.build() : null;
  }

  public A withDataSource(
      io.kubernetes.client.openapi.models.V1TypedLocalObjectReference dataSource) {
    _visitables.get("dataSource").remove(this.dataSource);
    if (dataSource != null) {
      this.dataSource =
          new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder(dataSource);
      _visitables.get("dataSource").add(this.dataSource);
    }
    return (A) this;
  }

  public java.lang.Boolean hasDataSource() {
    return this.dataSource != null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceNested<A>
      withNewDataSource() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluentImpl
        .DataSourceNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceNested<A>
      withNewDataSourceLike(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluentImpl
        .DataSourceNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceNested<A>
      editDataSource() {
    return withNewDataSourceLike(getDataSource());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceNested<A>
      editOrNewDataSource() {
    return withNewDataSourceLike(
        getDataSource() != null
            ? getDataSource()
            : new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceNested<A>
      editOrNewDataSourceLike(
          io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item) {
    return withNewDataSourceLike(getDataSource() != null ? getDataSource() : item);
  }

  /**
   * This method has been deprecated, please use method buildDataSourceRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference getDataSourceRef() {
    return this.dataSourceRef != null ? this.dataSourceRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference buildDataSourceRef() {
    return this.dataSourceRef != null ? this.dataSourceRef.build() : null;
  }

  public A withDataSourceRef(
      io.kubernetes.client.openapi.models.V1TypedLocalObjectReference dataSourceRef) {
    _visitables.get("dataSourceRef").remove(this.dataSourceRef);
    if (dataSourceRef != null) {
      this.dataSourceRef =
          new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder(dataSourceRef);
      _visitables.get("dataSourceRef").add(this.dataSourceRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasDataSourceRef() {
    return this.dataSourceRef != null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<
          A>
      withNewDataSourceRef() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluentImpl
        .DataSourceRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<
          A>
      withNewDataSourceRefLike(
          io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluentImpl
        .DataSourceRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<
          A>
      editDataSourceRef() {
    return withNewDataSourceRefLike(getDataSourceRef());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<
          A>
      editOrNewDataSourceRef() {
    return withNewDataSourceRefLike(
        getDataSourceRef() != null
            ? getDataSourceRef()
            : new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<
          A>
      editOrNewDataSourceRefLike(
          io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item) {
    return withNewDataSourceRefLike(getDataSourceRef() != null ? getDataSourceRef() : item);
  }

  /**
   * This method has been deprecated, please use method buildResources instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ResourceRequirements getResources() {
    return this.resources != null ? this.resources.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ResourceRequirements buildResources() {
    return this.resources != null ? this.resources.build() : null;
  }

  public A withResources(io.kubernetes.client.openapi.models.V1ResourceRequirements resources) {
    _visitables.get("resources").remove(this.resources);
    if (resources != null) {
      this.resources =
          new io.kubernetes.client.openapi.models.V1ResourceRequirementsBuilder(resources);
      _visitables.get("resources").add(this.resources);
    }
    return (A) this;
  }

  public java.lang.Boolean hasResources() {
    return this.resources != null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.ResourcesNested<A>
      withNewResources() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluentImpl
        .ResourcesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.ResourcesNested<A>
      withNewResourcesLike(io.kubernetes.client.openapi.models.V1ResourceRequirements item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluentImpl
        .ResourcesNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.ResourcesNested<A>
      editResources() {
    return withNewResourcesLike(getResources());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.ResourcesNested<A>
      editOrNewResources() {
    return withNewResourcesLike(
        getResources() != null
            ? getResources()
            : new io.kubernetes.client.openapi.models.V1ResourceRequirementsBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.ResourcesNested<A>
      editOrNewResourcesLike(io.kubernetes.client.openapi.models.V1ResourceRequirements item) {
    return withNewResourcesLike(getResources() != null ? getResources() : item);
  }

  /**
   * This method has been deprecated, please use method buildSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getSelector() {
    return this.selector != null ? this.selector.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector() {
    return this.selector != null ? this.selector.build() : null;
  }

  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector) {
    _visitables.get("selector").remove(this.selector);
    if (selector != null) {
      this.selector = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(selector);
      _visitables.get("selector").add(this.selector);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSelector() {
    return this.selector != null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.SelectorNested<A>
      withNewSelector() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluentImpl
        .SelectorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.SelectorNested<A>
      withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluentImpl
        .SelectorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.SelectorNested<A>
      editSelector() {
    return withNewSelectorLike(getSelector());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.SelectorNested<A>
      editOrNewSelector() {
    return withNewSelectorLike(
        getSelector() != null
            ? getSelector()
            : new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.SelectorNested<A>
      editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewSelectorLike(getSelector() != null ? getSelector() : item);
  }

  public java.lang.String getStorageClassName() {
    return this.storageClassName;
  }

  public A withStorageClassName(java.lang.String storageClassName) {
    this.storageClassName = storageClassName;
    return (A) this;
  }

  public java.lang.Boolean hasStorageClassName() {
    return this.storageClassName != null;
  }

  /** Method is deprecated. use withStorageClassName instead. */
  @java.lang.Deprecated
  public A withNewStorageClassName(java.lang.String original) {
    return (A) withStorageClassName(new String(original));
  }

  public java.lang.String getVolumeMode() {
    return this.volumeMode;
  }

  public A withVolumeMode(java.lang.String volumeMode) {
    this.volumeMode = volumeMode;
    return (A) this;
  }

  public java.lang.Boolean hasVolumeMode() {
    return this.volumeMode != null;
  }

  /** Method is deprecated. use withVolumeMode instead. */
  @java.lang.Deprecated
  public A withNewVolumeMode(java.lang.String original) {
    return (A) withVolumeMode(new String(original));
  }

  public java.lang.String getVolumeName() {
    return this.volumeName;
  }

  public A withVolumeName(java.lang.String volumeName) {
    this.volumeName = volumeName;
    return (A) this;
  }

  public java.lang.Boolean hasVolumeName() {
    return this.volumeName != null;
  }

  /** Method is deprecated. use withVolumeName instead. */
  @java.lang.Deprecated
  public A withNewVolumeName(java.lang.String original) {
    return (A) withVolumeName(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PersistentVolumeClaimSpecFluentImpl that = (V1PersistentVolumeClaimSpecFluentImpl) o;
    if (accessModes != null ? !accessModes.equals(that.accessModes) : that.accessModes != null)
      return false;
    if (dataSource != null ? !dataSource.equals(that.dataSource) : that.dataSource != null)
      return false;
    if (dataSourceRef != null
        ? !dataSourceRef.equals(that.dataSourceRef)
        : that.dataSourceRef != null) return false;
    if (resources != null ? !resources.equals(that.resources) : that.resources != null)
      return false;
    if (selector != null ? !selector.equals(that.selector) : that.selector != null) return false;
    if (storageClassName != null
        ? !storageClassName.equals(that.storageClassName)
        : that.storageClassName != null) return false;
    if (volumeMode != null ? !volumeMode.equals(that.volumeMode) : that.volumeMode != null)
      return false;
    if (volumeName != null ? !volumeName.equals(that.volumeName) : that.volumeName != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        accessModes,
        dataSource,
        dataSourceRef,
        resources,
        selector,
        storageClassName,
        volumeMode,
        volumeName,
        super.hashCode());
  }

  public class DataSourceNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent
                  .DataSourceNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    DataSourceNestedImpl(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder(this, item);
    }

    DataSourceNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeClaimSpecFluentImpl.this.withDataSource(builder.build());
    }

    public N endDataSource() {
      return and();
    }
  }

  public class DataSourceRefNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent
                  .DataSourceRefNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    DataSourceRefNestedImpl(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder(this, item);
    }

    DataSourceRefNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeClaimSpecFluentImpl.this.withDataSourceRef(builder.build());
    }

    public N endDataSourceRef() {
      return and();
    }
  }

  public class ResourcesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ResourceRequirementsFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.ResourcesNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent
                  .ResourcesNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ResourcesNestedImpl(io.kubernetes.client.openapi.models.V1ResourceRequirements item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ResourceRequirementsBuilder(this, item);
    }

    ResourcesNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ResourceRequirementsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ResourceRequirementsBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeClaimSpecFluentImpl.this.withResources(builder.build());
    }

    public N endResources() {
      return and();
    }
  }

  public class SelectorNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.SelectorNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent
                  .SelectorNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    SelectorNestedImpl(io.kubernetes.client.openapi.models.V1LabelSelector item) {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this, item);
    }

    SelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeClaimSpecFluentImpl.this.withSelector(builder.build());
    }

    public N endSelector() {
      return and();
    }
  }
}
