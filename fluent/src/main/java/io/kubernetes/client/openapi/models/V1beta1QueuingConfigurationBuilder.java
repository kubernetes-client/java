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

public class V1beta1QueuingConfigurationBuilder
    extends V1beta1QueuingConfigurationFluentImpl<V1beta1QueuingConfigurationBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1QueuingConfiguration,
        io.kubernetes.client.openapi.models.V1beta1QueuingConfigurationBuilder> {
  public V1beta1QueuingConfigurationBuilder() {
    this(false);
  }

  public V1beta1QueuingConfigurationBuilder(Boolean validationEnabled) {
    this(new V1beta1QueuingConfiguration(), validationEnabled);
  }

  public V1beta1QueuingConfigurationBuilder(V1beta1QueuingConfigurationFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1QueuingConfigurationBuilder(
      io.kubernetes.client.openapi.models.V1beta1QueuingConfigurationFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1QueuingConfiguration(), validationEnabled);
  }

  public V1beta1QueuingConfigurationBuilder(
      io.kubernetes.client.openapi.models.V1beta1QueuingConfigurationFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1QueuingConfiguration instance) {
    this(fluent, instance, false);
  }

  public V1beta1QueuingConfigurationBuilder(
      io.kubernetes.client.openapi.models.V1beta1QueuingConfigurationFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1QueuingConfiguration instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withHandSize(instance.getHandSize());

    fluent.withQueueLengthLimit(instance.getQueueLengthLimit());

    fluent.withQueues(instance.getQueues());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1QueuingConfigurationBuilder(
      io.kubernetes.client.openapi.models.V1beta1QueuingConfiguration instance) {
    this(instance, false);
  }

  public V1beta1QueuingConfigurationBuilder(
      io.kubernetes.client.openapi.models.V1beta1QueuingConfiguration instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withHandSize(instance.getHandSize());

    this.withQueueLengthLimit(instance.getQueueLengthLimit());

    this.withQueues(instance.getQueues());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1QueuingConfigurationFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1QueuingConfiguration build() {
    V1beta1QueuingConfiguration buildable = new V1beta1QueuingConfiguration();
    buildable.setHandSize(fluent.getHandSize());
    buildable.setQueueLengthLimit(fluent.getQueueLengthLimit());
    buildable.setQueues(fluent.getQueues());
    return buildable;
  }
}
