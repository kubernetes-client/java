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
public interface V1ProjectedVolumeSourceFluent<
        A extends io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.Integer getDefaultMode();

  public A withDefaultMode(java.lang.Integer defaultMode);

  public java.lang.Boolean hasDefaultMode();

  public A addToSources(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeProjection item);

  public A setToSources(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeProjection item);

  public A addToSources(io.kubernetes.client.openapi.models.V1VolumeProjection... items);

  public A addAllToSources(
      java.util.Collection<io.kubernetes.client.openapi.models.V1VolumeProjection> items);

  public A removeFromSources(io.kubernetes.client.openapi.models.V1VolumeProjection... items);

  public A removeAllFromSources(
      java.util.Collection<io.kubernetes.client.openapi.models.V1VolumeProjection> items);

  public A removeMatchingFromSources(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildSources instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1VolumeProjection> getSources();

  public java.util.List<io.kubernetes.client.openapi.models.V1VolumeProjection> buildSources();

  public io.kubernetes.client.openapi.models.V1VolumeProjection buildSource(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1VolumeProjection buildFirstSource();

  public io.kubernetes.client.openapi.models.V1VolumeProjection buildLastSource();

  public io.kubernetes.client.openapi.models.V1VolumeProjection buildMatchingSource(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder>
          predicate);

  public java.lang.Boolean hasMatchingSource(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder>
          predicate);

  public A withSources(
      java.util.List<io.kubernetes.client.openapi.models.V1VolumeProjection> sources);

  public A withSources(io.kubernetes.client.openapi.models.V1VolumeProjection... sources);

  public java.lang.Boolean hasSources();

  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A>
      addNewSource();

  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A>
      addNewSourceLike(io.kubernetes.client.openapi.models.V1VolumeProjection item);

  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A>
      setNewSourceLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeProjection item);

  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A>
      editSource(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A>
      editFirstSource();

  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A>
      editLastSource();

  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A>
      editMatchingSource(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder>
              predicate);

  public interface SourcesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1VolumeProjectionFluent<
              io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<N>> {
    public N and();

    public N endSource();
  }
}
