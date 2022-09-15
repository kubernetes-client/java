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

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1ResourceQuotaSpecBuilder
    extends V1ResourceQuotaSpecFluentImpl<V1ResourceQuotaSpecBuilder>
    implements VisitableBuilder<V1ResourceQuotaSpec, V1ResourceQuotaSpecBuilder> {
  public V1ResourceQuotaSpecBuilder() {
    this(false);
  }

  public V1ResourceQuotaSpecBuilder(Boolean validationEnabled) {
    this(new V1ResourceQuotaSpec(), validationEnabled);
  }

  public V1ResourceQuotaSpecBuilder(V1ResourceQuotaSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ResourceQuotaSpecBuilder(
      V1ResourceQuotaSpecFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ResourceQuotaSpec(), validationEnabled);
  }

  public V1ResourceQuotaSpecBuilder(
      V1ResourceQuotaSpecFluent<?> fluent, V1ResourceQuotaSpec instance) {
    this(fluent, instance, false);
  }

  public V1ResourceQuotaSpecBuilder(
      V1ResourceQuotaSpecFluent<?> fluent,
      V1ResourceQuotaSpec instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withHard(instance.getHard());

    fluent.withScopeSelector(instance.getScopeSelector());

    fluent.withScopes(instance.getScopes());

    this.validationEnabled = validationEnabled;
  }

  public V1ResourceQuotaSpecBuilder(V1ResourceQuotaSpec instance) {
    this(instance, false);
  }

  public V1ResourceQuotaSpecBuilder(V1ResourceQuotaSpec instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withHard(instance.getHard());

    this.withScopeSelector(instance.getScopeSelector());

    this.withScopes(instance.getScopes());

    this.validationEnabled = validationEnabled;
  }

  V1ResourceQuotaSpecFluent<?> fluent;
  Boolean validationEnabled;

  public V1ResourceQuotaSpec build() {
    V1ResourceQuotaSpec buildable = new V1ResourceQuotaSpec();
    buildable.setHard(fluent.getHard());
    buildable.setScopeSelector(fluent.getScopeSelector());
    buildable.setScopes(fluent.getScopes());
    return buildable;
  }
}
