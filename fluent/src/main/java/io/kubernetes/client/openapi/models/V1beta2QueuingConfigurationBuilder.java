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

public class V1beta2QueuingConfigurationBuilder
    extends io.kubernetes.client.openapi.models.V1beta2QueuingConfigurationFluentImpl<
        io.kubernetes.client.openapi.models.V1beta2QueuingConfigurationBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta2QueuingConfiguration,
        io.kubernetes.client.openapi.models.V1beta2QueuingConfigurationBuilder> {
  public V1beta2QueuingConfigurationBuilder() {
    this(false);
  }

  public V1beta2QueuingConfigurationBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta2QueuingConfiguration(), validationEnabled);
  }

  public V1beta2QueuingConfigurationBuilder(
      io.kubernetes.client.openapi.models.V1beta2QueuingConfigurationFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta2QueuingConfigurationBuilder(
      io.kubernetes.client.openapi.models.V1beta2QueuingConfigurationFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2QueuingConfiguration(), validationEnabled);
  }

  public V1beta2QueuingConfigurationBuilder(
      io.kubernetes.client.openapi.models.V1beta2QueuingConfigurationFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta2QueuingConfiguration instance) {
    this(fluent, instance, false);
  }

  public V1beta2QueuingConfigurationBuilder(
      io.kubernetes.client.openapi.models.V1beta2QueuingConfigurationFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta2QueuingConfiguration instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withHandSize(instance.getHandSize());

    fluent.withQueueLengthLimit(instance.getQueueLengthLimit());

    fluent.withQueues(instance.getQueues());

    this.validationEnabled = validationEnabled;
  }

  public V1beta2QueuingConfigurationBuilder(
      io.kubernetes.client.openapi.models.V1beta2QueuingConfiguration instance) {
    this(instance, false);
  }

  public V1beta2QueuingConfigurationBuilder(
      io.kubernetes.client.openapi.models.V1beta2QueuingConfiguration instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withHandSize(instance.getHandSize());

    this.withQueueLengthLimit(instance.getQueueLengthLimit());

    this.withQueues(instance.getQueues());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta2QueuingConfigurationFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta2QueuingConfiguration build() {
    V1beta2QueuingConfiguration buildable = new V1beta2QueuingConfiguration();
    buildable.setHandSize(fluent.getHandSize());
    buildable.setQueueLengthLimit(fluent.getQueueLengthLimit());
    buildable.setQueues(fluent.getQueues());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2QueuingConfigurationBuilder that = (V1beta2QueuingConfigurationBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
