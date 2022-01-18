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

public class V1HTTPIngressPathBuilder
    extends io.kubernetes.client.openapi.models.V1HTTPIngressPathFluentImpl<
        io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1HTTPIngressPath,
        io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder> {
  public V1HTTPIngressPathBuilder() {
    this(false);
  }

  public V1HTTPIngressPathBuilder(java.lang.Boolean validationEnabled) {
    this(new V1HTTPIngressPath(), validationEnabled);
  }

  public V1HTTPIngressPathBuilder(
      io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent<?> fluent) {
    this(fluent, false);
  }

  public V1HTTPIngressPathBuilder(
      io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1HTTPIngressPath(), validationEnabled);
  }

  public V1HTTPIngressPathBuilder(
      io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1HTTPIngressPath instance) {
    this(fluent, instance, false);
  }

  public V1HTTPIngressPathBuilder(
      io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1HTTPIngressPath instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withBackend(instance.getBackend());

    fluent.withPath(instance.getPath());

    fluent.withPathType(instance.getPathType());

    this.validationEnabled = validationEnabled;
  }

  public V1HTTPIngressPathBuilder(io.kubernetes.client.openapi.models.V1HTTPIngressPath instance) {
    this(instance, false);
  }

  public V1HTTPIngressPathBuilder(
      io.kubernetes.client.openapi.models.V1HTTPIngressPath instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withBackend(instance.getBackend());

    this.withPath(instance.getPath());

    this.withPathType(instance.getPathType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1HTTPIngressPath build() {
    V1HTTPIngressPath buildable = new V1HTTPIngressPath();
    buildable.setBackend(fluent.getBackend());
    buildable.setPath(fluent.getPath());
    buildable.setPathType(fluent.getPathType());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1HTTPIngressPathBuilder that = (V1HTTPIngressPathBuilder) o;
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
