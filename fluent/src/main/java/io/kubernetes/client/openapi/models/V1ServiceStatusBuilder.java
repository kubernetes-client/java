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

public class V1ServiceStatusBuilder extends V1ServiceStatusFluentImpl<V1ServiceStatusBuilder>
    implements VisitableBuilder<V1ServiceStatus, V1ServiceStatusBuilder> {
  public V1ServiceStatusBuilder() {
    this(false);
  }

  public V1ServiceStatusBuilder(Boolean validationEnabled) {
    this(new V1ServiceStatus(), validationEnabled);
  }

  public V1ServiceStatusBuilder(V1ServiceStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ServiceStatusBuilder(V1ServiceStatusFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ServiceStatus(), validationEnabled);
  }

  public V1ServiceStatusBuilder(V1ServiceStatusFluent<?> fluent, V1ServiceStatus instance) {
    this(fluent, instance, false);
  }

  public V1ServiceStatusBuilder(
      V1ServiceStatusFluent<?> fluent, V1ServiceStatus instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withConditions(instance.getConditions());

    fluent.withLoadBalancer(instance.getLoadBalancer());

    this.validationEnabled = validationEnabled;
  }

  public V1ServiceStatusBuilder(V1ServiceStatus instance) {
    this(instance, false);
  }

  public V1ServiceStatusBuilder(V1ServiceStatus instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withConditions(instance.getConditions());

    this.withLoadBalancer(instance.getLoadBalancer());

    this.validationEnabled = validationEnabled;
  }

  V1ServiceStatusFluent<?> fluent;
  Boolean validationEnabled;

  public V1ServiceStatus build() {
    V1ServiceStatus buildable = new V1ServiceStatus();
    buildable.setConditions(fluent.getConditions());
    buildable.setLoadBalancer(fluent.getLoadBalancer());
    return buildable;
  }
}
