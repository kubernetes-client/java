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

public class V2ContainerResourceMetricStatusBuilder
    extends V2ContainerResourceMetricStatusFluentImpl<V2ContainerResourceMetricStatusBuilder>
    implements VisitableBuilder<
        V2ContainerResourceMetricStatus, V2ContainerResourceMetricStatusBuilder> {
  public V2ContainerResourceMetricStatusBuilder() {
    this(false);
  }

  public V2ContainerResourceMetricStatusBuilder(Boolean validationEnabled) {
    this(new V2ContainerResourceMetricStatus(), validationEnabled);
  }

  public V2ContainerResourceMetricStatusBuilder(V2ContainerResourceMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V2ContainerResourceMetricStatusBuilder(
      V2ContainerResourceMetricStatusFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V2ContainerResourceMetricStatus(), validationEnabled);
  }

  public V2ContainerResourceMetricStatusBuilder(
      V2ContainerResourceMetricStatusFluent<?> fluent, V2ContainerResourceMetricStatus instance) {
    this(fluent, instance, false);
  }

  public V2ContainerResourceMetricStatusBuilder(
      V2ContainerResourceMetricStatusFluent<?> fluent,
      V2ContainerResourceMetricStatus instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withContainer(instance.getContainer());

    fluent.withCurrent(instance.getCurrent());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  public V2ContainerResourceMetricStatusBuilder(V2ContainerResourceMetricStatus instance) {
    this(instance, false);
  }

  public V2ContainerResourceMetricStatusBuilder(
      V2ContainerResourceMetricStatus instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withContainer(instance.getContainer());

    this.withCurrent(instance.getCurrent());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  V2ContainerResourceMetricStatusFluent<?> fluent;
  Boolean validationEnabled;

  public V2ContainerResourceMetricStatus build() {
    V2ContainerResourceMetricStatus buildable = new V2ContainerResourceMetricStatus();
    buildable.setContainer(fluent.getContainer());
    buildable.setCurrent(fluent.getCurrent());
    buildable.setName(fluent.getName());
    return buildable;
  }
}
