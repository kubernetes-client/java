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
public class V1alpha1MutatingAdmissionPolicyBindingListBuilder extends V1alpha1MutatingAdmissionPolicyBindingListFluent<V1alpha1MutatingAdmissionPolicyBindingListBuilder> implements VisitableBuilder<V1alpha1MutatingAdmissionPolicyBindingList,V1alpha1MutatingAdmissionPolicyBindingListBuilder>{

  V1alpha1MutatingAdmissionPolicyBindingListFluent<?> fluent;

  public V1alpha1MutatingAdmissionPolicyBindingListBuilder() {
    this(new V1alpha1MutatingAdmissionPolicyBindingList());
  }
  
  public V1alpha1MutatingAdmissionPolicyBindingListBuilder(V1alpha1MutatingAdmissionPolicyBindingListFluent<?> fluent) {
    this(fluent, new V1alpha1MutatingAdmissionPolicyBindingList());
  }
  
  public V1alpha1MutatingAdmissionPolicyBindingListBuilder(V1alpha1MutatingAdmissionPolicyBindingList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1MutatingAdmissionPolicyBindingListBuilder(V1alpha1MutatingAdmissionPolicyBindingListFluent<?> fluent,V1alpha1MutatingAdmissionPolicyBindingList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1MutatingAdmissionPolicyBindingList build() {
    V1alpha1MutatingAdmissionPolicyBindingList buildable = new V1alpha1MutatingAdmissionPolicyBindingList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}