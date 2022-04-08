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

public class V1alpha1StorageVersionStatusBuilder
    extends V1alpha1StorageVersionStatusFluentImpl<V1alpha1StorageVersionStatusBuilder>
    implements VisitableBuilder<
        V1alpha1StorageVersionStatus,
        io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusBuilder> {
  public V1alpha1StorageVersionStatusBuilder() {
    this(false);
  }

  public V1alpha1StorageVersionStatusBuilder(Boolean validationEnabled) {
    this(new V1alpha1StorageVersionStatus(), validationEnabled);
  }

  public V1alpha1StorageVersionStatusBuilder(V1alpha1StorageVersionStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1alpha1StorageVersionStatusBuilder(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1alpha1StorageVersionStatus(), validationEnabled);
  }

  public V1alpha1StorageVersionStatusBuilder(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus instance) {
    this(fluent, instance, false);
  }

  public V1alpha1StorageVersionStatusBuilder(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCommonEncodingVersion(instance.getCommonEncodingVersion());

    fluent.withConditions(instance.getConditions());

    fluent.withStorageVersions(instance.getStorageVersions());

    this.validationEnabled = validationEnabled;
  }

  public V1alpha1StorageVersionStatusBuilder(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus instance) {
    this(instance, false);
  }

  public V1alpha1StorageVersionStatusBuilder(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withCommonEncodingVersion(instance.getCommonEncodingVersion());

    this.withConditions(instance.getConditions());

    this.withStorageVersions(instance.getStorageVersions());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus build() {
    V1alpha1StorageVersionStatus buildable = new V1alpha1StorageVersionStatus();
    buildable.setCommonEncodingVersion(fluent.getCommonEncodingVersion());
    buildable.setConditions(fluent.getConditions());
    buildable.setStorageVersions(fluent.getStorageVersions());
    return buildable;
  }
}
