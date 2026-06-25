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
public class V1ReplicationControllerListBuilder extends V1ReplicationControllerListFluent<V1ReplicationControllerListBuilder> implements VisitableBuilder<V1ReplicationControllerList,V1ReplicationControllerListBuilder>{

  V1ReplicationControllerListFluent<?> fluent;

  public V1ReplicationControllerListBuilder() {
    this(new V1ReplicationControllerList());
  }
  
  public V1ReplicationControllerListBuilder(V1ReplicationControllerListFluent<?> fluent) {
    this(fluent, new V1ReplicationControllerList());
  }
  
  public V1ReplicationControllerListBuilder(V1ReplicationControllerList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ReplicationControllerListBuilder(V1ReplicationControllerListFluent<?> fluent,V1ReplicationControllerList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ReplicationControllerList build() {
    V1ReplicationControllerList buildable = new V1ReplicationControllerList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}