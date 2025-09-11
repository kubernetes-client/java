package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.RuntimeException;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.util.Iterator;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ReplicaSetStatusFluent<A extends io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent<A>> extends BaseFluent<A>{
  public V1ReplicaSetStatusFluent() {
  }
  
  public V1ReplicaSetStatusFluent(V1ReplicaSetStatus instance) {
    this.copyInstance(instance);
  }
  private Integer availableReplicas;
  private ArrayList<V1ReplicaSetConditionBuilder> conditions;
  private Integer fullyLabeledReplicas;
  private Long observedGeneration;
  private Integer readyReplicas;
  private Integer replicas;
  private Integer terminatingReplicas;
  
  protected void copyInstance(V1ReplicaSetStatus instance) {
    instance = instance != null ? instance : new V1ReplicaSetStatus();
    if (instance != null) {
        this.withAvailableReplicas(instance.getAvailableReplicas());
        this.withConditions(instance.getConditions());
        this.withFullyLabeledReplicas(instance.getFullyLabeledReplicas());
        this.withObservedGeneration(instance.getObservedGeneration());
        this.withReadyReplicas(instance.getReadyReplicas());
        this.withReplicas(instance.getReplicas());
        this.withTerminatingReplicas(instance.getTerminatingReplicas());
    }
  }
  
  public Integer getAvailableReplicas() {
    return this.availableReplicas;
  }
  
  public A withAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
    return (A) this;
  }
  
  public boolean hasAvailableReplicas() {
    return this.availableReplicas != null;
  }
  
  public A addToConditions(int index,V1ReplicaSetCondition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1ReplicaSetConditionBuilder builder = new V1ReplicaSetConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToConditions(int index,V1ReplicaSetCondition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1ReplicaSetConditionBuilder builder = new V1ReplicaSetConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToConditions(V1ReplicaSetCondition... items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1ReplicaSetCondition item : items) {
        V1ReplicaSetConditionBuilder builder = new V1ReplicaSetConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToConditions(Collection<V1ReplicaSetCondition> items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1ReplicaSetCondition item : items) {
        V1ReplicaSetConditionBuilder builder = new V1ReplicaSetConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromConditions(V1ReplicaSetCondition... items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1ReplicaSetCondition item : items) {
        V1ReplicaSetConditionBuilder builder = new V1ReplicaSetConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromConditions(Collection<V1ReplicaSetCondition> items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1ReplicaSetCondition item : items) {
        V1ReplicaSetConditionBuilder builder = new V1ReplicaSetConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1ReplicaSetConditionBuilder> predicate) {
    if (conditions == null) {
      return (A) this;
    }
    Iterator<V1ReplicaSetConditionBuilder> each = conditions.iterator();
    List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
        V1ReplicaSetConditionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1ReplicaSetCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
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
      for (V1ReplicaSetConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1ReplicaSetConditionBuilder> predicate) {
      for (V1ReplicaSetConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<V1ReplicaSetCondition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1ReplicaSetCondition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(V1ReplicaSetCondition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1ReplicaSetCondition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !(this.conditions.isEmpty());
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1ReplicaSetCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1ReplicaSetCondition item) {
    return new ConditionsNested(index, item);
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (index <= conditions.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(0, this.buildCondition(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1ReplicaSetConditionBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < conditions.size();i++) {
      if (predicate.test(conditions.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public Integer getFullyLabeledReplicas() {
    return this.fullyLabeledReplicas;
  }
  
  public A withFullyLabeledReplicas(Integer fullyLabeledReplicas) {
    this.fullyLabeledReplicas = fullyLabeledReplicas;
    return (A) this;
  }
  
  public boolean hasFullyLabeledReplicas() {
    return this.fullyLabeledReplicas != null;
  }
  
  public Long getObservedGeneration() {
    return this.observedGeneration;
  }
  
  public A withObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return (A) this;
  }
  
  public boolean hasObservedGeneration() {
    return this.observedGeneration != null;
  }
  
  public Integer getReadyReplicas() {
    return this.readyReplicas;
  }
  
  public A withReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
    return (A) this;
  }
  
  public boolean hasReadyReplicas() {
    return this.readyReplicas != null;
  }
  
  public Integer getReplicas() {
    return this.replicas;
  }
  
  public A withReplicas(Integer replicas) {
    this.replicas = replicas;
    return (A) this;
  }
  
  public boolean hasReplicas() {
    return this.replicas != null;
  }
  
  public Integer getTerminatingReplicas() {
    return this.terminatingReplicas;
  }
  
  public A withTerminatingReplicas(Integer terminatingReplicas) {
    this.terminatingReplicas = terminatingReplicas;
    return (A) this;
  }
  
  public boolean hasTerminatingReplicas() {
    return this.terminatingReplicas != null;
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
    V1ReplicaSetStatusFluent that = (V1ReplicaSetStatusFluent) o;
    if (!(Objects.equals(availableReplicas, that.availableReplicas))) {
      return false;
    }
    if (!(Objects.equals(conditions, that.conditions))) {
      return false;
    }
    if (!(Objects.equals(fullyLabeledReplicas, that.fullyLabeledReplicas))) {
      return false;
    }
    if (!(Objects.equals(observedGeneration, that.observedGeneration))) {
      return false;
    }
    if (!(Objects.equals(readyReplicas, that.readyReplicas))) {
      return false;
    }
    if (!(Objects.equals(replicas, that.replicas))) {
      return false;
    }
    if (!(Objects.equals(terminatingReplicas, that.terminatingReplicas))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(availableReplicas, conditions, fullyLabeledReplicas, observedGeneration, readyReplicas, replicas, terminatingReplicas);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(availableReplicas == null)) {
        sb.append("availableReplicas:");
        sb.append(availableReplicas);
        sb.append(",");
    }
    if (!(conditions == null) && !(conditions.isEmpty())) {
        sb.append("conditions:");
        sb.append(conditions);
        sb.append(",");
    }
    if (!(fullyLabeledReplicas == null)) {
        sb.append("fullyLabeledReplicas:");
        sb.append(fullyLabeledReplicas);
        sb.append(",");
    }
    if (!(observedGeneration == null)) {
        sb.append("observedGeneration:");
        sb.append(observedGeneration);
        sb.append(",");
    }
    if (!(readyReplicas == null)) {
        sb.append("readyReplicas:");
        sb.append(readyReplicas);
        sb.append(",");
    }
    if (!(replicas == null)) {
        sb.append("replicas:");
        sb.append(replicas);
        sb.append(",");
    }
    if (!(terminatingReplicas == null)) {
        sb.append("terminatingReplicas:");
        sb.append(terminatingReplicas);
    }
    sb.append("}");
    return sb.toString();
  }
  public class ConditionsNested<N> extends V1ReplicaSetConditionFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,V1ReplicaSetCondition item) {
      this.index = index;
      this.builder = new V1ReplicaSetConditionBuilder(this, item);
    }
    V1ReplicaSetConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ReplicaSetStatusFluent.this.setToConditions(index, builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }

}