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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PodDisruptionBudgetStatusFluent<A extends io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1ConditionBuilder> conditions;
  private Integer currentHealthy;
  private Integer desiredHealthy;
  private Map<String,OffsetDateTime> disruptedPods;
  private Integer disruptionsAllowed;
  private Integer expectedPods;
  private Long observedGeneration;

  public V1PodDisruptionBudgetStatusFluent() {
  }
  
  public V1PodDisruptionBudgetStatusFluent(V1PodDisruptionBudgetStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToConditions(Collection<V1Condition> items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1Condition item) {
    return new ConditionsNested(-1, item);
  }
  
  public A addToConditions(V1Condition... items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A addToConditions(int index,V1Condition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1ConditionBuilder builder = new V1ConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToDisruptedPods(Map<String,OffsetDateTime> map) {
    if (this.disruptedPods == null && map != null) {
      this.disruptedPods = new LinkedHashMap();
    }
    if (map != null) {
      this.disruptedPods.putAll(map);
    }
    return (A) this;
  }
  
  public A addToDisruptedPods(String key,OffsetDateTime value) {
    if (this.disruptedPods == null && key != null && value != null) {
      this.disruptedPods = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.disruptedPods.put(key, value);
    }
    return (A) this;
  }
  
  public V1Condition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public List<V1Condition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1Condition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1Condition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1Condition buildMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
      for (V1ConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  protected void copyInstance(V1PodDisruptionBudgetStatus instance) {
    instance = instance != null ? instance : new V1PodDisruptionBudgetStatus();
    if (instance != null) {
        this.withConditions(instance.getConditions());
        this.withCurrentHealthy(instance.getCurrentHealthy());
        this.withDesiredHealthy(instance.getDesiredHealthy());
        this.withDisruptedPods(instance.getDisruptedPods());
        this.withDisruptionsAllowed(instance.getDisruptionsAllowed());
        this.withExpectedPods(instance.getExpectedPods());
        this.withObservedGeneration(instance.getObservedGeneration());
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
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
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
    V1PodDisruptionBudgetStatusFluent that = (V1PodDisruptionBudgetStatusFluent) o;
    if (!(Objects.equals(conditions, that.conditions))) {
      return false;
    }
    if (!(Objects.equals(currentHealthy, that.currentHealthy))) {
      return false;
    }
    if (!(Objects.equals(desiredHealthy, that.desiredHealthy))) {
      return false;
    }
    if (!(Objects.equals(disruptedPods, that.disruptedPods))) {
      return false;
    }
    if (!(Objects.equals(disruptionsAllowed, that.disruptionsAllowed))) {
      return false;
    }
    if (!(Objects.equals(expectedPods, that.expectedPods))) {
      return false;
    }
    if (!(Objects.equals(observedGeneration, that.observedGeneration))) {
      return false;
    }
    return true;
  }
  
  public Integer getCurrentHealthy() {
    return this.currentHealthy;
  }
  
  public Integer getDesiredHealthy() {
    return this.desiredHealthy;
  }
  
  public Map<String,OffsetDateTime> getDisruptedPods() {
    return this.disruptedPods;
  }
  
  public Integer getDisruptionsAllowed() {
    return this.disruptionsAllowed;
  }
  
  public Integer getExpectedPods() {
    return this.expectedPods;
  }
  
  public Long getObservedGeneration() {
    return this.observedGeneration;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !(this.conditions.isEmpty());
  }
  
  public boolean hasCurrentHealthy() {
    return this.currentHealthy != null;
  }
  
  public boolean hasDesiredHealthy() {
    return this.desiredHealthy != null;
  }
  
  public boolean hasDisruptedPods() {
    return this.disruptedPods != null;
  }
  
  public boolean hasDisruptionsAllowed() {
    return this.disruptionsAllowed != null;
  }
  
  public boolean hasExpectedPods() {
    return this.expectedPods != null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
      for (V1ConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasObservedGeneration() {
    return this.observedGeneration != null;
  }
  
  public int hashCode() {
    return Objects.hash(conditions, currentHealthy, desiredHealthy, disruptedPods, disruptionsAllowed, expectedPods, observedGeneration);
  }
  
  public A removeAllFromConditions(Collection<V1Condition> items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromConditions(V1Condition... items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromDisruptedPods(String key) {
    if (this.disruptedPods == null) {
      return (A) this;
    }
    if (key != null && this.disruptedPods != null) {
      this.disruptedPods.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromDisruptedPods(Map<String,OffsetDateTime> map) {
    if (this.disruptedPods == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.disruptedPods != null) {
          this.disruptedPods.remove(key);
        }
      }
    }
    return (A) this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1ConditionBuilder> predicate) {
    if (conditions == null) {
      return (A) this;
    }
    Iterator<V1ConditionBuilder> each = conditions.iterator();
    List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
        V1ConditionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1Condition item) {
    return new ConditionsNested(index, item);
  }
  
  public A setToConditions(int index,V1Condition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1ConditionBuilder builder = new V1ConditionBuilder(item);
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
    if (!(conditions == null) && !(conditions.isEmpty())) {
        sb.append("conditions:");
        sb.append(conditions);
        sb.append(",");
    }
    if (!(currentHealthy == null)) {
        sb.append("currentHealthy:");
        sb.append(currentHealthy);
        sb.append(",");
    }
    if (!(desiredHealthy == null)) {
        sb.append("desiredHealthy:");
        sb.append(desiredHealthy);
        sb.append(",");
    }
    if (!(disruptedPods == null) && !(disruptedPods.isEmpty())) {
        sb.append("disruptedPods:");
        sb.append(disruptedPods);
        sb.append(",");
    }
    if (!(disruptionsAllowed == null)) {
        sb.append("disruptionsAllowed:");
        sb.append(disruptionsAllowed);
        sb.append(",");
    }
    if (!(expectedPods == null)) {
        sb.append("expectedPods:");
        sb.append(expectedPods);
        sb.append(",");
    }
    if (!(observedGeneration == null)) {
        sb.append("observedGeneration:");
        sb.append(observedGeneration);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withConditions(List<V1Condition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1Condition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(V1Condition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1Condition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }
  
  public A withCurrentHealthy(Integer currentHealthy) {
    this.currentHealthy = currentHealthy;
    return (A) this;
  }
  
  public A withDesiredHealthy(Integer desiredHealthy) {
    this.desiredHealthy = desiredHealthy;
    return (A) this;
  }
  
  public <K,V>A withDisruptedPods(Map<String,OffsetDateTime> disruptedPods) {
    if (disruptedPods == null) {
      this.disruptedPods = null;
    } else {
      this.disruptedPods = new LinkedHashMap(disruptedPods);
    }
    return (A) this;
  }
  
  public A withDisruptionsAllowed(Integer disruptionsAllowed) {
    this.disruptionsAllowed = disruptionsAllowed;
    return (A) this;
  }
  
  public A withExpectedPods(Integer expectedPods) {
    this.expectedPods = expectedPods;
    return (A) this;
  }
  
  public A withObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return (A) this;
  }
  public class ConditionsNested<N> extends V1ConditionFluent<ConditionsNested<N>> implements Nested<N>{
  
    V1ConditionBuilder builder;
    int index;
  
    ConditionsNested(int index,V1Condition item) {
      this.index = index;
      this.builder = new V1ConditionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1PodDisruptionBudgetStatusFluent.this.setToConditions(index, builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  }
}