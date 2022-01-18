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
public interface V1PersistentVolumeFluent<
        A extends io.kubernetes.client.openapi.models.V1PersistentVolumeFluent<A>>
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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.MetadataNested<A>
      withNewMetadata();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.MetadataNested<A>
      editMetadata();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  /**
   * This method has been deprecated, please use method buildSpec instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpec getSpec();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpec buildSpec();

  public A withSpec(io.kubernetes.client.openapi.models.V1PersistentVolumeSpec spec);

  public java.lang.Boolean hasSpec();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.SpecNested<A> withNewSpec();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.SpecNested<A> withNewSpecLike(
      io.kubernetes.client.openapi.models.V1PersistentVolumeSpec item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.SpecNested<A> editSpec();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.SpecNested<A> editOrNewSpec();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.SpecNested<A>
      editOrNewSpecLike(io.kubernetes.client.openapi.models.V1PersistentVolumeSpec item);

  /**
   * This method has been deprecated, please use method buildStatus instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PersistentVolumeStatus getStatus();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeStatus buildStatus();

  public A withStatus(io.kubernetes.client.openapi.models.V1PersistentVolumeStatus status);

  public java.lang.Boolean hasStatus();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.StatusNested<A>
      withNewStatus();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.StatusNested<A>
      withNewStatusLike(io.kubernetes.client.openapi.models.V1PersistentVolumeStatus item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.StatusNested<A> editStatus();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.StatusNested<A>
      editOrNewStatus();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.StatusNested<A>
      editOrNewStatusLike(io.kubernetes.client.openapi.models.V1PersistentVolumeStatus item);

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectMetaFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface SpecNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.SpecNested<N>> {
    public N and();

    public N endSpec();
  }

  public interface StatusNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1PersistentVolumeStatusFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeFluent.StatusNested<N>> {
    public N and();

    public N endStatus();
  }
}
