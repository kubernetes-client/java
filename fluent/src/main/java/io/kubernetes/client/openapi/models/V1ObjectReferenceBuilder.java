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

public class V1ObjectReferenceBuilder extends V1ObjectReferenceFluentImpl<V1ObjectReferenceBuilder>
    implements VisitableBuilder<V1ObjectReference, V1ObjectReferenceBuilder> {
  public V1ObjectReferenceBuilder() {
    this(false);
  }

  public V1ObjectReferenceBuilder(Boolean validationEnabled) {
    this(new V1ObjectReference(), validationEnabled);
  }

  public V1ObjectReferenceBuilder(V1ObjectReferenceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ObjectReferenceBuilder(V1ObjectReferenceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ObjectReference(), validationEnabled);
  }

  public V1ObjectReferenceBuilder(V1ObjectReferenceFluent<?> fluent, V1ObjectReference instance) {
    this(fluent, instance, false);
  }

  public V1ObjectReferenceBuilder(
      V1ObjectReferenceFluent<?> fluent, V1ObjectReference instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withFieldPath(instance.getFieldPath());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    fluent.withResourceVersion(instance.getResourceVersion());

    fluent.withUid(instance.getUid());

    this.validationEnabled = validationEnabled;
  }

  public V1ObjectReferenceBuilder(V1ObjectReference instance) {
    this(instance, false);
  }

  public V1ObjectReferenceBuilder(V1ObjectReference instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withFieldPath(instance.getFieldPath());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withResourceVersion(instance.getResourceVersion());

    this.withUid(instance.getUid());

    this.validationEnabled = validationEnabled;
  }

  V1ObjectReferenceFluent<?> fluent;
  Boolean validationEnabled;

  public V1ObjectReference build() {
    V1ObjectReference buildable = new V1ObjectReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setFieldPath(fluent.getFieldPath());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setResourceVersion(fluent.getResourceVersion());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
}
