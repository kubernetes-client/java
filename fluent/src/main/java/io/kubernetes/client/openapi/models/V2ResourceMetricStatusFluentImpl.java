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

/** Generated */
public class V2ResourceMetricStatusFluentImpl<
        A extends io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluent<A> {
  public V2ResourceMetricStatusFluentImpl() {}

  public V2ResourceMetricStatusFluentImpl(
      io.kubernetes.client.openapi.models.V2ResourceMetricStatus instance) {
    this.withCurrent(instance.getCurrent());

    this.withName(instance.getName());
  }

  private io.kubernetes.client.openapi.models.V2MetricValueStatusBuilder current;
  private java.lang.String name;

  /**
   * This method has been deprecated, please use method buildCurrent instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2MetricValueStatus getCurrent() {
    return this.current != null ? this.current.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2MetricValueStatus buildCurrent() {
    return this.current != null ? this.current.build() : null;
  }

  public A withCurrent(io.kubernetes.client.openapi.models.V2MetricValueStatus current) {
    _visitables.get("current").remove(this.current);
    if (current != null) {
      this.current = new io.kubernetes.client.openapi.models.V2MetricValueStatusBuilder(current);
      _visitables.get("current").add(this.current);
    }
    return (A) this;
  }

  public java.lang.Boolean hasCurrent() {
    return this.current != null;
  }

  public io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluent.CurrentNested<A>
      withNewCurrent() {
    return new io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluentImpl
        .CurrentNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluent.CurrentNested<A>
      withNewCurrentLike(io.kubernetes.client.openapi.models.V2MetricValueStatus item) {
    return new io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluentImpl
        .CurrentNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluent.CurrentNested<A>
      editCurrent() {
    return withNewCurrentLike(getCurrent());
  }

  public io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluent.CurrentNested<A>
      editOrNewCurrent() {
    return withNewCurrentLike(
        getCurrent() != null
            ? getCurrent()
            : new io.kubernetes.client.openapi.models.V2MetricValueStatusBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluent.CurrentNested<A>
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

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original) {
    return (A) withName(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2ResourceMetricStatusFluentImpl that = (V2ResourceMetricStatusFluentImpl) o;
    if (current != null ? !current.equals(that.current) : that.current != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(current, name, super.hashCode());
  }

  public class CurrentNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2MetricValueStatusFluentImpl<
          io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluent.CurrentNested<N>>
      implements io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluent.CurrentNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    CurrentNestedImpl(io.kubernetes.client.openapi.models.V2MetricValueStatus item) {
      this.builder = new io.kubernetes.client.openapi.models.V2MetricValueStatusBuilder(this, item);
    }

    CurrentNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2MetricValueStatusBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2MetricValueStatusBuilder builder;

    public N and() {
      return (N) V2ResourceMetricStatusFluentImpl.this.withCurrent(builder.build());
    }

    public N endCurrent() {
      return and();
    }
  }
}
