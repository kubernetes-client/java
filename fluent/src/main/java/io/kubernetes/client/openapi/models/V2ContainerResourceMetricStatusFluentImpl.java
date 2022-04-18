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
public class V2ContainerResourceMetricStatusFluentImpl<
        A extends V2ContainerResourceMetricStatusFluent<A>>
    extends BaseFluent<A> implements V2ContainerResourceMetricStatusFluent<A> {
  public V2ContainerResourceMetricStatusFluentImpl() {}

  public V2ContainerResourceMetricStatusFluentImpl(
      io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatus instance) {
    this.withContainer(instance.getContainer());

    this.withCurrent(instance.getCurrent());

    this.withName(instance.getName());
  }

  private String container;
  private V2MetricValueStatusBuilder current;
  private java.lang.String name;

  public java.lang.String getContainer() {
    return this.container;
  }

  public A withContainer(java.lang.String container) {
    this.container = container;
    return (A) this;
  }

  public Boolean hasContainer() {
    return this.container != null;
  }

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

  public java.lang.Boolean hasCurrent() {
    return this.current != null;
  }

  public V2ContainerResourceMetricStatusFluent.CurrentNested<A> withNewCurrent() {
    return new V2ContainerResourceMetricStatusFluentImpl.CurrentNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatusFluent.CurrentNested<A>
      withNewCurrentLike(io.kubernetes.client.openapi.models.V2MetricValueStatus item) {
    return new V2ContainerResourceMetricStatusFluentImpl.CurrentNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatusFluent.CurrentNested<A>
      editCurrent() {
    return withNewCurrentLike(getCurrent());
  }

  public io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatusFluent.CurrentNested<A>
      editOrNewCurrent() {
    return withNewCurrentLike(
        getCurrent() != null
            ? getCurrent()
            : new io.kubernetes.client.openapi.models.V2MetricValueStatusBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatusFluent.CurrentNested<A>
      editOrNewCurrentLike(io.kubernetes.client.openapi.models.V2MetricValueStatus item) {
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
    V2ContainerResourceMetricStatusFluentImpl that = (V2ContainerResourceMetricStatusFluentImpl) o;
    if (container != null ? !container.equals(that.container) : that.container != null)
      return false;
    if (current != null ? !current.equals(that.current) : that.current != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(container, current, name, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (container != null) {
      sb.append("container:");
      sb.append(container + ",");
    }
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
      extends V2MetricValueStatusFluentImpl<V2ContainerResourceMetricStatusFluent.CurrentNested<N>>
      implements io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatusFluent
                  .CurrentNested<
              N>,
          Nested<N> {
    CurrentNestedImpl(V2MetricValueStatus item) {
      this.builder = new V2MetricValueStatusBuilder(this, item);
    }

    CurrentNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2MetricValueStatusBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2MetricValueStatusBuilder builder;

    public N and() {
      return (N) V2ContainerResourceMetricStatusFluentImpl.this.withCurrent(builder.build());
    }

    public N endCurrent() {
      return and();
    }
  }
}
