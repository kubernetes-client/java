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
public interface V1EvictionFluent<A extends V1EvictionFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  /**
   * This method has been deprecated, please use method buildDeleteOptions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1DeleteOptions getDeleteOptions();

  public V1DeleteOptions buildDeleteOptions();

  public A withDeleteOptions(V1DeleteOptions deleteOptions);

  public Boolean hasDeleteOptions();

  public V1EvictionFluent.DeleteOptionsNested<A> withNewDeleteOptions();

  public V1EvictionFluent.DeleteOptionsNested<A> withNewDeleteOptionsLike(V1DeleteOptions item);

  public V1EvictionFluent.DeleteOptionsNested<A> editDeleteOptions();

  public V1EvictionFluent.DeleteOptionsNested<A> editOrNewDeleteOptions();

  public V1EvictionFluent.DeleteOptionsNested<A> editOrNewDeleteOptionsLike(V1DeleteOptions item);

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

  public V1EvictionFluent.MetadataNested<A> withNewMetadata();

  public V1EvictionFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);

  public V1EvictionFluent.MetadataNested<A> editMetadata();

  public V1EvictionFluent.MetadataNested<A> editOrNewMetadata();

  public V1EvictionFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);

  public interface DeleteOptionsNested<N>
      extends Nested<N>, V1DeleteOptionsFluent<V1EvictionFluent.DeleteOptionsNested<N>> {
    public N and();

    public N endDeleteOptions();
  }

  public interface MetadataNested<N>
      extends Nested<N>, V1ObjectMetaFluent<V1EvictionFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
