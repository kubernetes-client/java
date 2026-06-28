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
public class V1APIServiceListBuilder extends V1APIServiceListFluent<V1APIServiceListBuilder> implements VisitableBuilder<V1APIServiceList,V1APIServiceListBuilder>{

  V1APIServiceListFluent<?> fluent;

  public V1APIServiceListBuilder() {
    this(new V1APIServiceList());
  }
  
  public V1APIServiceListBuilder(V1APIServiceListFluent<?> fluent) {
    this(fluent, new V1APIServiceList());
  }
  
  public V1APIServiceListBuilder(V1APIServiceList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1APIServiceListBuilder(V1APIServiceListFluent<?> fluent,V1APIServiceList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1APIServiceList build() {
    V1APIServiceList buildable = new V1APIServiceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}