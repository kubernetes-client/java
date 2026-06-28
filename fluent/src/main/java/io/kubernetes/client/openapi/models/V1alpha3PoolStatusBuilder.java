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
public class V1alpha3PoolStatusBuilder extends V1alpha3PoolStatusFluent<V1alpha3PoolStatusBuilder> implements VisitableBuilder<V1alpha3PoolStatus,V1alpha3PoolStatusBuilder>{

  V1alpha3PoolStatusFluent<?> fluent;

  public V1alpha3PoolStatusBuilder() {
    this(new V1alpha3PoolStatus());
  }
  
  public V1alpha3PoolStatusBuilder(V1alpha3PoolStatusFluent<?> fluent) {
    this(fluent, new V1alpha3PoolStatus());
  }
  
  public V1alpha3PoolStatusBuilder(V1alpha3PoolStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha3PoolStatusBuilder(V1alpha3PoolStatusFluent<?> fluent,V1alpha3PoolStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha3PoolStatus build() {
    V1alpha3PoolStatus buildable = new V1alpha3PoolStatus();
    buildable.setAllocatedDevices(fluent.getAllocatedDevices());
    buildable.setAvailableDevices(fluent.getAvailableDevices());
    buildable.setDriver(fluent.getDriver());
    buildable.setGeneration(fluent.getGeneration());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setPoolName(fluent.getPoolName());
    buildable.setResourceSliceCount(fluent.getResourceSliceCount());
    buildable.setTotalDevices(fluent.getTotalDevices());
    buildable.setUnavailableDevices(fluent.getUnavailableDevices());
    buildable.setValidationError(fluent.getValidationError());
    return buildable;
  }
  
}