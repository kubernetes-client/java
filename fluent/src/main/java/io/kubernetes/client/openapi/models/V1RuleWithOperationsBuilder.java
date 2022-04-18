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

public class V1RuleWithOperationsBuilder
    extends V1RuleWithOperationsFluentImpl<V1RuleWithOperationsBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1RuleWithOperations,
        io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder> {
  public V1RuleWithOperationsBuilder() {
    this(false);
  }

  public V1RuleWithOperationsBuilder(Boolean validationEnabled) {
    this(new V1RuleWithOperations(), validationEnabled);
  }

  public V1RuleWithOperationsBuilder(V1RuleWithOperationsFluent<?> fluent) {
    this(fluent, false);
  }

  public V1RuleWithOperationsBuilder(
      io.kubernetes.client.openapi.models.V1RuleWithOperationsFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1RuleWithOperations(), validationEnabled);
  }

  public V1RuleWithOperationsBuilder(
      io.kubernetes.client.openapi.models.V1RuleWithOperationsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1RuleWithOperations instance) {
    this(fluent, instance, false);
  }

  public V1RuleWithOperationsBuilder(
      io.kubernetes.client.openapi.models.V1RuleWithOperationsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1RuleWithOperations instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiGroups(instance.getApiGroups());

    fluent.withApiVersions(instance.getApiVersions());

    fluent.withOperations(instance.getOperations());

    fluent.withResources(instance.getResources());

    fluent.withScope(instance.getScope());

    this.validationEnabled = validationEnabled;
  }

  public V1RuleWithOperationsBuilder(
      io.kubernetes.client.openapi.models.V1RuleWithOperations instance) {
    this(instance, false);
  }

  public V1RuleWithOperationsBuilder(
      io.kubernetes.client.openapi.models.V1RuleWithOperations instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiGroups(instance.getApiGroups());

    this.withApiVersions(instance.getApiVersions());

    this.withOperations(instance.getOperations());

    this.withResources(instance.getResources());

    this.withScope(instance.getScope());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1RuleWithOperationsFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1RuleWithOperations build() {
    V1RuleWithOperations buildable = new V1RuleWithOperations();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setApiVersions(fluent.getApiVersions());
    buildable.setOperations(fluent.getOperations());
    buildable.setResources(fluent.getResources());
    buildable.setScope(fluent.getScope());
    return buildable;
  }
}
