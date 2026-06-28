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
public class V1NetworkPolicySpecBuilder extends V1NetworkPolicySpecFluent<V1NetworkPolicySpecBuilder> implements VisitableBuilder<V1NetworkPolicySpec,V1NetworkPolicySpecBuilder>{

  V1NetworkPolicySpecFluent<?> fluent;

  public V1NetworkPolicySpecBuilder() {
    this(new V1NetworkPolicySpec());
  }
  
  public V1NetworkPolicySpecBuilder(V1NetworkPolicySpecFluent<?> fluent) {
    this(fluent, new V1NetworkPolicySpec());
  }
  
  public V1NetworkPolicySpecBuilder(V1NetworkPolicySpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NetworkPolicySpecBuilder(V1NetworkPolicySpecFluent<?> fluent,V1NetworkPolicySpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NetworkPolicySpec build() {
    V1NetworkPolicySpec buildable = new V1NetworkPolicySpec();
    buildable.setEgress(fluent.buildEgress());
    buildable.setIngress(fluent.buildIngress());
    buildable.setPodSelector(fluent.buildPodSelector());
    buildable.setPolicyTypes(fluent.getPolicyTypes());
    return buildable;
  }
  
}