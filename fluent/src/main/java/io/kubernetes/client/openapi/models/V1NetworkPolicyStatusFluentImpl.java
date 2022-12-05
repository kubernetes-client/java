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
  public class V1NetworkPolicyStatusFluentImpl<A extends V1NetworkPolicyStatusFluent<A>> extends BaseFluent<A> implements V1NetworkPolicyStatusFluent<A>{
  public V1NetworkPolicyStatusFluentImpl() {
  }
  public V1NetworkPolicyStatusFluentImpl(V1NetworkPolicyStatus instance) {
    this.withConditions(instance.getConditions());

  }
  private ArrayList<V1ConditionBuilder> conditions;
  public A addToConditions(Integer index,V1Condition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ConditionBuilder>();}
    V1ConditionBuilder builder = new V1ConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
  }
  public A setToConditions(Integer index,V1Condition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ConditionBuilder>();}
    V1ConditionBuilder builder = new V1ConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
    if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
     return (A)this;
  }
  public A addToConditions(io.kubernetes.client.openapi.models.V1Condition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ConditionBuilder>();}
    for (V1Condition item : items) {V1ConditionBuilder builder = new V1ConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A addAllToConditions(Collection<V1Condition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ConditionBuilder>();}
    for (V1Condition item : items) {V1ConditionBuilder builder = new V1ConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1Condition... items) {
    for (V1Condition item : items) {V1ConditionBuilder builder = new V1ConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeAllFromConditions(Collection<V1Condition> items) {
    for (V1Condition item : items) {V1ConditionBuilder builder = new V1ConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromConditions(Predicate<V1ConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1ConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1ConditionBuilder builder = each.next();
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
  public List<V1Condition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public List<V1Condition> buildConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public V1Condition buildCondition(Integer index) {
    return this.conditions.get(index).build();
  }
  public V1Condition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  public V1Condition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  public V1Condition buildMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
    for (V1ConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
    for (V1ConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withConditions(List<V1Condition> conditions) {
    if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
    if (conditions != null) {this.conditions = new ArrayList(); for (V1Condition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
  }
  public A withConditions(io.kubernetes.client.openapi.models.V1Condition... conditions) {
    if (this.conditions != null) {this.conditions.clear();}
    if (conditions != null) {for (V1Condition item :conditions){ this.addToConditions(item);}} return (A) this;
  }
  public Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }
  public V1NetworkPolicyStatusFluent.ConditionsNested<A> addNewCondition() {
    return new V1NetworkPolicyStatusFluentImpl.ConditionsNestedImpl();
  }
  public V1NetworkPolicyStatusFluent.ConditionsNested<A> addNewConditionLike(V1Condition item) {
    return new V1NetworkPolicyStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }
  public V1NetworkPolicyStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1Condition item) {
    return new V1NetworkPolicyStatusFluentImpl.ConditionsNestedImpl(index, item);
  }
  public V1NetworkPolicyStatusFluent.ConditionsNested<A> editCondition(Integer index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1NetworkPolicyStatusFluent.ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  public V1NetworkPolicyStatusFluent.ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1NetworkPolicyStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
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
    V1NetworkPolicyStatusFluentImpl that = (V1NetworkPolicyStatusFluentImpl) o;
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
  class ConditionsNestedImpl<N> extends V1ConditionFluentImpl<V1NetworkPolicyStatusFluent.ConditionsNested<N>> implements V1NetworkPolicyStatusFluent.ConditionsNested<N>,Nested<N>{
    ConditionsNestedImpl(Integer index,V1Condition item) {
      this.index = index;
      this.builder = new V1ConditionBuilder(this, item);
    }
    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new V1ConditionBuilder(this);
    }
    V1ConditionBuilder builder;
    Integer index;
    public N and() {
      return (N) V1NetworkPolicyStatusFluentImpl.this.setToConditions(index,builder.build());
    }
    public N endCondition() {
      return and();
    }
    
  }
  
}