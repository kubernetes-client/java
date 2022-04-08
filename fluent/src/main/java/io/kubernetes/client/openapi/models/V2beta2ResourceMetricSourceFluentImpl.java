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
public class V2beta2ResourceMetricSourceFluentImpl<A extends V2beta2ResourceMetricSourceFluent<A>>
    extends BaseFluent<A> implements V2beta2ResourceMetricSourceFluent<A> {
  public V2beta2ResourceMetricSourceFluentImpl() {}

  public V2beta2ResourceMetricSourceFluentImpl(
      io.kubernetes.client.openapi.models.V2beta2ResourceMetricSource instance) {
    this.withName(instance.getName());

    this.withTarget(instance.getTarget());
  }

  private String name;
  private V2beta2MetricTargetBuilder target;

  public java.lang.String getName() {
    return this.name;
  }

  public A withName(java.lang.String name) {
    this.name = name;
    return (A) this;
  }

  public Boolean hasName() {
    return this.name != null;
  }

  /**
   * This method has been deprecated, please use method buildTarget instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V2beta2MetricTarget getTarget() {
    return this.target != null ? this.target.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2beta2MetricTarget buildTarget() {
    return this.target != null ? this.target.build() : null;
  }

  public A withTarget(io.kubernetes.client.openapi.models.V2beta2MetricTarget target) {
    _visitables.get("target").remove(this.target);
    if (target != null) {
      this.target = new V2beta2MetricTargetBuilder(target);
      _visitables.get("target").add(this.target);
    }
    return (A) this;
  }

  public java.lang.Boolean hasTarget() {
    return this.target != null;
  }

  public V2beta2ResourceMetricSourceFluent.TargetNested<A> withNewTarget() {
    return new V2beta2ResourceMetricSourceFluentImpl.TargetNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<A>
      withNewTargetLike(io.kubernetes.client.openapi.models.V2beta2MetricTarget item) {
    return new V2beta2ResourceMetricSourceFluentImpl.TargetNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<A>
      editTarget() {
    return withNewTargetLike(getTarget());
  }

  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<A>
      editOrNewTarget() {
    return withNewTargetLike(
        getTarget() != null
            ? getTarget()
            : new io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<A>
      editOrNewTargetLike(io.kubernetes.client.openapi.models.V2beta2MetricTarget item) {
    return withNewTargetLike(getTarget() != null ? getTarget() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta2ResourceMetricSourceFluentImpl that = (V2beta2ResourceMetricSourceFluentImpl) o;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (target != null ? !target.equals(that.target) : that.target != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(name, target, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) {
      sb.append("name:");
      sb.append(name + ",");
    }
    if (target != null) {
      sb.append("target:");
      sb.append(target);
    }
    sb.append("}");
    return sb.toString();
  }

  class TargetNestedImpl<N>
      extends V2beta2MetricTargetFluentImpl<V2beta2ResourceMetricSourceFluent.TargetNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<
              N>,
          Nested<N> {
    TargetNestedImpl(V2beta2MetricTarget item) {
      this.builder = new V2beta2MetricTargetBuilder(this, item);
    }

    TargetNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder builder;

    public N and() {
      return (N) V2beta2ResourceMetricSourceFluentImpl.this.withTarget(builder.build());
    }

    public N endTarget() {
      return and();
    }
  }
}
