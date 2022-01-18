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

public class V1BindingBuilder
    extends io.kubernetes.client.openapi.models.V1BindingFluentImpl<
        io.kubernetes.client.openapi.models.V1BindingBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1Binding,
        io.kubernetes.client.openapi.models.V1BindingBuilder> {
  public V1BindingBuilder() {
    this(false);
  }

  public V1BindingBuilder(java.lang.Boolean validationEnabled) {
    this(new V1Binding(), validationEnabled);
  }

  public V1BindingBuilder(io.kubernetes.client.openapi.models.V1BindingFluent<?> fluent) {
    this(fluent, false);
  }

  public V1BindingBuilder(
      io.kubernetes.client.openapi.models.V1BindingFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1Binding(), validationEnabled);
  }

  public V1BindingBuilder(
      io.kubernetes.client.openapi.models.V1BindingFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Binding instance) {
    this(fluent, instance, false);
  }

  public V1BindingBuilder(
      io.kubernetes.client.openapi.models.V1BindingFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Binding instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled;
  }

  public V1BindingBuilder(io.kubernetes.client.openapi.models.V1Binding instance) {
    this(instance, false);
  }

  public V1BindingBuilder(
      io.kubernetes.client.openapi.models.V1Binding instance, java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1BindingFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1Binding build() {
    V1Binding buildable = new V1Binding();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1BindingBuilder that = (V1BindingBuilder) o;
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
