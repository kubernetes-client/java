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
public class V1ResourceClaimStatusBuilder extends V1ResourceClaimStatusFluent<V1ResourceClaimStatusBuilder> implements VisitableBuilder<V1ResourceClaimStatus,V1ResourceClaimStatusBuilder>{

  V1ResourceClaimStatusFluent<?> fluent;

  public V1ResourceClaimStatusBuilder() {
    this(new V1ResourceClaimStatus());
  }
  
  public V1ResourceClaimStatusBuilder(V1ResourceClaimStatusFluent<?> fluent) {
    this(fluent, new V1ResourceClaimStatus());
  }
  
  public V1ResourceClaimStatusBuilder(V1ResourceClaimStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ResourceClaimStatusBuilder(V1ResourceClaimStatusFluent<?> fluent,V1ResourceClaimStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ResourceClaimStatus build() {
    V1ResourceClaimStatus buildable = new V1ResourceClaimStatus();
    buildable.setAllocation(fluent.buildAllocation());
    buildable.setDevices(fluent.buildDevices());
    buildable.setReservedFor(fluent.buildReservedFor());
    return buildable;
  }
  
}