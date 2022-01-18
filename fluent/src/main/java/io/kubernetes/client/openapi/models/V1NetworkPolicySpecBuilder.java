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

public class V1NetworkPolicySpecBuilder
    extends io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluentImpl<
        io.kubernetes.client.openapi.models.V1NetworkPolicySpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1NetworkPolicySpec,
        io.kubernetes.client.openapi.models.V1NetworkPolicySpecBuilder> {
  public V1NetworkPolicySpecBuilder() {
    this(false);
  }

  public V1NetworkPolicySpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1NetworkPolicySpec(), validationEnabled);
  }

  public V1NetworkPolicySpecBuilder(
      io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NetworkPolicySpecBuilder(
      io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1NetworkPolicySpec(), validationEnabled);
  }

  public V1NetworkPolicySpecBuilder(
      io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NetworkPolicySpec instance) {
    this(fluent, instance, false);
  }

  public V1NetworkPolicySpecBuilder(
      io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NetworkPolicySpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withEgress(instance.getEgress());

    fluent.withIngress(instance.getIngress());

    fluent.withPodSelector(instance.getPodSelector());

    fluent.withPolicyTypes(instance.getPolicyTypes());

    this.validationEnabled = validationEnabled;
  }

  public V1NetworkPolicySpecBuilder(
      io.kubernetes.client.openapi.models.V1NetworkPolicySpec instance) {
    this(instance, false);
  }

  public V1NetworkPolicySpecBuilder(
      io.kubernetes.client.openapi.models.V1NetworkPolicySpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withEgress(instance.getEgress());

    this.withIngress(instance.getIngress());

    this.withPodSelector(instance.getPodSelector());

    this.withPolicyTypes(instance.getPolicyTypes());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpec build() {
    V1NetworkPolicySpec buildable = new V1NetworkPolicySpec();
    buildable.setEgress(fluent.getEgress());
    buildable.setIngress(fluent.getIngress());
    buildable.setPodSelector(fluent.getPodSelector());
    buildable.setPolicyTypes(fluent.getPolicyTypes());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NetworkPolicySpecBuilder that = (V1NetworkPolicySpecBuilder) o;
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
