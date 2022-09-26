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
public interface V1PodFluent<A extends V1PodFluent<A>> extends Fluent<A> {
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

  public V1PodFluent.MetadataNested<A> withNewMetadata();

  public V1PodFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);

  public V1PodFluent.MetadataNested<A> editMetadata();

  public V1PodFluent.MetadataNested<A> editOrNewMetadata();

  public V1PodFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);

  /**
   * This method has been deprecated, please use method buildSpec instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1PodSpec getSpec();

  public V1PodSpec buildSpec();

  public A withSpec(V1PodSpec spec);

  public Boolean hasSpec();

  public V1PodFluent.SpecNested<A> withNewSpec();

  public V1PodFluent.SpecNested<A> withNewSpecLike(V1PodSpec item);

  public V1PodFluent.SpecNested<A> editSpec();

  public V1PodFluent.SpecNested<A> editOrNewSpec();

  public V1PodFluent.SpecNested<A> editOrNewSpecLike(V1PodSpec item);

  /**
   * This method has been deprecated, please use method buildStatus instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1PodStatus getStatus();

  public V1PodStatus buildStatus();

  public A withStatus(V1PodStatus status);

  public Boolean hasStatus();

  public V1PodFluent.StatusNested<A> withNewStatus();

  public V1PodFluent.StatusNested<A> withNewStatusLike(V1PodStatus item);

  public V1PodFluent.StatusNested<A> editStatus();

  public V1PodFluent.StatusNested<A> editOrNewStatus();

  public V1PodFluent.StatusNested<A> editOrNewStatusLike(V1PodStatus item);

  public interface MetadataNested<N>
      extends Nested<N>, V1ObjectMetaFluent<V1PodFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface SpecNested<N> extends Nested<N>, V1PodSpecFluent<V1PodFluent.SpecNested<N>> {
    public N and();

    public N endSpec();
  }

  public interface StatusNested<N>
      extends Nested<N>, V1PodStatusFluent<V1PodFluent.StatusNested<N>> {
    public N and();

    public N endStatus();
  }
}
