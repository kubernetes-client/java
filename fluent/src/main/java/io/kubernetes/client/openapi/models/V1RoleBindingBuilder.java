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

public class V1RoleBindingBuilder extends V1RoleBindingFluentImpl<V1RoleBindingBuilder>
    implements VisitableBuilder<V1RoleBinding, V1RoleBindingBuilder> {
  public V1RoleBindingBuilder() {
    this(false);
  }

  public V1RoleBindingBuilder(Boolean validationEnabled) {
    this(new V1RoleBinding(), validationEnabled);
  }

  public V1RoleBindingBuilder(V1RoleBindingFluent<?> fluent) {
    this(fluent, false);
  }

  public V1RoleBindingBuilder(V1RoleBindingFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1RoleBinding(), validationEnabled);
  }

  public V1RoleBindingBuilder(V1RoleBindingFluent<?> fluent, V1RoleBinding instance) {
    this(fluent, instance, false);
  }

  public V1RoleBindingBuilder(
      V1RoleBindingFluent<?> fluent, V1RoleBinding instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withRoleRef(instance.getRoleRef());

    fluent.withSubjects(instance.getSubjects());

    this.validationEnabled = validationEnabled;
  }

  public V1RoleBindingBuilder(V1RoleBinding instance) {
    this(instance, false);
  }

  public V1RoleBindingBuilder(V1RoleBinding instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withRoleRef(instance.getRoleRef());

    this.withSubjects(instance.getSubjects());

    this.validationEnabled = validationEnabled;
  }

  V1RoleBindingFluent<?> fluent;
  Boolean validationEnabled;

  public V1RoleBinding build() {
    V1RoleBinding buildable = new V1RoleBinding();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setRoleRef(fluent.getRoleRef());
    buildable.setSubjects(fluent.getSubjects());
    return buildable;
  }
}
