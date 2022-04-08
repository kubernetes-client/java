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

public class V1beta1EndpointHintsBuilder
    extends V1beta1EndpointHintsFluentImpl<V1beta1EndpointHintsBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1EndpointHints,
        io.kubernetes.client.openapi.models.V1beta1EndpointHintsBuilder> {
  public V1beta1EndpointHintsBuilder() {
    this(false);
  }

  public V1beta1EndpointHintsBuilder(Boolean validationEnabled) {
    this(new V1beta1EndpointHints(), validationEnabled);
  }

  public V1beta1EndpointHintsBuilder(V1beta1EndpointHintsFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1EndpointHintsBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1EndpointHints(), validationEnabled);
  }

  public V1beta1EndpointHintsBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1EndpointHints instance) {
    this(fluent, instance, false);
  }

  public V1beta1EndpointHintsBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1EndpointHints instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withForZones(instance.getForZones());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1EndpointHintsBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointHints instance) {
    this(instance, false);
  }

  public V1beta1EndpointHintsBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointHints instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withForZones(instance.getForZones());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1EndpointHints build() {
    V1beta1EndpointHints buildable = new V1beta1EndpointHints();
    buildable.setForZones(fluent.getForZones());
    return buildable;
  }
}
