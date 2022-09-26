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

public class V1EventSourceBuilder extends V1EventSourceFluentImpl<V1EventSourceBuilder>
    implements VisitableBuilder<V1EventSource, V1EventSourceBuilder> {
  public V1EventSourceBuilder() {
    this(false);
  }

  public V1EventSourceBuilder(Boolean validationEnabled) {
    this(new V1EventSource(), validationEnabled);
  }

  public V1EventSourceBuilder(V1EventSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1EventSourceBuilder(V1EventSourceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1EventSource(), validationEnabled);
  }

  public V1EventSourceBuilder(V1EventSourceFluent<?> fluent, V1EventSource instance) {
    this(fluent, instance, false);
  }

  public V1EventSourceBuilder(
      V1EventSourceFluent<?> fluent, V1EventSource instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withComponent(instance.getComponent());

    fluent.withHost(instance.getHost());

    this.validationEnabled = validationEnabled;
  }

  public V1EventSourceBuilder(V1EventSource instance) {
    this(instance, false);
  }

  public V1EventSourceBuilder(V1EventSource instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withComponent(instance.getComponent());

    this.withHost(instance.getHost());

    this.validationEnabled = validationEnabled;
  }

  V1EventSourceFluent<?> fluent;
  Boolean validationEnabled;

  public V1EventSource build() {
    V1EventSource buildable = new V1EventSource();
    buildable.setComponent(fluent.getComponent());
    buildable.setHost(fluent.getHost());
    return buildable;
  }
}
