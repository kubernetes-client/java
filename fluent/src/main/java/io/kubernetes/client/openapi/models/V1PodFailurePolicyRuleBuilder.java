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

public class V1PodFailurePolicyRuleBuilder
    extends V1PodFailurePolicyRuleFluentImpl<V1PodFailurePolicyRuleBuilder>
    implements VisitableBuilder<V1PodFailurePolicyRule, V1PodFailurePolicyRuleBuilder> {
  public V1PodFailurePolicyRuleBuilder() {
    this(false);
  }

  public V1PodFailurePolicyRuleBuilder(Boolean validationEnabled) {
    this(new V1PodFailurePolicyRule(), validationEnabled);
  }

  public V1PodFailurePolicyRuleBuilder(V1PodFailurePolicyRuleFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PodFailurePolicyRuleBuilder(
      V1PodFailurePolicyRuleFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1PodFailurePolicyRule(), validationEnabled);
  }

  public V1PodFailurePolicyRuleBuilder(
      V1PodFailurePolicyRuleFluent<?> fluent, V1PodFailurePolicyRule instance) {
    this(fluent, instance, false);
  }

  public V1PodFailurePolicyRuleBuilder(
      V1PodFailurePolicyRuleFluent<?> fluent,
      V1PodFailurePolicyRule instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAction(instance.getAction());

    fluent.withOnExitCodes(instance.getOnExitCodes());

    fluent.withOnPodConditions(instance.getOnPodConditions());

    this.validationEnabled = validationEnabled;
  }

  public V1PodFailurePolicyRuleBuilder(V1PodFailurePolicyRule instance) {
    this(instance, false);
  }

  public V1PodFailurePolicyRuleBuilder(V1PodFailurePolicyRule instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withAction(instance.getAction());

    this.withOnExitCodes(instance.getOnExitCodes());

    this.withOnPodConditions(instance.getOnPodConditions());

    this.validationEnabled = validationEnabled;
  }

  V1PodFailurePolicyRuleFluent<?> fluent;
  Boolean validationEnabled;

  public V1PodFailurePolicyRule build() {
    V1PodFailurePolicyRule buildable = new V1PodFailurePolicyRule();
    buildable.setAction(fluent.getAction());
    buildable.setOnExitCodes(fluent.getOnExitCodes());
    buildable.setOnPodConditions(fluent.getOnPodConditions());
    return buildable;
  }
}
