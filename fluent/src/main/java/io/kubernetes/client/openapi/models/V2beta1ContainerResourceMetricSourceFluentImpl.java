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

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V2beta1ContainerResourceMetricSourceFluentImpl<
        A extends V2beta1ContainerResourceMetricSourceFluent<A>>
    extends BaseFluent<A> implements V2beta1ContainerResourceMetricSourceFluent<A> {
  public V2beta1ContainerResourceMetricSourceFluentImpl() {}

  public V2beta1ContainerResourceMetricSourceFluentImpl(
      io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource instance) {
    this.withContainer(instance.getContainer());

    this.withName(instance.getName());

    this.withTargetAverageUtilization(instance.getTargetAverageUtilization());

    this.withTargetAverageValue(instance.getTargetAverageValue());
  }

  private String container;
  private java.lang.String name;
  private Integer targetAverageUtilization;
  private Quantity targetAverageValue;

  public java.lang.String getContainer() {
    return this.container;
  }

  public A withContainer(java.lang.String container) {
    this.container = container;
    return (A) this;
  }

  public Boolean hasContainer() {
    return this.container != null;
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

  public java.lang.Integer getTargetAverageUtilization() {
    return this.targetAverageUtilization;
  }

  public A withTargetAverageUtilization(java.lang.Integer targetAverageUtilization) {
    this.targetAverageUtilization = targetAverageUtilization;
    return (A) this;
  }

  public java.lang.Boolean hasTargetAverageUtilization() {
    return this.targetAverageUtilization != null;
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
    V2beta1ContainerResourceMetricSourceFluentImpl that =
        (V2beta1ContainerResourceMetricSourceFluentImpl) o;
    if (container != null ? !container.equals(that.container) : that.container != null)
      return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (targetAverageUtilization != null
        ? !targetAverageUtilization.equals(that.targetAverageUtilization)
        : that.targetAverageUtilization != null) return false;
    if (targetAverageValue != null
        ? !targetAverageValue.equals(that.targetAverageValue)
        : that.targetAverageValue != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        container, name, targetAverageUtilization, targetAverageValue, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (container != null) {
      sb.append("container:");
      sb.append(container + ",");
    }
    if (name != null) {
      sb.append("name:");
      sb.append(name + ",");
    }
    if (targetAverageUtilization != null) {
      sb.append("targetAverageUtilization:");
      sb.append(targetAverageUtilization + ",");
    }
    if (targetAverageValue != null) {
      sb.append("targetAverageValue:");
      sb.append(targetAverageValue);
    }
    sb.append("}");
    return sb.toString();
  }
}
