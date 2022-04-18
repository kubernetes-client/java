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

public class V1IngressRuleBuilder extends V1IngressRuleFluentImpl<V1IngressRuleBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1IngressRule,
        io.kubernetes.client.openapi.models.V1IngressRuleBuilder> {
  public V1IngressRuleBuilder() {
    this(false);
  }

  public V1IngressRuleBuilder(Boolean validationEnabled) {
    this(new V1IngressRule(), validationEnabled);
  }

  public V1IngressRuleBuilder(V1IngressRuleFluent<?> fluent) {
    this(fluent, false);
  }

  public V1IngressRuleBuilder(
      io.kubernetes.client.openapi.models.V1IngressRuleFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1IngressRule(), validationEnabled);
  }

  public V1IngressRuleBuilder(
      io.kubernetes.client.openapi.models.V1IngressRuleFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1IngressRule instance) {
    this(fluent, instance, false);
  }

  public V1IngressRuleBuilder(
      io.kubernetes.client.openapi.models.V1IngressRuleFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1IngressRule instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withHost(instance.getHost());

    fluent.withHttp(instance.getHttp());

    this.validationEnabled = validationEnabled;
  }

  public V1IngressRuleBuilder(io.kubernetes.client.openapi.models.V1IngressRule instance) {
    this(instance, false);
  }

  public V1IngressRuleBuilder(
      io.kubernetes.client.openapi.models.V1IngressRule instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withHost(instance.getHost());

    this.withHttp(instance.getHttp());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1IngressRuleFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1IngressRule build() {
    V1IngressRule buildable = new V1IngressRule();
    buildable.setHost(fluent.getHost());
    buildable.setHttp(fluent.getHttp());
    return buildable;
  }
}
