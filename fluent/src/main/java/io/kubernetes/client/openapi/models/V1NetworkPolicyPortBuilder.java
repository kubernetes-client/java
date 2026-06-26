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
public class V1NetworkPolicyPortBuilder extends V1NetworkPolicyPortFluent<V1NetworkPolicyPortBuilder> implements VisitableBuilder<V1NetworkPolicyPort,V1NetworkPolicyPortBuilder>{

  V1NetworkPolicyPortFluent<?> fluent;

  public V1NetworkPolicyPortBuilder() {
    this(new V1NetworkPolicyPort());
  }
  
  public V1NetworkPolicyPortBuilder(V1NetworkPolicyPortFluent<?> fluent) {
    this(fluent, new V1NetworkPolicyPort());
  }
  
  public V1NetworkPolicyPortBuilder(V1NetworkPolicyPort instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NetworkPolicyPortBuilder(V1NetworkPolicyPortFluent<?> fluent,V1NetworkPolicyPort instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NetworkPolicyPort build() {
    V1NetworkPolicyPort buildable = new V1NetworkPolicyPort();
    buildable.setEndPort(fluent.getEndPort());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  
}