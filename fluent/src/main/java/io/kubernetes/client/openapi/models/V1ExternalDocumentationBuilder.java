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

public class V1ExternalDocumentationBuilder
    extends V1ExternalDocumentationFluentImpl<V1ExternalDocumentationBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ExternalDocumentation,
        io.kubernetes.client.openapi.models.V1ExternalDocumentationBuilder> {
  public V1ExternalDocumentationBuilder() {
    this(false);
  }

  public V1ExternalDocumentationBuilder(Boolean validationEnabled) {
    this(new V1ExternalDocumentation(), validationEnabled);
  }

  public V1ExternalDocumentationBuilder(V1ExternalDocumentationFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ExternalDocumentationBuilder(
      io.kubernetes.client.openapi.models.V1ExternalDocumentationFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ExternalDocumentation(), validationEnabled);
  }

  public V1ExternalDocumentationBuilder(
      io.kubernetes.client.openapi.models.V1ExternalDocumentationFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ExternalDocumentation instance) {
    this(fluent, instance, false);
  }

  public V1ExternalDocumentationBuilder(
      io.kubernetes.client.openapi.models.V1ExternalDocumentationFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ExternalDocumentation instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withDescription(instance.getDescription());

    fluent.withUrl(instance.getUrl());

    this.validationEnabled = validationEnabled;
  }

  public V1ExternalDocumentationBuilder(
      io.kubernetes.client.openapi.models.V1ExternalDocumentation instance) {
    this(instance, false);
  }

  public V1ExternalDocumentationBuilder(
      io.kubernetes.client.openapi.models.V1ExternalDocumentation instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withDescription(instance.getDescription());

    this.withUrl(instance.getUrl());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ExternalDocumentationFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ExternalDocumentation build() {
    V1ExternalDocumentation buildable = new V1ExternalDocumentation();
    buildable.setDescription(fluent.getDescription());
    buildable.setUrl(fluent.getUrl());
    return buildable;
  }
}
