package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
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
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ResourceSliceListFluent<A extends io.kubernetes.client.openapi.models.V1ResourceSliceListFluent<A>> extends BaseFluent<A>{

  private String apiVersion;
  private ArrayList<V1ResourceSliceBuilder> items;
  private String kind;
  private V1ListMetaBuilder metadata;

  public V1ResourceSliceListFluent() {
  }
  
  public V1ResourceSliceListFluent(V1ResourceSliceList instance) {
    this.copyInstance(instance);
  }

  public A addAllToItems(Collection<V1ResourceSlice> items) {
    if (this.items == null) {
      this.items = new ArrayList();
    }
    for (V1ResourceSlice item : items) {
        V1ResourceSliceBuilder builder = new V1ResourceSliceBuilder(item);
        _visitables.get("items").add(builder);
        this.items.add(builder);
    }
    return (A) this;
  }
  
  public ItemsNested<A> addNewItem() {
    return new ItemsNested(-1, null);
  }
  
  public ItemsNested<A> addNewItemLike(V1ResourceSlice item) {
    return new ItemsNested(-1, item);
  }
  
  public A addToItems(V1ResourceSlice... items) {
    if (this.items == null) {
      this.items = new ArrayList();
    }
    for (V1ResourceSlice item : items) {
        V1ResourceSliceBuilder builder = new V1ResourceSliceBuilder(item);
        _visitables.get("items").add(builder);
        this.items.add(builder);
    }
    return (A) this;
  }
  
  public A addToItems(int index,V1ResourceSlice item) {
    if (this.items == null) {
      this.items = new ArrayList();
    }
    V1ResourceSliceBuilder builder = new V1ResourceSliceBuilder(item);
    if (index < 0 || index >= items.size()) {
        _visitables.get("items").add(builder);
        items.add(builder);
    } else {
        _visitables.get("items").add(builder);
        items.add(index, builder);
    }
    return (A) this;
  }
  
  public V1ResourceSlice buildFirstItem() {
    return this.items.get(0).build();
  }
  
  public V1ResourceSlice buildItem(int index) {
    return this.items.get(index).build();
  }
  
  public List<V1ResourceSlice> buildItems() {
    return this.items != null ? build(items) : null;
  }
  
  public V1ResourceSlice buildLastItem() {
    return this.items.get(items.size() - 1).build();
  }
  
  public V1ResourceSlice buildMatchingItem(Predicate<V1ResourceSliceBuilder> predicate) {
      for (V1ResourceSliceBuilder item : items) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1ListMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  protected void copyInstance(V1ResourceSliceList instance) {
    instance = instance != null ? instance : new V1ResourceSliceList();
    if (instance != null) {
        this.withApiVersion(instance.getApiVersion());
        this.withItems(instance.getItems());
        this.withKind(instance.getKind());
        this.withMetadata(instance.getMetadata());
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
  
  public ItemsNested<A> editMatchingItem(Predicate<V1ResourceSliceBuilder> predicate) {
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
  
  public MetadataNested<A> editMetadata() {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(new V1ListMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ListMeta item) {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(item));
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
    V1ResourceSliceListFluent that = (V1ResourceSliceListFluent) o;
    if (!(Objects.equals(apiVersion, that.apiVersion))) {
      return false;
    }
    if (!(Objects.equals(items, that.items))) {
      return false;
    }
    if (!(Objects.equals(kind, that.kind))) {
      return false;
    }
    if (!(Objects.equals(metadata, that.metadata))) {
      return false;
    }
    return true;
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public boolean hasItems() {
    return this.items != null && !(this.items.isEmpty());
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public boolean hasMatchingItem(Predicate<V1ResourceSliceBuilder> predicate) {
      for (V1ResourceSliceBuilder item : items) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }
  
  public A removeAllFromItems(Collection<V1ResourceSlice> items) {
    if (this.items == null) {
      return (A) this;
    }
    for (V1ResourceSlice item : items) {
        V1ResourceSliceBuilder builder = new V1ResourceSliceBuilder(item);
        _visitables.get("items").remove(builder);
        this.items.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromItems(V1ResourceSlice... items) {
    if (this.items == null) {
      return (A) this;
    }
    for (V1ResourceSlice item : items) {
        V1ResourceSliceBuilder builder = new V1ResourceSliceBuilder(item);
        _visitables.get("items").remove(builder);
        this.items.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromItems(Predicate<V1ResourceSliceBuilder> predicate) {
    if (items == null) {
      return (A) this;
    }
    Iterator<V1ResourceSliceBuilder> each = items.iterator();
    List visitables = _visitables.get("items");
    while (each.hasNext()) {
        V1ResourceSliceBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ItemsNested<A> setNewItemLike(int index,V1ResourceSlice item) {
    return new ItemsNested(index, item);
  }
  
  public A setToItems(int index,V1ResourceSlice item) {
    if (this.items == null) {
      this.items = new ArrayList();
    }
    V1ResourceSliceBuilder builder = new V1ResourceSliceBuilder(item);
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
    if (!(apiVersion == null)) {
        sb.append("apiVersion:");
        sb.append(apiVersion);
        sb.append(",");
    }
    if (!(items == null) && !(items.isEmpty())) {
        sb.append("items:");
        sb.append(items);
        sb.append(",");
    }
    if (!(kind == null)) {
        sb.append("kind:");
        sb.append(kind);
        sb.append(",");
    }
    if (!(metadata == null)) {
        sb.append("metadata:");
        sb.append(metadata);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public A withItems(List<V1ResourceSlice> items) {
    if (this.items != null) {
      this._visitables.get("items").clear();
    }
    if (items != null) {
        this.items = new ArrayList();
        for (V1ResourceSlice item : items) {
          this.addToItems(item);
        }
    } else {
      this.items = null;
    }
    return (A) this;
  }
  
  public A withItems(V1ResourceSlice... items) {
    if (this.items != null) {
        this.items.clear();
        _visitables.remove("items");
    }
    if (items != null) {
      for (V1ResourceSlice item : items) {
        this.addToItems(item);
      }
    }
    return (A) this;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public A withMetadata(V1ListMeta metadata) {
    this._visitables.remove("metadata");
    if (metadata != null) {
        this.metadata = new V1ListMetaBuilder(metadata);
        this._visitables.get("metadata").add(this.metadata);
    } else {
        this.metadata = null;
        this._visitables.get("metadata").remove(this.metadata);
    }
    return (A) this;
  }
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(V1ListMeta item) {
    return new MetadataNested(item);
  }
  public class ItemsNested<N> extends V1ResourceSliceFluent<ItemsNested<N>> implements Nested<N>{
  
    V1ResourceSliceBuilder builder;
    int index;
  
    ItemsNested(int index,V1ResourceSlice item) {
      this.index = index;
      this.builder = new V1ResourceSliceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ResourceSliceListFluent.this.setToItems(index, builder.build());
    }
    
    public N endItem() {
      return and();
    }
    
  }
  public class MetadataNested<N> extends V1ListMetaFluent<MetadataNested<N>> implements Nested<N>{
  
    V1ListMetaBuilder builder;
  
    MetadataNested(V1ListMeta item) {
      this.builder = new V1ListMetaBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ResourceSliceListFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  }
}