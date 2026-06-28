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
public class V1EndpointSliceBuilder extends V1EndpointSliceFluent<V1EndpointSliceBuilder> implements VisitableBuilder<V1EndpointSlice,V1EndpointSliceBuilder>{

  V1EndpointSliceFluent<?> fluent;

  public V1EndpointSliceBuilder() {
    this(new V1EndpointSlice());
  }
  
  public V1EndpointSliceBuilder(V1EndpointSliceFluent<?> fluent) {
    this(fluent, new V1EndpointSlice());
  }
  
  public V1EndpointSliceBuilder(V1EndpointSlice instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1EndpointSliceBuilder(V1EndpointSliceFluent<?> fluent,V1EndpointSlice instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1EndpointSlice build() {
    V1EndpointSlice buildable = new V1EndpointSlice();
    buildable.setAddressType(fluent.getAddressType());
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setEndpoints(fluent.buildEndpoints());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setPorts(fluent.buildPorts());
    return buildable;
  }
  
}