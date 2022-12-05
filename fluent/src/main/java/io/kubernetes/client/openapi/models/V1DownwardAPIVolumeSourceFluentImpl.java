package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
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
  public class V1DownwardAPIVolumeSourceFluentImpl<A extends V1DownwardAPIVolumeSourceFluent<A>> extends BaseFluent<A> implements V1DownwardAPIVolumeSourceFluent<A>{
  public V1DownwardAPIVolumeSourceFluentImpl() {
  }
  public V1DownwardAPIVolumeSourceFluentImpl(V1DownwardAPIVolumeSource instance) {
    this.withDefaultMode(instance.getDefaultMode());

    this.withItems(instance.getItems());

  }
  private Integer defaultMode;
  private ArrayList<V1DownwardAPIVolumeFileBuilder> items;
  public Integer getDefaultMode() {
    return this.defaultMode;
  }
  public A withDefaultMode(Integer defaultMode) {
    this.defaultMode=defaultMode; return (A) this;
  }
  public Boolean hasDefaultMode() {
    return this.defaultMode != null;
  }
  public A addToItems(Integer index,V1DownwardAPIVolumeFile item) {
    if (this.items == null) {this.items = new ArrayList<V1DownwardAPIVolumeFileBuilder>();}
    V1DownwardAPIVolumeFileBuilder builder = new V1DownwardAPIVolumeFileBuilder(item);_visitables.get("items").add(index >= 0 ? index : _visitables.get("items").size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
  }
  public A setToItems(Integer index,V1DownwardAPIVolumeFile item) {
    if (this.items == null) {this.items = new ArrayList<V1DownwardAPIVolumeFileBuilder>();}
    V1DownwardAPIVolumeFileBuilder builder = new V1DownwardAPIVolumeFileBuilder(item);
    if (index < 0 || index >= _visitables.get("items").size()) { _visitables.get("items").add(builder); } else { _visitables.get("items").set(index, builder);}
    if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
     return (A)this;
  }
  public A addToItems(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile... items) {
    if (this.items == null) {this.items = new ArrayList<V1DownwardAPIVolumeFileBuilder>();}
    for (V1DownwardAPIVolumeFile item : items) {V1DownwardAPIVolumeFileBuilder builder = new V1DownwardAPIVolumeFileBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  public A addAllToItems(Collection<V1DownwardAPIVolumeFile> items) {
    if (this.items == null) {this.items = new ArrayList<V1DownwardAPIVolumeFileBuilder>();}
    for (V1DownwardAPIVolumeFile item : items) {V1DownwardAPIVolumeFileBuilder builder = new V1DownwardAPIVolumeFileBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  public A removeFromItems(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile... items) {
    for (V1DownwardAPIVolumeFile item : items) {V1DownwardAPIVolumeFileBuilder builder = new V1DownwardAPIVolumeFileBuilder(item);_visitables.get("items").remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
  }
  public A removeAllFromItems(Collection<V1DownwardAPIVolumeFile> items) {
    for (V1DownwardAPIVolumeFile item : items) {V1DownwardAPIVolumeFileBuilder builder = new V1DownwardAPIVolumeFileBuilder(item);_visitables.get("items").remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromItems(Predicate<V1DownwardAPIVolumeFileBuilder> predicate) {
    if (items == null) return (A) this;
    final Iterator<V1DownwardAPIVolumeFileBuilder> each = items.iterator();
    final List visitables = _visitables.get("items");
    while (each.hasNext()) {
      V1DownwardAPIVolumeFileBuilder builder = each.next();
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
  public List<V1DownwardAPIVolumeFile> getItems() {
    return items != null ? build(items) : null;
  }
  public List<V1DownwardAPIVolumeFile> buildItems() {
    return items != null ? build(items) : null;
  }
  public V1DownwardAPIVolumeFile buildItem(Integer index) {
    return this.items.get(index).build();
  }
  public V1DownwardAPIVolumeFile buildFirstItem() {
    return this.items.get(0).build();
  }
  public V1DownwardAPIVolumeFile buildLastItem() {
    return this.items.get(items.size() - 1).build();
  }
  public V1DownwardAPIVolumeFile buildMatchingItem(Predicate<V1DownwardAPIVolumeFileBuilder> predicate) {
    for (V1DownwardAPIVolumeFileBuilder item: items) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingItem(Predicate<V1DownwardAPIVolumeFileBuilder> predicate) {
    for (V1DownwardAPIVolumeFileBuilder item: items) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withItems(List<V1DownwardAPIVolumeFile> items) {
    if (this.items != null) { _visitables.get("items").removeAll(this.items);}
    if (items != null) {this.items = new ArrayList(); for (V1DownwardAPIVolumeFile item : items){this.addToItems(item);}} else { this.items = null;} return (A) this;
  }
  public A withItems(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile... items) {
    if (this.items != null) {this.items.clear();}
    if (items != null) {for (V1DownwardAPIVolumeFile item :items){ this.addToItems(item);}} return (A) this;
  }
  public Boolean hasItems() {
    return items != null && !items.isEmpty();
  }
  public V1DownwardAPIVolumeSourceFluent.ItemsNested<A> addNewItem() {
    return new V1DownwardAPIVolumeSourceFluentImpl.ItemsNestedImpl();
  }
  public V1DownwardAPIVolumeSourceFluent.ItemsNested<A> addNewItemLike(V1DownwardAPIVolumeFile item) {
    return new V1DownwardAPIVolumeSourceFluentImpl.ItemsNestedImpl(-1, item);
  }
  public V1DownwardAPIVolumeSourceFluent.ItemsNested<A> setNewItemLike(Integer index,V1DownwardAPIVolumeFile item) {
    return new V1DownwardAPIVolumeSourceFluentImpl.ItemsNestedImpl(index, item);
  }
  public V1DownwardAPIVolumeSourceFluent.ItemsNested<A> editItem(Integer index) {
    if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
    return setNewItemLike(index, buildItem(index));
  }
  public V1DownwardAPIVolumeSourceFluent.ItemsNested<A> editFirstItem() {
    if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
    return setNewItemLike(0, buildItem(0));
  }
  public V1DownwardAPIVolumeSourceFluent.ItemsNested<A> editLastItem() {
    int index = items.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
    return setNewItemLike(index, buildItem(index));
  }
  public V1DownwardAPIVolumeSourceFluent.ItemsNested<A> editMatchingItem(Predicate<V1DownwardAPIVolumeFileBuilder> predicate) {
    int index = -1;
    for (int i=0;i<items.size();i++) { 
    if (predicate.test(items.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching items. No match found.");
    return setNewItemLike(index, buildItem(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1DownwardAPIVolumeSourceFluentImpl that = (V1DownwardAPIVolumeSourceFluentImpl) o;
    if (defaultMode != null ? !defaultMode.equals(that.defaultMode) :that.defaultMode != null) return false;
    if (items != null ? !items.equals(that.items) :that.items != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(defaultMode,  items,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (defaultMode != null) { sb.append("defaultMode:"); sb.append(defaultMode + ","); }
    if (items != null && !items.isEmpty()) { sb.append("items:"); sb.append(items); }
    sb.append("}");
    return sb.toString();
  }
  class ItemsNestedImpl<N> extends V1DownwardAPIVolumeFileFluentImpl<V1DownwardAPIVolumeSourceFluent.ItemsNested<N>> implements V1DownwardAPIVolumeSourceFluent.ItemsNested<N>,Nested<N>{
    ItemsNestedImpl(Integer index,V1DownwardAPIVolumeFile item) {
      this.index = index;
      this.builder = new V1DownwardAPIVolumeFileBuilder(this, item);
    }
    ItemsNestedImpl() {
      this.index = -1;
      this.builder = new V1DownwardAPIVolumeFileBuilder(this);
    }
    V1DownwardAPIVolumeFileBuilder builder;
    Integer index;
    public N and() {
      return (N) V1DownwardAPIVolumeSourceFluentImpl.this.setToItems(index,builder.build());
    }
    public N endItem() {
      return and();
    }
    
  }
  
}