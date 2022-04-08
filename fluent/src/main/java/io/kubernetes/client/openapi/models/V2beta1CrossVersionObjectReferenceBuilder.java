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

public class V2beta1CrossVersionObjectReferenceBuilder
    extends V2beta1CrossVersionObjectReferenceFluentImpl<V2beta1CrossVersionObjectReferenceBuilder>
    implements VisitableBuilder<
        V2beta1CrossVersionObjectReference,
        io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceBuilder> {
  public V2beta1CrossVersionObjectReferenceBuilder() {
    this(false);
  }

  public V2beta1CrossVersionObjectReferenceBuilder(Boolean validationEnabled) {
    this(new V2beta1CrossVersionObjectReference(), validationEnabled);
  }

  public V2beta1CrossVersionObjectReferenceBuilder(
      V2beta1CrossVersionObjectReferenceFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta1CrossVersionObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2beta1CrossVersionObjectReference(), validationEnabled);
  }

  public V2beta1CrossVersionObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference instance) {
    this(fluent, instance, false);
  }

  public V2beta1CrossVersionObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  public V2beta1CrossVersionObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference instance) {
    this(instance, false);
  }

  public V2beta1CrossVersionObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference build() {
    V2beta1CrossVersionObjectReference buildable = new V2beta1CrossVersionObjectReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
}
