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
public class V1DeploymentStatusFluent<A extends V1DeploymentStatusFluent<A>> extends BaseFluent<A>{
  public V1DeploymentStatusFluent() {
  }
  
  public V1DeploymentStatusFluent(V1DeploymentStatus instance) {
    this.copyInstance(instance);
  }
  private Integer availableReplicas;
  private Integer collisionCount;
  private ArrayList<V1DeploymentConditionBuilder> conditions;
  private Long observedGeneration;
  private Integer readyReplicas;
  private Integer replicas;
  private Integer unavailableReplicas;
  private Integer updatedReplicas;
  
  protected void copyInstance(V1DeploymentStatus instance) {
    instance = (instance != null ? instance : new V1DeploymentStatus());
    if (instance != null) {
          this.withAvailableReplicas(instance.getAvailableReplicas());
          this.withCollisionCount(instance.getCollisionCount());
          this.withConditions(instance.getConditions());
          this.withObservedGeneration(instance.getObservedGeneration());
          this.withReadyReplicas(instance.getReadyReplicas());
          this.withReplicas(instance.getReplicas());
          this.withUnavailableReplicas(instance.getUnavailableReplicas());
          this.withUpdatedReplicas(instance.getUpdatedReplicas());
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
  
  public Integer getCollisionCount() {
    return this.collisionCount;
  }
  
  public A withCollisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
    return (A) this;
  }
  
  public boolean hasCollisionCount() {
    return this.collisionCount != null;
  }
  
  public A addToConditions(int index,V1DeploymentCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1DeploymentConditionBuilder>();}
    V1DeploymentConditionBuilder builder = new V1DeploymentConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToConditions(int index,V1DeploymentCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1DeploymentConditionBuilder>();}
    V1DeploymentConditionBuilder builder = new V1DeploymentConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
    return (A)this;
  }
  
  public A addToConditions(io.kubernetes.client.openapi.models.V1DeploymentCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1DeploymentConditionBuilder>();}
    for (V1DeploymentCondition item : items) {V1DeploymentConditionBuilder builder = new V1DeploymentConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A addAllToConditions(Collection<V1DeploymentCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1DeploymentConditionBuilder>();}
    for (V1DeploymentCondition item : items) {V1DeploymentConditionBuilder builder = new V1DeploymentConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1DeploymentCondition... items) {
    if (this.conditions == null) return (A)this;
    for (V1DeploymentCondition item : items) {V1DeploymentConditionBuilder builder = new V1DeploymentConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConditions(Collection<V1DeploymentCondition> items) {
    if (this.conditions == null) return (A)this;
    for (V1DeploymentCondition item : items) {V1DeploymentConditionBuilder builder = new V1DeploymentConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1DeploymentConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1DeploymentConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1DeploymentConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1DeploymentCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1DeploymentCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public V1DeploymentCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1DeploymentCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1DeploymentCondition buildMatchingCondition(Predicate<V1DeploymentConditionBuilder> predicate) {
      for (V1DeploymentConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1DeploymentConditionBuilder> predicate) {
      for (V1DeploymentConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<V1DeploymentCondition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1DeploymentCondition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(io.kubernetes.client.openapi.models.V1DeploymentCondition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1DeploymentCondition item : conditions) {
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
  
  public ConditionsNested<A> addNewConditionLike(V1DeploymentCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1DeploymentCondition item) {
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
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1DeploymentConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
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
  
  public Integer getUnavailableReplicas() {
    return this.unavailableReplicas;
  }
  
  public A withUnavailableReplicas(Integer unavailableReplicas) {
    this.unavailableReplicas = unavailableReplicas;
    return (A) this;
  }
  
  public boolean hasUnavailableReplicas() {
    return this.unavailableReplicas != null;
  }
  
  public Integer getUpdatedReplicas() {
    return this.updatedReplicas;
  }
  
  public A withUpdatedReplicas(Integer updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
    return (A) this;
  }
  
  public boolean hasUpdatedReplicas() {
    return this.updatedReplicas != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1DeploymentStatusFluent that = (V1DeploymentStatusFluent) o;
    if (!java.util.Objects.equals(availableReplicas, that.availableReplicas)) return false;
    if (!java.util.Objects.equals(collisionCount, that.collisionCount)) return false;
    if (!java.util.Objects.equals(conditions, that.conditions)) return false;
    if (!java.util.Objects.equals(observedGeneration, that.observedGeneration)) return false;
    if (!java.util.Objects.equals(readyReplicas, that.readyReplicas)) return false;
    if (!java.util.Objects.equals(replicas, that.replicas)) return false;
    if (!java.util.Objects.equals(unavailableReplicas, that.unavailableReplicas)) return false;
    if (!java.util.Objects.equals(updatedReplicas, that.updatedReplicas)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(availableReplicas,  collisionCount,  conditions,  observedGeneration,  readyReplicas,  replicas,  unavailableReplicas,  updatedReplicas,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (availableReplicas != null) { sb.append("availableReplicas:"); sb.append(availableReplicas + ","); }
    if (collisionCount != null) { sb.append("collisionCount:"); sb.append(collisionCount + ","); }
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (observedGeneration != null) { sb.append("observedGeneration:"); sb.append(observedGeneration + ","); }
    if (readyReplicas != null) { sb.append("readyReplicas:"); sb.append(readyReplicas + ","); }
    if (replicas != null) { sb.append("replicas:"); sb.append(replicas + ","); }
    if (unavailableReplicas != null) { sb.append("unavailableReplicas:"); sb.append(unavailableReplicas + ","); }
    if (updatedReplicas != null) { sb.append("updatedReplicas:"); sb.append(updatedReplicas); }
    sb.append("}");
    return sb.toString();
  }
  public class ConditionsNested<N> extends V1DeploymentConditionFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,V1DeploymentCondition item) {
      this.index = index;
      this.builder = new V1DeploymentConditionBuilder(this, item);
    }
    V1DeploymentConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1DeploymentStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }

}