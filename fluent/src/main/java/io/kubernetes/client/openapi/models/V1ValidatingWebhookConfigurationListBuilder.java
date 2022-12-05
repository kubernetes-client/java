package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ValidatingWebhookConfigurationListBuilder extends V1ValidatingWebhookConfigurationListFluentImpl<V1ValidatingWebhookConfigurationListBuilder> implements VisitableBuilder<V1ValidatingWebhookConfigurationList,V1ValidatingWebhookConfigurationListBuilder>{
  public V1ValidatingWebhookConfigurationListBuilder() {
    this(false);
  }
  public V1ValidatingWebhookConfigurationListBuilder(Boolean validationEnabled) {
    this(new V1ValidatingWebhookConfigurationList(), validationEnabled);
  }
  public V1ValidatingWebhookConfigurationListBuilder(V1ValidatingWebhookConfigurationListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ValidatingWebhookConfigurationListBuilder(V1ValidatingWebhookConfigurationListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ValidatingWebhookConfigurationList(), validationEnabled);
  }
  public V1ValidatingWebhookConfigurationListBuilder(V1ValidatingWebhookConfigurationListFluent<?> fluent,V1ValidatingWebhookConfigurationList instance) {
    this(fluent, instance, false);
  }
  public V1ValidatingWebhookConfigurationListBuilder(V1ValidatingWebhookConfigurationListFluent<?> fluent,V1ValidatingWebhookConfigurationList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1ValidatingWebhookConfigurationListBuilder(V1ValidatingWebhookConfigurationList instance) {
    this(instance,false);
  }
  public V1ValidatingWebhookConfigurationListBuilder(V1ValidatingWebhookConfigurationList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1ValidatingWebhookConfigurationListFluent<?> fluent;
  Boolean validationEnabled;
  public V1ValidatingWebhookConfigurationList build() {
    V1ValidatingWebhookConfigurationList buildable = new V1ValidatingWebhookConfigurationList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}