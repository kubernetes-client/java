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

public class V2HPAScalingPolicyBuilder
    extends io.kubernetes.client.openapi.models.V2HPAScalingPolicyFluentImpl<
        io.kubernetes.client.openapi.models.V2HPAScalingPolicyBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V2HPAScalingPolicy,
        io.kubernetes.client.openapi.models.V2HPAScalingPolicyBuilder> {
  public V2HPAScalingPolicyBuilder() {
    this(false);
  }

  public V2HPAScalingPolicyBuilder(java.lang.Boolean validationEnabled) {
    this(new V2HPAScalingPolicy(), validationEnabled);
  }

  public V2HPAScalingPolicyBuilder(
      io.kubernetes.client.openapi.models.V2HPAScalingPolicyFluent<?> fluent) {
    this(fluent, false);
  }

  public V2HPAScalingPolicyBuilder(
      io.kubernetes.client.openapi.models.V2HPAScalingPolicyFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2HPAScalingPolicy(), validationEnabled);
  }

  public V2HPAScalingPolicyBuilder(
      io.kubernetes.client.openapi.models.V2HPAScalingPolicyFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2HPAScalingPolicy instance) {
    this(fluent, instance, false);
  }

  public V2HPAScalingPolicyBuilder(
      io.kubernetes.client.openapi.models.V2HPAScalingPolicyFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2HPAScalingPolicy instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPeriodSeconds(instance.getPeriodSeconds());

    fluent.withType(instance.getType());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  public V2HPAScalingPolicyBuilder(
      io.kubernetes.client.openapi.models.V2HPAScalingPolicy instance) {
    this(instance, false);
  }

  public V2HPAScalingPolicyBuilder(
      io.kubernetes.client.openapi.models.V2HPAScalingPolicy instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withPeriodSeconds(instance.getPeriodSeconds());

    this.withType(instance.getType());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2HPAScalingPolicyFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2HPAScalingPolicy build() {
    V2HPAScalingPolicy buildable = new V2HPAScalingPolicy();
    buildable.setPeriodSeconds(fluent.getPeriodSeconds());
    buildable.setType(fluent.getType());
    buildable.setValue(fluent.getValue());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2HPAScalingPolicyBuilder that = (V2HPAScalingPolicyBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
