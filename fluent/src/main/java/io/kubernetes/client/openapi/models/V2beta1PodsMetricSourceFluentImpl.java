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
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V2beta1PodsMetricSourceFluentImpl<A extends V2beta1PodsMetricSourceFluent<A>>
    extends BaseFluent<A> implements V2beta1PodsMetricSourceFluent<A> {
  public V2beta1PodsMetricSourceFluentImpl() {}

  public V2beta1PodsMetricSourceFluentImpl(
      io.kubernetes.client.openapi.models.V2beta1PodsMetricSource instance) {
    this.withMetricName(instance.getMetricName());

    this.withSelector(instance.getSelector());

    this.withTargetAverageValue(instance.getTargetAverageValue());
  }

  private String metricName;
  private V1LabelSelectorBuilder selector;
  private Quantity targetAverageValue;

  public java.lang.String getMetricName() {
    return this.metricName;
  }

  public A withMetricName(java.lang.String metricName) {
    this.metricName = metricName;
    return (A) this;
  }

  public Boolean hasMetricName() {
    return this.metricName != null;
  }

  /**
   * This method has been deprecated, please use method buildSelector instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getSelector() {
    return this.selector != null ? this.selector.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector() {
    return this.selector != null ? this.selector.build() : null;
  }

  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector) {
    _visitables.get("selector").remove(this.selector);
    if (selector != null) {
      this.selector = new V1LabelSelectorBuilder(selector);
      _visitables.get("selector").add(this.selector);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSelector() {
    return this.selector != null;
  }

  public V2beta1PodsMetricSourceFluent.SelectorNested<A> withNewSelector() {
    return new V2beta1PodsMetricSourceFluentImpl.SelectorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent.SelectorNested<A>
      withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new V2beta1PodsMetricSourceFluentImpl.SelectorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent.SelectorNested<A>
      editSelector() {
    return withNewSelectorLike(getSelector());
  }

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent.SelectorNested<A>
      editOrNewSelector() {
    return withNewSelectorLike(
        getSelector() != null
            ? getSelector()
            : new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent.SelectorNested<A>
      editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewSelectorLike(getSelector() != null ? getSelector() : item);
  }

  public io.kubernetes.client.custom.Quantity getTargetAverageValue() {
    return this.targetAverageValue;
  }

  public A withTargetAverageValue(io.kubernetes.client.custom.Quantity targetAverageValue) {
    this.targetAverageValue = targetAverageValue;
    return (A) this;
  }

  public java.lang.Boolean hasTargetAverageValue() {
    return this.targetAverageValue != null;
  }

  public A withNewTargetAverageValue(java.lang.String value) {
    return (A) withTargetAverageValue(new Quantity(value));
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta1PodsMetricSourceFluentImpl that = (V2beta1PodsMetricSourceFluentImpl) o;
    if (metricName != null ? !metricName.equals(that.metricName) : that.metricName != null)
      return false;
    if (selector != null ? !selector.equals(that.selector) : that.selector != null) return false;
    if (targetAverageValue != null
        ? !targetAverageValue.equals(that.targetAverageValue)
        : that.targetAverageValue != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(metricName, selector, targetAverageValue, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (metricName != null) {
      sb.append("metricName:");
      sb.append(metricName + ",");
    }
    if (selector != null) {
      sb.append("selector:");
      sb.append(selector + ",");
    }
    if (targetAverageValue != null) {
      sb.append("targetAverageValue:");
      sb.append(targetAverageValue);
    }
    sb.append("}");
    return sb.toString();
  }

  class SelectorNestedImpl<N>
      extends V1LabelSelectorFluentImpl<V2beta1PodsMetricSourceFluent.SelectorNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent.SelectorNested<
              N>,
          Nested<N> {
    SelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }

    SelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

    public N and() {
      return (N) V2beta1PodsMetricSourceFluentImpl.this.withSelector(builder.build());
    }

    public N endSelector() {
      return and();
    }
  }
}
