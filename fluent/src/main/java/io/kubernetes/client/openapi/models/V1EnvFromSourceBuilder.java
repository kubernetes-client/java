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

public class V1EnvFromSourceBuilder
    extends io.kubernetes.client.openapi.models.V1EnvFromSourceFluentImpl<
        io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1EnvFromSource,
        io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder> {
  public V1EnvFromSourceBuilder() {
    this(false);
  }

  public V1EnvFromSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1EnvFromSource(), validationEnabled);
  }

  public V1EnvFromSourceBuilder(
      io.kubernetes.client.openapi.models.V1EnvFromSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1EnvFromSourceBuilder(
      io.kubernetes.client.openapi.models.V1EnvFromSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1EnvFromSource(), validationEnabled);
  }

  public V1EnvFromSourceBuilder(
      io.kubernetes.client.openapi.models.V1EnvFromSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1EnvFromSource instance) {
    this(fluent, instance, false);
  }

  public V1EnvFromSourceBuilder(
      io.kubernetes.client.openapi.models.V1EnvFromSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1EnvFromSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withConfigMapRef(instance.getConfigMapRef());

    fluent.withPrefix(instance.getPrefix());

    fluent.withSecretRef(instance.getSecretRef());

    this.validationEnabled = validationEnabled;
  }

  public V1EnvFromSourceBuilder(io.kubernetes.client.openapi.models.V1EnvFromSource instance) {
    this(instance, false);
  }

  public V1EnvFromSourceBuilder(
      io.kubernetes.client.openapi.models.V1EnvFromSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withConfigMapRef(instance.getConfigMapRef());

    this.withPrefix(instance.getPrefix());

    this.withSecretRef(instance.getSecretRef());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1EnvFromSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1EnvFromSource build() {
    V1EnvFromSource buildable = new V1EnvFromSource();
    buildable.setConfigMapRef(fluent.getConfigMapRef());
    buildable.setPrefix(fluent.getPrefix());
    buildable.setSecretRef(fluent.getSecretRef());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EnvFromSourceBuilder that = (V1EnvFromSourceBuilder) o;
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
