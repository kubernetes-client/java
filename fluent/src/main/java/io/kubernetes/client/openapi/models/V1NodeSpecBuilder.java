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

public class V1NodeSpecBuilder extends V1NodeSpecFluentImpl<V1NodeSpecBuilder>
    implements VisitableBuilder<io.kubernetes.client.openapi.models.V1NodeSpec, V1NodeSpecBuilder> {
  public V1NodeSpecBuilder() {
    this(false);
  }

  public V1NodeSpecBuilder(Boolean validationEnabled) {
    this(new V1NodeSpec(), validationEnabled);
  }

  public V1NodeSpecBuilder(V1NodeSpecFluent<?> fluent) {
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
}
