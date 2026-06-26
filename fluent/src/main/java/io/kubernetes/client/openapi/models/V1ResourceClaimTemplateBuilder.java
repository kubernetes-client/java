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
public class V1ResourceClaimTemplateBuilder extends V1ResourceClaimTemplateFluent<V1ResourceClaimTemplateBuilder> implements VisitableBuilder<V1ResourceClaimTemplate,V1ResourceClaimTemplateBuilder>{

  V1ResourceClaimTemplateFluent<?> fluent;

  public V1ResourceClaimTemplateBuilder() {
    this(new V1ResourceClaimTemplate());
  }
  
  public V1ResourceClaimTemplateBuilder(V1ResourceClaimTemplateFluent<?> fluent) {
    this(fluent, new V1ResourceClaimTemplate());
  }
  
  public V1ResourceClaimTemplateBuilder(V1ResourceClaimTemplate instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ResourceClaimTemplateBuilder(V1ResourceClaimTemplateFluent<?> fluent,V1ResourceClaimTemplate instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ResourceClaimTemplate build() {
    V1ResourceClaimTemplate buildable = new V1ResourceClaimTemplate();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}