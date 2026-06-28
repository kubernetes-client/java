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
public class V1DeviceAllocationResultBuilder extends V1DeviceAllocationResultFluent<V1DeviceAllocationResultBuilder> implements VisitableBuilder<V1DeviceAllocationResult,V1DeviceAllocationResultBuilder>{

  V1DeviceAllocationResultFluent<?> fluent;

  public V1DeviceAllocationResultBuilder() {
    this(new V1DeviceAllocationResult());
  }
  
  public V1DeviceAllocationResultBuilder(V1DeviceAllocationResultFluent<?> fluent) {
    this(fluent, new V1DeviceAllocationResult());
  }
  
  public V1DeviceAllocationResultBuilder(V1DeviceAllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeviceAllocationResultBuilder(V1DeviceAllocationResultFluent<?> fluent,V1DeviceAllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeviceAllocationResult build() {
    V1DeviceAllocationResult buildable = new V1DeviceAllocationResult();
    buildable.setConfig(fluent.buildConfig());
    buildable.setResults(fluent.buildResults());
    return buildable;
  }
  
}