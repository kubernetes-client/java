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

public class V1beta1FlowDistinguisherMethodBuilder
    extends V1beta1FlowDistinguisherMethodFluentImpl<V1beta1FlowDistinguisherMethodBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethod,
        io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethodBuilder> {
  public V1beta1FlowDistinguisherMethodBuilder() {
    this(false);
  }

  public V1beta1FlowDistinguisherMethodBuilder(Boolean validationEnabled) {
    this(new V1beta1FlowDistinguisherMethod(), validationEnabled);
  }

  public V1beta1FlowDistinguisherMethodBuilder(V1beta1FlowDistinguisherMethodFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1FlowDistinguisherMethodBuilder(
      io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethodFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1FlowDistinguisherMethod(), validationEnabled);
  }

  public V1beta1FlowDistinguisherMethodBuilder(
      io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethodFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethod instance) {
    this(fluent, instance, false);
  }

  public V1beta1FlowDistinguisherMethodBuilder(
      io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethodFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethod instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1FlowDistinguisherMethodBuilder(
      io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethod instance) {
    this(instance, false);
  }

  public V1beta1FlowDistinguisherMethodBuilder(
      io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethod instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethodFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethod build() {
    V1beta1FlowDistinguisherMethod buildable = new V1beta1FlowDistinguisherMethod();
    buildable.setType(fluent.getType());
    return buildable;
  }
}
