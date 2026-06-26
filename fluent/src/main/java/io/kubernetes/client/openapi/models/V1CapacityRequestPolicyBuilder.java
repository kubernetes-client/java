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
public class V1CapacityRequestPolicyBuilder extends V1CapacityRequestPolicyFluent<V1CapacityRequestPolicyBuilder> implements VisitableBuilder<V1CapacityRequestPolicy,V1CapacityRequestPolicyBuilder>{

  V1CapacityRequestPolicyFluent<?> fluent;

  public V1CapacityRequestPolicyBuilder() {
    this(new V1CapacityRequestPolicy());
  }
  
  public V1CapacityRequestPolicyBuilder(V1CapacityRequestPolicyFluent<?> fluent) {
    this(fluent, new V1CapacityRequestPolicy());
  }
  
  public V1CapacityRequestPolicyBuilder(V1CapacityRequestPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CapacityRequestPolicyBuilder(V1CapacityRequestPolicyFluent<?> fluent,V1CapacityRequestPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CapacityRequestPolicy build() {
    V1CapacityRequestPolicy buildable = new V1CapacityRequestPolicy();
    buildable.setDefault(fluent.getDefault());
    buildable.setValidRange(fluent.buildValidRange());
    buildable.setValidValues(fluent.getValidValues());
    return buildable;
  }
  
}