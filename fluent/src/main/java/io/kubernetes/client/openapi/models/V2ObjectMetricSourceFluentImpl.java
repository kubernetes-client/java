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
public class V2ObjectMetricSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent<A> {
  public V2ObjectMetricSourceFluentImpl() {}

  public V2ObjectMetricSourceFluentImpl(
      io.kubernetes.client.openapi.models.V2ObjectMetricSource instance) {
    this.withDescribedObject(instance.getDescribedObject());

    this.withMetric(instance.getMetric());

    this.withTarget(instance.getTarget());
  }

  private io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceBuilder describedObject;
  private io.kubernetes.client.openapi.models.V2MetricIdentifierBuilder metric;
  private io.kubernetes.client.openapi.models.V2MetricTargetBuilder target;

  /**
   * This method has been deprecated, please use method buildDescribedObject instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2CrossVersionObjectReference getDescribedObject() {
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

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.DescribedObjectNested<A>
      withNewDescribedObject() {
    return new io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluentImpl
        .DescribedObjectNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.DescribedObjectNested<A>
      withNewDescribedObjectLike(
          io.kubernetes.client.openapi.models.V2CrossVersionObjectReference item) {
    return new io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluentImpl
        .DescribedObjectNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.DescribedObjectNested<A>
      editDescribedObject() {
    return withNewDescribedObjectLike(getDescribedObject());
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.DescribedObjectNested<A>
      editOrNewDescribedObject() {
    return withNewDescribedObjectLike(
        getDescribedObject() != null
            ? getDescribedObject()
            : new io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.DescribedObjectNested<A>
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
  public io.kubernetes.client.openapi.models.V2MetricIdentifier getMetric() {
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

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.MetricNested<A>
      withNewMetric() {
    return new io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluentImpl
        .MetricNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.MetricNested<A>
      withNewMetricLike(io.kubernetes.client.openapi.models.V2MetricIdentifier item) {
    return new io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluentImpl.MetricNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.MetricNested<A>
      editMetric() {
    return withNewMetricLike(getMetric());
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.MetricNested<A>
      editOrNewMetric() {
    return withNewMetricLike(
        getMetric() != null
            ? getMetric()
            : new io.kubernetes.client.openapi.models.V2MetricIdentifierBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.MetricNested<A>
      editOrNewMetricLike(io.kubernetes.client.openapi.models.V2MetricIdentifier item) {
    return withNewMetricLike(getMetric() != null ? getMetric() : item);
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

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.TargetNested<A>
      withNewTarget() {
    return new io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluentImpl
        .TargetNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.TargetNested<A>
      withNewTargetLike(io.kubernetes.client.openapi.models.V2MetricTarget item) {
    return new io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluentImpl.TargetNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.TargetNested<A>
      editTarget() {
    return withNewTargetLike(getTarget());
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.TargetNested<A>
      editOrNewTarget() {
    return withNewTargetLike(
        getTarget() != null
            ? getTarget()
            : new io.kubernetes.client.openapi.models.V2MetricTargetBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.TargetNested<A>
      editOrNewTargetLike(io.kubernetes.client.openapi.models.V2MetricTarget item) {
    return withNewTargetLike(getTarget() != null ? getTarget() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2ObjectMetricSourceFluentImpl that = (V2ObjectMetricSourceFluentImpl) o;
    if (describedObject != null
        ? !describedObject.equals(that.describedObject)
        : that.describedObject != null) return false;
    if (metric != null ? !metric.equals(that.metric) : that.metric != null) return false;
    if (target != null ? !target.equals(that.target) : that.target != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(describedObject, metric, target, super.hashCode());
  }

  public class DescribedObjectNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.DescribedObjectNested<N>>
      implements io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent
                  .DescribedObjectNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    DescribedObjectNestedImpl(
        io.kubernetes.client.openapi.models.V2CrossVersionObjectReference item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceBuilder(this, item);
    }

    DescribedObjectNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceBuilder builder;

    public N and() {
      return (N) V2ObjectMetricSourceFluentImpl.this.withDescribedObject(builder.build());
    }

    public N endDescribedObject() {
      return and();
    }
  }

  public class MetricNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2MetricIdentifierFluentImpl<
          io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.MetricNested<N>>
      implements io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.MetricNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetricNestedImpl(io.kubernetes.client.openapi.models.V2MetricIdentifier item) {
      this.builder = new io.kubernetes.client.openapi.models.V2MetricIdentifierBuilder(this, item);
    }

    MetricNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2MetricIdentifierBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2MetricIdentifierBuilder builder;

    public N and() {
      return (N) V2ObjectMetricSourceFluentImpl.this.withMetric(builder.build());
    }

    public N endMetric() {
      return and();
    }
  }

  public class TargetNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2MetricTargetFluentImpl<
          io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.TargetNested<N>>
      implements io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.TargetNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    TargetNestedImpl(io.kubernetes.client.openapi.models.V2MetricTarget item) {
      this.builder = new io.kubernetes.client.openapi.models.V2MetricTargetBuilder(this, item);
    }

    TargetNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2MetricTargetBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2MetricTargetBuilder builder;

    public N and() {
      return (N) V2ObjectMetricSourceFluentImpl.this.withTarget(builder.build());
    }

    public N endTarget() {
      return and();
    }
  }
}
