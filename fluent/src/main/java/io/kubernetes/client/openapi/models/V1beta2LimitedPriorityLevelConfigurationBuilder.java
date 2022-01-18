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

public class V1beta2LimitedPriorityLevelConfigurationBuilder
    extends io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluentImpl<
        io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfiguration,
        io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationBuilder> {
  public V1beta2LimitedPriorityLevelConfigurationBuilder() {
    this(false);
  }

  public V1beta2LimitedPriorityLevelConfigurationBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta2LimitedPriorityLevelConfiguration(), validationEnabled);
  }

  public V1beta2LimitedPriorityLevelConfigurationBuilder(
      io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent<?>
          fluent) {
    this(fluent, false);
  }

  public V1beta2LimitedPriorityLevelConfigurationBuilder(
      io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2LimitedPriorityLevelConfiguration(), validationEnabled);
  }

  public V1beta2LimitedPriorityLevelConfigurationBuilder(
      io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfiguration instance) {
    this(fluent, instance, false);
  }

  public V1beta2LimitedPriorityLevelConfigurationBuilder(
      io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfiguration instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAssuredConcurrencyShares(instance.getAssuredConcurrencyShares());

    fluent.withLimitResponse(instance.getLimitResponse());

    this.validationEnabled = validationEnabled;
  }

  public V1beta2LimitedPriorityLevelConfigurationBuilder(
      io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfiguration instance) {
    this(instance, false);
  }

  public V1beta2LimitedPriorityLevelConfigurationBuilder(
      io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfiguration instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAssuredConcurrencyShares(instance.getAssuredConcurrencyShares());

    this.withLimitResponse(instance.getLimitResponse());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfiguration build() {
    V1beta2LimitedPriorityLevelConfiguration buildable =
        new V1beta2LimitedPriorityLevelConfiguration();
    buildable.setAssuredConcurrencyShares(fluent.getAssuredConcurrencyShares());
    buildable.setLimitResponse(fluent.getLimitResponse());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2LimitedPriorityLevelConfigurationBuilder that =
        (V1beta2LimitedPriorityLevelConfigurationBuilder) o;
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
