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

public class V1WebhookConversionBuilder
    extends V1WebhookConversionFluentImpl<V1WebhookConversionBuilder>
    implements VisitableBuilder<V1WebhookConversion, V1WebhookConversionBuilder> {
  public V1WebhookConversionBuilder() {
    this(false);
  }

  public V1WebhookConversionBuilder(Boolean validationEnabled) {
    this(new V1WebhookConversion(), validationEnabled);
  }

  public V1WebhookConversionBuilder(V1WebhookConversionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1WebhookConversionBuilder(
      V1WebhookConversionFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1WebhookConversion(), validationEnabled);
  }

  public V1WebhookConversionBuilder(
      V1WebhookConversionFluent<?> fluent, V1WebhookConversion instance) {
    this(fluent, instance, false);
  }

  public V1WebhookConversionBuilder(
      V1WebhookConversionFluent<?> fluent,
      V1WebhookConversion instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withClientConfig(instance.getClientConfig());

    fluent.withConversionReviewVersions(instance.getConversionReviewVersions());

    this.validationEnabled = validationEnabled;
  }

  public V1WebhookConversionBuilder(V1WebhookConversion instance) {
    this(instance, false);
  }

  public V1WebhookConversionBuilder(V1WebhookConversion instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withClientConfig(instance.getClientConfig());

    this.withConversionReviewVersions(instance.getConversionReviewVersions());

    this.validationEnabled = validationEnabled;
  }

  V1WebhookConversionFluent<?> fluent;
  Boolean validationEnabled;

  public V1WebhookConversion build() {
    V1WebhookConversion buildable = new V1WebhookConversion();
    buildable.setClientConfig(fluent.getClientConfig());
    buildable.setConversionReviewVersions(fluent.getConversionReviewVersions());
    return buildable;
  }
}
