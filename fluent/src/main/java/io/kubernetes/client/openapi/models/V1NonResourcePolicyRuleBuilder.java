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
public class V1NonResourcePolicyRuleBuilder extends V1NonResourcePolicyRuleFluent<V1NonResourcePolicyRuleBuilder> implements VisitableBuilder<V1NonResourcePolicyRule,V1NonResourcePolicyRuleBuilder>{

  V1NonResourcePolicyRuleFluent<?> fluent;

  public V1NonResourcePolicyRuleBuilder() {
    this(new V1NonResourcePolicyRule());
  }
  
  public V1NonResourcePolicyRuleBuilder(V1NonResourcePolicyRuleFluent<?> fluent) {
    this(fluent, new V1NonResourcePolicyRule());
  }
  
  public V1NonResourcePolicyRuleBuilder(V1NonResourcePolicyRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NonResourcePolicyRuleBuilder(V1NonResourcePolicyRuleFluent<?> fluent,V1NonResourcePolicyRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NonResourcePolicyRule build() {
    V1NonResourcePolicyRule buildable = new V1NonResourcePolicyRule();
    buildable.setNonResourceURLs(fluent.getNonResourceURLs());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  
}