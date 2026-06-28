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
public class V1ServiceListBuilder extends V1ServiceListFluent<V1ServiceListBuilder> implements VisitableBuilder<V1ServiceList,V1ServiceListBuilder>{

  V1ServiceListFluent<?> fluent;

  public V1ServiceListBuilder() {
    this(new V1ServiceList());
  }
  
  public V1ServiceListBuilder(V1ServiceListFluent<?> fluent) {
    this(fluent, new V1ServiceList());
  }
  
  public V1ServiceListBuilder(V1ServiceList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ServiceListBuilder(V1ServiceListFluent<?> fluent,V1ServiceList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ServiceList build() {
    V1ServiceList buildable = new V1ServiceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}