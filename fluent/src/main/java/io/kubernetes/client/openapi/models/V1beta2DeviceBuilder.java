/*
Copyright 2020 The Kubernetes Authors.
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
public class V1beta2DeviceBuilder extends V1beta2DeviceFluent<V1beta2DeviceBuilder> implements VisitableBuilder<V1beta2Device,V1beta2DeviceBuilder>{

  V1beta2DeviceFluent<?> fluent;

  public V1beta2DeviceBuilder() {
    this(new V1beta2Device());
  }
  
  public V1beta2DeviceBuilder(V1beta2DeviceFluent<?> fluent) {
    this(fluent, new V1beta2Device());
  }
  
  public V1beta2DeviceBuilder(V1beta2Device instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2DeviceBuilder(V1beta2DeviceFluent<?> fluent,V1beta2Device instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2Device build() {
    V1beta2Device buildable = new V1beta2Device();
    buildable.setAllNodes(fluent.getAllNodes());
    buildable.setAllowMultipleAllocations(fluent.getAllowMultipleAllocations());
    buildable.setAttributes(fluent.getAttributes());
    buildable.setBindingConditions(fluent.getBindingConditions());
    buildable.setBindingFailureConditions(fluent.getBindingFailureConditions());
    buildable.setBindsToNode(fluent.getBindsToNode());
    buildable.setCapacity(fluent.getCapacity());
    buildable.setConsumesCounters(fluent.buildConsumesCounters());
    buildable.setName(fluent.getName());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setNodeSelector(fluent.buildNodeSelector());
    buildable.setTaints(fluent.buildTaints());
    return buildable;
  }
  
}