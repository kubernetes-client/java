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
public class V1StatefulSetStatusFluent<A extends V1StatefulSetStatusFluent<A>> extends BaseFluent<A>{
  public V1StatefulSetStatusFluent() {
  }
  
  public V1StatefulSetStatusFluent(V1StatefulSetStatus instance) {
    this.copyInstance(instance);
  }
  private Integer availableReplicas;
  private Integer collisionCount;
  private ArrayList<V1StatefulSetConditionBuilder> conditions;
  private Integer currentReplicas;
  private String currentRevision;
  private Long observedGeneration;
  private Integer readyReplicas;
  private Integer replicas;
  private String updateRevision;
  private Integer updatedReplicas;
  
  protected void copyInstance(V1StatefulSetStatus instance) {
    instance = (instance != null ? instance : new V1StatefulSetStatus());
    if (instance != null) {
          this.withAvailableReplicas(instance.getAvailableReplicas());
          this.withCollisionCount(instance.getCollisionCount());
          this.withConditions(instance.getConditions());
          this.withCurrentReplicas(instance.getCurrentReplicas());
          this.withCurrentRevision(instance.getCurrentRevision());
          this.withObservedGeneration(instance.getObservedGeneration());
          this.withReadyReplicas(instance.getReadyReplicas());
          this.withReplicas(instance.getReplicas());
          this.withUpdateRevision(instance.getUpdateRevision());
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
  
  public A addToConditions(int index,V1StatefulSetCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1StatefulSetConditionBuilder>();}
    V1StatefulSetConditionBuilder builder = new V1StatefulSetConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToConditions(int index,V1StatefulSetCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1StatefulSetConditionBuilder>();}
    V1StatefulSetConditionBuilder builder = new V1StatefulSetConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
    return (A)this;
  }
  
  public A addToConditions(io.kubernetes.client.openapi.models.V1StatefulSetCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1StatefulSetConditionBuilder>();}
    for (V1StatefulSetCondition item : items) {V1StatefulSetConditionBuilder builder = new V1StatefulSetConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A addAllToConditions(Collection<V1StatefulSetCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1StatefulSetConditionBuilder>();}
    for (V1StatefulSetCondition item : items) {V1StatefulSetConditionBuilder builder = new V1StatefulSetConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1StatefulSetCondition... items) {
    if (this.conditions == null) return (A)this;
    for (V1StatefulSetCondition item : items) {V1StatefulSetConditionBuilder builder = new V1StatefulSetConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConditions(Collection<V1StatefulSetCondition> items) {
    if (this.conditions == null) return (A)this;
    for (V1StatefulSetCondition item : items) {V1StatefulSetConditionBuilder builder = new V1StatefulSetConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1StatefulSetConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1StatefulSetConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1StatefulSetConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1StatefulSetCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1StatefulSetCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public V1StatefulSetCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1StatefulSetCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1StatefulSetCondition buildMatchingCondition(Predicate<V1StatefulSetConditionBuilder> predicate) {
      for (V1StatefulSetConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1StatefulSetConditionBuilder> predicate) {
      for (V1StatefulSetConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<V1StatefulSetCondition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1StatefulSetCondition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(io.kubernetes.client.openapi.models.V1StatefulSetCondition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1StatefulSetCondition item : conditions) {
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
  
  public ConditionsNested<A> addNewConditionLike(V1StatefulSetCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1StatefulSetCondition item) {
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
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1StatefulSetConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public Integer getCurrentReplicas() {
    return this.currentReplicas;
  }
  
  public A withCurrentReplicas(Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
    return (A) this;
  }
  
  public boolean hasCurrentReplicas() {
    return this.currentReplicas != null;
  }
  
  public String getCurrentRevision() {
    return this.currentRevision;
  }
  
  public A withCurrentRevision(String currentRevision) {
    this.currentRevision = currentRevision;
    return (A) this;
  }
  
  public boolean hasCurrentRevision() {
    return this.currentRevision != null;
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
  
  public String getUpdateRevision() {
    return this.updateRevision;
  }
  
  public A withUpdateRevision(String updateRevision) {
    this.updateRevision = updateRevision;
    return (A) this;
  }
  
  public boolean hasUpdateRevision() {
    return this.updateRevision != null;
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
    V1StatefulSetStatusFluent that = (V1StatefulSetStatusFluent) o;
    if (!java.util.Objects.equals(availableReplicas, that.availableReplicas)) return false;
    if (!java.util.Objects.equals(collisionCount, that.collisionCount)) return false;
    if (!java.util.Objects.equals(conditions, that.conditions)) return false;
    if (!java.util.Objects.equals(currentReplicas, that.currentReplicas)) return false;
    if (!java.util.Objects.equals(currentRevision, that.currentRevision)) return false;
    if (!java.util.Objects.equals(observedGeneration, that.observedGeneration)) return false;
    if (!java.util.Objects.equals(readyReplicas, that.readyReplicas)) return false;
    if (!java.util.Objects.equals(replicas, that.replicas)) return false;
    if (!java.util.Objects.equals(updateRevision, that.updateRevision)) return false;
    if (!java.util.Objects.equals(updatedReplicas, that.updatedReplicas)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(availableReplicas,  collisionCount,  conditions,  currentReplicas,  currentRevision,  observedGeneration,  readyReplicas,  replicas,  updateRevision,  updatedReplicas,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (availableReplicas != null) { sb.append("availableReplicas:"); sb.append(availableReplicas + ","); }
    if (collisionCount != null) { sb.append("collisionCount:"); sb.append(collisionCount + ","); }
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (currentReplicas != null) { sb.append("currentReplicas:"); sb.append(currentReplicas + ","); }
    if (currentRevision != null) { sb.append("currentRevision:"); sb.append(currentRevision + ","); }
    if (observedGeneration != null) { sb.append("observedGeneration:"); sb.append(observedGeneration + ","); }
    if (readyReplicas != null) { sb.append("readyReplicas:"); sb.append(readyReplicas + ","); }
    if (replicas != null) { sb.append("replicas:"); sb.append(replicas + ","); }
    if (updateRevision != null) { sb.append("updateRevision:"); sb.append(updateRevision + ","); }
    if (updatedReplicas != null) { sb.append("updatedReplicas:"); sb.append(updatedReplicas); }
    sb.append("}");
    return sb.toString();
  }
  public class ConditionsNested<N> extends V1StatefulSetConditionFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,V1StatefulSetCondition item) {
      this.index = index;
      this.builder = new V1StatefulSetConditionBuilder(this, item);
    }
    V1StatefulSetConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1StatefulSetStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }

}