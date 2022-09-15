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

public class AdmissionregistrationV1WebhookClientConfigBuilder
    extends AdmissionregistrationV1WebhookClientConfigFluentImpl<
        AdmissionregistrationV1WebhookClientConfigBuilder>
    implements VisitableBuilder<
        AdmissionregistrationV1WebhookClientConfig,
        AdmissionregistrationV1WebhookClientConfigBuilder> {
  public AdmissionregistrationV1WebhookClientConfigBuilder() {
    this(false);
  }

  public AdmissionregistrationV1WebhookClientConfigBuilder(Boolean validationEnabled) {
    this(new AdmissionregistrationV1WebhookClientConfig(), validationEnabled);
  }

  public AdmissionregistrationV1WebhookClientConfigBuilder(
      AdmissionregistrationV1WebhookClientConfigFluent<?> fluent) {
    this(fluent, false);
  }

  public AdmissionregistrationV1WebhookClientConfigBuilder(
      AdmissionregistrationV1WebhookClientConfigFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new AdmissionregistrationV1WebhookClientConfig(), validationEnabled);
  }

  public AdmissionregistrationV1WebhookClientConfigBuilder(
      AdmissionregistrationV1WebhookClientConfigFluent<?> fluent,
      AdmissionregistrationV1WebhookClientConfig instance) {
    this(fluent, instance, false);
  }

  public AdmissionregistrationV1WebhookClientConfigBuilder(
      AdmissionregistrationV1WebhookClientConfigFluent<?> fluent,
      AdmissionregistrationV1WebhookClientConfig instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCaBundle(instance.getCaBundle());

    fluent.withService(instance.getService());

    fluent.withUrl(instance.getUrl());

    this.validationEnabled = validationEnabled;
  }

  public AdmissionregistrationV1WebhookClientConfigBuilder(
      AdmissionregistrationV1WebhookClientConfig instance) {
    this(instance, false);
  }

  public AdmissionregistrationV1WebhookClientConfigBuilder(
      AdmissionregistrationV1WebhookClientConfig instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withCaBundle(instance.getCaBundle());

    this.withService(instance.getService());

    this.withUrl(instance.getUrl());

    this.validationEnabled = validationEnabled;
  }

  AdmissionregistrationV1WebhookClientConfigFluent<?> fluent;
  Boolean validationEnabled;

  public AdmissionregistrationV1WebhookClientConfig build() {
    AdmissionregistrationV1WebhookClientConfig buildable =
        new AdmissionregistrationV1WebhookClientConfig();
    buildable.setCaBundle(fluent.getCaBundle());
    buildable.setService(fluent.getService());
    buildable.setUrl(fluent.getUrl());
    return buildable;
  }
}
