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
public class V1beta2CapacityRequestPolicyRangeBuilder extends V1beta2CapacityRequestPolicyRangeFluent<V1beta2CapacityRequestPolicyRangeBuilder> implements VisitableBuilder<V1beta2CapacityRequestPolicyRange,V1beta2CapacityRequestPolicyRangeBuilder>{

  V1beta2CapacityRequestPolicyRangeFluent<?> fluent;

  public V1beta2CapacityRequestPolicyRangeBuilder() {
    this(new V1beta2CapacityRequestPolicyRange());
  }
  
  public V1beta2CapacityRequestPolicyRangeBuilder(V1beta2CapacityRequestPolicyRangeFluent<?> fluent) {
    this(fluent, new V1beta2CapacityRequestPolicyRange());
  }
  
  public V1beta2CapacityRequestPolicyRangeBuilder(V1beta2CapacityRequestPolicyRange instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2CapacityRequestPolicyRangeBuilder(V1beta2CapacityRequestPolicyRangeFluent<?> fluent,V1beta2CapacityRequestPolicyRange instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2CapacityRequestPolicyRange build() {
    V1beta2CapacityRequestPolicyRange buildable = new V1beta2CapacityRequestPolicyRange();
    buildable.setMax(fluent.getMax());
    buildable.setMin(fluent.getMin());
    buildable.setStep(fluent.getStep());
    return buildable;
  }
  
}