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
public class V1ComponentStatusBuilder extends V1ComponentStatusFluent<V1ComponentStatusBuilder> implements VisitableBuilder<V1ComponentStatus,V1ComponentStatusBuilder>{

  V1ComponentStatusFluent<?> fluent;

  public V1ComponentStatusBuilder() {
    this(new V1ComponentStatus());
  }
  
  public V1ComponentStatusBuilder(V1ComponentStatusFluent<?> fluent) {
    this(fluent, new V1ComponentStatus());
  }
  
  public V1ComponentStatusBuilder(V1ComponentStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ComponentStatusBuilder(V1ComponentStatusFluent<?> fluent,V1ComponentStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ComponentStatus build() {
    V1ComponentStatus buildable = new V1ComponentStatus();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setConditions(fluent.buildConditions());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}