package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1SecretProjectionFluent<A extends io.kubernetes.client.openapi.models.V1SecretProjectionFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1KeyToPathBuilder> items;
  private String name;
  private Boolean optional;

  public V1SecretProjectionFluent() {
  }
  
  public V1SecretProjectionFluent(V1SecretProjection instance) {
    this.copyInstance(instance);
  }

  public A addAllToItems(Collection<V1KeyToPath> items) {
    if (this.items == null) {
      this.items = new ArrayList();
    }
    for (V1KeyToPath item : items) {
        V1KeyToPathBuilder builder = new V1KeyToPathBuilder(item);
        _visitables.get("items").add(builder);
        this.items.add(builder);
    }
    return (A) this;
  }
  
  public ItemsNested<A> addNewItem() {
    return new ItemsNested(-1, null);
  }
  
  public ItemsNested<A> addNewItemLike(V1KeyToPath item) {
    return new ItemsNested(-1, item);
  }
  
  public A addToItems(V1KeyToPath... items) {
    if (this.items == null) {
      this.items = new ArrayList();
    }
    for (V1KeyToPath item : items) {
        V1KeyToPathBuilder builder = new V1KeyToPathBuilder(item);
        _visitables.get("items").add(builder);
        this.items.add(builder);
    }
    return (A) this;
  }
  
  public A addToItems(int index,V1KeyToPath item) {
    if (this.items == null) {
      this.items = new ArrayList();
    }
    V1KeyToPathBuilder builder = new V1KeyToPathBuilder(item);
    if (index < 0 || index >= items.size()) {
        _visitables.get("items").add(builder);
        items.add(builder);
    } else {
        _visitables.get("items").add(builder);
        items.add(index, builder);
    }
    return (A) this;
  }
  
  public V1KeyToPath buildFirstItem() {
    return this.items.get(0).build();
  }
  
  public V1KeyToPath buildItem(int index) {
    return this.items.get(index).build();
  }
  
  public List<V1KeyToPath> buildItems() {
    return this.items != null ? build(items) : null;
  }
  
  public V1KeyToPath buildLastItem() {
    return this.items.get(items.size() - 1).build();
  }
  
  public V1KeyToPath buildMatchingItem(Predicate<V1KeyToPathBuilder> predicate) {
      for (V1KeyToPathBuilder item : items) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  protected void copyInstance(V1SecretProjection instance) {
    instance = instance != null ? instance : new V1SecretProjection();
    if (instance != null) {
        this.withItems(instance.getItems());
        this.withName(instance.getName());
        this.withOptional(instance.getOptional());
    }
  }
  
  public ItemsNested<A> editFirstItem() {
    if (items.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "items"));
    }
    return this.setNewItemLike(0, this.buildItem(0));
  }
  
  public ItemsNested<A> editItem(int index) {
    if (items.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "items"));
    }
    return this.setNewItemLike(index, this.buildItem(index));
  }
  
  public ItemsNested<A> editLastItem() {
    int index = items.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "items"));
    }
    return this.setNewItemLike(index, this.buildItem(index));
  }
  
  public ItemsNested<A> editMatchingItem(Predicate<V1KeyToPathBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < items.size();i++) {
      if (predicate.test(items.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "items"));
    }
    return this.setNewItemLike(index, this.buildItem(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1SecretProjectionFluent that = (V1SecretProjectionFluent) o;
    if (!(Objects.equals(items, that.items))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(optional, that.optional))) {
      return false;
    }
    return true;
  }
  
  public String getName() {
    return this.name;
  }
  
  public Boolean getOptional() {
    return this.optional;
  }
  
  public boolean hasItems() {
    return this.items != null && !(this.items.isEmpty());
  }
  
  public boolean hasMatchingItem(Predicate<V1KeyToPathBuilder> predicate) {
      for (V1KeyToPathBuilder item : items) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasOptional() {
    return this.optional != null;
  }
  
  public int hashCode() {
    return Objects.hash(items, name, optional);
  }
  
  public A removeAllFromItems(Collection<V1KeyToPath> items) {
    if (this.items == null) {
      return (A) this;
    }
    for (V1KeyToPath item : items) {
        V1KeyToPathBuilder builder = new V1KeyToPathBuilder(item);
        _visitables.get("items").remove(builder);
        this.items.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromItems(V1KeyToPath... items) {
    if (this.items == null) {
      return (A) this;
    }
    for (V1KeyToPath item : items) {
        V1KeyToPathBuilder builder = new V1KeyToPathBuilder(item);
        _visitables.get("items").remove(builder);
        this.items.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromItems(Predicate<V1KeyToPathBuilder> predicate) {
    if (items == null) {
      return (A) this;
    }
    Iterator<V1KeyToPathBuilder> each = items.iterator();
    List visitables = _visitables.get("items");
    while (each.hasNext()) {
        V1KeyToPathBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ItemsNested<A> setNewItemLike(int index,V1KeyToPath item) {
    return new ItemsNested(index, item);
  }
  
  public A setToItems(int index,V1KeyToPath item) {
    if (this.items == null) {
      this.items = new ArrayList();
    }
    V1KeyToPathBuilder builder = new V1KeyToPathBuilder(item);
    if (index < 0 || index >= items.size()) {
        _visitables.get("items").add(builder);
        items.add(builder);
    } else {
        _visitables.get("items").add(builder);
        items.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(items == null) && !(items.isEmpty())) {
        sb.append("items:");
        sb.append(items);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(optional == null)) {
        sb.append("optional:");
        sb.append(optional);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withItems(List<V1KeyToPath> items) {
    if (this.items != null) {
      this._visitables.get("items").clear();
    }
    if (items != null) {
        this.items = new ArrayList();
        for (V1KeyToPath item : items) {
          this.addToItems(item);
        }
    } else {
      this.items = null;
    }
    return (A) this;
  }
  
  public A withItems(V1KeyToPath... items) {
    if (this.items != null) {
        this.items.clear();
        _visitables.remove("items");
    }
    if (items != null) {
      for (V1KeyToPath item : items) {
        this.addToItems(item);
      }
    }
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withOptional() {
    return withOptional(true);
  }
  
  public A withOptional(Boolean optional) {
    this.optional = optional;
    return (A) this;
  }
  public class ItemsNested<N> extends V1KeyToPathFluent<ItemsNested<N>> implements Nested<N>{
  
    V1KeyToPathBuilder builder;
    int index;
  
    ItemsNested(int index,V1KeyToPath item) {
      this.index = index;
      this.builder = new V1KeyToPathBuilder(this, item);
    }
  
    public N and() {
      return (N) V1SecretProjectionFluent.this.setToItems(index, builder.build());
    }
    
    public N endItem() {
      return and();
    }
    
  }
}