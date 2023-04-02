package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1MutatingWebhookConfigurationBuilder extends V1MutatingWebhookConfigurationFluentImpl<V1MutatingWebhookConfigurationBuilder> implements VisitableBuilder<V1MutatingWebhookConfiguration,V1MutatingWebhookConfigurationBuilder>{
  public V1MutatingWebhookConfigurationBuilder() {
    this(false);
  }
  public V1MutatingWebhookConfigurationBuilder(Boolean validationEnabled) {
    this(new V1MutatingWebhookConfiguration(), validationEnabled);
  }
  public V1MutatingWebhookConfigurationBuilder(V1MutatingWebhookConfigurationFluent<?> fluent) {
    this(fluent, false);
  }
  public V1MutatingWebhookConfigurationBuilder(V1MutatingWebhookConfigurationFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1MutatingWebhookConfiguration(), validationEnabled);
  }
  public V1MutatingWebhookConfigurationBuilder(V1MutatingWebhookConfigurationFluent<?> fluent,V1MutatingWebhookConfiguration instance) {
    this(fluent, instance, false);
  }
  public V1MutatingWebhookConfigurationBuilder(V1MutatingWebhookConfigurationFluent<?> fluent,V1MutatingWebhookConfiguration instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withWebhooks(instance.getWebhooks());

    this.validationEnabled = validationEnabled; 
  }
  public V1MutatingWebhookConfigurationBuilder(V1MutatingWebhookConfiguration instance) {
    this(instance,false);
  }
  public V1MutatingWebhookConfigurationBuilder(V1MutatingWebhookConfiguration instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withWebhooks(instance.getWebhooks());

    this.validationEnabled = validationEnabled; 
  }
  V1MutatingWebhookConfigurationFluent<?> fluent;
  Boolean validationEnabled;
  public V1MutatingWebhookConfiguration build() {
    V1MutatingWebhookConfiguration buildable = new V1MutatingWebhookConfiguration();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setWebhooks(fluent.getWebhooks());
    return buildable;
  }
  
}