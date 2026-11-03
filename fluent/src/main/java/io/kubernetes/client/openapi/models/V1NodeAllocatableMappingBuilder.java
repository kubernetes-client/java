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
public class V1NodeAllocatableMappingBuilder extends V1NodeAllocatableMappingFluent<V1NodeAllocatableMappingBuilder> implements VisitableBuilder<V1NodeAllocatableMapping,V1NodeAllocatableMappingBuilder>{

  V1NodeAllocatableMappingFluent<?> fluent;

  public V1NodeAllocatableMappingBuilder() {
    this(new V1NodeAllocatableMapping());
  }
  
  public V1NodeAllocatableMappingBuilder(V1NodeAllocatableMappingFluent<?> fluent) {
    this(fluent, new V1NodeAllocatableMapping());
  }
  
  public V1NodeAllocatableMappingBuilder(V1NodeAllocatableMapping instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NodeAllocatableMappingBuilder(V1NodeAllocatableMappingFluent<?> fluent,V1NodeAllocatableMapping instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NodeAllocatableMapping build() {
    V1NodeAllocatableMapping buildable = new V1NodeAllocatableMapping();
    buildable.setCapacityKey(fluent.getCapacityKey());
    buildable.setCapacityMultiplier(fluent.getCapacityMultiplier());
    buildable.setDeviceMultiplier(fluent.getDeviceMultiplier());
    return buildable;
  }
  
}