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

public class V1beta1ServiceAccountSubjectBuilder
    extends V1beta1ServiceAccountSubjectFluentImpl<V1beta1ServiceAccountSubjectBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject,
        V1beta1ServiceAccountSubjectBuilder> {
  public V1beta1ServiceAccountSubjectBuilder() {
    this(false);
  }

  public V1beta1ServiceAccountSubjectBuilder(Boolean validationEnabled) {
    this(new V1beta1ServiceAccountSubject(), validationEnabled);
  }

  public V1beta1ServiceAccountSubjectBuilder(V1beta1ServiceAccountSubjectFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1ServiceAccountSubjectBuilder(
      io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubjectFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1ServiceAccountSubject(), validationEnabled);
  }

  public V1beta1ServiceAccountSubjectBuilder(
      io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubjectFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject instance) {
    this(fluent, instance, false);
  }

  public V1beta1ServiceAccountSubjectBuilder(
      io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubjectFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1ServiceAccountSubjectBuilder(
      io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject instance) {
    this(instance, false);
  }

  public V1beta1ServiceAccountSubjectBuilder(
      io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubjectFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject build() {
    V1beta1ServiceAccountSubject buildable = new V1beta1ServiceAccountSubject();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
}
