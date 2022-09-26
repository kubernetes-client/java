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
public interface V1ConfigMapVolumeSourceFluent<A extends V1ConfigMapVolumeSourceFluent<A>>
    extends Fluent<A> {
  public Integer getDefaultMode();

  public A withDefaultMode(Integer defaultMode);

  public Boolean hasDefaultMode();

  public A addToItems(Integer index, V1KeyToPath item);

  public A setToItems(Integer index, V1KeyToPath item);

  public A addToItems(io.kubernetes.client.openapi.models.V1KeyToPath... items);

  public A addAllToItems(Collection<V1KeyToPath> items);

  public A removeFromItems(io.kubernetes.client.openapi.models.V1KeyToPath... items);

  public A removeAllFromItems(Collection<V1KeyToPath> items);

  public A removeMatchingFromItems(Predicate<V1KeyToPathBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildItems instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1KeyToPath> getItems();

  public List<V1KeyToPath> buildItems();

  public V1KeyToPath buildItem(Integer index);

  public V1KeyToPath buildFirstItem();

  public V1KeyToPath buildLastItem();

  public V1KeyToPath buildMatchingItem(Predicate<V1KeyToPathBuilder> predicate);

  public Boolean hasMatchingItem(Predicate<V1KeyToPathBuilder> predicate);

  public A withItems(List<V1KeyToPath> items);

  public A withItems(io.kubernetes.client.openapi.models.V1KeyToPath... items);

  public Boolean hasItems();

  public V1ConfigMapVolumeSourceFluent.ItemsNested<A> addNewItem();

  public V1ConfigMapVolumeSourceFluent.ItemsNested<A> addNewItemLike(V1KeyToPath item);

  public V1ConfigMapVolumeSourceFluent.ItemsNested<A> setNewItemLike(
      Integer index, V1KeyToPath item);

  public V1ConfigMapVolumeSourceFluent.ItemsNested<A> editItem(Integer index);

  public V1ConfigMapVolumeSourceFluent.ItemsNested<A> editFirstItem();

  public V1ConfigMapVolumeSourceFluent.ItemsNested<A> editLastItem();

  public V1ConfigMapVolumeSourceFluent.ItemsNested<A> editMatchingItem(
      Predicate<V1KeyToPathBuilder> predicate);

  public String getName();

  public A withName(String name);

  public Boolean hasName();

  public Boolean getOptional();

  public A withOptional(Boolean optional);

  public Boolean hasOptional();

  public A withOptional();

  public interface ItemsNested<N>
      extends Nested<N>, V1KeyToPathFluent<V1ConfigMapVolumeSourceFluent.ItemsNested<N>> {
    public N and();

    public N endItem();
  }
}
