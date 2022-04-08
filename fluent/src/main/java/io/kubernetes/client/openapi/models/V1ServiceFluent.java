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
public interface V1ServiceFluent<A extends V1ServiceFluent<A>> extends Fluent<A> {
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

  public V1ServiceFluent.MetadataNested<A> withNewMetadata();

  public io.kubernetes.client.openapi.models.V1ServiceFluent.MetadataNested<A> withNewMetadataLike(
      io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1ServiceFluent.MetadataNested<A> editMetadata();

  public io.kubernetes.client.openapi.models.V1ServiceFluent.MetadataNested<A> editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1ServiceFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  /**
   * This method has been deprecated, please use method buildSpec instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1ServiceSpec getSpec();

  public io.kubernetes.client.openapi.models.V1ServiceSpec buildSpec();

  public A withSpec(io.kubernetes.client.openapi.models.V1ServiceSpec spec);

  public java.lang.Boolean hasSpec();

  public V1ServiceFluent.SpecNested<A> withNewSpec();

  public io.kubernetes.client.openapi.models.V1ServiceFluent.SpecNested<A> withNewSpecLike(
      io.kubernetes.client.openapi.models.V1ServiceSpec item);

  public io.kubernetes.client.openapi.models.V1ServiceFluent.SpecNested<A> editSpec();

  public io.kubernetes.client.openapi.models.V1ServiceFluent.SpecNested<A> editOrNewSpec();

  public io.kubernetes.client.openapi.models.V1ServiceFluent.SpecNested<A> editOrNewSpecLike(
      io.kubernetes.client.openapi.models.V1ServiceSpec item);

  /**
   * This method has been deprecated, please use method buildStatus instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1ServiceStatus getStatus();

  public io.kubernetes.client.openapi.models.V1ServiceStatus buildStatus();

  public A withStatus(io.kubernetes.client.openapi.models.V1ServiceStatus status);

  public java.lang.Boolean hasStatus();

  public V1ServiceFluent.StatusNested<A> withNewStatus();

  public io.kubernetes.client.openapi.models.V1ServiceFluent.StatusNested<A> withNewStatusLike(
      io.kubernetes.client.openapi.models.V1ServiceStatus item);

  public io.kubernetes.client.openapi.models.V1ServiceFluent.StatusNested<A> editStatus();

  public io.kubernetes.client.openapi.models.V1ServiceFluent.StatusNested<A> editOrNewStatus();

  public io.kubernetes.client.openapi.models.V1ServiceFluent.StatusNested<A> editOrNewStatusLike(
      io.kubernetes.client.openapi.models.V1ServiceStatus item);

  public interface MetadataNested<N>
      extends Nested<N>, V1ObjectMetaFluent<V1ServiceFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface SpecNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ServiceSpecFluent<V1ServiceFluent.SpecNested<N>> {
    public N and();

    public N endSpec();
  }

  public interface StatusNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ServiceStatusFluent<V1ServiceFluent.StatusNested<N>> {
    public N and();

    public N endStatus();
  }
}
