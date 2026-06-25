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
public class V1beta1MutatingAdmissionPolicySpecBuilder extends V1beta1MutatingAdmissionPolicySpecFluent<V1beta1MutatingAdmissionPolicySpecBuilder> implements VisitableBuilder<V1beta1MutatingAdmissionPolicySpec,V1beta1MutatingAdmissionPolicySpecBuilder>{

  V1beta1MutatingAdmissionPolicySpecFluent<?> fluent;

  public V1beta1MutatingAdmissionPolicySpecBuilder() {
    this(new V1beta1MutatingAdmissionPolicySpec());
  }
  
  public V1beta1MutatingAdmissionPolicySpecBuilder(V1beta1MutatingAdmissionPolicySpecFluent<?> fluent) {
    this(fluent, new V1beta1MutatingAdmissionPolicySpec());
  }
  
  public V1beta1MutatingAdmissionPolicySpecBuilder(V1beta1MutatingAdmissionPolicySpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1MutatingAdmissionPolicySpecBuilder(V1beta1MutatingAdmissionPolicySpecFluent<?> fluent,V1beta1MutatingAdmissionPolicySpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1MutatingAdmissionPolicySpec build() {
    V1beta1MutatingAdmissionPolicySpec buildable = new V1beta1MutatingAdmissionPolicySpec();
    buildable.setFailurePolicy(fluent.getFailurePolicy());
    buildable.setMatchConditions(fluent.buildMatchConditions());
    buildable.setMatchConstraints(fluent.buildMatchConstraints());
    buildable.setMutations(fluent.buildMutations());
    buildable.setParamKind(fluent.buildParamKind());
    buildable.setReinvocationPolicy(fluent.getReinvocationPolicy());
    buildable.setVariables(fluent.buildVariables());
    return buildable;
  }
  
}