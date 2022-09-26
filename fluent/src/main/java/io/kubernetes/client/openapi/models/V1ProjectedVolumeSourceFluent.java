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
public interface V1ProjectedVolumeSourceFluent<A extends V1ProjectedVolumeSourceFluent<A>>
    extends Fluent<A> {
  public Integer getDefaultMode();

  public A withDefaultMode(Integer defaultMode);

  public Boolean hasDefaultMode();

  public A addToSources(Integer index, V1VolumeProjection item);

  public A setToSources(Integer index, V1VolumeProjection item);

  public A addToSources(io.kubernetes.client.openapi.models.V1VolumeProjection... items);

  public A addAllToSources(Collection<V1VolumeProjection> items);

  public A removeFromSources(io.kubernetes.client.openapi.models.V1VolumeProjection... items);

  public A removeAllFromSources(Collection<V1VolumeProjection> items);

  public A removeMatchingFromSources(Predicate<V1VolumeProjectionBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildSources instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1VolumeProjection> getSources();

  public List<V1VolumeProjection> buildSources();

  public V1VolumeProjection buildSource(Integer index);

  public V1VolumeProjection buildFirstSource();

  public V1VolumeProjection buildLastSource();

  public V1VolumeProjection buildMatchingSource(Predicate<V1VolumeProjectionBuilder> predicate);

  public Boolean hasMatchingSource(Predicate<V1VolumeProjectionBuilder> predicate);

  public A withSources(List<V1VolumeProjection> sources);

  public A withSources(io.kubernetes.client.openapi.models.V1VolumeProjection... sources);

  public Boolean hasSources();

  public V1ProjectedVolumeSourceFluent.SourcesNested<A> addNewSource();

  public V1ProjectedVolumeSourceFluent.SourcesNested<A> addNewSourceLike(V1VolumeProjection item);

  public V1ProjectedVolumeSourceFluent.SourcesNested<A> setNewSourceLike(
      Integer index, V1VolumeProjection item);

  public V1ProjectedVolumeSourceFluent.SourcesNested<A> editSource(Integer index);

  public V1ProjectedVolumeSourceFluent.SourcesNested<A> editFirstSource();

  public V1ProjectedVolumeSourceFluent.SourcesNested<A> editLastSource();

  public V1ProjectedVolumeSourceFluent.SourcesNested<A> editMatchingSource(
      Predicate<V1VolumeProjectionBuilder> predicate);

  public interface SourcesNested<N>
      extends Nested<N>, V1VolumeProjectionFluent<V1ProjectedVolumeSourceFluent.SourcesNested<N>> {
    public N and();

    public N endSource();
  }
}
