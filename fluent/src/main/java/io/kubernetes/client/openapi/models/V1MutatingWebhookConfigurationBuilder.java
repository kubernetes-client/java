package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1MutatingWebhookConfigurationBuilder extends V1MutatingWebhookConfigurationFluent<V1MutatingWebhookConfigurationBuilder> implements VisitableBuilder<V1MutatingWebhookConfiguration,V1MutatingWebhookConfigurationBuilder>{
  public V1MutatingWebhookConfigurationBuilder() {
    this(new V1MutatingWebhookConfiguration());
  }
  
  public V1MutatingWebhookConfigurationBuilder(V1MutatingWebhookConfigurationFluent<?> fluent) {
    this(fluent, new V1MutatingWebhookConfiguration());
  }
  
  public V1MutatingWebhookConfigurationBuilder(V1MutatingWebhookConfigurationFluent<?> fluent,V1MutatingWebhookConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1MutatingWebhookConfigurationBuilder(V1MutatingWebhookConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1MutatingWebhookConfigurationFluent<?> fluent;
  
  public V1MutatingWebhookConfiguration build() {
    V1MutatingWebhookConfiguration buildable = new V1MutatingWebhookConfiguration();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setWebhooks(fluent.buildWebhooks());
    return buildable;
  }
  

}