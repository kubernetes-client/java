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
public class V2beta1PodsMetricStatusFluentImpl<
        A extends io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent<A> {
  public V2beta1PodsMetricStatusFluentImpl() {}

  public V2beta1PodsMetricStatusFluentImpl(
      io.kubernetes.client.openapi.models.V2beta1PodsMetricStatus instance) {
    this.withCurrentAverageValue(instance.getCurrentAverageValue());

    this.withMetricName(instance.getMetricName());

    this.withSelector(instance.getSelector());
  }

  private io.kubernetes.client.custom.Quantity currentAverageValue;
  private java.lang.String metricName;
  private io.kubernetes.client.openapi.models.V1LabelSelectorBuilder selector;

  public io.kubernetes.client.custom.Quantity getCurrentAverageValue() {
    return this.currentAverageValue;
  }

  public A withCurrentAverageValue(io.kubernetes.client.custom.Quantity currentAverageValue) {
    this.currentAverageValue = currentAverageValue;
    return (A) this;
  }

  public java.lang.Boolean hasCurrentAverageValue() {
    return this.currentAverageValue != null;
  }

  public A withNewCurrentAverageValue(java.lang.String value) {
    return (A) withCurrentAverageValue(new Quantity(value));
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

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A>
      withNewSelector() {
    return new io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluentImpl
        .SelectorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A>
      withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluentImpl
        .SelectorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A>
      editSelector() {
    return withNewSelectorLike(getSelector());
  }

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A>
      editOrNewSelector() {
    return withNewSelectorLike(
        getSelector() != null
            ? getSelector()
            : new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A>
      editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewSelectorLike(getSelector() != null ? getSelector() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta1PodsMetricStatusFluentImpl that = (V2beta1PodsMetricStatusFluentImpl) o;
    if (currentAverageValue != null
        ? !currentAverageValue.equals(that.currentAverageValue)
        : that.currentAverageValue != null) return false;
    if (metricName != null ? !metricName.equals(that.metricName) : that.metricName != null)
      return false;
    if (selector != null ? !selector.equals(that.selector) : that.selector != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(currentAverageValue, metricName, selector, super.hashCode());
  }

  public class SelectorNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<
          io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<
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
      return (N) V2beta1PodsMetricStatusFluentImpl.this.withSelector(builder.build());
    }

    public N endSelector() {
      return and();
    }
  }
}
