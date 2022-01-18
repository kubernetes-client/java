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

public class V1StatusBuilder
    extends io.kubernetes.client.openapi.models.V1StatusFluentImpl<
        io.kubernetes.client.openapi.models.V1StatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1Status,
        io.kubernetes.client.openapi.models.V1StatusBuilder> {
  public V1StatusBuilder() {
    this(false);
  }

  public V1StatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1Status(), validationEnabled);
  }

  public V1StatusBuilder(io.kubernetes.client.openapi.models.V1StatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1StatusBuilder(
      io.kubernetes.client.openapi.models.V1StatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1Status(), validationEnabled);
  }

  public V1StatusBuilder(
      io.kubernetes.client.openapi.models.V1StatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Status instance) {
    this(fluent, instance, false);
  }

  public V1StatusBuilder(
      io.kubernetes.client.openapi.models.V1StatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Status instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withCode(instance.getCode());

    fluent.withDetails(instance.getDetails());

    fluent.withKind(instance.getKind());

    fluent.withMessage(instance.getMessage());

    fluent.withMetadata(instance.getMetadata());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled;
  }

  public V1StatusBuilder(io.kubernetes.client.openapi.models.V1Status instance) {
    this(instance, false);
  }

  public V1StatusBuilder(
      io.kubernetes.client.openapi.models.V1Status instance, java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withCode(instance.getCode());

    this.withDetails(instance.getDetails());

    this.withKind(instance.getKind());

    this.withMessage(instance.getMessage());

    this.withMetadata(instance.getMetadata());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1StatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1Status build() {
    V1Status buildable = new V1Status();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setCode(fluent.getCode());
    buildable.setDetails(fluent.getDetails());
    buildable.setKind(fluent.getKind());
    buildable.setMessage(fluent.getMessage());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1StatusBuilder that = (V1StatusBuilder) o;
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
