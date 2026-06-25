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
public class V1LeaseListBuilder extends V1LeaseListFluent<V1LeaseListBuilder> implements VisitableBuilder<V1LeaseList,V1LeaseListBuilder>{

  V1LeaseListFluent<?> fluent;

  public V1LeaseListBuilder() {
    this(new V1LeaseList());
  }
  
  public V1LeaseListBuilder(V1LeaseListFluent<?> fluent) {
    this(fluent, new V1LeaseList());
  }
  
  public V1LeaseListBuilder(V1LeaseList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1LeaseListBuilder(V1LeaseListFluent<?> fluent,V1LeaseList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1LeaseList build() {
    V1LeaseList buildable = new V1LeaseList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}