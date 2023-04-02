package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1JobStatusFluentImpl<A extends V1JobStatusFluent<A>> extends BaseFluent<A> implements V1JobStatusFluent<A>{
  public V1JobStatusFluentImpl() {
  }
  public V1JobStatusFluentImpl(V1JobStatus instance) {
    this.withActive(instance.getActive());

    this.withCompletedIndexes(instance.getCompletedIndexes());

    this.withCompletionTime(instance.getCompletionTime());

    this.withConditions(instance.getConditions());

    this.withFailed(instance.getFailed());

    this.withReady(instance.getReady());

    this.withStartTime(instance.getStartTime());

    this.withSucceeded(instance.getSucceeded());

    this.withUncountedTerminatedPods(instance.getUncountedTerminatedPods());

  }
  private Integer active;
  private String completedIndexes;
  private OffsetDateTime completionTime;
  private ArrayList<V1JobConditionBuilder> conditions;
  private Integer failed;
  private Integer ready;
  private OffsetDateTime startTime;
  private Integer succeeded;
  private V1UncountedTerminatedPodsBuilder uncountedTerminatedPods;
  public Integer getActive() {
    return this.active;
  }
  public A withActive(Integer active) {
    this.active=active; return (A) this;
  }
  public Boolean hasActive() {
    return this.active != null;
  }
  public String getCompletedIndexes() {
    return this.completedIndexes;
  }
  public A withCompletedIndexes(String completedIndexes) {
    this.completedIndexes=completedIndexes; return (A) this;
  }
  public Boolean hasCompletedIndexes() {
    return this.completedIndexes != null;
  }
  public OffsetDateTime getCompletionTime() {
    return this.completionTime;
  }
  public A withCompletionTime(OffsetDateTime completionTime) {
    this.completionTime=completionTime; return (A) this;
  }
  public Boolean hasCompletionTime() {
    return this.completionTime != null;
  }
  public A addToConditions(Integer index,V1JobCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1JobConditionBuilder>();}
    V1JobConditionBuilder builder = new V1JobConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
  }
  public A setToConditions(Integer index,V1JobCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1JobConditionBuilder>();}
    V1JobConditionBuilder builder = new V1JobConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
    if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
     return (A)this;
  }
  public A addToConditions(io.kubernetes.client.openapi.models.V1JobCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1JobConditionBuilder>();}
    for (V1JobCondition item : items) {V1JobConditionBuilder builder = new V1JobConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A addAllToConditions(Collection<V1JobCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1JobConditionBuilder>();}
    for (V1JobCondition item : items) {V1JobConditionBuilder builder = new V1JobConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1JobCondition... items) {
    for (V1JobCondition item : items) {V1JobConditionBuilder builder = new V1JobConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeAllFromConditions(Collection<V1JobCondition> items) {
    for (V1JobCondition item : items) {V1JobConditionBuilder builder = new V1JobConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromConditions(Predicate<V1JobConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1JobConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1JobConditionBuilder builder = each.next();
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
  public List<V1JobCondition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public List<V1JobCondition> buildConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public V1JobCondition buildCondition(Integer index) {
    return this.conditions.get(index).build();
  }
  public V1JobCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  public V1JobCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  public V1JobCondition buildMatchingCondition(Predicate<V1JobConditionBuilder> predicate) {
    for (V1JobConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingCondition(Predicate<V1JobConditionBuilder> predicate) {
    for (V1JobConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withConditions(List<V1JobCondition> conditions) {
    if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
    if (conditions != null) {this.conditions = new ArrayList(); for (V1JobCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
  }
  public A withConditions(io.kubernetes.client.openapi.models.V1JobCondition... conditions) {
    if (this.conditions != null) {this.conditions.clear();}
    if (conditions != null) {for (V1JobCondition item :conditions){ this.addToConditions(item);}} return (A) this;
  }
  public Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }
  public V1JobStatusFluent.ConditionsNested<A> addNewCondition() {
    return new V1JobStatusFluentImpl.ConditionsNestedImpl();
  }
  public V1JobStatusFluent.ConditionsNested<A> addNewConditionLike(V1JobCondition item) {
    return new V1JobStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }
  public V1JobStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1JobCondition item) {
    return new V1JobStatusFluentImpl.ConditionsNestedImpl(index, item);
  }
  public V1JobStatusFluent.ConditionsNested<A> editCondition(Integer index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1JobStatusFluent.ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  public V1JobStatusFluent.ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1JobStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1JobConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public Integer getFailed() {
    return this.failed;
  }
  public A withFailed(Integer failed) {
    this.failed=failed; return (A) this;
  }
  public Boolean hasFailed() {
    return this.failed != null;
  }
  public Integer getReady() {
    return this.ready;
  }
  public A withReady(Integer ready) {
    this.ready=ready; return (A) this;
  }
  public Boolean hasReady() {
    return this.ready != null;
  }
  public OffsetDateTime getStartTime() {
    return this.startTime;
  }
  public A withStartTime(OffsetDateTime startTime) {
    this.startTime=startTime; return (A) this;
  }
  public Boolean hasStartTime() {
    return this.startTime != null;
  }
  public Integer getSucceeded() {
    return this.succeeded;
  }
  public A withSucceeded(Integer succeeded) {
    this.succeeded=succeeded; return (A) this;
  }
  public Boolean hasSucceeded() {
    return this.succeeded != null;
  }
  
  /**
   * This method has been deprecated, please use method buildUncountedTerminatedPods instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1UncountedTerminatedPods getUncountedTerminatedPods() {
    return this.uncountedTerminatedPods!=null ?this.uncountedTerminatedPods.build():null;
  }
  public V1UncountedTerminatedPods buildUncountedTerminatedPods() {
    return this.uncountedTerminatedPods!=null ?this.uncountedTerminatedPods.build():null;
  }
  public A withUncountedTerminatedPods(V1UncountedTerminatedPods uncountedTerminatedPods) {
    _visitables.get("uncountedTerminatedPods").remove(this.uncountedTerminatedPods);
    if (uncountedTerminatedPods!=null){ this.uncountedTerminatedPods= new V1UncountedTerminatedPodsBuilder(uncountedTerminatedPods); _visitables.get("uncountedTerminatedPods").add(this.uncountedTerminatedPods);} else { this.uncountedTerminatedPods = null; _visitables.get("uncountedTerminatedPods").remove(this.uncountedTerminatedPods); } return (A) this;
  }
  public Boolean hasUncountedTerminatedPods() {
    return this.uncountedTerminatedPods != null;
  }
  public V1JobStatusFluent.UncountedTerminatedPodsNested<A> withNewUncountedTerminatedPods() {
    return new V1JobStatusFluentImpl.UncountedTerminatedPodsNestedImpl();
  }
  public V1JobStatusFluent.UncountedTerminatedPodsNested<A> withNewUncountedTerminatedPodsLike(V1UncountedTerminatedPods item) {
    return new V1JobStatusFluentImpl.UncountedTerminatedPodsNestedImpl(item);
  }
  public V1JobStatusFluent.UncountedTerminatedPodsNested<A> editUncountedTerminatedPods() {
    return withNewUncountedTerminatedPodsLike(getUncountedTerminatedPods());
  }
  public V1JobStatusFluent.UncountedTerminatedPodsNested<A> editOrNewUncountedTerminatedPods() {
    return withNewUncountedTerminatedPodsLike(getUncountedTerminatedPods() != null ? getUncountedTerminatedPods(): new V1UncountedTerminatedPodsBuilder().build());
  }
  public V1JobStatusFluent.UncountedTerminatedPodsNested<A> editOrNewUncountedTerminatedPodsLike(V1UncountedTerminatedPods item) {
    return withNewUncountedTerminatedPodsLike(getUncountedTerminatedPods() != null ? getUncountedTerminatedPods(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1JobStatusFluentImpl that = (V1JobStatusFluentImpl) o;
    if (active != null ? !active.equals(that.active) :that.active != null) return false;
    if (completedIndexes != null ? !completedIndexes.equals(that.completedIndexes) :that.completedIndexes != null) return false;
    if (completionTime != null ? !completionTime.equals(that.completionTime) :that.completionTime != null) return false;
    if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
    if (failed != null ? !failed.equals(that.failed) :that.failed != null) return false;
    if (ready != null ? !ready.equals(that.ready) :that.ready != null) return false;
    if (startTime != null ? !startTime.equals(that.startTime) :that.startTime != null) return false;
    if (succeeded != null ? !succeeded.equals(that.succeeded) :that.succeeded != null) return false;
    if (uncountedTerminatedPods != null ? !uncountedTerminatedPods.equals(that.uncountedTerminatedPods) :that.uncountedTerminatedPods != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(active,  completedIndexes,  completionTime,  conditions,  failed,  ready,  startTime,  succeeded,  uncountedTerminatedPods,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (active != null) { sb.append("active:"); sb.append(active + ","); }
    if (completedIndexes != null) { sb.append("completedIndexes:"); sb.append(completedIndexes + ","); }
    if (completionTime != null) { sb.append("completionTime:"); sb.append(completionTime + ","); }
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (failed != null) { sb.append("failed:"); sb.append(failed + ","); }
    if (ready != null) { sb.append("ready:"); sb.append(ready + ","); }
    if (startTime != null) { sb.append("startTime:"); sb.append(startTime + ","); }
    if (succeeded != null) { sb.append("succeeded:"); sb.append(succeeded + ","); }
    if (uncountedTerminatedPods != null) { sb.append("uncountedTerminatedPods:"); sb.append(uncountedTerminatedPods); }
    sb.append("}");
    return sb.toString();
  }
  class ConditionsNestedImpl<N> extends V1JobConditionFluentImpl<V1JobStatusFluent.ConditionsNested<N>> implements V1JobStatusFluent.ConditionsNested<N>,Nested<N>{
    ConditionsNestedImpl(Integer index,V1JobCondition item) {
      this.index = index;
      this.builder = new V1JobConditionBuilder(this, item);
    }
    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new V1JobConditionBuilder(this);
    }
    V1JobConditionBuilder builder;
    Integer index;
    public N and() {
      return (N) V1JobStatusFluentImpl.this.setToConditions(index,builder.build());
    }
    public N endCondition() {
      return and();
    }
    
  }
  class UncountedTerminatedPodsNestedImpl<N> extends V1UncountedTerminatedPodsFluentImpl<V1JobStatusFluent.UncountedTerminatedPodsNested<N>> implements V1JobStatusFluent.UncountedTerminatedPodsNested<N>,Nested<N>{
    UncountedTerminatedPodsNestedImpl(V1UncountedTerminatedPods item) {
      this.builder = new V1UncountedTerminatedPodsBuilder(this, item);
    }
    UncountedTerminatedPodsNestedImpl() {
      this.builder = new V1UncountedTerminatedPodsBuilder(this);
    }
    V1UncountedTerminatedPodsBuilder builder;
    public N and() {
      return (N) V1JobStatusFluentImpl.this.withUncountedTerminatedPods(builder.build());
    }
    public N endUncountedTerminatedPods() {
      return and();
    }
    
  }
  
}