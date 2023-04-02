package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1WebhookConversionBuilder extends V1WebhookConversionFluentImpl<V1WebhookConversionBuilder> implements VisitableBuilder<V1WebhookConversion,V1WebhookConversionBuilder>{
  public V1WebhookConversionBuilder() {
    this(false);
  }
  public V1WebhookConversionBuilder(Boolean validationEnabled) {
    this(new V1WebhookConversion(), validationEnabled);
  }
  public V1WebhookConversionBuilder(V1WebhookConversionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1WebhookConversionBuilder(V1WebhookConversionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1WebhookConversion(), validationEnabled);
  }
  public V1WebhookConversionBuilder(V1WebhookConversionFluent<?> fluent,V1WebhookConversion instance) {
    this(fluent, instance, false);
  }
  public V1WebhookConversionBuilder(V1WebhookConversionFluent<?> fluent,V1WebhookConversion instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withClientConfig(instance.getClientConfig());

    fluent.withConversionReviewVersions(instance.getConversionReviewVersions());

    this.validationEnabled = validationEnabled; 
  }
  public V1WebhookConversionBuilder(V1WebhookConversion instance) {
    this(instance,false);
  }
  public V1WebhookConversionBuilder(V1WebhookConversion instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withClientConfig(instance.getClientConfig());

    this.withConversionReviewVersions(instance.getConversionReviewVersions());

    this.validationEnabled = validationEnabled; 
  }
  V1WebhookConversionFluent<?> fluent;
  Boolean validationEnabled;
  public V1WebhookConversion build() {
    V1WebhookConversion buildable = new V1WebhookConversion();
    buildable.setClientConfig(fluent.getClientConfig());
    buildable.setConversionReviewVersions(fluent.getConversionReviewVersions());
    return buildable;
  }
  
}