package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class AdmissionregistrationV1WebhookClientConfigBuilder extends AdmissionregistrationV1WebhookClientConfigFluent<AdmissionregistrationV1WebhookClientConfigBuilder> implements VisitableBuilder<AdmissionregistrationV1WebhookClientConfig,AdmissionregistrationV1WebhookClientConfigBuilder>{
  public AdmissionregistrationV1WebhookClientConfigBuilder() {
    this(new AdmissionregistrationV1WebhookClientConfig());
  }
  
  public AdmissionregistrationV1WebhookClientConfigBuilder(AdmissionregistrationV1WebhookClientConfigFluent<?> fluent) {
    this(fluent, new AdmissionregistrationV1WebhookClientConfig());
  }
  
  public AdmissionregistrationV1WebhookClientConfigBuilder(AdmissionregistrationV1WebhookClientConfigFluent<?> fluent,AdmissionregistrationV1WebhookClientConfig instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public AdmissionregistrationV1WebhookClientConfigBuilder(AdmissionregistrationV1WebhookClientConfig instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  AdmissionregistrationV1WebhookClientConfigFluent<?> fluent;
  
  public AdmissionregistrationV1WebhookClientConfig build() {
    AdmissionregistrationV1WebhookClientConfig buildable = new AdmissionregistrationV1WebhookClientConfig();
    buildable.setCaBundle(fluent.getCaBundle());
    buildable.setService(fluent.buildService());
    buildable.setUrl(fluent.getUrl());
    return buildable;
  }
  

}