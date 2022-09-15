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

public class V1ManagedFieldsEntryBuilder
    extends V1ManagedFieldsEntryFluentImpl<V1ManagedFieldsEntryBuilder>
    implements VisitableBuilder<V1ManagedFieldsEntry, V1ManagedFieldsEntryBuilder> {
  public V1ManagedFieldsEntryBuilder() {
    this(false);
  }

  public V1ManagedFieldsEntryBuilder(Boolean validationEnabled) {
    this(new V1ManagedFieldsEntry(), validationEnabled);
  }

  public V1ManagedFieldsEntryBuilder(V1ManagedFieldsEntryFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ManagedFieldsEntryBuilder(
      V1ManagedFieldsEntryFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ManagedFieldsEntry(), validationEnabled);
  }

  public V1ManagedFieldsEntryBuilder(
      V1ManagedFieldsEntryFluent<?> fluent, V1ManagedFieldsEntry instance) {
    this(fluent, instance, false);
  }

  public V1ManagedFieldsEntryBuilder(
      V1ManagedFieldsEntryFluent<?> fluent,
      V1ManagedFieldsEntry instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withFieldsType(instance.getFieldsType());

    fluent.withFieldsV1(instance.getFieldsV1());

    fluent.withManager(instance.getManager());

    fluent.withOperation(instance.getOperation());

    fluent.withSubresource(instance.getSubresource());

    fluent.withTime(instance.getTime());

    this.validationEnabled = validationEnabled;
  }

  public V1ManagedFieldsEntryBuilder(V1ManagedFieldsEntry instance) {
    this(instance, false);
  }

  public V1ManagedFieldsEntryBuilder(V1ManagedFieldsEntry instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withFieldsType(instance.getFieldsType());

    this.withFieldsV1(instance.getFieldsV1());

    this.withManager(instance.getManager());

    this.withOperation(instance.getOperation());

    this.withSubresource(instance.getSubresource());

    this.withTime(instance.getTime());

    this.validationEnabled = validationEnabled;
  }

  V1ManagedFieldsEntryFluent<?> fluent;
  Boolean validationEnabled;

  public V1ManagedFieldsEntry build() {
    V1ManagedFieldsEntry buildable = new V1ManagedFieldsEntry();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setFieldsType(fluent.getFieldsType());
    buildable.setFieldsV1(fluent.getFieldsV1());
    buildable.setManager(fluent.getManager());
    buildable.setOperation(fluent.getOperation());
    buildable.setSubresource(fluent.getSubresource());
    buildable.setTime(fluent.getTime());
    return buildable;
  }
}
