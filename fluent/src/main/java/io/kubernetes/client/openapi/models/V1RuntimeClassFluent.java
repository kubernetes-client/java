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
public interface V1RuntimeClassFluent<A extends V1RuntimeClassFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public Boolean hasApiVersion();

  public java.lang.String getHandler();

  public A withHandler(java.lang.String handler);

  public java.lang.Boolean hasHandler();

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

  public V1RuntimeClassFluent.MetadataNested<A> withNewMetadata();

  public io.kubernetes.client.openapi.models.V1RuntimeClassFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1RuntimeClassFluent.MetadataNested<A> editMetadata();

  public io.kubernetes.client.openapi.models.V1RuntimeClassFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1RuntimeClassFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  /**
   * This method has been deprecated, please use method buildOverhead instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1Overhead getOverhead();

  public io.kubernetes.client.openapi.models.V1Overhead buildOverhead();

  public A withOverhead(io.kubernetes.client.openapi.models.V1Overhead overhead);

  public java.lang.Boolean hasOverhead();

  public V1RuntimeClassFluent.OverheadNested<A> withNewOverhead();

  public io.kubernetes.client.openapi.models.V1RuntimeClassFluent.OverheadNested<A>
      withNewOverheadLike(io.kubernetes.client.openapi.models.V1Overhead item);

  public io.kubernetes.client.openapi.models.V1RuntimeClassFluent.OverheadNested<A> editOverhead();

  public io.kubernetes.client.openapi.models.V1RuntimeClassFluent.OverheadNested<A>
      editOrNewOverhead();

  public io.kubernetes.client.openapi.models.V1RuntimeClassFluent.OverheadNested<A>
      editOrNewOverheadLike(io.kubernetes.client.openapi.models.V1Overhead item);

  /**
   * This method has been deprecated, please use method buildScheduling instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1Scheduling getScheduling();

  public io.kubernetes.client.openapi.models.V1Scheduling buildScheduling();

  public A withScheduling(io.kubernetes.client.openapi.models.V1Scheduling scheduling);

  public java.lang.Boolean hasScheduling();

  public V1RuntimeClassFluent.SchedulingNested<A> withNewScheduling();

  public io.kubernetes.client.openapi.models.V1RuntimeClassFluent.SchedulingNested<A>
      withNewSchedulingLike(io.kubernetes.client.openapi.models.V1Scheduling item);

  public io.kubernetes.client.openapi.models.V1RuntimeClassFluent.SchedulingNested<A>
      editScheduling();

  public io.kubernetes.client.openapi.models.V1RuntimeClassFluent.SchedulingNested<A>
      editOrNewScheduling();

  public io.kubernetes.client.openapi.models.V1RuntimeClassFluent.SchedulingNested<A>
      editOrNewSchedulingLike(io.kubernetes.client.openapi.models.V1Scheduling item);

  public interface MetadataNested<N>
      extends Nested<N>, V1ObjectMetaFluent<V1RuntimeClassFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface OverheadNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1OverheadFluent<V1RuntimeClassFluent.OverheadNested<N>> {
    public N and();

    public N endOverhead();
  }

  public interface SchedulingNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1SchedulingFluent<V1RuntimeClassFluent.SchedulingNested<N>> {
    public N and();

    public N endScheduling();
  }
}
