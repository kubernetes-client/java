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
public class V1alpha1MutatingAdmissionPolicyBuilder extends V1alpha1MutatingAdmissionPolicyFluent<V1alpha1MutatingAdmissionPolicyBuilder> implements VisitableBuilder<V1alpha1MutatingAdmissionPolicy,V1alpha1MutatingAdmissionPolicyBuilder>{

  V1alpha1MutatingAdmissionPolicyFluent<?> fluent;

  public V1alpha1MutatingAdmissionPolicyBuilder() {
    this(new V1alpha1MutatingAdmissionPolicy());
  }
  
  public V1alpha1MutatingAdmissionPolicyBuilder(V1alpha1MutatingAdmissionPolicyFluent<?> fluent) {
    this(fluent, new V1alpha1MutatingAdmissionPolicy());
  }
  
  public V1alpha1MutatingAdmissionPolicyBuilder(V1alpha1MutatingAdmissionPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1MutatingAdmissionPolicyBuilder(V1alpha1MutatingAdmissionPolicyFluent<?> fluent,V1alpha1MutatingAdmissionPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1MutatingAdmissionPolicy build() {
    V1alpha1MutatingAdmissionPolicy buildable = new V1alpha1MutatingAdmissionPolicy();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}