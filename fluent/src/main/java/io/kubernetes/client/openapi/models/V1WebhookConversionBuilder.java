package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1WebhookConversionBuilder extends V1WebhookConversionFluent<V1WebhookConversionBuilder> implements VisitableBuilder<V1WebhookConversion,V1WebhookConversionBuilder>{
  public V1WebhookConversionBuilder() {
    this(new V1WebhookConversion());
  }
  
  public V1WebhookConversionBuilder(V1WebhookConversionFluent<?> fluent) {
    this(fluent, new V1WebhookConversion());
  }
  
  public V1WebhookConversionBuilder(V1WebhookConversionFluent<?> fluent,V1WebhookConversion instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1WebhookConversionBuilder(V1WebhookConversion instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1WebhookConversionFluent<?> fluent;
  
  public V1WebhookConversion build() {
    V1WebhookConversion buildable = new V1WebhookConversion();
    buildable.setClientConfig(fluent.buildClientConfig());
    buildable.setConversionReviewVersions(fluent.getConversionReviewVersions());
    return buildable;
  }
  

}