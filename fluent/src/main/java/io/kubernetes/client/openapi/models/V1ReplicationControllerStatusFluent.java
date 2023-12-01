package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ReplicationControllerStatusFluent<A extends V1ReplicationControllerStatusFluent<A>> extends BaseFluent<A>{
  public V1ReplicationControllerStatusFluent() {
  }
  
  public V1ReplicationControllerStatusFluent(V1ReplicationControllerStatus instance) {
    this.copyInstance(instance);
  }
  private Integer availableReplicas;
  private ArrayList<V1ReplicationControllerConditionBuilder> conditions;
  private Integer fullyLabeledReplicas;
  private Long observedGeneration;
  private Integer readyReplicas;
  private Integer replicas;
  
  protected void copyInstance(V1ReplicationControllerStatus instance) {
    instance = (instance != null ? instance : new V1ReplicationControllerStatus());
    if (instance != null) {
          this.withAvailableReplicas(instance.getAvailableReplicas());
          this.withConditions(instance.getConditions());
          this.withFullyLabeledReplicas(instance.getFullyLabeledReplicas());
          this.withObservedGeneration(instance.getObservedGeneration());
          this.withReadyReplicas(instance.getReadyReplicas());
          this.withReplicas(instance.getReplicas());
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
  
  public A addToConditions(int index,V1ReplicationControllerCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ReplicationControllerConditionBuilder>();}
    V1ReplicationControllerConditionBuilder builder = new V1ReplicationControllerConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToConditions(int index,V1ReplicationControllerCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ReplicationControllerConditionBuilder>();}
    V1ReplicationControllerConditionBuilder builder = new V1ReplicationControllerConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
    return (A)this;
  }
  
  public A addToConditions(io.kubernetes.client.openapi.models.V1ReplicationControllerCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ReplicationControllerConditionBuilder>();}
    for (V1ReplicationControllerCondition item : items) {V1ReplicationControllerConditionBuilder builder = new V1ReplicationControllerConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A addAllToConditions(Collection<V1ReplicationControllerCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ReplicationControllerConditionBuilder>();}
    for (V1ReplicationControllerCondition item : items) {V1ReplicationControllerConditionBuilder builder = new V1ReplicationControllerConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1ReplicationControllerCondition... items) {
    if (this.conditions == null) return (A)this;
    for (V1ReplicationControllerCondition item : items) {V1ReplicationControllerConditionBuilder builder = new V1ReplicationControllerConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConditions(Collection<V1ReplicationControllerCondition> items) {
    if (this.conditions == null) return (A)this;
    for (V1ReplicationControllerCondition item : items) {V1ReplicationControllerConditionBuilder builder = new V1ReplicationControllerConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1ReplicationControllerConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1ReplicationControllerConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1ReplicationControllerConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1ReplicationControllerCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1ReplicationControllerCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public V1ReplicationControllerCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1ReplicationControllerCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1ReplicationControllerCondition buildMatchingCondition(Predicate<V1ReplicationControllerConditionBuilder> predicate) {
      for (V1ReplicationControllerConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1ReplicationControllerConditionBuilder> predicate) {
      for (V1ReplicationControllerConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<V1ReplicationControllerCondition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1ReplicationControllerCondition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(io.kubernetes.client.openapi.models.V1ReplicationControllerCondition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1ReplicationControllerCondition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !this.conditions.isEmpty();
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1ReplicationControllerCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1ReplicationControllerCondition item) {
    return new ConditionsNested(index, item);
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1ReplicationControllerConditionBuilder> predicate) {
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ReplicationControllerStatusFluent that = (V1ReplicationControllerStatusFluent) o;
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
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (fullyLabeledReplicas != null) { sb.append("fullyLabeledReplicas:"); sb.append(fullyLabeledReplicas + ","); }
    if (observedGeneration != null) { sb.append("observedGeneration:"); sb.append(observedGeneration + ","); }
    if (readyReplicas != null) { sb.append("readyReplicas:"); sb.append(readyReplicas + ","); }
    if (replicas != null) { sb.append("replicas:"); sb.append(replicas); }
    sb.append("}");
    return sb.toString();
  }
  public class ConditionsNested<N> extends V1ReplicationControllerConditionFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,V1ReplicationControllerCondition item) {
      this.index = index;
      this.builder = new V1ReplicationControllerConditionBuilder(this, item);
    }
    V1ReplicationControllerConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ReplicationControllerStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }

}