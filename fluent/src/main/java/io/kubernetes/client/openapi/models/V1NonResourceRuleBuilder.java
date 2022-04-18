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

public class V1NonResourceRuleBuilder extends V1NonResourceRuleFluentImpl<V1NonResourceRuleBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1NonResourceRule, V1NonResourceRuleBuilder> {
  public V1NonResourceRuleBuilder() {
    this(false);
  }

  public V1NonResourceRuleBuilder(Boolean validationEnabled) {
    this(new V1NonResourceRule(), validationEnabled);
  }

  public V1NonResourceRuleBuilder(
      io.kubernetes.client.openapi.models.V1NonResourceRuleFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NonResourceRuleBuilder(
      io.kubernetes.client.openapi.models.V1NonResourceRuleFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1NonResourceRule(), validationEnabled);
  }

  public V1NonResourceRuleBuilder(
      io.kubernetes.client.openapi.models.V1NonResourceRuleFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NonResourceRule instance) {
    this(fluent, instance, false);
  }

  public V1NonResourceRuleBuilder(
      io.kubernetes.client.openapi.models.V1NonResourceRuleFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NonResourceRule instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withNonResourceURLs(instance.getNonResourceURLs());

    fluent.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled;
  }

  public V1NonResourceRuleBuilder(io.kubernetes.client.openapi.models.V1NonResourceRule instance) {
    this(instance, false);
  }

  public V1NonResourceRuleBuilder(
      io.kubernetes.client.openapi.models.V1NonResourceRule instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withNonResourceURLs(instance.getNonResourceURLs());

    this.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1NonResourceRuleFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1NonResourceRule build() {
    V1NonResourceRule buildable = new V1NonResourceRule();
    buildable.setNonResourceURLs(fluent.getNonResourceURLs());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
}
