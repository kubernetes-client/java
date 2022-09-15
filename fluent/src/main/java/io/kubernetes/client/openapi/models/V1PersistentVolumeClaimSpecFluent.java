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
public interface V1PersistentVolumeClaimSpecFluent<A extends V1PersistentVolumeClaimSpecFluent<A>>
    extends Fluent<A> {
  public A addToAccessModes(Integer index, String item);

  public A setToAccessModes(Integer index, String item);

  public A addToAccessModes(java.lang.String... items);

  public A addAllToAccessModes(Collection<String> items);

  public A removeFromAccessModes(java.lang.String... items);

  public A removeAllFromAccessModes(Collection<String> items);

  public List<String> getAccessModes();

  public String getAccessMode(Integer index);

  public String getFirstAccessMode();

  public String getLastAccessMode();

  public String getMatchingAccessMode(Predicate<String> predicate);

  public Boolean hasMatchingAccessMode(Predicate<String> predicate);

  public A withAccessModes(List<String> accessModes);

  public A withAccessModes(java.lang.String... accessModes);

  public Boolean hasAccessModes();

  /**
   * This method has been deprecated, please use method buildDataSource instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1TypedLocalObjectReference getDataSource();

  public V1TypedLocalObjectReference buildDataSource();

  public A withDataSource(V1TypedLocalObjectReference dataSource);

  public Boolean hasDataSource();

  public V1PersistentVolumeClaimSpecFluent.DataSourceNested<A> withNewDataSource();

  public V1PersistentVolumeClaimSpecFluent.DataSourceNested<A> withNewDataSourceLike(
      V1TypedLocalObjectReference item);

  public V1PersistentVolumeClaimSpecFluent.DataSourceNested<A> editDataSource();

  public V1PersistentVolumeClaimSpecFluent.DataSourceNested<A> editOrNewDataSource();

  public V1PersistentVolumeClaimSpecFluent.DataSourceNested<A> editOrNewDataSourceLike(
      V1TypedLocalObjectReference item);

  /**
   * This method has been deprecated, please use method buildDataSourceRef instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1TypedLocalObjectReference getDataSourceRef();

  public V1TypedLocalObjectReference buildDataSourceRef();

  public A withDataSourceRef(V1TypedLocalObjectReference dataSourceRef);

  public Boolean hasDataSourceRef();

  public V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<A> withNewDataSourceRef();

  public V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<A> withNewDataSourceRefLike(
      V1TypedLocalObjectReference item);

  public V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<A> editDataSourceRef();

  public V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<A> editOrNewDataSourceRef();

  public V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<A> editOrNewDataSourceRefLike(
      V1TypedLocalObjectReference item);

  /**
   * This method has been deprecated, please use method buildResources instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ResourceRequirements getResources();

  public V1ResourceRequirements buildResources();

  public A withResources(V1ResourceRequirements resources);

  public Boolean hasResources();

  public V1PersistentVolumeClaimSpecFluent.ResourcesNested<A> withNewResources();

  public V1PersistentVolumeClaimSpecFluent.ResourcesNested<A> withNewResourcesLike(
      V1ResourceRequirements item);

  public V1PersistentVolumeClaimSpecFluent.ResourcesNested<A> editResources();

  public V1PersistentVolumeClaimSpecFluent.ResourcesNested<A> editOrNewResources();

  public V1PersistentVolumeClaimSpecFluent.ResourcesNested<A> editOrNewResourcesLike(
      V1ResourceRequirements item);

  /**
   * This method has been deprecated, please use method buildSelector instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getSelector();

  public V1LabelSelector buildSelector();

  public A withSelector(V1LabelSelector selector);

  public Boolean hasSelector();

  public V1PersistentVolumeClaimSpecFluent.SelectorNested<A> withNewSelector();

  public V1PersistentVolumeClaimSpecFluent.SelectorNested<A> withNewSelectorLike(
      V1LabelSelector item);

  public V1PersistentVolumeClaimSpecFluent.SelectorNested<A> editSelector();

  public V1PersistentVolumeClaimSpecFluent.SelectorNested<A> editOrNewSelector();

  public V1PersistentVolumeClaimSpecFluent.SelectorNested<A> editOrNewSelectorLike(
      V1LabelSelector item);

  public String getStorageClassName();

  public A withStorageClassName(String storageClassName);

  public Boolean hasStorageClassName();

  public String getVolumeMode();

  public A withVolumeMode(String volumeMode);

  public Boolean hasVolumeMode();

  public String getVolumeName();

  public A withVolumeName(String volumeName);

  public Boolean hasVolumeName();

  public interface DataSourceNested<N>
      extends Nested<N>,
          V1TypedLocalObjectReferenceFluent<V1PersistentVolumeClaimSpecFluent.DataSourceNested<N>> {
    public N and();

    public N endDataSource();
  }

  public interface DataSourceRefNested<N>
      extends Nested<N>,
          V1TypedLocalObjectReferenceFluent<
              V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<N>> {
    public N and();

    public N endDataSourceRef();
  }

  public interface ResourcesNested<N>
      extends Nested<N>,
          V1ResourceRequirementsFluent<V1PersistentVolumeClaimSpecFluent.ResourcesNested<N>> {
    public N and();

    public N endResources();
  }

  public interface SelectorNested<N>
      extends Nested<N>,
          V1LabelSelectorFluent<V1PersistentVolumeClaimSpecFluent.SelectorNested<N>> {
    public N and();

    public N endSelector();
  }
}
