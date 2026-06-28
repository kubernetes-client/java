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
public class V1ValidatingAdmissionPolicySpecBuilder extends V1ValidatingAdmissionPolicySpecFluent<V1ValidatingAdmissionPolicySpecBuilder> implements VisitableBuilder<V1ValidatingAdmissionPolicySpec,V1ValidatingAdmissionPolicySpecBuilder>{

  V1ValidatingAdmissionPolicySpecFluent<?> fluent;

  public V1ValidatingAdmissionPolicySpecBuilder() {
    this(new V1ValidatingAdmissionPolicySpec());
  }
  
  public V1ValidatingAdmissionPolicySpecBuilder(V1ValidatingAdmissionPolicySpecFluent<?> fluent) {
    this(fluent, new V1ValidatingAdmissionPolicySpec());
  }
  
  public V1ValidatingAdmissionPolicySpecBuilder(V1ValidatingAdmissionPolicySpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ValidatingAdmissionPolicySpecBuilder(V1ValidatingAdmissionPolicySpecFluent<?> fluent,V1ValidatingAdmissionPolicySpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ValidatingAdmissionPolicySpec build() {
    V1ValidatingAdmissionPolicySpec buildable = new V1ValidatingAdmissionPolicySpec();
    buildable.setAuditAnnotations(fluent.buildAuditAnnotations());
    buildable.setFailurePolicy(fluent.getFailurePolicy());
    buildable.setMatchConditions(fluent.buildMatchConditions());
    buildable.setMatchConstraints(fluent.buildMatchConstraints());
    buildable.setParamKind(fluent.buildParamKind());
    buildable.setValidations(fluent.buildValidations());
    buildable.setVariables(fluent.buildVariables());
    return buildable;
  }
  
}