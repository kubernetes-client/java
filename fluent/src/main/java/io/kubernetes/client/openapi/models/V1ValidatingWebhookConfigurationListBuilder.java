package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ValidatingWebhookConfigurationListBuilder extends V1ValidatingWebhookConfigurationListFluent<V1ValidatingWebhookConfigurationListBuilder> implements VisitableBuilder<V1ValidatingWebhookConfigurationList,V1ValidatingWebhookConfigurationListBuilder>{
  public V1ValidatingWebhookConfigurationListBuilder() {
    this(new V1ValidatingWebhookConfigurationList());
  }
  
  public V1ValidatingWebhookConfigurationListBuilder(V1ValidatingWebhookConfigurationListFluent<?> fluent) {
    this(fluent, new V1ValidatingWebhookConfigurationList());
  }
  
  public V1ValidatingWebhookConfigurationListBuilder(V1ValidatingWebhookConfigurationListFluent<?> fluent,V1ValidatingWebhookConfigurationList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ValidatingWebhookConfigurationListBuilder(V1ValidatingWebhookConfigurationList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ValidatingWebhookConfigurationListFluent<?> fluent;
  
  public V1ValidatingWebhookConfigurationList build() {
    V1ValidatingWebhookConfigurationList buildable = new V1ValidatingWebhookConfigurationList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}