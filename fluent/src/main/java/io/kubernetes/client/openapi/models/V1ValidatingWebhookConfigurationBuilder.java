package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ValidatingWebhookConfigurationBuilder extends V1ValidatingWebhookConfigurationFluent<V1ValidatingWebhookConfigurationBuilder> implements VisitableBuilder<V1ValidatingWebhookConfiguration,V1ValidatingWebhookConfigurationBuilder>{
  public V1ValidatingWebhookConfigurationBuilder() {
    this(new V1ValidatingWebhookConfiguration());
  }
  
  public V1ValidatingWebhookConfigurationBuilder(V1ValidatingWebhookConfigurationFluent<?> fluent) {
    this(fluent, new V1ValidatingWebhookConfiguration());
  }
  
  public V1ValidatingWebhookConfigurationBuilder(V1ValidatingWebhookConfigurationFluent<?> fluent,V1ValidatingWebhookConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ValidatingWebhookConfigurationBuilder(V1ValidatingWebhookConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ValidatingWebhookConfigurationFluent<?> fluent;
  
  public V1ValidatingWebhookConfiguration build() {
    V1ValidatingWebhookConfiguration buildable = new V1ValidatingWebhookConfiguration();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setWebhooks(fluent.buildWebhooks());
    return buildable;
  }
  

}