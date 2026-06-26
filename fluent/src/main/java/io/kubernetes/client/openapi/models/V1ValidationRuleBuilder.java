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
public class V1ValidationRuleBuilder extends V1ValidationRuleFluent<V1ValidationRuleBuilder> implements VisitableBuilder<V1ValidationRule,V1ValidationRuleBuilder>{

  V1ValidationRuleFluent<?> fluent;

  public V1ValidationRuleBuilder() {
    this(new V1ValidationRule());
  }
  
  public V1ValidationRuleBuilder(V1ValidationRuleFluent<?> fluent) {
    this(fluent, new V1ValidationRule());
  }
  
  public V1ValidationRuleBuilder(V1ValidationRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ValidationRuleBuilder(V1ValidationRuleFluent<?> fluent,V1ValidationRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ValidationRule build() {
    V1ValidationRule buildable = new V1ValidationRule();
    buildable.setFieldPath(fluent.getFieldPath());
    buildable.setMessage(fluent.getMessage());
    buildable.setMessageExpression(fluent.getMessageExpression());
    buildable.setOptionalOldSelf(fluent.getOptionalOldSelf());
    buildable.setReason(fluent.getReason());
    buildable.setRule(fluent.getRule());
    return buildable;
  }
  
}