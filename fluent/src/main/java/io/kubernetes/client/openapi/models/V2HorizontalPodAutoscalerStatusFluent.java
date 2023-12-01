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
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V2HorizontalPodAutoscalerStatusFluent<A extends V2HorizontalPodAutoscalerStatusFluent<A>> extends BaseFluent<A>{
  public V2HorizontalPodAutoscalerStatusFluent() {
  }
  
  public V2HorizontalPodAutoscalerStatusFluent(V2HorizontalPodAutoscalerStatus instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V2HorizontalPodAutoscalerConditionBuilder> conditions;
  private ArrayList<V2MetricStatusBuilder> currentMetrics;
  private Integer currentReplicas;
  private Integer desiredReplicas;
  private OffsetDateTime lastScaleTime;
  private Long observedGeneration;
  
  protected void copyInstance(V2HorizontalPodAutoscalerStatus instance) {
    instance = (instance != null ? instance : new V2HorizontalPodAutoscalerStatus());
    if (instance != null) {
          this.withConditions(instance.getConditions());
          this.withCurrentMetrics(instance.getCurrentMetrics());
          this.withCurrentReplicas(instance.getCurrentReplicas());
          this.withDesiredReplicas(instance.getDesiredReplicas());
          this.withLastScaleTime(instance.getLastScaleTime());
          this.withObservedGeneration(instance.getObservedGeneration());
        }
  }
  
  public A addToConditions(int index,V2HorizontalPodAutoscalerCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V2HorizontalPodAutoscalerConditionBuilder>();}
    V2HorizontalPodAutoscalerConditionBuilder builder = new V2HorizontalPodAutoscalerConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToConditions(int index,V2HorizontalPodAutoscalerCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V2HorizontalPodAutoscalerConditionBuilder>();}
    V2HorizontalPodAutoscalerConditionBuilder builder = new V2HorizontalPodAutoscalerConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
    return (A)this;
  }
  
  public A addToConditions(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V2HorizontalPodAutoscalerConditionBuilder>();}
    for (V2HorizontalPodAutoscalerCondition item : items) {V2HorizontalPodAutoscalerConditionBuilder builder = new V2HorizontalPodAutoscalerConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A addAllToConditions(Collection<V2HorizontalPodAutoscalerCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V2HorizontalPodAutoscalerConditionBuilder>();}
    for (V2HorizontalPodAutoscalerCondition item : items) {V2HorizontalPodAutoscalerConditionBuilder builder = new V2HorizontalPodAutoscalerConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A removeFromConditions(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition... items) {
    if (this.conditions == null) return (A)this;
    for (V2HorizontalPodAutoscalerCondition item : items) {V2HorizontalPodAutoscalerConditionBuilder builder = new V2HorizontalPodAutoscalerConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConditions(Collection<V2HorizontalPodAutoscalerCondition> items) {
    if (this.conditions == null) return (A)this;
    for (V2HorizontalPodAutoscalerCondition item : items) {V2HorizontalPodAutoscalerConditionBuilder builder = new V2HorizontalPodAutoscalerConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConditions(Predicate<V2HorizontalPodAutoscalerConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V2HorizontalPodAutoscalerConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V2HorizontalPodAutoscalerConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V2HorizontalPodAutoscalerCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V2HorizontalPodAutoscalerCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public V2HorizontalPodAutoscalerCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V2HorizontalPodAutoscalerCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V2HorizontalPodAutoscalerCondition buildMatchingCondition(Predicate<V2HorizontalPodAutoscalerConditionBuilder> predicate) {
      for (V2HorizontalPodAutoscalerConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<V2HorizontalPodAutoscalerConditionBuilder> predicate) {
      for (V2HorizontalPodAutoscalerConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
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
  
  public A withConditions(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition... conditions) {
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
  
  public boolean hasConditions() {
    return this.conditions != null && !this.conditions.isEmpty();
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V2HorizontalPodAutoscalerCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V2HorizontalPodAutoscalerCondition item) {
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
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V2HorizontalPodAutoscalerConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public A addToCurrentMetrics(int index,V2MetricStatus item) {
    if (this.currentMetrics == null) {this.currentMetrics = new ArrayList<V2MetricStatusBuilder>();}
    V2MetricStatusBuilder builder = new V2MetricStatusBuilder(item);
    if (index < 0 || index >= currentMetrics.size()) { _visitables.get("currentMetrics").add(builder); currentMetrics.add(builder); } else { _visitables.get("currentMetrics").add(index, builder); currentMetrics.add(index, builder);}
    return (A)this;
  }
  
  public A setToCurrentMetrics(int index,V2MetricStatus item) {
    if (this.currentMetrics == null) {this.currentMetrics = new ArrayList<V2MetricStatusBuilder>();}
    V2MetricStatusBuilder builder = new V2MetricStatusBuilder(item);
    if (index < 0 || index >= currentMetrics.size()) { _visitables.get("currentMetrics").add(builder); currentMetrics.add(builder); } else { _visitables.get("currentMetrics").set(index, builder); currentMetrics.set(index, builder);}
    return (A)this;
  }
  
  public A addToCurrentMetrics(io.kubernetes.client.openapi.models.V2MetricStatus... items) {
    if (this.currentMetrics == null) {this.currentMetrics = new ArrayList<V2MetricStatusBuilder>();}
    for (V2MetricStatus item : items) {V2MetricStatusBuilder builder = new V2MetricStatusBuilder(item);_visitables.get("currentMetrics").add(builder);this.currentMetrics.add(builder);} return (A)this;
  }
  
  public A addAllToCurrentMetrics(Collection<V2MetricStatus> items) {
    if (this.currentMetrics == null) {this.currentMetrics = new ArrayList<V2MetricStatusBuilder>();}
    for (V2MetricStatus item : items) {V2MetricStatusBuilder builder = new V2MetricStatusBuilder(item);_visitables.get("currentMetrics").add(builder);this.currentMetrics.add(builder);} return (A)this;
  }
  
  public A removeFromCurrentMetrics(io.kubernetes.client.openapi.models.V2MetricStatus... items) {
    if (this.currentMetrics == null) return (A)this;
    for (V2MetricStatus item : items) {V2MetricStatusBuilder builder = new V2MetricStatusBuilder(item);_visitables.get("currentMetrics").remove(builder); this.currentMetrics.remove(builder);} return (A)this;
  }
  
  public A removeAllFromCurrentMetrics(Collection<V2MetricStatus> items) {
    if (this.currentMetrics == null) return (A)this;
    for (V2MetricStatus item : items) {V2MetricStatusBuilder builder = new V2MetricStatusBuilder(item);_visitables.get("currentMetrics").remove(builder); this.currentMetrics.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromCurrentMetrics(Predicate<V2MetricStatusBuilder> predicate) {
    if (currentMetrics == null) return (A) this;
    final Iterator<V2MetricStatusBuilder> each = currentMetrics.iterator();
    final List visitables = _visitables.get("currentMetrics");
    while (each.hasNext()) {
      V2MetricStatusBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V2MetricStatus> buildCurrentMetrics() {
    return this.currentMetrics != null ? build(currentMetrics) : null;
  }
  
  public V2MetricStatus buildCurrentMetric(int index) {
    return this.currentMetrics.get(index).build();
  }
  
  public V2MetricStatus buildFirstCurrentMetric() {
    return this.currentMetrics.get(0).build();
  }
  
  public V2MetricStatus buildLastCurrentMetric() {
    return this.currentMetrics.get(currentMetrics.size() - 1).build();
  }
  
  public V2MetricStatus buildMatchingCurrentMetric(Predicate<V2MetricStatusBuilder> predicate) {
      for (V2MetricStatusBuilder item : currentMetrics) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCurrentMetric(Predicate<V2MetricStatusBuilder> predicate) {
      for (V2MetricStatusBuilder item : currentMetrics) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
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
  
  public A withCurrentMetrics(io.kubernetes.client.openapi.models.V2MetricStatus... currentMetrics) {
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
  
  public boolean hasCurrentMetrics() {
    return this.currentMetrics != null && !this.currentMetrics.isEmpty();
  }
  
  public CurrentMetricsNested<A> addNewCurrentMetric() {
    return new CurrentMetricsNested(-1, null);
  }
  
  public CurrentMetricsNested<A> addNewCurrentMetricLike(V2MetricStatus item) {
    return new CurrentMetricsNested(-1, item);
  }
  
  public CurrentMetricsNested<A> setNewCurrentMetricLike(int index,V2MetricStatus item) {
    return new CurrentMetricsNested(index, item);
  }
  
  public CurrentMetricsNested<A> editCurrentMetric(int index) {
    if (currentMetrics.size() <= index) throw new RuntimeException("Can't edit currentMetrics. Index exceeds size.");
    return setNewCurrentMetricLike(index, buildCurrentMetric(index));
  }
  
  public CurrentMetricsNested<A> editFirstCurrentMetric() {
    if (currentMetrics.size() == 0) throw new RuntimeException("Can't edit first currentMetrics. The list is empty.");
    return setNewCurrentMetricLike(0, buildCurrentMetric(0));
  }
  
  public CurrentMetricsNested<A> editLastCurrentMetric() {
    int index = currentMetrics.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last currentMetrics. The list is empty.");
    return setNewCurrentMetricLike(index, buildCurrentMetric(index));
  }
  
  public CurrentMetricsNested<A> editMatchingCurrentMetric(Predicate<V2MetricStatusBuilder> predicate) {
    int index = -1;
    for (int i=0;i<currentMetrics.size();i++) { 
    if (predicate.test(currentMetrics.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching currentMetrics. No match found.");
    return setNewCurrentMetricLike(index, buildCurrentMetric(index));
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
  
  public Integer getDesiredReplicas() {
    return this.desiredReplicas;
  }
  
  public A withDesiredReplicas(Integer desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
    return (A) this;
  }
  
  public boolean hasDesiredReplicas() {
    return this.desiredReplicas != null;
  }
  
  public OffsetDateTime getLastScaleTime() {
    return this.lastScaleTime;
  }
  
  public A withLastScaleTime(OffsetDateTime lastScaleTime) {
    this.lastScaleTime = lastScaleTime;
    return (A) this;
  }
  
  public boolean hasLastScaleTime() {
    return this.lastScaleTime != null;
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2HorizontalPodAutoscalerStatusFluent that = (V2HorizontalPodAutoscalerStatusFluent) o;
    if (!java.util.Objects.equals(conditions, that.conditions)) return false;
    if (!java.util.Objects.equals(currentMetrics, that.currentMetrics)) return false;
    if (!java.util.Objects.equals(currentReplicas, that.currentReplicas)) return false;
    if (!java.util.Objects.equals(desiredReplicas, that.desiredReplicas)) return false;
    if (!java.util.Objects.equals(lastScaleTime, that.lastScaleTime)) return false;
    if (!java.util.Objects.equals(observedGeneration, that.observedGeneration)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(conditions,  currentMetrics,  currentReplicas,  desiredReplicas,  lastScaleTime,  observedGeneration,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (currentMetrics != null && !currentMetrics.isEmpty()) { sb.append("currentMetrics:"); sb.append(currentMetrics + ","); }
    if (currentReplicas != null) { sb.append("currentReplicas:"); sb.append(currentReplicas + ","); }
    if (desiredReplicas != null) { sb.append("desiredReplicas:"); sb.append(desiredReplicas + ","); }
    if (lastScaleTime != null) { sb.append("lastScaleTime:"); sb.append(lastScaleTime + ","); }
    if (observedGeneration != null) { sb.append("observedGeneration:"); sb.append(observedGeneration); }
    sb.append("}");
    return sb.toString();
  }
  public class ConditionsNested<N> extends V2HorizontalPodAutoscalerConditionFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,V2HorizontalPodAutoscalerCondition item) {
      this.index = index;
      this.builder = new V2HorizontalPodAutoscalerConditionBuilder(this, item);
    }
    V2HorizontalPodAutoscalerConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V2HorizontalPodAutoscalerStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }
  public class CurrentMetricsNested<N> extends V2MetricStatusFluent<CurrentMetricsNested<N>> implements Nested<N>{
    CurrentMetricsNested(int index,V2MetricStatus item) {
      this.index = index;
      this.builder = new V2MetricStatusBuilder(this, item);
    }
    V2MetricStatusBuilder builder;
    int index;
    
    public N and() {
      return (N) V2HorizontalPodAutoscalerStatusFluent.this.setToCurrentMetrics(index,builder.build());
    }
    
    public N endCurrentMetric() {
      return and();
    }
    
  
  }

}