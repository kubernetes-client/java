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

public class V1TCPSocketActionBuilder extends V1TCPSocketActionFluentImpl<V1TCPSocketActionBuilder>
    implements VisitableBuilder<V1TCPSocketAction, V1TCPSocketActionBuilder> {
  public V1TCPSocketActionBuilder() {
    this(false);
  }

  public V1TCPSocketActionBuilder(Boolean validationEnabled) {
    this(new V1TCPSocketAction(), validationEnabled);
  }

  public V1TCPSocketActionBuilder(V1TCPSocketActionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1TCPSocketActionBuilder(V1TCPSocketActionFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1TCPSocketAction(), validationEnabled);
  }

  public V1TCPSocketActionBuilder(V1TCPSocketActionFluent<?> fluent, V1TCPSocketAction instance) {
    this(fluent, instance, false);
  }

  public V1TCPSocketActionBuilder(
      V1TCPSocketActionFluent<?> fluent, V1TCPSocketAction instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withHost(instance.getHost());

    fluent.withPort(instance.getPort());

    this.validationEnabled = validationEnabled;
  }

  public V1TCPSocketActionBuilder(V1TCPSocketAction instance) {
    this(instance, false);
  }

  public V1TCPSocketActionBuilder(V1TCPSocketAction instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withHost(instance.getHost());

    this.withPort(instance.getPort());

    this.validationEnabled = validationEnabled;
  }

  V1TCPSocketActionFluent<?> fluent;
  Boolean validationEnabled;

  public V1TCPSocketAction build() {
    V1TCPSocketAction buildable = new V1TCPSocketAction();
    buildable.setHost(fluent.getHost());
    buildable.setPort(fluent.getPort());
    return buildable;
  }
}
