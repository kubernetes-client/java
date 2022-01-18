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

public class V1MutatingWebhookBuilder
    extends io.kubernetes.client.openapi.models.V1MutatingWebhookFluentImpl<
        io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1MutatingWebhook,
        io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder> {
  public V1MutatingWebhookBuilder() {
    this(false);
  }

  public V1MutatingWebhookBuilder(java.lang.Boolean validationEnabled) {
    this(new V1MutatingWebhook(), validationEnabled);
  }

  public V1MutatingWebhookBuilder(
      io.kubernetes.client.openapi.models.V1MutatingWebhookFluent<?> fluent) {
    this(fluent, false);
  }

  public V1MutatingWebhookBuilder(
      io.kubernetes.client.openapi.models.V1MutatingWebhookFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1MutatingWebhook(), validationEnabled);
  }

  public V1MutatingWebhookBuilder(
      io.kubernetes.client.openapi.models.V1MutatingWebhookFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1MutatingWebhook instance) {
    this(fluent, instance, false);
  }

  public V1MutatingWebhookBuilder(
      io.kubernetes.client.openapi.models.V1MutatingWebhookFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1MutatingWebhook instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAdmissionReviewVersions(instance.getAdmissionReviewVersions());

    fluent.withClientConfig(instance.getClientConfig());

    fluent.withFailurePolicy(instance.getFailurePolicy());

    fluent.withMatchPolicy(instance.getMatchPolicy());

    fluent.withName(instance.getName());

    fluent.withNamespaceSelector(instance.getNamespaceSelector());

    fluent.withObjectSelector(instance.getObjectSelector());

    fluent.withReinvocationPolicy(instance.getReinvocationPolicy());

    fluent.withRules(instance.getRules());

    fluent.withSideEffects(instance.getSideEffects());

    fluent.withTimeoutSeconds(instance.getTimeoutSeconds());

    this.validationEnabled = validationEnabled;
  }

  public V1MutatingWebhookBuilder(io.kubernetes.client.openapi.models.V1MutatingWebhook instance) {
    this(instance, false);
  }

  public V1MutatingWebhookBuilder(
      io.kubernetes.client.openapi.models.V1MutatingWebhook instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAdmissionReviewVersions(instance.getAdmissionReviewVersions());

    this.withClientConfig(instance.getClientConfig());

    this.withFailurePolicy(instance.getFailurePolicy());

    this.withMatchPolicy(instance.getMatchPolicy());

    this.withName(instance.getName());

    this.withNamespaceSelector(instance.getNamespaceSelector());

    this.withObjectSelector(instance.getObjectSelector());

    this.withReinvocationPolicy(instance.getReinvocationPolicy());

    this.withRules(instance.getRules());

    this.withSideEffects(instance.getSideEffects());

    this.withTimeoutSeconds(instance.getTimeoutSeconds());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1MutatingWebhookFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1MutatingWebhook build() {
    V1MutatingWebhook buildable = new V1MutatingWebhook();
    buildable.setAdmissionReviewVersions(fluent.getAdmissionReviewVersions());
    buildable.setClientConfig(fluent.getClientConfig());
    buildable.setFailurePolicy(fluent.getFailurePolicy());
    buildable.setMatchPolicy(fluent.getMatchPolicy());
    buildable.setName(fluent.getName());
    buildable.setNamespaceSelector(fluent.getNamespaceSelector());
    buildable.setObjectSelector(fluent.getObjectSelector());
    buildable.setReinvocationPolicy(fluent.getReinvocationPolicy());
    buildable.setRules(fluent.getRules());
    buildable.setSideEffects(fluent.getSideEffects());
    buildable.setTimeoutSeconds(fluent.getTimeoutSeconds());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1MutatingWebhookBuilder that = (V1MutatingWebhookBuilder) o;
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
