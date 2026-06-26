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
public class V1ResourcePolicyRuleBuilder extends V1ResourcePolicyRuleFluent<V1ResourcePolicyRuleBuilder> implements VisitableBuilder<V1ResourcePolicyRule,V1ResourcePolicyRuleBuilder>{

  V1ResourcePolicyRuleFluent<?> fluent;

  public V1ResourcePolicyRuleBuilder() {
    this(new V1ResourcePolicyRule());
  }
  
  public V1ResourcePolicyRuleBuilder(V1ResourcePolicyRuleFluent<?> fluent) {
    this(fluent, new V1ResourcePolicyRule());
  }
  
  public V1ResourcePolicyRuleBuilder(V1ResourcePolicyRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ResourcePolicyRuleBuilder(V1ResourcePolicyRuleFluent<?> fluent,V1ResourcePolicyRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ResourcePolicyRule build() {
    V1ResourcePolicyRule buildable = new V1ResourcePolicyRule();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setClusterScope(fluent.getClusterScope());
    buildable.setNamespaces(fluent.getNamespaces());
    buildable.setResources(fluent.getResources());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  
}