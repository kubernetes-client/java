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
public class V1alpha1MutatingAdmissionPolicyBindingBuilder extends V1alpha1MutatingAdmissionPolicyBindingFluent<V1alpha1MutatingAdmissionPolicyBindingBuilder> implements VisitableBuilder<V1alpha1MutatingAdmissionPolicyBinding,V1alpha1MutatingAdmissionPolicyBindingBuilder>{

  V1alpha1MutatingAdmissionPolicyBindingFluent<?> fluent;

  public V1alpha1MutatingAdmissionPolicyBindingBuilder() {
    this(new V1alpha1MutatingAdmissionPolicyBinding());
  }
  
  public V1alpha1MutatingAdmissionPolicyBindingBuilder(V1alpha1MutatingAdmissionPolicyBindingFluent<?> fluent) {
    this(fluent, new V1alpha1MutatingAdmissionPolicyBinding());
  }
  
  public V1alpha1MutatingAdmissionPolicyBindingBuilder(V1alpha1MutatingAdmissionPolicyBinding instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1MutatingAdmissionPolicyBindingBuilder(V1alpha1MutatingAdmissionPolicyBindingFluent<?> fluent,V1alpha1MutatingAdmissionPolicyBinding instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1MutatingAdmissionPolicyBinding build() {
    V1alpha1MutatingAdmissionPolicyBinding buildable = new V1alpha1MutatingAdmissionPolicyBinding();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}