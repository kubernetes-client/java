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
public class V1beta1DeviceAllocationResultBuilder extends V1beta1DeviceAllocationResultFluent<V1beta1DeviceAllocationResultBuilder> implements VisitableBuilder<V1beta1DeviceAllocationResult,V1beta1DeviceAllocationResultBuilder>{

  V1beta1DeviceAllocationResultFluent<?> fluent;

  public V1beta1DeviceAllocationResultBuilder() {
    this(new V1beta1DeviceAllocationResult());
  }
  
  public V1beta1DeviceAllocationResultBuilder(V1beta1DeviceAllocationResultFluent<?> fluent) {
    this(fluent, new V1beta1DeviceAllocationResult());
  }
  
  public V1beta1DeviceAllocationResultBuilder(V1beta1DeviceAllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1DeviceAllocationResultBuilder(V1beta1DeviceAllocationResultFluent<?> fluent,V1beta1DeviceAllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1DeviceAllocationResult build() {
    V1beta1DeviceAllocationResult buildable = new V1beta1DeviceAllocationResult();
    buildable.setConfig(fluent.buildConfig());
    buildable.setResults(fluent.buildResults());
    return buildable;
  }
  
}