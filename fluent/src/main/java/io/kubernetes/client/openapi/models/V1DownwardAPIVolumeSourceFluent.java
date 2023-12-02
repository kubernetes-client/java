package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1DownwardAPIVolumeSourceFluent<A extends V1DownwardAPIVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1DownwardAPIVolumeSourceFluent() {
  }
  
  public V1DownwardAPIVolumeSourceFluent(V1DownwardAPIVolumeSource instance) {
    this.copyInstance(instance);
  }
  private Integer defaultMode;
  private ArrayList<V1DownwardAPIVolumeFileBuilder> items;
  
  protected void copyInstance(V1DownwardAPIVolumeSource instance) {
    instance = (instance != null ? instance : new V1DownwardAPIVolumeSource());
    if (instance != null) {
          this.withDefaultMode(instance.getDefaultMode());
          this.withItems(instance.getItems());
        }
  }
  
  public Integer getDefaultMode() {
    return this.defaultMode;
  }
  
  public A withDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
    return (A) this;
  }
  
  public boolean hasDefaultMode() {
    return this.defaultMode != null;
  }
  
  public A addToItems(int index,V1DownwardAPIVolumeFile item) {
    if (this.items == null) {this.items = new ArrayList<V1DownwardAPIVolumeFileBuilder>();}
    V1DownwardAPIVolumeFileBuilder builder = new V1DownwardAPIVolumeFileBuilder(item);
    if (index < 0 || index >= items.size()) { _visitables.get("items").add(builder); items.add(builder); } else { _visitables.get("items").add(index, builder); items.add(index, builder);}
    return (A)this;
  }
  
  public A setToItems(int index,V1DownwardAPIVolumeFile item) {
    if (this.items == null) {this.items = new ArrayList<V1DownwardAPIVolumeFileBuilder>();}
    V1DownwardAPIVolumeFileBuilder builder = new V1DownwardAPIVolumeFileBuilder(item);
    if (index < 0 || index >= items.size()) { _visitables.get("items").add(builder); items.add(builder); } else { _visitables.get("items").set(index, builder); items.set(index, builder);}
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
    if (this.items == null) return (A)this;
    for (V1DownwardAPIVolumeFile item : items) {V1DownwardAPIVolumeFileBuilder builder = new V1DownwardAPIVolumeFileBuilder(item);_visitables.get("items").remove(builder); this.items.remove(builder);} return (A)this;
  }
  
  public A removeAllFromItems(Collection<V1DownwardAPIVolumeFile> items) {
    if (this.items == null) return (A)this;
    for (V1DownwardAPIVolumeFile item : items) {V1DownwardAPIVolumeFileBuilder builder = new V1DownwardAPIVolumeFileBuilder(item);_visitables.get("items").remove(builder); this.items.remove(builder);} return (A)this;
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
  
  public List<V1DownwardAPIVolumeFile> buildItems() {
    return this.items != null ? build(items) : null;
  }
  
  public V1DownwardAPIVolumeFile buildItem(int index) {
    return this.items.get(index).build();
  }
  
  public V1DownwardAPIVolumeFile buildFirstItem() {
    return this.items.get(0).build();
  }
  
  public V1DownwardAPIVolumeFile buildLastItem() {
    return this.items.get(items.size() - 1).build();
  }
  
  public V1DownwardAPIVolumeFile buildMatchingItem(Predicate<V1DownwardAPIVolumeFileBuilder> predicate) {
      for (V1DownwardAPIVolumeFileBuilder item : items) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingItem(Predicate<V1DownwardAPIVolumeFileBuilder> predicate) {
      for (V1DownwardAPIVolumeFileBuilder item : items) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withItems(List<V1DownwardAPIVolumeFile> items) {
    if (this.items != null) {
      this._visitables.get("items").clear();
    }
    if (items != null) {
        this.items = new ArrayList();
        for (V1DownwardAPIVolumeFile item : items) {
          this.addToItems(item);
        }
    } else {
      this.items = null;
    }
    return (A) this;
  }
  
  public A withItems(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile... items) {
    if (this.items != null) {
        this.items.clear();
        _visitables.remove("items");
    }
    if (items != null) {
      for (V1DownwardAPIVolumeFile item : items) {
        this.addToItems(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasItems() {
    return this.items != null && !this.items.isEmpty();
  }
  
  public ItemsNested<A> addNewItem() {
    return new ItemsNested(-1, null);
  }
  
  public ItemsNested<A> addNewItemLike(V1DownwardAPIVolumeFile item) {
    return new ItemsNested(-1, item);
  }
  
  public ItemsNested<A> setNewItemLike(int index,V1DownwardAPIVolumeFile item) {
    return new ItemsNested(index, item);
  }
  
  public ItemsNested<A> editItem(int index) {
    if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
    return setNewItemLike(index, buildItem(index));
  }
  
  public ItemsNested<A> editFirstItem() {
    if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
    return setNewItemLike(0, buildItem(0));
  }
  
  public ItemsNested<A> editLastItem() {
    int index = items.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
    return setNewItemLike(index, buildItem(index));
  }
  
  public ItemsNested<A> editMatchingItem(Predicate<V1DownwardAPIVolumeFileBuilder> predicate) {
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
    if (!super.equals(o)) return false;
    V1DownwardAPIVolumeSourceFluent that = (V1DownwardAPIVolumeSourceFluent) o;
    if (!java.util.Objects.equals(defaultMode, that.defaultMode)) return false;
    if (!java.util.Objects.equals(items, that.items)) return false;
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
  public class ItemsNested<N> extends V1DownwardAPIVolumeFileFluent<ItemsNested<N>> implements Nested<N>{
    ItemsNested(int index,V1DownwardAPIVolumeFile item) {
      this.index = index;
      this.builder = new V1DownwardAPIVolumeFileBuilder(this, item);
    }
    V1DownwardAPIVolumeFileBuilder builder;
    int index;
    
    public N and() {
      return (N) V1DownwardAPIVolumeSourceFluent.this.setToItems(index,builder.build());
    }
    
    public N endItem() {
      return and();
    }
    
  
  }

}