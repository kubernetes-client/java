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
public class V2ResourceMetricSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent<A> {
  public V2ResourceMetricSourceFluentImpl() {}

  public V2ResourceMetricSourceFluentImpl(
      io.kubernetes.client.openapi.models.V2ResourceMetricSource instance) {
    this.withName(instance.getName());

    this.withTarget(instance.getTarget());
  }

  private java.lang.String name;
  private io.kubernetes.client.openapi.models.V2MetricTargetBuilder target;

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

  /**
   * This method has been deprecated, please use method buildTarget instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2MetricTarget getTarget() {
    return this.target != null ? this.target.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2MetricTarget buildTarget() {
    return this.target != null ? this.target.build() : null;
  }

  public A withTarget(io.kubernetes.client.openapi.models.V2MetricTarget target) {
    _visitables.get("target").remove(this.target);
    if (target != null) {
      this.target = new io.kubernetes.client.openapi.models.V2MetricTargetBuilder(target);
      _visitables.get("target").add(this.target);
    }
    return (A) this;
  }

  public java.lang.Boolean hasTarget() {
    return this.target != null;
  }

  public io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent.TargetNested<A>
      withNewTarget() {
    return new io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluentImpl
        .TargetNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent.TargetNested<A>
      withNewTargetLike(io.kubernetes.client.openapi.models.V2MetricTarget item) {
    return new io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluentImpl
        .TargetNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent.TargetNested<A>
      editTarget() {
    return withNewTargetLike(getTarget());
  }

  public io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent.TargetNested<A>
      editOrNewTarget() {
    return withNewTargetLike(
        getTarget() != null
            ? getTarget()
            : new io.kubernetes.client.openapi.models.V2MetricTargetBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent.TargetNested<A>
      editOrNewTargetLike(io.kubernetes.client.openapi.models.V2MetricTarget item) {
    return withNewTargetLike(getTarget() != null ? getTarget() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2ResourceMetricSourceFluentImpl that = (V2ResourceMetricSourceFluentImpl) o;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (target != null ? !target.equals(that.target) : that.target != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(name, target, super.hashCode());
  }

  public class TargetNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2MetricTargetFluentImpl<
          io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent.TargetNested<N>>
      implements io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent.TargetNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    TargetNestedImpl(io.kubernetes.client.openapi.models.V2MetricTarget item) {
      this.builder = new io.kubernetes.client.openapi.models.V2MetricTargetBuilder(this, item);
    }

    TargetNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2MetricTargetBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2MetricTargetBuilder builder;

    public N and() {
      return (N) V2ResourceMetricSourceFluentImpl.this.withTarget(builder.build());
    }

    public N endTarget() {
      return and();
    }
  }
}
