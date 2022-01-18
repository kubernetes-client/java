/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import java.util.Iterator;
import java.util.List;

/** Generated */
public class V2beta2HorizontalPodAutoscalerSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent<A> {
  public V2beta2HorizontalPodAutoscalerSpecFluentImpl() {}

  public V2beta2HorizontalPodAutoscalerSpecFluentImpl(
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpec instance) {
    this.withBehavior(instance.getBehavior());

    this.withMaxReplicas(instance.getMaxReplicas());

    this.withMetrics(instance.getMetrics());

    this.withMinReplicas(instance.getMinReplicas());

    this.withScaleTargetRef(instance.getScaleTargetRef());
  }

  private io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorBuilder
      behavior;
  private java.lang.Integer maxReplicas;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder> metrics;
  private java.lang.Integer minReplicas;
  private io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReferenceBuilder
      scaleTargetRef;

  /**
   * This method has been deprecated, please use method buildBehavior instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior getBehavior() {
    return this.behavior != null ? this.behavior.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior
      buildBehavior() {
    return this.behavior != null ? this.behavior.build() : null;
  }

  public A withBehavior(
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior behavior) {
    _visitables.get("behavior").remove(this.behavior);
    if (behavior != null) {
      this.behavior =
          new io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorBuilder(
              behavior);
      _visitables.get("behavior").add(this.behavior);
    }
    return (A) this;
  }

  public java.lang.Boolean hasBehavior() {
    return this.behavior != null;
  }

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
              .BehaviorNested<
          A>
      withNewBehavior() {
    return new io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluentImpl
        .BehaviorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
              .BehaviorNested<
          A>
      withNewBehaviorLike(
          io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior item) {
    return new io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluentImpl
        .BehaviorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
              .BehaviorNested<
          A>
      editBehavior() {
    return withNewBehaviorLike(getBehavior());
  }

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
              .BehaviorNested<
          A>
      editOrNewBehavior() {
    return withNewBehaviorLike(
        getBehavior() != null
            ? getBehavior()
            : new io.kubernetes.client.openapi.models
                    .V2beta2HorizontalPodAutoscalerBehaviorBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
              .BehaviorNested<
          A>
      editOrNewBehaviorLike(
          io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior item) {
    return withNewBehaviorLike(getBehavior() != null ? getBehavior() : item);
  }

  public java.lang.Integer getMaxReplicas() {
    return this.maxReplicas;
  }

  public A withMaxReplicas(java.lang.Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
    return (A) this;
  }

  public java.lang.Boolean hasMaxReplicas() {
    return this.maxReplicas != null;
  }

  public A addToMetrics(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta2MetricSpec item) {
    if (this.metrics == null) {
      this.metrics =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder>();
    }
    io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder builder =
        new io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder(item);
    _visitables.get("metrics").add(index >= 0 ? index : _visitables.get("metrics").size(), builder);
    this.metrics.add(index >= 0 ? index : metrics.size(), builder);
    return (A) this;
  }

  public A setToMetrics(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta2MetricSpec item) {
    if (this.metrics == null) {
      this.metrics =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder>();
    }
    io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder builder =
        new io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder(item);
    if (index < 0 || index >= _visitables.get("metrics").size()) {
      _visitables.get("metrics").add(builder);
    } else {
      _visitables.get("metrics").set(index, builder);
    }
    if (index < 0 || index >= metrics.size()) {
      metrics.add(builder);
    } else {
      metrics.set(index, builder);
    }
    return (A) this;
  }

  public A addToMetrics(io.kubernetes.client.openapi.models.V2beta2MetricSpec... items) {
    if (this.metrics == null) {
      this.metrics =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V2beta2MetricSpec item : items) {
      io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder builder =
          new io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder(item);
      _visitables.get("metrics").add(builder);
      this.metrics.add(builder);
    }
    return (A) this;
  }

  public A addAllToMetrics(
      java.util.Collection<io.kubernetes.client.openapi.models.V2beta2MetricSpec> items) {
    if (this.metrics == null) {
      this.metrics =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V2beta2MetricSpec item : items) {
      io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder builder =
          new io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder(item);
      _visitables.get("metrics").add(builder);
      this.metrics.add(builder);
    }
    return (A) this;
  }

  public A removeFromMetrics(io.kubernetes.client.openapi.models.V2beta2MetricSpec... items) {
    for (io.kubernetes.client.openapi.models.V2beta2MetricSpec item : items) {
      io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder builder =
          new io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder(item);
      _visitables.get("metrics").remove(builder);
      if (this.metrics != null) {
        this.metrics.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromMetrics(
      java.util.Collection<io.kubernetes.client.openapi.models.V2beta2MetricSpec> items) {
    for (io.kubernetes.client.openapi.models.V2beta2MetricSpec item : items) {
      io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder builder =
          new io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder(item);
      _visitables.get("metrics").remove(builder);
      if (this.metrics != null) {
        this.metrics.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromMetrics(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder>
          predicate) {
    if (metrics == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder> each =
        metrics.iterator();
    final List visitables = _visitables.get("metrics");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildMetrics instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V2beta2MetricSpec> getMetrics() {
    return metrics != null ? build(metrics) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V2beta2MetricSpec> buildMetrics() {
    return metrics != null ? build(metrics) : null;
  }

  public io.kubernetes.client.openapi.models.V2beta2MetricSpec buildMetric(
      java.lang.Integer index) {
    return this.metrics.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V2beta2MetricSpec buildFirstMetric() {
    return this.metrics.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V2beta2MetricSpec buildLastMetric() {
    return this.metrics.get(metrics.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V2beta2MetricSpec buildMatchingMetric(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder item : metrics) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingMetric(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder item : metrics) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withMetrics(
      java.util.List<io.kubernetes.client.openapi.models.V2beta2MetricSpec> metrics) {
    if (this.metrics != null) {
      _visitables.get("metrics").removeAll(this.metrics);
    }
    if (metrics != null) {
      this.metrics = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V2beta2MetricSpec item : metrics) {
        this.addToMetrics(item);
      }
    } else {
      this.metrics = null;
    }
    return (A) this;
  }

  public A withMetrics(io.kubernetes.client.openapi.models.V2beta2MetricSpec... metrics) {
    if (this.metrics != null) {
      this.metrics.clear();
    }
    if (metrics != null) {
      for (io.kubernetes.client.openapi.models.V2beta2MetricSpec item : metrics) {
        this.addToMetrics(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasMetrics() {
    return metrics != null && !metrics.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      addNewMetric() {
    return new io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluentImpl
        .MetricsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      addNewMetricLike(io.kubernetes.client.openapi.models.V2beta2MetricSpec item) {
    return new io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluentImpl
        .MetricsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      setNewMetricLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta2MetricSpec item) {
    return new io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluentImpl
        .MetricsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      editMetric(java.lang.Integer index) {
    if (metrics.size() <= index)
      throw new RuntimeException("Can't edit metrics. Index exceeds size.");
    return setNewMetricLike(index, buildMetric(index));
  }

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      editFirstMetric() {
    if (metrics.size() == 0)
      throw new RuntimeException("Can't edit first metrics. The list is empty.");
    return setNewMetricLike(0, buildMetric(0));
  }

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      editLastMetric() {
    int index = metrics.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last metrics. The list is empty.");
    return setNewMetricLike(index, buildMetric(index));
  }

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      editMatchingMetric(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < metrics.size(); i++) {
      if (predicate.test(metrics.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching metrics. No match found.");
    return setNewMetricLike(index, buildMetric(index));
  }

  public java.lang.Integer getMinReplicas() {
    return this.minReplicas;
  }

  public A withMinReplicas(java.lang.Integer minReplicas) {
    this.minReplicas = minReplicas;
    return (A) this;
  }

  public java.lang.Boolean hasMinReplicas() {
    return this.minReplicas != null;
  }

  /**
   * This method has been deprecated, please use method buildScaleTargetRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference
      getScaleTargetRef() {
    return this.scaleTargetRef != null ? this.scaleTargetRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference
      buildScaleTargetRef() {
    return this.scaleTargetRef != null ? this.scaleTargetRef.build() : null;
  }

  public A withScaleTargetRef(
      io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference scaleTargetRef) {
    _visitables.get("scaleTargetRef").remove(this.scaleTargetRef);
    if (scaleTargetRef != null) {
      this.scaleTargetRef =
          new io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReferenceBuilder(
              scaleTargetRef);
      _visitables.get("scaleTargetRef").add(this.scaleTargetRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasScaleTargetRef() {
    return this.scaleTargetRef != null;
  }

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      withNewScaleTargetRef() {
    return new io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluentImpl
        .ScaleTargetRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      withNewScaleTargetRefLike(
          io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference item) {
    return new io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluentImpl
        .ScaleTargetRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      editScaleTargetRef() {
    return withNewScaleTargetRefLike(getScaleTargetRef());
  }

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      editOrNewScaleTargetRef() {
    return withNewScaleTargetRefLike(
        getScaleTargetRef() != null
            ? getScaleTargetRef()
            : new io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReferenceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      editOrNewScaleTargetRefLike(
          io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference item) {
    return withNewScaleTargetRefLike(getScaleTargetRef() != null ? getScaleTargetRef() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta2HorizontalPodAutoscalerSpecFluentImpl that =
        (V2beta2HorizontalPodAutoscalerSpecFluentImpl) o;
    if (behavior != null ? !behavior.equals(that.behavior) : that.behavior != null) return false;
    if (maxReplicas != null ? !maxReplicas.equals(that.maxReplicas) : that.maxReplicas != null)
      return false;
    if (metrics != null ? !metrics.equals(that.metrics) : that.metrics != null) return false;
    if (minReplicas != null ? !minReplicas.equals(that.minReplicas) : that.minReplicas != null)
      return false;
    if (scaleTargetRef != null
        ? !scaleTargetRef.equals(that.scaleTargetRef)
        : that.scaleTargetRef != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        behavior, maxReplicas, metrics, minReplicas, scaleTargetRef, super.hashCode());
  }

  public class BehaviorNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluentImpl<
          io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
                  .BehaviorNested<
              N>>
      implements io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
                  .BehaviorNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    BehaviorNestedImpl(
        io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorBuilder(
              this, item);
    }

    BehaviorNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorBuilder(
              this);
    }

    io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorBuilder builder;

    public N and() {
      return (N) V2beta2HorizontalPodAutoscalerSpecFluentImpl.this.withBehavior(builder.build());
    }

    public N endBehavior() {
      return and();
    }
  }

  public class MetricsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2beta2MetricSpecFluentImpl<
          io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
                  .MetricsNested<
              N>>
      implements io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
                  .MetricsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetricsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta2MetricSpec item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder(this, item);
    }

    MetricsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N)
          V2beta2HorizontalPodAutoscalerSpecFluentImpl.this.setToMetrics(index, builder.build());
    }

    public N endMetric() {
      return and();
    }
  }

  public class ScaleTargetRefNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
                  .ScaleTargetRefNested<
              N>>
      implements io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent
                  .ScaleTargetRefNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ScaleTargetRefNestedImpl(
        io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReferenceBuilder(
              this, item);
    }

    ScaleTargetRefNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReferenceBuilder builder;

    public N and() {
      return (N)
          V2beta2HorizontalPodAutoscalerSpecFluentImpl.this.withScaleTargetRef(builder.build());
    }

    public N endScaleTargetRef() {
      return and();
    }
  }
}
