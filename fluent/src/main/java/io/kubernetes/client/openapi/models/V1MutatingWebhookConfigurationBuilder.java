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
public class V1MutatingWebhookConfigurationBuilder extends V1MutatingWebhookConfigurationFluent<V1MutatingWebhookConfigurationBuilder> implements VisitableBuilder<V1MutatingWebhookConfiguration,V1MutatingWebhookConfigurationBuilder>{

  V1MutatingWebhookConfigurationFluent<?> fluent;

  public V1MutatingWebhookConfigurationBuilder() {
    this(new V1MutatingWebhookConfiguration());
  }
  
  public V1MutatingWebhookConfigurationBuilder(V1MutatingWebhookConfigurationFluent<?> fluent) {
    this(fluent, new V1MutatingWebhookConfiguration());
  }
  
  public V1MutatingWebhookConfigurationBuilder(V1MutatingWebhookConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1MutatingWebhookConfigurationBuilder(V1MutatingWebhookConfigurationFluent<?> fluent,V1MutatingWebhookConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1MutatingWebhookConfiguration build() {
    V1MutatingWebhookConfiguration buildable = new V1MutatingWebhookConfiguration();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setWebhooks(fluent.buildWebhooks());
    return buildable;
  }
  
}