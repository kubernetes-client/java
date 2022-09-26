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

public class V1alpha1ClusterCIDRBuilder
    extends V1alpha1ClusterCIDRFluentImpl<V1alpha1ClusterCIDRBuilder>
    implements VisitableBuilder<V1alpha1ClusterCIDR, V1alpha1ClusterCIDRBuilder> {
  public V1alpha1ClusterCIDRBuilder() {
    this(false);
  }

  public V1alpha1ClusterCIDRBuilder(Boolean validationEnabled) {
    this(new V1alpha1ClusterCIDR(), validationEnabled);
  }

  public V1alpha1ClusterCIDRBuilder(V1alpha1ClusterCIDRFluent<?> fluent) {
    this(fluent, false);
  }

  public V1alpha1ClusterCIDRBuilder(
      V1alpha1ClusterCIDRFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1alpha1ClusterCIDR(), validationEnabled);
  }

  public V1alpha1ClusterCIDRBuilder(
      V1alpha1ClusterCIDRFluent<?> fluent, V1alpha1ClusterCIDR instance) {
    this(fluent, instance, false);
  }

  public V1alpha1ClusterCIDRBuilder(
      V1alpha1ClusterCIDRFluent<?> fluent,
      V1alpha1ClusterCIDR instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled;
  }

  public V1alpha1ClusterCIDRBuilder(V1alpha1ClusterCIDR instance) {
    this(instance, false);
  }

  public V1alpha1ClusterCIDRBuilder(V1alpha1ClusterCIDR instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled;
  }

  V1alpha1ClusterCIDRFluent<?> fluent;
  Boolean validationEnabled;

  public V1alpha1ClusterCIDR build() {
    V1alpha1ClusterCIDR buildable = new V1alpha1ClusterCIDR();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
}
