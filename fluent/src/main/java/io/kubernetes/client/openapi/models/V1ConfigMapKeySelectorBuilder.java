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

public class V1ConfigMapKeySelectorBuilder
    extends io.kubernetes.client.openapi.models.V1ConfigMapKeySelectorFluentImpl<
        io.kubernetes.client.openapi.models.V1ConfigMapKeySelectorBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ConfigMapKeySelector,
        io.kubernetes.client.openapi.models.V1ConfigMapKeySelectorBuilder> {
  public V1ConfigMapKeySelectorBuilder() {
    this(false);
  }

  public V1ConfigMapKeySelectorBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ConfigMapKeySelector(), validationEnabled);
  }

  public V1ConfigMapKeySelectorBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapKeySelectorFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ConfigMapKeySelectorBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapKeySelectorFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ConfigMapKeySelector(), validationEnabled);
  }

  public V1ConfigMapKeySelectorBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapKeySelectorFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ConfigMapKeySelector instance) {
    this(fluent, instance, false);
  }

  public V1ConfigMapKeySelectorBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapKeySelectorFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ConfigMapKeySelector instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withKey(instance.getKey());

    fluent.withName(instance.getName());

    fluent.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled;
  }

  public V1ConfigMapKeySelectorBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapKeySelector instance) {
    this(instance, false);
  }

  public V1ConfigMapKeySelectorBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapKeySelector instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withKey(instance.getKey());

    this.withName(instance.getName());

    this.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ConfigMapKeySelectorFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ConfigMapKeySelector build() {
    V1ConfigMapKeySelector buildable = new V1ConfigMapKeySelector();
    buildable.setKey(fluent.getKey());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ConfigMapKeySelectorBuilder that = (V1ConfigMapKeySelectorBuilder) o;
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
