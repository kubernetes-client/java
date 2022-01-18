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
public interface V1PersistentVolumeClaimSpecFluent<
        A extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToAccessModes(java.lang.Integer index, java.lang.String item);

  public A setToAccessModes(java.lang.Integer index, java.lang.String item);

  public A addToAccessModes(java.lang.String... items);

  public A addAllToAccessModes(java.util.Collection<java.lang.String> items);

  public A removeFromAccessModes(java.lang.String... items);

  public A removeAllFromAccessModes(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getAccessModes();

  public java.lang.String getAccessMode(java.lang.Integer index);

  public java.lang.String getFirstAccessMode();

  public java.lang.String getLastAccessMode();

  public java.lang.String getMatchingAccessMode(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingAccessMode(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withAccessModes(java.util.List<java.lang.String> accessModes);

  public A withAccessModes(java.lang.String... accessModes);

  public java.lang.Boolean hasAccessModes();

  public A addNewAccessMode(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildDataSource instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference getDataSource();

  public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference buildDataSource();

  public A withDataSource(
      io.kubernetes.client.openapi.models.V1TypedLocalObjectReference dataSource);

  public java.lang.Boolean hasDataSource();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceNested<A>
      withNewDataSource();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceNested<A>
      withNewDataSourceLike(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceNested<A>
      editDataSource();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceNested<A>
      editOrNewDataSource();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceNested<A>
      editOrNewDataSourceLike(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item);

  /**
   * This method has been deprecated, please use method buildDataSourceRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference getDataSourceRef();

  public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference buildDataSourceRef();

  public A withDataSourceRef(
      io.kubernetes.client.openapi.models.V1TypedLocalObjectReference dataSourceRef);

  public java.lang.Boolean hasDataSourceRef();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<
          A>
      withNewDataSourceRef();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<
          A>
      withNewDataSourceRefLike(
          io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<
          A>
      editDataSourceRef();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<
          A>
      editOrNewDataSourceRef();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<
          A>
      editOrNewDataSourceRefLike(
          io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item);

  /**
   * This method has been deprecated, please use method buildResources instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ResourceRequirements getResources();

  public io.kubernetes.client.openapi.models.V1ResourceRequirements buildResources();

  public A withResources(io.kubernetes.client.openapi.models.V1ResourceRequirements resources);

  public java.lang.Boolean hasResources();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.ResourcesNested<A>
      withNewResources();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.ResourcesNested<A>
      withNewResourcesLike(io.kubernetes.client.openapi.models.V1ResourceRequirements item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.ResourcesNested<A>
      editResources();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.ResourcesNested<A>
      editOrNewResources();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.ResourcesNested<A>
      editOrNewResourcesLike(io.kubernetes.client.openapi.models.V1ResourceRequirements item);

  /**
   * This method has been deprecated, please use method buildSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getSelector();

  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector();

  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector);

  public java.lang.Boolean hasSelector();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.SelectorNested<A>
      withNewSelector();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.SelectorNested<A>
      withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.SelectorNested<A>
      editSelector();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.SelectorNested<A>
      editOrNewSelector();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.SelectorNested<A>
      editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public java.lang.String getStorageClassName();

  public A withStorageClassName(java.lang.String storageClassName);

  public java.lang.Boolean hasStorageClassName();

  /** Method is deprecated. use withStorageClassName instead. */
  @java.lang.Deprecated
  public A withNewStorageClassName(java.lang.String original);

  public java.lang.String getVolumeMode();

  public A withVolumeMode(java.lang.String volumeMode);

  public java.lang.Boolean hasVolumeMode();

  /** Method is deprecated. use withVolumeMode instead. */
  @java.lang.Deprecated
  public A withNewVolumeMode(java.lang.String original);

  public java.lang.String getVolumeName();

  public A withVolumeName(java.lang.String volumeName);

  public java.lang.Boolean hasVolumeName();

  /** Method is deprecated. use withVolumeName instead. */
  @java.lang.Deprecated
  public A withNewVolumeName(java.lang.String original);

  public interface DataSourceNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent
                      .DataSourceNested<
                  N>> {
    public N and();

    public N endDataSource();
  }

  public interface DataSourceRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent
                      .DataSourceRefNested<
                  N>> {
    public N and();

    public N endDataSourceRef();
  }

  public interface ResourcesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ResourceRequirementsFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.ResourcesNested<
                  N>> {
    public N and();

    public N endResources();
  }

  public interface SelectorNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1LabelSelectorFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent.SelectorNested<
                  N>> {
    public N and();

    public N endSelector();
  }
}
