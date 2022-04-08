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

public class V1PolicyRuleBuilder extends V1PolicyRuleFluentImpl<V1PolicyRuleBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1PolicyRule, V1PolicyRuleBuilder> {
  public V1PolicyRuleBuilder() {
    this(false);
  }

  public V1PolicyRuleBuilder(Boolean validationEnabled) {
    this(new V1PolicyRule(), validationEnabled);
  }

  public V1PolicyRuleBuilder(io.kubernetes.client.openapi.models.V1PolicyRuleFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PolicyRuleBuilder(
      io.kubernetes.client.openapi.models.V1PolicyRuleFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1PolicyRule(), validationEnabled);
  }

  public V1PolicyRuleBuilder(
      io.kubernetes.client.openapi.models.V1PolicyRuleFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PolicyRule instance) {
    this(fluent, instance, false);
  }

  public V1PolicyRuleBuilder(
      io.kubernetes.client.openapi.models.V1PolicyRuleFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PolicyRule instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiGroups(instance.getApiGroups());

    fluent.withNonResourceURLs(instance.getNonResourceURLs());

    fluent.withResourceNames(instance.getResourceNames());

    fluent.withResources(instance.getResources());

    fluent.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled;
  }

  public V1PolicyRuleBuilder(io.kubernetes.client.openapi.models.V1PolicyRule instance) {
    this(instance, false);
  }

  public V1PolicyRuleBuilder(
      io.kubernetes.client.openapi.models.V1PolicyRule instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiGroups(instance.getApiGroups());

    this.withNonResourceURLs(instance.getNonResourceURLs());

    this.withResourceNames(instance.getResourceNames());

    this.withResources(instance.getResources());

    this.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1PolicyRuleFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1PolicyRule build() {
    V1PolicyRule buildable = new V1PolicyRule();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setNonResourceURLs(fluent.getNonResourceURLs());
    buildable.setResourceNames(fluent.getResourceNames());
    buildable.setResources(fluent.getResources());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
}
