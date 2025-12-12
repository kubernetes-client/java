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
public class V1EndpointsFluent<A extends io.kubernetes.client.openapi.models.V1EndpointsFluent<A>> extends BaseFluent<A>{

  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private ArrayList<V1EndpointSubsetBuilder> subsets;

  public V1EndpointsFluent() {
  }
  
  public V1EndpointsFluent(V1Endpoints instance) {
    this.copyInstance(instance);
  }

  public A addAllToSubsets(Collection<V1EndpointSubset> items) {
    if (this.subsets == null) {
      this.subsets = new ArrayList();
    }
    for (V1EndpointSubset item : items) {
        V1EndpointSubsetBuilder builder = new V1EndpointSubsetBuilder(item);
        _visitables.get("subsets").add(builder);
        this.subsets.add(builder);
    }
    return (A) this;
  }
  
  public SubsetsNested<A> addNewSubset() {
    return new SubsetsNested(-1, null);
  }
  
  public SubsetsNested<A> addNewSubsetLike(V1EndpointSubset item) {
    return new SubsetsNested(-1, item);
  }
  
  public A addToSubsets(V1EndpointSubset... items) {
    if (this.subsets == null) {
      this.subsets = new ArrayList();
    }
    for (V1EndpointSubset item : items) {
        V1EndpointSubsetBuilder builder = new V1EndpointSubsetBuilder(item);
        _visitables.get("subsets").add(builder);
        this.subsets.add(builder);
    }
    return (A) this;
  }
  
  public A addToSubsets(int index,V1EndpointSubset item) {
    if (this.subsets == null) {
      this.subsets = new ArrayList();
    }
    V1EndpointSubsetBuilder builder = new V1EndpointSubsetBuilder(item);
    if (index < 0 || index >= subsets.size()) {
        _visitables.get("subsets").add(builder);
        subsets.add(builder);
    } else {
        _visitables.get("subsets").add(builder);
        subsets.add(index, builder);
    }
    return (A) this;
  }
  
  public V1EndpointSubset buildFirstSubset() {
    return this.subsets.get(0).build();
  }
  
  public V1EndpointSubset buildLastSubset() {
    return this.subsets.get(subsets.size() - 1).build();
  }
  
