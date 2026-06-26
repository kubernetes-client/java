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
public class V1NetworkPolicyEgressRuleBuilder extends V1NetworkPolicyEgressRuleFluent<V1NetworkPolicyEgressRuleBuilder> implements VisitableBuilder<V1NetworkPolicyEgressRule,V1NetworkPolicyEgressRuleBuilder>{

  V1NetworkPolicyEgressRuleFluent<?> fluent;

  public V1NetworkPolicyEgressRuleBuilder() {
    this(new V1NetworkPolicyEgressRule());
  }
  
  public V1NetworkPolicyEgressRuleBuilder(V1NetworkPolicyEgressRuleFluent<?> fluent) {
    this(fluent, new V1NetworkPolicyEgressRule());
  }
  
  public V1NetworkPolicyEgressRuleBuilder(V1NetworkPolicyEgressRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NetworkPolicyEgressRuleBuilder(V1NetworkPolicyEgressRuleFluent<?> fluent,V1NetworkPolicyEgressRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NetworkPolicyEgressRule build() {
    V1NetworkPolicyEgressRule buildable = new V1NetworkPolicyEgressRule();
    buildable.setPorts(fluent.buildPorts());
    buildable.setTo(fluent.buildTo());
    return buildable;
  }
  
}