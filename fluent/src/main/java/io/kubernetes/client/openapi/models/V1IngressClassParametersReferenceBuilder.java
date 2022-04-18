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

public class V1IngressClassParametersReferenceBuilder
    extends V1IngressClassParametersReferenceFluentImpl<V1IngressClassParametersReferenceBuilder>
    implements VisitableBuilder<
        V1IngressClassParametersReference,
        io.kubernetes.client.openapi.models.V1IngressClassParametersReferenceBuilder> {
  public V1IngressClassParametersReferenceBuilder() {
    this(false);
  }

  public V1IngressClassParametersReferenceBuilder(Boolean validationEnabled) {
    this(new V1IngressClassParametersReference(), validationEnabled);
  }

  public V1IngressClassParametersReferenceBuilder(
      io.kubernetes.client.openapi.models.V1IngressClassParametersReferenceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1IngressClassParametersReferenceBuilder(
      io.kubernetes.client.openapi.models.V1IngressClassParametersReferenceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1IngressClassParametersReference(), validationEnabled);
  }

  public V1IngressClassParametersReferenceBuilder(
      io.kubernetes.client.openapi.models.V1IngressClassParametersReferenceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1IngressClassParametersReference instance) {
    this(fluent, instance, false);
  }

  public V1IngressClassParametersReferenceBuilder(
      io.kubernetes.client.openapi.models.V1IngressClassParametersReferenceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1IngressClassParametersReference instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiGroup(instance.getApiGroup());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    fluent.withScope(instance.getScope());

    this.validationEnabled = validationEnabled;
  }

  public V1IngressClassParametersReferenceBuilder(
      io.kubernetes.client.openapi.models.V1IngressClassParametersReference instance) {
    this(instance, false);
  }

  public V1IngressClassParametersReferenceBuilder(
      io.kubernetes.client.openapi.models.V1IngressClassParametersReference instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiGroup(instance.getApiGroup());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withScope(instance.getScope());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1IngressClassParametersReferenceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1IngressClassParametersReference build() {
    V1IngressClassParametersReference buildable = new V1IngressClassParametersReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setScope(fluent.getScope());
    return buildable;
  }
}
