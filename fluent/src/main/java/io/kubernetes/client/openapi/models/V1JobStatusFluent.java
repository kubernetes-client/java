package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Integer;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1JobStatusFluent<A extends V1JobStatusFluent<A>> extends BaseFluent<A>{
  public V1JobStatusFluent() {
  }
  
  public V1JobStatusFluent(V1JobStatus instance) {
    this.copyInstance(instance);
  }
  private Integer active;
  private String completedIndexes;
  private OffsetDateTime completionTime;
  private ArrayList<V1JobConditionBuilder> conditions;
  private Integer failed;
  private String failedIndexes;
  private Integer ready;
  private OffsetDateTime startTime;
  private Integer succeeded;
  private Integer terminating;
  private V1UncountedTerminatedPodsBuilder uncountedTerminatedPods;
  
  protected void copyInstance(V1JobStatus instance) {
    instance = (instance != null ? instance : new V1JobStatus());
    if (instance != null) {
          this.withActive(instance.getActive());
          this.withCompletedIndexes(instance.getCompletedIndexes());
          this.withCompletionTime(instance.getCompletionTime());
          this.withConditions(instance.getConditions());
          this.withFailed(instance.getFailed());
          this.withFailedIndexes(instance.getFailedIndexes());
          this.withReady(instance.getReady());
          this.withStartTime(instance.getStartTime());
          this.withSucceeded(instance.getSucceeded());
          this.withTerminating(instance.getTerminating());
          this.withUncountedTerminatedPods(instance.getUncountedTerminatedPods());
        }
  }
  
  public Integer getActive() {
    return this.active;
  }
  
  public A withActive(Integer active) {
    this.active = active;
    return (A) this;
  }
  
  public boolean hasActive() {
    return this.active != null;
  }
  
  public String getCompletedIndexes() {
    return this.completedIndexes;
  }
  
  public A withCompletedIndexes(String completedIndexes) {
    this.completedIndexes = completedIndexes;
    return (A) this;
  }
  
  public boolean hasCompletedIndexes() {
    return this.completedIndexes != null;
  }
  
  public OffsetDateTime getCompletionTime() {
    return this.completionTime;
  }
  
  public A withCompletionTime(OffsetDateTime completionTime) {
    this.completionTime = completionTime;
    return (A) this;
  }
  
  public boolean hasCompletionTime() {
    return this.completionTime != null;
  }
  
  public A addToConditions(int index,V1JobCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1JobConditionBuilder>();}
    V1JobConditionBuilder builder = new V1JobConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToConditions(int index,V1JobCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1JobConditionBuilder>();}
    V1JobConditionBuilder builder = new V1JobConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
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
    if (this.conditions == null) return (A)this;
    for (V1JobCondition item : items) {V1JobConditionBuilder builder = new V1JobConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConditions(Collection<V1JobCondition> items) {
    if (this.conditions == null) return (A)this;
    for (V1JobCondition item : items) {V1JobConditionBuilder builder = new V1JobConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
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
  
  public List<V1JobCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1JobCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public V1JobCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1JobCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1JobCondition buildMatchingCondition(Predicate<V1JobConditionBuilder> predicate) {
      for (V1JobConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1JobConditionBuilder> predicate) {
      for (V1JobConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<V1JobCondition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1JobCondition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(io.kubernetes.client.openapi.models.V1JobCondition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1JobCondition item : conditions) {
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
  
  public ConditionsNested<A> addNewConditionLike(V1JobCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1JobCondition item) {
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
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1JobConditionBuilder> predicate) {
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
    this.failed = failed;
    return (A) this;
  }
  
  public boolean hasFailed() {
    return this.failed != null;
  }
  
  public String getFailedIndexes() {
    return this.failedIndexes;
  }
  
  public A withFailedIndexes(String failedIndexes) {
    this.failedIndexes = failedIndexes;
    return (A) this;
  }
  
  public boolean hasFailedIndexes() {
    return this.failedIndexes != null;
  }
  
  public Integer getReady() {
    return this.ready;
  }
  
  public A withReady(Integer ready) {
    this.ready = ready;
    return (A) this;
  }
  
  public boolean hasReady() {
    return this.ready != null;
  }
  
  public OffsetDateTime getStartTime() {
    return this.startTime;
  }
  
  public A withStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return (A) this;
  }
  
  public boolean hasStartTime() {
    return this.startTime != null;
  }
  
  public Integer getSucceeded() {
    return this.succeeded;
  }
  
  public A withSucceeded(Integer succeeded) {
    this.succeeded = succeeded;
    return (A) this;
  }
  
  public boolean hasSucceeded() {
    return this.succeeded != null;
  }
  
  public Integer getTerminating() {
    return this.terminating;
  }
  
  public A withTerminating(Integer terminating) {
    this.terminating = terminating;
    return (A) this;
  }
  
  public boolean hasTerminating() {
    return this.terminating != null;
  }
  
  public V1UncountedTerminatedPods buildUncountedTerminatedPods() {
    return this.uncountedTerminatedPods != null ? this.uncountedTerminatedPods.build() : null;
  }
  
  public A withUncountedTerminatedPods(V1UncountedTerminatedPods uncountedTerminatedPods) {
    this._visitables.remove("uncountedTerminatedPods");
    if (uncountedTerminatedPods != null) {
        this.uncountedTerminatedPods = new V1UncountedTerminatedPodsBuilder(uncountedTerminatedPods);
        this._visitables.get("uncountedTerminatedPods").add(this.uncountedTerminatedPods);
    } else {
        this.uncountedTerminatedPods = null;
        this._visitables.get("uncountedTerminatedPods").remove(this.uncountedTerminatedPods);
    }
    return (A) this;
  }
  
  public boolean hasUncountedTerminatedPods() {
    return this.uncountedTerminatedPods != null;
  }
  
  public UncountedTerminatedPodsNested<A> withNewUncountedTerminatedPods() {
    return new UncountedTerminatedPodsNested(null);
  }
  
  public UncountedTerminatedPodsNested<A> withNewUncountedTerminatedPodsLike(V1UncountedTerminatedPods item) {
    return new UncountedTerminatedPodsNested(item);
  }
  
  public UncountedTerminatedPodsNested<A> editUncountedTerminatedPods() {
    return withNewUncountedTerminatedPodsLike(java.util.Optional.ofNullable(buildUncountedTerminatedPods()).orElse(null));
  }
  
  public UncountedTerminatedPodsNested<A> editOrNewUncountedTerminatedPods() {
    return withNewUncountedTerminatedPodsLike(java.util.Optional.ofNullable(buildUncountedTerminatedPods()).orElse(new V1UncountedTerminatedPodsBuilder().build()));
  }
  
  public UncountedTerminatedPodsNested<A> editOrNewUncountedTerminatedPodsLike(V1UncountedTerminatedPods item) {
    return withNewUncountedTerminatedPodsLike(java.util.Optional.ofNullable(buildUncountedTerminatedPods()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1JobStatusFluent that = (V1JobStatusFluent) o;
    if (!java.util.Objects.equals(active, that.active)) return false;
    if (!java.util.Objects.equals(completedIndexes, that.completedIndexes)) return false;
    if (!java.util.Objects.equals(completionTime, that.completionTime)) return false;
    if (!java.util.Objects.equals(conditions, that.conditions)) return false;
    if (!java.util.Objects.equals(failed, that.failed)) return false;
    if (!java.util.Objects.equals(failedIndexes, that.failedIndexes)) return false;
    if (!java.util.Objects.equals(ready, that.ready)) return false;
    if (!java.util.Objects.equals(startTime, that.startTime)) return false;
    if (!java.util.Objects.equals(succeeded, that.succeeded)) return false;
    if (!java.util.Objects.equals(terminating, that.terminating)) return false;
    if (!java.util.Objects.equals(uncountedTerminatedPods, that.uncountedTerminatedPods)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(active,  completedIndexes,  completionTime,  conditions,  failed,  failedIndexes,  ready,  startTime,  succeeded,  terminating,  uncountedTerminatedPods,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (active != null) { sb.append("active:"); sb.append(active + ","); }
    if (completedIndexes != null) { sb.append("completedIndexes:"); sb.append(completedIndexes + ","); }
    if (completionTime != null) { sb.append("completionTime:"); sb.append(completionTime + ","); }
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (failed != null) { sb.append("failed:"); sb.append(failed + ","); }
    if (failedIndexes != null) { sb.append("failedIndexes:"); sb.append(failedIndexes + ","); }
    if (ready != null) { sb.append("ready:"); sb.append(ready + ","); }
    if (startTime != null) { sb.append("startTime:"); sb.append(startTime + ","); }
    if (succeeded != null) { sb.append("succeeded:"); sb.append(succeeded + ","); }
    if (terminating != null) { sb.append("terminating:"); sb.append(terminating + ","); }
    if (uncountedTerminatedPods != null) { sb.append("uncountedTerminatedPods:"); sb.append(uncountedTerminatedPods); }
    sb.append("}");
    return sb.toString();
  }
  public class ConditionsNested<N> extends V1JobConditionFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,V1JobCondition item) {
      this.index = index;
      this.builder = new V1JobConditionBuilder(this, item);
    }
    V1JobConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1JobStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }
  public class UncountedTerminatedPodsNested<N> extends V1UncountedTerminatedPodsFluent<UncountedTerminatedPodsNested<N>> implements Nested<N>{
    UncountedTerminatedPodsNested(V1UncountedTerminatedPods item) {
      this.builder = new V1UncountedTerminatedPodsBuilder(this, item);
    }
    V1UncountedTerminatedPodsBuilder builder;
    
    public N and() {
      return (N) V1JobStatusFluent.this.withUncountedTerminatedPods(builder.build());
    }
    
    public N endUncountedTerminatedPods() {
      return and();
    }
    
  
  }

}