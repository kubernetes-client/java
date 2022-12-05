package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1MutatingWebhookConfigurationListBuilder extends V1MutatingWebhookConfigurationListFluentImpl<V1MutatingWebhookConfigurationListBuilder> implements VisitableBuilder<V1MutatingWebhookConfigurationList,V1MutatingWebhookConfigurationListBuilder>{
  public V1MutatingWebhookConfigurationListBuilder() {
    this(false);
  }
  public V1MutatingWebhookConfigurationListBuilder(Boolean validationEnabled) {
    this(new V1MutatingWebhookConfigurationList(), validationEnabled);
  }
  public V1MutatingWebhookConfigurationListBuilder(V1MutatingWebhookConfigurationListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1MutatingWebhookConfigurationListBuilder(V1MutatingWebhookConfigurationListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1MutatingWebhookConfigurationList(), validationEnabled);
  }
  public V1MutatingWebhookConfigurationListBuilder(V1MutatingWebhookConfigurationListFluent<?> fluent,V1MutatingWebhookConfigurationList instance) {
    this(fluent, instance, false);
  }
  public V1MutatingWebhookConfigurationListBuilder(V1MutatingWebhookConfigurationListFluent<?> fluent,V1MutatingWebhookConfigurationList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1MutatingWebhookConfigurationListBuilder(V1MutatingWebhookConfigurationList instance) {
    this(instance,false);
  }
  public V1MutatingWebhookConfigurationListBuilder(V1MutatingWebhookConfigurationList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1MutatingWebhookConfigurationListFluent<?> fluent;
  Boolean validationEnabled;
  public V1MutatingWebhookConfigurationList build() {
    V1MutatingWebhookConfigurationList buildable = new V1MutatingWebhookConfigurationList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}