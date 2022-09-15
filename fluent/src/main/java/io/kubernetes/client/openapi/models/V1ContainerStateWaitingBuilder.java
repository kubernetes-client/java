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

public class V1ContainerStateWaitingBuilder
    extends V1ContainerStateWaitingFluentImpl<V1ContainerStateWaitingBuilder>
    implements VisitableBuilder<V1ContainerStateWaiting, V1ContainerStateWaitingBuilder> {
  public V1ContainerStateWaitingBuilder() {
    this(false);
  }

  public V1ContainerStateWaitingBuilder(Boolean validationEnabled) {
    this(new V1ContainerStateWaiting(), validationEnabled);
  }

  public V1ContainerStateWaitingBuilder(V1ContainerStateWaitingFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ContainerStateWaitingBuilder(
      V1ContainerStateWaitingFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ContainerStateWaiting(), validationEnabled);
  }

  public V1ContainerStateWaitingBuilder(
      V1ContainerStateWaitingFluent<?> fluent, V1ContainerStateWaiting instance) {
    this(fluent, instance, false);
  }

  public V1ContainerStateWaitingBuilder(
      V1ContainerStateWaitingFluent<?> fluent,
      V1ContainerStateWaiting instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    this.validationEnabled = validationEnabled;
  }

  public V1ContainerStateWaitingBuilder(V1ContainerStateWaiting instance) {
    this(instance, false);
  }

  public V1ContainerStateWaitingBuilder(
      V1ContainerStateWaiting instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.validationEnabled = validationEnabled;
  }

  V1ContainerStateWaitingFluent<?> fluent;
  Boolean validationEnabled;

  public V1ContainerStateWaiting build() {
    V1ContainerStateWaiting buildable = new V1ContainerStateWaiting();
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
}
