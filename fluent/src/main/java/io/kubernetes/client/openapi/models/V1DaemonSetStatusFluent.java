package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1DaemonSetStatusFluent<A extends io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent<A>> extends BaseFluent<A>{

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

  public V1DaemonSetStatusFluent() {
  }
  
  public V1DaemonSetStatusFluent(V1DaemonSetStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToConditions(Collection<V1DaemonSetCondition> items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1DaemonSetCondition item : items) {
        V1DaemonSetConditionBuilder builder = new V1DaemonSetConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1DaemonSetCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public A addToConditions(V1DaemonSetCondition... items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1DaemonSetCondition item : items) {
        V1DaemonSetConditionBuilder builder = new V1DaemonSetConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A addToConditions(int index,V1DaemonSetCondition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1DaemonSetConditionBuilder builder = new V1DaemonSetConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.add(index, builder);
    }
    return (A) this;
  }
  
  public V1DaemonSetCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public List<V1DaemonSetCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
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
  
  protected void copyInstance(V1DaemonSetStatus instance) {
    instance = instance != null ? instance : new V1DaemonSetStatus();
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
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1DaemonSetConditionBuilder> predicate) {
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
    V1DaemonSetStatusFluent that = (V1DaemonSetStatusFluent) o;
    if (!(Objects.equals(collisionCount, that.collisionCount))) {
      return false;
    }
    if (!(Objects.equals(conditions, that.conditions))) {
      return false;
    }
    if (!(Objects.equals(currentNumberScheduled, that.currentNumberScheduled))) {
      return false;
    }
    if (!(Objects.equals(desiredNumberScheduled, that.desiredNumberScheduled))) {
      return false;
    }
    if (!(Objects.equals(numberAvailable, that.numberAvailable))) {
      return false;
    }
    if (!(Objects.equals(numberMisscheduled, that.numberMisscheduled))) {
      return false;
    }
    if (!(Objects.equals(numberReady, that.numberReady))) {
      return false;
    }
    if (!(Objects.equals(numberUnavailable, that.numberUnavailable))) {
      return false;
    }
    if (!(Objects.equals(observedGeneration, that.observedGeneration))) {
      return false;
    }
    if (!(Objects.equals(updatedNumberScheduled, that.updatedNumberScheduled))) {
      return false;
    }
    return true;
  }
  
  public Integer getCollisionCount() {
    return this.collisionCount;
  }
  
  public Integer getCurrentNumberScheduled() {
    return this.currentNumberScheduled;
  }
  
  public Integer getDesiredNumberScheduled() {
    return this.desiredNumberScheduled;
  }
  
  public Integer getNumberAvailable() {
    return this.numberAvailable;
  }
  
  public Integer getNumberMisscheduled() {
    return this.numberMisscheduled;
  }
  
  public Integer getNumberReady() {
    return this.numberReady;
  }
  
  public Integer getNumberUnavailable() {
    return this.numberUnavailable;
  }
  
  public Long getObservedGeneration() {
    return this.observedGeneration;
  }
  
  public Integer getUpdatedNumberScheduled() {
    return this.updatedNumberScheduled;
  }
  
  public boolean hasCollisionCount() {
    return this.collisionCount != null;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !(this.conditions.isEmpty());
  }
  
  public boolean hasCurrentNumberScheduled() {
    return this.currentNumberScheduled != null;
  }
  
  public boolean hasDesiredNumberScheduled() {
    return this.desiredNumberScheduled != null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1DaemonSetConditionBuilder> predicate) {
      for (V1DaemonSetConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasNumberAvailable() {
    return this.numberAvailable != null;
  }
  
  public boolean hasNumberMisscheduled() {
    return this.numberMisscheduled != null;
  }
  
  public boolean hasNumberReady() {
    return this.numberReady != null;
  }
  
  public boolean hasNumberUnavailable() {
    return this.numberUnavailable != null;
  }
  
  public boolean hasObservedGeneration() {
    return this.observedGeneration != null;
  }
  
  public boolean hasUpdatedNumberScheduled() {
    return this.updatedNumberScheduled != null;
  }
  
  public int hashCode() {
    return Objects.hash(collisionCount, conditions, currentNumberScheduled, desiredNumberScheduled, numberAvailable, numberMisscheduled, numberReady, numberUnavailable, observedGeneration, updatedNumberScheduled);
  }
  
  public A removeAllFromConditions(Collection<V1DaemonSetCondition> items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1DaemonSetCondition item : items) {
        V1DaemonSetConditionBuilder builder = new V1DaemonSetConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromConditions(V1DaemonSetCondition... items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1DaemonSetCondition item : items) {
        V1DaemonSetConditionBuilder builder = new V1DaemonSetConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1DaemonSetConditionBuilder> predicate) {
    if (conditions == null) {
      return (A) this;
    }
    Iterator<V1DaemonSetConditionBuilder> each = conditions.iterator();
    List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
        V1DaemonSetConditionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1DaemonSetCondition item) {
    return new ConditionsNested(index, item);
  }
  
  public A setToConditions(int index,V1DaemonSetCondition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1DaemonSetConditionBuilder builder = new V1DaemonSetConditionBuilder(item);
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
    if (!(collisionCount == null)) {
        sb.append("collisionCount:");
        sb.append(collisionCount);
        sb.append(",");
    }
    if (!(conditions == null) && !(conditions.isEmpty())) {
        sb.append("conditions:");
        sb.append(conditions);
        sb.append(",");
    }
    if (!(currentNumberScheduled == null)) {
        sb.append("currentNumberScheduled:");
        sb.append(currentNumberScheduled);
        sb.append(",");
    }
    if (!(desiredNumberScheduled == null)) {
        sb.append("desiredNumberScheduled:");
        sb.append(desiredNumberScheduled);
        sb.append(",");
    }
    if (!(numberAvailable == null)) {
        sb.append("numberAvailable:");
        sb.append(numberAvailable);
        sb.append(",");
    }
    if (!(numberMisscheduled == null)) {
        sb.append("numberMisscheduled:");
        sb.append(numberMisscheduled);
        sb.append(",");
    }
    if (!(numberReady == null)) {
        sb.append("numberReady:");
        sb.append(numberReady);
        sb.append(",");
    }
    if (!(numberUnavailable == null)) {
        sb.append("numberUnavailable:");
        sb.append(numberUnavailable);
        sb.append(",");
    }
    if (!(observedGeneration == null)) {
        sb.append("observedGeneration:");
        sb.append(observedGeneration);
        sb.append(",");
    }
    if (!(updatedNumberScheduled == null)) {
        sb.append("updatedNumberScheduled:");
        sb.append(updatedNumberScheduled);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withCollisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
    return (A) this;
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
  
  public A withConditions(V1DaemonSetCondition... conditions) {
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
  
  public A withCurrentNumberScheduled(Integer currentNumberScheduled) {
    this.currentNumberScheduled = currentNumberScheduled;
    return (A) this;
  }
  
  public A withDesiredNumberScheduled(Integer desiredNumberScheduled) {
    this.desiredNumberScheduled = desiredNumberScheduled;
    return (A) this;
  }
  
  public A withNumberAvailable(Integer numberAvailable) {
    this.numberAvailable = numberAvailable;
    return (A) this;
  }
  
  public A withNumberMisscheduled(Integer numberMisscheduled) {
    this.numberMisscheduled = numberMisscheduled;
    return (A) this;
  }
  
  public A withNumberReady(Integer numberReady) {
    this.numberReady = numberReady;
    return (A) this;
  }
  
  public A withNumberUnavailable(Integer numberUnavailable) {
    this.numberUnavailable = numberUnavailable;
    return (A) this;
  }
  
  public A withObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return (A) this;
  }
  
  public A withUpdatedNumberScheduled(Integer updatedNumberScheduled) {
    this.updatedNumberScheduled = updatedNumberScheduled;
    return (A) this;
  }
  public class ConditionsNested<N> extends V1DaemonSetConditionFluent<ConditionsNested<N>> implements Nested<N>{
  
    V1DaemonSetConditionBuilder builder;
    int index;
  
    ConditionsNested(int index,V1DaemonSetCondition item) {
      this.index = index;
      this.builder = new V1DaemonSetConditionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1DaemonSetStatusFluent.this.setToConditions(index, builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  }
}