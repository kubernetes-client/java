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

public class V1EvictionBuilder extends V1EvictionFluentImpl<V1EvictionBuilder>
    implements VisitableBuilder<V1Eviction, V1EvictionBuilder> {
  public V1EvictionBuilder() {
    this(false);
  }

  public V1EvictionBuilder(Boolean validationEnabled) {
    this(new V1Eviction(), validationEnabled);
  }

  public V1EvictionBuilder(V1EvictionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1EvictionBuilder(V1EvictionFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1Eviction(), validationEnabled);
  }

  public V1EvictionBuilder(V1EvictionFluent<?> fluent, V1Eviction instance) {
    this(fluent, instance, false);
  }

  public V1EvictionBuilder(
      V1EvictionFluent<?> fluent, V1Eviction instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withDeleteOptions(instance.getDeleteOptions());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  public V1EvictionBuilder(V1Eviction instance) {
    this(instance, false);
  }

  public V1EvictionBuilder(V1Eviction instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withDeleteOptions(instance.getDeleteOptions());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  V1EvictionFluent<?> fluent;
  Boolean validationEnabled;

  public V1Eviction build() {
    V1Eviction buildable = new V1Eviction();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDeleteOptions(fluent.getDeleteOptions());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
}
