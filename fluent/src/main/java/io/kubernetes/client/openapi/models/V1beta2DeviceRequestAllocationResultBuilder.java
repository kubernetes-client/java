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
public class V1beta2DeviceRequestAllocationResultBuilder extends V1beta2DeviceRequestAllocationResultFluent<V1beta2DeviceRequestAllocationResultBuilder> implements VisitableBuilder<V1beta2DeviceRequestAllocationResult,V1beta2DeviceRequestAllocationResultBuilder>{

  V1beta2DeviceRequestAllocationResultFluent<?> fluent;

  public V1beta2DeviceRequestAllocationResultBuilder() {
    this(new V1beta2DeviceRequestAllocationResult());
  }
  
  public V1beta2DeviceRequestAllocationResultBuilder(V1beta2DeviceRequestAllocationResultFluent<?> fluent) {
    this(fluent, new V1beta2DeviceRequestAllocationResult());
  }
  
  public V1beta2DeviceRequestAllocationResultBuilder(V1beta2DeviceRequestAllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2DeviceRequestAllocationResultBuilder(V1beta2DeviceRequestAllocationResultFluent<?> fluent,V1beta2DeviceRequestAllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2DeviceRequestAllocationResult build() {
    V1beta2DeviceRequestAllocationResult buildable = new V1beta2DeviceRequestAllocationResult();
    buildable.setAdminAccess(fluent.getAdminAccess());
    buildable.setBindingConditions(fluent.getBindingConditions());
    buildable.setBindingFailureConditions(fluent.getBindingFailureConditions());
    buildable.setConsumedCapacity(fluent.getConsumedCapacity());
    buildable.setDevice(fluent.getDevice());
    buildable.setDriver(fluent.getDriver());
    buildable.setPool(fluent.getPool());
    buildable.setRequest(fluent.getRequest());
    buildable.setShareID(fluent.getShareID());
    buildable.setTolerations(fluent.buildTolerations());
    return buildable;
  }
  
}