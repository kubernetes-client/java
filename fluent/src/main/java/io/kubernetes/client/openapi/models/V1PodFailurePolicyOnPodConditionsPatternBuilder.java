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

public class V1PodFailurePolicyOnPodConditionsPatternBuilder
    extends V1PodFailurePolicyOnPodConditionsPatternFluentImpl<
        V1PodFailurePolicyOnPodConditionsPatternBuilder>
    implements VisitableBuilder<
        V1PodFailurePolicyOnPodConditionsPattern, V1PodFailurePolicyOnPodConditionsPatternBuilder> {
  public V1PodFailurePolicyOnPodConditionsPatternBuilder() {
    this(false);
  }

  public V1PodFailurePolicyOnPodConditionsPatternBuilder(Boolean validationEnabled) {
    this(new V1PodFailurePolicyOnPodConditionsPattern(), validationEnabled);
  }

  public V1PodFailurePolicyOnPodConditionsPatternBuilder(
      V1PodFailurePolicyOnPodConditionsPatternFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PodFailurePolicyOnPodConditionsPatternBuilder(
      V1PodFailurePolicyOnPodConditionsPatternFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1PodFailurePolicyOnPodConditionsPattern(), validationEnabled);
  }

  public V1PodFailurePolicyOnPodConditionsPatternBuilder(
      V1PodFailurePolicyOnPodConditionsPatternFluent<?> fluent,
      V1PodFailurePolicyOnPodConditionsPattern instance) {
    this(fluent, instance, false);
  }

  public V1PodFailurePolicyOnPodConditionsPatternBuilder(
      V1PodFailurePolicyOnPodConditionsPatternFluent<?> fluent,
      V1PodFailurePolicyOnPodConditionsPattern instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1PodFailurePolicyOnPodConditionsPatternBuilder(
      V1PodFailurePolicyOnPodConditionsPattern instance) {
    this(instance, false);
  }

  public V1PodFailurePolicyOnPodConditionsPatternBuilder(
      V1PodFailurePolicyOnPodConditionsPattern instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  V1PodFailurePolicyOnPodConditionsPatternFluent<?> fluent;
  Boolean validationEnabled;

  public V1PodFailurePolicyOnPodConditionsPattern build() {
    V1PodFailurePolicyOnPodConditionsPattern buildable =
        new V1PodFailurePolicyOnPodConditionsPattern();
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
}
