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
public class V1beta1ResourceClaimTemplateBuilder extends V1beta1ResourceClaimTemplateFluent<V1beta1ResourceClaimTemplateBuilder> implements VisitableBuilder<V1beta1ResourceClaimTemplate,V1beta1ResourceClaimTemplateBuilder>{

  V1beta1ResourceClaimTemplateFluent<?> fluent;

  public V1beta1ResourceClaimTemplateBuilder() {
    this(new V1beta1ResourceClaimTemplate());
  }
  
  public V1beta1ResourceClaimTemplateBuilder(V1beta1ResourceClaimTemplateFluent<?> fluent) {
    this(fluent, new V1beta1ResourceClaimTemplate());
  }
  
  public V1beta1ResourceClaimTemplateBuilder(V1beta1ResourceClaimTemplate instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1ResourceClaimTemplateBuilder(V1beta1ResourceClaimTemplateFluent<?> fluent,V1beta1ResourceClaimTemplate instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1ResourceClaimTemplate build() {
    V1beta1ResourceClaimTemplate buildable = new V1beta1ResourceClaimTemplate();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}