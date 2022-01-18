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
public class V2beta1HorizontalPodAutoscalerSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent<A> {
  public V2beta1HorizontalPodAutoscalerSpecFluentImpl() {}

  public V2beta1HorizontalPodAutoscalerSpecFluentImpl(
      io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpec instance) {
    this.withMaxReplicas(instance.getMaxReplicas());

    this.withMetrics(instance.getMetrics());

    this.withMinReplicas(instance.getMinReplicas());

    this.withScaleTargetRef(instance.getScaleTargetRef());
  }

  private java.lang.Integer maxReplicas;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder> metrics;
  private java.lang.Integer minReplicas;
  private io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceBuilder
      scaleTargetRef;

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
      java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta1MetricSpec item) {
    if (this.metrics == null) {
      this.metrics =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder>();
    }
    io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder builder =
        new io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder(item);
    _visitables.get("metrics").add(index >= 0 ? index : _visitables.get("metrics").size(), builder);
    this.metrics.add(index >= 0 ? index : metrics.size(), builder);
    return (A) this;
  }

  public A setToMetrics(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta1MetricSpec item) {
    if (this.metrics == null) {
      this.metrics =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder>();
    }
    io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder builder =
        new io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder(item);
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

  public A addToMetrics(io.kubernetes.client.openapi.models.V2beta1MetricSpec... items) {
    if (this.metrics == null) {
      this.metrics =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V2beta1MetricSpec item : items) {
      io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder builder =
          new io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder(item);
      _visitables.get("metrics").add(builder);
      this.metrics.add(builder);
    }
    return (A) this;
  }

  public A addAllToMetrics(
      java.util.Collection<io.kubernetes.client.openapi.models.V2beta1MetricSpec> items) {
    if (this.metrics == null) {
      this.metrics =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V2beta1MetricSpec item : items) {
      io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder builder =
          new io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder(item);
      _visitables.get("metrics").add(builder);
      this.metrics.add(builder);
    }
    return (A) this;
  }

  public A removeFromMetrics(io.kubernetes.client.openapi.models.V2beta1MetricSpec... items) {
    for (io.kubernetes.client.openapi.models.V2beta1MetricSpec item : items) {
      io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder builder =
          new io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder(item);
      _visitables.get("metrics").remove(builder);
      if (this.metrics != null) {
        this.metrics.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromMetrics(
      java.util.Collection<io.kubernetes.client.openapi.models.V2beta1MetricSpec> items) {
    for (io.kubernetes.client.openapi.models.V2beta1MetricSpec item : items) {
      io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder builder =
          new io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder(item);
      _visitables.get("metrics").remove(builder);
      if (this.metrics != null) {
        this.metrics.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromMetrics(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder>
          predicate) {
    if (metrics == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder> each =
        metrics.iterator();
    final List visitables = _visitables.get("metrics");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder builder = each.next();
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
  public java.util.List<io.kubernetes.client.openapi.models.V2beta1MetricSpec> getMetrics() {
    return metrics != null ? build(metrics) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V2beta1MetricSpec> buildMetrics() {
    return metrics != null ? build(metrics) : null;
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpec buildMetric(
      java.lang.Integer index) {
    return this.metrics.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpec buildFirstMetric() {
    return this.metrics.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpec buildLastMetric() {
    return this.metrics.get(metrics.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpec buildMatchingMetric(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder item : metrics) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingMetric(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder item : metrics) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withMetrics(
      java.util.List<io.kubernetes.client.openapi.models.V2beta1MetricSpec> metrics) {
    if (this.metrics != null) {
      _visitables.get("metrics").removeAll(this.metrics);
    }
    if (metrics != null) {
      this.metrics = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V2beta1MetricSpec item : metrics) {
        this.addToMetrics(item);
      }
    } else {
      this.metrics = null;
    }
    return (A) this;
  }

  public A withMetrics(io.kubernetes.client.openapi.models.V2beta1MetricSpec... metrics) {
    if (this.metrics != null) {
      this.metrics.clear();
    }
    if (metrics != null) {
      for (io.kubernetes.client.openapi.models.V2beta1MetricSpec item : metrics) {
        this.addToMetrics(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasMetrics() {
    return metrics != null && !metrics.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      addNewMetric() {
    return new io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluentImpl
        .MetricsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      addNewMetricLike(io.kubernetes.client.openapi.models.V2beta1MetricSpec item) {
    return new io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluentImpl
        .MetricsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      setNewMetricLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta1MetricSpec item) {
    return new io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluentImpl
        .MetricsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      editMetric(java.lang.Integer index) {
    if (metrics.size() <= index)
      throw new RuntimeException("Can't edit metrics. Index exceeds size.");
    return setNewMetricLike(index, buildMetric(index));
  }

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      editFirstMetric() {
    if (metrics.size() == 0)
      throw new RuntimeException("Can't edit first metrics. The list is empty.");
    return setNewMetricLike(0, buildMetric(0));
  }

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      editLastMetric() {
    int index = metrics.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last metrics. The list is empty.");
    return setNewMetricLike(index, buildMetric(index));
  }

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      editMatchingMetric(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder>
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
  public io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference
      getScaleTargetRef() {
    return this.scaleTargetRef != null ? this.scaleTargetRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference
      buildScaleTargetRef() {
    return this.scaleTargetRef != null ? this.scaleTargetRef.build() : null;
  }

  public A withScaleTargetRef(
      io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference scaleTargetRef) {
    _visitables.get("scaleTargetRef").remove(this.scaleTargetRef);
    if (scaleTargetRef != null) {
      this.scaleTargetRef =
          new io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceBuilder(
              scaleTargetRef);
      _visitables.get("scaleTargetRef").add(this.scaleTargetRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasScaleTargetRef() {
    return this.scaleTargetRef != null;
  }

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      withNewScaleTargetRef() {
    return new io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluentImpl
        .ScaleTargetRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      withNewScaleTargetRefLike(
          io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference item) {
    return new io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluentImpl
        .ScaleTargetRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      editScaleTargetRef() {
    return withNewScaleTargetRefLike(getScaleTargetRef());
  }

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      editOrNewScaleTargetRef() {
    return withNewScaleTargetRefLike(
        getScaleTargetRef() != null
            ? getScaleTargetRef()
            : new io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      editOrNewScaleTargetRefLike(
          io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference item) {
    return withNewScaleTargetRefLike(getScaleTargetRef() != null ? getScaleTargetRef() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta1HorizontalPodAutoscalerSpecFluentImpl that =
        (V2beta1HorizontalPodAutoscalerSpecFluentImpl) o;
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
        maxReplicas, metrics, minReplicas, scaleTargetRef, super.hashCode());
  }

  public class MetricsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2beta1MetricSpecFluentImpl<
          io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent
                  .MetricsNested<
              N>>
      implements io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent
                  .MetricsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetricsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta1MetricSpec item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder(this, item);
    }

    MetricsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N)
          V2beta1HorizontalPodAutoscalerSpecFluentImpl.this.setToMetrics(index, builder.build());
    }

    public N endMetric() {
      return and();
    }
  }

  public class ScaleTargetRefNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent
                  .ScaleTargetRefNested<
              N>>
      implements io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent
                  .ScaleTargetRefNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ScaleTargetRefNestedImpl(
        io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceBuilder(
              this, item);
    }

    ScaleTargetRefNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceBuilder builder;

    public N and() {
      return (N)
          V2beta1HorizontalPodAutoscalerSpecFluentImpl.this.withScaleTargetRef(builder.build());
    }

    public N endScaleTargetRef() {
      return and();
    }
  }
}
