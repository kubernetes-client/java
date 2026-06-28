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
public class V1ValidatingAdmissionPolicyBindingSpecBuilder extends V1ValidatingAdmissionPolicyBindingSpecFluent<V1ValidatingAdmissionPolicyBindingSpecBuilder> implements VisitableBuilder<V1ValidatingAdmissionPolicyBindingSpec,V1ValidatingAdmissionPolicyBindingSpecBuilder>{

  V1ValidatingAdmissionPolicyBindingSpecFluent<?> fluent;

  public V1ValidatingAdmissionPolicyBindingSpecBuilder() {
    this(new V1ValidatingAdmissionPolicyBindingSpec());
  }
  
  public V1ValidatingAdmissionPolicyBindingSpecBuilder(V1ValidatingAdmissionPolicyBindingSpecFluent<?> fluent) {
    this(fluent, new V1ValidatingAdmissionPolicyBindingSpec());
  }
  
  public V1ValidatingAdmissionPolicyBindingSpecBuilder(V1ValidatingAdmissionPolicyBindingSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ValidatingAdmissionPolicyBindingSpecBuilder(V1ValidatingAdmissionPolicyBindingSpecFluent<?> fluent,V1ValidatingAdmissionPolicyBindingSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ValidatingAdmissionPolicyBindingSpec build() {
    V1ValidatingAdmissionPolicyBindingSpec buildable = new V1ValidatingAdmissionPolicyBindingSpec();
    buildable.setMatchResources(fluent.buildMatchResources());
    buildable.setParamRef(fluent.buildParamRef());
    buildable.setPolicyName(fluent.getPolicyName());
    buildable.setValidationActions(fluent.getValidationActions());
    return buildable;
  }
  
}