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

public class V2MetricStatusBuilder extends V2MetricStatusFluentImpl<V2MetricStatusBuilder>
    implements VisitableBuilder<V2MetricStatus, V2MetricStatusBuilder> {
  public V2MetricStatusBuilder() {
    this(false);
  }

  public V2MetricStatusBuilder(Boolean validationEnabled) {
    this(new V2MetricStatus(), validationEnabled);
  }

  public V2MetricStatusBuilder(V2MetricStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V2MetricStatusBuilder(V2MetricStatusFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V2MetricStatus(), validationEnabled);
  }

  public V2MetricStatusBuilder(V2MetricStatusFluent<?> fluent, V2MetricStatus instance) {
    this(fluent, instance, false);
  }

  public V2MetricStatusBuilder(
      V2MetricStatusFluent<?> fluent, V2MetricStatus instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withContainerResource(instance.getContainerResource());

    fluent.withExternal(instance.getExternal());

    fluent.withObject(instance.getObject());

    fluent.withPods(instance.getPods());

    fluent.withResource(instance.getResource());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V2MetricStatusBuilder(V2MetricStatus instance) {
    this(instance, false);
  }

  public V2MetricStatusBuilder(V2MetricStatus instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withContainerResource(instance.getContainerResource());

    this.withExternal(instance.getExternal());

    this.withObject(instance.getObject());

    this.withPods(instance.getPods());

    this.withResource(instance.getResource());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  V2MetricStatusFluent<?> fluent;
  Boolean validationEnabled;

  public V2MetricStatus build() {
    V2MetricStatus buildable = new V2MetricStatus();
    buildable.setContainerResource(fluent.getContainerResource());
    buildable.setExternal(fluent.getExternal());
    buildable.setObject(fluent.getObject());
    buildable.setPods(fluent.getPods());
    buildable.setResource(fluent.getResource());
    buildable.setType(fluent.getType());
    return buildable;
  }
}
