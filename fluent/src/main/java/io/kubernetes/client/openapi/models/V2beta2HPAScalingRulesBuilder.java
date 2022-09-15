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

public class V2beta2HPAScalingRulesBuilder
    extends V2beta2HPAScalingRulesFluentImpl<V2beta2HPAScalingRulesBuilder>
    implements VisitableBuilder<V2beta2HPAScalingRules, V2beta2HPAScalingRulesBuilder> {
  public V2beta2HPAScalingRulesBuilder() {
    this(false);
  }

  public V2beta2HPAScalingRulesBuilder(Boolean validationEnabled) {
    this(new V2beta2HPAScalingRules(), validationEnabled);
  }

  public V2beta2HPAScalingRulesBuilder(V2beta2HPAScalingRulesFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta2HPAScalingRulesBuilder(
      V2beta2HPAScalingRulesFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V2beta2HPAScalingRules(), validationEnabled);
  }

  public V2beta2HPAScalingRulesBuilder(
      V2beta2HPAScalingRulesFluent<?> fluent, V2beta2HPAScalingRules instance) {
    this(fluent, instance, false);
  }

  public V2beta2HPAScalingRulesBuilder(
      V2beta2HPAScalingRulesFluent<?> fluent,
      V2beta2HPAScalingRules instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPolicies(instance.getPolicies());

    fluent.withSelectPolicy(instance.getSelectPolicy());

    fluent.withStabilizationWindowSeconds(instance.getStabilizationWindowSeconds());

    this.validationEnabled = validationEnabled;
  }

  public V2beta2HPAScalingRulesBuilder(V2beta2HPAScalingRules instance) {
    this(instance, false);
  }

  public V2beta2HPAScalingRulesBuilder(V2beta2HPAScalingRules instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withPolicies(instance.getPolicies());

    this.withSelectPolicy(instance.getSelectPolicy());

    this.withStabilizationWindowSeconds(instance.getStabilizationWindowSeconds());

    this.validationEnabled = validationEnabled;
  }

  V2beta2HPAScalingRulesFluent<?> fluent;
  Boolean validationEnabled;

  public V2beta2HPAScalingRules build() {
    V2beta2HPAScalingRules buildable = new V2beta2HPAScalingRules();
    buildable.setPolicies(fluent.getPolicies());
    buildable.setSelectPolicy(fluent.getSelectPolicy());
    buildable.setStabilizationWindowSeconds(fluent.getStabilizationWindowSeconds());
    return buildable;
  }
}
