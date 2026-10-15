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
public class V1NodeAllocatableMappedResourcesBuilder extends V1NodeAllocatableMappedResourcesFluent<V1NodeAllocatableMappedResourcesBuilder> implements VisitableBuilder<V1NodeAllocatableMappedResources,V1NodeAllocatableMappedResourcesBuilder>{

  V1NodeAllocatableMappedResourcesFluent<?> fluent;

  public V1NodeAllocatableMappedResourcesBuilder() {
    this(new V1NodeAllocatableMappedResources());
  }
  
  public V1NodeAllocatableMappedResourcesBuilder(V1NodeAllocatableMappedResourcesFluent<?> fluent) {
    this(fluent, new V1NodeAllocatableMappedResources());
  }
  
  public V1NodeAllocatableMappedResourcesBuilder(V1NodeAllocatableMappedResources instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NodeAllocatableMappedResourcesBuilder(V1NodeAllocatableMappedResourcesFluent<?> fluent,V1NodeAllocatableMappedResources instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NodeAllocatableMappedResources build() {
    V1NodeAllocatableMappedResources buildable = new V1NodeAllocatableMappedResources();
    buildable.setName(fluent.getName());
    buildable.setQuantity(fluent.getQuantity());
    return buildable;
  }
  
}