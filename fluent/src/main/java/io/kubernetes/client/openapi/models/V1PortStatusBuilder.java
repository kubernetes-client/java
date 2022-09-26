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

public class V1PortStatusBuilder extends V1PortStatusFluentImpl<V1PortStatusBuilder>
    implements VisitableBuilder<V1PortStatus, V1PortStatusBuilder> {
  public V1PortStatusBuilder() {
    this(false);
  }

  public V1PortStatusBuilder(Boolean validationEnabled) {
    this(new V1PortStatus(), validationEnabled);
  }

  public V1PortStatusBuilder(V1PortStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PortStatusBuilder(V1PortStatusFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1PortStatus(), validationEnabled);
  }

  public V1PortStatusBuilder(V1PortStatusFluent<?> fluent, V1PortStatus instance) {
    this(fluent, instance, false);
  }

  public V1PortStatusBuilder(
      V1PortStatusFluent<?> fluent, V1PortStatus instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withError(instance.getError());

    fluent.withPort(instance.getPort());

    fluent.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled;
  }

  public V1PortStatusBuilder(V1PortStatus instance) {
    this(instance, false);
  }

  public V1PortStatusBuilder(V1PortStatus instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withError(instance.getError());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled;
  }

  V1PortStatusFluent<?> fluent;
  Boolean validationEnabled;

  public V1PortStatus build() {
    V1PortStatus buildable = new V1PortStatus();
    buildable.setError(fluent.getError());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
}
