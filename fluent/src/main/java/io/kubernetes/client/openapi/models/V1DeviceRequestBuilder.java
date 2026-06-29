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
public class V1DeviceRequestBuilder extends V1DeviceRequestFluent<V1DeviceRequestBuilder> implements VisitableBuilder<V1DeviceRequest,V1DeviceRequestBuilder>{

  V1DeviceRequestFluent<?> fluent;

  public V1DeviceRequestBuilder() {
    this(new V1DeviceRequest());
  }
  
  public V1DeviceRequestBuilder(V1DeviceRequestFluent<?> fluent) {
    this(fluent, new V1DeviceRequest());
  }
  
  public V1DeviceRequestBuilder(V1DeviceRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeviceRequestBuilder(V1DeviceRequestFluent<?> fluent,V1DeviceRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeviceRequest build() {
    V1DeviceRequest buildable = new V1DeviceRequest();
    buildable.setExactly(fluent.buildExactly());
    buildable.setFirstAvailable(fluent.buildFirstAvailable());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}