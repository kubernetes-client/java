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
public class V1ResourceClaimTemplateListBuilder extends V1ResourceClaimTemplateListFluent<V1ResourceClaimTemplateListBuilder> implements VisitableBuilder<V1ResourceClaimTemplateList,V1ResourceClaimTemplateListBuilder>{

  V1ResourceClaimTemplateListFluent<?> fluent;

  public V1ResourceClaimTemplateListBuilder() {
    this(new V1ResourceClaimTemplateList());
  }
  
  public V1ResourceClaimTemplateListBuilder(V1ResourceClaimTemplateListFluent<?> fluent) {
    this(fluent, new V1ResourceClaimTemplateList());
  }
  
  public V1ResourceClaimTemplateListBuilder(V1ResourceClaimTemplateList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ResourceClaimTemplateListBuilder(V1ResourceClaimTemplateListFluent<?> fluent,V1ResourceClaimTemplateList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ResourceClaimTemplateList build() {
    V1ResourceClaimTemplateList buildable = new V1ResourceClaimTemplateList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}