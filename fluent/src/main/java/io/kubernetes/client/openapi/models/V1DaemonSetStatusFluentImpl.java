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
  public class V1DaemonSetStatusFluentImpl<A extends V1DaemonSetStatusFluent<A>> extends BaseFluent<A> implements V1DaemonSetStatusFluent<A>{
  public V1DaemonSetStatusFluentImpl() {
  }
  public V1DaemonSetStatusFluentImpl(V1DaemonSetStatus instance) {
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
  public Integer getCollisionCount() {
    return this.collisionCount;
  }
  public A withCollisionCount(Integer collisionCount) {
    this.collisionCount=collisionCount; return (A) this;
  }
  public Boolean hasCollisionCount() {
    return this.collisionCount != null;
  }
  public A addToConditions(Integer index,V1DaemonSetCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1DaemonSetConditionBuilder>();}
    V1DaemonSetConditionBuilder builder = new V1DaemonSetConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
  }
  public A setToConditions(Integer index,V1DaemonSetCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1DaemonSetConditionBuilder>();}
    V1DaemonSetConditionBuilder builder = new V1DaemonSetConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
    if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
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
    for (V1DaemonSetCondition item : items) {V1DaemonSetConditionBuilder builder = new V1DaemonSetConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeAllFromConditions(Collection<V1DaemonSetCondition> items) {
    for (V1DaemonSetCondition item : items) {V1DaemonSetConditionBuilder builder = new V1DaemonSetConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
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
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1DaemonSetCondition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public List<V1DaemonSetCondition> buildConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public V1DaemonSetCondition buildCondition(Integer index) {
    return this.conditions.get(index).build();
  }
  public V1DaemonSetCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  public V1DaemonSetCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  public V1DaemonSetCondition buildMatchingCondition(Predicate<V1DaemonSetConditionBuilder> predicate) {
    for (V1DaemonSetConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingCondition(Predicate<V1DaemonSetConditionBuilder> predicate) {
    for (V1DaemonSetConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withConditions(List<V1DaemonSetCondition> conditions) {
    if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
    if (conditions != null) {this.conditions = new ArrayList(); for (V1DaemonSetCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
  }
  public A withConditions(io.kubernetes.client.openapi.models.V1DaemonSetCondition... conditions) {
    if (this.conditions != null) {this.conditions.clear();}
    if (conditions != null) {for (V1DaemonSetCondition item :conditions){ this.addToConditions(item);}} return (A) this;
  }
  public Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }
  public V1DaemonSetStatusFluent.ConditionsNested<A> addNewCondition() {
    return new V1DaemonSetStatusFluentImpl.ConditionsNestedImpl();
  }
  public V1DaemonSetStatusFluent.ConditionsNested<A> addNewConditionLike(V1DaemonSetCondition item) {
    return new V1DaemonSetStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }
  public V1DaemonSetStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1DaemonSetCondition item) {
    return new V1DaemonSetStatusFluentImpl.ConditionsNestedImpl(index, item);
  }
  public V1DaemonSetStatusFluent.ConditionsNested<A> editCondition(Integer index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1DaemonSetStatusFluent.ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  public V1DaemonSetStatusFluent.ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1DaemonSetStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1DaemonSetConditionBuilder> predicate) {
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
    this.currentNumberScheduled=currentNumberScheduled; return (A) this;
  }
  public Boolean hasCurrentNumberScheduled() {
    return this.currentNumberScheduled != null;
  }
  public Integer getDesiredNumberScheduled() {
    return this.desiredNumberScheduled;
  }
  public A withDesiredNumberScheduled(Integer desiredNumberScheduled) {
    this.desiredNumberScheduled=desiredNumberScheduled; return (A) this;
  }
  public Boolean hasDesiredNumberScheduled() {
    return this.desiredNumberScheduled != null;
  }
  public Integer getNumberAvailable() {
    return this.numberAvailable;
  }
  public A withNumberAvailable(Integer numberAvailable) {
    this.numberAvailable=numberAvailable; return (A) this;
  }
  public Boolean hasNumberAvailable() {
    return this.numberAvailable != null;
  }
  public Integer getNumberMisscheduled() {
    return this.numberMisscheduled;
  }
  public A withNumberMisscheduled(Integer numberMisscheduled) {
    this.numberMisscheduled=numberMisscheduled; return (A) this;
  }
  public Boolean hasNumberMisscheduled() {
    return this.numberMisscheduled != null;
  }
  public Integer getNumberReady() {
    return this.numberReady;
  }
  public A withNumberReady(Integer numberReady) {
    this.numberReady=numberReady; return (A) this;
  }
  public Boolean hasNumberReady() {
    return this.numberReady != null;
  }
  public Integer getNumberUnavailable() {
    return this.numberUnavailable;
  }
  public A withNumberUnavailable(Integer numberUnavailable) {
    this.numberUnavailable=numberUnavailable; return (A) this;
  }
  public Boolean hasNumberUnavailable() {
    return this.numberUnavailable != null;
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
  public Integer getUpdatedNumberScheduled() {
    return this.updatedNumberScheduled;
  }
  public A withUpdatedNumberScheduled(Integer updatedNumberScheduled) {
    this.updatedNumberScheduled=updatedNumberScheduled; return (A) this;
  }
  public Boolean hasUpdatedNumberScheduled() {
    return this.updatedNumberScheduled != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1DaemonSetStatusFluentImpl that = (V1DaemonSetStatusFluentImpl) o;
    if (collisionCount != null ? !collisionCount.equals(that.collisionCount) :that.collisionCount != null) return false;
    if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
    if (currentNumberScheduled != null ? !currentNumberScheduled.equals(that.currentNumberScheduled) :that.currentNumberScheduled != null) return false;
    if (desiredNumberScheduled != null ? !desiredNumberScheduled.equals(that.desiredNumberScheduled) :that.desiredNumberScheduled != null) return false;
    if (numberAvailable != null ? !numberAvailable.equals(that.numberAvailable) :that.numberAvailable != null) return false;
    if (numberMisscheduled != null ? !numberMisscheduled.equals(that.numberMisscheduled) :that.numberMisscheduled != null) return false;
    if (numberReady != null ? !numberReady.equals(that.numberReady) :that.numberReady != null) return false;
    if (numberUnavailable != null ? !numberUnavailable.equals(that.numberUnavailable) :that.numberUnavailable != null) return false;
    if (observedGeneration != null ? !observedGeneration.equals(that.observedGeneration) :that.observedGeneration != null) return false;
    if (updatedNumberScheduled != null ? !updatedNumberScheduled.equals(that.updatedNumberScheduled) :that.updatedNumberScheduled != null) return false;
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
  class ConditionsNestedImpl<N> extends V1DaemonSetConditionFluentImpl<V1DaemonSetStatusFluent.ConditionsNested<N>> implements V1DaemonSetStatusFluent.ConditionsNested<N>,Nested<N>{
    ConditionsNestedImpl(Integer index,V1DaemonSetCondition item) {
      this.index = index;
      this.builder = new V1DaemonSetConditionBuilder(this, item);
    }
    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new V1DaemonSetConditionBuilder(this);
    }
    V1DaemonSetConditionBuilder builder;
    Integer index;
    public N and() {
      return (N) V1DaemonSetStatusFluentImpl.this.setToConditions(index,builder.build());
    }
    public N endCondition() {
      return and();
    }
    
  }
  
}