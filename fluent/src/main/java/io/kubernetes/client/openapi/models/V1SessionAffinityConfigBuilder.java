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

public class V1SessionAffinityConfigBuilder
    extends V1SessionAffinityConfigFluentImpl<V1SessionAffinityConfigBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1SessionAffinityConfig,
        V1SessionAffinityConfigBuilder> {
  public V1SessionAffinityConfigBuilder() {
    this(false);
  }

  public V1SessionAffinityConfigBuilder(Boolean validationEnabled) {
    this(new V1SessionAffinityConfig(), validationEnabled);
  }

  public V1SessionAffinityConfigBuilder(V1SessionAffinityConfigFluent<?> fluent) {
    this(fluent, false);
  }

  public V1SessionAffinityConfigBuilder(
      io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1SessionAffinityConfig(), validationEnabled);
  }

  public V1SessionAffinityConfigBuilder(
      io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1SessionAffinityConfig instance) {
    this(fluent, instance, false);
  }

  public V1SessionAffinityConfigBuilder(
      io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1SessionAffinityConfig instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withClientIP(instance.getClientIP());

    this.validationEnabled = validationEnabled;
  }

  public V1SessionAffinityConfigBuilder(
      io.kubernetes.client.openapi.models.V1SessionAffinityConfig instance) {
    this(instance, false);
  }

  public V1SessionAffinityConfigBuilder(
      io.kubernetes.client.openapi.models.V1SessionAffinityConfig instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withClientIP(instance.getClientIP());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1SessionAffinityConfig build() {
    V1SessionAffinityConfig buildable = new V1SessionAffinityConfig();
    buildable.setClientIP(fluent.getClientIP());
    return buildable;
  }
}
