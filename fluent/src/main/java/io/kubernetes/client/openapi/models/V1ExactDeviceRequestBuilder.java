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
public class V1ExactDeviceRequestBuilder extends V1ExactDeviceRequestFluent<V1ExactDeviceRequestBuilder> implements VisitableBuilder<V1ExactDeviceRequest,V1ExactDeviceRequestBuilder>{

  V1ExactDeviceRequestFluent<?> fluent;

  public V1ExactDeviceRequestBuilder() {
    this(new V1ExactDeviceRequest());
  }
  
  public V1ExactDeviceRequestBuilder(V1ExactDeviceRequestFluent<?> fluent) {
    this(fluent, new V1ExactDeviceRequest());
  }
  
  public V1ExactDeviceRequestBuilder(V1ExactDeviceRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ExactDeviceRequestBuilder(V1ExactDeviceRequestFluent<?> fluent,V1ExactDeviceRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ExactDeviceRequest build() {
    V1ExactDeviceRequest buildable = new V1ExactDeviceRequest();
    buildable.setAdminAccess(fluent.getAdminAccess());
    buildable.setAllocationMode(fluent.getAllocationMode());
    buildable.setCapacity(fluent.buildCapacity());
    buildable.setCount(fluent.getCount());
    buildable.setDeviceClassName(fluent.getDeviceClassName());
    buildable.setSelectors(fluent.buildSelectors());
    buildable.setTolerations(fluent.buildTolerations());
    return buildable;
  }
  
}