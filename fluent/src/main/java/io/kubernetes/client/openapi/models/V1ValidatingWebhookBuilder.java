package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ValidatingWebhookBuilder extends V1ValidatingWebhookFluent<V1ValidatingWebhookBuilder> implements VisitableBuilder<V1ValidatingWebhook,V1ValidatingWebhookBuilder>{
  public V1ValidatingWebhookBuilder() {
    this(new V1ValidatingWebhook());
  }
  
  public V1ValidatingWebhookBuilder(V1ValidatingWebhookFluent<?> fluent) {
    this(fluent, new V1ValidatingWebhook());
  }
  
  public V1ValidatingWebhookBuilder(V1ValidatingWebhookFluent<?> fluent,V1ValidatingWebhook instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ValidatingWebhookBuilder(V1ValidatingWebhook instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ValidatingWebhookFluent<?> fluent;
  
  public V1ValidatingWebhook build() {
    V1ValidatingWebhook buildable = new V1ValidatingWebhook();
    buildable.setAdmissionReviewVersions(fluent.getAdmissionReviewVersions());
    buildable.setClientConfig(fluent.buildClientConfig());
    buildable.setFailurePolicy(fluent.getFailurePolicy());
    buildable.setMatchConditions(fluent.buildMatchConditions());
    buildable.setMatchPolicy(fluent.getMatchPolicy());
    buildable.setName(fluent.getName());
    buildable.setNamespaceSelector(fluent.buildNamespaceSelector());
    buildable.setObjectSelector(fluent.buildObjectSelector());
    buildable.setRules(fluent.buildRules());
    buildable.setSideEffects(fluent.getSideEffects());
    buildable.setTimeoutSeconds(fluent.getTimeoutSeconds());
    return buildable;
  }
  

}