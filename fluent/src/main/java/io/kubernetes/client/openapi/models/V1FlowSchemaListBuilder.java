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
public class V1FlowSchemaListBuilder extends V1FlowSchemaListFluent<V1FlowSchemaListBuilder> implements VisitableBuilder<V1FlowSchemaList,V1FlowSchemaListBuilder>{

  V1FlowSchemaListFluent<?> fluent;

  public V1FlowSchemaListBuilder() {
    this(new V1FlowSchemaList());
  }
  
  public V1FlowSchemaListBuilder(V1FlowSchemaListFluent<?> fluent) {
    this(fluent, new V1FlowSchemaList());
  }
  
  public V1FlowSchemaListBuilder(V1FlowSchemaList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1FlowSchemaListBuilder(V1FlowSchemaListFluent<?> fluent,V1FlowSchemaList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1FlowSchemaList build() {
    V1FlowSchemaList buildable = new V1FlowSchemaList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}