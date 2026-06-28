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
public class V1NodeAllocatableResourceClaimStatusBuilder extends V1NodeAllocatableResourceClaimStatusFluent<V1NodeAllocatableResourceClaimStatusBuilder> implements VisitableBuilder<V1NodeAllocatableResourceClaimStatus,V1NodeAllocatableResourceClaimStatusBuilder>{

  V1NodeAllocatableResourceClaimStatusFluent<?> fluent;

  public V1NodeAllocatableResourceClaimStatusBuilder() {
    this(new V1NodeAllocatableResourceClaimStatus());
  }
  
  public V1NodeAllocatableResourceClaimStatusBuilder(V1NodeAllocatableResourceClaimStatusFluent<?> fluent) {
    this(fluent, new V1NodeAllocatableResourceClaimStatus());
  }
  
  public V1NodeAllocatableResourceClaimStatusBuilder(V1NodeAllocatableResourceClaimStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NodeAllocatableResourceClaimStatusBuilder(V1NodeAllocatableResourceClaimStatusFluent<?> fluent,V1NodeAllocatableResourceClaimStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NodeAllocatableResourceClaimStatus build() {
    V1NodeAllocatableResourceClaimStatus buildable = new V1NodeAllocatableResourceClaimStatus();
    buildable.setContainers(fluent.getContainers());
    buildable.setResourceClaimName(fluent.getResourceClaimName());
    buildable.setResources(fluent.getResources());
    return buildable;
  }
  
}