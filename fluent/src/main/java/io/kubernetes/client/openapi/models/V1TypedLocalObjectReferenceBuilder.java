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

public class V1TypedLocalObjectReferenceBuilder
    extends io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluentImpl<
        io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1TypedLocalObjectReference,
        io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder> {
  public V1TypedLocalObjectReferenceBuilder() {
    this(false);
  }

  public V1TypedLocalObjectReferenceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1TypedLocalObjectReference(), validationEnabled);
  }

  public V1TypedLocalObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1TypedLocalObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1TypedLocalObjectReference(), validationEnabled);
  }

  public V1TypedLocalObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1TypedLocalObjectReference instance) {
    this(fluent, instance, false);
  }

  public V1TypedLocalObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1TypedLocalObjectReference instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiGroup(instance.getApiGroup());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  public V1TypedLocalObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V1TypedLocalObjectReference instance) {
    this(instance, false);
  }

  public V1TypedLocalObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V1TypedLocalObjectReference instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiGroup(instance.getApiGroup());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference build() {
    V1TypedLocalObjectReference buildable = new V1TypedLocalObjectReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1TypedLocalObjectReferenceBuilder that = (V1TypedLocalObjectReferenceBuilder) o;
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
