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
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V2beta2HorizontalPodAutoscalerStatusFluentImpl<A extends V2beta2HorizontalPodAutoscalerStatusFluent<A>> extends BaseFluent<A> implements V2beta2HorizontalPodAutoscalerStatusFluent<A>{
  public V2beta2HorizontalPodAutoscalerStatusFluentImpl() {
  }
  public V2beta2HorizontalPodAutoscalerStatusFluentImpl(V2beta2HorizontalPodAutoscalerStatus instance) {
    this.withConditions(instance.getConditions());

    this.withCurrentMetrics(instance.getCurrentMetrics());

    this.withCurrentReplicas(instance.getCurrentReplicas());

    this.withDesiredReplicas(instance.getDesiredReplicas());

    this.withLastScaleTime(instance.getLastScaleTime());

    this.withObservedGeneration(instance.getObservedGeneration());

  }
  private ArrayList<V2beta2HorizontalPodAutoscalerConditionBuilder> conditions;
  private ArrayList<V2beta2MetricStatusBuilder> currentMetrics;
  private Integer currentReplicas;
  private Integer desiredReplicas;
  private OffsetDateTime lastScaleTime;
  private Long observedGeneration;
  public A addToConditions(Integer index,V2beta2HorizontalPodAutoscalerCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V2beta2HorizontalPodAutoscalerConditionBuilder>();}
    V2beta2HorizontalPodAutoscalerConditionBuilder builder = new V2beta2HorizontalPodAutoscalerConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
  }
  public A setToConditions(Integer index,V2beta2HorizontalPodAutoscalerCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V2beta2HorizontalPodAutoscalerConditionBuilder>();}
    V2beta2HorizontalPodAutoscalerConditionBuilder builder = new V2beta2HorizontalPodAutoscalerConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
    if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
     return (A)this;
  }
  public A addToConditions(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V2beta2HorizontalPodAutoscalerConditionBuilder>();}
    for (V2beta2HorizontalPodAutoscalerCondition item : items) {V2beta2HorizontalPodAutoscalerConditionBuilder builder = new V2beta2HorizontalPodAutoscalerConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A addAllToConditions(Collection<V2beta2HorizontalPodAutoscalerCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V2beta2HorizontalPodAutoscalerConditionBuilder>();}
    for (V2beta2HorizontalPodAutoscalerCondition item : items) {V2beta2HorizontalPodAutoscalerConditionBuilder builder = new V2beta2HorizontalPodAutoscalerConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A removeFromConditions(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition... items) {
    for (V2beta2HorizontalPodAutoscalerCondition item : items) {V2beta2HorizontalPodAutoscalerConditionBuilder builder = new V2beta2HorizontalPodAutoscalerConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeAllFromConditions(Collection<V2beta2HorizontalPodAutoscalerCondition> items) {
    for (V2beta2HorizontalPodAutoscalerCondition item : items) {V2beta2HorizontalPodAutoscalerConditionBuilder builder = new V2beta2HorizontalPodAutoscalerConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromConditions(Predicate<V2beta2HorizontalPodAutoscalerConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V2beta2HorizontalPodAutoscalerConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V2beta2HorizontalPodAutoscalerConditionBuilder builder = each.next();
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
  public List<V2beta2HorizontalPodAutoscalerCondition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public List<V2beta2HorizontalPodAutoscalerCondition> buildConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public V2beta2HorizontalPodAutoscalerCondition buildCondition(Integer index) {
    return this.conditions.get(index).build();
  }
  public V2beta2HorizontalPodAutoscalerCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  public V2beta2HorizontalPodAutoscalerCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  public V2beta2HorizontalPodAutoscalerCondition buildMatchingCondition(Predicate<V2beta2HorizontalPodAutoscalerConditionBuilder> predicate) {
    for (V2beta2HorizontalPodAutoscalerConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingCondition(Predicate<V2beta2HorizontalPodAutoscalerConditionBuilder> predicate) {
    for (V2beta2HorizontalPodAutoscalerConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withConditions(List<V2beta2HorizontalPodAutoscalerCondition> conditions) {
    if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
    if (conditions != null) {this.conditions = new ArrayList(); for (V2beta2HorizontalPodAutoscalerCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
  }
  public A withConditions(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition... conditions) {
    if (this.conditions != null) {this.conditions.clear();}
    if (conditions != null) {for (V2beta2HorizontalPodAutoscalerCondition item :conditions){ this.addToConditions(item);}} return (A) this;
  }
  public Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }
  public V2beta2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> addNewCondition() {
    return new V2beta2HorizontalPodAutoscalerStatusFluentImpl.ConditionsNestedImpl();
  }
  public V2beta2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> addNewConditionLike(V2beta2HorizontalPodAutoscalerCondition item) {
    return new V2beta2HorizontalPodAutoscalerStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }
  public V2beta2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V2beta2HorizontalPodAutoscalerCondition item) {
    return new V2beta2HorizontalPodAutoscalerStatusFluentImpl.ConditionsNestedImpl(index, item);
  }
  public V2beta2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editCondition(Integer index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V2beta2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  public V2beta2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V2beta2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V2beta2HorizontalPodAutoscalerConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public A addToCurrentMetrics(Integer index,V2beta2MetricStatus item) {
    if (this.currentMetrics == null) {this.currentMetrics = new ArrayList<V2beta2MetricStatusBuilder>();}
    V2beta2MetricStatusBuilder builder = new V2beta2MetricStatusBuilder(item);_visitables.get("currentMetrics").add(index >= 0 ? index : _visitables.get("currentMetrics").size(), builder);this.currentMetrics.add(index >= 0 ? index : currentMetrics.size(), builder); return (A)this;
  }
  public A setToCurrentMetrics(Integer index,V2beta2MetricStatus item) {
    if (this.currentMetrics == null) {this.currentMetrics = new ArrayList<V2beta2MetricStatusBuilder>();}
    V2beta2MetricStatusBuilder builder = new V2beta2MetricStatusBuilder(item);
    if (index < 0 || index >= _visitables.get("currentMetrics").size()) { _visitables.get("currentMetrics").add(builder); } else { _visitables.get("currentMetrics").set(index, builder);}
    if (index < 0 || index >= currentMetrics.size()) { currentMetrics.add(builder); } else { currentMetrics.set(index, builder);}
     return (A)this;
  }
  public A addToCurrentMetrics(io.kubernetes.client.openapi.models.V2beta2MetricStatus... items) {
    if (this.currentMetrics == null) {this.currentMetrics = new ArrayList<V2beta2MetricStatusBuilder>();}
    for (V2beta2MetricStatus item : items) {V2beta2MetricStatusBuilder builder = new V2beta2MetricStatusBuilder(item);_visitables.get("currentMetrics").add(builder);this.currentMetrics.add(builder);} return (A)this;
  }
  public A addAllToCurrentMetrics(Collection<V2beta2MetricStatus> items) {
    if (this.currentMetrics == null) {this.currentMetrics = new ArrayList<V2beta2MetricStatusBuilder>();}
    for (V2beta2MetricStatus item : items) {V2beta2MetricStatusBuilder builder = new V2beta2MetricStatusBuilder(item);_visitables.get("currentMetrics").add(builder);this.currentMetrics.add(builder);} return (A)this;
  }
  public A removeFromCurrentMetrics(io.kubernetes.client.openapi.models.V2beta2MetricStatus... items) {
    for (V2beta2MetricStatus item : items) {V2beta2MetricStatusBuilder builder = new V2beta2MetricStatusBuilder(item);_visitables.get("currentMetrics").remove(builder);if (this.currentMetrics != null) {this.currentMetrics.remove(builder);}} return (A)this;
  }
  public A removeAllFromCurrentMetrics(Collection<V2beta2MetricStatus> items) {
    for (V2beta2MetricStatus item : items) {V2beta2MetricStatusBuilder builder = new V2beta2MetricStatusBuilder(item);_visitables.get("currentMetrics").remove(builder);if (this.currentMetrics != null) {this.currentMetrics.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromCurrentMetrics(Predicate<V2beta2MetricStatusBuilder> predicate) {
    if (currentMetrics == null) return (A) this;
    final Iterator<V2beta2MetricStatusBuilder> each = currentMetrics.iterator();
    final List visitables = _visitables.get("currentMetrics");
    while (each.hasNext()) {
      V2beta2MetricStatusBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildCurrentMetrics instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V2beta2MetricStatus> getCurrentMetrics() {
    return currentMetrics != null ? build(currentMetrics) : null;
  }
  public List<V2beta2MetricStatus> buildCurrentMetrics() {
    return currentMetrics != null ? build(currentMetrics) : null;
  }
  public V2beta2MetricStatus buildCurrentMetric(Integer index) {
    return this.currentMetrics.get(index).build();
  }
  public V2beta2MetricStatus buildFirstCurrentMetric() {
    return this.currentMetrics.get(0).build();
  }
  public V2beta2MetricStatus buildLastCurrentMetric() {
    return this.currentMetrics.get(currentMetrics.size() - 1).build();
  }
  public V2beta2MetricStatus buildMatchingCurrentMetric(Predicate<V2beta2MetricStatusBuilder> predicate) {
    for (V2beta2MetricStatusBuilder item: currentMetrics) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingCurrentMetric(Predicate<V2beta2MetricStatusBuilder> predicate) {
    for (V2beta2MetricStatusBuilder item: currentMetrics) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withCurrentMetrics(List<V2beta2MetricStatus> currentMetrics) {
    if (this.currentMetrics != null) { _visitables.get("currentMetrics").removeAll(this.currentMetrics);}
    if (currentMetrics != null) {this.currentMetrics = new ArrayList(); for (V2beta2MetricStatus item : currentMetrics){this.addToCurrentMetrics(item);}} else { this.currentMetrics = null;} return (A) this;
  }
  public A withCurrentMetrics(io.kubernetes.client.openapi.models.V2beta2MetricStatus... currentMetrics) {
    if (this.currentMetrics != null) {this.currentMetrics.clear();}
    if (currentMetrics != null) {for (V2beta2MetricStatus item :currentMetrics){ this.addToCurrentMetrics(item);}} return (A) this;
  }
  public Boolean hasCurrentMetrics() {
    return currentMetrics != null && !currentMetrics.isEmpty();
  }
  public V2beta2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> addNewCurrentMetric() {
    return new V2beta2HorizontalPodAutoscalerStatusFluentImpl.CurrentMetricsNestedImpl();
  }
  public V2beta2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> addNewCurrentMetricLike(V2beta2MetricStatus item) {
    return new V2beta2HorizontalPodAutoscalerStatusFluentImpl.CurrentMetricsNestedImpl(-1, item);
  }
  public V2beta2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> setNewCurrentMetricLike(Integer index,V2beta2MetricStatus item) {
    return new V2beta2HorizontalPodAutoscalerStatusFluentImpl.CurrentMetricsNestedImpl(index, item);
  }
  public V2beta2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editCurrentMetric(Integer index) {
    if (currentMetrics.size() <= index) throw new RuntimeException("Can't edit currentMetrics. Index exceeds size.");
    return setNewCurrentMetricLike(index, buildCurrentMetric(index));
  }
  public V2beta2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editFirstCurrentMetric() {
    if (currentMetrics.size() == 0) throw new RuntimeException("Can't edit first currentMetrics. The list is empty.");
    return setNewCurrentMetricLike(0, buildCurrentMetric(0));
  }
  public V2beta2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editLastCurrentMetric() {
    int index = currentMetrics.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last currentMetrics. The list is empty.");
    return setNewCurrentMetricLike(index, buildCurrentMetric(index));
  }
  public V2beta2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editMatchingCurrentMetric(Predicate<V2beta2MetricStatusBuilder> predicate) {
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
    this.currentReplicas=currentReplicas; return (A) this;
  }
  public Boolean hasCurrentReplicas() {
    return this.currentReplicas != null;
  }
  public Integer getDesiredReplicas() {
    return this.desiredReplicas;
  }
  public A withDesiredReplicas(Integer desiredReplicas) {
    this.desiredReplicas=desiredReplicas; return (A) this;
  }
  public Boolean hasDesiredReplicas() {
    return this.desiredReplicas != null;
  }
  public OffsetDateTime getLastScaleTime() {
    return this.lastScaleTime;
  }
  public A withLastScaleTime(OffsetDateTime lastScaleTime) {
    this.lastScaleTime=lastScaleTime; return (A) this;
  }
  public Boolean hasLastScaleTime() {
    return this.lastScaleTime != null;
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta2HorizontalPodAutoscalerStatusFluentImpl that = (V2beta2HorizontalPodAutoscalerStatusFluentImpl) o;
    if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
    if (currentMetrics != null ? !currentMetrics.equals(that.currentMetrics) :that.currentMetrics != null) return false;
    if (currentReplicas != null ? !currentReplicas.equals(that.currentReplicas) :that.currentReplicas != null) return false;
    if (desiredReplicas != null ? !desiredReplicas.equals(that.desiredReplicas) :that.desiredReplicas != null) return false;
    if (lastScaleTime != null ? !lastScaleTime.equals(that.lastScaleTime) :that.lastScaleTime != null) return false;
    if (observedGeneration != null ? !observedGeneration.equals(that.observedGeneration) :that.observedGeneration != null) return false;
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
  class ConditionsNestedImpl<N> extends V2beta2HorizontalPodAutoscalerConditionFluentImpl<V2beta2HorizontalPodAutoscalerStatusFluent.ConditionsNested<N>> implements V2beta2HorizontalPodAutoscalerStatusFluent.ConditionsNested<N>,Nested<N>{
    ConditionsNestedImpl(Integer index,V2beta2HorizontalPodAutoscalerCondition item) {
      this.index = index;
      this.builder = new V2beta2HorizontalPodAutoscalerConditionBuilder(this, item);
    }
    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new V2beta2HorizontalPodAutoscalerConditionBuilder(this);
    }
    V2beta2HorizontalPodAutoscalerConditionBuilder builder;
    Integer index;
    public N and() {
      return (N) V2beta2HorizontalPodAutoscalerStatusFluentImpl.this.setToConditions(index,builder.build());
    }
    public N endCondition() {
      return and();
    }
    
  }
  class CurrentMetricsNestedImpl<N> extends V2beta2MetricStatusFluentImpl<V2beta2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<N>> implements V2beta2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<N>,Nested<N>{
    CurrentMetricsNestedImpl(Integer index,V2beta2MetricStatus item) {
      this.index = index;
      this.builder = new V2beta2MetricStatusBuilder(this, item);
    }
    CurrentMetricsNestedImpl() {
      this.index = -1;
      this.builder = new V2beta2MetricStatusBuilder(this);
    }
    V2beta2MetricStatusBuilder builder;
    Integer index;
    public N and() {
      return (N) V2beta2HorizontalPodAutoscalerStatusFluentImpl.this.setToCurrentMetrics(index,builder.build());
    }
    public N endCurrentMetric() {
      return and();
    }
    
  }
  
}