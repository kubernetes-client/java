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

public class AdmissionregistrationV1ServiceReferenceBuilder
    extends AdmissionregistrationV1ServiceReferenceFluentImpl<
        AdmissionregistrationV1ServiceReferenceBuilder>
    implements VisitableBuilder<
        AdmissionregistrationV1ServiceReference, AdmissionregistrationV1ServiceReferenceBuilder> {
  public AdmissionregistrationV1ServiceReferenceBuilder() {
    this(false);
  }

  public AdmissionregistrationV1ServiceReferenceBuilder(Boolean validationEnabled) {
    this(new AdmissionregistrationV1ServiceReference(), validationEnabled);
  }

  public AdmissionregistrationV1ServiceReferenceBuilder(
      AdmissionregistrationV1ServiceReferenceFluent<?> fluent) {
    this(fluent, false);
  }

  public AdmissionregistrationV1ServiceReferenceBuilder(
      AdmissionregistrationV1ServiceReferenceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new AdmissionregistrationV1ServiceReference(), validationEnabled);
  }

  public AdmissionregistrationV1ServiceReferenceBuilder(
      AdmissionregistrationV1ServiceReferenceFluent<?> fluent,
      AdmissionregistrationV1ServiceReference instance) {
    this(fluent, instance, false);
  }

  public AdmissionregistrationV1ServiceReferenceBuilder(
      AdmissionregistrationV1ServiceReferenceFluent<?> fluent,
      AdmissionregistrationV1ServiceReference instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    fluent.withPath(instance.getPath());

    fluent.withPort(instance.getPort());

    this.validationEnabled = validationEnabled;
  }

  public AdmissionregistrationV1ServiceReferenceBuilder(
      AdmissionregistrationV1ServiceReference instance) {
    this(instance, false);
  }

  public AdmissionregistrationV1ServiceReferenceBuilder(
      AdmissionregistrationV1ServiceReference instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withPath(instance.getPath());

    this.withPort(instance.getPort());

    this.validationEnabled = validationEnabled;
  }

  AdmissionregistrationV1ServiceReferenceFluent<?> fluent;
  Boolean validationEnabled;

  public AdmissionregistrationV1ServiceReference build() {
    AdmissionregistrationV1ServiceReference buildable =
        new AdmissionregistrationV1ServiceReference();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setPath(fluent.getPath());
    buildable.setPort(fluent.getPort());
    return buildable;
  }
}
