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

public class V1beta1SELinuxStrategyOptionsBuilder
    extends V1beta1SELinuxStrategyOptionsFluentImpl<V1beta1SELinuxStrategyOptionsBuilder>
    implements VisitableBuilder<
        V1beta1SELinuxStrategyOptions,
        io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsBuilder> {
  public V1beta1SELinuxStrategyOptionsBuilder() {
    this(false);
  }

  public V1beta1SELinuxStrategyOptionsBuilder(Boolean validationEnabled) {
    this(new V1beta1SELinuxStrategyOptions(), validationEnabled);
  }

  public V1beta1SELinuxStrategyOptionsBuilder(V1beta1SELinuxStrategyOptionsFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1SELinuxStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1SELinuxStrategyOptions(), validationEnabled);
  }

  public V1beta1SELinuxStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions instance) {
    this(fluent, instance, false);
  }

  public V1beta1SELinuxStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withRule(instance.getRule());

    fluent.withSeLinuxOptions(instance.getSeLinuxOptions());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1SELinuxStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions instance) {
    this(instance, false);
  }

  public V1beta1SELinuxStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withRule(instance.getRule());

    this.withSeLinuxOptions(instance.getSeLinuxOptions());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions build() {
    V1beta1SELinuxStrategyOptions buildable = new V1beta1SELinuxStrategyOptions();
    buildable.setRule(fluent.getRule());
    buildable.setSeLinuxOptions(fluent.getSeLinuxOptions());
    return buildable;
  }
}
