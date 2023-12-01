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
public class V1DaemonSetStatusFluent<A extends V1DaemonSetStatusFluent<A>> extends BaseFluent<A>{
  public V1DaemonSetStatusFluent() {
  }
  
  public V1DaemonSetStatusFluent(V1DaemonSetStatus instance) {
    this.copyInstance(instance);
  }
  private Integer collisionCount;
  private ArrayList<V1DaemonSetConditionBuilder> conditions;
  private Integer currentNumberScheduled;
  private Integer desiredNumberScheduled;
  private Integer numberAvailable;
  private Integer numberMisscheduled;
  private Integer numberReady;
  private Integer numberUnavailable;
  private Long observedGeneration;
  private Integer updatedNumberScheduled;
  
  protected void copyInstance(V1DaemonSetStatus instance) {
    instance = (instance != null ? instance : new V1DaemonSetStatus());
    if (instance != null) {
          this.withCollisionCount(instance.getCollisionCount());
          this.withConditions(instance.getConditions());
          this.withCurrentNumberScheduled(instance.getCurrentNumberScheduled());
          this.withDesiredNumberScheduled(instance.getDesiredNumberScheduled());
          this.withNumberAvailable(instance.getNumberAvailable());
          this.withNumberMisscheduled(instance.getNumberMisscheduled());
          this.withNumberReady(instance.getNumberReady());
          this.withNumberUnavailable(instance.getNumberUnavailable());
          this.withObservedGeneration(instance.getObservedGeneration());
          this.withUpdatedNumberScheduled(instance.getUpdatedNumberScheduled());
        }
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
  
  public A addToConditions(int index,V1DaemonSetCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1DaemonSetConditionBuilder>();}
    V1DaemonSetConditionBuilder builder = new V1DaemonSetConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToConditions(int index,V1DaemonSetCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1DaemonSetConditionBuilder>();}
    V1DaemonSetConditionBuilder builder = new V1DaemonSetConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
    return (A)this;
  }
  
