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

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  public A addToItems(Integer index, V1Pod item);

  public A setToItems(Integer index, V1Pod item);

  public A addToItems(io.kubernetes.client.openapi.models.V1Pod... items);

  public A addAllToItems(Collection<V1Pod> items);

  public A removeFromItems(io.kubernetes.client.openapi.models.V1Pod... items);

  public A removeAllFromItems(Collection<V1Pod> items);

  public A removeMatchingFromItems(Predicate<V1PodBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildItems instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Pod> getItems();

  public List<V1Pod> buildItems();

  public V1Pod buildItem(Integer index);

  public V1Pod buildFirstItem();

  public V1Pod buildLastItem();

  public V1Pod buildMatchingItem(Predicate<V1PodBuilder> predicate);

  public Boolean hasMatchingItem(Predicate<V1PodBuilder> predicate);

  public A withItems(List<V1Pod> items);

  public A withItems(io.kubernetes.client.openapi.models.V1Pod... items);

  public Boolean hasItems();

  public V1PodListFluent.ItemsNested<A> addNewItem();

  public V1PodListFluent.ItemsNested<A> addNewItemLike(V1Pod item);

  public V1PodListFluent.ItemsNested<A> setNewItemLike(Integer index, V1Pod item);

  public V1PodListFluent.ItemsNested<A> editItem(Integer index);

  public V1PodListFluent.ItemsNested<A> editFirstItem();

  public V1PodListFluent.ItemsNested<A> editLastItem();

  public V1PodListFluent.ItemsNested<A> editMatchingItem(Predicate<V1PodBuilder> predicate);

  public String getKind();

  public A withKind(String kind);

  public Boolean hasKind();

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ListMeta getMetadata();

  public V1ListMeta buildMetadata();

  public A withMetadata(V1ListMeta metadata);

  public Boolean hasMetadata();

  public V1PodListFluent.MetadataNested<A> withNewMetadata();

  public V1PodListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);

  public V1PodListFluent.MetadataNested<A> editMetadata();

  public V1PodListFluent.MetadataNested<A> editOrNewMetadata();

  public V1PodListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);

  public interface ItemsNested<N> extends Nested<N>, V1PodFluent<V1PodListFluent.ItemsNested<N>> {
    public N and();

    public N endItem();
  }

  public interface MetadataNested<N>
      extends Nested<N>, V1ListMetaFluent<V1PodListFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
