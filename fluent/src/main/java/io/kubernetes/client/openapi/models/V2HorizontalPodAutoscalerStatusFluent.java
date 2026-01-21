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
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V2HorizontalPodAutoscalerStatusFluent<A extends io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent<A>> extends BaseFluent<A>{

  private ArrayList<V2HorizontalPodAutoscalerConditionBuilder> conditions;
  private ArrayList<V2MetricStatusBuilder> currentMetrics;
  private Integer currentReplicas;
  private Integer desiredReplicas;
  private OffsetDateTime lastScaleTime;
  private Long observedGeneration;

  public V2HorizontalPodAutoscalerStatusFluent() {
  }
  
  public V2HorizontalPodAutoscalerStatusFluent(V2HorizontalPodAutoscalerStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToConditions(Collection<V2HorizontalPodAutoscalerCondition> items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V2HorizontalPodAutoscalerCondition item : items) {
        V2HorizontalPodAutoscalerConditionBuilder builder = new V2HorizontalPodAutoscalerConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToCurrentMetrics(Collection<V2MetricStatus> items) {
    if (this.currentMetrics == null) {
      this.currentMetrics = new ArrayList();
    }
    for (V2MetricStatus item : items) {
        V2MetricStatusBuilder builder = new V2MetricStatusBuilder(item);
        _visitables.get("currentMetrics").add(builder);
        this.currentMetrics.add(builder);
    }
    return (A) this;
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V2HorizontalPodAutoscalerCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public CurrentMetricsNested<A> addNewCurrentMetric() {
    return new CurrentMetricsNested(-1, null);
  }
  
  public CurrentMetricsNested<A> addNewCurrentMetricLike(V2MetricStatus item) {
    return new CurrentMetricsNested(-1, item);
  }
  
  public A addToConditions(V2HorizontalPodAutoscalerCondition... items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V2HorizontalPodAutoscalerCondition item : items) {
        V2HorizontalPodAutoscalerConditionBuilder builder = new V2HorizontalPodAutoscalerConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A addToConditions(int index,V2HorizontalPodAutoscalerCondition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V2HorizontalPodAutoscalerConditionBuilder builder = new V2HorizontalPodAutoscalerConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToCurrentMetrics(V2MetricStatus... items) {
    if (this.currentMetrics == null) {
      this.currentMetrics = new ArrayList();
    }
    for (V2MetricStatus item : items) {
        V2MetricStatusBuilder builder = new V2MetricStatusBuilder(item);
        _visitables.get("currentMetrics").add(builder);
        this.currentMetrics.add(builder);
    }
    return (A) this;
  }
  
  public A addToCurrentMetrics(int index,V2MetricStatus item) {
    if (this.currentMetrics == null) {
      this.currentMetrics = new ArrayList();
    }
    V2MetricStatusBuilder builder = new V2MetricStatusBuilder(item);
    if (index < 0 || index >= currentMetrics.size()) {
        _visitables.get("currentMetrics").add(builder);
        currentMetrics.add(builder);
    } else {
        _visitables.get("currentMetrics").add(builder);
        currentMetrics.add(index, builder);
    }
    return (A) this;
  }
  
  public V2HorizontalPodAutoscalerCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public List<V2HorizontalPodAutoscalerCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V2MetricStatus buildCurrentMetric(int index) {
    return this.currentMetrics.get(index).build();
  }
  
  public List<V2MetricStatus> buildCurrentMetrics() {
    return this.currentMetrics != null ? build(currentMetrics) : null;
  }
  
  public V2HorizontalPodAutoscalerCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V2MetricStatus buildFirstCurrentMetric() {
    return this.currentMetrics.get(0).build();
  }
  
  public V2HorizontalPodAutoscalerCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V2MetricStatus buildLastCurrentMetric() {
    return this.currentMetrics.get(currentMetrics.size() - 1).build();
  }
  
  public V2HorizontalPodAutoscalerCondition buildMatchingCondition(Predicate<V2HorizontalPodAutoscalerConditionBuilder> predicate) {
      for (V2HorizontalPodAutoscalerConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V2MetricStatus buildMatchingCurrentMetric(Predicate<V2MetricStatusBuilder> predicate) {
      for (V2MetricStatusBuilder item : currentMetrics) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  protected void copyInstance(V2HorizontalPodAutoscalerStatus instance) {
    instance = instance != null ? instance : new V2HorizontalPodAutoscalerStatus();
    if (instance != null) {
        this.withConditions(instance.getConditions());
        this.withCurrentMetrics(instance.getCurrentMetrics());
        this.withCurrentReplicas(instance.getCurrentReplicas());
        this.withDesiredReplicas(instance.getDesiredReplicas());
        this.withLastScaleTime(instance.getLastScaleTime());
        this.withObservedGeneration(instance.getObservedGeneration());
    }
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public CurrentMetricsNested<A> editCurrentMetric(int index) {
    if (currentMetrics.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "currentMetrics"));
    }
    return this.setNewCurrentMetricLike(index, this.buildCurrentMetric(index));
  }
  
  public ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(0, this.buildCondition(0));
  }
  
  public CurrentMetricsNested<A> editFirstCurrentMetric() {
    if (currentMetrics.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "currentMetrics"));
    }
    return this.setNewCurrentMetricLike(0, this.buildCurrentMetric(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public CurrentMetricsNested<A> editLastCurrentMetric() {
    int index = currentMetrics.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "currentMetrics"));
    }
    return this.setNewCurrentMetricLike(index, this.buildCurrentMetric(index));
  }
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V2HorizontalPodAutoscalerConditionBuilder> predicate) {
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
  
  public CurrentMetricsNested<A> editMatchingCurrentMetric(Predicate<V2MetricStatusBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < currentMetrics.size();i++) {
      if (predicate.test(currentMetrics.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "currentMetrics"));
    }
    return this.setNewCurrentMetricLike(index, this.buildCurrentMetric(index));
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
    V2HorizontalPodAutoscalerStatusFluent that = (V2HorizontalPodAutoscalerStatusFluent) o;
    if (!(Objects.equals(conditions, that.conditions))) {
      return false;
    }
    if (!(Objects.equals(currentMetrics, that.currentMetrics))) {
      return false;
    }
    if (!(Objects.equals(currentReplicas, that.currentReplicas))) {
      return false;
    }
    if (!(Objects.equals(desiredReplicas, that.desiredReplicas))) {
      return false;
    }
    if (!(Objects.equals(lastScaleTime, that.lastScaleTime))) {
      return false;
    }
    if (!(Objects.equals(observedGeneration, that.observedGeneration))) {
      return false;
    }
    return true;
  }
  
  public Integer getCurrentReplicas() {
    return this.currentReplicas;
  }
  
  public Integer getDesiredReplicas() {
    return this.desiredReplicas;
  }
  
  public OffsetDateTime getLastScaleTime() {
    return this.lastScaleTime;
  }
  
  public Long getObservedGeneration() {
    return this.observedGeneration;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !(this.conditions.isEmpty());
  }
  
  public boolean hasCurrentMetrics() {
    return this.currentMetrics != null && !(this.currentMetrics.isEmpty());
  }
  
  public boolean hasCurrentReplicas() {
    return this.currentReplicas != null;
  }
  
  public boolean hasDesiredReplicas() {
    return this.desiredReplicas != null;
  }
  
  public boolean hasLastScaleTime() {
    return this.lastScaleTime != null;
  }
  
  public boolean hasMatchingCondition(Predicate<V2HorizontalPodAutoscalerConditionBuilder> predicate) {
      for (V2HorizontalPodAutoscalerConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingCurrentMetric(Predicate<V2MetricStatusBuilder> predicate) {
      for (V2MetricStatusBuilder item : currentMetrics) {
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
    return Objects.hash(conditions, currentMetrics, currentReplicas, desiredReplicas, lastScaleTime, observedGeneration);
  }
  
  public A removeAllFromConditions(Collection<V2HorizontalPodAutoscalerCondition> items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V2HorizontalPodAutoscalerCondition item : items) {
        V2HorizontalPodAutoscalerConditionBuilder builder = new V2HorizontalPodAutoscalerConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromCurrentMetrics(Collection<V2MetricStatus> items) {
    if (this.currentMetrics == null) {
      return (A) this;
    }
    for (V2MetricStatus item : items) {
        V2MetricStatusBuilder builder = new V2MetricStatusBuilder(item);
        _visitables.get("currentMetrics").remove(builder);
        this.currentMetrics.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromConditions(V2HorizontalPodAutoscalerCondition... items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V2HorizontalPodAutoscalerCondition item : items) {
        V2HorizontalPodAutoscalerConditionBuilder builder = new V2HorizontalPodAutoscalerConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromCurrentMetrics(V2MetricStatus... items) {
    if (this.currentMetrics == null) {
      return (A) this;
    }
    for (V2MetricStatus item : items) {
        V2MetricStatusBuilder builder = new V2MetricStatusBuilder(item);
        _visitables.get("currentMetrics").remove(builder);
        this.currentMetrics.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromConditions(Predicate<V2HorizontalPodAutoscalerConditionBuilder> predicate) {
    if (conditions == null) {
      return (A) this;
    }
    Iterator<V2HorizontalPodAutoscalerConditionBuilder> each = conditions.iterator();
    List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
        V2HorizontalPodAutoscalerConditionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromCurrentMetrics(Predicate<V2MetricStatusBuilder> predicate) {
    if (currentMetrics == null) {
      return (A) this;
    }
    Iterator<V2MetricStatusBuilder> each = currentMetrics.iterator();
    List visitables = _visitables.get("currentMetrics");
    while (each.hasNext()) {
        V2MetricStatusBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V2HorizontalPodAutoscalerCondition item) {
    return new ConditionsNested(index, item);
  }
  
  public CurrentMetricsNested<A> setNewCurrentMetricLike(int index,V2MetricStatus item) {
    return new CurrentMetricsNested(index, item);
  }
  
  public A setToConditions(int index,V2HorizontalPodAutoscalerCondition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V2HorizontalPodAutoscalerConditionBuilder builder = new V2HorizontalPodAutoscalerConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToCurrentMetrics(int index,V2MetricStatus item) {
    if (this.currentMetrics == null) {
      this.currentMetrics = new ArrayList();
    }
    V2MetricStatusBuilder builder = new V2MetricStatusBuilder(item);
    if (index < 0 || index >= currentMetrics.size()) {
        _visitables.get("currentMetrics").add(builder);
        currentMetrics.add(builder);
    } else {
        _visitables.get("currentMetrics").add(builder);
        currentMetrics.set(index, builder);
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
    if (!(currentMetrics == null) && !(currentMetrics.isEmpty())) {
        sb.append("currentMetrics:");
        sb.append(currentMetrics);
        sb.append(",");
    }
    if (!(currentReplicas == null)) {
        sb.append("currentReplicas:");
        sb.append(currentReplicas);
        sb.append(",");
    }
    if (!(desiredReplicas == null)) {
        sb.append("desiredReplicas:");
        sb.append(desiredReplicas);
        sb.append(",");
    }
    if (!(lastScaleTime == null)) {
        sb.append("lastScaleTime:");
        sb.append(lastScaleTime);
        sb.append(",");
    }
    if (!(observedGeneration == null)) {
        sb.append("observedGeneration:");
        sb.append(observedGeneration);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withConditions(List<V2HorizontalPodAutoscalerCondition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V2HorizontalPodAutoscalerCondition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(V2HorizontalPodAutoscalerCondition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V2HorizontalPodAutoscalerCondition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }
  
  public A withCurrentMetrics(List<V2MetricStatus> currentMetrics) {
    if (this.currentMetrics != null) {
      this._visitables.get("currentMetrics").clear();
    }
    if (currentMetrics != null) {
        this.currentMetrics = new ArrayList();
        for (V2MetricStatus item : currentMetrics) {
          this.addToCurrentMetrics(item);
        }
    } else {
      this.currentMetrics = null;
    }
    return (A) this;
  }
  
  public A withCurrentMetrics(V2MetricStatus... currentMetrics) {
    if (this.currentMetrics != null) {
        this.currentMetrics.clear();
        _visitables.remove("currentMetrics");
    }
    if (currentMetrics != null) {
      for (V2MetricStatus item : currentMetrics) {
        this.addToCurrentMetrics(item);
      }
    }
    return (A) this;
  }
  
  public A withCurrentReplicas(Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
    return (A) this;
  }
  
  public A withDesiredReplicas(Integer desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
    return (A) this;
  }
  
  public A withLastScaleTime(OffsetDateTime lastScaleTime) {
    this.lastScaleTime = lastScaleTime;
    return (A) this;
  }
  
  public A withObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return (A) this;
  }
  public class ConditionsNested<N> extends V2HorizontalPodAutoscalerConditionFluent<ConditionsNested<N>> implements Nested<N>{
  
    V2HorizontalPodAutoscalerConditionBuilder builder;
    int index;
  
    ConditionsNested(int index,V2HorizontalPodAutoscalerCondition item) {
      this.index = index;
      this.builder = new V2HorizontalPodAutoscalerConditionBuilder(this, item);
    }
  
    public N and() {
      return (N) V2HorizontalPodAutoscalerStatusFluent.this.setToConditions(index, builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  }
  public class CurrentMetricsNested<N> extends V2MetricStatusFluent<CurrentMetricsNested<N>> implements Nested<N>{
  
    V2MetricStatusBuilder builder;
    int index;
  
    CurrentMetricsNested(int index,V2MetricStatus item) {
      this.index = index;
      this.builder = new V2MetricStatusBuilder(this, item);
    }
  
    public N and() {
      return (N) V2HorizontalPodAutoscalerStatusFluent.this.setToCurrentMetrics(index, builder.build());
    }
    
    public N endCurrentMetric() {
      return and();
    }
    
  }
}