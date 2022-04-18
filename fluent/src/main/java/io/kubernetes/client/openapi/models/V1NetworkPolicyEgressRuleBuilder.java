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

public class V1NetworkPolicyEgressRuleBuilder
    extends V1NetworkPolicyEgressRuleFluentImpl<V1NetworkPolicyEgressRuleBuilder>
    implements VisitableBuilder<
        V1NetworkPolicyEgressRule,
        io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder> {
  public V1NetworkPolicyEgressRuleBuilder() {
    this(false);
  }

  public V1NetworkPolicyEgressRuleBuilder(Boolean validationEnabled) {
    this(new V1NetworkPolicyEgressRule(), validationEnabled);
  }

  public V1NetworkPolicyEgressRuleBuilder(V1NetworkPolicyEgressRuleFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NetworkPolicyEgressRuleBuilder(
      io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1NetworkPolicyEgressRule(), validationEnabled);
  }

  public V1NetworkPolicyEgressRuleBuilder(
      io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule instance) {
    this(fluent, instance, false);
  }

  public V1NetworkPolicyEgressRuleBuilder(
      io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPorts(instance.getPorts());

    fluent.withTo(instance.getTo());

    this.validationEnabled = validationEnabled;
  }

  public V1NetworkPolicyEgressRuleBuilder(
      io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule instance) {
    this(instance, false);
  }

  public V1NetworkPolicyEgressRuleBuilder(
      io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withPorts(instance.getPorts());

    this.withTo(instance.getTo());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule build() {
    V1NetworkPolicyEgressRule buildable = new V1NetworkPolicyEgressRule();
    buildable.setPorts(fluent.getPorts());
    buildable.setTo(fluent.getTo());
    return buildable;
  }
}
