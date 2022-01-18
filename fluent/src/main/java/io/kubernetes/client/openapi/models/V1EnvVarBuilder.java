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

public class V1EnvVarBuilder
    extends io.kubernetes.client.openapi.models.V1EnvVarFluentImpl<
        io.kubernetes.client.openapi.models.V1EnvVarBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1EnvVar,
        io.kubernetes.client.openapi.models.V1EnvVarBuilder> {
  public V1EnvVarBuilder() {
    this(false);
  }

  public V1EnvVarBuilder(java.lang.Boolean validationEnabled) {
    this(new V1EnvVar(), validationEnabled);
  }

  public V1EnvVarBuilder(io.kubernetes.client.openapi.models.V1EnvVarFluent<?> fluent) {
    this(fluent, false);
  }

  public V1EnvVarBuilder(
      io.kubernetes.client.openapi.models.V1EnvVarFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1EnvVar(), validationEnabled);
  }

  public V1EnvVarBuilder(
      io.kubernetes.client.openapi.models.V1EnvVarFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1EnvVar instance) {
    this(fluent, instance, false);
  }

  public V1EnvVarBuilder(
      io.kubernetes.client.openapi.models.V1EnvVarFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1EnvVar instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withName(instance.getName());

    fluent.withValue(instance.getValue());

    fluent.withValueFrom(instance.getValueFrom());

    this.validationEnabled = validationEnabled;
  }

  public V1EnvVarBuilder(io.kubernetes.client.openapi.models.V1EnvVar instance) {
    this(instance, false);
  }

  public V1EnvVarBuilder(
      io.kubernetes.client.openapi.models.V1EnvVar instance, java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withName(instance.getName());

    this.withValue(instance.getValue());

    this.withValueFrom(instance.getValueFrom());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1EnvVarFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1EnvVar build() {
    V1EnvVar buildable = new V1EnvVar();
    buildable.setName(fluent.getName());
    buildable.setValue(fluent.getValue());
    buildable.setValueFrom(fluent.getValueFrom());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EnvVarBuilder that = (V1EnvVarBuilder) o;
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
