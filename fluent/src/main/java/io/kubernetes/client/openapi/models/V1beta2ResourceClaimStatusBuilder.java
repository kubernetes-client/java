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
public class V1beta2ResourceClaimStatusBuilder extends V1beta2ResourceClaimStatusFluent<V1beta2ResourceClaimStatusBuilder> implements VisitableBuilder<V1beta2ResourceClaimStatus,V1beta2ResourceClaimStatusBuilder>{

  V1beta2ResourceClaimStatusFluent<?> fluent;

  public V1beta2ResourceClaimStatusBuilder() {
    this(new V1beta2ResourceClaimStatus());
  }
  
  public V1beta2ResourceClaimStatusBuilder(V1beta2ResourceClaimStatusFluent<?> fluent) {
    this(fluent, new V1beta2ResourceClaimStatus());
  }
  
  public V1beta2ResourceClaimStatusBuilder(V1beta2ResourceClaimStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2ResourceClaimStatusBuilder(V1beta2ResourceClaimStatusFluent<?> fluent,V1beta2ResourceClaimStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2ResourceClaimStatus build() {
    V1beta2ResourceClaimStatus buildable = new V1beta2ResourceClaimStatus();
    buildable.setAllocation(fluent.buildAllocation());
    buildable.setDevices(fluent.buildDevices());
    buildable.setReservedFor(fluent.buildReservedFor());
    return buildable;
  }
  
}