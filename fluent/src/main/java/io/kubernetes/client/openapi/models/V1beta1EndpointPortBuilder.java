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

public class V1beta1EndpointPortBuilder
    extends V1beta1EndpointPortFluentImpl<V1beta1EndpointPortBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1EndpointPort,
        io.kubernetes.client.openapi.models.V1beta1EndpointPortBuilder> {
  public V1beta1EndpointPortBuilder() {
    this(false);
  }

  public V1beta1EndpointPortBuilder(Boolean validationEnabled) {
    this(new V1beta1EndpointPort(), validationEnabled);
  }

  public V1beta1EndpointPortBuilder(V1beta1EndpointPortFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1EndpointPortBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointPortFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1EndpointPort(), validationEnabled);
  }

  public V1beta1EndpointPortBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointPortFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1EndpointPort instance) {
    this(fluent, instance, false);
  }

  public V1beta1EndpointPortBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointPortFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1EndpointPort instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAppProtocol(instance.getAppProtocol());

    fluent.withName(instance.getName());

    fluent.withPort(instance.getPort());

    fluent.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1EndpointPortBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointPort instance) {
    this(instance, false);
  }

  public V1beta1EndpointPortBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointPort instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAppProtocol(instance.getAppProtocol());

    this.withName(instance.getName());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1EndpointPortFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1EndpointPort build() {
    V1beta1EndpointPort buildable = new V1beta1EndpointPort();
    buildable.setAppProtocol(fluent.getAppProtocol());
    buildable.setName(fluent.getName());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
}
