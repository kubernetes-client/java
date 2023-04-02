package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1MutatingWebhookBuilder extends V1MutatingWebhookFluentImpl<V1MutatingWebhookBuilder> implements VisitableBuilder<V1MutatingWebhook,V1MutatingWebhookBuilder>{
  public V1MutatingWebhookBuilder() {
    this(false);
  }
  public V1MutatingWebhookBuilder(Boolean validationEnabled) {
    this(new V1MutatingWebhook(), validationEnabled);
  }
  public V1MutatingWebhookBuilder(V1MutatingWebhookFluent<?> fluent) {
    this(fluent, false);
  }
  public V1MutatingWebhookBuilder(V1MutatingWebhookFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1MutatingWebhook(), validationEnabled);
  }
  public V1MutatingWebhookBuilder(V1MutatingWebhookFluent<?> fluent,V1MutatingWebhook instance) {
    this(fluent, instance, false);
  }
  public V1MutatingWebhookBuilder(V1MutatingWebhookFluent<?> fluent,V1MutatingWebhook instance,Boolean validationEnabled) {
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
  public V1MutatingWebhookBuilder(V1MutatingWebhook instance) {
    this(instance,false);
  }
  public V1MutatingWebhookBuilder(V1MutatingWebhook instance,Boolean validationEnabled) {
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
  V1MutatingWebhookFluent<?> fluent;
  Boolean validationEnabled;
  public V1MutatingWebhook build() {
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
  
}