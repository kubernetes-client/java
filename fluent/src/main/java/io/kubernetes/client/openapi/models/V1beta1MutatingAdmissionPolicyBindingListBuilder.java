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
public class V1beta1MutatingAdmissionPolicyBindingListBuilder extends V1beta1MutatingAdmissionPolicyBindingListFluent<V1beta1MutatingAdmissionPolicyBindingListBuilder> implements VisitableBuilder<V1beta1MutatingAdmissionPolicyBindingList,V1beta1MutatingAdmissionPolicyBindingListBuilder>{

  V1beta1MutatingAdmissionPolicyBindingListFluent<?> fluent;

  public V1beta1MutatingAdmissionPolicyBindingListBuilder() {
    this(new V1beta1MutatingAdmissionPolicyBindingList());
  }
  
  public V1beta1MutatingAdmissionPolicyBindingListBuilder(V1beta1MutatingAdmissionPolicyBindingListFluent<?> fluent) {
    this(fluent, new V1beta1MutatingAdmissionPolicyBindingList());
  }
  
  public V1beta1MutatingAdmissionPolicyBindingListBuilder(V1beta1MutatingAdmissionPolicyBindingList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1MutatingAdmissionPolicyBindingListBuilder(V1beta1MutatingAdmissionPolicyBindingListFluent<?> fluent,V1beta1MutatingAdmissionPolicyBindingList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1MutatingAdmissionPolicyBindingList build() {
    V1beta1MutatingAdmissionPolicyBindingList buildable = new V1beta1MutatingAdmissionPolicyBindingList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}