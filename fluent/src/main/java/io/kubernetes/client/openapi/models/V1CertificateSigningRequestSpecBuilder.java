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

public class V1CertificateSigningRequestSpecBuilder
    extends io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpec,
        io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpecBuilder> {
  public V1CertificateSigningRequestSpecBuilder() {
    this(false);
  }

  public V1CertificateSigningRequestSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1CertificateSigningRequestSpec(), validationEnabled);
  }

  public V1CertificateSigningRequestSpecBuilder(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CertificateSigningRequestSpecBuilder(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1CertificateSigningRequestSpec(), validationEnabled);
  }

  public V1CertificateSigningRequestSpecBuilder(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpec instance) {
    this(fluent, instance, false);
  }

  public V1CertificateSigningRequestSpecBuilder(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withExpirationSeconds(instance.getExpirationSeconds());

    fluent.withExtra(instance.getExtra());

    fluent.withGroups(instance.getGroups());

    fluent.withRequest(instance.getRequest());

    fluent.withSignerName(instance.getSignerName());

    fluent.withUid(instance.getUid());

    fluent.withUsages(instance.getUsages());

    fluent.withUsername(instance.getUsername());

    this.validationEnabled = validationEnabled;
  }

  public V1CertificateSigningRequestSpecBuilder(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpec instance) {
    this(instance, false);
  }

  public V1CertificateSigningRequestSpecBuilder(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withExpirationSeconds(instance.getExpirationSeconds());

    this.withExtra(instance.getExtra());

    this.withGroups(instance.getGroups());

    this.withRequest(instance.getRequest());

    this.withSignerName(instance.getSignerName());

    this.withUid(instance.getUid());

    this.withUsages(instance.getUsages());

    this.withUsername(instance.getUsername());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpec build() {
    V1CertificateSigningRequestSpec buildable = new V1CertificateSigningRequestSpec();
    buildable.setExpirationSeconds(fluent.getExpirationSeconds());
    buildable.setExtra(fluent.getExtra());
    buildable.setGroups(fluent.getGroups());
    buildable.setRequest(fluent.getRequest());
    buildable.setSignerName(fluent.getSignerName());
    buildable.setUid(fluent.getUid());
    buildable.setUsages(fluent.getUsages());
    buildable.setUsername(fluent.getUsername());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CertificateSigningRequestSpecBuilder that = (V1CertificateSigningRequestSpecBuilder) o;
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
