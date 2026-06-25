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
public class V1CapacityRequestPolicyRangeBuilder extends V1CapacityRequestPolicyRangeFluent<V1CapacityRequestPolicyRangeBuilder> implements VisitableBuilder<V1CapacityRequestPolicyRange,V1CapacityRequestPolicyRangeBuilder>{

  V1CapacityRequestPolicyRangeFluent<?> fluent;

  public V1CapacityRequestPolicyRangeBuilder() {
    this(new V1CapacityRequestPolicyRange());
  }
  
  public V1CapacityRequestPolicyRangeBuilder(V1CapacityRequestPolicyRangeFluent<?> fluent) {
    this(fluent, new V1CapacityRequestPolicyRange());
  }
  
  public V1CapacityRequestPolicyRangeBuilder(V1CapacityRequestPolicyRange instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CapacityRequestPolicyRangeBuilder(V1CapacityRequestPolicyRangeFluent<?> fluent,V1CapacityRequestPolicyRange instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CapacityRequestPolicyRange build() {
    V1CapacityRequestPolicyRange buildable = new V1CapacityRequestPolicyRange();
    buildable.setMax(fluent.getMax());
    buildable.setMin(fluent.getMin());
    buildable.setStep(fluent.getStep());
    return buildable;
  }
  
}