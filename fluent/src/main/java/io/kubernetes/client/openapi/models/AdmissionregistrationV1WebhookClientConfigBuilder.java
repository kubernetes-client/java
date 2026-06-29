/*
Copyright 2026 The Kubernetes Authors.
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
public class AdmissionregistrationV1WebhookClientConfigBuilder extends AdmissionregistrationV1WebhookClientConfigFluent<AdmissionregistrationV1WebhookClientConfigBuilder> implements VisitableBuilder<AdmissionregistrationV1WebhookClientConfig,AdmissionregistrationV1WebhookClientConfigBuilder>{

  AdmissionregistrationV1WebhookClientConfigFluent<?> fluent;

  public AdmissionregistrationV1WebhookClientConfigBuilder() {
    this(new AdmissionregistrationV1WebhookClientConfig());
  }
  
  public AdmissionregistrationV1WebhookClientConfigBuilder(AdmissionregistrationV1WebhookClientConfigFluent<?> fluent) {
    this(fluent, new AdmissionregistrationV1WebhookClientConfig());
  }
  
  public AdmissionregistrationV1WebhookClientConfigBuilder(AdmissionregistrationV1WebhookClientConfig instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public AdmissionregistrationV1WebhookClientConfigBuilder(AdmissionregistrationV1WebhookClientConfigFluent<?> fluent,AdmissionregistrationV1WebhookClientConfig instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public AdmissionregistrationV1WebhookClientConfig build() {
    AdmissionregistrationV1WebhookClientConfig buildable = new AdmissionregistrationV1WebhookClientConfig();
    buildable.setCaBundle(fluent.getCaBundle());
    buildable.setService(fluent.buildService());
    buildable.setUrl(fluent.getUrl());
    return buildable;
  }
  
}