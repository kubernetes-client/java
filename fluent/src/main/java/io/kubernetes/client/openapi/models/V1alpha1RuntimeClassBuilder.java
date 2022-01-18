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

public class V1alpha1RuntimeClassBuilder
    extends io.kubernetes.client.openapi.models.V1alpha1RuntimeClassFluentImpl<
        io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1alpha1RuntimeClass,
        io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder> {
  public V1alpha1RuntimeClassBuilder() {
    this(false);
  }

  public V1alpha1RuntimeClassBuilder(java.lang.Boolean validationEnabled) {
    this(new V1alpha1RuntimeClass(), validationEnabled);
  }

  public V1alpha1RuntimeClassBuilder(
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClassFluent<?> fluent) {
    this(fluent, false);
  }

  public V1alpha1RuntimeClassBuilder(
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClassFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1alpha1RuntimeClass(), validationEnabled);
  }

  public V1alpha1RuntimeClassBuilder(
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClassFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClass instance) {
    this(fluent, instance, false);
  }

  public V1alpha1RuntimeClassBuilder(
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClassFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClass instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled;
  }

  public V1alpha1RuntimeClassBuilder(
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClass instance) {
    this(instance, false);
  }

  public V1alpha1RuntimeClassBuilder(
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClass instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1alpha1RuntimeClassFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClass build() {
    V1alpha1RuntimeClass buildable = new V1alpha1RuntimeClass();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1RuntimeClassBuilder that = (V1alpha1RuntimeClassBuilder) o;
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
