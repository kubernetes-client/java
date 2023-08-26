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
import java.lang.Long;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ReplicaSetStatusFluentImpl<A extends V1ReplicaSetStatusFluent<A>> extends BaseFluent<A> implements V1ReplicaSetStatusFluent<A>{
  public V1ReplicaSetStatusFluentImpl() {
  }
  public V1ReplicaSetStatusFluentImpl(V1ReplicaSetStatus instance) {
    if (instance != null) {
      this.withAvailableReplicas(instance.getAvailableReplicas());
      this.withConditions(instance.getConditions());
      this.withFullyLabeledReplicas(instance.getFullyLabeledReplicas());
      this.withObservedGeneration(instance.getObservedGeneration());
      this.withReadyReplicas(instance.getReadyReplicas());
      this.withReplicas(instance.getReplicas());
    }
  }
  private Integer availableReplicas;
  private ArrayList<V1ReplicaSetConditionBuilder> conditions;
  private Integer fullyLabeledReplicas;
  private Long observedGeneration;
  private Integer readyReplicas;
  private Integer replicas;
  public Integer getAvailableReplicas() {
    return this.availableReplicas;
  }
  public A withAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas=availableReplicas; return (A) this;
  }
  public Boolean hasAvailableReplicas() {
    return this.availableReplicas != null;
  }
  public A addToConditions(int index,V1ReplicaSetCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ReplicaSetConditionBuilder>();}
    V1ReplicaSetConditionBuilder builder = new V1ReplicaSetConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  public A setToConditions(int index,V1ReplicaSetCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ReplicaSetConditionBuilder>();}
    V1ReplicaSetConditionBuilder builder = new V1ReplicaSetConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
    return (A)this;
  }
  public A addToConditions(io.kubernetes.client.openapi.models.V1ReplicaSetCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ReplicaSetConditionBuilder>();}
    for (V1ReplicaSetCondition item : items) {V1ReplicaSetConditionBuilder builder = new V1ReplicaSetConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A addAllToConditions(Collection<V1ReplicaSetCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ReplicaSetConditionBuilder>();}
    for (V1ReplicaSetCondition item : items) {V1ReplicaSetConditionBuilder builder = new V1ReplicaSetConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1ReplicaSetCondition... items) {
    for (V1ReplicaSetCondition item : items) {V1ReplicaSetConditionBuilder builder = new V1ReplicaSetConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeAllFromConditions(Collection<V1ReplicaSetCondition> items) {
    for (V1ReplicaSetCondition item : items) {V1ReplicaSetConditionBuilder builder = new V1ReplicaSetConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromConditions(Predicate<V1ReplicaSetConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1ReplicaSetConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1ReplicaSetConditionBuilder builder = each.next();
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
  public List<V1ReplicaSetCondition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public List<V1ReplicaSetCondition> buildConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public V1ReplicaSetCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  public V1ReplicaSetCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  public V1ReplicaSetCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  public V1ReplicaSetCondition buildMatchingCondition(Predicate<V1ReplicaSetConditionBuilder> predicate) {
    for (V1ReplicaSetConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingCondition(Predicate<V1ReplicaSetConditionBuilder> predicate) {
    for (V1ReplicaSetConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withConditions(List<V1ReplicaSetCondition> conditions) {
    if (this.conditions != null) { _visitables.get("conditions").clear();}
    if (conditions != null) {this.conditions = new ArrayList(); for (V1ReplicaSetCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
  }
  public A withConditions(io.kubernetes.client.openapi.models.V1ReplicaSetCondition... conditions) {
    if (this.conditions != null) {this.conditions.clear(); _visitables.remove("conditions"); }
    if (conditions != null) {for (V1ReplicaSetCondition item :conditions){ this.addToConditions(item);}} return (A) this;
  }
  public Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }
  public V1ReplicaSetStatusFluentImpl.ConditionsNested<A> addNewCondition() {
    return new V1ReplicaSetStatusFluentImpl.ConditionsNestedImpl();
  }
  public V1ReplicaSetStatusFluentImpl.ConditionsNested<A> addNewConditionLike(V1ReplicaSetCondition item) {
    return new V1ReplicaSetStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }
  public V1ReplicaSetStatusFluentImpl.ConditionsNested<A> setNewConditionLike(int index,V1ReplicaSetCondition item) {
    return new V1ReplicaSetStatusFluentImpl.ConditionsNestedImpl(index, item);
  }
  public V1ReplicaSetStatusFluentImpl.ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1ReplicaSetStatusFluentImpl.ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  public V1ReplicaSetStatusFluentImpl.ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1ReplicaSetStatusFluentImpl.ConditionsNested<A> editMatchingCondition(Predicate<V1ReplicaSetConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public Integer getFullyLabeledReplicas() {
    return this.fullyLabeledReplicas;
  }
  public A withFullyLabeledReplicas(Integer fullyLabeledReplicas) {
    this.fullyLabeledReplicas=fullyLabeledReplicas; return (A) this;
  }
  public Boolean hasFullyLabeledReplicas() {
    return this.fullyLabeledReplicas != null;
  }
  public Long getObservedGeneration() {
    return this.observedGeneration;
  }
  public A withObservedGeneration(Long observedGeneration) {
    this.observedGeneration=observedGeneration; return (A) this;
  }
  public Boolean hasObservedGeneration() {
    return this.observedGeneration != null;
  }
  public Integer getReadyReplicas() {
    return this.readyReplicas;
  }
  public A withReadyReplicas(Integer readyReplicas) {
    this.readyReplicas=readyReplicas; return (A) this;
  }
  public Boolean hasReadyReplicas() {
    return this.readyReplicas != null;
  }
  public Integer getReplicas() {
    return this.replicas;
  }
  public A withReplicas(Integer replicas) {
    this.replicas=replicas; return (A) this;
  }
  public Boolean hasReplicas() {
    return this.replicas != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ReplicaSetStatusFluentImpl that = (V1ReplicaSetStatusFluentImpl) o;
    if (!java.util.Objects.equals(availableReplicas, that.availableReplicas)) return false;

    if (!java.util.Objects.equals(conditions, that.conditions)) return false;

    if (!java.util.Objects.equals(fullyLabeledReplicas, that.fullyLabeledReplicas)) return false;

    if (!java.util.Objects.equals(observedGeneration, that.observedGeneration)) return false;

    if (!java.util.Objects.equals(readyReplicas, that.readyReplicas)) return false;

    if (!java.util.Objects.equals(replicas, that.replicas)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(availableReplicas,  conditions,  fullyLabeledReplicas,  observedGeneration,  readyReplicas,  replicas,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (availableReplicas != null) { sb.append("availableReplicas:"); sb.append(availableReplicas + ","); }
    if (conditions != null) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (fullyLabeledReplicas != null) { sb.append("fullyLabeledReplicas:"); sb.append(fullyLabeledReplicas + ","); }
    if (observedGeneration != null) { sb.append("observedGeneration:"); sb.append(observedGeneration + ","); }
    if (readyReplicas != null) { sb.append("readyReplicas:"); sb.append(readyReplicas + ","); }
    if (replicas != null) { sb.append("replicas:"); sb.append(replicas); }
    sb.append("}");
    return sb.toString();
  }
  class ConditionsNestedImpl<N> extends V1ReplicaSetConditionFluentImpl<V1ReplicaSetStatusFluentImpl.ConditionsNested<N>> implements V1ReplicaSetStatusFluentImpl.ConditionsNested<N>,Nested<N>{
    ConditionsNestedImpl(int index,V1ReplicaSetCondition item) {
      this.index = index;
      this.builder = new V1ReplicaSetConditionBuilder(this, item);
    }
    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new V1ReplicaSetConditionBuilder(this);
    }
    V1ReplicaSetConditionBuilder builder;
    int index;
    public N and() {
      return (N) V1ReplicaSetStatusFluentImpl.this.setToConditions(index,builder.build());
    }
    public N endCondition() {
      return and();
    }
    
  }
  
}