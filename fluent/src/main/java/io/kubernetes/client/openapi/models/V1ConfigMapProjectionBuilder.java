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

public class V1ConfigMapProjectionBuilder
    extends V1ConfigMapProjectionFluentImpl<V1ConfigMapProjectionBuilder>
    implements VisitableBuilder<V1ConfigMapProjection, V1ConfigMapProjectionBuilder> {
  public V1ConfigMapProjectionBuilder() {
    this(false);
  }

  public V1ConfigMapProjectionBuilder(Boolean validationEnabled) {
    this(new V1ConfigMapProjection(), validationEnabled);
  }

  public V1ConfigMapProjectionBuilder(V1ConfigMapProjectionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ConfigMapProjectionBuilder(
      V1ConfigMapProjectionFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ConfigMapProjection(), validationEnabled);
  }

  public V1ConfigMapProjectionBuilder(
      V1ConfigMapProjectionFluent<?> fluent, V1ConfigMapProjection instance) {
    this(fluent, instance, false);
  }

  public V1ConfigMapProjectionBuilder(
      V1ConfigMapProjectionFluent<?> fluent,
      V1ConfigMapProjection instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withItems(instance.getItems());

    fluent.withName(instance.getName());

    fluent.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled;
  }

  public V1ConfigMapProjectionBuilder(V1ConfigMapProjection instance) {
    this(instance, false);
  }

  public V1ConfigMapProjectionBuilder(V1ConfigMapProjection instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withItems(instance.getItems());

    this.withName(instance.getName());

    this.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled;
  }

  V1ConfigMapProjectionFluent<?> fluent;
  Boolean validationEnabled;

  public V1ConfigMapProjection build() {
    V1ConfigMapProjection buildable = new V1ConfigMapProjection();
    buildable.setItems(fluent.getItems());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
}