  public A addToConditions(io.kubernetes.client.openapi.models.V1DaemonSetCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1DaemonSetConditionBuilder>();}
    for (V1DaemonSetCondition item : items) {V1DaemonSetConditionBuilder builder = new V1DaemonSetConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A addAllToConditions(Collection<V1DaemonSetCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1DaemonSetConditionBuilder>();}
    for (V1DaemonSetCondition item : items) {V1DaemonSetConditionBuilder builder = new V1DaemonSetConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1DaemonSetCondition... items) {
    if (this.conditions == null) return (A)this;
    for (V1DaemonSetCondition item : items) {V1DaemonSetConditionBuilder builder = new V1DaemonSetConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConditions(Collection<V1DaemonSetCondition> items) {
    if (this.conditions == null) return (A)this;
    for (V1DaemonSetCondition item : items) {V1DaemonSetConditionBuilder builder = new V1DaemonSetConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1DaemonSetConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1DaemonSetConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1DaemonSetConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1DaemonSetCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1DaemonSetCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public V1DaemonSetCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1DaemonSetCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1DaemonSetCondition buildMatchingCondition(Predicate<V1DaemonSetConditionBuilder> predicate) {
      for (V1DaemonSetConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1DaemonSetConditionBuilder> predicate) {
      for (V1DaemonSetConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<V1DaemonSetCondition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1DaemonSetCondition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(io.kubernetes.client.openapi.models.V1DaemonSetCondition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1DaemonSetCondition item : conditions) {
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
  
  public ConditionsNested<A> addNewConditionLike(V1DaemonSetCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1DaemonSetCondition item) {
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
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1DaemonSetConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public Integer getCurrentNumberScheduled() {
    return this.currentNumberScheduled;
  }
  
  public A withCurrentNumberScheduled(Integer currentNumberScheduled) {
    this.currentNumberScheduled = currentNumberScheduled;
    return (A) this;
  }
  
  public boolean hasCurrentNumberScheduled() {
    return this.currentNumberScheduled != null;
  }
  
  public Integer getDesiredNumberScheduled() {
    return this.desiredNumberScheduled;
  }
  
  public A withDesiredNumberScheduled(Integer desiredNumberScheduled) {
    this.desiredNumberScheduled = desiredNumberScheduled;
    return (A) this;
  }
  
  public boolean hasDesiredNumberScheduled() {
    return this.desiredNumberScheduled != null;
  }
  
  public Integer getNumberAvailable() {
    return this.numberAvailable;
  }
  
  public A withNumberAvailable(Integer numberAvailable) {
    this.numberAvailable = numberAvailable;
    return (A) this;
  }
  
  public boolean hasNumberAvailable() {
    return this.numberAvailable != null;
  }
  
  public Integer getNumberMisscheduled() {
    return this.numberMisscheduled;
  }
  
  public A withNumberMisscheduled(Integer numberMisscheduled) {
    this.numberMisscheduled = numberMisscheduled;
    return (A) this;
  }
  
  public boolean hasNumberMisscheduled() {
    return this.numberMisscheduled != null;
  }
  
  public Integer getNumberReady() {
    return this.numberReady;
  }
  
  public A withNumberReady(Integer numberReady) {
    this.numberReady = numberReady;
    return (A) this;
  }
  
  public boolean hasNumberReady() {
    return this.numberReady != null;
  }
  
  public Integer getNumberUnavailable() {
    return this.numberUnavailable;
  }
  
  public A withNumberUnavailable(Integer numberUnavailable) {
    this.numberUnavailable = numberUnavailable;
    return (A) this;
  }
  
  public boolean hasNumberUnavailable() {
    return this.numberUnavailable != null;
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
  
  public Integer getUpdatedNumberScheduled() {
    return this.updatedNumberScheduled;
  }
  
  public A withUpdatedNumberScheduled(Integer updatedNumberScheduled) {
    this.updatedNumberScheduled = updatedNumberScheduled;
    return (A) this;
  }
  
  public boolean hasUpdatedNumberScheduled() {
    return this.updatedNumberScheduled != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1DaemonSetStatusFluent that = (V1DaemonSetStatusFluent) o;
    if (!java.util.Objects.equals(collisionCount, that.collisionCount)) return false;
    if (!java.util.Objects.equals(conditions, that.conditions)) return false;
    if (!java.util.Objects.equals(currentNumberScheduled, that.currentNumberScheduled)) return false;
    if (!java.util.Objects.equals(desiredNumberScheduled, that.desiredNumberScheduled)) return false;
    if (!java.util.Objects.equals(numberAvailable, that.numberAvailable)) return false;
    if (!java.util.Objects.equals(numberMisscheduled, that.numberMisscheduled)) return false;
    if (!java.util.Objects.equals(numberReady, that.numberReady)) return false;
    if (!java.util.Objects.equals(numberUnavailable, that.numberUnavailable)) return false;
    if (!java.util.Objects.equals(observedGeneration, that.observedGeneration)) return false;
    if (!java.util.Objects.equals(updatedNumberScheduled, that.updatedNumberScheduled)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(collisionCount,  conditions,  currentNumberScheduled,  desiredNumberScheduled,  numberAvailable,  numberMisscheduled,  numberReady,  numberUnavailable,  observedGeneration,  updatedNumberScheduled,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (collisionCount != null) { sb.append("collisionCount:"); sb.append(collisionCount + ","); }
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (currentNumberScheduled != null) { sb.append("currentNumberScheduled:"); sb.append(currentNumberScheduled + ","); }
    if (desiredNumberScheduled != null) { sb.append("desiredNumberScheduled:"); sb.append(desiredNumberScheduled + ","); }
    if (numberAvailable != null) { sb.append("numberAvailable:"); sb.append(numberAvailable + ","); }
    if (numberMisscheduled != null) { sb.append("numberMisscheduled:"); sb.append(numberMisscheduled + ","); }
    if (numberReady != null) { sb.append("numberReady:"); sb.append(numberReady + ","); }
    if (numberUnavailable != null) { sb.append("numberUnavailable:"); sb.append(numberUnavailable + ","); }
    if (observedGeneration != null) { sb.append("observedGeneration:"); sb.append(observedGeneration + ","); }
    if (updatedNumberScheduled != null) { sb.append("updatedNumberScheduled:"); sb.append(updatedNumberScheduled); }
    sb.append("}");
    return sb.toString();
  }
  public class ConditionsNested<N> extends V1DaemonSetConditionFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,V1DaemonSetCondition item) {
      this.index = index;
      this.builder = new V1DaemonSetConditionBuilder(this, item);
    }
    V1DaemonSetConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1DaemonSetStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }

}