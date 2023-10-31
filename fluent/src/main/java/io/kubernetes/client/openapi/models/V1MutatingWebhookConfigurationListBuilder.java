package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1MutatingWebhookConfigurationListBuilder extends V1MutatingWebhookConfigurationListFluent<V1MutatingWebhookConfigurationListBuilder> implements VisitableBuilder<V1MutatingWebhookConfigurationList,V1MutatingWebhookConfigurationListBuilder>{
  public V1MutatingWebhookConfigurationListBuilder() {
    this(new V1MutatingWebhookConfigurationList());
  }
  
  public V1MutatingWebhookConfigurationListBuilder(V1MutatingWebhookConfigurationListFluent<?> fluent) {
    this(fluent, new V1MutatingWebhookConfigurationList());
  }
  
  public V1MutatingWebhookConfigurationListBuilder(V1MutatingWebhookConfigurationListFluent<?> fluent,V1MutatingWebhookConfigurationList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1MutatingWebhookConfigurationListBuilder(V1MutatingWebhookConfigurationList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1MutatingWebhookConfigurationListFluent<?> fluent;
  
  public V1MutatingWebhookConfigurationList build() {
    V1MutatingWebhookConfigurationList buildable = new V1MutatingWebhookConfigurationList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}