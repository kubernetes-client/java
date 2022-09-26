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

public class V1alpha1ClusterCIDRSpecBuilder
    extends V1alpha1ClusterCIDRSpecFluentImpl<V1alpha1ClusterCIDRSpecBuilder>
    implements VisitableBuilder<V1alpha1ClusterCIDRSpec, V1alpha1ClusterCIDRSpecBuilder> {
  public V1alpha1ClusterCIDRSpecBuilder() {
    this(false);
  }

  public V1alpha1ClusterCIDRSpecBuilder(Boolean validationEnabled) {
    this(new V1alpha1ClusterCIDRSpec(), validationEnabled);
  }

  public V1alpha1ClusterCIDRSpecBuilder(V1alpha1ClusterCIDRSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1alpha1ClusterCIDRSpecBuilder(
      V1alpha1ClusterCIDRSpecFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1alpha1ClusterCIDRSpec(), validationEnabled);
  }

  public V1alpha1ClusterCIDRSpecBuilder(
      V1alpha1ClusterCIDRSpecFluent<?> fluent, V1alpha1ClusterCIDRSpec instance) {
    this(fluent, instance, false);
  }

  public V1alpha1ClusterCIDRSpecBuilder(
      V1alpha1ClusterCIDRSpecFluent<?> fluent,
      V1alpha1ClusterCIDRSpec instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withIpv4(instance.getIpv4());

    fluent.withIpv6(instance.getIpv6());

    fluent.withNodeSelector(instance.getNodeSelector());

    fluent.withPerNodeHostBits(instance.getPerNodeHostBits());

    this.validationEnabled = validationEnabled;
  }

  public V1alpha1ClusterCIDRSpecBuilder(V1alpha1ClusterCIDRSpec instance) {
    this(instance, false);
  }

  public V1alpha1ClusterCIDRSpecBuilder(
      V1alpha1ClusterCIDRSpec instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withIpv4(instance.getIpv4());

    this.withIpv6(instance.getIpv6());

    this.withNodeSelector(instance.getNodeSelector());

    this.withPerNodeHostBits(instance.getPerNodeHostBits());

    this.validationEnabled = validationEnabled;
  }

  V1alpha1ClusterCIDRSpecFluent<?> fluent;
  Boolean validationEnabled;

  public V1alpha1ClusterCIDRSpec build() {
    V1alpha1ClusterCIDRSpec buildable = new V1alpha1ClusterCIDRSpec();
    buildable.setIpv4(fluent.getIpv4());
    buildable.setIpv6(fluent.getIpv6());
    buildable.setNodeSelector(fluent.getNodeSelector());
    buildable.setPerNodeHostBits(fluent.getPerNodeHostBits());
    return buildable;
  }
}
