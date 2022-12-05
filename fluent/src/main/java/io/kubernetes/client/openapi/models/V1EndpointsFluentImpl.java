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
  public class V1EndpointsFluentImpl<A extends V1EndpointsFluent<A>> extends BaseFluent<A> implements V1EndpointsFluent<A>{
  public V1EndpointsFluentImpl() {
  }
  public V1EndpointsFluentImpl(V1Endpoints instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSubsets(instance.getSubsets());

  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private ArrayList<V1EndpointSubsetBuilder> subsets;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
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
  public V1ObjectMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public V1ObjectMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} else { this.metadata = null; _visitables.get("metadata").remove(this.metadata); } return (A) this;
  }
  public Boolean hasMetadata() {
    return this.metadata != null;
  }
  public V1EndpointsFluent.MetadataNested<A> withNewMetadata() {
    return new V1EndpointsFluentImpl.MetadataNestedImpl();
  }
  public V1EndpointsFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1EndpointsFluentImpl.MetadataNestedImpl(item);
  }
  public V1EndpointsFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1EndpointsFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1EndpointsFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  public A addToSubsets(Integer index,V1EndpointSubset item) {
    if (this.subsets == null) {this.subsets = new ArrayList<V1EndpointSubsetBuilder>();}
    V1EndpointSubsetBuilder builder = new V1EndpointSubsetBuilder(item);_visitables.get("subsets").add(index >= 0 ? index : _visitables.get("subsets").size(), builder);this.subsets.add(index >= 0 ? index : subsets.size(), builder); return (A)this;
  }
  public A setToSubsets(Integer index,V1EndpointSubset item) {
    if (this.subsets == null) {this.subsets = new ArrayList<V1EndpointSubsetBuilder>();}
    V1EndpointSubsetBuilder builder = new V1EndpointSubsetBuilder(item);
    if (index < 0 || index >= _visitables.get("subsets").size()) { _visitables.get("subsets").add(builder); } else { _visitables.get("subsets").set(index, builder);}
    if (index < 0 || index >= subsets.size()) { subsets.add(builder); } else { subsets.set(index, builder);}
     return (A)this;
  }
  public A addToSubsets(io.kubernetes.client.openapi.models.V1EndpointSubset... items) {
    if (this.subsets == null) {this.subsets = new ArrayList<V1EndpointSubsetBuilder>();}
    for (V1EndpointSubset item : items) {V1EndpointSubsetBuilder builder = new V1EndpointSubsetBuilder(item);_visitables.get("subsets").add(builder);this.subsets.add(builder);} return (A)this;
  }
  public A addAllToSubsets(Collection<V1EndpointSubset> items) {
    if (this.subsets == null) {this.subsets = new ArrayList<V1EndpointSubsetBuilder>();}
    for (V1EndpointSubset item : items) {V1EndpointSubsetBuilder builder = new V1EndpointSubsetBuilder(item);_visitables.get("subsets").add(builder);this.subsets.add(builder);} return (A)this;
  }
  public A removeFromSubsets(io.kubernetes.client.openapi.models.V1EndpointSubset... items) {
    for (V1EndpointSubset item : items) {V1EndpointSubsetBuilder builder = new V1EndpointSubsetBuilder(item);_visitables.get("subsets").remove(builder);if (this.subsets != null) {this.subsets.remove(builder);}} return (A)this;
  }
  public A removeAllFromSubsets(Collection<V1EndpointSubset> items) {
    for (V1EndpointSubset item : items) {V1EndpointSubsetBuilder builder = new V1EndpointSubsetBuilder(item);_visitables.get("subsets").remove(builder);if (this.subsets != null) {this.subsets.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromSubsets(Predicate<V1EndpointSubsetBuilder> predicate) {
    if (subsets == null) return (A) this;
    final Iterator<V1EndpointSubsetBuilder> each = subsets.iterator();
    final List visitables = _visitables.get("subsets");
    while (each.hasNext()) {
      V1EndpointSubsetBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildSubsets instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1EndpointSubset> getSubsets() {
    return subsets != null ? build(subsets) : null;
  }
  public List<V1EndpointSubset> buildSubsets() {
    return subsets != null ? build(subsets) : null;
  }
  public V1EndpointSubset buildSubset(Integer index) {
    return this.subsets.get(index).build();
  }
  public V1EndpointSubset buildFirstSubset() {
    return this.subsets.get(0).build();
  }
  public V1EndpointSubset buildLastSubset() {
    return this.subsets.get(subsets.size() - 1).build();
  }
  public V1EndpointSubset buildMatchingSubset(Predicate<V1EndpointSubsetBuilder> predicate) {
    for (V1EndpointSubsetBuilder item: subsets) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingSubset(Predicate<V1EndpointSubsetBuilder> predicate) {
    for (V1EndpointSubsetBuilder item: subsets) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withSubsets(List<V1EndpointSubset> subsets) {
    if (this.subsets != null) { _visitables.get("subsets").removeAll(this.subsets);}
    if (subsets != null) {this.subsets = new ArrayList(); for (V1EndpointSubset item : subsets){this.addToSubsets(item);}} else { this.subsets = null;} return (A) this;
  }
  public A withSubsets(io.kubernetes.client.openapi.models.V1EndpointSubset... subsets) {
    if (this.subsets != null) {this.subsets.clear();}
    if (subsets != null) {for (V1EndpointSubset item :subsets){ this.addToSubsets(item);}} return (A) this;
  }
  public Boolean hasSubsets() {
    return subsets != null && !subsets.isEmpty();
  }
  public V1EndpointsFluent.SubsetsNested<A> addNewSubset() {
    return new V1EndpointsFluentImpl.SubsetsNestedImpl();
  }
  public V1EndpointsFluent.SubsetsNested<A> addNewSubsetLike(V1EndpointSubset item) {
    return new V1EndpointsFluentImpl.SubsetsNestedImpl(-1, item);
  }
  public V1EndpointsFluent.SubsetsNested<A> setNewSubsetLike(Integer index,V1EndpointSubset item) {
    return new V1EndpointsFluentImpl.SubsetsNestedImpl(index, item);
  }
  public V1EndpointsFluent.SubsetsNested<A> editSubset(Integer index) {
    if (subsets.size() <= index) throw new RuntimeException("Can't edit subsets. Index exceeds size.");
    return setNewSubsetLike(index, buildSubset(index));
  }
  public V1EndpointsFluent.SubsetsNested<A> editFirstSubset() {
    if (subsets.size() == 0) throw new RuntimeException("Can't edit first subsets. The list is empty.");
    return setNewSubsetLike(0, buildSubset(0));
  }
  public V1EndpointsFluent.SubsetsNested<A> editLastSubset() {
    int index = subsets.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last subsets. The list is empty.");
    return setNewSubsetLike(index, buildSubset(index));
  }
  public V1EndpointsFluent.SubsetsNested<A> editMatchingSubset(Predicate<V1EndpointSubsetBuilder> predicate) {
    int index = -1;
    for (int i=0;i<subsets.size();i++) { 
    if (predicate.test(subsets.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching subsets. No match found.");
    return setNewSubsetLike(index, buildSubset(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1EndpointsFluentImpl that = (V1EndpointsFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    if (subsets != null ? !subsets.equals(that.subsets) :that.subsets != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  kind,  metadata,  subsets,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (subsets != null && !subsets.isEmpty()) { sb.append("subsets:"); sb.append(subsets); }
    sb.append("}");
    return sb.toString();
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1EndpointsFluent.MetadataNested<N>> implements V1EndpointsFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1EndpointsFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class SubsetsNestedImpl<N> extends V1EndpointSubsetFluentImpl<V1EndpointsFluent.SubsetsNested<N>> implements V1EndpointsFluent.SubsetsNested<N>,Nested<N>{
    SubsetsNestedImpl(Integer index,V1EndpointSubset item) {
      this.index = index;
      this.builder = new V1EndpointSubsetBuilder(this, item);
    }
    SubsetsNestedImpl() {
      this.index = -1;
      this.builder = new V1EndpointSubsetBuilder(this);
    }
    V1EndpointSubsetBuilder builder;
    Integer index;
    public N and() {
      return (N) V1EndpointsFluentImpl.this.setToSubsets(index,builder.build());
    }
    public N endSubset() {
      return and();
    }
    
  }
  
}