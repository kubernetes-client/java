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

public class V1ValidatingWebhookBuilder
    extends V1ValidatingWebhookFluentImpl<V1ValidatingWebhookBuilder>
    implements VisitableBuilder<
        V1ValidatingWebhook, io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder> {
  public V1ValidatingWebhookBuilder() {
    this(false);
  }

  public V1ValidatingWebhookBuilder(Boolean validationEnabled) {
    this(new V1ValidatingWebhook(), validationEnabled);
  }

  public V1ValidatingWebhookBuilder(V1ValidatingWebhookFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ValidatingWebhookBuilder(
      io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ValidatingWebhook(), validationEnabled);
  }

  public V1ValidatingWebhookBuilder(
      io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ValidatingWebhook instance) {
    this(fluent, instance, false);
  }

  public V1ValidatingWebhookBuilder(
      io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ValidatingWebhook instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAdmissionReviewVersions(instance.getAdmissionReviewVersions());

    fluent.withClientConfig(instance.getClientConfig());

    fluent.withFailurePolicy(instance.getFailurePolicy());

    fluent.withMatchPolicy(instance.getMatchPolicy());

    fluent.withName(instance.getName());

    fluent.withNamespaceSelector(instance.getNamespaceSelector());

    fluent.withObjectSelector(instance.getObjectSelector());

    fluent.withRules(instance.getRules());

    fluent.withSideEffects(instance.getSideEffects());

    fluent.withTimeoutSeconds(instance.getTimeoutSeconds());

    this.validationEnabled = validationEnabled;
  }

  public V1ValidatingWebhookBuilder(
      io.kubernetes.client.openapi.models.V1ValidatingWebhook instance) {
    this(instance, false);
  }

  public V1ValidatingWebhookBuilder(
      io.kubernetes.client.openapi.models.V1ValidatingWebhook instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAdmissionReviewVersions(instance.getAdmissionReviewVersions());

    this.withClientConfig(instance.getClientConfig());

    this.withFailurePolicy(instance.getFailurePolicy());

    this.withMatchPolicy(instance.getMatchPolicy());

    this.withName(instance.getName());

    this.withNamespaceSelector(instance.getNamespaceSelector());

    this.withObjectSelector(instance.getObjectSelector());

    this.withRules(instance.getRules());

    this.withSideEffects(instance.getSideEffects());

    this.withTimeoutSeconds(instance.getTimeoutSeconds());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ValidatingWebhook build() {
    V1ValidatingWebhook buildable = new V1ValidatingWebhook();
    buildable.setAdmissionReviewVersions(fluent.getAdmissionReviewVersions());
    buildable.setClientConfig(fluent.getClientConfig());
    buildable.setFailurePolicy(fluent.getFailurePolicy());
    buildable.setMatchPolicy(fluent.getMatchPolicy());
    buildable.setName(fluent.getName());
    buildable.setNamespaceSelector(fluent.getNamespaceSelector());
    buildable.setObjectSelector(fluent.getObjectSelector());
    buildable.setRules(fluent.getRules());
    buildable.setSideEffects(fluent.getSideEffects());
    buildable.setTimeoutSeconds(fluent.getTimeoutSeconds());
    return buildable;
  }
}
