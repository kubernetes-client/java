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

public class V1ObjectFieldSelectorBuilder
    extends V1ObjectFieldSelectorFluentImpl<V1ObjectFieldSelectorBuilder>
    implements VisitableBuilder<V1ObjectFieldSelector, V1ObjectFieldSelectorBuilder> {
  public V1ObjectFieldSelectorBuilder() {
    this(false);
  }

  public V1ObjectFieldSelectorBuilder(Boolean validationEnabled) {
    this(new V1ObjectFieldSelector(), validationEnabled);
  }

  public V1ObjectFieldSelectorBuilder(V1ObjectFieldSelectorFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ObjectFieldSelectorBuilder(
      V1ObjectFieldSelectorFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ObjectFieldSelector(), validationEnabled);
  }

  public V1ObjectFieldSelectorBuilder(
      V1ObjectFieldSelectorFluent<?> fluent, V1ObjectFieldSelector instance) {
    this(fluent, instance, false);
  }

  public V1ObjectFieldSelectorBuilder(
      V1ObjectFieldSelectorFluent<?> fluent,
      V1ObjectFieldSelector instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withFieldPath(instance.getFieldPath());

    this.validationEnabled = validationEnabled;
  }

  public V1ObjectFieldSelectorBuilder(V1ObjectFieldSelector instance) {
    this(instance, false);
  }

  public V1ObjectFieldSelectorBuilder(V1ObjectFieldSelector instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withFieldPath(instance.getFieldPath());

    this.validationEnabled = validationEnabled;
  }

  V1ObjectFieldSelectorFluent<?> fluent;
  Boolean validationEnabled;

  public V1ObjectFieldSelector build() {
    V1ObjectFieldSelector buildable = new V1ObjectFieldSelector();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setFieldPath(fluent.getFieldPath());
    return buildable;
  }
}
