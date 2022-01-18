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

public class V1PodTemplateSpecBuilder
    extends io.kubernetes.client.openapi.models.V1PodTemplateSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1PodTemplateSpec,
        io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder> {
  public V1PodTemplateSpecBuilder() {
    this(false);
  }

  public V1PodTemplateSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1PodTemplateSpec(), validationEnabled);
  }

  public V1PodTemplateSpecBuilder(
      io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PodTemplateSpecBuilder(
      io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1PodTemplateSpec(), validationEnabled);
  }

  public V1PodTemplateSpecBuilder(
      io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodTemplateSpec instance) {
    this(fluent, instance, false);
  }

  public V1PodTemplateSpecBuilder(
      io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodTemplateSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled;
  }

  public V1PodTemplateSpecBuilder(io.kubernetes.client.openapi.models.V1PodTemplateSpec instance) {
    this(instance, false);
  }

  public V1PodTemplateSpecBuilder(
      io.kubernetes.client.openapi.models.V1PodTemplateSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1PodTemplateSpec build() {
    V1PodTemplateSpec buildable = new V1PodTemplateSpec();
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodTemplateSpecBuilder that = (V1PodTemplateSpecBuilder) o;
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
