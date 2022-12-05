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
  public class V1beta2PriorityLevelConfigurationStatusFluentImpl<A extends V1beta2PriorityLevelConfigurationStatusFluent<A>> extends BaseFluent<A> implements V1beta2PriorityLevelConfigurationStatusFluent<A>{
  public V1beta2PriorityLevelConfigurationStatusFluentImpl() {
  }
  public V1beta2PriorityLevelConfigurationStatusFluentImpl(V1beta2PriorityLevelConfigurationStatus instance) {
    this.withConditions(instance.getConditions());

  }
  private ArrayList<V1beta2PriorityLevelConfigurationConditionBuilder> conditions;
  public A addToConditions(Integer index,V1beta2PriorityLevelConfigurationCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1beta2PriorityLevelConfigurationConditionBuilder>();}
    V1beta2PriorityLevelConfigurationConditionBuilder builder = new V1beta2PriorityLevelConfigurationConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
  }
  public A setToConditions(Integer index,V1beta2PriorityLevelConfigurationCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1beta2PriorityLevelConfigurationConditionBuilder>();}
    V1beta2PriorityLevelConfigurationConditionBuilder builder = new V1beta2PriorityLevelConfigurationConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
    if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
     return (A)this;
  }
  public A addToConditions(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1beta2PriorityLevelConfigurationConditionBuilder>();}
    for (V1beta2PriorityLevelConfigurationCondition item : items) {V1beta2PriorityLevelConfigurationConditionBuilder builder = new V1beta2PriorityLevelConfigurationConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A addAllToConditions(Collection<V1beta2PriorityLevelConfigurationCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1beta2PriorityLevelConfigurationConditionBuilder>();}
    for (V1beta2PriorityLevelConfigurationCondition item : items) {V1beta2PriorityLevelConfigurationConditionBuilder builder = new V1beta2PriorityLevelConfigurationConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition... items) {
    for (V1beta2PriorityLevelConfigurationCondition item : items) {V1beta2PriorityLevelConfigurationConditionBuilder builder = new V1beta2PriorityLevelConfigurationConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeAllFromConditions(Collection<V1beta2PriorityLevelConfigurationCondition> items) {
    for (V1beta2PriorityLevelConfigurationCondition item : items) {V1beta2PriorityLevelConfigurationConditionBuilder builder = new V1beta2PriorityLevelConfigurationConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromConditions(Predicate<V1beta2PriorityLevelConfigurationConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1beta2PriorityLevelConfigurationConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1beta2PriorityLevelConfigurationConditionBuilder builder = each.next();
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
  public List<V1beta2PriorityLevelConfigurationCondition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public List<V1beta2PriorityLevelConfigurationCondition> buildConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public V1beta2PriorityLevelConfigurationCondition buildCondition(Integer index) {
    return this.conditions.get(index).build();
  }
  public V1beta2PriorityLevelConfigurationCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  public V1beta2PriorityLevelConfigurationCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  public V1beta2PriorityLevelConfigurationCondition buildMatchingCondition(Predicate<V1beta2PriorityLevelConfigurationConditionBuilder> predicate) {
    for (V1beta2PriorityLevelConfigurationConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingCondition(Predicate<V1beta2PriorityLevelConfigurationConditionBuilder> predicate) {
    for (V1beta2PriorityLevelConfigurationConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withConditions(List<V1beta2PriorityLevelConfigurationCondition> conditions) {
    if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
    if (conditions != null) {this.conditions = new ArrayList(); for (V1beta2PriorityLevelConfigurationCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
  }
  public A withConditions(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition... conditions) {
    if (this.conditions != null) {this.conditions.clear();}
    if (conditions != null) {for (V1beta2PriorityLevelConfigurationCondition item :conditions){ this.addToConditions(item);}} return (A) this;
  }
  public Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }
  public V1beta2PriorityLevelConfigurationStatusFluent.ConditionsNested<A> addNewCondition() {
    return new V1beta2PriorityLevelConfigurationStatusFluentImpl.ConditionsNestedImpl();
  }
  public V1beta2PriorityLevelConfigurationStatusFluent.ConditionsNested<A> addNewConditionLike(V1beta2PriorityLevelConfigurationCondition item) {
    return new V1beta2PriorityLevelConfigurationStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }
  public V1beta2PriorityLevelConfigurationStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1beta2PriorityLevelConfigurationCondition item) {
    return new V1beta2PriorityLevelConfigurationStatusFluentImpl.ConditionsNestedImpl(index, item);
  }
  public V1beta2PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editCondition(Integer index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1beta2PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  public V1beta2PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1beta2PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1beta2PriorityLevelConfigurationConditionBuilder> predicate) {
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
    V1beta2PriorityLevelConfigurationStatusFluentImpl that = (V1beta2PriorityLevelConfigurationStatusFluentImpl) o;
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
  class ConditionsNestedImpl<N> extends V1beta2PriorityLevelConfigurationConditionFluentImpl<V1beta2PriorityLevelConfigurationStatusFluent.ConditionsNested<N>> implements V1beta2PriorityLevelConfigurationStatusFluent.ConditionsNested<N>,Nested<N>{
    ConditionsNestedImpl(Integer index,V1beta2PriorityLevelConfigurationCondition item) {
      this.index = index;
      this.builder = new V1beta2PriorityLevelConfigurationConditionBuilder(this, item);
    }
    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new V1beta2PriorityLevelConfigurationConditionBuilder(this);
    }
    V1beta2PriorityLevelConfigurationConditionBuilder builder;
    Integer index;
    public N and() {
      return (N) V1beta2PriorityLevelConfigurationStatusFluentImpl.this.setToConditions(index,builder.build());
    }
    public N endCondition() {
      return and();
    }
    
  }
  
}