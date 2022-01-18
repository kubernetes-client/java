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

public class V1ServerAddressByClientCIDRBuilder
    extends io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRFluentImpl<
        io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR,
        io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder> {
  public V1ServerAddressByClientCIDRBuilder() {
    this(false);
  }

  public V1ServerAddressByClientCIDRBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ServerAddressByClientCIDR(), validationEnabled);
  }

  public V1ServerAddressByClientCIDRBuilder(
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ServerAddressByClientCIDRBuilder(
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ServerAddressByClientCIDR(), validationEnabled);
  }

  public V1ServerAddressByClientCIDRBuilder(
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR instance) {
    this(fluent, instance, false);
  }

  public V1ServerAddressByClientCIDRBuilder(
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withClientCIDR(instance.getClientCIDR());

    fluent.withServerAddress(instance.getServerAddress());

    this.validationEnabled = validationEnabled;
  }

  public V1ServerAddressByClientCIDRBuilder(
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR instance) {
    this(instance, false);
  }

  public V1ServerAddressByClientCIDRBuilder(
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withClientCIDR(instance.getClientCIDR());

    this.withServerAddress(instance.getServerAddress());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR build() {
    V1ServerAddressByClientCIDR buildable = new V1ServerAddressByClientCIDR();
    buildable.setClientCIDR(fluent.getClientCIDR());
    buildable.setServerAddress(fluent.getServerAddress());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ServerAddressByClientCIDRBuilder that = (V1ServerAddressByClientCIDRBuilder) o;
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
