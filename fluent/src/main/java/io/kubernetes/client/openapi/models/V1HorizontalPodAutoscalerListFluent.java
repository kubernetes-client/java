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
public interface V1HorizontalPodAutoscalerListFluent<
        A extends V1HorizontalPodAutoscalerListFluent<A>>
    extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  public A addToItems(Integer index, V1HorizontalPodAutoscaler item);

  public A setToItems(Integer index, V1HorizontalPodAutoscaler item);

  public A addToItems(io.kubernetes.client.openapi.models.V1HorizontalPodAutoscaler... items);

  public A addAllToItems(Collection<V1HorizontalPodAutoscaler> items);

  public A removeFromItems(io.kubernetes.client.openapi.models.V1HorizontalPodAutoscaler... items);

  public A removeAllFromItems(Collection<V1HorizontalPodAutoscaler> items);

  public A removeMatchingFromItems(Predicate<V1HorizontalPodAutoscalerBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildItems instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1HorizontalPodAutoscaler> getItems();

  public List<V1HorizontalPodAutoscaler> buildItems();

  public V1HorizontalPodAutoscaler buildItem(Integer index);

  public V1HorizontalPodAutoscaler buildFirstItem();

  public V1HorizontalPodAutoscaler buildLastItem();

  public V1HorizontalPodAutoscaler buildMatchingItem(
      Predicate<V1HorizontalPodAutoscalerBuilder> predicate);

  public Boolean hasMatchingItem(Predicate<V1HorizontalPodAutoscalerBuilder> predicate);

  public A withItems(List<V1HorizontalPodAutoscaler> items);

  public A withItems(io.kubernetes.client.openapi.models.V1HorizontalPodAutoscaler... items);

  public Boolean hasItems();

  public V1HorizontalPodAutoscalerListFluent.ItemsNested<A> addNewItem();

  public V1HorizontalPodAutoscalerListFluent.ItemsNested<A> addNewItemLike(
      V1HorizontalPodAutoscaler item);

  public V1HorizontalPodAutoscalerListFluent.ItemsNested<A> setNewItemLike(
      Integer index, V1HorizontalPodAutoscaler item);

  public V1HorizontalPodAutoscalerListFluent.ItemsNested<A> editItem(Integer index);

  public V1HorizontalPodAutoscalerListFluent.ItemsNested<A> editFirstItem();

  public V1HorizontalPodAutoscalerListFluent.ItemsNested<A> editLastItem();

  public V1HorizontalPodAutoscalerListFluent.ItemsNested<A> editMatchingItem(
      Predicate<V1HorizontalPodAutoscalerBuilder> predicate);

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

  public V1HorizontalPodAutoscalerListFluent.MetadataNested<A> withNewMetadata();

  public V1HorizontalPodAutoscalerListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);

  public V1HorizontalPodAutoscalerListFluent.MetadataNested<A> editMetadata();

  public V1HorizontalPodAutoscalerListFluent.MetadataNested<A> editOrNewMetadata();

  public V1HorizontalPodAutoscalerListFluent.MetadataNested<A> editOrNewMetadataLike(
      V1ListMeta item);

  public interface ItemsNested<N>
      extends Nested<N>,
          V1HorizontalPodAutoscalerFluent<V1HorizontalPodAutoscalerListFluent.ItemsNested<N>> {
    public N and();

    public N endItem();
  }

  public interface MetadataNested<N>
      extends Nested<N>, V1ListMetaFluent<V1HorizontalPodAutoscalerListFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
