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

public class V1ControllerRevisionBuilder
    extends io.kubernetes.client.openapi.models.V1ControllerRevisionFluentImpl<
        io.kubernetes.client.openapi.models.V1ControllerRevisionBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ControllerRevision,
        io.kubernetes.client.openapi.models.V1ControllerRevisionBuilder> {
  public V1ControllerRevisionBuilder() {
    this(false);
  }

  public V1ControllerRevisionBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ControllerRevision(), validationEnabled);
  }

  public V1ControllerRevisionBuilder(
      io.kubernetes.client.openapi.models.V1ControllerRevisionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ControllerRevisionBuilder(
      io.kubernetes.client.openapi.models.V1ControllerRevisionFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ControllerRevision(), validationEnabled);
  }

  public V1ControllerRevisionBuilder(
      io.kubernetes.client.openapi.models.V1ControllerRevisionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ControllerRevision instance) {
    this(fluent, instance, false);
  }

  public V1ControllerRevisionBuilder(
      io.kubernetes.client.openapi.models.V1ControllerRevisionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ControllerRevision instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withData(instance.getData());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withRevision(instance.getRevision());

    this.validationEnabled = validationEnabled;
  }

  public V1ControllerRevisionBuilder(
      io.kubernetes.client.openapi.models.V1ControllerRevision instance) {
    this(instance, false);
  }

  public V1ControllerRevisionBuilder(
      io.kubernetes.client.openapi.models.V1ControllerRevision instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withData(instance.getData());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withRevision(instance.getRevision());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ControllerRevisionFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ControllerRevision build() {
    V1ControllerRevision buildable = new V1ControllerRevision();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setData(fluent.getData());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setRevision(fluent.getRevision());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ControllerRevisionBuilder that = (V1ControllerRevisionBuilder) o;
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
