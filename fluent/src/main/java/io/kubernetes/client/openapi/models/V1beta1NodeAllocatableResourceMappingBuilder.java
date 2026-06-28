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
public class V1beta1NodeAllocatableResourceMappingBuilder extends V1beta1NodeAllocatableResourceMappingFluent<V1beta1NodeAllocatableResourceMappingBuilder> implements VisitableBuilder<V1beta1NodeAllocatableResourceMapping,V1beta1NodeAllocatableResourceMappingBuilder>{

  V1beta1NodeAllocatableResourceMappingFluent<?> fluent;

  public V1beta1NodeAllocatableResourceMappingBuilder() {
    this(new V1beta1NodeAllocatableResourceMapping());
  }
  
  public V1beta1NodeAllocatableResourceMappingBuilder(V1beta1NodeAllocatableResourceMappingFluent<?> fluent) {
    this(fluent, new V1beta1NodeAllocatableResourceMapping());
  }
  
  public V1beta1NodeAllocatableResourceMappingBuilder(V1beta1NodeAllocatableResourceMapping instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1NodeAllocatableResourceMappingBuilder(V1beta1NodeAllocatableResourceMappingFluent<?> fluent,V1beta1NodeAllocatableResourceMapping instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1NodeAllocatableResourceMapping build() {
    V1beta1NodeAllocatableResourceMapping buildable = new V1beta1NodeAllocatableResourceMapping();
    buildable.setAllocationMultiplier(fluent.getAllocationMultiplier());
    buildable.setCapacityKey(fluent.getCapacityKey());
    return buildable;
  }
  
}