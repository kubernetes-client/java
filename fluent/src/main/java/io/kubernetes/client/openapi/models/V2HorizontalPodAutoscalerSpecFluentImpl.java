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
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V2HorizontalPodAutoscalerSpecFluentImpl<A extends V2HorizontalPodAutoscalerSpecFluent<A>> extends BaseFluent<A> implements V2HorizontalPodAutoscalerSpecFluent<A>{
  public V2HorizontalPodAutoscalerSpecFluentImpl() {
  }
  public V2HorizontalPodAutoscalerSpecFluentImpl(V2HorizontalPodAutoscalerSpec instance) {
    this.withBehavior(instance.getBehavior());

    this.withMaxReplicas(instance.getMaxReplicas());

    this.withMetrics(instance.getMetrics());

    this.withMinReplicas(instance.getMinReplicas());

    this.withScaleTargetRef(instance.getScaleTargetRef());

  }
  private V2HorizontalPodAutoscalerBehaviorBuilder behavior;
  private Integer maxReplicas;
  private ArrayList<V2MetricSpecBuilder> metrics;
  private Integer minReplicas;
  private V2CrossVersionObjectReferenceBuilder scaleTargetRef;
  
  /**
   * This method has been deprecated, please use method buildBehavior instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2HorizontalPodAutoscalerBehavior getBehavior() {
    return this.behavior!=null ?this.behavior.build():null;
  }
  public V2HorizontalPodAutoscalerBehavior buildBehavior() {
    return this.behavior!=null ?this.behavior.build():null;
  }
  public A withBehavior(V2HorizontalPodAutoscalerBehavior behavior) {
    _visitables.get("behavior").remove(this.behavior);
    if (behavior!=null){ this.behavior= new V2HorizontalPodAutoscalerBehaviorBuilder(behavior); _visitables.get("behavior").add(this.behavior);} else { this.behavior = null; _visitables.get("behavior").remove(this.behavior); } return (A) this;
  }
  public Boolean hasBehavior() {
    return this.behavior != null;
  }
  public V2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> withNewBehavior() {
    return new V2HorizontalPodAutoscalerSpecFluentImpl.BehaviorNestedImpl();
  }
  public V2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> withNewBehaviorLike(V2HorizontalPodAutoscalerBehavior item) {
    return new V2HorizontalPodAutoscalerSpecFluentImpl.BehaviorNestedImpl(item);
  }
  public V2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> editBehavior() {
    return withNewBehaviorLike(getBehavior());
  }
  public V2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> editOrNewBehavior() {
    return withNewBehaviorLike(getBehavior() != null ? getBehavior(): new V2HorizontalPodAutoscalerBehaviorBuilder().build());
  }
  public V2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> editOrNewBehaviorLike(V2HorizontalPodAutoscalerBehavior item) {
    return withNewBehaviorLike(getBehavior() != null ? getBehavior(): item);
  }
  public Integer getMaxReplicas() {
    return this.maxReplicas;
  }
  public A withMaxReplicas(Integer maxReplicas) {
    this.maxReplicas=maxReplicas; return (A) this;
  }
  public Boolean hasMaxReplicas() {
    return this.maxReplicas != null;
  }
  public A addToMetrics(Integer index,V2MetricSpec item) {
    if (this.metrics == null) {this.metrics = new ArrayList<V2MetricSpecBuilder>();}
    V2MetricSpecBuilder builder = new V2MetricSpecBuilder(item);_visitables.get("metrics").add(index >= 0 ? index : _visitables.get("metrics").size(), builder);this.metrics.add(index >= 0 ? index : metrics.size(), builder); return (A)this;
  }
  public A setToMetrics(Integer index,V2MetricSpec item) {
    if (this.metrics == null) {this.metrics = new ArrayList<V2MetricSpecBuilder>();}
    V2MetricSpecBuilder builder = new V2MetricSpecBuilder(item);
    if (index < 0 || index >= _visitables.get("metrics").size()) { _visitables.get("metrics").add(builder); } else { _visitables.get("metrics").set(index, builder);}
    if (index < 0 || index >= metrics.size()) { metrics.add(builder); } else { metrics.set(index, builder);}
     return (A)this;
  }
  public A addToMetrics(io.kubernetes.client.openapi.models.V2MetricSpec... items) {
    if (this.metrics == null) {this.metrics = new ArrayList<V2MetricSpecBuilder>();}
    for (V2MetricSpec item : items) {V2MetricSpecBuilder builder = new V2MetricSpecBuilder(item);_visitables.get("metrics").add(builder);this.metrics.add(builder);} return (A)this;
  }
  public A addAllToMetrics(Collection<V2MetricSpec> items) {
    if (this.metrics == null) {this.metrics = new ArrayList<V2MetricSpecBuilder>();}
    for (V2MetricSpec item : items) {V2MetricSpecBuilder builder = new V2MetricSpecBuilder(item);_visitables.get("metrics").add(builder);this.metrics.add(builder);} return (A)this;
  }
  public A removeFromMetrics(io.kubernetes.client.openapi.models.V2MetricSpec... items) {
    for (V2MetricSpec item : items) {V2MetricSpecBuilder builder = new V2MetricSpecBuilder(item);_visitables.get("metrics").remove(builder);if (this.metrics != null) {this.metrics.remove(builder);}} return (A)this;
  }
  public A removeAllFromMetrics(Collection<V2MetricSpec> items) {
    for (V2MetricSpec item : items) {V2MetricSpecBuilder builder = new V2MetricSpecBuilder(item);_visitables.get("metrics").remove(builder);if (this.metrics != null) {this.metrics.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromMetrics(Predicate<V2MetricSpecBuilder> predicate) {
    if (metrics == null) return (A) this;
    final Iterator<V2MetricSpecBuilder> each = metrics.iterator();
    final List visitables = _visitables.get("metrics");
    while (each.hasNext()) {
      V2MetricSpecBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildMetrics instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V2MetricSpec> getMetrics() {
    return metrics != null ? build(metrics) : null;
  }
  public List<V2MetricSpec> buildMetrics() {
    return metrics != null ? build(metrics) : null;
  }
  public V2MetricSpec buildMetric(Integer index) {
    return this.metrics.get(index).build();
  }
  public V2MetricSpec buildFirstMetric() {
    return this.metrics.get(0).build();
  }
  public V2MetricSpec buildLastMetric() {
    return this.metrics.get(metrics.size() - 1).build();
  }
  public V2MetricSpec buildMatchingMetric(Predicate<V2MetricSpecBuilder> predicate) {
    for (V2MetricSpecBuilder item: metrics) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingMetric(Predicate<V2MetricSpecBuilder> predicate) {
    for (V2MetricSpecBuilder item: metrics) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withMetrics(List<V2MetricSpec> metrics) {
    if (this.metrics != null) { _visitables.get("metrics").removeAll(this.metrics);}
    if (metrics != null) {this.metrics = new ArrayList(); for (V2MetricSpec item : metrics){this.addToMetrics(item);}} else { this.metrics = null;} return (A) this;
  }
  public A withMetrics(io.kubernetes.client.openapi.models.V2MetricSpec... metrics) {
    if (this.metrics != null) {this.metrics.clear();}
    if (metrics != null) {for (V2MetricSpec item :metrics){ this.addToMetrics(item);}} return (A) this;
  }
  public Boolean hasMetrics() {
    return metrics != null && !metrics.isEmpty();
  }
  public V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> addNewMetric() {
    return new V2HorizontalPodAutoscalerSpecFluentImpl.MetricsNestedImpl();
  }
  public V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> addNewMetricLike(V2MetricSpec item) {
    return new V2HorizontalPodAutoscalerSpecFluentImpl.MetricsNestedImpl(-1, item);
  }
  public V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> setNewMetricLike(Integer index,V2MetricSpec item) {
    return new V2HorizontalPodAutoscalerSpecFluentImpl.MetricsNestedImpl(index, item);
  }
  public V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editMetric(Integer index) {
    if (metrics.size() <= index) throw new RuntimeException("Can't edit metrics. Index exceeds size.");
    return setNewMetricLike(index, buildMetric(index));
  }
  public V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editFirstMetric() {
    if (metrics.size() == 0) throw new RuntimeException("Can't edit first metrics. The list is empty.");
    return setNewMetricLike(0, buildMetric(0));
  }
  public V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editLastMetric() {
    int index = metrics.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last metrics. The list is empty.");
    return setNewMetricLike(index, buildMetric(index));
  }
  public V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editMatchingMetric(Predicate<V2MetricSpecBuilder> predicate) {
    int index = -1;
    for (int i=0;i<metrics.size();i++) { 
    if (predicate.test(metrics.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching metrics. No match found.");
    return setNewMetricLike(index, buildMetric(index));
  }
  public Integer getMinReplicas() {
    return this.minReplicas;
  }
  public A withMinReplicas(Integer minReplicas) {
    this.minReplicas=minReplicas; return (A) this;
  }
  public Boolean hasMinReplicas() {
    return this.minReplicas != null;
  }
  
  /**
   * This method has been deprecated, please use method buildScaleTargetRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2CrossVersionObjectReference getScaleTargetRef() {
    return this.scaleTargetRef!=null ?this.scaleTargetRef.build():null;
  }
  public V2CrossVersionObjectReference buildScaleTargetRef() {
    return this.scaleTargetRef!=null ?this.scaleTargetRef.build():null;
  }
  public A withScaleTargetRef(V2CrossVersionObjectReference scaleTargetRef) {
    _visitables.get("scaleTargetRef").remove(this.scaleTargetRef);
    if (scaleTargetRef!=null){ this.scaleTargetRef= new V2CrossVersionObjectReferenceBuilder(scaleTargetRef); _visitables.get("scaleTargetRef").add(this.scaleTargetRef);} else { this.scaleTargetRef = null; _visitables.get("scaleTargetRef").remove(this.scaleTargetRef); } return (A) this;
  }
  public Boolean hasScaleTargetRef() {
    return this.scaleTargetRef != null;
  }
  public V2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRef() {
    return new V2HorizontalPodAutoscalerSpecFluentImpl.ScaleTargetRefNestedImpl();
  }
  public V2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRefLike(V2CrossVersionObjectReference item) {
    return new V2HorizontalPodAutoscalerSpecFluentImpl.ScaleTargetRefNestedImpl(item);
  }
  public V2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editScaleTargetRef() {
    return withNewScaleTargetRefLike(getScaleTargetRef());
  }
  public V2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRef() {
    return withNewScaleTargetRefLike(getScaleTargetRef() != null ? getScaleTargetRef(): new V2CrossVersionObjectReferenceBuilder().build());
  }
  public V2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRefLike(V2CrossVersionObjectReference item) {
    return withNewScaleTargetRefLike(getScaleTargetRef() != null ? getScaleTargetRef(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2HorizontalPodAutoscalerSpecFluentImpl that = (V2HorizontalPodAutoscalerSpecFluentImpl) o;
    if (behavior != null ? !behavior.equals(that.behavior) :that.behavior != null) return false;
    if (maxReplicas != null ? !maxReplicas.equals(that.maxReplicas) :that.maxReplicas != null) return false;
    if (metrics != null ? !metrics.equals(that.metrics) :that.metrics != null) return false;
    if (minReplicas != null ? !minReplicas.equals(that.minReplicas) :that.minReplicas != null) return false;
    if (scaleTargetRef != null ? !scaleTargetRef.equals(that.scaleTargetRef) :that.scaleTargetRef != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(behavior,  maxReplicas,  metrics,  minReplicas,  scaleTargetRef,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (behavior != null) { sb.append("behavior:"); sb.append(behavior + ","); }
    if (maxReplicas != null) { sb.append("maxReplicas:"); sb.append(maxReplicas + ","); }
    if (metrics != null && !metrics.isEmpty()) { sb.append("metrics:"); sb.append(metrics + ","); }
    if (minReplicas != null) { sb.append("minReplicas:"); sb.append(minReplicas + ","); }
    if (scaleTargetRef != null) { sb.append("scaleTargetRef:"); sb.append(scaleTargetRef); }
    sb.append("}");
    return sb.toString();
  }
  class BehaviorNestedImpl<N> extends V2HorizontalPodAutoscalerBehaviorFluentImpl<V2HorizontalPodAutoscalerSpecFluent.BehaviorNested<N>> implements V2HorizontalPodAutoscalerSpecFluent.BehaviorNested<N>,Nested<N>{
    BehaviorNestedImpl(V2HorizontalPodAutoscalerBehavior item) {
      this.builder = new V2HorizontalPodAutoscalerBehaviorBuilder(this, item);
    }
    BehaviorNestedImpl() {
      this.builder = new V2HorizontalPodAutoscalerBehaviorBuilder(this);
    }
    V2HorizontalPodAutoscalerBehaviorBuilder builder;
    public N and() {
      return (N) V2HorizontalPodAutoscalerSpecFluentImpl.this.withBehavior(builder.build());
    }
    public N endBehavior() {
      return and();
    }
    
  }
  class MetricsNestedImpl<N> extends V2MetricSpecFluentImpl<V2HorizontalPodAutoscalerSpecFluent.MetricsNested<N>> implements V2HorizontalPodAutoscalerSpecFluent.MetricsNested<N>,Nested<N>{
    MetricsNestedImpl(Integer index,V2MetricSpec item) {
      this.index = index;
      this.builder = new V2MetricSpecBuilder(this, item);
    }
    MetricsNestedImpl() {
      this.index = -1;
      this.builder = new V2MetricSpecBuilder(this);
    }
    V2MetricSpecBuilder builder;
    Integer index;
    public N and() {
      return (N) V2HorizontalPodAutoscalerSpecFluentImpl.this.setToMetrics(index,builder.build());
    }
    public N endMetric() {
      return and();
    }
    
  }
  class ScaleTargetRefNestedImpl<N> extends V2CrossVersionObjectReferenceFluentImpl<V2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<N>> implements V2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<N>,Nested<N>{
    ScaleTargetRefNestedImpl(V2CrossVersionObjectReference item) {
      this.builder = new V2CrossVersionObjectReferenceBuilder(this, item);
    }
    ScaleTargetRefNestedImpl() {
      this.builder = new V2CrossVersionObjectReferenceBuilder(this);
    }
    V2CrossVersionObjectReferenceBuilder builder;
    public N and() {
      return (N) V2HorizontalPodAutoscalerSpecFluentImpl.this.withScaleTargetRef(builder.build());
    }
    public N endScaleTargetRef() {
      return and();
    }
    
  }
  
}