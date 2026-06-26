/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class ApiextensionsV1WebhookClientConfigBuilder extends ApiextensionsV1WebhookClientConfigFluent<ApiextensionsV1WebhookClientConfigBuilder> implements VisitableBuilder<ApiextensionsV1WebhookClientConfig,ApiextensionsV1WebhookClientConfigBuilder>{

  ApiextensionsV1WebhookClientConfigFluent<?> fluent;

  public ApiextensionsV1WebhookClientConfigBuilder() {
    this(new ApiextensionsV1WebhookClientConfig());
  }
  
  public ApiextensionsV1WebhookClientConfigBuilder(ApiextensionsV1WebhookClientConfigFluent<?> fluent) {
    this(fluent, new ApiextensionsV1WebhookClientConfig());
  }
  
  public ApiextensionsV1WebhookClientConfigBuilder(ApiextensionsV1WebhookClientConfig instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public ApiextensionsV1WebhookClientConfigBuilder(ApiextensionsV1WebhookClientConfigFluent<?> fluent,ApiextensionsV1WebhookClientConfig instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public ApiextensionsV1WebhookClientConfig build() {
    ApiextensionsV1WebhookClientConfig buildable = new ApiextensionsV1WebhookClientConfig();
    buildable.setCaBundle(fluent.getCaBundle());
    buildable.setService(fluent.buildService());
    buildable.setUrl(fluent.getUrl());
    return buildable;
  }
  
}