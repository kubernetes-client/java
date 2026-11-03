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
import javax.annotation.processing.Generated;
@Generated("io.sundr:builder-annotations")
public class V1CSINodeStatusBuilder extends V1CSINodeStatusFluent<V1CSINodeStatusBuilder> implements VisitableBuilder<V1CSINodeStatus,V1CSINodeStatusBuilder>{

  V1CSINodeStatusFluent<?> fluent;

  public V1CSINodeStatusBuilder() {
    this(new V1CSINodeStatus());
  }
  
  public V1CSINodeStatusBuilder(V1CSINodeStatusFluent<?> fluent) {
    this(fluent, new V1CSINodeStatus());
  }
  
  public V1CSINodeStatusBuilder(V1CSINodeStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CSINodeStatusBuilder(V1CSINodeStatusFluent<?> fluent,V1CSINodeStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CSINodeStatus build() {
    V1CSINodeStatus buildable = new V1CSINodeStatus();
    buildable.setStorageHealth(fluent.buildStorageHealth());
    return buildable;
  }
  
}