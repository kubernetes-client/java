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

public class V1alpha1SchedulingBuilder
    extends V1alpha1SchedulingFluentImpl<V1alpha1SchedulingBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1alpha1Scheduling,
        io.kubernetes.client.openapi.models.V1alpha1SchedulingBuilder> {
  public V1alpha1SchedulingBuilder() {
    this(false);
  }

  public V1alpha1SchedulingBuilder(Boolean validationEnabled) {
    this(new V1alpha1Scheduling(), validationEnabled);
  }

  public V1alpha1SchedulingBuilder(V1alpha1SchedulingFluent<?> fluent) {
    this(fluent, false);
  }

  public V1alpha1SchedulingBuilder(
      io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1alpha1Scheduling(), validationEnabled);
  }

  public V1alpha1SchedulingBuilder(
      io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1alpha1Scheduling instance) {
    this(fluent, instance, false);
  }

  public V1alpha1SchedulingBuilder(
      io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1alpha1Scheduling instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withNodeSelector(instance.getNodeSelector());

    fluent.withTolerations(instance.getTolerations());

    this.validationEnabled = validationEnabled;
  }

  public V1alpha1SchedulingBuilder(
      io.kubernetes.client.openapi.models.V1alpha1Scheduling instance) {
    this(instance, false);
  }

  public V1alpha1SchedulingBuilder(
      io.kubernetes.client.openapi.models.V1alpha1Scheduling instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withNodeSelector(instance.getNodeSelector());

    this.withTolerations(instance.getTolerations());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1alpha1Scheduling build() {
    V1alpha1Scheduling buildable = new V1alpha1Scheduling();
    buildable.setNodeSelector(fluent.getNodeSelector());
    buildable.setTolerations(fluent.getTolerations());
    return buildable;
  }
}
