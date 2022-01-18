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

public class V1NetworkPolicyPeerBuilder
    extends io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluentImpl<
        io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1NetworkPolicyPeer,
        io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder> {
  public V1NetworkPolicyPeerBuilder() {
    this(false);
  }

  public V1NetworkPolicyPeerBuilder(java.lang.Boolean validationEnabled) {
    this(new V1NetworkPolicyPeer(), validationEnabled);
  }

  public V1NetworkPolicyPeerBuilder(
      io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NetworkPolicyPeerBuilder(
      io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1NetworkPolicyPeer(), validationEnabled);
  }

  public V1NetworkPolicyPeerBuilder(
      io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NetworkPolicyPeer instance) {
    this(fluent, instance, false);
  }

  public V1NetworkPolicyPeerBuilder(
      io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NetworkPolicyPeer instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withIpBlock(instance.getIpBlock());

    fluent.withNamespaceSelector(instance.getNamespaceSelector());

    fluent.withPodSelector(instance.getPodSelector());

    this.validationEnabled = validationEnabled;
  }

  public V1NetworkPolicyPeerBuilder(
      io.kubernetes.client.openapi.models.V1NetworkPolicyPeer instance) {
    this(instance, false);
  }

  public V1NetworkPolicyPeerBuilder(
      io.kubernetes.client.openapi.models.V1NetworkPolicyPeer instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withIpBlock(instance.getIpBlock());

    this.withNamespaceSelector(instance.getNamespaceSelector());

    this.withPodSelector(instance.getPodSelector());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer build() {
    V1NetworkPolicyPeer buildable = new V1NetworkPolicyPeer();
    buildable.setIpBlock(fluent.getIpBlock());
    buildable.setNamespaceSelector(fluent.getNamespaceSelector());
    buildable.setPodSelector(fluent.getPodSelector());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NetworkPolicyPeerBuilder that = (V1NetworkPolicyPeerBuilder) o;
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
