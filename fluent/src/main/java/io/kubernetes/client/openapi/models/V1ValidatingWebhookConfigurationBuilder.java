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
public class V1ValidatingWebhookConfigurationBuilder extends V1ValidatingWebhookConfigurationFluent<V1ValidatingWebhookConfigurationBuilder> implements VisitableBuilder<V1ValidatingWebhookConfiguration,V1ValidatingWebhookConfigurationBuilder>{

  V1ValidatingWebhookConfigurationFluent<?> fluent;

  public V1ValidatingWebhookConfigurationBuilder() {
    this(new V1ValidatingWebhookConfiguration());
  }
  
  public V1ValidatingWebhookConfigurationBuilder(V1ValidatingWebhookConfigurationFluent<?> fluent) {
    this(fluent, new V1ValidatingWebhookConfiguration());
  }
  
  public V1ValidatingWebhookConfigurationBuilder(V1ValidatingWebhookConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ValidatingWebhookConfigurationBuilder(V1ValidatingWebhookConfigurationFluent<?> fluent,V1ValidatingWebhookConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ValidatingWebhookConfiguration build() {
    V1ValidatingWebhookConfiguration buildable = new V1ValidatingWebhookConfiguration();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setWebhooks(fluent.buildWebhooks());
    return buildable;
  }
  
}