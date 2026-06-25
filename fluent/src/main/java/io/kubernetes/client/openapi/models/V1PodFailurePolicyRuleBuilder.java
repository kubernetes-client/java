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
public class V1PodFailurePolicyRuleBuilder extends V1PodFailurePolicyRuleFluent<V1PodFailurePolicyRuleBuilder> implements VisitableBuilder<V1PodFailurePolicyRule,V1PodFailurePolicyRuleBuilder>{

  V1PodFailurePolicyRuleFluent<?> fluent;

  public V1PodFailurePolicyRuleBuilder() {
    this(new V1PodFailurePolicyRule());
  }
  
  public V1PodFailurePolicyRuleBuilder(V1PodFailurePolicyRuleFluent<?> fluent) {
    this(fluent, new V1PodFailurePolicyRule());
  }
  
  public V1PodFailurePolicyRuleBuilder(V1PodFailurePolicyRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PodFailurePolicyRuleBuilder(V1PodFailurePolicyRuleFluent<?> fluent,V1PodFailurePolicyRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PodFailurePolicyRule build() {
    V1PodFailurePolicyRule buildable = new V1PodFailurePolicyRule();
    buildable.setAction(fluent.getAction());
    buildable.setOnExitCodes(fluent.buildOnExitCodes());
    buildable.setOnPodConditions(fluent.buildOnPodConditions());
    return buildable;
  }
  
}