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

public class V1IngressStatusBuilder extends V1IngressStatusFluentImpl<V1IngressStatusBuilder>
    implements VisitableBuilder<V1IngressStatus, V1IngressStatusBuilder> {
  public V1IngressStatusBuilder() {
    this(false);
  }

  public V1IngressStatusBuilder(Boolean validationEnabled) {
    this(new V1IngressStatus(), validationEnabled);
  }

  public V1IngressStatusBuilder(V1IngressStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1IngressStatusBuilder(V1IngressStatusFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1IngressStatus(), validationEnabled);
  }

  public V1IngressStatusBuilder(V1IngressStatusFluent<?> fluent, V1IngressStatus instance) {
    this(fluent, instance, false);
  }

  public V1IngressStatusBuilder(
      V1IngressStatusFluent<?> fluent, V1IngressStatus instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withLoadBalancer(instance.getLoadBalancer());

    this.validationEnabled = validationEnabled;
  }

  public V1IngressStatusBuilder(V1IngressStatus instance) {
    this(instance, false);
  }

  public V1IngressStatusBuilder(V1IngressStatus instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withLoadBalancer(instance.getLoadBalancer());

    this.validationEnabled = validationEnabled;
  }

  V1IngressStatusFluent<?> fluent;
  Boolean validationEnabled;

  public V1IngressStatus build() {
    V1IngressStatus buildable = new V1IngressStatus();
    buildable.setLoadBalancer(fluent.getLoadBalancer());
    return buildable;
  }
}
