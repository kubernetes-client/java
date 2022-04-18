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
public interface V1ServiceAccountListFluent<A extends V1ServiceAccountListFluent<A>>
    extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public Boolean hasApiVersion();

  public A addToItems(Integer index, io.kubernetes.client.openapi.models.V1ServiceAccount item);

  public A setToItems(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ServiceAccount item);

  public A addToItems(io.kubernetes.client.openapi.models.V1ServiceAccount... items);

  public A addAllToItems(Collection<io.kubernetes.client.openapi.models.V1ServiceAccount> items);

  public A removeFromItems(io.kubernetes.client.openapi.models.V1ServiceAccount... items);

  public A removeAllFromItems(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ServiceAccount> items);

  public A removeMatchingFromItems(Predicate<V1ServiceAccountBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildItems instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1ServiceAccount> getItems();

  public java.util.List<io.kubernetes.client.openapi.models.V1ServiceAccount> buildItems();

  public io.kubernetes.client.openapi.models.V1ServiceAccount buildItem(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ServiceAccount buildFirstItem();

  public io.kubernetes.client.openapi.models.V1ServiceAccount buildLastItem();

  public io.kubernetes.client.openapi.models.V1ServiceAccount buildMatchingItem(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ServiceAccountBuilder>
          predicate);

  public java.lang.Boolean hasMatchingItem(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ServiceAccountBuilder>
          predicate);

  public A withItems(java.util.List<io.kubernetes.client.openapi.models.V1ServiceAccount> items);

  public A withItems(io.kubernetes.client.openapi.models.V1ServiceAccount... items);

  public java.lang.Boolean hasItems();

  public V1ServiceAccountListFluent.ItemsNested<A> addNewItem();

  public V1ServiceAccountListFluent.ItemsNested<A> addNewItemLike(
      io.kubernetes.client.openapi.models.V1ServiceAccount item);

  public io.kubernetes.client.openapi.models.V1ServiceAccountListFluent.ItemsNested<A>
      setNewItemLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1ServiceAccount item);

  public io.kubernetes.client.openapi.models.V1ServiceAccountListFluent.ItemsNested<A> editItem(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ServiceAccountListFluent.ItemsNested<A>
      editFirstItem();

  public io.kubernetes.client.openapi.models.V1ServiceAccountListFluent.ItemsNested<A>
      editLastItem();

  public io.kubernetes.client.openapi.models.V1ServiceAccountListFluent.ItemsNested<A>
      editMatchingItem(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ServiceAccountBuilder>
              predicate);

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

  public V1ServiceAccountListFluent.MetadataNested<A> withNewMetadata();

  public io.kubernetes.client.openapi.models.V1ServiceAccountListFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item);

  public io.kubernetes.client.openapi.models.V1ServiceAccountListFluent.MetadataNested<A>
      editMetadata();

  public io.kubernetes.client.openapi.models.V1ServiceAccountListFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1ServiceAccountListFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item);

  public interface ItemsNested<N>
      extends Nested<N>, V1ServiceAccountFluent<V1ServiceAccountListFluent.ItemsNested<N>> {
    public N and();

    public N endItem();
  }

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ListMetaFluent<V1ServiceAccountListFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
