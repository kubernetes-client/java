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
public interface V1IngressClassFluent<
        A extends io.kubernetes.client.openapi.models.V1IngressClassFluent<A>>
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

  public io.kubernetes.client.openapi.models.V1IngressClassFluent.MetadataNested<A>
      withNewMetadata();

  public io.kubernetes.client.openapi.models.V1IngressClassFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1IngressClassFluent.MetadataNested<A> editMetadata();

  public io.kubernetes.client.openapi.models.V1IngressClassFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1IngressClassFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  /**
   * This method has been deprecated, please use method buildSpec instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1IngressClassSpec getSpec();

  public io.kubernetes.client.openapi.models.V1IngressClassSpec buildSpec();

  public A withSpec(io.kubernetes.client.openapi.models.V1IngressClassSpec spec);

  public java.lang.Boolean hasSpec();

  public io.kubernetes.client.openapi.models.V1IngressClassFluent.SpecNested<A> withNewSpec();

  public io.kubernetes.client.openapi.models.V1IngressClassFluent.SpecNested<A> withNewSpecLike(
      io.kubernetes.client.openapi.models.V1IngressClassSpec item);

  public io.kubernetes.client.openapi.models.V1IngressClassFluent.SpecNested<A> editSpec();

  public io.kubernetes.client.openapi.models.V1IngressClassFluent.SpecNested<A> editOrNewSpec();

  public io.kubernetes.client.openapi.models.V1IngressClassFluent.SpecNested<A> editOrNewSpecLike(
      io.kubernetes.client.openapi.models.V1IngressClassSpec item);

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectMetaFluent<
              io.kubernetes.client.openapi.models.V1IngressClassFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface SpecNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1IngressClassSpecFluent<
              io.kubernetes.client.openapi.models.V1IngressClassFluent.SpecNested<N>> {
    public N and();

    public N endSpec();
  }
}
