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

public class V1NodeSpecBuilder
    extends io.kubernetes.client.openapi.models.V1NodeSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1NodeSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1NodeSpec,
        io.kubernetes.client.openapi.models.V1NodeSpecBuilder> {
  public V1NodeSpecBuilder() {
    this(false);
  }

  public V1NodeSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1NodeSpec(), validationEnabled);
  }

  public V1NodeSpecBuilder(io.kubernetes.client.openapi.models.V1NodeSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NodeSpecBuilder(
      io.kubernetes.client.openapi.models.V1NodeSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1NodeSpec(), validationEnabled);
  }

  public V1NodeSpecBuilder(
      io.kubernetes.client.openapi.models.V1NodeSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NodeSpec instance) {
    this(fluent, instance, false);
  }

  public V1NodeSpecBuilder(
      io.kubernetes.client.openapi.models.V1NodeSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NodeSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withConfigSource(instance.getConfigSource());

    fluent.withExternalID(instance.getExternalID());

    fluent.withPodCIDR(instance.getPodCIDR());

    fluent.withPodCIDRs(instance.getPodCIDRs());

    fluent.withProviderID(instance.getProviderID());

    fluent.withTaints(instance.getTaints());

    fluent.withUnschedulable(instance.getUnschedulable());

    this.validationEnabled = validationEnabled;
  }

  public V1NodeSpecBuilder(io.kubernetes.client.openapi.models.V1NodeSpec instance) {
    this(instance, false);
  }

  public V1NodeSpecBuilder(
      io.kubernetes.client.openapi.models.V1NodeSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withConfigSource(instance.getConfigSource());

    this.withExternalID(instance.getExternalID());

    this.withPodCIDR(instance.getPodCIDR());

    this.withPodCIDRs(instance.getPodCIDRs());

    this.withProviderID(instance.getProviderID());

    this.withTaints(instance.getTaints());

    this.withUnschedulable(instance.getUnschedulable());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1NodeSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1NodeSpec build() {
    V1NodeSpec buildable = new V1NodeSpec();
    buildable.setConfigSource(fluent.getConfigSource());
    buildable.setExternalID(fluent.getExternalID());
    buildable.setPodCIDR(fluent.getPodCIDR());
    buildable.setPodCIDRs(fluent.getPodCIDRs());
    buildable.setProviderID(fluent.getProviderID());
    buildable.setTaints(fluent.getTaints());
    buildable.setUnschedulable(fluent.getUnschedulable());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NodeSpecBuilder that = (V1NodeSpecBuilder) o;
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
