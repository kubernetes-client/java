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
public interface V1EvictionFluent<A extends io.kubernetes.client.openapi.models.V1EvictionFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public java.lang.Boolean hasApiVersion();

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildDeleteOptions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1DeleteOptions getDeleteOptions();

  public io.kubernetes.client.openapi.models.V1DeleteOptions buildDeleteOptions();

  public A withDeleteOptions(io.kubernetes.client.openapi.models.V1DeleteOptions deleteOptions);

  public java.lang.Boolean hasDeleteOptions();

  public io.kubernetes.client.openapi.models.V1EvictionFluent.DeleteOptionsNested<A>
      withNewDeleteOptions();

  public io.kubernetes.client.openapi.models.V1EvictionFluent.DeleteOptionsNested<A>
      withNewDeleteOptionsLike(io.kubernetes.client.openapi.models.V1DeleteOptions item);

  public io.kubernetes.client.openapi.models.V1EvictionFluent.DeleteOptionsNested<A>
      editDeleteOptions();

  public io.kubernetes.client.openapi.models.V1EvictionFluent.DeleteOptionsNested<A>
      editOrNewDeleteOptions();

  public io.kubernetes.client.openapi.models.V1EvictionFluent.DeleteOptionsNested<A>
      editOrNewDeleteOptionsLike(io.kubernetes.client.openapi.models.V1DeleteOptions item);

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

  public io.kubernetes.client.openapi.models.V1EvictionFluent.MetadataNested<A> withNewMetadata();

  public io.kubernetes.client.openapi.models.V1EvictionFluent.MetadataNested<A> withNewMetadataLike(
      io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1EvictionFluent.MetadataNested<A> editMetadata();

  public io.kubernetes.client.openapi.models.V1EvictionFluent.MetadataNested<A> editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1EvictionFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public interface DeleteOptionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1DeleteOptionsFluent<
              io.kubernetes.client.openapi.models.V1EvictionFluent.DeleteOptionsNested<N>> {
    public N and();

    public N endDeleteOptions();
  }

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectMetaFluent<
              io.kubernetes.client.openapi.models.V1EvictionFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
