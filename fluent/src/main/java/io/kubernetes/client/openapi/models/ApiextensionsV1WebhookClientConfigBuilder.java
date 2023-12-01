package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class ApiextensionsV1WebhookClientConfigBuilder extends ApiextensionsV1WebhookClientConfigFluent<ApiextensionsV1WebhookClientConfigBuilder> implements VisitableBuilder<ApiextensionsV1WebhookClientConfig,ApiextensionsV1WebhookClientConfigBuilder>{
  public ApiextensionsV1WebhookClientConfigBuilder() {
    this(new ApiextensionsV1WebhookClientConfig());
  }
  
  public ApiextensionsV1WebhookClientConfigBuilder(ApiextensionsV1WebhookClientConfigFluent<?> fluent) {
    this(fluent, new ApiextensionsV1WebhookClientConfig());
  }
  
  public ApiextensionsV1WebhookClientConfigBuilder(ApiextensionsV1WebhookClientConfigFluent<?> fluent,ApiextensionsV1WebhookClientConfig instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ApiextensionsV1WebhookClientConfigBuilder(ApiextensionsV1WebhookClientConfig instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ApiextensionsV1WebhookClientConfigFluent<?> fluent;
  
  public ApiextensionsV1WebhookClientConfig build() {
    ApiextensionsV1WebhookClientConfig buildable = new ApiextensionsV1WebhookClientConfig();
    buildable.setCaBundle(fluent.getCaBundle());
    buildable.setService(fluent.buildService());
    buildable.setUrl(fluent.getUrl());
    return buildable;
  }
  

}