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

public class V1LifecycleBuilder extends V1LifecycleFluentImpl<V1LifecycleBuilder>
    implements VisitableBuilder<V1Lifecycle, V1LifecycleBuilder> {
  public V1LifecycleBuilder() {
    this(false);
  }

  public V1LifecycleBuilder(Boolean validationEnabled) {
    this(new V1Lifecycle(), validationEnabled);
  }

  public V1LifecycleBuilder(V1LifecycleFluent<?> fluent) {
    this(fluent, false);
  }

  public V1LifecycleBuilder(V1LifecycleFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1Lifecycle(), validationEnabled);
  }

  public V1LifecycleBuilder(V1LifecycleFluent<?> fluent, V1Lifecycle instance) {
    this(fluent, instance, false);
  }

  public V1LifecycleBuilder(
      V1LifecycleFluent<?> fluent, V1Lifecycle instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPostStart(instance.getPostStart());

    fluent.withPreStop(instance.getPreStop());

    this.validationEnabled = validationEnabled;
  }

  public V1LifecycleBuilder(V1Lifecycle instance) {
    this(instance, false);
  }

  public V1LifecycleBuilder(V1Lifecycle instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withPostStart(instance.getPostStart());

    this.withPreStop(instance.getPreStop());

    this.validationEnabled = validationEnabled;
  }

  V1LifecycleFluent<?> fluent;
  Boolean validationEnabled;

  public V1Lifecycle build() {
    V1Lifecycle buildable = new V1Lifecycle();
    buildable.setPostStart(fluent.getPostStart());
    buildable.setPreStop(fluent.getPreStop());
    return buildable;
  }
}
