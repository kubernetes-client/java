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
public class V1ValidatingAdmissionPolicyListBuilder extends V1ValidatingAdmissionPolicyListFluent<V1ValidatingAdmissionPolicyListBuilder> implements VisitableBuilder<V1ValidatingAdmissionPolicyList,V1ValidatingAdmissionPolicyListBuilder>{

  V1ValidatingAdmissionPolicyListFluent<?> fluent;

  public V1ValidatingAdmissionPolicyListBuilder() {
    this(new V1ValidatingAdmissionPolicyList());
  }
  
  public V1ValidatingAdmissionPolicyListBuilder(V1ValidatingAdmissionPolicyListFluent<?> fluent) {
    this(fluent, new V1ValidatingAdmissionPolicyList());
  }
  
  public V1ValidatingAdmissionPolicyListBuilder(V1ValidatingAdmissionPolicyList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ValidatingAdmissionPolicyListBuilder(V1ValidatingAdmissionPolicyListFluent<?> fluent,V1ValidatingAdmissionPolicyList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ValidatingAdmissionPolicyList build() {
    V1ValidatingAdmissionPolicyList buildable = new V1ValidatingAdmissionPolicyList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}