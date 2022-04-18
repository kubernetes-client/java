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

public class V1alpha1OverheadBuilder extends V1alpha1OverheadFluentImpl<V1alpha1OverheadBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1alpha1Overhead, V1alpha1OverheadBuilder> {
  public V1alpha1OverheadBuilder() {
    this(false);
  }

  public V1alpha1OverheadBuilder(Boolean validationEnabled) {
    this(new V1alpha1Overhead(), validationEnabled);
  }

  public V1alpha1OverheadBuilder(V1alpha1OverheadFluent<?> fluent) {
    this(fluent, false);
  }

  public V1alpha1OverheadBuilder(
      io.kubernetes.client.openapi.models.V1alpha1OverheadFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1alpha1Overhead(), validationEnabled);
  }

  public V1alpha1OverheadBuilder(
      io.kubernetes.client.openapi.models.V1alpha1OverheadFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1alpha1Overhead instance) {
    this(fluent, instance, false);
  }

  public V1alpha1OverheadBuilder(
      io.kubernetes.client.openapi.models.V1alpha1OverheadFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1alpha1Overhead instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPodFixed(instance.getPodFixed());

    this.validationEnabled = validationEnabled;
  }

  public V1alpha1OverheadBuilder(io.kubernetes.client.openapi.models.V1alpha1Overhead instance) {
    this(instance, false);
  }

  public V1alpha1OverheadBuilder(
      io.kubernetes.client.openapi.models.V1alpha1Overhead instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withPodFixed(instance.getPodFixed());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1alpha1OverheadFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1alpha1Overhead build() {
    V1alpha1Overhead buildable = new V1alpha1Overhead();
    buildable.setPodFixed(fluent.getPodFixed());
    return buildable;
  }
}
