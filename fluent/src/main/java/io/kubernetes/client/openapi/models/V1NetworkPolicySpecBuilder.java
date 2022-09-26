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

public class V1NetworkPolicySpecBuilder
    extends V1NetworkPolicySpecFluentImpl<V1NetworkPolicySpecBuilder>
    implements VisitableBuilder<V1NetworkPolicySpec, V1NetworkPolicySpecBuilder> {
  public V1NetworkPolicySpecBuilder() {
    this(false);
  }

  public V1NetworkPolicySpecBuilder(Boolean validationEnabled) {
    this(new V1NetworkPolicySpec(), validationEnabled);
  }

  public V1NetworkPolicySpecBuilder(V1NetworkPolicySpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NetworkPolicySpecBuilder(
      V1NetworkPolicySpecFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1NetworkPolicySpec(), validationEnabled);
  }

  public V1NetworkPolicySpecBuilder(
      V1NetworkPolicySpecFluent<?> fluent, V1NetworkPolicySpec instance) {
    this(fluent, instance, false);
  }

  public V1NetworkPolicySpecBuilder(
      V1NetworkPolicySpecFluent<?> fluent,
      V1NetworkPolicySpec instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withEgress(instance.getEgress());

    fluent.withIngress(instance.getIngress());

    fluent.withPodSelector(instance.getPodSelector());

    fluent.withPolicyTypes(instance.getPolicyTypes());

    this.validationEnabled = validationEnabled;
  }

  public V1NetworkPolicySpecBuilder(V1NetworkPolicySpec instance) {
    this(instance, false);
  }

  public V1NetworkPolicySpecBuilder(V1NetworkPolicySpec instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withEgress(instance.getEgress());

    this.withIngress(instance.getIngress());

    this.withPodSelector(instance.getPodSelector());

    this.withPolicyTypes(instance.getPolicyTypes());

    this.validationEnabled = validationEnabled;
  }

  V1NetworkPolicySpecFluent<?> fluent;
  Boolean validationEnabled;

  public V1NetworkPolicySpec build() {
    V1NetworkPolicySpec buildable = new V1NetworkPolicySpec();
    buildable.setEgress(fluent.getEgress());
    buildable.setIngress(fluent.getIngress());
    buildable.setPodSelector(fluent.getPodSelector());
    buildable.setPolicyTypes(fluent.getPolicyTypes());
    return buildable;
  }
}
