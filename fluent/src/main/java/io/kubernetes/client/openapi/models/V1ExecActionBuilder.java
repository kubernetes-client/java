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

public class V1ExecActionBuilder extends V1ExecActionFluentImpl<V1ExecActionBuilder>
    implements VisitableBuilder<
        V1ExecAction, io.kubernetes.client.openapi.models.V1ExecActionBuilder> {
  public V1ExecActionBuilder() {
    this(false);
  }

  public V1ExecActionBuilder(Boolean validationEnabled) {
    this(new V1ExecAction(), validationEnabled);
  }

  public V1ExecActionBuilder(io.kubernetes.client.openapi.models.V1ExecActionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ExecActionBuilder(
      io.kubernetes.client.openapi.models.V1ExecActionFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ExecAction(), validationEnabled);
  }

  public V1ExecActionBuilder(
      io.kubernetes.client.openapi.models.V1ExecActionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ExecAction instance) {
    this(fluent, instance, false);
  }

  public V1ExecActionBuilder(
      io.kubernetes.client.openapi.models.V1ExecActionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ExecAction instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCommand(instance.getCommand());

    this.validationEnabled = validationEnabled;
  }

  public V1ExecActionBuilder(io.kubernetes.client.openapi.models.V1ExecAction instance) {
    this(instance, false);
  }

  public V1ExecActionBuilder(
      io.kubernetes.client.openapi.models.V1ExecAction instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withCommand(instance.getCommand());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ExecActionFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ExecAction build() {
    V1ExecAction buildable = new V1ExecAction();
    buildable.setCommand(fluent.getCommand());
    return buildable;
  }
}
