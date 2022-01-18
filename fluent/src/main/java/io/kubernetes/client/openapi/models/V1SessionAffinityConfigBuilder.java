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

public class V1SessionAffinityConfigBuilder
    extends io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluentImpl<
        io.kubernetes.client.openapi.models.V1SessionAffinityConfigBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1SessionAffinityConfig,
        io.kubernetes.client.openapi.models.V1SessionAffinityConfigBuilder> {
  public V1SessionAffinityConfigBuilder() {
    this(false);
  }

  public V1SessionAffinityConfigBuilder(java.lang.Boolean validationEnabled) {
    this(new V1SessionAffinityConfig(), validationEnabled);
  }

  public V1SessionAffinityConfigBuilder(
      io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent<?> fluent) {
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

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SessionAffinityConfigBuilder that = (V1SessionAffinityConfigBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
