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

public class V1VolumeAttachmentStatusBuilder
    extends io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluentImpl<
        io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1VolumeAttachmentStatus,
        io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusBuilder> {
  public V1VolumeAttachmentStatusBuilder() {
    this(false);
  }

  public V1VolumeAttachmentStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1VolumeAttachmentStatus(), validationEnabled);
  }

  public V1VolumeAttachmentStatusBuilder(
      io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1VolumeAttachmentStatusBuilder(
      io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1VolumeAttachmentStatus(), validationEnabled);
  }

  public V1VolumeAttachmentStatusBuilder(
      io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1VolumeAttachmentStatus instance) {
    this(fluent, instance, false);
  }

  public V1VolumeAttachmentStatusBuilder(
      io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1VolumeAttachmentStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAttachError(instance.getAttachError());

    fluent.withAttached(instance.getAttached());

    fluent.withAttachmentMetadata(instance.getAttachmentMetadata());

    fluent.withDetachError(instance.getDetachError());

    this.validationEnabled = validationEnabled;
  }

  public V1VolumeAttachmentStatusBuilder(
      io.kubernetes.client.openapi.models.V1VolumeAttachmentStatus instance) {
    this(instance, false);
  }

  public V1VolumeAttachmentStatusBuilder(
      io.kubernetes.client.openapi.models.V1VolumeAttachmentStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAttachError(instance.getAttachError());

    this.withAttached(instance.getAttached());

    this.withAttachmentMetadata(instance.getAttachmentMetadata());

    this.withDetachError(instance.getDetachError());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatus build() {
    V1VolumeAttachmentStatus buildable = new V1VolumeAttachmentStatus();
    buildable.setAttachError(fluent.getAttachError());
    buildable.setAttached(fluent.getAttached());
    buildable.setAttachmentMetadata(fluent.getAttachmentMetadata());
    buildable.setDetachError(fluent.getDetachError());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1VolumeAttachmentStatusBuilder that = (V1VolumeAttachmentStatusBuilder) o;
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
