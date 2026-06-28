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
public class V2APIGroupDiscoveryListBuilder extends V2APIGroupDiscoveryListFluent<V2APIGroupDiscoveryListBuilder> implements VisitableBuilder<V2APIGroupDiscoveryList,V2APIGroupDiscoveryListBuilder>{

  V2APIGroupDiscoveryListFluent<?> fluent;

  public V2APIGroupDiscoveryListBuilder() {
    this(new V2APIGroupDiscoveryList());
  }
  
  public V2APIGroupDiscoveryListBuilder(V2APIGroupDiscoveryListFluent<?> fluent) {
    this(fluent, new V2APIGroupDiscoveryList());
  }
  
  public V2APIGroupDiscoveryListBuilder(V2APIGroupDiscoveryList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2APIGroupDiscoveryListBuilder(V2APIGroupDiscoveryListFluent<?> fluent,V2APIGroupDiscoveryList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2APIGroupDiscoveryList build() {
    V2APIGroupDiscoveryList buildable = new V2APIGroupDiscoveryList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setItems(fluent.buildItems());
    return buildable;
  }
  
}