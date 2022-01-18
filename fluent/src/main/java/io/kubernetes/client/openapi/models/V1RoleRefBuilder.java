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

public class V1RoleRefBuilder
    extends io.kubernetes.client.openapi.models.V1RoleRefFluentImpl<
        io.kubernetes.client.openapi.models.V1RoleRefBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1RoleRef,
        io.kubernetes.client.openapi.models.V1RoleRefBuilder> {
  public V1RoleRefBuilder() {
    this(false);
  }

  public V1RoleRefBuilder(java.lang.Boolean validationEnabled) {
    this(new V1RoleRef(), validationEnabled);
  }

  public V1RoleRefBuilder(io.kubernetes.client.openapi.models.V1RoleRefFluent<?> fluent) {
    this(fluent, false);
  }

  public V1RoleRefBuilder(
      io.kubernetes.client.openapi.models.V1RoleRefFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1RoleRef(), validationEnabled);
  }

  public V1RoleRefBuilder(
      io.kubernetes.client.openapi.models.V1RoleRefFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1RoleRef instance) {
    this(fluent, instance, false);
  }

  public V1RoleRefBuilder(
      io.kubernetes.client.openapi.models.V1RoleRefFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1RoleRef instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiGroup(instance.getApiGroup());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  public V1RoleRefBuilder(io.kubernetes.client.openapi.models.V1RoleRef instance) {
    this(instance, false);
  }

  public V1RoleRefBuilder(
      io.kubernetes.client.openapi.models.V1RoleRef instance, java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiGroup(instance.getApiGroup());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1RoleRefFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1RoleRef build() {
    V1RoleRef buildable = new V1RoleRef();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1RoleRefBuilder that = (V1RoleRefBuilder) o;
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
