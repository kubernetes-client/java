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

public class V1ReplicationControllerBuilder
    extends V1ReplicationControllerFluentImpl<V1ReplicationControllerBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ReplicationController,
        V1ReplicationControllerBuilder> {
  public V1ReplicationControllerBuilder() {
    this(false);
  }

  public V1ReplicationControllerBuilder(Boolean validationEnabled) {
    this(new V1ReplicationController(), validationEnabled);
  }

  public V1ReplicationControllerBuilder(V1ReplicationControllerFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ReplicationControllerBuilder(
      io.kubernetes.client.openapi.models.V1ReplicationControllerFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ReplicationController(), validationEnabled);
  }

  public V1ReplicationControllerBuilder(
      io.kubernetes.client.openapi.models.V1ReplicationControllerFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ReplicationController instance) {
    this(fluent, instance, false);
  }

  public V1ReplicationControllerBuilder(
      io.kubernetes.client.openapi.models.V1ReplicationControllerFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ReplicationController instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled;
  }

  public V1ReplicationControllerBuilder(
      io.kubernetes.client.openapi.models.V1ReplicationController instance) {
    this(instance, false);
  }

  public V1ReplicationControllerBuilder(
      io.kubernetes.client.openapi.models.V1ReplicationController instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ReplicationControllerFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ReplicationController build() {
    V1ReplicationController buildable = new V1ReplicationController();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
}
