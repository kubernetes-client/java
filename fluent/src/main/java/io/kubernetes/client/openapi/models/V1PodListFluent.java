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
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V1PodListFluent<A extends V1PodListFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public Boolean hasApiVersion();

  public A addToItems(Integer index, V1Pod item);

  public A setToItems(java.lang.Integer index, io.kubernetes.client.openapi.models.V1Pod item);

  public A addToItems(io.kubernetes.client.openapi.models.V1Pod... items);

  public A addAllToItems(Collection<io.kubernetes.client.openapi.models.V1Pod> items);

  public A removeFromItems(io.kubernetes.client.openapi.models.V1Pod... items);

  public A removeAllFromItems(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Pod> items);

  public A removeMatchingFromItems(Predicate<V1PodBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildItems instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1Pod> getItems();

  public java.util.List<io.kubernetes.client.openapi.models.V1Pod> buildItems();

  public io.kubernetes.client.openapi.models.V1Pod buildItem(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1Pod buildFirstItem();

  public io.kubernetes.client.openapi.models.V1Pod buildLastItem();

  public io.kubernetes.client.openapi.models.V1Pod buildMatchingItem(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodBuilder> predicate);

  public java.lang.Boolean hasMatchingItem(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodBuilder> predicate);

  public A withItems(java.util.List<io.kubernetes.client.openapi.models.V1Pod> items);

  public A withItems(io.kubernetes.client.openapi.models.V1Pod... items);

  public java.lang.Boolean hasItems();

  public V1PodListFluent.ItemsNested<A> addNewItem();

  public io.kubernetes.client.openapi.models.V1PodListFluent.ItemsNested<A> addNewItemLike(
      io.kubernetes.client.openapi.models.V1Pod item);

  public io.kubernetes.client.openapi.models.V1PodListFluent.ItemsNested<A> setNewItemLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Pod item);

  public io.kubernetes.client.openapi.models.V1PodListFluent.ItemsNested<A> editItem(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodListFluent.ItemsNested<A> editFirstItem();

  public io.kubernetes.client.openapi.models.V1PodListFluent.ItemsNested<A> editLastItem();

  public io.kubernetes.client.openapi.models.V1PodListFluent.ItemsNested<A> editMatchingItem(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodBuilder> predicate);

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1ListMeta getMetadata();

  public io.kubernetes.client.openapi.models.V1ListMeta buildMetadata();

  public A withMetadata(io.kubernetes.client.openapi.models.V1ListMeta metadata);

  public java.lang.Boolean hasMetadata();

  public V1PodListFluent.MetadataNested<A> withNewMetadata();

  public io.kubernetes.client.openapi.models.V1PodListFluent.MetadataNested<A> withNewMetadataLike(
      io.kubernetes.client.openapi.models.V1ListMeta item);

  public io.kubernetes.client.openapi.models.V1PodListFluent.MetadataNested<A> editMetadata();

  public io.kubernetes.client.openapi.models.V1PodListFluent.MetadataNested<A> editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1PodListFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item);

  public interface ItemsNested<N> extends Nested<N>, V1PodFluent<V1PodListFluent.ItemsNested<N>> {
    public N and();

    public N endItem();
  }

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ListMetaFluent<V1PodListFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
