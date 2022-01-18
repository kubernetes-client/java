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

import io.kubernetes.client.custom.Quantity;

/** Generated */
public class V2beta1ObjectMetricSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent<A> {
  public V2beta1ObjectMetricSourceFluentImpl() {}

  public V2beta1ObjectMetricSourceFluentImpl(
      io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource instance) {
    this.withAverageValue(instance.getAverageValue());

    this.withMetricName(instance.getMetricName());

    this.withSelector(instance.getSelector());

    this.withTarget(instance.getTarget());

    this.withTargetValue(instance.getTargetValue());
  }

  private io.kubernetes.client.custom.Quantity averageValue;
  private java.lang.String metricName;
  private io.kubernetes.client.openapi.models.V1LabelSelectorBuilder selector;
  private io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceBuilder target;
  private io.kubernetes.client.custom.Quantity targetValue;

  public io.kubernetes.client.custom.Quantity getAverageValue() {
    return this.averageValue;
  }

  public A withAverageValue(io.kubernetes.client.custom.Quantity averageValue) {
    this.averageValue = averageValue;
    return (A) this;
  }

  public java.lang.Boolean hasAverageValue() {
    return this.averageValue != null;
  }

  public A withNewAverageValue(java.lang.String value) {
    return (A) withAverageValue(new Quantity(value));
  }

  public java.lang.String getMetricName() {
    return this.metricName;
  }

  public A withMetricName(java.lang.String metricName) {
    this.metricName = metricName;
    return (A) this;
  }

  public java.lang.Boolean hasMetricName() {
    return this.metricName != null;
  }

  /** Method is deprecated. use withMetricName instead. */
  @java.lang.Deprecated
  public A withNewMetricName(java.lang.String original) {
    return (A) withMetricName(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getSelector() {
    return this.selector != null ? this.selector.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector() {
    return this.selector != null ? this.selector.build() : null;
  }

  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector) {
    _visitables.get("selector").remove(this.selector);
    if (selector != null) {
      this.selector = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(selector);
      _visitables.get("selector").add(this.selector);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSelector() {
    return this.selector != null;
  }

  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent.SelectorNested<A>
      withNewSelector() {
    return new io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluentImpl
        .SelectorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent.SelectorNested<A>
      withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluentImpl
        .SelectorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent.SelectorNested<A>
      editSelector() {
    return withNewSelectorLike(getSelector());
  }

  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent.SelectorNested<A>
      editOrNewSelector() {
    return withNewSelectorLike(
        getSelector() != null
            ? getSelector()
            : new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent.SelectorNested<A>
      editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewSelectorLike(getSelector() != null ? getSelector() : item);
  }

  /**
   * This method has been deprecated, please use method buildTarget instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference getTarget() {
    return this.target != null ? this.target.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference buildTarget() {
    return this.target != null ? this.target.build() : null;
  }

  public A withTarget(
      io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference target) {
    _visitables.get("target").remove(this.target);
    if (target != null) {
      this.target =
          new io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceBuilder(target);
      _visitables.get("target").add(this.target);
    }
    return (A) this;
  }

  public java.lang.Boolean hasTarget() {
    return this.target != null;
  }

  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent.TargetNested<A>
      withNewTarget() {
    return new io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluentImpl
        .TargetNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent.TargetNested<A>
      withNewTargetLike(
          io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference item) {
    return new io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluentImpl
        .TargetNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent.TargetNested<A>
      editTarget() {
    return withNewTargetLike(getTarget());
  }

  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent.TargetNested<A>
      editOrNewTarget() {
    return withNewTargetLike(
        getTarget() != null
            ? getTarget()
            : new io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent.TargetNested<A>
      editOrNewTargetLike(
          io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference item) {
    return withNewTargetLike(getTarget() != null ? getTarget() : item);
  }

  public io.kubernetes.client.custom.Quantity getTargetValue() {
    return this.targetValue;
  }

  public A withTargetValue(io.kubernetes.client.custom.Quantity targetValue) {
    this.targetValue = targetValue;
    return (A) this;
  }

  public java.lang.Boolean hasTargetValue() {
    return this.targetValue != null;
  }

  public A withNewTargetValue(java.lang.String value) {
    return (A) withTargetValue(new Quantity(value));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta1ObjectMetricSourceFluentImpl that = (V2beta1ObjectMetricSourceFluentImpl) o;
    if (averageValue != null ? !averageValue.equals(that.averageValue) : that.averageValue != null)
      return false;
    if (metricName != null ? !metricName.equals(that.metricName) : that.metricName != null)
      return false;
    if (selector != null ? !selector.equals(that.selector) : that.selector != null) return false;
    if (target != null ? !target.equals(that.target) : that.target != null) return false;
    if (targetValue != null ? !targetValue.equals(that.targetValue) : that.targetValue != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        averageValue, metricName, selector, target, targetValue, super.hashCode());
  }

  public class SelectorNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<
          io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent.SelectorNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent.SelectorNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    SelectorNestedImpl(io.kubernetes.client.openapi.models.V1LabelSelector item) {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this, item);
    }

    SelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

    public N and() {
      return (N) V2beta1ObjectMetricSourceFluentImpl.this.withSelector(builder.build());
    }

    public N endSelector() {
      return and();
    }
  }

  public class TargetNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent.TargetNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent.TargetNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    TargetNestedImpl(io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceBuilder(
              this, item);
    }

    TargetNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceBuilder builder;

    public N and() {
      return (N) V2beta1ObjectMetricSourceFluentImpl.this.withTarget(builder.build());
    }

    public N endTarget() {
      return and();
    }
  }
}
