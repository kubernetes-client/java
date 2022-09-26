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

import io.kubernetes.client.fluent.VisitableBuilder;

public class V2beta2HPAScalingPolicyBuilder
    extends V2beta2HPAScalingPolicyFluentImpl<V2beta2HPAScalingPolicyBuilder>
    implements VisitableBuilder<V2beta2HPAScalingPolicy, V2beta2HPAScalingPolicyBuilder> {
  public V2beta2HPAScalingPolicyBuilder() {
    this(false);
  }

  public V2beta2HPAScalingPolicyBuilder(Boolean validationEnabled) {
    this(new V2beta2HPAScalingPolicy(), validationEnabled);
  }

  public V2beta2HPAScalingPolicyBuilder(V2beta2HPAScalingPolicyFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta2HPAScalingPolicyBuilder(
      V2beta2HPAScalingPolicyFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V2beta2HPAScalingPolicy(), validationEnabled);
  }

  public V2beta2HPAScalingPolicyBuilder(
      V2beta2HPAScalingPolicyFluent<?> fluent, V2beta2HPAScalingPolicy instance) {
    this(fluent, instance, false);
  }

  public V2beta2HPAScalingPolicyBuilder(
      V2beta2HPAScalingPolicyFluent<?> fluent,
      V2beta2HPAScalingPolicy instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPeriodSeconds(instance.getPeriodSeconds());

    fluent.withType(instance.getType());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  public V2beta2HPAScalingPolicyBuilder(V2beta2HPAScalingPolicy instance) {
    this(instance, false);
  }

  public V2beta2HPAScalingPolicyBuilder(
      V2beta2HPAScalingPolicy instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withPeriodSeconds(instance.getPeriodSeconds());

    this.withType(instance.getType());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  V2beta2HPAScalingPolicyFluent<?> fluent;
  Boolean validationEnabled;

  public V2beta2HPAScalingPolicy build() {
    V2beta2HPAScalingPolicy buildable = new V2beta2HPAScalingPolicy();
    buildable.setPeriodSeconds(fluent.getPeriodSeconds());
    buildable.setType(fluent.getType());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
}
