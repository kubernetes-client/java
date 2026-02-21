package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1JobStatusFluent<A extends io.kubernetes.client.openapi.models.V1JobStatusFluent<A>> extends BaseFluent<A>{

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

  public V1JobStatusFluent() {
  }
  
  public V1JobStatusFluent(V1JobStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToConditions(Collection<V1JobCondition> items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1JobCondition item : items) {
        V1JobConditionBuilder builder = new V1JobConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1JobCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public A addToConditions(V1JobCondition... items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1JobCondition item : items) {
        V1JobConditionBuilder builder = new V1JobConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A addToConditions(int index,V1JobCondition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1JobConditionBuilder builder = new V1JobConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.add(index, builder);
    }
    return (A) this;
  }
  
  public V1JobCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public List<V1JobCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
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
  
  public V1UncountedTerminatedPods buildUncountedTerminatedPods() {
    return this.uncountedTerminatedPods != null ? this.uncountedTerminatedPods.build() : null;
  }
  
  protected void copyInstance(V1JobStatus instance) {
    instance = instance != null ? instance : new V1JobStatus();
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
  
  public ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) {
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
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1JobConditionBuilder> predicate) {
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
  
  public UncountedTerminatedPodsNested<A> editOrNewUncountedTerminatedPods() {
    return this.withNewUncountedTerminatedPodsLike(Optional.ofNullable(this.buildUncountedTerminatedPods()).orElse(new V1UncountedTerminatedPodsBuilder().build()));
  }
  
  public UncountedTerminatedPodsNested<A> editOrNewUncountedTerminatedPodsLike(V1UncountedTerminatedPods item) {
    return this.withNewUncountedTerminatedPodsLike(Optional.ofNullable(this.buildUncountedTerminatedPods()).orElse(item));
  }
  
  public UncountedTerminatedPodsNested<A> editUncountedTerminatedPods() {
    return this.withNewUncountedTerminatedPodsLike(Optional.ofNullable(this.buildUncountedTerminatedPods()).orElse(null));
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
    V1JobStatusFluent that = (V1JobStatusFluent) o;
    if (!(Objects.equals(active, that.active))) {
      return false;
    }
    if (!(Objects.equals(completedIndexes, that.completedIndexes))) {
      return false;
    }
    if (!(Objects.equals(completionTime, that.completionTime))) {
      return false;
    }
    if (!(Objects.equals(conditions, that.conditions))) {
      return false;
    }
    if (!(Objects.equals(failed, that.failed))) {
      return false;
    }
    if (!(Objects.equals(failedIndexes, that.failedIndexes))) {
      return false;
    }
    if (!(Objects.equals(ready, that.ready))) {
      return false;
    }
    if (!(Objects.equals(startTime, that.startTime))) {
      return false;
    }
    if (!(Objects.equals(succeeded, that.succeeded))) {
      return false;
    }
    if (!(Objects.equals(terminating, that.terminating))) {
      return false;
    }
    if (!(Objects.equals(uncountedTerminatedPods, that.uncountedTerminatedPods))) {
      return false;
    }
    return true;
  }
  
  public Integer getActive() {
    return this.active;
  }
  
  public String getCompletedIndexes() {
    return this.completedIndexes;
  }
  
  public OffsetDateTime getCompletionTime() {
    return this.completionTime;
  }
  
  public Integer getFailed() {
    return this.failed;
  }
  
  public String getFailedIndexes() {
    return this.failedIndexes;
  }
  
  public Integer getReady() {
    return this.ready;
  }
  
  public OffsetDateTime getStartTime() {
    return this.startTime;
  }
  
  public Integer getSucceeded() {
    return this.succeeded;
  }
  
  public Integer getTerminating() {
    return this.terminating;
  }
  
  public boolean hasActive() {
    return this.active != null;
  }
  
  public boolean hasCompletedIndexes() {
    return this.completedIndexes != null;
  }
  
  public boolean hasCompletionTime() {
    return this.completionTime != null;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !(this.conditions.isEmpty());
  }
  
  public boolean hasFailed() {
    return this.failed != null;
  }
  
  public boolean hasFailedIndexes() {
    return this.failedIndexes != null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1JobConditionBuilder> predicate) {
      for (V1JobConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasReady() {
    return this.ready != null;
  }
  
  public boolean hasStartTime() {
    return this.startTime != null;
  }
  
  public boolean hasSucceeded() {
    return this.succeeded != null;
  }
  
  public boolean hasTerminating() {
    return this.terminating != null;
  }
  
  public boolean hasUncountedTerminatedPods() {
    return this.uncountedTerminatedPods != null;
  }
  
  public int hashCode() {
    return Objects.hash(active, completedIndexes, completionTime, conditions, failed, failedIndexes, ready, startTime, succeeded, terminating, uncountedTerminatedPods);
  }
  
  public A removeAllFromConditions(Collection<V1JobCondition> items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1JobCondition item : items) {
        V1JobConditionBuilder builder = new V1JobConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromConditions(V1JobCondition... items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1JobCondition item : items) {
        V1JobConditionBuilder builder = new V1JobConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1JobConditionBuilder> predicate) {
    if (conditions == null) {
      return (A) this;
    }
    Iterator<V1JobConditionBuilder> each = conditions.iterator();
    List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
        V1JobConditionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1JobCondition item) {
    return new ConditionsNested(index, item);
  }
  
  public A setToConditions(int index,V1JobCondition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1JobConditionBuilder builder = new V1JobConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(active == null)) {
        sb.append("active:");
        sb.append(active);
        sb.append(",");
    }
    if (!(completedIndexes == null)) {
        sb.append("completedIndexes:");
        sb.append(completedIndexes);
        sb.append(",");
    }
    if (!(completionTime == null)) {
        sb.append("completionTime:");
        sb.append(completionTime);
        sb.append(",");
    }
    if (!(conditions == null) && !(conditions.isEmpty())) {
        sb.append("conditions:");
        sb.append(conditions);
        sb.append(",");
    }
    if (!(failed == null)) {
        sb.append("failed:");
        sb.append(failed);
        sb.append(",");
    }
    if (!(failedIndexes == null)) {
        sb.append("failedIndexes:");
        sb.append(failedIndexes);
        sb.append(",");
    }
    if (!(ready == null)) {
        sb.append("ready:");
        sb.append(ready);
        sb.append(",");
    }
    if (!(startTime == null)) {
        sb.append("startTime:");
        sb.append(startTime);
        sb.append(",");
    }
    if (!(succeeded == null)) {
        sb.append("succeeded:");
        sb.append(succeeded);
        sb.append(",");
    }
    if (!(terminating == null)) {
        sb.append("terminating:");
        sb.append(terminating);
        sb.append(",");
    }
    if (!(uncountedTerminatedPods == null)) {
        sb.append("uncountedTerminatedPods:");
        sb.append(uncountedTerminatedPods);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withActive(Integer active) {
    this.active = active;
    return (A) this;
  }
  
  public A withCompletedIndexes(String completedIndexes) {
    this.completedIndexes = completedIndexes;
    return (A) this;
  }
  
  public A withCompletionTime(OffsetDateTime completionTime) {
    this.completionTime = completionTime;
    return (A) this;
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
  
  public A withConditions(V1JobCondition... conditions) {
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
  
  public A withFailed(Integer failed) {
    this.failed = failed;
    return (A) this;
  }
  
  public A withFailedIndexes(String failedIndexes) {
    this.failedIndexes = failedIndexes;
    return (A) this;
  }
  
  public UncountedTerminatedPodsNested<A> withNewUncountedTerminatedPods() {
    return new UncountedTerminatedPodsNested(null);
  }
  
  public UncountedTerminatedPodsNested<A> withNewUncountedTerminatedPodsLike(V1UncountedTerminatedPods item) {
    return new UncountedTerminatedPodsNested(item);
  }
  
  public A withReady(Integer ready) {
    this.ready = ready;
    return (A) this;
  }
  
  public A withStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return (A) this;
  }
  
  public A withSucceeded(Integer succeeded) {
    this.succeeded = succeeded;
    return (A) this;
  }
  
  public A withTerminating(Integer terminating) {
    this.terminating = terminating;
    return (A) this;
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
  public class ConditionsNested<N> extends V1JobConditionFluent<ConditionsNested<N>> implements Nested<N>{
  
    V1JobConditionBuilder builder;
    int index;
  
    ConditionsNested(int index,V1JobCondition item) {
      this.index = index;
      this.builder = new V1JobConditionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1JobStatusFluent.this.setToConditions(index, builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  }
  public class UncountedTerminatedPodsNested<N> extends V1UncountedTerminatedPodsFluent<UncountedTerminatedPodsNested<N>> implements Nested<N>{
  
    V1UncountedTerminatedPodsBuilder builder;
  
    UncountedTerminatedPodsNested(V1UncountedTerminatedPods item) {
      this.builder = new V1UncountedTerminatedPodsBuilder(this, item);
    }
  
    public N and() {
      return (N) V1JobStatusFluent.this.withUncountedTerminatedPods(builder.build());
    }
    
    public N endUncountedTerminatedPods() {
      return and();
    }
    
  }
}