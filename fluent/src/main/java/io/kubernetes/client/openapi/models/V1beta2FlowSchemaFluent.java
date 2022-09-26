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
public interface V1beta2FlowSchemaFluent<A extends V1beta2FlowSchemaFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  public String getKind();

  public A withKind(String kind);

  public Boolean hasKind();

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();

  public V1ObjectMeta buildMetadata();

  public A withMetadata(V1ObjectMeta metadata);

  public Boolean hasMetadata();

  public V1beta2FlowSchemaFluent.MetadataNested<A> withNewMetadata();

  public V1beta2FlowSchemaFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);

  public V1beta2FlowSchemaFluent.MetadataNested<A> editMetadata();

  public V1beta2FlowSchemaFluent.MetadataNested<A> editOrNewMetadata();

  public V1beta2FlowSchemaFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);

  /**
   * This method has been deprecated, please use method buildSpec instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2FlowSchemaSpec getSpec();

  public V1beta2FlowSchemaSpec buildSpec();

  public A withSpec(V1beta2FlowSchemaSpec spec);

  public Boolean hasSpec();

  public V1beta2FlowSchemaFluent.SpecNested<A> withNewSpec();

  public V1beta2FlowSchemaFluent.SpecNested<A> withNewSpecLike(V1beta2FlowSchemaSpec item);

  public V1beta2FlowSchemaFluent.SpecNested<A> editSpec();

  public V1beta2FlowSchemaFluent.SpecNested<A> editOrNewSpec();

  public V1beta2FlowSchemaFluent.SpecNested<A> editOrNewSpecLike(V1beta2FlowSchemaSpec item);

  /**
   * This method has been deprecated, please use method buildStatus instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2FlowSchemaStatus getStatus();

  public V1beta2FlowSchemaStatus buildStatus();

  public A withStatus(V1beta2FlowSchemaStatus status);

  public Boolean hasStatus();

  public V1beta2FlowSchemaFluent.StatusNested<A> withNewStatus();

  public V1beta2FlowSchemaFluent.StatusNested<A> withNewStatusLike(V1beta2FlowSchemaStatus item);

  public V1beta2FlowSchemaFluent.StatusNested<A> editStatus();

  public V1beta2FlowSchemaFluent.StatusNested<A> editOrNewStatus();

  public V1beta2FlowSchemaFluent.StatusNested<A> editOrNewStatusLike(V1beta2FlowSchemaStatus item);

  public interface MetadataNested<N>
      extends Nested<N>, V1ObjectMetaFluent<V1beta2FlowSchemaFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface SpecNested<N>
      extends Nested<N>, V1beta2FlowSchemaSpecFluent<V1beta2FlowSchemaFluent.SpecNested<N>> {
    public N and();

    public N endSpec();
  }

  public interface StatusNested<N>
      extends Nested<N>, V1beta2FlowSchemaStatusFluent<V1beta2FlowSchemaFluent.StatusNested<N>> {
    public N and();

    public N endStatus();
  }
}
