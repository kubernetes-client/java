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

public class V1CertificateSigningRequestConditionBuilder
    extends V1CertificateSigningRequestConditionFluentImpl<
        V1CertificateSigningRequestConditionBuilder>
    implements VisitableBuilder<
        V1CertificateSigningRequestCondition, V1CertificateSigningRequestConditionBuilder> {
  public V1CertificateSigningRequestConditionBuilder() {
    this(false);
  }

  public V1CertificateSigningRequestConditionBuilder(Boolean validationEnabled) {
    this(new V1CertificateSigningRequestCondition(), validationEnabled);
  }

  public V1CertificateSigningRequestConditionBuilder(
      V1CertificateSigningRequestConditionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CertificateSigningRequestConditionBuilder(
      V1CertificateSigningRequestConditionFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1CertificateSigningRequestCondition(), validationEnabled);
  }

  public V1CertificateSigningRequestConditionBuilder(
      V1CertificateSigningRequestConditionFluent<?> fluent,
      V1CertificateSigningRequestCondition instance) {
    this(fluent, instance, false);
  }

  public V1CertificateSigningRequestConditionBuilder(
      V1CertificateSigningRequestConditionFluent<?> fluent,
      V1CertificateSigningRequestCondition instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withLastUpdateTime(instance.getLastUpdateTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1CertificateSigningRequestConditionBuilder(
      V1CertificateSigningRequestCondition instance) {
    this(instance, false);
  }

  public V1CertificateSigningRequestConditionBuilder(
      V1CertificateSigningRequestCondition instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withLastUpdateTime(instance.getLastUpdateTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  V1CertificateSigningRequestConditionFluent<?> fluent;
  Boolean validationEnabled;

  public V1CertificateSigningRequestCondition build() {
    V1CertificateSigningRequestCondition buildable = new V1CertificateSigningRequestCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setLastUpdateTime(fluent.getLastUpdateTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
}
