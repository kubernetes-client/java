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

public class V1OverheadBuilder
    extends io.kubernetes.client.openapi.models.V1OverheadFluentImpl<
        io.kubernetes.client.openapi.models.V1OverheadBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1Overhead,
        io.kubernetes.client.openapi.models.V1OverheadBuilder> {
  public V1OverheadBuilder() {
    this(false);
  }

  public V1OverheadBuilder(java.lang.Boolean validationEnabled) {
    this(new V1Overhead(), validationEnabled);
  }

  public V1OverheadBuilder(io.kubernetes.client.openapi.models.V1OverheadFluent<?> fluent) {
    this(fluent, false);
  }

  public V1OverheadBuilder(
      io.kubernetes.client.openapi.models.V1OverheadFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1Overhead(), validationEnabled);
  }

  public V1OverheadBuilder(
      io.kubernetes.client.openapi.models.V1OverheadFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Overhead instance) {
    this(fluent, instance, false);
  }

  public V1OverheadBuilder(
      io.kubernetes.client.openapi.models.V1OverheadFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Overhead instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPodFixed(instance.getPodFixed());

    this.validationEnabled = validationEnabled;
  }

  public V1OverheadBuilder(io.kubernetes.client.openapi.models.V1Overhead instance) {
    this(instance, false);
  }

  public V1OverheadBuilder(
      io.kubernetes.client.openapi.models.V1Overhead instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withPodFixed(instance.getPodFixed());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1OverheadFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1Overhead build() {
    V1Overhead buildable = new V1Overhead();
    buildable.setPodFixed(fluent.getPodFixed());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1OverheadBuilder that = (V1OverheadBuilder) o;
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
