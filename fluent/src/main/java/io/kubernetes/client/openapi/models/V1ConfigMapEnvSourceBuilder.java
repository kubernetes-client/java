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

public class V1ConfigMapEnvSourceBuilder
    extends io.kubernetes.client.openapi.models.V1ConfigMapEnvSourceFluentImpl<
        io.kubernetes.client.openapi.models.V1ConfigMapEnvSourceBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ConfigMapEnvSource,
        io.kubernetes.client.openapi.models.V1ConfigMapEnvSourceBuilder> {
  public V1ConfigMapEnvSourceBuilder() {
    this(false);
  }

  public V1ConfigMapEnvSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ConfigMapEnvSource(), validationEnabled);
  }

  public V1ConfigMapEnvSourceBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapEnvSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ConfigMapEnvSourceBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapEnvSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ConfigMapEnvSource(), validationEnabled);
  }

  public V1ConfigMapEnvSourceBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapEnvSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ConfigMapEnvSource instance) {
    this(fluent, instance, false);
  }

  public V1ConfigMapEnvSourceBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapEnvSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ConfigMapEnvSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withName(instance.getName());

    fluent.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled;
  }

  public V1ConfigMapEnvSourceBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapEnvSource instance) {
    this(instance, false);
  }

  public V1ConfigMapEnvSourceBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapEnvSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withName(instance.getName());

    this.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ConfigMapEnvSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ConfigMapEnvSource build() {
    V1ConfigMapEnvSource buildable = new V1ConfigMapEnvSource();
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ConfigMapEnvSourceBuilder that = (V1ConfigMapEnvSourceBuilder) o;
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
