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
public class V1MutatingAdmissionPolicyListBuilder extends V1MutatingAdmissionPolicyListFluent<V1MutatingAdmissionPolicyListBuilder> implements VisitableBuilder<V1MutatingAdmissionPolicyList,V1MutatingAdmissionPolicyListBuilder>{

  V1MutatingAdmissionPolicyListFluent<?> fluent;

  public V1MutatingAdmissionPolicyListBuilder() {
    this(new V1MutatingAdmissionPolicyList());
  }
  
  public V1MutatingAdmissionPolicyListBuilder(V1MutatingAdmissionPolicyListFluent<?> fluent) {
    this(fluent, new V1MutatingAdmissionPolicyList());
  }
  
  public V1MutatingAdmissionPolicyListBuilder(V1MutatingAdmissionPolicyList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1MutatingAdmissionPolicyListBuilder(V1MutatingAdmissionPolicyListFluent<?> fluent,V1MutatingAdmissionPolicyList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1MutatingAdmissionPolicyList build() {
    V1MutatingAdmissionPolicyList buildable = new V1MutatingAdmissionPolicyList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}