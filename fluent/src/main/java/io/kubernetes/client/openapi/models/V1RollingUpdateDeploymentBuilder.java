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

public class V1RollingUpdateDeploymentBuilder
    extends V1RollingUpdateDeploymentFluentImpl<V1RollingUpdateDeploymentBuilder>
    implements VisitableBuilder<V1RollingUpdateDeployment, V1RollingUpdateDeploymentBuilder> {
  public V1RollingUpdateDeploymentBuilder() {
    this(false);
  }

  public V1RollingUpdateDeploymentBuilder(Boolean validationEnabled) {
    this(new V1RollingUpdateDeployment(), validationEnabled);
  }

  public V1RollingUpdateDeploymentBuilder(V1RollingUpdateDeploymentFluent<?> fluent) {
    this(fluent, false);
  }

  public V1RollingUpdateDeploymentBuilder(
      V1RollingUpdateDeploymentFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1RollingUpdateDeployment(), validationEnabled);
  }

  public V1RollingUpdateDeploymentBuilder(
      V1RollingUpdateDeploymentFluent<?> fluent, V1RollingUpdateDeployment instance) {
    this(fluent, instance, false);
  }

  public V1RollingUpdateDeploymentBuilder(
      V1RollingUpdateDeploymentFluent<?> fluent,
      V1RollingUpdateDeployment instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMaxSurge(instance.getMaxSurge());

    fluent.withMaxUnavailable(instance.getMaxUnavailable());

    this.validationEnabled = validationEnabled;
  }

  public V1RollingUpdateDeploymentBuilder(V1RollingUpdateDeployment instance) {
    this(instance, false);
  }

  public V1RollingUpdateDeploymentBuilder(
      V1RollingUpdateDeployment instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withMaxSurge(instance.getMaxSurge());

    this.withMaxUnavailable(instance.getMaxUnavailable());

    this.validationEnabled = validationEnabled;
  }

  V1RollingUpdateDeploymentFluent<?> fluent;
  Boolean validationEnabled;

  public V1RollingUpdateDeployment build() {
    V1RollingUpdateDeployment buildable = new V1RollingUpdateDeployment();
    buildable.setMaxSurge(fluent.getMaxSurge());
    buildable.setMaxUnavailable(fluent.getMaxUnavailable());
    return buildable;
  }
}
