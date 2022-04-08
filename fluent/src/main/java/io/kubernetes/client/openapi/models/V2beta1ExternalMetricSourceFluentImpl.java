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
public class V2beta1ExternalMetricSourceFluentImpl<A extends V2beta1ExternalMetricSourceFluent<A>>
    extends BaseFluent<A> implements V2beta1ExternalMetricSourceFluent<A> {
  public V2beta1ExternalMetricSourceFluentImpl() {}

  public V2beta1ExternalMetricSourceFluentImpl(
      io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource instance) {
    this.withMetricName(instance.getMetricName());

    this.withMetricSelector(instance.getMetricSelector());

    this.withTargetAverageValue(instance.getTargetAverageValue());

    this.withTargetValue(instance.getTargetValue());
  }

  private String metricName;
  private V1LabelSelectorBuilder metricSelector;
  private Quantity targetAverageValue;
  private io.kubernetes.client.custom.Quantity targetValue;

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

  public V2beta1ExternalMetricSourceFluent.MetricSelectorNested<A> withNewMetricSelector() {
    return new V2beta1ExternalMetricSourceFluentImpl.MetricSelectorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluent.MetricSelectorNested<
          A>
      withNewMetricSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new V2beta1ExternalMetricSourceFluentImpl.MetricSelectorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluent.MetricSelectorNested<
          A>
      editMetricSelector() {
    return withNewMetricSelectorLike(getMetricSelector());
  }

  public io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluent.MetricSelectorNested<
          A>
      editOrNewMetricSelector() {
    return withNewMetricSelectorLike(
        getMetricSelector() != null
            ? getMetricSelector()
            : new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluent.MetricSelectorNested<
          A>
      editOrNewMetricSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewMetricSelectorLike(getMetricSelector() != null ? getMetricSelector() : item);
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

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta1ExternalMetricSourceFluentImpl that = (V2beta1ExternalMetricSourceFluentImpl) o;
    if (metricName != null ? !metricName.equals(that.metricName) : that.metricName != null)
      return false;
    if (metricSelector != null
        ? !metricSelector.equals(that.metricSelector)
        : that.metricSelector != null) return false;
    if (targetAverageValue != null
        ? !targetAverageValue.equals(that.targetAverageValue)
        : that.targetAverageValue != null) return false;
    if (targetValue != null ? !targetValue.equals(that.targetValue) : that.targetValue != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        metricName, metricSelector, targetAverageValue, targetValue, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (metricName != null) {
      sb.append("metricName:");
      sb.append(metricName + ",");
    }
    if (metricSelector != null) {
      sb.append("metricSelector:");
      sb.append(metricSelector + ",");
    }
    if (targetAverageValue != null) {
      sb.append("targetAverageValue:");
      sb.append(targetAverageValue + ",");
    }
    if (targetValue != null) {
      sb.append("targetValue:");
      sb.append(targetValue);
    }
    sb.append("}");
    return sb.toString();
  }

  class MetricSelectorNestedImpl<N>
      extends V1LabelSelectorFluentImpl<V2beta1ExternalMetricSourceFluent.MetricSelectorNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluent
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
      return (N) V2beta1ExternalMetricSourceFluentImpl.this.withMetricSelector(builder.build());
    }

    public N endMetricSelector() {
      return and();
    }
  }
}
