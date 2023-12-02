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
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V2HorizontalPodAutoscalerSpecFluent<A extends V2HorizontalPodAutoscalerSpecFluent<A>> extends BaseFluent<A>{
  public V2HorizontalPodAutoscalerSpecFluent() {
  }
  
  public V2HorizontalPodAutoscalerSpecFluent(V2HorizontalPodAutoscalerSpec instance) {
    this.copyInstance(instance);
  }
  private V2HorizontalPodAutoscalerBehaviorBuilder behavior;
  private Integer maxReplicas;
  private ArrayList<V2MetricSpecBuilder> metrics;
  private Integer minReplicas;
  private V2CrossVersionObjectReferenceBuilder scaleTargetRef;
  
  protected void copyInstance(V2HorizontalPodAutoscalerSpec instance) {
    instance = (instance != null ? instance : new V2HorizontalPodAutoscalerSpec());
    if (instance != null) {
          this.withBehavior(instance.getBehavior());
          this.withMaxReplicas(instance.getMaxReplicas());
          this.withMetrics(instance.getMetrics());
          this.withMinReplicas(instance.getMinReplicas());
          this.withScaleTargetRef(instance.getScaleTargetRef());
        }
  }
  
  public V2HorizontalPodAutoscalerBehavior buildBehavior() {
    return this.behavior != null ? this.behavior.build() : null;
  }
  
  public A withBehavior(V2HorizontalPodAutoscalerBehavior behavior) {
    this._visitables.remove("behavior");
    if (behavior != null) {
        this.behavior = new V2HorizontalPodAutoscalerBehaviorBuilder(behavior);
        this._visitables.get("behavior").add(this.behavior);
    } else {
        this.behavior = null;
        this._visitables.get("behavior").remove(this.behavior);
    }
    return (A) this;
  }
  
  public boolean hasBehavior() {
    return this.behavior != null;
  }
  
  public BehaviorNested<A> withNewBehavior() {
    return new BehaviorNested(null);
  }
  
  public BehaviorNested<A> withNewBehaviorLike(V2HorizontalPodAutoscalerBehavior item) {
    return new BehaviorNested(item);
  }
  
  public BehaviorNested<A> editBehavior() {
    return withNewBehaviorLike(java.util.Optional.ofNullable(buildBehavior()).orElse(null));
  }
  
  public BehaviorNested<A> editOrNewBehavior() {
    return withNewBehaviorLike(java.util.Optional.ofNullable(buildBehavior()).orElse(new V2HorizontalPodAutoscalerBehaviorBuilder().build()));
  }
  
  public BehaviorNested<A> editOrNewBehaviorLike(V2HorizontalPodAutoscalerBehavior item) {
    return withNewBehaviorLike(java.util.Optional.ofNullable(buildBehavior()).orElse(item));
  }
  
  public Integer getMaxReplicas() {
    return this.maxReplicas;
  }
  
  public A withMaxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
    return (A) this;
  }
  
  public boolean hasMaxReplicas() {
    return this.maxReplicas != null;
  }
  
  public A addToMetrics(int index,V2MetricSpec item) {
    if (this.metrics == null) {this.metrics = new ArrayList<V2MetricSpecBuilder>();}
    V2MetricSpecBuilder builder = new V2MetricSpecBuilder(item);
    if (index < 0 || index >= metrics.size()) { _visitables.get("metrics").add(builder); metrics.add(builder); } else { _visitables.get("metrics").add(index, builder); metrics.add(index, builder);}
    return (A)this;
  }
  
  public A setToMetrics(int index,V2MetricSpec item) {
    if (this.metrics == null) {this.metrics = new ArrayList<V2MetricSpecBuilder>();}
    V2MetricSpecBuilder builder = new V2MetricSpecBuilder(item);
    if (index < 0 || index >= metrics.size()) { _visitables.get("metrics").add(builder); metrics.add(builder); } else { _visitables.get("metrics").set(index, builder); metrics.set(index, builder);}
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
    if (this.metrics == null) return (A)this;
    for (V2MetricSpec item : items) {V2MetricSpecBuilder builder = new V2MetricSpecBuilder(item);_visitables.get("metrics").remove(builder); this.metrics.remove(builder);} return (A)this;
  }
  
  public A removeAllFromMetrics(Collection<V2MetricSpec> items) {
    if (this.metrics == null) return (A)this;
    for (V2MetricSpec item : items) {V2MetricSpecBuilder builder = new V2MetricSpecBuilder(item);_visitables.get("metrics").remove(builder); this.metrics.remove(builder);} return (A)this;
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
  
  public List<V2MetricSpec> buildMetrics() {
    return this.metrics != null ? build(metrics) : null;
  }
  
  public V2MetricSpec buildMetric(int index) {
    return this.metrics.get(index).build();
  }
  
  public V2MetricSpec buildFirstMetric() {
    return this.metrics.get(0).build();
  }
  
  public V2MetricSpec buildLastMetric() {
    return this.metrics.get(metrics.size() - 1).build();
  }
  
  public V2MetricSpec buildMatchingMetric(Predicate<V2MetricSpecBuilder> predicate) {
      for (V2MetricSpecBuilder item : metrics) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingMetric(Predicate<V2MetricSpecBuilder> predicate) {
      for (V2MetricSpecBuilder item : metrics) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withMetrics(List<V2MetricSpec> metrics) {
    if (this.metrics != null) {
      this._visitables.get("metrics").clear();
    }
    if (metrics != null) {
        this.metrics = new ArrayList();
        for (V2MetricSpec item : metrics) {
          this.addToMetrics(item);
        }
    } else {
      this.metrics = null;
    }
    return (A) this;
  }
  
  public A withMetrics(io.kubernetes.client.openapi.models.V2MetricSpec... metrics) {
    if (this.metrics != null) {
        this.metrics.clear();
        _visitables.remove("metrics");
    }
    if (metrics != null) {
      for (V2MetricSpec item : metrics) {
        this.addToMetrics(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasMetrics() {
    return this.metrics != null && !this.metrics.isEmpty();
  }
  
  public MetricsNested<A> addNewMetric() {
    return new MetricsNested(-1, null);
  }
  
  public MetricsNested<A> addNewMetricLike(V2MetricSpec item) {
    return new MetricsNested(-1, item);
  }
  
  public MetricsNested<A> setNewMetricLike(int index,V2MetricSpec item) {
    return new MetricsNested(index, item);
  }
  
  public MetricsNested<A> editMetric(int index) {
    if (metrics.size() <= index) throw new RuntimeException("Can't edit metrics. Index exceeds size.");
    return setNewMetricLike(index, buildMetric(index));
  }
  
  public MetricsNested<A> editFirstMetric() {
    if (metrics.size() == 0) throw new RuntimeException("Can't edit first metrics. The list is empty.");
    return setNewMetricLike(0, buildMetric(0));
  }
  
  public MetricsNested<A> editLastMetric() {
    int index = metrics.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last metrics. The list is empty.");
    return setNewMetricLike(index, buildMetric(index));
  }
  
  public MetricsNested<A> editMatchingMetric(Predicate<V2MetricSpecBuilder> predicate) {
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
    this.minReplicas = minReplicas;
    return (A) this;
  }
  
  public boolean hasMinReplicas() {
    return this.minReplicas != null;
  }
  
  public V2CrossVersionObjectReference buildScaleTargetRef() {
    return this.scaleTargetRef != null ? this.scaleTargetRef.build() : null;
  }
  
  public A withScaleTargetRef(V2CrossVersionObjectReference scaleTargetRef) {
    this._visitables.remove("scaleTargetRef");
    if (scaleTargetRef != null) {
        this.scaleTargetRef = new V2CrossVersionObjectReferenceBuilder(scaleTargetRef);
        this._visitables.get("scaleTargetRef").add(this.scaleTargetRef);
    } else {
        this.scaleTargetRef = null;
        this._visitables.get("scaleTargetRef").remove(this.scaleTargetRef);
    }
    return (A) this;
  }
  
  public boolean hasScaleTargetRef() {
    return this.scaleTargetRef != null;
  }
  
  public ScaleTargetRefNested<A> withNewScaleTargetRef() {
    return new ScaleTargetRefNested(null);
  }
  
  public ScaleTargetRefNested<A> withNewScaleTargetRefLike(V2CrossVersionObjectReference item) {
    return new ScaleTargetRefNested(item);
  }
  
  public ScaleTargetRefNested<A> editScaleTargetRef() {
    return withNewScaleTargetRefLike(java.util.Optional.ofNullable(buildScaleTargetRef()).orElse(null));
  }
  
  public ScaleTargetRefNested<A> editOrNewScaleTargetRef() {
    return withNewScaleTargetRefLike(java.util.Optional.ofNullable(buildScaleTargetRef()).orElse(new V2CrossVersionObjectReferenceBuilder().build()));
  }
  
  public ScaleTargetRefNested<A> editOrNewScaleTargetRefLike(V2CrossVersionObjectReference item) {
    return withNewScaleTargetRefLike(java.util.Optional.ofNullable(buildScaleTargetRef()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2HorizontalPodAutoscalerSpecFluent that = (V2HorizontalPodAutoscalerSpecFluent) o;
    if (!java.util.Objects.equals(behavior, that.behavior)) return false;
    if (!java.util.Objects.equals(maxReplicas, that.maxReplicas)) return false;
    if (!java.util.Objects.equals(metrics, that.metrics)) return false;
    if (!java.util.Objects.equals(minReplicas, that.minReplicas)) return false;
    if (!java.util.Objects.equals(scaleTargetRef, that.scaleTargetRef)) return false;
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
  public class BehaviorNested<N> extends V2HorizontalPodAutoscalerBehaviorFluent<BehaviorNested<N>> implements Nested<N>{
    BehaviorNested(V2HorizontalPodAutoscalerBehavior item) {
      this.builder = new V2HorizontalPodAutoscalerBehaviorBuilder(this, item);
    }
    V2HorizontalPodAutoscalerBehaviorBuilder builder;
    
    public N and() {
      return (N) V2HorizontalPodAutoscalerSpecFluent.this.withBehavior(builder.build());
    }
    
    public N endBehavior() {
      return and();
    }
    
  
  }
  public class MetricsNested<N> extends V2MetricSpecFluent<MetricsNested<N>> implements Nested<N>{
    MetricsNested(int index,V2MetricSpec item) {
      this.index = index;
      this.builder = new V2MetricSpecBuilder(this, item);
    }
    V2MetricSpecBuilder builder;
    int index;
    
    public N and() {
      return (N) V2HorizontalPodAutoscalerSpecFluent.this.setToMetrics(index,builder.build());
    }
    
    public N endMetric() {
      return and();
    }
    
  
  }
  public class ScaleTargetRefNested<N> extends V2CrossVersionObjectReferenceFluent<ScaleTargetRefNested<N>> implements Nested<N>{
    ScaleTargetRefNested(V2CrossVersionObjectReference item) {
      this.builder = new V2CrossVersionObjectReferenceBuilder(this, item);
    }
    V2CrossVersionObjectReferenceBuilder builder;
    
    public N and() {
      return (N) V2HorizontalPodAutoscalerSpecFluent.this.withScaleTargetRef(builder.build());
    }
    
    public N endScaleTargetRef() {
      return and();
    }
    
  
  }

}