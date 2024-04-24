package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ValidatingAdmissionPolicyBindingListFluent<A extends V1ValidatingAdmissionPolicyBindingListFluent<A>> extends BaseFluent<A>{
  public V1ValidatingAdmissionPolicyBindingListFluent() {
  }
  
  public V1ValidatingAdmissionPolicyBindingListFluent(V1ValidatingAdmissionPolicyBindingList instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private ArrayList<V1ValidatingAdmissionPolicyBindingBuilder> items;
  private String kind;
  private V1ListMetaBuilder metadata;
  
  protected void copyInstance(V1ValidatingAdmissionPolicyBindingList instance) {
    instance = (instance != null ? instance : new V1ValidatingAdmissionPolicyBindingList());
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
  
  public A addToItems(int index,V1ValidatingAdmissionPolicyBinding item) {
    if (this.items == null) {this.items = new ArrayList<V1ValidatingAdmissionPolicyBindingBuilder>();}
    V1ValidatingAdmissionPolicyBindingBuilder builder = new V1ValidatingAdmissionPolicyBindingBuilder(item);
    if (index < 0 || index >= items.size()) { _visitables.get("items").add(builder); items.add(builder); } else { _visitables.get("items").add(index, builder); items.add(index, builder);}
    return (A)this;
  }
  
  public A setToItems(int index,V1ValidatingAdmissionPolicyBinding item) {
    if (this.items == null) {this.items = new ArrayList<V1ValidatingAdmissionPolicyBindingBuilder>();}
    V1ValidatingAdmissionPolicyBindingBuilder builder = new V1ValidatingAdmissionPolicyBindingBuilder(item);
    if (index < 0 || index >= items.size()) { _visitables.get("items").add(builder); items.add(builder); } else { _visitables.get("items").set(index, builder); items.set(index, builder);}
    return (A)this;
  }
  
  public A addToItems(io.kubernetes.client.openapi.models.V1ValidatingAdmissionPolicyBinding... items) {
    if (this.items == null) {this.items = new ArrayList<V1ValidatingAdmissionPolicyBindingBuilder>();}
    for (V1ValidatingAdmissionPolicyBinding item : items) {V1ValidatingAdmissionPolicyBindingBuilder builder = new V1ValidatingAdmissionPolicyBindingBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  
  public A addAllToItems(Collection<V1ValidatingAdmissionPolicyBinding> items) {
    if (this.items == null) {this.items = new ArrayList<V1ValidatingAdmissionPolicyBindingBuilder>();}
    for (V1ValidatingAdmissionPolicyBinding item : items) {V1ValidatingAdmissionPolicyBindingBuilder builder = new V1ValidatingAdmissionPolicyBindingBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  
  public A removeFromItems(io.kubernetes.client.openapi.models.V1ValidatingAdmissionPolicyBinding... items) {
    if (this.items == null) return (A)this;
    for (V1ValidatingAdmissionPolicyBinding item : items) {V1ValidatingAdmissionPolicyBindingBuilder builder = new V1ValidatingAdmissionPolicyBindingBuilder(item);_visitables.get("items").remove(builder); this.items.remove(builder);} return (A)this;
  }
  
  public A removeAllFromItems(Collection<V1ValidatingAdmissionPolicyBinding> items) {
    if (this.items == null) return (A)this;
    for (V1ValidatingAdmissionPolicyBinding item : items) {V1ValidatingAdmissionPolicyBindingBuilder builder = new V1ValidatingAdmissionPolicyBindingBuilder(item);_visitables.get("items").remove(builder); this.items.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromItems(Predicate<V1ValidatingAdmissionPolicyBindingBuilder> predicate) {
    if (items == null) return (A) this;
    final Iterator<V1ValidatingAdmissionPolicyBindingBuilder> each = items.iterator();
    final List visitables = _visitables.get("items");
    while (each.hasNext()) {
      V1ValidatingAdmissionPolicyBindingBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1ValidatingAdmissionPolicyBinding> buildItems() {
    return this.items != null ? build(items) : null;
  }
  
  public V1ValidatingAdmissionPolicyBinding buildItem(int index) {
    return this.items.get(index).build();
  }
  
  public V1ValidatingAdmissionPolicyBinding buildFirstItem() {
    return this.items.get(0).build();
  }
  
  public V1ValidatingAdmissionPolicyBinding buildLastItem() {
    return this.items.get(items.size() - 1).build();
  }
  
  public V1ValidatingAdmissionPolicyBinding buildMatchingItem(Predicate<V1ValidatingAdmissionPolicyBindingBuilder> predicate) {
      for (V1ValidatingAdmissionPolicyBindingBuilder item : items) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingItem(Predicate<V1ValidatingAdmissionPolicyBindingBuilder> predicate) {
      for (V1ValidatingAdmissionPolicyBindingBuilder item : items) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withItems(List<V1ValidatingAdmissionPolicyBinding> items) {
    if (this.items != null) {
      this._visitables.get("items").clear();
    }
    if (items != null) {
        this.items = new ArrayList();
        for (V1ValidatingAdmissionPolicyBinding item : items) {
          this.addToItems(item);
        }
    } else {
      this.items = null;
    }
    return (A) this;
  }
  
  public A withItems(io.kubernetes.client.openapi.models.V1ValidatingAdmissionPolicyBinding... items) {
    if (this.items != null) {
        this.items.clear();
        _visitables.remove("items");
    }
    if (items != null) {
      for (V1ValidatingAdmissionPolicyBinding item : items) {
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
  
  public ItemsNested<A> addNewItemLike(V1ValidatingAdmissionPolicyBinding item) {
    return new ItemsNested(-1, item);
  }
  
  public ItemsNested<A> setNewItemLike(int index,V1ValidatingAdmissionPolicyBinding item) {
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
  
  public ItemsNested<A> editMatchingItem(Predicate<V1ValidatingAdmissionPolicyBindingBuilder> predicate) {
    int index = -1;
    for (int i=0;i<items.size();i++) { 
    if (predicate.test(items.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching items. No match found.");
    return setNewItemLike(index, buildItem(index));
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
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(new V1ListMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ListMeta item) {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ValidatingAdmissionPolicyBindingListFluent that = (V1ValidatingAdmissionPolicyBindingListFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(items, that.items)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  items,  kind,  metadata,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (items != null && !items.isEmpty()) { sb.append("items:"); sb.append(items + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata); }
    sb.append("}");
    return sb.toString();
  }
  public class ItemsNested<N> extends V1ValidatingAdmissionPolicyBindingFluent<ItemsNested<N>> implements Nested<N>{
    ItemsNested(int index,V1ValidatingAdmissionPolicyBinding item) {
      this.index = index;
      this.builder = new V1ValidatingAdmissionPolicyBindingBuilder(this, item);
    }
    V1ValidatingAdmissionPolicyBindingBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ValidatingAdmissionPolicyBindingListFluent.this.setToItems(index,builder.build());
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
      return (N) V1ValidatingAdmissionPolicyBindingListFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }

}