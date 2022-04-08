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

public class V1EndpointsBuilder extends V1EndpointsFluentImpl<V1EndpointsBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1Endpoints,
        io.kubernetes.client.openapi.models.V1EndpointsBuilder> {
  public V1EndpointsBuilder() {
    this(false);
  }

  public V1EndpointsBuilder(Boolean validationEnabled) {
    this(new V1Endpoints(), validationEnabled);
  }

  public V1EndpointsBuilder(V1EndpointsFluent<?> fluent) {
    this(fluent, false);
  }

  public V1EndpointsBuilder(
      io.kubernetes.client.openapi.models.V1EndpointsFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1Endpoints(), validationEnabled);
  }

  public V1EndpointsBuilder(
      io.kubernetes.client.openapi.models.V1EndpointsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Endpoints instance) {
    this(fluent, instance, false);
  }

  public V1EndpointsBuilder(
      io.kubernetes.client.openapi.models.V1EndpointsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Endpoints instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSubsets(instance.getSubsets());

    this.validationEnabled = validationEnabled;
  }

  public V1EndpointsBuilder(io.kubernetes.client.openapi.models.V1Endpoints instance) {
    this(instance, false);
  }

  public V1EndpointsBuilder(
      io.kubernetes.client.openapi.models.V1Endpoints instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSubsets(instance.getSubsets());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1EndpointsFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1Endpoints build() {
    V1Endpoints buildable = new V1Endpoints();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSubsets(fluent.getSubsets());
    return buildable;
  }
}
