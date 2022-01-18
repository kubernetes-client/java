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

public class V1APIVersionsBuilder
    extends io.kubernetes.client.openapi.models.V1APIVersionsFluentImpl<
        io.kubernetes.client.openapi.models.V1APIVersionsBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1APIVersions,
        io.kubernetes.client.openapi.models.V1APIVersionsBuilder> {
  public V1APIVersionsBuilder() {
    this(false);
  }

  public V1APIVersionsBuilder(java.lang.Boolean validationEnabled) {
    this(new V1APIVersions(), validationEnabled);
  }

  public V1APIVersionsBuilder(io.kubernetes.client.openapi.models.V1APIVersionsFluent<?> fluent) {
    this(fluent, false);
  }

  public V1APIVersionsBuilder(
      io.kubernetes.client.openapi.models.V1APIVersionsFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1APIVersions(), validationEnabled);
  }

  public V1APIVersionsBuilder(
      io.kubernetes.client.openapi.models.V1APIVersionsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1APIVersions instance) {
    this(fluent, instance, false);
  }

  public V1APIVersionsBuilder(
      io.kubernetes.client.openapi.models.V1APIVersionsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1APIVersions instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withServerAddressByClientCIDRs(instance.getServerAddressByClientCIDRs());

    fluent.withVersions(instance.getVersions());

    this.validationEnabled = validationEnabled;
  }

  public V1APIVersionsBuilder(io.kubernetes.client.openapi.models.V1APIVersions instance) {
    this(instance, false);
  }

  public V1APIVersionsBuilder(
      io.kubernetes.client.openapi.models.V1APIVersions instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withServerAddressByClientCIDRs(instance.getServerAddressByClientCIDRs());

    this.withVersions(instance.getVersions());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1APIVersionsFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1APIVersions build() {
    V1APIVersions buildable = new V1APIVersions();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setServerAddressByClientCIDRs(fluent.getServerAddressByClientCIDRs());
    buildable.setVersions(fluent.getVersions());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1APIVersionsBuilder that = (V1APIVersionsBuilder) o;
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
