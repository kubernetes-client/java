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
public class V1beta2DeviceCounterConsumptionBuilder extends V1beta2DeviceCounterConsumptionFluent<V1beta2DeviceCounterConsumptionBuilder> implements VisitableBuilder<V1beta2DeviceCounterConsumption,V1beta2DeviceCounterConsumptionBuilder>{

  V1beta2DeviceCounterConsumptionFluent<?> fluent;

  public V1beta2DeviceCounterConsumptionBuilder() {
    this(new V1beta2DeviceCounterConsumption());
  }
  
  public V1beta2DeviceCounterConsumptionBuilder(V1beta2DeviceCounterConsumptionFluent<?> fluent) {
    this(fluent, new V1beta2DeviceCounterConsumption());
  }
  
  public V1beta2DeviceCounterConsumptionBuilder(V1beta2DeviceCounterConsumption instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2DeviceCounterConsumptionBuilder(V1beta2DeviceCounterConsumptionFluent<?> fluent,V1beta2DeviceCounterConsumption instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2DeviceCounterConsumption build() {
    V1beta2DeviceCounterConsumption buildable = new V1beta2DeviceCounterConsumption();
    buildable.setCounterSet(fluent.getCounterSet());
    buildable.setCounters(fluent.getCounters());
    return buildable;
  }
  
}