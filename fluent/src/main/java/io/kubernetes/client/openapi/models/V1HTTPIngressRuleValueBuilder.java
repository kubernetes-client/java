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

public class V1HTTPIngressRuleValueBuilder
    extends V1HTTPIngressRuleValueFluentImpl<V1HTTPIngressRuleValueBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue,
        io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueBuilder> {
  public V1HTTPIngressRuleValueBuilder() {
    this(false);
  }

  public V1HTTPIngressRuleValueBuilder(Boolean validationEnabled) {
    this(new V1HTTPIngressRuleValue(), validationEnabled);
  }

  public V1HTTPIngressRuleValueBuilder(V1HTTPIngressRuleValueFluent<?> fluent) {
    this(fluent, false);
  }

  public V1HTTPIngressRuleValueBuilder(
      io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1HTTPIngressRuleValue(), validationEnabled);
  }

  public V1HTTPIngressRuleValueBuilder(
      io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue instance) {
    this(fluent, instance, false);
  }

  public V1HTTPIngressRuleValueBuilder(
      io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPaths(instance.getPaths());

    this.validationEnabled = validationEnabled;
  }

  public V1HTTPIngressRuleValueBuilder(
      io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue instance) {
    this(instance, false);
  }

  public V1HTTPIngressRuleValueBuilder(
      io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withPaths(instance.getPaths());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue build() {
    V1HTTPIngressRuleValue buildable = new V1HTTPIngressRuleValue();
    buildable.setPaths(fluent.getPaths());
    return buildable;
  }
}
