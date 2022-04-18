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

public class V1NodeAddressBuilder extends V1NodeAddressFluentImpl<V1NodeAddressBuilder>
    implements VisitableBuilder<
        V1NodeAddress, io.kubernetes.client.openapi.models.V1NodeAddressBuilder> {
  public V1NodeAddressBuilder() {
    this(false);
  }

  public V1NodeAddressBuilder(Boolean validationEnabled) {
    this(new V1NodeAddress(), validationEnabled);
  }

  public V1NodeAddressBuilder(V1NodeAddressFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NodeAddressBuilder(
      io.kubernetes.client.openapi.models.V1NodeAddressFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1NodeAddress(), validationEnabled);
  }

  public V1NodeAddressBuilder(
      io.kubernetes.client.openapi.models.V1NodeAddressFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NodeAddress instance) {
    this(fluent, instance, false);
  }

  public V1NodeAddressBuilder(
      io.kubernetes.client.openapi.models.V1NodeAddressFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NodeAddress instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAddress(instance.getAddress());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1NodeAddressBuilder(io.kubernetes.client.openapi.models.V1NodeAddress instance) {
    this(instance, false);
  }

  public V1NodeAddressBuilder(
      io.kubernetes.client.openapi.models.V1NodeAddress instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAddress(instance.getAddress());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1NodeAddressFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1NodeAddress build() {
    V1NodeAddress buildable = new V1NodeAddress();
    buildable.setAddress(fluent.getAddress());
    buildable.setType(fluent.getType());
    return buildable;
  }
}
