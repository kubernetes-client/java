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
public interface V1RuntimeClassListFluent<A extends V1RuntimeClassListFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  public A addToItems(Integer index, V1RuntimeClass item);

  public A setToItems(Integer index, V1RuntimeClass item);

  public A addToItems(io.kubernetes.client.openapi.models.V1RuntimeClass... items);

  public A addAllToItems(Collection<V1RuntimeClass> items);

  public A removeFromItems(io.kubernetes.client.openapi.models.V1RuntimeClass... items);

  public A removeAllFromItems(Collection<V1RuntimeClass> items);

  public A removeMatchingFromItems(Predicate<V1RuntimeClassBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildItems instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1RuntimeClass> getItems();

  public List<V1RuntimeClass> buildItems();

  public V1RuntimeClass buildItem(Integer index);

  public V1RuntimeClass buildFirstItem();

  public V1RuntimeClass buildLastItem();

  public V1RuntimeClass buildMatchingItem(Predicate<V1RuntimeClassBuilder> predicate);

  public Boolean hasMatchingItem(Predicate<V1RuntimeClassBuilder> predicate);

  public A withItems(List<V1RuntimeClass> items);

  public A withItems(io.kubernetes.client.openapi.models.V1RuntimeClass... items);

  public Boolean hasItems();

  public V1RuntimeClassListFluent.ItemsNested<A> addNewItem();

  public V1RuntimeClassListFluent.ItemsNested<A> addNewItemLike(V1RuntimeClass item);

  public V1RuntimeClassListFluent.ItemsNested<A> setNewItemLike(Integer index, V1RuntimeClass item);

  public V1RuntimeClassListFluent.ItemsNested<A> editItem(Integer index);

  public V1RuntimeClassListFluent.ItemsNested<A> editFirstItem();

  public V1RuntimeClassListFluent.ItemsNested<A> editLastItem();

  public V1RuntimeClassListFluent.ItemsNested<A> editMatchingItem(
      Predicate<V1RuntimeClassBuilder> predicate);

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

  public V1RuntimeClassListFluent.MetadataNested<A> withNewMetadata();

  public V1RuntimeClassListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);

  public V1RuntimeClassListFluent.MetadataNested<A> editMetadata();

  public V1RuntimeClassListFluent.MetadataNested<A> editOrNewMetadata();

  public V1RuntimeClassListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);

  public interface ItemsNested<N>
      extends Nested<N>, V1RuntimeClassFluent<V1RuntimeClassListFluent.ItemsNested<N>> {
    public N and();

    public N endItem();
  }

  public interface MetadataNested<N>
      extends Nested<N>, V1ListMetaFluent<V1RuntimeClassListFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
