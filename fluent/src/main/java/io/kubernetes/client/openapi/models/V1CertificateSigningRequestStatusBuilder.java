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

public class V1CertificateSigningRequestStatusBuilder
    extends V1CertificateSigningRequestStatusFluentImpl<V1CertificateSigningRequestStatusBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatus,
        io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusBuilder> {
  public V1CertificateSigningRequestStatusBuilder() {
    this(false);
  }

  public V1CertificateSigningRequestStatusBuilder(Boolean validationEnabled) {
    this(new V1CertificateSigningRequestStatus(), validationEnabled);
  }

  public V1CertificateSigningRequestStatusBuilder(
      V1CertificateSigningRequestStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CertificateSigningRequestStatusBuilder(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1CertificateSigningRequestStatus(), validationEnabled);
  }

  public V1CertificateSigningRequestStatusBuilder(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatus instance) {
    this(fluent, instance, false);
  }

  public V1CertificateSigningRequestStatusBuilder(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCertificate(instance.getCertificate());

    fluent.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled;
  }

  public V1CertificateSigningRequestStatusBuilder(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatus instance) {
    this(instance, false);
  }

  public V1CertificateSigningRequestStatusBuilder(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withCertificate(instance.getCertificate());

    this.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatus build() {
    V1CertificateSigningRequestStatus buildable = new V1CertificateSigningRequestStatus();
    buildable.setCertificate(fluent.getCertificate());
    buildable.setConditions(fluent.getConditions());
    return buildable;
  }
}
