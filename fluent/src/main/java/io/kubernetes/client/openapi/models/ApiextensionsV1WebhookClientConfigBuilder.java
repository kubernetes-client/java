package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class ApiextensionsV1WebhookClientConfigBuilder extends ApiextensionsV1WebhookClientConfigFluentImpl<ApiextensionsV1WebhookClientConfigBuilder> implements VisitableBuilder<ApiextensionsV1WebhookClientConfig,ApiextensionsV1WebhookClientConfigBuilder>{
  public ApiextensionsV1WebhookClientConfigBuilder() {
    this(false);
  }
  public ApiextensionsV1WebhookClientConfigBuilder(Boolean validationEnabled) {
    this(new ApiextensionsV1WebhookClientConfig(), validationEnabled);
  }
  public ApiextensionsV1WebhookClientConfigBuilder(ApiextensionsV1WebhookClientConfigFluent<?> fluent) {
    this(fluent, false);
  }
  public ApiextensionsV1WebhookClientConfigBuilder(ApiextensionsV1WebhookClientConfigFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new ApiextensionsV1WebhookClientConfig(), validationEnabled);
  }
  public ApiextensionsV1WebhookClientConfigBuilder(ApiextensionsV1WebhookClientConfigFluent<?> fluent,ApiextensionsV1WebhookClientConfig instance) {
    this(fluent, instance, false);
  }
  public ApiextensionsV1WebhookClientConfigBuilder(ApiextensionsV1WebhookClientConfigFluent<?> fluent,ApiextensionsV1WebhookClientConfig instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCaBundle(instance.getCaBundle());

    fluent.withService(instance.getService());

    fluent.withUrl(instance.getUrl());

    this.validationEnabled = validationEnabled; 
  }
  public ApiextensionsV1WebhookClientConfigBuilder(ApiextensionsV1WebhookClientConfig instance) {
    this(instance,false);
  }
  public ApiextensionsV1WebhookClientConfigBuilder(ApiextensionsV1WebhookClientConfig instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withCaBundle(instance.getCaBundle());

    this.withService(instance.getService());

    this.withUrl(instance.getUrl());

    this.validationEnabled = validationEnabled; 
  }
  ApiextensionsV1WebhookClientConfigFluent<?> fluent;
  Boolean validationEnabled;
  public ApiextensionsV1WebhookClientConfig build() {
    ApiextensionsV1WebhookClientConfig buildable = new ApiextensionsV1WebhookClientConfig();
    buildable.setCaBundle(fluent.getCaBundle());
    buildable.setService(fluent.getService());
    buildable.setUrl(fluent.getUrl());
    return buildable;
  }
  
}