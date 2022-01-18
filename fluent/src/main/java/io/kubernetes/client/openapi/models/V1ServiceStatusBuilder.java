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

public class V1ServiceStatusBuilder
    extends io.kubernetes.client.openapi.models.V1ServiceStatusFluentImpl<
        io.kubernetes.client.openapi.models.V1ServiceStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ServiceStatus,
        io.kubernetes.client.openapi.models.V1ServiceStatusBuilder> {
  public V1ServiceStatusBuilder() {
    this(false);
  }

  public V1ServiceStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ServiceStatus(), validationEnabled);
  }

  public V1ServiceStatusBuilder(
      io.kubernetes.client.openapi.models.V1ServiceStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ServiceStatusBuilder(
      io.kubernetes.client.openapi.models.V1ServiceStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ServiceStatus(), validationEnabled);
  }

  public V1ServiceStatusBuilder(
      io.kubernetes.client.openapi.models.V1ServiceStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ServiceStatus instance) {
    this(fluent, instance, false);
  }

  public V1ServiceStatusBuilder(
      io.kubernetes.client.openapi.models.V1ServiceStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ServiceStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withConditions(instance.getConditions());

    fluent.withLoadBalancer(instance.getLoadBalancer());

    this.validationEnabled = validationEnabled;
  }

  public V1ServiceStatusBuilder(io.kubernetes.client.openapi.models.V1ServiceStatus instance) {
    this(instance, false);
  }

  public V1ServiceStatusBuilder(
      io.kubernetes.client.openapi.models.V1ServiceStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withConditions(instance.getConditions());

    this.withLoadBalancer(instance.getLoadBalancer());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ServiceStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ServiceStatus build() {
    V1ServiceStatus buildable = new V1ServiceStatus();
    buildable.setConditions(fluent.getConditions());
    buildable.setLoadBalancer(fluent.getLoadBalancer());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ServiceStatusBuilder that = (V1ServiceStatusBuilder) o;
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
