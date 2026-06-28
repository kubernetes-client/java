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
public class V1DeviceBuilder extends V1DeviceFluent<V1DeviceBuilder> implements VisitableBuilder<V1Device,V1DeviceBuilder>{

  V1DeviceFluent<?> fluent;

  public V1DeviceBuilder() {
    this(new V1Device());
  }
  
  public V1DeviceBuilder(V1DeviceFluent<?> fluent) {
    this(fluent, new V1Device());
  }
  
  public V1DeviceBuilder(V1Device instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeviceBuilder(V1DeviceFluent<?> fluent,V1Device instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1Device build() {
    V1Device buildable = new V1Device();
    buildable.setAllNodes(fluent.getAllNodes());
    buildable.setAllowMultipleAllocations(fluent.getAllowMultipleAllocations());
    buildable.setAttributes(fluent.getAttributes());
    buildable.setBindingConditions(fluent.getBindingConditions());
    buildable.setBindingFailureConditions(fluent.getBindingFailureConditions());
    buildable.setBindsToNode(fluent.getBindsToNode());
    buildable.setCapacity(fluent.getCapacity());
    buildable.setConsumesCounters(fluent.buildConsumesCounters());
    buildable.setName(fluent.getName());
    buildable.setNodeAllocatableResourceMappings(fluent.getNodeAllocatableResourceMappings());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setNodeSelector(fluent.buildNodeSelector());
    buildable.setTaints(fluent.buildTaints());
    return buildable;
  }
  
}