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

public class V2CrossVersionObjectReferenceBuilder
    extends V2CrossVersionObjectReferenceFluentImpl<V2CrossVersionObjectReferenceBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V2CrossVersionObjectReference,
        io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceBuilder> {
  public V2CrossVersionObjectReferenceBuilder() {
    this(false);
  }

  public V2CrossVersionObjectReferenceBuilder(Boolean validationEnabled) {
    this(new V2CrossVersionObjectReference(), validationEnabled);
  }

  public V2CrossVersionObjectReferenceBuilder(V2CrossVersionObjectReferenceFluent<?> fluent) {
    this(fluent, false);
  }

  public V2CrossVersionObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2CrossVersionObjectReference(), validationEnabled);
  }

  public V2CrossVersionObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2CrossVersionObjectReference instance) {
    this(fluent, instance, false);
  }

  public V2CrossVersionObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2CrossVersionObjectReference instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  public V2CrossVersionObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V2CrossVersionObjectReference instance) {
    this(instance, false);
  }

  public V2CrossVersionObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V2CrossVersionObjectReference instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2CrossVersionObjectReference build() {
    V2CrossVersionObjectReference buildable = new V2CrossVersionObjectReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
}
