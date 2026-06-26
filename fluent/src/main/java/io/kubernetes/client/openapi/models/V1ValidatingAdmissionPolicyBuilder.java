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
public class V1ValidatingAdmissionPolicyBuilder extends V1ValidatingAdmissionPolicyFluent<V1ValidatingAdmissionPolicyBuilder> implements VisitableBuilder<V1ValidatingAdmissionPolicy,V1ValidatingAdmissionPolicyBuilder>{

  V1ValidatingAdmissionPolicyFluent<?> fluent;

  public V1ValidatingAdmissionPolicyBuilder() {
    this(new V1ValidatingAdmissionPolicy());
  }
  
  public V1ValidatingAdmissionPolicyBuilder(V1ValidatingAdmissionPolicyFluent<?> fluent) {
    this(fluent, new V1ValidatingAdmissionPolicy());
  }
  
  public V1ValidatingAdmissionPolicyBuilder(V1ValidatingAdmissionPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ValidatingAdmissionPolicyBuilder(V1ValidatingAdmissionPolicyFluent<?> fluent,V1ValidatingAdmissionPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ValidatingAdmissionPolicy build() {
    V1ValidatingAdmissionPolicy buildable = new V1ValidatingAdmissionPolicy();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}