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
public interface V1ClusterRoleBindingListFluent<A extends V1ClusterRoleBindingListFluent<A>>
    extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  public A addToItems(Integer index, V1ClusterRoleBinding item);

  public A setToItems(Integer index, V1ClusterRoleBinding item);

  public A addToItems(io.kubernetes.client.openapi.models.V1ClusterRoleBinding... items);

  public A addAllToItems(Collection<V1ClusterRoleBinding> items);

  public A removeFromItems(io.kubernetes.client.openapi.models.V1ClusterRoleBinding... items);

  public A removeAllFromItems(Collection<V1ClusterRoleBinding> items);

  public A removeMatchingFromItems(Predicate<V1ClusterRoleBindingBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildItems instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ClusterRoleBinding> getItems();

  public List<V1ClusterRoleBinding> buildItems();

  public V1ClusterRoleBinding buildItem(Integer index);

  public V1ClusterRoleBinding buildFirstItem();

  public V1ClusterRoleBinding buildLastItem();

  public V1ClusterRoleBinding buildMatchingItem(Predicate<V1ClusterRoleBindingBuilder> predicate);

  public Boolean hasMatchingItem(Predicate<V1ClusterRoleBindingBuilder> predicate);

  public A withItems(List<V1ClusterRoleBinding> items);

  public A withItems(io.kubernetes.client.openapi.models.V1ClusterRoleBinding... items);

  public Boolean hasItems();

  public V1ClusterRoleBindingListFluent.ItemsNested<A> addNewItem();

  public V1ClusterRoleBindingListFluent.ItemsNested<A> addNewItemLike(V1ClusterRoleBinding item);

  public V1ClusterRoleBindingListFluent.ItemsNested<A> setNewItemLike(
      Integer index, V1ClusterRoleBinding item);

  public V1ClusterRoleBindingListFluent.ItemsNested<A> editItem(Integer index);

  public V1ClusterRoleBindingListFluent.ItemsNested<A> editFirstItem();

  public V1ClusterRoleBindingListFluent.ItemsNested<A> editLastItem();

  public V1ClusterRoleBindingListFluent.ItemsNested<A> editMatchingItem(
      Predicate<V1ClusterRoleBindingBuilder> predicate);

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

  public V1ClusterRoleBindingListFluent.MetadataNested<A> withNewMetadata();

  public V1ClusterRoleBindingListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);

  public V1ClusterRoleBindingListFluent.MetadataNested<A> editMetadata();

  public V1ClusterRoleBindingListFluent.MetadataNested<A> editOrNewMetadata();

  public V1ClusterRoleBindingListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);

  public interface ItemsNested<N>
      extends Nested<N>, V1ClusterRoleBindingFluent<V1ClusterRoleBindingListFluent.ItemsNested<N>> {
    public N and();

    public N endItem();
  }

  public interface MetadataNested<N>
      extends Nested<N>, V1ListMetaFluent<V1ClusterRoleBindingListFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
