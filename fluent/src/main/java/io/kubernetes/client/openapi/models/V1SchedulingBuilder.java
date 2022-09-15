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

public class V1SchedulingBuilder extends V1SchedulingFluentImpl<V1SchedulingBuilder>
    implements VisitableBuilder<V1Scheduling, V1SchedulingBuilder> {
  public V1SchedulingBuilder() {
    this(false);
  }

  public V1SchedulingBuilder(Boolean validationEnabled) {
    this(new V1Scheduling(), validationEnabled);
  }

  public V1SchedulingBuilder(V1SchedulingFluent<?> fluent) {
    this(fluent, false);
  }

  public V1SchedulingBuilder(V1SchedulingFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1Scheduling(), validationEnabled);
  }

  public V1SchedulingBuilder(V1SchedulingFluent<?> fluent, V1Scheduling instance) {
    this(fluent, instance, false);
  }

  public V1SchedulingBuilder(
      V1SchedulingFluent<?> fluent, V1Scheduling instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withNodeSelector(instance.getNodeSelector());

    fluent.withTolerations(instance.getTolerations());

    this.validationEnabled = validationEnabled;
  }

  public V1SchedulingBuilder(V1Scheduling instance) {
    this(instance, false);
  }

  public V1SchedulingBuilder(V1Scheduling instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withNodeSelector(instance.getNodeSelector());

    this.withTolerations(instance.getTolerations());

    this.validationEnabled = validationEnabled;
  }

  V1SchedulingFluent<?> fluent;
  Boolean validationEnabled;

  public V1Scheduling build() {
    V1Scheduling buildable = new V1Scheduling();
    buildable.setNodeSelector(fluent.getNodeSelector());
    buildable.setTolerations(fluent.getTolerations());
    return buildable;
  }
}
