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

public class V1ValidationRuleBuilder extends V1ValidationRuleFluentImpl<V1ValidationRuleBuilder>
    implements VisitableBuilder<V1ValidationRule, V1ValidationRuleBuilder> {
  public V1ValidationRuleBuilder() {
    this(false);
  }

  public V1ValidationRuleBuilder(Boolean validationEnabled) {
    this(new V1ValidationRule(), validationEnabled);
  }

  public V1ValidationRuleBuilder(V1ValidationRuleFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ValidationRuleBuilder(V1ValidationRuleFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ValidationRule(), validationEnabled);
  }

  public V1ValidationRuleBuilder(V1ValidationRuleFluent<?> fluent, V1ValidationRule instance) {
    this(fluent, instance, false);
  }

  public V1ValidationRuleBuilder(
      V1ValidationRuleFluent<?> fluent, V1ValidationRule instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMessage(instance.getMessage());

    fluent.withRule(instance.getRule());

    this.validationEnabled = validationEnabled;
  }

  public V1ValidationRuleBuilder(V1ValidationRule instance) {
    this(instance, false);
  }

  public V1ValidationRuleBuilder(V1ValidationRule instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withMessage(instance.getMessage());

    this.withRule(instance.getRule());

    this.validationEnabled = validationEnabled;
  }

  V1ValidationRuleFluent<?> fluent;
  Boolean validationEnabled;

  public V1ValidationRule build() {
    V1ValidationRule buildable = new V1ValidationRule();
    buildable.setMessage(fluent.getMessage());
    buildable.setRule(fluent.getRule());
    return buildable;
  }
}
