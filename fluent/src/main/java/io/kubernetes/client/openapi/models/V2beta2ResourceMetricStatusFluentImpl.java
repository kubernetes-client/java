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
public class V2beta2ResourceMetricStatusFluentImpl<A extends V2beta2ResourceMetricStatusFluent<A>>
    extends BaseFluent<A> implements V2beta2ResourceMetricStatusFluent<A> {
  public V2beta2ResourceMetricStatusFluentImpl() {}

  public V2beta2ResourceMetricStatusFluentImpl(
      io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus instance) {
    this.withCurrent(instance.getCurrent());

    this.withName(instance.getName());
  }

  private V2beta2MetricValueStatusBuilder current;
  private String name;

  /**
   * This method has been deprecated, please use method buildCurrent instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2MetricValueStatus getCurrent() {
    return this.current != null ? this.current.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2beta2MetricValueStatus buildCurrent() {
    return this.current != null ? this.current.build() : null;
  }

  public A withCurrent(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus current) {
    _visitables.get("current").remove(this.current);
    if (current != null) {
      this.current =
          new io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder(current);
      _visitables.get("current").add(this.current);
    }
    return (A) this;
  }

  public Boolean hasCurrent() {
    return this.current != null;
  }

  public V2beta2ResourceMetricStatusFluent.CurrentNested<A> withNewCurrent() {
    return new V2beta2ResourceMetricStatusFluentImpl.CurrentNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<A>
      withNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item) {
    return new V2beta2ResourceMetricStatusFluentImpl.CurrentNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<A>
      editCurrent() {
    return withNewCurrentLike(getCurrent());
  }

  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<A>
      editOrNewCurrent() {
    return withNewCurrentLike(
        getCurrent() != null
            ? getCurrent()
            : new io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<A>
      editOrNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item) {
    return withNewCurrentLike(getCurrent() != null ? getCurrent() : item);
  }

  public java.lang.String getName() {
    return this.name;
  }

  public A withName(java.lang.String name) {
    this.name = name;
    return (A) this;
  }

  public java.lang.Boolean hasName() {
    return this.name != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta2ResourceMetricStatusFluentImpl that = (V2beta2ResourceMetricStatusFluentImpl) o;
    if (current != null ? !current.equals(that.current) : that.current != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(current, name, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (current != null) {
      sb.append("current:");
      sb.append(current + ",");
    }
    if (name != null) {
      sb.append("name:");
      sb.append(name);
    }
    sb.append("}");
    return sb.toString();
  }

  class CurrentNestedImpl<N>
      extends V2beta2MetricValueStatusFluentImpl<V2beta2ResourceMetricStatusFluent.CurrentNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent
                  .CurrentNested<
              N>,
          Nested<N> {
    CurrentNestedImpl(V2beta2MetricValueStatus item) {
      this.builder = new V2beta2MetricValueStatusBuilder(this, item);
    }

    CurrentNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder builder;

    public N and() {
      return (N) V2beta2ResourceMetricStatusFluentImpl.this.withCurrent(builder.build());
    }

    public N endCurrent() {
      return and();
    }
  }
}
