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
public class V2MetricValueStatusFluentImpl<
        A extends io.kubernetes.client.openapi.models.V2MetricValueStatusFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V2MetricValueStatusFluent<A> {
  public V2MetricValueStatusFluentImpl() {}

  public V2MetricValueStatusFluentImpl(
      io.kubernetes.client.openapi.models.V2MetricValueStatus instance) {
    this.withAverageUtilization(instance.getAverageUtilization());

    this.withAverageValue(instance.getAverageValue());

    this.withValue(instance.getValue());
  }

  private java.lang.Integer averageUtilization;
  private io.kubernetes.client.custom.Quantity averageValue;
  private io.kubernetes.client.custom.Quantity value;

  public java.lang.Integer getAverageUtilization() {
    return this.averageUtilization;
  }

  public A withAverageUtilization(java.lang.Integer averageUtilization) {
    this.averageUtilization = averageUtilization;
    return (A) this;
  }

  public java.lang.Boolean hasAverageUtilization() {
    return this.averageUtilization != null;
  }

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

  public io.kubernetes.client.custom.Quantity getValue() {
    return this.value;
  }

  public A withValue(io.kubernetes.client.custom.Quantity value) {
    this.value = value;
    return (A) this;
  }

  public java.lang.Boolean hasValue() {
    return this.value != null;
  }

  public A withNewValue(java.lang.String value) {
    return (A) withValue(new Quantity(value));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2MetricValueStatusFluentImpl that = (V2MetricValueStatusFluentImpl) o;
    if (averageUtilization != null
        ? !averageUtilization.equals(that.averageUtilization)
        : that.averageUtilization != null) return false;
    if (averageValue != null ? !averageValue.equals(that.averageValue) : that.averageValue != null)
      return false;
    if (value != null ? !value.equals(that.value) : that.value != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(averageUtilization, averageValue, value, super.hashCode());
  }
}
