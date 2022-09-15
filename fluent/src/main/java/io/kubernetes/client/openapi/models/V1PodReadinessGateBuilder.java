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

public class V1PodReadinessGateBuilder
    extends V1PodReadinessGateFluentImpl<V1PodReadinessGateBuilder>
    implements VisitableBuilder<V1PodReadinessGate, V1PodReadinessGateBuilder> {
  public V1PodReadinessGateBuilder() {
    this(false);
  }

  public V1PodReadinessGateBuilder(Boolean validationEnabled) {
    this(new V1PodReadinessGate(), validationEnabled);
  }

  public V1PodReadinessGateBuilder(V1PodReadinessGateFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PodReadinessGateBuilder(V1PodReadinessGateFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1PodReadinessGate(), validationEnabled);
  }

  public V1PodReadinessGateBuilder(
      V1PodReadinessGateFluent<?> fluent, V1PodReadinessGate instance) {
    this(fluent, instance, false);
  }

  public V1PodReadinessGateBuilder(
      V1PodReadinessGateFluent<?> fluent, V1PodReadinessGate instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withConditionType(instance.getConditionType());

    this.validationEnabled = validationEnabled;
  }

  public V1PodReadinessGateBuilder(V1PodReadinessGate instance) {
    this(instance, false);
  }

  public V1PodReadinessGateBuilder(V1PodReadinessGate instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withConditionType(instance.getConditionType());

    this.validationEnabled = validationEnabled;
  }

  V1PodReadinessGateFluent<?> fluent;
  Boolean validationEnabled;

  public V1PodReadinessGate build() {
    V1PodReadinessGate buildable = new V1PodReadinessGate();
    buildable.setConditionType(fluent.getConditionType());
    return buildable;
  }
}
