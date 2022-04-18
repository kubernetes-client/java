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

public class V1RoleRefBuilder extends V1RoleRefFluentImpl<V1RoleRefBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1RoleRef,
        io.kubernetes.client.openapi.models.V1RoleRefBuilder> {
  public V1RoleRefBuilder() {
    this(false);
  }

  public V1RoleRefBuilder(Boolean validationEnabled) {
    this(new V1RoleRef(), validationEnabled);
  }

  public V1RoleRefBuilder(V1RoleRefFluent<?> fluent) {
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
}
