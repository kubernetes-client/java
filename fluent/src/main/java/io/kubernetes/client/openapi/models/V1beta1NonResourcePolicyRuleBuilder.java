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

public class V1beta1NonResourcePolicyRuleBuilder
    extends V1beta1NonResourcePolicyRuleFluentImpl<V1beta1NonResourcePolicyRuleBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule,
        io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRuleBuilder> {
  public V1beta1NonResourcePolicyRuleBuilder() {
    this(false);
  }

  public V1beta1NonResourcePolicyRuleBuilder(Boolean validationEnabled) {
    this(new V1beta1NonResourcePolicyRule(), validationEnabled);
  }

  public V1beta1NonResourcePolicyRuleBuilder(V1beta1NonResourcePolicyRuleFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1NonResourcePolicyRuleBuilder(
      io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRuleFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1NonResourcePolicyRule(), validationEnabled);
  }

  public V1beta1NonResourcePolicyRuleBuilder(
      io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRuleFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule instance) {
    this(fluent, instance, false);
  }

  public V1beta1NonResourcePolicyRuleBuilder(
      io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRuleFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withNonResourceURLs(instance.getNonResourceURLs());

    fluent.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1NonResourcePolicyRuleBuilder(
      io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule instance) {
    this(instance, false);
  }

  public V1beta1NonResourcePolicyRuleBuilder(
      io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withNonResourceURLs(instance.getNonResourceURLs());

    this.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRuleFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule build() {
    V1beta1NonResourcePolicyRule buildable = new V1beta1NonResourcePolicyRule();
    buildable.setNonResourceURLs(fluent.getNonResourceURLs());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
}
