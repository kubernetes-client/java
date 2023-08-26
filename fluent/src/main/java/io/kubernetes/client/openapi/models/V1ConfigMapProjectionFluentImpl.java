package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ConfigMapProjectionFluentImpl<A extends V1ConfigMapProjectionFluent<A>> extends BaseFluent<A> implements V1ConfigMapProjectionFluent<A>{
  public V1ConfigMapProjectionFluentImpl() {
  }
  public V1ConfigMapProjectionFluentImpl(V1ConfigMapProjection instance) {
    if (instance != null) {
      this.withItems(instance.getItems());
      this.withName(instance.getName());
      this.withOptional(instance.getOptional());
    }
  }
  private ArrayList<V1KeyToPathBuilder> items;
  private String name;
  private Boolean optional;
  public A addToItems(int index,V1KeyToPath item) {
    if (this.items == null) {this.items = new ArrayList<V1KeyToPathBuilder>();}
    V1KeyToPathBuilder builder = new V1KeyToPathBuilder(item);
    if (index < 0 || index >= items.size()) { _visitables.get("items").add(builder); items.add(builder); } else { _visitables.get("items").add(index, builder); items.add(index, builder);}
    return (A)this;
  }
  public A setToItems(int index,V1KeyToPath item) {
    if (this.items == null) {this.items = new ArrayList<V1KeyToPathBuilder>();}
    V1KeyToPathBuilder builder = new V1KeyToPathBuilder(item);
    if (index < 0 || index >= items.size()) { _visitables.get("items").add(builder); items.add(builder); } else { _visitables.get("items").set(index, builder); items.set(index, builder);}
    return (A)this;
  }
  public A addToItems(io.kubernetes.client.openapi.models.V1KeyToPath... items) {
    if (this.items == null) {this.items = new ArrayList<V1KeyToPathBuilder>();}
    for (V1KeyToPath item : items) {V1KeyToPathBuilder builder = new V1KeyToPathBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  public A addAllToItems(Collection<V1KeyToPath> items) {
    if (this.items == null) {this.items = new ArrayList<V1KeyToPathBuilder>();}
    for (V1KeyToPath item : items) {V1KeyToPathBuilder builder = new V1KeyToPathBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  public A removeFromItems(io.kubernetes.client.openapi.models.V1KeyToPath... items) {
    for (V1KeyToPath item : items) {V1KeyToPathBuilder builder = new V1KeyToPathBuilder(item);_visitables.get("items").remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
  }
  public A removeAllFromItems(Collection<V1KeyToPath> items) {
    for (V1KeyToPath item : items) {V1KeyToPathBuilder builder = new V1KeyToPathBuilder(item);_visitables.get("items").remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromItems(Predicate<V1KeyToPathBuilder> predicate) {
    if (items == null) return (A) this;
    final Iterator<V1KeyToPathBuilder> each = items.iterator();
    final List visitables = _visitables.get("items");
    while (each.hasNext()) {
      V1KeyToPathBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1KeyToPath> getItems() {
    return items != null ? build(items) : null;
  }
  public List<V1KeyToPath> buildItems() {
    return items != null ? build(items) : null;
  }
  public V1KeyToPath buildItem(int index) {
    return this.items.get(index).build();
  }
  public V1KeyToPath buildFirstItem() {
    return this.items.get(0).build();
  }
  public V1KeyToPath buildLastItem() {
    return this.items.get(items.size() - 1).build();
  }
  public V1KeyToPath buildMatchingItem(Predicate<V1KeyToPathBuilder> predicate) {
    for (V1KeyToPathBuilder item: items) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingItem(Predicate<V1KeyToPathBuilder> predicate) {
    for (V1KeyToPathBuilder item: items) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withItems(List<V1KeyToPath> items) {
    if (this.items != null) { _visitables.get("items").clear();}
    if (items != null) {this.items = new ArrayList(); for (V1KeyToPath item : items){this.addToItems(item);}} else { this.items = null;} return (A) this;
  }
  public A withItems(io.kubernetes.client.openapi.models.V1KeyToPath... items) {
    if (this.items != null) {this.items.clear(); _visitables.remove("items"); }
    if (items != null) {for (V1KeyToPath item :items){ this.addToItems(item);}} return (A) this;
  }
  public Boolean hasItems() {
    return items != null && !items.isEmpty();
  }
  public V1ConfigMapProjectionFluentImpl.ItemsNested<A> addNewItem() {
    return new V1ConfigMapProjectionFluentImpl.ItemsNestedImpl();
  }
  public V1ConfigMapProjectionFluentImpl.ItemsNested<A> addNewItemLike(V1KeyToPath item) {
    return new V1ConfigMapProjectionFluentImpl.ItemsNestedImpl(-1, item);
  }
  public V1ConfigMapProjectionFluentImpl.ItemsNested<A> setNewItemLike(int index,V1KeyToPath item) {
    return new V1ConfigMapProjectionFluentImpl.ItemsNestedImpl(index, item);
  }
  public V1ConfigMapProjectionFluentImpl.ItemsNested<A> editItem(int index) {
    if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
    return setNewItemLike(index, buildItem(index));
  }
  public V1ConfigMapProjectionFluentImpl.ItemsNested<A> editFirstItem() {
    if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
    return setNewItemLike(0, buildItem(0));
  }
  public V1ConfigMapProjectionFluentImpl.ItemsNested<A> editLastItem() {
    int index = items.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
    return setNewItemLike(index, buildItem(index));
  }
  public V1ConfigMapProjectionFluentImpl.ItemsNested<A> editMatchingItem(Predicate<V1KeyToPathBuilder> predicate) {
    int index = -1;
    for (int i=0;i<items.size();i++) { 
    if (predicate.test(items.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching items. No match found.");
    return setNewItemLike(index, buildItem(index));
  }
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  public Boolean getOptional() {
    return this.optional;
  }
  public A withOptional(Boolean optional) {
    this.optional=optional; return (A) this;
  }
  public Boolean hasOptional() {
    return this.optional != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ConfigMapProjectionFluentImpl that = (V1ConfigMapProjectionFluentImpl) o;
    if (!java.util.Objects.equals(items, that.items)) return false;

    if (!java.util.Objects.equals(name, that.name)) return false;

    if (!java.util.Objects.equals(optional, that.optional)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(items,  name,  optional,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (items != null) { sb.append("items:"); sb.append(items + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (optional != null) { sb.append("optional:"); sb.append(optional); }
    sb.append("}");
    return sb.toString();
  }
  public A withOptional() {
    return withOptional(true);
  }
  class ItemsNestedImpl<N> extends V1KeyToPathFluentImpl<V1ConfigMapProjectionFluentImpl.ItemsNested<N>> implements V1ConfigMapProjectionFluentImpl.ItemsNested<N>,Nested<N>{
    ItemsNestedImpl(int index,V1KeyToPath item) {
      this.index = index;
      this.builder = new V1KeyToPathBuilder(this, item);
    }
    ItemsNestedImpl() {
      this.index = -1;
      this.builder = new V1KeyToPathBuilder(this);
    }
    V1KeyToPathBuilder builder;
    int index;
    public N and() {
      return (N) V1ConfigMapProjectionFluentImpl.this.setToItems(index,builder.build());
    }
    public N endItem() {
      return and();
    }
    
  }
  
}