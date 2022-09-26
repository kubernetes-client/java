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

public class V1AggregationRuleBuilder extends V1AggregationRuleFluentImpl<V1AggregationRuleBuilder>
    implements VisitableBuilder<V1AggregationRule, V1AggregationRuleBuilder> {
  public V1AggregationRuleBuilder() {
    this(false);
  }

  public V1AggregationRuleBuilder(Boolean validationEnabled) {
    this(new V1AggregationRule(), validationEnabled);
  }

  public V1AggregationRuleBuilder(V1AggregationRuleFluent<?> fluent) {
    this(fluent, false);
  }

  public V1AggregationRuleBuilder(V1AggregationRuleFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1AggregationRule(), validationEnabled);
  }

  public V1AggregationRuleBuilder(V1AggregationRuleFluent<?> fluent, V1AggregationRule instance) {
    this(fluent, instance, false);
  }

  public V1AggregationRuleBuilder(
      V1AggregationRuleFluent<?> fluent, V1AggregationRule instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withClusterRoleSelectors(instance.getClusterRoleSelectors());

    this.validationEnabled = validationEnabled;
  }

  public V1AggregationRuleBuilder(V1AggregationRule instance) {
    this(instance, false);
  }

  public V1AggregationRuleBuilder(V1AggregationRule instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withClusterRoleSelectors(instance.getClusterRoleSelectors());

    this.validationEnabled = validationEnabled;
  }

  V1AggregationRuleFluent<?> fluent;
  Boolean validationEnabled;

  public V1AggregationRule build() {
    V1AggregationRule buildable = new V1AggregationRule();
    buildable.setClusterRoleSelectors(fluent.getClusterRoleSelectors());
    return buildable;
  }
}
