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

public class V1CertificateSigningRequestListBuilder
    extends io.kubernetes.client.openapi.models.V1CertificateSigningRequestListFluentImpl<
        io.kubernetes.client.openapi.models.V1CertificateSigningRequestListBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CertificateSigningRequestList,
        io.kubernetes.client.openapi.models.V1CertificateSigningRequestListBuilder> {
  public V1CertificateSigningRequestListBuilder() {
    this(false);
  }

  public V1CertificateSigningRequestListBuilder(java.lang.Boolean validationEnabled) {
    this(new V1CertificateSigningRequestList(), validationEnabled);
  }

  public V1CertificateSigningRequestListBuilder(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestListFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CertificateSigningRequestListBuilder(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestListFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1CertificateSigningRequestList(), validationEnabled);
  }

  public V1CertificateSigningRequestListBuilder(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestListFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestList instance) {
    this(fluent, instance, false);
  }

  public V1CertificateSigningRequestListBuilder(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestListFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestList instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  public V1CertificateSigningRequestListBuilder(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestList instance) {
    this(instance, false);
  }

  public V1CertificateSigningRequestListBuilder(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestList instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CertificateSigningRequestListFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestList build() {
    V1CertificateSigningRequestList buildable = new V1CertificateSigningRequestList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CertificateSigningRequestListBuilder that = (V1CertificateSigningRequestListBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
