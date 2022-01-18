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
public interface V1EndpointsFluent<
        A extends io.kubernetes.client.openapi.models.V1EndpointsFluent<A>>
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

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);

  public java.lang.Boolean hasMetadata();

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.MetadataNested<A> withNewMetadata();

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.MetadataNested<A> editMetadata();

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public A addToSubsets(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointSubset item);

  public A setToSubsets(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointSubset item);

  public A addToSubsets(io.kubernetes.client.openapi.models.V1EndpointSubset... items);

  public A addAllToSubsets(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointSubset> items);

  public A removeFromSubsets(io.kubernetes.client.openapi.models.V1EndpointSubset... items);

  public A removeAllFromSubsets(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointSubset> items);

  public A removeMatchingFromSubsets(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildSubsets instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1EndpointSubset> getSubsets();

  public java.util.List<io.kubernetes.client.openapi.models.V1EndpointSubset> buildSubsets();

  public io.kubernetes.client.openapi.models.V1EndpointSubset buildSubset(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1EndpointSubset buildFirstSubset();

  public io.kubernetes.client.openapi.models.V1EndpointSubset buildLastSubset();

  public io.kubernetes.client.openapi.models.V1EndpointSubset buildMatchingSubset(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder>
          predicate);

  public java.lang.Boolean hasMatchingSubset(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder>
          predicate);

  public A withSubsets(
      java.util.List<io.kubernetes.client.openapi.models.V1EndpointSubset> subsets);

  public A withSubsets(io.kubernetes.client.openapi.models.V1EndpointSubset... subsets);

  public java.lang.Boolean hasSubsets();

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.SubsetsNested<A> addNewSubset();

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.SubsetsNested<A> addNewSubsetLike(
      io.kubernetes.client.openapi.models.V1EndpointSubset item);

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.SubsetsNested<A> setNewSubsetLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointSubset item);

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.SubsetsNested<A> editSubset(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.SubsetsNested<A> editFirstSubset();

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.SubsetsNested<A> editLastSubset();

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.SubsetsNested<A> editMatchingSubset(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder>
          predicate);

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectMetaFluent<
              io.kubernetes.client.openapi.models.V1EndpointsFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface SubsetsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1EndpointSubsetFluent<
              io.kubernetes.client.openapi.models.V1EndpointsFluent.SubsetsNested<N>> {
    public N and();

    public N endSubset();
  }
}
