package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.RuntimeException;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class CoreV1EventListFluent<A extends io.kubernetes.client.openapi.models.CoreV1EventListFluent<A>> extends BaseFluent<A>{
  public CoreV1EventListFluent() {
  }
  
  public CoreV1EventListFluent(CoreV1EventList instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private ArrayList<CoreV1EventBuilder> items;
  private String kind;
  private V1ListMetaBuilder metadata;
  
  protected void copyInstance(CoreV1EventList instance) {
    instance = instance != null ? instance : new CoreV1EventList();
    if (instance != null) {
        this.withApiVersion(instance.getApiVersion());
        this.withItems(instance.getItems());
        this.withKind(instance.getKind());
        this.withMetadata(instance.getMetadata());
    }
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public A addToItems(int index,CoreV1Event item) {
    if (this.items == null) {
      this.items = new ArrayList();
    }
    CoreV1EventBuilder builder = new CoreV1EventBuilder(item);
    if (index < 0 || index >= items.size()) {
        _visitables.get("items").add(builder);
        items.add(builder);
    } else {
        _visitables.get("items").add(builder);
        items.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToItems(int index,CoreV1Event item) {
    if (this.items == null) {
      this.items = new ArrayList();
    }
    CoreV1EventBuilder builder = new CoreV1EventBuilder(item);
    if (index < 0 || index >= items.size()) {
        _visitables.get("items").add(builder);
        items.add(builder);
    } else {
        _visitables.get("items").add(builder);
        items.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToItems(CoreV1Event... items) {
    if (this.items == null) {
      this.items = new ArrayList();
    }
    for (CoreV1Event item : items) {
        CoreV1EventBuilder builder = new CoreV1EventBuilder(item);
        _visitables.get("items").add(builder);
        this.items.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToItems(Collection<CoreV1Event> items) {
    if (this.items == null) {
      this.items = new ArrayList();
    }
    for (CoreV1Event item : items) {
        CoreV1EventBuilder builder = new CoreV1EventBuilder(item);
        _visitables.get("items").add(builder);
        this.items.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromItems(CoreV1Event... items) {
    if (this.items == null) {
      return (A) this;
    }
    for (CoreV1Event item : items) {
        CoreV1EventBuilder builder = new CoreV1EventBuilder(item);
        _visitables.get("items").remove(builder);
        this.items.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromItems(Collection<CoreV1Event> items) {
    if (this.items == null) {
      return (A) this;
    }
    for (CoreV1Event item : items) {
        CoreV1EventBuilder builder = new CoreV1EventBuilder(item);
        _visitables.get("items").remove(builder);
        this.items.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromItems(Predicate<CoreV1EventBuilder> predicate) {
    if (items == null) {
      return (A) this;
    }
    Iterator<CoreV1EventBuilder> each = items.iterator();
    List visitables = _visitables.get("items");
    while (each.hasNext()) {
        CoreV1EventBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<CoreV1Event> buildItems() {
    return this.items != null ? build(items) : null;
  }
  
  public CoreV1Event buildItem(int index) {
    return this.items.get(index).build();
  }
  
  public CoreV1Event buildFirstItem() {
    return this.items.get(0).build();
  }
  
  public CoreV1Event buildLastItem() {
    return this.items.get(items.size() - 1).build();
  }
  
  public CoreV1Event buildMatchingItem(Predicate<CoreV1EventBuilder> predicate) {
      for (CoreV1EventBuilder item : items) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingItem(Predicate<CoreV1EventBuilder> predicate) {
      for (CoreV1EventBuilder item : items) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withItems(List<CoreV1Event> items) {
    if (this.items != null) {
      this._visitables.get("items").clear();
    }
    if (items != null) {
        this.items = new ArrayList();
        for (CoreV1Event item : items) {
          this.addToItems(item);
        }
    } else {
      this.items = null;
    }
    return (A) this;
  }
  
  public A withItems(CoreV1Event... items) {
    if (this.items != null) {
        this.items.clear();
        _visitables.remove("items");
    }
    if (items != null) {
      for (CoreV1Event item : items) {
        this.addToItems(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasItems() {
    return this.items != null && !(this.items.isEmpty());
  }
  
  public ItemsNested<A> addNewItem() {
    return new ItemsNested(-1, null);
  }
  
  public ItemsNested<A> addNewItemLike(CoreV1Event item) {
    return new ItemsNested(-1, item);
  }
  
  public ItemsNested<A> setNewItemLike(int index,CoreV1Event item) {
    return new ItemsNested(index, item);
  }
  
  public ItemsNested<A> editItem(int index) {
    if (index <= items.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "items"));
    }
    return this.setNewItemLike(index, this.buildItem(index));
  }
  
  public ItemsNested<A> editFirstItem() {
    if (items.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "items"));
    }
    return this.setNewItemLike(0, this.buildItem(0));
  }
  
  public ItemsNested<A> editLastItem() {
    int index = items.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "items"));
    }
    return this.setNewItemLike(index, this.buildItem(index));
  }
  
  public ItemsNested<A> editMatchingItem(Predicate<CoreV1EventBuilder> predicate) {
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
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public V1ListMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
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
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(V1ListMeta item) {
    return new MetadataNested(item);
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
    CoreV1EventListFluent that = (CoreV1EventListFluent) o;
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
  
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
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
  public class ItemsNested<N> extends CoreV1EventFluent<ItemsNested<N>> implements Nested<N>{
    ItemsNested(int index,CoreV1Event item) {
      this.index = index;
      this.builder = new CoreV1EventBuilder(this, item);
    }
    CoreV1EventBuilder builder;
    int index;
    
    public N and() {
      return (N) CoreV1EventListFluent.this.setToItems(index, builder.build());
    }
    
    public N endItem() {
      return and();
    }
    
  
  }
  public class MetadataNested<N> extends V1ListMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ListMeta item) {
      this.builder = new V1ListMetaBuilder(this, item);
    }
    V1ListMetaBuilder builder;
    
    public N and() {
      return (N) CoreV1EventListFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }

}