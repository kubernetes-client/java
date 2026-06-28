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
public class V1MutatingWebhookConfigurationListBuilder extends V1MutatingWebhookConfigurationListFluent<V1MutatingWebhookConfigurationListBuilder> implements VisitableBuilder<V1MutatingWebhookConfigurationList,V1MutatingWebhookConfigurationListBuilder>{

  V1MutatingWebhookConfigurationListFluent<?> fluent;

  public V1MutatingWebhookConfigurationListBuilder() {
    this(new V1MutatingWebhookConfigurationList());
  }
  
  public V1MutatingWebhookConfigurationListBuilder(V1MutatingWebhookConfigurationListFluent<?> fluent) {
    this(fluent, new V1MutatingWebhookConfigurationList());
  }
  
  public V1MutatingWebhookConfigurationListBuilder(V1MutatingWebhookConfigurationList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1MutatingWebhookConfigurationListBuilder(V1MutatingWebhookConfigurationListFluent<?> fluent,V1MutatingWebhookConfigurationList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1MutatingWebhookConfigurationList build() {
    V1MutatingWebhookConfigurationList buildable = new V1MutatingWebhookConfigurationList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}