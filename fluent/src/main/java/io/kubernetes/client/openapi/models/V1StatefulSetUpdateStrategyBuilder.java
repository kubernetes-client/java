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

public class V1StatefulSetUpdateStrategyBuilder
    extends V1StatefulSetUpdateStrategyFluentImpl<V1StatefulSetUpdateStrategyBuilder>
    implements VisitableBuilder<V1StatefulSetUpdateStrategy, V1StatefulSetUpdateStrategyBuilder> {
  public V1StatefulSetUpdateStrategyBuilder() {
    this(false);
  }

  public V1StatefulSetUpdateStrategyBuilder(Boolean validationEnabled) {
    this(new V1StatefulSetUpdateStrategy(), validationEnabled);
  }

  public V1StatefulSetUpdateStrategyBuilder(V1StatefulSetUpdateStrategyFluent<?> fluent) {
    this(fluent, false);
  }

  public V1StatefulSetUpdateStrategyBuilder(
      V1StatefulSetUpdateStrategyFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1StatefulSetUpdateStrategy(), validationEnabled);
  }

  public V1StatefulSetUpdateStrategyBuilder(
      V1StatefulSetUpdateStrategyFluent<?> fluent, V1StatefulSetUpdateStrategy instance) {
    this(fluent, instance, false);
  }

  public V1StatefulSetUpdateStrategyBuilder(
      V1StatefulSetUpdateStrategyFluent<?> fluent,
      V1StatefulSetUpdateStrategy instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withRollingUpdate(instance.getRollingUpdate());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1StatefulSetUpdateStrategyBuilder(V1StatefulSetUpdateStrategy instance) {
    this(instance, false);
  }

  public V1StatefulSetUpdateStrategyBuilder(
      V1StatefulSetUpdateStrategy instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withRollingUpdate(instance.getRollingUpdate());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  V1StatefulSetUpdateStrategyFluent<?> fluent;
  Boolean validationEnabled;

  public V1StatefulSetUpdateStrategy build() {
    V1StatefulSetUpdateStrategy buildable = new V1StatefulSetUpdateStrategy();
    buildable.setRollingUpdate(fluent.getRollingUpdate());
    buildable.setType(fluent.getType());
    return buildable;
  }
}