  public V1EndpointSubset buildMatchingSubset(Predicate<V1EndpointSubsetBuilder> predicate) {
      for (V1EndpointSubsetBuilder item : subsets) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public V1EndpointSubset buildSubset(int index) {
    return this.subsets.get(index).build();
  }
  
  public List<V1EndpointSubset> buildSubsets() {
    return this.subsets != null ? build(subsets) : null;
  }
  
  protected void copyInstance(V1Endpoints instance) {
    instance = instance != null ? instance : new V1Endpoints();
    if (instance != null) {
        this.withApiVersion(instance.getApiVersion());
        this.withKind(instance.getKind());
        this.withMetadata(instance.getMetadata());
        this.withSubsets(instance.getSubsets());
    }
  }
  
  public SubsetsNested<A> editFirstSubset() {
    if (subsets.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "subsets"));
    }
    return this.setNewSubsetLike(0, this.buildSubset(0));
  }
  
  public SubsetsNested<A> editLastSubset() {
    int index = subsets.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "subsets"));
    }
    return this.setNewSubsetLike(index, this.buildSubset(index));
  }
  
  public SubsetsNested<A> editMatchingSubset(Predicate<V1EndpointSubsetBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < subsets.size();i++) {
      if (predicate.test(subsets.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "subsets"));
    }
    return this.setNewSubsetLike(index, this.buildSubset(index));
  }
  
  public MetadataNested<A> editMetadata() {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(new V1ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(item));
  }
  
  public SubsetsNested<A> editSubset(int index) {
    if (subsets.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "subsets"));
    }
    return this.setNewSubsetLike(index, this.buildSubset(index));
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
    V1EndpointsFluent that = (V1EndpointsFluent) o;
    if (!(Objects.equals(apiVersion, that.apiVersion))) {
      return false;
    }
    if (!(Objects.equals(kind, that.kind))) {
      return false;
    }
    if (!(Objects.equals(metadata, that.metadata))) {
      return false;
    }
    if (!(Objects.equals(subsets, that.subsets))) {
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
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public boolean hasMatchingSubset(Predicate<V1EndpointSubsetBuilder> predicate) {
      for (V1EndpointSubsetBuilder item : subsets) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public boolean hasSubsets() {
    return this.subsets != null && !(this.subsets.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, subsets);
  }
  
  public A removeAllFromSubsets(Collection<V1EndpointSubset> items) {
    if (this.subsets == null) {
      return (A) this;
    }
    for (V1EndpointSubset item : items) {
        V1EndpointSubsetBuilder builder = new V1EndpointSubsetBuilder(item);
        _visitables.get("subsets").remove(builder);
        this.subsets.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromSubsets(V1EndpointSubset... items) {
    if (this.subsets == null) {
      return (A) this;
    }
    for (V1EndpointSubset item : items) {
        V1EndpointSubsetBuilder builder = new V1EndpointSubsetBuilder(item);
        _visitables.get("subsets").remove(builder);
        this.subsets.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromSubsets(Predicate<V1EndpointSubsetBuilder> predicate) {
    if (subsets == null) {
      return (A) this;
    }
    Iterator<V1EndpointSubsetBuilder> each = subsets.iterator();
    List visitables = _visitables.get("subsets");
    while (each.hasNext()) {
        V1EndpointSubsetBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public SubsetsNested<A> setNewSubsetLike(int index,V1EndpointSubset item) {
    return new SubsetsNested(index, item);
  }
  
  public A setToSubsets(int index,V1EndpointSubset item) {
    if (this.subsets == null) {
      this.subsets = new ArrayList();
    }
    V1EndpointSubsetBuilder builder = new V1EndpointSubsetBuilder(item);
    if (index < 0 || index >= subsets.size()) {
        _visitables.get("subsets").add(builder);
        subsets.add(builder);
    } else {
        _visitables.get("subsets").add(builder);
        subsets.set(index, builder);
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
    if (!(kind == null)) {
        sb.append("kind:");
        sb.append(kind);
        sb.append(",");
    }
    if (!(metadata == null)) {
        sb.append("metadata:");
        sb.append(metadata);
        sb.append(",");
    }
    if (!(subsets == null) && !(subsets.isEmpty())) {
        sb.append("subsets:");
        sb.append(subsets);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public A withMetadata(V1ObjectMeta metadata) {
    this._visitables.remove("metadata");
    if (metadata != null) {
        this.metadata = new V1ObjectMetaBuilder(metadata);
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
  
  public MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new MetadataNested(item);
  }
  
  public A withSubsets(List<V1EndpointSubset> subsets) {
    if (this.subsets != null) {
      this._visitables.get("subsets").clear();
    }
    if (subsets != null) {
        this.subsets = new ArrayList();
        for (V1EndpointSubset item : subsets) {
          this.addToSubsets(item);
        }
    } else {
      this.subsets = null;
    }
    return (A) this;
  }
  
  public A withSubsets(V1EndpointSubset... subsets) {
    if (this.subsets != null) {
        this.subsets.clear();
        _visitables.remove("subsets");
    }
    if (subsets != null) {
      for (V1EndpointSubset item : subsets) {
        this.addToSubsets(item);
      }
    }
    return (A) this;
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
  
    V1ObjectMetaBuilder builder;
  
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EndpointsFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  }
  public class SubsetsNested<N> extends V1EndpointSubsetFluent<SubsetsNested<N>> implements Nested<N>{
  
    V1EndpointSubsetBuilder builder;
    int index;
  
    SubsetsNested(int index,V1EndpointSubset item) {
      this.index = index;
      this.builder = new V1EndpointSubsetBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EndpointsFluent.this.setToSubsets(index, builder.build());
    }
    
    public N endSubset() {
      return and();
    }
    
  }
}