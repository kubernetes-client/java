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
public class V1EndpointSubsetBuilder extends V1EndpointSubsetFluent<V1EndpointSubsetBuilder> implements VisitableBuilder<V1EndpointSubset,V1EndpointSubsetBuilder>{

  V1EndpointSubsetFluent<?> fluent;

  public V1EndpointSubsetBuilder() {
    this(new V1EndpointSubset());
  }
  
  public V1EndpointSubsetBuilder(V1EndpointSubsetFluent<?> fluent) {
    this(fluent, new V1EndpointSubset());
  }
  
  public V1EndpointSubsetBuilder(V1EndpointSubset instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1EndpointSubsetBuilder(V1EndpointSubsetFluent<?> fluent,V1EndpointSubset instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1EndpointSubset build() {
    V1EndpointSubset buildable = new V1EndpointSubset();
    buildable.setAddresses(fluent.buildAddresses());
    buildable.setNotReadyAddresses(fluent.buildNotReadyAddresses());
    buildable.setPorts(fluent.buildPorts());
    return buildable;
  }
  
}