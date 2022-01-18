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

public class V1IngressSpecBuilder
    extends io.kubernetes.client.openapi.models.V1IngressSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1IngressSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1IngressSpec,
        io.kubernetes.client.openapi.models.V1IngressSpecBuilder> {
  public V1IngressSpecBuilder() {
    this(false);
  }

  public V1IngressSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1IngressSpec(), validationEnabled);
  }

  public V1IngressSpecBuilder(io.kubernetes.client.openapi.models.V1IngressSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1IngressSpecBuilder(
      io.kubernetes.client.openapi.models.V1IngressSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1IngressSpec(), validationEnabled);
  }

  public V1IngressSpecBuilder(
      io.kubernetes.client.openapi.models.V1IngressSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1IngressSpec instance) {
    this(fluent, instance, false);
  }

  public V1IngressSpecBuilder(
      io.kubernetes.client.openapi.models.V1IngressSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1IngressSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withDefaultBackend(instance.getDefaultBackend());

    fluent.withIngressClassName(instance.getIngressClassName());

    fluent.withRules(instance.getRules());

    fluent.withTls(instance.getTls());

    this.validationEnabled = validationEnabled;
  }

  public V1IngressSpecBuilder(io.kubernetes.client.openapi.models.V1IngressSpec instance) {
    this(instance, false);
  }

  public V1IngressSpecBuilder(
      io.kubernetes.client.openapi.models.V1IngressSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withDefaultBackend(instance.getDefaultBackend());

    this.withIngressClassName(instance.getIngressClassName());

    this.withRules(instance.getRules());

    this.withTls(instance.getTls());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1IngressSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1IngressSpec build() {
    V1IngressSpec buildable = new V1IngressSpec();
    buildable.setDefaultBackend(fluent.getDefaultBackend());
    buildable.setIngressClassName(fluent.getIngressClassName());
    buildable.setRules(fluent.getRules());
    buildable.setTls(fluent.getTls());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1IngressSpecBuilder that = (V1IngressSpecBuilder) o;
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
