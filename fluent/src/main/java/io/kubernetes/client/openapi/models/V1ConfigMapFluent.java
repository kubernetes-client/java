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
public interface V1ConfigMapFluent<
        A extends io.kubernetes.client.openapi.models.V1ConfigMapFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public java.lang.Boolean hasApiVersion();

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original);

  public A addToBinaryData(java.lang.String key, byte[] value);

  public A addToBinaryData(java.util.Map<java.lang.String, byte[]> map);

  public A removeFromBinaryData(java.lang.String key);

  public A removeFromBinaryData(java.util.Map<java.lang.String, byte[]> map);

  public java.util.Map<java.lang.String, byte[]> getBinaryData();

  public <K, V> A withBinaryData(java.util.Map<java.lang.String, byte[]> binaryData);

  public java.lang.Boolean hasBinaryData();

  public A addToData(java.lang.String key, java.lang.String value);

  public A addToData(java.util.Map<java.lang.String, java.lang.String> map);

  public A removeFromData(java.lang.String key);

  public A removeFromData(java.util.Map<java.lang.String, java.lang.String> map);

  public java.util.Map<java.lang.String, java.lang.String> getData();

  public <K, V> A withData(java.util.Map<java.lang.String, java.lang.String> data);

  public java.lang.Boolean hasData();

  public java.lang.Boolean getImmutable();

  public A withImmutable(java.lang.Boolean immutable);

  public java.lang.Boolean hasImmutable();

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

  public io.kubernetes.client.openapi.models.V1ConfigMapFluent.MetadataNested<A> withNewMetadata();

  public io.kubernetes.client.openapi.models.V1ConfigMapFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1ConfigMapFluent.MetadataNested<A> editMetadata();

  public io.kubernetes.client.openapi.models.V1ConfigMapFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1ConfigMapFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectMetaFluent<
              io.kubernetes.client.openapi.models.V1ConfigMapFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
