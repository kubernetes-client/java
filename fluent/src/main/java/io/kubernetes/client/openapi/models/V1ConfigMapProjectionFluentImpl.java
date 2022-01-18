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

import java.util.Iterator;
import java.util.List;

/** Generated */
public class V1ConfigMapProjectionFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent<A> {
  public V1ConfigMapProjectionFluentImpl() {}

  public V1ConfigMapProjectionFluentImpl(
      io.kubernetes.client.openapi.models.V1ConfigMapProjection instance) {
    this.withItems(instance.getItems());

    this.withName(instance.getName());

    this.withOptional(instance.getOptional());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1KeyToPathBuilder> items;
  private java.lang.String name;
  private java.lang.Boolean optional;

  public A addToItems(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1KeyToPath item) {
    if (this.items == null) {
      this.items =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1KeyToPathBuilder>();
    }
    io.kubernetes.client.openapi.models.V1KeyToPathBuilder builder =
        new io.kubernetes.client.openapi.models.V1KeyToPathBuilder(item);
    _visitables.get("items").add(index >= 0 ? index : _visitables.get("items").size(), builder);
    this.items.add(index >= 0 ? index : items.size(), builder);
    return (A) this;
  }

  public A setToItems(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1KeyToPath item) {
    if (this.items == null) {
      this.items =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1KeyToPathBuilder>();
    }
    io.kubernetes.client.openapi.models.V1KeyToPathBuilder builder =
        new io.kubernetes.client.openapi.models.V1KeyToPathBuilder(item);
    if (index < 0 || index >= _visitables.get("items").size()) {
      _visitables.get("items").add(builder);
    } else {
      _visitables.get("items").set(index, builder);
    }
    if (index < 0 || index >= items.size()) {
      items.add(builder);
    } else {
      items.set(index, builder);
    }
    return (A) this;
  }

  public A addToItems(io.kubernetes.client.openapi.models.V1KeyToPath... items) {
    if (this.items == null) {
      this.items =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1KeyToPathBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1KeyToPath item : items) {
      io.kubernetes.client.openapi.models.V1KeyToPathBuilder builder =
          new io.kubernetes.client.openapi.models.V1KeyToPathBuilder(item);
      _visitables.get("items").add(builder);
      this.items.add(builder);
    }
    return (A) this;
  }

  public A addAllToItems(
      java.util.Collection<io.kubernetes.client.openapi.models.V1KeyToPath> items) {
    if (this.items == null) {
      this.items =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1KeyToPathBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1KeyToPath item : items) {
      io.kubernetes.client.openapi.models.V1KeyToPathBuilder builder =
          new io.kubernetes.client.openapi.models.V1KeyToPathBuilder(item);
      _visitables.get("items").add(builder);
      this.items.add(builder);
    }
    return (A) this;
  }

  public A removeFromItems(io.kubernetes.client.openapi.models.V1KeyToPath... items) {
    for (io.kubernetes.client.openapi.models.V1KeyToPath item : items) {
      io.kubernetes.client.openapi.models.V1KeyToPathBuilder builder =
          new io.kubernetes.client.openapi.models.V1KeyToPathBuilder(item);
      _visitables.get("items").remove(builder);
      if (this.items != null) {
        this.items.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromItems(
      java.util.Collection<io.kubernetes.client.openapi.models.V1KeyToPath> items) {
    for (io.kubernetes.client.openapi.models.V1KeyToPath item : items) {
      io.kubernetes.client.openapi.models.V1KeyToPathBuilder builder =
          new io.kubernetes.client.openapi.models.V1KeyToPathBuilder(item);
      _visitables.get("items").remove(builder);
      if (this.items != null) {
        this.items.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromItems(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1KeyToPathBuilder>
          predicate) {
    if (items == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1KeyToPathBuilder> each = items.iterator();
    final List visitables = _visitables.get("items");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1KeyToPathBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildItems instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1KeyToPath> getItems() {
    return items != null ? build(items) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1KeyToPath> buildItems() {
    return items != null ? build(items) : null;
  }

  public io.kubernetes.client.openapi.models.V1KeyToPath buildItem(java.lang.Integer index) {
    return this.items.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1KeyToPath buildFirstItem() {
    return this.items.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1KeyToPath buildLastItem() {
    return this.items.get(items.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1KeyToPath buildMatchingItem(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1KeyToPathBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1KeyToPathBuilder item : items) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingItem(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1KeyToPathBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1KeyToPathBuilder item : items) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withItems(java.util.List<io.kubernetes.client.openapi.models.V1KeyToPath> items) {
    if (this.items != null) {
      _visitables.get("items").removeAll(this.items);
    }
    if (items != null) {
      this.items = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1KeyToPath item : items) {
        this.addToItems(item);
      }
    } else {
      this.items = null;
    }
    return (A) this;
  }

  public A withItems(io.kubernetes.client.openapi.models.V1KeyToPath... items) {
    if (this.items != null) {
      this.items.clear();
    }
    if (items != null) {
      for (io.kubernetes.client.openapi.models.V1KeyToPath item : items) {
        this.addToItems(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasItems() {
    return items != null && !items.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent.ItemsNested<A>
      addNewItem() {
    return new io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluentImpl
        .ItemsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent.ItemsNested<A>
      addNewItemLike(io.kubernetes.client.openapi.models.V1KeyToPath item) {
    return new io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluentImpl.ItemsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent.ItemsNested<A>
      setNewItemLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1KeyToPath item) {
    return new io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluentImpl.ItemsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent.ItemsNested<A> editItem(
      java.lang.Integer index) {
    if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
    return setNewItemLike(index, buildItem(index));
  }

  public io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent.ItemsNested<A>
      editFirstItem() {
    if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
    return setNewItemLike(0, buildItem(0));
  }

  public io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent.ItemsNested<A>
      editLastItem() {
    int index = items.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
    return setNewItemLike(index, buildItem(index));
  }

  public io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent.ItemsNested<A>
      editMatchingItem(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1KeyToPathBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < items.size(); i++) {
      if (predicate.test(items.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching items. No match found.");
    return setNewItemLike(index, buildItem(index));
  }

  public java.lang.String getName() {
    return this.name;
  }

  public A withName(java.lang.String name) {
    this.name = name;
    return (A) this;
  }

  public java.lang.Boolean hasName() {
    return this.name != null;
  }

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original) {
    return (A) withName(new String(original));
  }

  public java.lang.Boolean getOptional() {
    return this.optional;
  }

  public A withOptional(java.lang.Boolean optional) {
    this.optional = optional;
    return (A) this;
  }

  public java.lang.Boolean hasOptional() {
    return this.optional != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ConfigMapProjectionFluentImpl that = (V1ConfigMapProjectionFluentImpl) o;
    if (items != null ? !items.equals(that.items) : that.items != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (optional != null ? !optional.equals(that.optional) : that.optional != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(items, name, optional, super.hashCode());
  }

  public class ItemsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1KeyToPathFluentImpl<
          io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent.ItemsNested<N>>
      implements io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent.ItemsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ItemsNestedImpl(java.lang.Integer index, io.kubernetes.client.openapi.models.V1KeyToPath item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1KeyToPathBuilder(this, item);
    }

    ItemsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1KeyToPathBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1KeyToPathBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1ConfigMapProjectionFluentImpl.this.setToItems(index, builder.build());
    }

    public N endItem() {
      return and();
    }
  }
}
