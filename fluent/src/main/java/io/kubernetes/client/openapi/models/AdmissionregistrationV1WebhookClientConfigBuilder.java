package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class AdmissionregistrationV1WebhookClientConfigBuilder extends AdmissionregistrationV1WebhookClientConfigFluentImpl<AdmissionregistrationV1WebhookClientConfigBuilder> implements VisitableBuilder<AdmissionregistrationV1WebhookClientConfig,AdmissionregistrationV1WebhookClientConfigBuilder>{
  public AdmissionregistrationV1WebhookClientConfigBuilder() {
    this(false);
  }
  public AdmissionregistrationV1WebhookClientConfigBuilder(Boolean validationEnabled) {
    this(new AdmissionregistrationV1WebhookClientConfig(), validationEnabled);
  }
  public AdmissionregistrationV1WebhookClientConfigBuilder(AdmissionregistrationV1WebhookClientConfigFluent<?> fluent) {
    this(fluent, false);
  }
  public AdmissionregistrationV1WebhookClientConfigBuilder(AdmissionregistrationV1WebhookClientConfigFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new AdmissionregistrationV1WebhookClientConfig(), validationEnabled);
  }
  public AdmissionregistrationV1WebhookClientConfigBuilder(AdmissionregistrationV1WebhookClientConfigFluent<?> fluent,AdmissionregistrationV1WebhookClientConfig instance) {
    this(fluent, instance, false);
  }
  public AdmissionregistrationV1WebhookClientConfigBuilder(AdmissionregistrationV1WebhookClientConfigFluent<?> fluent,AdmissionregistrationV1WebhookClientConfig instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCaBundle(instance.getCaBundle());

    fluent.withService(instance.getService());

    fluent.withUrl(instance.getUrl());

    this.validationEnabled = validationEnabled; 
  }
  public AdmissionregistrationV1WebhookClientConfigBuilder(AdmissionregistrationV1WebhookClientConfig instance) {
    this(instance,false);
  }
  public AdmissionregistrationV1WebhookClientConfigBuilder(AdmissionregistrationV1WebhookClientConfig instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withCaBundle(instance.getCaBundle());

    this.withService(instance.getService());

    this.withUrl(instance.getUrl());

    this.validationEnabled = validationEnabled; 
  }
  AdmissionregistrationV1WebhookClientConfigFluent<?> fluent;
  Boolean validationEnabled;
  public AdmissionregistrationV1WebhookClientConfig build() {
    AdmissionregistrationV1WebhookClientConfig buildable = new AdmissionregistrationV1WebhookClientConfig();
    buildable.setCaBundle(fluent.getCaBundle());
    buildable.setService(fluent.getService());
    buildable.setUrl(fluent.getUrl());
    return buildable;
  }
  
}