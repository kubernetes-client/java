package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1MutatingWebhookBuilder extends V1MutatingWebhookFluent<V1MutatingWebhookBuilder> implements VisitableBuilder<V1MutatingWebhook,V1MutatingWebhookBuilder>{
  public V1MutatingWebhookBuilder() {
    this(new V1MutatingWebhook());
  }
  
  public V1MutatingWebhookBuilder(V1MutatingWebhookFluent<?> fluent) {
    this(fluent, new V1MutatingWebhook());
  }
  
  public V1MutatingWebhookBuilder(V1MutatingWebhookFluent<?> fluent,V1MutatingWebhook instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1MutatingWebhookBuilder(V1MutatingWebhook instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1MutatingWebhookFluent<?> fluent;
  
  public V1MutatingWebhook build() {
    V1MutatingWebhook buildable = new V1MutatingWebhook();
    buildable.setAdmissionReviewVersions(fluent.getAdmissionReviewVersions());
    buildable.setClientConfig(fluent.buildClientConfig());
    buildable.setFailurePolicy(fluent.getFailurePolicy());
    buildable.setMatchConditions(fluent.buildMatchConditions());
    buildable.setMatchPolicy(fluent.getMatchPolicy());
    buildable.setName(fluent.getName());
    buildable.setNamespaceSelector(fluent.buildNamespaceSelector());
    buildable.setObjectSelector(fluent.buildObjectSelector());
    buildable.setReinvocationPolicy(fluent.getReinvocationPolicy());
    buildable.setRules(fluent.buildRules());
    buildable.setSideEffects(fluent.getSideEffects());
    buildable.setTimeoutSeconds(fluent.getTimeoutSeconds());
    return buildable;
  }
  

}