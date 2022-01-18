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

public class V1NodeConfigStatusBuilder
    extends io.kubernetes.client.openapi.models.V1NodeConfigStatusFluentImpl<
        io.kubernetes.client.openapi.models.V1NodeConfigStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1NodeConfigStatus,
        io.kubernetes.client.openapi.models.V1NodeConfigStatusBuilder> {
  public V1NodeConfigStatusBuilder() {
    this(false);
  }

  public V1NodeConfigStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1NodeConfigStatus(), validationEnabled);
  }

  public V1NodeConfigStatusBuilder(
      io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NodeConfigStatusBuilder(
      io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1NodeConfigStatus(), validationEnabled);
  }

  public V1NodeConfigStatusBuilder(
      io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NodeConfigStatus instance) {
    this(fluent, instance, false);
  }

  public V1NodeConfigStatusBuilder(
      io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NodeConfigStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withActive(instance.getActive());

    fluent.withAssigned(instance.getAssigned());

    fluent.withError(instance.getError());

    fluent.withLastKnownGood(instance.getLastKnownGood());

    this.validationEnabled = validationEnabled;
  }

  public V1NodeConfigStatusBuilder(
      io.kubernetes.client.openapi.models.V1NodeConfigStatus instance) {
    this(instance, false);
  }

  public V1NodeConfigStatusBuilder(
      io.kubernetes.client.openapi.models.V1NodeConfigStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withActive(instance.getActive());

    this.withAssigned(instance.getAssigned());

    this.withError(instance.getError());

    this.withLastKnownGood(instance.getLastKnownGood());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1NodeConfigStatus build() {
    V1NodeConfigStatus buildable = new V1NodeConfigStatus();
    buildable.setActive(fluent.getActive());
    buildable.setAssigned(fluent.getAssigned());
    buildable.setError(fluent.getError());
    buildable.setLastKnownGood(fluent.getLastKnownGood());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NodeConfigStatusBuilder that = (V1NodeConfigStatusBuilder) o;
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
