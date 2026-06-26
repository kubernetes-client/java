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
public class V1PodSchedulingGateBuilder extends V1PodSchedulingGateFluent<V1PodSchedulingGateBuilder> implements VisitableBuilder<V1PodSchedulingGate,V1PodSchedulingGateBuilder>{

  V1PodSchedulingGateFluent<?> fluent;

  public V1PodSchedulingGateBuilder() {
    this(new V1PodSchedulingGate());
  }
  
  public V1PodSchedulingGateBuilder(V1PodSchedulingGateFluent<?> fluent) {
    this(fluent, new V1PodSchedulingGate());
  }
  
  public V1PodSchedulingGateBuilder(V1PodSchedulingGate instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PodSchedulingGateBuilder(V1PodSchedulingGateFluent<?> fluent,V1PodSchedulingGate instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PodSchedulingGate build() {
    V1PodSchedulingGate buildable = new V1PodSchedulingGate();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}