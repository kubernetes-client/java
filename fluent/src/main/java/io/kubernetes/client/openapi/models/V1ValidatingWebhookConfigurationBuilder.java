package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ValidatingWebhookConfigurationBuilder extends V1ValidatingWebhookConfigurationFluentImpl<V1ValidatingWebhookConfigurationBuilder> implements VisitableBuilder<V1ValidatingWebhookConfiguration,V1ValidatingWebhookConfigurationBuilder>{
  public V1ValidatingWebhookConfigurationBuilder() {
    this(false);
  }
  public V1ValidatingWebhookConfigurationBuilder(Boolean validationEnabled) {
    this(new V1ValidatingWebhookConfiguration(), validationEnabled);
  }
  public V1ValidatingWebhookConfigurationBuilder(V1ValidatingWebhookConfigurationFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ValidatingWebhookConfigurationBuilder(V1ValidatingWebhookConfigurationFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ValidatingWebhookConfiguration(), validationEnabled);
  }
  public V1ValidatingWebhookConfigurationBuilder(V1ValidatingWebhookConfigurationFluent<?> fluent,V1ValidatingWebhookConfiguration instance) {
    this(fluent, instance, false);
  }
  public V1ValidatingWebhookConfigurationBuilder(V1ValidatingWebhookConfigurationFluent<?> fluent,V1ValidatingWebhookConfiguration instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withWebhooks(instance.getWebhooks());

    this.validationEnabled = validationEnabled; 
  }
  public V1ValidatingWebhookConfigurationBuilder(V1ValidatingWebhookConfiguration instance) {
    this(instance,false);
  }
  public V1ValidatingWebhookConfigurationBuilder(V1ValidatingWebhookConfiguration instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withWebhooks(instance.getWebhooks());

    this.validationEnabled = validationEnabled; 
  }
  V1ValidatingWebhookConfigurationFluent<?> fluent;
  Boolean validationEnabled;
  public V1ValidatingWebhookConfiguration build() {
    V1ValidatingWebhookConfiguration buildable = new V1ValidatingWebhookConfiguration();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setWebhooks(fluent.getWebhooks());
    return buildable;
  }
  
}