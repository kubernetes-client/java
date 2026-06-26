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
public class V1ContainerRestartRuleBuilder extends V1ContainerRestartRuleFluent<V1ContainerRestartRuleBuilder> implements VisitableBuilder<V1ContainerRestartRule,V1ContainerRestartRuleBuilder>{

  V1ContainerRestartRuleFluent<?> fluent;

  public V1ContainerRestartRuleBuilder() {
    this(new V1ContainerRestartRule());
  }
  
  public V1ContainerRestartRuleBuilder(V1ContainerRestartRuleFluent<?> fluent) {
    this(fluent, new V1ContainerRestartRule());
  }
  
  public V1ContainerRestartRuleBuilder(V1ContainerRestartRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ContainerRestartRuleBuilder(V1ContainerRestartRuleFluent<?> fluent,V1ContainerRestartRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ContainerRestartRule build() {
    V1ContainerRestartRule buildable = new V1ContainerRestartRule();
    buildable.setAction(fluent.getAction());
    buildable.setExitCodes(fluent.buildExitCodes());
    return buildable;
  }
  
}