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

public class V1beta1SupplementalGroupsStrategyOptionsBuilder
    extends V1beta1SupplementalGroupsStrategyOptionsFluentImpl<
        V1beta1SupplementalGroupsStrategyOptionsBuilder>
    implements VisitableBuilder<
        V1beta1SupplementalGroupsStrategyOptions,
        io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptionsBuilder> {
  public V1beta1SupplementalGroupsStrategyOptionsBuilder() {
    this(false);
  }

  public V1beta1SupplementalGroupsStrategyOptionsBuilder(Boolean validationEnabled) {
    this(new V1beta1SupplementalGroupsStrategyOptions(), validationEnabled);
  }

  public V1beta1SupplementalGroupsStrategyOptionsBuilder(
      V1beta1SupplementalGroupsStrategyOptionsFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1SupplementalGroupsStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptionsFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1SupplementalGroupsStrategyOptions(), validationEnabled);
  }

  public V1beta1SupplementalGroupsStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptionsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions instance) {
    this(fluent, instance, false);
  }

  public V1beta1SupplementalGroupsStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptionsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withRanges(instance.getRanges());

    fluent.withRule(instance.getRule());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1SupplementalGroupsStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions instance) {
    this(instance, false);
  }

  public V1beta1SupplementalGroupsStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withRanges(instance.getRanges());

    this.withRule(instance.getRule());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptionsFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions build() {
    V1beta1SupplementalGroupsStrategyOptions buildable =
        new V1beta1SupplementalGroupsStrategyOptions();
    buildable.setRanges(fluent.getRanges());
    buildable.setRule(fluent.getRule());
    return buildable;
  }
}
