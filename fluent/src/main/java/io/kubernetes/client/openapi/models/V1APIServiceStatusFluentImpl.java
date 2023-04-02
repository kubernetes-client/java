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
  public class V1APIServiceStatusFluentImpl<A extends V1APIServiceStatusFluent<A>> extends BaseFluent<A> implements V1APIServiceStatusFluent<A>{
  public V1APIServiceStatusFluentImpl() {
  }
  public V1APIServiceStatusFluentImpl(V1APIServiceStatus instance) {
    this.withConditions(instance.getConditions());

  }
  private ArrayList<V1APIServiceConditionBuilder> conditions;
  public A addToConditions(Integer index,V1APIServiceCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1APIServiceConditionBuilder>();}
    V1APIServiceConditionBuilder builder = new V1APIServiceConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
  }
  public A setToConditions(Integer index,V1APIServiceCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1APIServiceConditionBuilder>();}
    V1APIServiceConditionBuilder builder = new V1APIServiceConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
    if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
     return (A)this;
  }
  public A addToConditions(io.kubernetes.client.openapi.models.V1APIServiceCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1APIServiceConditionBuilder>();}
    for (V1APIServiceCondition item : items) {V1APIServiceConditionBuilder builder = new V1APIServiceConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A addAllToConditions(Collection<V1APIServiceCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1APIServiceConditionBuilder>();}
    for (V1APIServiceCondition item : items) {V1APIServiceConditionBuilder builder = new V1APIServiceConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1APIServiceCondition... items) {
    for (V1APIServiceCondition item : items) {V1APIServiceConditionBuilder builder = new V1APIServiceConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeAllFromConditions(Collection<V1APIServiceCondition> items) {
    for (V1APIServiceCondition item : items) {V1APIServiceConditionBuilder builder = new V1APIServiceConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromConditions(Predicate<V1APIServiceConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1APIServiceConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1APIServiceConditionBuilder builder = each.next();
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
  public List<V1APIServiceCondition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public List<V1APIServiceCondition> buildConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public V1APIServiceCondition buildCondition(Integer index) {
    return this.conditions.get(index).build();
  }
  public V1APIServiceCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  public V1APIServiceCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  public V1APIServiceCondition buildMatchingCondition(Predicate<V1APIServiceConditionBuilder> predicate) {
    for (V1APIServiceConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingCondition(Predicate<V1APIServiceConditionBuilder> predicate) {
    for (V1APIServiceConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withConditions(List<V1APIServiceCondition> conditions) {
    if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
    if (conditions != null) {this.conditions = new ArrayList(); for (V1APIServiceCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
  }
  public A withConditions(io.kubernetes.client.openapi.models.V1APIServiceCondition... conditions) {
    if (this.conditions != null) {this.conditions.clear();}
    if (conditions != null) {for (V1APIServiceCondition item :conditions){ this.addToConditions(item);}} return (A) this;
  }
  public Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }
  public V1APIServiceStatusFluent.ConditionsNested<A> addNewCondition() {
    return new V1APIServiceStatusFluentImpl.ConditionsNestedImpl();
  }
  public V1APIServiceStatusFluent.ConditionsNested<A> addNewConditionLike(V1APIServiceCondition item) {
    return new V1APIServiceStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }
  public V1APIServiceStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1APIServiceCondition item) {
    return new V1APIServiceStatusFluentImpl.ConditionsNestedImpl(index, item);
  }
  public V1APIServiceStatusFluent.ConditionsNested<A> editCondition(Integer index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1APIServiceStatusFluent.ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  public V1APIServiceStatusFluent.ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1APIServiceStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1APIServiceConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1APIServiceStatusFluentImpl that = (V1APIServiceStatusFluentImpl) o;
    if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(conditions,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions); }
    sb.append("}");
    return sb.toString();
  }
  class ConditionsNestedImpl<N> extends V1APIServiceConditionFluentImpl<V1APIServiceStatusFluent.ConditionsNested<N>> implements V1APIServiceStatusFluent.ConditionsNested<N>,Nested<N>{
    ConditionsNestedImpl(Integer index,V1APIServiceCondition item) {
      this.index = index;
      this.builder = new V1APIServiceConditionBuilder(this, item);
    }
    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new V1APIServiceConditionBuilder(this);
    }
    V1APIServiceConditionBuilder builder;
    Integer index;
    public N and() {
      return (N) V1APIServiceStatusFluentImpl.this.setToConditions(index,builder.build());
    }
    public N endCondition() {
      return and();
    }
    
  }
  
}