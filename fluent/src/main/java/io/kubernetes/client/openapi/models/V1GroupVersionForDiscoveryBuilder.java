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

public class V1GroupVersionForDiscoveryBuilder
    extends V1GroupVersionForDiscoveryFluentImpl<V1GroupVersionForDiscoveryBuilder>
    implements VisitableBuilder<V1GroupVersionForDiscovery, V1GroupVersionForDiscoveryBuilder> {
  public V1GroupVersionForDiscoveryBuilder() {
    this(false);
  }

  public V1GroupVersionForDiscoveryBuilder(Boolean validationEnabled) {
    this(new V1GroupVersionForDiscovery(), validationEnabled);
  }

  public V1GroupVersionForDiscoveryBuilder(V1GroupVersionForDiscoveryFluent<?> fluent) {
    this(fluent, false);
  }

  public V1GroupVersionForDiscoveryBuilder(
      V1GroupVersionForDiscoveryFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1GroupVersionForDiscovery(), validationEnabled);
  }

  public V1GroupVersionForDiscoveryBuilder(
      V1GroupVersionForDiscoveryFluent<?> fluent, V1GroupVersionForDiscovery instance) {
    this(fluent, instance, false);
  }

  public V1GroupVersionForDiscoveryBuilder(
      V1GroupVersionForDiscoveryFluent<?> fluent,
      V1GroupVersionForDiscovery instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withGroupVersion(instance.getGroupVersion());

    fluent.withVersion(instance.getVersion());

    this.validationEnabled = validationEnabled;
  }

  public V1GroupVersionForDiscoveryBuilder(V1GroupVersionForDiscovery instance) {
    this(instance, false);
  }

  public V1GroupVersionForDiscoveryBuilder(
      V1GroupVersionForDiscovery instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withGroupVersion(instance.getGroupVersion());

    this.withVersion(instance.getVersion());

    this.validationEnabled = validationEnabled;
  }

  V1GroupVersionForDiscoveryFluent<?> fluent;
  Boolean validationEnabled;

  public V1GroupVersionForDiscovery build() {
    V1GroupVersionForDiscovery buildable = new V1GroupVersionForDiscovery();
    buildable.setGroupVersion(fluent.getGroupVersion());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
}
