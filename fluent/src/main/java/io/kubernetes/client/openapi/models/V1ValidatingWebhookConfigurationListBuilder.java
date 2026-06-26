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
public class V1ValidatingWebhookConfigurationListBuilder extends V1ValidatingWebhookConfigurationListFluent<V1ValidatingWebhookConfigurationListBuilder> implements VisitableBuilder<V1ValidatingWebhookConfigurationList,V1ValidatingWebhookConfigurationListBuilder>{

  V1ValidatingWebhookConfigurationListFluent<?> fluent;

  public V1ValidatingWebhookConfigurationListBuilder() {
    this(new V1ValidatingWebhookConfigurationList());
  }
  
  public V1ValidatingWebhookConfigurationListBuilder(V1ValidatingWebhookConfigurationListFluent<?> fluent) {
    this(fluent, new V1ValidatingWebhookConfigurationList());
  }
  
  public V1ValidatingWebhookConfigurationListBuilder(V1ValidatingWebhookConfigurationList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ValidatingWebhookConfigurationListBuilder(V1ValidatingWebhookConfigurationListFluent<?> fluent,V1ValidatingWebhookConfigurationList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ValidatingWebhookConfigurationList build() {
    V1ValidatingWebhookConfigurationList buildable = new V1ValidatingWebhookConfigurationList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}