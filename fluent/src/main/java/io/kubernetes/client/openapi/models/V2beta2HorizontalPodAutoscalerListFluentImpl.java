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
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V2beta2HorizontalPodAutoscalerListFluentImpl<A extends V2beta2HorizontalPodAutoscalerListFluent<A>> extends BaseFluent<A> implements V2beta2HorizontalPodAutoscalerListFluent<A>{
  public V2beta2HorizontalPodAutoscalerListFluentImpl() {
  }
  public V2beta2HorizontalPodAutoscalerListFluentImpl(V2beta2HorizontalPodAutoscalerList instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

  }
  private String apiVersion;
  private ArrayList<V2beta2HorizontalPodAutoscalerBuilder> items;
  private String kind;
  private V1ListMetaBuilder metadata;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public A addToItems(Integer index,V2beta2HorizontalPodAutoscaler item) {
    if (this.items == null) {this.items = new ArrayList<V2beta2HorizontalPodAutoscalerBuilder>();}
    V2beta2HorizontalPodAutoscalerBuilder builder = new V2beta2HorizontalPodAutoscalerBuilder(item);_visitables.get("items").add(index >= 0 ? index : _visitables.get("items").size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
  }
  public A setToItems(Integer index,V2beta2HorizontalPodAutoscaler item) {
    if (this.items == null) {this.items = new ArrayList<V2beta2HorizontalPodAutoscalerBuilder>();}
    V2beta2HorizontalPodAutoscalerBuilder builder = new V2beta2HorizontalPodAutoscalerBuilder(item);
    if (index < 0 || index >= _visitables.get("items").size()) { _visitables.get("items").add(builder); } else { _visitables.get("items").set(index, builder);}
    if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
     return (A)this;
  }
  public A addToItems(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscaler... items) {
    if (this.items == null) {this.items = new ArrayList<V2beta2HorizontalPodAutoscalerBuilder>();}
    for (V2beta2HorizontalPodAutoscaler item : items) {V2beta2HorizontalPodAutoscalerBuilder builder = new V2beta2HorizontalPodAutoscalerBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  public A addAllToItems(Collection<V2beta2HorizontalPodAutoscaler> items) {
    if (this.items == null) {this.items = new ArrayList<V2beta2HorizontalPodAutoscalerBuilder>();}
    for (V2beta2HorizontalPodAutoscaler item : items) {V2beta2HorizontalPodAutoscalerBuilder builder = new V2beta2HorizontalPodAutoscalerBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  public A removeFromItems(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscaler... items) {
    for (V2beta2HorizontalPodAutoscaler item : items) {V2beta2HorizontalPodAutoscalerBuilder builder = new V2beta2HorizontalPodAutoscalerBuilder(item);_visitables.get("items").remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
  }
  public A removeAllFromItems(Collection<V2beta2HorizontalPodAutoscaler> items) {
    for (V2beta2HorizontalPodAutoscaler item : items) {V2beta2HorizontalPodAutoscalerBuilder builder = new V2beta2HorizontalPodAutoscalerBuilder(item);_visitables.get("items").remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromItems(Predicate<V2beta2HorizontalPodAutoscalerBuilder> predicate) {
    if (items == null) return (A) this;
    final Iterator<V2beta2HorizontalPodAutoscalerBuilder> each = items.iterator();
    final List visitables = _visitables.get("items");
    while (each.hasNext()) {
      V2beta2HorizontalPodAutoscalerBuilder builder = each.next();
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
  public List<V2beta2HorizontalPodAutoscaler> getItems() {
    return items != null ? build(items) : null;
  }
  public List<V2beta2HorizontalPodAutoscaler> buildItems() {
    return items != null ? build(items) : null;
  }
  public V2beta2HorizontalPodAutoscaler buildItem(Integer index) {
    return this.items.get(index).build();
  }
  public V2beta2HorizontalPodAutoscaler buildFirstItem() {
    return this.items.get(0).build();
  }
  public V2beta2HorizontalPodAutoscaler buildLastItem() {
    return this.items.get(items.size() - 1).build();
  }
  public V2beta2HorizontalPodAutoscaler buildMatchingItem(Predicate<V2beta2HorizontalPodAutoscalerBuilder> predicate) {
    for (V2beta2HorizontalPodAutoscalerBuilder item: items) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingItem(Predicate<V2beta2HorizontalPodAutoscalerBuilder> predicate) {
    for (V2beta2HorizontalPodAutoscalerBuilder item: items) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withItems(List<V2beta2HorizontalPodAutoscaler> items) {
    if (this.items != null) { _visitables.get("items").removeAll(this.items);}
    if (items != null) {this.items = new ArrayList(); for (V2beta2HorizontalPodAutoscaler item : items){this.addToItems(item);}} else { this.items = null;} return (A) this;
  }
  public A withItems(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscaler... items) {
    if (this.items != null) {this.items.clear();}
    if (items != null) {for (V2beta2HorizontalPodAutoscaler item :items){ this.addToItems(item);}} return (A) this;
  }
  public Boolean hasItems() {
    return items != null && !items.isEmpty();
  }
  public V2beta2HorizontalPodAutoscalerListFluent.ItemsNested<A> addNewItem() {
    return new V2beta2HorizontalPodAutoscalerListFluentImpl.ItemsNestedImpl();
  }
  public V2beta2HorizontalPodAutoscalerListFluent.ItemsNested<A> addNewItemLike(V2beta2HorizontalPodAutoscaler item) {
    return new V2beta2HorizontalPodAutoscalerListFluentImpl.ItemsNestedImpl(-1, item);
  }
  public V2beta2HorizontalPodAutoscalerListFluent.ItemsNested<A> setNewItemLike(Integer index,V2beta2HorizontalPodAutoscaler item) {
    return new V2beta2HorizontalPodAutoscalerListFluentImpl.ItemsNestedImpl(index, item);
  }
  public V2beta2HorizontalPodAutoscalerListFluent.ItemsNested<A> editItem(Integer index) {
    if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
    return setNewItemLike(index, buildItem(index));
  }
  public V2beta2HorizontalPodAutoscalerListFluent.ItemsNested<A> editFirstItem() {
    if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
    return setNewItemLike(0, buildItem(0));
  }
  public V2beta2HorizontalPodAutoscalerListFluent.ItemsNested<A> editLastItem() {
    int index = items.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
    return setNewItemLike(index, buildItem(index));
  }
  public V2beta2HorizontalPodAutoscalerListFluent.ItemsNested<A> editMatchingItem(Predicate<V2beta2HorizontalPodAutoscalerBuilder> predicate) {
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
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ListMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public V1ListMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(V1ListMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new V1ListMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} else { this.metadata = null; _visitables.get("metadata").remove(this.metadata); } return (A) this;
  }
  public Boolean hasMetadata() {
    return this.metadata != null;
  }
  public V2beta2HorizontalPodAutoscalerListFluent.MetadataNested<A> withNewMetadata() {
    return new V2beta2HorizontalPodAutoscalerListFluentImpl.MetadataNestedImpl();
  }
  public V2beta2HorizontalPodAutoscalerListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item) {
    return new V2beta2HorizontalPodAutoscalerListFluentImpl.MetadataNestedImpl(item);
  }
  public V2beta2HorizontalPodAutoscalerListFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V2beta2HorizontalPodAutoscalerListFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ListMetaBuilder().build());
  }
  public V2beta2HorizontalPodAutoscalerListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta2HorizontalPodAutoscalerListFluentImpl that = (V2beta2HorizontalPodAutoscalerListFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (items != null ? !items.equals(that.items) :that.items != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
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
  class ItemsNestedImpl<N> extends V2beta2HorizontalPodAutoscalerFluentImpl<V2beta2HorizontalPodAutoscalerListFluent.ItemsNested<N>> implements V2beta2HorizontalPodAutoscalerListFluent.ItemsNested<N>,Nested<N>{
    ItemsNestedImpl(Integer index,V2beta2HorizontalPodAutoscaler item) {
      this.index = index;
      this.builder = new V2beta2HorizontalPodAutoscalerBuilder(this, item);
    }
    ItemsNestedImpl() {
      this.index = -1;
      this.builder = new V2beta2HorizontalPodAutoscalerBuilder(this);
    }
    V2beta2HorizontalPodAutoscalerBuilder builder;
    Integer index;
    public N and() {
      return (N) V2beta2HorizontalPodAutoscalerListFluentImpl.this.setToItems(index,builder.build());
    }
    public N endItem() {
      return and();
    }
    
  }
  class MetadataNestedImpl<N> extends V1ListMetaFluentImpl<V2beta2HorizontalPodAutoscalerListFluent.MetadataNested<N>> implements V2beta2HorizontalPodAutoscalerListFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ListMeta item) {
      this.builder = new V1ListMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ListMetaBuilder(this);
    }
    V1ListMetaBuilder builder;
    public N and() {
      return (N) V2beta2HorizontalPodAutoscalerListFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  
}