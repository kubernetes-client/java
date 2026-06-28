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
public class V1beta1AllocationResultBuilder extends V1beta1AllocationResultFluent<V1beta1AllocationResultBuilder> implements VisitableBuilder<V1beta1AllocationResult,V1beta1AllocationResultBuilder>{

  V1beta1AllocationResultFluent<?> fluent;

  public V1beta1AllocationResultBuilder() {
    this(new V1beta1AllocationResult());
  }
  
  public V1beta1AllocationResultBuilder(V1beta1AllocationResultFluent<?> fluent) {
    this(fluent, new V1beta1AllocationResult());
  }
  
  public V1beta1AllocationResultBuilder(V1beta1AllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1AllocationResultBuilder(V1beta1AllocationResultFluent<?> fluent,V1beta1AllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1AllocationResult build() {
    V1beta1AllocationResult buildable = new V1beta1AllocationResult();
    buildable.setAllocationTimestamp(fluent.getAllocationTimestamp());
    buildable.setDevices(fluent.buildDevices());
    buildable.setNodeSelector(fluent.buildNodeSelector());
    return buildable;
  }
  
}