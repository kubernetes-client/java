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
public class V1ComponentStatusListBuilder extends V1ComponentStatusListFluent<V1ComponentStatusListBuilder> implements VisitableBuilder<V1ComponentStatusList,V1ComponentStatusListBuilder>{

  V1ComponentStatusListFluent<?> fluent;

  public V1ComponentStatusListBuilder() {
    this(new V1ComponentStatusList());
  }
  
  public V1ComponentStatusListBuilder(V1ComponentStatusListFluent<?> fluent) {
    this(fluent, new V1ComponentStatusList());
  }
  
  public V1ComponentStatusListBuilder(V1ComponentStatusList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ComponentStatusListBuilder(V1ComponentStatusListFluent<?> fluent,V1ComponentStatusList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ComponentStatusList build() {
    V1ComponentStatusList buildable = new V1ComponentStatusList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}