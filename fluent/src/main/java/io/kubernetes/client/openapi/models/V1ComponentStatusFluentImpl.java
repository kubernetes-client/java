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
  public class V1ComponentStatusFluentImpl<A extends V1ComponentStatusFluent<A>> extends BaseFluent<A> implements V1ComponentStatusFluent<A>{
  public V1ComponentStatusFluentImpl() {
  }
  public V1ComponentStatusFluentImpl(V1ComponentStatus instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withConditions(instance.getConditions());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

  }
  private String apiVersion;
  private ArrayList<V1ComponentConditionBuilder> conditions;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public A addToConditions(Integer index,V1ComponentCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ComponentConditionBuilder>();}
    V1ComponentConditionBuilder builder = new V1ComponentConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
  }
  public A setToConditions(Integer index,V1ComponentCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ComponentConditionBuilder>();}
    V1ComponentConditionBuilder builder = new V1ComponentConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
    if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
     return (A)this;
  }
  public A addToConditions(io.kubernetes.client.openapi.models.V1ComponentCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ComponentConditionBuilder>();}
    for (V1ComponentCondition item : items) {V1ComponentConditionBuilder builder = new V1ComponentConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A addAllToConditions(Collection<V1ComponentCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ComponentConditionBuilder>();}
    for (V1ComponentCondition item : items) {V1ComponentConditionBuilder builder = new V1ComponentConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1ComponentCondition... items) {
    for (V1ComponentCondition item : items) {V1ComponentConditionBuilder builder = new V1ComponentConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeAllFromConditions(Collection<V1ComponentCondition> items) {
    for (V1ComponentCondition item : items) {V1ComponentConditionBuilder builder = new V1ComponentConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromConditions(Predicate<V1ComponentConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1ComponentConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1ComponentConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ComponentCondition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public List<V1ComponentCondition> buildConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public V1ComponentCondition buildCondition(Integer index) {
    return this.conditions.get(index).build();
  }
  public V1ComponentCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  public V1ComponentCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  public V1ComponentCondition buildMatchingCondition(Predicate<V1ComponentConditionBuilder> predicate) {
    for (V1ComponentConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingCondition(Predicate<V1ComponentConditionBuilder> predicate) {
    for (V1ComponentConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withConditions(List<V1ComponentCondition> conditions) {
    if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
    if (conditions != null) {this.conditions = new ArrayList(); for (V1ComponentCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
  }
  public A withConditions(io.kubernetes.client.openapi.models.V1ComponentCondition... conditions) {
    if (this.conditions != null) {this.conditions.clear();}
    if (conditions != null) {for (V1ComponentCondition item :conditions){ this.addToConditions(item);}} return (A) this;
  }
  public Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }
  public V1ComponentStatusFluent.ConditionsNested<A> addNewCondition() {
    return new V1ComponentStatusFluentImpl.ConditionsNestedImpl();
  }
  public V1ComponentStatusFluent.ConditionsNested<A> addNewConditionLike(V1ComponentCondition item) {
    return new V1ComponentStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }
  public V1ComponentStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1ComponentCondition item) {
    return new V1ComponentStatusFluentImpl.ConditionsNestedImpl(index, item);
  }
  public V1ComponentStatusFluent.ConditionsNested<A> editCondition(Integer index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1ComponentStatusFluent.ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  public V1ComponentStatusFluent.ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1ComponentStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1ComponentConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
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
  public V1ComponentStatusFluent.MetadataNested<A> withNewMetadata() {
    return new V1ComponentStatusFluentImpl.MetadataNestedImpl();
  }
  public V1ComponentStatusFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1ComponentStatusFluentImpl.MetadataNestedImpl(item);
  }
  public V1ComponentStatusFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1ComponentStatusFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1ComponentStatusFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ComponentStatusFluentImpl that = (V1ComponentStatusFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  conditions,  kind,  metadata,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata); }
    sb.append("}");
    return sb.toString();
  }
  class ConditionsNestedImpl<N> extends V1ComponentConditionFluentImpl<V1ComponentStatusFluent.ConditionsNested<N>> implements V1ComponentStatusFluent.ConditionsNested<N>,Nested<N>{
    ConditionsNestedImpl(Integer index,V1ComponentCondition item) {
      this.index = index;
      this.builder = new V1ComponentConditionBuilder(this, item);
    }
    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new V1ComponentConditionBuilder(this);
    }
    V1ComponentConditionBuilder builder;
    Integer index;
    public N and() {
      return (N) V1ComponentStatusFluentImpl.this.setToConditions(index,builder.build());
    }
    public N endCondition() {
      return and();
    }
    
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1ComponentStatusFluent.MetadataNested<N>> implements V1ComponentStatusFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1ComponentStatusFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  
}