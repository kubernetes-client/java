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
public class V2HPAScalingPolicyFluentImpl<
        A extends io.kubernetes.client.openapi.models.V2HPAScalingPolicyFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V2HPAScalingPolicyFluent<A> {
  public V2HPAScalingPolicyFluentImpl() {}

  public V2HPAScalingPolicyFluentImpl(
      io.kubernetes.client.openapi.models.V2HPAScalingPolicy instance) {
    this.withPeriodSeconds(instance.getPeriodSeconds());

    this.withType(instance.getType());

    this.withValue(instance.getValue());
  }

  private java.lang.Integer periodSeconds;
  private java.lang.String type;
  private java.lang.Integer value;

  public java.lang.Integer getPeriodSeconds() {
    return this.periodSeconds;
  }

  public A withPeriodSeconds(java.lang.Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
    return (A) this;
  }

  public java.lang.Boolean hasPeriodSeconds() {
    return this.periodSeconds != null;
  }

  public java.lang.String getType() {
    return this.type;
  }

  public A withType(java.lang.String type) {
    this.type = type;
    return (A) this;
  }

  public java.lang.Boolean hasType() {
    return this.type != null;
  }

  /** Method is deprecated. use withType instead. */
  @java.lang.Deprecated
  public A withNewType(java.lang.String original) {
    return (A) withType(new String(original));
  }

  public java.lang.Integer getValue() {
    return this.value;
  }

  public A withValue(java.lang.Integer value) {
    this.value = value;
    return (A) this;
  }

  public java.lang.Boolean hasValue() {
    return this.value != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2HPAScalingPolicyFluentImpl that = (V2HPAScalingPolicyFluentImpl) o;
    if (periodSeconds != null
        ? !periodSeconds.equals(that.periodSeconds)
        : that.periodSeconds != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    if (value != null ? !value.equals(that.value) : that.value != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(periodSeconds, type, value, super.hashCode());
  }
}
