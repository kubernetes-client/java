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

public class V1ServerAddressByClientCIDRBuilder
    extends V1ServerAddressByClientCIDRFluentImpl<V1ServerAddressByClientCIDRBuilder>
    implements VisitableBuilder<V1ServerAddressByClientCIDR, V1ServerAddressByClientCIDRBuilder> {
  public V1ServerAddressByClientCIDRBuilder() {
    this(false);
  }

  public V1ServerAddressByClientCIDRBuilder(Boolean validationEnabled) {
    this(new V1ServerAddressByClientCIDR(), validationEnabled);
  }

  public V1ServerAddressByClientCIDRBuilder(V1ServerAddressByClientCIDRFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ServerAddressByClientCIDRBuilder(
      V1ServerAddressByClientCIDRFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ServerAddressByClientCIDR(), validationEnabled);
  }

  public V1ServerAddressByClientCIDRBuilder(
      V1ServerAddressByClientCIDRFluent<?> fluent, V1ServerAddressByClientCIDR instance) {
    this(fluent, instance, false);
  }

  public V1ServerAddressByClientCIDRBuilder(
      V1ServerAddressByClientCIDRFluent<?> fluent,
      V1ServerAddressByClientCIDR instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withClientCIDR(instance.getClientCIDR());

    fluent.withServerAddress(instance.getServerAddress());

    this.validationEnabled = validationEnabled;
  }

  public V1ServerAddressByClientCIDRBuilder(V1ServerAddressByClientCIDR instance) {
    this(instance, false);
  }

  public V1ServerAddressByClientCIDRBuilder(
      V1ServerAddressByClientCIDR instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withClientCIDR(instance.getClientCIDR());

    this.withServerAddress(instance.getServerAddress());

    this.validationEnabled = validationEnabled;
  }

  V1ServerAddressByClientCIDRFluent<?> fluent;
  Boolean validationEnabled;

  public V1ServerAddressByClientCIDR build() {
    V1ServerAddressByClientCIDR buildable = new V1ServerAddressByClientCIDR();
    buildable.setClientCIDR(fluent.getClientCIDR());
    buildable.setServerAddress(fluent.getServerAddress());
    return buildable;
  }
}
