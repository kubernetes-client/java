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

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V2ObjectMetricStatusFluentImpl<A extends V2ObjectMetricStatusFluent<A>>
    extends BaseFluent<A> implements V2ObjectMetricStatusFluent<A> {
  public V2ObjectMetricStatusFluentImpl() {}

  public V2ObjectMetricStatusFluentImpl(
      io.kubernetes.client.openapi.models.V2ObjectMetricStatus instance) {
    this.withCurrent(instance.getCurrent());

    this.withDescribedObject(instance.getDescribedObject());

    this.withMetric(instance.getMetric());
  }

  private V2MetricValueStatusBuilder current;
  private V2CrossVersionObjectReferenceBuilder describedObject;
  private V2MetricIdentifierBuilder metric;

  /**
   * This method has been deprecated, please use method buildCurrent instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V2MetricValueStatus getCurrent() {
    return this.current != null ? this.current.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2MetricValueStatus buildCurrent() {
    return this.current != null ? this.current.build() : null;
  }

  public A withCurrent(io.kubernetes.client.openapi.models.V2MetricValueStatus current) {
    _visitables.get("current").remove(this.current);
    if (current != null) {
      this.current = new V2MetricValueStatusBuilder(current);
      _visitables.get("current").add(this.current);
    }
    return (A) this;
  }

  public Boolean hasCurrent() {
    return this.current != null;
  }

  public V2ObjectMetricStatusFluent.CurrentNested<A> withNewCurrent() {
    return new V2ObjectMetricStatusFluentImpl.CurrentNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.CurrentNested<A>
      withNewCurrentLike(io.kubernetes.client.openapi.models.V2MetricValueStatus item) {
    return new V2ObjectMetricStatusFluentImpl.CurrentNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.CurrentNested<A>
      editCurrent() {
    return withNewCurrentLike(getCurrent());
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.CurrentNested<A>
      editOrNewCurrent() {
    return withNewCurrentLike(
        getCurrent() != null
            ? getCurrent()
            : new io.kubernetes.client.openapi.models.V2MetricValueStatusBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.CurrentNested<A>
      editOrNewCurrentLike(io.kubernetes.client.openapi.models.V2MetricValueStatus item) {
    return withNewCurrentLike(getCurrent() != null ? getCurrent() : item);
  }

  /**
   * This method has been deprecated, please use method buildDescribedObject instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V2CrossVersionObjectReference getDescribedObject() {
    return this.describedObject != null ? this.describedObject.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2CrossVersionObjectReference buildDescribedObject() {
    return this.describedObject != null ? this.describedObject.build() : null;
  }

  public A withDescribedObject(
      io.kubernetes.client.openapi.models.V2CrossVersionObjectReference describedObject) {
    _visitables.get("describedObject").remove(this.describedObject);
    if (describedObject != null) {
      this.describedObject =
          new io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceBuilder(
              describedObject);
      _visitables.get("describedObject").add(this.describedObject);
    }
    return (A) this;
  }

  public java.lang.Boolean hasDescribedObject() {
    return this.describedObject != null;
  }

  public V2ObjectMetricStatusFluent.DescribedObjectNested<A> withNewDescribedObject() {
    return new V2ObjectMetricStatusFluentImpl.DescribedObjectNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.DescribedObjectNested<A>
      withNewDescribedObjectLike(
          io.kubernetes.client.openapi.models.V2CrossVersionObjectReference item) {
    return new io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluentImpl
        .DescribedObjectNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.DescribedObjectNested<A>
      editDescribedObject() {
    return withNewDescribedObjectLike(getDescribedObject());
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.DescribedObjectNested<A>
      editOrNewDescribedObject() {
    return withNewDescribedObjectLike(
        getDescribedObject() != null
            ? getDescribedObject()
            : new io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.DescribedObjectNested<A>
      editOrNewDescribedObjectLike(
          io.kubernetes.client.openapi.models.V2CrossVersionObjectReference item) {
    return withNewDescribedObjectLike(getDescribedObject() != null ? getDescribedObject() : item);
  }

  /**
   * This method has been deprecated, please use method buildMetric instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V2MetricIdentifier getMetric() {
    return this.metric != null ? this.metric.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2MetricIdentifier buildMetric() {
    return this.metric != null ? this.metric.build() : null;
  }

  public A withMetric(io.kubernetes.client.openapi.models.V2MetricIdentifier metric) {
    _visitables.get("metric").remove(this.metric);
    if (metric != null) {
      this.metric = new io.kubernetes.client.openapi.models.V2MetricIdentifierBuilder(metric);
      _visitables.get("metric").add(this.metric);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMetric() {
    return this.metric != null;
  }

  public V2ObjectMetricStatusFluent.MetricNested<A> withNewMetric() {
    return new V2ObjectMetricStatusFluentImpl.MetricNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.MetricNested<A>
      withNewMetricLike(io.kubernetes.client.openapi.models.V2MetricIdentifier item) {
    return new io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluentImpl.MetricNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.MetricNested<A>
      editMetric() {
    return withNewMetricLike(getMetric());
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.MetricNested<A>
      editOrNewMetric() {
    return withNewMetricLike(
        getMetric() != null
            ? getMetric()
            : new io.kubernetes.client.openapi.models.V2MetricIdentifierBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.MetricNested<A>
      editOrNewMetricLike(io.kubernetes.client.openapi.models.V2MetricIdentifier item) {
    return withNewMetricLike(getMetric() != null ? getMetric() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2ObjectMetricStatusFluentImpl that = (V2ObjectMetricStatusFluentImpl) o;
    if (current != null ? !current.equals(that.current) : that.current != null) return false;
    if (describedObject != null
        ? !describedObject.equals(that.describedObject)
        : that.describedObject != null) return false;
    if (metric != null ? !metric.equals(that.metric) : that.metric != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(current, describedObject, metric, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (current != null) {
      sb.append("current:");
      sb.append(current + ",");
    }
    if (describedObject != null) {
      sb.append("describedObject:");
      sb.append(describedObject + ",");
    }
    if (metric != null) {
      sb.append("metric:");
      sb.append(metric);
    }
    sb.append("}");
    return sb.toString();
  }

  class CurrentNestedImpl<N>
      extends V2MetricValueStatusFluentImpl<V2ObjectMetricStatusFluent.CurrentNested<N>>
      implements io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.CurrentNested<N>,
          Nested<N> {
    CurrentNestedImpl(V2MetricValueStatus item) {
      this.builder = new V2MetricValueStatusBuilder(this, item);
    }

    CurrentNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2MetricValueStatusBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2MetricValueStatusBuilder builder;

    public N and() {
      return (N) V2ObjectMetricStatusFluentImpl.this.withCurrent(builder.build());
    }

    public N endCurrent() {
      return and();
    }
  }

  class DescribedObjectNestedImpl<N>
      extends V2CrossVersionObjectReferenceFluentImpl<
          V2ObjectMetricStatusFluent.DescribedObjectNested<N>>
      implements io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent
                  .DescribedObjectNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    DescribedObjectNestedImpl(
        io.kubernetes.client.openapi.models.V2CrossVersionObjectReference item) {
      this.builder = new V2CrossVersionObjectReferenceBuilder(this, item);
    }

    DescribedObjectNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceBuilder builder;

    public N and() {
      return (N) V2ObjectMetricStatusFluentImpl.this.withDescribedObject(builder.build());
    }

    public N endDescribedObject() {
      return and();
    }
  }

  class MetricNestedImpl<N>
      extends V2MetricIdentifierFluentImpl<V2ObjectMetricStatusFluent.MetricNested<N>>
      implements io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.MetricNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetricNestedImpl(V2MetricIdentifier item) {
      this.builder = new V2MetricIdentifierBuilder(this, item);
    }

    MetricNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2MetricIdentifierBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2MetricIdentifierBuilder builder;

    public N and() {
      return (N) V2ObjectMetricStatusFluentImpl.this.withMetric(builder.build());
    }

    public N endMetric() {
      return and();
    }
  }
}
