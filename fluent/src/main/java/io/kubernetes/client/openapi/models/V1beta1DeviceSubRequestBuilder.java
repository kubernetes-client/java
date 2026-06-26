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
public class V1beta1DeviceSubRequestBuilder extends V1beta1DeviceSubRequestFluent<V1beta1DeviceSubRequestBuilder> implements VisitableBuilder<V1beta1DeviceSubRequest,V1beta1DeviceSubRequestBuilder>{

  V1beta1DeviceSubRequestFluent<?> fluent;

  public V1beta1DeviceSubRequestBuilder() {
    this(new V1beta1DeviceSubRequest());
  }
  
  public V1beta1DeviceSubRequestBuilder(V1beta1DeviceSubRequestFluent<?> fluent) {
    this(fluent, new V1beta1DeviceSubRequest());
  }
  
  public V1beta1DeviceSubRequestBuilder(V1beta1DeviceSubRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1DeviceSubRequestBuilder(V1beta1DeviceSubRequestFluent<?> fluent,V1beta1DeviceSubRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1DeviceSubRequest build() {
    V1beta1DeviceSubRequest buildable = new V1beta1DeviceSubRequest();
    buildable.setAllocationMode(fluent.getAllocationMode());
    buildable.setCapacity(fluent.buildCapacity());
    buildable.setCount(fluent.getCount());
    buildable.setDeviceClassName(fluent.getDeviceClassName());
    buildable.setName(fluent.getName());
    buildable.setSelectors(fluent.buildSelectors());
    buildable.setTolerations(fluent.buildTolerations());
    return buildable;
  }
  
}