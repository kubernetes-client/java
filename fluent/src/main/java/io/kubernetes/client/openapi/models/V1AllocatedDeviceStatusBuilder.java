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
public class V1AllocatedDeviceStatusBuilder extends V1AllocatedDeviceStatusFluent<V1AllocatedDeviceStatusBuilder> implements VisitableBuilder<V1AllocatedDeviceStatus,V1AllocatedDeviceStatusBuilder>{

  V1AllocatedDeviceStatusFluent<?> fluent;

  public V1AllocatedDeviceStatusBuilder() {
    this(new V1AllocatedDeviceStatus());
  }
  
  public V1AllocatedDeviceStatusBuilder(V1AllocatedDeviceStatusFluent<?> fluent) {
    this(fluent, new V1AllocatedDeviceStatus());
  }
  
  public V1AllocatedDeviceStatusBuilder(V1AllocatedDeviceStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1AllocatedDeviceStatusBuilder(V1AllocatedDeviceStatusFluent<?> fluent,V1AllocatedDeviceStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1AllocatedDeviceStatus build() {
    V1AllocatedDeviceStatus buildable = new V1AllocatedDeviceStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setData(fluent.getData());
    buildable.setDevice(fluent.getDevice());
    buildable.setDriver(fluent.getDriver());
    buildable.setNetworkData(fluent.buildNetworkData());
    buildable.setPool(fluent.getPool());
    buildable.setShareID(fluent.getShareID());
    return buildable;
  }
  
}