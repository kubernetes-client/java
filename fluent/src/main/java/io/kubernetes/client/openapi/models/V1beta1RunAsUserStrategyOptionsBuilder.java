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

public class V1beta1RunAsUserStrategyOptionsBuilder
    extends V1beta1RunAsUserStrategyOptionsFluentImpl<V1beta1RunAsUserStrategyOptionsBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptions,
        io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsBuilder> {
  public V1beta1RunAsUserStrategyOptionsBuilder() {
    this(false);
  }

  public V1beta1RunAsUserStrategyOptionsBuilder(Boolean validationEnabled) {
    this(new V1beta1RunAsUserStrategyOptions(), validationEnabled);
  }

  public V1beta1RunAsUserStrategyOptionsBuilder(V1beta1RunAsUserStrategyOptionsFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1RunAsUserStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1RunAsUserStrategyOptions(), validationEnabled);
  }

  public V1beta1RunAsUserStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptions instance) {
    this(fluent, instance, false);
  }

  public V1beta1RunAsUserStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptions instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withRanges(instance.getRanges());

    fluent.withRule(instance.getRule());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1RunAsUserStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptions instance) {
    this(instance, false);
  }

  public V1beta1RunAsUserStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptions instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withRanges(instance.getRanges());

    this.withRule(instance.getRule());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptions build() {
    V1beta1RunAsUserStrategyOptions buildable = new V1beta1RunAsUserStrategyOptions();
    buildable.setRanges(fluent.getRanges());
    buildable.setRule(fluent.getRule());
    return buildable;
  }
}
