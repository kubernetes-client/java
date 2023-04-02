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
  public class V1NamespaceStatusFluentImpl<A extends V1NamespaceStatusFluent<A>> extends BaseFluent<A> implements V1NamespaceStatusFluent<A>{
  public V1NamespaceStatusFluentImpl() {
  }
  public V1NamespaceStatusFluentImpl(V1NamespaceStatus instance) {
    this.withConditions(instance.getConditions());

    this.withPhase(instance.getPhase());

  }
  private ArrayList<V1NamespaceConditionBuilder> conditions;
  private String phase;
  public A addToConditions(Integer index,V1NamespaceCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1NamespaceConditionBuilder>();}
    V1NamespaceConditionBuilder builder = new V1NamespaceConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
  }
  public A setToConditions(Integer index,V1NamespaceCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1NamespaceConditionBuilder>();}
    V1NamespaceConditionBuilder builder = new V1NamespaceConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
    if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
     return (A)this;
  }
  public A addToConditions(io.kubernetes.client.openapi.models.V1NamespaceCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1NamespaceConditionBuilder>();}
    for (V1NamespaceCondition item : items) {V1NamespaceConditionBuilder builder = new V1NamespaceConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A addAllToConditions(Collection<V1NamespaceCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1NamespaceConditionBuilder>();}
    for (V1NamespaceCondition item : items) {V1NamespaceConditionBuilder builder = new V1NamespaceConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1NamespaceCondition... items) {
    for (V1NamespaceCondition item : items) {V1NamespaceConditionBuilder builder = new V1NamespaceConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeAllFromConditions(Collection<V1NamespaceCondition> items) {
    for (V1NamespaceCondition item : items) {V1NamespaceConditionBuilder builder = new V1NamespaceConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromConditions(Predicate<V1NamespaceConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1NamespaceConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1NamespaceConditionBuilder builder = each.next();
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
  public List<V1NamespaceCondition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public List<V1NamespaceCondition> buildConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public V1NamespaceCondition buildCondition(Integer index) {
    return this.conditions.get(index).build();
  }
  public V1NamespaceCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  public V1NamespaceCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  public V1NamespaceCondition buildMatchingCondition(Predicate<V1NamespaceConditionBuilder> predicate) {
    for (V1NamespaceConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingCondition(Predicate<V1NamespaceConditionBuilder> predicate) {
    for (V1NamespaceConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withConditions(List<V1NamespaceCondition> conditions) {
    if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
    if (conditions != null) {this.conditions = new ArrayList(); for (V1NamespaceCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
  }
  public A withConditions(io.kubernetes.client.openapi.models.V1NamespaceCondition... conditions) {
    if (this.conditions != null) {this.conditions.clear();}
    if (conditions != null) {for (V1NamespaceCondition item :conditions){ this.addToConditions(item);}} return (A) this;
  }
  public Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }
  public V1NamespaceStatusFluent.ConditionsNested<A> addNewCondition() {
    return new V1NamespaceStatusFluentImpl.ConditionsNestedImpl();
  }
  public V1NamespaceStatusFluent.ConditionsNested<A> addNewConditionLike(V1NamespaceCondition item) {
    return new V1NamespaceStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }
  public V1NamespaceStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1NamespaceCondition item) {
    return new V1NamespaceStatusFluentImpl.ConditionsNestedImpl(index, item);
  }
  public V1NamespaceStatusFluent.ConditionsNested<A> editCondition(Integer index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1NamespaceStatusFluent.ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  public V1NamespaceStatusFluent.ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1NamespaceStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1NamespaceConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public String getPhase() {
    return this.phase;
  }
  public A withPhase(String phase) {
    this.phase=phase; return (A) this;
  }
  public Boolean hasPhase() {
    return this.phase != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NamespaceStatusFluentImpl that = (V1NamespaceStatusFluentImpl) o;
    if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
    if (phase != null ? !phase.equals(that.phase) :that.phase != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(conditions,  phase,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (phase != null) { sb.append("phase:"); sb.append(phase); }
    sb.append("}");
    return sb.toString();
  }
  class ConditionsNestedImpl<N> extends V1NamespaceConditionFluentImpl<V1NamespaceStatusFluent.ConditionsNested<N>> implements V1NamespaceStatusFluent.ConditionsNested<N>,Nested<N>{
    ConditionsNestedImpl(Integer index,V1NamespaceCondition item) {
      this.index = index;
      this.builder = new V1NamespaceConditionBuilder(this, item);
    }
    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new V1NamespaceConditionBuilder(this);
    }
    V1NamespaceConditionBuilder builder;
    Integer index;
    public N and() {
      return (N) V1NamespaceStatusFluentImpl.this.setToConditions(index,builder.build());
    }
    public N endCondition() {
      return and();
    }
    
  }
  
}