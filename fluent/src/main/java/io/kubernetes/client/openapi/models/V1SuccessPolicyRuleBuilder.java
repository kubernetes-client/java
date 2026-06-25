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
public class V1SuccessPolicyRuleBuilder extends V1SuccessPolicyRuleFluent<V1SuccessPolicyRuleBuilder> implements VisitableBuilder<V1SuccessPolicyRule,V1SuccessPolicyRuleBuilder>{

  V1SuccessPolicyRuleFluent<?> fluent;

  public V1SuccessPolicyRuleBuilder() {
    this(new V1SuccessPolicyRule());
  }
  
  public V1SuccessPolicyRuleBuilder(V1SuccessPolicyRuleFluent<?> fluent) {
    this(fluent, new V1SuccessPolicyRule());
  }
  
  public V1SuccessPolicyRuleBuilder(V1SuccessPolicyRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1SuccessPolicyRuleBuilder(V1SuccessPolicyRuleFluent<?> fluent,V1SuccessPolicyRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1SuccessPolicyRule build() {
    V1SuccessPolicyRule buildable = new V1SuccessPolicyRule();
    buildable.setSucceededCount(fluent.getSucceededCount());
    buildable.setSucceededIndexes(fluent.getSucceededIndexes());
    return buildable;
  }
  
}