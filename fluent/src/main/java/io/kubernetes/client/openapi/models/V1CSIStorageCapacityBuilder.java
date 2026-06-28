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
public class V1CSIStorageCapacityBuilder extends V1CSIStorageCapacityFluent<V1CSIStorageCapacityBuilder> implements VisitableBuilder<V1CSIStorageCapacity,V1CSIStorageCapacityBuilder>{

  V1CSIStorageCapacityFluent<?> fluent;

  public V1CSIStorageCapacityBuilder() {
    this(new V1CSIStorageCapacity());
  }
  
  public V1CSIStorageCapacityBuilder(V1CSIStorageCapacityFluent<?> fluent) {
    this(fluent, new V1CSIStorageCapacity());
  }
  
  public V1CSIStorageCapacityBuilder(V1CSIStorageCapacity instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CSIStorageCapacityBuilder(V1CSIStorageCapacityFluent<?> fluent,V1CSIStorageCapacity instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CSIStorageCapacity build() {
    V1CSIStorageCapacity buildable = new V1CSIStorageCapacity();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setCapacity(fluent.getCapacity());
    buildable.setKind(fluent.getKind());
    buildable.setMaximumVolumeSize(fluent.getMaximumVolumeSize());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setNodeTopology(fluent.buildNodeTopology());
    buildable.setStorageClassName(fluent.getStorageClassName());
    return buildable;
  }
  
}