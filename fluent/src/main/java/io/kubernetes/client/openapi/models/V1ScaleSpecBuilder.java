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

public class V1ScaleSpecBuilder
    extends io.kubernetes.client.openapi.models.V1ScaleSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1ScaleSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ScaleSpec,
        io.kubernetes.client.openapi.models.V1ScaleSpecBuilder> {
  public V1ScaleSpecBuilder() {
    this(false);
  }

  public V1ScaleSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ScaleSpec(), validationEnabled);
  }

  public V1ScaleSpecBuilder(io.kubernetes.client.openapi.models.V1ScaleSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ScaleSpecBuilder(
      io.kubernetes.client.openapi.models.V1ScaleSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ScaleSpec(), validationEnabled);
  }

  public V1ScaleSpecBuilder(
      io.kubernetes.client.openapi.models.V1ScaleSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ScaleSpec instance) {
    this(fluent, instance, false);
  }

  public V1ScaleSpecBuilder(
      io.kubernetes.client.openapi.models.V1ScaleSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ScaleSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withReplicas(instance.getReplicas());

    this.validationEnabled = validationEnabled;
  }

  public V1ScaleSpecBuilder(io.kubernetes.client.openapi.models.V1ScaleSpec instance) {
    this(instance, false);
  }

  public V1ScaleSpecBuilder(
      io.kubernetes.client.openapi.models.V1ScaleSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withReplicas(instance.getReplicas());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ScaleSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ScaleSpec build() {
    V1ScaleSpec buildable = new V1ScaleSpec();
    buildable.setReplicas(fluent.getReplicas());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ScaleSpecBuilder that = (V1ScaleSpecBuilder) o;
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
