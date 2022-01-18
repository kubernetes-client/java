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
public interface V1APIResourceListFluent<
        A extends io.kubernetes.client.openapi.models.V1APIResourceListFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public java.lang.Boolean hasApiVersion();

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original);

  public java.lang.String getGroupVersion();

  public A withGroupVersion(java.lang.String groupVersion);

  public java.lang.Boolean hasGroupVersion();

  /** Method is deprecated. use withGroupVersion instead. */
  @java.lang.Deprecated
  public A withNewGroupVersion(java.lang.String original);

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original);

  public A addToResources(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1APIResource item);

  public A setToResources(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1APIResource item);

  public A addToResources(io.kubernetes.client.openapi.models.V1APIResource... items);

  public A addAllToResources(
      java.util.Collection<io.kubernetes.client.openapi.models.V1APIResource> items);

  public A removeFromResources(io.kubernetes.client.openapi.models.V1APIResource... items);

  public A removeAllFromResources(
      java.util.Collection<io.kubernetes.client.openapi.models.V1APIResource> items);

  public A removeMatchingFromResources(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIResourceBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildResources instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1APIResource> getResources();

  public java.util.List<io.kubernetes.client.openapi.models.V1APIResource> buildResources();

  public io.kubernetes.client.openapi.models.V1APIResource buildResource(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1APIResource buildFirstResource();

  public io.kubernetes.client.openapi.models.V1APIResource buildLastResource();

  public io.kubernetes.client.openapi.models.V1APIResource buildMatchingResource(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIResourceBuilder>
          predicate);

  public java.lang.Boolean hasMatchingResource(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIResourceBuilder>
          predicate);

  public A withResources(
      java.util.List<io.kubernetes.client.openapi.models.V1APIResource> resources);

  public A withResources(io.kubernetes.client.openapi.models.V1APIResource... resources);

  public java.lang.Boolean hasResources();

  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A>
      addNewResource();

  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A>
      addNewResourceLike(io.kubernetes.client.openapi.models.V1APIResource item);

  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A>
      setNewResourceLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1APIResource item);

  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A>
      editResource(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A>
      editFirstResource();

  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A>
      editLastResource();

  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A>
      editMatchingResource(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIResourceBuilder>
              predicate);

  public interface ResourcesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1APIResourceFluent<
              io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<N>> {
    public N and();

    public N endResource();
  }
}
