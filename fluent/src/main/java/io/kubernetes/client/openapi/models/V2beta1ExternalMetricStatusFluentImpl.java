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
public class V2beta1ExternalMetricStatusFluentImpl<A extends V2beta1ExternalMetricStatusFluent<A>>
    extends BaseFluent<A> implements V2beta1ExternalMetricStatusFluent<A> {
  public V2beta1ExternalMetricStatusFluentImpl() {}

  public V2beta1ExternalMetricStatusFluentImpl(
      io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatus instance) {
    this.withCurrentAverageValue(instance.getCurrentAverageValue());

    this.withCurrentValue(instance.getCurrentValue());

    this.withMetricName(instance.getMetricName());

    this.withMetricSelector(instance.getMetricSelector());
  }

  private Quantity currentAverageValue;
  private io.kubernetes.client.custom.Quantity currentValue;
  private String metricName;
  private V1LabelSelectorBuilder metricSelector;

  public io.kubernetes.client.custom.Quantity getCurrentAverageValue() {
    return this.currentAverageValue;
  }

  public A withCurrentAverageValue(io.kubernetes.client.custom.Quantity currentAverageValue) {
    this.currentAverageValue = currentAverageValue;
    return (A) this;
  }

  public Boolean hasCurrentAverageValue() {
    return this.currentAverageValue != null;
  }

  public A withNewCurrentAverageValue(java.lang.String value) {
    return (A) withCurrentAverageValue(new Quantity(value));
  }

  public io.kubernetes.client.custom.Quantity getCurrentValue() {
    return this.currentValue;
  }

  public A withCurrentValue(io.kubernetes.client.custom.Quantity currentValue) {
    this.currentValue = currentValue;
    return (A) this;
  }

  public java.lang.Boolean hasCurrentValue() {
    return this.currentValue != null;
  }

  public A withNewCurrentValue(java.lang.String value) {
    return (A) withCurrentValue(new Quantity(value));
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

  /**
   * This method has been deprecated, please use method buildMetricSelector instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getMetricSelector() {
    return this.metricSelector != null ? this.metricSelector.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LabelSelector buildMetricSelector() {
    return this.metricSelector != null ? this.metricSelector.build() : null;
  }

  public A withMetricSelector(io.kubernetes.client.openapi.models.V1LabelSelector metricSelector) {
    _visitables.get("metricSelector").remove(this.metricSelector);
    if (metricSelector != null) {
      this.metricSelector = new V1LabelSelectorBuilder(metricSelector);
      _visitables.get("metricSelector").add(this.metricSelector);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMetricSelector() {
    return this.metricSelector != null;
  }

  public V2beta1ExternalMetricStatusFluent.MetricSelectorNested<A> withNewMetricSelector() {
    return new V2beta1ExternalMetricStatusFluentImpl.MetricSelectorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent.MetricSelectorNested<
          A>
      withNewMetricSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new V2beta1ExternalMetricStatusFluentImpl.MetricSelectorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent.MetricSelectorNested<
          A>
      editMetricSelector() {
    return withNewMetricSelectorLike(getMetricSelector());
  }

  public io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent.MetricSelectorNested<
          A>
      editOrNewMetricSelector() {
    return withNewMetricSelectorLike(
        getMetricSelector() != null
            ? getMetricSelector()
            : new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent.MetricSelectorNested<
          A>
      editOrNewMetricSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewMetricSelectorLike(getMetricSelector() != null ? getMetricSelector() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta1ExternalMetricStatusFluentImpl that = (V2beta1ExternalMetricStatusFluentImpl) o;
    if (currentAverageValue != null
        ? !currentAverageValue.equals(that.currentAverageValue)
        : that.currentAverageValue != null) return false;
    if (currentValue != null ? !currentValue.equals(that.currentValue) : that.currentValue != null)
      return false;
    if (metricName != null ? !metricName.equals(that.metricName) : that.metricName != null)
      return false;
    if (metricSelector != null
        ? !metricSelector.equals(that.metricSelector)
        : that.metricSelector != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        currentAverageValue, currentValue, metricName, metricSelector, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (currentAverageValue != null) {
      sb.append("currentAverageValue:");
      sb.append(currentAverageValue + ",");
    }
    if (currentValue != null) {
      sb.append("currentValue:");
      sb.append(currentValue + ",");
    }
    if (metricName != null) {
      sb.append("metricName:");
      sb.append(metricName + ",");
    }
    if (metricSelector != null) {
      sb.append("metricSelector:");
      sb.append(metricSelector);
    }
    sb.append("}");
    return sb.toString();
  }

  class MetricSelectorNestedImpl<N>
      extends V1LabelSelectorFluentImpl<V2beta1ExternalMetricStatusFluent.MetricSelectorNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent
                  .MetricSelectorNested<
              N>,
          Nested<N> {
    MetricSelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }

    MetricSelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

    public N and() {
      return (N) V2beta1ExternalMetricStatusFluentImpl.this.withMetricSelector(builder.build());
    }

    public N endMetricSelector() {
      return and();
    }
  }
}
