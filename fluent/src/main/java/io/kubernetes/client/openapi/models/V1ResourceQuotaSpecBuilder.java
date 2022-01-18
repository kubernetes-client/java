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

public class V1ResourceQuotaSpecBuilder
    extends io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1ResourceQuotaSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ResourceQuotaSpec,
        io.kubernetes.client.openapi.models.V1ResourceQuotaSpecBuilder> {
  public V1ResourceQuotaSpecBuilder() {
    this(false);
  }

  public V1ResourceQuotaSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ResourceQuotaSpec(), validationEnabled);
  }

  public V1ResourceQuotaSpecBuilder(
      io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ResourceQuotaSpecBuilder(
      io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ResourceQuotaSpec(), validationEnabled);
  }

  public V1ResourceQuotaSpecBuilder(
      io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ResourceQuotaSpec instance) {
    this(fluent, instance, false);
  }

  public V1ResourceQuotaSpecBuilder(
      io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ResourceQuotaSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withHard(instance.getHard());

    fluent.withScopeSelector(instance.getScopeSelector());

    fluent.withScopes(instance.getScopes());

    this.validationEnabled = validationEnabled;
  }

  public V1ResourceQuotaSpecBuilder(
      io.kubernetes.client.openapi.models.V1ResourceQuotaSpec instance) {
    this(instance, false);
  }

  public V1ResourceQuotaSpecBuilder(
      io.kubernetes.client.openapi.models.V1ResourceQuotaSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withHard(instance.getHard());

    this.withScopeSelector(instance.getScopeSelector());

    this.withScopes(instance.getScopes());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ResourceQuotaSpec build() {
    V1ResourceQuotaSpec buildable = new V1ResourceQuotaSpec();
    buildable.setHard(fluent.getHard());
    buildable.setScopeSelector(fluent.getScopeSelector());
    buildable.setScopes(fluent.getScopes());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ResourceQuotaSpecBuilder that = (V1ResourceQuotaSpecBuilder) o;
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
