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

public class V1EnvVarSourceBuilder
    extends io.kubernetes.client.openapi.models.V1EnvVarSourceFluentImpl<
        io.kubernetes.client.openapi.models.V1EnvVarSourceBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1EnvVarSource,
        io.kubernetes.client.openapi.models.V1EnvVarSourceBuilder> {
  public V1EnvVarSourceBuilder() {
    this(false);
  }

  public V1EnvVarSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1EnvVarSource(), validationEnabled);
  }

  public V1EnvVarSourceBuilder(io.kubernetes.client.openapi.models.V1EnvVarSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1EnvVarSourceBuilder(
      io.kubernetes.client.openapi.models.V1EnvVarSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1EnvVarSource(), validationEnabled);
  }

  public V1EnvVarSourceBuilder(
      io.kubernetes.client.openapi.models.V1EnvVarSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1EnvVarSource instance) {
    this(fluent, instance, false);
  }

  public V1EnvVarSourceBuilder(
      io.kubernetes.client.openapi.models.V1EnvVarSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1EnvVarSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withConfigMapKeyRef(instance.getConfigMapKeyRef());

    fluent.withFieldRef(instance.getFieldRef());

    fluent.withResourceFieldRef(instance.getResourceFieldRef());

    fluent.withSecretKeyRef(instance.getSecretKeyRef());

    this.validationEnabled = validationEnabled;
  }

  public V1EnvVarSourceBuilder(io.kubernetes.client.openapi.models.V1EnvVarSource instance) {
    this(instance, false);
  }

  public V1EnvVarSourceBuilder(
      io.kubernetes.client.openapi.models.V1EnvVarSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withConfigMapKeyRef(instance.getConfigMapKeyRef());

    this.withFieldRef(instance.getFieldRef());

    this.withResourceFieldRef(instance.getResourceFieldRef());

    this.withSecretKeyRef(instance.getSecretKeyRef());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1EnvVarSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1EnvVarSource build() {
    V1EnvVarSource buildable = new V1EnvVarSource();
    buildable.setConfigMapKeyRef(fluent.getConfigMapKeyRef());
    buildable.setFieldRef(fluent.getFieldRef());
    buildable.setResourceFieldRef(fluent.getResourceFieldRef());
    buildable.setSecretKeyRef(fluent.getSecretKeyRef());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EnvVarSourceBuilder that = (V1EnvVarSourceBuilder) o;
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
