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

public class V1IngressServiceBackendBuilder
    extends V1IngressServiceBackendFluentImpl<V1IngressServiceBackendBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1IngressServiceBackend,
        io.kubernetes.client.openapi.models.V1IngressServiceBackendBuilder> {
  public V1IngressServiceBackendBuilder() {
    this(false);
  }

  public V1IngressServiceBackendBuilder(Boolean validationEnabled) {
    this(new V1IngressServiceBackend(), validationEnabled);
  }

  public V1IngressServiceBackendBuilder(V1IngressServiceBackendFluent<?> fluent) {
    this(fluent, false);
  }

  public V1IngressServiceBackendBuilder(
      io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1IngressServiceBackend(), validationEnabled);
  }

  public V1IngressServiceBackendBuilder(
      io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1IngressServiceBackend instance) {
    this(fluent, instance, false);
  }

  public V1IngressServiceBackendBuilder(
      io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1IngressServiceBackend instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withName(instance.getName());

    fluent.withPort(instance.getPort());

    this.validationEnabled = validationEnabled;
  }

  public V1IngressServiceBackendBuilder(
      io.kubernetes.client.openapi.models.V1IngressServiceBackend instance) {
    this(instance, false);
  }

  public V1IngressServiceBackendBuilder(
      io.kubernetes.client.openapi.models.V1IngressServiceBackend instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withName(instance.getName());

    this.withPort(instance.getPort());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1IngressServiceBackend build() {
    V1IngressServiceBackend buildable = new V1IngressServiceBackend();
    buildable.setName(fluent.getName());
    buildable.setPort(fluent.getPort());
    return buildable;
  }
}
