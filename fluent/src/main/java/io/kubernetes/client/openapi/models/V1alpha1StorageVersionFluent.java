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

/** Generated */
public interface V1alpha1StorageVersionFluent<A extends V1alpha1StorageVersionFluent<A>>
    extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public Boolean hasApiVersion();

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);

  public java.lang.Boolean hasMetadata();

  public V1alpha1StorageVersionFluent.MetadataNested<A> withNewMetadata();

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.MetadataNested<A>
      editMetadata();

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public Object getSpec();

  public A withSpec(java.lang.Object spec);

  public java.lang.Boolean hasSpec();

  /**
   * This method has been deprecated, please use method buildStatus instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1alpha1StorageVersionStatus getStatus();

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus buildStatus();

  public A withStatus(io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus status);

  public java.lang.Boolean hasStatus();

  public V1alpha1StorageVersionFluent.StatusNested<A> withNewStatus();

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.StatusNested<A>
      withNewStatusLike(io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus item);

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.StatusNested<A>
      editStatus();

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.StatusNested<A>
      editOrNewStatus();

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.StatusNested<A>
      editOrNewStatusLike(io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus item);

  public interface MetadataNested<N>
      extends Nested<N>, V1ObjectMetaFluent<V1alpha1StorageVersionFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface StatusNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1alpha1StorageVersionStatusFluent<V1alpha1StorageVersionFluent.StatusNested<N>> {
    public N and();

    public N endStatus();
  }
}
