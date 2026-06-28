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
public class V1ValidatingAdmissionPolicyStatusBuilder extends V1ValidatingAdmissionPolicyStatusFluent<V1ValidatingAdmissionPolicyStatusBuilder> implements VisitableBuilder<V1ValidatingAdmissionPolicyStatus,V1ValidatingAdmissionPolicyStatusBuilder>{

  V1ValidatingAdmissionPolicyStatusFluent<?> fluent;

  public V1ValidatingAdmissionPolicyStatusBuilder() {
    this(new V1ValidatingAdmissionPolicyStatus());
  }
  
  public V1ValidatingAdmissionPolicyStatusBuilder(V1ValidatingAdmissionPolicyStatusFluent<?> fluent) {
    this(fluent, new V1ValidatingAdmissionPolicyStatus());
  }
  
  public V1ValidatingAdmissionPolicyStatusBuilder(V1ValidatingAdmissionPolicyStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ValidatingAdmissionPolicyStatusBuilder(V1ValidatingAdmissionPolicyStatusFluent<?> fluent,V1ValidatingAdmissionPolicyStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ValidatingAdmissionPolicyStatus build() {
    V1ValidatingAdmissionPolicyStatus buildable = new V1ValidatingAdmissionPolicyStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setTypeChecking(fluent.buildTypeChecking());
    return buildable;
  }
  
}