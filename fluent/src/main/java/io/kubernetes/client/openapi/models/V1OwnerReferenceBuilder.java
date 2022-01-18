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

public class V1OwnerReferenceBuilder
    extends io.kubernetes.client.openapi.models.V1OwnerReferenceFluentImpl<
        io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1OwnerReference,
        io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder> {
  public V1OwnerReferenceBuilder() {
    this(false);
  }

  public V1OwnerReferenceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1OwnerReference(), validationEnabled);
  }

  public V1OwnerReferenceBuilder(
      io.kubernetes.client.openapi.models.V1OwnerReferenceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1OwnerReferenceBuilder(
      io.kubernetes.client.openapi.models.V1OwnerReferenceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1OwnerReference(), validationEnabled);
  }

  public V1OwnerReferenceBuilder(
      io.kubernetes.client.openapi.models.V1OwnerReferenceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1OwnerReference instance) {
    this(fluent, instance, false);
  }

  public V1OwnerReferenceBuilder(
      io.kubernetes.client.openapi.models.V1OwnerReferenceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1OwnerReference instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withBlockOwnerDeletion(instance.getBlockOwnerDeletion());

    fluent.withController(instance.getController());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    fluent.withUid(instance.getUid());

    this.validationEnabled = validationEnabled;
  }

  public V1OwnerReferenceBuilder(io.kubernetes.client.openapi.models.V1OwnerReference instance) {
    this(instance, false);
  }

  public V1OwnerReferenceBuilder(
      io.kubernetes.client.openapi.models.V1OwnerReference instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withBlockOwnerDeletion(instance.getBlockOwnerDeletion());

    this.withController(instance.getController());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withUid(instance.getUid());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1OwnerReferenceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1OwnerReference build() {
    V1OwnerReference buildable = new V1OwnerReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setBlockOwnerDeletion(fluent.getBlockOwnerDeletion());
    buildable.setController(fluent.getController());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setUid(fluent.getUid());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1OwnerReferenceBuilder that = (V1OwnerReferenceBuilder) o;
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
