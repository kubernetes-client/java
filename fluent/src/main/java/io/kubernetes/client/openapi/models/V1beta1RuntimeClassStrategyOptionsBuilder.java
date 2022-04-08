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

public class V1beta1RuntimeClassStrategyOptionsBuilder
    extends V1beta1RuntimeClassStrategyOptionsFluentImpl<V1beta1RuntimeClassStrategyOptionsBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptions,
        io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptionsBuilder> {
  public V1beta1RuntimeClassStrategyOptionsBuilder() {
    this(false);
  }

  public V1beta1RuntimeClassStrategyOptionsBuilder(Boolean validationEnabled) {
    this(new V1beta1RuntimeClassStrategyOptions(), validationEnabled);
  }

  public V1beta1RuntimeClassStrategyOptionsBuilder(
      V1beta1RuntimeClassStrategyOptionsFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1RuntimeClassStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptionsFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1RuntimeClassStrategyOptions(), validationEnabled);
  }

  public V1beta1RuntimeClassStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptionsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptions instance) {
    this(fluent, instance, false);
  }

  public V1beta1RuntimeClassStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptionsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptions instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAllowedRuntimeClassNames(instance.getAllowedRuntimeClassNames());

    fluent.withDefaultRuntimeClassName(instance.getDefaultRuntimeClassName());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1RuntimeClassStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptions instance) {
    this(instance, false);
  }

  public V1beta1RuntimeClassStrategyOptionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptions instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAllowedRuntimeClassNames(instance.getAllowedRuntimeClassNames());

    this.withDefaultRuntimeClassName(instance.getDefaultRuntimeClassName());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptionsFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptions build() {
    V1beta1RuntimeClassStrategyOptions buildable = new V1beta1RuntimeClassStrategyOptions();
    buildable.setAllowedRuntimeClassNames(fluent.getAllowedRuntimeClassNames());
    buildable.setDefaultRuntimeClassName(fluent.getDefaultRuntimeClassName());
    return buildable;
  }
}
