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
public class V1ContainerRestartRuleOnExitCodesBuilder extends V1ContainerRestartRuleOnExitCodesFluent<V1ContainerRestartRuleOnExitCodesBuilder> implements VisitableBuilder<V1ContainerRestartRuleOnExitCodes,V1ContainerRestartRuleOnExitCodesBuilder>{

  V1ContainerRestartRuleOnExitCodesFluent<?> fluent;

  public V1ContainerRestartRuleOnExitCodesBuilder() {
    this(new V1ContainerRestartRuleOnExitCodes());
  }
  
  public V1ContainerRestartRuleOnExitCodesBuilder(V1ContainerRestartRuleOnExitCodesFluent<?> fluent) {
    this(fluent, new V1ContainerRestartRuleOnExitCodes());
  }
  
  public V1ContainerRestartRuleOnExitCodesBuilder(V1ContainerRestartRuleOnExitCodes instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ContainerRestartRuleOnExitCodesBuilder(V1ContainerRestartRuleOnExitCodesFluent<?> fluent,V1ContainerRestartRuleOnExitCodes instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ContainerRestartRuleOnExitCodes build() {
    V1ContainerRestartRuleOnExitCodes buildable = new V1ContainerRestartRuleOnExitCodes();
    buildable.setOperator(fluent.getOperator());
    buildable.setValues(fluent.getValues());
    return buildable;
  }
  
}